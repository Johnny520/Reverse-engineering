package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۠۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5959 extends Yue.C5206 {

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public Yue.InterfaceC5957 f21738;

    public C5959(Yue.InterfaceC7160 r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public C5959(Yue.InterfaceC7160 r1, Yue.InterfaceC5957 r2) {
            r0 = this;
            r0.<init>(r1)
            r0.m22099(r2)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static void m22098(java.lang.String[] r6) throws java.lang.Exception {
            java.lang.String r0 = "javax.xml.stream.XMLInputFactory"
            java.lang.String r1 = "com.bea.xml.stream.MXParserFactory"
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
            r4 = r6[r3]
            r2.<init>(r4)
            Yue.ۥۢۦۢۤ r2 = r0.mo15566(r2)
            Yue.ۥۢۦۢۤ r1 = r0.mo15556(r2, r1)
        L28:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3b
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.String r4 = r1.mo15469()
            r2.println(r4)
            r1.next()
            goto L28
        L3b:
            Yue.ۥۡۢ۠۟ r1 = new Yue.ۥۡۢ۠۟
            Yue.ۥۡۥۤۨ r2 = new Yue.ۥۡۥۤۨ
            java.lang.String r4 = "banana"
            java.lang.String r5 = "B"
            r2.<init>(r4, r5)
            r1.<init>(r2)
            java.io.FileReader r2 = new java.io.FileReader
            r6 = r6[r3]
            r2.<init>(r6)
            Yue.ۥۢۦۢۤ r6 = r0.mo15566(r2)
            Yue.ۥۢۦۢۤ r6 = r0.mo15556(r6, r1)
            Yue.ۥۢۦۢۥ r0 = new Yue.ۥۢۦۢۥ
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            java.lang.String r3 = "out.stream"
            r2.<init>(r3)
            r1.<init>(r2)
            r0.<init>(r1)
        L69:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L76
            r0.mo19667(r6)
            r6.next()
            goto L69
        L76:
            r0.flush()
            return
    }

    @Override // Yue.C5206, Yue.InterfaceC7160
    public boolean hasNext() throws Yue.C7158 {
            r2 = this;
        L0:
            boolean r0 = super.hasNext()
            if (r0 == 0) goto L18
            Yue.ۥۣۢ۠۠ r0 = r2.f21738
            Yue.ۥۢۦۢۤ r1 = r2.m19663()
            boolean r0 = r0.mo17187(r1)
            if (r0 == 0) goto L14
            r0 = 1
            return r0
        L14:
            super.next()
            goto L0
        L18:
            r0 = 0
            return r0
    }

    @Override // Yue.C5206, Yue.InterfaceC7160
    public int next() throws Yue.C7158 {
            r2 = this;
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lb
            int r0 = super.next()
            return r0
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "next() may not be called  when there are no more  items to return"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public void m22099(Yue.InterfaceC5957 r1) {
            r0 = this;
            r0.f21738 = r1
            return
    }
}
