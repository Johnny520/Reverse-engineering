package top.suzhelan.qstory.ui.components;

import androidx.compose.foundation.lazy.C0745;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.InterfaceC1373;
import com.bumptech.glide.AbstractC3056;
import java.util.List;
import kotlin.C5175;
import kotlin.reflect.jvm.internal.C5027;
import p007.C6143;
import p052.InterfaceC6542;
import p052.InterfaceC6551;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: top.suzhelan.qstory.ui.components.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C5968 implements InterfaceC6551 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6557 f16197;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ List f16198;

    public C5968(List list, InterfaceC6557 interfaceC6557) {
        this.f16198 = list;
        this.f16197 = interfaceC6557;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        C0745 c0745 = (C0745) obj;
        int iIntValue = ((Number) obj2).intValue();
        InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        "CN(it)178@8834L22:LazyDsl.kt#428nma";
        if ((iIntValue2 & 6) == 0) {
            i = (((C1324) interfaceC1373).m2350(c0745) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= ((C1324) interfaceC1373).m2352(iIntValue) ? 32 : 16;
        }
        C1324 c1324 = (C1324) interfaceC1373;
        if (c1324.m2333(i & 1, (i & 147) != 146)) {
            C6143 c6143 = (C6143) this.f16198.get(iIntValue);
            c1324.m2382(1642834882);
            "CN(result)*201@8207L28,199@8106L155:SettingSearchDialog.kt#ndgvs9";
            "CC(remember):SettingSearchDialog.kt#9igjgp";
            InterfaceC6557 interfaceC6557 = this.f16197;
            boolean zM2350 = c1324.m2350(interfaceC6557) | c1324.m2368(c6143);
            Object objM2335 = c1324.m2335();
            if (zM2350 || objM2335 == C1369.f3973) {
                objM2335 = new C5027(interfaceC6557, 15, c6143);
                c1324.m2376(objM2335);
            }
            AbstractC5963.m11287(c6143, (InterfaceC6542) objM2335, c1324, 0);
            c1324.m2367(false);
        } else {
            c1324.m2329();
        }
        return C5175.f14739;
    }
}
