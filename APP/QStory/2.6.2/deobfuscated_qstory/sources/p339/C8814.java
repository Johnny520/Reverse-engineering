package p339;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.activity.AbstractC0053;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.foundation.layout.C0640;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3065;
import com.kongzue.dialogx.DialogX$IMPL_MODE;
import com.kongzue.dialogx.DialogX$THEME;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import io.ktor.client.plugins.AbstractC3932;
import io.ktor.client.plugins.api.C3885;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.jvm.internal.AbstractC5061;
import lin.util.ReflectUtils.ReflectException;
import lin.xposed.BuildConfig;
import net.bytebuddy.utility.JavaConstant;
import org.apache.commons.lang3.time.C5662;
import p010.AbstractC6157;
import p010.C6160;
import p022.C6267;
import p024.AbstractC6291;
import p032.AbstractC6318;
import p032.C6319;
import p033.AbstractC6325;
import p035.AbstractC6340;
import p035.C6343;
import p053.AbstractC6560;
import p261.AbstractC8247;
import p342.C8821;
import p349.C8865;
import p380.InstrumentationC8993;
import p381.AbstractC8996;
import p391.C9114;
import p392.AbstractC9121;
import p392.C9122;
import top.suzhelan.qstory.hook.InjectHook;
import top.suzhelan.qstory.hook.item.C5909;
import top.suzhelan.qstory.hook.item.C5912;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言苏世楪子哲兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8814 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m14459(Context context) {
        "applicationContext";
        AbstractC6340.f17460 = context;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            AbstractC6340.f17461 = packageInfo.versionCode;
            AbstractC6340.f17462 = packageInfo.versionName;
            AbstractC6340.f17465 = context.getPackageName();
            String str = context.getApplicationInfo().sourceDir;
            ClassLoader classLoader = context.getClassLoader();
            Object[][] objArr = AbstractC6318.f17413;
            if (classLoader == null) {
                throw new ReflectException("类加载器为Null 无法设置");
            }
            if (classLoader instanceof C6319) {
                AbstractC6318.f17411 = (C6319) classLoader;
            } else {
                AbstractC6318.f17411 = new C6319(classLoader);
            }
            AbstractC6318.f17412 = InjectHook.class.getClassLoader();
            AbstractC3065.m6858(context);
            String str2 = C8821.f24811;
            String str3 = context.getDataDir().getAbsolutePath() + "/qs_config";
            "path";
            C8821.f24811 = str3;
            AbstractC3065.f9795 = context;
            ClassLoader classLoader2 = context.getClassLoader();
            Object[][] objArr2 = AbstractC9121.f25498;
            if (classLoader2 == null) {
                throw new top.sacz.xphelper.exception.ReflectException("类加载器为Null 无法设置");
            }
            if (classLoader2 instanceof C9122) {
                AbstractC9121.f25497 = (C9122) classLoader2;
            } else {
                AbstractC9121.f25497 = new C9122(classLoader2);
            }
            C9114.f25484 = AbstractC0053.m136(context.getFilesDir().getAbsolutePath(), "/XpHelper");
            AtomicBoolean atomicBoolean = AbstractC8996.f25285;
            try {
                AbstractC8996.f25284 = context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities[0].name;
                if (!AbstractC8996.f25285.getAndSet(true)) {
                    try {
                        Field declaredField = Class.forName("android.app.ActivityThread").getDeclaredField("sCurrentActivityThread");
                        declaredField.setAccessible(true);
                        Object obj = declaredField.get(null);
                        Field declaredField2 = obj.getClass().getDeclaredField("mInstrumentation");
                        declaredField2.setAccessible(true);
                        declaredField2.set(obj, new InstrumentationC8993((Instrumentation) declaredField2.get(obj)));
                        AbstractC8996.m14587(obj);
                        AbstractC8996.m14586();
                        try {
                            AbstractC8996.m14585();
                        } catch (Exception unused) {
                        }
                    } catch (Exception e) {
                        C5919.m11252(e);
                        return;
                    }
                }
                C9114 c9114 = new C9114("DexKitCache", 0);
                try {
                    PackageInfo packageInfo2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                    String str4 = packageInfo2.versionName + JavaConstant.Dynamic.DEFAULT_NAME + (Build.VERSION.SDK_INT >= 28 ? packageInfo2.getLongVersionCode() : packageInfo2.versionCode);
                    String strM14641 = c9114.m14641("version", "");
                    if (!strM14641.equals(str4)) {
                        c9114.f25485.clear();
                        c9114.m14640(str4, "version");
                        Log.d("DexKitCacheProxy", "checkCacheExpired: Host version updated Cache cleaned old:" + strM14641 + " new:" + str4);
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.d("DexKitCacheProxy", "checkCacheExpired: " + Log.getStackTraceString(e2));
                }
                C9114.f25484 = AbstractC3932.m8313().concat("/data/xphelper");
                AbstractC6325 abstractC6325 = AbstractC8247.f22824;
                AbstractC3737.m8047(context);
                AbstractC8247.f22823 = DialogX$THEME.AUTO;
                AbstractC8247.f22822 = DialogX$IMPL_MODE.WINDOW;
                C6343 c6343 = C6343.f17470;
                C8865.m14508().m14497(BuildConfig.VERSION_CODE).mo11106(new C3885(28));
                C9114 c91142 = C6343.f17469;
                String strM6668 = "disabled";
                c91142.getClass();
                if (c91142.f25485.getBoolean(strM6668, false)) {
                    return;
                }
                System.loadLibrary("qstory");
                if (!AbstractC6291.m11801()) {
                    if (AbstractC6340.m11895()) {
                        String strConcat = AbstractC3932.m8313().concat("/Cache");
                        AbstractC0455.m1161(new File(AbstractC3932.m8313().concat("/Log")));
                        AbstractC0455.m1161(new File(strConcat));
                        XposedHelpers.findAndHookMethod(Activity.class, "onResume", new Object[]{new C5909(26)});
                        return;
                    }
                    return;
                }
                XposedHelpers.findAndHookMethod(Activity.class, "onResume", new Object[]{new C5909(27)});
                try {
                    File file = new File(AbstractC3932.m8313(), ".nomedia");
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                } catch (IOException unused2) {
                }
                if (AbstractC6560.m12011()) {
                    try {
                        XposedBridge.hookMethod(XposedHelpers.findMethodBestMatch(AbstractC6318.m11838("com.tencent.mobileqq.app.automator.step.InitTabData"), "doStep", new Class[0]), new C6160(new C6267(1), 1));
                    } catch (Exception e3) {
                        String strM66682 = "delayHook";
                        String str5 = AbstractC6157.f16779;
                        AbstractC6157.m11574(strM66682, e3.toString(), e3, true);
                    }
                } else {
                    try {
                        Method methodFindMethodBestMatch = XposedHelpers.findMethodBestMatch(AbstractC6318.m11838("com.tencent.mobileqq.startup.step.LoadData"), "doStep", new Class[0]);
                        C6267 c6267 = new C6267(2);
                        AtomicReference atomicReference = new AtomicReference();
                        atomicReference.set(XposedBridge.hookMethod(methodFindMethodBestMatch, new C5912(atomicReference, 5, c6267)));
                    } catch (Exception e4) {
                        String strM66683 = "delayHook";
                        String str6 = AbstractC6157.f16779;
                        AbstractC6157.m11574(strM66683, e4.toString(), e4, true);
                    }
                }
                if (AbstractC6340.m11895()) {
                    StringBuilder sb = new StringBuilder();
                    AbstractC5061.m10039().forEach(new C5662(new C0640(sb, 18), 1));
                    sb.deleteCharAt(sb.length() - 1);
                    String string = sb.toString();
                    "toString(...)";
                    AbstractC6157.m11573(string, "start");
                }
            } catch (PackageManager.NameNotFoundException e5) {
                C5919.m11252(e5);
            }
        } catch (Exception e6) {
            C5919.m11252(e6);
        }
    }
}
