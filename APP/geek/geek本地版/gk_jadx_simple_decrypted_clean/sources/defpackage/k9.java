package defpackage;

import android.app.Activity;
import android.app.C0000;
import android.app.C0001;
import android.app.C0002;
import android.app.C0003;
import android.app.Notification;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.Sensor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.graphics.drawable.C0004;
import android.support.v4.graphics.drawable.C0005;
import android.support.v4.graphics.drawable.C0006;
import android.telephony.gsm.GsmCellLocation;
import android.util.Base64;
import android.util.SparseIntArray;
import android.view.C0007;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.C0010;
import androidx.activity.C0011;
import androidx.activity.result.C0008;
import androidx.activity.result.C0009;
import androidx.appcompat.app.C0012;
import androidx.appcompat.widget.C0013;
import androidx.appcompat.widget.C0014;
import androidx.appcompat.widget.C0015;
import androidx.appcompat.widget.C0016;
import androidx.constraintlayout.helper.widget.C0017;
import androidx.constraintlayout.widget.C0018;
import androidx.constraintlayout.widget.C0019;
import androidx.constraintlayout.widget.C0020;
import androidx.coordinatorlayout.widget.C0021;
import androidx.coordinatorlayout.widget.C0022;
import androidx.core.content.C0023;
import androidx.core.content.C0024;
import androidx.core.widget.C0025;
import androidx.emoji2.text.C0026;
import androidx.fragment.app.C0027;
import androidx.legacy.content.C0028;
import androidx.lifecycle.C0029;
import androidx.profileinstaller.C0030;
import androidx.profileinstaller.C0031;
import androidx.recyclerview.widget.C0032;
import androidx.recyclerview.widget.C0033;
import androidx.savedstate.C0034;
import androidx.savedstate.C0035;
import androidx.savedstate.C0036;
import androidx.startup.C0037;
import androidx.versionedparcelable.C0038;
import androidx.versionedparcelable.C0039;
import androidx.versionedparcelable.C0040;
import androidx.versionedparcelable.C0041;
import androidx.versionedparcelable.C0042;
import androidx.viewpager2.adapter.C0043;
import com.github.megatronking.stringfog.C0047;
import com.github.megatronking.stringfog.C0048;
import com.github.megatronking.stringfog.annotation.C0044;
import com.github.megatronking.stringfog.xor.C0045;
import com.github.megatronking.stringfog.xor.C0046;
import com.google.android.material.appbar.C0049;
import com.google.android.material.behavior.C0050;
import com.google.android.material.bottomsheet.C0051;
import com.google.android.material.carousel.C0052;
import com.google.android.material.carousel.C0053;
import com.google.android.material.carousel.C0054;
import com.google.android.material.carousel.C0055;
import com.google.android.material.chip.C0056;
import com.google.android.material.chip.C0057;
import com.google.android.material.datepicker.C0058;
import com.google.android.material.datepicker.C0059;
import com.google.android.material.floatingactionbutton.C0060;
import com.google.android.material.internal.C0061;
import com.google.android.material.theme.C0062;
import com.google.android.material.theme.C0063;
import com.google.android.material.theme.C0064;
import com.ljx.wechatmod.auth.C0065;
import com.ljx.wechatmod.hook.C0066;
import com.ljx.wechatmod.ui.C0067;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import io.fastkv.C0068;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlinx.coroutines.C0069;
import kotlinx.coroutines.C0070;

/* JADX INFO: loaded from: classes.dex */
public final class k9 extends XC_MethodHook {
    public final int a;

    public /* synthetic */ k9(int r5) {
        this.a = r5;
        long r0 = 0;
        int r2 = C0019.m79("ۣۡۦ");
    L3:
        switch(r2) {
            case 1748740: goto L6;
            case 1749695: goto L27;
            case 1751561: goto L22;
            case 1751652: goto L12;
            case 1754507: goto L19;
            case 1755467: goto L15;
            default: goto L3;
        };
    L6:
        if (C0032.m128() < 0) goto L12;
        if ((C0011.f11 % (C0006.f6 - 3470)) >= 0) goto L9;
        r2 = (C0031.f31 - C0024.f24) + 1751671;
        goto L3
    L9:
        C0005.f5 = 44;
    L10:
        r2 = C0009.m38("ۣۢ۠");
    L12:
        if ((C0050.f50 / (C0057.f57 ^ 1876)) != 0) goto L13;
        r2 = (C0064.f64 | C0007.f7) ^ 1749840;
        goto L3
    L13:
        C0049.f49 = 97;
        r2 = C0053.m213("ۡۧ۠");
        goto L3
    L15:
        System.out.println(r0);
        if (C0023.m92() < 0) goto L10;
        r2 = C0070.m281("ۣۡۦ");
        goto L3
    L19:
        if ((C0010.f10 + (C0029.f29 / (-1755))) >= 0) goto L20;
        r2 = (C0027.f27 | C0011.f11) ^ (-1748911);
        goto L3
    L20:
        r2 = C0015.m60("۠ۡۥ");
        goto L3
    L22:
        r0 = Long.parseLong(C0073.m293("3M3dPU3kISqRt1LqoLa"));
        if ((C0015.f15 / (C0018.f18 - 2845)) == 0) goto L25;
        C0041.f41 = 17;
    L25:
        r2 = C0050.m203("ۣۨۦ");
        goto L3
    }

    public static final void a(final k9 r43, final Activity r44, final ViewGroup r45, final ViewGroup r46) {
        ViewParent r27 = null;
        Drawable r34 = null;
        ViewGroup r33 = null;
        final ViewGroup r13 = null;
        final ViewGroup.LayoutParams r15 = null;
        final int r14 = 0;
        final FrameLayout r12 = null;
        final float r22 = 0.0f;
        final Drawable r16 = null;
        final Drawable r17 = null;
        ViewParent r28 = null;
        View r30 = null;
        View r29 = null;
        final Drawable r19 = null;
        final FrameLayout r11 = null;
        FrameLayout.LayoutParams r35 = null;
        int r36 = 0;
        final View r24 = null;
        final h00 r3 = null;
        final e00 r4 = null;
        final e00 r5 = null;
        final g00 r6 = null;
        final g00 r8 = null;
        final i00 r20 = null;
        final i00 r9 = null;
        final e00 r18 = null;
        final ColorDrawable r23 = null;
        final h40 r26 = null;
        i40 r39 = null;
        l9 r32 = null;
        ArrayList r40 = null;
        int r25 = 0;
        int r21 = 0;
        View r37 = null;
        View r38 = null;
        int r31 = 0;
        Drawable r41 = null;
        int r42 = C0009.m38("ۦۥۨ");
    L3:
        switch(r42) {
            case 56290: goto L6;
            case 56352: goto L44;
            case 56355: goto L93;
            case 56386: goto L11;
            case 56389: goto L34;
            case 56476: goto L81;
            case 1746727: goto L63;
            case 1746749: goto L66;
            case 1746758: goto L112;
            case 1746875: goto L29;
            case 1746940: goto L143;
            case 1746967: goto L77;
            case 1747748: goto L73;
            case 1747806: goto L8;
            case 1747809: goto L147;
            case 1748678: goto L151;
            case 1749575: goto L38;
            case 1749578: goto L70;
            case 1749664: goto L131;
            case 1749667: goto L21;
            case 1749696: goto L152;
            case 1749762: goto L35;
            case 1749789: goto L30;
            case 1750601: goto L47;
            case 1750661: goto L24;
            case 1750694: goto L98;
            case 1750780: goto L15;
            case 1751494: goto L63;
            case 1751528: goto L42;
            case 1751530: goto L55;
            case 1752460: goto L92;
            case 1752490: goto L128;
            case 1752522: goto L118;
            case 1752584: goto L33;
            case 1752610: goto L123;
            case 1752645: goto L86;
            case 1753515: goto L153;
            case 1753605: goto L151;
            case 1753609: goto L48;
            case 1753632: goto L140;
            case 1753698: goto L122;
            case 1754379: goto L47;
            case 1754412: goto L57;
            case 1754532: goto L108;
            case 1755491: goto L104;
            case 1755586: goto L30;
            case 1755620: goto L137;
            default: goto L3;
        };
    L6:
        if (C0069.m276() >= 0) goto L7;
        r13 = r33;
        r42 = (C0016.f16 | C0055.f55) + 1747291;
        goto L3
    L7:
        C0025.m103();
        r13 = r33;
        r42 = C0012.m50("ۢ۟ۤ");
        goto L3
    L8:
        String r7 = "ۧۤۡ";
        r13 = (ViewGroup) r27;
    L9:
        r42 = C0035.m140(r7);
        goto L3
    L11:
        if ((C0045.f45 - (C0028.f28 ^ 5527)) <= 0) goto L12;
        r42 = (C0056.f56 % C0056.f56) ^ 1748678;
        goto L3
    L12:
        C0021.f21 = 40;
        String r2 = "ۦۥۤ";
        View r72 = r29;
        int r10 = r31;
    L13:
        r29 = r72;
        r42 = C0034.m138(r2);
        r31 = r10;
        goto L3
    L15:
        ArrayList r210 = r26.i;
        if (r210.contains(r32) == false) goto L18;
    L133:
        if ((C0023.f23 % (C0031.f31 % (-6269))) <= 0) goto L134;
        r40 = r210;
        r42 = (C0030.f30 + C0071.f71) + 1753001;
        goto L3
    L134:
        C0015.f15 = 0;
        r40 = r210;
        r42 = C0025.m102("ۥۧ");
        goto L3
    L18:
        if (C0033.f33 <= 0) goto L19;
        r40 = r210;
        r42 = (C0069.f69 ^ C0003.f3) ^ (-1749447);
        goto L3
    L19:
        C0048.f48 = 89;
        r40 = r210;
        r42 = C0022.m90("ۥۥۥ");
        goto L3
    L21:
        r40.add(r32);
        if ((C0031.f31 - (C0022.f22 / (-499))) >= 0) goto L23;
    L116:
        r42 = C0011.m45("ۥۡۦ");
        goto L3
    L23:
        C0027.m111();
        r42 = C0041.m164("ۥ۟ۦ");
        goto L3
    L24:
        ViewGroup r102 = null;
        if (C0031.f31 >= 0) goto L26;
        r33 = null;
        r42 = C0038.m153("۟ۡ");
        goto L3
    L26:
        String r73 = "ۥۣۦ";
        l9 r211 = r32;
    L27:
        r32 = r211;
        r33 = r102;
        r42 = C0009.m38(r73);
        goto L3
    L29:
        r30 = null;
        r42 = (C0034.f34 ^ C0011.f11) + 55502;
        goto L3
    L30:
        String r212 = "ۥۥۥ";
    L31:
        r42 = C0001.m5(r212);
        goto L3
    L33:
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    L34:
        r2 = "ۧ۠ۥ";
        r72 = r30;
        r10 = r31;
        goto L13
    L35:
        r211 = r32;
    L36:
        r32 = r211;
        r42 = (C0032.f32 + C0061.f61) + 1752499;
        goto L3
    L38:
        if (C0069.m276() < 0) goto L41;
        C0022.f22 = 5;
        String r213 = "ۡۦ";
        Drawable r74 = r34;
    L40:
        r34 = r74;
        r42 = C0049.m197(r213);
        goto L3
    L41:
        r213 = "ۦۥۨ";
        r74 = r34;
        goto L40
    L42:
        String r75 = "۟۠ۨ";
        FrameLayout.LayoutParams r214 = r35;
        int r103 = r36;
    L43:
        r35 = r214;
        r36 = r103;
        r42 = C0049.m197(r75);
        goto L3
    L44:
        r11.setPadding(0, ff.q(C0060.f60 ^ 948), 0, ff.q(C0039.f39 ^ (-499)));
        r214 = new FrameLayout.LayoutParams(C0009.f9 ^ 866, C0044.f44 ^ (-355));
        r214.gravity = 80;
        r103 = C0073.f73 ^ 30;
        if (C0015.m61() <= 0) goto L46;
    L53:
        r35 = r214;
        r36 = r103;
        r42 = C0014.m57("ۦۦ۠");
        goto L3
    L46:
        C0030.f30 = 16;
        r75 = "ۣۣۥ";
        goto L43
    L47:
        r42 = (C0046.f46 - C0049.f49) + 1746433;
        goto L3
    L48:
        r27 = r46.getParent();
        r34 = null;
        if ((r27 instanceof ViewGroup) == false) goto L138;
        if ((C0002.f2 + (C0043.f43 % 2667)) <= 0) goto L52;
        r42 = (C0034.f34 | C0021.f21) + 1748203;
        goto L3
    L52:
        r214 = r35;
        r103 = r36;
        goto L53
    L138:
        r74 = null;
    L139:
        r213 = "ۣۣۥ";
        goto L40
    L55:
        r24 = new View(r44);
        r11.addView(r24);
        r3 = new h00();
        r4 = new e00();
    L56:
        r42 = C0073.m292("۠ۤۥ");
        goto L3
    L57:
        if (r29 != null) goto L58;
        r19 = r34;
        goto L143
    L58:
        Drawable r215 = r29.getBackground();
        if (C0026.f26 <= 0) goto L60;
        r41 = r215;
        r19 = r34;
        r42 = (C0069.f69 - C0068.f68) ^ 1753456;
        goto L3
    L60:
        r41 = r215;
        r19 = r34;
        r42 = C0063.m254("ۨۧۡ");
        goto L3
    L63:
        if ((C0047.f47 / (C0061.f61 - 8058)) != 0) goto L64;
        r42 = C0009.m38("ۧ۠ۥ");
        goto L3
    L64:
        r7 = "ۤۢ۟";
        goto L9
    L66:
        r15 = r46.getLayoutParams();
        r14 = r13.indexOfChild(r46);
        FrameLayout r216 = (FrameLayout) r44.findViewById(16908813 ^ C0070.f70);
        r22 = r44.getResources().getDisplayMetrics().density;
        if ((C0046.f46 ^ (C0003.f3 ^ (-7725))) >= 0) goto L68;
    L79:
        r12 = r216;
        r42 = C0003.m13("ۣۤۧ");
        goto L3
    L68:
        r12 = r216;
        r42 = C0041.m164("ۢۧ");
    L70:
        if ((C0045.f45 + (C0057.f57 - 7297)) >= 0) goto L71;
        r42 = (C0056.f56 / C0016.f16) + 1746749;
        goto L3
    L71:
        r212 = "ۣ۟ۦ";
        goto L31
    L73:
        View r217 = (View) r28;
        if (C0008.m33() <= 0) goto L75;
    L110:
        r29 = r217;
        r42 = C0071.m286("ۤ۠ۤ");
        goto L3
    L75:
        r29 = r217;
        goto L56
    L77:
        if ((C0066.f66 - (C0024.f24 / 5063)) <= 0) goto L78;
        r42 = (C0067.f67 ^ C0014.f14) ^ 1756139;
        goto L3
    L78:
        r216 = r12;
        goto L79
    L81:
        r37.addOnAttachStateChangeListener(new dm(r38, 1));
        r37.setOnTouchListener(new mh(1, r38));
        r31 = r31 + (C0020.f20 ^ (-253));
        if ((C0048.f48 * (C0003.f3 % 5611)) <= 0) goto L83;
        r42 = C0067.m271("۟ۨ۠");
        goto L3
    L83:
        C0065.m260();
        r42 = C0036.m144("ۤ۟ۡ");
        goto L3
    L86:
        if (r31 >= r25) goto L151;
        View r218 = r46.getChildAt(r31);
        ip.l(r218);
        View r76 = a80.j(r218);
        if (C0037.f37 >= 0) goto L89;
        String r104 = "ۥۡ";
    L91:
        r37 = r218;
        r38 = r76;
        r42 = C0055.m220(r104);
        goto L3
    L89:
        C0060.f60 = 35;
        r37 = r218;
        r38 = r76;
        r42 = C0073.m292("ۣۢۡ");
    L92:
        r42 = (C0048.f48 ^ C0016.f16) + 1746677;
        goto L3
    L93:
        r23 = new ColorDrawable(0);
        r26 = new h40(r24, h40.l);
        i40 r219 = new i40();
        r219.b(150.0f);
        if (C0066.m265() <= 0) goto L95;
        String r77 = "ۨۤ۟";
    L97:
        r39 = r219;
        r42 = C0009.m38(r77);
        goto L3
    L95:
        r39 = r219;
        r42 = C0010.m43("۟ۥۡ");
        goto L3
    L98:
        r16 = r46.getBackground();
        r17 = r13.getBackground();
        r28 = r13.getParent();
        if ((r28 instanceof View) == false) goto L92;
        if ((C0031.f31 % (C0007.f7 % (-6504))) >= 0) goto L102;
        r42 = (C0023.f23 / C0017.f17) + 1747748;
        goto L3
    L102:
        r42 = C0037.m149("ۥ۠ۥ");
        goto L3
    L104:
        r39.a(0.6f);
        r26.j = r39;
        r211 = new l9(1, r24);
        if (r26.e == true) goto L36;
        r73 = "ۣۧ۠";
        r102 = r33;
        goto L27
    L108:
        if (C0065.f65 >= 0) goto L109;
        r42 = (C0013.f13 + C0000.f0) + 1750529;
        goto L3
    L109:
        C0020.f20 = 52;
        r217 = r29;
        goto L110
    L112:
        if (r13 != null) goto L70;
        if ((C0036.f36 - (C0059.f59 + 7698)) >= 0) goto L115;
        r42 = C0016.m65("ۢۤ");
        goto L3
    L115:
        C0067.m269();
        goto L116
    L118:
        r46.getViewTreeObserver().addOnPreDrawListener(new ps(r3, r4, r5, r6, r44, r8, r9, r46, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r45, r22, r23, r24, r43, r26));
        r25 = r46.getChildCount();
        r21 = 0;
        if ((C0069.f69 * (C0003.f3 / (-5644))) != 0) goto L120;
        r42 = (C0028.f28 * C0054.f54) + 2175770;
        goto L3
    L120:
        C0072.m289();
        r104 = "ۣۧ۟";
        r218 = r37;
        r76 = r38;
        goto L91
    L122:
        r19 = r41;
        r42 = (C0013.f13 | C0051.f51) + 1752755;
        goto L3
    L123:
        r11 = new FrameLayout(r44);
        r11.setTag("miuix_floating_wrapper");
        r11.setClipChildren(false);
        r11.setClipToPadding(false);
        if (C0017.f17 <= 0) goto L125;
        r42 = (C0024.f24 * C0052.f52) ^ 55867;
        goto L3
    L125:
        r77 = "ۦۥۨ";
        r219 = r39;
        goto L97
    L128:
        if (C0035.m143() > 0) goto L130;
        C0069.m276();
        r42 = C0027.m110("ۡۡۦ");
        r31 = r21;
        goto L3
    L130:
        r2 = "ۥۥۥ";
        r72 = r29;
        r10 = r21;
        goto L13
    L131:
        r210 = r40;
        goto L133
    L137:
        r8 = new g00();
        r20 = new i00();
        r9 = new i00();
        r18 = new e00();
        r42 = C0054.m219("ۡۤ");
        goto L3
    L140:
        r35.setMargins(ff.q(r36), 0, ff.q(r36), ff.q(C0065.f65 ^ (-888)));
        r11.setLayoutParams(r35);
        r11.setClipToOutline(true);
        r11.setOutlineProvider(new rs(r22));
        r42 = (C0066.f66 * C0070.f70) + 1270906;
    L143:
        if ((C0020.f20 / (C0024.f24 - 6917)) == 0) goto L146;
        C0022.m88();
        String r220 = "ۢۡۡ";
    L145:
        r42 = C0008.m35(r220);
        goto L3
    L146:
        r220 = "ۥۤۡ";
        goto L145
    L147:
        r4.a = true;
        r5 = new e00();
        r6 = new g00();
        r6.a = -16711936;
        if (C0059.m236() <= 0) goto L149;
        r42 = (C0041.f41 / C0043.f43) + 1755619;
        goto L3
    L149:
        C0060.m240();
        r42 = C0032.m130("ۢۢ۠");
    L151:
        r42 = (C0025.f25 % C0058.f58) + 1750515;
        goto L3
    L152:
        return;
    L153:
        r74 = r34;
        goto L139
    }

    private final void b(XC_MethodHook.MethodHookParam r38) {
        Object[] r4 = null;
        int r19 = 0;
        int r13 = 0;
        Object r30 = null;
        int r20 = 0;
        int r15 = 0;
        Object r12 = null;
        Object r3 = null;
        Notification r18 = null;
        Notification r14 = null;
        Notification r34 = null;
        Bundle r29 = null;
        String r11 = null;
        String r32 = null;
        String r33 = null;
        String r31 = null;
        CharSequence r17 = null;
        String r9 = null;
        String r16 = null;
        String r8 = null;
        String r24 = null;
        String r35 = null;
        String r10 = null;
        StringBuilder r6 = null;
        String r21 = null;
        String r23 = null;
        StringBuilder r22 = null;
        String r28 = null;
        int r36 = C0027.m110("ۣ۟ۡ");
        Integer r25 = null;
        CharSequence r26 = null;
        CharSequence r27 = null;
    L3:
        switch(r36) {
            case 56384: goto L6;
            case 56386: goto L91;
            case 56387: goto L231;
            case 56419: goto L202;
            case 56446: goto L278;
            case 56474: goto L255;
            case 56479: goto L107;
            case 56514: goto L23;
            case 56538: goto L110;
            case 56544: goto L81;
            case 56574: goto L219;
            case 1746692: goto L69;
            case 1746784: goto L81;
            case 1746789: goto L235;
            case 1746813: goto L123;
            case 1746845: goto L116;
            case 1746878: goto L150;
            case 1746879: goto L159;
            case 1746907: goto L86;
            case 1747654: goto L81;
            case 1747657: goto L91;
            case 1747685: goto L48;
            case 1747686: goto L588;
            case 1747812: goto L99;
            case 1747899: goto L9;
            case 1748648: goto L30;
            case 1748676: goto L242;
            case 1748703: goto L293;
            case 1748708: goto L275;
            case 1748738: goto L18;
            case 1748799: goto L245;
            case 1748892: goto L136;
            case 1749573: goto L137;
            case 1749574: goto L151;
            case 1749636: goto L287;
            case 1749638: goto L146;
            case 1749664: goto L136;
            case 1749731: goto L55;
            case 1749795: goto L186;
            case 1749825: goto L41;
            case 1749852: goto L143;
            case 1750533: goto L70;
            case 1750633: goto L260;
            case 1750720: goto L112;
            case 1750725: goto L12;
            case 1750782: goto L191;
            case 1750788: goto L152;
            case 1750815: goto L157;
            case 1751495: goto L269;
            case 1751499: goto L250;
            case 1751528: goto L181;
            case 1751558: goto L45;
            case 1751560: goto L225;
            case 1751621: goto L35;
            case 1751622: goto L282;
            case 1751623: goto L93;
            case 1751624: goto L62;
            case 1751685: goto L127;
            case 1751712: goto L176;
            case 1752492: goto L253;
            case 1752518: goto L168;
            case 1752520: goto L163;
            case 1752549: goto L124;
            case 1752550: goto L131;
            case 1752577: goto L205;
            case 1752641: goto L102;
            case 1752645: goto L588;
            case 1752648: goto L162;
            case 1752677: goto L197;
            case 1752679: goto L289;
            case 1752703: goto L292;
            case 1752710: goto L286;
            case 1752738: goto L214;
            case 1753417: goto L248;
            case 1753453: goto L76;
            case 1753481: goto L256;
            case 1753543: goto L127;
            case 1753634: goto L9;
            case 1754378: goto L208;
            case 1754473: goto L150;
            case 1754475: goto L247;
            case 1754477: goto L60;
            case 1754630: goto L140;
            case 1755338: goto L37;
            case 1755344: goto L266;
            case 1755369: goto L154;
            case 1755462: goto L119;
            case 1755499: goto L185;
            case 1755524: goto L49;
            case 1755531: goto L73;
            default: goto L3;
        };
    L6:
        if ((C0011.f11 % (C0046.f46 + 8995)) >= 0) goto L7;
        r36 = (C0055.f55 * C0008.f8) + 1183421;
        goto L3
    L7:
        C0024.m96();
        r36 = C0034.m138("۟ۥۥ");
        goto L3
    L9:
        if ((C0066.f66 + (C0018.f18 / 5199)) <= 0) goto L10;
        r36 = (C0064.f64 * C0010.f10) + 1847565;
        goto L3
    L10:
        C0057.f57 = 35;
        r36 = C0012.m50("ۣۣۢ");
        goto L3
    L12:
        if (r26 == null) goto L287;
        r32 = r26.toString();     // Catch: Throwable -> L262
        if ((C0025.f25 ^ (C0006.f6 ^ (-7956))) <= 0) goto L16;
        r36 = (C0014.f14 % C0019.f19) + 56590;
        goto L3
    L16:
        C0067.f67 = 72;
        r36 = C0016.m65("ۡ۠ۧ");
    L263:
        z30.o("Nwje\n", "Q2m5jaPP2Zc=\n", "NotificationHook", "Fg==\n", "c8HJlSTQVfc=\n");
        return;
    L18:
        CharSequence r2 = r29.getCharSequence("android.title");     // Catch: Throwable -> L262
        if (C0022.f22 >= 0) goto L21;
        r26 = r2;
        r36 = (C0057.f57 + C0054.f54) ^ 1751025;
        goto L3
    L21:
        r26 = r2;
        r36 = C0053.m213("ۣ۟ۡ");
        goto L3
    L23:
        Object[] r210 = r38.args;     // Catch: Throwable -> L262
        if (C0027.m111() <= 0) goto L26;
        r4 = r210;
        r36 = (-1749796) ^ (C0069.f69 | C0056.f56);
        goto L3
    L26:
        C0030.f30 = 36;
    L27:
        Object r5 = "ۤۢ";
        Object[] r7 = r210;
    L28:
        r4 = r7;
        r36 = C0007.m28(r5);
        goto L3
    L30:
        int r52 = 0;
        if (C0045.f45 >= 0) goto L32;
        r36 = (C0064.f64 ^ C0071.f71) ^ (-1748029);
        r13 = 0;
        goto L3
    L32:
        C0061.m244();
        String r211 = "ۣۧۢ";
    L33:
        r36 = C0054.m219(r211);
        r13 = r52;
        goto L3
    L35:
        r11 = "";
        r36 = (C0071.f71 % C0013.f13) + 1752677;
        goto L3
    L37:
        r38.setResult(null);     // Catch: Throwable -> L262
        String r222 = "NotificationHook";     // Catch: Throwable -> L262
        StringBuilder r72 = new StringBuilder();     // Catch: Throwable -> L262
        String r53 = "۟ۦۢ";
        r23 = r222;
    L39:
        r22 = r72;
        r36 = C0042.m170(r53);
        goto L3
    L41:
        if ((C0031.f31 + (C0044.f44 + 154)) <= 0) goto L42;
        r35 = r24;
        r36 = C0057.m229("ۣ۟ۡ");
        goto L3
    L42:
        r35 = r24;
        r36 = C0063.m254("ۣۦ");
        goto L3
    L45:
        if (b50.B(r21, "@All", true) == false) goto L81;
        r36 = (C0065.f65 + C0052.f52) ^ (-1747884);
        goto L3
    L48:
        r36 = (C0022.f22 / C0070.f70) ^ (-1746879);
        goto L3
    L49:
        CharSequence r212 = r34.tickerText;     // Catch: Throwable -> L262
        if (C0018.f18 <= 0) goto L52;
        r27 = r212;
        r36 = (C0037.f37 - C0029.f29) + 1753026;
        goto L3
    L52:
        C0011.m44();
        r27 = r212;
        r36 = C0014.m57("ۥۦۨ");
        goto L3
    L55:
        if (C0026.f26 <= 0) goto L56;
        r36 = (C0047.f47 + C0025.f25) + 1751362;
        goto L3
    L56:
        C0065.f65 = 15;
        String r213 = "ۤۢ۠";
    L57:
        r36 = C0040.m160(r213);
        goto L3
    L60:
        r20 = r15 + (C0046.f46 ^ 381);
    L61:
        r36 = C0021.m86("ۡۡۤ");
        goto L3
    L62:
        if (r17 == null) goto L69;
        r9 = r17.toString();     // Catch: Throwable -> L262
        if (C0024.f24 <= 0) goto L66;
        r36 = (C0034.f34 ^ C0021.f21) + 1752891;
        goto L3
    L66:
        C0043.m172();
    L67:
        r36 = C0010.m43("ۣۡۤ");
    L69:
        r36 = (C0021.f21 + C0010.f10) + 1749923;
        goto L3
    L70:
        ip.o("param", r38);
        if (z30.q("pDSLXSnjG6ykDpN2FO4Yow==\n", "z1HyAkuPdM8=\n", gn.a) == true) goto L250;
        r213 = "ۤۦۢ";
        goto L57
    L73:
        if (r32 != null) goto L152;
        r36 = (C0033.f33 * C0064.f64) + 1722318;
        goto L3
    L76:
        if ((C0001.f1 - (C0058.f58 + 5923)) < 0) goto L79;
        C0000.m0();
        String r214 = "ۤۦۢ";
        r8 = r9;
        Notification r54 = r14;
        int r73 = r15;
    L78:
        r14 = r54;
        r36 = C0069.m277(r214);
        r15 = r73;
        goto L3
    L79:
        r5 = "ۣۧۢ";
        r7 = r4;
        r8 = r9;
    L81:
        if ((C0021.f21 / (C0016.f16 ^ (-490))) <= 0) goto L82;
        String r215 = "ۥۥۥ";
        CharSequence r55 = r17;
    L85:
        r17 = r55;
        r36 = C0053.m213(r215);
        goto L3
    L82:
        C0040.f40 = 23;
        String r216 = "ۣۤۤ";
    L83:
        r36 = C0022.m90(r216);
        goto L3
    L86:
        r22.append("🔕 成功静默拦截 @所有人 通知: ");     // Catch: Throwable -> L262
        if (C0042.m169() <= 0) goto L89;
        r36 = C0056.m226("ۣۢۨ");
        goto L3
    L89:
        C0070.m280();
        r36 = C0055.m220("ۥۡۢ");
    L91:
        r36 = (C0016.f16 - C0016.f16) + 1752550;
        goto L3
    L93:
        if (C0046.m185() > 0) goto L119;
        Integer r217 = Integer.valueOf(C0006.m27("h8GeLYSXVYhmEOWZmU1dxE"));
        if (C0049.m199() >= 0) goto L96;
        r25 = r217;
        r36 = (C0063.f63 | C0068.f68) ^ (-1755744);
        goto L3
    L96:
        r25 = r217;
        r36 = C0065.m263("ۨ۟ۡ");
        goto L3
    L99:
        if (b50.B(r21, "\uff20\u6240\u6709\u4eba", false) == true) goto L150;
        r36 = (C0042.f42 + C0045.f45) ^ (-1752681);
        goto L3
    L102:
        if ((C0026.f26 - (C0053.f53 % (-6839))) > 0) goto L105;
        String r218 = "ۥۤ";
    L104:
        r34 = r18;
        r36 = C0049.m197(r218);
        goto L3
    L105:
        r218 = "ۥۢۢ";
        goto L104
    L107:
        if (C0057.m230() >= 0) goto L108;
        r36 = (C0042.f42 - C0034.f34) + 1751537;
        goto L3
    L108:
        r36 = C0065.m263("ۡۦۥ");
        goto L3
    L110:
        r31 = r32;
        r36 = C0060.m241("ۨۥۨ");
        goto L3
    L112:
        if (C0061.m244() <= 0) goto L113;
        r31 = r33;
        r36 = (C0055.f55 % C0042.f42) + 1755007;
        goto L3
    L113:
        C0072.f72 = 22;
        r31 = r33;
        r36 = C0044.m176("ۧۢۤ");
        goto L3
    L116:
        if ((r30 instanceof Notification) == false) goto L275;
        r3 = r30;
        r36 = (C0056.f56 - C0038.f38) ^ 1755277;
    L119:
        if (C0003.f3 > 0) goto L122;
        C0042.f42 = 49;
        String r219 = "۠ۨۦ";
    L121:
        r36 = C0020.m80(r219);
        goto L3
    L122:
        r216 = "۠۠ۦ";
        goto L83
    L123:
        r10 = r35;
        r36 = (C0071.f71 / C0070.f70) + 1752551;
        goto L3
    L124:
        String r220 = "۠ۧۢ";
    L125:
        r36 = C0018.m73(r220);
        goto L3
    L127:
        if ((C0032.f32 % (C0070.f70 ^ 9368)) < 0) goto L130;
        C0064.f64 = 0;
        String r221 = "ۥۣ";
        String r56 = r16;
    L129:
        r16 = r56;
        r36 = C0010.m43(r221);
        goto L3
    L130:
        r221 = "ۥۡۢ";
        r56 = r16;
        goto L129
    L131:
        r6 = new StringBuilder();     // Catch: Throwable -> L262
        if (C0066.f66 > 0) goto L135;
        r36 = C0031.m127("ۣۢۡ");
        goto L3
    L135:
        r5 = "ۢۥ";
        r7 = r4;
        goto L28
    L136:
        r36 = (C0053.f53 | C0044.f44) + 1754251;
        goto L3
    L137:
        if (r24 != null) goto L146;
        r10 = r11;
        r36 = (C0009.f9 / C0006.f6) ^ (-1752578);
        goto L3
    L140:
        if (r15 >= r19) goto L286;
        r30 = r4[r15];     // Catch: Throwable -> L262
        r36 = (C0058.f58 % C0062.f62) + 1745990;
        goto L3
    L143:
        if (r34 != null) goto L289;
    L144:
        r220 = "ۧۢۦ";
    L146:
        if (C0009.f9 >= 0) goto L147;
        String r57 = "ۢۧۦ";
    L149:
        r36 = C0038.m153(r57);
        goto L3
    L147:
        r215 = "ۣۨۡ";
        r55 = r17;
    L150:
        r36 = (C0052.f52 - C0052.f52) + 1755338;
        goto L3
    L151:
        r211 = "ۥۡۢ";
        r3 = r12;
        r52 = r13;
    L152:
        r221 = "ۧ۟ۢ";
        r56 = r16;
    L154:
        if (C0023.f23 <= 0) goto L155;
        r36 = (C0009.f9 % C0003.f3) + 1755552;
        goto L3
    L155:
        C0030.f30 = 44;
        r36 = C0001.m5("ۦ۠ۥ");
        goto L3
    L157:
        r221 = "ۣۤۤ";
        r56 = r16;
        goto L129
    L159:
        if (C0012.f12 <= 0) goto L160;
        r34 = r14;
        r36 = (C0066.f66 / C0017.f17) + 1749851;
        goto L3
    L160:
        C0040.f40 = 19;
        r34 = r14;
        r36 = C0067.m271("ۢۢ۠");
        goto L3
    L162:
        r5 = "ۦۡۤ";
        r7 = r4;
        r10 = r11;
        goto L28
    L163:
        if (r29 == null) goto L287;
        if (C0043.m172() < 0) goto L67;
        C0012.f12 = 91;
        r36 = C0030.m120("ۥۥۥ");
        goto L3
    L168:
        if ((r3 instanceof Notification) == false) goto L248;
        Notification r0 = (Notification) r3;     // Catch: Throwable -> L262
        if (C0003.m14() < 0) goto L174;
        String r58 = "ۥۢۢ";
        Notification r74 = r0;
    L173:
        r18 = r74;
        r36 = C0001.m5(r58);
        goto L3
    L174:
        r58 = "ۥۥۡ";
        r74 = r0;
        goto L173
    L176:
        if (C0010.f10 >= 0) goto L177;
        r36 = (C0034.f34 + C0023.f23) + 1747094;
        goto L3
    L177:
        C0035.m143();
    L178:
        r36 = C0043.m173("ۢۢ");
        goto L3
    L181:
        if ((C0002.f2 / (C0021.f21 + 7368)) != 0) goto L182;
        r8 = r16;
    L184:
        r36 = C0059.m239("ۨۥۡ");
        goto L3
    L182:
        r8 = r16;
        r36 = C0012.m50("ۢۡۥ");
        goto L3
    L185:
        System.out.println(r25);
        r36 = (C0058.f58 % C0020.f20) + 1747593;
        goto L3
    L186:
        ip.n("args", r4);     // Catch: Throwable -> L262
        r19 = r4.length;     // Catch: Throwable -> L262
        if (C0041.f41 > 0) goto L190;
        r36 = C0029.m116("۟۟ۤ");
        goto L3
    L190:
        r58 = "ۡ۠ۧ";
        r74 = r18;
        goto L173
    L191:
        if (r9 != null) goto L154;
        if (C0057.m230() >= 0) goto L194;
        r36 = (C0031.f31 + C0049.f49) + 1748851;
        goto L3
    L194:
        C0038.m155();
    L195:
        r36 = C0061.m246("ۥۨۥ");
        goto L3
    L197:
        ip.o("msg", r28);     // Catch: Throwable -> L262
        if (C0057.f57 >= 0) goto L200;
        r36 = (C0029.f29 % C0059.f59) + 1751865;
        goto L3
    L200:
        r36 = C0066.m264("ۨ۠ۡ");
        goto L3
    L202:
        ip.o("tag", r23);     // Catch: Throwable -> L262
        r36 = C0041.m164("ۥۦۦ");
        goto L3
    L205:
        if (C0001.f1 < 0) goto L207;
        C0034.f34 = 74;
        goto L184
    L207:
        r219 = "۠۟ۨ";
        goto L121
    L208:
        if (r29 == null) goto L69;
        r55 = r29.getCharSequence("android.text");     // Catch: Throwable -> L262
        if (C0017.m71() > 0) goto L213;
        C0063.f63 = 39;
        r17 = r55;
        r36 = C0037.m149("ۨۥۨ");
        goto L3
    L213:
        r215 = "ۣۤۧ";
        goto L85
    L214:
        r6.append(r8);     // Catch: Throwable -> L262
        if (C0030.m121() >= 0) goto L217;
        r36 = (C0059.f59 / C0001.f1) ^ 1751492;
        goto L3
    L217:
        r36 = C0053.m213("ۥ۟");
        goto L3
    L219:
        Bundle r223 = r34.extras;     // Catch: Throwable -> L262
        if (C0037.f37 < 0) goto L223;
        C0000.m0();
    L223:
        r29 = r223;
        r36 = C0069.m277("ۣۤۤ");
        goto L3
    L225:
        if (b50.B(r21, "@\u6240\u6709\u4eba", false) == true) goto L150;
        if ((C0019.f19 + (C0013.f13 * (-7253))) > 0) goto L229;
        C0068.m273();
        goto L144
    L229:
        String r224 = "۠ۤۨ";
    L230:
        r36 = C0012.m50(r224);
        goto L3
    L231:
        r6.append(r31);     // Catch: Throwable -> L262
        if (C0047.f47 >= 0) goto L61;
        r210 = r4;
        goto L27
    L235:
        r6.append(r10);     // Catch: Throwable -> L262
        String r225 = r6.toString();     // Catch: Throwable -> L262
        if (C0033.f33 <= 0) goto L238;
        r57 = "ۤۡۥ";
        r21 = r225;
        goto L149
    L238:
        C0052.m210();
    L239:
        r53 = "۟ۢۨ";
        r72 = r22;
        r21 = r225;
        goto L39
    L242:
        if (C0034.f34 < 0) goto L244;
        C0018.f18 = 57;
        r36 = C0002.m8("ۣۨۡ");
        r15 = r20;
        goto L3
    L244:
        r15 = r20;
        goto L178
    L245:
        r56 = "";
        r221 = "ۤ۠ۤ";
        goto L129
    L247:
        r36 = C0016.m65("ۧۧ");
    L248:
        r36 = C0017.m70("ۣۤۥ");
    L250:
        if ((C0008.f8 * (C0028.f28 / 168)) <= 0) goto L251;
        r36 = (C0061.f61 % C0060.f60) + 56036;
        goto L3
    L251:
        C0022.f22 = 43;
        r57 = "ۣۡۦ";
        goto L149
    L253:
        r33 = "";
        r36 = (C0068.f68 + C0041.f41) + 1751092;
        goto L3
    L255:
        r36 = (C0001.f1 | C0061.f61) + 1748771;
        goto L3
    L256:
        if (r27 == null) goto L91;
        String r59 = r27.toString();     // Catch: Throwable -> L262
        String r226 = "ۢ۟ۢ";
    L259:
        r24 = r59;
        r36 = C0063.m254(r226);
        goto L3
    L260:
        r22.append(r21);     // Catch: Throwable -> L262
        r28 = r22.toString();     // Catch: Throwable -> L262
        r36 = (C0003.f3 ^ C0006.f6) ^ 56978;
        goto L3
    L588:
        return;
    L266:
        if ((C0013.f13 | (C0022.f22 + 4307)) >= 0) goto L267;
        r36 = (C0021.f21 % C0040.f40) ^ (-1751852);
        goto L3
    L267:
        C0042.f42 = 22;
        r36 = C0060.m241("ۣۤۧ");
        goto L3
    L269:
        r6.append(" | ");     // Catch: Throwable -> L262
        if ((C0004.f4 ^ (C0068.f68 ^ (-5562))) < 0) goto L273;
        C0040.m162();
        r36 = C0044.m176("۟ۤۢ");
        goto L3
    L273:
        r225 = r21;
    L275:
        if ((C0060.f60 * (C0043.f43 | (-4594))) >= 0) goto L276;
        r36 = (C0061.f61 - C0000.f0) ^ (-1754455);
        goto L3
    L276:
        C0063.f63 = 53;
        r224 = "ۡۢۢ";
        goto L230
    L278:
        r6.append(" | ");     // Catch: Throwable -> L262
        if (C0000.m0() < 0) goto L195;
        C0020.m82();
        r36 = C0047.m189("ۨ۟ۧ");
        goto L3
    L282:
        r54 = null;
        if (C0014.f14 < 0) goto L285;
        C0003.m14();
        r14 = null;
        r36 = C0018.m73("۠ۤۨ");
        goto L3
    L285:
        r214 = "۟ۥۥ";
        r73 = r15;
    L286:
        r36 = C0047.m189("ۥۧۡ");
    L287:
        r36 = C0043.m173("ۥ۠ۧ");
    L289:
        if ((C0046.f46 - (C0037.f37 + 7586)) >= 0) goto L290;
        r36 = (C0040.f40 | C0023.f23) ^ 57089;
        goto L3
    L290:
        C0055.m223();
        r226 = "ۧ۠ۤ";
        r59 = r24;
        goto L259
    L292:
        r12 = null;
        r36 = (C0060.f60 * C0018.f18) + 1553184;
        goto L3
    L293:
        r214 = "ۧۧۦ";
        r54 = r14;
        r73 = r13;
        goto L78
    }

    private final void c(XC_MethodHook.MethodHookParam r15) {
        String r8 = null;
        gn r1 = null;
        int r9 = 0;
        int r5 = 0;
        String r6 = null;
        String r4 = null;
        String r3 = null;
        String r7 = null;
        int r12 = C0050.m203("ۧ۟ۥ");
        String r10 = null;
        String r11 = null;
    L3:
        switch(r12) {
            case 56291: goto L97;
            case 56419: goto L26;
            case 56568: goto L80;
            case 1746688: goto L94;
            case 1746726: goto L80;
            case 1746939: goto L69;
            case 1747781: goto L61;
            case 1748641: goto L72;
            case 1748676: goto L77;
            case 1748864: goto L7;
            case 1749668: goto L16;
            case 1750569: goto L22;
            case 1750624: goto L89;
            case 1751686: goto L45;
            case 1751775: goto L29;
            case 1752609: goto L95;
            case 1753478: goto L11;
            case 1753516: goto L85;
            case 1753546: goto L82;
            case 1753696: goto L31;
            case 1754381: goto L46;
            case 1754570: goto L65;
            case 1754662: goto L62;
            case 1755370: goto L31;
            case 1755376: goto L42;
            case 1755431: goto L26;
            default: goto L3;
        };
    L95:
        gn.a.getClass();     // Catch: Throwable -> L53
    L40:
        r12 = C0073.m292("ۣۢ۟");
    L54:
        gn r2 = gn.a;     // Catch: Throwable -> L34
        Integer r0 = b50.R(r11);     // Catch: Throwable -> L34
        if (r0 == null) goto L45;
        r5 = r0.intValue();     // Catch: Throwable -> L34
        if ((C0050.f50 / (C0042.f42 | 4645)) != 0) goto L59;
        String r02 = "ۨ۠ۢ";
        r1 = r2;
    L18:
        r12 = C0048.m193(r02);
        goto L3
    L59:
        C0059.f59 = 44;
        r1 = r2;
        r12 = C0029.m116("ۣ۠ۦ");
    L36:
        if ((C0044.f44 * (C0001.f1 + 9599)) <= 0) goto L37;
        r7 = r11;
        r12 = (C0059.f59 * C0067.f67) + 1637894;
        goto L3
    L37:
        C0016.m66();
        r7 = r11;
        r12 = C0018.m73("ۨ۠ۢ");
        goto L3
    L97:
        r1.getClass();     // Catch: Throwable -> L34
        r6 = String.valueOf(gn.b(r10, r5));     // Catch: Throwable -> L34
        r12 = (C0047.f47 / C0058.f58) ^ 1753478;
        goto L3
    L7:
        r15.args[0] = r3;
        if ((C0009.f9 | (C0019.f19 % (-1655))) >= 0) goto L9;
    L87:
        r12 = C0044.m176("۟۟۠");
        goto L3
    L9:
        C0022.m88();
        r12 = C0062.m249("ۨ۠");
        goto L3
    L11:
        if (C0039.f39 >= 0) goto L12;
        String r03 = "ۦۣۧ";
        String r22 = r6;
    L14:
        r7 = r22;
        r12 = C0043.m173(r03);
        goto L3
    L12:
        C0008.f8 = 19;
        r7 = r6;
        r12 = C0005.m23("ۦۣۧ");
        goto L3
    L16:
        if (C0042.f42 >= 0) goto L17;
        String r04 = "ۡۧۦ";
        r3 = r4;
    L20:
        r12 = C0056.m226(r04);
        goto L3
    L17:
        C0000.m0();
        r02 = "ۧۨۧ";
        r3 = r4;
        goto L18
    L22:
        if (C0029.m118() <= 0) goto L23;
        r12 = (C0026.f26 % C0003.f3) + 55609;
        goto L3
    L23:
        C0014.m58();
        r12 = C0021.m86("ۣۤۨ");
        goto L3
    L26:
        if (C0038.m155() <= 0) goto L27;
        r12 = (C0045.f45 / C0017.f17) + 1748864;
        goto L3
    L27:
        C0010.f10 = 94;
        r04 = "ۧۡ";
        goto L20
    L29:
        String r05 = "key_wallet_val";
        String r23 = "999999.99";
        r12 = (C0057.f57 | C0001.f1) ^ (-1748490);
        r10 = r05;
        r11 = r23;
        goto L3
    L31:
        if ((C0033.f33 ^ (C0021.f21 / 6331)) <= 0) goto L32;
        r12 = (C0040.f40 * C0025.f25) + 472343;
        goto L3
    L32:
        C0001.f1 = 28;
        r12 = C0011.m45("۠ۡ۠");
    L42:
        if (C0045.m181() <= 0) goto L43;
        r12 = (C0066.f66 / C0016.f16) + 1746687;
        goto L3
    L43:
        C0010.f10 = 99;
        r12 = C0005.m23("ۨ۟ۨ");
    L45:
        r12 = (C0071.f71 - C0064.f64) ^ (-1753944);
        goto L3
    L46:
        ip.o("p", r15);
        if (gt.i("key_wallet_on") == false) goto L42;
        if ((C0064.f64 % (C0023.f23 ^ (-5141))) <= 0) goto L50;
        String r06 = "ۣۤۨ";
    L52:
        r12 = C0052.m209(r06);
        goto L3
    L50:
        C0045.f45 = 96;
        r03 = "ۣ۠ۨ";
        r22 = r7;
        goto L14
    L61:
        r12 = (C0047.f47 ^ C0035.f35) + 1755006;
        goto L3
    L62:
        String r07 = "۟ۢ";
        r5 = r9;
    L63:
        r12 = C0004.m16(r07);
        goto L3
    L65:
        if (C0018.f18 > 0) goto L67;
        C0005.f5 = 90;
        r3 = r8;
        r12 = C0020.m80("ۤۥۧ");
        goto L3
    L67:
        r07 = "ۣ۠ۦ";
        r3 = r8;
        goto L63
    L69:
        if ((C0044.f44 * (C0063.f63 ^ (-1569))) >= 0) goto L70;
        r12 = (C0052.f52 * C0025.f25) + 2179308;
        goto L3
    L70:
        C0062.m248();
        r07 = "ۤۦۢ";
        goto L63
    L72:
        ip.o(z30.k("3f5Z\n", "tpsgeLwwj7M=\n", r10, "lNdk\n", "8LICxVL6724=\n"), r11);
        if ((C0012.f12 % (C0054.f54 | 7892)) <= 0) goto L74;
        r12 = (C0067.f67 ^ C0017.f17) ^ (-1752174);
        goto L3
    L74:
        C0012.m51();
        r12 = C0072.m288("ۦۨۢ");
        goto L3
    L77:
        if ((C0062.f62 * (C0008.f8 | (-4756))) <= 0) goto L78;
        r12 = (C0008.f8 * C0054.f54) + 2419830;
        goto L3
    L78:
        C0014.f14 = 99;
        r06 = "ۥۤۡ";
        goto L52
    L80:
        r12 = (C0057.f57 % C0007.f7) + 1753978;
        goto L3
    L82:
        if ((C0026.f26 | (C0059.f59 + 9961)) <= 0) goto L83;
        r4 = r7;
        r12 = (C0034.f34 | C0054.f54) ^ (-1749949);
        goto L3
    L83:
        C0025.f25 = 86;
        r4 = r7;
        r12 = C0008.m35("ۦۢۨ");
        goto L3
    L85:
        r9 = 0;
        if ((C0007.f7 % (C0009.f9 | 419)) <= 0) goto L87;
        r06 = "ۧۨۧ";
        goto L52
    L89:
        r8 = gn.d(r10, r11);     // Catch: Throwable -> L53
        if ((C0014.f14 % (C0046.f46 | 5662)) >= 0) goto L92;
        r12 = (C0000.f0 + C0053.f53) + 1753975;
        goto L3
    L92:
        r12 = C0066.m264("ۦۡۡ");
        goto L3
    }

    private final void d(XC_MethodHook.MethodHookParam r49) {
        CharSequence r29 = null;
        TextView r35 = null;
        TextView r34 = null;
        CharSequence r25 = null;
        CharSequence r28 = null;
        String r5 = null;
        boolean r6 = false;
        boolean r7 = false;
        boolean r24 = false;
        boolean r12 = false;
        String r16 = null;
        ConcurrentHashMap r13 = null;
        Integer r14 = null;
        Object r17 = null;
        String r26 = null;
        String r27 = null;
        boolean r32 = false;
        boolean r31 = false;
        Object r23 = null;
        Object r20 = null;
        Object r4 = null;
        boolean r11 = false;
        boolean r9 = false;
        String r8 = null;
        String r10 = null;
        String r39 = null;
        String r40 = null;
        String r30 = null;
        int r36 = 0;
        int r47 = 0;
        String r41 = null;
        String r37 = null;
        String r33 = null;
        i00 r22 = null;
        String r21 = null;
        String r38 = null;
        int r46 = C0002.m8("ۧ۠۠");
        gn r42 = null;
        String r43 = null;
        Locale r44 = null;
        String r45 = null;
    L3:
        switch(r46) {
            case 56319: goto L6;
            case 56322: goto L82;
            case 56382: goto L83;
            case 56451: goto L394;
            case 56481: goto L179;
            case 56510: goto L416;
            case 56545: goto L366;
            case 56572: goto L440;
            case 1746692: goto L8;
            case 1746725: goto L178;
            case 1746752: goto L207;
            case 1746753: goto L376;
            case 1746755: goto L179;
            case 1746782: goto L240;
            case 1746813: goto L121;
            case 1746814: goto L226;
            case 1746850: goto L449;
            case 1746906: goto L60;
            case 1746909: goto L42;
            case 1746937: goto L332;
            case 1746940: goto L46;
            case 1746973: goto L393;
            case 1747648: goto L145;
            case 1747651: goto L359;
            case 1747718: goto L229;
            case 1747742: goto L444;
            case 1747745: goto L46;
            case 1747748: goto L354;
            case 1747779: goto L75;
            case 1747807: goto L278;
            case 1747899: goto L13;
            case 1748610: goto L420;
            case 1748612: goto L109;
            case 1748616: goto L100;
            case 1748644: goto L46;
            case 1748703: goto L46;
            case 1748706: goto L90;
            case 1748708: goto L262;
            case 1748709: goto L334;
            case 1748733: goto L174;
            case 1748800: goto L282;
            case 1748802: goto L25;
            case 1748827: goto L464;
            case 1748865: goto L158;
            case 1748866: goto L267;
            case 1748888: goto L212;
            case 1748896: goto L256;
            case 1749609: goto L124;
            case 1749610: goto L272;
            case 1749634: goto L361;
            case 1749635: goto L346;
            case 1749729: goto L17;
            case 1749788: goto L88;
            case 1749794: goto L46;
            case 1749821: goto L170;
            case 1750537: goto L465;
            case 1750597: goto L66;
            case 1750626: goto L46;
            case 1750632: goto L185;
            case 1750633: goto L429;
            case 1750724: goto L314;
            case 1750748: goto L23;
            case 1750750: goto L215;
            case 1750752: goto L56;
            case 1750757: goto L137;
            case 1750784: goto L358;
            case 1750785: goto L46;
            case 1750810: goto L13;
            case 1751492: goto L132;
            case 1751497: goto L342;
            case 1751498: goto L467;
            case 1751525: goto L46;
            case 1751556: goto L401;
            case 1751558: goto L364;
            case 1751589: goto L139;
            case 1751616: goto L338;
            case 1751712: goto L158;
            case 1751745: goto L259;
            case 1751772: goto L202;
            case 1751776: goto L471;
            case 1752487: goto L65;
            case 1752519: goto L46;
            case 1752610: goto L260;
            case 1752639: goto L46;
            case 1752648: goto L271;
            case 1752670: goto L289;
            case 1752675: goto L259;
            case 1752701: goto L426;
            case 1752732: goto L283;
            case 1752734: goto L438;
            case 1753420: goto L48;
            case 1753422: goto L78;
            case 1753448: goto L326;
            case 1753452: goto L78;
            case 1753480: goto L243;
            case 1753484: goto L170;
            case 1753508: goto L318;
            case 1753539: goto L372;
            case 1753541: goto L38;
            case 1753542: goto L120;
            case 1753573: goto L132;
            case 1753574: goto L254;
            case 1753575: goto L161;
            case 1753666: goto L464;
            case 1753695: goto L469;
            case 1754375: goto L198;
            case 1754407: goto L191;
            case 1754444: goto L372;
            case 1754474: goto L419;
            case 1754499: goto L379;
            case 1754503: goto L253;
            case 1754506: goto L404;
            case 1754539: goto L370;
            case 1754569: goto L306;
            case 1754594: goto L117;
            case 1754626: goto L15;
            case 1754627: goto L381;
            case 1754631: goto L461;
            case 1754659: goto L350;
            case 1755344: goto L434;
            case 1755371: goto L59;
            case 1755372: goto L95;
            case 1755374: goto L369;
            case 1755399: goto L136;
            case 1755434: goto L128;
            case 1755437: goto L388;
            case 1755461: goto L401;
            case 1755464: goto L56;
            case 1755466: goto L236;
            case 1755499: goto L293;
            case 1755525: goto L293;
            case 1755562: goto L152;
            case 1755586: goto L261;
            case 1755592: goto L222;
            case 1755622: goto L323;
            default: goto L3;
        };
    L465:
        ip.n("ROOT", r44);     // Catch: Throwable -> L458
        r8 = r43.toLowerCase(r44);     // Catch: Throwable -> L458
        if ((C0072.f72 % (C0050.f50 % (-6279))) >= 0) goto L33;
        String r3 = "ۣۧ۟";
    L36:
        r46 = C0016.m65(r3);
        goto L3
    L33:
        C0057.f57 = 62;
        String r310 = "ۢۡۢ";
    L34:
        r46 = C0054.m219(r310);
    L459:
        r45 = r16;
        r46 = (C0050.f50 ^ C0002.f2) + 1752755;
        goto L3
    L467:
        r42.getClass();     // Catch: Throwable -> L296
        r41 = String.valueOf(gn.b(r39, r47));     // Catch: Throwable -> L296
        if ((C0037.f37 ^ (C0010.f10 + 9290)) >= 0) goto L149;
        r46 = C0045.m182("ۦۤۥ");
        goto L3
    L149:
        C0044.m178();
        r46 = C0013.m53("ۦ۠ۢ");
    L298:
        if ((C0027.f27 ^ (C0049.f49 * (-9463))) <= 0) goto L299;
        r38 = r40;
        r46 = (C0040.f40 * C0044.f44) + 1573199;
        goto L3
    L299:
        C0026.f26 = 44;
        r38 = r40;
        r46 = C0041.m164("ۡ۟ۦ");
        goto L3
    L469:
        r26 = gn.c(r34);     // Catch: Throwable -> L104
        if (C0019.f19 <= 0) goto L251;
        r46 = (C0030.f30 | C0045.f45) ^ (-1746683);
        goto L3
    L251:
        C0043.m172();
        r46 = C0045.m182("ۢ۠ۨ");
    L105:
        r27 = "";
        if ((C0056.f56 ^ (C0028.f28 % (-2217))) <= 0) goto L107;
        r46 = (C0041.f41 * C0011.f11) ^ (-1779532);
        goto L3
    L107:
        C0000.m0();
        r46 = C0034.m138("ۧۡۦ");
        goto L3
    L471:
        String r311 = gn.d(r39, r40);     // Catch: Throwable -> L301
    L165:
        if ((C0038.f38 | (C0043.f43 + 9128)) >= 0) goto L166;
        boolean r15 = r31;
    L168:
        r30 = r311;
        r31 = r15;
        r46 = C0051.m207("ۧۧۧ");
        goto L3
    L166:
        C0037.m150();
        r30 = r311;
        r46 = C0060.m241("ۨۤۧ");
    L302:
        gn r312 = gn.a;     // Catch: Throwable -> L296
        Integer r152 = b50.R(r40);     // Catch: Throwable -> L296
        if (r152 == null) goto L65;
        int r18 = r152.intValue();     // Catch: Throwable -> L296
        r42 = r312;
        r46 = (C0063.f63 % C0057.f57) ^ 1752619;
        r47 = r18;
        goto L3
    L6:
        if (C0070.f70 <= 0) goto L7;
        String r313 = "ۣۡ۠";
    L134:
        r46 = C0012.m50(r313);
        goto L3
    L7:
        C0006.f6 = 15;
        r46 = C0024.m98("ۧ۠۠");
        goto L3
    L8:
        boolean r153 = true;
        if ((C0048.f48 | (C0053.f53 % (-2916))) <= 0) goto L10;
        String r314 = "ۣۦ۟";
    L12:
        r24 = r153;
        r46 = C0037.m149(r314);
        goto L3
    L10:
        C0069.m276();
        r24 = true;
        r46 = C0073.m292("ۣۣۨ");
    L13:
        String r315 = "ۣۢۨ";
    L14:
        r46 = C0019.m79(r315);
        goto L3
    L15:
        r46 = (C0073.f73 / C0049.f49) + 1747899;
        goto L3
    L17:
        if (pb0.F0.contains(r27) == false) goto L282;
        if ((C0060.f60 + (C0054.f54 - 8862)) >= 0) goto L20;
        String r316 = r37;
    L22:
        r37 = r316;
        r46 = C0044.m176("ۦۣۣ");
        goto L3
    L20:
        C0060.m240();
        r46 = C0067.m271("ۤ۠ۡ");
        goto L3
    L23:
        String r317 = "ۡ۟ۢ";
        r12 = r24;
    L24:
        r46 = C0068.m272(r317);
        goto L3
    L25:
        if (r34 != null) goto L338;
        if (C0017.m71() <= 0) goto L28;
        r46 = (C0065.f65 - C0044.f44) + 1753821;
        goto L3
    L28:
        C0020.f20 = 85;
        r46 = C0059.m239("ۣ۠ۦ");
        goto L3
    L38:
        if ((C0064.f64 * (C0060.f60 | (-3044))) >= 0) goto L39;
        r33 = r37;
        r46 = C0057.m229("ۢۦ۠");
        goto L3
    L39:
        r33 = r37;
        r46 = C0041.m164("ۧۥۧ");
        goto L3
    L42:
        if (C0026.f26 <= 0) goto L43;
        String r154 = "ۣۧۤ";
        CharSequence r182 = r25;
        String r19 = r26;
    L45:
        r25 = r182;
        r27 = r19;
        r46 = C0029.m116(r154);
        goto L3
    L43:
        C0048.m194();
        r27 = r26;
        r46 = C0015.m60("ۣۦ۟");
    L46:
        r46 = (C0033.f33 * C0045.f45) + 1817010;
        goto L3
    L48:
        if (Build.VERSION.SDK_INT < 31) goto L124;
        if (C0032.f32 >= 0) goto L51;
        String r318 = "ۣۡۢ";
    L54:
        r46 = C0006.m26(r318);
        goto L3
    L51:
        C0013.m52();
    L52:
        r46 = C0013.m53("۠ۢ");
        goto L3
    L56:
        if ((C0042.f42 + (C0035.f35 / (-5247))) >= 0) goto L57;
        r46 = (C0005.f5 | C0008.f8) + 1755466;
        goto L3
    L57:
        r3 = "ۨۧ۟";
        goto L36
    L59:
        ip.o(z30.k("3f5Z\n", "tpsgeLwwj7M=\n", r39, "lNdk\n", "8LICxVL6724=\n"), r40);
        r46 = (C0042.f42 + C0055.f55) + 1754948;
        goto L3
    L60:
        r11 = false;
        if (C0032.f32 < 0) goto L64;
        C0066.m265();
        String r319 = r10;
    L63:
        r10 = r319;
        r46 = C0052.m209("ۤ۟ۤ");
        goto L3
    L64:
        r314 = "ۡ۟ۦ";
        r153 = r24;
    L65:
        r46 = (C0056.f56 * C0027.f27) ^ 1798501;
        goto L3
    L66:
        if (r7 == false) goto L46;
        if (r9 == false) goto L46;
        if (gt.j("key_privacy_style", 0) != 1) goto L416;
        if (Build.VERSION.SDK_INT < 31) goto L416;
        float r320 = Math.max(1.0f, (gt.j("key_privacy_blur_intensity", 100) / 100.0f) * 10.0f);
        Shader.TileMode r155 = Shader.TileMode.CLAMP;
        p7.r(r34, p7.e(r320, r320));
        if ((C0002.f2 ^ (C0071.f71 / 6051)) <= 0) goto L74;
    L143:
        r46 = C0069.m277("۠۟");
        goto L3
    L74:
        r46 = C0064.m258("ۣۤۡ");
        goto L3
    L75:
        int r156 = 0;
        String r321 = "۟۠ۦ";
    L76:
        r46 = C0068.m272(r321);
        r36 = r156;
        goto L3
    L78:
        if (C0004.m18() >= 0) goto L79;
        r46 = (C0031.f31 % C0045.f45) + 1748909;
        goto L3
    L79:
        C0055.f55 = 75;
        String r322 = "ۣۨۤ";
    L80:
        r46 = C0063.m254(r322);
        goto L3
    L82:
        r46 = (C0051.f51 ^ C0047.f47) + 1750441;
        goto L3
    L83:
        String r323 = "key_wallet_val";
        String r183 = "999999.99";
        if ((C0049.f49 ^ (C0017.f17 + 550)) <= 0) goto L85;
        String r157 = "ۣۨ۠";
    L87:
        r39 = r323;
        r40 = r183;
        r46 = C0054.m219(r157);
        goto L3
    L85:
        C0049.m199();
        r39 = r323;
        r40 = r183;
        r46 = C0017.m70("ۣۦۨ");
        goto L3
    L88:
        i00 r158 = dy.g;
        String r324 = "¥" + r33;
        r158.getClass();
        ip.o("input", r5);
        ip.o("replacement", r324);
        String r184 = "ۣۢۧ";
    L89:
        r21 = r324;
        r22 = r158;
        r46 = C0057.m229(r184);
        goto L3
    L90:
        p7.q(r34);
        if (C0036.f36 > 0) goto L93;
        r46 = C0012.m50("ۣۤۢ");
        goto L3
    L93:
        r317 = "ۢ۠ۨ";
        goto L24
    L95:
        if (C0017.f17 <= 0) goto L96;
        r46 = (C0028.f28 | C0001.f1) + 1746966;
        goto L3
    L96:
        String r325 = "۟۟۠";
    L97:
        r46 = C0018.m73(r325);
        goto L3
    L100:
        if ((C0036.f36 | (C0027.f27 | 968)) >= 0) goto L101;
        String r326 = "ۧۥۧ";
        r9 = r11;
    L103:
        r46 = C0020.m80(r326);
        goto L3
    L101:
        r9 = r11;
        r46 = C0045.m182("۟ۡۥ");
        goto L3
    L109:
        r16 = "";
        if ((r34.getId() >>> 24) != 127) goto L354;
        ConcurrentHashMap r327 = dy.c;
        Integer r48 = Integer.valueOf(r34.getId());
        Object r185 = r327.get(r48);
        if ((C0054.f54 % (C0057.f57 | (-7037))) <= 0) goto L113;
        String r159 = "ۧۦۡ";
        r13 = r327;
        r14 = r48;
        r17 = r185;
        Object r192 = r185;
    L116:
        r4 = r192;
        r46 = C0062.m249(r159);
        goto L3
    L113:
        C0010.m40();
        r14 = r48;
        String r1510 = "ۧۦۡ";
        r17 = r185;
        Object r193 = r185;
    L114:
        r13 = r327;
        r4 = r193;
        r46 = C0003.m13(r1510);
        goto L3
    L117:
        if (r17 != null) goto L13;
        String r328 = "ۦ۠ۢ";
    L119:
        r46 = C0062.m249(r328);
        goto L3
    L120:
        r31 = true;
        r46 = (C0036.f36 * C0045.f45) + 2007948;
        goto L3
    L121:
        String r329 = r5;
    L122:
        r5 = r329;
        r46 = 1869060 + (C0020.f20 * C0061.f61);
    L124:
        if (C0047.m191() >= 0) goto L125;
        r46 = (C0029.f29 ^ C0063.f63) ^ (-1749716);
        goto L3
    L125:
        C0041.f41 = 65;
        r184 = "ۥۢ";
        r324 = r21;
        r158 = r22;
        goto L89
    L128:
        if (C0016.m66() > 0) goto L130;
        C0068.f68 = 16;
        r46 = C0012.m50("۠۟۟");
        goto L3
    L130:
        r154 = "ۥۣۡ";
        r182 = r25;
        r19 = r27;
        goto L45
    L132:
        if (C0060.f60 > 0) goto L135;
        C0010.f10 = 67;
        r313 = "ۣۢۢ";
        goto L134
    L135:
        r3 = "ۢۦ۠";
        goto L36
    L136:
        r28 = r25;
        r46 = C0053.m213("ۣۧۧ");
    L137:
        r46 = (C0063.f63 ^ C0072.f72) + 1751317;
        goto L3
    L139:
        if (r34.getId() != (-1)) goto L346;
        if ((C0029.f29 / (C0007.f7 ^ 8836)) != 0) goto L142;
        r46 = (C0052.f52 ^ C0051.f51) + 1756132;
        goto L3
    L142:
        C0037.m150();
        goto L143
    L145:
        r12 = false;
        r325 = "ۣ۟ۡ";
    L152:
        if ((C0070.f70 % (C0018.f18 ^ (-7064))) > 0) goto L155;
        C0043.m172();
        String r330 = "ۣ۠ۨ";
    L154:
        r46 = C0031.m127(r330);
        goto L3
    L155:
        String r331 = "ۡ۟۠";
    L156:
        r46 = C0046.m186(r331);
        goto L3
    L158:
        if (C0061.f61 <= 0) goto L159;
        r46 = (C0030.f30 ^ C0064.f64) + 1751743;
        goto L3
    L159:
        r46 = C0049.m197("ۤ۠ۤ");
        goto L3
    L161:
        r38 = r41;
    L162:
        r326 = "ۧۨۤ";
        goto L103
    L170:
        if (C0030.m121() >= 0) goto L171;
        r46 = (C0073.f73 % C0017.f17) ^ 1754500;
        goto L3
    L171:
        C0000.f0 = 29;
        String r332 = "ۤۡۢ";
    L172:
        r46 = C0070.m281(r332);
        goto L3
    L174:
        r32 = false;
        if (C0046.f46 <= 0) goto L176;
        r46 = (C0055.f55 | C0006.f6) + 1756169;
        goto L3
    L176:
        C0000.m0();
        r46 = C0005.m23("ۢ۠");
        goto L3
    L178:
        r46 = (C0052.f52 ^ C0030.f30) + 1750833;
        r47 = r36;
        goto L3
    L179:
        r329 = r5;
    L181:
        if (C0068.f68 >= 0) goto L182;
        r5 = r329;
        r46 = 1745706 + (C0009.f9 ^ C0001.f1);
        goto L3
    L182:
        C0042.m169();
        String r1511 = "ۡۥۢ";
    L183:
        r5 = r329;
        r46 = C0019.m79(r1511);
        goto L3
    L185:
        String r333 = ((Pattern) r22.b).matcher(r5).replaceAll(r21);
        ip.n("replaceAll(...)", r333);
        if (r333.equals(r5) == true) goto L256;
        r49.args[0] = r333;
        if (C0026.m106() > 0) goto L190;
        C0002.f2 = 83;
        r46 = C0053.m213("۟ۤۧ");
        goto L3
    L190:
        r310 = "ۡۦ۠";
        goto L34
    L191:
        ip.o("p", r49);
        Object r334 = r49.thisObject;
        r29 = null;
        if ((r334 instanceof TextView) == false) goto L434;
        TextView r335 = (TextView) r334;
        if ((C0018.f18 - (C0037.f37 | 8336)) <= 0) goto L195;
        r34 = r335;
        r46 = (C0010.f10 * C0047.f47) ^ 1750154;
        goto L3
    L195:
        r34 = r335;
        r46 = C0061.m246("ۧۨ");
        goto L3
    L198:
        if ((C0064.f64 ^ (C0068.f68 * (-1204))) <= 0) goto L199;
        r20 = r23;
        r46 = (C0055.f55 ^ C0007.f7) + 1753567;
        goto L3
    L199:
        r314 = "ۨۦۨ";
        r20 = r23;
        r153 = r24;
        goto L12
    L202:
        if (r27.length() <= 0) goto L282;
        if (pb0.G0.contains(r27) == true) goto L393;
        String r336 = "ۣۢۤ";
    L206:
        r46 = C0059.m239(r336);
        goto L3
    L207:
        p7.q(r34);
        if ((C0071.f71 | (C0044.f44 + 8435)) < 0) goto L210;
        r46 = C0014.m57("ۨۢۧ");
        goto L3
    L210:
        r3 = "ۡ۟۠";
        goto L36
    L212:
        if (C0003.f3 > 0) goto L214;
        C0063.m253();
        r46 = C0039.m159("ۨ۠ۦ");
        goto L3
    L214:
        r322 = "ۦ۟ۧ";
        goto L80
    L215:
        Object r337 = r49.args[0];
        if ((r337 instanceof CharSequence) == true) goto L217;
        r28 = r29;
        goto L323
    L217:
        CharSequence r338 = (CharSequence) r337;
        if ((C0072.f72 + (C0020.f20 | (-4782))) >= 0) goto L219;
        r25 = r338;
        r28 = r29;
        r46 = (C0007.f7 / C0006.f6) ^ 1755398;
        goto L3
    L219:
        C0031.m124();
        r154 = "ۢ۠ۧ";
        r182 = r338;
        r19 = r27;
        r28 = r29;
        goto L45
    L222:
        if ((C0039.f39 % (C0001.f1 - 6393)) >= 0) goto L223;
        r31 = r32;
        r46 = (C0011.f11 * C0007.f7) + 170203;
        goto L3
    L223:
        C0028.m112();
        r311 = r30;
        r15 = r32;
        goto L168
    L226:
        if (C0058.f58 <= 0) goto L227;
        r46 = (C0001.f1 ^ C0035.f35) + 1749409;
        goto L3
    L227:
        r46 = C0025.m102("ۣۧۥ");
        goto L3
    L229:
        if (r7 == true) goto L359;
        if (r12 == true) goto L359;
        if (C0060.f60 <= 0) goto L233;
        r46 = (C0046.f46 | C0059.f59) ^ (-1746430);
        goto L3
    L233:
        r46 = C0021.m86("۠ۢ۠");
        goto L3
    L236:
        if (C0004.f4 >= 0) goto L237;
        r1511 = "ۢۦۦ";
        r329 = r5;
        goto L183
    L237:
        C0020.f20 = 61;
        r328 = "ۣ۠ۤ";
        goto L119
    L240:
        if (C0045.f45 < 0) goto L242;
        C0070.f70 = 11;
        r46 = C0045.m182("ۨ۟ۨ");
        goto L3
    L242:
        r330 = "ۧۧۧ";
        goto L154
    L243:
        gn.a.getClass();     // Catch: Throwable -> L301
        if (C0009.m36() >= 0) goto L246;
        r46 = C0009.m38("ۤۨۤ");
        goto L3
    L246:
        r46 = C0017.m70("ۤۨ۠");
    L253:
        r46 = (C0013.f13 ^ C0002.f2) + 57196;
        goto L3
    L254:
        r46 = (C0019.f19 + C0043.f43) + 1746498;
    L256:
        if ((C0011.f11 / (C0054.f54 * 1363)) == 0) goto L258;
        r46 = C0063.m254("ۢۢۦ");
        goto L3
    L258:
        r325 = "ۣۣۡ";
        goto L97
    L259:
        r46 = (C0040.f40 ^ C0066.f66) + 1750878;
        goto L3
    L260:
        r46 = (C0033.f33 - C0002.f2) ^ (-1752001);
    L261:
        r46 = (C0024.f24 / C0031.f31) ^ 1747718;
        goto L3
    L262:
        r35 = null;
        if ((C0034.f34 | (C0020.f20 + 3208)) >= 0) goto L264;
        r46 = (C0011.f11 - C0008.f8) ^ 1751185;
        goto L3
    L264:
        r46 = C0024.m98("ۡ۟۠");
        goto L3
    L267:
        if (C0025.f25 < 0) goto L270;
        C0026.m106();
        String r339 = r33;
    L269:
        r33 = r339;
        r46 = C0070.m281("ۥۦ۟");
        goto L3
    L270:
        r154 = "ۥۥ۟";
        r182 = r25;
        r19 = r27;
        goto L45
    L271:
        r327 = r13;
        r1510 = "ۣۢۨ";
        r193 = r20;
        goto L114
    L272:
        r49.args[0] = "\u2588\u2588\u2588\u2588\u2588\u2588";
        if ((C0036.f36 - (C0020.f20 ^ (-2942))) >= 0) goto L274;
        r46 = C0029.m116("ۦۣۧ");
        goto L3
    L274:
        C0022.m88();
        TextView r340 = r34;
    L275:
        r34 = r340;
        r46 = C0043.m173("ۡۥۦ");
        goto L3
    L278:
        if ((C0066.f66 % (C0024.f24 + 8596)) <= 0) goto L279;
        r46 = (C0034.f34 % C0025.f25) + 1753586;
        goto L3
    L279:
        C0027.f27 = 11;
        r46 = C0041.m164("ۥ۟ۤ");
    L282:
        r315 = "ۣۡ۟";
        goto L14
    L283:
        gn.a.getClass();     // Catch: Throwable -> L458
        String r341 = gn.e;     // Catch: Throwable -> L458
        if ((C0037.f37 / (C0064.f64 * (-3801))) != 0) goto L286;
        r43 = r341;
        r46 = (C0054.f54 | C0016.f16) + 1751729;
        goto L3
    L286:
        C0026.m106();
        r43 = r341;
        r46 = C0065.m263("ۡۢۥ");
        goto L3
    L289:
        if ((C0042.f42 / (C0066.f66 % 3316)) != 0) goto L290;
        r46 = (C0046.f46 | C0017.f17) ^ 1753626;
        goto L3
    L290:
        r46 = C0008.m35("ۦۤۤ");
        goto L3
    L293:
        if (C0059.m236() > 0) goto L295;
        C0069.f69 = 52;
        r336 = "۠۠ۤ";
        goto L206
    L295:
        r159 = "ۡ۟ۢ";
        r192 = r4;
        goto L116
    L306:
        if (r7 == true) goto L152;
        if (r9 == false) goto L152;
        if (Build.VERSION.SDK_INT < 31) goto L152;
        if (C0032.m128() >= 0) goto L312;
    L330:
        r46 = C0069.m277("۟ۡۢ");
        goto L3
    L312:
        r46 = C0031.m127("ۧۧۢ");
        goto L3
    L314:
        if ((C0068.f68 + (C0042.f42 / 1308)) >= 0) goto L315;
        r46 = (C0056.f56 % C0052.f52) + 1755735;
        goto L3
    L315:
        r46 = C0057.m229("ۣ۟ۡ");
        goto L3
    L318:
        if ((C0034.f34 / (C0020.f20 * (-4010))) == 0) goto L320;
        r46 = C0010.m43("ۣ۟");
        goto L3
    L320:
        r159 = "ۦ۠ۢ";
        r192 = r4;
    L323:
        if (C0065.f65 >= 0) goto L324;
        r46 = (C0049.f49 * C0068.f68) ^ (-1734242);
        goto L3
    L324:
        C0072.f72 = 26;
        r321 = "ۣ۠۠";
        r156 = r36;
        goto L76
    L326:
        gn.a.getClass();     // Catch: Throwable -> L104
        if (C0044.m178() < 0) goto L331;
        C0073.f73 = 88;
        goto L330
    L331:
        r314 = "ۦۨۡ";
        r153 = r24;
        goto L12
    L332:
        r319 = r8;
        goto L63
    L334:
        if (C0006.f6 > 0) goto L336;
        C0049.f49 = 47;
        r46 = C0036.m144("ۣۢۤ");
        goto L3
    L336:
        r1510 = "۟ۧۤ";
        r327 = r13;
        r193 = r4;
    L338:
        if ((C0068.f68 + (C0072.f72 | (-3413))) >= 0) goto L339;
        r46 = (C0018.f18 ^ C0044.f44) + 1755007;
        goto L3
    L339:
        C0047.f47 = 28;
        r317 = "ۥۥ";
        goto L24
    L342:
        if ((C0036.f36 ^ (C0026.f26 / (-3822))) <= 0) goto L343;
        r45 = r10;
        r46 = (C0072.f72 | C0051.f51) ^ (-1754555);
        goto L3
    L343:
        C0023.f23 = 90;
        r45 = r10;
        r46 = C0034.m138("ۨ۟ۧ");
    L346:
        if ((C0062.f62 ^ (C0063.f63 / (-8680))) >= 0) goto L347;
        r46 = (C0015.f15 ^ C0026.f26) + 1746921;
        goto L3
    L347:
        r159 = "۟۠۟";
        r192 = r4;
        goto L116
    L350:
        if ((C0056.f56 ^ (C0039.f39 - 232)) <= 0) goto L351;
        r37 = r38;
        r46 = (C0049.f49 | C0035.f35) + 1752902;
        goto L3
    L351:
        r316 = r38;
    L354:
        if (C0065.f65 >= 0) goto L355;
        String r342 = "۟ۦۡ";
    L357:
        r46 = C0029.m116(r342);
        goto L3
    L355:
        r331 = "ۧۥۥ";
        goto L156
    L358:
        r46 = (C0044.f44 - C0022.f22) ^ 1747713;
    L359:
        r46 = (C0026.f26 - C0052.f52) + 1752443;
        goto L3
    L361:
        if ((C0060.f60 * (C0034.f34 + 6554)) <= 0) goto L362;
        r46 = (C0016.f16 + C0029.f29) + 1755217;
        goto L3
    L362:
        C0065.m260();
        r46 = C0027.m110("ۡۧۧ");
        goto L3
    L364:
        r340 = r35;
    L366:
        if (C0000.m0() >= 0) goto L367;
        r46 = (C0036.f36 - C0068.f68) + 1749899;
        goto L3
    L367:
        r315 = "۟۠ۡ";
        goto L14
    L369:
        r46 = (C0001.f1 % C0030.f30) + 1747786;
        goto L3
    L370:
        r46 = (C0049.f49 / C0070.f70) ^ 1754407;
        goto L3
    L372:
        if (C0045.m181() <= 0) goto L373;
        r46 = (C0063.f63 % C0072.f72) + 1754587;
        goto L3
    L373:
        C0042.f42 = 42;
        r46 = C0061.m246("ۤ۠۠");
        goto L3
    L376:
        if ((C0073.f73 % (C0039.f39 - 679)) > 0) goto L378;
        C0053.f53 = 51;
        r46 = C0066.m264("۟ۧۡ");
        goto L3
    L378:
        r314 = "ۨۥۢ";
        r153 = r24;
        goto L12
    L379:
        ip.n("toLowerCase(...)", r8);     // Catch: Throwable -> L458
        r332 = "۟ۧۡ";
        goto L172
    L381:
        if (r28 != null) goto L426;
        if ((C0012.f12 | (C0024.f24 + 5070)) > 0) goto L386;
        C0051.f51 = 6;
    L385:
        r157 = "ۡۢۦ";
        r323 = r39;
        r183 = r40;
        goto L87
    L386:
        r317 = "ۨ۠ۦ";
        goto L24
    L388:
        if ((r34 instanceof EditText) == false) goto L137;
        if (C0059.f59 >= 0) goto L391;
        r46 = (C0061.f61 / C0059.f59) ^ 1748866;
        goto L3
    L391:
        C0034.m137();
        r46 = C0032.m130("ۦۣۢ");
    L393:
        r46 = (C0032.f32 - C0052.f52) + 1754456;
        goto L3
    L394:
        Boolean r194 = Boolean.valueOf(r31);
        r23 = r13.putIfAbsent(r14, r194);
        if (r23 != null) goto L440;
        if ((C0008.f8 * (C0026.f26 ^ (-8425))) <= 0) goto L398;
        r4 = r194;
        r46 = (C0024.f24 / C0003.f3) + 1754626;
        goto L3
    L398:
        C0019.f19 = 14;
        r4 = r194;
        r46 = C0005.m23("ۡۦ۠");
        goto L3
    L401:
        if (C0064.f64 > 0) goto L403;
        C0025.m103();
        r46 = C0069.m277("ۥۧۢ");
        goto L3
    L403:
        r318 = "ۤۧ";
        goto L54
    L404:
        if (r6 == false) goto L256;
        if (r12 == false) goto L256;
        if (b50.B(r45, "chatting", false) == true) goto L256;
        if (b50.B(r45, "remittance", false) == false) goto L253;
        if (r34.getTextSize() <= 80.0f) goto L253;
        if (C0041.m167() > 0) goto L52;
        C0040.f40 = 91;
        r46 = C0028.m114("ۣۧ۟");
    L416:
        if ((C0015.f15 / (C0037.f37 | (-939))) <= 0) goto L417;
        r325 = "ۦ۟ۥ";
        goto L97
    L417:
        r46 = C0027.m110("ۦ۟۟");
        goto L3
    L419:
        r46 = (C0043.f43 | C0033.f33) + 56003;
        goto L3
    L420:
        if (r6 == true) goto L261;
        if (r7 == true) goto L261;
        if ((C0027.f27 ^ (C0021.f21 + 9343)) < 0) goto L385;
        C0039.f39 = 25;
    L426:
        if (C0071.m284() < 0) goto L428;
        r46 = C0003.m13("ۤۤۡ");
        goto L3
    L428:
        r317 = "۠ۢ۠";
        goto L24
    L429:
        r9 = ((Boolean) r4).booleanValue();
        if (C0024.f24 > 0) goto L432;
        C0016.m66();
        r46 = C0050.m203("ۣۢۨ");
        goto L3
    L432:
        r3 = "ۢۡۡ";
    L434:
        if ((C0027.f27 * (C0070.f70 * 1725)) < 0) goto L436;
        r318 = "ۢۥ";
        goto L54
    L436:
        r318 = "ۡۢۥ";
        goto L54
    L438:
        r44 = Locale.ROOT;     // Catch: Throwable -> L458
        r46 = (C0065.f65 % C0008.f8) + 1751393;
    L440:
        if (C0036.m147() < 0) goto L442;
        C0046.m185();
        r342 = "۠ۧ۠";
        goto L357
    L442:
        r342 = "ۧ۟۟";
        goto L357
    L444:
        if (r28.length() != 0) goto L366;
        if ((C0054.f54 / (C0070.f70 % 2791)) > 0) goto L448;
        C0007.m31();
        r46 = C0025.m102("ۣۨ۟");
        goto L3
    L448:
        r313 = "ۣۨۥ";
        goto L134
    L449:
        r329 = r28.toString();
        r6 = gt.i("key_wallet_on");
        r7 = gt.i("key_privacy_mask");
        if (r6 == false) goto L122;
        if (r329.length() >= 50) goto L122;
        if (b50.B(r329, "\u00a5", false) == true) goto L181;
        if (b50.B(r329, "\uffe5", false) == false) goto L122;
        r5 = r329;
        r46 = 1754474 + (C0018.f18 / C0026.f26);
        goto L3
    L461:
        if (C0021.f21 < 0) goto L463;
        C0073.f73 = 78;
        r33 = r30;
        r46 = C0036.m144("ۢۦۦ");
        goto L3
    L463:
        r339 = r30;
        goto L269
    }

    private final void e(XC_MethodHook.MethodHookParam r13) {
        ip.o("p", r13);
        Object r0 = r13.thisObject;
        if ((r0 instanceof ImageView) == false) goto L10;
        ImageView r6 = (ImageView) r0;
    L5:
        if (r6 == null) goto L7;
        boolean r7 = gt.i("key_privacy_mask");
        boolean r8 = gt.i("key_rounded_avatar");
        if (r7 == true) goto L278;
        if (r8 == true) goto L278;
        r6.clearColorFilter();
        if (r6.getOutlineProvider() != dy.h) goto L18;
        r6.setClipToOutline(false);
        r6.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
    L18:
        if (dy.d == (-1)) goto L7;
        dy.d = -1;
        dy.f = -1.0f;
        dy.a.clear();
        dy.b.clear();
        dy.c.clear();
        return;
    L278:
        gn.a.getClass();     // Catch: Throwable -> L106
        String r02 = gn.e;     // Catch: Throwable -> L106
        Locale r1 = Locale.ROOT;     // Catch: Throwable -> L106
        ip.n("ROOT", r1);     // Catch: Throwable -> L106
        String r03 = r02.toLowerCase(r1);     // Catch: Throwable -> L106
        ip.n("toLowerCase(...)", r03);     // Catch: Throwable -> L106
        String r5 = r03;
    L284:
        if (r5.length() != 0) goto L109;
    L24:
        Object r04 = r6.getTag(2114650112);     // Catch: Throwable -> L104
        if ((r04 instanceof Boolean) == false) goto L113;
        Boolean r05 = (Boolean) r04;     // Catch: Throwable -> L104
    L27:
        if (r05 != null) goto L84;
        String r06 = r6.getClass().getName();     // Catch: Throwable -> L104
        "getName(...)";     // Catch: Throwable -> L104
        Locale r12 = Locale.ROOT;     // Catch: Throwable -> L104
        ip.n("ROOT", r12);     // Catch: Throwable -> L104
        String r2 = r06.toLowerCase(r12);     // Catch: Throwable -> L104
        ip.n("toLowerCase(...)", r2);     // Catch: Throwable -> L104
        if (r6.getId() != (-1)) goto L282;
    L115:
        String r14 = "";
    L33:
        CharSequence r07 = r6.getContentDescription();     // Catch: Throwable -> L104
        if (r07 == null) goto L37;
        String r08 = r07.toString();     // Catch: Throwable -> L104
        if (r08 == null) goto L37;
    L39:
        if (b50.B(r2, "emoji", false) == false) goto L41;
    L80:
        Boolean r09 = Boolean.FALSE;     // Catch: Throwable -> L104
    L81:
        if (r09 == null) goto L228;
        r6.setTag(2114650112, r09);     // Catch: Throwable -> L104
        goto L84
    L228:
        Object r010 = r6.getTag(2114650114);     // Catch: Throwable -> L104
        Boolean r15 = Boolean.TRUE;     // Catch: Throwable -> L104
        if (ip.i(r010, r15) == true) goto L84;
        r6.setTag(2114650114, r15);     // Catch: Throwable -> L104
        r6.addOnLayoutChangeListener(new o7(1, r5));     // Catch: Throwable -> L104
        goto L84
    L41:
        if (b50.B(r14, "emoji", false) == true) goto L80;
        if (b50.B(r2, "gif", false) == true) goto L80;
        if (b50.B(r14, "gif", false) == true) goto L80;
        if (b50.B(r2, "sticker", false) == true) goto L80;
        if (b50.B(r14, "sticker", false) == true) goto L80;
        if (b50.B(r14, "biaoqing", false) == true) goto L80;
        if (b50.B(r2, "videoview", false) == true) goto L80;
        if (b50.B(r14, "image_message", false) == true) goto L80;
        if (b50.B(r14, "chatting_content", false) == true) goto L80;
        if (b50.B(r14, "thumb", false) == true) goto L80;
        if (b50.B(r14, "cover", false) == true) goto L80;
        if (b50.B(r14, "source", false) == true) goto L80;
        if (b50.B(r14, "appmsg", false) == true) goto L80;
        if (b50.B(r2, "appbrand", false) == true) goto L80;
        if (b50.B(r14, "reader", false) == true) goto L80;
        if (b50.B(r08, "\u8868\u60c5", false) == true) goto L80;
        if (b50.B(r08, "\u52a8\u753b", false) == true) goto L80;
        if (b50.B(r08, "\u56fe\u7247", false) == true) goto L80;
        if (b50.B(r08, "\u5c01\u9762", false) == true) goto L80;
        if (b50.B(r08, "\u7f29\u7565\u56fe", false) == true) goto L80;
        if (b50.B(r2, "avatar", false) == false) goto L119;
    L122:
        r09 = Boolean.TRUE;     // Catch: Throwable -> L104
        goto L81
    L119:
        if (b50.B(r14, "avatar", false) == true) goto L122;
        if (pb0.H0.contains(r14) == true) goto L122;
        boolean r3 = b50.B(r5, "chattingui", false);     // Catch: Throwable -> L104
        Object r011 = r6.getParent();     // Catch: Throwable -> L104
        if ((r011 instanceof View) == false) goto L143;
        View r012 = (View) r011;     // Catch: Throwable -> L104
    L126:
        View r22 = r012;
        int r4 = 0;
    L127:
        if (r22 == null) goto L147;
        if (r4 >= 15) goto L147;
        String r013 = r22.getClass().getName();     // Catch: Throwable -> L104
        "getName(...)";     // Catch: Throwable -> L104
        Locale r16 = Locale.ROOT;     // Catch: Throwable -> L104
        ip.n("ROOT", r16);     // Catch: Throwable -> L104
        String r9 = r013.toLowerCase(r16);     // Catch: Throwable -> L104
        ip.n("toLowerCase(...)", r9);     // Catch: Throwable -> L104
        if (r22.getId() != (-1)) goto L280;
    L145:
        String r014 = "";
    L135:
        if (b50.B(r014, "chatting", false) == false) goto L137;
    L138:
        boolean r17 = true;
    L139:
        Object r015 = r22.getParent();     // Catch: Throwable -> L104
        if ((r015 instanceof View) == false) goto L146;
        View r016 = (View) r015;     // Catch: Throwable -> L104
    L142:
        r4 = 0 - ((0 - r4) - 1);
        r22 = r016;
        r3 = r17;
        goto L127
    L146:
        r016 = null;
        goto L142
    L137:
        if (b50.B(r9, "chatting", false) == true) goto L138;
        r17 = r3;
        goto L139
    L280:
        String r017 = r22.getContext().getResources().getResourceEntryName(r22.getId());     // Catch: Throwable -> L144
        ip.n("getResourceEntryName(...)", r017);     // Catch: Throwable -> L144
        "ROOT";     // Catch: Throwable -> L144
        r014 = r017.toLowerCase(r16);     // Catch: Throwable -> L144
        ip.n("toLowerCase(...)", r014);     // Catch: Throwable -> L144
    L147:
        Object r018 = r6.getParent();     // Catch: Throwable -> L104
        if ((r018 instanceof View) == false) goto L176;
        View r019 = (View) r018;     // Catch: Throwable -> L104
    L150:
        int r23 = 0;
        View r18 = r019;
    L151:
        if (r18 == null) goto L217;
        if (r23 >= 15) goto L217;
        String r020 = r18.getClass().getName();     // Catch: Throwable -> L104
        "getName(...)";     // Catch: Throwable -> L104
        Locale r42 = Locale.ROOT;     // Catch: Throwable -> L104
        ip.n("ROOT", r42);     // Catch: Throwable -> L104
        String r92 = r020.toLowerCase(r42);     // Catch: Throwable -> L104
        ip.n("toLowerCase(...)", r92);     // Catch: Throwable -> L104
        if (r18.getId() != (-1)) goto L287;
    L178:
        String r021 = "";
    L159:
        if (b50.B(r92, "emoji", false) == true) goto L174;
        if (b50.B(r021, "emoji", false) == true) goto L174;
        if (b50.B(r92, "smiley", false) == true) goto L174;
        if (b50.B(r021, "smiley", false) == true) goto L174;
        if (b50.B(r92, "emoticon", false) == true) goto L174;
        if (b50.B(r021, "emoticon", false) == true) goto L174;
        if (b50.B(r92, "keyboard", false) == true) goto L174;
        if (b50.B(r021, "input", false) == true) goto L174;
        if (r3 == true) goto L181;
    L212:
        Object r022 = r18.getParent();     // Catch: Throwable -> L104
        if ((r022 instanceof View) == false) goto L216;
        View r023 = (View) r022;     // Catch: Throwable -> L104
    L215:
        r23 = ((r23 + 4) + 1) - 4;
        r18 = r023;
        goto L151
    L216:
        r023 = null;
        goto L215
    L181:
        if (b50.B(r92, "quote", false) == true) goto L174;
        if (b50.B(r021, "quote", false) == true) goto L174;
        if (b50.B(r92, "reply", false) == true) goto L174;
        if (b50.B(r021, "reply", false) == true) goto L174;
        if (b50.B(r92, "panel", false) == true) goto L174;
        if (b50.B(r021, "panel", false) == true) goto L174;
        if (b50.B(r92, "footer", false) == true) goto L174;
        if (b50.B(r021, "footer", false) == true) goto L174;
        if (b50.B(r92, "bottom", false) == true) goto L174;
        if (b50.B(r021, "bottom", false) == true) goto L174;
        if (b50.B(r92, "grid", false) == true) goto L174;
        if (b50.B(r021, "grid", false) == true) goto L174;
        if (b50.B(r021, "chatting_content", false) == true) goto L174;
        if (b50.B(r021, "chatting_item_appmsg", false) == true) goto L174;
        if (b50.B(r021, "source", false) == true) goto L174;
        if (b50.B(r021, "card", false) == false) goto L212;
    L174:
        r09 = Boolean.FALSE;     // Catch: Throwable -> L104
        goto L81
    L287:
        String r024 = r18.getContext().getResources().getResourceEntryName(r18.getId());     // Catch: Throwable -> L177
        ip.n("getResourceEntryName(...)", r024);     // Catch: Throwable -> L177
        "ROOT";     // Catch: Throwable -> L177
        r021 = r024.toLowerCase(r42);     // Catch: Throwable -> L177
        ip.n("toLowerCase(...)", r021);     // Catch: Throwable -> L177
    L217:
        if (r3 == false) goto L226;
        float r025 = 34.0f;
    L219:
        ViewGroup.LayoutParams r19 = r6.getLayoutParams();     // Catch: Throwable -> L104
        if (r19 == null) goto L227;
        int r24 = r19.width;     // Catch: Throwable -> L104
        if (r24 <= 0) goto L227;
        int r110 = r19.height;     // Catch: Throwable -> L104
        if (r110 <= 0) goto L227;
        r09 = i(r6, r025, r24, r110);     // Catch: Throwable -> L104
    L227:
        r09 = i(r6, r025, r6.getWidth(), r6.getHeight());     // Catch: Throwable -> L104
        goto L81
    L226:
        r025 = 12.0f;
        goto L219
    L176:
        r019 = null;
        goto L150
    L143:
        r012 = null;
    L37:
        r08 = "";
        goto L39
    L282:
        String r026 = r6.getContext().getResources().getResourceEntryName(r6.getId());     // Catch: Throwable -> L114
        ip.n("getResourceEntryName(...)", r026);     // Catch: Throwable -> L114
        "ROOT";     // Catch: Throwable -> L114
        String r027 = r026.toLowerCase(r12);     // Catch: Throwable -> L114
        ip.n("toLowerCase(...)", r027);     // Catch: Throwable -> L114
        r14 = r027;
    L84:
        if (ip.i(r6.getTag(2114650112), Boolean.TRUE) == false) goto L274;
        if (r8 == false) goto L92;
        ay r028 = dy.h;     // Catch: Throwable -> L104
        if (r028 == null) goto L92;
        if (r6.getOutlineProvider() == r028) goto L91;
        r6.setOutlineProvider(r028);     // Catch: Throwable -> L104
        r6.setClipToOutline(true);     // Catch: Throwable -> L104
    L91:
        r6.invalidateOutline();     // Catch: Throwable -> L104
    L92:
        if (r7 == false) goto L272;
        int r029 = gt.j("key_privacy_style", 0);     // Catch: Throwable -> L104
        int r111 = gt.j("key_privacy_blur_intensity", 100);     // Catch: Throwable -> L104
        if (dy.d == r029) goto L96;
    L97:
        dy.d = r029;     // Catch: Throwable -> L104
        dy.e = r111;     // Catch: Throwable -> L104
        dy.a.clear();     // Catch: Throwable -> L104
        dy.b.clear();     // Catch: Throwable -> L104
    L99:
        if (gt.j("key_privacy_style", 0) != 1) goto L232;
        if (Build.VERSION.SDK_INT < 31) goto L232;
        float r030 = Math.max(1.0f, (gt.j("key_privacy_blur_intensity", 100) / 100.0f) * 15.0f);     // Catch: Throwable -> L104
        Shader.TileMode r112 = Shader.TileMode.CLAMP;     // Catch: Throwable -> L104
        p7.p(r6, p7.e(r030, r030));     // Catch: Throwable -> L104
    L232:
        if (Build.VERSION.SDK_INT < 31) goto L234;
        p7.o(r6);     // Catch: Throwable -> L104
    L234:
        i00 r32 = new i00();     // Catch: Throwable -> L104
        boolean r43 = ip.i(r13.method.getName(), "setImageBitmap");     // Catch: Throwable -> L104
        if (r43 == false) goto L250;
        Object r031 = r13.args[0];     // Catch: Throwable -> L104
        if ((r031 instanceof Bitmap) == false) goto L249;
        Bitmap r032 = (Bitmap) r031;     // Catch: Throwable -> L104
    L239:
        r32.b = r032;     // Catch: Throwable -> L104
    L240:
        Object r033 = r32.b;     // Catch: Throwable -> L104
        if (r033 == null) goto L7;
        if (dy.b.contains(r033) == true) goto L7;
        Bitmap r034 = (Bitmap) dy.a.get(r32.b);     // Catch: Throwable -> L104
        if (r034 == null) goto L271;
        if (r43 == false) goto L270;
        r13.args[0] = r034;     // Catch: Throwable -> L104
    L248:
        r6.clearColorFilter();     // Catch: Throwable -> L104
        goto L7
    L270:
        r13.args[0] = new BitmapDrawable(r6.getResources(), r034);     // Catch: Throwable -> L104
        goto L248
    L271:
        r6.setColorFilter(Color.parseColor("#88888888"), PorterDuff.Mode.SRC_IN);     // Catch: Throwable -> L104
        int r035 = System.identityHashCode(r32.b);     // Catch: Throwable -> L104
        r6.setTag("GEEK_MOSAIC_TOKEN".hashCode(), Integer.valueOf(r035));     // Catch: Throwable -> L104
        new Thread(new cy(r32, r6, r035, r43)).start();     // Catch: Throwable -> L104
        goto L7
    L249:
        r032 = null;
        goto L239
    L250:
        Object r036 = r13.args[0];     // Catch: Throwable -> L104
        if ((r036 instanceof Drawable) == false) goto L257;
        Drawable r037 = (Drawable) r036;     // Catch: Throwable -> L104
    L254:
        if ((r037 instanceof BitmapDrawable) == false) goto L258;
        r32.b = ((BitmapDrawable) r037).getBitmap();     // Catch: Throwable -> L104
        goto L240
    L258:
        if (r037 == null) goto L240;
        int r113 = 150;
        if (r037.getIntrinsicWidth() <= 0) goto L269;
        int r25 = r037.getIntrinsicWidth();     // Catch: Throwable -> L267
    L263:
        if (r037.getIntrinsicHeight() <= 0) goto L265;
        r113 = r037.getIntrinsicHeight();     // Catch: Throwable -> L267
    L265:
        r32.b = Bitmap.createBitmap(r25, r113, Bitmap.Config.ARGB_8888);     // Catch: Throwable -> L267
        Canvas r26 = new Canvas((Bitmap) r32.b);     // Catch: Throwable -> L267
        r037.setBounds(0, 0, r26.getWidth(), r26.getHeight());     // Catch: Throwable -> L267
        r037.draw(r26);     // Catch: Throwable -> L267
        goto L240
    L269:
        r25 = 150;
        goto L263
    L257:
        r037 = null;
        goto L254
    L96:
        if (dy.e == r111) goto L99;
    L272:
        r6.clearColorFilter();     // Catch: Throwable -> L104
        goto L7
    L274:
        if (r6.getOutlineProvider() != dy.h) goto L7;
        r6.setClipToOutline(false);     // Catch: Throwable -> L104
        r6.setOutlineProvider(ViewOutlineProvider.BACKGROUND);     // Catch: Throwable -> L104
        goto L7
    L113:
        r05 = null;
        goto L27
    L109:
        if (b50.B(r5, "launcherui", false) == true) goto L24;
        if (b50.B(r5, "chattingui", false) == false) goto L7;
    L105:
        z30.o("Nwje\n", "Q2m5jaPP2Zc=\n", "PrivacyHook_Image", "Fg==\n", "c8HJlSTQVfc=\n");
    L107:
        r5 = "";
    L7:
        if (C0037.m150() > 0) goto L321;
        System.out.println(Double.valueOf(C0012.m48("pbnNLgptfi")));
        return;
    L321:
        return;
    L10:
        r6 = null;
        goto L5
    }

    private final void f(XC_MethodHook.MethodHookParam r13) {
        Object r1 = null;
        String r10 = null;
        String r4 = null;
        Locale r5 = null;
        String r9 = null;
        String r6 = null;
        String r2 = null;
        int r7 = C0015.m60("ۣۢۨ");
    L3:
        switch(r7) {
            case 56445: goto L6;
            case 56447: goto L96;
            case 56480: goto L24;
            case 56509: goto L32;
            case 56569: goto L58;
            case 1746718: goto L94;
            case 1746784: goto L24;
            case 1746910: goto L87;
            case 1746970: goto L84;
            case 1747871: goto L68;
            case 1748613: goto L96;
            case 1748647: goto L80;
            case 1748796: goto L10;
            case 1749665: goto L43;
            case 1750633: goto L56;
            case 1750688: goto L49;
            case 1750780: goto L25;
            case 1751618: goto L68;
            case 1751624: goto L62;
            case 1751744: goto L39;
            case 1751774: goto L68;
            case 1752461: goto L16;
            case 1752642: goto L21;
            case 1753574: goto L94;
            case 1753631: goto L91;
            case 1753698: goto L34;
            case 1754473: goto L74;
            case 1754475: goto L42;
            case 1754504: goto L65;
            case 1755374: goto L71;
            case 1755560: goto L85;
            case 1755622: goto L75;
            default: goto L3;
        };
    L6:
        if ((C0040.f40 | (C0002.f2 - 6781)) >= 0) goto L7;
        r7 = (C0070.f70 ^ C0065.f65) ^ (-1753928);
        goto L3
    L7:
        String r0 = "ۥۣۢ";
    L8:
        r7 = C0046.m186(r0);
        goto L3
    L10:
        if (z30.q("SOTqAF/vsM588v0sYeWhy0b19g==\n", "I4GTXz6BxKc=\n", gn.a) == true) goto L74;
        if (C0021.f21 >= 0) goto L13;
        r7 = C0058.m234("ۨ۠ۦ");
    L13:
        r7 = C0059.m239("ۣۤۡ");
    L16:
        if (C0060.m240() >= 0) goto L17;
        r7 = (C0004.f4 ^ C0042.f42) + 1748327;
        goto L3
    L17:
        String r02 = "ۨۧ";
    L18:
        r7 = C0062.m249(r02);
        goto L3
    L21:
        if ((C0014.f14 / (C0072.f72 | (-3207))) <= 0) goto L22;
        r7 = (C0042.f42 + C0047.f47) + 1748720;
        goto L3
    L22:
        C0058.m232();
        r7 = C0030.m120("ۡ۠ۦ");
        goto L3
    L24:
        r7 = (C0028.f28 / C0011.f11) ^ 1753696;
        goto L3
    L25:
        ip.n("toLowerCase(...)", r10);
        if (b50.B(r4, r9, false) == true) goto L87;
        if ((C0007.f7 - (C0073.f73 * 4671)) >= 0) goto L29;
        r7 = (C0039.f39 * C0002.f2) + 443917;
        goto L3
    L29:
        C0048.f48 = 27;
    L30:
        r7 = C0018.m73("ۥۥۢ");
        goto L3
    L32:
        Locale r42 = Locale.ROOT;
        String r03 = r2.toLowerCase(r42);
        r5 = r42;
    L33:
        r7 = C0059.m239("ۣۧۤ");
        r4 = r03;
        goto L3
    L34:
        if (r2 != null) goto L16;
        if (C0062.f62 < 0) goto L30;
        C0041.f41 = 71;
        r7 = C0031.m127("ۤۨۢ");
        goto L3
    L39:
        if (C0072.f72 >= 0) goto L40;
        r7 = (C0021.f21 - C0032.f32) ^ (-1746748);
        goto L3
    L40:
        C0006.m24();
        r7 = C0053.m213("ۥۥ");
        goto L3
    L42:
        r02 = "ۦۨۤ";
        r2 = null;
        goto L18
    L43:
        r13.setResult(null);
        if (C0047.f47 >= 0) goto L45;
        String r04 = r9;
    L47:
        r7 = C0031.m127("ۣۤ");
        r9 = r04;
        goto L3
    L45:
        C0019.f19 = 86;
        r03 = r4;
        goto L33
    L49:
        if ((r1 instanceof String) == false) goto L6;
        String r05 = (String) r1;
        if (C0019.f19 <= 0) goto L52;
        r7 = C0003.m13("ۨۦۦ");
        r6 = r05;
        goto L3
    L52:
        C0069.m276();
    L53:
        Object r72 = "ۧۢۦ";
        String r8 = r05;
    L54:
        r6 = r8;
        r7 = C0067.m271(r72);
        goto L3
    L56:
        ip.o("p", r13);
        r1 = r13.args[0];
        goto L13
    L58:
        if (b50.B(r4, r10, false) == false) goto L68;
        String r06 = "ۡ۠ۦ";
    L60:
        r7 = C0016.m65(r06);
        goto L3
    L62:
        if ((C0040.f40 + (C0044.f44 | (-2611))) >= 0) goto L63;
        r7 = (C0008.f8 * C0047.f47) ^ 1742199;
        goto L3
    L63:
        r7 = C0072.m288("ۥۦ");
        goto L3
    L65:
        ip.n("toLowerCase(...)", r4);
        r04 = pb0.C0.toLowerCase(r5);
        if ((C0013.f13 / (C0069.f69 * (-1078))) != 0) goto L47;
        r7 = C0059.m239("ۨۨۦ");
        r9 = r04;
    L68:
        String r07 = "ۣۡ۟";
    L69:
        r7 = C0029.m116(r07);
        goto L3
    L71:
        if ((C0071.f71 ^ (C0017.f17 - 5221)) > 0) goto L73;
        C0026.m106();
        r06 = "ۦۤۤ";
        goto L60
    L73:
        r0 = "ۣۤۡ";
    L74:
        r7 = (C0007.f7 + C0055.f55) + 56656;
        goto L3
    L75:
        ip.n("toLowerCase(...)", r9);
        String r08 = pb0.D0.toLowerCase(r5);
        if (C0070.f70 <= 0) goto L77;
        r7 = (C0037.f37 - C0067.f67) + 1751248;
        r10 = r08;
        goto L3
    L77:
        r7 = C0009.m38("ۨۨۦ");
        r10 = r08;
        goto L3
    L80:
        if (b50.B(r4, pb0.t1, false) == true) goto L94;
        if (b50.N(r4, "delete from", false) == false) goto L68;
        r72 = "ۣۤۧ";
        r8 = r6;
        goto L54
    L84:
        r7 = C0064.m258("ۥۥ");
        goto L3
    L85:
        r2 = r6;
        r7 = (C0025.f25 - C0059.f59) ^ (-1747069);
    L87:
        if ((C0049.f49 ^ (C0017.f17 * 7101)) <= 0) goto L88;
        r7 = (C0023.f23 % C0040.f40) + 1748540;
        goto L3
    L88:
        r07 = "ۣ۟ۧ";
        goto L69
    L91:
        if ((C0062.f62 + (C0044.f44 % 1912)) < 0) goto L93;
        C0008.m33();
        r7 = C0066.m264("ۣۤۧ");
        goto L3
    L93:
        r05 = r6;
    L94:
        r7 = (C0021.f21 % C0073.f73) + 1749676;
        goto L3
    }

    private final void g(XC_MethodHook.MethodHookParam r8) {
        ip.o("p", r8);
        Object[] r4 = r8.args;     // Catch: Throwable -> L59
        ip.n("args", r4);     // Catch: Throwable -> L59
        int r5 = r4.length;     // Catch: Throwable -> L59
        int r0 = 0;
    L4:
        int r2 = 1616;
    L5:
        r2 = r2 ^ 1633;     // Catch: Throwable -> L59
        switch(r2) {
            case 14: goto L8;
            case 49: goto L9;
            case 204: goto L11;
            case 239: goto L34;
            default: goto L5;
        };     // Catch: Throwable -> L59
    L34:
        Object r02 = null;
    L24:
        boolean r3 = r02 instanceof Sensor;     // Catch: Throwable -> L59
        int r22 = 48891;
    L25:
        r22 = r22 ^ 48908;     // Catch: Throwable -> L59
        switch(r22) {
            case 22: goto L28;
            case 53: goto L64;
            case 503: goto L35;
            case 32495: goto L37;
            default: goto L25;
        };     // Catch: Throwable -> L59
    L28:
        r22 = 48953;
        goto L25
    L35:
        if (r3 == false) goto L28;
        r22 = 49635;
        goto L25
    L37:
        Sensor r03 = (Sensor) r02;     // Catch: Throwable -> L59
    L38:
        int r1 = 49666;
    L39:
        r1 = r1 ^ 49683;     // Catch: Throwable -> L59
        switch(r1) {
            case 17: goto L42;
            case 50: goto L44;
            case 76: goto L45;
            case 83: goto L54;
            default: goto L39;
        };     // Catch: Throwable -> L59
    L42:
        if (r03 != null) goto L44;
        r1 = 49759;
    L44:
        r1 = 49728;
        goto L39
    L45:
        int r12 = C0019.m77();     // Catch: Throwable -> L59
        int r04 = 49790;
    L46:
        r04 = r04 ^ 49807;     // Catch: Throwable -> L59
        switch(r04) {
            case 18: goto L49;
            case 51: goto L137;
            case 84: goto L52;
            case 241: goto L50;
            default: goto L46;
        };     // Catch: Throwable -> L59
    L49:
        r04 = 49852;
        goto L46
    L50:
        if (r12 > 0) goto L49;
        r04 = 49883;
        goto L46
    L52:
        System.out.println(Long.parseLong(C0043.m175("3ToAjG")));     // Catch: Throwable -> L59
        return;
    L137:
        return;
    L54:
        int r13 = XposedHelpers.getIntField(r03, "mHandle");     // Catch: Throwable -> L59
        Object r23 = q50.b;     // Catch: Throwable -> L59
        monitor-enter(r23);     // Catch: Throwable -> L59
        q50.a.put(r13, r03.getType());     // Catch: Throwable -> L61
        monitor-exit(r23);     // Catch: Throwable -> L59
        return;
    L61:
        th = move-exception;
        throw th;     // Catch: Throwable -> L59
    L64:
        r03 = null;
    L8:
        r2 = 1678;
        goto L5
    L9:
        if (r0 >= r5) goto L8;
        r2 = 1709;
        goto L5
    L11:
        Object r24 = r4[r0];     // Catch: Throwable -> L59
        boolean r6 = r24 instanceof Sensor;     // Catch: Throwable -> L59
        int r32 = 1740;
    L12:
        r32 = r32 ^ 1757;     // Catch: Throwable -> L59
        switch(r32) {
            case 17: goto L15;
            case 54: goto L17;
            case 471: goto L29;
            case 500: goto L18;
            default: goto L12;
        };     // Catch: Throwable -> L59
    L18:
        int r05 = 1864;
    L19:
        r05 = r05 ^ 1881;     // Catch: Throwable -> L59
        switch(r05) {
            case 17: goto L22;
            case 47483: goto L23;
            default: goto L19;
        };     // Catch: Throwable -> L59
    L22:
        r05 = 48674;
        goto L19
    L23:
        r02 = r24;
        goto L24
    L15:
        if (r6 == false) goto L17;
        r32 = 1833;
    L17:
        r32 = 1802;
        goto L12
    L29:
        r0 = r0 + (C0047.f47 ^ (-9));     // Catch: Throwable -> L59
        int r25 = 48767;
    L30:
        r25 = r25 ^ 48784;     // Catch: Throwable -> L59
        switch(r25) {
            case 14: goto L4;
            case 239: goto L33;
            default: goto L30;
        };     // Catch: Throwable -> L59
    L33:
        r25 = 48798;
    L60:
        z30.o("Nwje\n", "Q2m5jaPP2Zc=\n", "SystemHook_SensorReg", "Fg==\n", "c8HJlSTQVfc=\n");
    }

    private final void h(XC_MethodHook.MethodHookParam r11) {
        Float r2 = null;
        ip.o("p", r11);
        Object r0 = r11.args[0];
        ip.m("null cannot be cast to non-null type kotlin.Int", r0);
        int r3 = ((Integer) r0).intValue();
        Object r02 = r11.args[1];
        boolean r5 = r02 instanceof float[];
        int r1 = 1616;
    L3:
        r1 = r1 ^ 1633;
        switch(r1) {
            case 14: goto L6;
            case 49: goto L7;
            case 204: goto L9;
            case 239: goto L21;
            default: goto L3;
        };
    L6:
        r1 = 1678;
        goto L3
    L7:
        if (r5 == false) goto L6;
        r1 = 1709;
        goto L3
    L9:
        float[] r03 = (float[]) r02;
        int r12 = 1740;
    L10:
        r12 = r12 ^ 1757;
        switch(r12) {
            case 17: goto L13;
            case 54: goto L14;
            default: goto L10;
        };
    L13:
        r12 = 1771;
        goto L10
    L14:
        float[] r13 = r03;
    L15:
        int r04 = 1864;
    L16:
        r04 = r04 ^ 1881;
        switch(r04) {
            case 17: goto L19;
            case 47384: goto L29;
            case 47417: goto L23;
            case 47483: goto L22;
            default: goto L16;
        };
    L19:
        if (r13 != null) goto L22;
        r04 = 48736;
    L22:
        r04 = 48705;
        goto L16
    L23:
        int r05 = 48767;
    L24:
        r05 = r05 ^ 48784;
        switch(r05) {
            case 14: goto L272;
            case 239: goto L28;
            default: goto L24;
        };
    L272:
        return;
    L28:
        r05 = 48798;
        goto L24
    L29:
        int r52 = r13.length;
        int r06 = 48891;
    L30:
        r06 = r06 ^ 48908;
        switch(r06) {
            case 22: goto L33;
            case 53: goto L41;
            case 503: goto L34;
            case 32495: goto L36;
            default: goto L30;
        };
    L33:
        r06 = 48953;
        goto L30
    L34:
        if (r52 != 0) goto L33;
        r06 = 49635;
        goto L30
    L36:
        int r07 = 49666;
    L37:
        r07 = r07 ^ 49683;
        switch(r07) {
            case 17: goto L40;
            case 50: goto L273;
            default: goto L37;
        };
    L273:
        return;
    L40:
        r07 = 49697;
        goto L37
    L41:
        Object r53 = q50.b;
        monitor-enter(r53);
        int r32 = q50.a.get(r3, C0045.f45 ^ 295);     // Catch: Throwable -> L116
        monitor-exit(r53);
        int r08 = 49790;
    L46:
        r08 = r08 ^ 49807;
        switch(r08) {
            case 18: goto L49;
            case 51: goto L274;
            case 84: goto L53;
            case 241: goto L51;
            default: goto L46;
        };
    L274:
        return;
    L49:
        r08 = 49852;
        goto L46
    L51:
        if (r32 != 19) goto L49;
        r08 = 49883;
        goto L46
    L53:
        gn r33 = gn.a;
        boolean r54 = z30.q("VcapnaeqZ71hzr+m\n", "PqPQwtTeAs0=\n", r33);
        int r09 = 49914;
    L54:
        r09 = r09 ^ 49931;
        switch(r09) {
            case 497: goto L57;
            case 1711: goto L59;
            case 1736: goto L275;
            case 1769: goto L60;
            default: goto L54;
        };
    L275:
        return;
    L57:
        if (r54 == false) goto L59;
        r09 = 50658;
    L59:
        r09 = 50627;
        goto L54
    L60:
        float r55 = r13[0];
        int r010 = 50689;
    L61:
        r010 = r010 ^ 50706;
        switch(r010) {
            case 19: goto L65;
            case 45: goto L276;
            case 50: goto L67;
            case 76: goto L68;
            default: goto L61;
        };
    L276:
        return;
    L65:
        if (r55 <= 0.0f) goto L67;
        r010 = 50782;
    L67:
        r010 = 50751;
        goto L61
    L68:
        String r6 = "key_step_multiplier";
        String r011 = "10";
        ip.o(z30.k("3f5Z\n", "tpsgeLwwj7M=\n", r6, "lNdk\n", "8LICxVL6724=\n"), r011);
        r33.getClass();     // Catch: Throwable -> L84
        String r012 = gn.d(r6, r011);     // Catch: Throwable -> L84
        int r34 = 50813;
    L71:
        r34 = r34 ^ 50830;
        switch(r34) {
            case 18: goto L74;
            case 243: goto L83;
            default: goto L71;
        };
    L74:
        String r35 = r012;
    L75:
        ip.o("<this>", r35);
        i00 r013 = x10.a;     // Catch: NumberFormatException -> L126
        r013.getClass();     // Catch: NumberFormatException -> L126
        boolean r56 = ((Pattern) r013.b).matcher(r35).matches();     // Catch: NumberFormatException -> L126
        int r014 = 51836;
    L78:
        r014 = r014 ^ 51853;
        switch(r014) {
            case 241: goto L81;
            case 1963: goto L100;
            case 1992: goto L102;
            case 2025: goto L101;
            default: goto L78;
        };
    L81:
        if (r56 == false) goto L100;
        r014 = 52580;
    L100:
        r014 = 52549;
        goto L78
    L101:
        r2 = Float.valueOf(Float.parseFloat(r35));     // Catch: NumberFormatException -> L126
    L102:
        int r015 = 52611;
    L103:
        r015 = r015 ^ 52628;
        switch(r015) {
            case 23: goto L106;
            case 54: goto L108;
            case 85: goto L115;
            case 116: goto L109;
            default: goto L103;
        };
    L106:
        if (r2 == null) goto L108;
        r015 = 52704;
    L108:
        r015 = 52673;
        goto L103
    L109:
        float r016 = r2.floatValue();
        int r22 = 52735;
    L110:
        r22 = r22 ^ 52752;
        switch(r22) {
            case 14: goto L113;
            case 1007: goto L114;
            default: goto L110;
        };
    L113:
        r13[0] = r016 * r13[0];
        return;
    L114:
        r22 = 52766;
        goto L110
    L115:
        r016 = 10.0f;
    L127:
        int r017 = 53634;
    L128:
        r017 = r017 ^ 53651;
        switch(r017) {
            case 17: goto L131;
            case 50: goto L102;
            default: goto L128;
        };
    L131:
        r017 = 53665;
        goto L128
    L83:
        r34 = 50844;
    L136:
        gn r7 = gn.a;     // Catch: Throwable -> L119
        Integer r57 = b50.R(r011);     // Catch: Throwable -> L119
        int r36 = 51588;
    L86:
        r36 = r36 ^ 51605;     // Catch: Throwable -> L119
        switch(r36) {
            case 17: goto L89;
            case 54: goto L91;
            case 87: goto L99;
            case 116: goto L92;
            default: goto L86;
        };     // Catch: Throwable -> L119
    L89:
        if (r57 == null) goto L91;
        r36 = 51681;
    L91:
        r36 = 51650;
        goto L86
    L92:
        int r37 = r57.intValue();     // Catch: Throwable -> L119
        int r58 = 51712;
    L93:
        r58 = r58 ^ 51729;     // Catch: Throwable -> L119
        switch(r58) {
            case 14: goto L96;
            case 15: goto L93;
            case 16: goto L93;
            case 17: goto L98;
            default: goto L93;
        };     // Catch: Throwable -> L119
    L96:
        r7.getClass();     // Catch: Throwable -> L119
        r35 = String.valueOf(gn.b(r6, r37));     // Catch: Throwable -> L119
        goto L75
    L98:
        r58 = 51743;
        goto L93
    L99:
        r37 = 0;
    L120:
        int r38 = 53510;
    L121:
        r38 = r38 ^ 53527;
        switch(r38) {
            case 17: goto L124;
            case 50: goto L125;
            default: goto L121;
        };
    L124:
        r38 = 53541;
        goto L121
    L125:
        r35 = r011;
    L116:
        th = move-exception;
        throw th;
    L21:
        r13 = null;
        goto L15
    }

    public static final Boolean i(ImageView r6, float r7, int r8, int r9) {
        float r5 = 0.0f;
        int r2 = C0063.m254("ۣۣۧ");
        boolean r1 = false;
        boolean r0 = false;
    L3:
        switch(r2) {
            case 56288: goto L6;
            case 56474: goto L35;
            case 1746818: goto L14;
            case 1747717: goto L19;
            case 1747775: goto L44;
            case 1748677: goto L67;
            case 1749574: goto L24;
            case 1749601: goto L60;
            case 1750721: goto L64;
            case 1750783: goto L7;
            case 1751617: goto L58;
            case 1751622: goto L143;
            case 1752462: goto L56;
            case 1752737: goto L29;
            case 1754500: goto L52;
            case 1755343: goto L63;
            case 1755527: goto L45;
            case 1755620: goto L41;
            default: goto L3;
        };
    L6:
        return Boolean.valueOf(r0);
    L7:
        if (r8 <= 0) goto L67;
        if ((C0069.f69 | (C0016.f16 % (-8894))) >= 0) goto L10;
        String r22 = "ۨۥۤ";
    L12:
        r2 = C0059.m239(r22);
        goto L3
    L10:
        r2 = C0050.m203("ۨۨۤ");
        goto L3
    L14:
        if (C0045.f45 >= 0) goto L15;
        r2 = 56690 + (C0042.f42 - C0071.f71);
        r0 = false;
        goto L3
    L15:
        String r23 = "ۥۨۤ";
        boolean r3 = false;
    L16:
        r2 = C0064.m258(r23);
        r0 = r3;
        goto L3
    L19:
        if (C0005.m20() >= 0) goto L20;
        String r24 = "۟۟";
        boolean r32 = r1;
    L23:
        r2 = C0068.m272(r24);
        r0 = r32;
        goto L3
    L20:
        C0037.m150();
        r0 = r1;
    L21:
        r2 = C0028.m114("ۣ۠ۢ");
        goto L3
    L24:
        r5 = r8 / r6.getResources().getDisplayMetrics().density;
        if ((C0021.f21 + (C0019.f19 * (-9695))) < 0) goto L27;
        C0052.m210();
        r2 = C0019.m79("۟۟");
        goto L3
    L27:
        r23 = "ۢ۠۟";
        r3 = r0;
        goto L16
    L29:
        if (r5 > 85.0f) goto L52;
        if (C0012.f12 > 0) goto L21;
        String r25 = "ۣ۟ۦ";
        boolean r33 = r1;
    L33:
        r2 = C0038.m153(r25);
        r1 = r33;
        goto L3
    L35:
        if (r7 > r5) goto L52;
        if ((C0002.f2 + (C0042.f42 | 8449)) <= 0) goto L38;
        r2 = (C0040.f40 + C0019.f19) + 1754742;
        goto L3
    L38:
        r2 = C0033.m132("ۣۥۣ");
        goto L3
    L41:
        if ((C0044.f44 * (C0046.f46 - 8057)) >= 0) goto L42;
        r2 = (C0013.f13 % C0013.f13) + 1750783;
        goto L3
    L42:
        r2 = C0046.m186("ۡۡۨ");
        goto L3
    L44:
        r33 = true;
        r25 = "۠ۡۦ";
        goto L33
    L45:
        if (r9 <= 0) goto L67;
        if (C0002.f2 <= 0) goto L48;
        r2 = (C0007.f7 % C0062.f62) + 1751980;
        goto L3
    L48:
        C0052.m210();
        String r26 = "ۢ۠۟";
        boolean r34 = r0;
    L49:
        r2 = C0059.m239(r26);
        r0 = r34;
    L52:
        if (C0035.f35 <= 0) goto L53;
        r2 = (C0035.f35 | C0014.f14) ^ (-56167);
        goto L3
    L53:
        r24 = "ۡۧ۠";
        r32 = r0;
        goto L23
    L56:
        if (Math.abs(((r8 + 21) - r9) - 21) > 5) goto L64;
        r2 = (C0034.f34 / C0025.f25) + 1749573;
        goto L3
    L58:
        return null;
    L60:
        if ((C0025.f25 % (C0070.f70 + 241)) >= 0) goto L61;
        r2 = (C0044.f44 ^ C0035.f35) + 1746024;
        goto L3
    L61:
        C0022.m88();
        r2 = C0046.m186("ۣۣۧ");
        goto L3
    L63:
        r26 = "ۥۨۤ";
        r34 = false;
    L64:
        r2 = (C0026.f26 ^ C0014.f14) + 1752027;
        goto L3
    L143:
        return Boolean.FALSE;
    L67:
        if ((C0027.f27 / (C0039.f39 ^ (-9205))) != 0) goto L68;
        r2 = (C0016.f16 % C0010.f10) + 1751128;
        goto L3
    L68:
        C0015.f15 = 34;
        r22 = "ۡۡۤ";
        goto L12
    }

    public void afterHookedMethod(XC_MethodHook.MethodHookParam r15) {
        String r1 = "";
        switch(this.a) {
            case 0: goto L408;
            case 1: goto L4;
            case 2: goto L4;
            case 3: goto L397;
            case 4: goto L4;
            case 5: goto L4;
            case 6: goto L4;
            case 7: goto L379;
            case 8: goto L370;
            case 9: goto L312;
            case 10: goto L311;
            case 11: goto L4;
            case 12: goto L4;
            case 13: goto L4;
            case 14: goto L4;
            case 15: goto L4;
            case 16: goto L4;
            case 17: goto L4;
            case 18: goto L286;
            case 19: goto L268;
            case 20: goto L249;
            case 21: goto L4;
            case 22: goto L238;
            case 23: goto L150;
            case 24: goto L49;
            case 25: goto L34;
            case 26: goto L28;
            case 27: goto L4;
            case 28: goto L4;
            case 29: goto L8;
            default: goto L4;
        };
    L4:
        super.afterHookedMethod(r15);
        if (C0069.m276() < 0) goto L494;
        System.out.println(Float.valueOf(C0056.m225("MQS7t8qPzae3DSKa")));
        return;
    L494:
        return;
    L8:
        ip.o("p", r15);
        Object r0 = r15.args[0];
        if ((r0 instanceof String) == false) goto L26;
        String r12 = (String) r0;
    L11:
        if (r12 == null) goto L495;
        Object r02 = r15.getResult();
        if ((r02 instanceof Integer) == false) goto L433;
        Integer r03 = (Integer) r02;
    L15:
        if (r03 == null) goto L27;
        int r04 = r03.intValue();
    L18:
        if (z30.q("bBSMUYxLIY9mA5FRhk0+kXM=\n", "B3H1DuokU/g=\n", gn.a) == false) goto L496;
        Locale r2 = Locale.ROOT;
        ip.n("ROOT", r2);
        String r13 = r12.toLowerCase(r2);
        ip.n("toLowerCase(...)", r13);
        if (b50.B(r13, "limit", false) == true) goto L22;
        return;
    L22:
        if (r04 != 1) goto L24;
    L25:
        r15.setResult(200);
        return;
    L24:
        if (r04 == 9) goto L25;
        return;
    L496:
        return;
    L27:
        r04 = 0;
        goto L18
    L433:
        r03 = null;
        goto L15
    L495:
        return;
    L26:
        r12 = null;
        goto L11
    L28:
        ip.o("p", r15);
        if (z30.q("HrUVvU38vGIqvAOBQee2Zhs=\n", "ddBs4iCT3wk=\n", gn.a) == false) goto L500;
        GsmCellLocation r05 = new GsmCellLocation();     // Catch: Throwable -> L32
        r05.setLacAndCid(0, 0);     // Catch: Throwable -> L32
        r15.setResult(r05);     // Catch: Throwable -> L32
        return;
    L567:
        return;
    L500:
        return;
    L34:
        ip.o("p", r15);
        if (z30.q("fr7Yil+eThBKt862U4VEFHs=\n", "Fduh1TLxLXs=\n", gn.a) == false) goto L501;
        Object r06 = r15.getResult();
        if ((r06 instanceof List) == false) goto L432;
        List r07 = (List) r06;
    L39:
        if (r07 == null) goto L502;
        Iterator r08 = r07.iterator();
        ip.n("iterator(...)", r08);
    L42:
        if (r08.hasNext() == false) goto L569;
        Object r14 = r08.next();
        if (r14 == null) goto L42;
        XposedHelpers.setObjectField(r14, "BSSID", "02:00:00:00:00:00");     // Catch: Throwable -> L47
        XposedHelpers.setObjectField(r14, "level", -99);     // Catch: Throwable -> L47
        goto L42
    L569:
        return;
    L502:
        return;
    L432:
        r07 = null;
        goto L39
    L501:
        return;
    L49:
        ip.o("p", r15);
        if (z30.q("kcb4+qYv0FqO/PTM\n", "+qOBpcVHtTs=\n", gn.a) == false) goto L503;
        int r4 = gt.j("key_cheat_mode", 0);
        boolean r09 = gt.i("key_dice_on");
        boolean r22 = gt.i("key_rps_on");
        if (r4 != 0) goto L444;
        if (r09 == true) goto L444;
        if (r22 == true) goto L444;
        if (q50.d != null) goto L444;
        if (q50.e != null) goto L444;
        return;
    L444:
        r1 = gn.e;     // Catch: Throwable -> L409
    L61:
        if (b50.B(r1, "Chatting", false) == false) goto L63;
    L66:
        long r6 = System.currentTimeMillis();
        if (r6 >= q50.c) goto L69;
        SparseIntArray r010 = q50.a;
        q50.c = ((long) 500) - (0 - r6);
        return;
    L69:
        StackTraceElement[] r5 = new Throwable().getStackTrace();
        int r8 = Math.min(r5.length, 15);
        int r23 = 0;
        boolean r011 = false;
        boolean r16 = false;
    L70:
        if (r23 >= r8) goto L98;
        String r3 = r5[r23].getClassName();
        ip.n("getClassName(...)", r3);
        Locale r9 = Locale.ROOT;
        ip.n("ROOT", r9);
        String r32 = r3.toLowerCase(r9);
        ip.n("toLowerCase(...)", r32);
        String r10 = r5[r23].getMethodName();
        ip.n("getMethodName(...)", r10);
        "ROOT";
        String r92 = r10.toLowerCase(r9);
        ip.n("toLowerCase(...)", r92);
        if (b50.B(r32, "voice", false) == true) goto L79;
        if (b50.B(r32, "audio", false) == true) goto L79;
        if (b50.B(r32, "record", false) == true) goto L79;
        if (b50.B(r92, "record", false) == true) goto L79;
        if (b50.B(r32, "emoji", false) == false) goto L83;
    L90:
        r011 = true;
    L92:
        if (b50.B(r32, "dice", false) == false) goto L94;
    L95:
        r16 = true;
    L96:
        r23 = 0 - ((0 - r23) - 1);
        goto L70
    L94:
        if (b50.B(r92, "dice", false) == false) goto L96;
    L83:
        if (b50.B(r32, "smiley", false) == true) goto L90;
        if (b50.B(r32, "game", false) == true) goto L90;
        if (b50.B(r32, "dice", false) == true) goto L90;
        if (b50.B(r92, "dice", false) == false) goto L92;
    L79:
        SparseIntArray r012 = q50.a;
        q50.c = 0 - ((0 - r6) - ((long) 500));
        return;
    L98:
        if (q50.d == null) goto L114;
        boolean r013 = true;
    L100:
        boolean r24 = true;
        boolean r33 = r013;
    L101:
        if (r24 == false) goto L508;
        if (r33 == true) goto L110;
        if (q50.d != null) goto L110;
        if (r4 != 1) goto L117;
        if (q50.e == null) goto L110;
    L117:
        if (q50.e == null) goto L121;
        int r014 = ((r0.intValue() - 29) - 1) + 29;
    L119:
        r15.setResult(Double.valueOf((0.5d - (0.0d - ((double) gt.e(r014, 2)))) / 3.0d));
        return;
    L121:
        if (r4 != 1) goto L123;
        r014 = a80.u;
        goto L119
    L123:
        String r015 = "key_rps_num";
        ip.o("key", r015);
        gn.a.getClass();     // Catch: Throwable -> L419
        int r016 = gn.b(r015, 1);     // Catch: Throwable -> L128
    L127:
        r014 = (-1) - (0 - r016);
    L463:
        gn.a.getClass();     // Catch: Throwable -> L133
        Integer r017 = b50.R(gn.d(r015, String.valueOf(1)));     // Catch: Throwable -> L133
        if (r017 == null) goto L134;
        r016 = r017.intValue();     // Catch: Throwable -> L133
    L134:
        r016 = 1;
    L110:
        if (q50.d == null) goto L136;
        int r018 = ((r0.intValue() - 25) - 1) + 25;
    L112:
        r15.setResult(Double.valueOf((((((double) gt.e(r018, 5)) + 0.0d) + 0.5d) - 0.0d) / 6.0d));
        return;
    L136:
        if (r4 != 1) goto L138;
        r018 = a80.t;
        goto L112
    L138:
        String r019 = "key_dice_num";
        ip.o("key", r019);
        gn.a.getClass();     // Catch: Throwable -> L417
        int r020 = gn.b(r019, 1);     // Catch: Throwable -> L143
    L142:
        r018 = ((r020 + 29) - 1) - 29;
    L434:
        gn.a.getClass();     // Catch: Throwable -> L148
        Integer r021 = b50.R(gn.d(r019, String.valueOf(1)));     // Catch: Throwable -> L148
        if (r021 == null) goto L149;
        r020 = r021.intValue();     // Catch: Throwable -> L148
    L149:
        r020 = 1;
        goto L142
    L508:
        return;
    L114:
        if (q50.e == null) goto L421;
        r013 = false;
        goto L100
    L421:
        r24 = r011;
        r33 = r16;
        goto L101
    L63:
        if (b50.B(r1, "Game", false) == true) goto L66;
        if (b50.B(r1, "appbrand", true) == true) goto L66;
        return;
    L503:
        return;
    L150:
        ip.o("p", r15);
        Object r022 = r15.args[0];
        ip.m("null cannot be cast to non-null type kotlin.Int", r022);
        int r17 = ((Integer) r022).intValue();
        if (r17 == 6) goto L159;
        if (r17 == 5) goto L159;
        if (r17 == 3) goto L159;
        if (r17 == 2) goto L159;
        return;
    L159:
        if (z30.q("ecz8TKSka8lm9vB6\n", "EqmFE8fMDqg=\n", gn.a) == false) goto L512;
        int r25 = gt.j("key_cheat_mode", 0);
        boolean r34 = gt.i("key_dice_on");
        boolean r42 = gt.i("key_rps_on");
        if (r25 != 0) goto L168;
        if (r34 == true) goto L168;
        if (r42 == true) goto L168;
        if (q50.d != null) goto L168;
        if (q50.e != null) goto L168;
        return;
    L168:
        long r62 = System.currentTimeMillis();
        if (r62 >= q50.c) goto L171;
        SparseIntArray r023 = q50.a;
        q50.c = ((long) 500) - (0 - r62);
        return;
    L171:
        StackTraceElement[] r52 = new Throwable().getStackTrace();
        int r82 = Math.min(r52.length, 15);
        int r024 = 0;
    L172:
        if (r024 >= r82) goto L184;
        String r93 = r52[r024].getClassName();
        ip.n("getClassName(...)", r93);
        Locale r102 = Locale.ROOT;
        ip.n("ROOT", r102);
        String r94 = r93.toLowerCase(r102);
        ip.n("toLowerCase(...)", r94);
        String r11 = r52[r024].getMethodName();
        ip.n("getMethodName(...)", r11);
        "ROOT";
        String r103 = r11.toLowerCase(r102);
        ip.n("toLowerCase(...)", r103);
        if (b50.B(r94, "voice", false) == true) goto L181;
        if (b50.B(r94, "audio", false) == true) goto L181;
        if (b50.B(r94, "record", false) == true) goto L181;
        if (b50.B(r103, "record", false) == true) goto L181;
        r024 = ((r024 + 25) + 1) - 25;
    L181:
        SparseIntArray r025 = q50.a;
        q50.c = ((12 + r62) + ((long) 500)) - 12;
        return;
    L184:
        if (r17 == 2) goto L216;
        if (r17 == 3) goto L216;
        if (r17 != 5) goto L190;
    L191:
        Integer r026 = q50.d;
        if (r026 == null) goto L199;
        int r027 = r026.intValue();
    L194:
        int r028 = ((r027 - 13) - 1) + 13;
    L196:
        if (r028 == (-1)) goto L517;
        r15.setResult(Integer.valueOf(gt.e(r028, ((r17 + 5) - 1) - 5)));
        return;
    L517:
        return;
    L199:
        if (r25 != 1) goto L201;
        r028 = a80.t;
        goto L196
    L201:
        if (r34 == false) goto L214;
        String r029 = "key_dice_num";
        ip.o("key", r029);
        gn.a.getClass();     // Catch: Throwable -> L415
        r027 = gn.b(r029, 1);     // Catch: Throwable -> L207
    L450:
        gn.a.getClass();     // Catch: Throwable -> L212
        Integer r030 = b50.R(gn.d(r029, String.valueOf(1)));     // Catch: Throwable -> L212
        if (r030 == null) goto L213;
        r027 = r030.intValue();     // Catch: Throwable -> L212
    L213:
        r027 = 1;
        goto L194
    L214:
        r028 = -1;
        goto L196
    L190:
        if (r17 == 6) goto L191;
        return;
    L216:
        if (q50.e == null) goto L222;
        int r031 = ((r0.intValue() + 16) - 1) - 16;
    L219:
        if (r031 == (-1)) goto L519;
        r15.setResult(Integer.valueOf(gt.e(r031, 0 - ((0 - r17) + 1))));
        return;
    L519:
        return;
    L222:
        if (r25 != 1) goto L224;
        r031 = a80.u;
        goto L219
    L224:
        if (r42 == false) goto L237;
        String r032 = "key_rps_num";
        ip.o("key", r032);
        gn.a.getClass();     // Catch: Throwable -> L413
        int r033 = gn.b(r032, 1);     // Catch: Throwable -> L230
    L229:
        r031 = r033 - 1;
    L469:
        gn.a.getClass();     // Catch: Throwable -> L235
        Integer r034 = b50.R(gn.d(r032, String.valueOf(1)));     // Catch: Throwable -> L235
        if (r034 == null) goto L236;
        r033 = r034.intValue();     // Catch: Throwable -> L235
    L236:
        r033 = 1;
        goto L229
    L237:
        r031 = -1;
        goto L219
    L512:
        return;
    L238:
        ip.o("p", r15);
        Object r035 = r15.args[0];
        if ((r035 instanceof String) == false) goto L431;
        String r036 = (String) r035;
    L241:
        if (r036 != null) goto L243;
        return;
    L243:
        if (z30.q("Ea84Ye0hFrglpTNX6z0MiBOnJg==\n", "espBPoxUYtc=\n", gn.a) == true) goto L245;
        return;
    L245:
        if (b50.B(r036, "send_raw_img", false) == false) goto L247;
    L248:
        r15.setResult(Boolean.TRUE);
        return;
    L247:
        if (b50.B(r036, "raw", false) == true) goto L248;
        return;
    L431:
        r036 = null;
        goto L241
    L249:
        ip.o("param", r15);
        Object r037 = r15.thisObject;
        if ((r037 instanceof EditText) == false) goto L525;
        Object r18 = r15.args[0];
        if (r18 == null) goto L526;
        String r19 = r18.toString();
        if (r19 != null) goto L256;
        return;
    L256:
        if (r19.length() != 0) goto L258;
        return;
    L258:
        if (r19.length() < 2) goto L529;
        gn r26 = gn.a;
        String r35 = "key_secret_entry_code";
        String r43 = "#geek";
        r26.getClass();
        if (r19.equals(gn.d(r35, r43)) == false) goto L530;
        long r27 = System.currentTimeMillis();
        if ((((r27 - 3) - ct.a) + 3) < 1000) goto L531;
        ct.a = r27;
        EditText r038 = (EditText) r037;
        r038.setText("");
        Context r110 = r038.getContext();
        if ((r110 instanceof Activity) == false) goto L430;
        Activity r111 = (Activity) r110;
    L266:
        if (r111 == null) goto L532;
        gn.i(r038, 1);
        String r039 = t6.a;
        s20.a.getClass();
        s20.a(r111);
        return;
    L532:
        return;
    L430:
        r111 = null;
        goto L266
    L531:
        return;
    L530:
        return;
    L529:
        return;
    L526:
        return;
    L525:
        return;
    L268:
        ip.o("param", r15);
        Object r28 = r15.thisObject;
        kx r040 = (kx) bz.a.remove(r28);
        if (r040 == null) goto L534;
        String r112 = (String) r040.a;
        sm r041 = (sm) r040.b;
        Object r29 = XposedHelpers.getObjectField(r28, pb0.x);     // Catch: Exception -> L282
        if (r29 == null) goto L535;
        Object r210 = XposedHelpers.getObjectField(r29, pb0.y);     // Catch: Exception -> L282
        if ((r210 instanceof String) == false) goto L429;
        String r211 = (String) r210;     // Catch: Exception -> L282
    L276:
        if (r211 != null) goto L278;
        return;
    L278:
        if (r211.length() != 0) goto L280;
        return;
    L280:
        if (r211.length() == 0) goto L285;
        char r212 = r211.charAt(b50.D(r211));     // Catch: Exception -> L282
        gn r36 = gn.a;     // Catch: Exception -> L282
        String r44 = "key_real_name_prefix";     // Catch: Exception -> L282
        String r53 = "\u5c0f";     // Catch: Exception -> L282
        r36.getClass();     // Catch: Exception -> L282
        String r213 = gn.d(r44, r53) + r212;     // Catch: Exception -> L282
        gn.h("real_name_" + r112, r213);     // Catch: Exception -> L282
        d9.b.post(new t5(r041, 8, r213));     // Catch: Exception -> L282
        return;
    L285:
        throw new NoSuchElementException("Char sequence is empty.");     // Catch: Exception -> L282
    L429:
        r211 = null;
        goto L276
    L535:
        return;
    L539:
        return;
    L534:
        return;
    L286:
        ip.o("p", r15);
        Object r042 = r15.thisObject;
        if ((r042 instanceof ImageView) == false) goto L298;
        ImageView r113 = (ImageView) r042;
    L289:
        if (r113 == null) goto L540;
        String r043 = "key_rounded_avatar";
        ip.o("key", r043);
        gn.a.getClass();     // Catch: Throwable -> L299
        boolean r044 = gn.e(r043);     // Catch: Throwable -> L299
    L292:
        if (r044 == true) goto L294;
        return;
    L294:
        if (ip.i(r113.getTag(2114650112), Boolean.TRUE) == false) goto L542;
        ay r045 = dy.h;
        if (r045 == null) goto L543;
        r113.setOutlineProvider(r045);
        r113.setClipToOutline(true);
        r113.invalidateOutline();
        return;
    L543:
        return;
    L542:
        return;
    L442:
        gn.a.getClass();     // Catch: Throwable -> L309
        String r046 = gn.d(r043, String.valueOf(false));     // Catch: Throwable -> L309
        if (r046.equals("true") == false) goto L306;
        Boolean r047 = Boolean.TRUE;     // Catch: Throwable -> L309
    L303:
        if (r047 == null) goto L310;
        r044 = r047.booleanValue();     // Catch: Throwable -> L309
    L306:
        if (r046.equals("false") == false) goto L428;
        r047 = Boolean.FALSE;     // Catch: Throwable -> L309
        goto L303
    L428:
        r047 = null;
    L310:
        r044 = false;
        goto L292
    L540:
        return;
    L298:
        r113 = null;
        goto L289
    L311:
        ip.o("param", r15);
        Object r048 = r15.thisObject;
        ip.m("null cannot be cast to non-null type android.app.Activity", r048);
        Activity r049 = (Activity) r048;
        View r114 = r049.getWindow().getDecorView();
        ip.m("null cannot be cast to non-null type android.view.ViewGroup", r114);
        ViewGroup r115 = (ViewGroup) r114;
        r115.getViewTreeObserver().addOnPreDrawListener(new qs(r115, this, r049));
        return;
    L312:
        ip.o("param", r15);
        Object r050 = r15.args[0];
        if ((r050 instanceof String) == false) goto L347;
        String r051 = (String) r050;
    L315:
        if (r051 != null) goto L317;
        return;
    L317:
        if (r051.equals("message") == false) goto L547;
        Object[] r37 = r15.args;
        ip.n("args", r37);
        int r45 = r37.length;
        int r214 = 0;
    L319:
        if (r214 >= r45) goto L349;
        Object r052 = r37[r214];
        if ((r052 instanceof ContentValues) == true) goto L323;
        r214 = ((r214 - 30) + 1) + 30;
    L323:
        if ((r052 instanceof ContentValues) == false) goto L350;
        ContentValues r46 = (ContentValues) r052;
    L325:
        if (r46 == null) goto L548;
        Integer r053 = r46.getAsInteger("type");
        if (r053 == null) goto L351;
        int r054 = r053.intValue();
    L330:
        if (r054 != 49) goto L332;
    L333:
        String r055 = r46.getAsString("talker");
        if (r055 != null) goto L337;
        r055 = "";
    L337:
        if (r055.length() != 0) goto L345;
        hs r056 = hs.a;
        Object r057 = r15.thisObject;
        ip.n("thisObject", r057);
        Long r215 = r46.getAsLong("talkerId");
        if (r215 == null) goto L352;
        long r216 = r215.longValue();
    L342:
        if (r216 > 0) goto L448;
        r055 = "";
        goto L345
    L448:
        Object r217 = XposedHelpers.callMethod(r057, "rawQuery", new Object[]{"SELECT username FROM rcontact WHERE rowid = ?", new String[]{String.valueOf(r216)}});     // Catch: Throwable -> L411
        if (r217 == null) goto L427;
        Object r058 = XposedHelpers.callMethod(r217, "moveToFirst", new Object[0]);     // Catch: Throwable -> L411
        if ((r058 instanceof Boolean) == false) goto L369;
        Boolean r059 = (Boolean) r058;     // Catch: Throwable -> L411
    L359:
        if (ip.i(r059, Boolean.TRUE) == false) goto L426;
        Object r060 = XposedHelpers.callMethod(r217, "getString", new Object[]{0});     // Catch: Throwable -> L411
        if ((r060 instanceof String) == false) goto L425;
        r055 = (String) r060;     // Catch: Throwable -> L411
    L363:
        if (r055 != null) goto L456;
        r055 = "";
    L456:
        XposedHelpers.callMethod(r217, "close", new Object[0]);     // Catch: Throwable -> L367
        goto L345
    L425:
        r055 = null;
        goto L363
    L426:
        r055 = "";
        goto L456
    L369:
        r059 = null;
        goto L359
    L427:
        r055 = "";
    L412:
        r055 = "";
        goto L345
    L352:
        r216 = 0;
    L345:
        if (r055.length() <= 0) goto L550;
        ContentValues r116 = new ContentValues(r46);
        r116.put("talker", r055);
        hs r061 = hs.a;
        hs.b(r116);
        return;
    L550:
        return;
    L332:
        if (r054 == 436207665) goto L333;
        return;
    L351:
        r054 = 0;
        goto L330
    L548:
        return;
    L350:
        r46 = null;
        goto L325
    L349:
        r052 = null;
        goto L323
    L547:
        return;
    L347:
        r051 = null;
        goto L315
    L370:
        ip.o("param", r15);
        if (z30.q("eddIlfAN3g9r\n", "ErIxypx4vWQ=\n", gn.a) == true) goto L373;
        return;
    L373:
        if (gn.b("key_lucky_mode", 0) != 0) goto L553;
        Object r062 = r15.thisObject;
        if ((r062 instanceof Activity) == false) goto L424;
        Activity r063 = (Activity) r062;
    L377:
        if (r063 == null) goto L554;
        View r064 = r063.getWindow().getDecorView();
        ip.n("getDecorView(...)", r064);
        r064.postDelayed(new gs(r064, 0), 100);
        r064.postDelayed(new gs(r064, 1), 300);
        return;
    L554:
        return;
    L424:
        r063 = null;
        goto L377
    L553:
        return;
    L379:
        ip.o("param", r15);
        Object r065 = r15.thisObject;
        if ((r065 instanceof ViewGroup) == false) goto L396;
        ViewGroup r066 = (ViewGroup) r065;
    L382:
        if (r066 == null) goto L556;
        Object r067 = r066.getTag(2114322432);
        if ((r067 instanceof e9) == false) goto L423;
        e9 r068 = (e9) r067;
    L386:
        if (r068 != null) goto L388;
        return;
    L388:
        if (r068.h != null) goto L390;
        return;
    L390:
        if (ip.i(r15.getResult(), Boolean.FALSE) == false) goto L559;
        Object r069 = r15.args[0];
        ip.m("null cannot be cast to non-null type android.view.MotionEvent", r069);
        MotionEvent r070 = (MotionEvent) r069;
        if (r070.getActionMasked() != 0) goto L394;
    L395:
        r15.setResult(Boolean.TRUE);
        return;
    L394:
        if (r070.getActionMasked() == 2) goto L395;
        return;
    L559:
        return;
    L423:
        r068 = null;
        goto L386
    L556:
        return;
    L396:
        r066 = null;
        goto L382
    L397:
        ip.o("param", r15);
        String r071 = ff.z;     // Catch: Throwable -> L406
        if (b50.N(r071, "geek_fold_", false) == false) goto L562;
        gn r117 = gn.a;     // Catch: Throwable -> L406
        String r072 = "key_geek_folder_name_".concat(r071);     // Catch: Throwable -> L406
        String r38 = "\u81ea\u5b9a\u4e49\u6587\u4ef6\u5939";     // Catch: Throwable -> L406
        r117.getClass();     // Catch: Throwable -> L406
        XposedHelpers.callMethod(r15.thisObject, "setMMTitle", new Object[]{gn.d(r072, r38)});     // Catch: Throwable -> L406
        Object r073 = XposedHelpers.callMethod(r15.thisObject, "getView", new Object[0]);     // Catch: Throwable -> L406
        if ((r073 instanceof View) == false) goto L422;
        View r074 = (View) r073;     // Catch: Throwable -> L406
    L403:
        if (r074 == null) goto L563;
        vd.b(r074);     // Catch: Throwable -> L406
        return;
    L563:
        return;
    L422:
        r074 = null;
        goto L403
    L562:
        return;
    L407:
        z30.o("Nwje\n", "Q2m5jaPP2Zc=\n", "FoldUIHook_Resume", "Fg==\n", "c8HJlSTQVfc=\n");
        return;
    L408:
        ip.o("p", r15);
        gn r075 = gn.a;
        String r118 = "ChatUI";
        j9 r218 = new j9(r15, 1);
        r075.getClass();
        gn.j(r118, r218);
    }

    public void beforeHookedMethod(XC_MethodHook.MethodHookParam r16) {
        switch(this.a) {
            case 0: goto L1516;
            case 1: goto L1071;
            case 2: goto L991;
            case 3: goto L4;
            case 4: goto L983;
            case 5: goto L875;
            case 6: goto L774;
            case 7: goto L247;
            case 8: goto L4;
            case 9: goto L4;
            case 10: goto L4;
            case 11: goto L231;
            case 12: goto L168;
            case 13: goto L61;
            case 14: goto L20;
            case 15: goto L19;
            case 16: goto L18;
            case 17: goto L17;
            case 18: goto L16;
            case 19: goto L4;
            case 20: goto L4;
            case 21: goto L8;
            case 22: goto L4;
            case 23: goto L4;
            case 24: goto L4;
            case 25: goto L4;
            case 26: goto L4;
            case 27: goto L7;
            case 28: goto L6;
            default: goto L4;
        };
    L4:
        super.beforeHookedMethod(r16);
        return;
    L6:
        h(r16);
        return;
    L7:
        g(r16);
        return;
    L8:
        f(r16);
        int r3 = C0072.m289();
        int r2 = 1616;
    L9:
        r2 = r2 ^ 1633;
        switch(r2) {
            case 14: goto L12;
            case 49: goto L13;
            case 204: goto L15;
            case 239: goto L3367;
            default: goto L9;
        };
    L3367:
        return;
    L12:
        r2 = 1678;
        goto L9
    L13:
        if (r3 > 0) goto L12;
        r2 = 1709;
        goto L9
    L15:
        System.out.println(Long.valueOf(C0073.m293("tl86BhfhpGOJXQCeNbbqKvWyp")));
        return;
    L16:
        e(r16);
        return;
    L17:
        d(r16);
        return;
    L18:
        c(r16);
        return;
    L19:
        b(r16);
        return;
    L20:
        ip.o("p", r16);
        Object r22 = r16.args[0];
        boolean r5 = r22 instanceof String;
        int r4 = 1740;
    L21:
        r4 = r4 ^ 1757;
        switch(r4) {
            case 17: goto L24;
            case 54: goto L26;
            case 471: goto L32;
            case 500: goto L27;
            default: goto L21;
        };
    L24:
        if (r5 == false) goto L26;
        r4 = 1833;
    L26:
        r4 = 1802;
        goto L21
    L27:
        String r23 = (String) r22;
        int r42 = 1864;
    L28:
        r42 = r42 ^ 1881;
        switch(r42) {
            case 17: goto L31;
            case 47483: goto L33;
            default: goto L28;
        };
    L31:
        r42 = 48674;
    L33:
        int r43 = 48767;
    L34:
        r43 = r43 ^ 48784;
        switch(r43) {
            case 14: goto L37;
            case 45: goto L3368;
            case 76: goto L40;
            case 239: goto L38;
            default: goto L34;
        };
    L3368:
        return;
    L37:
        r43 = 48829;
        goto L34
    L38:
        if (r23 == null) goto L37;
        r43 = 48860;
        goto L34
    L40:
        Locale r44 = Locale.ROOT;
        ip.n("ROOT", r44);
        String r52 = r23.toLowerCase(r44);
        ip.n("toLowerCase(...)", r52);
        Object r24 = r16.args[1];
        boolean r6 = r24 instanceof ContentValues;
        int r45 = 48891;
    L41:
        r45 = r45 ^ 48908;
        switch(r45) {
            case 22: goto L44;
            case 53: goto L1536;
            case 503: goto L45;
            case 32495: goto L47;
            default: goto L41;
        };
    L44:
        r45 = 48953;
        goto L41
    L45:
        if (r6 == false) goto L44;
        r45 = 49635;
        goto L41
    L47:
        ContentValues r25 = (ContentValues) r24;
    L48:
        int r32 = 49666;
    L49:
        r32 = r32 ^ 49683;
        switch(r32) {
            case 17: goto L52;
            case 50: goto L54;
            case 76: goto L55;
            case 83: goto L60;
            default: goto L49;
        };
    L52:
        if (r25 != null) goto L54;
        r32 = 49759;
    L54:
        r32 = 49728;
        goto L49
    L55:
        int r26 = 49790;
    L56:
        r26 = r26 ^ 49807;
        switch(r26) {
            case 18: goto L3369;
            case 241: goto L59;
            default: goto L56;
        };
    L3369:
        return;
    L59:
        r26 = 49821;
        goto L56
    L60:
        gn r33 = gn.a;
        String r46 = "DBIntercept";
        iv r62 = new iv(r52, r25, r16, 1);
        r33.getClass();
        gn.j(r46, r62);
        return;
    L1536:
        r25 = null;
        goto L48
    L32:
        r23 = null;
        goto L33
    L61:
        ip.o("p", r16);
        Object r34 = uv.b;
        int r27 = 49914;
    L62:
        r27 = r27 ^ 49931;
        switch(r27) {
            case 497: goto L65;
            case 1711: goto L67;
            case 1736: goto L3370;
            case 1769: goto L68;
            default: goto L62;
        };
    L3370:
        return;
    L65:
        if (r34 != null) goto L67;
        r27 = 50658;
    L67:
        r27 = 50627;
        goto L62
    L68:
        Object[] r7 = r16.args;
        ip.n("args", r7);
        int r8 = r7.length;
        int r28 = 0;
    L69:
        int r35 = 50689;
    L70:
        r35 = r35 ^ 50706;
        switch(r35) {
            case 19: goto L73;
            case 45: goto L100;
            case 50: goto L75;
            case 76: goto L76;
            default: goto L70;
        };
    L100:
        Object r29 = null;
    L89:
        boolean r63 = r29 instanceof String;
        int r36 = 51836;
    L90:
        r36 = r36 ^ 51853;
        switch(r36) {
            case 241: goto L93;
            case 1963: goto L101;
            case 1992: goto L1535;
            case 2025: goto L102;
            default: goto L90;
        };
    L93:
        if (r63 == false) goto L101;
        r36 = 52580;
    L101:
        r36 = 52549;
        goto L90
    L102:
        String r210 = (String) r29;
    L103:
        int r37 = 52611;
    L104:
        r37 = r37 ^ 52628;
        switch(r37) {
            case 23: goto L107;
            case 54: goto L109;
            case 85: goto L115;
            case 116: goto L110;
            default: goto L104;
        };
    L107:
        if (r210 != null) goto L109;
        r37 = 52704;
    L109:
        r37 = 52673;
        goto L104
    L110:
        int r211 = 52735;
    L111:
        r211 = r211 ^ 52752;
        switch(r211) {
            case 14: goto L3371;
            case 1007: goto L114;
            default: goto L111;
        };
    L3371:
        return;
    L114:
        r211 = 52766;
        goto L111
    L115:
        boolean r47 = b50.B(r210, "message", true);
        int r38 = 53510;
    L116:
        r38 = r38 ^ 53527;
        switch(r38) {
            case 17: goto L119;
            case 50: goto L121;
            case 83: goto L136;
            case 116: goto L122;
            default: goto L116;
        };
    L119:
        if (r47 == true) goto L121;
        r38 = 53603;
    L121:
        r38 = 53572;
        goto L116
    L122:
        boolean r48 = b50.B(r210, "VoiceTransText", true);
        int r39 = 53634;
    L123:
        r39 = r39 ^ 53651;
        switch(r39) {
            case 17: goto L126;
            case 50: goto L128;
            case 76: goto L129;
            case 83: goto L136;
            default: goto L123;
        };
    L126:
        if (r48 == true) goto L128;
        r39 = 53727;
    L128:
        r39 = 53696;
        goto L123
    L129:
        boolean r310 = b50.B(r210, "rcontact", true);
        int r212 = 53758;
    L130:
        r212 = r212 ^ 53775;
        switch(r212) {
            case 1009: goto L133;
            case 1703: goto L135;
            case 1736: goto L3372;
            case 1769: goto L136;
            default: goto L130;
        };
    L3372:
        return;
    L133:
        if (r310 == false) goto L135;
        r212 = 54502;
    L135:
        r212 = 54471;
    L136:
        Handler r213 = uv.a;
        uv.b = r16.thisObject;
        ip.o(z30.k("xwGO\n", "s2Dpd1+FjZU=\n", "MessageDB", "53vj\n", "igiEy7e+YPk=\n"), "\u2705 \u6210\u529f\u622a\u83b7 WCDB \u5b9e\u4f8b\uff0c\u51c6\u5907\u9500\u6bc1\u9ad8\u9891 Hook \u4ee5\u91ca\u653e\u6027\u80fd\u3002");
        ArrayList r49 = jv.a;
        monitor-enter(r49);
        int r64 = r49.size();     // Catch: Throwable -> L153
        int r311 = 0;
    L139:
        int r214 = 54533;
    L140:
        r214 = r214 ^ 54550;     // Catch: Throwable -> L153
        switch(r214) {
            case 19: goto L143;
            case 50: goto L145;
            case 85: goto L159;
            case 116: goto L146;
            default: goto L140;
        };     // Catch: Throwable -> L153
    L159:
        jv.a.clear();     // Catch: Throwable -> L153
        monitor-exit(r49);
        int r215 = 55556;
    L162:
        r215 = r215 ^ 55573;
        switch(r215) {
            case 17: goto L165;
            case 54: goto L3373;
            default: goto L162;
        };
    L3373:
        return;
    L165:
        r215 = 55587;
        goto L162
    L143:
        if (r311 >= r64) goto L145;
        r214 = 54626;
    L145:
        r214 = 54595;
        goto L140
    L146:
        Object r216 = r49.get(r311);     // Catch: Throwable -> L153
        r311 = 1 - (0 - r311);     // Catch: Throwable -> L153
        ((XC_MethodHook.Unhook) r216).unhook();     // Catch: Throwable -> L1517
        int r217 = 54657;
    L149:
        r217 = r217 ^ 54674;
        switch(r217) {
            case 19: goto L152;
            case 50: goto L139;
            default: goto L149;
        };
    L152:
        r217 = 54688;
    L1518:
        int r218 = 1722829;
    L1519:
        r218 = r218 ^ 1722846;
        switch(r218) {
            case 19: goto L1522;
            case 50: goto L139;
            default: goto L1519;
        };
    L1522:
        r218 = 1722860;
    L153:
        th = move-exception;
        int r312 = 55432;
    L155:
        r312 = r312 ^ 55449;
        switch(r312) {
            case 17: goto L158;
            case 62: goto L167;
            default: goto L155;
        };
    L158:
        r312 = 55463;
        goto L155
    L167:
        throw th;
    L1535:
        r210 = null;
        goto L103
    L73:
        if (r28 >= r8) goto L75;
        r35 = 50782;
    L75:
        r35 = 50751;
        goto L70
    L76:
        Object r313 = r7[r28];
        boolean r9 = r313 instanceof String;
        int r65 = 50813;
    L77:
        r65 = r65 ^ 50830;
        switch(r65) {
            case 18: goto L80;
            case 53: goto L95;
            case 243: goto L81;
            case 4075: goto L83;
            default: goto L77;
        };
    L83:
        int r219 = 51588;
    L84:
        r219 = r219 ^ 51605;
        switch(r219) {
            case 17: goto L87;
            case 54: goto L88;
            default: goto L84;
        };
    L87:
        r219 = 51619;
        goto L84
    L88:
        r29 = r313;
    L80:
        r65 = 50875;
        goto L77
    L81:
        if (r9 == false) goto L80;
        r65 = 51557;
        goto L77
    L95:
        r28 = r28 + 1;
        int r314 = 51712;
    L96:
        r314 = r314 ^ 51729;
        switch(r314) {
            case 14: goto L69;
            case 15: goto L96;
            case 16: goto L96;
            case 17: goto L99;
            default: goto L96;
        };
    L99:
        r314 = 51743;
        goto L96
    L168:
        ip.o("p", r16);
        Object r220 = r16.args[0];
        boolean r410 = r220 instanceof String;
        int r315 = 55680;
    L169:
        r315 = r315 ^ 55697;
        switch(r315) {
            case 17: goto L172;
            case 1467: goto L174;
            case 1496: goto L180;
            case 1529: goto L175;
            default: goto L169;
        };
    L172:
        if (r410 == false) goto L174;
        r315 = 56424;
    L174:
        r315 = 56393;
        goto L169
    L175:
        String r221 = (String) r220;
        int r316 = 56455;
    L176:
        r316 = r316 ^ 56472;
        switch(r316) {
            case 31: goto L179;
            case 62: goto L181;
            default: goto L176;
        };
    L179:
        r316 = 56486;
    L181:
        int r317 = 56579;
    L182:
        r317 = r317 ^ 56596;
        switch(r317) {
            case 23: goto L185;
            case 54: goto L187;
            case 85: goto L3374;
            case 1564036: goto L188;
            default: goto L182;
        };
    L3374:
        return;
    L185:
        if (r221 == null) goto L187;
        r317 = 1507472;
    L187:
        r317 = 56641;
        goto L182
    L188:
        Locale r318 = Locale.ROOT;
        ip.n("ROOT", r318);
        String r411 = r221.toLowerCase(r318);
        ip.n("toLowerCase(...)", r411);
        Object r222 = r16.args[2];
        boolean r53 = r222 instanceof ContentValues;
        int r319 = 1507503;
    L189:
        r319 = r319 ^ 1507520;
        switch(r319) {
            case 14: goto L192;
            case 45: goto L1534;
            case 111: goto L193;
            case 460: goto L195;
            default: goto L189;
        };
    L192:
        r319 = 1507565;
        goto L189
    L193:
        if (r53 == false) goto L192;
        r319 = 1507596;
        goto L189
    L195:
        ContentValues r223 = (ContentValues) r222;
    L196:
        int r320 = 1507627;
    L197:
        r320 = r320 ^ 1507644;
        switch(r320) {
            case 23: goto L200;
            case 85: goto L208;
            case 118: goto L202;
            case 180: goto L203;
            default: goto L197;
        };
    L200:
        if (r223 != null) goto L202;
        r320 = 1507720;
    L202:
        r320 = 1507689;
        goto L197
    L203:
        int r224 = 1507751;
    L204:
        r224 = r224 ^ 1507768;
        switch(r224) {
            case 31: goto L207;
            case 1513: goto L3375;
            default: goto L204;
        };
    L3375:
        return;
    L207:
        r224 = 1508433;
        goto L204
    L208:
        boolean r54 = r411.equals("message");
        int r321 = 1508526;
    L209:
        r321 = r321 ^ 1508543;
        switch(r321) {
            case 17: goto L212;
            case 83: goto L222;
            case 114: goto L214;
            case 436: goto L215;
            default: goto L209;
        };
    L212:
        if (r54 == true) goto L214;
        r321 = 1508619;
    L214:
        r321 = 1508588;
        goto L209
    L215:
        boolean r55 = r411.equals("rcontact");
        int r322 = 1508650;
    L216:
        r322 = r322 ^ 1508667;
        switch(r322) {
            case 17: goto L219;
            case 83: goto L230;
            case 114: goto L221;
            case 3369: goto L222;
            default: goto L216;
        };
    L219:
        if (r55 == false) goto L221;
        r322 = 1509394;
    L221:
        r322 = 1508712;
    L230:
        gn r323 = gn.a;
        String r56 = "DBIntercept";
        iv r66 = new iv(r411, r223, r16, 0);
        r323.getClass();
        gn.j(r56, r66);
        return;
    L222:
        Object r57 = uv.b;
        int r324 = 1509425;
    L223:
        r324 = r324 ^ 1509442;
        switch(r324) {
            case 18: goto L226;
            case 45: goto L230;
            case 115: goto L227;
            case 204: goto L229;
            default: goto L223;
        };
    L226:
        r324 = 1509487;
        goto L223
    L227:
        if (r57 != null) goto L226;
        r324 = 1509518;
        goto L223
    L229:
        uv.b = r16.thisObject;
        goto L230
    L1534:
        r223 = null;
        goto L196
    L180:
        r221 = null;
        goto L181
    L231:
        ip.o("p", r16);
        Object r225 = r16.args[0];
        boolean r412 = r225 instanceof String;
        int r325 = 1509549;
    L232:
        r325 = r325 ^ 1509566;
        switch(r325) {
            case 19: goto L235;
            case 85: goto L1533;
            case 114: goto L237;
            case 436: goto L238;
            default: goto L232;
        };
    L235:
        if (r412 == false) goto L237;
        r325 = 1509642;
    L237:
        r325 = 1509611;
        goto L232
    L238:
        String r226 = (String) r225;
    L239:
        int r326 = 1509673;
    L240:
        r326 = r326 ^ 1509690;
        switch(r326) {
            case 19: goto L243;
            case 712: goto L3376;
            case 745: goto L245;
            case 1323: goto L246;
            default: goto L240;
        };
    L3376:
        return;
    L243:
        if (r226 == null) goto L245;
        r326 = 1510417;
    L245:
        r326 = 1510386;
        goto L240
    L246:
        Locale r327 = Locale.ROOT;
        ip.n("ROOT", r327);
        String r227 = r226.toLowerCase(r327);
        ip.n("toLowerCase(...)", r227);
        gn r328 = gn.a;
        String r413 = "DBIntercept";
        hv r58 = new hv(r227, 0, r16);
        r328.getClass();
        gn.j(r413, r58);
        return;
    L1533:
        r226 = null;
        goto L239
    L247:
        ip.o("param", r16);
        Object r228 = r16.thisObject;
        boolean r414 = r228 instanceof ViewGroup;
        int r329 = 1510448;
    L248:
        r329 = r329 ^ 1510465;
        switch(r329) {
            case 14: goto L251;
            case 47: goto L259;
            case 113: goto L252;
            case 204: goto L254;
            default: goto L248;
        };
    L251:
        r329 = 1510510;
        goto L248
    L252:
        if (r414 == false) goto L251;
        r329 = 1510541;
        goto L248
    L254:
        ViewGroup r229 = (ViewGroup) r228;
        int r330 = 1510572;
    L255:
        r330 = r330 ^ 1510589;
        switch(r330) {
            case 17: goto L258;
            case 118: goto L260;
            default: goto L255;
        };
    L258:
        r330 = 1510603;
    L260:
        int r331 = 1511347;
    L261:
        r331 = r331 ^ 1511364;
        switch(r331) {
            case 22: goto L264;
            case 53: goto L272;
            case 119: goto L265;
            case 8148: goto L267;
            default: goto L261;
        };
    L264:
        r331 = 1511409;
        goto L261
    L265:
        if (r229 != null) goto L264;
        r331 = 1511440;
        goto L261
    L267:
        int r230 = 1511471;
    L268:
        r230 = r230 ^ 1511488;
        switch(r230) {
            case 14: goto L3377;
            case 111: goto L271;
            default: goto L268;
        };
    L3377:
        return;
    L271:
        r230 = 1511502;
        goto L268
    L272:
        Object r332 = r229.getTag(2114322432);
        boolean r59 = r332 instanceof e9;
        int r415 = 1511595;
    L273:
        r415 = r415 ^ 1511612;
        switch(r415) {
            case 23: goto L276;
            case 815: goto L279;
            case 968: goto L290;
            case 1001: goto L278;
            default: goto L273;
        };
    L276:
        if (r59 == false) goto L278;
        r415 = 1512339;
    L278:
        r415 = 1512308;
        goto L273
    L279:
        e9 r333 = (e9) r332;
        int r416 = 1512370;
    L280:
        r416 = r416 ^ 1512387;
        switch(r416) {
            case 18: goto L283;
            case 113: goto L289;
            default: goto L280;
        };
    L283:
        int r417 = 1512494;
    L284:
        r417 = r417 ^ 1512511;
        switch(r417) {
            case 17: goto L287;
            case 83: goto L297;
            case 114: goto L291;
            case 809: goto L292;
            default: goto L284;
        };
    L287:
        if (r333 != null) goto L291;
        r417 = 1513238;
    L291:
        r417 = 1512556;
        goto L284
    L292:
        int r231 = 1513269;
    L293:
        r231 = r231 ^ 1513286;
        switch(r231) {
            case 18: goto L3378;
            case 115: goto L296;
            default: goto L293;
        };
    L3378:
        return;
    L296:
        r231 = 1513300;
        goto L293
    L297:
        f9 r67 = r333.h;
        int r418 = 1513393;
    L298:
        r418 = r418 ^ 1513410;
        switch(r418) {
            case 18: goto L301;
            case 45: goto L309;
            case 115: goto L302;
            case 4044: goto L304;
            default: goto L298;
        };
    L301:
        r418 = 1513455;
        goto L298
    L302:
        if (r67 != null) goto L301;
        r418 = 1513486;
        goto L298
    L304:
        int r232 = 1513517;
    L305:
        r232 = r232 ^ 1513534;
        switch(r232) {
            case 19: goto L308;
            case 745: goto L3379;
            default: goto L305;
        };
    L3379:
        return;
    L308:
        r232 = 1514199;
        goto L305
    L309:
        Object r510 = r16.args[0];
        ip.m("null cannot be cast to non-null type android.view.MotionEvent", r510);
        MotionEvent r511 = (MotionEvent) r510;
        g9 r419 = r333.g;
        int r92 = r511.getActionMasked();
        int r72 = 1514292;
    L310:
        r72 = r72 ^ 1514309;
        switch(r72) {
            case 22: goto L313;
            case 55: goto L554;
            case 113: goto L314;
            case 212: goto L316;
            default: goto L310;
        };
    L313:
        r72 = 1514354;
        goto L310
    L314:
        if (r92 == 0) goto L313;
        r72 = 1514385;
        goto L310
    L316:
        int r73 = 1514416;
    L317:
        r73 = r73 ^ 1514433;
        switch(r73) {
            case 14: goto L320;
            case 47: goto L549;
            case 113: goto L322;
            case 1369: goto L324;
            default: goto L317;
        };
    L320:
        r73 = 1514478;
        goto L317
    L322:
        if (r92 == 1) goto L320;
        r73 = 1515160;
        goto L317
    L324:
        int r74 = 1515191;
    L325:
        r74 = r74 ^ 1515208;
        switch(r74) {
            case 30: goto L328;
            case 61: goto L350;
            case 127: goto L330;
            case 476: goto L332;
            default: goto L325;
        };
    L328:
        r74 = 1515253;
        goto L325
    L330:
        if (r92 == 2) goto L328;
        r74 = 1515284;
        goto L325
    L332:
        int r75 = 1515315;
    L333:
        r75 = r75 ^ 1515332;
        switch(r75) {
            case 22: goto L336;
            case 53: goto L345;
            case 119: goto L338;
            case 212: goto L340;
            default: goto L333;
        };
    L336:
        r75 = 1515377;
        goto L333
    L338:
        if (r92 == 3) goto L336;
        r75 = 1515408;
        goto L333
    L340:
        int r233 = 1515439;
    L341:
        r233 = r233 ^ 1515456;
        switch(r233) {
            case 111: goto L344;
            case 15769: goto L3380;
            default: goto L341;
        };
    L3380:
        return;
    L344:
        r233 = 1516121;
        goto L341
    L345:
        vh.b(r229, r333, r419, r511, r67, r16, true);
        int r234 = 1516214;
    L346:
        r234 = r234 ^ 1516231;
        switch(r234) {
            case 18: goto L3381;
            case 113: goto L349;
            default: goto L346;
        };
    L3381:
        return;
    L349:
        r234 = 1516245;
        goto L346
    L350:
        int r76 = r511.getPointerCount();
        int r68 = 1516338;
    L351:
        r68 = r68 ^ 1516355;
        switch(r68) {
            case 18: goto L354;
            case 51: goto L363;
            case 113: goto L356;
            case 22444: goto L358;
            default: goto L351;
        };
    L354:
        r68 = 1516400;
        goto L351
    L356:
        if (r76 <= 1) goto L354;
        r68 = 1537263;
        goto L351
    L358:
        int r235 = 1537294;
    L359:
        r235 = r235 ^ 1537311;
        switch(r235) {
            case 17: goto L362;
            case 50: goto L3382;
            default: goto L359;
        };
    L3382:
        return;
    L362:
        r235 = 1537325;
        goto L359
    L363:
        float r14 = ((r511.getRawX() + 2.0f) - r419.a) - 2.0f;
        float r82 = r511.getRawY();
        float r93 = r419.b;
        Object r69 = r229.getTag(2114191365);
        boolean r10 = r69 instanceof VelocityTracker;
        int r77 = 1537418;
    L364:
        r77 = r77 ^ 1537435;
        switch(r77) {
            case 17: goto L367;
            case 50: goto L369;
            case 83: goto L375;
            case 124: goto L370;
            default: goto L364;
        };
    L367:
        if (r10 == false) goto L369;
        r77 = 1537511;
    L369:
        r77 = 1537480;
        goto L364
    L370:
        VelocityTracker r610 = (VelocityTracker) r69;
        int r78 = 1537542;
    L371:
        r78 = r78 ^ 1537559;
        switch(r78) {
            case 17: goto L374;
            case 3751: goto L376;
            default: goto L371;
        };
    L374:
        r78 = 1538224;
    L376:
        int r79 = 1538317;
    L377:
        r79 = r79 ^ 1538334;
        switch(r79) {
            case 19: goto L380;
            case 50: goto L382;
            case 85: goto L384;
            case 116: goto L383;
            default: goto L377;
        };
    L380:
        if (r610 == null) goto L382;
        r79 = 1538410;
    L382:
        r79 = 1538379;
        goto L377
    L383:
        r610.addMovement(r511);
    L384:
        boolean r710 = r419.c;
        int r611 = 1538441;
    L385:
        r611 = r611 ^ 1538458;
        switch(r611) {
            case 19: goto L388;
            case 50: goto L390;
            case 93: goto L429;
            case 1515: goto L391;
            default: goto L385;
        };
    L388:
        if (r710 == true) goto L390;
        r611 = 1539185;
    L390:
        r611 = 1538503;
        goto L385
    L391:
        float r711 = Math.abs(r14);
        float r102 = vh.e;
        int r612 = 1539216;
    L392:
        r612 = r612 ^ 1539233;
        switch(r612) {
            case 14: goto L395;
            case 49: goto L397;
            case 76: goto L399;
            case 111: goto L429;
            default: goto L392;
        };
    L395:
        r612 = 1539278;
        goto L392
    L397:
        if (r711 <= r102) goto L395;
        r612 = 1539309;
        goto L392
    L399:
        float r712 = Math.abs(r14);
        float r83 = Math.abs(((30.0f + r82) - r93) - 30.0f);
        int r613 = 1539340;
    L400:
        r613 = r613 ^ 1539357;
        switch(r613) {
            case 17: goto L404;
            case 54: goto L406;
            case 87: goto L429;
            case 116: goto L407;
            default: goto L400;
        };
    L404:
        if (r712 <= (2.5f * r83)) goto L406;
        r613 = 1539433;
    L406:
        r613 = 1539402;
        goto L400
    L407:
        r419.c = true;
        r229.setLayerType(2, null);
        ViewParent r713 = r229.getParent();
        int r614 = 1539464;
    L408:
        r614 = r614 ^ 1539481;
        switch(r614) {
            case 17: goto L411;
            case 64939: goto L413;
            case 64968: goto L415;
            case 65001: goto L414;
            default: goto L408;
        };
    L411:
        if (r713 == null) goto L413;
        r614 = 1540208;
    L413:
        r614 = 1540177;
        goto L408
    L414:
        r713.requestDisallowInterceptTouchEvent(true);
    L415:
        MotionEvent r615 = MotionEvent.obtain(r511.getDownTime(), r511.getEventTime(), 3, r511.getX(), r511.getY(), r511.getMetaState());
        XposedBridge.invokeOriginalMethod(r16.method, r16.thisObject, new MotionEvent[]{r615});     // Catch: Throwable -> L427
        int r512 = 1540239;
    L418:
        r512 = r512 ^ 1540256;
        switch(r512) {
            case 14: goto L421;
            case 47: goto L426;
            default: goto L418;
        };
    L421:
        r615.recycle();
        int r513 = 1540363;
    L422:
        r513 = r513 ^ 1540380;
        switch(r513) {
            case 23: goto L425;
            case 54: goto L429;
            default: goto L422;
        };
    L425:
        r513 = 1540394;
        goto L422
    L426:
        r512 = 1540270;
    L428:
        z30.o("Nwje\n", "Q2m5jaPP2Zc=\n", "GestureHook_CancelEv", "Fg==\n", "c8HJlSTQVfc=\n");
    L429:
        boolean r616 = r419.c;
        int r514 = 1541138;
    L430:
        r514 = r514 ^ 1541155;
        switch(r514) {
            case 18: goto L433;
            case 49: goto L434;
            case 76: goto L436;
            case 115: goto L3383;
            default: goto L430;
        };
    L3383:
        return;
    L433:
        r514 = 1541200;
        goto L430
    L434:
        if (r616 == false) goto L433;
        r514 = 1541231;
        goto L430
    L436:
        r229.setCameraDistance(vh.d * 20000.0f);
        float r515 = Math.abs(r14);
        float r617 = vh.g;
        float r618 = Math.signum(r14) * ((((1.0f - 25.0f) - (1.0f / (1.0f - (0.0f - ((r515 / r617) * 0.8f))))) + 25.0f) * r617);
        float r714 = Math.min(Math.abs(r618) / vh.g, 1.0f);
        float r84 = ac.n / 100.0f;
        int r94 = ac.m;
        int r516 = 1541262;
    L437:
        r516 = r516 ^ 1541279;
        switch(r516) {
            case 17: goto L440;
            case 50: goto L442;
            case 83: goto L513;
            case 116: goto L443;
            default: goto L437;
        };
    L440:
        if (r94 == 0) goto L442;
        r516 = 1541355;
    L442:
        r516 = 1541324;
        goto L437
    L443:
        int r517 = 1541386;
    L444:
        r517 = r517 ^ 1541403;
        switch(r517) {
            case 17: goto L448;
            case 687: goto L450;
            case 712: goto L508;
            case 745: goto L451;
            default: goto L444;
        };
    L448:
        if (r94 == 1) goto L450;
        r517 = 1542130;
    L450:
        r517 = 1542099;
        goto L444
    L451:
        int r518 = 1542161;
    L452:
        r518 = r518 ^ 1542178;
        switch(r518) {
            case 18: goto L455;
            case 51: goto L457;
            case 76: goto L459;
            case 109: goto L503;
            default: goto L452;
        };
    L455:
        r518 = 1542223;
        goto L452
    L457:
        if (r94 == 2) goto L455;
        r518 = 1542254;
        goto L452
    L459:
        int r519 = 1542285;
    L460:
        r519 = r519 ^ 1542302;
        switch(r519) {
            case 19: goto L464;
            case 50: goto L466;
            case 85: goto L491;
            case 1003: goto L467;
            default: goto L460;
        };
    L464:
        if (r94 == 3) goto L466;
        r519 = 1543029;
    L466:
        r519 = 1542347;
        goto L460
    L467:
        int r334 = 1543060;
    L468:
        r334 = r334 ^ 1543077;
        switch(r334) {
            case 22: goto L471;
            case 49: goto L473;
            case 84: goto L475;
            case 119: goto L486;
            default: goto L468;
        };
    L471:
        r334 = 1543122;
        goto L468
    L473:
        if (r94 == 4) goto L471;
        r334 = 1543153;
        goto L468
    L475:
        int r335 = 1543184;
    L476:
        r335 = r335 ^ 1543201;
        switch(r335) {
            case 14: goto L479;
            case 49: goto L485;
            default: goto L476;
        };
    L479:
        boolean r520 = r419.e;
        int r336 = 1545230;
    L480:
        r336 = r336 ^ 1545247;
        switch(r336) {
            case 17: goto L483;
            case 679: goto L514;
            case 712: goto L533;
            case 745: goto L515;
            default: goto L480;
        };
    L483:
        if (r520 == true) goto L514;
        r336 = 1545974;
    L514:
        r336 = 1545943;
        goto L480
    L515:
        float r521 = Math.abs(r14);
        float r619 = vh.f;
        int r337 = 1546005;
    L516:
        r337 = r337 ^ 1546022;
        switch(r337) {
            case 18: goto L519;
            case 51: goto L521;
            case 84: goto L523;
            case 117: goto L533;
            default: goto L516;
        };
    L519:
        r337 = 1546067;
        goto L516
    L521:
        if (r521 <= r619) goto L519;
        r337 = 1546098;
        goto L516
    L523:
        r419.e = true;
        gn.a.getClass();
        gn.i(r229, 4);
        int r236 = 1546129;
    L524:
        r236 = r236 ^ 1546146;
        switch(r236) {
            case 18: goto L527;
            case 51: goto L532;
            default: goto L524;
        };
    L527:
        r16.setResult(Boolean.TRUE);
        int r237 = 1567333;
    L528:
        r237 = r237 ^ 1567350;
        switch(r237) {
            case 19: goto L531;
            case 1913: goto L3384;
            default: goto L528;
        };
    L3384:
        return;
    L531:
        r237 = 1568015;
        goto L528
    L532:
        r236 = 1546160;
    L533:
        boolean r338 = r419.e;
        int r238 = 1567085;
    L534:
        r238 = r238 ^ 1567102;
        switch(r238) {
            case 19: goto L537;
            case 180: goto L540;
            case 213: goto L527;
            case 242: goto L539;
            default: goto L534;
        };
    L537:
        if (r338 == false) goto L539;
        r238 = 1567178;
    L539:
        r238 = 1567147;
        goto L534
    L540:
        float r339 = Math.abs(r14);
        float r522 = vh.f;
        int r239 = 1567209;
    L541:
        r239 = r239 ^ 1567226;
        switch(r239) {
            case 19: goto L545;
            case 956: goto L548;
            case 989: goto L527;
            case 1010: goto L547;
            default: goto L541;
        };
    L545:
        if (r339 > r522) goto L547;
        r239 = 1567302;
    L547:
        r239 = 1567271;
        goto L541
    L548:
        r419.e = false;
        goto L527
    L485:
        r335 = 1543215;
        goto L476
    L486:
        r229.setTranslationX((0.8f * r618) * r84);
        r229.setTranslationY(-((15.0f * r714) * r84));
        float r340 = 0.0f - ((0.0f - ((0.1f * r714) * r84)) - 1.0f);
        r229.setScaleX(r340);
        r229.setScaleY(r340);
        int r341 = 1543308;
    L487:
        r341 = r341 ^ 1543325;
        switch(r341) {
            case 17: goto L490;
            case 939: goto L479;
            default: goto L487;
        };
    L490:
        r341 = 1543990;
        goto L487
    L491:
        r229.setTranslationX((0.9f * r618) * r84);
        r229.setTranslationY(-((50.0f * r714) * r84));
        r229.setRotation((r618 * r84) / 60.0f);
        View r523 = r333.e;
        int r342 = 1544083;
    L492:
        r342 = r342 ^ 1544100;
        switch(r342) {
            case 22: goto L495;
            case 55: goto L496;
            case 84: goto L498;
            case 117: goto L479;
            default: goto L492;
        };
    L495:
        r342 = 1544145;
        goto L492
    L496:
        if (r523 == null) goto L495;
        r342 = 1544176;
        goto L492
    L498:
        r523.setAlpha(Math.max(0.15f, ((1.0f + 22.0f) - ((r714 * 2.5f) * r84)) - 22.0f));
        int r343 = 1544207;
    L499:
        r343 = r343 ^ 1544224;
        switch(r343) {
            case 14: goto L479;
            case 47: goto L502;
            default: goto L499;
        };
    L502:
        r343 = 1544238;
        goto L499
    L503:
        r229.setTranslationX((0.85f * r618) * r84);
        r229.setRotationX(-((25.0f * r714) * r84));
        r229.setRotationY((Math.signum(r14) * (35.0f * r714)) * r84);
        float r344 = ((1.0f - 3.0f) - ((0.12f * r714) * r84)) + 3.0f;
        r229.setScaleX(r344);
        r229.setScaleY(r344);
        r229.setTranslationZ((150.0f * r714) * r84);
        int r345 = 1544982;
    L504:
        r345 = r345 ^ 1544999;
        switch(r345) {
            case 18: goto L479;
            case 49: goto L507;
            default: goto L504;
        };
    L507:
        r345 = 1545013;
        goto L504
    L508:
        r229.setTranslationX((1.15f * r618) * r84);
        r229.setRotation((r618 * r84) / 30.0f);
        r229.setScaleX(((((0.35f * r714) * r84) + 0.0f) + 1.0f) - 0.0f);
        r229.setScaleY(((1.0f + 22.0f) - ((0.25f * r714) * r84)) - 22.0f);
        int r346 = 1545106;
    L509:
        r346 = r346 ^ 1545123;
        switch(r346) {
            case 18: goto L479;
            case 49: goto L512;
            default: goto L509;
        };
    L512:
        r346 = 1545137;
        goto L509
    L513:
        r229.setTranslationX((0.5f * r618) * r84);
        goto L479
    L375:
        r610 = null;
        goto L376
    L549:
        vh.b(r229, r333, r419, r511, r67, r16, false);
        int r240 = 1568108;
    L550:
        r240 = r240 ^ 1568125;
        switch(r240) {
            case 17: goto L553;
            case 246: goto L3385;
            default: goto L550;
        };
    L3385:
        return;
    L553:
        r240 = 1568139;
        goto L550
    L554:
        r419.a = r511.getRawX();
        r419.b = r511.getRawY();
        r419.c = false;
        r419.d = false;
        r419.e = false;
        vh.g = r229.getResources().getDisplayMetrics().widthPixels;
        float r347 = r229.getResources().getDisplayMetrics().density;
        vh.d = r347;
        vh.e = 24.0f * r347;
        vh.f = r347 * 90.0f;
        r229.setClipChildren(false);
        r229.setClipToPadding(false);
        ViewParent r348 = r229.getParent();
        boolean r620 = r348 instanceof ViewGroup;
        int r420 = 1568232;
    L555:
        r420 = r420 ^ 1568249;
        switch(r420) {
            case 17: goto L558;
            case 991: goto L572;
            case 1022: goto L560;
            case 7465: goto L561;
            default: goto L555;
        };
    L558:
        if (r620 == false) goto L560;
        r420 = 1568976;
    L560:
        r420 = 1568294;
        goto L555
    L561:
        ViewGroup r349 = (ViewGroup) r348;
        int r421 = 1569007;
    L562:
        r421 = r421 ^ 1569024;
        switch(r421) {
            case 14: goto L565;
            case 495: goto L571;
            default: goto L562;
        };
    L565:
        int r422 = 1569131;
    L566:
        r422 = r422 ^ 1569148;
        switch(r422) {
            case 23: goto L569;
            case 180: goto L574;
            case 213: goto L575;
            case 246: goto L573;
            default: goto L566;
        };
    L569:
        if (r349 == null) goto L573;
        r422 = 1569224;
    L573:
        r422 = 1569193;
        goto L566
    L574:
        r349.setClipChildren(false);
    L575:
        ViewParent r350 = r229.getParent();
        boolean r621 = r350 instanceof ViewGroup;
        int r423 = 1569255;
    L576:
        r423 = r423 ^ 1569272;
        switch(r423) {
            case 31: goto L579;
            case 1335: goto L582;
            case 1352: goto L587;
            case 1385: goto L581;
            default: goto L576;
        };
    L579:
        if (r621 == false) goto L581;
        r423 = 1569999;
    L581:
        r423 = 1569968;
        goto L576
    L582:
        ViewGroup r351 = (ViewGroup) r350;
        int r424 = 1570030;
    L583:
        r424 = r424 ^ 1570047;
        switch(r424) {
            case 17: goto L586;
            case 498: goto L588;
            default: goto L583;
        };
    L586:
        r424 = 1570061;
    L588:
        int r425 = 1570154;
    L589:
        r425 = r425 ^ 1570171;
        switch(r425) {
            case 17: goto L592;
            case 211: goto L596;
            case 242: goto L594;
            case 3369: goto L595;
            default: goto L589;
        };
    L592:
        if (r351 == null) goto L594;
        r425 = 1570898;
    L594:
        r425 = 1570216;
        goto L589
    L595:
        r351.setClipToPadding(false);
    L596:
        Object r352 = r229.getTag(2114191365);
        boolean r622 = r352 instanceof VelocityTracker;
        int r426 = 1570929;
    L597:
        r426 = r426 ^ 1570946;
        switch(r426) {
            case 18: goto L600;
            case 45: goto L608;
            case 76: goto L603;
            case 243: goto L601;
            default: goto L597;
        };
    L600:
        r426 = 1570991;
        goto L597
    L601:
        if (r622 == false) goto L600;
        r426 = 1571022;
        goto L597
    L603:
        VelocityTracker r353 = (VelocityTracker) r352;
        int r427 = 1571053;
    L604:
        r427 = r427 ^ 1571070;
        switch(r427) {
            case 19: goto L607;
            case 498: goto L609;
            default: goto L604;
        };
    L607:
        r427 = 1571084;
    L609:
        int r428 = 1571177;
    L610:
        r428 = r428 ^ 1571194;
        switch(r428) {
            case 19: goto L613;
            case 1323: goto L616;
            case 1352: goto L617;
            case 1385: goto L615;
            default: goto L610;
        };
    L613:
        if (r353 == null) goto L615;
        r428 = 1571921;
    L615:
        r428 = 1571890;
        goto L610
    L616:
        r353.recycle();
    L617:
        Object r354 = r229.getTag(2114191367);
        boolean r623 = r354 instanceof Runnable;
        int r429 = 1571952;
    L618:
        r429 = r429 ^ 1571969;
        switch(r429) {
            case 14: goto L621;
            case 47: goto L629;
            case 76: goto L624;
            case 241: goto L622;
            default: goto L618;
        };
    L621:
        r429 = 1572014;
        goto L618
    L622:
        if (r623 == false) goto L621;
        r429 = 1572045;
        goto L618
    L624:
        Runnable r355 = (Runnable) r354;
        int r430 = 1572076;
    L625:
        r430 = r430 ^ 1572093;
        switch(r430) {
            case 17: goto L628;
            case 502: goto L630;
            default: goto L625;
        };
    L628:
        r430 = 1572107;
    L630:
        int r431 = 1572851;
    L631:
        r431 = r431 ^ 1572868;
        switch(r431) {
            case 22: goto L634;
            case 53: goto L638;
            case 84: goto L637;
            case 1048567: goto L635;
            default: goto L631;
        };
    L634:
        r431 = 1572913;
        goto L631
    L635:
        if (r355 == null) goto L634;
        r431 = 1572944;
        goto L631
    L637:
        r229.removeCallbacks(r355);
        r229.setTag(2114191367, null);
    L638:
        Object r356 = r229.getTag(2114191361);
        boolean r624 = r356 instanceof h40;
        int r432 = 1572975;
    L639:
        r432 = r432 ^ 1572992;
        switch(r432) {
            case 14: goto L642;
            case 45: goto L650;
            case 76: goto L645;
            case 239: goto L643;
            default: goto L639;
        };
    L642:
        r432 = 1573037;
        goto L639
    L643:
        if (r624 == false) goto L642;
        r432 = 1573068;
        goto L639
    L645:
        h40 r357 = (h40) r356;
        int r433 = 1573099;
    L646:
        r433 = r433 ^ 1573116;
        switch(r433) {
            case 23: goto L649;
            case 873: goto L651;
            default: goto L646;
        };
    L649:
        r433 = 1573781;
    L651:
        int r434 = 1573874;
    L652:
        r434 = r434 ^ 1573891;
        switch(r434) {
            case 18: goto L655;
            case 51: goto L666;
            case 76: goto L658;
            case 2033: goto L656;
            default: goto L652;
        };
    L655:
        r434 = 1573936;
        goto L652
    L656:
        if (r357 == null) goto L655;
        r434 = 1573967;
        goto L652
    L658:
        boolean r625 = r357.e;
        int r435 = 1573998;
    L659:
        r435 = r435 ^ 1574015;
        switch(r435) {
            case 17: goto L662;
            case 211: goto L666;
            case 242: goto L664;
            case 809: goto L665;
            default: goto L659;
        };
    L662:
        if (r625 == false) goto L664;
        r435 = 1574742;
    L664:
        r435 = 1574060;
        goto L659
    L665:
        r357.c();
    L666:
        Object r358 = r229.getTag(2114191362);
        boolean r626 = r358 instanceof h40;
        int r436 = 1574773;
    L667:
        r436 = r436 ^ 1574790;
        switch(r436) {
            case 18: goto L670;
            case 53: goto L684;
            case 84: goto L673;
            case 243: goto L671;
            default: goto L667;
        };
    L670:
        r436 = 1574835;
        goto L667
    L671:
        if (r626 == false) goto L670;
        r436 = 1574866;
        goto L667
    L673:
        h40 r359 = (h40) r358;
        int r437 = 1574897;
    L674:
        r437 = r437 ^ 1574914;
        switch(r437) {
            case 18: goto L677;
            case 4083: goto L683;
            default: goto L674;
        };
    L677:
        int r438 = 1575021;
    L678:
        r438 = r438 ^ 1575038;
        switch(r438) {
            case 19: goto L681;
            case 811: goto L686;
            case 840: goto L694;
            case 873: goto L685;
            default: goto L678;
        };
    L681:
        if (r359 == null) goto L685;
        r438 = 1575765;
    L685:
        r438 = 1575734;
        goto L678
    L686:
        boolean r627 = r359.e;
        int r439 = 1575796;
    L687:
        r439 = r439 ^ 1575813;
        switch(r439) {
            case 22: goto L690;
            case 55: goto L694;
            case 84: goto L693;
            case 241: goto L691;
            default: goto L687;
        };
    L690:
        r439 = 1575858;
        goto L687
    L691:
        if (r627 == false) goto L690;
        r439 = 1575889;
        goto L687
    L693:
        r359.c();
    L694:
        Object r360 = r229.getTag(2114191363);
        boolean r628 = r360 instanceof h40;
        int r440 = 1575920;
    L695:
        r440 = r440 ^ 1575937;
        switch(r440) {
            case 14: goto L698;
            case 47: goto L706;
            case 2033: goto L699;
            case 20908: goto L701;
            default: goto L695;
        };
    L698:
        r440 = 1575982;
        goto L695
    L699:
        if (r628 == false) goto L698;
        r440 = 1596845;
        goto L695
    L701:
        h40 r361 = (h40) r360;
        int r441 = 1596876;
    L702:
        r441 = r441 ^ 1596893;
        switch(r441) {
            case 17: goto L705;
            case 54: goto L707;
            default: goto L702;
        };
    L705:
        r441 = 1596907;
    L707:
        int r442 = 1597000;
    L708:
        r442 = r442 ^ 1597017;
        switch(r442) {
            case 17: goto L711;
            case 62: goto L713;
            case 223: goto L722;
            case 252: goto L714;
            default: goto L708;
        };
    L711:
        if (r361 == null) goto L713;
        r442 = 1597093;
    L713:
        r442 = 1597062;
        goto L708
    L714:
        boolean r629 = r361.e;
        int r443 = 1597124;
    L715:
        r443 = r443 ^ 1597141;
        switch(r443) {
            case 17: goto L718;
            case 16216: goto L722;
            case 16249: goto L721;
            case 16315: goto L720;
            default: goto L715;
        };
    L718:
        if (r629 == false) goto L720;
        r443 = 1597868;
    L720:
        r443 = 1597837;
        goto L715
    L721:
        r361.c();
    L722:
        Object r362 = r229.getTag(2114191364);
        boolean r630 = r362 instanceof h40;
        int r444 = 1597899;
    L723:
        r444 = r444 ^ 1597916;
        switch(r444) {
            case 23: goto L726;
            case 54: goto L728;
            case 981: goto L734;
            case 1012: goto L729;
            default: goto L723;
        };
    L726:
        if (r630 == false) goto L728;
        r444 = 1597992;
    L728:
        r444 = 1597961;
        goto L723
    L729:
        h40 r363 = (h40) r362;
        int r445 = 1598023;
    L730:
        r445 = r445 ^ 1598040;
        switch(r445) {
            case 31: goto L733;
            case 62: goto L735;
            default: goto L730;
        };
    L733:
        r445 = 1598054;
    L735:
        int r446 = 1598798;
    L736:
        r446 = r446 ^ 1598815;
        switch(r446) {
            case 17: goto L739;
            case 50: goto L741;
            case 211: goto L750;
            case 244: goto L742;
            default: goto L736;
        };
    L739:
        if (r363 == null) goto L741;
        r446 = 1598891;
    L741:
        r446 = 1598860;
        goto L736
    L742:
        boolean r631 = r363.e;
        int r447 = 1598922;
    L743:
        r447 = r447 ^ 1598939;
        switch(r447) {
            case 17: goto L746;
            case 50: goto L748;
            case 979: goto L750;
            case 1020: goto L749;
            default: goto L743;
        };
    L746:
        if (r631 == false) goto L748;
        r447 = 1599015;
    L748:
        r447 = 1598984;
        goto L743
    L749:
        r363.c();
    L750:
        Object r364 = r229.getTag(2114191366);
        boolean r632 = r364 instanceof h40;
        int r448 = 1599046;
    L751:
        r448 = r448 ^ 1599063;
        switch(r448) {
            case 17: goto L754;
            case 3751: goto L756;
            case 3928: goto L1532;
            case 3961: goto L757;
            default: goto L751;
        };
    L754:
        if (r632 == false) goto L756;
        r448 = 1599790;
    L756:
        r448 = 1599759;
        goto L751
    L757:
        h40 r365 = (h40) r364;
    L758:
        int r449 = 1599821;
    L759:
        r449 = r449 ^ 1599838;
        switch(r449) {
            case 19: goto L762;
            case 50: goto L764;
            case 213: goto L773;
            case 244: goto L765;
            default: goto L759;
        };
    L762:
        if (r365 == null) goto L764;
        r449 = 1599914;
    L764:
        r449 = 1599883;
        goto L759
    L765:
        boolean r633 = r365.e;
        int r450 = 1599945;
    L766:
        r450 = r450 ^ 1599962;
        switch(r450) {
            case 19: goto L769;
            case 50: goto L771;
            case 989: goto L773;
            case 1387: goto L772;
            default: goto L766;
        };
    L769:
        if (r633 == false) goto L771;
        r450 = 1600689;
    L771:
        r450 = 1600007;
        goto L766
    L772:
        r365.c();
    L773:
        VelocityTracker r366 = VelocityTracker.obtain();
        r366.addMovement(r511);
        r229.setTag(2114191365, r366);
        return;
    L1532:
        r365 = null;
        goto L758
    L734:
        r363 = null;
        goto L735
    L706:
        r361 = null;
        goto L707
    L683:
        r437 = 1574928;
        goto L674
    L684:
        r359 = null;
        goto L677
    L650:
        r357 = null;
        goto L651
    L629:
        r355 = null;
        goto L630
    L608:
        r353 = null;
        goto L609
    L587:
        r351 = null;
        goto L588
    L571:
        r421 = 1569038;
        goto L562
    L572:
        r349 = null;
        goto L565
    L289:
        r416 = 1512401;
        goto L280
    L290:
        r333 = null;
        goto L283
    L259:
        r229 = null;
        goto L260
    L774:
        ip.o("param", r16);
        Object r241 = r16.args[0];
        ip.m("null cannot be cast to non-null type kotlin.Int", r241);
        int r367 = ((Integer) r241).intValue();
        int r242 = 1600720;
    L775:
        r242 = r242 ^ 1600737;
        switch(r242) {
            case 14: goto L778;
            case 49: goto L780;
            case 460: goto L782;
            case 495: goto L3386;
            default: goto L775;
        };
    L3386:
        return;
    L778:
        r242 = 1600782;
        goto L775
    L780:
        if (r367 != 32275) goto L778;
        r242 = 1600813;
        goto L775
    L782:
        r16.setResult(null);
        Object r243 = r16.thisObject;
        ip.m("null cannot be cast to non-null type android.app.Activity", r243);
        Activity r244 = (Activity) r243;
        Object r368 = r16.args[1];
        ip.m("null cannot be cast to non-null type kotlin.Int", r368);
        int r524 = ((Integer) r368).intValue();
        Object r369 = r16.args[2];
        boolean r634 = r369 instanceof Intent;
        int r451 = 1600844;
    L783:
        r451 = r451 ^ 1600861;
        switch(r451) {
            case 17: goto L786;
            case 54: goto L788;
            case 215: goto L1531;
            case 244: goto L789;
            default: goto L783;
        };
    L786:
        if (r634 == false) goto L788;
        r451 = 1600937;
    L788:
        r451 = 1600906;
        goto L783
    L789:
        Intent r370 = (Intent) r369;
    L790:
        int r452 = 1600968;
    L791:
        r452 = r452 ^ 1600985;
        switch(r452) {
            case 17: goto L795;
            case 7496: goto L3387;
            case 7529: goto L798;
            case 7595: goto L797;
            default: goto L791;
        };
    L3387:
        return;
    L795:
        if (r524 != (-1)) goto L797;
        r452 = 1601712;
    L797:
        r452 = 1601681;
        goto L791
    L798:
        int r453 = 1601743;
    L799:
        r453 = r453 ^ 1601760;
        switch(r453) {
            case 14: goto L802;
            case 47: goto L803;
            case 460: goto L805;
            case 493: goto L3388;
            default: goto L799;
        };
    L3388:
        return;
    L802:
        r453 = 1601805;
        goto L799
    L803:
        if (r370 == null) goto L802;
        r453 = 1601836;
        goto L799
    L805:
        int r525 = a80.v.length();
        int r454 = 1601867;
    L806:
        r454 = r454 ^ 1601884;
        switch(r454) {
            case 23: goto L809;
            case 54: goto L811;
            case 213: goto L3389;
            case 1391: goto L1549;
            default: goto L806;
        };
    L1549:
        Uri r455 = r370.getData();     // Catch: Throwable -> L845
        int r371 = 1602642;
    L814:
        r371 = r371 ^ 1602659;
        switch(r371) {
            case 18: goto L817;
            case 49: goto L818;
            case 204: goto L820;
            case 243: goto L825;
            default: goto L814;
        };
    L817:
        r371 = 1602704;
        goto L814
    L818:
        if (r455 != null) goto L817;
        r371 = 1602735;
    L820:
        "<set-?>";
        a80.v = "";
        int r245 = 1602766;
    L821:
        r245 = r245 ^ 1602783;
        switch(r245) {
            case 17: goto L824;
            case 50: goto L3390;
            default: goto L821;
        };
    L3390:
        return;
    L824:
        r245 = 1602797;
        goto L821
    L825:
        InputStream r526 = r244.getContentResolver().openInputStream(r455);     // Catch: Throwable -> L845
        int r372 = 1602890;
    L827:
        r372 = r372 ^ 1602907;
        switch(r372) {
            case 17: goto L830;
            case 687: goto L832;
            case 3400: goto L838;
            case 3433: goto L1537;
            default: goto L827;
        };
    L1537:
        Bitmap r373 = Bitmap.createScaledBitmap(BitmapFactory.decodeStream(r526), 144, 144, true);     // Catch: Throwable -> L860
        ip.n("createScaledBitmap(...)", r373);     // Catch: Throwable -> L860
        ByteArrayOutputStream r456 = new ByteArrayOutputStream();     // Catch: Throwable -> L860
        r373.compress(Bitmap.CompressFormat.PNG, 100, r456);     // Catch: Throwable -> L860
        String r374 = Base64.encodeToString(r456.toByteArray(), 2);     // Catch: Throwable -> L860
        gn r457 = gn.a;     // Catch: Throwable -> L860
        String r635 = "geek_avatar_".concat(a80.v);     // Catch: Throwable -> L860
        ip.l(r374);     // Catch: Throwable -> L860
        r457.getClass();     // Catch: Throwable -> L860
        gn.h(r635, r374);     // Catch: Throwable -> L860
        r526.close();     // Catch: Throwable -> L845
        int r375 = 1603665;
    L835:
        r375 = r375 ^ 1603682;     // Catch: Throwable -> L845
        switch(r375) {
            case 18: goto L838;
            case 51: goto L844;
            default: goto L835;
        };     // Catch: Throwable -> L845
    L844:
        r375 = 1603696;
        goto L835
    L860:
        th = move-exception;
        int r458 = 1604688;
    L862:
        r458 = r458 ^ 1604705;
        switch(r458) {
            case 14: goto L851;
            case 49: goto L865;
            default: goto L862;
        };
    L851:
        int r459 = 1604564;
    L852:
        r459 = r459 ^ 1604581;
        switch(r459) {
            case 22: goto L1543;
            case 49: goto L859;
            default: goto L852;
        };
    L1543:
        throw th;     // Catch: Throwable -> L856
    L856:
        th = move-exception;
        ff.j(r526, th);     // Catch: Throwable -> L845
        throw th;     // Catch: Throwable -> L845
    L859:
        r459 = 1604595;
        goto L852
    L865:
        r458 = 1604719;
        goto L862
    L830:
        if (r526 == null) goto L832;
        r372 = 1603634;
    L832:
        r372 = 1603603;
    L838:
        gn r376 = gn.a;     // Catch: Throwable -> L845
        String r460 = "\u5934\u50cf\u8bbe\u7f6e\u6210\u529f\uff01\u4e0b\u62c9\u5237\u65b0\u4e3b\u9875\u5373\u53ef\u751f\u6548\u3002";     // Catch: Throwable -> L845
        r376.getClass();     // Catch: Throwable -> L845
        gn.k(r244, r460);     // Catch: Throwable -> L845
        int r246 = 1604812;
    L840:
        r246 = r246 ^ 1604829;
        switch(r246) {
            case 17: goto L843;
            case 939: goto L820;
            default: goto L840;
        };
    L843:
        r246 = 1605494;
    L845:
        th = move-exception;
        int r461 = 1603789;
    L847:
        r461 = r461 ^ 1603806;
        switch(r461) {
            case 19: goto L850;
            case 50: goto L1539;
            default: goto L847;
        };
    L1539:
        ip.o("tag", "AvatarSaveError");     // Catch: Throwable -> L872
        "e";     // Catch: Throwable -> L872
        gn r462 = gn.a;     // Catch: Throwable -> L872
        String r377 = "头像处理失败: " + th.getMessage();     // Catch: Throwable -> L872
        r462.getClass();     // Catch: Throwable -> L872
        gn.k(r244, r377);     // Catch: Throwable -> L872
        int r247 = 1605587;
    L868:
        r247 = r247 ^ 1605604;
        switch(r247) {
            case 22: goto L820;
            case 55: goto L871;
            default: goto L868;
        };
    L871:
        r247 = 1605618;
    L872:
        th = move-exception;
        "<set-?>";
        a80.v = "";
        throw th;
    L850:
        r461 = 1603820;
        goto L847
    L3389:
        return;
    L809:
        if (r525 <= 0) goto L811;
        r454 = 1602611;
    L811:
        r454 = 1601929;
        goto L806
    L1531:
        r370 = null;
        goto L790
    L875:
        ip.o("param", r16);
        Object[] r527 = r16.args;
        ip.n("args", r527);
        int r636 = r527.length;
        int r248 = 0;
    L876:
        int r378 = 1605711;
    L877:
        r378 = r378 ^ 1605728;
        switch(r378) {
            case 14: goto L880;
            case 47: goto L881;
            case 237: goto L907;
            case 21100: goto L883;
            default: goto L877;
        };
    L907:
        Object r249 = null;
    L896:
        boolean r463 = r249 instanceof String;
        int r379 = 1627690;
    L897:
        r379 = r379 ^ 1627707;
        switch(r379) {
            case 17: goto L900;
            case 83: goto L921;
            case 114: goto L908;
            case 188: goto L909;
            default: goto L897;
        };
    L900:
        if (r463 == false) goto L908;
        r379 = 1627783;
    L908:
        r379 = 1627752;
        goto L897
    L909:
        String r250 = (String) r249;
        int r380 = 1627814;
    L910:
        r380 = r380 ^ 1627831;
        switch(r380) {
            case 17: goto L913;
            case 114: goto L914;
            default: goto L910;
        };
    L913:
        r380 = 1627845;
        goto L910
    L914:
        String r381 = r250;
    L915:
        int r251 = 1628589;
    L916:
        r251 = r251 ^ 1628606;
        switch(r251) {
            case 19: goto L919;
            case 85: goto L928;
            case 114: goto L922;
            case 948: goto L923;
            default: goto L916;
        };
    L919:
        if (r381 != null) goto L922;
        r251 = 1628682;
    L922:
        r251 = 1628651;
        goto L916
    L923:
        int r252 = 1628713;
    L924:
        r252 = r252 ^ 1628730;
        switch(r252) {
            case 19: goto L927;
            case 114: goto L3391;
            default: goto L924;
        };
    L3391:
        return;
    L927:
        r252 = 1628744;
        goto L924
    L928:
        boolean r464 = b50.N(r381, "geek_fold_", false);
        int r253 = 1628837;
    L929:
        r253 = r253 ^ 1628854;
        switch(r253) {
            case 19: goto L932;
            case 1851: goto L935;
            case 2008: goto L968;
            case 2041: goto L934;
            default: goto L929;
        };
    L932:
        if (r464 == false) goto L934;
        r253 = 1629581;
    L934:
        r253 = 1629550;
        goto L929
    L935:
        "<set-?>";
        ff.z = r381;
        r16.setResult(null);
        Object r254 = r16.thisObject;
        boolean r528 = r254 instanceof Activity;
        int r465 = 1629612;
    L936:
        r465 = r465 ^ 1629629;
        switch(r465) {
            case 17: goto L939;
            case 87: goto L1530;
            case 118: goto L941;
            case 948: goto L942;
            default: goto L936;
        };
    L939:
        if (r528 == false) goto L941;
        r465 = 1629705;
    L941:
        r465 = 1629674;
        goto L936
    L942:
        Activity r255 = (Activity) r254;
    L943:
        int r466 = 1629736;
    L944:
        r466 = r466 ^ 1629753;
        switch(r466) {
            case 17: goto L947;
            case 95: goto L955;
            case 126: goto L949;
            case 16169: goto L950;
            default: goto L944;
        };
    L947:
        if (r255 != null) goto L949;
        r466 = 1630480;
    L949:
        r466 = 1629798;
        goto L944
    L950:
        int r256 = 1630511;
    L951:
        r256 = r256 ^ 1630528;
        switch(r256) {
            case 14: goto L3392;
            case 111: goto L954;
            default: goto L951;
        };
    L3392:
        return;
    L954:
        r256 = 1630542;
        goto L951
    L955:
        gn r467 = gn.a;
        String r529 = "key_geek_folder_name_".concat(r381);
        String r637 = "\u81ea\u5b9a\u4e49\u6587\u4ef6\u5939";
        r467.getClass();
        gn.d(r529, r637);
        "context";
        "folderId";
        "folderName";
        Intent r468 = new Intent();     // Catch: Throwable -> L962
        r468.setClassName(r255, "com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI");     // Catch: Throwable -> L962
        r468.putExtra("Contact_User", r381);     // Catch: Throwable -> L962
        r255.startActivity(r468);     // Catch: Throwable -> L962
        int r257 = 1630635;
    L958:
        r257 = r257 ^ 1630652;
        switch(r257) {
            case 23: goto L961;
            case 118: goto L3393;
            default: goto L958;
        };
    L3393:
        return;
    L961:
        r257 = 1630666;
    L963:
        z30.o("Nwje\n", "Q2m5jaPP2Zc=\n", "LaunchNativeFolder", "Fg==\n", "c8HJlSTQVfc=\n");
        Toast.makeText(r255, "\u539f\u751f\u6298\u53e0\u9875\u5524\u8d77\u5931\u8d25\uff0c\u7248\u672c\u53ef\u80fd\u8fc7\u65e7", 0).show();
        int r258 = 1630759;
    L964:
        r258 = r258 ^ 1630776;
        switch(r258) {
            case 31: goto L967;
            case 1769: goto L3394;
            default: goto L964;
        };
    L3394:
        return;
    L967:
        r258 = 1631441;
        goto L964
    L1530:
        r255 = null;
        goto L943
    L968:
        boolean r469 = r381.equals("conversationboxservice");
        int r259 = 1631534;
    L969:
        r259 = r259 ^ 1631551;
        switch(r259) {
            case 17: goto L972;
            case 83: goto L982;
            case 114: goto L974;
            case 180: goto L975;
            default: goto L969;
        };
    L972:
        if (r469 == true) goto L974;
        r259 = 1631627;
    L974:
        r259 = 1631596;
        goto L969
    L975:
        boolean r382 = r381.equals("message_fold");
        int r260 = 1631658;
    L976:
        r260 = r260 ^ 1631675;
        switch(r260) {
            case 17: goto L979;
            case 83: goto L3395;
            case 114: goto L981;
            case 3369: goto L982;
            default: goto L976;
        };
    L3395:
        return;
    L979:
        if (r382 == false) goto L981;
        r260 = 1632402;
    L981:
        r260 = 1631720;
    L982:
        "<set-?>";
        ff.z = "";
        return;
    L921:
        r381 = null;
    L880:
        r378 = 1605773;
        goto L877
    L881:
        if (r248 >= r636) goto L880;
        r378 = 1626636;
        goto L877
    L883:
        Object r383 = r527[r248];
        boolean r715 = r383 instanceof String;
        int r470 = 1626667;
    L884:
        r470 = r470 ^ 1626684;
        switch(r470) {
            case 23: goto L887;
            case 85: goto L902;
            case 118: goto L889;
            case 180: goto L890;
            default: goto L884;
        };
    L890:
        int r261 = 1626791;
    L891:
        r261 = r261 ^ 1626808;
        switch(r261) {
            case 31: goto L894;
            case 126: goto L895;
            default: goto L891;
        };
    L894:
        r261 = 1626822;
        goto L891
    L895:
        r249 = r383;
        goto L896
    L887:
        if (r715 == false) goto L889;
        r470 = 1626760;
    L889:
        r470 = 1626729;
        goto L884
    L902:
        r248 = ((r248 + 21) + 1) - 21;
        int r384 = 1626915;
    L903:
        r384 = r384 ^ 1626932;
        switch(r384) {
            case 23: goto L906;
            case 1785: goto L876;
            default: goto L903;
        };
    L906:
        r384 = 1627597;
        goto L903
    L983:
        ip.o("param", r16);
        boolean r385 = b50.N(ff.z, "geek_fold_", false);
        int r262 = 1632433;
    L984:
        r262 = r262 ^ 1632450;
        switch(r262) {
            case 18: goto L987;
            case 45: goto L3396;
            case 115: goto L988;
            case 460: goto L990;
            default: goto L984;
        };
    L3396:
        return;
    L987:
        r262 = 1632495;
        goto L984
    L988:
        if (r385 == false) goto L987;
        r262 = 1632526;
        goto L984
    L990:
        "<set-?>";
        ff.z = "";
        return;
    L991:
        ip.o("param", r16);
        String r638 = ff.z;     // Catch: Throwable -> L1069
        boolean r386 = b50.N(r638, "geek_fold_", false);     // Catch: Throwable -> L1069
        int r263 = 1632557;
    L993:
        r263 = r263 ^ 1632574;     // Catch: Throwable -> L1069
        switch(r263) {
            case 19: goto L996;
            case 85: goto L3397;
            case 114: goto L998;
            case 180: goto L999;
            default: goto L993;
        };     // Catch: Throwable -> L1069
    L3397:
        return;
    L996:
        if (r386 == false) goto L998;
        r263 = 1632650;
    L998:
        r263 = 1632619;
        goto L993
    L999:
        Class<?> r264 = r16.thisObject.getClass();     // Catch: Throwable -> L1069
    L1000:
        Class<?> r471 = r264;
        int r265 = 1632681;
    L1001:
        r265 = r265 ^ 1632698;     // Catch: Throwable -> L1069
        switch(r265) {
            case 19: goto L1004;
            case 1323: goto L1007;
            case 1480: goto L3398;
            case 1513: goto L1006;
            default: goto L1001;
        };     // Catch: Throwable -> L1069
    L3398:
        return;
    L1004:
        if (r471 == null) goto L1006;
        r265 = 1633425;
    L1006:
        r265 = 1633394;
        goto L1001
    L1007:
        boolean r387 = r471.getName().equals("java.lang.Object");     // Catch: Throwable -> L1069
        int r266 = 1633456;
    L1008:
        r266 = r266 ^ 1633473;     // Catch: Throwable -> L1069
        switch(r266) {
            case 14: goto L1011;
            case 47: goto L3399;
            case 113: goto L1012;
            case 460: goto L1014;
            default: goto L1008;
        };     // Catch: Throwable -> L1069
    L3399:
        return;
    L1011:
        r266 = 1633518;
        goto L1008
    L1012:
        if (r387 == true) goto L1011;
        r266 = 1633549;
        goto L1008
    L1014:
        i r716 = a80.q(r471.getDeclaredFields());     // Catch: Throwable -> L1069
    L1015:
        boolean r388 = r716.hasNext();     // Catch: Throwable -> L1069
        int r267 = 1633580;
    L1016:
        r267 = r267 ^ 1633597;     // Catch: Throwable -> L1069
        switch(r267) {
            case 17: goto L1019;
            case 87: goto L1062;
            case 118: goto L1021;
            case 7465: goto L1022;
            default: goto L1016;
        };     // Catch: Throwable -> L1069
    L1062:
        r264 = r471.getSuperclass();     // Catch: Throwable -> L1069
        int r389 = 1656582;
    L1064:
        r389 = r389 ^ 1656599;
        switch(r389) {
            case 17: goto L1067;
            case 50: goto L1000;
            default: goto L1064;
        };
    L1067:
        r389 = 1656613;
        goto L1064
    L1019:
        if (r388 == false) goto L1021;
        r267 = 1634324;
    L1021:
        r267 = 1633642;
        goto L1016
    L1022:
        Field r0 = (Field) r716.next();     // Catch: Throwable -> L1069
        boolean r530 = ip.i(r0.getType(), String.class);     // Catch: Throwable -> L1069
        int r268 = 1634355;
    L1023:
        r268 = r268 ^ 1634372;     // Catch: Throwable -> L1069
        switch(r268) {
            case 22: goto L1026;
            case 53: goto L1015;
            case 119: goto L1027;
            case 212: goto L1029;
            default: goto L1023;
        };     // Catch: Throwable -> L1069
    L1029:
        r0.setAccessible(true);     // Catch: Throwable -> L1069
        Object r269 = r0.get(r16.thisObject);     // Catch: Throwable -> L1069
        boolean r85 = r269 instanceof String;     // Catch: Throwable -> L1069
        int r531 = 1634479;
    L1030:
        r531 = r531 ^ 1634496;     // Catch: Throwable -> L1069
        switch(r531) {
            case 14: goto L1033;
            case 45: goto L1047;
            case 111: goto L1034;
            case 460: goto L1036;
            default: goto L1030;
        };     // Catch: Throwable -> L1069
    L1033:
        r531 = 1634541;
        goto L1030
    L1034:
        if (r85 == false) goto L1033;
        r531 = 1634572;
        goto L1030
    L1036:
        String r270 = (String) r269;     // Catch: Throwable -> L1069
        int r532 = 1634603;
    L1037:
        r532 = r532 ^ 1634620;     // Catch: Throwable -> L1069
        switch(r532) {
            case 23: goto L1040;
            case 745: goto L1041;
            default: goto L1037;
        };     // Catch: Throwable -> L1069
    L1040:
        r532 = 1635285;
        goto L1037
    L1041:
        String r533 = r270;
    L1042:
        boolean r86 = ip.i(r533, "conversationboxservice");     // Catch: Throwable -> L1069
        int r271 = 1635378;
    L1043:
        r271 = r271 ^ 1635395;     // Catch: Throwable -> L1069
        switch(r271) {
            case 18: goto L1046;
            case 51: goto L1057;
            case 113: goto L1048;
            case 204: goto L1050;
            default: goto L1043;
        };     // Catch: Throwable -> L1069
    L1057:
        r0.set(r16.thisObject, r638);     // Catch: Throwable -> L1069
        int r272 = 1656458;
    L1058:
        r272 = r272 ^ 1656475;     // Catch: Throwable -> L1069
        switch(r272) {
            case 17: goto L1061;
            case 50: goto L1015;
            default: goto L1058;
        };     // Catch: Throwable -> L1069
    L1061:
        r272 = 1656489;
    L1046:
        r271 = 1635440;
        goto L1043
    L1048:
        if (r86 == true) goto L1046;
        r271 = 1635471;
        goto L1043
    L1050:
        boolean r534 = ip.i(r533, "message_fold");     // Catch: Throwable -> L1069
        int r273 = 1635502;
    L1051:
        r273 = r273 ^ 1635519;     // Catch: Throwable -> L1069
        switch(r273) {
            case 17: goto L1054;
            case 83: goto L1015;
            case 114: goto L1056;
            case 111316: goto L1057;
            default: goto L1051;
        };     // Catch: Throwable -> L1069
    L1054:
        if (r534 == false) goto L1056;
        r273 = 1656427;
    L1056:
        r273 = 1635564;
        goto L1051
    L1047:
        r533 = null;
    L1026:
        r268 = 1634417;
        goto L1023
    L1027:
        if (r530 == false) goto L1026;
        r268 = 1634448;
    L1070:
        z30.o("Nwje\n", "Q2m5jaPP2Zc=\n", "FoldUIHook_InitView", "Fg==\n", "c8HJlSTQVfc=\n");
        return;
    L1071:
        ip.o("param", r16);
        Object[] r535 = r16.args;
        ip.n("args", r535);
        int r639 = r535.length;
        int r274 = 0;
    L1072:
        int r390 = r274;
        int r275 = 1656706;
    L1073:
        r275 = r275 ^ 1656723;
        switch(r275) {
            case 17: goto L1076;
            case 3519: goto L1078;
            case 3544: goto L1112;
            case 3577: goto L1079;
            default: goto L1073;
        };
    L1112:
        int r536 = -1;
    L1099:
        Object[] r472 = r16.args;
        ip.n("args", r472);
        int r640 = r472.length;
        int r276 = 0;
    L1100:
        int r391 = 1658628;
    L1101:
        r391 = r391 ^ 1658645;
        switch(r391) {
            case 17: goto L1104;
            case 7867: goto L1113;
            case 7896: goto L1146;
            case 7929: goto L1114;
            default: goto L1101;
        };
    L1146:
        int r392 = -1;
    L1134:
        int r277 = 1660550;
    L1135:
        r277 = r277 ^ 1660567;
        switch(r277) {
            case 17: goto L1139;
            case 4007: goto L1147;
            case 4056: goto L1153;
            case 4089: goto L1148;
            default: goto L1135;
        };
    L1139:
        if (r536 != (-1)) goto L1147;
        r277 = 1661294;
    L1147:
        r277 = 1661263;
        goto L1135
    L1148:
        int r278 = 1661325;
    L1149:
        r278 = r278 ^ 1661342;
        switch(r278) {
            case 19: goto L1152;
            case 50: goto L3400;
            default: goto L1149;
        };
    L3400:
        return;
    L1152:
        r278 = 1661356;
        goto L1149
    L1153:
        Object r279 = r16.args[r536];
        ip.m("null cannot be cast to non-null type kotlin.String", r279);
        String r280 = (String) r279;
        boolean r641 = b50.B(r280, "rcontact.nickname", true);
        int r473 = 1661449;
    L1154:
        r473 = r473 ^ 1661466;
        switch(r473) {
            case 19: goto L1157;
            case 50: goto L1159;
            case 93: goto L1183;
            case 1771: goto L1160;
            default: goto L1154;
        };
    L1157:
        if (r641 == true) goto L1159;
        r473 = 1662193;
    L1159:
        r473 = 1661511;
        goto L1154
    L1160:
        boolean r642 = b50.B(r280, "parentRef is null", true);
        int r474 = 1662224;
    L1161:
        r474 = r474 ^ 1662241;
        switch(r474) {
            case 14: goto L1164;
            case 49: goto L1165;
            case 76: goto L1167;
            case 111: goto L1172;
            default: goto L1161;
        };
    L1164:
        r474 = 1662286;
        goto L1161
    L1165:
        if (r642 == false) goto L1164;
        r474 = 1662317;
        goto L1161
    L1167:
        int r475 = 1662348;
    L1168:
        r475 = r475 ^ 1662365;
        switch(r475) {
            case 17: goto L1171;
            case 54: goto L1183;
            default: goto L1168;
        };
    L1171:
        r475 = 1662379;
        goto L1168
    L1172:
        int r643 = 1662472;
    L1173:
        r643 = r643 ^ 1662489;
        switch(r643) {
            case 17: goto L1176;
            case 16043: goto L1177;
            default: goto L1173;
        };
    L1176:
        r643 = 1663154;
        goto L1173
    L1177:
        boolean r644 = false;
    L1178:
        int r717 = ff.z.length();
        int r476 = 1663247;
    L1179:
        r476 = r476 ^ 1663264;
        switch(r476) {
            case 14: goto L1182;
            case 47: goto L1184;
            case 76: goto L1186;
            case 109: goto L1290;
            default: goto L1179;
        };
    L1182:
        r476 = 1663309;
        goto L1179
    L1184:
        if (r717 <= 0) goto L1182;
        r476 = 1663340;
        goto L1179
    L1186:
        int r477 = 1663371;
    L1187:
        r477 = r477 ^ 1663388;
        switch(r477) {
            case 23: goto L1190;
            case 54: goto L1192;
            case 85: goto L1290;
            case 1519: goto L1193;
            default: goto L1187;
        };
    L1190:
        if (r644 == true) goto L1192;
        r477 = 1664115;
    L1192:
        r477 = 1663433;
        goto L1187
    L1193:
        boolean r718 = b50.B(r280, "conversationboxservice", false);
        int r478 = 1664146;
    L1194:
        r478 = r478 ^ 1664163;
        switch(r478) {
            case 18: goto L1197;
            case 49: goto L1198;
            case 76: goto L1200;
            case 115: goto L1225;
            default: goto L1194;
        };
    L1197:
        r478 = 1664208;
        goto L1194
    L1198:
        if (r718 == true) goto L1197;
        r478 = 1664239;
        goto L1194
    L1200:
        boolean r719 = b50.B(r280, "message_fold", false);
        int r479 = 1664270;
    L1201:
        r479 = r479 ^ 1664287;
        switch(r479) {
            case 17: goto L1204;
            case 50: goto L1206;
            case 83: goto L1212;
            case 116: goto L1207;
            default: goto L1201;
        };
    L1204:
        if (r719 == false) goto L1206;
        r479 = 1664363;
    L1206:
        r479 = 1664332;
        goto L1201
    L1207:
        int r480 = 1664394;
    L1208:
        r480 = r480 ^ 1664411;
        switch(r480) {
            case 17: goto L1211;
            case 3503: goto L1225;
            default: goto L1208;
        };
    L1211:
        r480 = 1665076;
        goto L1208
    L1212:
        int r720 = 1665169;
    L1213:
        r720 = r720 ^ 1665186;
        switch(r720) {
            case 18: goto L1216;
            case 51: goto L1224;
            default: goto L1213;
        };
    L1216:
        boolean r721 = false;
    L1217:
        int r481 = 1665293;
    L1218:
        r481 = r481 ^ 1665310;
        switch(r481) {
            case 19: goto L1222;
            case 50: goto L1226;
            case 85: goto L1278;
            case 54228: goto L1227;
            default: goto L1218;
        };
    L1222:
        if (r392 == (-1)) goto L1226;
        r481 = 1686218;
    L1226:
        r481 = 1665355;
        goto L1218
    L1227:
        Object r482 = r16.args[r392];
        boolean r87 = r482 instanceof Object[];
        int r393 = 1686249;
    L1228:
        r393 = r393 ^ 1686266;
        switch(r393) {
            case 19: goto L1231;
            case 444: goto L1234;
            case 477: goto L1278;
            case 498: goto L1233;
            default: goto L1228;
        };
    L1231:
        if (r87 == false) goto L1233;
        r393 = 1686342;
    L1233:
        r393 = 1686311;
        goto L1228
    L1234:
        Object[] r394 = (Object[]) r482;
        int r11 = r394.length;
        int r88 = 0;
        boolean r95 = r721;
    L1235:
        int r722 = 1686373;
    L1236:
        r722 = r722 ^ 1686390;
        switch(r722) {
            case 19: goto L1239;
            case 180: goto L1242;
            case 213: goto L1277;
            case 242: goto L1241;
            default: goto L1236;
        };
    L1277:
        r721 = r95;
        goto L1278
    L1239:
        if (r88 >= r11) goto L1241;
        r722 = 1686466;
    L1241:
        r722 = 1686435;
        goto L1236
    L1242:
        Object r103 = r394[r88];
        int r723 = 1686497;
    L1243:
        r723 = r723 ^ 1686514;
        switch(r723) {
            case 19: goto L1246;
            case 1339: goto L1249;
            case 1368: goto L1254;
            case 1401: goto L1248;
            default: goto L1243;
        };
    L1246:
        if (r103 == null) goto L1248;
        r723 = 1687241;
    L1248:
        r723 = 1687210;
        goto L1243
    L1249:
        String r724 = r103.toString();
        int r104 = 1687272;
    L1250:
        r104 = r104 ^ 1687289;
        switch(r104) {
            case 17: goto L1253;
            case 510: goto L1255;
            default: goto L1250;
        };
    L1253:
        r104 = 1687303;
    L1255:
        boolean r12 = ip.i(r724, "conversationboxservice");
        int r105 = 1687396;
    L1256:
        r105 = r105 ^ 1687413;
        switch(r105) {
            case 17: goto L1259;
            case 215: goto L1545;
            case 246: goto L1261;
            case 32057: goto L1262;
            default: goto L1256;
        };
    L1545:
        Array.set(r482, r88, ff.z);     // Catch: Throwable -> L1523
        r95 = true;
    L1271:
        int r725 = 0 - ((0 - r88) - 1);
        int r89 = 1688295;
    L1272:
        r89 = r89 ^ 1688312;
        switch(r89) {
            case 31: goto L1275;
            case 510: goto L1276;
            default: goto L1272;
        };
    L1275:
        r89 = 1688326;
        goto L1272
    L1276:
        r88 = r725;
    L1524:
        int r726 = 1722953;
    L1525:
        r726 = r726 ^ 1722970;
        switch(r726) {
            case 19: goto L1528;
            case 50: goto L1271;
            default: goto L1525;
        };
    L1528:
        r726 = 1722984;
        goto L1525
    L1259:
        if (r12 == true) goto L1261;
        r105 = 1688140;
    L1261:
        r105 = 1687458;
        goto L1256
    L1262:
        boolean r106 = ip.i(r724, "message_fold");
        int r727 = 1688171;
    L1263:
        r727 = r727 ^ 1688188;
        switch(r727) {
            case 23: goto L1266;
            case 180: goto L1545;
            case 213: goto L1271;
            case 246: goto L1268;
            default: goto L1263;
        };
    L1266:
        if (r106 == false) goto L1268;
        r727 = 1688264;
    L1268:
        r727 = 1688233;
        goto L1263
    L1254:
        r724 = null;
    L1278:
        int r395 = 1688419;
    L1279:
        r395 = r395 ^ 1688436;
        switch(r395) {
            case 23: goto L1282;
            case 1343: goto L1285;
            case 1368: goto L1290;
            case 1401: goto L1284;
            default: goto L1279;
        };
    L1282:
        if (r721 == false) goto L1284;
        r395 = 1689163;
    L1284:
        r395 = 1689132;
        goto L1279
    L1285:
        int r281 = 1689194;
    L1286:
        r281 = r281 ^ 1689211;
        switch(r281) {
            case 17: goto L1289;
            case 242: goto L3401;
            default: goto L1286;
        };
    L3401:
        return;
    L1289:
        r281 = 1689225;
        goto L1286
    L1224:
        r720 = 1665200;
    L1225:
        r16.args[r536] = b50.L(b50.L(r280, "conversationboxservice", ff.z), "message_fold", ff.z);
        r721 = true;
    L1290:
        int r396 = 1689318;
    L1291:
        r396 = r396 ^ 1689335;
        switch(r396) {
            case 17: goto L1294;
            case 467: goto L3402;
            case 498: goto L1296;
            case 3897: goto L1297;
            default: goto L1291;
        };
    L3402:
        return;
    L1294:
        if (r644 == false) goto L1296;
        r396 = 1690062;
    L1296:
        r396 = 1689380;
        goto L1291
    L1297:
        boolean r483 = b50.B(r280, "count(", true);
        int r397 = 1690093;
    L1298:
        r397 = r397 ^ 1690110;
        switch(r397) {
            case 19: goto L1301;
            case 948: goto L1304;
            case 981: goto L3403;
            case 1010: goto L1303;
            default: goto L1298;
        };
    L3403:
        return;
    L1301:
        if (r483 == true) goto L1303;
        r397 = 1690186;
    L1303:
        r397 = 1690155;
        goto L1298
    L1304:
        gn r398 = gn.a;
        String r484 = "GeekFolderSync";
        j9 r645 = new j9(r16, 2);
        r398.getClass();
        gn.j(r484, r645);
        boolean r485 = gn.e("key_conversation_grouping");
        int r399 = 1690217;
    L1305:
        r399 = r399 ^ 1690234;
        switch(r399) {
            case 19: goto L1308;
            case 188: goto L1311;
            case 221: goto L1316;
            case 242: goto L1310;
            default: goto L1305;
        };
    L1308:
        if (r485 == true) goto L1310;
        r399 = 1690310;
    L1310:
        r399 = 1690279;
        goto L1305
    L1311:
        int r282 = 1690341;
    L1312:
        r282 = r282 ^ 1690358;
        switch(r282) {
            case 19: goto L1315;
            case 1913: goto L3404;
            default: goto L1312;
        };
    L3404:
        return;
    L1315:
        r282 = 1691023;
        goto L1312
    L1316:
        ArrayList r486 = zt.K();
        int r646 = ff.y;
        int r728 = r486.size();
        int r3100 = 1691116;
    L1317:
        r3100 = r3100 ^ 1691133;
        switch(r3100) {
            case 17: goto L1320;
            case 948: goto L1323;
            case 983: goto L1328;
            case 1014: goto L1322;
            default: goto L1317;
        };
    L1320:
        if (r646 < r728) goto L1322;
        r3100 = 1691209;
    L1322:
        r3100 = 1691178;
        goto L1317
    L1323:
        int r283 = 1691240;
    L1324:
        r283 = r283 ^ 1691257;
        switch(r283) {
            case 17: goto L1327;
            case 254: goto L3405;
            default: goto L1324;
        };
    L3405:
        return;
    L1327:
        r283 = 1691271;
        goto L1324
    L1328:
        s50 r3101 = (s50) r486.get(ff.y);
        boolean r647 = ip.i(r3101.b, "all");
        int r487 = 1692015;
    L1329:
        r487 = r487 ^ 1692032;
        switch(r487) {
            case 14: goto L1332;
            case 45: goto L1340;
            case 76: goto L1335;
            case 239: goto L1333;
            default: goto L1329;
        };
    L1332:
        r487 = 1692077;
        goto L1329
    L1333:
        if (r647 == false) goto L1332;
        r487 = 1692108;
        goto L1329
    L1335:
        int r284 = 1692139;
    L1336:
        r284 = r284 ^ 1692156;
        switch(r284) {
            case 23: goto L1339;
            case 1014: goto L3406;
            default: goto L1336;
        };
    L3406:
        return;
    L1339:
        r284 = 1692170;
        goto L1336
    L1340:
        String r648 = r3101.b;
        ip.o("conditionKey", r648);
        boolean r729 = r648.equals("all");
        int r488 = 1692263;
    L1341:
        r488 = r488 ^ 1692280;
        switch(r488) {
            case 31: goto L1344;
            case 1847: goto L1347;
            case 1864: goto L1359;
            case 1897: goto L1346;
            default: goto L1341;
        };
    L1344:
        if (r729 == false) goto L1346;
        r488 = 1693007;
    L1346:
        r488 = 1692976;
        goto L1341
    L1347:
        int r489 = 1693038;
    L1348:
        r489 = r489 ^ 1693055;
        switch(r489) {
            case 17: goto L1351;
            case 242: goto L1352;
            default: goto L1348;
        };
    L1351:
        r489 = 1693069;
        goto L1348
    L1352:
        String r649 = "";
    L1353:
        int r490 = r649.length();
        int r3102 = 1718086;
    L1354:
        r3102 = r3102 ^ 1718103;
        switch(r3102) {
            case 17: goto L1357;
            case 50: goto L1441;
            case 211: goto L1447;
            case 244: goto L1442;
            default: goto L1354;
        };
    L1357:
        if (r490 <= 0) goto L1441;
        r3102 = 1718179;
    L1441:
        r3102 = 1718148;
        goto L1354
    L1442:
        boolean r3103 = true;
        int r491 = 1718210;
    L1443:
        r491 = r491 ^ 1718227;
        switch(r491) {
            case 17: goto L1446;
            case 3519: goto L1448;
            default: goto L1443;
        };
    L1446:
        r491 = 1718892;
    L1448:
        int r492 = 1718985;
    L1449:
        r492 = r492 ^ 1719002;
        switch(r492) {
            case 19: goto L1452;
            case 50: goto L1454;
            case 477: goto L3407;
            case 508: goto L1455;
            default: goto L1449;
        };
    L3407:
        return;
    L1452:
        if (r3103 == false) goto L1454;
        r492 = 1719078;
    L1454:
        r492 = 1719047;
        goto L1449
    L1455:
        String r3104 = r280.toLowerCase(Locale.ROOT);
        ip.n("toLowerCase(...)", r3104);
        int r730 = r3104.length();
        List r3105 = bb.f0(new Integer[]{Integer.valueOf(b50.I(r3104, " group by ", 6)), Integer.valueOf(b50.I(r3104, " order by ", 6)), Integer.valueOf(b50.I(r3104, " limit ", 6))});
        ArrayList r96 = new ArrayList();
        Iterator r107 = r3105.iterator();
    L1456:
        boolean r493 = r107.hasNext();
        int r3106 = 1719109;
    L1457:
        r3106 = r3106 ^ 1719126;
        switch(r3106) {
            case 19: goto L1460;
            case 50: goto L1462;
            case 213: goto L1489;
            case 1403: goto L1463;
            default: goto L1457;
        };
    L1489:
        Integer r3107 = (Integer) ab.k0(r96);
        int r494 = 1721031;
    L1490:
        r494 = r494 ^ 1721048;
        switch(r494) {
            case 31: goto L1493;
            case 62: goto L1495;
            case 477: goto L1529;
            case 1911: goto L1496;
            default: goto L1490;
        };
    L1493:
        if (r3107 == null) goto L1495;
        r494 = 1721775;
    L1495:
        r494 = 1721093;
        goto L1490
    L1496:
        int r3108 = r3107.intValue();
    L1497:
        String r731 = r280.substring(0, r3108);
        ip.n("substring(...)", r731);
        String r810 = r280.substring(r3108);
        ip.n("substring(...)", r810);
        String r285 = r731.toLowerCase(Locale.ROOT);
        ip.n("toLowerCase(...)", r285);
        boolean r3109 = b50.B(r285, " where ", false);
        int r286 = 1721806;
    L1498:
        r286 = r286 ^ 1721823;
        switch(r286) {
            case 17: goto L1501;
            case 50: goto L1503;
            case 979: goto L1510;
            case 1012: goto L1504;
            default: goto L1498;
        };
    L1501:
        if (r3109 == false) goto L1503;
        r286 = 1721899;
    L1503:
        r286 = 1721868;
        goto L1498
    L1504:
        String r3110 = "QFgRDzY=\n";
        String r287 = "YBlfSxZ3C7I=\n";
    L1505:
        String r3111 = u40.a(r3110, r287);
        int r288 = 1721930;
    L1506:
        r288 = r288 ^ 1721947;
        switch(r288) {
            case 17: goto L1509;
            case 50: goto L1515;
            default: goto L1506;
        };
    L1509:
        r288 = 1721961;
        goto L1506
    L1515:
        r16.args[r536] = r731 + r3111 + "(" + r649 + ") " + r810;
        return;
    L1510:
        r3110 = "Cgta2R2QUw==\n";
        r287 = "KlwSnE/Vc58=\n";
        int r495 = 1722054;
    L1511:
        r495 = r495 ^ 1722071;
        switch(r495) {
            case 17: goto L1514;
            case 4007: goto L1505;
            default: goto L1511;
        };
    L1514:
        r495 = 1722736;
        goto L1511
    L1529:
        r3108 = r730;
        goto L1497
    L1460:
        if (r493 == false) goto L1462;
        r3106 = 1719853;
    L1462:
        r3106 = 1719171;
        goto L1457
    L1463:
        Object r496 = r107.next();
        int r811 = ((Number) r496).intValue();
        int r3112 = 1719884;
    L1464:
        r3112 = r3112 ^ 1719901;
        switch(r3112) {
            case 17: goto L1468;
            case 54: goto L1470;
            case 215: goto L1476;
            case 244: goto L1471;
            default: goto L1464;
        };
    L1468:
        if (r811 == (-1)) goto L1470;
        r3112 = 1719977;
    L1470:
        r3112 = 1719946;
        goto L1464
    L1471:
        boolean r3113 = true;
        int r812 = 1720008;
    L1472:
        r812 = r812 ^ 1720025;
        switch(r812) {
            case 17: goto L1475;
            case 62: goto L1477;
            default: goto L1472;
        };
    L1475:
        r812 = 1720039;
    L1477:
        int r813 = 1720132;
    L1478:
        r813 = r813 ^ 1720149;
        switch(r813) {
            case 17: goto L1481;
            case 32088: goto L1456;
            case 32121: goto L1484;
            case 32443: goto L1483;
            default: goto L1478;
        };
    L1484:
        r96.add(r496);
        int r3114 = 1720907;
    L1485:
        r3114 = r3114 ^ 1720924;
        switch(r3114) {
            case 23: goto L1488;
            case 54: goto L1456;
            default: goto L1485;
        };
    L1488:
        r3114 = 1720938;
        goto L1485
    L1481:
        if (r3113 == false) goto L1483;
        r813 = 1720876;
    L1483:
        r813 = 1720845;
        goto L1478
    L1476:
        r3113 = false;
        goto L1477
    L1447:
        r3103 = false;
        goto L1448
    L1359:
        String r732 = pb0.C1;
        int r814 = r648.hashCode();
        int r497 = 1693162;
    L1360:
        r497 = r497 ^ 1693179;
        switch(r497) {
            case 17: goto L1364;
            case 979: goto L1427;
            case 1010: goto L1366;
            case 3369: goto L1367;
            default: goto L1360;
        };
    L1364:
        if (r814 == (-1266283874)) goto L1366;
        r497 = 1693906;
    L1366:
        r497 = 1693224;
        goto L1360
    L1367:
        int r498 = 1693937;
    L1368:
        r498 = r498 ^ 1693954;
        switch(r498) {
            case 18: goto L1371;
            case 45: goto L1408;
            case 76: goto L1375;
            case 499: goto L1373;
            default: goto L1368;
        };
    L1371:
        r498 = 1693999;
        goto L1368
    L1373:
        if (r814 == (-840272977)) goto L1371;
        r498 = 1694030;
        goto L1368
    L1375:
        int r499 = 1694061;
    L1376:
        r499 = r499 ^ 1694078;
        switch(r499) {
            case 19: goto L1380;
            case 180: goto L1383;
            case 213: goto L1389;
            case 242: goto L1382;
            default: goto L1376;
        };
    L1380:
        if (r814 == 98629247) goto L1382;
        r499 = 1694154;
    L1382:
        r499 = 1694123;
        goto L1376
    L1383:
        int r4100 = 1694185;
    L1384:
        r4100 = r4100 ^ 1694202;
        switch(r4100) {
            case 19: goto L1387;
            case 1385: goto L1388;
            default: goto L1384;
        };
    L1387:
        r4100 = 1694867;
        goto L1384
    L1388:
        r649 = "";
        goto L1353
    L1389:
        boolean r650 = r648.equals("group");
        int r4101 = 1694960;
    L1390:
        r4101 = r4101 ^ 1694977;
        switch(r4101) {
            case 14: goto L1393;
            case 47: goto L1402;
            case 76: goto L1396;
            case 497: goto L1394;
            default: goto L1390;
        };
    L1393:
        r4101 = 1695022;
        goto L1390
    L1394:
        if (r650 == true) goto L1393;
        r4101 = 1695053;
        goto L1390
    L1396:
        int r4102 = 1695084;
    L1397:
        r4102 = r4102 ^ 1695101;
        switch(r4102) {
            case 17: goto L1400;
            case 246: goto L1401;
            default: goto L1397;
        };
    L1400:
        r4102 = 1695115;
        goto L1397
    L1401:
        r649 = "";
        goto L1353
    L1402:
        String r3115 = "rconversation.username LIKE '%@chatroom'";
        int r4103 = 1716040;
    L1403:
        r4103 = r4103 ^ 1716057;
        switch(r4103) {
            case 17: goto L1406;
            case 62: goto L1407;
            default: goto L1403;
        };
    L1406:
        r4103 = 1716071;
        goto L1403
    L1407:
        r649 = r3115;
        goto L1353
    L1408:
        boolean r651 = r648.equals("unread");
        int r4104 = 1716164;
    L1409:
        r4104 = r4104 ^ 1716181;
        switch(r4104) {
            case 17: goto L1412;
            case 54: goto L1414;
            case 8151: goto L1421;
            case 8180: goto L1415;
            default: goto L1409;
        };
    L1412:
        if (r651 == true) goto L1414;
        r4104 = 1716257;
    L1414:
        r4104 = 1716226;
        goto L1409
    L1415:
        int r4105 = 1716288;
    L1416:
        r4105 = r4105 ^ 1716305;
        switch(r4105) {
            case 17: goto L1419;
            case 699: goto L1420;
            default: goto L1416;
        };
    L1419:
        r4105 = 1716970;
        goto L1416
    L1420:
        r649 = "";
        goto L1353
    L1421:
        String r3116 = "rconversation.unReadCount > 0";
        int r4106 = 1717063;
    L1422:
        r4106 = r4106 ^ 1717080;
        switch(r4106) {
            case 31: goto L1425;
            case 62: goto L1426;
            default: goto L1422;
        };
    L1425:
        r4106 = 1717094;
        goto L1422
    L1426:
        r649 = r3116;
        goto L1353
    L1427:
        boolean r652 = r648.equals("friend");
        int r4107 = 1717187;
    L1428:
        r4107 = r4107 ^ 1717204;
        switch(r4107) {
            case 23: goto L1431;
            case 54: goto L1433;
            case 1407: goto L1434;
            case 2005: goto L1440;
            default: goto L1428;
        };
    L1431:
        if (r652 == true) goto L1433;
        r4107 = 1717931;
    L1433:
        r4107 = 1717249;
        goto L1428
    L1434:
        int r4108 = 1717962;
    L1435:
        r4108 = r4108 ^ 1717979;
        switch(r4108) {
            case 17: goto L1438;
            case 50: goto L1439;
            default: goto L1435;
        };
    L1438:
        r4108 = 1717993;
        goto L1435
    L1439:
        r649 = "";
        goto L1353
    L1440:
        r649 = z30.j("rconversation.username NOT LIKE '%@chatroom' AND rconversation.username NOT LIKE 'gh_%' AND rconversation.username NOT IN (", r732, ")");
    L1183:
        r644 = true;
        goto L1178
    L1104:
        if (r276 >= r640) goto L1113;
        r391 = 1659372;
    L1113:
        r391 = 1659341;
        goto L1101
    L1114:
        Object r733 = r472[r276];
        int r3117 = 1659403;
    L1115:
        r3117 = r3117 ^ 1659420;
        switch(r3117) {
            case 23: goto L1118;
            case 54: goto L1120;
            case 85: goto L1141;
            case 116: goto L1121;
            default: goto L1115;
        };
    L1118:
        if (r733 == null) goto L1120;
        r3117 = 1659496;
    L1120:
        r3117 = 1659465;
        goto L1115
    L1121:
        boolean r734 = r733.getClass().isArray();
        int r3118 = 1659527;
    L1122:
        r3118 = r3118 ^ 1659544;
        switch(r3118) {
            case 31: goto L1125;
            case 62: goto L1127;
            case 93: goto L1141;
            case 2039: goto L1128;
            default: goto L1122;
        };
    L1128:
        int r3119 = 1660302;
    L1129:
        r3119 = r3119 ^ 1660319;
        switch(r3119) {
            case 17: goto L1132;
            case 50: goto L1133;
            default: goto L1129;
        };
    L1132:
        r3119 = 1660333;
        goto L1129
    L1133:
        r392 = r276;
        goto L1134
    L1125:
        if (r734 == false) goto L1127;
        r3118 = 1660271;
    L1127:
        r3118 = 1659589;
    L1141:
        r276 = 1 - (0 - r276);
        int r3120 = 1660426;
    L1142:
        r3120 = r3120 ^ 1660443;
        switch(r3120) {
            case 17: goto L1145;
            case 50: goto L1100;
            default: goto L1142;
        };
    L1145:
        r3120 = 1660457;
        goto L1142
    L1076:
        if (r390 >= r639) goto L1078;
        r275 = 1657450;
    L1078:
        r275 = 1657419;
        goto L1073
    L1079:
        Object r289 = r535[r390];
        boolean r735 = r289 instanceof String;
        int r4109 = 1657481;
    L1080:
        r4109 = r4109 ^ 1657498;
        switch(r4109) {
            case 19: goto L1083;
            case 50: goto L1085;
            case 93: goto L1106;
            case 124: goto L1086;
            default: goto L1080;
        };
    L1083:
        if (r735 == false) goto L1085;
        r4109 = 1657574;
    L1085:
        r4109 = 1657543;
        goto L1080
    L1086:
        boolean r4110 = b50.N(b50.T(((String) r289).toString()).toString(), "select", true);
        int r290 = 1657605;
    L1087:
        r290 = r290 ^ 1657622;
        switch(r290) {
            case 19: goto L1090;
            case 50: goto L1092;
            case 85: goto L1106;
            case 1787: goto L1093;
            default: goto L1087;
        };
    L1093:
        int r291 = 1658380;
    L1094:
        r291 = r291 ^ 1658397;
        switch(r291) {
            case 17: goto L1097;
            case 54: goto L1098;
            default: goto L1094;
        };
    L1097:
        r291 = 1658411;
        goto L1094
    L1098:
        r536 = r390;
        goto L1099
    L1090:
        if (r4110 == false) goto L1092;
        r290 = 1658349;
    L1092:
        r290 = 1657667;
    L1106:
        r274 = r390 + 1;
        int r3121 = 1658504;
    L1107:
        r3121 = r3121 ^ 1658521;
        switch(r3121) {
            case 17: goto L1110;
            case 62: goto L1072;
            default: goto L1107;
        };
    L1110:
        r3121 = 1658535;
        goto L1107
    L1516:
        ip.o("p", r16);
        gn r292 = gn.a;
        String r3122 = "ChatUI_Before";
        j9 r4111 = new j9(r16, 0);
        r292.getClass();
        gn.j(r3122, r4111);
    }
}
