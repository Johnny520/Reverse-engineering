package k9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(android.content.SharedPreferences r2, java.lang.String r3) {
            r1 = this;
            k9.r r2 = k9.r.f7530a
            if (r3 == 0) goto L3e
            int r2 = r3.hashCode()
            switch(r2) {
                case -1298848381: goto L1f;
                case 1381039842: goto L15;
                case 1381039843: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L3e
        Lc:
            java.lang.String r2 = "position_y"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L1e
            goto L3e
        L15:
            java.lang.String r2 = "position_x"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L1e
            goto L3e
        L1e:
            return
        L1f:
            java.lang.String r2 = "enable"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L28
            goto L3e
        L28:
            android.content.SharedPreferences r3 = k9.r.f7532c
            r0 = 0
            if (r3 == 0) goto L32
            boolean r2 = r3.getBoolean(r2, r0)
            goto L33
        L32:
            r2 = r0
        L33:
            k9.r.f7533d = r2
            k9.q r3 = new k9.q
            r3.<init>(r0, r2)
            k9.r.p(r3)
            return
        L3e:
            k.s1 r2 = new k.s1
            r3 = 1
            r2.<init>(r3)
            k9.r.p(r2)
            return
    }
}
