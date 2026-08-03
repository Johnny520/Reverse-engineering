package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 implements java.util.Comparator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f15826g;

    public /* synthetic */ e2(int r1) {
            r0 = this;
            r0.f15826g = r1
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.f15826g
            switch(r0) {
                case 0: goto L117;
                case 1: goto L102;
                case 2: goto Ld5;
                case 3: goto Lbc;
                case 4: goto La3;
                case 5: goto L8a;
                case 6: goto L6d;
                case 7: goto L50;
                case 8: goto L33;
                case 9: goto L1e;
                default: goto L5;
            }
        L5:
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = j8.b.l(r0, r4, r0)
            java.lang.String r5 = (java.lang.String) r5
            r0.getClass()
            java.lang.String r5 = r5.toLowerCase(r0)
            r5.getClass()
            int r4 = r4.compareTo(r5)
            return r4
        L1e:
            wb.br r4 = (wb.br) r4
            int r4 = r4.f15285b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            wb.br r5 = (wb.br) r5
            int r5 = r5.f15285b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r4 = r4.compareTo(r5)
            return r4
        L33:
            wb.t5 r4 = (wb.t5) r4
            java.lang.String r4 = r4.f19171b
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = j8.b.l(r0, r4, r0)
            wb.t5 r5 = (wb.t5) r5
            java.lang.String r5 = r5.f19171b
            r0.getClass()
            java.lang.String r5 = r5.toLowerCase(r0)
            r5.getClass()
            int r4 = r4.compareTo(r5)
            return r4
        L50:
            wb.m5 r4 = (wb.m5) r4
            wb.l5 r4 = r4.f17596b
            int r4 = r4.ordinal()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            wb.m5 r5 = (wb.m5) r5
            wb.l5 r5 = r5.f17596b
            int r5 = r5.ordinal()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r4 = r4.compareTo(r5)
            return r4
        L6d:
            wb.s0 r4 = (wb.s0) r4
            java.lang.String r4 = r4.f18971b
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = j8.b.l(r0, r4, r0)
            wb.s0 r5 = (wb.s0) r5
            java.lang.String r5 = r5.f18971b
            r0.getClass()
            java.lang.String r5 = r5.toLowerCase(r0)
            r5.getClass()
            int r4 = r4.compareTo(r5)
            return r4
        L8a:
            e9.c r4 = (e9.c) r4
            boolean r4 = r4.f2395f
            r4 = r4 ^ 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            e9.c r5 = (e9.c) r5
            boolean r5 = r5.f2395f
            r5 = r5 ^ 1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            int r4 = r4.compareTo(r5)
            return r4
        La3:
            e9.c r4 = (e9.c) r4
            boolean r4 = r4.f2395f
            r4 = r4 ^ 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            e9.c r5 = (e9.c) r5
            boolean r5 = r5.f2395f
            r5 = r5 ^ 1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            int r4 = r4.compareTo(r5)
            return r4
        Lbc:
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = j8.b.l(r0, r4, r0)
            java.lang.String r5 = (java.lang.String) r5
            r0.getClass()
            java.lang.String r5 = r5.toLowerCase(r0)
            r5.getClass()
            int r4 = r4.compareTo(r5)
            return r4
        Ld5:
            h.Hchat.hooks.api.model.ContactLabelBean r4 = (h.Hchat.hooks.api.model.ContactLabelBean) r4
            java.lang.String r0 = r4.labelName
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto Le1
            java.lang.String r0 = r4.labelId
        Le1:
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r0 = j8.b.l(r4, r0, r4)
            h.Hchat.hooks.api.model.ContactLabelBean r5 = (h.Hchat.hooks.api.model.ContactLabelBean) r5
            java.lang.String r1 = r5.labelName
            boolean r2 = og.m.t0(r1)
            if (r2 == 0) goto Lf3
            java.lang.String r1 = r5.labelId
        Lf3:
            r4.getClass()
            java.lang.String r4 = r1.toLowerCase(r4)
            r4.getClass()
            int r4 = r0.compareTo(r4)
            return r4
        L102:
            c9.a r4 = (c9.a) r4
            int r4 = r4.f1084d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            c9.a r5 = (c9.a) r5
            int r5 = r5.f1084d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r4 = r4.compareTo(r5)
            return r4
        L117:
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = j8.b.l(r0, r4, r0)
            java.lang.String r5 = (java.lang.String) r5
            r0.getClass()
            java.lang.String r5 = r5.toLowerCase(r0)
            r5.getClass()
            int r4 = r4.compareTo(r5)
            return r4
    }
}
