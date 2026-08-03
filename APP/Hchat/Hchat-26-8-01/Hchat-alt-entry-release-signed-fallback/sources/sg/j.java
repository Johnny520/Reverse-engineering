package sg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sg.i f12477a = null;

    static {
            sg.i r0 = new sg.i
            r0.<init>()
            sg.j.f12477a = r0
            return
    }

    public static sg.c a(int r3, int r4, sg.a r5) {
            r0 = r4 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r3 = r1
        L6:
            r4 = r4 & 2
            sg.a r0 = sg.a.f12436g
            if (r4 == 0) goto Ld
            r5 = r0
        Ld:
            r4 = -2
            r2 = 1
            if (r3 == r4) goto L4e
            r4 = -1
            if (r3 == r4) goto L3d
            if (r3 == 0) goto L2f
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r4) goto L29
            if (r5 != r0) goto L23
            sg.c r4 = new sg.c
            r4.<init>(r3)
            return r4
        L23:
            sg.n r4 = new sg.n
            r4.<init>(r3, r5)
            return r4
        L29:
            sg.c r3 = new sg.c
            r3.<init>(r4)
            return r3
        L2f:
            if (r5 != r0) goto L37
            sg.c r3 = new sg.c
            r3.<init>(r1)
            return r3
        L37:
            sg.n r3 = new sg.n
            r3.<init>(r2, r5)
            return r3
        L3d:
            if (r5 != r0) goto L47
            sg.n r3 = new sg.n
            sg.a r4 = sg.a.f12437h
            r3.<init>(r2, r4)
            return r3
        L47:
            java.lang.String r3 = "CONFLATED capacity cannot be used with non-default onBufferOverflow"
            j8.o.t(r3)
            r3 = 0
            return r3
        L4e:
            if (r5 != r0) goto L5d
            sg.c r3 = new sg.c
            sg.f r4 = sg.g.f12475e
            r4.getClass()
            int r4 = sg.f.f12474b
            r3.<init>(r4)
            return r3
        L5d:
            sg.n r3 = new sg.n
            r3.<init>(r2, r5)
            return r3
    }
}
