package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class cp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f15526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f15527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fg.l f15529d;

    public cp(java.lang.String r1, java.util.ArrayList r2, int r3, fg.l r4) {
            r0 = this;
            r4.getClass()
            r0.<init>()
            r0.f15526a = r1
            r0.f15527b = r2
            r0.f15528c = r3
            r0.f15529d = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L33
        L3:
            boolean r0 = r3 instanceof wb.cp
            if (r0 != 0) goto L8
            goto L31
        L8:
            wb.cp r3 = (wb.cp) r3
            java.lang.String r0 = r2.f15526a
            java.lang.String r1 = r3.f15526a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L31
        L15:
            java.util.ArrayList r0 = r2.f15527b
            java.util.ArrayList r1 = r3.f15527b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L31
        L20:
            int r0 = r2.f15528c
            int r1 = r3.f15528c
            if (r0 == r1) goto L27
            goto L31
        L27:
            fg.l r0 = r2.f15529d
            fg.l r3 = r3.f15529d
            boolean r3 = gg.l.a(r0, r3)
            if (r3 != 0) goto L33
        L31:
            r3 = 0
            return r3
        L33:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f15526a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.util.ArrayList r2 = r3.f15527b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            int r0 = r3.f15528c
            int r0 = eh.a.e(r0, r2, r1)
            fg.l r1 = r3.f15529d
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "OptionPickerRequest(title="
            r0.<init>(r1)
            java.lang.String r1 = r2.f15526a
            r0.append(r1)
            java.lang.String r1 = ", options="
            r0.append(r1)
            java.util.ArrayList r1 = r2.f15527b
            r0.append(r1)
            java.lang.String r1 = ", currentValue="
            r0.append(r1)
            int r1 = r2.f15528c
            r0.append(r1)
            java.lang.String r1 = ", onSelected="
            r0.append(r1)
            fg.l r1 = r2.f15529d
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
