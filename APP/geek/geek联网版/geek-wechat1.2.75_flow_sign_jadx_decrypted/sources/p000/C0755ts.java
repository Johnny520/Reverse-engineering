package p000;

import android.app.Application;
import android.app.Dialog;
import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Intent;
import android.hardware.SensorManager;
import android.location.Location;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.activity.C0995;
import androidx.activity.C0996;
import androidx.activity.result.C0993;
import androidx.activity.result.C0994;
import androidx.appcompat.widget.C1000;
import androidx.constraintlayout.helper.widget.C1001;
import androidx.core.content.C1006;
import androidx.core.content.C1008;
import com.github.megatronking.stringfog.Base64;
import com.google.android.material.carousel.C1026;
import com.google.android.material.datepicker.C1032;
import com.google.android.material.datepicker.C1034;
import com.google.android.material.datepicker.C1035;
import com.google.android.material.sidesheet.C1039;
import com.google.android.material.snackbar.C1040;
import com.google.android.material.textfield.C1041;
import com.google.android.material.timepicker.C1044;
import com.google.android.material.transformation.C1045;
import com.ljx.wechatmod.hook.C1048;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import io.fastkv.C1053;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: ts */
/* JADX INFO: loaded from: classes.dex */
public final class C0755ts implements InterfaceC0379jm {

    /* JADX INFO: renamed from: a */
    public final int f4574a;

    /* JADX INFO: renamed from: b */
    public final Application f4575b;

    public /* synthetic */ C0755ts(Application application, int i) {
        this.f4574a = i;
        this.f4575b = application;
        int iM3074 = C1041.m3074("ۡ۟۠");
        int i2 = 0;
        while (true) {
            switch (iM3074) {
                case 1746719:
                    System.out.println(i2);
                    if (C1041.f5688 * (C1044.f5691 / 6161) != 0) {
                        iM3074 = C0993.m2885("ۧۤ۠");
                    } else {
                        iM3074 = (C0994.f5641 ^ C1026.f5673) ^ (-1751905);
                        continue;
                    }
                    break;
                case 1747742:
                    break;
                case 1748610:
                    if (C1032.m3040() >= 0) {
                        if (C1008.f5655 >= 0) {
                            C1000.m2913();
                            iM3074 = C0995.m2891("۟۠۠");
                        } else {
                            iM3074 = C1040.m3072("ۡۧۨ");
                        }
                    }
                    break;
                case 1748866:
                    int i3 = Integer.parseInt(C1048.m3103("ZyQ5FJboh72PjVIgbIbtHhT"));
                    if (C0996.f5643 <= 0) {
                        C1039.f5686 = 79;
                        iM3074 = C1048.m3101("ۡ۟۠");
                        i2 = i3;
                    } else {
                        iM3074 = C1035.m3052("۟۠۠");
                        i2 = i3;
                        continue;
                    }
                    break;
                case 1751616:
                    return;
                case 1754531:
                    iM3074 = (C1006.f5653 | C1045.f5692) + 1748615;
                    continue;
            }
            iM3074 = C1001.m2914(C1034.f5681 * (C1053.f5700 % (-5362)) <= 0 ? "ۥۤۡ" : "ۣۤ۟");
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:103:0x037b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:115:0x03a3. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:139:0x045d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:204:0x0683. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:212:0x06a4. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:234:0x0706. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:289:0x09a5. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:308:0x0a49. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x002b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:91:0x0353. Please report as an issue. */
    @Override // p000.InterfaceC0379jm
    /* JADX INFO: renamed from: a */
    public final Object mo474a() {
        String strM492a;
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        Class clsFindClassIfExists;
        int i5;
        int i6;
        Iterator it;
        int i7;
        int i8;
        int i9;
        Class clsFindClass;
        int i10;
        switch (this.f4574a) {
            case Base64.DEFAULT /* 0 */:
                ClassLoader classLoader = this.f4575b.getClassLoader();
                AbstractC0493mp.m1856f("getClassLoader(...)", classLoader);
                "loader";
                try {
                    String str2 = ub0.f4732a;
                    String strM492a2 = "LauncherUI";
                    AbstractC0493mp.m1857g("key", strM492a2);
                    boolean zEquals = strM492a2.equals("LauncherUI");
                    int i11 = 1513269;
                    while (true) {
                        i11 ^= 1513286;
                        switch (i11) {
                            case 18:
                                break;
                            case 53:
                                strM492a = null;
                                break;
                            case 115:
                                i11 = !zEquals ? 1513331 : 1513362;
                                break;
                            case 212:
                                strM492a = "com.tencent.mm.ui.LauncherUI";
                                int i12 = 1513393;
                                while (true) {
                                    i12 ^= 1513410;
                                    switch (i12) {
                                        case 18:
                                            break;
                                        case 115:
                                            i12 = 1513424;
                                            continue;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                        }
                    }
                    int i13 = 1513517;
                    while (true) {
                        i13 ^= 1513534;
                        switch (i13) {
                            case 19:
                                i13 = strM492a != null ? 1514230 : 1514261;
                                break;
                            case 712:
                                break;
                            case 745:
                                break;
                            case 811:
                                strM492a = "com.tencent.mm.ui.LauncherUI";
                                break;
                        }
                    }
                    XposedHelpers.findAndHookMethod(strM492a, classLoader, "onResume", new Object[]{new C0810v9(4)});
                    i = 1514292;
                } catch (Throwable th) {
                    g40.m1152o("06ke\n", "p8h5VTpLcuY=\n", "MainUIHook", "tw==\n", "0vI8ySRxU5w=\n");
                }
                while (true) {
                    i ^= 1514309;
                    switch (i) {
                        case 22:
                            return C0893xh.f5258n;
                        case 113:
                            i = 1514323;
                            break;
                    }
                }
                break;
            case Base64.NO_PADDING /* 1 */:
                ConcurrentHashMap concurrentHashMap = AbstractC0355iz.f2617a;
                ClassLoader classLoader2 = this.f4575b.getClassLoader();
                AbstractC0493mp.m1856f("getClassLoader(...)", classLoader2);
                "loader";
                Class clsFindClassIfExists2 = XposedHelpers.findClassIfExists(ub0.f4759j, classLoader2);
                int i14 = 1512370;
                while (true) {
                    i14 ^= 1512387;
                    switch (i14) {
                        case 18:
                            break;
                        case 51:
                            XposedBridge.hookAllMethods(clsFindClassIfExists2, ub0.f4762k, new C0810v9(14));
                            break;
                        case 113:
                            i14 = clsFindClassIfExists2 != null ? 1512432 : 1512463;
                            break;
                        case 1996:
                            int i15 = 1512494;
                            while (true) {
                                i15 ^= 1512511;
                                switch (i15) {
                                    case 17:
                                        i15 = 1512525;
                                        break;
                                    case 114:
                                        break;
                                }
                            }
                            break;
                    }
                }
                return C0893xh.f5258n;
            case Base64.NO_WRAP /* 2 */:
                SparseIntArray sparseIntArray = x50.f5183a;
                ClassLoader classLoader3 = this.f4575b.getClassLoader();
                AbstractC0493mp.m1856f("getClassLoader(...)", classLoader3);
                "loader";
                String strM492a3 = "nextInt";
                Class cls = Integer.TYPE;
                XposedHelpers.findAndHookMethod(Random.class, strM492a3, new Object[]{cls, new C0810v9(18)});
                try {
                    XposedBridge.hookAllMethods(Math.class, "random", new C0810v9(19));
                    i4 = 1509425;
                } catch (Throwable th2) {
                    g40.m1152o("06ke\n", "p8h5VTpLcuY=\n", "SystemHook_Math", "tw==\n", "0vI8ySRxU5w=\n");
                }
                while (true) {
                    i4 ^= 1509442;
                    switch (i4) {
                        case 18:
                            break;
                        case 115:
                            i4 = 1509456;
                            continue;
                    }
                    C0810v9 c0810v9 = new C0810v9(29);
                    try {
                        XposedBridge.hookAllMethods(JSONObject.class, "getDouble", c0810v9);
                        XposedBridge.hookAllMethods(JSONObject.class, "optDouble", c0810v9);
                        XposedBridge.hookAllMethods(JSONObject.class, "getString", c0810v9);
                        XposedBridge.hookAllMethods(JSONObject.class, "optString", c0810v9);
                        i3 = 1509549;
                    } catch (Throwable th3) {
                        g40.m1152o("06ke\n", "p8h5VTpLcuY=\n", "SystemHook_JSON", "tw==\n", "0vI8ySRxU5w=\n");
                    }
                    while (true) {
                        i3 ^= 1509566;
                        switch (i3) {
                            case 19:
                                i3 = 1509580;
                                continue;
                            case 114:
                                break;
                        }
                        w50 w50Var = new w50(0);
                        XposedBridge.hookAllMethods(Location.class, "setLatitude", w50Var);
                        XposedBridge.hookAllMethods(Location.class, "setLongitude", w50Var);
                        C0810v9 c0810v92 = new C0810v9(27);
                        XposedBridge.hookAllMethods(Location.class, "getLatitude", c0810v92);
                        XposedBridge.hookAllMethods(Location.class, "getLongitude", c0810v92);
                        XposedBridge.hookAllMethods(WifiManager.class, "getScanResults", new C0810v9(20));
                        XposedBridge.hookAllMethods(TelephonyManager.class, "getAllCellInfo", new C0810v9(26));
                        XposedBridge.hookAllMethods(TelephonyManager.class, "getCellLocation", new C0810v9(21));
                        C0810v9 c0810v93 = new C0810v9(25);
                        XposedBridge.hookAllMethods(Window.class, "setAttributes", c0810v93);
                        try {
                            Class clsFindClass2 = XposedHelpers.findClass("android.view.WindowManagerImpl", classLoader3);
                            XposedBridge.hookAllMethods(clsFindClass2, "addView", c0810v93);
                            XposedBridge.hookAllMethods(clsFindClass2, "updateViewLayout", c0810v93);
                            i2 = 1509673;
                        } catch (Throwable th4) {
                            g40.m1152o("06ke\n", "p8h5VTpLcuY=\n", "SystemHook_WM", "tw==\n", "0vI8ySRxU5w=\n");
                        }
                        while (true) {
                            i2 ^= 1509690;
                            switch (i2) {
                                case 19:
                                    i2 = 1510355;
                                    continue;
                                case 745:
                                    break;
                            }
                            XposedBridge.hookAllMethods(SensorManager.class, "registerListener", new C0810v9(22));
                            Class clsFindClassIfExists3 = XposedHelpers.findClassIfExists("android.hardware.SystemSensorManager$SensorEventQueue", (ClassLoader) null);
                            int i16 = 1510448;
                            while (true) {
                                i16 ^= 1510465;
                                switch (i16) {
                                    case 14:
                                        break;
                                    case 47:
                                        break;
                                    case 113:
                                        i16 = clsFindClassIfExists3 == null ? 1510510 : 1510541;
                                        break;
                                    case 204:
                                        XposedHelpers.findAndHookMethod(clsFindClassIfExists3, "dispatchSensorEvent", new Object[]{cls, float[].class, cls, Long.TYPE, new C0810v9(23)});
                                        break;
                                }
                            }
                            C0810v9 c0810v94 = new C0810v9(28);
                            try {
                                Class clsFindClassIfExists4 = XposedHelpers.findClassIfExists("android.webkit.WebView", classLoader3);
                                int i17 = 1510572;
                                while (true) {
                                    i17 ^= 1510589;
                                    switch (i17) {
                                        case 17:
                                            i17 = clsFindClassIfExists4 == null ? 1510634 : 1511316;
                                            break;
                                        case 87:
                                            break;
                                        case 118:
                                            break;
                                        case 809:
                                            XposedBridge.hookAllMethods(clsFindClassIfExists4, "setWebContentsDebuggingEnabled", c0810v94);
                                            int i18 = 1511347;
                                            while (true) {
                                                i18 ^= 1511364;
                                                switch (i18) {
                                                    case 22:
                                                        break;
                                                    case 119:
                                                        i18 = 1511378;
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            } catch (Throwable th5) {
                                g40.m1152o("06ke\n", "p8h5VTpLcuY=\n", "SystemHook_WebView", "tw==\n", "0vI8ySRxU5w=\n");
                            }
                            try {
                                Class clsFindClassIfExists5 = XposedHelpers.findClassIfExists("com.tencent.smtt.sdk.WebView", classLoader3);
                                int i19 = 1511471;
                                while (true) {
                                    i19 ^= 1511488;
                                    switch (i19) {
                                        case 14:
                                            break;
                                        case 45:
                                            break;
                                        case 111:
                                            i19 = clsFindClassIfExists5 == null ? 1511533 : 1511564;
                                            break;
                                        case 204:
                                            XposedBridge.hookAllMethods(clsFindClassIfExists5, "setWebContentsDebuggingEnabled", c0810v94);
                                            int i20 = 1511595;
                                            while (true) {
                                                i20 ^= 1511612;
                                                switch (i20) {
                                                    case 23:
                                                        i20 = 1512277;
                                                        break;
                                                    case 1001:
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            } catch (Throwable th6) {
                                g40.m1152o("06ke\n", "p8h5VTpLcuY=\n", "SystemHook_X5WebView", "tw==\n", "0vI8ySRxU5w=\n");
                            }
                            XposedBridge.hookAllMethods(Intent.class, "getIntExtra", new C0810v9(24));
                            XposedBridge.hookAllMethods(Intent.class, "getBooleanExtra", new C0810v9(17));
                            return C0893xh.f5258n;
                        }
                    }
                }
            case 3:
                Map map = AbstractC0465ly.f3047a;
                ClassLoader classLoader4 = this.f4575b.getClassLoader();
                AbstractC0493mp.m1856f("getClassLoader(...)", classLoader4);
                "loader";
                Class clsFindClassIfExists6 = XposedHelpers.findClassIfExists(ub0.f4766l0, classLoader4);
                int i21 = 1507503;
                while (true) {
                    i21 ^= 1507520;
                    switch (i21) {
                        case 14:
                            break;
                        case 45:
                            break;
                        case 111:
                            i21 = clsFindClassIfExists6 == null ? 1507565 : 1507596;
                            break;
                        case 460:
                            C0317i c0317iM1205t = g80.m1205t(clsFindClassIfExists6.getDeclaredMethods());
                            while (true) {
                                boolean zHasNext = c0317iM1205t.hasNext();
                                int i22 = 1507627;
                                while (true) {
                                    i22 ^= 1507644;
                                    switch (i22) {
                                        case 23:
                                            i22 = !zHasNext ? 1507689 : 1507720;
                                            break;
                                        case 85:
                                            break;
                                        case 118:
                                            break;
                                        case 180:
                                            Method method = (Method) c0317iM1205t.next();
                                            int length = method.getParameterTypes().length;
                                            int i23 = 1507751;
                                            while (true) {
                                                i23 ^= 1507768;
                                                switch (i23) {
                                                    case 31:
                                                        i23 = length != 4 ? 1508464 : 1508495;
                                                        break;
                                                    case 1335:
                                                        boolean zM1853c = AbstractC0493mp.m1853c(method.getParameterTypes()[0], String.class);
                                                        int i24 = 1508526;
                                                        while (true) {
                                                            i24 ^= 1508543;
                                                            switch (i24) {
                                                                case 17:
                                                                    i24 = !zM1853c ? 1508588 : 1508619;
                                                                    break;
                                                                case 83:
                                                                    break;
                                                                case 114:
                                                                    break;
                                                                case 436:
                                                                    XposedBridge.hookMethod(method, new C0810v9(11));
                                                                    int i25 = 1508650;
                                                                    while (true) {
                                                                        i25 ^= 1508667;
                                                                        switch (i25) {
                                                                            case 17:
                                                                                i25 = 1508681;
                                                                                break;
                                                                            case 114:
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 1480:
                                                        break;
                                                    case 1513:
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                    break;
                                }
                            }
                            break;
                    }
                }
                XposedHelpers.findAndHookMethod(TextView.class, "setText", new Object[]{CharSequence.class, TextView.BufferType.class, Boolean.TYPE, Integer.TYPE, new C0810v9(12)});
                C0810v9 c0810v95 = new C0810v9(13);
                XposedBridge.hookAllMethods(ImageView.class, "setImageBitmap", c0810v95);
                XposedBridge.hookAllMethods(ImageView.class, "setImageDrawable", c0810v95);
                return C0893xh.f5258n;
            case 4:
                ClassLoader classLoader5 = this.f4575b.getClassLoader();
                AbstractC0493mp.m1856f("getClassLoader(...)", classLoader5);
                "loader";
                try {
                    str = ub0.f4773n1;
                    clsFindClassIfExists = XposedHelpers.findClassIfExists(str, classLoader5);
                    i5 = 55680;
                } catch (Exception e) {
                    g40.m1152o("06ke\n", "p8h5VTpLcuY=\n", "SnsNetworkHookInit", "tw==\n", "0vI8ySRxU5w=\n");
                }
                while (true) {
                    i5 ^= 55697;
                    switch (i5) {
                        case 17:
                            if (clsFindClassIfExists == null) {
                                i5 = 56424;
                            }
                            break;
                        case 1467:
                            break;
                        case 1496:
                            XposedBridge.hookAllConstructors(clsFindClassIfExists, new e40(new ConcurrentHashMap(), new C0385js(3, classLoader5)));
                            String strM492a4 = "System";
                            String strM492a5 = "\u2705 \u5168\u573a\u666f\u670b\u53cb\u5708\u7f51\u7edc\u5f15\u64ce (\u52a8\u6001\u6d3e\u751f\u62e6\u622a\u7248) \u6302\u8f7d\u6210\u529f";
                            AbstractC0493mp.m1857g("tag", strM492a4);
                            AbstractC0493mp.m1857g("msg", strM492a5);
                            int i26 = 56579;
                            while (true) {
                                i26 ^= 56596;
                                switch (i26) {
                                    case 23:
                                        i26 = 56610;
                                        continue;
                                    case 54:
                                        break;
                                }
                                g40.m1152o("06ke\n", "p8h5VTpLcuY=\n", "SnsNetworkHookInit", "tw==\n", "0vI8ySRxU5w=\n");
                                return C0893xh.f5258n;
                            }
                        case 1529:
                            AbstractC0493mp.m1857g("tag", "SnsNetworkHook_Fatal");
                            AbstractC0493mp.m1857g("msg", "❌ 致命错误：网络请求基类 [" + str + "] 彻底丢失！");
                            int i27 = 56455;
                            while (true) {
                                i27 ^= 56472;
                                switch (i27) {
                                    case 31:
                                        i27 = 56486;
                                        continue;
                                    case 62:
                                        break;
                                    default:
                                        continue;
                                }
                                g40.m1152o("06ke\n", "p8h5VTpLcuY=\n", "SnsNetworkHookInit", "tw==\n", "0vI8ySRxU5w=\n");
                                return C0893xh.f5258n;
                            }
                        default:
                            continue;
                    }
                    i5 = 56393;
                }
                return C0893xh.f5258n;
            case 5:
                AbstractC0493mp.m1856f("getClassLoader(...)", this.f4575b.getClassLoader());
                "loader";
                try {
                    XposedBridge.hookAllMethods(NotificationManager.class, "notify", new C0810v9(10));
                    i6 = 55556;
                } catch (Throwable th7) {
                    g40.m1152o("06ke\n", "p8h5VTpLcuY=\n", "NotificationHook_Init", "tw==\n", "0vI8ySRxU5w=\n");
                }
                while (true) {
                    i6 ^= 55573;
                    switch (i6) {
                        case 17:
                            i6 = 55587;
                            break;
                        case 54:
                            return C0893xh.f5258n;
                    }
                }
                break;
            case 6:
                ClassLoader classLoader6 = this.f4575b.getClassLoader();
                AbstractC0493mp.m1856f("getClassLoader(...)", classLoader6);
                "loader";
                try {
                    it = AbstractC0368jb.m1595a0(ub0.f4683B0, ub0.f4681A0).iterator();
                } catch (Exception e2) {
                    g40.m1152o("06ke\n", "p8h5VTpLcuY=\n", "SnsHookInit", "tw==\n", "0vI8ySRxU5w=\n");
                }
                while (true) {
                    boolean zHasNext2 = it.hasNext();
                    int i28 = 53634;
                    while (true) {
                        i28 ^= 53651;
                        switch (i28) {
                            case 17:
                                i28 = !zHasNext2 ? 53696 : 53727;
                                break;
                            case 50:
                                break;
                            case 76:
                                Class clsFindClassIfExists7 = XposedHelpers.findClassIfExists((String) it.next(), classLoader6);
                                int i29 = 53758;
                                while (true) {
                                    i29 ^= 53775;
                                    switch (i29) {
                                        case 1009:
                                            i29 = clsFindClassIfExists7 != null ? 54471 : 54502;
                                            break;
                                        case 1703:
                                            break;
                                        case 1736:
                                            XposedBridge.hookAllMethods(clsFindClassIfExists7, "execSQL", new C0810v9(16));
                                            XposedBridge.hookAllMethods(clsFindClassIfExists7, "delete", new C0385js(1, classLoader6));
                                            C0385js c0385js = new C0385js(2, classLoader6);
                                            XposedBridge.hookAllMethods(clsFindClassIfExists7, "updateWithOnConflict", c0385js);
                                            XposedBridge.hookAllMethods(clsFindClassIfExists7, "update", c0385js);
                                            int i30 = 54657;
                                            while (true) {
                                                i30 ^= 54674;
                                                switch (i30) {
                                                    case 19:
                                                        i30 = 54688;
                                                        break;
                                                    case 50:
                                                        break;
                                                }
                                            }
                                            break;
                                        case 1769:
                                            int i31 = 54533;
                                            while (true) {
                                                i31 ^= 54550;
                                                switch (i31) {
                                                    case 19:
                                                        i31 = 54564;
                                                        break;
                                                    case 50:
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                }
                                break;
                            case 83:
                                break;
                        }
                        String strM492a6 = "System";
                        String strM492a7 = "\u2705 \u670b\u53cb\u5708\u9632\u64a4\u56de (\u5b8c\u7f8e\u5b57\u5178\u9a71\u52a8\u53cc\u6838\u5f15\u64ce) \u6302\u8f7d\u6210\u529f";
                        AbstractC0493mp.m1857g("tag", strM492a6);
                        AbstractC0493mp.m1857g("msg", strM492a7);
                        int i32 = 55432;
                        while (true) {
                            i32 ^= 55449;
                            switch (i32) {
                                case 17:
                                    i32 = 55463;
                                    break;
                                case 62:
                                    break;
                            }
                        }
                    }
                    return C0893xh.f5258n;
                }
            case 7:
                ClassLoader classLoader7 = AbstractC0551o9.f3420a;
                ClassLoader classLoader8 = this.f4575b.getClassLoader();
                AbstractC0493mp.m1856f("getClassLoader(...)", classLoader8);
                "loader";
                AbstractC0551o9.f3420a = classLoader8;
                w50 w50Var2 = new w50(3);
                try {
                    XposedBridge.hookAllMethods(PopupWindow.class, "showAtLocation", w50Var2);
                    i9 = 49790;
                } catch (Throwable th8) {
                    g40.m1152o("06ke\n", "p8h5VTpLcuY=\n", "PopupEngine_HookLocation", "tw==\n", "0vI8ySRxU5w=\n");
                }
                while (true) {
                    i9 ^= 49807;
                    switch (i9) {
                        case 18:
                            try {
                                XposedBridge.hookAllMethods(PopupWindow.class, "showAsDropDown", w50Var2);
                                i8 = 49914;
                            } catch (Throwable th9) {
                                g40.m1152o("06ke\n", "p8h5VTpLcuY=\n", "PopupEngine_HookDropDown", "tw==\n", "0vI8ySRxU5w=\n");
                            }
                            while (true) {
                                i8 ^= 49931;
                                switch (i8) {
                                    case 497:
                                        i8 = 50596;
                                        continue;
                                    case 1711:
                                        break;
                                }
                                try {
                                    XposedBridge.hookAllMethods(Dialog.class, "show", new w50(2));
                                    i7 = 50689;
                                } catch (Throwable th10) {
                                    g40.m1152o("06ke\n", "p8h5VTpLcuY=\n", "PopupEngine_HookDialog", "tw==\n", "0vI8ySRxU5w=\n");
                                }
                                while (true) {
                                    i7 ^= 50706;
                                    switch (i7) {
                                        case 19:
                                            i7 = 50720;
                                            continue;
                                        case 50:
                                            break;
                                    }
                                    "loader";
                                    XposedHelpers.findAndHookMethod(ViewGroup.class, "dispatchTouchEvent", new Object[]{MotionEvent.class, new C0810v9(1)});
                                    Class cls2 = AbstractC0922y9.f5363a;
                                    "loader";
                                    String str3 = ub0.f4769m0;
                                    String str4 = ub0.f4701K0;
                                    int length2 = str3.length();
                                    int i33 = 50813;
                                    while (true) {
                                        i33 ^= 50830;
                                        switch (i33) {
                                            case 18:
                                                break;
                                            case 53:
                                                int length3 = str4.length();
                                                int i34 = 51712;
                                                while (true) {
                                                    i34 ^= 51729;
                                                    switch (i34) {
                                                        case 14:
                                                            break;
                                                        case 17:
                                                            i34 = length3 != 0 ? 51774 : 51805;
                                                            break;
                                                        case 47:
                                                            Class clsFindClassIfExists8 = XposedHelpers.findClassIfExists(str3, classLoader8);
                                                            int i35 = 52611;
                                                            while (true) {
                                                                i35 ^= 52628;
                                                                switch (i35) {
                                                                    case 23:
                                                                        i35 = clsFindClassIfExists8 == null ? 52673 : 52704;
                                                                        break;
                                                                    case 54:
                                                                        break;
                                                                    case 85:
                                                                        C0417kn.f2847a.getClass();
                                                                        C0417kn.f2853g.put("ChatUI", Boolean.FALSE);
                                                                        break;
                                                                    case 116:
                                                                        C0417kn.f2847a.getClass();
                                                                        C0417kn.f2853g.put("ChatUI", Boolean.TRUE);
                                                                        try {
                                                                            XposedBridge.hookAllMethods(clsFindClassIfExists8, str4, new C0810v9(0));
                                                                            int i36 = 52735;
                                                                            while (true) {
                                                                                i36 ^= 52752;
                                                                                switch (i36) {
                                                                                    case 14:
                                                                                        break;
                                                                                    case 1007:
                                                                                        i36 = 52766;
                                                                                        break;
                                                                                }
                                                                            }
                                                                        } catch (Throwable th11) {
                                                                            C0417kn.f2847a.getClass();
                                                                            C0417kn.f2853g.put("ChatUI", Boolean.FALSE);
                                                                            AbstractC0922y9.m2728a("ChatUIHook_Init", th11);
                                                                            int i37 = 53510;
                                                                            while (true) {
                                                                                i37 ^= 53527;
                                                                                switch (i37) {
                                                                                    case 17:
                                                                                        i37 = 53541;
                                                                                        break;
                                                                                    case 50:
                                                                                        break;
                                                                                }
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 76:
                                                            int i38 = 51836;
                                                            while (true) {
                                                                i38 ^= 51853;
                                                                switch (i38) {
                                                                    case 241:
                                                                        i38 = 52518;
                                                                        break;
                                                                    case 1963:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 243:
                                                i33 = length2 != 0 ? 50875 : 51557;
                                                break;
                                            case 4075:
                                                int i39 = 51588;
                                                while (true) {
                                                    i39 ^= 51605;
                                                    switch (i39) {
                                                        case 17:
                                                            i39 = 51619;
                                                            break;
                                                        case 54:
                                                            break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                    return C0893xh.f5258n;
                                }
                            }
                        case 241:
                            i9 = 49821;
                            break;
                    }
                }
                break;
            case 8:
                ArrayList arrayList = C0684rv.f4173a;
                ClassLoader classLoader9 = this.f4575b.getClassLoader();
                AbstractC0493mp.m1856f("getClassLoader(...)", classLoader9);
                "loader";
                try {
                    clsFindClass = XposedHelpers.findClass("com.tencent.wcdb.database.SQLiteDatabase", classLoader9);
                    C0810v9 c0810v96 = new C0810v9(8);
                    try {
                        ArrayList arrayList2 = C0684rv.f4173a;
                        synchronized (arrayList2) {
                            Set setHookAllMethods = XposedBridge.hookAllMethods(clsFindClass, "rawQuery", c0810v96);
                            AbstractC0493mp.m1856f("hookAllMethods(...)", setHookAllMethods);
                            arrayList2.addAll(setHookAllMethods);
                            Set setHookAllMethods2 = XposedBridge.hookAllMethods(clsFindClass, "rawQueryWithFactory", c0810v96);
                            AbstractC0493mp.m1856f("hookAllMethods(...)", setHookAllMethods2);
                            arrayList2.addAll(setHookAllMethods2);
                        }
                        i10 = 48891;
                    } catch (Throwable th12) {
                        AbstractC0493mp.m1857g("tag", "MessageDBHook_rawQuery_Init");
                        "e";
                    }
                } catch (Throwable th13) {
                    C0417kn.f2847a.getClass();
                    C0417kn.f2853g.put("DB", Boolean.FALSE);
                    g40.m1152o("06ke\n", "p8h5VTpLcuY=\n", "MessageDBHook_Init_Fatal", "tw==\n", "0vI8ySRxU5w=\n");
                }
                while (true) {
                    i10 ^= 48908;
                    switch (i10) {
                        case 22:
                            break;
                        case 503:
                            i10 = 48922;
                            continue;
                    }
                    C0810v9 c0810v97 = new C0810v9(7);
                    C0810v9 c0810v98 = new C0810v9(9);
                    XposedHelpers.findAndHookMethod(clsFindClass, "insertWithOnConflict", new Object[]{String.class, String.class, ContentValues.class, Integer.TYPE, c0810v97});
                    XposedHelpers.findAndHookMethod(clsFindClass, "insert", new Object[]{String.class, String.class, ContentValues.class, c0810v97});
                    XposedHelpers.findAndHookMethod(clsFindClass, "update", new Object[]{String.class, ContentValues.class, String.class, String[].class, c0810v98});
                    XposedHelpers.findAndHookMethod(clsFindClass, "delete", new Object[]{String.class, String.class, String[].class, new C0810v9(6)});
                    C0417kn.f2847a.getClass();
                    C0417kn.f2853g.put("DB", Boolean.TRUE);
                    int i40 = 49666;
                    while (true) {
                        i40 ^= 49683;
                        switch (i40) {
                            case 17:
                                i40 = 49697;
                                break;
                            case 50:
                                return C0893xh.f5258n;
                        }
                    }
                }
                break;
            default:
                C0459ls c0459ls = C0459ls.f3042a;
                ClassLoader classLoader10 = this.f4575b.getClassLoader();
                AbstractC0493mp.m1856f("getClassLoader(...)", classLoader10);
                "loader";
                try {
                    Class clsFindClassIfExists9 = XposedHelpers.findClassIfExists(ub0.f4736b0, classLoader10);
                    int i41 = 1616;
                    while (true) {
                        i41 ^= 1633;
                        switch (i41) {
                            case 14:
                                break;
                            case 49:
                                i41 = clsFindClassIfExists9 == null ? 1678 : 1709;
                                break;
                            case 204:
                                XposedHelpers.findAndHookMethod(clsFindClassIfExists9, "onCreate", new Object[]{Bundle.class, new C0810v9(2)});
                                int i42 = 1740;
                                while (true) {
                                    i42 ^= 1757;
                                    switch (i42) {
                                        case 17:
                                            i42 = 1771;
                                            break;
                                        case 54:
                                            break;
                                    }
                                }
                                break;
                            case 239:
                                break;
                        }
                    }
                } catch (Throwable th14) {
                    g40.m1152o("06ke\n", "p8h5VTpLcuY=\n", "LuckyMoney_Init_UI_Hook", "tw==\n", "0vI8ySRxU5w=\n");
                }
                try {
                    Class clsFindClassIfExists10 = XposedHelpers.findClassIfExists("com.tencent.wcdb.database.SQLiteDatabase", classLoader10);
                    int i43 = 1864;
                    while (true) {
                        i43 ^= 1881;
                        switch (i43) {
                            case 17:
                                if (clsFindClassIfExists10 != null) {
                                    i43 = 48736;
                                }
                                break;
                            case 47384:
                                break;
                            case 47417:
                                XposedHelpers.findAndHookMethod(clsFindClassIfExists10, "insertWithOnConflict", new Object[]{String.class, String.class, ContentValues.class, Integer.TYPE, new C0810v9(3)});
                                int i44 = 48767;
                                while (true) {
                                    i44 ^= 48784;
                                    switch (i44) {
                                        case 14:
                                            break;
                                        case 239:
                                            i44 = 48798;
                                            break;
                                    }
                                }
                                break;
                            case 47483:
                                break;
                            default:
                                continue;
                        }
                        i43 = 48705;
                    }
                } catch (Throwable th15) {
                    g40.m1152o("06ke\n", "p8h5VTpLcuY=\n", "LuckyMoney_Init_WCDB_Hook", "tw==\n", "0vI8ySRxU5w=\n");
                }
                return C0893xh.f5258n;
        }
    }
}
