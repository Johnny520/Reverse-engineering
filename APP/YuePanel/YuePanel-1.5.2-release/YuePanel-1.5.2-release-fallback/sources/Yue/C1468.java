package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1468 {

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.util.HashSet f4601 = null;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static java.lang.String f4602 = "RI_EVENT_FILTER";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static java.lang.String f4603 = "RI_STREAM_FILTER";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static java.lang.String f4604 = "javax.xml.stream.notations";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static java.lang.String f4605 = "javax.xml.stream.entities";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final java.lang.String f4606 = "http://java.sun.com/xml/stream/properties/report-cdata-event";

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.util.Hashtable f4607;

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            Yue.C1468.f4601 = r0
            java.lang.String r1 = "javax.xml.stream.isValidating"
            r0.add(r1)
            java.util.HashSet r0 = Yue.C1468.f4601
            java.lang.String r1 = "javax.xml.stream.isCoalescing"
            r0.add(r1)
            java.util.HashSet r0 = Yue.C1468.f4601
            java.lang.String r1 = "javax.xml.stream.isReplacingEntityReferences"
            r0.add(r1)
            java.util.HashSet r0 = Yue.C1468.f4601
            java.lang.String r1 = "javax.xml.stream.isSupportingExternalEntities"
            r0.add(r1)
            java.util.HashSet r0 = Yue.C1468.f4601
            java.lang.String r1 = "javax.xml.stream.isRepairingNamespaces"
            r0.add(r1)
            java.util.HashSet r0 = Yue.C1468.f4601
            java.lang.String r1 = "javax.xml.stream.isNamespaceAware"
            r0.add(r1)
            java.util.HashSet r0 = Yue.C1468.f4601
            java.lang.String r1 = "javax.xml.stream.supportDTD"
            r0.add(r1)
            java.util.HashSet r0 = Yue.C1468.f4601
            java.lang.String r1 = "javax.xml.stream.reporter"
            r0.add(r1)
            java.util.HashSet r0 = Yue.C1468.f4601
            java.lang.String r1 = "javax.xml.stream.resolver"
            r0.add(r1)
            java.util.HashSet r0 = Yue.C1468.f4601
            java.lang.String r1 = "javax.xml.stream.allocator"
            r0.add(r1)
            java.util.HashSet r0 = Yue.C1468.f4601
            java.lang.String r1 = Yue.C1468.f4604
            r0.add(r1)
            java.util.HashSet r0 = Yue.C1468.f4601
            java.lang.String r1 = Yue.C1468.f4605
            r0.add(r1)
            java.util.HashSet r0 = Yue.C1468.f4601
            java.lang.String r1 = "http://java.sun.com/xml/stream/properties/report-cdata-event"
            r0.add(r1)
            return
    }

    public C1468() {
            r4 = this;
            r4.<init>()
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            r4.f4607 = r0
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.String r2 = "javax.xml.stream.isValidating"
            r0.put(r2, r1)
            java.util.Hashtable r0 = r4.f4607
            java.lang.String r2 = "javax.xml.stream.isCoalescing"
            r0.put(r2, r1)
            java.util.Hashtable r0 = r4.f4607
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.String r3 = "javax.xml.stream.isReplacingEntityReferences"
            r0.put(r3, r2)
            java.util.Hashtable r0 = r4.f4607
            java.lang.String r3 = "javax.xml.stream.isSupportingExternalEntities"
            r0.put(r3, r1)
            java.util.Hashtable r0 = r4.f4607
            java.lang.String r3 = "javax.xml.stream.isNamespaceAware"
            r0.put(r3, r2)
            java.util.Hashtable r0 = r4.f4607
            java.lang.String r2 = "javax.xml.stream.supportDTD"
            r0.put(r2, r1)
            java.util.Hashtable r0 = r4.f4607
            java.lang.String r2 = "javax.xml.stream.isRepairingNamespaces"
            r0.put(r2, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m7176(java.lang.String r4) {
            r3 = this;
            java.util.HashSet r0 = Yue.C1468.f4601
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L9
            return
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "Unable to access unsupported property "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public boolean m7177(java.lang.String r2) {
            r1 = this;
            r1.m7176(r2)
            java.util.Hashtable r0 = r1.f4607
            java.lang.Object r2 = r0.get(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Yue.InterfaceC7143 m7178() {
            r2 = this;
            java.util.Hashtable r0 = r2.f4607
            java.lang.String r1 = "javax.xml.stream.allocator"
            java.lang.Object r0 = r0.get(r1)
            Yue.ۥۢۦۡ r0 = (Yue.InterfaceC7143) r0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.util.Enumeration m7179() {
            r1 = this;
            java.util.Hashtable r0 = r1.f4607
            java.util.Enumeration r0 = r0.keys()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public java.lang.Object m7180(java.lang.String r2) {
            r1 = this;
            r1.m7176(r2)
            java.util.Hashtable r0 = r1.f4607
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public java.lang.String m7181() {
            r1 = this;
            java.lang.String r0 = "1.0"
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public Yue.InterfaceC7155 m7182() {
            r2 = this;
            java.util.Hashtable r0 = r2.f4607
            java.lang.String r1 = "javax.xml.stream.reporter"
            java.lang.Object r0 = r0.get(r1)
            Yue.ۥۢۦۢ۟ r0 = (Yue.InterfaceC7155) r0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public Yue.InterfaceC7156 m7183() {
            r2 = this;
            java.util.Hashtable r0 = r2.f4607
            java.lang.String r1 = "javax.xml.stream.resolver"
            java.lang.Object r0 = r0.get(r1)
            Yue.ۥۢۦۢ۠ r0 = (Yue.InterfaceC7156) r0
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean m7184() {
            r1 = this;
            java.lang.String r0 = "javax.xml.stream.isCoalescing"
            boolean r0 = r1.m7177(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public boolean m7185() {
            r1 = this;
            java.lang.String r0 = "javax.xml.stream.isNamespaceAware"
            boolean r0 = r1.m7177(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public boolean m7186() {
            r1 = this;
            java.lang.String r0 = "javax.xml.stream.isRepairingNamespaces"
            boolean r0 = r1.m7177(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean m7187(java.lang.String r2) {
            r1 = this;
            java.util.HashSet r0 = Yue.C1468.f4601
            boolean r2 = r0.contains(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public boolean m7188() {
            r1 = this;
            java.lang.String r0 = "javax.xml.stream.isReplacingEntityReferences"
            boolean r0 = r1.m7177(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean m7189() {
            r1 = this;
            java.lang.String r0 = "javax.xml.stream.isSupportingExternalEntities"
            boolean r0 = r1.m7177(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public boolean m7190() {
            r1 = this;
            java.lang.String r0 = "javax.xml.stream.isValidating"
            boolean r0 = r1.m7177(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m7191(java.lang.String r2, boolean r3) {
            r1 = this;
            r1.m7176(r2)
            java.util.Hashtable r0 = r1.f4607
            if (r3 == 0) goto La
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            goto Lc
        La:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
        Lc:
            r0.put(r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m7192(boolean r2) {
            r1 = this;
            java.lang.String r0 = "javax.xml.stream.isCoalescing"
            r1.m7191(r0, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m7193(Yue.InterfaceC7143 r3) {
            r2 = this;
            java.util.Hashtable r0 = r2.f4607
            java.lang.String r1 = "javax.xml.stream.allocator"
            r0.put(r1, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m7194(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "This implementation does not allow disabling namespace processing"
            r2.<init>(r0)
            throw r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m7195(boolean r2) {
            r1 = this;
            java.lang.String r0 = "javax.xml.stream.isRepairingNamespaces"
            r1.m7191(r0, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m7196(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            java.lang.String r0 = "javax.xml.stream.isValidating"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L12
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r1.m7199(r2)
            goto L3e
        L12:
            java.lang.String r0 = "javax.xml.stream.isSupportingExternalEntities"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L24
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r1.m7198(r2)
            goto L3e
        L24:
            java.lang.String r0 = "javax.xml.stream.isNamespaceAware"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L36
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r1.m7194(r2)
            goto L3e
        L36:
            r1.m7176(r2)
            java.util.Hashtable r0 = r1.f4607
            r0.put(r2, r3)
        L3e:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public void m7197(boolean r2) {
            r1 = this;
            java.lang.String r0 = "javax.xml.stream.isReplacingEntityReferences"
            r1.m7191(r0, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public void m7198(boolean r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "This implementation does not resolve external entities "
            r2.<init>(r0)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public void m7199(boolean r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "This implementation does not support validation"
            r2.<init>(r0)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public void m7200(Yue.InterfaceC7155 r3) {
            r2 = this;
            java.util.Hashtable r0 = r2.f4607
            java.lang.String r1 = "javax.xml.stream.reporter"
            r0.put(r1, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public void m7201(Yue.InterfaceC7156 r3) {
            r2 = this;
            java.util.Hashtable r0 = r2.f4607
            java.lang.String r1 = "javax.xml.stream.resolver"
            r0.put(r1, r3)
            return
    }
}
