package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0.g f21993a;

    public /* synthetic */ l1(v0.g r1) {
            r0 = this;
            r0.<init>()
            r0.f21993a = r1
            return
    }

    public final android.os.Bundle a() {
            r5 = this;
            v0.g r0 = r5.f21993a
            java.util.Map r0 = r0.c()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            boolean r4 = r2 instanceof java.util.ArrayList
            if (r4 == 0) goto L32
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            goto L38
        L32:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r2)
            r2 = r4
        L38:
            r1.putParcelableArrayList(r3, r2)
            goto L13
        L3c:
            return r1
    }
}
