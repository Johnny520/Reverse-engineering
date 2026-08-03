package i2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i2.g f6321a = null;

    static {
            i2.g r0 = new i2.g
            java.lang.String r1 = ""
            r0.<init>(r1)
            i2.h.f6321a = r0
            return
    }

    public static final java.util.List a(i2.g r9, int r10, int r11, g0.o r12) {
            if (r10 != r11) goto L3
            goto L7
        L3:
            java.util.List r0 = r9.f6313g
            if (r0 != 0) goto L9
        L7:
            r9 = 0
            return r9
        L9:
            r1 = 0
            if (r10 != 0) goto L42
            java.lang.String r9 = r9.f6314h
            int r9 = r9.length()
            if (r11 < r9) goto L42
            if (r12 != 0) goto L17
            return r0
        L17:
            java.util.ArrayList r9 = new java.util.ArrayList
            int r10 = r0.size()
            r9.<init>(r10)
            int r10 = r0.size()
        L24:
            if (r1 >= r10) goto L41
            java.lang.Object r11 = r0.get(r1)
            r2 = r11
            i2.e r2 = (i2.e) r2
            java.lang.Object r2 = r2.f6288a
            java.lang.Object r2 = r12.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L3e
            r9.add(r11)
        L3e:
            int r1 = r1 + 1
            goto L24
        L41:
            return r9
        L42:
            java.util.ArrayList r9 = new java.util.ArrayList
            int r2 = r0.size()
            r9.<init>(r2)
            int r2 = r0.size()
            r3 = r1
        L50:
            if (r3 >= r2) goto L98
            java.lang.Object r4 = r0.get(r3)
            i2.e r4 = (i2.e) r4
            r5 = 1
            if (r12 == 0) goto L68
            java.lang.Object r6 = r4.f6288a
            java.lang.Object r6 = r12.invoke(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            goto L69
        L68:
            r6 = r5
        L69:
            if (r6 == 0) goto L76
            int r6 = r4.f6289b
            int r7 = r4.f6290c
            boolean r6 = b(r10, r11, r6, r7)
            if (r6 == 0) goto L76
            goto L77
        L76:
            r5 = r1
        L77:
            if (r5 == 0) goto L95
            java.lang.String r5 = r4.f6291d
            java.lang.Object r6 = r4.f6288a
            i2.b r6 = (i2.b) r6
            int r7 = r4.f6289b
            int r7 = r9.e0.r(r7, r10, r11)
            int r7 = r7 - r10
            int r4 = r4.f6290c
            int r4 = r9.e0.r(r4, r10, r11)
            int r4 = r4 - r10
            i2.e r8 = new i2.e
            r8.<init>(r5, r7, r4, r6)
            r9.add(r8)
        L95:
            int r3 = r3 + 1
            goto L50
        L98:
            return r9
    }

    public static final boolean b(int r4, int r5, int r6, int r7) {
            r0 = 0
            r1 = 1
            if (r4 != r5) goto L6
            r2 = r1
            goto L7
        L6:
            r2 = r0
        L7:
            if (r6 != r7) goto Lb
            r3 = r1
            goto Lc
        Lb:
            r3 = r0
        Lc:
            r2 = r2 | r3
            if (r4 != r6) goto L11
            r3 = r1
            goto L12
        L11:
            r3 = r0
        L12:
            r2 = r2 & r3
            if (r4 >= r7) goto L17
            r4 = r1
            goto L18
        L17:
            r4 = r0
        L18:
            if (r6 >= r5) goto L1b
            r0 = r1
        L1b:
            r4 = r4 & r0
            r4 = r4 | r2
            return r4
    }
}
