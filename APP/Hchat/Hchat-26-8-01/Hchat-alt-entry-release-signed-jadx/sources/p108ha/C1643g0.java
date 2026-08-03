package p108ha;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import ch.C0570e;
import gg.AbstractC1416l;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;
import org.luckypray.dexkit.DexKitBridge;
import p062e8.C0828b;
import p068eh.AbstractC0921a;
import p080fb.AbstractC1184v0;
import p086fh.C1253k;
import p115hh.C1730o;
import p115hh.C1731p;
import p210o8.C3087k;
import p218og.AbstractC3149m;
import p258r8.C3742g;
import p258r8.C3744i;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;
import tf.AbstractC4165l;
import tf.C4173t;

/* JADX INFO: renamed from: ha.g0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1643g0 {

    /* JADX INFO: renamed from: a */
    public final C3742g f5388a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f5389b;

    /* JADX INFO: renamed from: c */
    public final SharedPreferences f5390c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f5391d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f5392e;

    /* JADX INFO: renamed from: f */
    public volatile Method f5393f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1643g0(C3742g c3742g) {
        c3742g.getClass();
        this.f5388a = c3742g;
        Context context = c3742g.f12143a;
        this.f5389b = AbstractC4302b.m8640c(context, "Hchat_original_moments_upload_config");
        this.f5390c = AbstractC4302b.m8640c(context, "Hchat_original_moments_upload_method_cache");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m4169c(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && method.getDeclaringClass().getName().equals("com.tencent.mm.plugin.gallery.ui.ImagePreviewUI") && parameterTypes.length == 3 && AbstractC1416l.m3825a(parameterTypes[0], Intent.class)) {
            Class<?> cls = parameterTypes[1];
            Class cls2 = Boolean.TYPE;
            if (AbstractC1416l.m3825a(cls, cls2) && AbstractC1416l.m3825a(parameterTypes[2], cls2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static boolean m4170d(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        return Modifier.isStatic(method.getModifiers()) && AbstractC1416l.m3825a(method.getReturnType(), Boolean.TYPE) && AbstractC0921a.m2236A(method, false, "com.tencent.mm.plugin.sns.storage.") && parameterTypes.length == 2 && AbstractC1416l.m3825a(parameterTypes[0], String.class) && AbstractC1416l.m3825a(parameterTypes[1], String.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static boolean m4171e(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        Class<?> returnType = method.getReturnType();
        Class cls = Boolean.TYPE;
        return AbstractC1416l.m3825a(returnType, cls) && AbstractC0921a.m2236A(method, false, "com.tencent.mm.plugin.sns.storage.") && parameterTypes.length >= 4 && AbstractC1416l.m3825a(parameterTypes[0], String.class) && AbstractC1416l.m3825a(parameterTypes[1], String.class) && AbstractC1416l.m3825a(parameterTypes[2], String.class) && AbstractC1416l.m3825a(parameterTypes[3], cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:18:0x0043 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: a */
    public final List m4172a(String... strArr) {
        Object c3959f;
        C3742g c3742g = this.f5388a;
        try {
            DexKitBridge dexKitBridge = c3742g.f12146d;
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            c1253k.m3374r0((String[]) Arrays.copyOf(strArr, strArr.length));
            c0570e.f1764h = c1253k;
            C1731p c1731pFindMethod = dexKitBridge.findMethod(c0570e);
            c3959f = new ArrayList();
            Iterator it = c1731pFindMethod.iterator();
            while (it.hasNext()) {
                c3959f.add(((C1730o) it.next()).m4350r(c3742g.f12145c));
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        Object obj = c3959f;
        if (thM8182b != null) {
            AbstractC0921a.m2260w("[Hchat:OriginalMomentsUpload] DexKit 精确定位失败(", AbstractC4165l.m8369F0(strArr, null, 63), "): ", thM8182b.getMessage(), thM8182b);
            obj = C4173t.f13710g;
        }
        return (List) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean m4173b(boolean z9) {
        boolean z10;
        Method methodM4176h;
        Method methodM4174f;
        try {
            Method methodM4175g = m4175g(z9);
            if (methodM4175g != null) {
                this.f5393f = methodM4175g;
            }
            z10 = true;
            if (!this.f5391d && (methodM4174f = m4174f(z9)) != null) {
                try {
                    C3744i.f12154b.m7763b(methodM4174f, new C1641f0(this, 0));
                    this.f5391d = true;
                } catch (Throwable th2) {
                    AbstractC1184v0.m3204n("[Hchat:OriginalMomentsUpload] 安装图库返回 Hook 失败: " + th2.getMessage(), th2);
                }
            }
            if (!this.f5392e && (methodM4176h = m4176h(z9)) != null) {
                try {
                    C3744i.f12154b.m7763b(methodM4176h, new C1641f0(this, 1));
                    this.f5392e = true;
                } catch (Throwable th3) {
                    AbstractC1184v0.m3204n("[Hchat:OriginalMomentsUpload] 安装朋友圈图片压缩 Hook 失败: " + th3.getMessage(), th3);
                }
            }
            if (!this.f5391d || !this.f5392e) {
                z10 = false;
            } else if (this.f5393f == null) {
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return z10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:44:0x0067 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: f */
    public final Method m4174f(boolean z9) {
        Object c3959f;
        String strM4177i = m4177i();
        C3742g c3742g = this.f5388a;
        ClassLoader classLoader = c3742g.f12145c;
        SharedPreferences sharedPreferences = this.f5390c;
        Method methodM2087c = C0828b.m2087c(sharedPreferences, strM4177i, classLoader, "image_preview_send");
        Object obj = null;
        if (methodM2087c != null) {
            if (!m4169c(methodM2087c)) {
                methodM2087c = null;
            }
            if (methodM2087c != null) {
                return methodM2087c;
            }
        }
        if (!z9) {
            return null;
        }
        String[] strArr = {"CropImage_OutputPath_List", "key_select_video_list"};
        try {
            DexKitBridge dexKitBridge = c3742g.f12146d;
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            C1253k.m3367u0(c1253k, AbstractC4165l.m8375L0(strArr));
            c0570e.f1764h = c1253k;
            C1731p c1731pFindMethod = dexKitBridge.findMethod(c0570e);
            c3959f = new ArrayList();
            Iterator it = c1731pFindMethod.iterator();
            while (it.hasNext()) {
                c3959f.add(((C1730o) it.next()).m4350r(c3742g.f12145c));
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        Object obj2 = c3959f;
        if (thM8182b != null) {
            AbstractC0921a.m2260w("[Hchat:OriginalMomentsUpload] DexKit 定位失败(", AbstractC4165l.m8369F0(strArr, null, 63), "): ", thM8182b.getMessage(), thM8182b);
            obj2 = C4173t.f13710g;
        }
        Iterator it2 = ((List) obj2).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (m4169c((Method) next)) {
                obj = next;
                break;
            }
        }
        Method method = (Method) obj;
        if (method != null) {
            C0828b.m2092h(sharedPreferences, strM4177i, "image_preview_send", method);
        } else {
            try {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strM4177i)) {
                    editorEdit.clear().putString("cache.key", strM4177i);
                }
                editorEdit.remove("image_preview_send").apply();
            } catch (Throwable unused) {
            }
        }
        return method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final Method m4175g(boolean z9) {
        String strM4177i = m4177i();
        ClassLoader classLoader = this.f5388a.f12145c;
        SharedPreferences sharedPreferences = this.f5390c;
        Method methodM2087c = C0828b.m2087c(sharedPreferences, strM4177i, classLoader, "sns_convert_img_without_zip");
        Object obj = null;
        if (methodM2087c != null) {
            if (!m4170d(methodM2087c)) {
                methodM2087c = null;
            }
            if (methodM2087c != null) {
                return methodM2087c;
            }
        }
        if (!z9) {
            return null;
        }
        Iterator it = m4172a("MicroMsg.snsMediaStorage", "convertImg2WxamWithoutZip origPath:%s OutOfMemoryError! rollback").iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (m4170d((Method) next)) {
                obj = next;
                break;
            }
        }
        Method method = (Method) obj;
        if (method != null) {
            C0828b.m2092h(sharedPreferences, strM4177i, "sns_convert_img_without_zip", method);
            return method;
        }
        try {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strM4177i)) {
                editorEdit.clear().putString("cache.key", strM4177i);
            }
            editorEdit.remove("sns_convert_img_without_zip").apply();
        } catch (Throwable unused) {
        }
        return method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final Method m4176h(boolean z9) {
        String strM4177i = m4177i();
        ClassLoader classLoader = this.f5388a.f12145c;
        SharedPreferences sharedPreferences = this.f5390c;
        Method methodM2087c = C0828b.m2087c(sharedPreferences, strM4177i, classLoader, "sns_create_pic");
        Object obj = null;
        if (methodM2087c != null) {
            if (!m4171e(methodM2087c)) {
                methodM2087c = null;
            }
            if (methodM2087c != null) {
                return methodM2087c;
            }
        }
        if (!z9) {
            return null;
        }
        Iterator it = m4172a("MicroMsg.snsMediaStorage", "SnsCompressResolutionFor2G", "SnsCompressResolutionFor3G", "SnsCompressResolutionFor4G", "SnsCompressResolutionForWifi").iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (m4171e((Method) next)) {
                obj = next;
                break;
            }
        }
        Method method = (Method) obj;
        if (method != null) {
            C0828b.m2092h(sharedPreferences, strM4177i, "sns_create_pic", method);
            return method;
        }
        try {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strM4177i)) {
                editorEdit.clear().putString("cache.key", strM4177i);
            }
            editorEdit.remove("sns_create_pic").apply();
        } catch (Throwable unused) {
        }
        return method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final String m4177i() {
        C3742g c3742g = this.f5388a;
        Context context = c3742g.f12143a;
        ClassLoader classLoader = c3742g.f12145c;
        classLoader.getClass();
        String str = C3087k.m6557a(context, classLoader).f8202h;
        if (AbstractC3149m.m6721t0(str)) {
            str = null;
        }
        String strConcat = str != null ? str.concat("|original_moments_upload_v2") : null;
        return strConcat == null ? HttpUrl.FRAGMENT_ENCODE_SET : strConcat;
    }
}
