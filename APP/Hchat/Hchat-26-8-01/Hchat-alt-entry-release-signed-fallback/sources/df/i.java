package df;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final java.util.Comparator f2230f = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f2231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ad.c f2232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.String f2233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.TreeMap f2234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f2235e;

    static {
            com.alibaba.fastjson2.writer.b r0 = new com.alibaba.fastjson2.writer.b
            r1 = 12
            r0.<init>(r1)
            java.util.Comparator r0 = java.util.Comparator.comparing(r0)
            com.alibaba.fastjson2.writer.b r1 = new com.alibaba.fastjson2.writer.b
            r2 = 13
            r1.<init>(r2)
            java.util.Comparator r0 = r0.thenComparing(r1)
            com.alibaba.fastjson2.writer.b r1 = new com.alibaba.fastjson2.writer.b
            r2 = 14
            r1.<init>(r2)
            java.util.Comparator r0 = r0.thenComparing(r1)
            df.i.f2230f = r0
            return
    }

    public i(ad.c r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f2231a = r0
            java.util.TreeMap r0 = new java.util.TreeMap
            java.util.Comparator r1 = df.i.f2230f
            r0.<init>(r1)
            r2.f2234d = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.f2235e = r0
            r2.f2232b = r3
            return
    }

    public final java.util.HashMap a() {
            r6 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.ArrayList r1 = r6.f2231a
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r1.next()
            ef.c r2 = (ef.c) r2
            int r3 = r2.f2753a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = r2.f2755c
            java.lang.String r2 = r2.f2756d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = "/"
            r5.append(r4)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r0.put(r3, r2)
            goto Lb
        L39:
            return r0
    }
}
