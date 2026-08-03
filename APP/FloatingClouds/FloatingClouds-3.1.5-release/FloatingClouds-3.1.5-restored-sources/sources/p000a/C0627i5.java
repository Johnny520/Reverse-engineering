package p000a;

import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import top.mmjz.floatingclouds.plugin.IPlugin;

/* JADX INFO: renamed from: a.i5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0627i5 implements IPlugin {

    /* JADX INFO: renamed from: a.i5$a */
    public static final class a<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C0889w1.m2147f(((Field) t).getName(), ((Field) t2).getName());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1477a(Object obj, String str) {
        String simpleName;
        if (obj == null) {
            return;
        }
        try {
            Field[] declaredFields = obj.getClass().getDeclaredFields();
            C0631i9.m1481d(declaredFields, "getDeclaredFields(...)");
            List<Field> listM632f0 = C0238N1.m632f0(declaredFields, new a());
            ArrayList arrayList = new ArrayList();
            for (Field field : listM632f0) {
                try {
                    field.setAccessible(true);
                    Object obj2 = field.get(obj);
                    if (obj2 != null) {
                        if (obj2 instanceof String) {
                            simpleName = "\"" + (((String) obj2).length() > 30 ? C0053Ce.m143X((String) obj2, 30) + "…" : (String) obj2) + "\"";
                        } else if (obj2 instanceof Number) {
                            simpleName = ((Number) obj2).toString();
                        } else if (obj2 instanceof Boolean) {
                            simpleName = String.valueOf(((Boolean) obj2).booleanValue());
                        } else if (obj2 instanceof Collection) {
                            simpleName = "[size=" + ((Collection) obj2).size() + "]";
                        } else {
                            simpleName = obj2.getClass().getSimpleName();
                        }
                        arrayList.add(field.getName() + "=" + simpleName);
                    }
                    C0413Wf c0413Wf = C0413Wf.f1577a;
                } catch (Throwable th) {
                    C0920xd.m2206a(th);
                }
            }
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"[DIAG-SNS] " + str + " fields: " + C0834t3.m1952p0(arrayList, "\n  ", null, 62)}, 1));
            C0413Wf c0413Wf2 = C0413Wf.f1577a;
        } catch (Throwable th2) {
            C0920xd.m2206a(th2);
        }
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(C0173J8 c0173j8) {
        C0631i9.m1482e(c0173j8, "session");
        C0908x1.m2194b(Arrays.copyOf(new Object[]{"[DIAG-SNS] handleHook START"}, 1));
        ClassLoader classLoader = c0173j8.f608a;
        if (classLoader == null) {
            return;
        }
        try {
            Class clsM13b = C0002A1.m13b(classLoader, "com.tencent.mm.ui.contact.mb");
            if (clsM13b != null) {
                String name = clsM13b.getName();
                Class cls = Integer.TYPE;
                C0173J8.m463a(c0173j8, name, "getView", new Class[]{cls, View.class, ViewGroup.class}, new C0586g2(11, this));
                C0173J8.m463a(c0173j8, clsM13b.getName(), "getItem", new Class[]{cls}, new C0586g2(12, this));
                C0173J8.m463a(c0173j8, clsM13b.getName(), "getCount", new Class[0], new C0586g2(13));
                C0908x1.m2194b(Arrays.copyOf(new Object[]{"[DIAG-LABEL] hooked mb adapter"}, 1));
            }
            C0413Wf c0413Wf = C0413Wf.f1577a;
        } catch (Throwable th) {
            C0920xd.m2206a(th);
        }
        C0908x1.m2194b(Arrays.copyOf(new Object[]{"[DIAG-SNS] handleHook DONE"}, 1));
    }
}
