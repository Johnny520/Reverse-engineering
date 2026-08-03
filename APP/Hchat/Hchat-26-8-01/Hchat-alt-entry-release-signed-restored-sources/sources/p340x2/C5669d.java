package p340x2;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import p293u2.C4231a;
import p308v1.InterfaceC4412n0;
import p308v1.InterfaceC4414o;
import p308v1.InterfaceC4415o0;
import p308v1.InterfaceC4418p0;
import p339x1.C5602f0;
import tf.C4174u;

/* JADX INFO: renamed from: x2.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5669d implements InterfaceC4412n0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C5687v f23067a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C5602f0 f23068b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5669d(C5687v c5687v, C5602f0 c5602f0) {
        this.f23067a = c5687v;
        this.f23068b = c5602f0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4412n0
    /* JADX INFO: renamed from: a */
    public final int mo3991a(InterfaceC4414o interfaceC4414o, List list, int i9) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        C5687v c5687v = this.f23067a;
        ViewGroup.LayoutParams layoutParams = c5687v.getLayoutParams();
        layoutParams.getClass();
        c5687v.measure(iMakeMeasureSpec, AbstractC5673h.m10231e(c5687v, 0, i9, layoutParams.height));
        return c5687v.getMeasuredWidth();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4412n0
    /* JADX INFO: renamed from: c */
    public final int mo3992c(InterfaceC4414o interfaceC4414o, List list, int i9) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        C5687v c5687v = this.f23067a;
        ViewGroup.LayoutParams layoutParams = c5687v.getLayoutParams();
        layoutParams.getClass();
        c5687v.measure(iMakeMeasureSpec, AbstractC5673h.m10231e(c5687v, 0, i9, layoutParams.height));
        return c5687v.getMeasuredWidth();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4412n0
    /* JADX INFO: renamed from: g */
    public final int mo3993g(InterfaceC4414o interfaceC4414o, List list, int i9) {
        C5687v c5687v = this.f23067a;
        ViewGroup.LayoutParams layoutParams = c5687v.getLayoutParams();
        layoutParams.getClass();
        c5687v.measure(AbstractC5673h.m10231e(c5687v, 0, i9, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return c5687v.getMeasuredHeight();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4412n0
    /* JADX INFO: renamed from: h */
    public final InterfaceC4415o0 mo3994h(InterfaceC4418p0 interfaceC4418p0, List list, long j3) {
        C5687v c5687v = this.f23067a;
        int childCount = c5687v.getChildCount();
        C4174u c4174u = C4174u.f13711g;
        if (childCount == 0) {
            return interfaceC4418p0.mo8010z(C4231a.m8506j(j3), C4231a.m8505i(j3), c4174u, C5667b.f23060i);
        }
        if (C4231a.m8506j(j3) != 0) {
            c5687v.getChildAt(0).setMinimumWidth(C4231a.m8506j(j3));
        }
        if (C4231a.m8505i(j3) != 0) {
            c5687v.getChildAt(0).setMinimumHeight(C4231a.m8505i(j3));
        }
        int iM8506j = C4231a.m8506j(j3);
        int iM8504h = C4231a.m8504h(j3);
        ViewGroup.LayoutParams layoutParams = c5687v.getLayoutParams();
        layoutParams.getClass();
        int iM10231e = AbstractC5673h.m10231e(c5687v, iM8506j, iM8504h, layoutParams.width);
        int iM8505i = C4231a.m8505i(j3);
        int iM8503g = C4231a.m8503g(j3);
        ViewGroup.LayoutParams layoutParams2 = c5687v.getLayoutParams();
        layoutParams2.getClass();
        c5687v.measure(iM10231e, AbstractC5673h.m10231e(c5687v, iM8505i, iM8503g, layoutParams2.height));
        return interfaceC4418p0.mo8010z(c5687v.getMeasuredWidth(), c5687v.getMeasuredHeight(), c4174u, new C5668c(c5687v, this.f23068b, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4412n0
    /* JADX INFO: renamed from: i */
    public final int mo3995i(InterfaceC4414o interfaceC4414o, List list, int i9) {
        C5687v c5687v = this.f23067a;
        ViewGroup.LayoutParams layoutParams = c5687v.getLayoutParams();
        layoutParams.getClass();
        c5687v.measure(AbstractC5673h.m10231e(c5687v, 0, i9, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return c5687v.getMeasuredHeight();
    }
}
