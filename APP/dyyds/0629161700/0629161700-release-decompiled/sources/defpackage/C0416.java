package defpackage;

/* JADX INFO: renamed from: ᛳᛲᛲᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0416 implements org.simpleframework.xml.convert.Converter {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.Class f2093;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final org.simpleframework.xml.core.Persister f2094;

    public C0416(org.simpleframework.xml.core.Persister r1, java.lang.Class r2) {
            r0 = this;
            r0.<init>()
            r0.f2094 = r1
            r0.f2093 = r2
            return
    }

    @Override // org.simpleframework.xml.convert.Converter
    public final java.lang.Object read(org.simpleframework.xml.stream.InputNode r11) {
            r10 = this;
            java.util.HashMap r0 = r10.m1171()
            java.lang.Class r1 = r10.f2093
            java.lang.Object r2 = r1.newInstance()
            com.thegrizzlylabs.sardineandroid.model.EntityWithAnyElement r2 = (com.thegrizzlylabs.sardineandroid.model.EntityWithAnyElement) r2
            java.util.List r3 = r2.getAny()
        L10:
            org.simpleframework.xml.stream.InputNode r4 = r11.getNext()
            if (r4 == 0) goto L8e
            java.lang.String r5 = r4.getName()
            boolean r5 = r0.containsKey(r5)
            if (r5 == 0) goto L6f
            java.lang.String r5 = r4.getName()
            java.lang.Object r5 = r0.get(r5)
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            java.lang.String r6 = r5.getName()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r8 = 0
            r9 = 1
            java.lang.String r8 = r6.substring(r8, r9)
            java.lang.String r8 = r8.toUpperCase()
            r7.append(r8)
            java.lang.String r6 = r6.substring(r9)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "set"
            java.lang.String r6 = r7.concat(r6)
            java.lang.Class r7 = r5.getType()
            java.lang.Class[] r7 = new java.lang.Class[]{r7}
            java.lang.reflect.Method r6 = r1.getMethod(r6, r7)
            org.simpleframework.xml.core.Persister r7 = r10.f2094
            java.lang.Class r5 = r5.getType()
            java.lang.Object r4 = r7.read(r5, r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r6.invoke(r2, r4)
            goto L10
        L6f:
            java.lang.String r5 = r4.getPrefix()
            if (r5 == 0) goto L87
            java.lang.String r5 = r4.getPrefix()
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L87
            org.w3c.dom.Element r4 = defpackage.AbstractC0762.m1679(r4)
            r3.add(r4)
            goto L10
        L87:
            org.simpleframework.xml.stream.InputNode r5 = r4.getNext()
            if (r5 == 0) goto L10
            goto L87
        L8e:
            return r2
    }

    @Override // org.simpleframework.xml.convert.Converter
    public final void write(org.simpleframework.xml.stream.OutputNode r8, java.lang.Object r9) {
            r7 = this;
            com.thegrizzlylabs.sardineandroid.model.EntityWithAnyElement r9 = (com.thegrizzlylabs.sardineandroid.model.EntityWithAnyElement) r9
            java.util.List r0 = r9.getAny()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r0.next()
            org.w3c.dom.Element r1 = (org.w3c.dom.Element) r1
            java.lang.String r2 = r1.getNodeName()
            org.simpleframework.xml.stream.OutputNode r2 = r8.getChild(r2)
            org.simpleframework.xml.stream.NamespaceMap r3 = r2.getNamespaces()
            java.lang.String r4 = r1.getNamespaceURI()
            java.lang.String r5 = r1.getPrefix()
            r3.setReference(r4, r5)
            java.lang.String r1 = r1.getTextContent()
            r2.setValue(r1)
            r2.commit()
            goto La
        L38:
            java.util.HashMap r0 = r7.m1171()
            java.util.Set r1 = r0.keySet()
            java.util.Iterator r1 = r1.iterator()
        L44:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La4
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r0.get(r2)
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 0
            r6 = 1
            java.lang.String r5 = r3.substring(r5, r6)
            java.lang.String r5 = r5.toUpperCase()
            r4.append(r5)
            java.lang.String r3 = r3.substring(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "get"
            java.lang.String r3 = r4.concat(r3)
            java.lang.Class r4 = r7.f2093
            r5 = 0
            java.lang.reflect.Method r3 = r4.getMethod(r3, r5)
            java.lang.Object r3 = r3.invoke(r9, r5)
            if (r3 != 0) goto L8b
            goto L44
        L8b:
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L9e
            org.simpleframework.xml.stream.OutputNode r2 = r8.getChild(r2)
            java.lang.String r4 = "DAV:"
            r2.setReference(r4)
            java.lang.String r3 = (java.lang.String) r3
            r2.setValue(r3)
            goto L44
        L9e:
            org.simpleframework.xml.core.Persister r2 = r7.f2094
            r2.write(r3, r8)
            goto L44
        La4:
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.util.HashMap m1171() {
            r7 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Class r7 = r7.f2093
            java.lang.reflect.Field[] r7 = r7.getDeclaredFields()
            int r1 = r7.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L36
            r3 = r7[r2]
            java.lang.Class<org.simpleframework.xml.Element> r4 = org.simpleframework.xml.Element.class
            java.lang.annotation.Annotation r4 = r3.getAnnotation(r4)
            org.simpleframework.xml.Element r4 = (org.simpleframework.xml.Element) r4
            if (r4 == 0) goto L33
            java.lang.String r5 = r4.name()
            java.lang.String r6 = ""
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L2c
            java.lang.String r4 = r3.getName()
            goto L30
        L2c:
            java.lang.String r4 = r4.name()
        L30:
            r0.put(r4, r3)
        L33:
            int r2 = r2 + 1
            goto Ld
        L36:
            return r0
    }
}
