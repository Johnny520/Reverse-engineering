package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes2.dex */
class PrefixResolver extends java.util.LinkedHashMap<java.lang.String, java.lang.String> implements org.simpleframework.xml.stream.NamespaceMap {
    private final org.simpleframework.xml.stream.OutputNode source;

    public PrefixResolver(org.simpleframework.xml.stream.OutputNode r1) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            return
    }

    private java.lang.String resolvePrefix(java.lang.String r2) {
            r1 = this;
            org.simpleframework.xml.stream.OutputNode r0 = r1.source
            org.simpleframework.xml.stream.NamespaceMap r0 = r0.getNamespaces()
            if (r0 == 0) goto L13
            java.lang.String r2 = r0.getPrefix(r2)
            boolean r0 = r1.containsValue(r2)
            if (r0 != 0) goto L13
            return r2
        L13:
            r2 = 0
            return r2
    }

    private java.lang.String resolveReference(java.lang.String r2) {
            r1 = this;
            org.simpleframework.xml.stream.OutputNode r0 = r1.source
            org.simpleframework.xml.stream.NamespaceMap r0 = r0.getNamespaces()
            if (r0 == 0) goto Ld
            java.lang.String r2 = r0.getReference(r2)
            return r2
        Ld:
            r2 = 0
            return r2
    }

    @Override // org.simpleframework.xml.stream.NamespaceMap
    public java.lang.String getPrefix() {
            r1 = this;
            org.simpleframework.xml.stream.OutputNode r0 = r1.source
            java.lang.String r0 = r0.getPrefix()
            return r0
    }

    @Override // org.simpleframework.xml.stream.NamespaceMap
    public java.lang.String getPrefix(java.lang.String r2) {
            r1 = this;
            int r0 = r1.size()
            if (r0 <= 0) goto Lf
            java.lang.Object r0 = r1.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Lf
            return r0
        Lf:
            java.lang.String r2 = r1.resolvePrefix(r2)
            return r2
    }

    @Override // org.simpleframework.xml.stream.NamespaceMap
    public java.lang.String getReference(java.lang.String r4) {
            r3 = this;
            boolean r0 = r3.containsValue(r4)
            if (r0 == 0) goto L25
            java.util.Iterator r0 = r3.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r3.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto La
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto La
            return r1
        L25:
            java.lang.String r4 = r3.resolveReference(r4)
            return r4
    }

    @Override // org.simpleframework.xml.stream.NamespaceMap, java.lang.Iterable
    public java.util.Iterator<java.lang.String> iterator() {
            r1 = this;
            java.util.Set r0 = r1.keySet()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // org.simpleframework.xml.stream.NamespaceMap
    public java.lang.String setReference(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = ""
            java.lang.String r2 = r1.setReference(r2, r0)
            return r2
    }

    @Override // org.simpleframework.xml.stream.NamespaceMap
    public java.lang.String setReference(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = r1.resolvePrefix(r2)
            if (r0 == 0) goto L8
            r2 = 0
            return r2
        L8:
            java.lang.Object r2 = r1.put(r2, r3)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }
}
