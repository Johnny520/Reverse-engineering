package r8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface f {
    java.lang.String a();

    default boolean b(r8.g r4) {
            r3 = this;
            r4.getClass()
            ub.a r4 = r4.f11626g
            java.lang.String r0 = r3.a()
            java.lang.String r1 = "_enabled"
            java.lang.String r0 = r0.concat(r1)
            r4.getClass()
            r1 = 1
            android.content.Context r4 = r4.f13668a     // Catch: java.lang.Throwable -> L20
            java.lang.String r2 = "Hchat_global_config"
            android.content.SharedPreferences r4 = ub.b.c(r4, r2)     // Catch: java.lang.Throwable -> L20
            boolean r4 = r4.getBoolean(r0, r1)     // Catch: java.lang.Throwable -> L20
            return r4
        L20:
            return r1
    }

    void c(r8.g r1);

    default void d(r8.g r1) {
            r0 = this;
            r1.getClass()
            return
    }

    java.lang.String name();
}
