package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC6174 extends android.widget.SpinnerAdapter {

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۡ$ۥ, reason: contains not printable characters */
    public static final class C6175 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.content.Context f22148;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final android.view.LayoutInflater f22149;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public android.view.LayoutInflater f22150;

        public C6175(@Yue.InterfaceC4410 android.content.Context r1) {
                r0 = this;
                r0.<init>()
                r0.f22148 = r1
                android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
                r0.f22149 = r1
                return
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public android.view.LayoutInflater m23116() {
                r1 = this;
                android.view.LayoutInflater r0 = r1.f22150
                if (r0 == 0) goto L5
                goto L7
            L5:
                android.view.LayoutInflater r0 = r1.f22149
            L7:
                return r0
        }

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public android.content.res.Resources.Theme m23117() {
                r1 = this;
                android.view.LayoutInflater r0 = r1.f22150
                if (r0 != 0) goto L6
                r0 = 0
                goto Le
            L6:
                android.content.Context r0 = r0.getContext()
                android.content.res.Resources$Theme r0 = r0.getTheme()
            Le:
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m23118(@Yue.InterfaceC4544 android.content.res.Resources.Theme r3) {
                r2 = this;
                if (r3 != 0) goto L6
                r3 = 0
                r2.f22150 = r3
                goto L24
            L6:
                android.content.Context r0 = r2.f22148
                android.content.res.Resources$Theme r0 = r0.getTheme()
                boolean r0 = r3.equals(r0)
                if (r0 == 0) goto L17
                android.view.LayoutInflater r3 = r2.f22149
                r2.f22150 = r3
                goto L24
            L17:
                Yue.ۥ۟ۧۤۡ r0 = new Yue.ۥ۟ۧۤۡ
                android.content.Context r1 = r2.f22148
                r0.<init>(r1, r3)
                android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
                r2.f22150 = r3
            L24:
                return
        }
    }

    @Yue.InterfaceC4544
    android.content.res.Resources.Theme getDropDownViewTheme();

    void setDropDownViewTheme(@Yue.InterfaceC4544 android.content.res.Resources.Theme r1);
}
