package p001;

import java.io.File;

/* JADX INFO: renamed from: ۟.z5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0479z5 extends AbstractC0335o4 implements InterfaceC0222g3<String, C0433vb> {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ AlertDialogC0414u5 f1227;

    public C0479z5(AlertDialogC0414u5 alertDialogC0414u5) {
        this.f1227 = alertDialogC0414u5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p001.InterfaceC0222g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final C0433vb mo984(String str) {
        String str2 = str;
        C0237h4.m1090("testPath", str2);
        if (new File(str2).canWrite()) {
            AlertDialogC0414u5.m947(this.f1227, str2);
        } else {
            int i = C0330o.f1000;
            C0330o.m1173(0, "处理文件失败");
        }
        return C0433vb.f1163;
    }
}
