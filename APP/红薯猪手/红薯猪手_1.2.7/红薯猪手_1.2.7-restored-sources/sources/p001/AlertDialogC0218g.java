package p001;

import android.content.Context;
import android.view.View;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: ۟.g */
/* JADX INFO: loaded from: classes.dex */
public final class AlertDialogC0218g extends AbstractAlertDialogC0348p4 {

    /* JADX INFO: renamed from: ۟.g$a */
    public static final class a extends AbstractC0335o4 implements InterfaceC0222g3<C0344p0, C0433vb> {
        public a() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final C0433vb mo984(C0344p0 c0344p0) {
            C0344p0 c0344p02 = c0344p0;
            C0237h4.m1090("it", c0344p02);
            AlertDialogC0218g alertDialogC0218g = AlertDialogC0218g.this;
            Set<String> setM1053 = C0192e1.m1053(c0344p02.f1017);
            alertDialogC0218g.getClass();
            new AlertDialogC0177d0(c0344p02, C0272jb.m1107(new C0261j0(C0300lb.f946, "商城", setM1053), new C0261j0(C0300lb.f1689, "发布", setM1053)), AlertDialogC0218g.this.f1217, "勾选需要去除的").m1281(AlertDialogC0218g.this.f1889);
            return C0433vb.f1163;
        }
    }

    /* JADX INFO: renamed from: ۟.g$b */
    public static final class b extends AbstractC0335o4 implements InterfaceC0222g3<C0344p0, C0433vb> {
        public b() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final C0433vb mo984(C0344p0 c0344p0) {
            C0344p0 c0344p02 = c0344p0;
            C0237h4.m1090("it", c0344p02);
            AlertDialogC0218g alertDialogC0218g = AlertDialogC0218g.this;
            Set<String> setM1053 = C0192e1.m1053(c0344p02.f1017);
            alertDialogC0218g.getClass();
            new AlertDialogC0177d0(c0344p02, C0272jb.m1107(new C0261j0(C0475z1.f1221, "发现好友", setM1053), new C0261j0(C0475z1.f1895, "创作中心", setM1053), new C0261j0(C0475z1.f1896, "我的草稿", setM1053), new C0261j0(C0475z1.f1897, "订单", setM1053), new C0261j0(C0475z1.f1898, "购物车", setM1053), new C0261j0(C0475z1.f1899, "钱包", setM1053), new C0261j0(C0475z1.f1900, "社区公约", setM1053), new C0261j0(C0475z1.f1901, "帮助与客服", setM1053), new C0261j0(C0475z1.f1902, "扫一扫", setM1053)), AlertDialogC0218g.this.f1217, "勾选需要去除的").m1281(AlertDialogC0218g.this.f1889);
            return C0433vb.f1163;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogC0218g(Context context) {
        super(context, 0);
        C0237h4.m1090("cxt", context);
    }

    @Override // p001.AbstractAlertDialogC0348p4
    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public final List<View> mo1074() {
        return C0272jb.m1105(m970());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.AbstractAlertDialogC0348p4
    /* JADX INFO: renamed from: ۥ۟ۧ, reason: contains not printable characters */
    public final List<C0344p0> mo1075() {
        EnumC0164c1 enumC0164c1 = EnumC0164c1.f1363;
        EnumC0164c1 enumC0164c12 = EnumC0164c1.f1366;
        return C0272jb.m874(new C0261j0(EnumC0164c1.f1362, "开屏广告", "二次打开后生效", (InterfaceC0222g3) null, (String) null, 24), new C0261j0(EnumC0164c1.f724, "首页底部Tab", (String) null, new a(), 12, 1), new C0261j0(enumC0164c1, "首页瀑布流广告", (String) null, (InterfaceC0222g3) null, (String) null, 28), new C0261j0(EnumC0164c1.f1365, "首页瀑布流商品笔记", (String) null, (InterfaceC0222g3) null, enumC0164c1.f728, 12), new C0261j0(EnumC0164c1.f1364, "首页瀑布流直播笔记", (String) null, (InterfaceC0222g3) null, enumC0164c1.f728, 12), new C0261j0(enumC0164c12, "搜索瀑布流广告", (String) null, (InterfaceC0222g3) null, (String) null, 28), new C0261j0(EnumC0164c1.f1368, "搜索瀑布流商品笔记", (String) null, (InterfaceC0222g3) null, enumC0164c12.f728, 12), new C0261j0(EnumC0164c1.f1367, "搜索瀑布流直播笔记", (String) null, (InterfaceC0222g3) null, enumC0164c12.f728, 12), new C0261j0(EnumC0164c1.f1369, "笔记详情中间评论框", (String) null, (InterfaceC0222g3) null, (String) null, 28), new C0261j0(EnumC0164c1.f1380, "我的笔记顶部推荐", (String) null, (InterfaceC0222g3) null, (String) null, 28), new C0261j0(EnumC0164c1.f725, "我的侧边栏", (String) null, new b(), 12, 1));
    }

    @Override // p001.AbstractAlertDialogC0348p4
    /* JADX INFO: renamed from: ۥ۟ۨ, reason: contains not printable characters */
    public final View mo1076() {
        return m1278("净化设置");
    }
}
