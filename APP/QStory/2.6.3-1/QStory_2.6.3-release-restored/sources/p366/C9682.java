package p366;

import androidx.activity.AbstractC0900;
import java.util.List;
import kotlin.jvm.internal.AbstractC5227;
import lin.xposed.hook.view.main.itemview.info.DirectoryUiInfo;
import p025.AbstractC7012;
import top.suzhelan.qstory.p015ui.viewmodel.SettingPageTransitionDirection;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪世兰子.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9682 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final SettingPageTransitionDirection f25306;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f25307;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f25308;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f25309;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final DirectoryUiInfo f25310;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f25311;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final List f25312;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final String f25313;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final List f25314;

    public C9682(String str, DirectoryUiInfo directoryUiInfo, int i, int i2, boolean z, SettingPageTransitionDirection settingPageTransitionDirection, String str2, List list, List list2) {
        "versionText";
        "transitionDirection";
        settingPageTransitionDirection.getClass();
        "searchKeyword";
        "searchHistory";
        list.getClass();
        "searchResults";
        list2.getClass();
        this.f25311 = str;
        this.f25310 = directoryUiInfo;
        this.f25309 = i;
        this.f25308 = i2;
        this.f25307 = z;
        this.f25306 = settingPageTransitionDirection;
        this.f25313 = str2;
        this.f25312 = list;
        this.f25314 = list2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C9682 m15079(C9682 c9682, DirectoryUiInfo directoryUiInfo, int i, int i2, boolean z, SettingPageTransitionDirection settingPageTransitionDirection, String str, List list, List list2, int i3) {
        DirectoryUiInfo directoryUiInfo2 = directoryUiInfo;
        String str2 = c9682.f25311;
        if ((i3 & 2) != 0) {
            directoryUiInfo2 = c9682.f25310;
        }
        if ((i3 & 4) != 0) {
            i = c9682.f25309;
        }
        if ((i3 & 8) != 0) {
            i2 = c9682.f25308;
        }
        if ((i3 & 16) != 0) {
            z = c9682.f25307;
        }
        if ((i3 & 32) != 0) {
            settingPageTransitionDirection = c9682.f25306;
        }
        if ((i3 & 64) != 0) {
            str = c9682.f25313;
        }
        if ((i3 & 128) != 0) {
            list = c9682.f25312;
        }
        if ((i3 & 256) != 0) {
            list2 = c9682.f25314;
        }
        List list3 = list2;
        c9682.getClass();
        "versionText";
        str2.getClass();
        "transitionDirection";
        settingPageTransitionDirection.getClass();
        "searchKeyword";
        str.getClass();
        "searchHistory";
        list.getClass();
        "searchResults";
        list3.getClass();
        List list4 = list;
        String str3 = str;
        SettingPageTransitionDirection settingPageTransitionDirection2 = settingPageTransitionDirection;
        boolean z2 = z;
        int i4 = i2;
        return new C9682(str2, directoryUiInfo2, i, i4, z2, settingPageTransitionDirection2, str3, list4, list3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9682)) {
            return false;
        }
        C9682 c9682 = (C9682) obj;
        return AbstractC5227.m9466(this.f25311, c9682.f25311) && AbstractC5227.m9466(this.f25310, c9682.f25310) && this.f25309 == c9682.f25309 && this.f25308 == c9682.f25308 && this.f25307 == c9682.f25307 && this.f25306 == c9682.f25306 && AbstractC5227.m9466(this.f25313, c9682.f25313) && AbstractC5227.m9466(this.f25312, c9682.f25312) && AbstractC5227.m9466(this.f25314, c9682.f25314);
    }

    public final int hashCode() {
        int iHashCode = this.f25311.hashCode() * 31;
        DirectoryUiInfo directoryUiInfo = this.f25310;
        return this.f25314.hashCode() + AbstractC0900.m720(this.f25312, AbstractC7012.m12131((this.f25306.hashCode() + AbstractC0900.m701(AbstractC0900.m704(this.f25308, AbstractC0900.m704(this.f25309, (iHashCode + (directoryUiInfo == null ? 0 : directoryUiInfo.hashCode())) * 31, 31), 31), 31, this.f25307)) * 31, 31, this.f25313), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SettingUiState(versionText=");
        AbstractC7012.m12138(sb, this.f25311, 3241);
        sb.append(this.f25310);
        sb.append(", pendingHighlightIndex=");
        AbstractC7012.m12137(sb, this.f25309, 3243);
        AbstractC7012.m12137(sb, this.f25308, 3244);
        sb.append(this.f25307);
        sb.append(", transitionDirection=");
        sb.append(this.f25306);
        sb.append(", searchKeyword=");
        AbstractC7012.m12138(sb, this.f25313, 3247);
        sb.append(this.f25312);
        sb.append(", searchResults=");
        sb.append(this.f25314);
        sb.append(')');
        return sb.toString();
    }
}
