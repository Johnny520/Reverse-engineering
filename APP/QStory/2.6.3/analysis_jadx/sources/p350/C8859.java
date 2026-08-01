package p350;

import androidx.lifecycle.AbstractC2425;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.text.AbstractC5144;
import kotlinx.coroutines.flow.AbstractC5322;
import kotlinx.coroutines.flow.C5267;
import kotlinx.coroutines.flow.C5296;
import p009.C6170;
import p036.AbstractC6358;
import p287.AbstractC8405;
import p334.C8788;
import top.suzhelan.qstory.ui.viewmodel.SettingPageTransitionDirection;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪世兰子.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8859 extends AbstractC2425 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5296 f24978;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5267 f24979;

    public C8859() {
        C8788 c8788 = C8788.f24755;
        String str = AbstractC6358.f17509;
        AbstractC8405.m13972(3239);
        str.getClass();
        String strM13973 = AbstractC8405.m13973("喵呜喵喵喵喵喵呜~喵呜喵呜呜喵呜呜~喵呜喵喵呜呜喵喵~喵呜喵喵喵呜呜喵~喵呜喵呜喵呜呜喵");
        c8788.getClass();
        AbstractC8405.m13972(1470);
        AbstractC8405.m13972(1471);
        String str2 = AbstractC8405.m13973("喵喵呜喵喵喵呜喵~喵喵呜喵喵呜喵喵~喵呜喵喵喵喵喵喵") + str + AbstractC8405.m13972(1472) + strM13973;
        SettingPageTransitionDirection settingPageTransitionDirection = SettingPageTransitionDirection.Forward;
        C6170.f16967.getClass();
        C5267 c5267M10332 = AbstractC5322.m10332(new C8853(str2, null, -1, 0, false, settingPageTransitionDirection, "", C6170.m11566(), EmptyList.INSTANCE));
        this.f24979 = c5267M10332;
        this.f24978 = new C5296(c5267M10332, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m14521(String str) {
        List listM11566;
        List listM11563;
        AbstractC8405.m13973("喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜呜~喵喵喵呜呜呜呜呜~喵喵喵喵呜喵呜喵~喵喵喵呜呜呜呜喵~喵喵喵喵喵呜喵呜");
        String string = AbstractC5144.m10155(str).toString();
        while (true) {
            C5267 c5267 = this.f24979;
            Object value = c5267.getValue();
            C8853 c8853 = (C8853) value;
            if (string.length() == 0) {
                C6170.f16967.getClass();
                listM11566 = C6170.m11566();
            } else {
                listM11566 = c8853.f24967;
            }
            List list = listM11566;
            if (string.length() == 0) {
                listM11563 = EmptyList.INSTANCE;
            } else {
                C6170.f16967.getClass();
                listM11563 = C6170.m11563(string);
            }
            String str2 = str;
            if (c5267.m10312(value, C8853.m14520(c8853, null, 0, 0, false, null, str2, list, listM11563, 63))) {
                return;
            } else {
                str = str2;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m14522() {
        Object value;
        C5267 c5267 = this.f24979;
        if (((C8853) c5267.getValue()).f24965 == null) {
            return false;
        }
        do {
            value = c5267.getValue();
        } while (!c5267.m10312(value, C8853.m14520((C8853) value, null, -1, 0, false, SettingPageTransitionDirection.Backward, null, null, null, 473)));
        return true;
    }
}
