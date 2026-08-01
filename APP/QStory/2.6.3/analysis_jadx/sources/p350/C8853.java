package p350;

import androidx.activity.AbstractC0053;
import java.util.List;
import kotlin.jvm.internal.AbstractC4395;
import lin.xposed.hook.view.main.itemview.info.DirectoryUiInfo;
import p009.AbstractC6183;
import p287.AbstractC8405;
import top.suzhelan.qstory.ui.viewmodel.SettingPageTransitionDirection;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪世兰子.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8853 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final SettingPageTransitionDirection f24961;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f24962;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f24963;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f24964;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final DirectoryUiInfo f24965;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f24966;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final List f24967;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final String f24968;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final List f24969;

    public C8853(String str, DirectoryUiInfo directoryUiInfo, int i, int i2, boolean z, SettingPageTransitionDirection settingPageTransitionDirection, String str2, List list, List list2) {
        AbstractC8405.m13972(3065);
        AbstractC8405.m13972(3235);
        settingPageTransitionDirection.getClass();
        AbstractC8405.m13972(3236);
        AbstractC8405.m13972(3237);
        list.getClass();
        AbstractC8405.m13972(3238);
        list2.getClass();
        this.f24966 = str;
        this.f24965 = directoryUiInfo;
        this.f24964 = i;
        this.f24963 = i2;
        this.f24962 = z;
        this.f24961 = settingPageTransitionDirection;
        this.f24968 = str2;
        this.f24967 = list;
        this.f24969 = list2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C8853 m14520(C8853 c8853, DirectoryUiInfo directoryUiInfo, int i, int i2, boolean z, SettingPageTransitionDirection settingPageTransitionDirection, String str, List list, List list2, int i3) {
        DirectoryUiInfo directoryUiInfo2 = directoryUiInfo;
        String str2 = c8853.f24966;
        if ((i3 & 2) != 0) {
            directoryUiInfo2 = c8853.f24965;
        }
        if ((i3 & 4) != 0) {
            i = c8853.f24964;
        }
        if ((i3 & 8) != 0) {
            i2 = c8853.f24963;
        }
        if ((i3 & 16) != 0) {
            z = c8853.f24962;
        }
        if ((i3 & 32) != 0) {
            settingPageTransitionDirection = c8853.f24961;
        }
        if ((i3 & 64) != 0) {
            str = c8853.f24968;
        }
        if ((i3 & 128) != 0) {
            list = c8853.f24967;
        }
        if ((i3 & 256) != 0) {
            list2 = c8853.f24969;
        }
        List list3 = list2;
        c8853.getClass();
        AbstractC8405.m13972(3065);
        str2.getClass();
        AbstractC8405.m13972(3235);
        settingPageTransitionDirection.getClass();
        AbstractC8405.m13972(3236);
        str.getClass();
        AbstractC8405.m13972(3237);
        list.getClass();
        AbstractC8405.m13972(3238);
        list3.getClass();
        List list4 = list;
        String str3 = str;
        SettingPageTransitionDirection settingPageTransitionDirection2 = settingPageTransitionDirection;
        boolean z2 = z;
        int i4 = i2;
        return new C8853(str2, directoryUiInfo2, i, i4, z2, settingPageTransitionDirection2, str3, list4, list3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8853)) {
            return false;
        }
        C8853 c8853 = (C8853) obj;
        return AbstractC4395.m8907(this.f24966, c8853.f24966) && AbstractC4395.m8907(this.f24965, c8853.f24965) && this.f24964 == c8853.f24964 && this.f24963 == c8853.f24963 && this.f24962 == c8853.f24962 && this.f24961 == c8853.f24961 && AbstractC4395.m8907(this.f24968, c8853.f24968) && AbstractC4395.m8907(this.f24967, c8853.f24967) && AbstractC4395.m8907(this.f24969, c8853.f24969);
    }

    public final int hashCode() {
        int iHashCode = this.f24966.hashCode() * 31;
        DirectoryUiInfo directoryUiInfo = this.f24965;
        return this.f24969.hashCode() + AbstractC0053.m160(this.f24967, AbstractC6183.m11572((this.f24961.hashCode() + AbstractC0053.m141(AbstractC0053.m144(this.f24963, AbstractC0053.m144(this.f24964, (iHashCode + (directoryUiInfo == null ? 0 : directoryUiInfo.hashCode())) * 31, 31), 31), 31, this.f24962)) * 31, 31, this.f24968), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC8405.m13972(3240));
        AbstractC6183.m11579(sb, this.f24966, 3241);
        sb.append(this.f24965);
        sb.append(AbstractC8405.m13972(3242));
        AbstractC6183.m11578(sb, this.f24964, 3243);
        AbstractC6183.m11578(sb, this.f24963, 3244);
        sb.append(this.f24962);
        sb.append(AbstractC8405.m13972(3245));
        sb.append(this.f24961);
        sb.append(AbstractC8405.m13972(3246));
        AbstractC6183.m11579(sb, this.f24968, 3247);
        sb.append(this.f24967);
        sb.append(AbstractC8405.m13972(3248));
        sb.append(this.f24969);
        sb.append(')');
        return sb.toString();
    }
}
