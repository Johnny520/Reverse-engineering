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
    public static final List f1658a = null;

    /* JADX INFO: renamed from: b */
    public static final List f1659b = null;

    static {
        f1658a = AbstractC0182m.m556h0(new String[]{"设置入口", "隐藏首页分隔线", "折叠顶栏", "底栏图标", "悬浮底栏", "圆角头像", "首页头像入口", "主题壁纸", "防撤回", "聊天增强", "删除清引用", "修改消息", "输入统计", "朋友圈防删", "朋友圈评论防撤回", "朋友圈广告", "资料页 ID", "实名尾字", "群员头衔", "禁用热更新", "虚拟定位", "PC 自动登录", "地图选点"});
        C0555e r02 = new C0555e(0);
        C0556f r2 = new C0556f("SettingsEntry", "设置入口", r02);
        C0555e r03 = new C0555e(2);
        C0556f r3 = new C0556f("HideHomeDivider", "隐藏首页分隔线", r03);
        C0555e r04 = new C0555e(7);
        C0556f r4 = new C0556f("FoldBannerPin", "折叠顶栏", r04);
        C0555e r05 = new C0555e(8);
        C0556f r5 = new C0556f("BottomTabIcon", "底栏图标", r05);
        C0555e r06 = new C0555e(9);
        C0556f r6 = new C0556f("BottomTabFloating", "悬浮底栏", r06);
        C0555e r07 = new C0555e(10);
        C0556f r7 = new C0556f("RoundAvatar", "圆角头像", r07);
        C0555e r08 = new C0555e(12);
        C0556f r8 = new C0556f("HomeAvatar", "首页头像入口", r08);
        C0555e r09 = new C0555e(13);
        C0556f r9 = new C0556f("ThemeWallpaper", "主题壁纸", r09);
        C0555e r010 = new C0555e(14);
        C0556f r10 = new C0556f("AntiRevoke", "防撤回", r010);
        C0555e r011 = new C0555e(15);
        C0556f r11 = new C0556f("ChatEnhance", "聊天增强", r011);
        C0555e r012 = new C0555e(11);
        C0556f r12 = new C0556f("QuoteDeleteClear", "删除清引用", r012);
        C0555e r013 = new C0555e(16);
        C0556f r13 = new C0556f("EditMessage", "修改消息", r013);
        C0555e r014 = new C0555e(17);
        C0556f r14 = new C0556f("InputStats", "输入统计", r014);
        C0555e r015 = new C0555e(18);
        C0556f r15 = new C0556f("AntiMomentsDelete", "朋友圈防删", r015);
        String r142 = "AntiMomentsComment";
        String r152 = "朋友圈评论防撤回";
        C0556f r1 = new C0556f(r142, r152, new C0555e(19));
        C0555e r016 = new C0555e(20);
        C0556f r153 = new C0556f("MomentsAdBlock", "朋友圈广告", r016);
        String r143 = "ProfileId";
        String r154 = "资料页 ID";
        C0556f r16 = new C0556f(r143, r154, new C0555e(21));
        C0555e r017 = new C0555e(22);
        C0556f r155 = new C0556f("RealNameTail", "实名尾字", r017);
        String r144 = "MemberTitle";
        String r156 = "群员头衔";
        C0556f r17 = new C0556f(r144, r156, new C0555e(23));
        C0555e r018 = new C0555e(1);
        C0556f r157 = new C0556f("DisableHotUpdate", "禁用热更新", r018);
        String r145 = "VirtualLocation";
        String r158 = "虚拟定位";
        C0556f r18 = new C0556f(r145, r158, new C0555e(3));
        C0555e r019 = new C0555e(4);
        C0556f r159 = new C0556f("AutoLoginWin", "PC 自动登录", r019);
        String r146 = "MapPickBridge";
        String r1510 = "地图选点";
        C0556f r19 = new C0556f(r146, r1510, new C0555e(5));
        C0555e r020 = new C0555e(6);
        f1659b = AbstractC0182m.m556h0(new C0556f[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r1, r153, r16, r155, r17, r157, r18, r159, r19, new C0556f("DownloadRedirect", "下载重定向", r020)});
    }

    /* JADX INFO: renamed from: a */
    public static String m1371a(C0556f r1, int r2) {
        AbstractC0307g.m703e(r1, "probe");
        String r12 = (String) AbstractC0181l.m545q0(f1658a, r2);
        if (r12 == null) goto L5;
        return r12;
    L5:
        return AbstractC0324d.m720c("功能", r2 + 1);
    }
}
