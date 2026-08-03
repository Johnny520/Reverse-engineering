package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0.l f17812a;

    public n5(w0.l r1) {
            r0 = this;
            r0.<init>()
            r0.f17812a = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof wb.n5
            if (r1 != 0) goto L9
            goto L15
        L9:
            wb.n5 r3 = (wb.n5) r3
            w0.l r1 = r2.f17812a
            w0.l r3 = r3.f17812a
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L17
        L15:
            r3 = 0
            return r3
        L17:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            w0.l r0 = r2.f17812a
            int r0 = r0.hashCode()
            r1 = 70741189(0x4376cc5, float:2.1561491E-36)
            int r0 = r0 + r1
            int r0 = r0 * 31
            r1 = 0
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MessageBlockContactPickerRequest(title=选择适用聊天, existingValue=, onValue="
            r0.<init>(r1)
            w0.l r1 = r2.f17812a
            r0.append(r1)
            java.lang.String r1 = ", allowOfficialAccounts=false)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
