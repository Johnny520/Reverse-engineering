package androidx.activity.compose;

import android.view.View;
import androidx.activity.C0869;
import androidx.compose.animation.core.C1161;
import androidx.compose.animation.core.C1162;
import androidx.compose.animation.core.C1197;
import androidx.compose.animation.core.C1200;
import androidx.compose.animation.core.C1201;
import androidx.compose.animation.core.C1210;
import androidx.compose.foundation.layout.C1466;
import androidx.compose.foundation.lazy.layout.C1524;
import androidx.compose.p001ui.adaptive.ViewTreeObserverOnGlobalLayoutListenerC2236;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.InterfaceC2195;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.core.view.AbstractC3026;
import androidx.core.view.AbstractC3103;
import java.util.WeakHashMap;
import kotlin.collections.AbstractC5176;
import p189.C8563;
import p189.C8564;
import top.suzhelan.qstory.hook.item.C6755;
import top.yukonga.miuix.kmp.utils.C6909;

/* JADX INFO: renamed from: androidx.activity.compose.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0855 implements InterfaceC2195 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f362;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f363;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f364;

    public /* synthetic */ C0855(Object obj, int i, Object obj2) {
        this.f364 = i;
        this.f363 = obj;
        this.f362 = obj2;
    }

    @Override // androidx.compose.runtime.InterfaceC2195
    public final void dispose() {
        int i = this.f364;
        Object obj = this.f362;
        Object obj2 = this.f363;
        switch (i) {
            case 0:
                C8563 c8563 = (C8563) obj2;
                C0859 c0859 = (C0859) obj;
                if (c8563.f21338 != null) {
                    ((C8564) c0859.f577).m13339();
                } else if (c8563.f21337 == null) {
                    C6755.m11870("Unreachable");
                } else {
                    ((C0869) c0859.f576).m625();
                }
                break;
            case 1:
                ((C1161) obj2).f1405.m2615((C1162) obj);
                break;
            case 2:
                ((C1210) obj2).f1594.remove((C1210) obj);
                break;
            case 3:
                C1210 c1210 = (C1210) obj2;
                c1210.getClass();
                C1201 c1201 = (C1201) ((AbstractC2182) ((C1200) obj).f1563).getValue();
                if (c1201 != null) {
                    c1210.f1593.remove(c1201.f1568);
                }
                break;
            case 4:
                ((C1210) obj2).f1593.remove((C1197) obj);
                break;
            case 5:
                C1466 c1466 = (C1466) obj2;
                View view = (View) obj;
                int i2 = c1466.f2092 - 1;
                c1466.f2092 = i2;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = AbstractC3103.f6939;
                    AbstractC3026.m4564(view, null);
                    AbstractC3103.m4802(view, null);
                    view.removeOnAttachStateChangeListener(c1466.f2094);
                }
                break;
            case 6:
                ((C1524) obj2).f2254.m1305(obj);
                break;
            case 7:
                ((View) obj2).getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserverOnGlobalLayoutListenerC2236) obj);
                break;
            default:
                AbstractC5176.m9350((SnapshotStateList) obj2, C6909.f16973);
                AbstractC5176.m9350((SnapshotStateList) obj, C6909.f16974);
                break;
        }
    }
}
