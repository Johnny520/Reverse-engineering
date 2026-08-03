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
            C0237h4.m1090(C0341oa.m915(new byte[]{52, 3}, new byte[]{93, 119, -95, 91, 104, -118}), c0344p02);
            AlertDialogC0243ha alertDialogC0243ha = AlertDialogC0243ha.this;
            alertDialogC0243ha.getClass();
            AlertDialogC0168c5 alertDialogC0168c5 = new AlertDialogC0168c5(alertDialogC0243ha.f1217, C0341oa.m915(new byte[]{90, -68, 11, 45, 26, -102, 86, -126, 40, 44, 9, -115, 85, -122, 15}, new byte[]{-78, 59, -95, -56, -76, 0}), c0344p02.f1735, new C0257ia(c0344p02));
            alertDialogC0168c5.f1887 = false;
            alertDialogC0168c5.show();
            return C0433vb.f1163;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogC0243ha(Context context) {
        super(context, 0);
        C0237h4.m1090(C0341oa.m915(new byte[]{36, 29, -79}, new byte[]{71, 101, -59, 97, -89, 79}), context);
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
        return C0272jb.m874(new C0261j0(EnumC0164c1.f1379, C0341oa.m915(new byte[]{44, -77, 103, -86, 125, 99, 47, -94, 79, -89, 65, 85}, new byte[]{-55, 23, -64, 79, -26, -35}), C0341oa.m915(new byte[]{87, 87, 117, 55, 22, -110, 86, 109, 103, 55, 36, -107, 84, 103, 71, 52, 40, -81, 87, 85, 125, 52, 62, -124, 85, 91, 65, 52, 42, -107, 86, 105, 99, 55, 49, -124, 87, 118, 97, 55, 16, -75, 90, 117, 78}, new byte[]{-78, -46, -58, -47, -91, 58}), (InterfaceC0222g3) null, (String) null, 24), new C0261j0(enumC0164c1, C0341oa.m915(new byte[]{-94, -73, -46, 96, -65, 21, -82, -119, -15, 108, -73, 25, -93, -111, -51, 97, -84, 2, -83, -115, -42}, new byte[]{74, 48, 120, -123, 17, -113}), C0341oa.m915(new byte[]{107, 110, 44, -39, 111, -7, 107, 105, 62, -41, 93, -57, 102, 114, 5, -41, 90, -25, 102, 80, 24, 106, -102, 51, 104, 73, 52, -38, 70, -36, 104, 110, 30, -47, 71, -35, 102, 78, 46, -42, 84, -43, 103, 125, 10, -37, 85, -53, 107, 110, 61}, new byte[]{-113, -45, -80, 62, -5, 81}), a.f844, (String) null, 16), new C0344p0(null, enumC0164c12.f728, C0341oa.m915(new byte[]{-45, -54, -64, -115, 93, 32, -33, -39, -13, -115, 93, 32}, new byte[]{55, 119, 77, 106, -32, -114}), null, C0192e1.m847(enumC0164c12), enumC0164c1.f728, new b(), null, null, null, false, 8009), new C0261j0(EnumC0164c1.f1370, C0341oa.m915(new byte[]{-128, 106, -115, -90, -89, -56, -127, 109, -99, -87, -117, -54}, new byte[]{101, -43, 38, 64, 42, 127}), C0341oa.m915(new byte[]{-79, -94, 57, 1, -103, -9, -79, -122, 18, 0, -84, -25, -77, -68, 40, 3, -98, -35, -77, -86, 57, 0, -111, -47, -77, -92, 21, 3, -67, -46, -79, -67, 30, 0, -111, -16, -68, -66, 20, 3, -119, -21, -79, -109, 6, 3, -106, -55, -80, -123, 52, 1, -126, -46, -78, -80, 52, 14, -90, -3, -79, -69, 52, 1, -115, -50, -78, -74, 38, 2, -95, -35, -67, -97, 36}, new byte[]{84, 62, -111, -26, 25, 102}), (InterfaceC0222g3) null, (String) null, 24), new C0261j0(EnumC0164c1.f1374, C0341oa.m915(new byte[]{79, -126, -93, 52, 6, -35, 67, -77, -111, 55, 2, -30, 65, -69, -120, 58, 36, -28}, new byte[]{-90, 23, 28, -46, -118, 84}), (String) null, (InterfaceC0222g3) null, (String) null, 28), new C0261j0(EnumC0164c1.f1375, C0341oa.m915(new byte[]{-90, -50, 10, 3, 91, -81, -89, -39, 8, 13, 76, -86, -88, -21, 51}, new byte[]{64, 69, -125, -22, -32, 62}), C0341oa.m915(new byte[]{-35, 26, -31, 26, 42, -127, -45, 46, -13, 25, 14, -79, -36, 3, -37, 27, 63, -66, -38, 4, -58, 27, 60, -89, -48, 55, -27, 27, 62, -99, -46, 36, -63, -85, -28, -33, -81, 60, -82, 71, 62, -47, -108, 13, -83, 83, 17, -48, -101, 8}, new byte[]{53, -72, 74, -1, -123, 56}), (InterfaceC0222g3) null, (String) null, 24), new C0261j0(EnumC0164c1.f1376, C0341oa.m915(new byte[]{-118, 23, 16, 28, 34, -32, -122, 14, 51, 18, 28, -40}, new byte[]{98, -74, -72, -6, -95, 101}), C0341oa.m915(new byte[]{114, -83, 117, -30, -116, 73, 125, -128, 72, -17, -98, 115, -70, -57, 77, -115, -43, 109, 60, -56, 86, -125, -40, 104, 61, -55, 79, -126, -43, 89, 27, -64, 112, -117, -43, 70, 58, -53, 119, -94, -41, 75, 44, -54, 75, -68, -42, 75, 57, -55, 121, -87, -42, 69, 28, -58, 94, -87, 23, 46, 25, -123, -21, -30, -99, 94, 125, -112, 87, -17, -111, 69, 113, -105, 71, -17, -115, 116}, new byte[]{-107, 47, -52, 7, 48, -55}), (InterfaceC0222g3) null, (String) null, 24));
    }

    @Override // p001.AbstractAlertDialogC0348p4
    /* JADX INFO: renamed from: ۥ۟ۨ */
    public final View mo1076() {
        return m1278(C0341oa.m915(new byte[]{-118, -16, -38, 78, -102, -125, -121, -44, -60, 76, -101, -105}, new byte[]{111, 122, 122, -85, 38, 57}));
    }
}
