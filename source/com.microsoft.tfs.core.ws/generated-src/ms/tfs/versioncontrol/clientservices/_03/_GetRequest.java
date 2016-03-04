// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.versioncontrol.clientservices._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.versioncontrol.clientservices._03._GetRequest;
import ms.tfs.versioncontrol.clientservices._03._ItemSpec;
import ms.tfs.versioncontrol.clientservices._03._RecursionType;
import ms.tfs.versioncontrol.clientservices._03._VersionSpec;

import java.lang.String;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _GetRequest
    implements ElementSerializable, ElementDeserializable
{
    // No attributes    

    // Elements
    protected _ItemSpec itemSpec;
    protected _VersionSpec versionSpec;

    public _GetRequest()
    {
        super();
    }

    public _GetRequest(
        final _ItemSpec itemSpec,
        final _VersionSpec versionSpec)
    {
        // TODO : Call super() instead of setting all fields directly?
        setItemSpec(itemSpec);
        setVersionSpec(versionSpec);
    }

    public _ItemSpec getItemSpec()
    {
        return this.itemSpec;
    }

    public void setItemSpec(_ItemSpec value)
    {
        this.itemSpec = value;
    }

    public _VersionSpec getVersionSpec()
    {
        return this.versionSpec;
    }

    public void setVersionSpec(_VersionSpec value)
    {
        this.versionSpec = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        if (this.itemSpec != null)
        {
            this.itemSpec.writeAsElement(
                writer,
                "ItemSpec");
        }

        if (this.versionSpec != null)
        {
            this.versionSpec.writeAsElement(
                writer,
                "VersionSpec");
        }

        writer.writeEndElement();
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // This object uses no attributes

        // Elements
        int event;

        do
        {
            event = reader.next();

            if (event == XMLStreamConstants.START_ELEMENT)
            {
                localName = reader.getLocalName();

                if (localName.equalsIgnoreCase("ItemSpec"))
                {
                    this.itemSpec = new _ItemSpec();
                    this.itemSpec.readFromElement(reader);
                }
                else if (localName.equalsIgnoreCase("VersionSpec"))
                {
                    /*
                     * The element is an abstract type, so prepare to deserialize all the
                     * known derived types.
                     */
                    final String typeAttribute = reader.getAttributeValue(
                            Schemas.XSI,
                            "type");

                    if (typeAttribute == null)
                    {
                        throw new XMLStreamException(
                                "Element " + reader.getLocalName()
                                + " is for a derived type but did not include a type attribute");
                    }

                    if (typeAttribute.equals("ChangesetVersionSpec"))
                    {
                        this.versionSpec = new _ChangesetVersionSpec();
                    }
                    else if (typeAttribute.equals("DateVersionSpec"))
                    {
                        this.versionSpec = new _DateVersionSpec();
                    }
                    else if (typeAttribute.equals("LabelVersionSpec"))
                    {
                        this.versionSpec = new _LabelVersionSpec();
                    }
                    else if (typeAttribute.equals("LatestVersionSpec"))
                    {
                        this.versionSpec = new _LatestVersionSpec();
                    }
                    else if (typeAttribute.equals("WorkspaceVersionSpec"))
                    {
                        this.versionSpec = new _WorkspaceVersionSpec();
                    }

                    this.versionSpec.readFromElement(reader);
                }
                else
                {
                    // Read the unknown child element until its end
                    XMLStreamReaderHelper.readUntilElementEnd(reader);
                }
            }
        }
        while (event != XMLStreamConstants.END_ELEMENT);
    }
}