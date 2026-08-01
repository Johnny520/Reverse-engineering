package p354;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
import java.util.List;
import kotlin.jvm.internal.AbstractC4394;
import lin.xposed.hook.view.main.itemview.info.DirectoryUiInfo;
import p007.AbstractC6136;
import top.suzhelan.qstory.ui.viewmodel.SettingPageTransitionDirection;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪兰子世.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8885 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final SettingPageTransitionDirection f25037;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f25038;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f25039;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f25040;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final DirectoryUiInfo f25041;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f25042;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final List f25043;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final String f25044;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final List f25045;

    public C8885(String str, DirectoryUiInfo directoryUiInfo, int i, int i2, boolean z, SettingPageTransitionDirection settingPageTransitionDirection, String str2, List list, List list2) {
        AbstractC3056.m6668(-3937318119442482599L);
        AbstractC3056.m6668(-3937343515584103847L);
        settingPageTransitionDirection.getClass();
        AbstractC3056.m6668(-3937343498404234663L);
        AbstractC3056.m6668(-3937343386735084967L);
        list.getClass();
        AbstractC3056.m6668(-3937343309425673639L);
        list2.getClass();
        this.f25042 = str;
        this.f25041 = directoryUiInfo;
        this.f25040 = i;
        this.f25039 = i2;
        this.f25038 = z;
        this.f25037 = settingPageTransitionDirection;
        this.f25044 = str2;
        this.f25043 = list;
        this.f25045 = list2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C8885 m14524(C8885 c8885, DirectoryUiInfo directoryUiInfo, int i, int i2, boolean z, SettingPageTransitionDirection settingPageTransitionDirection, String str, List list, List list2, int i3) {
        DirectoryUiInfo directoryUiInfo2 = directoryUiInfo;
        String str2 = c8885.f25042;
        if ((i3 & 2) != 0) {
            directoryUiInfo2 = c8885.f25041;
        }
        if ((i3 & 4) != 0) {
            i = c8885.f25040;
        }
        if ((i3 & 8) != 0) {
            i2 = c8885.f25039;
        }
        if ((i3 & 16) != 0) {
            z = c8885.f25038;
        }
        if ((i3 & 32) != 0) {
            settingPageTransitionDirection = c8885.f25037;
        }
        if ((i3 & 64) != 0) {
            str = c8885.f25044;
        }
        if ((i3 & 128) != 0) {
            list = c8885.f25043;
        }
        if ((i3 & 256) != 0) {
            list2 = c8885.f25045;
        }
        List list3 = list2;
        c8885.getClass();
        AbstractC3056.m6668(-3937318119442482599L);
        str2.getClass();
        AbstractC3056.m6668(-3937343515584103847L);
        settingPageTransitionDirection.getClass();
        AbstractC3056.m6668(-3937343498404234663L);
        str.getClass();
        AbstractC3056.m6668(-3937343386735084967L);
        list.getClass();
        AbstractC3056.m6668(-3937343309425673639L);
        list3.getClass();
        List list4 = list;
        String str3 = str;
        SettingPageTransitionDirection settingPageTransitionDirection2 = settingPageTransitionDirection;
        boolean z2 = z;
        int i4 = i2;
        return new C8885(str2, directoryUiInfo2, i, i4, z2, settingPageTransitionDirection2, str3, list4, list3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8885)) {
            return false;
        }
        C8885 c8885 = (C8885) obj;
        return AbstractC4394.m8917(this.f25042, c8885.f25042) && AbstractC4394.m8917(this.f25041, c8885.f25041) && this.f25040 == c8885.f25040 && this.f25039 == c8885.f25039 && this.f25038 == c8885.f25038 && this.f25037 == c8885.f25037 && AbstractC4394.m8917(this.f25044, c8885.f25044) && AbstractC4394.m8917(this.f25043, c8885.f25043) && AbstractC4394.m8917(this.f25045, c8885.f25045);
    }

    public final int hashCode() {
        int iHashCode = this.f25042.hashCode() * 31;
        DirectoryUiInfo directoryUiInfo = this.f25041;
        return this.f25045.hashCode() + AbstractC0053.m159(this.f25043, AbstractC6136.m11539((this.f25037.hashCode() + AbstractC0053.m140(AbstractC0053.m143(this.f25039, AbstractC0053.m143(this.f25040, (iHashCode + (directoryUiInfo == null ? 0 : directoryUiInfo.hashCode())) * 31, 31), 31), 31, this.f25038)) * 31, 31, this.f25044), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC3056.m6668(-3937343223526327719L));
        AbstractC6136.m11531(sb, this.f25042, -3937343034547766695L);
        sb.append(this.f25041);
        sb.append(AbstractC3056.m6668(-3937343017367897511L));
        AbstractC6136.m11533(sb, this.f25040, -3937342849864172967L);
        AbstractC6136.m11533(sb, this.f25039, -3937342755374892455L);
        sb.append(this.f25038);
        sb.append(AbstractC3056.m6668(-3937342738195023271L));
        sb.append(this.f25037);
        sb.append(AbstractC3056.m6668(-3937342665180579239L));
        AbstractC6136.m11531(sb, this.f25044, -3937342497676854695L);
        sb.append(this.f25043);
        sb.append(AbstractC3056.m6668(-3937342433252345255L));
        sb.append(this.f25045);
        sb.append(')');
        return sb.toString();
    }
}
