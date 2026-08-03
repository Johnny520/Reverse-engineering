package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class ReturnControl implements bsh.ParserConstants {
    public int kind;
    public java.lang.String label;
    public bsh.Node returnPoint;
    public java.lang.Object value;

    public ReturnControl(int r2, java.lang.Object r3, bsh.Node r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.label = r0
            bsh.Primitive r0 = bsh.Primitive.TRUE
            r1.kind = r2
            r1.value = r3
            r1.returnPoint = r4
            return
    }

    public ReturnControl(int r2, java.lang.String r3, bsh.Node r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.label = r0
            bsh.Primitive r0 = bsh.Primitive.VOID
            r1.value = r0
            r1.kind = r2
            r1.label = r3
            r1.returnPoint = r4
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ReturnControl: "
            r0.<init>(r1)
            int r1 = r3.kind
            r2 = 13
            if (r1 != r2) goto L10
            java.lang.String r1 = "BREAK "
            goto L2e
        L10:
            r2 = 47
            if (r1 != r2) goto L17
            java.lang.String r1 = "RETURN "
            goto L2e
        L17:
            r2 = 20
            if (r1 != r2) goto L1e
            java.lang.String r1 = "CONTINUE "
            goto L2e
        L1e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "DUNNO?? "
            r1.<init>(r2)
            int r2 = r3.kind
            r1.append(r2)
            java.lang.String r1 = r1.toString()
        L2e:
            r0.append(r1)
            java.lang.String r1 = r3.label
            r0.append(r1)
            java.lang.String r1 = ": from: "
            r0.append(r1)
            bsh.Node r1 = r3.returnPoint
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
