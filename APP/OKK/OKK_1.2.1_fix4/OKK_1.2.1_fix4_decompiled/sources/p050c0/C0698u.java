package p050c0;

import android.app.Activity;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import android.view.Window;
import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.luckypray.dexkit.C1031R;
import p009E0.AbstractC0179j;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;
import p037U.AbstractC0358S;

/* JADX INFO: renamed from: c0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0698u extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2199b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Method f2200c;

    public /* synthetic */ C0698u(Method method, int i2, boolean z2) {
        this.f2199b = i2;
        this.f2200c = method;
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: a */
    public void mo1385a(C0760b c0760b) {
        View decorView;
        View decorView2;
        CharSequence charSequence;
        String string;
        Method method = this.f2200c;
        int i2 = 1;
        int i3 = 0;
        switch (this.f2199b) {
            case 0:
                Object obj = c0760b.f2669b;
                Activity activity = obj instanceof Activity ? (Activity) obj : null;
                if (activity != null) {
                    C0707x c0707xM1785a = C0689r.m1785a();
                    if (c0707xM1785a.f2222a && c0707xM1785a.f2226e) {
                        AtomicBoolean atomicBoolean = C0704w.f2213a;
                        C0704w.m1793a(activity, "initView." + method.getName());
                        break;
                    }
                }
                break;
            case 1:
                Object obj2 = c0760b.f2669b;
                Activity activity2 = obj2 instanceof Activity ? (Activity) obj2 : null;
                if (activity2 != null) {
                    C0707x c0707xM1785a2 = C0689r.m1785a();
                    if (c0707xM1785a2.f2222a && c0707xM1785a2.f2226e) {
                        Window window = activity2.getWindow();
                        if (window != null && (decorView2 = window.getDecorView()) != null) {
                            decorView2.post(new RunnableC0701v(activity2, i3));
                        }
                        Window window2 = activity2.getWindow();
                        if (window2 != null && (decorView = window2.getDecorView()) != null) {
                            decorView.postDelayed(new RunnableC0701v(activity2, i2), 400L);
                            break;
                        }
                    }
                }
                break;
            case 2:
                try {
                    Object[] objArr = c0760b.f2670c;
                    AbstractC0307g.m702d(objArr, "args");
                    Object objM537n0 = AbstractC0179j.m537n0(0, objArr);
                    if (objM537n0 != null) {
                        Object[] objArr2 = c0760b.f2670c;
                        AbstractC0307g.m702d(objArr2, "args");
                        Object objM537n02 = AbstractC0179j.m537n0(1, objArr2);
                        Number number = objM537n02 instanceof Number ? (Number) objM537n02 : null;
                        if (number != null) {
                            int iIntValue = number.intValue();
                            ClassLoader classLoader = method.getDeclaringClass().getClassLoader();
                            if (classLoader != null || (classLoader = objM537n0.getClass().getClassLoader()) != null) {
                                C0639a0 c0639a0 = C0639a0.f1967a;
                                C0639a0.m1572b(c0760b.f2669b, objM537n0, iIntValue, classLoader);
                            }
                        }
                    }
                } catch (Throwable th) {
                    if (C0639a0.f1974h.compareAndSet(false, true)) {
                        C0639a0 c0639a02 = C0639a0.f1967a;
                        C0639a0.m1601p0("bind after err: " + Log.getStackTraceString(th));
                        return;
                    }
                    return;
                }
                break;
            case 3:
                Object[] objArr3 = c0760b.f2670c;
                AbstractC0307g.m702d(objArr3, "args");
                int length = objArr3.length;
                while (true) {
                    if (i3 < length) {
                        Object obj3 = objArr3[i3];
                        charSequence = ((obj3 instanceof CharSequence) || (obj3 instanceof String)) ? (CharSequence) obj3 : null;
                        if (charSequence == null) {
                            i3++;
                        }
                    } else {
                        charSequence = null;
                    }
                }
                if (charSequence != null && charSequence.length() <= 80 && AbstractC0358S.m859I(charSequence.toString())) {
                    Object obj4 = c0760b.f2669b;
                    View view = obj4 instanceof View ? (View) obj4 : null;
                    if (view != null) {
                        C0639a0.m1570a(view);
                        C0639a0.m1574c(AbstractC0324d.m725h("MMNeat.", method.getName()), view.getClass().getName());
                        break;
                    }
                }
                break;
            case 4:
                Object[] objArr4 = c0760b.f2670c;
                AbstractC0307g.m702d(objArr4, "args");
                int length2 = objArr4.length;
                while (true) {
                    if (i3 < length2) {
                        Object obj5 = objArr4[i3];
                        string = obj5 instanceof CharSequence ? obj5.toString() : obj5 instanceof String ? (String) obj5 : null;
                        if (string == null) {
                            i3++;
                        }
                    } else {
                        string = null;
                    }
                }
                if (string != null && AbstractC0358S.m859I(string)) {
                    Object obj6 = c0760b.f2669b;
                    View view2 = obj6 instanceof View ? (View) obj6 : null;
                    if (view2 != null) {
                        C0639a0.m1570a(view2);
                        C0639a0.m1574c(AbstractC0324d.m725h("X2CTextView.", method.getName()), view2.getClass().getName());
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: b */
    public void mo1386b(C0760b c0760b) {
        Method method = this.f2200c;
        switch (this.f2199b) {
            case 1:
                Object obj = c0760b.f2669b;
                Activity activity = obj instanceof Activity ? (Activity) obj : null;
                if (activity != null) {
                    C0707x c0707xM1785a = C0689r.m1785a();
                    if (c0707xM1785a.f2222a) {
                        boolean z2 = c0707xM1785a.f2224c;
                        boolean z3 = c0707xM1785a.f2223b;
                        ?? r5 = z3;
                        if (z2) {
                            r5 = (z3 ? 1 : 0) | 2;
                        }
                        int i2 = r5;
                        if (c0707xM1785a.f2225d) {
                            i2 = (r5 == true ? 1 : 0) | 4;
                        }
                        activity.getIntent().putExtra("intent.key.function.control", i2);
                        activity.getIntent().putExtra("intent.key.need.show.privacy.agreement", false);
                        AtomicBoolean atomicBoolean = C0704w.f2213a;
                        C0704w.m1796d("onCreate inject functionControl=" + i2 + " (" + method.getName() + ")");
                        break;
                    }
                }
                break;
            case 2:
                try {
                    Object[] objArr = c0760b.f2670c;
                    AbstractC0307g.m702d(objArr, "args");
                    Object objM537n0 = AbstractC0179j.m537n0(0, objArr);
                    if (objM537n0 != null) {
                        Object[] objArr2 = c0760b.f2670c;
                        AbstractC0307g.m702d(objArr2, "args");
                        Object objM537n02 = AbstractC0179j.m537n0(1, objArr2);
                        Number number = objM537n02 instanceof Number ? (Number) objM537n02 : null;
                        if (number != null) {
                            int iIntValue = number.intValue();
                            ClassLoader classLoader = method.getDeclaringClass().getClassLoader();
                            if (classLoader != null || (classLoader = objM537n0.getClass().getClassLoader()) != null) {
                                C0639a0 c0639a0 = C0639a0.f1967a;
                                View viewM1553I = C0639a0.m1553I(objM537n0);
                                if (viewM1553I != null) {
                                    ConcurrentHashMap concurrentHashMap = AbstractC0637Z0.f1953a;
                                    Object objM1537c = AbstractC0637Z0.m1537c(iIntValue, c0760b.f2669b);
                                    if (objM1537c != null) {
                                        Object obj2 = c0760b.f2669b;
                                        viewM1553I.setTag(C1031R.id.abc_tag_message_holder, objM537n0);
                                        if (obj2 != null) {
                                            viewM1553I.setTag(C1031R.id.abc_tag_message_adapter, obj2);
                                        }
                                        C0639a0.m1591k0(viewM1553I, objM1537c, classLoader);
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    if (C0639a0.f1974h.compareAndSet(false, true)) {
                        C0639a0 c0639a02 = C0639a0.f1967a;
                        C0639a0.m1601p0("bind before err: " + Log.getStackTraceString(th));
                        return;
                    }
                    return;
                }
                break;
            case 5:
                C0709x1 c0709x1M1792a = C0703v1.m1792a();
                if (c0709x1M1792a.f2230a) {
                    Object[] objArr3 = c0760b.f2670c;
                    AbstractC0307g.m702d(objArr3, "args");
                    Object objM537n03 = AbstractC0179j.m537n0(0, objArr3);
                    Bitmap bitmap = objM537n03 instanceof Bitmap ? (Bitmap) objM537n03 : null;
                    if (bitmap != null && !bitmap.isRecycled()) {
                        Object obj3 = c0760b.f2670c[2];
                        Number number2 = obj3 instanceof Number ? (Number) obj3 : null;
                        if (number2 != null) {
                            float fFloatValue = number2.floatValue();
                            float fMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
                            if (fMin > 1.0f) {
                                float f2 = c0709x1M1792a.f2231b;
                                float f3 = f2 * fMin;
                                float f4 = fFloatValue / fMin;
                                if (((0.03f <= f4 && f4 <= 0.6f) || fFloatValue <= fMin * 0.6f) && Math.abs(f3 - fFloatValue) > 0.01f) {
                                    c0760b.f2670c[2] = Float.valueOf(f3);
                                    C0706w1.m1798b(C0706w1.f2217a, "BitmapUtil." + method.getName() + " " + fFloatValue + "→" + f3, f2);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
        }
    }

    public C0698u(int i2, Method method) {
        this.f2199b = i2;
        switch (i2) {
            case 4:
                C0639a0 c0639a0 = C0639a0.f1967a;
                this.f2200c = method;
                break;
            case 5:
                C0706w1 c0706w1 = C0706w1.f2217a;
                this.f2200c = method;
                break;
            default:
                C0639a0 c0639a02 = C0639a0.f1967a;
                this.f2200c = method;
                break;
        }
    }
}
