package f2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fg.a f3156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fg.a f3157b;

    public j(fg.a r1, fg.a r2) {
            r0 = this;
            r0.<init>()
            r0.f3156a = r1
            r0.f3157b = r2
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ScrollAxisRange(value="
            r0.<init>(r1)
            fg.a r1 = r2.f3156a
            java.lang.Object r1 = r1.invoke()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            r0.append(r1)
            java.lang.String r1 = ", maxValue="
            r0.append(r1)
            fg.a r1 = r2.f3157b
            java.lang.Object r1 = r1.invoke()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            r0.append(r1)
            java.lang.String r1 = ", reverseScrolling=false)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
