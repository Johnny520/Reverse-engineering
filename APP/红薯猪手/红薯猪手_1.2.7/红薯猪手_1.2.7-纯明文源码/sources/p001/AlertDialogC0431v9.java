package p001;

import android.content.Context;
import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: ۟.v9 */
/* JADX INFO: loaded from: classes.dex */
public final class AlertDialogC0431v9 extends AbstractAlertDialogC0348p4 {

    /* JADX INFO: renamed from: ۟.v9$a */
    public static final class a extends AbstractC0335o4 implements InterfaceC0222g3<Boolean, C0433vb> {

        /* JADX INFO: renamed from: ۥ */
        public static final a f1158 = new a();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final C0433vb mo984(Boolean bool) {
            C0463y2.f1203 = bool.booleanValue();
            int i = C0330o.f1000;
            C0330o.m1173(1, "免重启立即生效");
            return C0433vb.f1163;
        }
    }

    /* JADX INFO: renamed from: ۟.v9$b */
    public static final class b extends AbstractC0335o4 implements InterfaceC0222g3<Boolean, C0433vb> {

        /* JADX INFO: renamed from: ۥ */
        public static final b f1159 = new b();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final C0433vb mo984(Boolean bool) {
            C0463y2.f1204 = bool.booleanValue();
            int i = C0330o.f1000;
            C0330o.m1173(0, "免重启立即生效");
            return C0433vb.f1163;
        }
    }

    /* JADX INFO: renamed from: ۟.v9$c */
    public static final class c extends AbstractC0335o4 implements InterfaceC0222g3<C0344p0, C0433vb> {
        public c() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final C0433vb mo984(C0344p0 c0344p0) {
            C0344p0 c0344p02 = c0344p0;
            C0237h4.m1090("it", c0344p02);
            AlertDialogC0431v9.m951(AlertDialogC0431v9.this, c0344p02);
            return C0433vb.f1163;
        }
    }

    /* JADX INFO: renamed from: ۟.v9$d */
    public static final class d extends AbstractC0335o4 implements InterfaceC0222g3<C0344p0, C0433vb> {
        public d() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final C0433vb mo984(C0344p0 c0344p0) {
            C0344p0 c0344p02 = c0344p0;
            C0237h4.m1090("it", c0344p02);
            AlertDialogC0431v9.m951(AlertDialogC0431v9.this, c0344p02);
            return C0433vb.f1163;
        }
    }

    /* JADX INFO: renamed from: ۟.v9$e */
    public static final class e extends AbstractC0335o4 implements InterfaceC0222g3<C0344p0, C0433vb> {
        public e() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final C0433vb mo984(C0344p0 c0344p0) {
            C0344p0 c0344p02 = c0344p0;
            C0237h4.m1090("it", c0344p02);
            AlertDialogC0431v9 alertDialogC0431v9 = AlertDialogC0431v9.this;
            new AlertDialogC0151b2(alertDialogC0431v9.f1217, "保留天数", c0344p02.f1735, "例如7天就填入: 7", new C0470y9(c0344p02)).m1281(alertDialogC0431v9.f1889);
            return C0433vb.f1163;
        }
    }

    static {
        "免重启立即生效";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogC0431v9(Context context) {
        super(context, 0);
        C0237h4.m1090("cxt", context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۠ */
    public static final void m951(AlertDialogC0431v9 alertDialogC0431v9, C0344p0 c0344p0) {
        AlertDialogC0151b2 alertDialogC0151b2 = new AlertDialogC0151b2(alertDialogC0431v9.f1217, c0344p0.f1733.toString(), c0344p0.f1735, "参考: papi|蔡徐坤", new C0457x9(c0344p0));
        AbstractAlertDialogC0230gb.m1077(alertDialogC0151b2);
        alertDialogC0151b2.f1487.setText("插入|");
        alertDialogC0151b2.m1082(new C0444w9(alertDialogC0151b2));
        alertDialogC0151b2.m1281(alertDialogC0431v9.f1889);
    }

    @Override // p001.AbstractAlertDialogC0348p4
    /* JADX INFO: renamed from: ۥ۟ۥ */
    public final List<View> mo1074() {
        return C0272jb.m1105(m970());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.AbstractAlertDialogC0348p4
    /* JADX INFO: renamed from: ۥ۟ۧ */
    public final List<C0344p0> mo1075() {
        EnumC0164c1 enumC0164c1 = EnumC0164c1.f1382;
        EnumC0164c1 enumC0164c12 = EnumC0164c1.f1383;
        String str = enumC0164c1.f728;
        EnumC0164c1 enumC0164c13 = EnumC0164c1.f1384;
        return C0272jb.m874(new C0261j0(enumC0164c1, "开启屏蔽", "根据下面的标题和用户名进行屏蔽，作用于：首页发现和附近、搜索、视频流、话题。使用|进行分割，支持正则表达式", a.f1158, (String) null, 16), new C0261j0(enumC0164c12, "是否屏蔽评论", (String) null, b.f1159, str, 4), new C0261j0(EnumC0164c1.f1387, "根据标题屏蔽", enumC0164c1.f728, new c(), 4, 2), new C0261j0(EnumC0164c1.f1386, "根据用户名屏蔽", "用户主页右上角可直接添加屏蔽", enumC0164c1.f728, new d(), 2), new C0261j0(EnumC0164c1.f1381, "过滤评论艾特@", "过滤评论区里面只有艾特@的评论", (InterfaceC0222g3) null, (String) null, 24), new C0261j0(enumC0164c13, "访问用户历史", "本地记录浏览过的用户，查看方式：我的页面-左上角侧边栏-访问历史", (InterfaceC0222g3) null, (String) null, 24), new C0261j0(EnumC0164c1.f1385, "保留天数", "只允许整数，最多30天", enumC0164c13.f728, new e(), 2), new C0261j0(EnumC0164c1.f1372, "加强图片下载", "解除下载限制，增加无水印下载，一键下载全部笔记和评论的 图片/LivePhoto/Gif", (InterfaceC0222g3) null, (String) null, 24), new C0261j0(EnumC0164c1.f1373, "加强视频下载", "解除视频下载限制，增加无水印下载和部分原声下载\n\u000a(长按视频界面上半区)", (InterfaceC0222g3) null, (String) null, 24));
    }

    @Override // p001.AbstractAlertDialogC0348p4
    /* JADX INFO: renamed from: ۥ۟ۨ */
    public final View mo1076() {
        return m1278("高级设置");
    }
}
