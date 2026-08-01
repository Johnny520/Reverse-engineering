package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class gf0 {

    /* JADX INFO: renamed from: α */
    public static final p000.ym1 f4353 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.List f4354 = null;

    static {
            ym1 r0 = new ym1
            java.lang.String r1 = "((?:上滑|下滑)?松手锁定\\s*)\\d+(?:\\.\\d+)?(\\s*倍速)"
            r0.<init>(r1)
            p000.gf0.f4353 = r0
            java.lang.String r0 = "~78D771E8EDF777FCD63305F705F385C32437F8A58A06E57B236CBE52EE80690C87062CCF8375AD4388FCF0F5F78DB89E313078C0432356E4724AD1766356CFE4EE7D09AF8F5E60784E408CC10DD2631F"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.String r1 = "~789B0C8A27824271C64AC17B4A4EFA968DD58C04A0DDDC0007C199DECD27750A6CE3CA9CF0D42D6F95D7AB5C0BEEB31080B8919C78B92996123DC5E75A5109F5A997E8"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            p000.gf0.f4354 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static int m2300() {
            r0 = 2
            boolean r1 = p000.ui1.m5867()     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L9
        L7:
            r1 = r0
            goto L13
        L9:
            java.lang.String r1 = "host_long_press_speed"
            android.content.SharedPreferences r2 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L7
            int r1 = r2.getInt(r1, r0)     // Catch: java.lang.Throwable -> L7
        L13:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L18
            goto L1f
        L18:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        L1f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r2 = r1 instanceof p000.eo1
            if (r2 == 0) goto L28
            r1 = r0
        L28:
            java.lang.Number r1 = (java.lang.Number) r1
            int r0 = r1.intValue()
            r1 = 1
            r2 = 5
            int r0 = p000.j81.m2906(r0, r1, r2)
            return r0
    }
}
