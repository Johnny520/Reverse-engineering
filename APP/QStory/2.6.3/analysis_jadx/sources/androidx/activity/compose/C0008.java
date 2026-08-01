package androidx.activity.compose;

import android.view.View;
import androidx.activity.C0022;
import androidx.compose.animation.core.C0315;
import androidx.compose.animation.core.C0316;
import androidx.compose.animation.core.C0351;
import androidx.compose.animation.core.C0354;
import androidx.compose.animation.core.C0355;
import androidx.compose.animation.core.C0364;
import androidx.compose.foundation.layout.C0625;
import androidx.compose.foundation.lazy.layout.C0683;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.InterfaceC1360;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.adaptive.ViewTreeObserverOnGlobalLayoutListenerC1401;
import androidx.core.view.AbstractC2193;
import androidx.core.view.AbstractC2270;
import java.util.WeakHashMap;
import kotlin.collections.AbstractC4344;
import p173.C7734;
import p173.C7735;
import top.suzhelan.qstory.hook.item.C5925;
import top.yukonga.miuix.kmp.utils.C6080;

/* JADX INFO: renamed from: androidx.activity.compose.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0008 implements InterfaceC1360 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f17;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f18;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f19;

    public /* synthetic */ C0008(Object obj, int i, Object obj2) {
        this.f19 = i;
        this.f18 = obj;
        this.f17 = obj2;
    }

    @Override // androidx.compose.runtime.InterfaceC1360
    public final void dispose() {
        int i = this.f19;
        Object obj = this.f17;
        Object obj2 = this.f18;
        switch (i) {
            case 0:
                C7734 c7734 = (C7734) obj2;
                C0012 c0012 = (C0012) obj;
                if (c7734.f20993 != null) {
                    ((C7735) c0012.f232).m12780();
                } else if (c7734.f20992 == null) {
                    C5925.m11311("Unreachable");
                } else {
                    ((C0022) c0012.f231).m65();
                }
                break;
            case 1:
                ((C0315) obj2).f1060.m2055((C0316) obj);
                break;
            case 2:
                ((C0364) obj2).f1249.remove((C0364) obj);
                break;
            case 3:
                C0364 c0364 = (C0364) obj2;
                c0364.getClass();
                C0355 c0355 = (C0355) ((AbstractC1347) ((C0354) obj).f1218).getValue();
                if (c0355 != null) {
                    c0364.f1248.remove(c0355.f1223);
                }
                break;
            case 4:
                ((C0364) obj2).f1248.remove((C0351) obj);
                break;
            case 5:
                C0625 c0625 = (C0625) obj2;
                View view = (View) obj;
                int i2 = c0625.f1747 - 1;
                c0625.f1747 = i2;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = AbstractC2270.f6594;
                    AbstractC2193.m4004(view, null);
                    AbstractC2270.m4242(view, null);
                    view.removeOnAttachStateChangeListener(c0625.f1749);
                }
                break;
            case 6:
                ((C0683) obj2).f1909.m745(obj);
                break;
            case 7:
                ((View) obj2).getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserverOnGlobalLayoutListenerC1401) obj);
                break;
            default:
                AbstractC4344.m8791((SnapshotStateList) obj2, C6080.f16628);
                AbstractC4344.m8791((SnapshotStateList) obj, C6080.f16629);
                break;
        }
    }
}
