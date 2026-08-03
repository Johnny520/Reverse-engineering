package p000a;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Toast;
import p000a.C0186K3;

/* JADX INFO: renamed from: a.da */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0537da implements InterfaceC0819s7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1932a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0803ra f1933b;

    public /* synthetic */ C0537da(C0803ra c0803ra, int i) {
        this.f1932a = i;
        this.f1933b = c0803ra;
    }

    @Override // p000a.InterfaceC0819s7
    /* JADX INFO: renamed from: a */
    public final Object mo31a() throws Throwable {
        switch (this.f1932a) {
            case 0:
                C0186K3.f638a.getClass();
                C0186K3.a.m508i();
                final C0803ra c0803ra = this.f1933b;
                final int i = 5;
                final int i2 = 7;
                final int i3 = 8;
                final int i4 = 9;
                final int i5 = 10;
                final int i6 = 0;
                final int i7 = 1;
                final int i8 = 2;
                final int i9 = 3;
                final int i10 = 4;
                final int i11 = 6;
                break;
            case 1:
                this.f1933b.m1869f();
                break;
            case 2:
                C0803ra c0803ra2 = this.f1933b;
                c0803ra2.getClass();
                AlertDialog alertDialogCreate = new AlertDialog.Builder(c0803ra2.f3168a).setTitle("隐藏朋友圈教程").setMessage("1. 开启「隐藏我的朋友圈」\n2. 进入自己朋友圈相册\n3. 长按任意朋友圈顶部「详情」2秒\n4. 点击「加入隐藏」或「复制」snsId").setPositiveButton("知道了", (DialogInterface.OnClickListener) null).create();
                if (alertDialogCreate != null) {
                    alertDialogCreate.show();
                    c0803ra2.m1876o(alertDialogCreate);
                }
                break;
            case 3:
                this.f1933b.m1868e();
                break;
            case 4:
                this.f1933b.m1874m();
                break;
            case 5:
                C0803ra c0803ra3 = this.f1933b;
                AlertDialog alertDialogCreate2 = new AlertDialog.Builder(c0803ra3.f3168a).setTitle("确认清零").setMessage("清零热更新拦截统计数据？").setPositiveButton("确认", new DialogInterfaceOnClickListenerC0765pa(c0803ra3, 3)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create();
                if (alertDialogCreate2 != null) {
                    alertDialogCreate2.show();
                    c0803ra3.m1876o(alertDialogCreate2);
                }
                break;
            case 6:
                C0803ra c0803ra4 = this.f1933b;
                c0803ra4.getClass();
                ClassLoader classLoader = C0889w1.f3479g;
                if (classLoader == null) {
                    C0908x1.m2197e("[SimulateHotUpdate] ClassLoader not ready");
                    Toast.makeText(c0803ra4.f3168a, "ClassLoader 未就绪", 0).show();
                } else {
                    new Thread(new RunnableC0273P0(c0803ra4, 10, classLoader)).start();
                }
                break;
            case 7:
                C0803ra c0803ra5 = this.f1933b;
                AlertDialog alertDialogCreate3 = new AlertDialog.Builder(c0803ra5.f3168a).setTitle("确认清空").setMessage("将清空全部开关选项、配置名单、已隐藏朋友圈、拦截记录与解析缓存，随后重启微信。\n\n注意：仅重启主进程，微信后台进程可能残留旧配置，建议重启后手动结束微信全部后台进程或重启手机。").setPositiveButton("确认清空并重启", new DialogInterfaceOnClickListenerC0765pa(c0803ra5, 5)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create();
                if (alertDialogCreate3 != null) {
                    alertDialogCreate3.show();
                    c0803ra5.m1876o(alertDialogCreate3);
                }
                break;
            case 8:
                C0803ra c0803ra6 = this.f1933b;
                c0803ra6.getClass();
                AlertDialog alertDialogCreate4 = new AlertDialog.Builder(c0803ra6.f3168a).setTitle("重启微信").setMessage("将关闭并重新启动微信。").setPositiveButton("立即重启", new DialogInterfaceOnClickListenerC0765pa(c0803ra6, 4)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create();
                if (alertDialogCreate4 != null) {
                    alertDialogCreate4.show();
                    c0803ra6.m1876o(alertDialogCreate4);
                }
                break;
            default:
                C0698m0 c0698m0 = C0698m0.f2635a;
                Activity activity = this.f1933b.f3168a;
                c0698m0.getClass();
                if (!C0698m0.f2637c) {
                    C0698m0.m1590c(activity);
                }
                break;
        }
        return C0413Wf.f1577a;
    }
}
