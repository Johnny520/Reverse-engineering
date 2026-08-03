package fd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mh.b f3921a = null;

    static {
            java.lang.Class<fd.j> r0 = fd.j.class
            mh.b r0 = mh.d.b(r0)
            fd.j.f3921a = r0
            return
    }

    public static java.lang.String a(long r3, qd.j r5, xe.q r6, boolean r7, boolean r8) {
            if (r5 == 0) goto La5
            boolean r0 = r5.w()
            if (r0 != 0) goto La
            goto La5
        La:
            qd.q r7 = r5.o()
            int r7 = r7.ordinal()
            r0 = 1
            r1 = 0
            switch(r7) {
                case 0: goto L9b;
                case 1: goto L91;
                case 2: goto L8c;
                case 3: goto L71;
                case 4: goto L56;
                case 5: goto L4c;
                case 6: goto L47;
                case 7: goto L3e;
                case 8: goto L27;
                case 9: goto L27;
                default: goto L18;
            }
        L18:
            java.lang.String r3 = java.lang.String.valueOf(r5)
            java.lang.String r4 = "Unknown type in literalToString: "
            java.lang.String r3 = r4.concat(r3)
            ah.a.k(r3)
            r3 = 0
            return r3
        L27:
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 == 0) goto L3b
            java.lang.String r6 = "Wrong object literal: {} for type: {}"
            java.lang.Long r7 = java.lang.Long.valueOf(r3)
            mh.b r8 = fd.j.f3921a
            r8.s(r7, r6, r5)
            java.lang.String r3 = java.lang.Long.toString(r3)
            return r3
        L3b:
            java.lang.String r3 = "null"
            return r3
        L3e:
            double r3 = java.lang.Double.longBitsToDouble(r3)
            java.lang.String r3 = xe.q.b(r3)
            return r3
        L47:
            java.lang.String r3 = r6.d(r3, r8)
            return r3
        L4c:
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            java.lang.String r3 = xe.q.c(r3)
            return r3
        L56:
            int r5 = r6.f21575a
            if (r5 != r0) goto L6b
            int r5 = (int) r3
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r7) goto L68
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r7) goto L65
            goto L6b
        L65:
            java.lang.String r3 = "Integer.MAX_VALUE"
            return r3
        L68:
            java.lang.String r3 = "Integer.MIN_VALUE"
            return r3
        L6b:
            r5 = 4
            java.lang.String r3 = r6.e(r5, r3, r8)
            return r3
        L71:
            int r5 = r6.f21575a
            if (r5 != r0) goto L86
            int r5 = (int) r3
            short r5 = (short) r5
            r7 = -32768(0xffffffffffff8000, float:NaN)
            if (r5 == r7) goto L83
            r7 = 32767(0x7fff, float:4.5916E-41)
            if (r5 == r7) goto L80
            goto L86
        L80:
            java.lang.String r3 = "Short.MAX_VALUE"
            return r3
        L83:
            java.lang.String r3 = "Short.MIN_VALUE"
            return r3
        L86:
            r5 = 2
            java.lang.String r3 = r6.e(r5, r3, r8)
            return r3
        L8c:
            java.lang.String r3 = r6.e(r0, r3, r8)
            return r3
        L91:
            int r3 = (int) r3
            char r3 = (char) r3
            r6.getClass()
            java.lang.String r3 = xe.q.h(r3, r8)
            return r3
        L9b:
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 != 0) goto La2
            java.lang.String r3 = "false"
            return r3
        La2:
            java.lang.String r3 = "true"
            return r3
        La5:
            java.lang.String r6 = java.lang.Long.toString(r3)
            if (r7 == 0) goto Lf9
            long r7 = java.lang.Math.abs(r3)
            r0 = 100
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 <= 0) goto Lf9
            java.lang.String r7 = "(0x"
            java.lang.StringBuilder r6 = bc.e.n(r6, r7)
            java.lang.String r7 = java.lang.Long.toHexString(r3)
            r6.append(r7)
            if (r5 == 0) goto Lcc
            qd.q r7 = qd.q.f10912o
            boolean r7 = r5.a(r7)
            if (r7 == 0) goto Ld9
        Lcc:
            java.lang.String r7 = ", float:"
            r6.append(r7)
            int r7 = (int) r3
            float r7 = java.lang.Float.intBitsToFloat(r7)
            r6.append(r7)
        Ld9:
            if (r5 == 0) goto Le3
            qd.q r7 = qd.q.f10914q
            boolean r5 = r5.a(r7)
            if (r5 == 0) goto Lef
        Le3:
            java.lang.String r5 = ", double:"
            r6.append(r5)
            double r3 = java.lang.Double.longBitsToDouble(r3)
            r6.append(r3)
        Lef:
            r3 = 41
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            return r3
        Lf9:
            return r6
    }

    public static java.lang.String b(qd.j r2) {
            qd.q r0 = r2.o()
            qd.q r1 = qd.q.f10915r
            if (r0 != r1) goto L1d
            java.lang.String r2 = r2.l()
            r0 = 46
            r1 = 47
            java.lang.String r2 = r2.replace(r0, r1)
            java.lang.String r0 = "L"
            java.lang.String r1 = ";"
            java.lang.String r2 = eh.a.n(r0, r2, r1)
            return r2
        L1d:
            qd.q r1 = qd.q.f10916s
            if (r0 != r1) goto L30
            qd.j r2 = r2.g()
            java.lang.String r2 = b(r2)
            java.lang.String r0 = "["
            java.lang.String r2 = wb.en.g(r0, r2)
            return r2
        L30:
            java.lang.String r2 = r0.f10919g
            return r2
    }
}
