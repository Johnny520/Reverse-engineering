package p347;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.activity.AbstractC0900;
import androidx.compose.foundation.layout.C1481;
import com.bumptech.glide.AbstractC3888;
import com.kongzue.dialogx.DialogX$IMPL_MODE;
import com.kongzue.dialogx.DialogX$THEME;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import io.ktor.client.plugins.AbstractC4765;
import io.ktor.client.plugins.api.C4718;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.jvm.internal.AbstractC5894;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import lin.util.ReflectUtils.ReflectException;
import lin.xposed.BuildConfig;
import net.bytebuddy.utility.JavaConstant;
import org.apache.commons.lang3.time.C6493;
import p026.AbstractC7017;
import p026.C7020;
import p035.C7092;
import p040.AbstractC7138;
import p049.AbstractC7166;
import p049.C7167;
import p052.AbstractC7187;
import p052.C7194;
import p246.C8878;
import p277.AbstractC9077;
import p332.C9496;
import p361.C9663;
import p397.InstrumentationC9828;
import p398.AbstractC9831;
import p405.AbstractC9919;
import p405.C9920;
import p407.C9924;
import top.suzhelan.qstory.hook.InjectHook;
import top.suzhelan.qstory.hook.item.C6745;
import top.suzhelan.qstory.hook.item.C6748;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言苏世子兰哲楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9613 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m15030(Context context) {
        "applicationContext";
        AbstractC7187.f17852 = context;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            AbstractC7187.f17853 = packageInfo.versionCode;
            AbstractC7187.f17854 = packageInfo.versionName;
            AbstractC7187.f17857 = context.getPackageName();
            String str = context.getApplicationInfo().sourceDir;
            ClassLoader classLoader = context.getClassLoader();
            Object[][] objArr = AbstractC7166.f17807;
            if (classLoader == null) {
                throw new ReflectException("类加载器为Null 无法设置");
            }
            if (classLoader instanceof C7167) {
                AbstractC7166.f17805 = (C7167) classLoader;
            } else {
                AbstractC7166.f17805 = new C7167(classLoader);
            }
            AbstractC7166.f17806 = InjectHook.class.getClassLoader();
            AbstractC3888.m7247(context);
            String str2 = context.getDataDir().getAbsolutePath() + "/qs_config";
            "path";
            C8878.f22563 = str2;
            AbstractC3888.f10105 = context;
            ClassLoader classLoader2 = context.getClassLoader();
            Object[][] objArr2 = AbstractC9919.f25823;
            if (classLoader2 == null) {
                throw new top.sacz.xphelper.exception.ReflectException("类加载器为Null 无法设置");
            }
            if (classLoader2 instanceof C9920) {
                AbstractC9919.f25822 = (C9920) classLoader2;
            } else {
                AbstractC9919.f25822 = new C9920(classLoader2);
            }
            C9924.f25833 = AbstractC0900.m696(context.getFilesDir().getAbsolutePath(), "/XpHelper");
            AtomicBoolean atomicBoolean = AbstractC9831.f25624;
            try {
                AbstractC9831.f25623 = context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities[0].name;
                if (!AbstractC9831.f25624.getAndSet(true)) {
                    try {
                        Field declaredField = Class.forName("android.app.ActivityThread").getDeclaredField("sCurrentActivityThread");
                        declaredField.setAccessible(true);
                        Object obj = declaredField.get(null);
                        Field declaredField2 = obj.getClass().getDeclaredField("mInstrumentation");
                        declaredField2.setAccessible(true);
                        declaredField2.set(obj, new InstrumentationC9828((Instrumentation) declaredField2.get(obj)));
                        AbstractC9831.m15170(obj);
                        AbstractC9831.m15169();
                        try {
                            AbstractC9831.m15168();
                        } catch (Exception unused) {
                        }
                    } catch (Exception e) {
                        C6755.m11872(e);
                        return;
                    }
                }
                C9924 c9924 = new C9924("DexKitCache", 0);
                try {
                    PackageInfo packageInfo2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                    String str3 = packageInfo2.versionName + JavaConstant.Dynamic.DEFAULT_NAME + (Build.VERSION.SDK_INT >= 28 ? packageInfo2.getLongVersionCode() : packageInfo2.versionCode);
                    String strM15237 = c9924.m15237("version", "");
                    if (!strM15237.equals(str3)) {
                        c9924.f25834.clear();
                        c9924.m15236(str3, "version");
                        Log.d("DexKitCacheProxy", "checkCacheExpired: Host version updated Cache cleaned old:" + strM15237 + " new:" + str3);
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.d("DexKitCacheProxy", "checkCacheExpired: " + Log.getStackTraceString(e2));
                }
                C9924.f25833 = AbstractC4765.m8874().concat("/data/xphelper");
                AbstractC5754 abstractC5754 = AbstractC9077.f23168;
                AbstractC4570.m8593(context);
                AbstractC9077.f23167 = DialogX$THEME.AUTO;
                AbstractC9077.f23166 = DialogX$IMPL_MODE.WINDOW;
                C7194 c7194 = C7194.f17865;
                C9663.m15048().m15071(BuildConfig.VERSION_CODE).mo11722(new C4718(28));
                C9924 c99242 = C7194.f17864;
                String strM14531 = "disabled";
                c99242.getClass();
                if (c99242.f25834.getBoolean(strM14531, false)) {
                    return;
                }
                System.loadLibrary("qstory");
                if (AbstractC3888.m7268().f25085.intValue() < 0) {
                    System.exit(0);
                }
                if (!AbstractC7138.m12388()) {
                    if (AbstractC7187.m12502()) {
                        String strConcat = AbstractC4765.m8874().concat("/Cache");
                        AbstractC5894.m10611(new File(AbstractC4765.m8874().concat("/Log")));
                        AbstractC5894.m10611(new File(strConcat));
                        XposedHelpers.findAndHookMethod(Activity.class, "onResume", new Object[]{new C6745(26)});
                        return;
                    }
                    return;
                }
                XposedHelpers.findAndHookMethod(Activity.class, "onResume", new Object[]{new C6745(27)});
                try {
                    File file = new File(AbstractC4765.m8874(), ".nomedia");
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                } catch (IOException unused2) {
                }
                if (AbstractC3888.m7256()) {
                    try {
                        XposedBridge.hookMethod(XposedHelpers.findMethodBestMatch(AbstractC7166.m12425("com.tencent.mobileqq.app.automator.step.InitTabData"), "doStep", new Class[0]), new C7020(new C7092(1), 1));
                    } catch (Exception e3) {
                        String strM145312 = "delayHook";
                        String str4 = AbstractC7017.f17361;
                        AbstractC7017.m12164(strM145312, e3.toString(), e3, true);
                    }
                } else {
                    try {
                        Method methodFindMethodBestMatch = XposedHelpers.findMethodBestMatch(AbstractC7166.m12425("com.tencent.mobileqq.startup.step.LoadData"), "doStep", new Class[0]);
                        C7092 c7092 = new C7092(2);
                        AtomicReference atomicReference = new AtomicReference();
                        atomicReference.set(XposedBridge.hookMethod(methodFindMethodBestMatch, new C6748(atomicReference, 5, c7092)));
                    } catch (Exception e4) {
                        String strM145313 = "delayHook";
                        String str5 = AbstractC7017.f17361;
                        AbstractC7017.m12164(strM145313, e4.toString(), e4, true);
                    }
                }
                if (AbstractC7187.m12502()) {
                    StringBuilder sb = new StringBuilder();
                    C9496.m14935().forEach(new C6493(new C1481(sb, 18), 1));
                    sb.deleteCharAt(sb.length() - 1);
                    String string = sb.toString();
                    "toString(...)";
                    AbstractC7017.m12163(string, "start");
                }
            } catch (PackageManager.NameNotFoundException e5) {
                C6755.m11872(e5);
            }
        } catch (Exception e6) {
            C6755.m11872(e6);
        }
    }
}
