package p036c9;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import gg.AbstractC1416l;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import okhttp3.HttpUrl;
import org.json.JSONObject;
import p080fb.AbstractC1179u;
import p085fg.InterfaceC1231l;
import p099h.Hchat.utils.KavaReflector;
import p218og.C3145i;
import p218og.InterfaceC3142f;
import p230p8.C3356h;
import p230p8.C3363o;
import tf.C4173t;

/* JADX INFO: renamed from: c9.k1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0456k1 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1339g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f1340h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0456k1(Object obj, C3363o c3363o) {
        this.f1339g = 19;
        this.f1340h = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:105:0x00ab */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:40:0x00ab */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v23, types: [tf.t] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        ?? arrayList;
        int i9 = this.f1339g;
        ?? r2 = this.f1340h;
        switch (i9) {
            case 0:
                Field field = (Field) obj;
                field.getClass();
                return KavaReflector.readField(field, (Object) r2);
            case 1:
                String str = (String) obj;
                str.getClass();
                Object field2 = KavaReflector.readField((Object) r2, str);
                if (field2 != null) {
                    return field2.toString();
                }
                return null;
            case 2:
                Field field3 = (Field) obj;
                field3.getClass();
                Object field4 = KavaReflector.readField(field3, (Object) r2);
                if (field4 instanceof String) {
                    return (String) field4;
                }
                return null;
            case 3:
                Method method = (Method) obj;
                method.getClass();
                Object objInvoke = KavaReflector.invoke(method, r2, new Object[0]);
                if (objInvoke instanceof String) {
                    return (String) objInvoke;
                }
                return null;
            case 4:
                Field field5 = (Field) obj;
                field5.getClass();
                return KavaReflector.readField(field5, (Object) r2);
            case 5:
                Field field6 = (Field) obj;
                field6.getClass();
                Object field7 = KavaReflector.readField(field6, (Object) r2);
                if (field7 instanceof String) {
                    return (String) field7;
                }
                return null;
            case 6:
                Field field8 = (Field) obj;
                field8.getClass();
                Object field9 = KavaReflector.readField(field8, (Object) r2);
                if (field9 instanceof String) {
                    return (String) field9;
                }
                return null;
            case 7:
                String str2 = (String) obj;
                str2.getClass();
                Set set = AbstractC1179u.f3963a;
                return AbstractC1179u.m3146o0(((JSONObject) r2).opt(str2));
            case 8:
                InterfaceC3142f interfaceC3142f = (InterfaceC3142f) obj;
                interfaceC3142f.getClass();
                String str3 = (String) r2.get(((C3145i) interfaceC3142f).m6678c());
                return str3 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str3;
            case 9:
                Field field10 = (Field) obj;
                field10.getClass();
                return Boolean.valueOf(AbstractC1416l.m3825a(KavaReflector.readField(field10, (Object) r2), 10));
            case 10:
                Method method2 = (Method) obj;
                method2.getClass();
                return Boolean.valueOf(C3356h.m7099e(r2.getClass(), method2));
            case 11:
                Method method3 = (Method) obj;
                method3.getClass();
                return Boolean.valueOf(C3356h.m7095a(r2.getClass(), method3));
            case 12:
                Method method4 = (Method) obj;
                method4.getClass();
                return Boolean.valueOf(C3356h.m7096b(r2.getClass(), method4));
            case 13:
                Method method5 = (Method) obj;
                method5.getClass();
                return Boolean.valueOf(C3356h.m7097c(r2.getClass(), method5));
            case 14:
                Method method6 = (Method) obj;
                method6.getClass();
                return Boolean.valueOf(C3356h.m7096b(r2.getClass(), method6));
            case 15:
                Method method7 = (Method) obj;
                method7.getClass();
                return Boolean.valueOf(C3356h.m7095a(r2.getClass(), method7));
            case 16:
                Method method8 = (Method) obj;
                method8.getClass();
                return Boolean.valueOf(C3356h.m7099e(r2.getClass(), method8));
            case 17:
                Method method9 = (Method) obj;
                method9.getClass();
                return Boolean.valueOf(C3356h.m7095a(r2.getClass(), method9));
            case 18:
                Method method10 = (Method) obj;
                method10.getClass();
                return Boolean.valueOf(C3356h.m7097c(r2.getClass(), method10));
            case 19:
                Field field11 = (Field) obj;
                field11.getClass();
                Object field12 = KavaReflector.readField(field11, (Object) r2);
                Collection collection = field12 instanceof Collection ? (Collection) field12 : null;
                if (collection != null) {
                    arrayList = new ArrayList();
                    for (Object obj2 : collection) {
                        if (obj2 != null) {
                            arrayList.add(obj2);
                        }
                    }
                } else {
                    arrayList = 0;
                }
                if (arrayList == 0) {
                    arrayList = C4173t.f13710g;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (!C3363o.m7130n(it.next())) {
                            return null;
                        }
                    }
                }
                return arrayList;
            case 20:
                Field field13 = (Field) obj;
                field13.getClass();
                return Boolean.valueOf(AbstractC1416l.m3825a(field13.getType(), r2.getClass()));
            case 21:
                Field field14 = (Field) obj;
                field14.getClass();
                return KavaReflector.readField(field14, (Object) r2);
            case 22:
                ((Integer) obj).getClass();
                return r2;
            case 23:
                Field field15 = (Field) obj;
                field15.getClass();
                Object field16 = KavaReflector.readField(field15, (Object) r2);
                if (field16 instanceof View) {
                    return (View) field16;
                }
                return null;
            case 24:
                Field field17 = (Field) obj;
                field17.getClass();
                Object field18 = KavaReflector.readField(field17, (Object) r2);
                if (field18 instanceof Activity) {
                    return (Activity) field18;
                }
                return null;
            case 25:
                Field field19 = (Field) obj;
                field19.getClass();
                Object field20 = KavaReflector.readField(field19, (Object) r2);
                if (field20 instanceof String) {
                    return (String) field20;
                }
                return null;
            case 26:
                Field field21 = (Field) obj;
                field21.getClass();
                Object field22 = KavaReflector.readField(field21, (Object) r2);
                if (field22 instanceof ImageView) {
                    return (ImageView) field22;
                }
                return null;
            default:
                Field field23 = (Field) obj;
                field23.getClass();
                return KavaReflector.readField(field23, (Object) r2);
        }
    }

    public /* synthetic */ C0456k1(Object obj, int i9) {
        this.f1339g = i9;
        this.f1340h = obj;
    }

    public /* synthetic */ C0456k1(C3356h c3356h, Object obj, int i9) {
        this.f1339g = i9;
        this.f1340h = obj;
    }
}
