package p001A0;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p006D.AbstractC0079h;
import p009E0.C0104d;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0123k;
import p011F0.AbstractC0124l;
import p011F0.AbstractC0125m;
import p011F0.C0131s;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: A0.Y */
/* JADX INFO: loaded from: classes.dex */
public final class C0024Y {

    /* JADX INFO: renamed from: a */
    public static final List f183a = AbstractC0124l.m286Z("com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");

    /* JADX INFO: renamed from: b */
    public static final List f184b = AbstractC0124l.m286Z("com.tencent.mm.plugin.sns.ui.SnsUserUI", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");

    /* JADX INFO: renamed from: c */
    public static final List f185c = AbstractC0079h.m167E("com.tencent.mm.plugin.sns.ui.jo");

    /* JADX INFO: renamed from: d */
    public static final List f186d = AbstractC0124l.m286Z("field_userName", "field_username", "Username", "UserName", "userName", "username");

    /* JADX INFO: renamed from: e */
    public static final List f187e = AbstractC0124l.m286Z("field_snsId", "snsId");

    /* JADX INFO: renamed from: f */
    public static final List f188f = AbstractC0124l.m286Z("localid", "field_localid", "localId");

    /* JADX INFO: renamed from: g */
    public static final List f189g = AbstractC0124l.m286Z("UserName", "Username", "userName", "username");

    /* JADX INFO: renamed from: h */
    public static final List f190h = AbstractC0079h.m167E("ExtFlag");

    /* JADX INFO: renamed from: i */
    public static final List f191i = AbstractC0079h.m167E("LikeUserList");

    /* JADX INFO: renamed from: j */
    public static final List f192j = AbstractC0079h.m167E("LikeCount");

    /* JADX INFO: renamed from: k */
    public static final List f193k = AbstractC0079h.m167E("LikeUserListCount");

    /* JADX INFO: renamed from: l */
    public static final List f194l = AbstractC0079h.m167E("CommentUserList");

    /* JADX INFO: renamed from: m */
    public static final List f195m = AbstractC0079h.m167E("CommentCount");

    /* JADX INFO: renamed from: n */
    public static final List f196n = AbstractC0079h.m167E("CommentUserListCount");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static ArrayList m1a(Class cls) {
        Object c0104d;
        ArrayList arrayList = new ArrayList();
        while (cls != null && !cls.equals(Object.class)) {
            try {
                Field[] declaredFields = cls.getDeclaredFields();
                AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
                c0104d = AbstractC0120h.m262j0(declaredFields);
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            Object obj = C0131s.f426a;
            if (c0104d instanceof C0104d) {
                c0104d = obj;
            }
            arrayList.addAll((Collection) c0104d);
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static ArrayList m2b(Class cls) {
        Object c0104d;
        ArrayList arrayList = new ArrayList();
        while (cls != null && !cls.equals(Object.class)) {
            try {
                Method[] declaredMethods = cls.getDeclaredMethods();
                AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
                c0104d = AbstractC0120h.m262j0(declaredMethods);
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            Object obj = C0131s.f426a;
            if (c0104d instanceof C0104d) {
                c0104d = obj;
            }
            arrayList.addAll((Collection) c0104d);
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static List m3c(Class cls, List list) {
        if (cls == null) {
            return list;
        }
        ArrayList arrayListM1a = m1a(cls);
        ArrayList arrayList = new ArrayList(AbstractC0125m.m289c0(arrayListM1a));
        Iterator it = arrayListM1a.iterator();
        while (it.hasNext()) {
            arrayList.add(((Field) it.next()).getName());
        }
        Set setM265B0 = AbstractC0123k.m265B0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (setM265B0.contains((String) obj)) {
                arrayList2.add(obj);
            }
        }
        return AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m273o0(arrayList2, list)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static Class m4d(ClassLoader classLoader, String str) {
        Object c0104d;
        try {
            c0104d = Class.forName(str, false, classLoader);
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        if (c0104d instanceof C0104d) {
            c0104d = null;
        }
        return (Class) c0104d;
    }
}
