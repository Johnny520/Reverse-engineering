package p001;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p001.C0178d1;

/* JADX INFO: renamed from: ۟.y5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0466y5 extends AbstractC0335o4 implements InterfaceC0222g3<String, Boolean> {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ AlertDialogC0414u5 f1211;

    public C0466y5(AlertDialogC0414u5 alertDialogC0414u5) {
        this.f1211 = alertDialogC0414u5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p001.InterfaceC0222g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final Boolean mo984(String str) throws C0424v2 {
        String str2;
        String strM915;
        File file;
        String strM9152;
        String str3 = str;
        C0237h4.m1090(C0341oa.m915(new byte[]{-66, 81, 10, 2}, new byte[]{-54, 52, 114, 118, 67, -37}), str3);
        boolean z = false;
        z = false;
        if (!new File(str3).isDirectory()) {
            int i = C0330o.f1000;
            C0330o.m1173(0, C0341oa.m915(new byte[]{29, -109, 90, -111, -36, 30, 18, -122, 67, -111, -18, 29, 16, -71, 92, -100, -25, 45}, new byte[]{-11, 29, -19, 116, 83, -120}));
            return Boolean.FALSE;
        }
        AlertDialogC0414u5 alertDialogC0414u5 = this.f1211;
        C0479z5 c0479z5 = AlertDialogC0414u5.f1826;
        alertDialogC0414u5.getClass();
        C0286kb c0286kb = C0178d1.f750;
        File file2 = new File(C0178d1.b.m841().getPath());
        if (file2.exists()) {
            if (str3.charAt(C0432va.m1254(str3)) != File.separatorChar) {
                str2 = str3 + File.separator;
            } else {
                str2 = str3;
            }
            StringBuilder sbM924 = C0372r2.m924(C0341oa.m915(new byte[]{-104, -60, -9, 10, 48, 78, -104, -14, -1, 4, 47, 106}, new byte[]{127, 126, 85, -30, -90, -31}), C0341oa.m915(new byte[]{3, -11, 43, -36, -32, -6}, new byte[]{-22, 112, -90, 59, 93, 84}));
            int i2 = C0330o.f1000;
            String strM9153 = C0341oa.m915(new byte[]{16, -123, 56, 57, -47, -59, 13, -104, 108, 40, -12, 111, -21, 69, 44, 45, 121, 0, -17}, new byte[]{105, -4, 65, 64, -100, -120});
            C0341oa.m915(new byte[]{70, -33, 77, -74, -90, -3}, new byte[]{32, -80, 63, -37, -57, -119});
            String str4 = new SimpleDateFormat(strM9153, Locale.CHINESE).format(new Date());
            C0237h4.m1089(C0341oa.m915(new byte[]{-105, 35, 106, 81, -21, -105, -39, 98, 54, 18, -93}, new byte[]{-15, 76, 24, 60, -118, -29}), str4);
            sbM924.append(str4);
            sbM924.append(C0341oa.m915(new byte[]{-67, -69, -103, 91}, new byte[]{-109, -61, -12, 55, -5, -88}));
            String str5 = str2 + ((Object) sbM924);
            try {
                new File(str5).createNewFile();
                file = new File(str5);
                C0275k0.m1113(file2, file);
            } catch (Exception unused) {
                int i3 = C0330o.f1000;
                strM915 = C0341oa.m915(new byte[]{3, 0, 63, -49, 12, 117, 0, 30, 35, -50, 12, 121, 3, 44, 21, -62, 3, 106, 9, 52, 40, -52, 58, 109, 2, 48, 14, -51, 44, 97, 3, 53, 49, -62, 24, 90, 14, 39, 49}, new byte[]{-26, -120, -92, 42, -73, -49});
            }
            if (file.exists()) {
                C0178d1.b.m841().mo849(C0341oa.m915(new byte[]{-118, 48, -38, -43, -35, -119, -80, 56, -53, -50, -57}, new byte[]{-17, 72, -86, -70, -81, -3}), str3);
                strM915 = C0372r2.m924(C0341oa.m915(new byte[]{100, 112, 125, -84, -76, -73, 104, 90, 76, -82, -114, -93, 103, 87, 81, -84, -71, -110, 110, 99, 91}, new byte[]{-127, -33, -63, 73, 51, 13}), str5).toString();
                C0237h4.m1089(C0341oa.m915(new byte[]{60, -66, -15, 82, -84, -52, 38, -74, -118, 8, -16, -117, 97}, new byte[]{72, -47, -94, 38, -34, -91}), strM915);
                z = true;
                C0330o.m1173(z ? 1 : 0, strM915);
                return Boolean.valueOf(z);
            }
            strM9152 = C0341oa.m915(new byte[]{117, 52, -119, 89, -29, 88, 121, 30, -72, 91, -39, 76, 117, 63, -124, 84, -48, 71}, new byte[]{-112, -101, 53, -68, 100, -30});
        } else {
            int i4 = C0330o.f1000;
            strM9152 = C0341oa.m915(new byte[]{-74, 88, 1, 69, -67, -113, -73, 95, 63, 74, -82, -123, -76, 89, 39, 72, -128, -113, -75, 79, 9, 73, -92, -86}, new byte[]{80, -30, -111, -84, 56, 2});
        }
        C0330o.m1173(0, strM9152);
        return Boolean.valueOf(z);
    }
}
