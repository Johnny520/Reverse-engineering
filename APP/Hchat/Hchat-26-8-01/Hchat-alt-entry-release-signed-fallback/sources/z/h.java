package z;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends z.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.view.textclassifier.TextClassification f22472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22473c;

    public h(java.lang.Object r1, android.view.textclassifier.TextClassification r2, int r3) {
            r0 = this;
            r0.<init>(r1)
            r0.f22472b = r2
            r0.f22473c = r3
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TextContextMenuRemoteActionItem(key="
            r0.<init>(r1)
            java.lang.Object r1 = r3.f22460a
            r0.append(r1)
            java.lang.String r1 = ", textClassification="
            r0.append(r1)
            android.view.textclassifier.TextClassification r1 = r3.f22472b
            r0.append(r1)
            java.lang.String r1 = ", index="
            r0.append(r1)
            int r1 = r3.f22473c
            r2 = 41
            java.lang.String r0 = p.a.n(r0, r1, r2)
            return r0
    }
}
