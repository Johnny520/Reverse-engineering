package xhss;

/* JADX INFO: renamed from: xhss.ᛴᲈᛱᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0425 {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.util.ArrayList f1504;

    public C0425(int r2) {
            r1 = this;
            switch(r2) {
                case 1: goto L18;
                default: goto L3;
            }
        L3:
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f1504 = r2
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            return
        L18:
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 20
            r2.<init>(r0)
            r1.f1504 = r2
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public void m812(java.lang.String r4) {
            r3 = this;
            r0 = 0
        L1:
            java.util.ArrayList r1 = r3.f1504
            int r2 = r1.size()
            if (r0 >= r2) goto L20
            java.lang.Object r2 = r1.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r4.equalsIgnoreCase(r2)
            if (r2 == 0) goto L1d
            r1.remove(r0)
            r1.remove(r0)
            int r0 = r0 + (-2)
        L1d:
            int r0 = r0 + 2
            goto L1
        L20:
            return
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public void m813(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            xhss.AbstractC0694.m1197(r1)
            xhss.AbstractC0694.m1213(r2, r1)
            r0.m812(r1)
            java.util.ArrayList r0 = r0.f1504
            r0.add(r1)
            java.lang.CharSequence r1 = xhss.AbstractC0120.m346(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public java.util.List m814() {
            r2 = this;
            java.util.ArrayList r0 = r2.f1504
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            return r2
        Lb:
            java.util.ArrayList r0 = r2.f1504
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L17
            java.util.ArrayList r2 = r2.f1504     // Catch: java.lang.Throwable -> L17
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return r1
        L17:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r2
    }
}
