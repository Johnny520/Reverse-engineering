package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.xposedcompat.XposedBridge;
import com.p001mr.elaris.xposedcompat.XposedHelpers;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: renamed from: j */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0273j {

    /* JADX INFO: renamed from: a */
    public static final Set f431a = Collections.synchronizedSet(Collections.newSetFromMap(new HashMap()));

    /* JADX INFO: renamed from: b */
    public static volatile boolean f432b;

    /* JADX INFO: renamed from: c */
    public static volatile boolean f433c;

    /* JADX INFO: renamed from: d */
    public static volatile long f434d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m698a(View view, int i) {
        if (view == null || i > 3) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        try {
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                sb.append(contentDescription);
            }
        } catch (Throwable unused) {
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            try {
                CharSequence text = textView.getText();
                if (text != null) {
                    sb.append(' ');
                    sb.append(text);
                }
                CharSequence hint = textView.getHint();
                if (hint != null) {
                    sb.append(' ');
                    sb.append(hint);
                }
            } catch (Throwable unused2) {
            }
        }
        try {
            int id = view.getId();
            if (id != -1) {
                sb.append(' ');
                sb.append(view.getResources().getResourceEntryName(id));
            }
        } catch (Throwable unused3) {
        }
        sb.append(' ');
        sb.append(view.getClass().getName());
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int iMin = Math.min(viewGroup.getChildCount(), 12);
            for (int i2 = 0; i2 < iMin; i2++) {
                sb.append(' ');
                sb.append(m698a(viewGroup.getChildAt(i2), i + 1));
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static ArrayList m699b(Class cls) {
        ArrayList arrayList = new ArrayList();
        for (Method method : cls.getDeclaredMethods()) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (method.getReturnType() == Void.TYPE && !Modifier.isAbstract(method.getModifiers()) && parameterTypes.length == 3 && parameterTypes[0] == Integer.TYPE && parameterTypes[1] == String.class && !parameterTypes[2].isPrimitive()) {
                arrayList.add(method);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static synchronized void m700c(ClassLoader classLoader) {
        if (!f433c && !f432b && classLoader != null) {
            boolean z = true;
            f432b = true;
            try {
                Class<?> clsFindClassIfExists = XposedHelpers.findClassIfExists("com.tencent.qqnt.aio.shortcutbar.PanelIconLinearLayout", classLoader);
                if (clsFindClassIfExists == null) {
                    HookEntry.log("aio input bar cleanup unavailable: PanelIconLinearLayout missing");
                    return;
                }
                ArrayList arrayListM699b = m699b(clsFindClassIfExists);
                int i = 0;
                for (int i2 = 0; i2 < arrayListM699b.size(); i2++) {
                    Method method = (Method) arrayListM699b.get(i2);
                    String strM701d = m701d(method);
                    if (f431a.add(strM701d)) {
                        try {
                            method.setAccessible(true);
                            XposedBridge.hookMethod(method, new C0254i(34));
                            i++;
                        } catch (Throwable th) {
                            f431a.remove(strM701d);
                            AbstractC0198e7.m343a("aio-input-cleanup", "hook-bind-method", th);
                        }
                    }
                }
                if (i <= 0) {
                    z = false;
                }
                f433c = z;
                if (f433c) {
                    HookEntry.logAlways("aio input bar cleanup precise hook installed class=" + clsFindClassIfExists.getName() + " count=" + i);
                } else {
                    HookEntry.log("aio input bar cleanup unavailable: bind method missing");
                }
            } catch (Throwable th2) {
                AbstractC0198e7.m343a("aio-input-cleanup", "install", th2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String m701d(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getDeclaringClass().getName());
        sb.append('#');
        sb.append(method.getName());
        sb.append('(');
        Class<?>[] parameterTypes = method.getParameterTypes();
        for (int i = 0; i < parameterTypes.length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(parameterTypes[i].getName());
        }
        sb.append("):");
        sb.append(method.getReturnType().getName());
        return sb.toString();
    }
}
