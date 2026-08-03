package p001;

/* JADX INFO: renamed from: ۟.w5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0440w5 extends AbstractC0335o4 implements InterfaceC0222g3, InterfaceC0208f3 {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ AlertDialogC0414u5 f1170;

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [۟.u5.d.ۥ۟۟(۟.p0):۟.vb, ۟.u5.h.ۥ۟۟(۟.p0):۟.vb] */
    public /* synthetic */ C0440w5(AlertDialogC0414u5 alertDialogC0414u5) {
        this.f1170 = alertDialogC0414u5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.InterfaceC0208f3
    /* JADX INFO: renamed from: ۥ */
    public Object mo7() {
        AlertDialogC0441w6 alertDialogC0441w6 = new AlertDialogC0441w6(this.f1170.f1217, "提示", "感谢您的善意，暂未开放打赏渠道");
        alertDialogC0441w6.m1083(C0141a6.f678);
        alertDialogC0441w6.show();
        return Boolean.TRUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.InterfaceC0222g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public Object mo984(Object obj) {
        C0336o5 c0336o5 = (C0336o5) obj;
        if ((c0336o5 != null ? c0336o5.f1731 : null) == null) {
            int i = C0330o.f1000;
            C0330o.m1173(0, "检查更新失败");
        } else {
            C0292l3.m1141(new C0427v5(c0336o5, this.f1170));
        }
        return C0433vb.f1163;
    }
}
