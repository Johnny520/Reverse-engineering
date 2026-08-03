package eh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static boolean A(java.lang.reflect.Method r0, boolean r1, java.lang.String r2) {
            java.lang.Class r0 = r0.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            boolean r0 = og.t.d0(r0, r2, r1)
            return r0
    }

    public static /* synthetic */ java.lang.String B(int r0) {
            switch(r0) {
                case 1: goto L71;
                case 2: goto L6e;
                case 3: goto L6b;
                case 4: goto L68;
                case 5: goto L65;
                case 6: goto L62;
                case 7: goto L5f;
                case 8: goto L5c;
                case 9: goto L59;
                case 10: goto L56;
                case 11: goto L53;
                case 12: goto L50;
                case 13: goto L4d;
                case 14: goto L4a;
                case 15: goto L47;
                case 16: goto L44;
                case 17: goto L41;
                case 18: goto L3e;
                case 19: goto L3b;
                case 20: goto L38;
                case 21: goto L35;
                case 22: goto L32;
                case 23: goto L2f;
                case 24: goto L2c;
                case 25: goto L29;
                case 26: goto L26;
                case 27: goto L23;
                case 28: goto L20;
                case 29: goto L1d;
                case 30: goto L1a;
                case 31: goto L17;
                case 32: goto L14;
                case 33: goto L11;
                case 34: goto Le;
                case 35: goto Lb;
                case 36: goto L8;
                case 37: goto L5;
                default: goto L3;
            }
        L3:
            r0 = 0
            throw r0
        L5:
            java.lang.String r0 = "UnresolvedOdexInstruction"
            return r0
        L8:
            java.lang.String r0 = "SparseSwitchPayload"
            return r0
        Lb:
            java.lang.String r0 = "PackedSwitchPayload"
            return r0
        Le:
            java.lang.String r0 = "ArrayPayload"
            return r0
        L11:
            java.lang.String r0 = "Format51l"
            return r0
        L14:
            java.lang.String r0 = "Format4rcc"
            return r0
        L17:
            java.lang.String r0 = "Format45cc"
            return r0
        L1a:
            java.lang.String r0 = "Format3rms"
            return r0
        L1d:
            java.lang.String r0 = "Format3rmi"
            return r0
        L20:
            java.lang.String r0 = "Format3rc"
            return r0
        L23:
            java.lang.String r0 = "Format35ms"
            return r0
        L26:
            java.lang.String r0 = "Format35mi"
            return r0
        L29:
            java.lang.String r0 = "Format35c"
            return r0
        L2c:
            java.lang.String r0 = "Format32x"
            return r0
        L2f:
            java.lang.String r0 = "Format31t"
            return r0
        L32:
            java.lang.String r0 = "Format31i"
            return r0
        L35:
            java.lang.String r0 = "Format31c"
            return r0
        L38:
            java.lang.String r0 = "Format30t"
            return r0
        L3b:
            java.lang.String r0 = "Format23x"
            return r0
        L3e:
            java.lang.String r0 = "Format22x"
            return r0
        L41:
            java.lang.String r0 = "Format22t"
            return r0
        L44:
            java.lang.String r0 = "Format22s"
            return r0
        L47:
            java.lang.String r0 = "Format22cs"
            return r0
        L4a:
            java.lang.String r0 = "Format22c"
            return r0
        L4d:
            java.lang.String r0 = "Format22b"
            return r0
        L50:
            java.lang.String r0 = "Format21t"
            return r0
        L53:
            java.lang.String r0 = "Format21s"
            return r0
        L56:
            java.lang.String r0 = "Format21lh"
            return r0
        L59:
            java.lang.String r0 = "Format21ih"
            return r0
        L5c:
            java.lang.String r0 = "Format21c"
            return r0
        L5f:
            java.lang.String r0 = "Format20t"
            return r0
        L62:
            java.lang.String r0 = "Format20bc"
            return r0
        L65:
            java.lang.String r0 = "Format12x"
            return r0
        L68:
            java.lang.String r0 = "Format11x"
            return r0
        L6b:
            java.lang.String r0 = "Format11n"
            return r0
        L6e:
            java.lang.String r0 = "Format10x"
            return r0
        L71:
            java.lang.String r0 = "Format10t"
            return r0
    }

    public static java.lang.String a(java.lang.String r5, char r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r5.length()
            r2 = 0
        La:
            if (r2 >= r1) goto L25
            char r3 = r5.charAt(r2)
            boolean r4 = java.lang.Character.isUpperCase(r3)
            if (r4 == 0) goto L1f
            int r4 = r0.length()
            if (r4 == 0) goto L1f
            r0.append(r6)
        L1f:
            r0.append(r3)
            int r2 = r2 + 1
            goto La
        L25:
            java.lang.String r5 = r0.toString()
            return r5
    }

    public static java.lang.String b(java.lang.String r5) {
            int r0 = r5.length()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L53
            char r3 = r5.charAt(r2)
            boolean r4 = java.lang.Character.isLetter(r3)
            if (r4 == 0) goto L50
            boolean r0 = java.lang.Character.isUpperCase(r3)
            if (r0 == 0) goto L19
            goto L53
        L19:
            char r0 = java.lang.Character.toUpperCase(r3)
            r3 = 1
            if (r2 != 0) goto L34
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r5 = r5.substring(r3)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
        L34:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = r5.substring(r1, r2)
            r4.append(r1)
            r4.append(r0)
            int r2 = r2 + r3
            java.lang.String r5 = r5.substring(r2)
            r4.append(r5)
            java.lang.String r5 = r4.toString()
            return r5
        L50:
            int r2 = r2 + 1
            goto L6
        L53:
            return r5
    }

    public static /* synthetic */ int c(int r5) {
            r0 = 8
            r1 = -1
            r2 = 2
            r3 = 6
            r4 = 4
            switch(r5) {
                case 1: goto L12;
                case 2: goto L12;
                case 3: goto L12;
                case 4: goto L12;
                case 5: goto L12;
                case 6: goto L11;
                case 7: goto L11;
                case 8: goto L11;
                case 9: goto L11;
                case 10: goto L11;
                case 11: goto L11;
                case 12: goto L11;
                case 13: goto L11;
                case 14: goto L11;
                case 15: goto L11;
                case 16: goto L11;
                case 17: goto L11;
                case 18: goto L11;
                case 19: goto L11;
                case 20: goto L10;
                case 21: goto L10;
                case 22: goto L10;
                case 23: goto L10;
                case 24: goto L10;
                case 25: goto L10;
                case 26: goto L10;
                case 27: goto L10;
                case 28: goto L10;
                case 29: goto L10;
                case 30: goto L10;
                case 31: goto Lf;
                case 32: goto Lf;
                case 33: goto Lc;
                case 34: goto Lb;
                case 35: goto Lb;
                case 36: goto Lb;
                case 37: goto Lb;
                default: goto L9;
            }
        L9:
            r5 = 0
            throw r5
        Lb:
            return r1
        Lc:
            r5 = 10
            return r5
        Lf:
            return r0
        L10:
            return r3
        L11:
            return r4
        L12:
            return r2
    }

    public static int d(float r0, int r1, int r2) {
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 + r1
            int r0 = r0 * r2
            return r0
    }

    public static int e(int r0, int r1, int r2) {
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 + r1
            int r0 = r0 * r2
            return r0
    }

    public static int f(int r0, int r1, long r2) {
            int r2 = java.lang.Long.hashCode(r2)
            int r2 = r2 + r0
            int r2 = r2 * r1
            return r2
    }

    public static int g(int r0, int r1, java.lang.String r2) {
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            return r2
    }

    public static int h(int r0, int r1, boolean r2) {
            int r2 = java.lang.Boolean.hashCode(r2)
            int r2 = r2 + r0
            int r2 = r2 * r1
            return r2
    }

    public static java.lang.Class i(java.lang.Class r0) {
            gg.f r0 = gg.v.a(r0)
            java.lang.Class r0 = r0.f4555a
            r0.getClass()
            return r0
    }

    public static java.lang.ClassCastException j(java.lang.Object r0) {
            r0.getClass()
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            return r0
    }

    public static java.lang.String k(int r1, int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            r0.append(r1)
            r0.append(r4)
            r0.append(r2)
            r0.append(r5)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.String l(int r1, java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.String m(int r1, java.lang.String r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.String n(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.String o(java.lang.StringBuilder r0, float r1, char r2) {
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String p(java.lang.StringBuilder r0, long r1, java.lang.String r3) {
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String q(java.lang.StringBuilder r0, java.lang.String r1, char r2) {
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String r(java.lang.StringBuilder r0, java.lang.String r1, java.lang.String r2) {
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.StringBuilder s(int r1, int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            r0.append(r1)
            r0.append(r4)
            r0.append(r2)
            r0.append(r5)
            return r0
    }

    public static java.lang.StringBuilder t(int r1, java.lang.String r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r1)
            r0.append(r3)
            return r0
    }

    public static java.lang.StringBuilder u(int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r3)
            r0.append(r4)
            r0.append(r1)
            r0.append(r5)
            return r0
    }

    public static java.lang.StringBuilder v(java.lang.String r1, java.lang.String r2, java.lang.String r3, long r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            r0.append(r3)
            r0.append(r4)
            return r0
    }

    public static void w(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.Throwable r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            r0.append(r3)
            r0.append(r4)
            java.lang.String r1 = r0.toString()
            fb.v0.n(r1, r5)
            return
    }

    public static void x(java.lang.String r1, java.lang.String r2, java.lang.Throwable r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            fb.v0.n(r1, r3)
            return
    }

    public static boolean y(java.lang.String r1) {
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r1 = r0.isFile()
            return r1
    }

    public static boolean z(java.lang.String r0, java.lang.Object r1, boolean r2) {
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            boolean r0 = og.t.d0(r1, r0, r2)
            return r0
    }
}
