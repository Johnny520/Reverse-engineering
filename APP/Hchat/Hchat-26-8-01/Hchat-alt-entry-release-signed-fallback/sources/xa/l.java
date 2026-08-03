package xa;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            h.Hchat.hooks.api.model.ContactLabelBean r4 = (h.Hchat.hooks.api.model.ContactLabelBean) r4
            java.lang.String r0 = r4.labelName
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto Lc
            java.lang.String r0 = r4.labelId
        Lc:
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r0 = j8.b.l(r4, r0, r4)
            h.Hchat.hooks.api.model.ContactLabelBean r5 = (h.Hchat.hooks.api.model.ContactLabelBean) r5
            java.lang.String r1 = r5.labelName
            boolean r2 = og.m.t0(r1)
            if (r2 == 0) goto L1e
            java.lang.String r1 = r5.labelId
        L1e:
            r4.getClass()
            java.lang.String r4 = r1.toLowerCase(r4)
            r4.getClass()
            int r4 = r0.compareTo(r4)
            return r4
    }
}
