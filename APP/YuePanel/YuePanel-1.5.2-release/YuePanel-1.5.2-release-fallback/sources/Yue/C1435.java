package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C1435 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f4535 = "CompoundButtonCompat";

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.lang.reflect.Field f4536;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean f4537;

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۥ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(21)
    public static class C1436 {
        public C1436() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.content.res.ColorStateList m7083(android.widget.CompoundButton r0) {
                android.content.res.ColorStateList r0 = r0.getButtonTintList()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static android.graphics.PorterDuff.Mode m7084(android.widget.CompoundButton r0) {
                android.graphics.PorterDuff$Mode r0 = r0.getButtonTintMode()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m7085(android.widget.CompoundButton r0, android.content.res.ColorStateList r1) {
                r0.setButtonTintList(r1)
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static void m7086(android.widget.CompoundButton r0, android.graphics.PorterDuff.Mode r1) {
                r0.setButtonTintMode(r1)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۥ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(23)
    public static class C1437 {
        public C1437() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.graphics.drawable.Drawable m7087(android.widget.CompoundButton r0) {
                android.graphics.drawable.Drawable r0 = r0.getButtonDrawable()
                return r0
        }
    }

    public C1435() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static android.graphics.drawable.Drawable m7078(@Yue.InterfaceC4410 android.widget.CompoundButton r0) {
            android.graphics.drawable.Drawable r0 = Yue.C1435.C1437.m7087(r0)
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static android.content.res.ColorStateList m7079(@Yue.InterfaceC4410 android.widget.CompoundButton r0) {
            android.content.res.ColorStateList r0 = Yue.C1435.C1436.m7083(r0)
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static android.graphics.PorterDuff.Mode m7080(@Yue.InterfaceC4410 android.widget.CompoundButton r0) {
            android.graphics.PorterDuff$Mode r0 = Yue.C1435.C1436.m7084(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m7081(@Yue.InterfaceC4410 android.widget.CompoundButton r0, @Yue.InterfaceC4544 android.content.res.ColorStateList r1) {
            Yue.C1435.C1436.m7085(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m7082(@Yue.InterfaceC4410 android.widget.CompoundButton r0, @Yue.InterfaceC4544 android.graphics.PorterDuff.Mode r1) {
            Yue.C1435.C1436.m7086(r0, r1)
            return
    }
}
