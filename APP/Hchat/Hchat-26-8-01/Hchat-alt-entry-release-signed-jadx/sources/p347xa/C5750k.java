package p347xa;

import android.app.Activity;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import de.robv.android.xposed.XC_MethodHook;
import gg.AbstractC1416l;
import gg.AbstractC1428x;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ng.AbstractC3015m;
import ng.C3010h;
import ng.C3011i;
import okhttp3.HttpUrl;
import p036c9.C0456k1;
import p054dg.C0795n;
import p068eh.AbstractC0921a;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.utils.KavaReflector;
import p218og.AbstractC3149m;
import p258r8.RunnableC3737b;
import p276sf.C3959f;
import p332wb.C5319sr;
import tf.AbstractC4165l;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: xa.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5750k extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23411a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C5752m f23412b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5750k(C5752m c5752m, int i9) {
        this.f23411a = i9;
        this.f23412b = c5752m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0386 A[LOOP:5: B:186:0x0363->B:202:0x0386, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x038a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        boolean zM10446e;
        C5748i c5748i;
        Object c3959f;
        boolean z9;
        C1368i c1368iContacts;
        Object next;
        Object c3959f2;
        Object next2;
        Object objInvokeMethod;
        Object next3;
        Activity activityM10442c;
        String stringExtra;
        Activity activityM10442c2;
        switch (this.f23411a) {
            case 0:
                methodHookParam.getClass();
                C5752m c5752m = this.f23412b;
                if (c5752m.m10445b()) {
                    Object[] objArr = methodHookParam.args;
                    Object objM8366C0 = objArr != null ? AbstractC4165l.m8366C0(0, objArr) : null;
                    ContextMenu contextMenu = objM8366C0 instanceof ContextMenu ? (ContextMenu) objM8366C0 : null;
                    if (contextMenu != null) {
                        Object obj = methodHookParam.thisObject;
                        if (obj != null) {
                            C3010h c3010h = new C3010h(AbstractC3015m.m6414X(AbstractC3015m.m6414X(new C3011i(AbstractC4166m.m8415m1(KavaReflector.declaredFields(obj.getClass())), false, new C5319sr(28)), new C0456k1(obj, 27)), new C5319sr(22)));
                            while (true) {
                                if (c3010h.hasNext()) {
                                    next2 = c3010h.next();
                                    Method method = (Method) next2;
                                    if (!AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) || !AbstractC0921a.m2236A(method, false, "com.tencent.mm.ui.conversation.")) {
                                    }
                                } else {
                                    next2 = null;
                                }
                            }
                            Method method2 = (Method) next2;
                            zM10446e = method2 != null ? c5752m.m10446e(method2, new C5750k(c5752m, 1)) : false;
                        }
                        if (zM10446e) {
                            Object obj2 = methodHookParam.thisObject;
                            if (obj2 != null) {
                                List<Field> listDeclaredFields = KavaReflector.declaredFields(obj2.getClass());
                                Activity activity = (Activity) AbstractC3015m.m6411U(AbstractC3015m.m6414X(new C3011i(AbstractC4166m.m8415m1(listDeclaredFields), true, new C5319sr(23)), new C0456k1(obj2, 24)));
                                if (activity == null || (c1368iContacts = WeChatApis.contacts()) == null) {
                                    c5748i = null;
                                } else {
                                    C3010h c3010h2 = new C3010h(new C3011i(AbstractC3015m.m6413W(AbstractC3015m.m6414X(new C3011i(new C0795n(listDeclaredFields, 6), true, new C5319sr(24)), new C0456k1(obj2, 25)), new C5319sr(25)), true, new C5319sr(26)));
                                    while (true) {
                                        if (c3010h2.hasNext()) {
                                            next = c3010h2.next();
                                            try {
                                                c3959f2 = Boolean.valueOf(c1368iContacts.m3705H((String) next));
                                            } catch (Throwable th2) {
                                                c3959f2 = new C3959f(th2);
                                            }
                                            Object obj3 = Boolean.FALSE;
                                            if (c3959f2 instanceof C3959f) {
                                                c3959f2 = obj3;
                                            }
                                            if (((Boolean) c3959f2).booleanValue()) {
                                            }
                                        } else {
                                            next = null;
                                        }
                                        break;
                                    }
                                    String str = (String) next;
                                    if (str != null) {
                                        c5748i = new C5748i(activity, str, false);
                                    }
                                }
                            }
                            if (c5748i != null) {
                                contextMenu.removeItem(1212371533);
                                try {
                                    c3959f = Integer.valueOf(contextMenu.getItem(0).getGroupId());
                                    break;
                                } catch (Throwable th3) {
                                    c3959f = new C3959f(th3);
                                }
                                if (c3959f instanceof C3959f) {
                                    c3959f = 0;
                                }
                                MenuItem menuItemAdd = contextMenu.add(((Number) c3959f).intValue(), 1212371533, 0, "设置备注和标签");
                                menuItemAdd.getClass();
                                for (Class<?> superclass = contextMenu.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                                    for (Field field : KavaReflector.declaredFields(superclass)) {
                                        if (List.class.isAssignableFrom(field.getType())) {
                                            Object field2 = KavaReflector.readField(field, contextMenu);
                                            List list = AbstractC1428x.m3840e(field2) ? (List) field2 : null;
                                            if (list != null) {
                                                Iterator it = list.iterator();
                                                int i9 = 0;
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        Object next4 = it.next();
                                                        if (next4 != menuItemAdd) {
                                                            MenuItem menuItem = next4 instanceof MenuItem ? (MenuItem) next4 : null;
                                                            z9 = menuItem != null && menuItem.getItemId() == 1212371533;
                                                            if (z9) {
                                                                i9++;
                                                            }
                                                        }
                                                        if (z9) {
                                                        }
                                                    } else {
                                                        i9 = -1;
                                                    }
                                                }
                                                if (i9 > 0) {
                                                    try {
                                                        list.add(0, list.remove(i9));
                                                        break;
                                                    } catch (Throwable unused) {
                                                    }
                                                }
                                                if (i9 >= 0) {
                                                    Map map = c5752m.f23418f;
                                                    map.getClass();
                                                    map.put(menuItemAdd, c5748i);
                                                    return;
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    }
                                }
                                Map map2 = c5752m.f23418f;
                                map2.getClass();
                                map2.put(menuItemAdd, c5748i);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
            default:
                super.afterHookedMethod(methodHookParam);
                return;
            case 2:
                methodHookParam.getClass();
                final C5752m c5752m2 = this.f23412b;
                Object obj4 = methodHookParam.thisObject;
                Object[] objArr2 = methodHookParam.args;
                Object objM8366C02 = objArr2 != null ? AbstractC4165l.m8366C0(0, objArr2) : null;
                View.OnClickListener onClickListener = objM8366C02 instanceof View.OnClickListener ? (View.OnClickListener) objM8366C02 : null;
                if (obj4 == null || onClickListener == null || (objInvokeMethod = KavaReflector.invokeMethod(obj4, "getViewHeader", new Object[0])) == null) {
                    return;
                }
                C3010h c3010h3 = new C3010h(AbstractC3015m.m6414X(new C3011i(AbstractC4166m.m8415m1(KavaReflector.declaredFields(objInvokeMethod.getClass())), true, new C5319sr(27)), new C0456k1(objInvokeMethod, 26)));
                while (true) {
                    if (c3010h3.hasNext()) {
                        next3 = c3010h3.next();
                        Object field3 = KavaReflector.readField((ImageView) next3, "mListenerInfo");
                        Object field4 = field3 != null ? KavaReflector.readField(field3, "mOnClickListener") : null;
                        if ((field4 instanceof View.OnClickListener ? (View.OnClickListener) field4 : null) == onClickListener) {
                        }
                    } else {
                        next3 = null;
                    }
                }
                ImageView imageView = (ImageView) next3;
                if (imageView == null || (activityM10442c = C5752m.m10442c(imageView.getContext())) == null || !activityM10442c.getClass().getName().equals("com.tencent.mm.plugin.sns.ui.SnsUserUI")) {
                    return;
                }
                Intent intent = activityM10442c.getIntent();
                String string = (intent == null || (stringExtra = intent.getStringExtra("sns_userName")) == null) ? null : AbstractC3149m.m6703R0(stringExtra).toString();
                if (string == null) {
                    string = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                if (C5752m.m10444f(string)) {
                    if (!c5752m2.m10445b()) {
                        c5752m2.m10448h(imageView);
                        return;
                    }
                    Map map3 = c5752m2.f23421i;
                    map3.getClass();
                    synchronized (map3) {
                        C5747h c5747h = (C5747h) c5752m2.f23421i.get(imageView);
                        if (c5747h != null) {
                            c5747h.f23402a = new WeakReference(activityM10442c);
                            c5747h.f23403b = string;
                        } else {
                            Object field5 = KavaReflector.readField(imageView, "mListenerInfo");
                            Object field6 = field5 != null ? KavaReflector.readField(field5, "mOnLongClickListener") : null;
                            View.OnLongClickListener onLongClickListener = field6 instanceof View.OnLongClickListener ? (View.OnLongClickListener) field6 : null;
                            Map map4 = c5752m2.f23421i;
                            map4.getClass();
                            map4.put(imageView, new C5747h(new WeakReference(activityM10442c), string, onLongClickListener, imageView.isLongClickable()));
                            imageView.setOnLongClickListener(new View.OnLongClickListener() { // from class: xa.g
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // android.view.View.OnLongClickListener
                                public final boolean onLongClick(View view) {
                                    C5747h c5747h2;
                                    C5752m c5752m3 = c5752m2;
                                    Map map5 = c5752m3.f23421i;
                                    map5.getClass();
                                    synchronized (map5) {
                                        c5747h2 = (C5747h) c5752m3.f23421i.get(view);
                                    }
                                    if (c5747h2 == null) {
                                        return false;
                                    }
                                    if (c5752m3.m10445b()) {
                                        Activity activity2 = (Activity) c5747h2.f23402a.get();
                                        if (activity2 == null) {
                                            return false;
                                        }
                                        if (activity2.isFinishing() || activity2.isDestroyed()) {
                                            activity2 = null;
                                        }
                                        if (activity2 == null) {
                                            return false;
                                        }
                                        if (C5752m.m10444f(c5747h2.f23403b)) {
                                            c5752m3.f23416d.post(new RunnableC3737b(c5752m3, activity2, c5747h2, 12));
                                            return true;
                                        }
                                        View.OnLongClickListener onLongClickListener2 = c5747h2.f23404c;
                                        if (onLongClickListener2 == null || !onLongClickListener2.onLongClick(view)) {
                                            return false;
                                        }
                                    } else {
                                        view.getClass();
                                        View.OnLongClickListener onLongClickListenerM10448h = c5752m3.m10448h(view);
                                        if (onLongClickListenerM10448h == null || !onLongClickListenerM10448h.onLongClick(view)) {
                                            return false;
                                        }
                                    }
                                    return true;
                                }
                            });
                        }
                    }
                    return;
                }
                return;
            case 3:
                methodHookParam.getClass();
                C5752m c5752m3 = this.f23412b;
                if (c5752m3.m10445b()) {
                    Object[] objArr3 = methodHookParam.args;
                    Object objM8366C03 = objArr3 != null ? AbstractC4165l.m8366C0(0, objArr3) : null;
                    ContextMenu contextMenu2 = objM8366C03 instanceof ContextMenu ? (ContextMenu) objM8366C03 : null;
                    if (contextMenu2 != null) {
                        Object[] objArr4 = methodHookParam.args;
                        Object objM8366C04 = objArr4 != null ? AbstractC4165l.m8366C0(1, objArr4) : null;
                        View view = objM8366C04 instanceof View ? (View) objM8366C04 : null;
                        if (view == null || (activityM10442c2 = C5752m.m10442c(view.getContext())) == null) {
                            return;
                        }
                        Object obj5 = methodHookParam.thisObject;
                        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
                        setNewSetFromMap.getClass();
                        String strM10443d = C5752m.m10443d(0, obj5, setNewSetFromMap);
                        if (strM10443d == null || !C5752m.m10444f(strM10443d)) {
                            strM10443d = null;
                        }
                        if (strM10443d != null) {
                            contextMenu2.removeItem(1212371539);
                            c5752m3.f23419g.clear();
                            c5752m3.f23420h = null;
                            C5748i c5748i2 = new C5748i(activityM10442c2, strM10443d, true);
                            MenuItem menuItemAdd2 = contextMenu2.add(0, 1212371539, contextMenu2.size(), "设置备注和标签");
                            Map map5 = c5752m3.f23419g;
                            map5.getClass();
                            map5.put(menuItemAdd2, c5748i2);
                            c5752m3.f23420h = c5748i2;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        C5748i c5748i;
        switch (this.f23411a) {
            case 1:
                methodHookParam.getClass();
                C5752m c5752m = this.f23412b;
                if (c5752m.m10445b()) {
                    Object[] objArr = methodHookParam.args;
                    Object objM8366C0 = objArr != null ? AbstractC4165l.m8366C0(0, objArr) : null;
                    MenuItem menuItem = objM8366C0 instanceof MenuItem ? (MenuItem) objM8366C0 : null;
                    if (menuItem != null && menuItem.getItemId() == 1212371533 && (c5748i = (C5748i) c5752m.f23418f.remove(menuItem)) != null) {
                        methodHookParam.setResult((Object) null);
                        c5752m.f23416d.post(new RunnableC5743d(c5752m, c5748i, 0));
                        break;
                    }
                }
                break;
            default:
                super.beforeHookedMethod(methodHookParam);
                break;
        }
    }
}
