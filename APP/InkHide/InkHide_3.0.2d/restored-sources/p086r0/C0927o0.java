package p086r0;

import android.widget.BaseAdapter;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import p009E0.C0103c;
import p009E0.C0104d;
import p009E0.C0109i;
import p011F0.AbstractC0120h;
import p011F0.C0131s;
import p025M0.InterfaceC0193a;
import p025M0.InterfaceC0204l;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p054c0.AbstractC0514f;

/* JADX INFO: renamed from: r0.o0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0927o0 implements InterfaceC0193a, InterfaceC0204l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3302a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0842H0 f3303b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f3304c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0927o0(C0842H0 c0842h0, Object obj, int i2) {
        this.f3302a = i2;
        this.f3303b = c0842h0;
        this.f3304c = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025M0.InterfaceC0193a
    /* JADX INFO: renamed from: b */
    public Object mo7b() {
        switch (this.f3302a) {
            case 0:
                C0842H0 c0842h0 = this.f3303b;
                WeakReference weakReference = c0842h0.f2862g;
                BaseAdapter baseAdapter = weakReference != null ? (BaseAdapter) weakReference.get() : null;
                Object obj = this.f3304c;
                if (baseAdapter != null) {
                    baseAdapter.notifyDataSetInvalidated();
                } else if (obj instanceof BaseAdapter) {
                    ((BaseAdapter) obj).notifyDataSetInvalidated();
                } else if (obj instanceof HeaderViewListAdapter) {
                    ListAdapter wrappedAdapter = ((HeaderViewListAdapter) obj).getWrappedAdapter();
                    BaseAdapter baseAdapter2 = wrappedAdapter instanceof BaseAdapter ? (BaseAdapter) wrappedAdapter : null;
                    if (baseAdapter2 != null) {
                        baseAdapter2.notifyDataSetInvalidated();
                    }
                } else {
                    try {
                        AbstractC0514f.f1622b.mo1012c(obj, "notifyDataSetInvalidated", new Object[0]);
                        break;
                    } catch (Throwable unused) {
                    }
                }
                c0842h0.m1679h1(obj);
                break;
            case 1:
                this.f3303b.m1677g1(this.f3304c);
                break;
            case 2:
                this.f3303b.m1677g1(this.f3304c);
                break;
            case 3:
                this.f3303b.m1677g1(this.f3304c);
                break;
            case 4:
                this.f3303b.m1677g1(this.f3304c);
                break;
            default:
                this.f3303b.m1677g1(this.f3304c);
                break;
        }
        return C0109i.f404a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c A[Catch: all -> 0x00cf, TryCatch #1 {all -> 0x00cf, blocks: (B:31:0x008f, B:33:0x009c, B:35:0x00aa, B:37:0x00b1, B:39:0x00bf, B:46:0x00d5, B:44:0x00d1), top: B:135:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0161  */
    @Override // p025M0.InterfaceC0204l
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8c(Object obj) {
        Object c0104d;
        int i2;
        boolean z2;
        boolean z3;
        Object c0104d2;
        Character chValueOf;
        Character chM514l0;
        int length;
        int i3;
        boolean z4;
        Method method = (Method) obj;
        AbstractC0223g.m415b(method);
        this.f3303b.getClass();
        Class<?> cls = this.f3304c.getClass();
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
            c0104d = AbstractC0120h.m262j0(declaredFields);
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        Object obj2 = C0131s.f426a;
        if (c0104d instanceof C0104d) {
            c0104d = obj2;
        }
        List<Field> list = (List) c0104d;
        if (BaseAdapter.class.isAssignableFrom(cls)) {
            if (list.isEmpty()) {
                z2 = false;
                if (list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (ListView.class.isAssignableFrom(((Field) it.next()).getType())) {
                            z3 = true;
                            break;
                        }
                    }
                    z3 = false;
                    Method[] methods = cls.getMethods();
                    AbstractC0223g.m417d(methods, "getMethods(...)");
                    length = methods.length;
                    i3 = 0;
                    while (true) {
                        if (i3 < length) {
                        }
                        i3++;
                    }
                    c0104d2 = Boolean.valueOf(z4);
                    Object obj3 = Boolean.FALSE;
                    if (c0104d2 instanceof C0104d) {
                    }
                    boolean zBooleanValue = ((Boolean) c0104d2).booleanValue();
                    if (z2) {
                        i2 = 0;
                    }
                } else {
                    z3 = false;
                    try {
                        Method[] methods2 = cls.getMethods();
                        AbstractC0223g.m417d(methods2, "getMethods(...)");
                        length = methods2.length;
                        i3 = 0;
                        while (true) {
                            if (i3 < length) {
                                z4 = false;
                                break;
                            }
                            Method method2 = methods2[i3];
                            if (AbstractC0223g.m414a(method2.getName(), "getItem") && method2.getParameterTypes().length == 1 && AbstractC0223g.m414a(method2.getParameterTypes()[0], Integer.TYPE) && AbstractC0307q.m538h0(method2.getReturnType().getName(), false, "com.tencent.mm.storage.")) {
                                z4 = true;
                                break;
                            }
                            i3++;
                        }
                        c0104d2 = Boolean.valueOf(z4);
                    } catch (Throwable th2) {
                        c0104d2 = new C0104d(th2);
                    }
                    Object obj32 = Boolean.FALSE;
                    if (c0104d2 instanceof C0104d) {
                        c0104d2 = obj32;
                    }
                    boolean zBooleanValue2 = ((Boolean) c0104d2).booleanValue();
                    if (z2 || !z3 || !zBooleanValue2) {
                        i2 = 0;
                    } else if (method.getName().length() <= 3) {
                        String name = method.getName();
                        AbstractC0223g.m417d(name, "getName(...)");
                        for (int i4 = 0; i4 < name.length(); i4++) {
                            if (Character.isDigit(name.charAt(i4))) {
                                i2 = 5;
                                break;
                            }
                        }
                        i2 = 3;
                        String name2 = method.getName();
                        AbstractC0223g.m417d(name2, "getName(...)");
                        chValueOf = name2.length() != 0 ? null : Character.valueOf(name2.charAt(name2.length() - 1));
                        if (chValueOf != null && chValueOf.charValue() == '2') {
                            i2 += 2;
                        }
                        String name3 = method.getName();
                        AbstractC0223g.m417d(name3, "getName(...)");
                        chM514l0 = AbstractC0299i.m514l0(name3);
                        if (chM514l0 != null && Character.isLowerCase(chM514l0.charValue())) {
                            i2++;
                        }
                    } else {
                        i2 = 3;
                        String name22 = method.getName();
                        AbstractC0223g.m417d(name22, "getName(...)");
                        if (name22.length() != 0) {
                        }
                        if (chValueOf != null) {
                            i2 += 2;
                        }
                        String name32 = method.getName();
                        AbstractC0223g.m417d(name32, "getName(...)");
                        chM514l0 = AbstractC0299i.m514l0(name32);
                        if (chM514l0 != null) {
                            i2++;
                        }
                    }
                }
            } else {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (AbstractC0299i.m511i0(((Field) it2.next()).getType().getName(), "MvvmList", false)) {
                        z2 = true;
                        break;
                    }
                }
                z2 = false;
                if (list.isEmpty()) {
                }
            }
        }
        if (!list.isEmpty()) {
            for (Field field : list) {
                if (AbstractC0299i.m511i0(field.getType().getName(), "LifecycleScope", false) || AbstractC0299i.m511i0(field.getType().getName(), "Coroutine", false)) {
                    i2 += 2;
                    break;
                }
            }
        }
        if (!list.isEmpty()) {
            for (Field field2 : list) {
                if (AbstractC0299i.m511i0(field2.getType().getName(), "MvvmList", false) || List.class.isAssignableFrom(field2.getType())) {
                    i2++;
                    break;
                }
            }
        }
        if (!list.isEmpty()) {
            Iterator it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (AbstractC0307q.m538h0(((Field) it3.next()).getType().getName(), false, "com.tencent.mm.storage.")) {
                    i2++;
                    break;
                }
            }
        }
        if (!list.isEmpty()) {
            for (Field field3 : list) {
                if (AbstractC0307q.m538h0(field3.getType().getName(), false, "z15.") || AbstractC0307q.m538h0(field3.getType().getName(), false, "com.tencent.mm.ui.conversation")) {
                    i2++;
                    break;
                }
            }
        }
        if (AbstractC0307q.m538h0(cls.getName(), false, "z15.") || AbstractC0307q.m538h0(cls.getName(), false, "com.tencent.mm.ui.conversation")) {
            i2++;
        }
        if (method.getName().length() <= 3) {
            i2++;
        }
        return new C0103c(method, Integer.valueOf(i2));
    }
}
