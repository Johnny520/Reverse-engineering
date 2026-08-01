package top.suzhelan.qstory.hook;

import android.content.Context;
import android.content.ContextWrapper;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3065;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.AbstractC4346;
import kotlin.text.Regex;
import net.bytebuddy.description.method.MethodDescription;
import p010.AbstractC6157;
import p035.AbstractC6340;
import p339.C8812;
import p339.C8813;
import p339.C8814;
import top.linl.dexparser.util.Utils;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Ltop/suzhelan/qstory/hook/InjectHook;", "Lde/robv/android/xposed/IXposedHookLoadPackage;", "Lde/robv/android/xposed/IXposedHookZygoteInit;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;", "param", "Lkotlin/飘花落叶言子楪兰苏哲世;", "injectOnce", "(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V", "Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;", "loadPackageParam", "Ljava/lang/reflect/Method;", "getApplicationCreateMethod", "(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)Ljava/lang/reflect/Method;", "handleLoadPackage", "(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V", "Lde/robv/android/xposed/IXposedHookZygoteInit$StartupParam;", "startupParam", "initZygote", "(Lde/robv/android/xposed/IXposedHookZygoteInit$StartupParam;)V", "L飘花落叶言苏世楪子哲兰/飘花落叶言子楪世苏哲兰;", "hookEnter", "L飘花落叶言苏世楪子哲兰/飘花落叶言子楪世苏哲兰;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInject", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Companion", "飘花落叶言苏世楪子哲兰/飘花落叶言子楪世苏兰哲", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class InjectHook implements IXposedHookLoadPackage, IXposedHookZygoteInit {
    private final C8814 hookEnter = new C8814();
    private final AtomicBoolean isInject = new AtomicBoolean(false);
    public static final String BASE_APPLICATION_IMPL = "com.tencent.common.app.BaseApplicationImpl";
    public static final C8813 Companion = new C8813();
    public static final int $stable = 8;
    private static final Set<String> ALLOWED_PROCESS = AbstractC4346.m8852(new String[]{"com.tencent.mobileqq", "com.tencent.mobileqq:MSF"});

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Class, java.lang.Class<android.content.Context>] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.reflect.Method] */
    private final Method getApplicationCreateMethod(XC_LoadPackage.LoadPackageParam loadPackageParam) {
        Class declaredMethod = Context.class;
        try {
            try {
                Class<?> clsLoadClass = loadPackageParam.classLoader.loadClass(loadPackageParam.appInfo.name);
                try {
                    declaredMethod = clsLoadClass.getDeclaredMethod("attachBaseContext", declaredMethod);
                    return declaredMethod;
                } catch (Throwable unused) {
                    try {
                        try {
                            return clsLoadClass.getDeclaredMethod("onCreate", null);
                        } catch (Throwable unused2) {
                            declaredMethod = clsLoadClass.getSuperclass().getDeclaredMethod("attachBaseContext", declaredMethod);
                            return declaredMethod;
                        }
                    } catch (Throwable unused3) {
                        return clsLoadClass.getSuperclass().getDeclaredMethod("onCreate", null);
                    }
                }
            } catch (NoSuchMethodException unused4) {
                return null;
            }
        } catch (Exception unused5) {
            return ContextWrapper.class.getDeclaredMethod("attachBaseContext", declaredMethod);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void injectOnce(XC_MethodHook.MethodHookParam param) {
        StringBuilder sb;
        if (this.isInject.getAndSet(true)) {
            return;
        }
        XposedBridge.log("[QStory] " + param.method.getName() + " startLoad");
        Utils.MTimer mTimer = new Utils.MTimer();
        try {
            Object obj = param.thisObject;
            "null cannot be cast to non-null type android.content.ContextWrapper";
            obj.getClass();
            C8814 c8814 = this.hookEnter;
            Context baseContext = ((ContextWrapper) obj).getBaseContext();
            "getBaseContext(...)";
            baseContext.getClass();
            c8814.getClass();
            C8814.m14459(baseContext);
            sb = new StringBuilder();
        } catch (Throwable th) {
            try {
                XposedBridge.log(th);
                sb = new StringBuilder();
            } catch (Throwable th2) {
                XposedBridge.log("[QStory] " + param.method.getName() + " Loading Time " + mTimer.get());
                throw th2;
            }
        }
        sb.append("[QStory] ");
        sb.append(param.method.getName());
        sb.append(" Loading Time ");
        sb.append(mTimer.get());
        XposedBridge.log(sb.toString());
    }

    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam loadPackageParam) {
        "loadPackageParam";
        loadPackageParam.getClass();
        int i = 1;
        try {
            String str = loadPackageParam.packageName;
            String str2 = loadPackageParam.processName;
            if (loadPackageParam.isFirstApplication) {
                str.getClass();
                String str3 = AbstractC6340.f17465;
                String strM6668 = "com.tencent.mobileqq|com.tencent.tim";
                "getTargetPackageName(...)";
                if (new Regex(strM6668).matches(str)) {
                    AbstractC6340.f17465 = str;
                    AbstractC6340.f17464 = str2;
                    if (ALLOWED_PROCESS.contains(str2)) {
                        String str4 = loadPackageParam.appInfo.sourceDir;
                        Method applicationCreateMethod = getApplicationCreateMethod(loadPackageParam);
                        if (applicationCreateMethod != null) {
                            XposedBridge.hookMethod(applicationCreateMethod, new C8812(this, 0));
                        }
                        XposedHelpers.findAndHookMethod(loadPackageParam.classLoader.loadClass("com.tencent.common.app.BaseApplicationImpl"), "onCreate", new Object[]{new C8812(this, i)});
                    }
                }
            }
        } catch (Throwable th) {
            String strM66682 = "init";
            String str5 = AbstractC6157.f16779;
            AbstractC6157.m11574(strM66682, th.toString(), th, true);
            XposedBridge.log(th);
        }
    }

    public void initZygote(IXposedHookZygoteInit.StartupParam startupParam) {
        "startupParam";
        startupParam.getClass();
        C8814 c8814 = this.hookEnter;
        String str = startupParam.modulePath;
        "modulePath";
        str.getClass();
        c8814.getClass();
        "moduleApk";
        AbstractC6340.f17463 = str;
        AbstractC3065.f9796 = startupParam.modulePath;
    }
}
