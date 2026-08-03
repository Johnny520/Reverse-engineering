package p340x2;

import android.view.WindowInsets;
import gg.AbstractC1417m;
import java.util.HashMap;
import p085fg.InterfaceC1231l;
import p091g3.AbstractC1329q;
import p091g3.C1332r0;
import p276sf.C3967n;
import p293u2.C4242l;
import p308v1.InterfaceC4428t;
import p339x1.C5602f0;
import p339x1.InterfaceC5641r1;
import p357y1.C5906m;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;

/* JADX INFO: renamed from: x2.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5668c extends AbstractC1417m implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f23064g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C5687v f23065h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C5602f0 f23066i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5668c(C5687v c5687v, C5602f0 c5602f0, int i9) {
        super(1);
        this.f23064g = i9;
        this.f23065h = c5687v;
        this.f23066i = c5602f0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        WindowInsets windowInsetsM3559b;
        switch (this.f23064g) {
            case 0:
                InterfaceC5641r1 interfaceC5641r1 = (InterfaceC5641r1) obj;
                ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t = interfaceC5641r1 instanceof ViewTreeObserverOnGlobalLayoutListenerC5934t ? (ViewTreeObserverOnGlobalLayoutListenerC5934t) interfaceC5641r1 : null;
                C5687v c5687v = this.f23065h;
                if (viewTreeObserverOnGlobalLayoutListenerC5934t != null) {
                    HashMap<AbstractC5673h, C5602f0> holderToLayoutNode = viewTreeObserverOnGlobalLayoutListenerC5934t.getAndroidViewsHandler$ui().getHolderToLayoutNode();
                    C5602f0 c5602f0 = this.f23066i;
                    holderToLayoutNode.put(c5687v, c5602f0);
                    viewTreeObserverOnGlobalLayoutListenerC5934t.getAndroidViewsHandler$ui().addView(c5687v);
                    viewTreeObserverOnGlobalLayoutListenerC5934t.getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(c5602f0, c5687v);
                    c5687v.setImportantForAccessibility(1);
                    AbstractC1329q.m3554a(c5687v, new C5906m(viewTreeObserverOnGlobalLayoutListenerC5934t, c5602f0, viewTreeObserverOnGlobalLayoutListenerC5934t));
                }
                if (c5687v.getView().getParent() != c5687v) {
                    c5687v.addView(c5687v.getView());
                }
                break;
            case 1:
                AbstractC5674i.m10237d(this.f23065h, this.f23066i);
                break;
            default:
                C5602f0 c5602f02 = this.f23066i;
                C5687v c5687v2 = this.f23065h;
                AbstractC5674i.m10237d(c5687v2, c5602f02);
                ((ViewTreeObserverOnGlobalLayoutListenerC5934t) c5687v2.f23087i).f24088N = true;
                int[] iArr = c5687v2.f23098t;
                int i9 = iArr[0];
                int i10 = iArr[1];
                c5687v2.getView().getLocationOnScreen(iArr);
                long j3 = c5687v2.f23099u;
                long jMo8858F = ((InterfaceC4428t) obj).mo8858F();
                c5687v2.f23099u = jMo8858F;
                C1332r0 c1332r0 = c5687v2.f23100v;
                if (c1332r0 != null && ((i9 != iArr[0] || i10 != iArr[1] || !C4242l.m8534a(j3, jMo8858F)) && (windowInsetsM3559b = c5687v2.m10233g(c1332r0).m3559b()) != null)) {
                    c5687v2.getView().dispatchApplyWindowInsets(windowInsetsM3559b);
                }
                break;
        }
        return C3967n.f12976a;
    }
}
