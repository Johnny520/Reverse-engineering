package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۦۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7149 implements Yue.InterfaceC7148, Yue.InterfaceC7145 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public Yue.C1141 f24691;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean f24692;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public Yue.InterfaceC7160 f24693;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public Yue.InterfaceC7143 f24694;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean f24695;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public Yue.C1468 f24696;

    public C7149(Yue.InterfaceC7160 r2) throws Yue.C7158 {
            r1 = this;
            Yue.ۥۢۦۡ۟ r0 = new Yue.ۥۢۦۡ۟
            r0.<init>()
            r1.<init>(r2, r0)
            return
    }

    public C7149(Yue.InterfaceC7160 r3, Yue.InterfaceC7143 r4) throws Yue.C7158 {
            r2 = this;
            r2.<init>()
            Yue.ۥ۟ۤۦۨ r0 = new Yue.ۥ۟ۤۦۨ
            r0.<init>()
            r2.f24691 = r0
            r0 = 1
            r2.f24692 = r0
            r1 = 0
            r2.f24695 = r1
            if (r3 == 0) goto L36
            if (r4 == 0) goto L2e
            r2.f24693 = r3
            r2.f24692 = r0
            r2.f24694 = r4
            int r4 = r3.mo15450()
            r0 = 7
            if (r4 != r0) goto L2d
            Yue.ۥۢۦۡ r4 = r2.f24694
            Yue.ۥۢۦ۠ۨ r4 = r4.mo22065(r3)
            r3.next()
            r2.mo27488(r4)
        L2d:
            return
        L2e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "XMLEventAllocator may not be null"
            r3.<init>(r4)
            throw r3
        L36:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "XMLStreamReader may not be null"
            r3.<init>(r4)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static void m27492(java.lang.String[] r4) throws java.lang.Exception {
            java.lang.String r0 = "javax.xml.stream.XMLInputFactory"
            java.lang.String r1 = "com.bea.xml.stream.MXParserFactory"
            java.lang.System.setProperty(r0, r1)
            java.lang.String r0 = "javax.xml.stream.XMLEventFactory"
            java.lang.String r1 = "com.bea.xml.stream.EventFactory"
            java.lang.System.setProperty(r0, r1)
            Yue.ۥۢۦۡۧ r0 = Yue.AbstractC7152.m27518()
            java.io.FileReader r1 = new java.io.FileReader
            r2 = 0
            r4 = r4[r2]
            r1.<init>(r4)
            Yue.ۥۢۦۣۡ r4 = r0.mo15560(r1)
        L1e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L54
            Yue.ۥۢۦ۠ۨ r0 = r4.mo10309()
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            java.lang.String r3 = "["
            r2.append(r3)
            int r3 = r0.mo4236()
            java.lang.String r3 = Yue.C2107.m9935(r3)
            r2.append(r3)
            java.lang.String r3 = "]["
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = "]"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.println(r0)
            goto L1e
        L54:
            return
    }

    @Override // Yue.InterfaceC7148
    public void close() throws Yue.C7158 {
            r0 = this;
            r0.m27494()
            return
    }

    @Override // Yue.InterfaceC7148
    public java.lang.Object getProperty(java.lang.String r2) {
            r1 = this;
            Yue.ۥ۟ۦۧ۟ r0 = r1.f24696
            java.lang.Object r2 = r0.m7180(r2)
            return r2
    }

    @Override // Yue.InterfaceC7148, java.util.Iterator
    public boolean hasNext() {
            r3 = this;
            boolean r0 = r3.f24692
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            Yue.ۥ۟ۤۦۨ r0 = r3.f24691
            boolean r0 = r0.isEmpty()
            r2 = 1
            if (r0 != 0) goto L10
            return r2
        L10:
            Yue.ۥۢۦۢۤ r0 = r3.f24693     // Catch: Yue.C7158 -> L1b
            boolean r0 = r0.hasNext()     // Catch: Yue.C7158 -> L1b
            if (r0 == 0) goto L19
            return r2
        L19:
            r3.f24692 = r1
        L1b:
            return r1
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
            Yue.ۥ۟ۤۦۨ r0 = r1.f24691
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L11
            Yue.ۥ۟ۤۦۨ r0 = r1.f24691
            java.lang.Object r0 = r0.peek()
            Yue.ۥۢۦ۠ۨ r0 = (Yue.InterfaceC7142) r0
            return r0
        L11:
            boolean r0 = r1.mo27491()
            if (r0 == 0) goto L20
            Yue.ۥ۟ۤۦۨ r0 = r1.f24691
            java.lang.Object r0 = r0.peek()
            Yue.ۥۢۦ۠ۨ r0 = (Yue.InterfaceC7142) r0
            return r0
        L20:
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

    @Override // Yue.InterfaceC7145
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo27488(Yue.InterfaceC7142 r2) throws Yue.C7158 {
            r1 = this;
            Yue.ۥ۟ۤۦۨ r0 = r1.f24691
            r0.add(r2)
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
            r4 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            Yue.ۥۢۦ۠ۨ r1 = r4.mo10309()
            boolean r2 = r1.mo4235()
            if (r2 == 0) goto L4e
        Lf:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L46
            Yue.ۥۢۦ۠ۨ r1 = r4.peek()
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
            r4.mo10309()
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
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            java.lang.String r3 = "Precondition for readText is nextEvent().getTypeEventType() == START_ELEMENT (got "
            r2.append(r3)
            int r1 = r1.mo4236()
            r2.append(r1)
            java.lang.String r1 = ")"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public Yue.InterfaceC7142 m27493() throws Yue.C7158 {
            r1 = this;
            Yue.ۥ۟ۤۦۨ r0 = r1.f24691
            java.lang.Object r0 = r0.remove()
            Yue.ۥۢۦ۠ۨ r0 = (Yue.InterfaceC7142) r0
            return r0
    }

    @Override // Yue.InterfaceC7148
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public Yue.InterfaceC7142 mo10309() throws Yue.C7158 {
            r2 = this;
            boolean r0 = r2.m27496()
            if (r0 == 0) goto L15
            boolean r0 = r2.mo27491()
            if (r0 == 0) goto Ld
            goto L15
        Ld:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "Attempt to call nextEvent() on a stream with no more elements"
            r0.<init>(r1)
            throw r0
        L15:
            Yue.ۥۢۦ۠ۨ r0 = r2.m27493()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m27494() {
            r1 = this;
            r0 = 1
            r1.f24695 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean m27495() {
            r1 = this;
            boolean r0 = r1.f24695
            r0 = r0 ^ 1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean m27496() {
            r1 = this;
            Yue.ۥ۟ۤۦۨ r0 = r1.f24691
            boolean r0 = r0.isEmpty()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public boolean mo27491() throws Yue.C7158 {
            r3 = this;
            boolean r0 = r3.f24695
            if (r0 == 0) goto L6
            r0 = 0
            return r0
        L6:
            Yue.ۥۢۦۡ r0 = r3.f24694
            Yue.ۥۢۦۢۤ r1 = r3.f24693
            r0.mo22066(r1, r3)
            Yue.ۥۢۦۢۤ r0 = r3.f24693
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L1a
            Yue.ۥۢۦۢۤ r0 = r3.f24693
            r0.next()
        L1a:
            Yue.ۥۢۦۢۤ r0 = r3.f24693
            int r0 = r0.mo15450()
            r1 = 8
            r2 = 1
            if (r0 != r1) goto L2e
            Yue.ۥۢۦۡ r0 = r3.f24694
            Yue.ۥۢۦۢۤ r1 = r3.f24693
            r0.mo22066(r1, r3)
            r3.f24695 = r2
        L2e:
            boolean r0 = r3.m27496()
            r0 = r0 ^ r2
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m27497(Yue.InterfaceC7143 r2) {
            r1 = this;
            if (r2 == 0) goto L5
            r1.f24694 = r2
            return
        L5:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "XMLEvent Allocator may not be null"
            r2.<init>(r0)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m27498(Yue.C1468 r1) {
            r0 = this;
            r0.f24696 = r1
            return
    }
}
