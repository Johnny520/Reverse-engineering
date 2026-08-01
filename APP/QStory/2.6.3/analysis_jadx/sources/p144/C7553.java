package p144;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import com.bumptech.glide.AbstractC3055;
import kotlinx.coroutines.flow.C5267;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7553 implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C7554 f20444;

    public C7553(C7554 c7554) {
        this.f20444 = c7554;
    }

    public final void onBackCancelled() {
        C7554 c7554 = this.f20444;
        C7550 c7550 = c7554.f20450;
        if (c7550 == null) {
            C5925.m11311("This input is not added to any dispatcher.");
            return;
        }
        if (!c7554.f20449) {
            c7550.m12784(c7554, null);
        }
        if (c7550.f20437) {
            C7559 c7559 = c7550.f20436;
            c7559.getClass();
            if (c7554.equals(c7559.f20463) && -1 == c7559.f20464) {
                AbstractC7548 abstractC7548M12788 = c7559.f20455;
                if (abstractC7548M12788 == null) {
                    abstractC7548M12788 = c7559.m12788(-1);
                }
                c7559.f20455 = null;
                c7559.f20464 = 0;
                c7559.f20463 = null;
                if (abstractC7548M12788 != null) {
                    abstractC7548M12788.mo69();
                }
                C5267 c5267 = c7559.f20460;
                c5267.getClass();
                c5267.m10311(null, C7560.f20469);
            }
        }
        c7554.f20449 = false;
    }

    public final void onBackInvoked() {
        this.f20444.m12787();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        C7551 c7551M6649 = AbstractC3055.m6649(backEvent);
        C7554 c7554 = this.f20444;
        C7550 c7550 = c7554.f20450;
        if (c7550 == null) {
            C5925.m11311("This input is not added to any dispatcher.");
            return;
        }
        if (c7554.f20449 && c7550.f20437) {
            C7559 c7559 = c7550.f20436;
            c7559.getClass();
            if (c7554.equals(c7559.f20463) && -1 == c7559.f20464) {
                AbstractC7548 abstractC7548M12788 = c7559.f20455;
                if (abstractC7548M12788 == null) {
                    abstractC7548M12788 = c7559.m12788(-1);
                }
                if (abstractC7548M12788 != null) {
                    new C7557(c7551M6649, -1);
                    abstractC7548M12788.mo67(c7551M6649);
                }
                C5267 c5267 = c7559.f20460;
                C7557 c7557 = new C7557(c7551M6649, -1);
                c5267.getClass();
                c5267.m10311(null, c7557);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        C7551 c7551M6649 = AbstractC3055.m6649(backEvent);
        C7554 c7554 = this.f20444;
        C7550 c7550 = c7554.f20450;
        if (c7550 == null) {
            C5925.m11311("This input is not added to any dispatcher.");
        } else {
            if (c7554.f20449) {
                return;
            }
            c7550.m12784(c7554, c7551M6649);
            c7554.f20449 = true;
        }
    }
}
