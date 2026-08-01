package p000;

/* JADX INFO: renamed from: hj */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SharedPreferencesOnSharedPreferenceChangeListenerC0361hj implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(android.content.SharedPreferences r2, java.lang.String r3) {
            r1 = this;
            r1 = 0
            if (r3 == 0) goto L39
            int r2 = r3.hashCode()
            switch(r2) {
                case -1915897106: goto L26;
                case -1422914926: goto L1d;
                case -1203165145: goto L14;
                case -648373524: goto Lb;
                default: goto La;
            }
        La:
            goto L39
        Lb:
            java.lang.String r2 = "comment_bg_image_blur_radius"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L2f
            goto L39
        L14:
            java.lang.String r2 = "comment_bg_image_blur_enabled"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L39
            goto L2f
        L1d:
            java.lang.String r2 = "comment_bg_cropped_uri"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L2f
            goto L39
        L26:
            java.lang.String r2 = "comment_bg_image_uri"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L2f
            goto L39
        L2f:
            java.lang.Object r2 = p000.AbstractC0551mj.f7179
            monitor-enter(r2)
            p000.AbstractC0551mj.f7180 = r1     // Catch: java.lang.Throwable -> L36
            monitor-exit(r2)
            goto L39
        L36:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        L39:
            if (r3 == 0) goto L57
            int r2 = r3.hashCode()
            r0 = 1499763913(0x596494c9, float:4.0212429E15)
            if (r2 == r0) goto L45
            goto L57
        L45:
            java.lang.String r2 = "comment_bg_color"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L57
            java.lang.Object r2 = p000.AbstractC0551mj.f7179
            monitor-enter(r2)
            p000.AbstractC0551mj.f7178 = r1     // Catch: java.lang.Throwable -> L54
            monitor-exit(r2)
            goto L57
        L54:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        L57:
            h22 r1 = p000.AbstractC0551mj.f7171
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            boolean r1 = p000.ln0.m3626(r1, r2)
            if (r1 == 0) goto L6b
            p000.AbstractC0551mj.m3862()
            return
        L6b:
            h22 r1 = p000.AbstractC0551mj.f7171
            java.lang.Object r1 = r1.getValue()
            android.os.Handler r1 = (android.os.Handler) r1
            s0 r2 = new s0
            r3 = 9
            r2.<init>(r3)
            r1.post(r2)
            return
    }
}
