package p160;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import com.bumptech.glide.AbstractC3887;
import kotlinx.coroutines.flow.C6099;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8382 implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C8383 f20789;

    public C8382(C8383 c8383) {
        this.f20789 = c8383;
    }

    public final void onBackCancelled() {
        C8383 c8383 = this.f20789;
        C8379 c8379 = c8383.f20795;
        if (c8379 == null) {
            C6755.m11870("This input is not added to any dispatcher.");
            return;
        }
        if (!c8383.f20794) {
            c8379.m13343(c8383, null);
        }
        if (c8379.f20782) {
            C8388 c8388 = c8379.f20781;
            c8388.getClass();
            if (c8383.equals(c8388.f20808) && -1 == c8388.f20809) {
                AbstractC8377 abstractC8377M13347 = c8388.f20800;
                if (abstractC8377M13347 == null) {
                    abstractC8377M13347 = c8388.m13347(-1);
                }
                c8388.f20800 = null;
                c8388.f20809 = 0;
                c8388.f20808 = null;
                if (abstractC8377M13347 != null) {
                    abstractC8377M13347.mo629();
                }
                C6099 c6099 = c8388.f20805;
                c6099.getClass();
                c6099.m10870(null, C8389.f20814);
            }
        }
        c8383.f20794 = false;
    }

    public final void onBackInvoked() {
        this.f20789.m13346();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        C8380 c8380M7209 = AbstractC3887.m7209(backEvent);
        C8383 c8383 = this.f20789;
        C8379 c8379 = c8383.f20795;
        if (c8379 == null) {
            C6755.m11870("This input is not added to any dispatcher.");
            return;
        }
        if (c8383.f20794 && c8379.f20782) {
            C8388 c8388 = c8379.f20781;
            c8388.getClass();
            if (c8383.equals(c8388.f20808) && -1 == c8388.f20809) {
                AbstractC8377 abstractC8377M13347 = c8388.f20800;
                if (abstractC8377M13347 == null) {
                    abstractC8377M13347 = c8388.m13347(-1);
                }
                if (abstractC8377M13347 != null) {
                    new C8386(c8380M7209, -1);
                    abstractC8377M13347.mo627(c8380M7209);
                }
                C6099 c6099 = c8388.f20805;
                C8386 c8386 = new C8386(c8380M7209, -1);
                c6099.getClass();
                c6099.m10870(null, c8386);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        C8380 c8380M7209 = AbstractC3887.m7209(backEvent);
        C8383 c8383 = this.f20789;
        C8379 c8379 = c8383.f20795;
        if (c8379 == null) {
            C6755.m11870("This input is not added to any dispatcher.");
        } else {
            if (c8383.f20794) {
                return;
            }
            c8379.m13343(c8383, c8380M7209);
            c8383.f20794 = true;
        }
    }
}
