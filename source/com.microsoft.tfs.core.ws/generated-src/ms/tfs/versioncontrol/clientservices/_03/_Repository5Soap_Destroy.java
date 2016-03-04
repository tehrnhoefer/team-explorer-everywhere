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

import ms.tfs.versioncontrol.clientservices._03._ItemSpec;
import ms.tfs.versioncontrol.clientservices._03._RecursionType;
import ms.tfs.versioncontrol.clientservices._03._Repository5Soap_Destroy;
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
public class _Repository5Soap_Destroy
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected _ItemSpec item;
    protected _VersionSpec versionSpec;
    protected _VersionSpec stopAtSpec;
    protected int flags;
    protected int maxClientPathLength;

    public _Repository5Soap_Destroy()
    {
        super();
    }

    public _Repository5Soap_Destroy(
        final _ItemSpec item,
        final _VersionSpec versionSpec,
        final _VersionSpec stopAtSpec,
        final int flags,
        final int maxClientPathLength)
    {
        // TODO : Call super() instead of setting all fields directly?
        setItem(item);
        setVersionSpec(versionSpec);
        setStopAtSpec(stopAtSpec);
        setFlags(flags);
        setMaxClientPathLength(maxClientPathLength);
    }

    public _ItemSpec getItem()
    {
        return this.item;
    }

    public void setItem(_ItemSpec value)
    {
        this.item = value;
    }

    public _VersionSpec getVersionSpec()
    {
        return this.versionSpec;
    }

    public void setVersionSpec(_VersionSpec value)
    {
        this.versionSpec = value;
    }

    public _VersionSpec getStopAtSpec()
    {
        return this.stopAtSpec;
    }

    public void setStopAtSpec(_VersionSpec value)
    {
        this.stopAtSpec = value;
    }

    public int getFlags()
    {
        return this.flags;
    }

    public void setFlags(int value)
    {
        this.flags = value;
    }

    public int getMaxClientPathLength()
    {
        return this.maxClientPathLength;
    }

    public void setMaxClientPathLength(int value)
    {
        this.maxClientPathLength = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        if (this.item != null)
        {
            this.item.writeAsElement(
                writer,
                "item");
        }

        if (this.versionSpec != null)
        {
            this.versionSpec.writeAsElement(
                writer,
                "versionSpec");
        }

        if (this.stopAtSpec != null)
        {
            this.stopAtSpec.writeAsElement(
                writer,
                "stopAtSpec");
        }

        XMLStreamWriterHelper.writeElement(
            writer,
            "flags",
            this.flags);
        XMLStreamWriterHelper.writeElement(
            writer,
            "maxClientPathLength",
            this.maxClientPathLength);

        writer.writeEndElement();
    }
}