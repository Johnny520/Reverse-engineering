package p366;

import androidx.lifecycle.AbstractC3258;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.text.AbstractC5976;
import kotlinx.coroutines.flow.AbstractC6154;
import kotlinx.coroutines.flow.C6099;
import kotlinx.coroutines.flow.C6128;
import p025.C6999;
import p052.AbstractC7187;
import p350.C9617;
import top.suzhelan.qstory.p015ui.viewmodel.SettingPageTransitionDirection;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪世兰子.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9688 extends AbstractC3258 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6128 f25323;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6099 f25324;

    public C9688() {
        C9617 c9617 = C9617.f25100;
        String str = AbstractC7187.f17854;
        "getQQVersionName(...)";
        str.getClass();
        String strM14532 = "2.6.3";
        c9617.getClass();
        "qqVersion";
        "appVersion";
        String str2 = "QQ:" + str + " QStory:" + strM14532;
        SettingPageTransitionDirection settingPageTransitionDirection = SettingPageTransitionDirection.Forward;
        C6999.f17312.getClass();
        C6099 c6099M10891 = AbstractC6154.m10891(new C9682(str2, null, -1, 0, false, settingPageTransitionDirection, "", C6999.m12125(), EmptyList.INSTANCE));
        this.f25324 = c6099M10891;
        this.f25323 = new C6128(c6099M10891, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m15080(String str) {
        List listM12125;
        List listM12122;
        "keyword";
        String string = AbstractC5976.m10714(str).toString();
        while (true) {
            C6099 c6099 = this.f25324;
            Object value = c6099.getValue();
            C9682 c9682 = (C9682) value;
            if (string.length() == 0) {
                C6999.f17312.getClass();
                listM12125 = C6999.m12125();
            } else {
                listM12125 = c9682.f25312;
            }
            List list = listM12125;
            if (string.length() == 0) {
                listM12122 = EmptyList.INSTANCE;
            } else {
                C6999.f17312.getClass();
                listM12122 = C6999.m12122(string);
            }
            String str2 = str;
            if (c6099.m10871(value, C9682.m15079(c9682, null, 0, 0, false, null, str2, list, listM12122, 63))) {
                return;
            } else {
                str = str2;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m15081() {
        Object value;
        C6099 c6099 = this.f25324;
        if (((C9682) c6099.getValue()).f25310 == null) {
            return false;
        }
        do {
            value = c6099.getValue();
        } while (!c6099.m10871(value, C9682.m15079((C9682) value, null, -1, 0, false, SettingPageTransitionDirection.Backward, null, null, null, 473)));
        return true;
    }
}
