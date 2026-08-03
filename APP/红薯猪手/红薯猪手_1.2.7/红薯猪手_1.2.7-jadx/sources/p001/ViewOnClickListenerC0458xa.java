package p001;

import android.view.View;
import com.skyhand.redbookhelper.MainActivity;

/* JADX INFO: renamed from: ۟.xa */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0458xa implements View.OnClickListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ int f1195;

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [۟.ib.run():void, ۟.t9.ۥ۟۟(۟.t9, de.robv.android.xposed.XC_MethodHook$MethodHookParam):void, ۟.t9.ۥ۟ۡ(۟.t9, android.widget.LinearLayout):void, ۟.ya.ۥ۟۠(java.lang.String):android.widget.RelativeLayout] */
    public /* synthetic */ ViewOnClickListenerC0458xa(int i) {
        this.f1195 = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1195) {
            case 0:
                int i = C0330o.f1000;
                C0330o.m1171(true);
                break;
            case 1:
                C0286kb c0286kb = MainActivity.f1289;
                int i2 = C0330o.f1000;
                C0330o.m911(C0341oa.m915(new byte[]{-2, -22, -37, 116, 20, 38, -55, 102, 56, -104, -110, -60, 7, 103, 43, -105, -112, -44, 37}, new byte[]{-83, -127, -94, 28, 117, 72}));
                C0330o.m1173(0, C0341oa.m915(new byte[]{15, -67, -105, 122, 126, -63, 1, -95, -120, 122, 126, -34, 3, -82, -73, 122, 116, -59, 15, -100, -105, 122, 116, -28, 1, -119, -108, 121, 109, -62}, new byte[]{-25, 18, 32, -97, -5, 114}));
                break;
            case 2:
                C0286kb c0286kb2 = MainActivity.f1289;
                int i3 = C0330o.f1000;
                C0330o.m911(C0341oa.m915(new byte[]{102, -82, -33, -71, 85, 14, 81, 34, 60, 85, -45, -20, -97, 35, 47, 90, -47, -4, -67}, new byte[]{53, -59, -90, -47, 52, 96}));
                C0330o.m1173(0, C0341oa.m915(new byte[]{-126, -112, 77, -66, 27, -49, -126, -81, 73, -66, 55, -14, -128, -107, 103, -77, 11, -10, -127, -70, 64}, new byte[]{103, 39, -1, 91, -65, 66}));
                break;
            case 3:
                String str = C0211f6.f785;
                if (!(str.length() > 0)) {
                    int i4 = C0330o.f1000;
                    C0330o.m1173(0, C0341oa.m915(new byte[]{76, 83, 122, 126, -88, 46, 67, 81, 103, 125, -82, 51, 78, 87, 96, 125, -100, 54, 78, 86, 93, 112, -122, 35, 66, 125, 65, 113, -78, 27, 77, 81, 117, 124, -103, 31, 76, 118, 106}, new byte[]{-85, -33, -48, -104, 33, -91}));
                } else {
                    String str2 = C0436w1.f1166;
                    C0436w1.m953(C0341oa.m915(new byte[]{-7, -47, -64}, new byte[]{-108, -95, -12, -124, -111, 119}), C0272jb.m1105(str));
                }
                break;
            case 4:
                String str3 = C0436w1.f1166;
                C0436w1.m953(C0341oa.m915(new byte[]{52, 22, -1}, new byte[]{67, 119, -119, 105, -29, 91}), C0272jb.m1105(C0211f6.f1446));
                break;
            case 5:
                String str4 = C0211f6.f785;
                if (!(str4.length() > 0)) {
                    int i5 = C0330o.f1000;
                    C0330o.m1173(0, C0341oa.m915(new byte[]{-41, -66, -28, -64, 43, 99, -40, -68, -7, -61, 45, 126, -43, -70, -2, -61, 31, 123, -43, -69, -61, -50, 5, 110, -39, -112, -33, -49, 49, 86, -42, -68, -21, -62, 26, 82, -41, -101, -12}, new byte[]{48, 50, 78, 38, -94, -24}));
                } else {
                    String str5 = C0436w1.f1166;
                    C0436w1.m953(C0341oa.m915(new byte[]{-102, 113, -90}, new byte[]{-9, 1, -110, -1, -119, -118}), C0272jb.m1105(str4));
                }
                break;
            default:
                String str6 = C0436w1.f1166;
                C0436w1.m953(C0341oa.m915(new byte[]{104, -42, -77}, new byte[]{31, -73, -59, -55, 7, 88}), C0272jb.m1105(C0211f6.f1446));
                break;
        }
    }
}
