package p086r0;

import android.graphics.Bitmap;
import android.util.LruCache;
import android.view.View;
import android.widget.ImageView;
import de.robv.android.xposed.XC_MethodHook;
import java.io.File;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Set;
import p007D0.RunnableC0093a;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0123k;
import p027N0.AbstractC0223g;
import p054c0.AbstractC0509a;
import p070i0.AbstractC0731a;
import p084q0.C0804d;
import p102z0.AbstractC1126i;
import p102z0.AbstractC1129l;
import p102z0.C1124g;

/* JADX INFO: renamed from: r0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0926o extends AbstractC0509a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3300a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0932q f3301b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0926o(C0932q c0932q, int i2) {
        this.f3300a = i2;
        this.f3301b = c0932q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054c0.AbstractC0509a
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        final Object obj;
        final int i2 = 1;
        final C0932q c0932q = this.f3301b;
        final int i3 = 0;
        int i4 = this.f3300a;
        AbstractC0223g.m418e(methodHookParam, "param");
        switch (i4) {
            case 0:
                boolean z2 = AbstractC1126i.f3786a;
                if (C1124g.m2445u()) {
                    Object[] objArr = methodHookParam.args;
                    AbstractC0223g.m417d(objArr, "args");
                    Object objM258f0 = AbstractC0120h.m258f0(0, objArr);
                    ImageView imageView = objM258f0 instanceof ImageView ? (ImageView) objM258f0 : null;
                    if (imageView != null) {
                        Object[] objArr2 = methodHookParam.args;
                        AbstractC0223g.m417d(objArr2, "args");
                        Object objM258f02 = AbstractC0120h.m258f0(1, objArr2);
                        String str = objM258f02 instanceof String ? (String) objM258f02 : null;
                        if (str != null) {
                            Member member = methodHookParam.method;
                            Method method = member instanceof Method ? (Method) member : null;
                            if (method != null) {
                                Set set = c0932q.f3317b;
                                if (!set.contains(method)) {
                                    set.add(method);
                                    String strM271m0 = AbstractC0123k.m271m0(AbstractC1129l.m2453c().keySet(), ",", null, null, null, 62);
                                    String str2 = method.getDeclaringClass().getName() + "#" + method.getName();
                                    Class<?>[] parameterTypes = method.getParameterTypes();
                                    AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                                    AbstractC0731a.m1387d("custom local avatar loader hit", str2, AbstractC0120h.m260h0(parameterTypes, ",", new C0804d(13), 30), "firstUser=".concat(str), "configured=".concat(strM271m0));
                                }
                            } else {
                                c0932q.getClass();
                            }
                            c0932q.getClass();
                            String strM2454d = AbstractC1129l.m2454d(str);
                            if (strM2454d != null) {
                                File file = new File(strM2454d);
                                String str3 = file.getAbsolutePath() + ":" + file.lastModified() + ":" + file.length() + ":" + C0932q.m2044j(imageView);
                                LruCache lruCache = c0932q.f3316a;
                                Bitmap bitmap = (Bitmap) lruCache.get(str3);
                                if (bitmap == null) {
                                    Bitmap bitmapM2041c = C0932q.m2041c(file, C0932q.m2044j(imageView));
                                    if (bitmapM2041c != null) {
                                        lruCache.put(str3, bitmapM2041c);
                                        bitmap = bitmapM2041c;
                                    } else {
                                        bitmap = null;
                                    }
                                    if (bitmap == null) {
                                    }
                                }
                                Bitmap bitmap2 = bitmap;
                                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                imageView.setImageBitmap(bitmap2);
                                imageView.invalidate();
                                AbstractC0731a.m1387d("custom local avatar applied", str, imageView.getClass().getName());
                                imageView.post(new RunnableC0093a(str, strM2454d, imageView, bitmap2, 1));
                                methodHookParam.setResult((Object) null);
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                boolean z3 = AbstractC1126i.f3786a;
                if (C1124g.m2445u()) {
                    Object[] objArr3 = methodHookParam.args;
                    AbstractC0223g.m417d(objArr3, "args");
                    Object objM258f03 = AbstractC0120h.m258f0(0, objArr3);
                    final String str4 = objM258f03 instanceof String ? (String) objM258f03 : null;
                    if (str4 != null && (obj = methodHookParam.thisObject) != null && C0932q.m2039a(c0932q, obj, str4)) {
                        methodHookParam.setResult((Object) null);
                        View view = obj instanceof View ? (View) obj : null;
                        if (view != null) {
                            view.post(new Runnable() { // from class: r0.p
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i3) {
                                        case 0:
                                            C0932q.m2039a(c0932q, obj, str4);
                                            break;
                                        default:
                                            C0932q.m2039a(c0932q, obj, str4);
                                            break;
                                    }
                                }
                            });
                            view.postDelayed(new Runnable() { // from class: r0.p
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i2) {
                                        case 0:
                                            C0932q.m2039a(c0932q, obj, str4);
                                            break;
                                        default:
                                            C0932q.m2039a(c0932q, obj, str4);
                                            break;
                                    }
                                }
                            }, 300L);
                        }
                    }
                    break;
                }
                break;
        }
    }
}
