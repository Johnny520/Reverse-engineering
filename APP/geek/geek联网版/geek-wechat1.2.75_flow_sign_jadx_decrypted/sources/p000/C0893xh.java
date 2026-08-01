package p000;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.hardware.SensorManager;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.window.C0988;
import android.window.C0989;
import android.window.C0990;
import android.window.C0991;
import androidx.activity.result.C0992;
import androidx.activity.result.C0993;
import androidx.appcompat.app.C0997;
import androidx.appcompat.view.menu.C0998;
import androidx.appcompat.view.menu.C0999;
import androidx.appcompat.widget.C1000;
import androidx.constraintlayout.helper.widget.C1001;
import androidx.coordinatorlayout.widget.C1002;
import androidx.coordinatorlayout.widget.C1003;
import androidx.coordinatorlayout.widget.C1004;
import androidx.core.content.C1007;
import androidx.core.content.C1008;
import androidx.core.graphics.drawable.C1009;
import androidx.core.graphics.drawable.C1010;
import androidx.core.widget.C1011;
import androidx.legacy.content.C1012;
import androidx.legacy.content.C1014;
import androidx.startup.C1015;
import com.github.megatronking.stringfog.C1019;
import com.github.megatronking.stringfog.annotation.C1016;
import com.github.megatronking.stringfog.annotation.C1017;
import com.github.megatronking.stringfog.xor.C1018;
import com.google.android.material.appbar.C1020;
import com.google.android.material.appbar.C1021;
import com.google.android.material.behavior.C1022;
import com.google.android.material.bottomappbar.C1023;
import com.google.android.material.bottomappbar.C1024;
import com.google.android.material.button.C1025;
import com.google.android.material.carousel.C1026;
import com.google.android.material.carousel.C1027;
import com.google.android.material.carousel.C1028;
import com.google.android.material.carousel.C1029;
import com.google.android.material.carousel.C1030;
import com.google.android.material.datepicker.C1031;
import com.google.android.material.datepicker.C1033;
import com.google.android.material.datepicker.C1036;
import com.google.android.material.floatingactionbutton.C1037;
import com.google.android.material.internal.C1038;
import com.google.android.material.sidesheet.C1039;
import com.google.android.material.snackbar.C1040;
import com.google.android.material.textfield.C1041;
import com.google.android.material.timepicker.C1043;
import com.google.android.material.timepicker.C1044;
import com.google.android.material.transformation.C1046;
import com.ljx.wechatmod.auth.C1047;
import com.ljx.wechatmod.hook.C1048;
import com.ljx.wechatmod.hook.C1049;
import com.ljx.wechatmod.p001ui.C1050;
import de.robv.android.xposed.XposedHelpers;
import io.fastkv.C1052;
import java.util.LinkedList;
import java.util.List;
import kotlinx.coroutines.C1055;
import kotlinx.coroutines.C1056;

/* JADX INFO: renamed from: xh */
/* JADX INFO: loaded from: classes.dex */
public class C0893xh implements InterfaceC0258ge, InterfaceC0425kv {

    /* JADX INFO: renamed from: d */
    public static float f5248d = -1.0f;

    /* JADX INFO: renamed from: e */
    public static float f5249e;

    /* JADX INFO: renamed from: f */
    public static float f5250f;

    /* JADX INFO: renamed from: g */
    public static float f5251g;

    /* JADX INFO: renamed from: k */
    public static SensorManager f5255k;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5261a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ C0893xh f5246b = new C0893xh(2);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ C0893xh f5247c = new C0893xh(3);

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ C0893xh f5252h = new C0893xh(5);

    /* JADX INFO: renamed from: i */
    public static final C0893xh f5253i = new C0893xh(7);

    /* JADX INFO: renamed from: j */
    public static final C0893xh f5254j = new C0893xh(9);

    /* JADX INFO: renamed from: l */
    public static final r80 f5256l = new r80();

    /* JADX INFO: renamed from: m */
    public static final C0893xh f5257m = new C0893xh(11);

    /* JADX INFO: renamed from: n */
    public static final C0893xh f5258n = new C0893xh(12);

    /* JADX INFO: renamed from: o */
    public static final C0893xh f5259o = new C0893xh(13);

    /* JADX INFO: renamed from: p */
    public static final C0893xh f5260p = new C0893xh(14);

    public /* synthetic */ C0893xh(int i) {
        this.f5261a = i;
    }

    /* JADX INFO: renamed from: b */
    public static final void m2682b(final Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        AbstractC0493mp.m1855e("null cannot be cast to non-null type android.view.ViewGroup", decorView);
        final ViewGroup viewGroup = (ViewGroup) decorView;
        final FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackgroundColor(Color.parseColor("#80000000"));
        frameLayout.setClickable(true);
        frameLayout.setAlpha(0.0f);
        C0770u6.f4638a.getClass();
        boolean zM1853c = AbstractC0493mp.m1853c(C0770u6.f4644g, "UNKNOWN_WXID");
        final boolean z = !zM1853c;
        String strM492a = !zM1853c ? C0770u6.f4644g : "\u83b7\u53d6\u5931\u8d25\uff0c\u8bf7\u5148\u767b\u5f55\u5fae\u4fe1";
        frameLayout.addView(new C0141d7(activity, g40.m1155r("GeekMod 授权\n", strM492a)), new ViewGroup.LayoutParams(-1, -1));
        final LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(m2690j(activity, 24.0f), m2690j(activity, 32.0f), m2690j(activity, 24.0f), m2690j(activity, 32.0f));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setCornerRadius(m2690j(activity, 24.0f));
        linearLayout.setBackground(gradientDrawable);
        linearLayout.setTranslationY(m2690j(activity, 400.0f));
        TextView textView = new TextView(activity);
        textView.setText("GeekMod \u5b89\u5168\u9a8c\u8bc1");
        textView.setTextSize(22.0f);
        textView.setTextColor(-16777216);
        textView.getPaint().setFakeBoldText(true);
        final TextView textView2 = new TextView(activity);
        textView2.setText("未检测到有效授权\n当前登录微信号:\n\n" + strM492a + "\n\n🔹新用户: 前往 TG 发送指令 /bind \n" + strM492a + "\n🔹老用户: 若已绑定，请直接点击下方验证");
        textView2.setTextSize(14.0f);
        textView2.setTextColor(Color.parseColor("#555555"));
        textView2.setGravity(17);
        textView2.setPadding(0, m2690j(activity, 20.0f), 0, m2690j(activity, 20.0f));
        textView2.setTextIsSelectable(true);
        TextView textViewM2689i = m2689i(activity, "\u590d\u5236\u6307\u4ee4\u5e76\u524d\u5f80 TG", "#F2F2F2", -16777216, new InterfaceC0786um(activity, z) { // from class: v6

            /* JADX INFO: renamed from: a */
            public final boolean f4906a;

            /* JADX INFO: renamed from: b */
            public final Activity f4907b;

            /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000b. Please report as an issue. */
            /* JADX WARN: Removed duplicated region for block: B:48:0x0053 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:50:0x0050 A[SYNTHETIC] */
            {
                /*
                    r4 = this;
                    r4.<init>()
                    r2 = 0
                    java.lang.String r0 = "ۡۥۡ"
                    int r0 = androidx.appcompat.app.C0997.m2901(r0)
                Lb:
                    switch(r0) {
                        case 1747710: goto Lf;
                        case 1747869: goto L4c;
                        case 1748797: goto L10;
                        case 1749733: goto L69;
                        case 1750566: goto L2d;
                        case 1750597: goto L80;
                        case 1751525: goto L90;
                        case 1754411: goto L5d;
                        default: goto Le;
                    }
                Le:
                    goto Lb
                Lf:
                    return
                L10:
                    r4.f4906a = r6
                    int r0 = androidx.appcompat.view.menu.C0998.f5645
                    int r1 = com.google.android.material.carousel.C1027.f5674
                    r1 = r1 ^ (-8868(0xffffffffffffdd5c, float:NaN))
                    int r0 = r0 * r1
                    if (r0 < 0) goto L26
                    r0 = 77
                    kotlinx.coroutines.C1056.f5703 = r0
                    java.lang.String r0 = "ۡۥۡ"
                    int r0 = com.github.megatronking.stringfog.xor.C1018.m2984(r0)
                    goto Lb
                L26:
                    java.lang.String r0 = "ۣۣۡ"
                L28:
                    int r0 = com.google.android.material.carousel.C1027.m3021(r0)
                    goto Lb
                L2d:
                    java.lang.String r0 = "KaK2Ge5ipA1kOZxMd0U"
                    java.lang.String r0 = com.google.android.material.datepicker.C1032.m3038(r0)
                    double r2 = java.lang.Double.parseDouble(r0)
                    int r0 = android.window.C0991.f5638
                    if (r0 > 0) goto L45
                    androidx.startup.C1015.m2972()
                    java.lang.String r0 = "۠ۡ۟"
                    int r0 = androidx.core.content.C1007.m2938(r0)
                    goto Lb
                L45:
                    java.lang.String r0 = "ۧ۠ۤ"
                L47:
                    int r0 = com.google.android.material.transformation.C1046.m3095(r0)
                    goto Lb
                L4c:
                    int r0 = com.ljx.wechatmod.hook.C1048.f5695
                    if (r0 < 0) goto L53
                    java.lang.String r0 = "۠ۨۧ"
                    goto L47
                L53:
                    int r0 = android.window.C0991.f5638
                    int r1 = com.github.megatronking.stringfog.xor.C1018.f5665
                    int r0 = r0 % r1
                    r1 = 1747707(0x1aaafb, float:2.449059E-39)
                    int r0 = r0 + r1
                    goto Lb
                L5d:
                    java.io.PrintStream r0 = java.lang.System.out
                    r0.println(r2)
                    java.lang.String r0 = "۠ۡ۟"
                L64:
                    int r0 = com.google.android.material.snackbar.C1040.m3072(r0)
                    goto Lb
                L69:
                    int r0 = com.google.android.material.internal.C1038.m3062()
                    if (r0 < 0) goto L4c
                    int r0 = p000.C1059.f5706
                    if (r0 < 0) goto L76
                    java.lang.String r0 = "ۧ۠ۤ"
                    goto L64
                L76:
                    int r0 = androidx.activity.result.C0994.f5641
                    int r1 = com.github.megatronking.stringfog.xor.C1018.f5665
                    int r0 = r0 % r1
                    r1 = 1750465(0x1ab5c1, float:2.452924E-39)
                    int r0 = r0 + r1
                    goto Lb
                L80:
                    r4.f4907b = r5
                    int r0 = com.google.android.material.timepicker.C1044.m3086()
                    if (r0 < 0) goto L88
                L88:
                    java.lang.String r0 = "ۢۤۧ"
                    int r0 = androidx.activity.C0995.m2891(r0)
                    goto Lb
                L90:
                    int r0 = android.support.v4.graphics.drawable.C0987.f5634
                    if (r0 > 0) goto L9a
                    android.window.C0988.m2865()
                    java.lang.String r0 = "ۨۧ۠"
                    goto L28
                L9a:
                    int r0 = com.google.android.material.carousel.C1028.f5675
                    int r1 = com.google.android.material.datepicker.C1032.f5679
                    int r0 = r0 % r1
                    r1 = 1749234(0x1ab0f2, float:2.451199E-39)
                    int r0 = r0 + r1
                    goto Lb
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.C0807v6.<init>(android.app.Activity, boolean):void");
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0011. Please report as an issue. */
            @Override // p000.InterfaceC0786um
            /* JADX INFO: renamed from: f */
            public final Object mo26f(Object obj) {
                StringBuilder sb;
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                View view;
                Activity activity2;
                String str6;
                String strM492a2 = null;
                ClipboardManager clipboardManager = null;
                Activity activity3 = null;
                String str7 = null;
                Object systemService = null;
                StringBuilder sb2 = null;
                View view2 = null;
                boolean z2 = false;
                int iM2981 = C1017.m2981("ۡۧۢ");
                while (true) {
                    switch (iM2981) {
                        case 56321:
                        case 56567:
                            iM2981 = C0998.m2905((C1050.f5697 ^ (C1043.f5690 / (-3679))) <= 0 ? "ۣ۟ۤ" : "۟ۤ۟");
                            break;
                        case 56327:
                            str3 = C0770u6.f4644g;
                            if (C1040.f5687 * (C1023.f5670 ^ 548) > 0) {
                                str7 = str3;
                                iM2981 = (C1047.f5694 | C1024.f5671) + 1755916;
                            } else {
                                C1023.f5670 = 31;
                                str = "ۦۨۨ";
                                str7 = str3;
                                iM2981 = C1010.m2952(str);
                            }
                            break;
                        case 56476:
                            AbstractC0493mp.m1855e("null cannot be cast to non-null type android.content.ClipboardManager", systemService);
                            if (C1059.f5706 < 0) {
                                iM2981 = (C1002.f5649 / C1025.f5672) + 1749851;
                            } else {
                                activity2 = activity3;
                                str6 = "ۥۣۢ";
                                activity3 = activity2;
                                iM2981 = C1003.m2922(str6);
                            }
                            break;
                        case 1746689:
                            C0770u6.f4638a.getClass();
                            if (C1021.f5668 - (C1046.f5693 * 3766) > 0) {
                                str2 = "۠ۧ";
                                sb = sb2;
                                sb2 = sb;
                                iM2981 = C0988.m2863(str2);
                            } else {
                                iM2981 = C0999.m2906("ۡۧۢ");
                            }
                            break;
                        case 1746842:
                            break;
                        case 1747750:
                            boolean z3 = this.f4906a;
                            if (C1028.f5675 - (C0992.f5639 + 4876) >= 0) {
                                C1012.f5659 = 88;
                                str4 = "ۤ۟ۥ";
                            } else {
                                str4 = "ۡۦۤ";
                            }
                            z2 = z3;
                            iM2981 = C1014.m2969(str4);
                            break;
                        case 1748831:
                            activity2 = this.f4907b;
                            if (C1048.f5695 < 0) {
                                str6 = "ۥۣۢ";
                                activity3 = activity2;
                                iM2981 = C1003.m2922(str6);
                            } else {
                                C1021.m2995();
                                activity3 = activity2;
                                iM2981 = C1029.m3027("ۢۨۢ");
                            }
                            break;
                        case 1748860:
                            view = (View) obj;
                            str5 = "ۤ۟ۥ";
                            view2 = view;
                            iM2981 = C1027.m3021(str5);
                            break;
                        case 1749606:
                            sb2.append(str7);
                            if (C1030.m3031() < 0) {
                                iM2981 = (C1057.f5704 - C1048.f5695) + 1749691;
                            } else {
                                str5 = "۟ۤ۟";
                                view = view2;
                                view2 = view;
                                iM2981 = C1027.m3021(str5);
                            }
                            break;
                        case 1749733:
                            clipboardManager.setPrimaryClip(ClipData.newPlainText(strM492a2, sb2.toString()));
                            if (C1004.f5651 > 0) {
                                str3 = str7;
                                str = "ۦۨۨ";
                                str7 = str3;
                                iM2981 = C1010.m2952(str);
                            } else {
                                iM2981 = C1001.m2914("ۤۧۧ");
                            }
                            break;
                        case 1749852:
                            ClipboardManager clipboardManager2 = (ClipboardManager) systemService;
                            if (C1026.f5673 >= 0) {
                                clipboardManager = clipboardManager2;
                                iM2981 = C1052.m3118("ۨۤۧ");
                            } else {
                                clipboardManager = clipboardManager2;
                                iM2981 = (C0998.f5645 % C1039.f5686) + 1751712;
                            }
                            break;
                        case 1750782:
                            str5 = "۠ۡ";
                            view = view2;
                            view2 = view;
                            iM2981 = C1027.m3021(str5);
                            break;
                        case 1751498:
                            AbstractC0493mp.m1857g("it", view2);
                            if (C1041.f5688 - (C0990.f5637 ^ (-5639)) <= 0) {
                                C0990.f5637 = 54;
                                iM2981 = C1002.m2920("ۤۦۣ");
                            } else {
                                iM2981 = (C0999.f5646 ^ C0990.f5637) ^ (-1747141);
                            }
                            break;
                        case 1751709:
                            systemService = activity3.getSystemService("clipboard");
                            if (C1022.m3000() >= 0) {
                                C0999.m2907();
                                iM2981 = C1019.m2989("۠ۧ");
                            } else {
                                iM2981 = C1037.m3059("ۥۡ");
                            }
                            break;
                        case 1751713:
                            strM492a2 = "WeChatID";
                            iM2981 = (C1015.f5662 | C1022.f5669) ^ (-1746786);
                            break;
                        case 1751748:
                            Toast.makeText(activity3, "\u26a0\ufe0f \u8bf7\u5148\u767b\u5f55\u5fae\u4fe1\uff0c\u7136\u540e\u518d\u8bd5", 0).show();
                            str5 = "۟ۤ۟";
                            view = view2;
                            view2 = view;
                            iM2981 = C1027.m3021(str5);
                            break;
                        case 1752550:
                            if (!z2) {
                                iM2981 = (C1003.f5650 % C1011.f5658) ^ (-1751964);
                            } else if (C1046.f5693 < 0) {
                                str6 = "ۤۦ۟";
                                iM2981 = C1003.m2922(str6);
                            } else {
                                C0992.m2879();
                                iM2981 = C0999.m2906("ۡۦۤ");
                            }
                            break;
                        case 1752554:
                            iM2981 = (C1003.f5650 % C1011.f5658) ^ (-1751964);
                            break;
                        case 1753702:
                            Toast.makeText(activity3, "\u7ed1\u5b9a\u6307\u4ee4\u5df2\u590d\u5236\uff0c\u8bf7\u524d\u5f80 TG \u641c\u7d22\u673a\u5668\u4eba", 0).show();
                            iM2981 = (C1031.f5678 * C1024.f5671) + 1661862;
                            break;
                        case 1755499:
                            sb = new StringBuilder("/bind ");
                            if (C1016.f5663 + (C0991.f5638 * 9360) > 0) {
                                str = "ۢ۠ۤ";
                                sb2 = sb;
                                iM2981 = C1010.m2952(str);
                            } else {
                                C1004.f5651 = 93;
                                str2 = "ۢۤۧ";
                                sb2 = sb;
                                iM2981 = C0988.m2863(str2);
                            }
                            break;
                        case 1755529:
                            iM2981 = (C1016.f5663 % C1058.f5705) + 1748976;
                            break;
                    }
                    return C0893xh.f5258n;
                }
            }
        });
        TextView textViewM2689i2 = m2689i(activity, "\u7acb\u5373\u540c\u6b65\u4e91\u7aef\u6388\u6743", "#07C160", -1, new InterfaceC0786um(viewGroup, frameLayout, linearLayout, activity, textView2) { // from class: w6

            /* JADX INFO: renamed from: a */
            public final ViewGroup f5062a;

            /* JADX INFO: renamed from: b */
            public final FrameLayout f5063b;

            /* JADX INFO: renamed from: c */
            public final LinearLayout f5064c;

            /* JADX INFO: renamed from: d */
            public final Activity f5065d;

            /* JADX INFO: renamed from: e */
            public final TextView f5066e;

            /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000b. Please report as an issue. */
            /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
            {
                /*
                    Method dump skipped, instruction units count: 312
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.C0845w6.<init>(android.view.ViewGroup, android.widget.FrameLayout, android.widget.LinearLayout, android.app.Activity, android.widget.TextView):void");
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
            @Override // p000.InterfaceC0786um
            /* JADX INFO: renamed from: f */
            public final Object mo26f(Object obj) {
                String str;
                String str2;
                View view = null;
                int iM3067 = C1039.m3067("ۡۤ");
                while (true) {
                    switch (iM3067) {
                        case 56355:
                            View view2 = (View) obj;
                            if (C1050.f5697 + (C1007.f5654 / 4606) > 0) {
                                iM3067 = (C0988.f5635 / C1008.f5655) + 1752607;
                                view = view2;
                            } else {
                                view = view2;
                            }
                            break;
                        case 1749604:
                            view.setEnabled(false);
                            if (C1052.f5699 - (C1009.f5656 * 2483) > 0) {
                                iM3067 = C1057.m3139("ۧۧۦ");
                            } else {
                                C1049.f5696 = 80;
                                iM3067 = C1007.m2938("ۡۤ");
                            }
                            break;
                        case 1750787:
                            if ((C1007.f5654 | (C1038.f5685 - 3005)) < 0) {
                                iM3067 = C1008.m2944("ۡۤ");
                            } else {
                                str2 = "ۧ۠ۧ";
                                iM3067 = C1049.m3104(str2);
                            }
                            break;
                        case 1752609:
                            AbstractC0493mp.m1857g("btn", view);
                            if (C0992.f5639 >= 0) {
                                C1036.f5683 = 12;
                                str = "ۣۧۧ";
                            } else {
                                str = "ۢ۠ۢ";
                            }
                            iM3067 = C1000.m2911(str);
                            break;
                        case 1754537:
                            break;
                        case 1754593:
                            g80.m1206u(C0417kn.f2855i, null, new C0094c7(this.f5062a, this.f5063b, this.f5064c, this.f5065d, view, this.f5066e, null), C1057.f5704 ^ 15);
                            if (C1027.f5674 > 0) {
                                str2 = "ۧۤۦ";
                                iM3067 = C1049.m3104(str2);
                            } else {
                                iM3067 = C0993.m2885("ۧۤۦ");
                            }
                            break;
                        case 1754630:
                            ((TextView) view).setText("\u5b89\u5168\u63e1\u624b\u4e2d...");
                            iM3067 = C1058.m3141() > 0 ? C0989.m2867("ۨۡۢ") : C1021.m2996("ۧۦ۠");
                            break;
                        case 1755401:
                            C0417kn.f2847a.getClass();
                            if ((C1028.f5675 | (C1047.f5694 * 5304)) < 0) {
                                iM3067 = C1010.m2952("ۧۦ۠");
                            } else {
                                C1024.m3008();
                                iM3067 = C1057.m3139("ۧۧۦ");
                            }
                            break;
                    }
                    return C0893xh.f5258n;
                }
            }
        });
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        linearLayout.addView(textViewM2689i);
        linearLayout.addView(textViewM2689i2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(m2690j(activity, 320.0f), -2);
        layoutParams.gravity = 17;
        frameLayout.addView(linearLayout, layoutParams);
        viewGroup.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setOnClickListener(new ViewOnClickListenerC0882x6(viewGroup, frameLayout, linearLayout, 0));
        linearLayout.setOnClickListener(new ViewOnClickListenerC0919y6());
        frameLayout.animate().alpha(1.0f).setDuration(250L).start();
        o40 o40Var = new o40((View) linearLayout, (AbstractC0259gf) o40.f3383n, 0.0f);
        o40Var.f3400k.m2064b(1500.0f);
        o40Var.f3400k.m2063a(0.5f);
        o40Var.m1991h();
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x032a A[Catch: all -> 0x0254, TryCatch #1 {all -> 0x0254, blocks: (B:94:0x0242, B:97:0x0257, B:99:0x025b, B:101:0x0261, B:103:0x0265, B:108:0x026d, B:110:0x027b, B:112:0x028b, B:113:0x029f, B:115:0x02b5, B:116:0x02cb, B:117:0x02d0, B:119:0x02d4, B:121:0x02da, B:123:0x02de, B:128:0x02e6, B:130:0x02ec, B:132:0x0302, B:133:0x0318, B:134:0x032a, B:135:0x033c, B:137:0x0340, B:139:0x0346, B:141:0x034a, B:146:0x0352, B:148:0x0360, B:150:0x036f, B:151:0x0383, B:153:0x0399), top: B:224:0x0228 }] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2683c(android.view.ViewGroup r18, p000.C0588p9 r19, p000.C0662r9 r20, android.view.MotionEvent r21, p000.C0625q9 r22, de.robv.android.xposed.XC_MethodHook.MethodHookParam r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 1460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0893xh.m2683c(android.view.ViewGroup, p9, r9, android.view.MotionEvent, q9, de.robv.android.xposed.XC_MethodHook$MethodHookParam, boolean):void");
    }

    /* JADX INFO: renamed from: d */
    public static final void m2684d(ViewGroup viewGroup, Activity activity, String str, String str2, int i, final InterfaceC0379jm interfaceC0379jm) {
        String str3;
        String str4;
        View viewFindViewWithTag = viewGroup.findViewWithTag(str);
        if (viewFindViewWithTag != null) {
            viewFindViewWithTag.setVisibility(0);
            return;
        }
        TextView textView = new TextView(activity);
        textView.setTag(str);
        textView.setText(str2);
        textView.setTextSize(24.0f);
        textView.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (AbstractC0493mp.m1853c(str2, "\u2699\ufe0f")) {
            str3 = "K0OvUP6vYDxO\n";
            str4 = "CAaZFrjpJno=\n";
        } else {
            str3 = "HcBpc4Eku2UO\n";
            str4 = "PvlQQ7EUi1U=\n";
        }
        gradientDrawable.setColor(Color.parseColor(b50.m492a(str3, str4)));
        gradientDrawable.setCornerRadius(45.0f);
        textView.setBackground(gradientDrawable);
        textView.setPadding(15, 15, 15, 15);
        textView.setElevation(10.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(120, 120);
        layoutParams.gravity = 8388659;
        layoutParams.leftMargin = 50;
        layoutParams.topMargin = i;
        final m00 m00Var = new m00();
        final m00 m00Var2 = new m00();
        final l00 l00Var = new l00();
        textView.setOnTouchListener(new View.OnTouchListener(m00Var, m00Var2, l00Var, interfaceC0379jm) { // from class: o80

            /* JADX INFO: renamed from: a */
            public final m00 f3416a;

            /* JADX INFO: renamed from: b */
            public final m00 f3417b;

            /* JADX INFO: renamed from: c */
            public final l00 f3418c;

            /* JADX INFO: renamed from: d */
            public final InterfaceC0379jm f3419d;

            {
                float f = 0.0f;
                int iM3140 = C1058.m3140("ۢۨۧ");
                while (true) {
                    switch (iM3140) {
                        case 56510:
                            System.out.println(f);
                            iM3140 = C0991.m2876(C1040.m3070() >= 0 ? "۠۟۠" : "ۣۨ۠");
                            continue;
                        case 1746817:
                            if (C1031.f5678 + C1021.f5668 + 413 <= 0) {
                                C1009.f5656 = 50;
                                iM3140 = C1020.m2993("ۢۤ۟");
                            } else {
                                iM3140 = (C1009.f5656 | C1001.f5648) ^ (-1749762);
                                continue;
                            }
                            break;
                        case 1747649:
                            this.f3417b = m00Var2;
                            if ((C1044.f5691 ^ (C1028.f5675 % (-870))) >= 0) {
                                iM3140 = C1037.m3059("ۢۨۧ");
                            } else {
                                iM3140 = (C1003.f5650 | C0998.f5645) + 1748708;
                                continue;
                            }
                            break;
                        case 1747652:
                            if (C1056.m3134() >= 0) {
                                iM3140 = (C1004.f5651 | C1055.f5702) + 1753002;
                            }
                            break;
                        case 1747809:
                            this.f3418c = l00Var;
                            iM3140 = C0997.m2901("ۨۥۣ");
                            continue;
                        case 1749857:
                            this.f3416a = m00Var;
                            if (C1059.m3144() >= 0) {
                                C1015.m2972();
                                iM3140 = C1046.m3095("ۣۨ۠");
                            } else {
                                iM3140 = (C1040.f5687 / C1027.f5674) + 1747649;
                                continue;
                            }
                            break;
                        case 1753513:
                            f = Float.parseFloat(C1030.m3030("P2Szw"));
                            iM3140 = C1015.f5662 + C0988.f5635 + 56701;
                            continue;
                        case 1753538:
                            break;
                        case 1755461:
                            return;
                        case 1755526:
                            this.f3419d = interfaceC0379jm;
                            iM3140 = (C1016.f5663 - C1059.f5706) + 1747536;
                            continue;
                    }
                    if (C1018.f5665 % (C0993.f5640 + 3402) <= 0) {
                        C1033.f5680 = 88;
                        iM3140 = C1027.m3021("ۦۥۣ");
                    } else {
                        iM3140 = C1029.m3027("ۣۨ۠");
                    }
                }
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0013. Please report as an issue. */
            /* JADX WARN: Removed duplicated region for block: B:118:0x01e6 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:122:0x0020 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:133:0x0198 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:136:0x00b4 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:140:0x00ad A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:151:0x0194 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:153:0x021d A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:155:0x0211 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
            @Override // android.view.View.OnTouchListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
                /*
                    Method dump skipped, instruction units count: 694
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.o80.onTouch(android.view.View, android.view.MotionEvent):boolean");
            }
        });
        if (viewGroup instanceof FrameLayout) {
            viewGroup.addView(textView, layoutParams);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m2685e(Activity activity, ViewGroup viewGroup) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(viewGroup);
        float f = viewGroup.getResources().getDisplayMetrics().density;
        float f2 = viewGroup.getResources().getDisplayMetrics().heightPixels * 0.15f;
        TextView textView = null;
        while (!linkedList.isEmpty()) {
            View view = (View) linkedList.poll();
            if (view instanceof TextView) {
                TextView textView2 = (TextView) view;
                if (textView2.getVisibility() == 0) {
                    CharSequence text = textView2.getText();
                    AbstractC0493mp.m1856f("getText(...)", text);
                    if (text.length() > 0) {
                        int[] iArr = new int[2];
                        textView2.getLocationOnScreen(iArr);
                        float f3 = iArr[1];
                        if (f3 > 10 * f && f3 < f2 && textView2.getTextSize() > 14.0f * f && (textView == null || textView2.getTextSize() > textView.getTextSize())) {
                            textView = textView2;
                        }
                    }
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) view;
                int childCount = viewGroup2.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    linkedList.add(viewGroup2.getChildAt(i));
                }
            }
        }
        if (textView == null) {
            return;
        }
        Object tag = textView.getTag(2115108885);
        Boolean bool = Boolean.TRUE;
        if (AbstractC0493mp.m1853c(tag, bool)) {
            return;
        }
        textView.setTag(2115108885, bool);
        Object tag2 = textView.getTag(2115108871);
        Integer num = tag2 instanceof Integer ? (Integer) tag2 : null;
        int iIntValue = num != null ? num.intValue() : textView.getCurrentTextColor();
        textView.setTag(2115108871, Integer.valueOf(iIntValue));
        p00 p00Var = new p00();
        p00Var.f3560b = textView.getText().toString();
        textView.addTextChangedListener(new q80(textView, p00Var, iIntValue));
        textView.setClickable(true);
        textView.setOnClickListener(new ViewOnClickListenerC0882x6(activity, textView, p00Var, 4));
        textView.setText(textView.getText());
    }

    /* JADX INFO: renamed from: f */
    public static final byte[] m2686f(byte[] bArr, ClassLoader classLoader) {
        if (bArr == null) {
            return null;
        }
        try {
            Object objNewInstance = XposedHelpers.findClass(ub0.f4749f1, classLoader).newInstance();
            XposedHelpers.callMethod(objNewInstance, ub0.f4755h1, new Object[]{bArr});
            Object objectField = XposedHelpers.getObjectField(objNewInstance, ub0.f4752g1);
            if ((objectField instanceof String) && !i50.m1468K((String) objectField, ub0.f4746e1)) {
                XposedHelpers.setObjectField(objNewInstance, ub0.f4752g1, ub0.f4746e1 + objectField);
            }
            Object objCallMethod = XposedHelpers.callMethod(objNewInstance, ub0.f4758i1, new Object[0]);
            AbstractC0493mp.m1855e("null cannot be cast to non-null type kotlin.ByteArray", objCallMethod);
            return (byte[]) objCallMethod;
        } catch (Throwable unused) {
            g40.m1152o("06ke\n", "p8h5VTpLcuY=\n", "SnsCommentProtoHook", "tw==\n", "0vI8ySRxU5w=\n");
            return bArr;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m2687g(Activity activity) {
        C0720su c0720su;
        C0720su c0720su2;
        C0770u6 c0770u6 = C0770u6.f4638a;
        String strM492a = "auth_token";
        c0770u6.getClass();
        String strM2441c = C0770u6.m2441c(strM492a);
        if (strM2441c.length() == 0) {
            c0720su = new C0720su(activity, 0);
        } else {
            String strM1622j = AbstractC0387ju.m1622j(strM2441c);
            if (strM1622j.length() != 0 && i50.m1467J(strM1622j, new String[]{"|"}).size() == 3) {
                try {
                    List listM1467J = i50.m1467J(strM1622j, new String[]{"|"});
                    String str = (String) listM1467J.get(0);
                    long j = Long.parseLong((String) listM1467J.get(1));
                    int i = Integer.parseInt((String) listM1467J.get(2));
                    if (!AbstractC0493mp.m1853c(str, C0770u6.f4644g) || System.currentTimeMillis() > j) {
                        c0720su2 = new C0720su(activity, 0);
                    } else if (i == C0770u6.f4640c) {
                        z20.f5534a.getClass();
                        z20.m2784a(activity);
                        return;
                    } else {
                        C0770u6.m2443e("auth_token", "");
                        c0720su2 = new C0720su(activity, 0);
                    }
                    m2698t(activity, c0720su2);
                    return;
                } catch (Exception unused) {
                    c0720su = new C0720su(activity, 0);
                }
            } else {
                c0720su = new C0720su(activity, 0);
            }
        }
        m2698t(activity, c0720su);
    }

    /* JADX INFO: renamed from: h */
    public static C0893xh m2688h(Context context, int i) {
        AbstractC0498mu.m1885b("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0168dz.f1450m);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        AbstractC0274gu.m1315i(context, typedArrayObtainStyledAttributes, 4);
        AbstractC0274gu.m1315i(context, typedArrayObtainStyledAttributes, 9);
        AbstractC0274gu.m1315i(context, typedArrayObtainStyledAttributes, 7);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        m30.m1798a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new C0169e(0)).m1731a();
        typedArrayObtainStyledAttributes.recycle();
        C0893xh c0893xh = new C0893xh(17);
        AbstractC0498mu.m1886c(rect.left);
        AbstractC0498mu.m1886c(rect.top);
        AbstractC0498mu.m1886c(rect.right);
        AbstractC0498mu.m1886c(rect.bottom);
        return c0893xh;
    }

    /* JADX INFO: renamed from: i */
    public static TextView m2689i(Activity activity, String str, String str2, int i, InterfaceC0786um interfaceC0786um) {
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextSize(16.0f);
        textView.setTextColor(i);
        textView.setGravity(17);
        textView.getPaint().setFakeBoldText(true);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor(str2));
        gradientDrawable.setCornerRadius(m2690j(activity, 12.0f));
        textView.setBackground(gradientDrawable);
        textView.setPadding(0, m2690j(activity, 14.0f), 0, m2690j(activity, 14.0f));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = m2690j(activity, 12.0f);
        textView.setLayoutParams(layoutParams);
        o40 o40Var = new o40((View) textView, (AbstractC0259gf) o40.f3384o, 1.0f);
        o40 o40Var2 = new o40((View) textView, (AbstractC0259gf) o40.f3385p, 1.0f);
        o40Var.f3400k.m2064b(10000.0f);
        o40Var2.f3400k.m2064b(10000.0f);
        textView.setOnTouchListener(new ViewOnTouchListenerC0956z6(o40Var, o40Var2, interfaceC0786um, 0));
        return textView;
    }

    /* JADX INFO: renamed from: j */
    public static int m2690j(Activity activity, float f) {
        return (int) TypedValue.applyDimension(1, f, activity.getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: k */
    public static ImageView m2691k(View view) {
        if (view instanceof ImageView) {
            return (ImageView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            AbstractC0493mp.m1856f("getChildAt(...)", childAt);
            ImageView imageViewM2691k = m2691k(childAt);
            if (imageViewM2691k != null) {
                return imageViewM2691k;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static TextView m2692l(View view) {
        if (view instanceof TextView) {
            return (TextView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            AbstractC0493mp.m1856f("getChildAt(...)", childAt);
            TextView textViewM2692l = m2692l(childAt);
            if (textViewM2692l != null) {
                return textViewM2692l;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static o40 m2693n(ViewGroup viewGroup, AbstractC0259gf abstractC0259gf, int i) {
        Object tag = viewGroup.getTag(i);
        o40 o40Var = tag instanceof o40 ? (o40) tag : null;
        if (o40Var == null) {
            o40Var = new o40(viewGroup, abstractC0259gf);
            o40Var.f3400k = new p40();
            if (abstractC0259gf.equals(o40.f3384o) || abstractC0259gf.equals(o40.f3385p)) {
                o40Var.m1989f(0.002f);
            } else if (abstractC0259gf.equals(o40.f3386q) || abstractC0259gf.equals(o40.f3387r) || abstractC0259gf.equals(o40.f3388s)) {
                o40Var.m1989f(0.1f);
            } else {
                o40Var.m1989f(1.0f);
            }
            viewGroup.setTag(i, o40Var);
        }
        return o40Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:93:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m2694o(p000.C0449li r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0893xh.m2694o(li, android.text.Editable, int, int, boolean):boolean");
    }

    /* JADX INFO: renamed from: p */
    public static void m2695p(View view, C0588p9 c0588p9) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
        ViewPropertyAnimator listener;
        ViewPropertyAnimator updateListener;
        ViewPropertyAnimator viewPropertyAnimatorWithStartAction;
        AbstractC0493mp.m1857g("v", view);
        view.animate().setListener(null).setUpdateListener(null).withStartAction(null).withEndAction(null);
        View view2 = c0588p9.f3621e;
        if (view2 != null && (viewPropertyAnimatorAnimate2 = view2.animate()) != null && (listener = viewPropertyAnimatorAnimate2.setListener(null)) != null && (updateListener = listener.setUpdateListener(null)) != null && (viewPropertyAnimatorWithStartAction = updateListener.withStartAction(null)) != null) {
            viewPropertyAnimatorWithStartAction.withEndAction(null);
        }
        view.animate().cancel();
        View view3 = c0588p9.f3621e;
        if (view3 != null && (viewPropertyAnimatorAnimate = view3.animate()) != null) {
            viewPropertyAnimatorAnimate.cancel();
        }
        Object tag = view.getTag(2114191367);
        Runnable runnable = tag instanceof Runnable ? (Runnable) tag : null;
        if (runnable != null) {
            view.removeCallbacks(runnable);
            view.setTag(2114191367, null);
        }
        Object tag2 = view.getTag(2114191361);
        o40 o40Var = tag2 instanceof o40 ? (o40) tag2 : null;
        if (o40Var != null && o40Var.f3394e) {
            o40Var.m1986c();
        }
        Object tag3 = view.getTag(2114191362);
        o40 o40Var2 = tag3 instanceof o40 ? (o40) tag3 : null;
        if (o40Var2 != null && o40Var2.f3394e) {
            o40Var2.m1986c();
        }
        Object tag4 = view.getTag(2114191363);
        o40 o40Var3 = tag4 instanceof o40 ? (o40) tag4 : null;
        if (o40Var3 != null && o40Var3.f3394e) {
            o40Var3.m1986c();
        }
        Object tag5 = view.getTag(2114191364);
        o40 o40Var4 = tag5 instanceof o40 ? (o40) tag5 : null;
        if (o40Var4 != null && o40Var4.f3394e) {
            o40Var4.m1986c();
        }
        Object tag6 = view.getTag(2114191366);
        o40 o40Var5 = tag6 instanceof o40 ? (o40) tag6 : null;
        if (o40Var5 != null && o40Var5.f3394e) {
            o40Var5.m1986c();
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setRotation(0.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setAlpha(1.0f);
        view.setTranslationZ(0.0f);
        View view4 = c0588p9.f3621e;
        if (view4 != null) {
            view4.setAlpha(1.0f);
        }
        View view5 = c0588p9.f3621e;
        if (view5 != null) {
            view5.setScaleX(1.0f);
        }
        View view6 = c0588p9.f3621e;
        if (view6 != null) {
            view6.setScaleY(1.0f);
        }
        view.setLayerType(0, null);
        C0662r9 c0662r9 = c0588p9.f3623g;
        if (c0662r9 != null) {
            c0662r9.f4084c = false;
            c0662r9.f4085d = false;
            c0662r9.f4086e = false;
        }
    }

    /* JADX INFO: renamed from: r */
    public static byte[] m2696r(byte[] bArr, ClassLoader classLoader) {
        "loader";
        if (bArr == null) {
            return null;
        }
        try {
            Object objNewInstance = XposedHelpers.findClass(ub0.f4734a1, classLoader).newInstance();
            XposedHelpers.callMethod(objNewInstance, ub0.f4737b1, new Object[]{bArr});
            Object objectField = XposedHelpers.getObjectField(objNewInstance, ub0.f4743d1);
            if ((objectField instanceof String) && !i50.m1468K((String) objectField, ub0.f4746e1)) {
                XposedHelpers.setObjectField(objNewInstance, ub0.f4743d1, ub0.f4746e1 + objectField);
            }
            Object objCallMethod = XposedHelpers.callMethod(objNewInstance, ub0.f4740c1, new Object[0]);
            AbstractC0493mp.m1855e("null cannot be cast to non-null type kotlin.ByteArray", objCallMethod);
            return (byte[]) objCallMethod;
        } catch (Throwable unused) {
            g40.m1152o("06ke\n", "p8h5VTpLcuY=\n", "SnsProtoHook", "tw==\n", "0vI8ySRxU5w=\n");
            return bArr;
        }
    }

    /* JADX INFO: renamed from: s */
    public static TextView m2697s(Activity activity, FrameLayout frameLayout, LinearLayout linearLayout, String str, String str2, String str3) {
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextSize(15.0f);
        textView.setTextColor(Color.parseColor("#07C160"));
        textView.setTypeface(null, 1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setCornerRadius(24.0f);
        textView.setBackground(gradientDrawable);
        textView.setPadding(0, 30, 0, 30);
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMargins(10, 10, 10, 10);
        textView.setLayoutParams(layoutParams);
        textView.setOnClickListener(new ViewOnClickListenerC0007a6(activity, str2, str3, frameLayout, linearLayout));
        return textView;
    }

    /* JADX INFO: renamed from: t */
    public static void m2698t(Activity activity, InterfaceC0379jm interfaceC0379jm) {
        "activity";
        "onVerified";
        C0770u6 c0770u6 = C0770u6.f4638a;
        String strM492a = "auth_token";
        c0770u6.getClass();
        String strM2441c = C0770u6.m2441c(strM492a);
        if (strM2441c.length() == 0) {
            m2682b(activity);
            return;
        }
        String strM1622j = AbstractC0387ju.m1622j(strM2441c);
        if (strM1622j.length() == 0 || i50.m1467J(strM1622j, new String[]{"|"}).size() != 3) {
            m2682b(activity);
            return;
        }
        try {
            List listM1467J = i50.m1467J(strM1622j, new String[]{"|"});
            String str = (String) listM1467J.get(0);
            long j = Long.parseLong((String) listM1467J.get(1));
            int i = Integer.parseInt((String) listM1467J.get(2));
            if (AbstractC0493mp.m1853c(str, C0770u6.f4644g) && System.currentTimeMillis() <= j) {
                if (i == C0770u6.f4640c) {
                    interfaceC0379jm.mo474a();
                    return;
                }
                C0770u6.m2443e("auth_token", "");
            }
            m2682b(activity);
        } catch (Exception unused) {
            m2682b(activity);
        }
    }

    /* JADX INFO: renamed from: m */
    public Signature[] mo1681m(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // p000.InterfaceC0425kv
    /* JADX INFO: renamed from: q */
    public boolean mo1135q(MenuC0646qu menuC0646qu) {
        return false;
    }

    public String toString() {
        switch (this.f5261a) {
            case 12:
                return "kotlin.Unit";
            default:
                return super.toString();
        }
    }

    public C0893xh(C0023am c0023am) {
        this.f5261a = 25;
    }

    @Override // p000.InterfaceC0425kv
    /* JADX INFO: renamed from: a */
    public void mo1134a(MenuC0646qu menuC0646qu, boolean z) {
    }
}
