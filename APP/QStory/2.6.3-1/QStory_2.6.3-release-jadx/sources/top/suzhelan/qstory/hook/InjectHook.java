package top.suzhelan.qstory.hook;

import android.content.Context;
import android.content.ContextWrapper;
import com.bumptech.glide.AbstractC3888;
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
import kotlin.collections.AbstractC5179;
import kotlin.text.Regex;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC7017;
import p052.AbstractC7187;
import p303.AbstractC9234;
import p347.C9611;
import p347.C9612;
import p347.C9613;
import top.linl.dexparser.util.Utils;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, m151d2 = {"Ltop/suzhelan/qstory/hook/InjectHook;", "Lde/robv/android/xposed/IXposedHookLoadPackage;", "Lde/robv/android/xposed/IXposedHookZygoteInit;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;", "param", "Lkotlin/飘花落叶言子楪兰苏哲世;", "injectOnce", "(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V", "Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;", "loadPackageParam", "Ljava/lang/reflect/Method;", "getApplicationCreateMethod", "(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)Ljava/lang/reflect/Method;", "handleLoadPackage", "(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V", "Lde/robv/android/xposed/IXposedHookZygoteInit$StartupParam;", "startupParam", "initZygote", "(Lde/robv/android/xposed/IXposedHookZygoteInit$StartupParam;)V", "L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏哲兰;", "hookEnter", "L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏哲兰;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInject", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Companion", "飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class InjectHook implements IXposedHookLoadPackage, IXposedHookZygoteInit {
    private final C9613 hookEnter = new C9613();
    private final AtomicBoolean isInject = new AtomicBoolean(false);
    public static final String BASE_APPLICATION_IMPL = AbstractC9234.m14531(72);
    public static final C9612 Companion = new C9612();
    public static final int $stable = 8;
    private static final Set<String> ALLOWED_PROCESS = AbstractC5179.m9404(new String[]{AbstractC9234.m14531(59), AbstractC9234.m14531(61)});

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Class, java.lang.Class<android.content.Context>] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.reflect.Method] */
    private final Method getApplicationCreateMethod(XC_LoadPackage.LoadPackageParam loadPackageParam) {
        Class declaredMethod = Context.class;
        try {
            Class<?> clsLoadClass = loadPackageParam.classLoader.loadClass(loadPackageParam.appInfo.name);
            try {
                declaredMethod = clsLoadClass.getDeclaredMethod(AbstractC9234.m14531(74), declaredMethod);
                return declaredMethod;
            } catch (Throwable unused) {
                try {
                    try {
                        try {
                            return clsLoadClass.getDeclaredMethod(AbstractC9234.m14531(73), null);
                        } catch (Throwable unused2) {
                            declaredMethod = clsLoadClass.getSuperclass().getDeclaredMethod(AbstractC9234.m14531(74), declaredMethod);
                            return declaredMethod;
                        }
                    } catch (Throwable unused3) {
                        return clsLoadClass.getSuperclass().getDeclaredMethod(AbstractC9234.m14531(73), null);
                    }
                } catch (NoSuchMethodException unused4) {
                    return null;
                }
            }
        } catch (Exception unused5) {
            return ContextWrapper.class.getDeclaredMethod(AbstractC9234.m14531(74), declaredMethod);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void injectOnce(XC_MethodHook.MethodHookParam param) {
        StringBuilder sb;
        if (this.isInject.getAndSet(true)) {
            return;
        }
        XposedBridge.log(AbstractC9234.m14531(67) + param.method.getName() + AbstractC9234.m14531(68));
        Utils.MTimer mTimer = new Utils.MTimer();
        try {
            Object obj = param.thisObject;
            AbstractC9234.m14531(1538);
            obj.getClass();
            C9613 c9613 = this.hookEnter;
            Context baseContext = ((ContextWrapper) obj).getBaseContext();
            AbstractC9234.m14531(1539);
            baseContext.getClass();
            c9613.getClass();
            C9613.m15030(baseContext);
            sb = new StringBuilder();
        } catch (Throwable th) {
            try {
                XposedBridge.log(th);
                sb = new StringBuilder();
            } catch (Throwable th2) {
                XposedBridge.log(AbstractC9234.m14531(67) + param.method.getName() + AbstractC9234.m14531(69) + mTimer.get());
                throw th2;
            }
        }
        sb.append(AbstractC9234.m14531(67));
        sb.append(param.method.getName());
        sb.append(AbstractC9234.m14531(69));
        sb.append(mTimer.get());
        XposedBridge.log(sb.toString());
    }

    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam loadPackageParam) {
        AbstractC9234.m14531(1534);
        loadPackageParam.getClass();
        int i = 1;
        try {
            String str = loadPackageParam.packageName;
            String str2 = loadPackageParam.processName;
            if (loadPackageParam.isFirstApplication) {
                str.getClass();
                String str3 = AbstractC7187.f17857;
                String strM14531 = AbstractC9234.m14531(58);
                AbstractC9234.m14531(1535);
                if (new Regex(strM14531).matches(str)) {
                    AbstractC7187.f17857 = str;
                    AbstractC7187.f17856 = str2;
                    if (ALLOWED_PROCESS.contains(str2)) {
                        String str4 = loadPackageParam.appInfo.sourceDir;
                        Method applicationCreateMethod = getApplicationCreateMethod(loadPackageParam);
                        if (applicationCreateMethod != null) {
                            XposedBridge.hookMethod(applicationCreateMethod, new C9611(this, 0));
                        }
                        XposedHelpers.findAndHookMethod(loadPackageParam.classLoader.loadClass(AbstractC9234.m14531(72)), AbstractC9234.m14531(73), new Object[]{new C9611(this, i)});
                    }
                }
            }
        } catch (Throwable th) {
            String strM14532 = AbstractC9234.m14532("喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜喵喵呜呜~喵喵喵呜呜呜喵喵");
            String str5 = AbstractC7017.f17361;
            AbstractC7017.m12164(strM14532, th.toString(), th, true);
            XposedBridge.log(th);
        }
    }

    public void initZygote(IXposedHookZygoteInit.StartupParam startupParam) {
        AbstractC9234.m14531(1536);
        startupParam.getClass();
        C9613 c9613 = this.hookEnter;
        String str = startupParam.modulePath;
        AbstractC9234.m14531(1537);
        str.getClass();
        c9613.getClass();
        AbstractC9234.m14531(1532);
        AbstractC7187.f17855 = str;
        AbstractC3888.f10104 = startupParam.modulePath;
    }
}
