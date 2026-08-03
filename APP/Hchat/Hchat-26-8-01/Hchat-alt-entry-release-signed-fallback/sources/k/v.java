package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k.y0 f7083g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f7084h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f2.i f7085i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fg.a f7086j;

    public v(k.y0 r1, boolean r2, f2.i r3, fg.a r4) {
            r0 = this;
            r0.<init>()
            r0.f7083g = r1
            r0.f7084h = r2
            r0.f7085i = r3
            r0.f7086j = r4
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
            r8 = this;
            y0.o r9 = (y0.o) r9
            i0.h0 r10 = (i0.h0) r10
            java.lang.Number r11 = (java.lang.Number) r11
            r11.intValue()
            r9 = -1525724089(0xffffffffa50f4c47, float:-1.2429117E-16)
            r10.a0(r9)
            java.lang.Object r9 = r10.P()
            i0.e r11 = i0.l.f5952a
            if (r9 != r11) goto L1f
            n.k r9 = new n.k
            r9.<init>()
            r10.k0(r9)
        L1f:
            r1 = r9
            n.k r1 = (n.k) r1
            y0.l r9 = y0.l.f21818a
            k.y0 r11 = r8.f7083g
            y0.o r9 = k.v0.a(r9, r1, r11)
            k.u r0 = new k.u
            f2.i r6 = r8.f7085i
            fg.a r7 = r8.f7086j
            r2 = 0
            r3 = 0
            boolean r4 = r8.f7084h
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            y0.o r9 = r9.d(r0)
            r11 = 0
            r10.p(r11)
            return r9
    }
}
