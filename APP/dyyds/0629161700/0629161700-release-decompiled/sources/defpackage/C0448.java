package defpackage;

/* JADX INFO: renamed from: ᛳᛴᛱᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0448 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.util.LinkedHashMap f2205;

    public C0448(int r4) {
            r3 = this;
            switch(r4) {
                case 1: goto L1d;
                case 2: goto L12;
                default: goto L3;
            }
        L3:
            r3.<init>()
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r0 = 1
            r1 = 0
            r2 = 1061158912(0x3f400000, float:0.75)
            r4.<init>(r1, r2, r0)
            r3.f2205 = r4
            return
        L12:
            r3.<init>()
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            r3.f2205 = r4
            return
        L1d:
            r3.<init>()
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            r3.f2205 = r4
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public void m1226(defpackage.C0589 r4) {
            r3 = this;
            int r0 = r4.f2957
            int r1 = r4.f2958
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.LinkedHashMap r3 = r3.f2205
            java.lang.Object r2 = r3.get(r0)
            if (r2 != 0) goto L18
            java.util.TreeMap r2 = new java.util.TreeMap
            r2.<init>()
            r3.put(r0, r2)
        L18:
            java.util.TreeMap r2 = (java.util.TreeMap) r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            boolean r3 = r2.containsKey(r3)
            if (r3 == 0) goto L47
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Overriding migration "
            r3.<init>(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r2.get(r0)
            r3.append(r0)
            java.lang.String r0 = " with "
            r3.append(r0)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "ROOM"
            android.util.Log.w(r0, r3)
        L47:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r2.put(r3, r4)
            return
    }
}
