package Yue;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.widget.SpinnerAdapter;

/* JADX INFO: renamed from: Yue.ۥۣۢۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC7773 extends SpinnerAdapter {

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۡ$ۥ */
    public static final class C1350 {

        /* JADX INFO: renamed from: ۥ */
        public final Context f3072;

        /* JADX INFO: renamed from: ۥ۟ */
        public final LayoutInflater f3073;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public LayoutInflater f23314;

        public C1350(@InterfaceC6391 Context context) {
            this.f3072 = context;
            this.f3073 = LayoutInflater.from(context);
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ */
        public LayoutInflater m3868() {
            LayoutInflater layoutInflater = this.f23314;
            return layoutInflater != null ? layoutInflater : this.f3073;
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟ */
        public Resources.Theme m3869() {
            LayoutInflater layoutInflater = this.f23314;
            if (layoutInflater == null) {
                return null;
            }
            return layoutInflater.getContext().getTheme();
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m24711(@InterfaceC6490 Resources.Theme theme) {
            if (theme == null) {
                this.f23314 = null;
            } else if (theme.equals(this.f3072.getTheme())) {
                this.f23314 = this.f3073;
            } else {
                this.f23314 = LayoutInflater.from(new C4198(this.f3072, theme));
            }
        }
    }

    @InterfaceC6490
    Resources.Theme getDropDownViewTheme();

    void setDropDownViewTheme(@InterfaceC6490 Resources.Theme theme);
}
