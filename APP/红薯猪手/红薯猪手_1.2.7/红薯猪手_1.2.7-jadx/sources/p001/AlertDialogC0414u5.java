package p001;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import p001.C0178d1;
import p001.C0235h2;

/* JADX INFO: renamed from: ۟.u5 */
/* JADX INFO: loaded from: classes.dex */
public final class AlertDialogC0414u5 extends AbstractAlertDialogC0348p4 {

    /* JADX INFO: renamed from: ۥ۠ۥ, reason: contains not printable characters */
    public static C0479z5 f1826;

    /* JADX INFO: renamed from: ۟.u5$a */
    public static final class a {
        /* JADX INFO: renamed from: ۥ */
        public static C0479z5 m948() {
            return AlertDialogC0414u5.f1826;
        }
    }

    /* JADX INFO: renamed from: ۟.u5$b */
    public static final class b extends AbstractC0335o4 implements InterfaceC0222g3<C0344p0, C0433vb> {
        public b() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final C0433vb mo984(C0344p0 c0344p0) {
            C0237h4.m1090(C0341oa.m915(new byte[]{-37, -120}, new byte[]{-78, -4, -67, -10, -117, 77}), c0344p0);
            try {
                Context context = AlertDialogC0414u5.this.f1217;
                int i = C0330o.f1000;
                context.startActivity(C0330o.m1164(C0341oa.m915(new byte[]{-13, -93, -107, 113, -1, 25, -2, -85, -111, 49, -87, 8, -8, -65}, new byte[]{-112, -52, -8, 95, -121, 112})));
            } catch (Exception unused) {
                int i2 = C0330o.f1000;
                C0330o.m1173(0, C0341oa.m915(new byte[]{88, -7, -125, 87, -9, 33, 91, -54, -124, 85, -33, 9, 86, -33, -74, 84, -56, 36, 91, -44, -95, 90, -1, 4, 81, -52, -100, 90, -28, 22, 88, -7, -101, 87, -63, 9, 88, -7, -125, 87, -9, 33}, new byte[]{-66, 112, 16, -78, 75, -95}));
            }
            return C0433vb.f1163;
        }
    }

    /* JADX INFO: renamed from: ۟.u5$c */
    public static final class c extends AbstractC0335o4 implements InterfaceC0222g3<C0344p0, C0433vb> {

        /* JADX INFO: renamed from: ۥ */
        public static final c f1127 = new c();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final C0433vb mo984(C0344p0 c0344p0) {
            C0237h4.m1090(C0341oa.m915(new byte[]{-17, 109}, new byte[]{-122, 25, 34, 21, 83, -116}), c0344p0);
            int i = C0330o.f1000;
            C0332o1 c0332o1 = AlertDialogC0308m5.f1696;
            String str = c0332o1 != null ? c0332o1.f1723 : null;
            C0237h4.m865(str);
            C0330o.m1167(str);
            return C0433vb.f1163;
        }
    }

    /* JADX INFO: renamed from: ۟.u5$d */
    public static final class d extends AbstractC0335o4 implements InterfaceC0222g3<C0344p0, C0433vb> {
        public d() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final C0433vb mo984(C0344p0 c0344p0) {
            C0237h4.m1090(C0341oa.m915(new byte[]{113, -112}, new byte[]{24, -28, 15, -121, 97, -43}), c0344p0);
            AlertDialogC0414u5 alertDialogC0414u5 = AlertDialogC0414u5.this;
            alertDialogC0414u5.getClass();
            C0446wb c0446wb = AlertDialogC0308m5.f1697;
            if (c0446wb != null) {
                alertDialogC0414u5.m1250(c0446wb);
            } else {
                C0235h2.a aVar = C0235h2.f823;
                C0440w5 c0440w5 = new C0440w5(alertDialogC0414u5);
                aVar.getClass();
                C0235h2.a.m861(c0440w5);
            }
            return C0433vb.f1163;
        }
    }

    /* JADX INFO: renamed from: ۟.u5$e */
    public static final class e extends AbstractC0335o4 implements InterfaceC0222g3<Boolean, C0433vb> {

        /* JADX INFO: renamed from: ۥ */
        public static final e f1129 = new e();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final C0433vb mo984(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            C0338o7 c0338o7 = C0338o7.f1010;
            C0338o7.m1181(C0341oa.m915(new byte[]{-31, 6, -122, -85, 29, -12, -53, 2, -117, -70}, new byte[]{-108, 118, -30, -54, 105, -111}), Boolean.valueOf(zBooleanValue));
            return C0433vb.f1163;
        }
    }

    /* JADX INFO: renamed from: ۟.u5$f */
    public static final class f extends AbstractC0335o4 implements InterfaceC0222g3<C0344p0, C0433vb> {

        /* JADX INFO: renamed from: ۥ */
        public static final f f1130 = new f();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final C0433vb mo984(C0344p0 c0344p0) {
            C0237h4.m1090(C0341oa.m915(new byte[]{9, 87}, new byte[]{96, 35, -69, -33, 72, 73}), c0344p0);
            int i = C0330o.f1000;
            String strM915 = C0341oa.m915(new byte[]{46, 9, -75, 106, -121, 74, 52, 14, -71, 42, -112, 15, 63, 3, -68, 38, -101, 78, 38, 14, -67, 40, -124, 68, 63}, new byte[]{77, 102, -40, 68, -12, 33});
            String strM9152 = C0341oa.m915(new byte[]{118, 35, -85, -11, 44, -105, 108, 36, -89, -75, 59, -46, 103, 41, -94, -71, 48, -109, 126, 36, -93, -73, 47, -103, 103, 98, -117, -70, 54, -110, 84, 47, -78, -78, 41, -107, 97, 53}, new byte[]{21, 76, -58, -37, 95, -4});
            C0341oa.m915(new byte[]{8, 93, -3, -128, 43}, new byte[]{105, 45, -115, -23, 79, 109});
            C0341oa.m915(new byte[]{-96, 34, -30, -44, -128, 113, -92}, new byte[]{-63, 65, -106, -102, -31, 28});
            try {
                Activity activityM893 = C0292l3.m893();
                Intent intent = new Intent();
                intent.setFlags(268435456);
                intent.setComponent(new ComponentName(strM915, strM9152));
                activityM893.startActivity(intent);
            } catch (Exception unused) {
                C0330o.m1173(0, C0341oa.m915(new byte[]{76, 107, 3, 62, -88, 105, 79, 70, 33, 51, -96, 76}, new byte[]{-86, -30, -112, -37, 20, -23}));
            }
            return C0433vb.f1163;
        }
    }

    /* JADX INFO: renamed from: ۟.u5$g */
    public static final class g extends AbstractC0335o4 implements InterfaceC0222g3<C0344p0, C0433vb> {

        /* JADX INFO: renamed from: ۥ */
        public static final g f1131 = new g();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final C0433vb mo984(C0344p0 c0344p0) {
            C0237h4.m1090(C0341oa.m915(new byte[]{-103, -116}, new byte[]{-16, -8, 39, -32, -111, 125}), c0344p0);
            int i = C0330o.f1000;
            C0330o.m1170(C0341oa.m915(new byte[]{-16, -107, -115, 24, -125, -71, -73, -50, -115, 70, -99, -26, -73, -54, -101, 38, -109, -42, -41, -120, -107, 58, -81, -43, -38, -120, -73, 18, -67, -78}, new byte[]{-104, -31, -7, 104, -16, -125}));
            C0330o.m1173(0, C0341oa.m915(new byte[]{70, 22, 82, -32, -55, 15, 69, 18, 114, -32, -59, 9, -41, -4, 8, -121, -7, 97, 12, 44, 6, -112, -11, 96, 62, 57}, new byte[]{-93, -101, -31, 5, 121, -119}));
            return C0433vb.f1163;
        }
    }

    /* JADX INFO: renamed from: ۟.u5$h */
    public static final class h extends AbstractC0335o4 implements InterfaceC0222g3<C0344p0, C0433vb> {
        public h() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final C0433vb mo984(C0344p0 c0344p0) {
            C0237h4.m1090(C0341oa.m915(new byte[]{-95, -106}, new byte[]{-56, -30, 63, 82, -28, -21}), c0344p0);
            AlertDialogC0414u5 alertDialogC0414u5 = AlertDialogC0414u5.this;
            AlertDialogC0441w6 alertDialogC0441w6 = new AlertDialogC0441w6(alertDialogC0414u5.f1217, C0341oa.m915(new byte[]{-54, -77, -7, 122, 51, -117}, new byte[]{44, 60, 105, -99, -105, 49}), C0341oa.m915(new byte[]{-8, -59, -1, 46, 85, -125, -8, -43, -49, 32, 105, -96, -15, -3, -20, 32, 125, -114, -5, -47, -58, 33, 68, -113, -10, -17, -60, 32, 114, -127, -5, -38, -2, 32, 111, -124, -8, -56, -13, 46, 80, -82, -6, -4, -4, 46, 101, -92, -15, -3, -1}, new byte[]{30, 65, 96, -58, -27, 33}));
            alertDialogC0441w6.m1083(new C0440w5(alertDialogC0414u5));
            alertDialogC0441w6.show();
            return C0433vb.f1163;
        }
    }

    /* JADX INFO: renamed from: ۟.u5$i */
    public static final class i extends AbstractC0335o4 implements InterfaceC0222g3<C0344p0, C0433vb> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ C0365q8<String> f1133;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ AlertDialogC0414u5 f1134;

        public i(C0365q8<String> c0365q8, AlertDialogC0414u5 alertDialogC0414u5) {
            this.f1133 = c0365q8;
            this.f1134 = alertDialogC0414u5;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final C0433vb mo984(C0344p0 c0344p0) {
            C0237h4.m1090(C0341oa.m915(new byte[]{28, 24}, new byte[]{117, 108, 66, -101, -57, -60}), c0344p0);
            C0286kb c0286kb = C0178d1.f750;
            File file = new File(C0178d1.b.m841().mo849(C0341oa.m915(new byte[]{-109, -84, -39, -79, -9, -79, -87, -92, -56, -86, -19}, new byte[]{-10, -44, -87, -34, -123, -59}), ((Object) this.f1133.f1047) + "/Download"));
            String absolutePath = "";
            if (file.isDirectory()) {
                long jLastModified = 0;
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    for (File file2 : fileArrListFiles) {
                        String name = file2.getName();
                        C0237h4.m1089(C0341oa.m915(new byte[]{59, 17, 14, -97, 79, -54, 57, 92, 84, -1, 0, -114}, new byte[]{92, 116, 122, -47, 46, -89}), name);
                        if (C0432va.m1253(name, C0341oa.m915(new byte[]{102, 27, 122, 62, 41, 2, 102, 45, 114, 48, 54, 38}, new byte[]{-127, -95, -40, -42, -65, -83})) && file2.lastModified() > jLastModified) {
                            absolutePath = file2.getAbsolutePath();
                            C0237h4.m1089(C0341oa.m915(new byte[]{71, -102, -117, 47, -43, 43, 79, -109, -118, 26, -46, 8, 65, -117, -105, 70, -103, 118, 14, -42}, new byte[]{32, -1, -1, 110, -73, 88}), absolutePath);
                            jLastModified = file2.lastModified();
                        }
                    }
                }
            }
            new AlertDialogC0151b2(this.f1134.f1217, C0341oa.m915(new byte[]{-110, 83, 5, -92, 6, 91}, new byte[]{119, -4, -71, 65, -125, -2}), absolutePath, C0341oa.m915(new byte[]{-17, -102, 53, 91, -62, 42, -32, -119, 63, 88, -60, 50, -31, -123, 60, 89, -47, 8, -32, -118, 12, 84, -56, 43, -29, -95, 60}, new byte[]{6, 31, -72, -68, 127, -124}), new C0453x5(this.f1134)).show();
            return C0433vb.f1163;
        }
    }

    /* JADX INFO: renamed from: ۟.u5$j */
    public static final class j extends AbstractC0335o4 implements InterfaceC0222g3<C0344p0, C0433vb> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ C0365q8<String> f1135;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ AlertDialogC0414u5 f1136;

        public j(C0365q8<String> c0365q8, AlertDialogC0414u5 alertDialogC0414u5) {
            this.f1135 = c0365q8;
            this.f1136 = alertDialogC0414u5;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final C0433vb mo984(C0344p0 c0344p0) {
            C0237h4.m1090(C0341oa.m915(new byte[]{-60, -107}, new byte[]{-83, -31, -100, 111, -97, -97}), c0344p0);
            C0286kb c0286kb = C0178d1.f750;
            new AlertDialogC0151b2(this.f1136.f1217, C0341oa.m915(new byte[]{110, -99, 93, 126, 12, -53}, new byte[]{-117, 50, -31, -101, -117, 113}), C0178d1.b.m841().mo849(C0341oa.m915(new byte[]{56, 115, 2, -93, -57, 11, 2, 123, 19, -72, -35}, new byte[]{93, 11, 114, -52, -75, 127}), ((Object) this.f1135.f1047) + "/Download"), C0341oa.m915(new byte[]{-7, 118, 109, 37, 53, 116, -12, 92, 127, 42, 16, 73, -9, 121, 93, 42, 16, 73, -12, 100, 79, 42, 17, 99, -7, 110, 117, 40, 53, 99}, new byte[]{17, -39, -38, -51, -117, -25}), new C0466y5(this.f1136)).show();
            return C0433vb.f1163;
        }
    }

    /* JADX INFO: renamed from: ۟.u5$k */
    public static final class k extends AbstractC0335o4 implements InterfaceC0208f3<Boolean> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ C0446wb f1137;

        public k(C0446wb c0446wb) {
            this.f1137 = c0446wb;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0208f3
        /* JADX INFO: renamed from: ۥ */
        public final Boolean mo7() {
            int i = C0330o.f1000;
            C0330o.m910(this.f1137.f1859);
            C0330o.m1173(1, this.f1137.f1860);
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogC0414u5(Context context) {
        super(context, 0);
        C0237h4.m1090(C0341oa.m915(new byte[]{119, -76, 8}, new byte[]{20, -52, 124, -90, -43, 79}), context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۠ */
    public static final void m947(AlertDialogC0414u5 alertDialogC0414u5, String str) throws C0424v2 {
        alertDialogC0414u5.getClass();
        C0286kb c0286kb = C0178d1.f750;
        String path = C0178d1.b.m841().getPath();
        try {
            File file = new File(str);
            File file2 = new File(path);
            C0275k0.m1113(file, file2);
            if (file2.exists()) {
                int i2 = C0330o.f1000;
                C0330o.m1173(1, C0341oa.m915(new byte[]{34, -57, 33, -119, -67, -15, 46, -19, 16, -117, -123, -6, 33, -32, 13, -119, -78, -53, 40, -44, 17, -123, -65, -39, 34, -8, 50, -117, -84, -53, 33, -3, 21}, new byte[]{-57, 104, -99, 108, 56, 84}));
            } else {
                int i3 = C0330o.f1000;
                C0330o.m1173(0, C0341oa.m915(new byte[]{-25, -10, 55, -2, 52, -28, -21, -36, 6, -4, 12, -17, -25, -3, 58, -13, 5, -28}, new byte[]{2, 89, -117, 27, -79, 65}));
            }
        } catch (FileNotFoundException unused) {
            int i4 = C0330o.f1000;
            C0330o.m1173(0, C0341oa.m915(new byte[]{51, 81, -41, -105, -110, 25, 61, 73, -25, -106, -90, 57, 62, 99, -30, -105, -91, 55, 52, 99, -20, -102, -78, 56, 61, 86, -21, -105, -105, 39, 50, 95, -23, -108, -106, 38, 61, 73, -25, -106, -90, 57}, new byte[]{-37, -33, 96, 114, 29, -113}));
            Intent intent = new Intent(C0341oa.m915(new byte[]{28, 68, 16, 21, -47, 79, 25, 4, 29, 9, -54, 67, 19, 94, 90, 6, -35, 82, 20, 69, 26, 73, -7, 99, 41, 117, 55, 40, -16, 114, 56, 100, 32}, new byte[]{125, 42, 116, 103, -66, 38}));
            intent.setType(C0341oa.m915(new byte[]{-7, -105, 118, -109, 75, -51, -32, -98}, new byte[]{-115, -14, 14, -25, 100, -75}));
            intent.addCategory(C0341oa.m915(new byte[]{29, -17, 117, 89, 98, 39, 24, -81, 120, 69, 121, 43, 18, -11, 63, 72, 108, 58, 25, -26, 126, 89, 116, 96, 51, -47, 84, 101, 76, 12, 48, -60}, new byte[]{124, -127, 17, 43, 13, 78}));
            C0292l3.m893().startActivityForResult(intent, 666);
            f1826 = new C0479z5(alertDialogC0414u5);
        }
    }

    @Override // p001.AbstractAlertDialogC0348p4
    /* JADX INFO: renamed from: ۥ۟ۥ */
    public final List<View> mo1074() {
        return C0272jb.m1105(m970());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:7:0x001d */
    /* JADX DEBUG: Type inference failed for r5v0. Raw type applied. Possible types: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e8  */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33, types: [T] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v36 */
    @Override // p001.AbstractAlertDialogC0348p4
    /* JADX INFO: renamed from: ۥ۟ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<C0344p0> mo1075() {
        boolean z;
        boolean z2;
        String str;
        ArrayList arrayList = new ArrayList();
        C0365q8 c0365q8 = new C0365q8();
        CharSequence charSequenceM1175 = "";
        c0365q8.f1047 = "";
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            ?? absolutePath = externalStorageDirectory != null ? externalStorageDirectory.getAbsolutePath() : 0;
            if (absolutePath == 0) {
                absolutePath = "";
            }
            c0365q8.f1047 = absolutePath;
        } catch (Exception unused) {
        }
        if (C0406ta.m1245((CharSequence) c0365q8.f1047)) {
            int i2 = C0330o.f1000;
            arrayList.add(new C0261j0(C0330o.m1174(C0341oa.m915(new byte[]{32, 19, -95, -24, 61, 10, 35, 12, -104, -21, 35, 43, 32, 60, -125, -25, 56, 19, 41, 29, -116, -24, 54, 35, 32, 18, -107, -21, 14, 63, 35, 36, -91, -21, 14, 63, 35, 38, -70, -25, 36, 14, 33, 28, -82, -31, 29, 15, 33, 35, -71, -21, 38, 56, 35, 47, -69, -21, 29, 3, 35, 49, -81}, new byte[]{-58, -95, 0, 14, -95, -125}), C0341oa.m915(new byte[]{-53, -67, 54}, new byte[]{-71, -40, 82, 43, -75, 75})), null, new b(), 6));
        }
        C0446wb c0446wb = AlertDialogC0308m5.f1697;
        if (c0446wb != null) {
            C0286kb c0286kb = C0178d1.f750;
            z = c0446wb.m959(C0178d1.b.m841().mo1059(C0341oa.m915(new byte[]{6, 73}, new byte[]{116, 57, 110, -88, -89, 32}), false));
        }
        if (z) {
            int i3 = C0330o.f1000;
            String strM915 = C0341oa.m915(new byte[]{53, -6, -4, -79, -119, -127, 52, -29, -15, -79, -78, -107, -24}, new byte[]{-46, 120, 69, 87, 36, 37});
            C0446wb c0446wb2 = AlertDialogC0308m5.f1697;
            String string = C0372r2.m924(strM915, c0446wb2 != null ? c0446wb2.f1857 : null).toString();
            C0237h4.m1089(C0341oa.m915(new byte[]{-3, -92, 14, -103, 25, 76, -25, -84, 117, -61, 69, 11, -96}, new byte[]{-119, -53, 93, -19, 107, 37}), string);
            charSequenceM1175 = C0330o.m1175(C0330o.m1174(string, C0341oa.m915(new byte[]{-20, 104, 53, 49, 126}, new byte[]{-117, 26, 80, 84, 16, -21})));
        }
        C0332o1 c0332o1 = AlertDialogC0308m5.f1696;
        if (c0332o1 == null || (str = c0332o1.f1723) == null) {
            z2 = false;
        } else {
            if (str.length() > 0) {
                z2 = true;
            }
        }
        if (z2) {
            arrayList.add(new C0261j0(C0341oa.m915(new byte[]{123, -70, -23, -61, 55, 15, -61, 114, -98, -101, 4, -111, -49, 87, -114, -101, 7, -103, 3}, new byte[]{42, -21, 14, 125, -109, 39}), null, c.f1127, 6));
        }
        C0338o7 c0338o7 = C0338o7.f1010;
        arrayList.addAll(C0272jb.m1106(new C0261j0(C0341oa.m915(new byte[]{82, -112, 66, 79, 65, 88, 82, -88, 118, 79, 72, 77}, new byte[]{-76, 51, -62, -87, -34, -3}), charSequenceM1175, new d(), 4), new C0344p0(null, null, C0341oa.m915(new byte[]{19, 45, 57, 49, -89, 69, 16, 10, 52, 48, -101, 98, 19, 57, 29, 48, -107, 79}, new byte[]{-11, -74, -115, -41, 49, -11}), C0341oa.m915(new byte[]{60, -4, -80, -33, -50, -95, 60, -23, -115, -45, -23, -118, 61, -63, -114, -45, -33, -127, 60, -59, -70, -47, -13, -101, 63, -10, -109, -47, -3, -74, 63, -47, -94, -45, -60, -101, 63, -30, -73, -48, -49, -68, -89}, new byte[]{-39, 121, 3, 54, 89, 12}), null, null, null, Boolean.valueOf(C0338o7.m913(C0341oa.m915(new byte[]{-65, -117, -68, 67, 47, -86, -107, -113, -79, 82}, new byte[]{-54, -5, -40, 34, 91, -49}), true)), e.f1129, null, false, 7411), new C0261j0(C0341oa.m915(new byte[]{-8, -124, 63, -32, 15, -57, 95, 92, -18, -31, 42, -21, -7, -71, 18, -20, 15, -14}, new byte[]{30, 44, -98, 5, -110, 80}), null, f.f1130, 6), new C0261j0(C0341oa.m915(new byte[]{-124, 63, -19, -127, 120, -23, 53, -36, -115, -40, 72, 105, -7}, new byte[]{-48, 120, 10, 63, -36, -63}), null, g.f1131, 6), new C0261j0(C0341oa.m915(new byte[]{-104, 53, 104, -30, -119, 55}, new byte[]{126, -68, -5, 10, 60, -72}), null, new h(), 6), new C0261j0(C0341oa.m915(new byte[]{91, -36, 51, 31, 35, -28, 87, -10, 2, 29, 27, -17}, new byte[]{-66, 115, -113, -6, -90, 65}), null, new i(c0365q8, this), 6), new C0261j0(C0341oa.m915(new byte[]{53, -61, -14, -67, -110, 111, 57, -23, -61, -65, -88, 123}, new byte[]{-48, 108, 78, 88, 21, -43}), null, new j(c0365q8, this), 6)));
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.AbstractAlertDialogC0348p4
    /* JADX INFO: renamed from: ۥ۟ۨ */
    public final View mo1076() {
        TextView textViewM1279 = m1279(AbstractAlertDialogC0471ya.f1882);
        textViewM1279.setText(C0341oa.m915(new byte[]{-8, -39, -125, 29, -14, 79, -10, -33, -100, 31, -46, 118}, new byte[]{30, 113, 34, -8, 111, -40}));
        return textViewM1279;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۠۟, reason: contains not printable characters */
    public final void m1250(C0446wb c0446wb) {
        C0286kb c0286kb = C0178d1.f750;
        if (!c0446wb.m959(C0178d1.b.m841().mo1059(C0341oa.m915(new byte[]{-63, 35}, new byte[]{-77, 83, -88, 31, -42, 12}), false))) {
            int i2 = C0330o.f1000;
            C0330o.m1173(0, C0341oa.m915(new byte[]{54, -88, -128, 88, -72, 49, 54, -94, -95, 91, -87, 19, 53, -119, -109, 91, -89, 12, 52, -100, -101, 91, -83, 16}, new byte[]{-45, 21, 19, -67, 49, -68}));
            return;
        }
        Context context = this.f1217;
        StringBuilder sbM924 = C0372r2.m924(C0341oa.m915(new byte[]{49, -71, -122, 31, -73, -10, 49, -68, -92, 31, -94, -47, 48, -82, -104, 31, -88, -51}, new byte[]{-42, 53, 44, -7, 62, 125}), c0446wb.f1857);
        sbM924.append(C0341oa.m915(new byte[]{37}, new byte[]{13, 6, -12, -31, 74, -69}));
        sbM924.append(c0446wb.f1858);
        sbM924.append(C0341oa.m915(new byte[]{96}, new byte[]{73, 86, -17, -61, -36, -1}));
        String string = sbM924.toString();
        C0237h4.m1089(C0341oa.m915(new byte[]{8, 62, -74, 17, -98, 107, 18, 54, -51, 75, -62, 44, 85}, new byte[]{124, 81, -27, 101, -20, 2}), string);
        int i3 = C0330o.f1000;
        AlertDialogC0441w6 alertDialogC0441w6 = new AlertDialogC0441w6(context, string, C0330o.m1175(c0446wb.f1862));
        alertDialogC0441w6.m1083(new k(c0446wb));
        if (c0446wb.f1181) {
            alertDialogC0441w6.setCancelable(false);
            alertDialogC0441w6.m858();
        }
        alertDialogC0441w6.show();
    }
}
