package p354;

import androidx.lifecycle.AbstractC2425;
import com.bumptech.glide.AbstractC3056;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.text.AbstractC5143;
import kotlinx.coroutines.flow.AbstractC5321;
import kotlinx.coroutines.flow.C5266;
import kotlinx.coroutines.flow.C5295;
import p007.AbstractC6136;
import p007.C6132;
import p035.AbstractC6340;
import p334.C8803;
import top.suzhelan.qstory.ui.viewmodel.SettingPageTransitionDirection;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪兰子世.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8891 extends AbstractC2425 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5295 f25054;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5266 f25055;

    public C8891() {
        C8803 c8803 = C8803.f24776;
        String str = AbstractC6340.f17462;
        "getQQVersionName(...)";
        str.getClass();
        String strM6668 = "2.6.2";
        c8803.getClass();
        "qqVersion";
        "appVersion";
        StringBuilder sb = new StringBuilder();
        AbstractC6136.m11544(-3937664852152288679L, sb, str);
        String strM11557 = AbstractC6136.m11557(-3937707514062439847L, sb, strM6668);
        SettingPageTransitionDirection settingPageTransitionDirection = SettingPageTransitionDirection.Forward;
        String strM66682 = "";
        C6132.f16715.getClass();
        C5266 c5266M10328 = AbstractC5321.m10328(new C8885(strM11557, null, -1, 0, false, settingPageTransitionDirection, strM66682, C6132.m11528(), EmptyList.INSTANCE));
        this.f25055 = c5266M10328;
        this.f25054 = new C5295(c5266M10328, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m14525(String str) {
        List listM11528;
        List listM11525;
        "keyword";
        String string = AbstractC5143.m10150(str).toString();
        while (true) {
            C5266 c5266 = this.f25055;
            Object value = c5266.getValue();
            C8885 c8885 = (C8885) value;
            if (string.length() == 0) {
                C6132.f16715.getClass();
                listM11528 = C6132.m11528();
            } else {
                listM11528 = c8885.f25043;
            }
            List list = listM11528;
            if (string.length() == 0) {
                listM11525 = EmptyList.INSTANCE;
            } else {
                C6132.f16715.getClass();
                listM11525 = C6132.m11525(string);
            }
            String str2 = str;
            if (c5266.m10308(value, C8885.m14524(c8885, null, 0, 0, false, null, str2, list, listM11525, 63))) {
                return;
            } else {
                str = str2;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m14526() {
        Object value;
        C5266 c5266 = this.f25055;
        if (((C8885) c5266.getValue()).f25041 == null) {
            return false;
        }
        do {
            value = c5266.getValue();
        } while (!c5266.m10308(value, C8885.m14524((C8885) value, null, -1, 0, false, SettingPageTransitionDirection.Backward, null, null, null, 473)));
        return true;
    }
}
