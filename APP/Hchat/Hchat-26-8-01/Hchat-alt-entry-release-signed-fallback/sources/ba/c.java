package ba;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements java.util.function.IntUnaryOperator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f555a;

    public /* synthetic */ c(int r1) {
            r0 = this;
            r0.f555a = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int r3) {
            r2 = this;
            int r0 = r2.f555a
            switch(r0) {
                case 0: goto L35;
                case 1: goto L2b;
                case 2: goto L21;
                case 3: goto L18;
                case 4: goto Le;
                default: goto L5;
            }
        L5:
            r0 = 999999(0xf423f, float:1.401297E-39)
            r1 = 1
            if (r3 < r0) goto Lc
            goto Ld
        Lc:
            int r1 = r1 + r3
        Ld:
            return r1
        Le:
            r0 = 29951(0x74ff, float:4.197E-41)
            if (r3 < r0) goto L15
            r3 = 29712(0x7410, float:4.1635E-41)
            goto L17
        L15:
            int r3 = r3 + 1
        L17:
            return r3
        L18:
            r0 = 999999(0xf423f, float:1.401297E-39)
            r1 = 1
            if (r3 < r0) goto L1f
            goto L20
        L1f:
            int r1 = r1 + r3
        L20:
            return r1
        L21:
            r0 = 27391(0x6aff, float:3.8383E-41)
            if (r3 < r0) goto L28
            r3 = 27152(0x6a10, float:3.8048E-41)
            goto L2a
        L28:
            int r3 = r3 + 1
        L2a:
            return r3
        L2b:
            r0 = 30207(0x75ff, float:4.2329E-41)
            if (r3 < r0) goto L32
            r3 = 29968(0x7510, float:4.1994E-41)
            goto L34
        L32:
            int r3 = r3 + 1
        L34:
            return r3
        L35:
            r0 = 27647(0x6bff, float:3.8742E-41)
            if (r3 < r0) goto L3c
            r3 = 27408(0x6b10, float:3.8407E-41)
            goto L3e
        L3c:
            int r3 = r3 + 1
        L3e:
            return r3
    }
}
