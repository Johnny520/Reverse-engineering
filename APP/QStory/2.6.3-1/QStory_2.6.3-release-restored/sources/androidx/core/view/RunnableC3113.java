package androidx.core.view;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.appcompat.app.C0923;
import p206.C8611;
import p206.C8629;
import p206.MenuC8631;
import p206.ViewOnKeyListenerC8610;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3113 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f6967;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f6968;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f6969;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f6970;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f6971 = 0;

    public RunnableC3113(C6686 c6686, C8611 c8611, C8629 c8629, MenuC8631 menuC8631) {
        this.f6967 = c6686;
        this.f6969 = c8611;
        this.f6970 = c8629;
        this.f6968 = menuC8631;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f6971;
        Object obj = this.f6968;
        Object obj2 = this.f6969;
        Object obj3 = this.f6970;
        Object obj4 = this.f6967;
        switch (i) {
            case 0:
                C3110.m4823((View) obj2, (C3107) obj3, (C0923) obj);
                ((ValueAnimator) obj4).start();
                break;
            default:
                ViewOnKeyListenerC8610 viewOnKeyListenerC8610 = (ViewOnKeyListenerC8610) ((C6686) obj4).f16359;
                C8629 c8629 = (C8629) obj3;
                C8611 c8611 = (C8611) obj2;
                if (c8611 != null) {
                    viewOnKeyListenerC8610.f21485 = true;
                    c8611.f21511.m13713(false);
                    viewOnKeyListenerC8610.f21485 = false;
                }
                if (c8629.isEnabled() && c8629.hasSubMenu()) {
                    ((MenuC8631) obj).m13721(c8629, null, 4);
                    break;
                }
                break;
        }
    }

    public RunnableC3113(View view, C3107 c3107, C0923 c0923, ValueAnimator valueAnimator) {
        this.f6969 = view;
        this.f6970 = c3107;
        this.f6968 = c0923;
        this.f6967 = valueAnimator;
    }
}
