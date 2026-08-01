package xhss;

/* JADX INFO: renamed from: xhss.ᛸᛵᛵᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class C0764 extends xhss.AbstractC0121 {
    public C0764() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final java.lang.Object mo119(xhss.C0385 r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "java-lang-class-unsupported"
            java.lang.String r0 = "https://github.com/google/gson/blob/main/Troubleshooting.md#"
            java.lang.String r2 = r0.concat(r2)
            java.lang.String r0 = "Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee "
            java.lang.String r2 = r0.concat(r2)
            r1.<init>(r2)
            throw r1
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final void mo120(xhss.C0827 r2, java.lang.Object r3) {
            r1 = this;
            java.lang.Class r3 = (java.lang.Class) r3
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "Attempted to serialize java.lang.Class: "
            r2.<init>(r0)
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r3 = ". Forgot to register a type adapter?\nSee "
            r2.append(r3)
            java.lang.String r3 = "java-lang-class-unsupported"
            java.lang.String r0 = "https://github.com/google/gson/blob/main/Troubleshooting.md#"
            java.lang.String r3 = r0.concat(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }
}
