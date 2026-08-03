package com.abc.internal.probe;

import java.util.List;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0182m;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: b0.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class FeatureProbeCatalog {

    /* JADX INFO: renamed from: a */
    public static final List f1658a = AbstractC0182m.m556h0("设置入口", "隐藏首页分隔线", "折叠顶栏", "底栏图标", "悬浮底栏", "圆角头像", "首页头像入口", "主题壁纸", "防撤回", "聊天增强", "删除清引用", "修改消息", "输入统计", "朋友圈防删", "朋友圈评论防撤回", "朋友圈广告", "资料页 ID", "实名尾字", "群员头衔", "禁用热更新", "虚拟定位", "PC 自动登录", "地图选点");

    /* JADX INFO: renamed from: b */
    public static final List f1659b = AbstractC0182m.m556h0(new C0556f("SettingsEntry", "设置入口", new C0555e(0)), new C0556f("HideHomeDivider", "隐藏首页分隔线", new C0555e(2)), new C0556f("FoldBannerPin", "折叠顶栏", new C0555e(7)), new C0556f("BottomTabIcon", "底栏图标", new C0555e(8)), new C0556f("BottomTabFloating", "悬浮底栏", new C0555e(9)), new C0556f("RoundAvatar", "圆角头像", new C0555e(10)), new C0556f("HomeAvatar", "首页头像入口", new C0555e(12)), new C0556f("ThemeWallpaper", "主题壁纸", new C0555e(13)), new C0556f("AntiRevoke", "防撤回", new C0555e(14)), new C0556f("ChatEnhance", "聊天增强", new C0555e(15)), new C0556f("QuoteDeleteClear", "删除清引用", new C0555e(11)), new C0556f("EditMessage", "修改消息", new C0555e(16)), new C0556f("InputStats", "输入统计", new C0555e(17)), new C0556f("AntiMomentsDelete", "朋友圈防删", new C0555e(18)), new C0556f("AntiMomentsComment", "朋友圈评论防撤回", new C0555e(19)), new C0556f("MomentsAdBlock", "朋友圈广告", new C0555e(20)), new C0556f("ProfileId", "资料页 ID", new C0555e(21)), new C0556f("RealNameTail", "实名尾字", new C0555e(22)), new C0556f("MemberTitle", "群员头衔", new C0555e(23)), new C0556f("DisableHotUpdate", "禁用热更新", new C0555e(1)), new C0556f("VirtualLocation", "虚拟定位", new C0555e(3)), new C0556f("AutoLoginWin", "PC 自动登录", new C0555e(4)), new C0556f("MapPickBridge", "地图选点", new C0555e(5)), new C0556f("DownloadRedirect", "下载重定向", new C0555e(6)));

    /* JADX INFO: renamed from: a */
    public static String m1371a(C0556f c0556f, int i2) {
        AbstractC0307g.m703e(c0556f, "probe");
        String str = (String) AbstractC0181l.m545q0(f1658a, i2);
        return str == null ? AbstractC0324d.m720c("功能", i2 + 1) : str;
    }
}
