package p001;

import java.io.File;

/* JADX INFO: renamed from: ۟.x5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0453x5 extends AbstractC0335o4 implements InterfaceC0222g3<String, Boolean> {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ AlertDialogC0414u5 f1188;

    public C0453x5(AlertDialogC0414u5 alertDialogC0414u5) {
        this.f1188 = alertDialogC0414u5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p001.InterfaceC0222g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final Boolean mo984(String str) throws C0424v2 {
        String strM915;
        String str2 = str;
        C0237h4.m1090("text", str2);
        if (!C0406ta.m1244(str2, ".xml")) {
            int i = C0330o.f1000;
            strM915 = "请填入文件的完整路径";
        } else {
            if (new File(str2).exists()) {
                AlertDialogC0414u5.m947(this.f1188, str2);
                return Boolean.TRUE;
            }
            int i2 = C0330o.f1000;
            strM915 = "获取文件失败";
        }
        C0330o.m1173(0, strM915);
        return Boolean.FALSE;
    }
}
