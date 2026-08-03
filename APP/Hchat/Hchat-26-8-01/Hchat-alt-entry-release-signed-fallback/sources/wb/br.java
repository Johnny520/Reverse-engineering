package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class br {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.view.View f15284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.view.ViewGroup.LayoutParams f15286c;

    public br(android.view.View r1, int r2, android.view.ViewGroup.LayoutParams r3) {
            r0 = this;
            r0.<init>()
            r0.f15284a = r1
            r0.f15285b = r2
            r0.f15286c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof wb.br
            if (r0 != 0) goto L8
            goto L26
        L8:
            wb.br r3 = (wb.br) r3
            android.view.View r0 = r2.f15284a
            android.view.View r1 = r3.f15284a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L26
        L15:
            int r0 = r2.f15285b
            int r1 = r3.f15285b
            if (r0 == r1) goto L1c
            goto L26
        L1c:
            android.view.ViewGroup$LayoutParams r0 = r2.f15286c
            android.view.ViewGroup$LayoutParams r3 = r3.f15286c
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L28
        L26:
            r3 = 0
            return r3
        L28:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            android.view.View r0 = r3.f15284a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f15285b
            int r0 = eh.a.e(r2, r0, r1)
            android.view.ViewGroup$LayoutParams r1 = r3.f15286c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ContentChild(view="
            r0.<init>(r1)
            android.view.View r1 = r2.f15284a
            r0.append(r1)
            java.lang.String r1 = ", index="
            r0.append(r1)
            int r1 = r2.f15285b
            r0.append(r1)
            java.lang.String r1 = ", layoutParams="
            r0.append(r1)
            android.view.ViewGroup$LayoutParams r1 = r2.f15286c
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
