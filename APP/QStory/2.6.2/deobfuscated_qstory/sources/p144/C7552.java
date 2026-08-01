package p144;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import kotlinx.coroutines.flow.C5266;
import p316.C8675;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7552 implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C7553 f20449;

    public C7552(C7553 c7553) {
        this.f20449 = c7553;
    }

    public final void onBackCancelled() {
        C7553 c7553 = this.f20449;
        C7549 c7549 = c7553.f20455;
        if (c7549 == null) {
            C5919.m11250("This input is not added to any dispatcher.");
            return;
        }
        if (!c7553.f20454) {
            c7549.m12755(c7553, null);
        }
        if (c7549.f20442) {
            C7558 c7558 = c7549.f20441;
            c7558.getClass();
            if (c7553.equals(c7558.f20468) && -1 == c7558.f20469) {
                AbstractC7547 abstractC7547M12759 = c7558.f20460;
                if (abstractC7547M12759 == null) {
                    abstractC7547M12759 = c7558.m12759(-1);
                }
                c7558.f20460 = null;
                c7558.f20469 = 0;
                c7558.f20468 = null;
                if (abstractC7547M12759 != null) {
                    abstractC7547M12759.mo69();
                }
                C5266 c5266 = c7558.f20465;
                c5266.getClass();
                c5266.m10307(null, C7559.f20474);
            }
        }
        c7553.f20454 = false;
    }

    public final void onBackInvoked() {
        this.f20449.m12758();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        C7550 c7550M14354 = C8675.m14354(backEvent);
        C7553 c7553 = this.f20449;
        C7549 c7549 = c7553.f20455;
        if (c7549 == null) {
            C5919.m11250("This input is not added to any dispatcher.");
            return;
        }
        if (c7553.f20454 && c7549.f20442) {
            C7558 c7558 = c7549.f20441;
            c7558.getClass();
            if (c7553.equals(c7558.f20468) && -1 == c7558.f20469) {
                AbstractC7547 abstractC7547M12759 = c7558.f20460;
                if (abstractC7547M12759 == null) {
                    abstractC7547M12759 = c7558.m12759(-1);
                }
                if (abstractC7547M12759 != null) {
                    new C7556(c7550M14354, -1);
                    abstractC7547M12759.mo67(c7550M14354);
                }
                C5266 c5266 = c7558.f20465;
                C7556 c7556 = new C7556(c7550M14354, -1);
                c5266.getClass();
                c5266.m10307(null, c7556);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        C7550 c7550M14354 = C8675.m14354(backEvent);
        C7553 c7553 = this.f20449;
        C7549 c7549 = c7553.f20455;
        if (c7549 == null) {
            C5919.m11250("This input is not added to any dispatcher.");
        } else {
            if (c7553.f20454) {
                return;
            }
            c7549.m12755(c7553, c7550M14354);
            c7553.f20454 = true;
        }
    }
}
