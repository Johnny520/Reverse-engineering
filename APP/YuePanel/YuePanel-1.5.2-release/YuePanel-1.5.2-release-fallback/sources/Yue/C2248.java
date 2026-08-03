package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C2248 implements Yue.InterfaceC7148 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public Yue.InterfaceC7148 f6931;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public Yue.InterfaceC2223 f6932;

    public C2248(Yue.InterfaceC7148 r1) throws Yue.C7158 {
            r0 = this;
            r0.<init>()
            r0.f6931 = r1
            return
    }

    public C2248(Yue.InterfaceC7148 r1, Yue.InterfaceC2223 r2) throws Yue.C7158 {
            r0 = this;
            r0.<init>()
            r0.f6931 = r1
            r0.f6932 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static void m10310(java.lang.String[] r4) throws java.lang.Exception {
            java.lang.String r0 = "javax.xml.stream.XMLInputFactory"
            java.lang.String r1 = "com.bea.xml.stream.MXParserFactory"
            java.lang.System.setProperty(r0, r1)
            java.lang.String r0 = "javax.xml.stream.XMLEventFactory"
            java.lang.String r1 = "com.bea.xml.stream.EventFactory"
            java.lang.System.setProperty(r0, r1)
            Yue.ۥۢۦۡۧ r0 = Yue.AbstractC7152.m27518()
            Yue.ۥۢۢۢۨ r1 = new Yue.ۥۢۢۢۨ
            r1.<init>()
            r2 = 1
            r1.m23813(r2)
            r2 = 2
            r1.m23813(r2)
            java.io.FileReader r2 = new java.io.FileReader
            r3 = 0
            r4 = r4[r3]
            r2.<init>(r4)
            Yue.ۥۢۦۣۡ r4 = r0.mo15560(r2)
            Yue.ۥۢۦۣۡ r4 = r0.mo15555(r4, r1)
        L2f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3f
            java.io.PrintStream r0 = java.lang.System.out
            Yue.ۥۢۦ۠ۨ r1 = r4.mo10309()
            r0.println(r1)
            goto L2f
        L3f:
            return
    }

    @Override // Yue.InterfaceC7148
    public void close() throws Yue.C7158 {
            r1 = this;
            Yue.ۥۢۦۣۡ r0 = r1.f6931
            r0.close()
            return
    }

    @Override // Yue.InterfaceC7148
    public java.lang.Object getProperty(java.lang.String r2) {
            r1 = this;
            Yue.ۥۢۦۣۡ r0 = r1.f6931
            java.lang.Object r2 = r0.getProperty(r2)
            return r2
    }

    @Override // Yue.InterfaceC7148, java.util.Iterator
    public boolean hasNext() {
            r3 = this;
        L0:
            r0 = 0
            Yue.ۥۢۦۣۡ r1 = r3.f6931     // Catch: Yue.C7158 -> L1f
            boolean r1 = r1.hasNext()     // Catch: Yue.C7158 -> L1f
            if (r1 == 0) goto L1f
            Yue.ۥ۠ۡ۠ۧ r1 = r3.f6932     // Catch: Yue.C7158 -> L1f
            Yue.ۥۢۦۣۡ r2 = r3.f6931     // Catch: Yue.C7158 -> L1f
            Yue.ۥۢۦ۠ۨ r2 = r2.peek()     // Catch: Yue.C7158 -> L1f
            boolean r1 = r1.mo10200(r2)     // Catch: Yue.C7158 -> L1f
            if (r1 == 0) goto L19
            r0 = 1
            return r0
        L19:
            Yue.ۥۢۦۣۡ r1 = r3.f6931     // Catch: Yue.C7158 -> L1f
            r1.mo10309()     // Catch: Yue.C7158 -> L1f
            goto L0
        L1f:
            return r0
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
            r1 = this;
            Yue.ۥۢۦ۠ۨ r0 = r1.mo10309()     // Catch: Yue.C7158 -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    @Override // Yue.InterfaceC7148
    public Yue.InterfaceC7142 peek() throws Yue.C7158 {
            r1 = this;
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Ld
            Yue.ۥۢۦۣۡ r0 = r1.f6931
            Yue.ۥۢۦ۠ۨ r0 = r0.peek()
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m10311(Yue.InterfaceC2223 r1) {
            r0 = this;
            r0.f6932 = r1
            return
    }

    @Override // Yue.InterfaceC7148
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public Yue.InterfaceC7142 mo10307() throws Yue.C7158 {
            r2 = this;
        L0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2f
            Yue.ۥۢۦ۠ۨ r0 = r2.mo10309()
            boolean r1 = r0.mo4232()
            if (r1 == 0) goto L22
            r1 = r0
            Yue.ۥۣ۟ۤۥ r1 = (Yue.InterfaceC1093) r1
            boolean r1 = r1.mo5833()
            if (r1 == 0) goto L1a
            goto L22
        L1a:
            Yue.ۥۢۦۢۢ r0 = new Yue.ۥۢۦۢۢ
            java.lang.String r1 = "Unexpected text"
            r0.<init>(r1)
            throw r0
        L22:
            boolean r1 = r0.mo4235()
            if (r1 != 0) goto L2e
            boolean r1 = r0.mo4234()
            if (r1 == 0) goto L0
        L2e:
            return r0
        L2f:
            Yue.ۥۢۦۢۢ r0 = new Yue.ۥۢۦۢۢ
            java.lang.String r1 = "Unexpected end of Document"
            r0.<init>(r1)
            throw r0
    }

    @Override // Yue.InterfaceC7148
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public java.lang.String mo10308() throws Yue.C7158 {
            r3 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            Yue.ۥۢۦ۠ۨ r1 = r3.mo10309()
            boolean r1 = r1.mo4235()
            if (r1 == 0) goto L4e
        Lf:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L46
            Yue.ۥۢۦ۠ۨ r1 = r3.peek()
            boolean r2 = r1.mo4235()
            if (r2 != 0) goto L3e
            boolean r2 = r1.mo4232()
            if (r2 == 0) goto L2f
            r2 = r1
            Yue.ۥۣ۟ۤۥ r2 = (Yue.InterfaceC1093) r2
            java.lang.String r2 = r2.getData()
            r0.append(r2)
        L2f:
            boolean r1 = r1.mo4234()
            if (r1 == 0) goto L3a
            java.lang.String r0 = r0.toString()
            return r0
        L3a:
            r3.mo10309()
            goto Lf
        L3e:
            Yue.ۥۢۦۢۢ r0 = new Yue.ۥۢۦۢۢ
            java.lang.String r1 = "Unexpected Element start"
            r0.<init>(r1)
            throw r0
        L46:
            Yue.ۥۢۦۢۢ r0 = new Yue.ۥۢۦۢۢ
            java.lang.String r1 = "Unexpected end of Document"
            r0.<init>(r1)
            throw r0
        L4e:
            Yue.ۥۢۦۢۢ r0 = new Yue.ۥۢۦۢۢ
            java.lang.String r1 = "Precondition for readText is nextEvent().getTypeEventType() == START_ELEMENT"
            r0.<init>(r1)
            throw r0
    }

    @Override // Yue.InterfaceC7148
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public Yue.InterfaceC7142 mo10309() throws Yue.C7158 {
            r1 = this;
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Ld
            Yue.ۥۢۦۣۡ r0 = r1.f6931
            Yue.ۥۢۦ۠ۨ r0 = r0.mo10309()
            return r0
        Ld:
            r0 = 0
            return r0
    }
}
