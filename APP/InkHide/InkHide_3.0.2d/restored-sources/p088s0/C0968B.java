package p088s0;

import android.widget.PopupWindow;
import android.widget.TextView;
import p004C.C0060d;
import p009E0.C0109i;
import p025M0.InterfaceC0193a;
import p027N0.AbstractC0223g;
import p027N0.C0228l;
import p052b1.AbstractC0503h;
import p102z0.AbstractC1121d;

/* JADX INFO: renamed from: s0.B */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0968B implements InterfaceC0193a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3463a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0228l f3464b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0976J f3465c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0968B(int i2, C0228l c0228l, C0976J c0976j) {
        this.f3463a = i2;
        this.f3464b = c0228l;
        this.f3465c = c0976j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025M0.InterfaceC0193a
    /* JADX INFO: renamed from: b */
    public final Object mo7b() {
        switch (this.f3463a) {
            case 0:
                Object obj = this.f3464b.f568a;
                if (obj == null) {
                    AbstractC0223g.m420g("popupWindow");
                    throw null;
                }
                ((PopupWindow) obj).dismiss();
                C0976J c0976j = this.f3465c;
                AbstractC0503h.m978P("正在获取软件公告");
                AbstractC1121d.f3779a.m2409h(true, new C0971E(c0976j, false));
                return C0109i.f404a;
            case 1:
                Object obj2 = this.f3464b.f568a;
                if (obj2 == null) {
                    AbstractC0223g.m420g("popupWindow");
                    throw null;
                }
                ((PopupWindow) obj2).dismiss();
                C0976J c0976j2 = this.f3465c;
                AbstractC0503h.m978P("正在检查更新");
                AbstractC1121d.f3779a.m2409h(true, new C0060d(14, new C1004z(c0976j2, 22)));
                return C0109i.f404a;
            case 2:
                C0976J.m2163l(this.f3464b, this.f3465c);
                return C0109i.f404a;
            case 3:
                TextView textView = (TextView) this.f3464b.f568a;
                if (textView != null) {
                    textView.setText(this.f3465c.m2172I());
                }
                return C0109i.f404a;
            default:
                TextView textView2 = (TextView) this.f3464b.f568a;
                if (textView2 != null) {
                    textView2.setText(this.f3465c.m2172I());
                }
                return C0109i.f404a;
        }
    }
}
