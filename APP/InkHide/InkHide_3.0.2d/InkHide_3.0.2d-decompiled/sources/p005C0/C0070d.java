package p005C0;

import android.app.Notification;
import android.content.Context;
import android.widget.EditText;
import com.p055lu.wxmask.bean.MaskItemBean;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import p001A0.C0021V;
import p001A0.C0026a;
import p009E0.AbstractC0105e;
import p009E0.C0104d;
import p009E0.C0106f;
import p009E0.C0109i;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0123k;
import p011F0.C0131s;
import p027N0.AbstractC0223g;
import p027N0.AbstractC0231o;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p040U0.C0297g;
import p052b1.AbstractC0503h;
import p054c0.AbstractC0509a;
import p070i0.AbstractC0731a;
import p084q0.C0801a;
import p084q0.C0808h;
import p086r0.C0822A1;
import p086r0.C0890c;
import p086r0.C0935r;
import p086r0.C0947v;
import p102z0.AbstractC1126i;
import p102z0.C1124g;
import p102z0.C1143z;

/* JADX INFO: renamed from: C0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0070d extends AbstractC0509a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f321a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f322b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0070d(int i2, Object obj) {
        this.f321a = i2;
        this.f322b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:26:0x005c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:90:0x0049 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v6, types: [F0.s] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Iterable] */
    @Override // p054c0.AbstractC0509a
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object c0104d;
        ?? r3;
        Object next;
        EditText editTextM1500e;
        Object c0104d2;
        switch (this.f321a) {
            case 0:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object result = methodHookParam.getResult();
                Map map = AbstractC0231o.m427c(result) ? (Map) result : null;
                if (map != null) {
                    CopyOnWriteArrayList<C0890c> copyOnWriteArrayList = C0071e.f324b;
                    Context context = (Context) this.f322b;
                    for (C0890c c0890c : copyOnWriteArrayList) {
                        try {
                            c0890c.m1808a(context, methodHookParam, map);
                            c0104d = C0109i.f404a;
                        } catch (Throwable th) {
                            c0104d = new C0104d(th);
                        }
                        Throwable thM246a = AbstractC0105e.m246a(c0104d);
                        if (thM246a != null) {
                            AbstractC0731a.m1387d("wechat xml listener fail", c0890c.getClass().getName(), thM246a);
                        }
                        break;
                    }
                    break;
                }
                break;
            case 1:
                AbstractC0223g.m418e(methodHookParam, "param");
                break;
            case 3:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj = methodHookParam.thisObject;
                C0822A1 c0822a1 = (C0822A1) this.f322b;
                c0822a1.getClass();
                if (obj != null) {
                    Class<?> superclass = obj.getClass();
                    ArrayList arrayList = new ArrayList();
                    while (true) {
                        r3 = C0131s.f426a;
                        if (superclass != null && !superclass.equals(Object.class)) {
                            try {
                                Field[] declaredFields = superclass.getDeclaredFields();
                                AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
                                c0104d2 = AbstractC0120h.m262j0(declaredFields);
                            } catch (Throwable th2) {
                                c0104d2 = new C0104d(th2);
                            }
                            if (!(c0104d2 instanceof C0104d)) {
                                r3 = c0104d2;
                            }
                            arrayList.addAll((Collection) r3);
                            superclass = superclass.getSuperclass();
                            break;
                        }
                    }
                    C0021V c0021v = c0822a1.f2741b;
                    EditText editText = null;
                    List list = c0021v != null ? c0021v.f162b : null;
                    if (list != null) {
                        r3 = list;
                    }
                    Iterator it = r3.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            String str = (String) it.next();
                            Iterator it2 = arrayList.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (AbstractC0223g.m414a(((Field) next).getName(), str)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            Field field = (Field) next;
                            if (field != null && (editTextM1500e = C0822A1.m1500e(obj, field)) != null) {
                                editText = editTextM1500e;
                            }
                        } else {
                            Iterator it3 = arrayList.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    Field field2 = (Field) it3.next();
                                    if (EditText.class.isAssignableFrom(field2.getType()) || AbstractC0299i.m511i0(field2.getType().getName(), "ActionBarEditText", false) || field2.getType().getName().endsWith("EditText")) {
                                        EditText editTextM1500e2 = C0822A1.m1500e(obj, field2);
                                        if (editTextM1500e2 != null) {
                                            editText = editTextM1500e2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (editText != null) {
                        Object tag = editText.getTag(1324862307);
                        Boolean bool = Boolean.TRUE;
                        if (!AbstractC0223g.m414a(tag, bool)) {
                            editText.addTextChangedListener(new C0947v(c0822a1, obj, editText));
                            editText.setTag(1324862307, bool);
                            AbstractC0731a.m1384a("search command watcher attached", obj.getClass().getName(), editText.getClass().getName());
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0167  */
    @Override // p054c0.AbstractC0509a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object obj;
        String maskId;
        Object next;
        Object next2;
        String string;
        String string2;
        String string3;
        Object obj2 = this.f322b;
        boolean z2 = false;
        boolean z3 = true;
        switch (this.f321a) {
            case 1:
                AbstractC0223g.m418e(methodHookParam, "param");
                C1143z.f3876a.m2534h(methodHookParam.thisObject);
                String string4 = methodHookParam.args[1].toString();
                C0808h c0808h = (C0808h) AbstractC0503h.m988u(C0808h.class);
                boolean z4 = AbstractC1126i.f3786a;
                if (C1124g.m2450z()) {
                    ArrayList arrayList = c0808h.f2684a;
                    if (!arrayList.isEmpty()) {
                        if (!((C0297g) ((C0106f) ((C0801a) obj2).f2669b).m247a()).m502a(string4) && !AbstractC0307q.m538h0(string4, false, "SELECT type, subtype, entity_id, aux_index, MAX(timestamp) as maxTime, count(aux_index) as msgCount, talker FROM FTS5MetaMessage") && !AbstractC0307q.m538h0(string4, false, "SELECT FTS5MetaMessage.docid, type, subtype, entity_id, aux_index, timestamp, talker FROM FTS5MetaMessage")) {
                            AbstractC0307q.m538h0(string4, true, "select * from ( select * from message where talker= ");
                            break;
                        } else {
                            ArrayList arrayListM266h0 = AbstractC0123k.m266h0(arrayList);
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj3 : arrayListM266h0) {
                                if (!AbstractC0307q.m534d0((String) obj3)) {
                                    arrayList2.add(obj3);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj4 : arrayList2) {
                                boolean z5 = AbstractC1126i.f3786a;
                                if (!C1124g.m2429e((String) obj4)) {
                                    arrayList3.add(obj4);
                                }
                            }
                            String strM271m0 = AbstractC0123k.m271m0(arrayList3, ",", null, null, new C0026a(28), 30);
                            if (!AbstractC0307q.m534d0(strM271m0)) {
                                if (AbstractC0307q.m532b0(string4, ";")) {
                                    string4 = AbstractC0299i.m513k0(string4);
                                }
                                String str = "SELECT * FROM (" + string4 + ") AS a WHERE aux_index NOT IN (" + strM271m0 + ");";
                                methodHookParam.args[1] = str;
                                AbstractC0731a.m1384a("sql hide hit:", str);
                                break;
                            }
                        }
                    }
                }
                break;
            case 2:
                AbstractC0223g.m418e(methodHookParam, "param");
                boolean z6 = AbstractC1126i.f3786a;
                if (C1124g.m2448x()) {
                    Object[] objArr = methodHookParam.args;
                    AbstractC0223g.m417d(objArr, "args");
                    int length = objArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            obj = objArr[i2];
                            if (!(obj instanceof Notification)) {
                                i2++;
                            }
                        } else {
                            obj = null;
                        }
                    }
                    Notification notification = obj instanceof Notification ? (Notification) obj : null;
                    if (notification != null) {
                        ((C0935r) obj2).getClass();
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        CharSequence charSequence = notification.tickerText;
                        if (charSequence != null && (string3 = charSequence.toString()) != null) {
                            linkedHashSet.add(string3);
                        }
                        C0935r.m2049a(notification.extras, linkedHashSet, 0);
                        C0935r.m2050b(notification.contentIntent, linkedHashSet);
                        C0935r.m2050b(notification.deleteIntent, linkedHashSet);
                        C0935r.m2050b(notification.fullScreenIntent, linkedHashSet);
                        Notification.Action[] actionArr = notification.actions;
                        if (actionArr != null) {
                            for (Notification.Action action : actionArr) {
                                CharSequence charSequence2 = action.title;
                                if (charSequence2 != null && (string2 = charSequence2.toString()) != null) {
                                    linkedHashSet.add(string2);
                                }
                                C0935r.m2050b(action.actionIntent, linkedHashSet);
                            }
                        }
                        Notification notification2 = notification.publicVersion;
                        if (notification2 != null) {
                            if (notification2 == notification) {
                                notification2 = null;
                            }
                            if (notification2 != null) {
                                CharSequence charSequence3 = notification2.tickerText;
                                if (charSequence3 != null && (string = charSequence3.toString()) != null) {
                                    linkedHashSet.add(string);
                                }
                                C0935r.m2049a(notification2.extras, linkedHashSet, 0);
                                C0935r.m2050b(notification2.contentIntent, linkedHashSet);
                            }
                        }
                        LinkedHashSet<String> linkedHashSet2 = new LinkedHashSet();
                        for (Object obj5 : linkedHashSet) {
                            if (!AbstractC0307q.m534d0((String) obj5)) {
                                linkedHashSet2.add(obj5);
                            }
                        }
                        if (linkedHashSet2.isEmpty()) {
                            maskId = null;
                        } else {
                            boolean z7 = AbstractC1126i.f3786a;
                            ArrayList arrayListM2433i = C1124g.m2433i();
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj6 : arrayListM2433i) {
                                if (!AbstractC0307q.m534d0(((MaskItemBean) obj6).getMaskId())) {
                                    arrayList4.add(obj6);
                                }
                            }
                            Iterator it = arrayList4.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next = it.next();
                                    MaskItemBean maskItemBean = (MaskItemBean) next;
                                    if (!linkedHashSet2.isEmpty()) {
                                        for (String str2 : linkedHashSet2) {
                                            String maskId2 = maskItemBean.getMaskId();
                                            int iM518p0 = AbstractC0299i.m518p0(str2, maskId2, z2 ? 1 : 0, z2, 6);
                                            while (iM518p0 >= 0) {
                                                int length2 = maskId2.length() + iM518p0;
                                                boolean z8 = z3;
                                                if (iM518p0 != 0) {
                                                    char cCharAt = str2.charAt(iM518p0 - 1);
                                                    boolean z9 = (Character.isLetterOrDigit(cCharAt) || cCharAt == '_' || cCharAt == '-') ? z2 ? 1 : 0 : z8;
                                                    if (length2 != str2.length()) {
                                                        char cCharAt2 = str2.charAt(length2);
                                                        boolean z10 = (Character.isLetterOrDigit(cCharAt2) || cCharAt2 == '_' || cCharAt2 == '-') ? false : z8;
                                                        if (!z9 || !z10) {
                                                            iM518p0 = AbstractC0299i.m518p0(str2, maskId2, iM518p0 + 1, false, 4);
                                                            z2 = false;
                                                            z3 = z8;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    z3 = z3;
                                    z2 = false;
                                } else {
                                    next = null;
                                }
                            }
                            MaskItemBean maskItemBean2 = (MaskItemBean) next;
                            if (maskItemBean2 != null) {
                                maskId = maskItemBean2.getMaskId();
                            } else {
                                Iterator it2 = arrayList4.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        next2 = it2.next();
                                        String string5 = AbstractC0299i.m507C0(((MaskItemBean) next2).getTagName()).toString();
                                        if (string5.length() > 0 && !linkedHashSet2.isEmpty()) {
                                            Iterator it3 = linkedHashSet2.iterator();
                                            while (it3.hasNext()) {
                                                String string6 = AbstractC0299i.m507C0((String) it3.next()).toString();
                                                if (AbstractC0223g.m414a(string6, string5) || AbstractC0307q.m538h0(string6, false, string5.concat(":")) || AbstractC0307q.m538h0(string6, false, string5.concat("：")) || AbstractC0307q.m538h0(string6, false, string5.concat(" "))) {
                                                }
                                            }
                                        }
                                    } else {
                                        next2 = null;
                                    }
                                }
                                MaskItemBean maskItemBean3 = (MaskItemBean) next2;
                                if (maskItemBean3 != null) {
                                    maskId = maskItemBean3.getMaskId();
                                }
                            }
                        }
                        if (maskId != null) {
                            boolean z11 = AbstractC1126i.f3786a;
                            if (!C1124g.m2429e(maskId)) {
                                AbstractC0731a.m1384a("hide close friend push notification", maskId);
                                methodHookParam.setResult((Object) null);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
