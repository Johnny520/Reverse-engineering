package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class ak extends java.io.IOException {
    public ak(java.io.File r3, java.io.File r4, java.lang.String r5) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            if (r4 == 0) goto L1c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = " -> "
            r3.<init>(r1)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
        L1c:
            java.lang.String r3 = ": "
            java.lang.String r3 = r3.concat(r5)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r4 = "toString(...)"
            defpackage.ip.n(r4, r3)
            r2.<init>(r3)
            return
    }
}
