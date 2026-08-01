package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import com.bumptech.glide.AbstractC3889;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.jvm.internal.C5229;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: androidx.window.layout.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3421 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C3420 f8106;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f8107;

    public /* synthetic */ C3421(C3420 c3420, int i) {
        this.f8107 = i;
        this.f8106 = c3420;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e4  */
    @Override // p068.InterfaceC7372
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() throws NoSuchMethodException, ClassNotFoundException {
        int i = this.f8107;
        Class cls = Integer.TYPE;
        Class<?> cls2 = null;
        boolean z = false;
        C3420 c3420 = this.f8106;
        switch (i) {
            case 0:
                Class<?> clsLoadClass = c3420.f8103.f20815.loadClass("androidx.window.extensions.WindowExtensions");
                clsLoadClass.getClass();
                Method method = clsLoadClass.getMethod("getWindowLayoutComponent", null);
                Class<?> clsLoadClass2 = c3420.f8105.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                clsLoadClass2.getClass();
                method.getClass();
                return Boolean.valueOf(Modifier.isPublic(method.getModifiers()) && method.getReturnType().equals(clsLoadClass2));
            case 1:
                Class<?> clsLoadClass3 = c3420.f8105.loadClass("androidx.window.extensions.layout.FoldingFeature");
                clsLoadClass3.getClass();
                Method method2 = clsLoadClass3.getMethod("getBounds", null);
                Method method3 = clsLoadClass3.getMethod("getType", null);
                Method method4 = clsLoadClass3.getMethod("getState", null);
                method2.getClass();
                C5229 c5229 = AbstractC5228.f13320;
                if (method2.getReturnType().equals(AbstractC3889.m7316(c5229.mo9476(Rect.class))) && Modifier.isPublic(method2.getModifiers())) {
                    method3.getClass();
                    if (method3.getReturnType().equals(AbstractC3889.m7316(c5229.mo9476(cls))) && Modifier.isPublic(method3.getModifiers())) {
                        method4.getClass();
                        if (!method4.getReturnType().equals(AbstractC3889.m7316(c5229.mo9476(cls))) || !Modifier.isPublic(method4.getModifiers())) {
                        }
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                ClassLoader classLoader = c3420.f8105;
                Class<?> clsLoadClass4 = classLoader.loadClass("androidx.window.extensions.layout.SupportedWindowFeatures");
                clsLoadClass4.getClass();
                Method method5 = clsLoadClass4.getMethod("getDisplayFoldFeatures", null);
                Type genericReturnType = method5.getGenericReturnType();
                genericReturnType.getClass();
                Type type = ((ParameterizedType) genericReturnType).getActualTypeArguments()[0];
                type.getClass();
                Class cls3 = (Class) type;
                if (Modifier.isPublic(method5.getModifiers()) && method5.getReturnType().equals(List.class)) {
                    Class<?> clsLoadClass5 = classLoader.loadClass("androidx.window.extensions.layout.DisplayFoldFeature");
                    clsLoadClass5.getClass();
                    if (!cls3.equals(clsLoadClass5)) {
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                Class<?> clsLoadClass6 = c3420.f8105.loadClass("androidx.window.extensions.layout.DisplayFoldFeature");
                clsLoadClass6.getClass();
                Method method6 = clsLoadClass6.getMethod("getType", null);
                Method method7 = clsLoadClass6.getMethod("hasProperty", cls);
                Method method8 = clsLoadClass6.getMethod("hasProperties", int[].class);
                method6.getClass();
                if (Modifier.isPublic(method6.getModifiers())) {
                    cls.getClass();
                    if (method6.getReturnType().equals(cls)) {
                        method7.getClass();
                        if (Modifier.isPublic(method7.getModifiers())) {
                            Class cls4 = Boolean.TYPE;
                            cls4.getClass();
                            if (method7.getReturnType().equals(cls4)) {
                                method8.getClass();
                                z = Modifier.isPublic(method8.getModifiers()) && method8.getReturnType().equals(cls4);
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 4:
                ClassLoader classLoader2 = c3420.f8105;
                Class<?> clsLoadClass7 = classLoader2.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                clsLoadClass7.getClass();
                Method method9 = clsLoadClass7.getMethod("getSupportedWindowFeatures", null);
                method9.getClass();
                if (Modifier.isPublic(method9.getModifiers())) {
                    Class<?> clsLoadClass8 = classLoader2.loadClass("androidx.window.extensions.layout.SupportedWindowFeatures");
                    clsLoadClass8.getClass();
                    z = method9.getReturnType().equals(clsLoadClass8);
                }
                return Boolean.valueOf(z);
            case 5:
                try {
                    Class<?> clsLoadClass9 = c3420.f8104.f19007.loadClass("java.util.function.Consumer");
                    clsLoadClass9.getClass();
                    cls2 = clsLoadClass9;
                } catch (ClassNotFoundException unused) {
                }
                if (cls2 != null) {
                    Class<?> clsLoadClass10 = c3420.f8105.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                    clsLoadClass10.getClass();
                    Method method10 = clsLoadClass10.getMethod("addWindowLayoutInfoListener", Activity.class, cls2);
                    Method method11 = clsLoadClass10.getMethod("removeWindowLayoutInfoListener", cls2);
                    method10.getClass();
                    if (Modifier.isPublic(method10.getModifiers())) {
                        method11.getClass();
                        z = Modifier.isPublic(method11.getModifiers());
                        z = z;
                    }
                }
                return Boolean.valueOf(z);
            default:
                return Boolean.valueOf(C3420.m5669(c3420));
        }
    }
}
