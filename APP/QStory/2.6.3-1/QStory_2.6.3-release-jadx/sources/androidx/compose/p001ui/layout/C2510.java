package androidx.compose.p001ui.layout;

import androidx.collection.C1083;
import androidx.collection.C1089;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.node.LayoutNode$LayoutState;
import androidx.compose.p001ui.unit.LayoutDirection;
import androidx.compose.runtime.collection.C2059;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC5176;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p226.AbstractC8765;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2510 implements InterfaceC2550 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ C2496 f5250;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public float f5251;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public float f5252;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public LayoutDirection f5253 = LayoutDirection.Rtl;

    public C2510(C2496 c2496) {
        this.f5250 = c2496;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2534
    public final LayoutDirection getLayoutDirection() {
        return this.f5253;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2550
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public final List mo3654(Object obj, InterfaceC7383 interfaceC7383) {
        C2496 c2496 = this.f5250;
        c2496.m3627();
        C2583 c2583 = c2496.f5219;
        LayoutNode$LayoutState layoutNode$LayoutState = c2583.f5477.f5504;
        LayoutNode$LayoutState layoutNode$LayoutState2 = LayoutNode$LayoutState.Measuring;
        if (layoutNode$LayoutState != layoutNode$LayoutState2 && layoutNode$LayoutState != LayoutNode$LayoutState.LayingOut && layoutNode$LayoutState != LayoutNode$LayoutState.LookaheadMeasuring && layoutNode$LayoutState != LayoutNode$LayoutState.LookaheadLayingOut) {
            AbstractC8765.m13982("subcompose can only be used inside the measure or layout blocks");
        }
        C1083 c1083 = c2496.f5216;
        Object objM1317 = c1083.m1317(obj);
        if (objM1317 == null) {
            objM1317 = (C2583) c2496.f5209.m1318(obj);
            if (objM1317 != null) {
                if (c2496.f5204 <= 0) {
                    AbstractC8765.m13982("Check failed.");
                }
                c2496.f5204--;
            } else {
                objM1317 = c2496.m3625(obj);
                if (objM1317 == null) {
                    int i = c2496.f5212;
                    C2583 c25832 = new C2583(2);
                    c2583.f5459 = true;
                    c2583.m3797(i, c25832);
                    c2583.f5459 = false;
                    objM1317 = c25832;
                }
            }
            c1083.m1315(obj, objM1317);
        }
        C2583 c25833 = (C2583) objM1317;
        if (AbstractC5176.m9377(c2496.f5212, c2583.m3821()) != c25833) {
            int iM2614 = ((C2059) ((C1089) c2583.m3821()).f1239).m2614(c25833);
            if (iM2614 < c2496.f5212) {
                AbstractC8765.m13984("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i2 = c2496.f5212;
            if (i2 != iM2614) {
                c2496.m3632(iM2614, i2);
            }
        }
        c2496.f5212++;
        c2496.m3626(c25833, obj, false, interfaceC7383);
        return (layoutNode$LayoutState == layoutNode$LayoutState2 || layoutNode$LayoutState == LayoutNode$LayoutState.LayingOut) ? c25833.m3818() : c25833.m3826();
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1816() {
        return this.f5251;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2488
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public final InterfaceC2492 mo2056(int i, int i2, Map map, InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            AbstractC8765.m13982("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C2511(i, i2, map, interfaceC7387, this, this.f5250, interfaceC73872);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1817() {
        return this.f5252;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2534
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public final boolean mo2057() {
        LayoutNode$LayoutState layoutNode$LayoutState = this.f5250.f5219.f5477.f5504;
        return layoutNode$LayoutState == LayoutNode$LayoutState.LookaheadLayingOut || layoutNode$LayoutState == LayoutNode$LayoutState.LookaheadMeasuring;
    }
}
