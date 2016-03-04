// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.build.buildinfo._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.build.buildinfo._03._BuildStoreWebServiceSoap_UpdateBuildNumberAndDropLocation;

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
public class _BuildStoreWebServiceSoap_UpdateBuildNumberAndDropLocation
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String buildUri;
    protected String buildNumber;
    protected String dropLocation;

    public _BuildStoreWebServiceSoap_UpdateBuildNumberAndDropLocation()
    {
        super();
    }

    public _BuildStoreWebServiceSoap_UpdateBuildNumberAndDropLocation(
        final String buildUri,
        final String buildNumber,
        final String dropLocation)
    {
        // TODO : Call super() instead of setting all fields directly?
        setBuildUri(buildUri);
        setBuildNumber(buildNumber);
        setDropLocation(dropLocation);
    }

    public String getBuildUri()
    {
        return this.buildUri;
    }

    public void setBuildUri(String value)
    {
        this.buildUri = value;
    }

    public String getBuildNumber()
    {
        return this.buildNumber;
    }

    public void setBuildNumber(String value)
    {
        this.buildNumber = value;
    }

    public String getDropLocation()
    {
        return this.dropLocation;
    }

    public void setDropLocation(String value)
    {
        this.dropLocation = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        XMLStreamWriterHelper.writeElement(
            writer,
            "buildUri",
            this.buildUri);
        XMLStreamWriterHelper.writeElement(
            writer,
            "buildNumber",
            this.buildNumber);
        XMLStreamWriterHelper.writeElement(
            writer,
            "dropLocation",
            this.dropLocation);

        writer.writeEndElement();
    }
}