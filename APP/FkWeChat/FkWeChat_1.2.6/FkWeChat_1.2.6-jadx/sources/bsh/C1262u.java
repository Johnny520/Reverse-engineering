package bsh;

/* JADX INFO: renamed from: bsh.u */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1262u extends AbstractC1195i4 implements InterfaceC1230o3 {

    /* JADX INFO: renamed from: y */
    public String f3823y;

    public C1262u(int i10) {
        super(i10);
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ String mo4038a() {
        return super.mo4038a();
    }

    @Override // bsh.AbstractC1195i4
    /* JADX INFO: renamed from: d */
    public /* bridge */ /* synthetic */ void add(InterfaceC1188h3 interfaceC1188h3) {
        super.add(interfaceC1188h3);
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: e */
    public /* bridge */ /* synthetic */ void mo4040e() {
        super.mo4040e();
    }

    @Override // bsh.AbstractC1195i4
    /* JADX INFO: renamed from: f */
    public /* bridge */ /* synthetic */ InterfaceC1188h3 next() {
        return super.next();
    }

    @Override // bsh.AbstractC1195i4
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ InterfaceC1188h3 previous() {
        return super.previous();
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    public /* bridge */ /* synthetic */ int getLineNumber() {
        return super.getLineNumber();
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    public /* bridge */ /* synthetic */ String getText() {
        return super.getText();
    }

    @Override // bsh.AbstractC1195i4
    /* JADX INFO: renamed from: h */
    public /* bridge */ /* synthetic */ void set(InterfaceC1188h3 interfaceC1188h3) {
        super.set(interfaceC1188h3);
    }

    @Override // bsh.AbstractC1195i4, java.util.ListIterator, java.util.Iterator
    public /* bridge */ /* synthetic */ boolean hasNext() {
        return super.hasNext();
    }

    @Override // bsh.AbstractC1195i4, java.util.ListIterator
    public /* bridge */ /* synthetic */ boolean hasPrevious() {
        return super.hasPrevious();
    }

    @Override // bsh.AbstractC1195i4
    /* JADX INFO: renamed from: i */
    public /* bridge */ /* synthetic */ String mo4044i(String str) {
        return super.mo4044i(str);
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: j */
    public /* bridge */ /* synthetic */ void mo4045j(InterfaceC1188h3 interfaceC1188h3, int i10) {
        super.mo4045j(interfaceC1188h3, i10);
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: m */
    public /* bridge */ /* synthetic */ void mo4046m(InterfaceC1188h3 interfaceC1188h3) {
        super.mo4046m(interfaceC1188h3);
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: n */
    public /* bridge */ /* synthetic */ void mo4047n(String str) {
        super.mo4047n(str);
    }

    @Override // bsh.AbstractC1195i4, java.util.ListIterator
    public /* bridge */ /* synthetic */ int nextIndex() {
        return super.nextIndex();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        if (r3.f3823y.equals(r0.f3542r) == false) goto L27;
     */
    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo4048p(bsh.C1174f1 r4, bsh.RunnableC1205k2 r5) throws bsh.C1163d2 {
        /*
            r3 = this;
            int r0 = r3.mo4050r()
            if (r0 <= 0) goto L77
            r0 = 0
            bsh.h3 r1 = r3.mo4051s(r0)
            boolean r1 = r1 instanceof bsh.C1232p
            if (r1 == 0) goto L1a
            bsh.h3 r1 = r3.mo4051s(r0)
            bsh.p r1 = (bsh.C1232p) r1
            java.lang.String r2 = r3.f3823y
            r1.f3733C = r2
            goto L3f
        L1a:
            bsh.h3 r1 = r3.mo4051s(r0)
            boolean r1 = r1 instanceof bsh.C1220n
            if (r1 == 0) goto L2d
            bsh.h3 r1 = r3.mo4051s(r0)
            bsh.n r1 = (bsh.C1220n) r1
            java.lang.String r2 = r3.f3823y
            r1.f3701A = r2
            goto L3f
        L2d:
            bsh.h3 r1 = r3.mo4051s(r0)
            boolean r1 = r1 instanceof bsh.C1245r0
            if (r1 == 0) goto L3f
            bsh.h3 r1 = r3.mo4051s(r0)
            bsh.r0 r1 = (bsh.C1245r0) r1
            java.lang.String r2 = r3.f3823y
            r1.f3794z = r2
        L3f:
            bsh.h3 r0 = r3.mo4051s(r0)
            java.lang.Object r5 = r0.mo4048p(r4, r5)
            boolean r0 = r5 instanceof bsh.C1171e4
            if (r0 == 0) goto L77
            r0 = r5
            bsh.e4 r0 = (bsh.C1171e4) r0
            int r1 = r0.f3541q
            r2 = 13
            if (r1 == r2) goto L6c
            r2 = 20
            if (r1 == r2) goto L59
            goto L76
        L59:
            java.lang.String r1 = r3.f3823y
            java.lang.String r0 = r0.f3542r
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L64
            goto L76
        L64:
            bsh.d2 r5 = new bsh.d2
            java.lang.String r0 = "Continue cannot be used outside of a loop"
            r5.<init>(r0, r3, r4)
            throw r5
        L6c:
            java.lang.String r4 = r3.f3823y
            java.lang.String r0 = r0.f3542r
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L77
        L76:
            return r5
        L77:
            bsh.Primitive r4 = bsh.Primitive.VOID
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.C1262u.mo4048p(bsh.f1, bsh.k2):java.lang.Object");
    }

    @Override // bsh.AbstractC1195i4, java.util.ListIterator
    public /* bridge */ /* synthetic */ int previousIndex() {
        return super.previousIndex();
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: q */
    public /* bridge */ /* synthetic */ InterfaceC1188h3[] mo4049q() {
        return super.mo4049q();
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: r */
    public /* bridge */ /* synthetic */ int mo4050r() {
        return super.mo4050r();
    }

    @Override // bsh.AbstractC1195i4, java.util.ListIterator, java.util.Iterator
    public /* bridge */ /* synthetic */ void remove() {
        super.remove();
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: s */
    public /* bridge */ /* synthetic */ InterfaceC1188h3 mo4051s(int i10) {
        return super.mo4051s(i10);
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: t */
    public /* bridge */ /* synthetic */ void mo4052t() {
        super.mo4052t();
    }

    @Override // bsh.AbstractC1195i4
    public String toString() {
        return super.toString() + ": " + this.f3823y + ":";
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: u */
    public /* bridge */ /* synthetic */ void mo4053u(String str) {
        super.mo4053u(str);
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: w */
    public /* bridge */ /* synthetic */ InterfaceC1188h3 mo4054w() {
        return super.mo4054w();
    }
}
