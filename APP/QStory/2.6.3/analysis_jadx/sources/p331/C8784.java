package p331;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.activity.AbstractC0053;
import androidx.compose.foundation.layout.C0640;
import com.bumptech.glide.AbstractC3056;
import com.kongzue.dialogx.DialogX$IMPL_MODE;
import com.kongzue.dialogx.DialogX$THEME;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import io.ktor.client.plugins.AbstractC3933;
import io.ktor.client.plugins.api.C3886;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.jvm.internal.AbstractC5062;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import lin.util.ReflectUtils.ReflectException;
import lin.xposed.BuildConfig;
import net.bytebuddy.utility.JavaConstant;
import org.apache.commons.lang3.time.C5663;
import p010.AbstractC6188;
import p010.C6191;
import p019.C6263;
import p024.AbstractC6309;
import p033.AbstractC6337;
import p033.C6338;
import p036.AbstractC6358;
import p036.C6365;
import p230.C8049;
import p261.AbstractC8248;
import p287.AbstractC8405;
import p316.C8667;
import p345.C8834;
import p381.InstrumentationC8999;
import p382.AbstractC9002;
import p389.AbstractC9090;
import p389.C9091;
import p391.C9095;
import top.suzhelan.qstory.hook.InjectHook;
import top.suzhelan.qstory.hook.item.C5915;
import top.suzhelan.qstory.hook.item.C5918;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言苏世子兰哲楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8784 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m14471(Context context) {
        AbstractC8405.m13972(1533);
        AbstractC6358.f17507 = context;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            AbstractC6358.f17508 = packageInfo.versionCode;
            AbstractC6358.f17509 = packageInfo.versionName;
            AbstractC6358.f17512 = context.getPackageName();
            String str = context.getApplicationInfo().sourceDir;
            ClassLoader classLoader = context.getClassLoader();
            Object[][] objArr = AbstractC6337.f17462;
            if (classLoader == null) {
                throw new ReflectException("类加载器为Null 无法设置");
            }
            if (classLoader instanceof C6338) {
                AbstractC6337.f17460 = (C6338) classLoader;
            } else {
                AbstractC6337.f17460 = new C6338(classLoader);
            }
            AbstractC6337.f17461 = InjectHook.class.getClassLoader();
            AbstractC3056.m6687(context);
            String str2 = context.getDataDir().getAbsolutePath() + AbstractC8405.m13972(70);
            AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵喵喵喵");
            C8049.f22218 = str2;
            AbstractC3056.f9760 = context;
            ClassLoader classLoader2 = context.getClassLoader();
            Object[][] objArr2 = AbstractC9090.f25478;
            if (classLoader2 == null) {
                throw new top.sacz.xphelper.exception.ReflectException("类加载器为Null 无法设置");
            }
            if (classLoader2 instanceof C9091) {
                AbstractC9090.f25477 = (C9091) classLoader2;
            } else {
                AbstractC9090.f25477 = new C9091(classLoader2);
            }
            C9095.f25488 = AbstractC0053.m136(context.getFilesDir().getAbsolutePath(), "/XpHelper");
            AtomicBoolean atomicBoolean = AbstractC9002.f25279;
            try {
                AbstractC9002.f25278 = context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities[0].name;
                if (!AbstractC9002.f25279.getAndSet(true)) {
                    try {
                        Field declaredField = Class.forName("android.app.ActivityThread").getDeclaredField("sCurrentActivityThread");
                        declaredField.setAccessible(true);
                        Object obj = declaredField.get(null);
                        Field declaredField2 = obj.getClass().getDeclaredField("mInstrumentation");
                        declaredField2.setAccessible(true);
                        declaredField2.set(obj, new InstrumentationC8999((Instrumentation) declaredField2.get(obj)));
                        AbstractC9002.m14611(obj);
                        AbstractC9002.m14610();
                        try {
                            AbstractC9002.m14609();
                        } catch (Exception unused) {
                        }
                    } catch (Exception e) {
                        C5925.m11313(e);
                        return;
                    }
                }
                C9095 c9095 = new C9095("DexKitCache", 0);
                try {
                    PackageInfo packageInfo2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                    String str3 = packageInfo2.versionName + JavaConstant.Dynamic.DEFAULT_NAME + (Build.VERSION.SDK_INT >= 28 ? packageInfo2.getLongVersionCode() : packageInfo2.versionCode);
                    String strM14678 = c9095.m14678("version", "");
                    if (!strM14678.equals(str3)) {
                        c9095.f25489.clear();
                        c9095.m14677(str3, "version");
                        Log.d("DexKitCacheProxy", "checkCacheExpired: Host version updated Cache cleaned old:" + strM14678 + " new:" + str3);
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.d("DexKitCacheProxy", "checkCacheExpired: " + Log.getStackTraceString(e2));
                }
                C9095.f25488 = AbstractC3933.m8315().concat(AbstractC8405.m13972(71));
                AbstractC4922 abstractC4922 = AbstractC8248.f22823;
                AbstractC3738.m8034(context);
                AbstractC8248.f22822 = DialogX$THEME.AUTO;
                AbstractC8248.f22821 = DialogX$IMPL_MODE.WINDOW;
                C6365 c6365 = C6365.f17520;
                C8834.m14489().m14512(BuildConfig.VERSION_CODE).mo11163(new C3886(28));
                C9095 c90952 = C6365.f17519;
                String strM13972 = AbstractC8405.m13972(1249);
                c90952.getClass();
                if (c90952.f25489.getBoolean(strM13972, false)) {
                    return;
                }
                System.loadLibrary(AbstractC8405.m13973("喵喵喵喵喵喵呜喵~喵喵喵喵喵呜呜喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵呜"));
                if (AbstractC3056.m6708().f24740.intValue() < 0) {
                    System.exit(0);
                }
                if (!AbstractC6309.m11829()) {
                    if (AbstractC6358.m11943()) {
                        String strConcat = AbstractC3933.m8315().concat(AbstractC8405.m13973("喵呜喵呜呜呜喵喵~喵喵呜呜喵呜呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵喵呜"));
                        AbstractC5062.m10052(new File(AbstractC3933.m8315().concat(AbstractC8405.m13973("喵呜喵呜呜呜喵喵~喵喵呜呜呜喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜呜呜呜"))));
                        AbstractC5062.m10052(new File(strConcat));
                        XposedHelpers.findAndHookMethod(Activity.class, AbstractC8405.m13972(62), new Object[]{new C5915(26)});
                        return;
                    }
                    return;
                }
                XposedHelpers.findAndHookMethod(Activity.class, AbstractC8405.m13972(62), new Object[]{new C5915(27)});
                try {
                    File file = new File(AbstractC3933.m8315(), AbstractC8405.m13972(66));
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                } catch (IOException unused2) {
                }
                if (AbstractC3056.m6696()) {
                    try {
                        XposedBridge.hookMethod(XposedHelpers.findMethodBestMatch(AbstractC6337.m11866(AbstractC8405.m13972(63)), AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜呜喵呜喵~喵喵呜喵呜喵喵呜~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜喵喵"), new Class[0]), new C6191(new C6263(1), 1));
                    } catch (Exception e3) {
                        String strM139722 = AbstractC8405.m13972(64);
                        String str4 = AbstractC6188.f17016;
                        AbstractC6188.m11605(strM139722, e3.toString(), e3, true);
                    }
                } else {
                    try {
                        Method methodFindMethodBestMatch = XposedHelpers.findMethodBestMatch(AbstractC6337.m11866(AbstractC8405.m13972(65)), AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜呜喵呜喵~喵喵呜喵呜喵喵呜~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜喵喵"), new Class[0]);
                        C6263 c6263 = new C6263(2);
                        AtomicReference atomicReference = new AtomicReference();
                        atomicReference.set(XposedBridge.hookMethod(methodFindMethodBestMatch, new C5918(atomicReference, 5, c6263)));
                    } catch (Exception e4) {
                        String strM139723 = AbstractC8405.m13972(64);
                        String str5 = AbstractC6188.f17016;
                        AbstractC6188.m11605(strM139723, e4.toString(), e4, true);
                    }
                }
                if (AbstractC6358.m11943()) {
                    StringBuilder sb = new StringBuilder();
                    C8667.m14376().forEach(new C5663(new C0640(sb, 18), 1));
                    sb.deleteCharAt(sb.length() - 1);
                    String string = sb.toString();
                    AbstractC8405.m13972(1296);
                    AbstractC6188.m11604(string, AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵喵喵喵喵呜~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵喵喵呜"));
                }
            } catch (PackageManager.NameNotFoundException e5) {
                C5925.m11313(e5);
            }
        } catch (Exception e6) {
            C5925.m11313(e6);
        }
    }
}
