package p001;

import android.content.Context;
import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: ۟.g7 */
/* JADX INFO: loaded from: classes.dex */
public final class AlertDialogC0226g7 extends AbstractAlertDialogC0348p4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogC0226g7(Context context) {
        super(context, 0);
        C0237h4.m1090("cxt", context);
    }

    @Override // p001.AbstractAlertDialogC0348p4
    /* JADX INFO: renamed from: ۥ۟ۥ */
    public final List<View> mo1074() {
        return C0272jb.m1105(m970());
    }

    @Override // p001.AbstractAlertDialogC0348p4
    /* JADX INFO: renamed from: ۥ۟ۧ */
    public final List<C0344p0> mo1075() {
        return C0272jb.m874(new C0261j0(EnumC0164c1.f1371, "瞬间下载", "长按瞬间界面的中间区域，即可下载", (InterfaceC0222g3) null, (String) null, 24), new C0261j0(EnumC0164c1.f1377, "头像和背景图下载", "在预览界面右上角增加下载按钮", (InterfaceC0222g3) null, (String) null, 24), new C0261j0(EnumC0164c1.f1389, "禁止截图分享", (String) null, (InterfaceC0222g3) null, (String) null, 28), new C0261j0(EnumC0164c1.f1378, "阻止弹窗更新", (String) null, (InterfaceC0222g3) null, (String) null, 28), new C0261j0(EnumC0164c1.f1391, "分享链接脱敏", "去除分享链接的个人信息，防止被追踪到", (InterfaceC0222g3) null, (String) null, 24), new C0261j0(EnumC0164c1.f1388, "默认关闭礼物特效", (String) null, (InterfaceC0222g3) null, (String) null, 28));
    }

    @Override // p001.AbstractAlertDialogC0348p4
    /* JADX INFO: renamed from: ۥ۟ۨ */
    public final View mo1076() {
        return m1278("其它设置");
    }
}
