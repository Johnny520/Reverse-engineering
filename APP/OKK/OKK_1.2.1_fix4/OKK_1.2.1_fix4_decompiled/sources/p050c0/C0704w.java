package p050c0;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import de.robv.android.xposed.AbstractC0762d;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.luckypray.dexkit.C1031R;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0140f;
import p007D0.C0146l;
import p009E0.C0172c;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0317q;
import p042W0.AbstractC0425j;

/* JADX INFO: renamed from: c0.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0704w {

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f2213a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public static final ConcurrentHashMap.KeySetView f2214b = ConcurrentHashMap.newKeySet();

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
    
        r8 = null;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1793a(Activity activity, String str) {
        Window window;
        View decorView;
        Button button;
        Button button2;
        Object next;
        Object objPrevious;
        Object objM116u;
        Object objM116u2;
        if (activity.isFinishing() || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null || AbstractC0307g.m699a(decorView.getTag(C1031R.id.abc_tag_auto_login_clicked), Boolean.TRUE)) {
            return;
        }
        Class<?> superclass = activity.getClass();
        int i2 = 0;
        loop0: while (true) {
            button = null;
            button = null;
            if (superclass == null || i2 >= 6) {
                break;
            }
            C0172c c0172cM714c = AbstractC0317q.m714c(superclass.getDeclaredFields());
            while (c0172cM714c.hasNext()) {
                Field field = (Field) c0172cM714c.next();
                if (Button.class.isAssignableFrom(field.getType())) {
                    try {
                        field.setAccessible(true);
                        Object obj = field.get(activity);
                        objM116u2 = obj instanceof Button ? (Button) obj : null;
                    } catch (Throwable th) {
                        objM116u2 = AbstractC0040p.m116u(th);
                    }
                    boolean z2 = objM116u2 instanceof C0140f;
                    Object obj2 = objM116u2;
                    if (z2) {
                        obj2 = null;
                    }
                    button2 = (Button) obj2;
                    if (button2 != null && button2.getVisibility() == 0) {
                        break loop0;
                    }
                }
            }
            superclass = superclass.getSuperclass();
            i2++;
        }
        if (button2 != null) {
            button = button2;
        } else {
            Window window2 = activity.getWindow();
            View decorView2 = window2 != null ? window2.getDecorView() : null;
            ViewGroup viewGroup = decorView2 instanceof ViewGroup ? (ViewGroup) decorView2 : null;
            if (viewGroup != null) {
                ArrayList arrayList = new ArrayList();
                m1794b(viewGroup, arrayList);
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        CharSequence text = ((Button) next).getText();
                        String string = text != null ? text.toString() : null;
                        if (string == null) {
                            string = "";
                        }
                        if (AbstractC0425j.m1005J0(string, "登录", false) || AbstractC0425j.m1005J0(string, "登入", false) || AbstractC0425j.m1005J0(string, "Login", true) || AbstractC0425j.m1005J0(string, "確認", false) || AbstractC0425j.m1005J0(string, "确认", false)) {
                            break;
                        }
                    }
                    Button button3 = (Button) next;
                    if (button3 != null) {
                        button = button3;
                    } else {
                        ListIterator listIterator = arrayList.listIterator(arrayList.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                objPrevious = null;
                                break;
                            }
                            objPrevious = listIterator.previous();
                            Button button4 = (Button) objPrevious;
                            if (button4.isEnabled() && button4.getVisibility() == 0) {
                                break;
                            }
                        }
                        Button button5 = (Button) objPrevious;
                        if (button5 == null) {
                            button = (Button) (arrayList.isEmpty() ? null : arrayList.get(arrayList.size() - 1));
                        } else {
                            button = button5;
                        }
                    }
                }
            }
        }
        if (button == null) {
            m1796d("login button not found (" + str + ")");
            return;
        }
        if (!button.isEnabled() || button.getVisibility() != 0) {
            m1796d("login button not clickable enabled=" + button.isEnabled() + " vis=" + button.getVisibility() + " (" + str + ")");
            return;
        }
        try {
            button.performClick();
            decorView.setTag(C1031R.id.abc_tag_auto_login_clicked, Boolean.TRUE);
            m1796d("performClick ok via " + str + " text=" + ((Object) button.getText()));
            objM116u = C0146l.f339a;
        } catch (Throwable th2) {
            objM116u = AbstractC0040p.m116u(th2);
        }
        Throwable thM465a = AbstractC0141g.m465a(objM116u);
        if (thM465a != null) {
            m1796d("performClick failed: " + thM465a.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m1794b(View view, ArrayList arrayList) {
        if (view instanceof Button) {
            arrayList.add(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                AbstractC0307g.m702d(childAt, "getChildAt(...)");
                m1794b(childAt, arrayList);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m1795c(Method method) {
        String name = method.getDeclaringClass().getName();
        String name2 = method.getName();
        String string = Arrays.toString(method.getParameterTypes());
        AbstractC0307g.m702d(string, "toString(...)");
        return name + "#" + name2 + string;
    }

    /* JADX INFO: renamed from: d */
    public static void m1796d(String str) {
        try {
            AbstractC0762d.m1954d("[OKK-AutoLogin] " + str);
        } catch (Throwable unused) {
        }
    }
}
