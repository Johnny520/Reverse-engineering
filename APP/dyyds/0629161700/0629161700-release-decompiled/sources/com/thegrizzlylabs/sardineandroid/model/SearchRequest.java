package com.thegrizzlylabs.sardineandroid.model;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
@org.simpleframework.xml.Namespace(prefix = "D", reference = "DAV:")
@org.simpleframework.xml.Root
public class SearchRequest {
    private java.lang.String language;
    private java.lang.String query;

    public SearchRequest() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "davbasic"
            r1.language = r0
            java.lang.String r0 = ""
            r1.query = r0
            return
    }

    public SearchRequest(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.language = r1
            r0.query = r2
            return
    }

    public final java.lang.String getLanguage() {
            r0 = this;
            java.lang.String r0 = r0.language
            return r0
    }

    public final java.lang.String getQuery() {
            r0 = this;
            java.lang.String r0 = r0.query
            return r0
    }

    public void setLanguage(java.lang.String r1) {
            r0 = this;
            r0.language = r1
            return
    }

    public void setQuery(java.lang.String r1) {
            r0 = this;
            r0.query = r1
            return
    }
}
