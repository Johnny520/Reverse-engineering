package p001;

import android.content.Context;
import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: ۟.ha */
/* JADX INFO: loaded from: classes.dex */
public final class AlertDialogC0243ha extends AbstractAlertDialogC0348p4 {

    /* JADX INFO: renamed from: ۟.ha$a */
    public static final class a extends AbstractC0335o4 implements InterfaceC0222g3<Boolean, C0433vb> {

        /* JADX INFO: renamed from: ۥ */
        public static final a f844 = new a();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final C0433vb mo984(Boolean bool) {
            C0210f5.f782 = bool.booleanValue();
            return C0433vb.f1163;
        }
    }

    /* JADX INFO: renamed from: ۟.ha$b */
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
            AlertDialogC0243ha alertDialogC0243ha = AlertDialogC0243ha.this;
            alertDialogC0243ha.getClass();
            AlertDialogC0168c5 alertDialogC0168c5 = new AlertDialogC0168c5(alertDialogC0243ha.f1217, "自定义位置", c0344p02.f1735, new C0257ia(c0344p02));
            alertDialogC0168c5.f1887 = false;
            alertDialogC0168c5.show();
            return C0433vb.f1163;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogC0243ha(Context context) {
        super(context, 0);
        C0237h4.m1090("cxt", context);
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
        EnumC0164c1 enumC0164c1 = EnumC0164c1.f726;
        EnumC0164c1 enumC0164c12 = EnumC0164c1.f1390;
        return C0272jb.m874(new C0261j0(EnumC0164c1.f1379, "大图浏览", "关注信息流单击图片可以放大浏览", (InterfaceC0222g3) null, (String) null, 24), new C0261j0(enumC0164c1, "自定义首页位置", "作用于首页顶部Tab的位置，非评论定位", a.f844, (String) null, 16), new C0344p0(null, enumC0164c12.f728, "位置设置", null, C0192e1.m847(enumC0164c12), enumC0164c1.f728, new b(), null, null, null, false, 8009), new C0261j0(EnumC0164c1.f1370, "快捷主页", "在瀑布流点击用户的头像或者名字可以直接进入用户主页", (InterfaceC0222g3) null, (String) null, 24), new C0261j0(EnumC0164c1.f1374, "长按复制笔记", (String) null, (InterfaceC0222g3) null, (String) null, 28), new C0261j0(EnumC0164c1.f1375, "拉黑看笔记", "被对方拉黑了，也可以看Ta的主页笔记", (InterfaceC0222g3) null, (String) null, 24), new C0261j0(EnumC0164c1.f1376, "表情下载", "点开评论/聊天的表情后，可以点击悬浮按钮'猪'字进行下载", (InterfaceC0222g3) null, (String) null, 24));
    }

    @Override // p001.AbstractAlertDialogC0348p4
    /* JADX INFO: renamed from: ۥ۟ۨ */
    public final View mo1076() {
        return m1278("加强设置");
    }
}
