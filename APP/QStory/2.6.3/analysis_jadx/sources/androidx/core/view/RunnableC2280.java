package androidx.core.view;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.appcompat.app.C0076;
import p190.C7782;
import p190.C7800;
import p190.MenuC7802;
import p190.ViewOnKeyListenerC7781;
import top.suzhelan.qstory.hook.item.chat.C5856;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2280 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f6622;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f6623;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f6624;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f6625;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f6626 = 0;

    public RunnableC2280(C5856 c5856, C7782 c7782, C7800 c7800, MenuC7802 menuC7802) {
        this.f6622 = c5856;
        this.f6624 = c7782;
        this.f6625 = c7800;
        this.f6623 = menuC7802;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f6626;
        Object obj = this.f6623;
        Object obj2 = this.f6624;
        Object obj3 = this.f6625;
        Object obj4 = this.f6622;
        switch (i) {
            case 0:
                C2277.m4263((View) obj2, (C2274) obj3, (C0076) obj);
                ((ValueAnimator) obj4).start();
                break;
            default:
                ViewOnKeyListenerC7781 viewOnKeyListenerC7781 = (ViewOnKeyListenerC7781) ((C5856) obj4).f16014;
                C7800 c7800 = (C7800) obj3;
                C7782 c7782 = (C7782) obj2;
                if (c7782 != null) {
                    viewOnKeyListenerC7781.f21140 = true;
                    c7782.f21166.m13154(false);
                    viewOnKeyListenerC7781.f21140 = false;
                }
                if (c7800.isEnabled() && c7800.hasSubMenu()) {
                    ((MenuC7802) obj).m13162(c7800, null, 4);
                    break;
                }
                break;
        }
    }

    public RunnableC2280(View view, C2274 c2274, C0076 c0076, ValueAnimator valueAnimator) {
        this.f6624 = view;
        this.f6625 = c2274;
        this.f6623 = c0076;
        this.f6622 = valueAnimator;
    }
}
