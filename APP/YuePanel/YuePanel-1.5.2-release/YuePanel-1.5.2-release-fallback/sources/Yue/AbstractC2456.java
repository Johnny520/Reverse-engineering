package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2456<T> {
    final java.lang.String mPropertyName;

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۢۦ$ۥ, reason: contains not printable characters */
    public static class C2457 extends Yue.AbstractC2456<T> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ android.util.FloatProperty f8211;

        public C2457(java.lang.String r1, android.util.FloatProperty r2) {
                r0 = this;
                r0.f8211 = r2
                r0.<init>(r1)
                return
        }

        @Override // Yue.AbstractC2456
        public float getValue(T r2) {
                r1 = this;
                android.util.FloatProperty r0 = r1.f8211
                java.lang.Object r2 = r0.get(r2)
                java.lang.Float r2 = (java.lang.Float) r2
                float r2 = r2.floatValue()
                return r2
        }

        @Override // Yue.AbstractC2456
        public void setValue(T r2, float r3) {
                r1 = this;
                android.util.FloatProperty r0 = r1.f8211
                r0.setValue(r2, r3)
                return
        }
    }

    public AbstractC2456(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.mPropertyName = r1
            return
    }

    @Yue.InterfaceC5336(24)
    public static <T> Yue.AbstractC2456<T> createFloatPropertyCompat(android.util.FloatProperty<T> r2) {
            Yue.ۥ۠ۢۢۦ$ۥ r0 = new Yue.ۥ۠ۢۢۦ$ۥ
            java.lang.String r1 = r2.getName()
            r0.<init>(r1, r2)
            return r0
    }

    public abstract float getValue(T r1);

    public abstract void setValue(T r1, float r2);
}
