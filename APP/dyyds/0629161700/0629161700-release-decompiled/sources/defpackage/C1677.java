package defpackage;

/* JADX INFO: renamed from: ᲀᛵᛷᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C1677 extends defpackage.AbstractC0758 {
    public C1677() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo561(defpackage.C0353 r2, java.lang.Object r3) {
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

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.Object mo562(defpackage.C1103 r2) {
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
}
