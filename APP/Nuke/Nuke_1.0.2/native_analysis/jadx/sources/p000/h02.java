package p000;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class h02 implements f02 {

    /* JADX INFO: renamed from: b */
    public static final h02 f3754b = new h02(0);

    /* JADX INFO: renamed from: c */
    public static final h02 f3755c = new h02(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3756a;

    public /* synthetic */ h02(int i) {
        this.f3756a = i;
    }

    @Override // p000.f02
    /* JADX INFO: renamed from: a */
    public final boolean mo1488a() {
        switch (this.f3756a) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // p000.f02
    /* JADX INFO: renamed from: b */
    public final e02 mo1489b(View view, e70 e70Var) {
        switch (this.f3756a) {
            case 0:
                return new g02(new Magnifier(view));
            default:
                return new i02(new Magnifier(view));
        }
    }
}
