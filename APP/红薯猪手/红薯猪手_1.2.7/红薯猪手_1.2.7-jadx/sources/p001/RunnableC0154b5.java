package p001;

import android.app.Activity;
import android.widget.EditText;
import android.widget.FrameLayout;
import java.util.List;
import p001.C0235h2;
import p001.C0283k8;
import p001.C0325n8;

/* JADX INFO: renamed from: ۟.b5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0154b5 implements Runnable {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ int f703;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ Object f704;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final /* synthetic */ Object f1334;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final /* synthetic */ Object f1335;

    public /* synthetic */ RunnableC0154b5(Object obj, Object obj2, Object obj3, int i) {
        this.f703 = i;
        this.f704 = obj;
        this.f1334 = obj2;
        this.f1335 = obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        CharSequence charSequenceM1175;
        Integer num;
        String str;
        boolean z = true;
        switch (this.f703) {
            case 0:
                AlertDialogC0168c5 alertDialogC0168c5 = (AlertDialogC0168c5) this.f704;
                String str2 = (String) this.f1334;
                String str3 = (String) this.f1335;
                C0237h4.m1090(C0341oa.m915(new byte[]{3, -54, -49, -67, -64, -78}, new byte[]{119, -94, -90, -50, -28, -126}), alertDialogC0168c5);
                C0237h4.m1090(C0341oa.m915(new byte[]{70, -9, -122, 35}, new byte[]{98, -101, -24, 68, -55, 113}), str2);
                C0237h4.m1090(C0341oa.m915(new byte[]{29, -54, 31, 67}, new byte[]{57, -90, 126, 55, -52, -65}), str3);
                EditText editText = alertDialogC0168c5.f1405;
                if (editText == null) {
                    C0237h4.m1092(C0341oa.m915(new byte[]{-73, -118, 90, 17, 119, 48, -75, -84, 95, 12, 106, 19, -76}, new byte[]{-38, -49, 62, 120, 3, 124}));
                    throw null;
                }
                editText.setText(str2 + "," + str3);
                return;
            case 1:
                AlertDialogC0147ac alertDialogC0147ac = (AlertDialogC0147ac) this.f704;
                C0352p8 c0352p8 = (C0352p8) this.f1334;
                C0352p8 c0352p82 = (C0352p8) this.f1335;
                C0237h4.m1090(C0341oa.m915(new byte[]{0, 99, -117, -4, -86, 104}, new byte[]{116, 11, -30, -113, -114, 88}), alertDialogC0147ac);
                C0237h4.m1090(C0341oa.m915(new byte[]{123, -31, -89, -12, 77, -60, 50}, new byte[]{95, -128, -53, -104, 3, -79}), c0352p8);
                C0237h4.m1090(C0341oa.m915(new byte[]{-25, 95, -118, 16, -88, -103, -82}, new byte[]{-61, 59, -17, 124, -26, -20}), c0352p82);
                int i = AlertDialogC0147ac.f1313;
                List<C0264j3> list = alertDialogC0147ac.m1004().f685;
                C0237h4.m1090("<this>", list);
                for (int size = list.size() - 1; -1 < size; size--) {
                    C0264j3 c0264j3 = alertDialogC0147ac.m1004().f685.get(size);
                    if (c0264j3.f870) {
                        c0352p8.f1028++;
                        C0274k c0274k = C0283k8.f1632;
                        if (C0283k8.a.m884().mo985().mo1282(c0264j3) != -1) {
                            c0352p82.f1028++;
                            alertDialogC0147ac.m1004().f685.remove(size);
                        }
                    }
                }
                C0292l3.m1141(new C0203ec(alertDialogC0147ac, c0352p8, c0352p82));
                return;
            case 2:
                C0336o5 c0336o5 = (C0336o5) this.f704;
                C0235h2 c0235h2 = (C0235h2) this.f1334;
                Activity activity = (Activity) this.f1335;
                C0237h4.m1090(C0341oa.m915(new byte[]{16, -26, 64, 42, -20, -40}, new byte[]{100, -114, 41, 89, -56, -24}), c0235h2);
                C0237h4.m1090(C0341oa.m915(new byte[]{-63, 14, 4, -43, 70, 100, -99, 25}, new byte[]{-27, 109, 107, -69, 50, 1}), activity);
                C0332o1 c0332o1 = AlertDialogC0308m5.f1696;
                AlertDialogC0308m5.f1696 = c0336o5.f1008;
                AlertDialogC0308m5.f1697 = c0336o5.f1731;
                C0345p1 c0345p1 = c0336o5.f1007;
                if (c0345p1 != null ? C0237h4.m864(c0345p1.f1745, Boolean.TRUE) : false) {
                    C0345p1 c0345p12 = c0336o5.f1007;
                    if (c0345p12 == null || (str = c0345p12.f1743) == null) {
                        z = false;
                        if (z) {
                            C0345p1 c0345p13 = c0336o5.f1007;
                            C0237h4.m865(c0345p13);
                            C0249i2 c0249i2 = new C0249i2(activity, c0336o5, c0235h2);
                            C0235h2.a aVar = C0235h2.f823;
                            C0338o7 c0338o7 = C0338o7.f1010;
                            String str4 = C0235h2.f1490;
                            int iM914 = C0338o7.m914(str4);
                            Boolean bool = c0345p13.f1020;
                            Boolean bool2 = Boolean.TRUE;
                            if (!C0237h4.m864(bool, bool2) && (num = c0345p13.f1749) != null && iM914 == num.intValue()) {
                                c0249i2.mo7();
                                return;
                            }
                            String strM915 = c0345p13.f1021;
                            if (strM915 == null) {
                                strM915 = C0341oa.m915(new byte[]{-109, -48, -112, 111, 88, -39}, new byte[]{117, 95, 0, -120, -4, 99});
                            }
                            String str5 = c0345p13.f1743;
                            if (str5 != null) {
                                int i2 = C0330o.f1000;
                                charSequenceM1175 = C0330o.m1175(str5);
                            } else {
                                charSequenceM1175 = "";
                            }
                            AlertDialogC0441w6 alertDialogC0441w6 = new AlertDialogC0441w6(activity, strM915, charSequenceM1175);
                            Integer num2 = c0345p13.f1748;
                            C0272jb.m1109(alertDialogC0441w6, num2 != null ? num2.intValue() : 0);
                            alertDialogC0441w6.m1083(new C0319n2(c0345p13, c0249i2));
                            if (C0237h4.m864(c0345p13.f1746, bool2)) {
                                alertDialogC0441w6.m858();
                                alertDialogC0441w6.setCancelable(false);
                            } else {
                                alertDialogC0441w6.m1081(new C0305m2(c0345p13, c0249i2));
                            }
                            alertDialogC0441w6.show();
                            Integer num3 = c0345p13.f1749;
                            C0237h4.m865(num3);
                            C0338o7.m1181(str4, num3);
                            return;
                        }
                    } else {
                        if (!(str.length() > 0)) {
                        }
                        if (z) {
                        }
                    }
                }
                C0235h2.m1086(c0235h2, activity, c0336o5.f1731);
                return;
            default:
                FrameLayout frameLayout = (FrameLayout) this.f704;
                Activity activity2 = (Activity) this.f1334;
                InterfaceC0208f3 interfaceC0208f3 = (InterfaceC0208f3) this.f1335;
                C0325n8 c0325n8 = C0325n8.f994;
                C0237h4.m1090(C0341oa.m915(new byte[]{50, 104, -53, -14}, new byte[]{22, 9, -88, -122, 34, 32}), activity2);
                C0237h4.m1090(C0341oa.m915(new byte[]{-24, -22, -123, 74, -26, -58, -114, -24, -118, 72}, new byte[]{-52, -119, -23, 35, -123, -83}), interfaceC0208f3);
                frameLayout.addView(new C0430v8(activity2, new C0325n8.a(interfaceC0208f3)));
                return;
        }
    }
}
