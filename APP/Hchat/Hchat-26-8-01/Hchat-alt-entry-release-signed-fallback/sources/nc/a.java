package nc;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends oc.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final nc.a f9340i = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f9341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f9342h;

    static {
            nc.a r0 = new nc.a
            r1 = 1
            r2 = 0
            r0.<init>(r1, r2)
            nc.a.f9340i = r0
            return
    }

    public a(int r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            r0.f9341g = r1
            r0.f9342h = r2
            return
    }

    @Override // oc.b
    public final oc.a a() {
            r1 = this;
            oc.c r0 = oc.c.f9760f
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L20
        L3:
            if (r3 == 0) goto L22
            java.lang.Class<nc.a> r0 = nc.a.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Le
            goto L22
        Le:
            nc.a r3 = (nc.a) r3
            int r0 = r2.f9341g
            int r1 = r3.f9341g
            if (r0 != r1) goto L22
            java.lang.Object r0 = r2.f9342h
            java.lang.Object r3 = r3.f9342h
            boolean r3 = java.util.Objects.equals(r0, r3)
            if (r3 == 0) goto L22
        L20:
            r3 = 1
            return r3
        L22:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r2 = this;
            java.lang.Object r0 = r2.f9342h
            int r1 = r2.f9341g
            java.lang.Integer r1 = t3.c.a(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            int r0 = java.util.Objects.hash(r0)
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            int r0 = r5.f9341g
            int r1 = t3.c.b(r0)
            if (r1 == 0) goto L7b
            r2 = 9
            java.lang.Object r3 = r5.f9342h
            if (r1 == r2) goto L6e
            r2 = 16
            if (r1 == r2) goto L61
            switch(r0) {
                case 1: goto L4a;
                case 2: goto L47;
                case 3: goto L44;
                case 4: goto L41;
                case 5: goto L3e;
                case 6: goto L3b;
                case 7: goto L38;
                case 8: goto L35;
                case 9: goto L32;
                case 10: goto L2f;
                case 11: goto L2c;
                case 12: goto L29;
                case 13: goto L26;
                case 14: goto L23;
                case 15: goto L20;
                case 16: goto L1d;
                case 17: goto L1a;
                case 18: goto L17;
                default: goto L15;
            }
        L15:
            r0 = 0
            throw r0
        L17:
            java.lang.String r0 = "ENCODED_ANNOTATION"
            goto L4c
        L1a:
            java.lang.String r0 = "ENCODED_ARRAY"
            goto L4c
        L1d:
            java.lang.String r0 = "ENCODED_METHOD_HANDLE"
            goto L4c
        L20:
            java.lang.String r0 = "ENCODED_METHOD_TYPE"
            goto L4c
        L23:
            java.lang.String r0 = "ENCODED_METHOD"
            goto L4c
        L26:
            java.lang.String r0 = "ENCODED_FIELD"
            goto L4c
        L29:
            java.lang.String r0 = "ENCODED_ENUM"
            goto L4c
        L2c:
            java.lang.String r0 = "ENCODED_TYPE"
            goto L4c
        L2f:
            java.lang.String r0 = "ENCODED_STRING"
            goto L4c
        L32:
            java.lang.String r0 = "ENCODED_DOUBLE"
            goto L4c
        L35:
            java.lang.String r0 = "ENCODED_FLOAT"
            goto L4c
        L38:
            java.lang.String r0 = "ENCODED_LONG"
            goto L4c
        L3b:
            java.lang.String r0 = "ENCODED_INT"
            goto L4c
        L3e:
            java.lang.String r0 = "ENCODED_CHAR"
            goto L4c
        L41:
            java.lang.String r0 = "ENCODED_SHORT"
            goto L4c
        L44:
            java.lang.String r0 = "ENCODED_BYTE"
            goto L4c
        L47:
            java.lang.String r0 = "ENCODED_BOOLEAN"
            goto L4c
        L4a:
            java.lang.String r0 = "ENCODED_NULL"
        L4c:
            r1 = 8
            java.lang.String r0 = r0.substring(r1)
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r2 = ": "
            java.lang.String r3 = "}"
            java.lang.String r4 = "{"
            java.lang.String r0 = bc.e.k(r4, r0, r2, r1, r3)
            return r0
        L61:
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "["
            java.lang.String r2 = "]"
            java.lang.String r0 = eh.a.n(r1, r0, r2)
            return r0
        L6e:
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "{STRING: \""
            java.lang.String r2 = "\"}"
            java.lang.String r0 = eh.a.n(r1, r0, r2)
            return r0
        L7b:
            java.lang.String r0 = "null"
            return r0
    }
}
