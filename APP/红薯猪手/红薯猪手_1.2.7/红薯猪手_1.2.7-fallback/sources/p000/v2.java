package p000;

/* JADX INFO: loaded from: classes.dex */
public class v2 extends java.io.IOException {
    public v2(java.io.File r3, java.io.File r4, java.lang.String r5) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            if (r4 == 0) goto L1f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = " -> "
            r3.append(r1)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
        L1f:
            if (r5 == 0) goto L35
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = ": "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
        L35:
            java.lang.String r3 = r0.toString()
            java.lang.String r4 = "toString(...)"
            p000.h4.m188(r4, r3)
            r2.<init>(r3)
            return
    }
}
