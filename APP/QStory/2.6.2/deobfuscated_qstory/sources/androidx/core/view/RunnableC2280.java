package androidx.core.view;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.appcompat.app.C0076;
import p190.C7781;
import p190.C7799;
import p190.MenuC7801;
import p190.ViewOnKeyListenerC7780;
import top.suzhelan.qstory.hook.item.chat.C5851;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2280 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f6621;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f6622;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f6623;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f6624;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f6625 = 0;

    public RunnableC2280(C5851 c5851, C7781 c7781, C7799 c7799, MenuC7801 menuC7801) {
        this.f6621 = c5851;
        this.f6623 = c7781;
        this.f6624 = c7799;
        this.f6622 = menuC7801;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f6625;
        Object obj = this.f6622;
        Object obj2 = this.f6623;
        Object obj3 = this.f6624;
        Object obj4 = this.f6621;
        switch (i) {
            case 0:
                C2277.m4253((View) obj2, (C2274) obj3, (C0076) obj);
                ((ValueAnimator) obj4).start();
                break;
            default:
                ViewOnKeyListenerC7780 viewOnKeyListenerC7780 = (ViewOnKeyListenerC7780) ((C5851) obj4).f16007;
                C7799 c7799 = (C7799) obj3;
                C7781 c7781 = (C7781) obj2;
                if (c7781 != null) {
                    viewOnKeyListenerC7780.f21143 = true;
                    c7781.f21169.m13126(false);
                    viewOnKeyListenerC7780.f21143 = false;
                }
                if (c7799.isEnabled() && c7799.hasSubMenu()) {
                    ((MenuC7801) obj).m13134(c7799, null, 4);
                    break;
                }
                break;
        }
    }

    public RunnableC2280(View view, C2274 c2274, C0076 c0076, ValueAnimator valueAnimator) {
        this.f6623 = view;
        this.f6624 = c2274;
        this.f6622 = c0076;
        this.f6621 = valueAnimator;
    }
}
