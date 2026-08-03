package s7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements z7.t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s7.b f12368g;

    public /* synthetic */ a(s7.b r1) {
            r0 = this;
            r0.f12368g = r1
            r0.<init>()
            return
    }

    @Override // z7.t
    public void a(int r7, int r8) {
            r6 = this;
            if (r7 != r8) goto L3
            goto L33
        L3:
            s7.b r0 = r6.f12368g
            k7.a r7 = r0.Q(r7)
            k7.a r8 = r0.Q(r8)
            if (r7 == r8) goto L33
            if (r7 == 0) goto L33
            if (r8 != 0) goto L14
            goto L33
        L14:
            int r1 = r7.f7388g
            int r2 = r8.f7388g
            z7.c r0 = r0.f9563k
            if (r1 != r2) goto L20
            r0.getClass()
            goto L2d
        L20:
            java.lang.Object[] r3 = r0.f22584g
            r4 = r3[r1]
            r5 = r3[r2]
            r3[r1] = r5
            r3[r2] = r4
            r3 = 0
            r0.f22588k = r3
        L2d:
            r7.H(r2)
            r8.H(r1)
        L33:
            return
    }
}
