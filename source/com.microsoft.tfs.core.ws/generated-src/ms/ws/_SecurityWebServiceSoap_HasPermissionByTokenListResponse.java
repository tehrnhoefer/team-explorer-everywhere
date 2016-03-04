// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.ws;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.ws._SecurityWebServiceSoap_HasPermissionByTokenListResponse;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _SecurityWebServiceSoap_HasPermissionByTokenListResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected boolean[] hasPermissionByTokenListResult;

    public _SecurityWebServiceSoap_HasPermissionByTokenListResponse()
    {
        super();
    }

    public _SecurityWebServiceSoap_HasPermissionByTokenListResponse(final boolean[] hasPermissionByTokenListResult)
    {
        // TODO : Call super() instead of setting all fields directly?
        setHasPermissionByTokenListResult(hasPermissionByTokenListResult);
    }

    public boolean[] getHasPermissionByTokenListResult()
    {
        return this.hasPermissionByTokenListResult;
    }

    public void setHasPermissionByTokenListResult(boolean[] value)
    {
        this.hasPermissionByTokenListResult = value;
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

                if (localName.equalsIgnoreCase("HasPermissionByTokenListResult"))
                {
                    /*
                     * The element type is an array.
                     */
                    int event0;
                    final List list0 = new ArrayList();

                    do
                    {
                        event0 = reader.nextTag();

                        if (event0 == XMLStreamConstants.START_ELEMENT)
                        {
                            list0.add(new Boolean(XMLConvert.toBoolean(reader.getElementText())));
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.hasPermissionByTokenListResult = (boolean[]) PrimitiveArrayHelpers.toArray(
                            list0,
                            Boolean.TYPE);
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