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
        C0237h4.m1090(C0341oa.m915(new byte[]{-16, 0, -91, 106}, new byte[]{-124, 101, -35, 30, -101, -19}), str2);
        if (!C0406ta.m1244(str2, C0341oa.m915(new byte[]{99, -98, 126, 53}, new byte[]{77, -26, 19, 89, 113, 8}))) {
            int i = C0330o.f1000;
            strM915 = C0341oa.m915(new byte[]{-35, 82, 15, 13, 6, -14, -48, 120, 29, 14, 49, -34, -47, 70, 14, 15, 61, -35, -48, 83, 52, 14, 50, -19, -35, 74, 23, 13, 25, -35}, new byte[]{53, -3, -72, -24, -89, 89});
        } else {
            if (new File(str2).exists()) {
                AlertDialogC0414u5.m947(this.f1188, str2);
                return Boolean.TRUE;
            }
            int i2 = C0330o.f1000;
            strM915 = C0341oa.m915(new byte[]{-115, 105, 116, -74, 118, 95, -125, 113, 68, -73, 66, 127, -128, 67, 114, -69, 77, 108}, new byte[]{101, -25, -61, 83, -7, -55});
        }
        C0330o.m1173(0, strM915);
        return Boolean.FALSE;
    }
}
