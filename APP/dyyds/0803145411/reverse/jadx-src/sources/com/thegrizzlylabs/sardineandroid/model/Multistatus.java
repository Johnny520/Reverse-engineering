package com.thegrizzlylabs.sardineandroid.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
@Namespace(prefix = "D", reference = "DAV:")
@Root
public class Multistatus {

    @ElementList(inline = true)
    protected List<Response> response;

    @Element(required = false)
    protected String responsedescription;
    protected String syncToken;

    public List<Response> getResponse() {
        List<Response> list = this.response;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        this.response = arrayList;
        return arrayList;
    }

    public String getResponsedescription() {
        return this.responsedescription;
    }

    public String getSyncToken() {
        return this.syncToken;
    }

    public void setResponsedescription(String str) {
        this.responsedescription = str;
    }

    public void setSyncToken(String str) {
        this.syncToken = str;
    }
}
