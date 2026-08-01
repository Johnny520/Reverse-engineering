package p001A0;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import com.p055lu.wxmask.config.AppConfigUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.luckypray.dexkit.DexKitBridge;
import p006D.AbstractC0079h;
import p007D0.AbstractC0096d;
import p007D0.C0095c;
import p009E0.AbstractC0105e;
import p009E0.C0103c;
import p009E0.C0104d;
import p009E0.C0109i;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0123k;
import p011F0.AbstractC0124l;
import p011F0.AbstractC0125m;
import p011F0.AbstractC0129q;
import p011F0.C0131s;
import p021K0.C0169h;
import p022L.AbstractC0174d;
import p025M0.InterfaceC0193a;
import p025M0.InterfaceC0204l;
import p027N0.AbstractC0223g;
import p038T0.AbstractC0284i;
import p038T0.C0281f;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p040U0.C0297g;
import p043W0.C0353a;
import p047Z0.C0361a;
import p047Z0.C0362b;
import p047Z0.C0363c;
import p050a1.C0368a;
import p052b1.AbstractC0503h;
import p052b1.C0499d;
import p052b1.C0500e;
import p052b1.C0501f;
import p052b1.C0502g;
import p052b1.C0505j;
import p052b1.C0506k;
import p052b1.C0507l;
import p070i0.AbstractC0731a;
import p102z0.AbstractC1135r;
import p102z0.C1127j;
import p102z0.C1128k;

/* JADX INFO: renamed from: A0.h */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0035h implements InterfaceC0204l, InterfaceC0193a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f231a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f232b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0035h(Context context) {
        this.f231a = 7;
        List list = C0024Y.f183a;
        this.f232b = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04e5 A[PHI: r4
  0x04e5: PHI (r4v116 boolean) = (r4v85 boolean), (r4v86 boolean) binds: [B:197:0x04e3, B:584:0x04e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0566 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x05b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0244 A[PHI: r1
  0x0244: PHI (r1v64 boolean) = (r1v55 boolean), (r1v56 boolean) binds: [B:92:0x0242, B:547:0x0244] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0248  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object m51a(Object obj) {
        Class<String> cls;
        Class<List> cls2;
        Class cls3;
        String str;
        String str2;
        Class cls4;
        Object next;
        Class<List> cls5;
        Object next2;
        Object next3;
        String name;
        boolean z2;
        Object next4;
        boolean z3;
        Object next5;
        String name2;
        Object next6;
        C0037j c0037j;
        String name3;
        Class<String> cls6;
        Class<String> cls7;
        Class<List> cls8;
        List listM43s;
        C0103c c0103c;
        Iterator it;
        String str3;
        String str4;
        Iterator it2;
        boolean z4;
        ArrayList arrayListM38n;
        boolean z5;
        boolean z6;
        ArrayList arrayListM33i;
        ArrayList arrayListM38n2;
        Iterator it3;
        ArrayList<Method> arrayList;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        DexKitBridge dexKitBridge = (DexKitBridge) obj;
        AbstractC0223g.m418e(dexKitBridge, "bridge");
        ClassLoader classLoader = this.f232b.getClassLoader();
        AbstractC0223g.m417d(classLoader, "getClassLoader(...)");
        List listM252Z = AbstractC0120h.m252Z(new String[]{"com.tencent.mm.storage.e4", "com.tencent.mm.storage.l4"});
        ArrayList arrayList2 = new ArrayList();
        Iterator it4 = listM252Z.iterator();
        while (it4.hasNext()) {
            Class clsM17H = C0034g.m17H(classLoader, (String) it4.next());
            if (clsM17H != null) {
                arrayList2.add(clsM17H);
            }
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        List listM277s0 = arrayList2;
        if (zIsEmpty) {
            ArrayList arrayListM43s = C0034g.m43s(dexKitBridge, classLoader, AbstractC0079h.m167E("storage"));
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayListM43s) {
                Class cls9 = (Class) obj2;
                if (AbstractC0307q.m538h0(cls9.getName(), false, "com.tencent.mm.storage.")) {
                    ArrayList<Field> arrayListM33i2 = C0034g.m33i(cls9);
                    if (!arrayListM33i2.isEmpty()) {
                        for (Field field : arrayListM33i2) {
                            if (AbstractC0223g.m414a(field.getName(), "field_username") || AbstractC0223g.m414a(field.getName(), "field_conversationTime") || AbstractC0223g.m414a(field.getName(), "field_digest")) {
                                arrayList3.add(obj2);
                                break;
                            }
                        }
                    }
                }
            }
            listM277s0 = AbstractC0123k.m277s0(arrayList3, 4);
        }
        List list = listM277s0;
        if (list.isEmpty()) {
            C0034g.m41q("conversation dexkit unresolved storage empty");
            z2 = false;
            z3 = true;
            c0037j = null;
        } else {
            ArrayList arrayListM43s2 = C0034g.m43s(dexKitBridge, classLoader, AbstractC0120h.m252Z(new String[]{"conversation", "rconversation", "storage", "unRead", "digest", "session", "chat"}));
            ArrayList arrayList4 = new ArrayList();
            Iterator it5 = list.iterator();
            while (it5.hasNext()) {
                AbstractC0129q.m291e0(C0034g.m46v((Class) it5.next(), classLoader), arrayList4);
            }
            ArrayList arrayListM273o0 = AbstractC0123k.m273o0(AbstractC0123k.m273o0(arrayList4, C0034g.m48x(classLoader)), arrayListM43s2);
            ArrayList arrayList5 = new ArrayList();
            Iterator it6 = arrayListM273o0.iterator();
            while (true) {
                boolean zHasNext = it6.hasNext();
                cls = String.class;
                cls2 = List.class;
                cls3 = Integer.TYPE;
                str = "scanner";
                str2 = "finder";
                if (!zHasNext) {
                    break;
                }
                Object next7 = it6.next();
                Class cls10 = (Class) next7;
                if (C0034g.m13D(cls10.getName())) {
                    it3 = it6;
                    if (!AbstractC0307q.m538h0(cls10.getName(), false, "com.tencent.mm.storage.") && !AbstractC0299i.m511i0(cls10.getName(), "finder", true) && !AbstractC0299i.m511i0(cls10.getName(), "game", true) && !AbstractC0299i.m511i0(cls10.getName(), "scanner", true)) {
                        ArrayList arrayList6 = new ArrayList(AbstractC0125m.m289c0(list));
                        Iterator it7 = list.iterator();
                        while (it7.hasNext()) {
                            arrayList6.add(((Class) it7.next()).getName());
                        }
                        Set setM265B0 = AbstractC0123k.m265B0(arrayList6);
                        ArrayList<Method> arrayListM38n3 = C0034g.m38n(cls10);
                        ArrayList arrayListM33i3 = C0034g.m33i(cls10);
                        if (arrayListM33i3.isEmpty()) {
                            if (!arrayListM38n3.isEmpty()) {
                                for (Method method : arrayListM38n3) {
                                    arrayList = arrayListM38n3;
                                    if (!setM265B0.contains(method.getReturnType().getName())) {
                                        Class<?>[] parameterTypes = method.getParameterTypes();
                                        AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                                        int length = parameterTypes.length;
                                        int i2 = 0;
                                        while (i2 < length) {
                                            int i3 = i2;
                                            if (!setM265B0.contains(parameterTypes[i2].getName())) {
                                                i2 = i3 + 1;
                                            }
                                        }
                                        arrayListM38n3 = arrayList;
                                    }
                                    z7 = true;
                                }
                            }
                            arrayList = arrayListM38n3;
                            z7 = false;
                            if (arrayList.isEmpty()) {
                                for (Method method2 : arrayList) {
                                    Class<?>[] parameterTypes2 = method2.getParameterTypes();
                                    AbstractC0223g.m417d(parameterTypes2, "getParameterTypes(...)");
                                    if (parameterTypes2.length == 0 && cls2.isAssignableFrom(method2.getReturnType())) {
                                        z8 = true;
                                        break;
                                    }
                                }
                                z8 = false;
                                if (arrayList.isEmpty()) {
                                }
                            } else {
                                z8 = false;
                                if (arrayList.isEmpty()) {
                                    for (Method method3 : arrayList) {
                                        z9 = z7;
                                        if (method3.getParameterTypes().length == 1 && cls2.isAssignableFrom(method3.getParameterTypes()[0])) {
                                            z10 = true;
                                            break;
                                        }
                                        z7 = z9;
                                    }
                                    z9 = z7;
                                    z10 = false;
                                    boolean zIsEmpty2 = C0034g.m47w(cls10, list).isEmpty();
                                    if (arrayList.isEmpty()) {
                                    }
                                } else {
                                    z9 = z7;
                                    z10 = false;
                                    boolean zIsEmpty22 = C0034g.m47w(cls10, list).isEmpty();
                                    if (arrayList.isEmpty()) {
                                        for (Method method4 : arrayList) {
                                            if (method4.getParameterTypes().length == 2 && AbstractC0223g.m414a(method4.getParameterTypes()[0], cls3) && AbstractC0223g.m414a(method4.getParameterTypes()[1], cls)) {
                                                z11 = true;
                                                break;
                                            }
                                        }
                                        z11 = false;
                                        if (arrayListM33i3.isEmpty()) {
                                        }
                                    } else {
                                        z11 = false;
                                        if (arrayListM33i3.isEmpty()) {
                                            Iterator it8 = arrayListM33i3.iterator();
                                            while (it8.hasNext()) {
                                                if (Map.class.isAssignableFrom(((Field) it8.next()).getType())) {
                                                    z12 = true;
                                                    break;
                                                }
                                            }
                                            z12 = false;
                                            if (!z9) {
                                            }
                                        } else {
                                            z12 = false;
                                            if (!z9 && ((z8 || z12) && (z10 || !zIsEmpty22 || z11))) {
                                                arrayList5.add(next7);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            Iterator it9 = arrayListM33i3.iterator();
                            while (it9.hasNext()) {
                                if (setM265B0.contains(((Field) it9.next()).getType().getName())) {
                                    arrayList = arrayListM38n3;
                                    break;
                                }
                            }
                            if (!arrayListM38n3.isEmpty()) {
                            }
                            arrayList = arrayListM38n3;
                            z7 = false;
                            if (arrayList.isEmpty()) {
                            }
                        }
                    }
                } else {
                    it3 = it6;
                }
                it6 = it3;
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList7 = new ArrayList();
            for (Object obj3 : arrayList5) {
                if (hashSet.add(((Class) obj3).getName())) {
                    arrayList7.add(obj3);
                }
            }
            List listM277s02 = AbstractC0123k.m277s0(arrayList7, 48);
            C0034g.m41q("conversation dexkit datasource candidates ".concat(AbstractC0123k.m271m0(AbstractC0123k.m277s0(listM277s02, 12), ",", null, null, new C0026a(14), 30)));
            if (listM277s02.isEmpty()) {
                C0034g.m41q("conversation dexkit unresolved dataSource candidate empty storage=".concat(AbstractC0123k.m271m0(list, ",", null, null, new C0026a(7), 30)));
            } else {
                ArrayList arrayList8 = new ArrayList();
                Iterator it10 = listM277s02.iterator();
                while (true) {
                    boolean zHasNext2 = it10.hasNext();
                    cls4 = Void.TYPE;
                    Iterator it11 = it10;
                    if (!zHasNext2) {
                        break;
                    }
                    Class cls11 = (Class) it11.next();
                    if (C0034g.m14E(cls11.getName())) {
                        cls7 = cls;
                        listM43s = C0034g.m48x(classLoader);
                        cls8 = cls2;
                    } else {
                        cls7 = cls;
                        cls8 = cls2;
                        listM43s = C0034g.m43s(dexKitBridge, classLoader, AbstractC0120h.m252Z(new String[]{cls11.getSimpleName(), AbstractC0299i.m525w0(cls11.getName())}));
                    }
                    ArrayList arrayListM273o02 = AbstractC0123k.m273o0(C0034g.m46v(cls11, classLoader), listM43s);
                    HashSet hashSet2 = new HashSet();
                    DexKitBridge dexKitBridge2 = dexKitBridge;
                    ArrayList arrayList9 = new ArrayList();
                    Iterator it12 = arrayListM273o02.iterator();
                    while (it12.hasNext()) {
                        ClassLoader classLoader2 = classLoader;
                        Object next8 = it12.next();
                        Iterator it13 = it12;
                        if (hashSet2.add(((Class) next8).getName())) {
                            arrayList9.add(next8);
                        }
                        classLoader = classLoader2;
                        it12 = it13;
                    }
                    ClassLoader classLoader3 = classLoader;
                    ArrayList arrayList10 = new ArrayList();
                    Iterator it14 = arrayList9.iterator();
                    while (it14.hasNext()) {
                        Object next9 = it14.next();
                        Class cls12 = (Class) next9;
                        if (C0034g.m13D(cls12.getName())) {
                            it = it14;
                            if (!AbstractC0299i.m511i0(cls12.getName(), str2, true) && !AbstractC0299i.m511i0(cls12.getName(), "game", true) && !AbstractC0299i.m511i0(cls12.getName(), str, true)) {
                                ArrayList arrayListM38n4 = C0034g.m38n(cls12);
                                if (arrayListM38n4.isEmpty()) {
                                    str3 = str2;
                                    str4 = str;
                                    z4 = false;
                                    arrayListM38n = C0034g.m38n(cls12);
                                    if (arrayListM38n.isEmpty()) {
                                        Iterator it15 = arrayListM38n.iterator();
                                        while (it15.hasNext()) {
                                            Method method5 = (Method) it15.next();
                                            z5 = z4;
                                            Iterator it16 = it15;
                                            if (AbstractC0223g.m414a(method5.getName(), "getView") && method5.getReturnType().getName().equals("android.view.View") && method5.getParameterTypes().length == 3 && AbstractC0223g.m414a(method5.getParameterTypes()[0], cls3)) {
                                                ArrayList<Method> arrayListM38n5 = C0034g.m38n(cls12);
                                                if (arrayListM38n5.isEmpty()) {
                                                    z6 = false;
                                                    if (!z5) {
                                                        arrayListM33i = C0034g.m33i(cls12);
                                                        if (arrayListM33i.isEmpty()) {
                                                        }
                                                    }
                                                } else {
                                                    for (Method method6 : arrayListM38n5) {
                                                        if (AbstractC0223g.m414a(method6.getName(), "getItem") && method6.getParameterTypes().length == 1) {
                                                            z6 = true;
                                                            break;
                                                        }
                                                    }
                                                    z6 = false;
                                                    if (!z5) {
                                                    }
                                                }
                                            } else {
                                                z4 = z5;
                                                it15 = it16;
                                            }
                                        }
                                        z5 = z4;
                                        z6 = false;
                                        if (!z5) {
                                        }
                                    } else {
                                        z5 = z4;
                                        z6 = false;
                                        if (!z5 || z6) {
                                            arrayListM33i = C0034g.m33i(cls12);
                                            if (arrayListM33i.isEmpty()) {
                                                Iterator it17 = arrayListM33i.iterator();
                                                while (it17.hasNext()) {
                                                    if (AbstractC0223g.m414a(((Field) it17.next()).getType(), cls11)) {
                                                        break;
                                                    }
                                                }
                                                arrayListM38n2 = C0034g.m38n(cls12);
                                                if (arrayListM38n2.isEmpty()) {
                                                }
                                            } else {
                                                arrayListM38n2 = C0034g.m38n(cls12);
                                                if (arrayListM38n2.isEmpty()) {
                                                    Iterator it18 = arrayListM38n2.iterator();
                                                    while (it18.hasNext()) {
                                                        if (AbstractC0223g.m414a(((Method) it18.next()).getReturnType(), cls11)) {
                                                            arrayList10.add(next9);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    Iterator it19 = arrayListM38n4.iterator();
                                    while (it19.hasNext()) {
                                        Method method7 = (Method) it19.next();
                                        str3 = str2;
                                        if (AbstractC0223g.m414a(method7.getReturnType(), cls4)) {
                                            it2 = it19;
                                            if (method7.getParameterTypes().length >= 2) {
                                                Class<?>[] parameterTypes3 = method7.getParameterTypes();
                                                AbstractC0223g.m417d(parameterTypes3, "getParameterTypes(...)");
                                                int length2 = parameterTypes3.length;
                                                int i4 = 0;
                                                while (i4 < length2) {
                                                    Class<?> cls13 = parameterTypes3[i4];
                                                    int i5 = i4;
                                                    if (!cls13.getName().equals("android.view.View")) {
                                                        int i6 = length2;
                                                        if (!AbstractC0299i.m511i0(cls13.getName(), "ViewHolder", false)) {
                                                            str4 = str;
                                                            if (AbstractC0307q.m538h0(cls13.getName(), false, "androidx.recyclerview") || AbstractC0307q.m538h0(cls13.getName(), false, "android.support.v7.widget.RecyclerView")) {
                                                                z4 = true;
                                                                break;
                                                            }
                                                            i4 = i5 + 1;
                                                            length2 = i6;
                                                            str = str4;
                                                        }
                                                    }
                                                    str4 = str;
                                                    z4 = true;
                                                    break;
                                                }
                                            }
                                        } else {
                                            it2 = it19;
                                        }
                                        str2 = str3;
                                        it19 = it2;
                                        str = str;
                                    }
                                    str3 = str2;
                                    str4 = str;
                                    z4 = false;
                                    arrayListM38n = C0034g.m38n(cls12);
                                    if (arrayListM38n.isEmpty()) {
                                    }
                                }
                            }
                            it14 = it;
                            str2 = str3;
                            str = str4;
                        } else {
                            it = it14;
                        }
                        str3 = str2;
                        str4 = str;
                        it14 = it;
                        str2 = str3;
                        str = str4;
                    }
                    String str5 = str2;
                    String str6 = str;
                    C0034g.m41q("conversation dexkit adapter candidates for " + cls11.getName() + " " + AbstractC0123k.m271m0(AbstractC0123k.m277s0(arrayList10, 8), ",", null, null, new C0026a(15), 30));
                    Class cls14 = (Class) AbstractC0123k.m268j0(arrayList10);
                    if (cls14 != null) {
                        C0034g.m41q("conversation dexkit pair adapter=" + cls14.getName() + " dataSource=" + cls11.getName());
                        c0103c = new C0103c(cls14, cls11);
                    } else {
                        c0103c = null;
                    }
                    if (c0103c != null) {
                        arrayList8.add(c0103c);
                    }
                    it10 = it11;
                    cls = cls7;
                    dexKitBridge = dexKitBridge2;
                    cls2 = cls8;
                    classLoader = classLoader3;
                    str2 = str5;
                    str = str6;
                }
                Class<String> cls15 = cls;
                Class<List> cls16 = cls2;
                if (arrayList8.isEmpty()) {
                    C0034g.m41q("conversation dexkit unresolved adapter empty dataSourceCandidates=".concat(AbstractC0123k.m271m0(AbstractC0123k.m277s0(listM277s02, 12), ",", null, null, new C0026a(8), 30)));
                } else {
                    ArrayList arrayList11 = new ArrayList(AbstractC0125m.m289c0(arrayList8));
                    Iterator it20 = arrayList8.iterator();
                    while (it20.hasNext()) {
                        arrayList11.add((Class) ((C0103c) it20.next()).f394a);
                    }
                    HashSet hashSet3 = new HashSet();
                    ArrayList arrayList12 = new ArrayList();
                    for (Object obj4 : arrayList11) {
                        if (hashSet3.add(((Class) obj4).getName())) {
                            arrayList12.add(obj4);
                        }
                    }
                    List<Class> listM277s03 = AbstractC0123k.m277s0(arrayList12, 8);
                    ArrayList arrayList13 = new ArrayList(AbstractC0125m.m289c0(arrayList8));
                    Iterator it21 = arrayList8.iterator();
                    while (it21.hasNext()) {
                        arrayList13.add((Class) ((C0103c) it21.next()).f395b);
                    }
                    HashSet hashSet4 = new HashSet();
                    ArrayList arrayList14 = new ArrayList();
                    for (Object obj5 : arrayList13) {
                        if (hashSet4.add(((Class) obj5).getName())) {
                            arrayList14.add(obj5);
                        }
                    }
                    List<Class> listM277s04 = AbstractC0123k.m277s0(arrayList14, 8);
                    ArrayList arrayList15 = new ArrayList();
                    Iterator it22 = listM277s04.iterator();
                    while (it22.hasNext()) {
                        AbstractC0129q.m291e0(C0034g.m47w((Class) it22.next(), list), arrayList15);
                    }
                    HashSet hashSet5 = new HashSet();
                    ArrayList arrayList16 = new ArrayList();
                    for (Object obj6 : arrayList15) {
                        if (hashSet5.add(((Class) obj6).getName())) {
                            arrayList16.add(obj6);
                        }
                    }
                    List listM277s05 = AbstractC0123k.m277s0(arrayList16, 8);
                    if (listM277s05.isEmpty()) {
                        C0034g.m41q("conversation dexkit unresolved item empty dataSource=".concat(AbstractC0123k.m271m0(listM277s04, ",", null, null, new C0026a(9), 30)));
                    } else {
                        ArrayList arrayList17 = new ArrayList();
                        for (Class cls17 : listM277s03) {
                            ArrayList arrayListM38n6 = C0034g.m38n(cls17);
                            ArrayList arrayList18 = new ArrayList();
                            Iterator it23 = arrayListM38n6.iterator();
                            while (it23.hasNext()) {
                                Class<?>[] parameterTypes4 = ((Method) it23.next()).getParameterTypes();
                                AbstractC0223g.m417d(parameterTypes4, "getParameterTypes(...)");
                                AbstractC0129q.m291e0(AbstractC0120h.m262j0(parameterTypes4), arrayList18);
                            }
                            ArrayList arrayListM33i4 = C0034g.m33i(cls17);
                            ArrayList arrayList19 = new ArrayList(AbstractC0125m.m289c0(arrayListM33i4));
                            Iterator it24 = arrayListM33i4.iterator();
                            while (it24.hasNext()) {
                                arrayList19.add(((Field) it24.next()).getType());
                            }
                            AbstractC0129q.m291e0(AbstractC0123k.m273o0(arrayList18, arrayList19), arrayList17);
                        }
                        ArrayList arrayList20 = new ArrayList();
                        for (Object obj7 : arrayList17) {
                            Class cls18 = (Class) obj7;
                            if (C0034g.m13D(cls18.getName()) && (AbstractC0299i.m511i0(cls18.getName(), "ViewHolder", false) || cls18.getName().endsWith(".n") || cls18.getName().endsWith("$a"))) {
                                arrayList20.add(obj7);
                            }
                        }
                        HashSet hashSet6 = new HashSet();
                        ArrayList arrayList21 = new ArrayList();
                        for (Object obj8 : arrayList20) {
                            if (hashSet6.add(((Class) obj8).getName())) {
                                arrayList21.add(obj8);
                            }
                        }
                        List listM277s06 = AbstractC0123k.m277s0(arrayList21, 8);
                        ArrayList arrayList22 = new ArrayList();
                        for (Class cls19 : listM277s04) {
                            ArrayList arrayListM38n7 = C0034g.m38n(cls19);
                            ArrayList arrayList23 = new ArrayList();
                            Iterator it25 = arrayListM38n7.iterator();
                            while (it25.hasNext()) {
                                Class<?>[] parameterTypes5 = ((Method) it25.next()).getParameterTypes();
                                AbstractC0223g.m417d(parameterTypes5, "getParameterTypes(...)");
                                AbstractC0129q.m291e0(AbstractC0120h.m262j0(parameterTypes5), arrayList23);
                            }
                            ArrayList arrayListM33i5 = C0034g.m33i(cls19);
                            ArrayList arrayList24 = new ArrayList(AbstractC0125m.m289c0(arrayListM33i5));
                            Iterator it26 = arrayListM33i5.iterator();
                            while (it26.hasNext()) {
                                arrayList24.add(((Field) it26.next()).getType());
                            }
                            AbstractC0129q.m291e0(AbstractC0123k.m273o0(arrayList23, arrayList24), arrayList22);
                        }
                        ArrayList arrayList25 = new ArrayList();
                        for (Object obj9 : arrayList22) {
                            Class cls20 = (Class) obj9;
                            if (C0034g.m13D(cls20.getName())) {
                                ArrayList arrayList26 = new ArrayList(AbstractC0125m.m289c0(list));
                                Iterator it27 = list.iterator();
                                while (it27.hasNext()) {
                                    arrayList26.add(((Class) it27.next()).getName());
                                }
                                if (!AbstractC0123k.m265B0(arrayList26).contains(cls20.getName())) {
                                    ArrayList arrayList27 = new ArrayList(AbstractC0125m.m289c0(listM277s05));
                                    Iterator it28 = listM277s05.iterator();
                                    while (it28.hasNext()) {
                                        arrayList27.add(((Class) it28.next()).getName());
                                    }
                                    if (!AbstractC0123k.m265B0(arrayList27).contains(cls20.getName())) {
                                        ArrayList arrayListM38n8 = C0034g.m38n(cls20);
                                        if (!arrayListM38n8.isEmpty()) {
                                            Iterator it29 = arrayListM38n8.iterator();
                                            while (true) {
                                                if (!it29.hasNext()) {
                                                    break;
                                                }
                                                if (AbstractC0223g.m414a(((Method) it29.next()).getReturnType(), cls4)) {
                                                    arrayList25.add(obj9);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        HashSet hashSet7 = new HashSet();
                        ArrayList arrayList28 = new ArrayList();
                        for (Object obj10 : arrayList25) {
                            if (hashSet7.add(((Class) obj10).getName())) {
                                arrayList28.add(obj10);
                            }
                        }
                        List listM277s07 = AbstractC0123k.m277s0(arrayList28, 8);
                        ArrayList arrayList29 = new ArrayList(AbstractC0125m.m289c0(listM277s04));
                        Iterator it30 = listM277s04.iterator();
                        while (it30.hasNext()) {
                            arrayList29.add(((Class) it30.next()).getName());
                        }
                        ArrayList arrayList30 = new ArrayList();
                        Iterator it31 = listM277s03.iterator();
                        while (it31.hasNext()) {
                            AbstractC0129q.m291e0(C0034g.m38n((Class) it31.next()), arrayList30);
                        }
                        Iterator it32 = arrayList30.iterator();
                        while (true) {
                            if (!it32.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it32.next();
                            Method method8 = (Method) next;
                            Class<?>[] parameterTypes6 = method8.getParameterTypes();
                            AbstractC0223g.m417d(parameterTypes6, "getParameterTypes(...)");
                            if (parameterTypes6.length == 0 && arrayList29.contains(method8.getReturnType().getName())) {
                                break;
                            }
                        }
                        Method method9 = (Method) next;
                        String name4 = method9 != null ? method9.getName() : null;
                        if (name4 == null) {
                            C0034g.m41q("conversation dexkit unresolved dataSource getter empty adapter=" + AbstractC0123k.m271m0(listM277s03, ",", null, null, new C0026a(10), 30) + " dataSource=" + AbstractC0123k.m271m0(listM277s04, ",", null, null, new C0026a(11), 30));
                        } else {
                            ArrayList arrayList31 = new ArrayList();
                            Iterator it33 = listM277s04.iterator();
                            while (it33.hasNext()) {
                                AbstractC0129q.m291e0(C0034g.m38n((Class) it33.next()), arrayList31);
                            }
                            Iterator it34 = arrayList31.iterator();
                            while (true) {
                                if (!it34.hasNext()) {
                                    cls5 = cls16;
                                    next2 = null;
                                    break;
                                }
                                next2 = it34.next();
                                Method method10 = (Method) next2;
                                Class<?>[] parameterTypes7 = method10.getParameterTypes();
                                AbstractC0223g.m417d(parameterTypes7, "getParameterTypes(...)");
                                if (parameterTypes7.length == 0) {
                                    cls5 = cls16;
                                    if (cls5.isAssignableFrom(method10.getReturnType())) {
                                        break;
                                    }
                                } else {
                                    cls5 = cls16;
                                }
                                cls16 = cls5;
                            }
                            Method method11 = (Method) next2;
                            if (method11 == null || (name = method11.getName()) == null) {
                                ArrayList arrayList32 = new ArrayList();
                                Iterator it35 = listM277s04.iterator();
                                while (it35.hasNext()) {
                                    AbstractC0129q.m291e0(C0034g.m33i((Class) it35.next()), arrayList32);
                                }
                                Iterator it36 = arrayList32.iterator();
                                while (true) {
                                    if (!it36.hasNext()) {
                                        next3 = null;
                                        break;
                                    }
                                    next3 = it36.next();
                                    if (cls5.isAssignableFrom(((Field) next3).getType())) {
                                        break;
                                    }
                                }
                                Field field2 = (Field) next3;
                                name = field2 != null ? field2.getName() : null;
                            }
                            if (name == null) {
                                name = "";
                            }
                            String str7 = name;
                            if (AbstractC0307q.m534d0(str7)) {
                                C0034g.m41q("conversation dexkit list getter empty dataSource=".concat(AbstractC0123k.m271m0(listM277s04, ",", null, null, new C0026a(12), 30)));
                            }
                            ArrayList arrayList33 = new ArrayList();
                            Iterator it37 = listM277s04.iterator();
                            while (it37.hasNext()) {
                                AbstractC0129q.m291e0(C0034g.m38n((Class) it37.next()), arrayList33);
                            }
                            Iterator it38 = arrayList33.iterator();
                            while (true) {
                                if (!it38.hasNext()) {
                                    z2 = false;
                                    next4 = null;
                                    break;
                                }
                                next4 = it38.next();
                                Method method12 = (Method) next4;
                                if (AbstractC0223g.m414a(method12.getReturnType(), cls4) && method12.getParameterTypes().length == 2) {
                                    z2 = false;
                                    if (AbstractC0223g.m414a(method12.getParameterTypes()[0], cls3)) {
                                        cls6 = cls15;
                                        if (AbstractC0223g.m414a(method12.getParameterTypes()[1], cls6)) {
                                            break;
                                        }
                                    } else {
                                        cls6 = cls15;
                                    }
                                    cls15 = cls6;
                                } else {
                                    cls6 = cls15;
                                    cls15 = cls6;
                                }
                            }
                            Method method13 = (Method) next4;
                            if (method13 == null || (name3 = method13.getName()) == null) {
                                Iterator it39 = arrayList33.iterator();
                                while (true) {
                                    if (!it39.hasNext()) {
                                        z3 = true;
                                        next5 = null;
                                        break;
                                    }
                                    next5 = it39.next();
                                    Method method14 = (Method) next5;
                                    z3 = true;
                                    if (method14.getParameterTypes().length <= 1 && AbstractC0223g.m414a(method14.getReturnType(), cls4)) {
                                        break;
                                    }
                                }
                                Method method15 = (Method) next5;
                                name2 = method15 != null ? method15.getName() : null;
                            } else {
                                name2 = name3;
                                z3 = true;
                            }
                            if (name2 == null) {
                                name2 = "k";
                            }
                            String str8 = name2;
                            ArrayList arrayList34 = new ArrayList();
                            Iterator it40 = listM277s03.iterator();
                            while (it40.hasNext()) {
                                AbstractC0129q.m291e0(C0034g.m38n((Class) it40.next()), arrayList34);
                            }
                            Iterator it41 = arrayList34.iterator();
                            while (true) {
                                if (!it41.hasNext()) {
                                    next6 = null;
                                    break;
                                }
                                next6 = it41.next();
                                Method method16 = (Method) next6;
                                if (method16.getParameterTypes().length == 1 && List.class.isAssignableFrom(method16.getParameterTypes()[0])) {
                                    break;
                                }
                            }
                            Method method17 = (Method) next6;
                            String name5 = method17 != null ? method17.getName() : null;
                            if (name5 == null) {
                                name5 = "a";
                            }
                            String str9 = name5;
                            ArrayList arrayList35 = new ArrayList(AbstractC0125m.m289c0(listM277s03));
                            Iterator it42 = listM277s03.iterator();
                            while (it42.hasNext()) {
                                arrayList35.add(((Class) it42.next()).getName());
                            }
                            ArrayList arrayList36 = new ArrayList(AbstractC0125m.m289c0(listM277s04));
                            Iterator it43 = listM277s04.iterator();
                            while (it43.hasNext()) {
                                arrayList36.add(((Class) it43.next()).getName());
                            }
                            ArrayList arrayList37 = new ArrayList(AbstractC0125m.m289c0(listM277s05));
                            Iterator it44 = listM277s05.iterator();
                            while (it44.hasNext()) {
                                arrayList37.add(((Class) it44.next()).getName());
                            }
                            ArrayList arrayList38 = new ArrayList(AbstractC0125m.m289c0(listM277s06));
                            Iterator it45 = listM277s06.iterator();
                            while (it45.hasNext()) {
                                arrayList38.add(((Class) it45.next()).getName());
                            }
                            ArrayList arrayList39 = new ArrayList(AbstractC0125m.m289c0(list));
                            Iterator it46 = list.iterator();
                            while (it46.hasNext()) {
                                arrayList39.add(((Class) it46.next()).getName());
                            }
                            ArrayList arrayList40 = new ArrayList(AbstractC0125m.m289c0(listM277s07));
                            Iterator it47 = listM277s07.iterator();
                            while (it47.hasNext()) {
                                arrayList40.add(((Class) it47.next()).getName());
                            }
                            C0037j c0037j2 = new C0037j(arrayList35, arrayList36, arrayList37, arrayList38, arrayList39, arrayList40, name4, str7, str8, str9);
                            C0034g.m41q("conversation dexkit resolved adapter=" + AbstractC0123k.m271m0(arrayList35, ",", null, null, null, 62) + " dataSource=" + AbstractC0123k.m271m0(arrayList36, ",", null, null, null, 62) + " item=" + AbstractC0123k.m271m0(arrayList37, ",", null, null, null, 62) + " holder=" + AbstractC0123k.m271m0(arrayList38, ",", null, null, null, 62) + " storage=" + AbstractC0123k.m271m0(arrayList39, ",", null, null, null, 62) + "request=" + AbstractC0123k.m271m0(arrayList40, ",", null, null, null, 62) + " getDataSource=" + name4 + " getList=" + str7);
                            c0037j = c0037j2;
                        }
                    }
                }
            }
            z3 = true;
            c0037j = null;
            z2 = false;
        }
        C0034g.m41q("conversation dexkit resolve end " + (c0037j != null ? z3 : z2));
        return c0037j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    private final Object m52d(Object obj) {
        char c2;
        int i2;
        C1127j c1127j;
        Object c0104d;
        int i3;
        boolean z2;
        boolean z3;
        Object c0104d2;
        Object c0104d3;
        Object c0104d4;
        Object c0104d5;
        DexKitBridge dexKitBridge = (DexKitBridge) obj;
        AbstractC0223g.m418e(dexKitBridge, "bridge");
        ClassLoader classLoader = this.f232b.getClassLoader();
        AbstractC0223g.m417d(classLoader, "getClassLoader(...)");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        AbstractC0129q.m291e0(C0034g.m42r(dexKitBridge, "MicroMsg.AvatarDrawable", "imageView is null"), linkedHashSet);
        AbstractC0129q.m291e0(C0034g.m42r(dexKitBridge, "MicroMsg.AvatarGetContactServiceHelper", "put stack into pool: "), linkedHashSet);
        AbstractC0129q.m291e0(C0034g.m42r(dexKitBridge, "MicroMsg.AvatarDrawable"), linkedHashSet);
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (true) {
            c2 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String strM1007c = ((C0505j) next).m1007c();
            if (AbstractC0307q.m538h0(strM1007c, false, "(Landroid/widget/ImageView;Ljava/lang/String;") && strM1007c.endsWith(")V")) {
                arrayList.add(next);
            }
        }
        List<C0505j> listM276r0 = AbstractC0123k.m276r0(arrayList, new C0033f(5, new C0032e(3)));
        ArrayList arrayList2 = new ArrayList(AbstractC0125m.m289c0(listM276r0));
        for (C0505j c0505j : listM276r0) {
            arrayList2.add(new C1127j(c0505j.m1006b().f1869a, c0505j.m1006b().f1870b, c0505j.m1007c()));
        }
        List listM277s0 = AbstractC0123k.m277s0(AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList2)), 16);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = AbstractC0079h.m167E("com.tencent.mm.plugin.setting.ui.setting.view.GetHdHeadImageGalleryView").iterator();
        while (it2.hasNext()) {
            try {
                c0104d5 = Class.forName((String) it2.next(), false, classLoader);
            } catch (Throwable th) {
                c0104d5 = new C0104d(th);
            }
            Class cls = (Class) (c0104d5 instanceof C0104d ? null : c0104d5);
            if (cls != null) {
                linkedHashSet2.add(cls);
            }
        }
        Iterator it3 = AbstractC0120h.m252Z(new String[]{"GetHdHeadImageGalleryView", "HdHeadImageGallery", "HeadImageGallery", "HdHeadImage", "HeadImage"}).iterator();
        while (true) {
            i2 = 1;
            if (!it3.hasNext()) {
                break;
            }
            String str = (String) it3.next();
            try {
                C0353a c0353a = new C0353a(0);
                c0353a.m608Z("com.tencent.mm.plugin.setting", "com.tencent.mm.ui", "com.tencent.mm");
                C0361a c0361a = new C0361a();
                c0361a.m617Y(str, 1, false);
                c0353a.f828f = c0361a;
                Iterator it4 = dexKitBridge.m1441d(c0353a).iterator();
                while (it4.hasNext()) {
                    linkedHashSet2.add(((C0499d) it4.next()).m963c(classLoader));
                }
                c0104d4 = linkedHashSet2;
            } catch (Throwable th2) {
                c0104d4 = new C0104d(th2);
            }
            Throwable thM246a = AbstractC0105e.m246a(c0104d4);
            if (thM246a != null) {
                AbstractC0731a.m1387d("custom avatar hd class scan fail", str, thM246a);
            }
        }
        Iterator it5 = AbstractC0120h.m252Z(new String[]{"GetHdHeadImageGalleryView", "hdHead", "headImg", "setUsername"}).iterator();
        while (it5.hasNext()) {
            Iterator it6 = C0034g.m42r(dexKitBridge, (String) it5.next()).iterator();
            while (it6.hasNext()) {
                try {
                    c0104d3 = Class.forName(((C0505j) it6.next()).m1006b().f1869a, false, classLoader);
                } catch (Throwable th3) {
                    c0104d3 = new C0104d(th3);
                }
                if (c0104d3 instanceof C0104d) {
                    c0104d3 = null;
                }
                Class cls2 = (Class) c0104d3;
                if (cls2 != null) {
                    linkedHashSet2.add(cls2);
                }
            }
        }
        ArrayList<Class> arrayList3 = new ArrayList();
        Iterator it7 = linkedHashSet2.iterator();
        while (true) {
            boolean zHasNext = it7.hasNext();
            Object obj2 = C0131s.f426a;
            if (!zHasNext) {
                ArrayList arrayList4 = new ArrayList();
                for (Class cls3 : arrayList3) {
                    ArrayList<Method> arrayList5 = new ArrayList();
                    for (Class superclass = cls3; superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                        try {
                            Method[] declaredMethods = superclass.getDeclaredMethods();
                            AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
                            c0104d = AbstractC0120h.m262j0(declaredMethods);
                        } catch (Throwable th4) {
                            c0104d = new C0104d(th4);
                        }
                        if (c0104d instanceof C0104d) {
                            c0104d = obj2;
                        }
                        arrayList5.addAll((Collection) c0104d);
                    }
                    ArrayList arrayList6 = new ArrayList();
                    for (Method method : arrayList5) {
                        if (!Modifier.isAbstract(method.getModifiers()) && method.getParameterTypes().length == i2 && AbstractC0223g.m414a(method.getParameterTypes()[c2], String.class) && AbstractC0223g.m414a(method.getReturnType(), Void.TYPE) && (AbstractC0223g.m414a(method.getName(), "setUsername") || !Modifier.isStatic(method.getModifiers()))) {
                            String name = cls3.getName();
                            String name2 = method.getName();
                            AbstractC0223g.m417d(name2, "getName(...)");
                            String genericString = method.toGenericString();
                            AbstractC0223g.m417d(genericString, "toGenericString(...)");
                            c1127j = new C1127j(name, name2, genericString);
                        } else {
                            c1127j = null;
                        }
                        if (c1127j != null) {
                            arrayList6.add(c1127j);
                        }
                        c2 = 0;
                        i2 = 1;
                    }
                    AbstractC0129q.m291e0(arrayList6, arrayList4);
                    c2 = 0;
                    i2 = 1;
                }
                List listM277s02 = AbstractC0123k.m277s0(AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList4)), 8);
                int i4 = -1;
                if (AbstractC1135r.f3833e == -1) {
                    try {
                        i4 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionCode;
                    } catch (Exception e2) {
                        AbstractC0731a.m1385b(e2);
                    }
                    AbstractC1135r.f3833e = i4;
                }
                int i5 = AbstractC1135r.f3833e;
                String str2 = "";
                if (AbstractC0307q.m534d0(AbstractC1135r.f3834f)) {
                    try {
                        String str3 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionName;
                        if (str3 != null) {
                            str2 = str3;
                        }
                    } catch (Exception e3) {
                        AbstractC0731a.m1385b(e3);
                    }
                    AbstractC1135r.f3834f = str2;
                }
                C1128k c1128k = new C1128k(listM277s0, listM277s02, i5, AbstractC1135r.f3834f);
                if (listM277s0.isEmpty() && listM277s02.isEmpty()) {
                    return null;
                }
                return c1128k;
            }
            Object next2 = it7.next();
            Class cls4 = (Class) next2;
            ArrayList arrayList7 = new ArrayList();
            for (Class superclass2 = cls4; superclass2 != null && !superclass2.equals(Object.class); superclass2 = superclass2.getSuperclass()) {
                try {
                    Field[] declaredFields = superclass2.getDeclaredFields();
                    try {
                        AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
                        c0104d2 = AbstractC0120h.m262j0(declaredFields);
                    } catch (Throwable th5) {
                        th = th5;
                        c0104d2 = new C0104d(th);
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
                if (c0104d2 instanceof C0104d) {
                    c0104d2 = obj2;
                }
                arrayList7.addAll((Collection) c0104d2);
            }
            if (arrayList7.isEmpty()) {
                i3 = 0;
            } else {
                Iterator it8 = arrayList7.iterator();
                i3 = 0;
                while (it8.hasNext()) {
                    if (Bitmap.class.isAssignableFrom(((Field) it8.next()).getType()) && (i3 = i3 + 1) < 0) {
                        AbstractC0124l.m287a0();
                        throw null;
                    }
                }
            }
            if (arrayList7.isEmpty()) {
                z2 = false;
            } else {
                Iterator it9 = arrayList7.iterator();
                while (it9.hasNext()) {
                    if (SpinnerAdapter.class.isAssignableFrom(((Field) it9.next()).getType())) {
                        z2 = true;
                        break;
                    }
                }
                z2 = false;
            }
            if (arrayList7.isEmpty()) {
                z3 = false;
            } else {
                Iterator it10 = arrayList7.iterator();
                while (it10.hasNext()) {
                    if (AbstractC0223g.m414a(((Field) it10.next()).getType(), String.class)) {
                        z3 = true;
                        break;
                    }
                }
                z3 = false;
            }
            if (i3 >= 1 && z3 && (z2 || AbstractC0299i.m511i0(cls4.getName(), "Head", true))) {
                arrayList3.add(next2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:437:0x00ef */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:438:0x00da */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:504:0x076e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:533:0x09c1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0335 A[LOOP:12: B:104:0x032f->B:106:0x0335, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0447 A[LOOP:15: B:138:0x0441->B:140:0x0447, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05e2 A[LOOP:21: B:186:0x057e->B:205:0x05e2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0616 A[LOOP:22: B:216:0x0610->B:218:0x0616, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x06c3 A[LOOP:24: B:230:0x0667->B:248:0x06c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x06f9 A[LOOP:25: B:258:0x06f3->B:260:0x06f9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x075a A[Catch: all -> 0x0768, LOOP:26: B:263:0x0754->B:265:0x075a, LOOP_END, TRY_LEAVE, TryCatch #3 {all -> 0x0768, blocks: (B:262:0x070f, B:263:0x0754, B:265:0x075a), top: B:431:0x070f }] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x081c A[PHI: r2 r8
  0x081c: PHI (r2v23 java.lang.Class<android.view.View$OnCreateContextMenuListener>) = 
  (r2v2 java.lang.Class<android.view.View$OnCreateContextMenuListener>)
  (r2v2 java.lang.Class<android.view.View$OnCreateContextMenuListener>)
  (r2v25 java.lang.Class<android.view.View$OnCreateContextMenuListener>)
 binds: [B:279:0x079f, B:281:0x07a9, B:510:0x081c] A[DONT_GENERATE, DONT_INLINE]
  0x081c: PHI (r8v51 java.util.Iterator) = (r8v30 java.util.Iterator), (r8v30 java.util.Iterator), (r8v53 java.util.Iterator) binds: [B:279:0x079f, B:281:0x07a9, B:510:0x081c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x083f  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0864  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0abe A[LOOP:31: B:391:0x0ab8->B:393:0x0abe, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0aed A[LOOP:32: B:395:0x0ae7->B:397:0x0aed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0b14  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0b4d  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0b51  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0b5b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0284 A[EDGE_INSN: B:451:0x0284->B:79:0x0284 BREAK  A[LOOP:7: B:64:0x0234->B:454:0x0234], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0320 A[EDGE_INSN: B:465:0x0320->B:103:0x0320 BREAK  A[LOOP:10: B:84:0x02b6->B:101:0x0318], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0426 A[EDGE_INSN: B:475:0x0426->B:137:0x0426 BREAK  A[LOOP:13: B:108:0x0354->B:136:0x0413], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:494:0x05fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:495:0x05df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:500:0x06e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:502:0x06c0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0297 A[LOOP:9: B:80:0x0291->B:82:0x0297, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02c1  */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v80 */
    /* JADX WARN: Type inference failed for: r0v81 */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2, types: [E0.d] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r7v2, types: [F0.s] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r8v134, types: [E0.d] */
    /* JADX WARN: Type inference failed for: r8v135, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v136, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v137 */
    /* JADX WARN: Type inference failed for: r8v25, types: [E0.d] */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v59 */
    /* JADX WARN: Type inference failed for: r8v62, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object m53e(Object obj) {
        ?? r7;
        char c2;
        int i2;
        char c3;
        Object c0104d;
        Throwable thM246a;
        boolean z2;
        List listM277s0;
        Iterator it;
        Class<MenuItem> cls;
        int i3;
        Iterator it2;
        Iterator it3;
        int i4;
        Iterator it4;
        ArrayList arrayList;
        Iterator it5;
        ?? r72;
        boolean zHasNext;
        Class cls2;
        int i5;
        Class<View.OnCreateContextMenuListener> cls3;
        List list;
        Class cls4;
        ?? r22;
        Iterator it6;
        Iterator it7;
        Iterator it8;
        Iterator it9;
        Iterator it10;
        Iterator it11;
        ?? c0104d2;
        Throwable thM246a2;
        boolean z3;
        Iterator it12;
        List listM277s02;
        List list2;
        char c4;
        ?? c0104d3;
        ?? M277s0;
        List listM277s03;
        List listM277s04;
        List listM277s05;
        List listM277s06;
        List listM277s07;
        List listM277s08;
        List listM277s09;
        List listM277s010;
        Iterator it13;
        List listM277s011;
        Iterator it14;
        List listM277s012;
        Class<View.OnCreateContextMenuListener> cls5;
        Iterator it15;
        Iterator it16;
        Set set;
        int i6;
        char c5;
        char c6;
        char c7;
        Iterator it17;
        int i7;
        char c8;
        char c9;
        char c10;
        List list3;
        C0016P c0016p;
        boolean zM11B;
        C0015O c0015o;
        Class cls6;
        List list4;
        int i8;
        ?? c0104d4;
        DexKitBridge dexKitBridge = (DexKitBridge) obj;
        AbstractC0223g.m418e(dexKitBridge, "bridge");
        ClassLoader classLoader = this.f232b.getClassLoader();
        AbstractC0223g.m417d(classLoader, "getClassLoader(...)");
        String[] strArr = {"com.tencent.mm.ui", "com.tencent.mm.ui.contact", "com.tencent.mm.ui.base", "com.tencent.mm.ui.widget", "fj5", "gg5", "wh5", "rl5", "o95", "u65", "h85", "db5", "g75", "v15", "u85", "yc5", "q35", "k75", "me5", "wg5", "l75", "hb5", "ki5", "j75", "gy4", "p65", "q65", "r65"};
        List listM252Z = AbstractC0120h.m252Z(new String[]{"conversation", "contact", "Address", "Menu", "menu", "popup", "Pop", "t4", ".r", ".q", ".i", ".c5", ".n", "r", "q", "i", "c5", "n"});
        ArrayList arrayList2 = new ArrayList();
        Iterator it18 = listM252Z.iterator();
        while (true) {
            boolean zHasNext2 = it18.hasNext();
            r7 = C0131s.f426a;
            c2 = 1;
            if (!zHasNext2) {
                break;
            }
            String str = (String) it18.next();
            try {
                C0353a c0353a = new C0353a(0);
                c0353a.m608Z((String[]) Arrays.copyOf(strArr, 28));
                C0361a c0361a = new C0361a();
                c0361a.m617Y(str, 1, false);
                c0353a.f828f = c0361a;
                C0500e c0500eM1441d = dexKitBridge.m1441d(c0353a);
                c0104d4 = new ArrayList();
                Iterator it19 = c0500eM1441d.iterator();
                while (it19.hasNext()) {
                    c0104d4.add(((C0499d) it19.next()).m963c(classLoader));
                }
            } catch (Throwable th) {
                c0104d4 = new C0104d(th);
            }
            Throwable thM246a3 = AbstractC0105e.m246a(c0104d4);
            if (thM246a3 != null) {
                AbstractC0731a.m1387d("quick add dexkit find class fail", str, thM246a3);
            }
            if (!(c0104d4 instanceof C0104d)) {
                r7 = c0104d4;
            }
            AbstractC0129q.m291e0((Iterable) r7, arrayList2);
        }
        try {
            ArrayList arrayList3 = new ArrayList();
            int i9 = 0;
            for (i2 = 28; i9 < i2; i2 = 28) {
                String str2 = strArr[i9];
                C0353a c0353a2 = new C0353a(0);
                c0353a2.m608Z(str2);
                C0361a c0361a2 = new C0361a();
                C0363c c0363c = new C0363c();
                C0362b c0362b = new C0362b();
                c3 = c2;
                try {
                    if (c0362b.f854h == null) {
                        c0362b.f854h = new C0353a(2);
                    }
                    C0353a c0353a3 = c0362b.f854h;
                    AbstractC0223g.m415b(c0353a3);
                    C0368a c0368a = new C0368a(1);
                    c0368a.f864e = 7;
                    c0368a.f865f = 7;
                    c0353a3.f828f = c0368a;
                    c0363c.m627Y(c0362b);
                    c0361a2.f848e = c0363c;
                    c0353a2.f828f = c0361a2;
                    C0500e c0500eM1441d2 = dexKitBridge.m1441d(c0353a2);
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it20 = c0500eM1441d2.iterator();
                    while (it20.hasNext()) {
                        arrayList4.add(((C0499d) it20.next()).m963c(classLoader));
                    }
                    AbstractC0129q.m291e0(arrayList4, arrayList3);
                    i9++;
                    c2 = c3;
                } catch (Throwable th2) {
                    th = th2;
                    c0104d = new C0104d(th);
                    thM246a = AbstractC0105e.m246a(c0104d);
                    if (thM246a != null) {
                    }
                    z2 = c0104d instanceof C0104d;
                    ?? r02 = c0104d;
                    if (z2) {
                    }
                    ArrayList arrayListM273o0 = AbstractC0123k.m273o0(arrayList2, (List) r02);
                    ArrayList arrayList5 = new ArrayList();
                    while (r0.hasNext()) {
                    }
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList6 = new ArrayList();
                    while (r4.hasNext()) {
                    }
                    listM277s0 = AbstractC0123k.m277s0(arrayList6, 1600);
                    ArrayList arrayList7 = new ArrayList();
                    it = listM277s0.iterator();
                    while (true) {
                        cls = MenuItem.class;
                        i3 = 2;
                        if (it.hasNext()) {
                        }
                    }
                    ArrayList arrayList8 = new ArrayList(AbstractC0125m.m289c0(arrayList7));
                    it2 = arrayList7.iterator();
                    while (it2.hasNext()) {
                    }
                    List listM281w0 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList8));
                    ArrayList arrayList9 = new ArrayList();
                    it3 = listM277s0.iterator();
                    while (true) {
                        i4 = 4;
                        if (it3.hasNext()) {
                        }
                        i3 = i8;
                    }
                    int i10 = i3;
                    ArrayList arrayList10 = new ArrayList(AbstractC0125m.m289c0(arrayList9));
                    it4 = arrayList9.iterator();
                    while (it4.hasNext()) {
                    }
                    List listM281w02 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList10));
                    arrayList = new ArrayList();
                    it5 = listM277s0.iterator();
                    r72 = r7;
                    while (true) {
                        zHasNext = it5.hasNext();
                        cls2 = Integer.TYPE;
                        i5 = i4;
                        cls3 = View.OnCreateContextMenuListener.class;
                        list = listM277s0;
                        cls4 = Long.TYPE;
                        r22 = r72;
                        if (zHasNext) {
                        }
                        AbstractC0129q.m291e0(arrayList, arrayList);
                        i4 = i5;
                        listM277s0 = list;
                        r72 = r22;
                    }
                    List list5 = listM281w0;
                    Class<MenuItem> cls7 = cls;
                    int i11 = 3;
                    List listM281w03 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList));
                    ArrayList arrayList11 = new ArrayList(AbstractC0125m.m289c0(listM281w03));
                    it6 = listM281w03.iterator();
                    while (it6.hasNext()) {
                    }
                    ArrayList arrayList12 = new ArrayList();
                    while (r6.hasNext()) {
                    }
                    List listM281w04 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList12));
                    Set setM265B0 = AbstractC0123k.m265B0(listM281w04);
                    ArrayList arrayList13 = new ArrayList();
                    it7 = list.iterator();
                    while (it7.hasNext()) {
                    }
                    ArrayList arrayList14 = new ArrayList();
                    it8 = arrayList13.iterator();
                    while (it8.hasNext()) {
                    }
                    List list6 = listM281w03;
                    List list7 = listM281w04;
                    List listM281w05 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList14));
                    ArrayList arrayList15 = new ArrayList();
                    it9 = list.iterator();
                    while (it9.hasNext()) {
                    }
                    ArrayList arrayList16 = new ArrayList(AbstractC0125m.m289c0(arrayList15));
                    it10 = arrayList15.iterator();
                    while (it10.hasNext()) {
                    }
                    List listM281w06 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList16));
                    ArrayList arrayList17 = new ArrayList();
                    while (r8.hasNext()) {
                    }
                    ArrayList arrayList18 = new ArrayList(AbstractC0125m.m289c0(arrayList17));
                    it11 = arrayList17.iterator();
                    while (it11.hasNext()) {
                    }
                    List listM281w07 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList18));
                    C0353a c0353a4 = new C0353a(0);
                    C0361a c0361a3 = new C0361a();
                    C0363c c0363c2 = new C0363c();
                    C0362b c0362b2 = new C0362b();
                    C0362b.m622b0(c0362b2, "onCreateContextMenu");
                    c0362b2.m625c0(ContextMenu.class.getName(), View.class.getName(), ContextMenu.ContextMenuInfo.class.getName());
                    c0363c2.m627Y(c0362b2);
                    c0361a3.f848e = c0363c2;
                    c0353a4.f828f = c0361a3;
                    C0500e c0500eM1441d3 = dexKitBridge.m1441d(c0353a4);
                    c0104d2 = new ArrayList();
                    it16 = c0500eM1441d3.iterator();
                    while (it16.hasNext()) {
                    }
                    thM246a2 = AbstractC0105e.m246a(c0104d2);
                    if (thM246a2 != null) {
                    }
                    z3 = c0104d2 instanceof C0104d;
                    ?? r8 = c0104d2;
                    if (z3) {
                    }
                    ArrayList arrayList19 = new ArrayList();
                    it12 = ((List) r8).iterator();
                    while (it12.hasNext()) {
                    }
                    List listM276r0 = AbstractC0123k.m276r0(arrayList19, new C0032e(6));
                    HashSet hashSet2 = new HashSet();
                    ArrayList arrayList20 = new ArrayList();
                    while (r0.hasNext()) {
                    }
                    listM277s02 = AbstractC0123k.m277s0(arrayList20, 8);
                    if (listM277s02.isEmpty()) {
                    }
                    M277s0 = r22;
                    c4 = 0;
                    listM277s03 = AbstractC0123k.m277s0(listM281w02, 12);
                    listM277s04 = AbstractC0123k.m277s0(list5, 12);
                    listM277s05 = AbstractC0123k.m277s0(list7, 32);
                    listM277s06 = AbstractC0123k.m277s0(list6, 32);
                    listM277s07 = AbstractC0123k.m277s0(listM281w05, 48);
                    listM277s08 = AbstractC0123k.m277s0(listM281w06, 32);
                    listM277s09 = AbstractC0123k.m277s0(listM281w07, 32);
                    listM277s010 = AbstractC0123k.m277s0(list5, 12);
                    ArrayList arrayList21 = new ArrayList(AbstractC0125m.m289c0(list2));
                    it13 = list2.iterator();
                    while (it13.hasNext()) {
                    }
                    listM277s011 = AbstractC0123k.m277s0(AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList21)), 8);
                    ArrayList arrayList22 = new ArrayList(AbstractC0125m.m289c0(M277s0));
                    it14 = M277s0.iterator();
                    while (it14.hasNext()) {
                    }
                    listM277s012 = AbstractC0123k.m277s0(AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList22)), 8);
                    C0014N c0014n = new C0014N(listM277s03, listM277s04, listM277s05, listM277s06, listM277s07, listM277s08, listM277s09, listM277s010, listM277s011, listM277s012);
                    if (((listM277s03.isEmpty() && listM277s04.isEmpty() && listM277s05.isEmpty() && listM277s06.isEmpty() && listM277s07.isEmpty() && listM277s08.isEmpty() && listM277s09.isEmpty() && listM277s010.isEmpty() && listM277s011.isEmpty() && listM277s012.isEmpty()) ? c4 : c3) != 0) {
                    }
                }
            }
            c3 = c2;
            c0104d = arrayList3;
        } catch (Throwable th3) {
            th = th3;
            c3 = c2;
        }
        thM246a = AbstractC0105e.m246a(c0104d);
        if (thM246a != null) {
            AbstractC0731a.m1387d("quick add dexkit popup shape scan fail", thM246a);
        }
        z2 = c0104d instanceof C0104d;
        ?? r022 = c0104d;
        if (z2) {
            r022 = r7;
        }
        ArrayList arrayListM273o02 = AbstractC0123k.m273o0(arrayList2, (List) r022);
        ArrayList arrayList52 = new ArrayList();
        for (Object obj2 : arrayListM273o02) {
            String name = ((Class) obj2).getName();
            String[] strArr2 = {"com.tencent.mm.ui", "fj5.", "gg5.", "wh5.", "rl5.", "o95.", "u65.", "h85.", "db5.", "g75.", "v15.", "u85.", "yc5.", "q35.", "k75.", "me5.", "wg5.", "l75.", "hb5.", "ki5.", "j75.", "gy4.", "p65.", "q65.", "r65."};
            int i12 = 0;
            while (true) {
                if (i12 >= 25) {
                    break;
                }
                if (AbstractC0307q.m538h0(name, false, strArr2[i12])) {
                    arrayList52.add(obj2);
                    break;
                }
                i12++;
            }
        }
        HashSet hashSet3 = new HashSet();
        ArrayList arrayList62 = new ArrayList();
        for (Object obj3 : arrayList52) {
            if (hashSet3.add(((Class) obj3).getName())) {
                arrayList62.add(obj3);
            }
        }
        listM277s0 = AbstractC0123k.m277s0(arrayList62, 1600);
        ArrayList arrayList72 = new ArrayList();
        it = listM277s0.iterator();
        while (true) {
            cls = MenuItem.class;
            i3 = 2;
            if (it.hasNext()) {
                break;
            }
            Object next = it.next();
            ArrayList arrayListM39o = C0034g.m39o((Class) next);
            if (!arrayListM39o.isEmpty()) {
                Iterator it21 = arrayListM39o.iterator();
                while (true) {
                    if (it21.hasNext()) {
                        Method method = (Method) it21.next();
                        if (AbstractC0223g.m414a(method.getName(), "onMMMenuItemSelected") && method.getParameterTypes().length == 2 && cls.isAssignableFrom(method.getParameterTypes()[0])) {
                            arrayList72.add(next);
                            break;
                        }
                    }
                }
            }
        }
        ArrayList arrayList82 = new ArrayList(AbstractC0125m.m289c0(arrayList72));
        it2 = arrayList72.iterator();
        while (it2.hasNext()) {
            arrayList82.add(((Class) it2.next()).getName());
        }
        List listM281w08 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList82));
        ArrayList arrayList92 = new ArrayList();
        it3 = listM277s0.iterator();
        while (true) {
            i4 = 4;
            if (it3.hasNext()) {
                break;
            }
            Object next2 = it3.next();
            ArrayList<Method> arrayListM39o2 = C0034g.m39o((Class) next2);
            if (arrayListM39o2.isEmpty()) {
                i8 = i3;
            } else {
                for (Method method2 : arrayListM39o2) {
                    i8 = i3;
                    if (AbstractC0223g.m414a(method2.getName(), "onItemLongClick") && method2.getParameterTypes().length == 4 && AdapterView.class.isAssignableFrom(method2.getParameterTypes()[0]) && View.class.isAssignableFrom(method2.getParameterTypes()[c3])) {
                        arrayList92.add(next2);
                        break;
                    }
                    i3 = i8;
                }
                i8 = i3;
            }
            i3 = i8;
        }
        int i102 = i3;
        ArrayList arrayList102 = new ArrayList(AbstractC0125m.m289c0(arrayList92));
        it4 = arrayList92.iterator();
        while (it4.hasNext()) {
            arrayList102.add(((Class) it4.next()).getName());
        }
        List listM281w022 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList102));
        arrayList = new ArrayList();
        it5 = listM277s0.iterator();
        r72 = r7;
        while (true) {
            zHasNext = it5.hasNext();
            cls2 = Integer.TYPE;
            i5 = i4;
            cls3 = View.OnCreateContextMenuListener.class;
            list = listM277s0;
            cls4 = Long.TYPE;
            r22 = r72;
            if (zHasNext) {
                break;
            }
            Class cls8 = (Class) it5.next();
            ArrayList<Method> arrayListM39o3 = C0034g.m39o(cls8);
            ArrayList arrayList23 = new ArrayList();
            for (Method method3 : arrayListM39o3) {
                Iterator it22 = it5;
                Class<?>[] parameterTypes = method3.getParameterTypes();
                Class<MenuItem> cls9 = cls;
                if (parameterTypes.length == 7 && View.class.isAssignableFrom(parameterTypes[0]) && AbstractC0223g.m414a(parameterTypes[c3], cls2) && AbstractC0223g.m414a(parameterTypes[i102], cls4) && cls3.isAssignableFrom(parameterTypes[3]) && AbstractC0223g.m414a(parameterTypes[5], cls2) && AbstractC0223g.m414a(parameterTypes[6], cls2)) {
                    Class<?> cls10 = parameterTypes[i5];
                    AbstractC0223g.m417d(cls10, "get(...)");
                    zM11B = C0034g.m11B(cls10);
                } else {
                    zM11B = false;
                }
                if (zM11B) {
                    Class<?> cls11 = method3.getParameterTypes()[i5];
                    String name2 = cls8.getName();
                    cls6 = cls8;
                    String name3 = cls11.getName();
                    list4 = listM281w08;
                    String name4 = method3.getName();
                    AbstractC0223g.m417d(name4, "getName(...)");
                    c0015o = new C0015O(name2, name3, name4);
                } else {
                    list4 = listM281w08;
                    cls6 = cls8;
                    c0015o = null;
                }
                if (c0015o != null) {
                    arrayList23.add(c0015o);
                }
                it5 = it22;
                cls = cls9;
                listM281w08 = list4;
                cls8 = cls6;
            }
            AbstractC0129q.m291e0(arrayList23, arrayList);
            i4 = i5;
            listM277s0 = list;
            r72 = r22;
        }
        List list52 = listM281w08;
        Class<MenuItem> cls72 = cls;
        int i112 = 3;
        List listM281w032 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList));
        ArrayList arrayList112 = new ArrayList(AbstractC0125m.m289c0(listM281w032));
        it6 = listM281w032.iterator();
        while (it6.hasNext()) {
            arrayList112.add(((C0015O) it6.next()).f136a);
        }
        ArrayList arrayList122 = new ArrayList();
        for (Object obj4 : arrayList112) {
            if (!AbstractC0307q.m534d0((String) obj4)) {
                arrayList122.add(obj4);
            }
        }
        List listM281w042 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList122));
        Set setM265B02 = AbstractC0123k.m265B0(listM281w042);
        ArrayList arrayList132 = new ArrayList();
        it7 = list.iterator();
        while (it7.hasNext()) {
            Object next3 = it7.next();
            Iterator it23 = it7;
            if (setM265B02.contains(((Class) next3).getName())) {
                arrayList132.add(next3);
            }
            it7 = it23;
        }
        ArrayList arrayList142 = new ArrayList();
        it8 = arrayList132.iterator();
        while (it8.hasNext()) {
            Class cls12 = (Class) it8.next();
            ArrayList<Method> arrayListM39o4 = C0034g.m39o(cls12);
            Iterator it24 = it8;
            ArrayList arrayList24 = new ArrayList();
            for (Method method4 : arrayListM39o4) {
                Class cls13 = cls12;
                List list8 = listM281w032;
                if (((method4.getParameterTypes().length == i102 && AbstractC0223g.m414a(method4.getParameterTypes()[0], cls2) && AbstractC0223g.m414a(method4.getParameterTypes()[c3], cls2)) ? c3 : (char) 0) != 0) {
                    String name5 = cls13.getName();
                    list3 = listM281w042;
                    String name6 = method4.getName();
                    AbstractC0223g.m417d(name6, "getName(...)");
                    c0016p = new C0016P(name5, name6);
                } else {
                    list3 = listM281w042;
                    c0016p = null;
                }
                if (c0016p != null) {
                    arrayList24.add(c0016p);
                }
                cls12 = cls13;
                listM281w032 = list8;
                listM281w042 = list3;
                i102 = 2;
            }
            AbstractC0129q.m291e0(arrayList24, arrayList142);
            it8 = it24;
            i102 = 2;
        }
        List list62 = listM281w032;
        List list72 = listM281w042;
        List listM281w052 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList142));
        ArrayList arrayList152 = new ArrayList();
        it9 = list.iterator();
        while (it9.hasNext()) {
            Object next4 = it9.next();
            Class cls14 = (Class) next4;
            if (setM265B02.contains(cls14.getName())) {
                it17 = it9;
                i7 = i5;
            } else {
                if (C0034g.m12C(cls14, setM265B02)) {
                    ArrayList arrayListM39o5 = C0034g.m39o(cls14);
                    if (arrayListM39o5.isEmpty()) {
                        it17 = it9;
                        i7 = i5;
                        c10 = 0;
                        if (c10 == 0) {
                        }
                    } else {
                        Iterator it25 = arrayListM39o5.iterator();
                        while (it25.hasNext()) {
                            Method method5 = (Method) it25.next();
                            it17 = it9;
                            Iterator it26 = it25;
                            if (AbstractC0223g.m414a(method5.getName(), "onItemClick")) {
                                i7 = i5;
                                if (method5.getParameterTypes().length == i7 && AdapterView.class.isAssignableFrom(method5.getParameterTypes()[0]) && View.class.isAssignableFrom(method5.getParameterTypes()[c3]) && AbstractC0223g.m414a(method5.getParameterTypes()[2], cls2) && AbstractC0223g.m414a(method5.getParameterTypes()[3], cls4)) {
                                    c9 = c3;
                                }
                                if (c9 == 0) {
                                    c10 = c3;
                                    break;
                                }
                                i5 = i7;
                                it9 = it17;
                                it25 = it26;
                            } else {
                                i7 = i5;
                            }
                            c9 = 0;
                            if (c9 == 0) {
                            }
                        }
                        it17 = it9;
                        i7 = i5;
                        c10 = 0;
                        if (c10 == 0) {
                        }
                    }
                    if (c8 != 0) {
                        arrayList152.add(next4);
                    }
                    i5 = i7;
                    it9 = it17;
                } else {
                    it17 = it9;
                    i7 = i5;
                }
                c8 = 0;
                if (c8 != 0) {
                }
                i5 = i7;
                it9 = it17;
            }
            c8 = c3;
            if (c8 != 0) {
            }
            i5 = i7;
            it9 = it17;
        }
        ArrayList arrayList162 = new ArrayList(AbstractC0125m.m289c0(arrayList152));
        it10 = arrayList152.iterator();
        while (it10.hasNext()) {
            arrayList162.add(((Class) it10.next()).getName());
        }
        List listM281w062 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList162));
        ArrayList arrayList172 = new ArrayList();
        for (Object obj5 : list) {
            Class cls15 = (Class) obj5;
            if (BaseAdapter.class.isAssignableFrom(cls15) && C0034g.m12C(cls15, setM265B02)) {
                ArrayList arrayListM39o6 = C0034g.m39o(cls15);
                if (!arrayListM39o6.isEmpty()) {
                    Iterator it27 = arrayListM39o6.iterator();
                    while (true) {
                        if (!it27.hasNext()) {
                            set = setM265B02;
                            i6 = i112;
                            c6 = 0;
                            break;
                        }
                        Method method6 = (Method) it27.next();
                        set = setM265B02;
                        if (AbstractC0223g.m414a(method6.getName(), "getView")) {
                            i6 = i112;
                            if (method6.getParameterTypes().length == i6 && AbstractC0223g.m414a(method6.getParameterTypes()[0], cls2) && View.class.isAssignableFrom(method6.getParameterTypes()[c3])) {
                                c7 = ViewGroup.class.isAssignableFrom(method6.getParameterTypes()[2]) ? c3 : (char) 0;
                                if (c7 != 0) {
                                    c6 = c3;
                                    break;
                                }
                                i112 = i6;
                                setM265B02 = set;
                            }
                            if (c7 != 0) {
                            }
                        } else {
                            i6 = i112;
                        }
                        if (c7 != 0) {
                        }
                    }
                } else {
                    set = setM265B02;
                    i6 = i112;
                    c6 = 0;
                }
                c5 = c6 != 0 ? c3 : (char) 0;
                if (c5 == 0) {
                    arrayList172.add(obj5);
                }
                i112 = i6;
                setM265B02 = set;
            } else {
                set = setM265B02;
                i6 = i112;
            }
            if (c5 == 0) {
            }
            i112 = i6;
            setM265B02 = set;
        }
        ArrayList arrayList182 = new ArrayList(AbstractC0125m.m289c0(arrayList172));
        it11 = arrayList172.iterator();
        while (it11.hasNext()) {
            arrayList182.add(((Class) it11.next()).getName());
        }
        List listM281w072 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList182));
        try {
            C0353a c0353a42 = new C0353a(0);
            C0361a c0361a32 = new C0361a();
            C0363c c0363c22 = new C0363c();
            C0362b c0362b22 = new C0362b();
            C0362b.m622b0(c0362b22, "onCreateContextMenu");
            c0362b22.m625c0(ContextMenu.class.getName(), View.class.getName(), ContextMenu.ContextMenuInfo.class.getName());
            c0363c22.m627Y(c0362b22);
            c0361a32.f848e = c0363c22;
            c0353a42.f828f = c0361a32;
            C0500e c0500eM1441d32 = dexKitBridge.m1441d(c0353a42);
            c0104d2 = new ArrayList();
            it16 = c0500eM1441d32.iterator();
            while (it16.hasNext()) {
                c0104d2.add(((C0499d) it16.next()).m963c(classLoader));
            }
        } catch (Throwable th4) {
            c0104d2 = new C0104d(th4);
        }
        thM246a2 = AbstractC0105e.m246a(c0104d2);
        if (thM246a2 != null) {
            AbstractC0731a.m1387d("quick add dexkit address menu create scan fail", thM246a2);
        }
        z3 = c0104d2 instanceof C0104d;
        ?? r82 = c0104d2;
        if (z3) {
            r82 = r22;
        }
        ArrayList arrayList192 = new ArrayList();
        it12 = ((List) r82).iterator();
        while (it12.hasNext()) {
            Object next5 = it12.next();
            Class<?> cls16 = (Class) next5;
            if (cls3.isAssignableFrom(cls16)) {
                ArrayList arrayListM34j = C0034g.m34j(cls16);
                if (arrayListM34j.isEmpty()) {
                    cls5 = cls3;
                    it15 = it12;
                } else {
                    Iterator it28 = arrayListM34j.iterator();
                    while (it28.hasNext()) {
                        Class<?> type = ((Field) it28.next()).getType();
                        AbstractC0223g.m415b(type);
                        ArrayList<Field> arrayListM34j2 = C0034g.m34j(type);
                        if (!arrayListM34j2.isEmpty()) {
                            for (Field field : arrayListM34j2) {
                                cls5 = cls3;
                                it15 = it12;
                                if (AbstractC0307q.m538h0(field.getType().getName(), false, "com.tencent.mm.storage.") || AbstractC0307q.m538h0(field.getType().getName(), false, "com.tencent.mm.contact.")) {
                                    arrayList192.add(next5);
                                    break;
                                }
                                cls3 = cls5;
                                it12 = it15;
                            }
                        }
                        cls3 = cls3;
                        it12 = it12;
                    }
                    cls5 = cls3;
                    it15 = it12;
                }
            }
            cls3 = cls5;
            it12 = it15;
        }
        List listM276r02 = AbstractC0123k.m276r0(arrayList192, new C0032e(6));
        HashSet hashSet22 = new HashSet();
        ArrayList arrayList202 = new ArrayList();
        for (Object obj6 : listM276r02) {
            if (hashSet22.add(((Class) obj6).getName())) {
                arrayList202.add(obj6);
            }
        }
        listM277s02 = AbstractC0123k.m277s0(arrayList202, 8);
        if (listM277s02.isEmpty()) {
            ArrayList arrayList25 = new ArrayList();
            Iterator it29 = listM277s02.iterator();
            while (it29.hasNext()) {
                ArrayList arrayListM34j3 = C0034g.m34j((Class) it29.next());
                ArrayList arrayList26 = new ArrayList();
                for (Object obj7 : arrayListM34j3) {
                    Field field2 = (Field) obj7;
                    List list9 = listM277s02;
                    if (!field2.getType().getName().equals("java.lang.String") && !field2.getType().isPrimitive()) {
                        arrayList26.add(obj7);
                    }
                    listM277s02 = list9;
                }
                List list10 = listM277s02;
                ArrayList arrayList27 = new ArrayList(AbstractC0125m.m289c0(arrayList26));
                Iterator it30 = arrayList26.iterator();
                while (it30.hasNext()) {
                    arrayList27.add(((Field) it30.next()).getType().getName());
                }
                AbstractC0129q.m291e0(arrayList27, arrayList25);
                listM277s02 = list10;
            }
            list2 = listM277s02;
            Set setM265B03 = AbstractC0123k.m265B0(arrayList25);
            if (!setM265B03.isEmpty()) {
                ArrayList arrayList28 = new ArrayList();
                Iterator it31 = list2.iterator();
                while (it31.hasNext()) {
                    ArrayList arrayListM34j4 = C0034g.m34j((Class) it31.next());
                    ArrayList arrayList29 = new ArrayList(AbstractC0125m.m289c0(arrayListM34j4));
                    Iterator it32 = arrayListM34j4.iterator();
                    while (it32.hasNext()) {
                        arrayList29.add(((Field) it32.next()).getType().getName());
                    }
                    AbstractC0129q.m291e0(arrayList29, arrayList28);
                }
                ArrayList arrayList30 = new ArrayList();
                for (Object obj8 : arrayList28) {
                    String str3 = (String) obj8;
                    AbstractC0223g.m415b(str3);
                    if (AbstractC0307q.m538h0(str3, false, "com.tencent.mm.ui.contact") || AbstractC0299i.m511i0(str3, "Address", false)) {
                        arrayList30.add(obj8);
                    }
                }
                c4 = 0;
                Set setM265B04 = AbstractC0123k.m265B0(arrayList30);
                try {
                    C0353a c0353a5 = new C0353a(0);
                    C0361a c0361a4 = new C0361a();
                    C0363c c0363c3 = new C0363c();
                    C0362b c0362b3 = new C0362b();
                    C0362b.m622b0(c0362b3, "onMMMenuItemSelected");
                    c0362b3.m625c0(cls72.getName(), cls2.getName());
                    c0363c3.m627Y(c0362b3);
                    c0361a4.f848e = c0363c3;
                    c0353a5.f828f = c0361a4;
                    C0500e c0500eM1441d4 = dexKitBridge.m1441d(c0353a5);
                    c0104d3 = new ArrayList();
                    Iterator it33 = c0500eM1441d4.iterator();
                    while (it33.hasNext()) {
                        c0104d3.add(((C0499d) it33.next()).m963c(classLoader));
                    }
                } catch (Throwable th5) {
                    c0104d3 = new C0104d(th5);
                }
                Throwable thM246a4 = AbstractC0105e.m246a(c0104d3);
                if (thM246a4 != null) {
                    AbstractC0731a.m1387d("quick add dexkit address menu click scan fail", thM246a4);
                }
                boolean z4 = c0104d3 instanceof C0104d;
                ?? r1 = c0104d3;
                if (z4) {
                    r1 = r22;
                }
                ArrayList arrayList31 = new ArrayList();
                for (Object obj9 : (List) r1) {
                    ArrayList arrayListM34j5 = C0034g.m34j((Class) obj9);
                    if (!arrayListM34j5.isEmpty()) {
                        Iterator it34 = arrayListM34j5.iterator();
                        while (true) {
                            if (!it34.hasNext()) {
                                break;
                            }
                            if (setM265B03.contains(((Field) it34.next()).getType().getName())) {
                                if (!setM265B04.isEmpty()) {
                                    if (!arrayListM34j5.isEmpty()) {
                                        Iterator it35 = arrayListM34j5.iterator();
                                        while (it35.hasNext()) {
                                            if (setM265B04.contains(((Field) it35.next()).getType().getName())) {
                                            }
                                        }
                                    }
                                }
                                arrayList31.add(obj9);
                                break;
                            }
                        }
                    }
                }
                List listM276r03 = AbstractC0123k.m276r0(arrayList31, new C0017Q(setM265B03, setM265B04, 0));
                HashSet hashSet4 = new HashSet();
                ArrayList arrayList32 = new ArrayList();
                for (Object obj10 : listM276r03) {
                    if (hashSet4.add(((Class) obj10).getName())) {
                        arrayList32.add(obj10);
                    }
                }
                M277s0 = AbstractC0123k.m277s0(arrayList32, 8);
            }
            listM277s03 = AbstractC0123k.m277s0(listM281w022, 12);
            listM277s04 = AbstractC0123k.m277s0(list52, 12);
            listM277s05 = AbstractC0123k.m277s0(list72, 32);
            listM277s06 = AbstractC0123k.m277s0(list62, 32);
            listM277s07 = AbstractC0123k.m277s0(listM281w052, 48);
            listM277s08 = AbstractC0123k.m277s0(listM281w062, 32);
            listM277s09 = AbstractC0123k.m277s0(listM281w072, 32);
            listM277s010 = AbstractC0123k.m277s0(list52, 12);
            ArrayList arrayList212 = new ArrayList(AbstractC0125m.m289c0(list2));
            it13 = list2.iterator();
            while (it13.hasNext()) {
                arrayList212.add(((Class) it13.next()).getName());
            }
            listM277s011 = AbstractC0123k.m277s0(AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList212)), 8);
            ArrayList arrayList222 = new ArrayList(AbstractC0125m.m289c0(M277s0));
            it14 = M277s0.iterator();
            while (it14.hasNext()) {
                arrayList222.add(((Class) it14.next()).getName());
            }
            listM277s012 = AbstractC0123k.m277s0(AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList222)), 8);
            C0014N c0014n2 = new C0014N(listM277s03, listM277s04, listM277s05, listM277s06, listM277s07, listM277s08, listM277s09, listM277s010, listM277s011, listM277s012);
            if (((listM277s03.isEmpty() && listM277s04.isEmpty() && listM277s05.isEmpty() && listM277s06.isEmpty() && listM277s07.isEmpty() && listM277s08.isEmpty() && listM277s09.isEmpty() && listM277s010.isEmpty() && listM277s011.isEmpty() && listM277s012.isEmpty()) ? c4 : c3) != 0) {
                return c0014n2;
            }
            AbstractC0731a.m1387d("quick add dexkit unresolved empty");
            return null;
        }
        list2 = listM277s02;
        M277s0 = r22;
        c4 = 0;
        listM277s03 = AbstractC0123k.m277s0(listM281w022, 12);
        listM277s04 = AbstractC0123k.m277s0(list52, 12);
        listM277s05 = AbstractC0123k.m277s0(list72, 32);
        listM277s06 = AbstractC0123k.m277s0(list62, 32);
        listM277s07 = AbstractC0123k.m277s0(listM281w052, 48);
        listM277s08 = AbstractC0123k.m277s0(listM281w062, 32);
        listM277s09 = AbstractC0123k.m277s0(listM281w072, 32);
        listM277s010 = AbstractC0123k.m277s0(list52, 12);
        ArrayList arrayList2122 = new ArrayList(AbstractC0125m.m289c0(list2));
        it13 = list2.iterator();
        while (it13.hasNext()) {
        }
        listM277s011 = AbstractC0123k.m277s0(AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList2122)), 8);
        ArrayList arrayList2222 = new ArrayList(AbstractC0125m.m289c0(M277s0));
        it14 = M277s0.iterator();
        while (it14.hasNext()) {
        }
        listM277s012 = AbstractC0123k.m277s0(AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList2222)), 8);
        C0014N c0014n22 = new C0014N(listM277s03, listM277s04, listM277s05, listM277s06, listM277s07, listM277s08, listM277s09, listM277s010, listM277s011, listM277s012);
        if (((listM277s03.isEmpty() && listM277s04.isEmpty() && listM277s05.isEmpty() && listM277s06.isEmpty() && listM277s07.isEmpty() && listM277s08.isEmpty() && listM277s09.isEmpty() && listM277s010.isEmpty() && listM277s011.isEmpty() && listM277s012.isEmpty()) ? c4 : c3) != 0) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:126:0x0089 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:127:0x0083 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:134:0x0113 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [E0.d] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r5v0, types: [F0.s] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v2, types: [E0.d] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: f */
    private final Object m54f(Object obj) {
        ?? r5;
        ?? c0104d;
        Object c0104d2;
        ?? c0104d3;
        DexKitBridge dexKitBridge = (DexKitBridge) obj;
        AbstractC0223g.m418e(dexKitBridge, "bridge");
        ClassLoader classLoader = this.f232b.getClassLoader();
        AbstractC0223g.m417d(classLoader, "getClassLoader(...)");
        List listM252Z = AbstractC0120h.m252Z(new String[]{"MvvmContactListUI", "ContactList", "SelectContact"});
        ArrayList arrayList = new ArrayList();
        Iterator it = listM252Z.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            r5 = C0131s.f426a;
            if (!zHasNext) {
                break;
            }
            String str = (String) it.next();
            try {
                C0353a c0353a = new C0353a(0);
                c0353a.m608Z("com.tencent.mm.ui", "com.tencent.mm.ui.mvvm", "com.tencent.mm.ui.contact");
                C0361a c0361a = new C0361a();
                c0361a.m617Y(str, 1, false);
                c0353a.f828f = c0361a;
                C0500e c0500eM1441d = dexKitBridge.m1441d(c0353a);
                c0104d3 = new ArrayList(AbstractC0125m.m289c0(c0500eM1441d));
                Iterator it2 = c0500eM1441d.iterator();
                while (it2.hasNext()) {
                    c0104d3.add(((C0499d) it2.next()).m962b().f1863a);
                }
            } catch (Throwable th) {
                c0104d3 = new C0104d(th);
            }
            if (!(c0104d3 instanceof C0104d)) {
                r5 = c0104d3;
            }
            AbstractC0129q.m291e0((Iterable) r5, arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            String str2 = (String) obj2;
            if (AbstractC0299i.m511i0(str2, "Contact", true) || AbstractC0299i.m511i0(str2, "MvvmContactListUI", false)) {
                arrayList2.add(obj2);
            }
        }
        List listM281w0 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList2));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("com.tencent.mm.view.recyclerview.WxRecyclerAdapter");
        try {
            C0353a c0353a2 = new C0353a(0);
            c0353a2.m608Z("com.tencent.mm.view.recyclerview", "com.tencent.mm.ui.mvvm.uic.conversation.recent");
            C0361a c0361a2 = new C0361a();
            c0361a2.m617Y("WxRecyclerAdapter", 1, false);
            c0353a2.f828f = c0361a2;
            C0500e c0500eM1441d2 = dexKitBridge.m1441d(c0353a2);
            c0104d = new ArrayList(AbstractC0125m.m289c0(c0500eM1441d2));
            Iterator it3 = c0500eM1441d2.iterator();
            while (it3.hasNext()) {
                c0104d.add(((C0499d) it3.next()).m962b().f1863a);
            }
        } catch (Throwable th2) {
            c0104d = new C0104d(th2);
        }
        ?? r52 = r5;
        if (!(c0104d instanceof C0104d)) {
            r52 = c0104d;
        }
        AbstractC0129q.m291e0((Iterable) r52, linkedHashSet);
        ArrayList arrayList3 = new ArrayList();
        Iterator it4 = linkedHashSet.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            try {
                c0104d2 = Class.forName((String) it4.next(), false, classLoader);
            } catch (Throwable th3) {
                c0104d2 = new C0104d(th3);
            }
            Class cls = (Class) (c0104d2 instanceof C0104d ? null : c0104d2);
            if (cls != null) {
                arrayList3.add(cls);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList3) {
            ArrayList<Field> arrayListM35k = C0034g.m35k((Class) obj3);
            if (!arrayListM35k.isEmpty()) {
                for (Field field : arrayListM35k) {
                    if (!Modifier.isStatic(field.getModifiers()) && (List.class.isAssignableFrom(field.getType()) || AbstractC0223g.m414a(field.getName(), "data"))) {
                        arrayList4.add(obj3);
                        break;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList5 = new ArrayList();
        for (Object obj4 : arrayList4) {
            if (hashSet.add(((Class) obj4).getName())) {
                arrayList5.add(obj4);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ArrayList arrayListM35k2 = C0034g.m35k((Class) it5.next());
            ArrayList arrayList7 = new ArrayList();
            for (Object obj5 : arrayListM35k2) {
                if (!Modifier.isStatic(((Field) obj5).getModifiers())) {
                    arrayList7.add(obj5);
                }
            }
            ArrayList arrayList8 = new ArrayList();
            for (Object obj6 : arrayList7) {
                Field field2 = (Field) obj6;
                if (List.class.isAssignableFrom(field2.getType()) || AbstractC0223g.m414a(field2.getName(), "data")) {
                    arrayList8.add(obj6);
                }
            }
            List listM276r0 = AbstractC0123k.m276r0(arrayList8, new C0033f(8, new C0032e(7)));
            ArrayList arrayList9 = new ArrayList(AbstractC0125m.m289c0(listM276r0));
            Iterator it6 = listM276r0.iterator();
            while (it6.hasNext()) {
                arrayList9.add(((Field) it6.next()).getName());
            }
            AbstractC0129q.m291e0(AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList9)), arrayList6);
        }
        List listM281w02 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList6));
        if (listM281w02.isEmpty()) {
            listM281w02 = AbstractC0079h.m167E("data");
        }
        if (listM281w0.isEmpty()) {
            listM281w0 = AbstractC0079h.m167E("com.tencent.mm.ui.mvvm.MvvmContactListUI");
        }
        List listM277s0 = AbstractC0123k.m277s0(listM281w0, 6);
        ArrayList arrayList10 = new ArrayList(AbstractC0125m.m289c0(arrayList5));
        Iterator it7 = arrayList5.iterator();
        while (it7.hasNext()) {
            arrayList10.add(((Class) it7.next()).getName());
        }
        boolean zIsEmpty = arrayList10.isEmpty();
        List listM167E = arrayList10;
        if (zIsEmpty) {
            listM167E = AbstractC0079h.m167E("com.tencent.mm.view.recyclerview.WxRecyclerAdapter");
        }
        List listM277s02 = AbstractC0123k.m277s0(AbstractC0123k.m281w0(AbstractC0123k.m264A0(listM167E)), 8);
        List listM277s03 = AbstractC0123k.m277s0(listM281w02, 8);
        C0020U c0020u = new C0020U(listM277s0, listM277s02, listM277s03, AbstractC0120h.m252Z(new String[]{"llt", "ovi"}));
        if (listM277s0.isEmpty() || listM277s02.isEmpty() || listM277s03.isEmpty()) {
            return null;
        }
        return c0020u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:100:0x00b5 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:99:0x0063 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [E0.d] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v35, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v4, types: [E0.d] */
    /* JADX WARN: Type inference failed for: r7v41, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX INFO: renamed from: g */
    private final Object m55g(Object obj) {
        ?? c0104d;
        ?? c0104d2;
        Object c0104d3;
        Object c0104d4;
        DexKitBridge dexKitBridge = (DexKitBridge) obj;
        AbstractC0223g.m418e(dexKitBridge, "bridge");
        ClassLoader classLoader = this.f232b.getClassLoader();
        AbstractC0223g.m417d(classLoader, "getClassLoader(...)");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            C0353a c0353a = new C0353a(0);
            c0353a.m608Z("com.tencent.mm.ui.tools");
            C0361a c0361a = new C0361a();
            c0361a.m617Y("ActionBarSearchView", 1, false);
            c0353a.f828f = c0361a;
            C0500e c0500eM1441d = dexKitBridge.m1441d(c0353a);
            c0104d = new ArrayList(AbstractC0125m.m289c0(c0500eM1441d));
            Iterator it = c0500eM1441d.iterator();
            while (it.hasNext()) {
                c0104d.add(((C0499d) it.next()).m962b().f1863a);
            }
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        Object obj2 = C0131s.f426a;
        boolean z2 = c0104d instanceof C0104d;
        ?? r7 = c0104d;
        if (z2) {
            r7 = obj2;
        }
        AbstractC0129q.m291e0((Iterable) r7, linkedHashSet);
        try {
            C0353a c0353a2 = new C0353a(0);
            c0353a2.m608Z("com.tencent.mm.ui");
            C0361a c0361a2 = new C0361a();
            c0361a2.m617Y("SearchView", 1, false);
            c0353a2.f828f = c0361a2;
            C0500e c0500eM1441d2 = dexKitBridge.m1441d(c0353a2);
            c0104d2 = new ArrayList(AbstractC0125m.m289c0(c0500eM1441d2));
            Iterator it2 = c0500eM1441d2.iterator();
            while (it2.hasNext()) {
                c0104d2.add(((C0499d) it2.next()).m962b().f1863a);
            }
        } catch (Throwable th2) {
            c0104d2 = new C0104d(th2);
        }
        boolean z3 = c0104d2 instanceof C0104d;
        ?? r72 = c0104d2;
        if (z3) {
            r72 = obj2;
        }
        AbstractC0129q.m291e0((Iterable) r72, linkedHashSet);
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : linkedHashSet) {
            String str = (String) obj3;
            if (AbstractC0299i.m511i0(str, "ActionBarSearchView", false) || str.endsWith("SearchView") || AbstractC0299i.m511i0(str, ".tools.", true)) {
                arrayList.add(obj3);
            }
        }
        List listM281w0 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m276r0(arrayList, new C0033f(10, new C0032e(9)))));
        ArrayList<Class> arrayList2 = new ArrayList();
        Iterator it3 = listM281w0.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            try {
                c0104d4 = Class.forName((String) it3.next(), false, classLoader);
            } catch (Throwable th3) {
                c0104d4 = new C0104d(th3);
            }
            Class cls = (Class) (c0104d4 instanceof C0104d ? null : c0104d4);
            if (cls != null) {
                arrayList2.add(cls);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Class superclass : arrayList2) {
            ArrayList arrayList4 = new ArrayList();
            for (; superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                try {
                    Field[] declaredFields = superclass.getDeclaredFields();
                    AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
                    c0104d3 = AbstractC0120h.m262j0(declaredFields);
                } catch (Throwable th4) {
                    c0104d3 = new C0104d(th4);
                }
                if (c0104d3 instanceof C0104d) {
                    c0104d3 = obj2;
                }
                arrayList4.addAll((Collection) c0104d3);
            }
            ArrayList arrayList5 = new ArrayList();
            for (Object obj4 : arrayList4) {
                if (!Modifier.isStatic(((Field) obj4).getModifiers())) {
                    arrayList5.add(obj4);
                }
            }
            ArrayList arrayList6 = new ArrayList();
            for (Object obj5 : arrayList5) {
                Field field = (Field) obj5;
                if (EditText.class.isAssignableFrom(field.getType()) || AbstractC0299i.m511i0(field.getType().getName(), "ActionBarEditText", false) || field.getType().getName().endsWith("EditText")) {
                    arrayList6.add(obj5);
                }
            }
            List listM276r0 = AbstractC0123k.m276r0(arrayList6, new C0033f(9, new C0032e(8)));
            ArrayList arrayList7 = new ArrayList(AbstractC0125m.m289c0(listM276r0));
            Iterator it4 = listM276r0.iterator();
            while (it4.hasNext()) {
                arrayList7.add(((Field) it4.next()).getName());
            }
            AbstractC0129q.m291e0(AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList7)), arrayList3);
        }
        List listM281w02 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList3));
        List listM277s0 = AbstractC0123k.m277s0(listM281w0, 6);
        List listM277s02 = AbstractC0123k.m277s0(listM281w02, 8);
        C0021V c0021v = new C0021V(listM277s0, listM277s02);
        if (listM277s0.isEmpty() || listM277s02.isEmpty()) {
            return null;
        }
        return c0021v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0476 A[PHI: r0
  0x0476: PHI (r0v115 java.util.Iterator) = (r0v54 java.util.Iterator), (r0v104 java.util.Iterator) binds: [B:187:0x0474, B:379:0x0476] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x019b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0192  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object m56h(Object obj) {
        String str;
        List list;
        ArrayList arrayList;
        Object c0104d;
        ArrayList arrayList2;
        String str2;
        Object c0104d2;
        Throwable thM246a;
        C0353a c0353a;
        Object c0104d3;
        Object c0104d4;
        boolean z2;
        Iterator it;
        boolean z3;
        boolean z4;
        boolean z5;
        ArrayList<Field> arrayListM1a;
        boolean z6;
        List list2;
        ArrayList arrayList3;
        Object c0104d5;
        Object c0104d6;
        Object c0104d7;
        int i2 = 0;
        DexKitBridge dexKitBridge = (DexKitBridge) obj;
        AbstractC0223g.m418e(dexKitBridge, "bridge");
        ClassLoader classLoader = this.f232b.getClassLoader();
        AbstractC0223g.m417d(classLoader, "getClassLoader(...)");
        List list3 = C0024Y.f183a;
        Class clsM4d = C0024Y.m4d(classLoader, "com.tencent.mm.protocal.protobuf.SnsObject");
        Class clsM4d2 = C0024Y.m4d(classLoader, "com.tencent.mm.plugin.sns.storage.SnsInfo");
        Class clsM4d3 = C0024Y.m4d(classLoader, "com.tencent.mm.protocal.protobuf.TimeLineObject");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = C0024Y.f183a.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            List list4 = C0024Y.f183a;
            if (!zHasNext) {
                break;
            }
            Class clsM4d4 = C0024Y.m4d(classLoader, (String) it2.next());
            if (clsM4d4 != null) {
                linkedHashSet.add(clsM4d4);
            }
        }
        Iterator it3 = AbstractC0120h.m252Z(new String[]{"ImproveSnsTimelineUI", "ImproveMainUIC", "SnsTimelineUI"}).iterator();
        while (true) {
            str = "com.tencent.mm.plugin.sns.ui.improve.component";
            if (!it3.hasNext()) {
                break;
            }
            String str3 = (String) it3.next();
            try {
                C0353a c0353a2 = new C0353a(i2);
                c0353a2.m608Z("com.tencent.mm.plugin.sns.ui", "com.tencent.mm.plugin.sns.ui.improve", "com.tencent.mm.plugin.sns.ui.improve.component");
                C0361a c0361a = new C0361a();
                c0361a.m617Y(str3, 1, false);
                c0353a2.f828f = c0361a;
                Iterator it4 = dexKitBridge.m1441d(c0353a2).iterator();
                while (it4.hasNext()) {
                    linkedHashSet.add(((C0499d) it4.next()).m963c(classLoader));
                }
                c0104d7 = linkedHashSet;
            } catch (Throwable th) {
                c0104d7 = new C0104d(th);
            }
            Throwable thM246a2 = AbstractC0105e.m246a(c0104d7);
            if (thM246a2 != null) {
                AbstractC0731a.m1387d("sns dexkit timeline class scan fail", str3, thM246a2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : linkedHashSet) {
            Class cls = (Class) obj2;
            if (AbstractC0307q.m538h0(cls.getName(), false, "com.tencent.mm.plugin.sns.") && (AbstractC0299i.m511i0(cls.getName(), "Timeline", false) || AbstractC0299i.m511i0(cls.getName(), "ImproveMainUIC", false))) {
                arrayList4.add(obj2);
            }
        }
        List listM281w0 = C0131s.f426a;
        if (clsM4d == null) {
            list = listM281w0;
            arrayList = arrayList4;
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            List<String> listM252Z = AbstractC0120h.m252Z(new String[]{"SnsObject", "SnsInfo", "TimeLine", "Timeline", "SnsCore", "Improve", "Interaction", "getSnsInfoStorage"});
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            for (String str4 : listM252Z) {
                List list5 = listM281w0;
                try {
                    c0353a = new C0353a(0);
                    arrayList2 = arrayList4;
                } catch (Throwable th2) {
                    th = th2;
                    arrayList2 = arrayList4;
                }
                try {
                    c0353a.m608Z("com.tencent.mm.plugin.sns.model", "com.tencent.mm.plugin.sns.storage", "com.tencent.mm.plugin.sns.ui.improve", str);
                    C0361a c0361a2 = new C0361a();
                    str2 = str;
                    try {
                        c0361a2.m617Y(str4, 1, false);
                        c0353a.f828f = c0361a2;
                        Iterator it5 = dexKitBridge.m1441d(c0353a).iterator();
                        while (it5.hasNext()) {
                            linkedHashSet3.add(((C0499d) it5.next()).m963c(classLoader));
                        }
                        c0104d2 = linkedHashSet3;
                    } catch (Throwable th3) {
                        th = th3;
                        c0104d2 = new C0104d(th);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    str2 = str;
                    c0104d2 = new C0104d(th);
                    thM246a = AbstractC0105e.m246a(c0104d2);
                    if (thM246a == null) {
                    }
                    listM281w0 = list5;
                    arrayList4 = arrayList2;
                    str = str2;
                }
                thM246a = AbstractC0105e.m246a(c0104d2);
                if (thM246a == null) {
                    AbstractC0731a.m1387d("sns dexkit candidate class scan fail", str4, thM246a);
                }
                listM281w0 = list5;
                arrayList4 = arrayList2;
                str = str2;
            }
            list = listM281w0;
            arrayList = arrayList4;
            try {
                C0353a c0353a3 = new C0353a(1);
                C0362b c0362b = new C0362b();
                C0362b.m623e0(c0362b, AbstractC0120h.m252Z(new String[]{"getSnsInfoStorage", "SnsCore"}));
                c0353a3.f828f = c0362b;
                Iterator it6 = dexKitBridge.m1442e(c0353a3).iterator();
                while (it6.hasNext()) {
                    Class clsM4d5 = C0024Y.m4d(classLoader, ((C0505j) it6.next()).m1006b().f1869a);
                    if (clsM4d5 != null) {
                        linkedHashSet3.add(clsM4d5);
                    }
                }
                c0104d = linkedHashSet3;
            } catch (Throwable th5) {
                c0104d = new C0104d(th5);
            }
            Throwable thM246a3 = AbstractC0105e.m246a(c0104d);
            if (thM246a3 != null) {
                AbstractC0731a.m1387d("sns dexkit sns core method scan fail", thM246a3);
            }
            ArrayList arrayList5 = new ArrayList();
            for (Object obj3 : linkedHashSet3) {
                if (AbstractC0307q.m538h0(((Class) obj3).getName(), false, "com.tencent.mm.plugin.sns.")) {
                    arrayList5.add(obj3);
                }
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList6 = new ArrayList();
            for (Object obj4 : arrayList5) {
                if (hashSet.add(((Class) obj4).getName())) {
                    arrayList6.add(obj4);
                }
            }
            for (Object obj5 : AbstractC0123k.m277s0(arrayList6, 600)) {
                ArrayList<Method> arrayListM2b = C0024Y.m2b((Class) obj5);
                if (!arrayListM2b.isEmpty()) {
                    for (Method method : arrayListM2b) {
                        if (AbstractC0223g.m414a(method.getReturnType(), clsM4d)) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                            if (parameterTypes.length == 0 || (clsM4d2 != null && Arrays.equals(method.getParameterTypes(), new Class[]{clsM4d2}))) {
                                linkedHashSet2.add(obj5);
                                break;
                            }
                        }
                    }
                }
            }
            listM281w0 = AbstractC0123k.m281w0(linkedHashSet2);
        }
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        Iterator it7 = C0024Y.f184b.iterator();
        while (it7.hasNext()) {
            Class clsM4d6 = C0024Y.m4d(classLoader, (String) it7.next());
            if (clsM4d6 != null) {
                linkedHashSet4.add(clsM4d6);
            }
        }
        for (String str5 : AbstractC0120h.m252Z(new String[]{"SnsUserUI", "SnsCommentDetailUI"})) {
            try {
                C0353a c0353a4 = new C0353a(0);
                c0353a4.m608Z("com.tencent.mm.plugin.sns.ui");
                C0361a c0361a3 = new C0361a();
                c0361a3.m617Y(str5, 1, false);
                c0353a4.f828f = c0361a3;
                Iterator it8 = dexKitBridge.m1441d(c0353a4).iterator();
                while (it8.hasNext()) {
                    linkedHashSet4.add(((C0499d) it8.next()).m963c(classLoader));
                }
                c0104d6 = linkedHashSet4;
            } catch (Throwable th6) {
                c0104d6 = new C0104d(th6);
            }
            Throwable thM246a4 = AbstractC0105e.m246a(c0104d6);
            if (thM246a4 != null) {
                AbstractC0731a.m1387d("sns dexkit detail activity scan fail", str5, thM246a4);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj6 : linkedHashSet4) {
            if (AbstractC0307q.m538h0(((Class) obj6).getName(), false, "com.tencent.mm.plugin.sns.ui.")) {
                arrayList7.add(obj6);
            }
        }
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        Iterator it9 = C0024Y.f185c.iterator();
        while (it9.hasNext()) {
            Class clsM4d7 = C0024Y.m4d(classLoader, (String) it9.next());
            if (clsM4d7 != null) {
                linkedHashSet5.add(clsM4d7);
            }
        }
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        for (String str6 : AbstractC0120h.m252Z(new String[]{"Sns", "Album", "Self", "jo"})) {
            try {
                C0353a c0353a5 = new C0353a(0);
                c0353a5.m608Z("com.tencent.mm.plugin.sns.ui");
                C0361a c0361a4 = new C0361a();
                list2 = listM281w0;
                arrayList3 = arrayList7;
                try {
                    c0361a4.m617Y(str6, 1, false);
                    c0353a5.f828f = c0361a4;
                    Iterator it10 = dexKitBridge.m1441d(c0353a5).iterator();
                    while (it10.hasNext()) {
                        linkedHashSet6.add(((C0499d) it10.next()).m963c(classLoader));
                    }
                    c0104d5 = linkedHashSet6;
                } catch (Throwable th7) {
                    th = th7;
                    c0104d5 = new C0104d(th);
                }
            } catch (Throwable th8) {
                th = th8;
                list2 = listM281w0;
                arrayList3 = arrayList7;
            }
            Throwable thM246a5 = AbstractC0105e.m246a(c0104d5);
            if (thM246a5 != null) {
                AbstractC0731a.m1387d("sns dexkit self album adapter scan fail", str6, thM246a5);
            }
            listM281w0 = list2;
            arrayList7 = arrayList3;
        }
        List list6 = listM281w0;
        ArrayList arrayList8 = arrayList7;
        Iterator it11 = linkedHashSet6.iterator();
        while (it11.hasNext()) {
            Object next = it11.next();
            Class cls2 = (Class) next;
            if (BaseAdapter.class.isAssignableFrom(cls2) && AbstractC0307q.m538h0(cls2.getName(), false, "com.tencent.mm.plugin.sns.")) {
                ArrayList<Method> arrayListM2b2 = C0024Y.m2b(cls2);
                boolean zIsEmpty = arrayListM2b2.isEmpty();
                Class cls3 = Integer.TYPE;
                if (zIsEmpty) {
                    z2 = false;
                    if (arrayListM2b2.isEmpty()) {
                        for (Method method2 : arrayListM2b2) {
                            it = it11;
                            if (AbstractC0223g.m414a(method2.getName(), "getItem") && method2.getParameterTypes().length == 1 && AbstractC0223g.m414a(method2.getParameterTypes()[0], cls3)) {
                                z3 = true;
                                break;
                            }
                            it11 = it;
                        }
                        it = it11;
                        z3 = false;
                        if (arrayListM2b2.isEmpty()) {
                        }
                        arrayListM1a = C0024Y.m1a(cls2);
                        if (arrayListM1a.isEmpty()) {
                        }
                    } else {
                        it = it11;
                        z3 = false;
                        if (arrayListM2b2.isEmpty()) {
                            Iterator it12 = arrayListM2b2.iterator();
                            while (true) {
                                if (!it12.hasNext()) {
                                    z4 = false;
                                    z5 = false;
                                    break;
                                }
                                Method method3 = (Method) it12.next();
                                if (AbstractC0223g.m414a(method3.getName(), "getView") && method3.getParameterTypes().length == 3) {
                                    z4 = false;
                                    if (AbstractC0223g.m414a(method3.getParameterTypes()[0], cls3) && View.class.isAssignableFrom(method3.getParameterTypes()[1]) && ViewGroup.class.isAssignableFrom(method3.getParameterTypes()[2])) {
                                        z5 = true;
                                        break;
                                    }
                                }
                            }
                        } else {
                            z5 = false;
                            z4 = false;
                        }
                        arrayListM1a = C0024Y.m1a(cls2);
                        if (arrayListM1a.isEmpty()) {
                            for (Field field : arrayListM1a) {
                                if (List.class.isAssignableFrom(field.getType()) || AbstractC0223g.m414a(field.getName(), "e")) {
                                    z6 = true;
                                    break;
                                }
                            }
                            z6 = z4;
                            if (!z2) {
                            }
                        } else {
                            z6 = z4;
                            if (!z2 && z3 && z5 && z6) {
                                linkedHashSet5.add(next);
                            }
                        }
                    }
                } else {
                    for (Method method4 : arrayListM2b2) {
                        if (AbstractC0223g.m414a(method4.getName(), "getCount")) {
                            Class<?>[] parameterTypes2 = method4.getParameterTypes();
                            AbstractC0223g.m417d(parameterTypes2, "getParameterTypes(...)");
                            if (parameterTypes2.length == 0 && AbstractC0223g.m414a(method4.getReturnType(), cls3)) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    z2 = false;
                    if (arrayListM2b2.isEmpty()) {
                    }
                }
            } else {
                it = it11;
            }
            it11 = it;
        }
        List listM281w02 = AbstractC0123k.m281w0(linkedHashSet5);
        try {
            C0353a c0353a6 = new C0353a(1);
            c0353a6.f827e = AbstractC0120h.m262j0(new String[]{"com.tencent.mm.plugin.sns.ui.listener"});
            C0362b c0362b2 = new C0362b();
            C0362b.m623e0(c0362b2, AbstractC0120h.m252Z(new String[]{"MicroMsg.TimelineOnCreateContextMenuListener", "onMMCreateContextMenu error"}));
            c0353a6.f828f = c0362b2;
            C0506k<C0505j> c0506kM1442e = dexKitBridge.m1442e(c0353a6);
            ArrayList arrayList9 = new ArrayList(AbstractC0125m.m289c0(c0506kM1442e));
            for (C0505j c0505j : c0506kM1442e) {
                arrayList9.add(new C0023X(c0505j.m1006b().f1869a, c0505j.m1006b().f1870b, c0505j.m1007c()));
            }
            c0104d3 = AbstractC0123k.m277s0(AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList9)), 4);
        } catch (Throwable th9) {
            c0104d3 = new C0104d(th9);
        }
        Throwable thM246a6 = AbstractC0105e.m246a(c0104d3);
        if (thM246a6 != null) {
            AbstractC0731a.m1387d("sns dexkit context menu create scan fail", thM246a6);
        }
        if (c0104d3 instanceof C0104d) {
            c0104d3 = list;
        }
        List list7 = (List) c0104d3;
        try {
            C0353a c0353a7 = new C0353a(1);
            c0353a7.f827e = AbstractC0120h.m262j0(new String[]{"com.tencent.mm.plugin.sns.ui.listener"});
            C0362b c0362b3 = new C0362b();
            C0362b.m623e0(c0362b3, AbstractC0120h.m252Z(new String[]{"delete comment fail!!! snsInfo is null", "send photo fail, mediaObj is null"}));
            c0353a7.f828f = c0362b3;
            C0506k<C0505j> c0506kM1442e2 = dexKitBridge.m1442e(c0353a7);
            ArrayList arrayList10 = new ArrayList(AbstractC0125m.m289c0(c0506kM1442e2));
            for (C0505j c0505j2 : c0506kM1442e2) {
                arrayList10.add(new C0023X(c0505j2.m1006b().f1869a, c0505j2.m1006b().f1870b, c0505j2.m1007c()));
            }
            c0104d4 = AbstractC0123k.m277s0(AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList10)), 4);
        } catch (Throwable th10) {
            c0104d4 = new C0104d(th10);
        }
        Throwable thM246a7 = AbstractC0105e.m246a(c0104d4);
        if (thM246a7 != null) {
            AbstractC0731a.m1387d("sns dexkit context menu select scan fail", thM246a7);
        }
        if (c0104d4 instanceof C0104d) {
            c0104d4 = list;
        }
        List list8 = (List) c0104d4;
        ArrayList arrayList11 = new ArrayList(AbstractC0125m.m289c0(arrayList));
        Iterator it13 = arrayList.iterator();
        while (it13.hasNext()) {
            arrayList11.add(((Class) it13.next()).getName());
        }
        List listM277s0 = AbstractC0123k.m277s0(AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList11)), 8);
        ArrayList arrayList12 = new ArrayList(AbstractC0125m.m289c0(list6));
        Iterator it14 = list6.iterator();
        while (it14.hasNext()) {
            arrayList12.add(((Class) it14.next()).getName());
        }
        List listM277s02 = AbstractC0123k.m277s0(AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList12)), 24);
        ArrayList arrayList13 = new ArrayList(AbstractC0125m.m289c0(arrayList8));
        Iterator it15 = arrayList8.iterator();
        while (it15.hasNext()) {
            arrayList13.add(((Class) it15.next()).getName());
        }
        List listM277s03 = AbstractC0123k.m277s0(AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList13)), 6);
        ArrayList arrayList14 = new ArrayList(AbstractC0125m.m289c0(listM281w02));
        Iterator it16 = listM281w02.iterator();
        while (it16.hasNext()) {
            arrayList14.add(((Class) it16.next()).getName());
        }
        List listM277s04 = AbstractC0123k.m277s0(AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList14)), 8);
        C0022W c0022w = new C0022W(listM277s0, listM277s02, listM277s03, listM277s04, C0024Y.m3c(clsM4d2, C0024Y.f186d), C0024Y.m3c(clsM4d2, C0024Y.f187e), C0024Y.m3c(clsM4d2, C0024Y.f188f), C0024Y.m3c(clsM4d3, C0024Y.f189g), C0024Y.m3c(clsM4d, C0024Y.f190h), C0024Y.m3c(clsM4d, C0024Y.f191i), C0024Y.m3c(clsM4d, C0024Y.f192j), C0024Y.m3c(clsM4d, C0024Y.f193k), C0024Y.m3c(clsM4d, C0024Y.f194l), C0024Y.m3c(clsM4d, C0024Y.f195m), C0024Y.m3c(clsM4d, C0024Y.f196n), list7, list8);
        AbstractC0731a.m1387d("sns dexkit resolved", "timeline=".concat(AbstractC0123k.m271m0(listM277s0, ",", null, null, null, 62)), "provider=".concat(AbstractC0123k.m271m0(AbstractC0123k.m277s0(listM277s02, 6), ",", null, null, null, 62)), "detail=".concat(AbstractC0123k.m271m0(listM277s03, ",", null, null, null, 62)), "selfAdapter=".concat(AbstractC0123k.m271m0(listM277s04, ",", null, null, null, 62)));
        if (listM277s0.isEmpty() && listM277s02.isEmpty() && listM277s03.isEmpty() && listM277s04.isEmpty()) {
            return null;
        }
        return c0022w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:448:0x01fe */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:449:0x01f7 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:559:0x0980 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0322 A[PHI: r4
  0x0322: PHI (r4v91 boolean) = (r4v66 boolean), (r4v67 boolean) binds: [B:119:0x0320, B:478:0x0322] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0365 A[PHI: r4
  0x0365: PHI (r4v90 boolean) = (r4v74 boolean), (r4v75 boolean) binds: [B:134:0x0363, B:470:0x0365] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x07f1  */
    /* JADX WARN: Type inference failed for: r0v113 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r20v0, types: [F0.s] */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r3v13, types: [E0.d] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v84 */
    /* JADX WARN: Type inference failed for: r4v100, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v96, types: [E0.d] */
    /* JADX WARN: Type inference failed for: r4v97 */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object m57i(Object obj) {
        String str;
        ?? r20;
        String str2;
        char c2;
        Class cls;
        Object c0104d;
        ?? M281w0;
        ?? c0104d2;
        Object c0104d3;
        String str3;
        ArrayList arrayList;
        Field[] fieldArr;
        String str4;
        Iterator it;
        Iterator it2;
        ArrayList arrayList2;
        ArrayList<Method> arrayList3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int length;
        String[] strArr;
        ?? c0104d4;
        Object c0104d5;
        int i2 = 0;
        DexKitBridge dexKitBridge = (DexKitBridge) obj;
        AbstractC0223g.m418e(dexKitBridge, "bridge");
        ClassLoader classLoader = this.f232b.getClassLoader();
        AbstractC0223g.m417d(classLoader, "getClassLoader(...)");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it3 = AbstractC0120h.m252Z(new String[]{"com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingNewUI", "com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI"}).iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            try {
                c0104d5 = Class.forName((String) it3.next(), false, classLoader);
            } catch (Throwable th) {
                c0104d5 = new C0104d(th);
            }
            Class cls2 = (Class) (c0104d5 instanceof C0104d ? null : c0104d5);
            if (cls2 != null) {
                Field[] declaredFields = cls2.getDeclaredFields();
                AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
                ArrayList arrayList4 = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    arrayList4.add(field.getType());
                }
                for (Object obj2 : arrayList4) {
                    Class cls3 = (Class) obj2;
                    AbstractC0223g.m415b(cls3);
                    if (!C0034g.m15F(cls3)) {
                        linkedHashSet.add(obj2);
                    }
                }
            }
        }
        int i3 = 10;
        int i4 = 8;
        Iterator it4 = AbstractC0123k.m281w0(linkedHashSet).iterator();
        while (true) {
            str = "getItem";
            if (!it4.hasNext()) {
                break;
            }
            ArrayList arrayListM40p = C0034g.m40p((Class) it4.next());
            ArrayList arrayList5 = new ArrayList();
            for (Object obj3 : arrayListM40p) {
                Method method = (Method) obj3;
                if (AbstractC0223g.m414a(method.getName(), "getItem") && method.getParameterTypes().length == 1) {
                    arrayList5.add(obj3);
                }
            }
            ArrayList arrayList6 = new ArrayList(AbstractC0125m.m289c0(arrayList5));
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                arrayList6.add(((Method) it5.next()).getReturnType());
            }
            for (Object obj4 : arrayList6) {
                Class cls4 = (Class) obj4;
                AbstractC0223g.m415b(cls4);
                if (!C0034g.m15F(cls4)) {
                    linkedHashSet.add(obj4);
                }
            }
        }
        List listM281w0 = AbstractC0123k.m281w0(linkedHashSet);
        ArrayList arrayList7 = new ArrayList(AbstractC0125m.m289c0(listM281w0));
        Iterator it6 = listM281w0.iterator();
        while (it6.hasNext()) {
            arrayList7.add(((Class) it6.next()).getName());
        }
        Set setM265B0 = AbstractC0123k.m265B0(arrayList7);
        String[] strArr2 = {"com.tencent.mm.plugin.clean", "com.tencent.mm.ui.vas", "wp1", "vp1", "up1", "tp1", "xs1", "bu1", "zu1", "cw1", "av1", "bv1", "cv1", "dv1", "ew1", "fw1"};
        List listM252Z = AbstractC0120h.m252Z(new String[]{"clean", "Clean", "Chatting", "fileindex", "BaseAdapter", "ListAdapter", "s2", "u2", "i2", "l4", ".a", "a", ".c", "c"});
        ArrayList arrayList8 = new ArrayList();
        Iterator it7 = listM252Z.iterator();
        while (true) {
            boolean zHasNext = it7.hasNext();
            r20 = C0131s.f426a;
            if (!zHasNext) {
                break;
            }
            String str5 = (String) it7.next();
            try {
                C0353a c0353a = new C0353a(i2);
                c0353a.m608Z((String[]) Arrays.copyOf(strArr2, 16));
                C0361a c0361a = new C0361a();
                strArr = strArr2;
                try {
                    c0361a.m617Y(str5, 1, false);
                    c0353a.f828f = c0361a;
                    C0500e c0500eM1441d = dexKitBridge.m1441d(c0353a);
                    c0104d4 = new ArrayList();
                    Iterator it8 = c0500eM1441d.iterator();
                    while (it8.hasNext()) {
                        c0104d4.add(((C0499d) it8.next()).m963c(classLoader));
                    }
                } catch (Throwable th2) {
                    th = th2;
                    c0104d4 = new C0104d(th);
                }
            } catch (Throwable th3) {
                th = th3;
                strArr = strArr2;
            }
            if (!(c0104d4 instanceof C0104d)) {
                r20 = c0104d4;
            }
            AbstractC0129q.m291e0((Iterable) r20, arrayList8);
            strArr2 = strArr;
            i2 = 0;
        }
        ArrayList arrayList9 = new ArrayList();
        Iterator it9 = arrayList8.iterator();
        while (true) {
            str2 = "com.tencent.mm.plugin.clean";
            c2 = 2;
            if (!it9.hasNext()) {
                break;
            }
            Object next = it9.next();
            String name = ((Class) next).getName();
            if (AbstractC0307q.m538h0(name, false, "com.tencent.mm.plugin.clean") || AbstractC0307q.m538h0(name, false, "com.tencent.mm.ui.vas") || (2 <= (length = AbstractC0299i.m528z0(name).length()) && length < 5)) {
                arrayList9.add(next);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList10 = new ArrayList();
        for (Object obj5 : arrayList9) {
            if (hashSet.add(((Class) obj5).getName())) {
                arrayList10.add(obj5);
            }
        }
        ArrayList arrayListM273o0 = AbstractC0123k.m273o0(listM281w0, AbstractC0123k.m277s0(arrayList10, 1200));
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList11 = new ArrayList();
        for (Object obj6 : arrayListM273o0) {
            if (hashSet2.add(((Class) obj6).getName())) {
                arrayList11.add(obj6);
            }
        }
        ArrayList arrayList12 = new ArrayList();
        Iterator it10 = arrayList11.iterator();
        while (it10.hasNext()) {
            Object next2 = it10.next();
            char c3 = c2;
            Class cls5 = (Class) next2;
            if (ListAdapter.class.isAssignableFrom(cls5)) {
                ArrayList<Method> arrayListM40p2 = C0034g.m40p(cls5);
                boolean zIsEmpty = arrayListM40p2.isEmpty();
                it2 = it10;
                Class cls6 = Integer.TYPE;
                if (zIsEmpty) {
                    arrayList2 = arrayList11;
                    arrayList3 = arrayListM40p2;
                    z2 = false;
                    if (arrayList3.isEmpty()) {
                        for (Method method2 : arrayList3) {
                            if (AbstractC0223g.m414a(method2.getName(), "getItem")) {
                                z3 = z2;
                                if (method2.getParameterTypes().length == 1 && AbstractC0223g.m414a(method2.getParameterTypes()[0], cls6)) {
                                    z4 = true;
                                    break;
                                }
                            } else {
                                z3 = z2;
                            }
                            z2 = z3;
                        }
                        z3 = z2;
                        z4 = false;
                        if (arrayList3.isEmpty()) {
                        }
                    } else {
                        z3 = z2;
                        z4 = false;
                        if (arrayList3.isEmpty()) {
                            for (Method method3 : arrayList3) {
                                z5 = z4;
                                if (AbstractC0223g.m414a(method3.getName(), "getView") && method3.getParameterTypes().length == 3 && AbstractC0223g.m414a(method3.getParameterTypes()[0], cls6) && View.class.isAssignableFrom(method3.getParameterTypes()[1]) && ViewGroup.class.isAssignableFrom(method3.getParameterTypes()[c3])) {
                                    z6 = true;
                                    break;
                                }
                                z4 = z5;
                            }
                            z5 = z4;
                            z6 = false;
                            if (!z3) {
                            }
                        } else {
                            z5 = z4;
                            z6 = false;
                            if (!z3 && z5 && z6) {
                                arrayList12.add(next2);
                            }
                        }
                    }
                } else {
                    for (Method method4 : arrayListM40p2) {
                        arrayList2 = arrayList11;
                        arrayList3 = arrayListM40p2;
                        if (AbstractC0223g.m414a(method4.getName(), "getCount")) {
                            Class<?>[] parameterTypes = method4.getParameterTypes();
                            AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                            if (parameterTypes.length == 0 && AbstractC0223g.m414a(method4.getReturnType(), cls6)) {
                                z2 = true;
                                break;
                            }
                        }
                        arrayList11 = arrayList2;
                        arrayListM40p2 = arrayList3;
                    }
                    arrayList2 = arrayList11;
                    arrayList3 = arrayListM40p2;
                    z2 = false;
                    if (arrayList3.isEmpty()) {
                    }
                }
            } else {
                it2 = it10;
                arrayList2 = arrayList11;
            }
            c2 = c3;
            it10 = it2;
            arrayList11 = arrayList2;
        }
        ArrayList arrayList13 = arrayList11;
        ArrayList arrayList14 = new ArrayList(AbstractC0125m.m289c0(arrayList12));
        Iterator it11 = arrayList12.iterator();
        while (true) {
            boolean zHasNext2 = it11.hasNext();
            cls = Void.TYPE;
            if (!zHasNext2) {
                break;
            }
            Class cls7 = (Class) it11.next();
            String name2 = cls7.getName();
            int i5 = AbstractC0307q.m538h0(name2, false, str2) ? 8 : 0;
            Iterator it12 = it11;
            String strM525w0 = AbstractC0299i.m525w0(name2);
            String str6 = str2;
            Pattern patternCompile = Pattern.compile("[a-z]{1,2}\\d?");
            AbstractC0223g.m417d(patternCompile, "compile(...)");
            if (patternCompile.matcher(strM525w0).matches()) {
                i5 += 4;
            }
            if (AbstractC0120h.m263k0(new String[]{"s2", "u2"}).contains(AbstractC0299i.m525w0(name2))) {
                i5 += 10;
            }
            Field[] declaredFields2 = cls7.getDeclaredFields();
            AbstractC0223g.m417d(declaredFields2, "getDeclaredFields(...)");
            int length2 = declaredFields2.length;
            int i6 = 0;
            while (i6 < length2) {
                Field field2 = declaredFields2[i6];
                Field[] fieldArr2 = declaredFields2;
                int i7 = length2;
                int i8 = i6;
                if (AbstractC0299i.m511i0(field2.getType().getName(), "Sparse", false) || List.class.isAssignableFrom(field2.getType())) {
                    i5 += 4;
                    break;
                }
                i6 = i8 + 1;
                length2 = i7;
                declaredFields2 = fieldArr2;
            }
            ArrayList arrayListM40p3 = C0034g.m40p(cls7);
            if (!arrayListM40p3.isEmpty()) {
                Iterator it13 = arrayListM40p3.iterator();
                while (true) {
                    if (!it13.hasNext()) {
                        break;
                    }
                    Method method5 = (Method) it13.next();
                    if (AbstractC0223g.m414a(method5.getName(), "getItem")) {
                        it = it13;
                        if (!AbstractC0223g.m414a(method5.getReturnType(), Object.class) && !AbstractC0223g.m414a(method5.getReturnType(), cls) && !AbstractC0307q.m538h0(method5.getReturnType().getName(), false, "java.")) {
                            i5 += 8;
                            break;
                        }
                    } else {
                        it = it13;
                    }
                    it13 = it;
                }
            }
            arrayList14.add(new C0103c(cls7, Integer.valueOf(i5 + (setM265B0.contains(cls7.getName()) ? 30 : 0))));
            it11 = it12;
            str2 = str6;
        }
        ArrayList arrayList15 = new ArrayList();
        for (Object obj7 : arrayList14) {
            if (((Number) ((C0103c) obj7).f395b).intValue() > 0) {
                arrayList15.add(obj7);
            }
        }
        List listM276r0 = AbstractC0123k.m276r0(arrayList15, new C0033f(13, new C0032e(12)));
        ArrayList arrayList16 = new ArrayList(AbstractC0125m.m289c0(listM276r0));
        Iterator it14 = listM276r0.iterator();
        while (it14.hasNext()) {
            arrayList16.add((Class) ((C0103c) it14.next()).f394a);
        }
        HashSet hashSet3 = new HashSet();
        ArrayList arrayList17 = new ArrayList();
        for (Object obj8 : arrayList16) {
            if (hashSet3.add(((Class) obj8).getName())) {
                arrayList17.add(obj8);
            }
        }
        ArrayList arrayList18 = new ArrayList();
        Iterator it15 = arrayList17.iterator();
        while (it15.hasNext()) {
            Class cls8 = (Class) it15.next();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            ArrayList arrayListM40p4 = C0034g.m40p(cls8);
            ArrayList arrayList19 = new ArrayList();
            for (Object obj9 : arrayListM40p4) {
                Iterator it16 = it15;
                Method method6 = (Method) obj9;
                ArrayList arrayList20 = arrayList17;
                if (AbstractC0223g.m414a(method6.getName(), str)) {
                    int length3 = method6.getParameterTypes().length;
                    str4 = str;
                    if (length3 == 1) {
                        arrayList19.add(obj9);
                    }
                } else {
                    str4 = str;
                }
                it15 = it16;
                str = str4;
                arrayList17 = arrayList20;
            }
            Iterator it17 = it15;
            ArrayList arrayList21 = arrayList17;
            String str7 = str;
            ArrayList arrayList22 = new ArrayList(AbstractC0125m.m289c0(arrayList19));
            Iterator it18 = arrayList19.iterator();
            while (it18.hasNext()) {
                arrayList22.add(((Method) it18.next()).getReturnType());
            }
            for (Object obj10 : arrayList22) {
                Class cls9 = (Class) obj10;
                AbstractC0223g.m415b(cls9);
                int i9 = i4;
                if (C0034g.m24O(cls9) >= i9) {
                    linkedHashSet2.add(obj10);
                    i4 = 8;
                } else {
                    i4 = i9;
                }
            }
            Field[] declaredFields3 = cls8.getDeclaredFields();
            AbstractC0223g.m417d(declaredFields3, "getDeclaredFields(...)");
            ArrayList arrayList23 = new ArrayList(declaredFields3.length);
            for (Field field3 : declaredFields3) {
                arrayList23.add(field3.getType());
            }
            for (Object obj11 : arrayList23) {
                Class cls10 = (Class) obj11;
                AbstractC0223g.m415b(cls10);
                if (C0034g.m24O(cls10) >= 8) {
                    linkedHashSet2.add(obj11);
                }
            }
            String strM528z0 = AbstractC0299i.m528z0(cls8.getName());
            ArrayList arrayList24 = new ArrayList();
            for (Object obj12 : arrayList13) {
                if (AbstractC0299i.m528z0(((Class) obj12).getName()).equals(strM528z0)) {
                    arrayList24.add(obj12);
                }
            }
            for (Object obj13 : arrayList24) {
                if (C0034g.m24O((Class) obj13) >= 8) {
                    linkedHashSet2.add(obj13);
                }
            }
            AbstractC0129q.m291e0(AbstractC0123k.m276r0(AbstractC0123k.m281w0(linkedHashSet2), new C0033f(12, new C0032e(11))), arrayList18);
            it15 = it17;
            str = str7;
            arrayList17 = arrayList21;
            i4 = 8;
        }
        ArrayList arrayList25 = arrayList17;
        HashSet hashSet4 = new HashSet();
        ArrayList arrayList26 = new ArrayList();
        for (Object obj14 : arrayList18) {
            if (hashSet4.add(((Class) obj14).getName())) {
                arrayList26.add(obj14);
            }
        }
        if (arrayList26.isEmpty()) {
            ArrayList arrayList27 = new ArrayList();
            for (Object obj15 : arrayList13) {
                if (C0034g.m24O((Class) obj15) >= 8) {
                    arrayList27.add(obj15);
                }
            }
            List listM276r02 = AbstractC0123k.m276r0(arrayList27, new C0033f(14, new C0032e(13)));
            HashSet hashSet5 = new HashSet();
            arrayList26 = new ArrayList();
            for (Object obj16 : listM276r02) {
                if (hashSet5.add(((Class) obj16).getName())) {
                    arrayList26.add(obj16);
                }
            }
        }
        ArrayList arrayList28 = new ArrayList();
        Iterator it19 = arrayList26.iterator();
        while (true) {
            String str8 = "a";
            if (!it19.hasNext()) {
                break;
            }
            Field[] declaredFields4 = ((Class) it19.next()).getDeclaredFields();
            AbstractC0223g.m417d(declaredFields4, "getDeclaredFields(...)");
            ArrayList arrayList29 = new ArrayList();
            int length4 = declaredFields4.length;
            Iterator it20 = it19;
            int i10 = 0;
            while (i10 < length4) {
                int i11 = i10;
                Field field4 = declaredFields4[i11];
                if (Modifier.isStatic(field4.getModifiers())) {
                    arrayList = arrayList26;
                    fieldArr = declaredFields4;
                } else {
                    arrayList = arrayList26;
                    fieldArr = declaredFields4;
                    if (AbstractC0223g.m414a(field4.getType(), String.class)) {
                        arrayList29.add(field4);
                    }
                }
                i10 = i11 + 1;
                arrayList26 = arrayList;
                declaredFields4 = fieldArr;
            }
            ArrayList arrayList30 = arrayList26;
            ArrayList arrayList31 = new ArrayList();
            Iterator it21 = arrayList29.iterator();
            while (it21.hasNext()) {
                Object next3 = it21.next();
                Field field5 = (Field) next3;
                Iterator it22 = it21;
                if (!AbstractC0223g.m414a(field5.getName(), str8)) {
                    String name3 = field5.getName();
                    AbstractC0223g.m417d(name3, "getName(...)");
                    if (name3.endsWith(str8)) {
                        str3 = str8;
                    } else {
                        String name4 = field5.getName();
                        AbstractC0223g.m417d(name4, "getName(...)");
                        str3 = str8;
                        if (AbstractC0299i.m511i0(name4, "user", true)) {
                        }
                    }
                    arrayList31.add(next3);
                }
                it21 = it22;
                str8 = str3;
            }
            ArrayList arrayListM273o02 = AbstractC0123k.m273o0(arrayList31, arrayList29);
            ArrayList arrayList32 = new ArrayList(AbstractC0125m.m289c0(arrayListM273o02));
            Iterator it23 = arrayListM273o02.iterator();
            while (it23.hasNext()) {
                arrayList32.add(((Field) it23.next()).getName());
            }
            AbstractC0129q.m291e0(AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList32)), arrayList28);
            it19 = it20;
            arrayList26 = arrayList30;
        }
        ArrayList arrayList33 = arrayList26;
        List listM281w02 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList28));
        if (listM281w02.isEmpty()) {
            listM281w02 = AbstractC0079h.m167E("a");
        }
        List list = listM281w02;
        try {
            c0104d = Class.forName("com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingNewUI", false, classLoader);
        } catch (Throwable th4) {
            c0104d = new C0104d(th4);
        }
        if (c0104d instanceof C0104d) {
            c0104d = null;
        }
        Class cls11 = (Class) c0104d;
        if (cls11 == null) {
            M281w0 = r20;
        } else {
            ArrayList arrayListM40p5 = C0034g.m40p(cls11);
            ArrayList arrayList34 = new ArrayList();
            for (Object obj17 : arrayListM40p5) {
                Method method7 = (Method) obj17;
                Class<?>[] parameterTypes2 = method7.getParameterTypes();
                AbstractC0223g.m417d(parameterTypes2, "getParameterTypes(...)");
                if (parameterTypes2.length == 0 && AbstractC0223g.m414a(method7.getReturnType(), cls) && !Modifier.isStatic(method7.getModifiers())) {
                    if (method7.getName().length() <= 3) {
                        String name5 = method7.getName();
                        AbstractC0223g.m417d(name5, "getName(...)");
                        Character chM514l0 = AbstractC0299i.m514l0(name5);
                        if (chM514l0 != null && Character.isLetterOrDigit(chM514l0.charValue())) {
                            arrayList34.add(obj17);
                        }
                    }
                }
            }
            List listM276r03 = AbstractC0123k.m276r0(arrayList34, new C0033f(11, new C0032e(i3)));
            ArrayList arrayList35 = new ArrayList(AbstractC0125m.m289c0(listM276r03));
            Iterator it24 = listM276r03.iterator();
            while (it24.hasNext()) {
                arrayList35.add(((Method) it24.next()).getName());
            }
            M281w0 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList35));
        }
        try {
            C0353a c0353a2 = new C0353a(1);
            C0362b c0362b = new C0362b();
            c0362b.m626d0("sort_by_file_size_chat_history");
            c0353a2.f828f = c0362b;
            C0506k c0506kM1442e = dexKitBridge.m1442e(c0353a2);
            c0104d2 = new ArrayList();
            Iterator it25 = c0506kM1442e.iterator();
            while (it25.hasNext()) {
                List list2 = (List) ((C0505j) it25.next()).f1614e.m247a();
                ArrayList arrayList36 = new ArrayList();
                Iterator it26 = list2.iterator();
                while (it26.hasNext()) {
                    C0501f c0501f = ((C0507l) it26.next()).f1615a;
                    String str9 = c0501f.m964b().f1865b;
                    if (!AbstractC0223g.m414a(c0501f.m964b().f1864a, "com.tencent.mm.R$id") && !AbstractC0307q.m532b0(c0501f.m964b().f1864a, ".R$id")) {
                        str9 = null;
                    }
                    if (str9 != null) {
                        arrayList36.add(str9);
                    }
                }
                AbstractC0129q.m291e0(arrayList36, c0104d2);
            }
        } catch (Throwable th5) {
            c0104d2 = new C0104d(th5);
        }
        Throwable thM246a = AbstractC0105e.m246a(c0104d2);
        if (thM246a != null) {
            AbstractC0731a.m1387d("storage dexkit file sort entry resolve fail", thM246a);
        }
        boolean z7 = c0104d2 instanceof C0104d;
        ?? r3 = c0104d2;
        if (z7) {
            r3 = r20;
        }
        List listM281w03 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m273o0((List) r3, AbstractC0120h.m252Z(new String[]{"trf", "tsy"}))));
        try {
            C0353a c0353a3 = new C0353a(1);
            C0362b c0362b2 = new C0362b();
            c0362b2.m626d0("sort_by_file_size_chat_history");
            c0353a3.f828f = c0362b2;
            C0506k c0506kM1442e2 = dexKitBridge.m1442e(c0353a3);
            ArrayList arrayList37 = new ArrayList(AbstractC0125m.m289c0(c0506kM1442e2));
            Iterator it27 = c0506kM1442e2.iterator();
            while (it27.hasNext()) {
                arrayList37.add(((C0505j) it27.next()).m1006b().f1869a);
            }
            c0104d3 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList37));
        } catch (Throwable th6) {
            c0104d3 = new C0104d(th6);
        }
        Throwable thM246a2 = AbstractC0105e.m246a(c0104d3);
        if (thM246a2 != null) {
            AbstractC0731a.m1387d("storage dexkit file sort activity resolve fail", thM246a2);
        }
        ?? r202 = r20;
        if (!(c0104d3 instanceof C0104d)) {
            r202 = c0104d3;
        }
        List list3 = (List) r202;
        ArrayList arrayList38 = new ArrayList(AbstractC0125m.m289c0(arrayList25));
        Iterator it28 = arrayList25.iterator();
        while (it28.hasNext()) {
            arrayList38.add(((Class) it28.next()).getName());
        }
        List listM277s0 = AbstractC0123k.m277s0(arrayList38, 12);
        ArrayList arrayList39 = new ArrayList(AbstractC0125m.m289c0(arrayList33));
        Iterator it29 = arrayList33.iterator();
        while (it29.hasNext()) {
            arrayList39.add(((Class) it29.next()).getName());
        }
        List listM277s02 = AbstractC0123k.m277s0(arrayList39, 12);
        List listM277s03 = AbstractC0123k.m277s0(list, 8);
        C0025Z c0025z = new C0025Z(listM277s0, listM277s02, listM277s03, AbstractC0123k.m277s0(M281w0, 8), listM281w03, AbstractC0123k.m277s0(list3, 4));
        if (listM277s0.isEmpty() || listM277s02.isEmpty() || listM277s03.isEmpty()) {
            return null;
        }
        return c0025z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0541  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object m58j(Object obj) {
        boolean z2;
        int i2;
        ArrayList arrayList;
        Iterator it;
        int i3;
        int i4;
        ArrayList arrayList2;
        Iterator it2;
        Object obj2;
        List list;
        Object c0104d;
        Object c0104d2;
        Object c0104d3;
        Object c0104d4;
        DexKitBridge dexKitBridge = (DexKitBridge) obj;
        AbstractC0223g.m418e(dexKitBridge, "bridge");
        ClassLoader classLoader = this.f232b.getClassLoader();
        AbstractC0223g.m417d(classLoader, "getClassLoader(...)");
        String str = "TextStatusOtherTopicFriendsActivity";
        List listM45u = C0034g.m45u(dexKitBridge, AbstractC0079h.m167E("com.tencent.mm.plugin.textstatus"), AbstractC0120h.m252Z(new String[]{"TextStatusOtherTopicFriendsActivity", "OtherTopicFriends", "TextStatus"}), false);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : listM45u) {
            String str2 = (String) obj3;
            if (AbstractC0299i.m511i0(str2, "textstatus", true) && AbstractC0299i.m511i0(str2, "Friends", false)) {
                arrayList3.add(obj3);
            }
        }
        List listM281w0 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList3));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str3 = "com.tencent.mm.plugin.textstatus.ui.be";
        linkedHashSet.add("com.tencent.mm.plugin.textstatus.ui.be");
        AbstractC0129q.m291e0(C0034g.m45u(dexKitBridge, AbstractC0079h.m167E("com.tencent.mm.plugin.textstatus"), AbstractC0079h.m167E("textstatus"), true), linkedHashSet);
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = linkedHashSet.iterator();
        while (it3.hasNext()) {
            try {
                c0104d4 = Class.forName((String) it3.next(), false, classLoader);
            } catch (Throwable th) {
                c0104d4 = new C0104d(th);
            }
            Class cls = (Class) (c0104d4 instanceof C0104d ? null : c0104d4);
            if (cls != null) {
                arrayList4.add(cls);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj4 : arrayList4) {
            if (C0034g.m19J((Class) obj4)) {
                arrayList5.add(obj4);
            }
        }
        List listM276r0 = AbstractC0123k.m276r0(arrayList5, new C0033f(16, new C0032e(15)));
        HashSet hashSet = new HashSet();
        ArrayList<Class> arrayList6 = new ArrayList();
        for (Object obj5 : listM276r0) {
            if (hashSet.add(((Class) obj5).getName())) {
                arrayList6.add(obj5);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        Iterator it4 = arrayList6.iterator();
        while (it4.hasNext()) {
            AbstractC0129q.m291e0(C0034g.m49y((Class) it4.next()), arrayList7);
        }
        List listM281w02 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList7));
        if (listM281w02.isEmpty()) {
            listM281w02 = AbstractC0079h.m167E("data");
        }
        List list2 = listM281w02;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Class superclass : arrayList6) {
            AbstractC0223g.m418e(superclass, "clazz");
            ArrayList arrayList8 = new ArrayList();
            Class superclass2 = superclass;
            while (true) {
                obj2 = C0131s.f426a;
                list = listM281w0;
                if (superclass2 == null || superclass2.equals(Object.class)) {
                    break;
                }
                try {
                    Field[] declaredFields = superclass2.getDeclaredFields();
                    AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
                    c0104d3 = AbstractC0120h.m262j0(declaredFields);
                } catch (Throwable th2) {
                    c0104d3 = new C0104d(th2);
                }
                if (!(c0104d3 instanceof C0104d)) {
                    obj2 = c0104d3;
                }
                arrayList8.addAll((Collection) obj2);
                superclass2 = superclass2.getSuperclass();
                listM281w0 = list;
            }
            ArrayList arrayList9 = new ArrayList();
            for (Object obj6 : arrayList8) {
                if (!Modifier.isStatic(((Field) obj6).getModifiers())) {
                    arrayList9.add(obj6);
                }
            }
            ArrayList arrayList10 = new ArrayList(AbstractC0125m.m289c0(arrayList9));
            for (Iterator it5 = arrayList9.iterator(); it5.hasNext(); it5 = it5) {
                arrayList10.add(AbstractC0299i.m522t0(((Field) it5.next()).getGenericType().toString(), "class "));
            }
            ArrayList arrayList11 = new ArrayList();
            Iterator it6 = arrayList10.iterator();
            while (it6.hasNext()) {
                AbstractC0129q.m291e0(AbstractC0284i.m498Z(new C0281f(new C0169h(C0297g.m501c(new C0297g("[a-zA-Z_$][\\w$]*(?:\\.[a-zA-Z_$][\\w$]*)+"), (String) it6.next()), new C0026a(18)), true, new C0026a(19))), arrayList11);
                it6 = it6;
                str = str;
                str3 = str3;
            }
            String str4 = str;
            String str5 = str3;
            Iterator it7 = arrayList11.iterator();
            while (it7.hasNext()) {
                try {
                    c0104d2 = Class.forName((String) it7.next(), false, classLoader);
                } catch (Throwable th3) {
                    c0104d2 = new C0104d(th3);
                }
                if (c0104d2 instanceof C0104d) {
                    c0104d2 = null;
                }
                Class cls2 = (Class) c0104d2;
                if (cls2 != null) {
                    linkedHashSet2.add(cls2);
                }
            }
            ArrayList<Method> arrayList12 = new ArrayList();
            while (superclass != null && !superclass.equals(Object.class)) {
                try {
                    Method[] declaredMethods = superclass.getDeclaredMethods();
                    AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
                    c0104d = AbstractC0120h.m262j0(declaredMethods);
                } catch (Throwable th4) {
                    c0104d = new C0104d(th4);
                }
                if (c0104d instanceof C0104d) {
                    c0104d = obj2;
                }
                arrayList12.addAll((Collection) c0104d);
                superclass = superclass.getSuperclass();
            }
            ArrayList arrayList13 = new ArrayList();
            for (Method method : arrayList12) {
                List listM167E = AbstractC0079h.m167E(method.getReturnType());
                Class<?>[] parameterTypes = method.getParameterTypes();
                AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                AbstractC0129q.m291e0(AbstractC0123k.m274p0(listM167E, parameterTypes), arrayList13);
            }
            for (Object obj7 : arrayList13) {
                Class cls3 = (Class) obj7;
                AbstractC0223g.m415b(cls3);
                if (!cls3.isPrimitive() && !AbstractC0307q.m538h0(cls3.getName(), false, "java.") && !AbstractC0307q.m538h0(cls3.getName(), false, "android.") && !AbstractC0307q.m538h0(cls3.getName(), false, "kotlin.")) {
                    linkedHashSet2.add(obj7);
                }
            }
            listM281w0 = list;
            str = str4;
            str3 = str5;
        }
        List listM167E2 = listM281w0;
        String str6 = str;
        String str7 = str3;
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList14 = new ArrayList();
        for (Object obj8 : linkedHashSet2) {
            if (hashSet2.add(((Class) obj8).getName())) {
                arrayList14.add(obj8);
            }
        }
        ArrayList arrayList15 = new ArrayList();
        Iterator it8 = arrayList14.iterator();
        while (it8.hasNext()) {
            Object next = it8.next();
            Class cls4 = (Class) next;
            AbstractC0223g.m418e(cls4, "clazz");
            if (cls4.isPrimitive() || AbstractC0307q.m538h0(cls4.getName(), false, "java.") || AbstractC0307q.m538h0(cls4.getName(), false, "android.") || AbstractC0307q.m538h0(cls4.getName(), false, "kotlin.")) {
                arrayList = arrayList14;
                it = it8;
            } else {
                ArrayList<Field> arrayListM36l = C0034g.m36l(cls4);
                if (arrayListM36l.isEmpty()) {
                    i3 = 0;
                } else {
                    int i5 = 0;
                    for (Field field : arrayListM36l) {
                        if (!Modifier.isStatic(field.getModifiers()) && AbstractC0223g.m414a(field.getType(), String.class) && (i5 = i5 + 1) < 0) {
                            AbstractC0124l.m287a0();
                            throw null;
                        }
                    }
                    i3 = i5;
                }
                if (arrayListM36l.isEmpty()) {
                    i4 = 0;
                } else {
                    i4 = 0;
                    for (Field field2 : arrayListM36l) {
                        if (Modifier.isStatic(field2.getModifiers())) {
                            arrayList2 = arrayList14;
                            it2 = it8;
                        } else {
                            arrayList2 = arrayList14;
                            Class<?> type = field2.getType();
                            it2 = it8;
                            Class cls5 = Integer.TYPE;
                            if ((AbstractC0223g.m414a(type, cls5) || AbstractC0223g.m414a(field2.getType(), cls5)) && (i4 = i4 + 1) < 0) {
                                AbstractC0124l.m287a0();
                                throw null;
                            }
                        }
                        arrayList14 = arrayList2;
                        it8 = it2;
                    }
                }
                arrayList = arrayList14;
                it = it8;
                if (i3 >= 2 && i4 >= 1 && AbstractC0299i.m525w0(cls4.getName()).length() <= 2) {
                    arrayList15.add(next);
                }
            }
            arrayList14 = arrayList;
            it8 = it;
        }
        ArrayList arrayList16 = arrayList14;
        ArrayList arrayList17 = new ArrayList(AbstractC0125m.m289c0(arrayList15));
        Iterator it9 = arrayList15.iterator();
        while (it9.hasNext()) {
            arrayList17.add(((Class) it9.next()).getName());
        }
        boolean zIsEmpty = arrayList17.isEmpty();
        List listM167E3 = arrayList17;
        if (zIsEmpty) {
            listM167E3 = AbstractC0079h.m167E("kf4.c");
        }
        List listM281w03 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(listM167E3));
        ArrayList arrayList18 = new ArrayList();
        for (Object obj9 : arrayList16) {
            Class cls6 = (Class) obj9;
            AbstractC0223g.m418e(cls6, "clazz");
            if (!cls6.isPrimitive()) {
                int i6 = 0;
                if (!AbstractC0307q.m538h0(cls6.getName(), false, "java.") && !AbstractC0307q.m538h0(cls6.getName(), false, "android.") && !AbstractC0307q.m538h0(cls6.getName(), false, "kotlin.")) {
                    ArrayList<Field> arrayListM36l2 = C0034g.m36l(cls6);
                    if (!arrayListM36l2.isEmpty()) {
                        int i7 = 0;
                        for (Field field3 : arrayListM36l2) {
                            if (!Modifier.isStatic(field3.getModifiers()) && AbstractC0223g.m414a(field3.getType(), String.class) && (i7 = i7 + 1) < 0) {
                                AbstractC0124l.m287a0();
                                throw null;
                            }
                        }
                        i6 = i7;
                    }
                    if (arrayListM36l2.isEmpty()) {
                        i2 = 0;
                    } else {
                        Iterator it10 = arrayListM36l2.iterator();
                        int i8 = 0;
                        while (it10.hasNext()) {
                            if (!Modifier.isStatic(((Field) it10.next()).getModifiers()) && (i8 = i8 + 1) < 0) {
                                AbstractC0124l.m287a0();
                                throw null;
                            }
                        }
                        i2 = i8;
                    }
                    boolean z3 = i2 <= 6;
                    if ((i6 >= 0 && i6 < 3) && z3) {
                        z2 = AbstractC0299i.m525w0(cls6.getName()).length() <= 2;
                    }
                }
            }
            if (z2) {
                arrayList18.add(obj9);
            }
        }
        ArrayList arrayList19 = new ArrayList(AbstractC0125m.m289c0(arrayList18));
        Iterator it11 = arrayList18.iterator();
        while (it11.hasNext()) {
            arrayList19.add(((Class) it11.next()).getName());
        }
        boolean zIsEmpty2 = arrayList19.isEmpty();
        List listM167E4 = arrayList19;
        if (zIsEmpty2) {
            listM167E4 = AbstractC0079h.m167E("kf4.d");
        }
        List listM281w04 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(listM167E4));
        List listM10A = C0034g.m10A(dexKitBridge, AbstractC0079h.m167E(str6), null);
        ArrayList arrayList20 = new ArrayList();
        for (Object obj10 : listM10A) {
            if (AbstractC0223g.m414a((String) obj10, "m91")) {
                arrayList20.add(obj10);
            }
        }
        List listM281w05 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m273o0(arrayList20, AbstractC0079h.m167E("m91"))));
        ArrayList arrayList21 = new ArrayList();
        for (Object obj11 : listM10A) {
            if (AbstractC0223g.m414a((String) obj11, "om7")) {
                arrayList21.add(obj11);
            }
        }
        List listM281w06 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m273o0(arrayList21, AbstractC0079h.m167E("om7"))));
        ArrayList arrayList22 = new ArrayList();
        for (Object obj12 : listM10A) {
            if (AbstractC0223g.m414a((String) obj12, "iib")) {
                arrayList22.add(obj12);
            }
        }
        List listM281w07 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m273o0(arrayList22, AbstractC0079h.m167E("iib"))));
        if (listM167E2.isEmpty()) {
            listM167E2 = AbstractC0079h.m167E("com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity");
        }
        List listM277s0 = AbstractC0123k.m277s0(AbstractC0123k.m281w0(AbstractC0123k.m264A0(listM167E2)), 6);
        ArrayList arrayList23 = new ArrayList(AbstractC0125m.m289c0(arrayList6));
        Iterator it12 = arrayList6.iterator();
        while (it12.hasNext()) {
            arrayList23.add(((Class) it12.next()).getName());
        }
        boolean zIsEmpty3 = arrayList23.isEmpty();
        List listM167E5 = arrayList23;
        if (zIsEmpty3) {
            listM167E5 = AbstractC0079h.m167E(str7);
        }
        List listM277s02 = AbstractC0123k.m277s0(AbstractC0123k.m281w0(AbstractC0123k.m264A0(listM167E5)), 8);
        List listM277s03 = AbstractC0123k.m277s0(list2, 8);
        List listM277s04 = AbstractC0123k.m277s0(listM281w03, 8);
        List listM277s05 = AbstractC0123k.m277s0(listM281w04, 8);
        if (listM281w05.isEmpty()) {
            listM281w05 = AbstractC0079h.m167E("m91");
        }
        List listM277s06 = AbstractC0123k.m277s0(AbstractC0123k.m281w0(AbstractC0123k.m264A0(listM281w05)), 4);
        if (listM281w06.isEmpty()) {
            listM281w06 = AbstractC0079h.m167E("om7");
        }
        List listM277s07 = AbstractC0123k.m277s0(AbstractC0123k.m281w0(AbstractC0123k.m264A0(listM281w06)), 4);
        if (listM281w07.isEmpty()) {
            listM281w07 = AbstractC0079h.m167E("iib");
        }
        C0029b0 c0029b0 = new C0029b0(listM277s0, listM277s02, listM277s03, listM277s04, listM277s05, listM277s06, listM277s07, AbstractC0123k.m277s0(AbstractC0123k.m281w0(AbstractC0123k.m264A0(listM281w07)), 4));
        if ((listM277s0.isEmpty() || listM277s02.isEmpty() || listM277s04.isEmpty() || listM277s05.isEmpty()) ? false : true) {
            return c0029b0;
        }
        return null;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: k */
    private final Object m59k(Object obj) throws IOException {
        C0095c c0095c = (C0095c) obj;
        AbstractC0223g.m418e(c0095c, "it");
        Throwable th = c0095c.f380d;
        Context context = this.f232b;
        if (th == null && c0095c.f377a == 200 && c0095c.f379c.length != 0) {
            AbstractC0223g.m415b(context);
            byte[] bArr = c0095c.f379c;
            FileOutputStream fileOutputStream = new FileOutputStream(new File(context.getFilesDir(), "res/raw/menu_ui.json"));
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
                AbstractC0503h.f1602k = System.currentTimeMillis();
                AbstractC0503h.f1601j = false;
            } finally {
            }
        } else {
            AbstractC0731a.m1387d("request raw remote menu fail", c0095c);
            String str = AppConfigUtil.Companion.getCdnMainUrl() + "/res/raw/menu_ui.json";
            AbstractC0731a.m1386c(AbstractC0174d.m352h("request ", str));
            AbstractC0079h.m192p(str, AbstractC0096d.f382b, new C0035h(context, 22));
        }
        return C0109i.f404a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    @Override // p025M0.InterfaceC0193a
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7b() {
        boolean z2;
        switch (this.f231a) {
            case 11:
                Context context = this.f232b;
                return Boolean.valueOf((AbstractC0039l.m65c(context) == null || AbstractC0039l.m66d(context) == null || AbstractC0039l.m79q(context) == null) ? false : true);
            case 12:
                return Boolean.valueOf(AbstractC0039l.m67e(this.f232b) != null);
            case 13:
                return Boolean.valueOf(AbstractC0039l.m77o(this.f232b) != null);
            case 14:
                return Boolean.valueOf(AbstractC0039l.m69g(this.f232b) != null);
            case 15:
                C0014N c0014nM71i = AbstractC0039l.m71i(this.f232b);
                if (c0014nM71i != null) {
                    z2 = c0014nM71i.f129d.isEmpty() ^ true;
                }
                return Boolean.valueOf(z2);
            case 16:
                return Boolean.valueOf(AbstractC0039l.m73k(this.f232b) != null);
            case 17:
                return Boolean.valueOf(AbstractC0039l.m75m(this.f232b) != null);
            case 18:
                return Boolean.valueOf(AbstractC0039l.m72j(this.f232b) != null);
            case 19:
                return Boolean.valueOf(AbstractC0039l.m74l(this.f232b) != null);
            default:
                return Boolean.valueOf(AbstractC0039l.m78p(this.f232b) != null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:267:0x061d A[PHI: r0
  0x061d: PHI (r0v30 java.lang.Class) = (r0v3 java.lang.Class), (r0v8 java.lang.Class) binds: [B:212:0x050b, B:264:0x060f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x077f A[PHI: r0
  0x077f: PHI (r0v34 java.lang.Class<?>) = (r0v33 java.lang.Class<?>), (r0v122 java.lang.Class<?>) binds: [B:268:0x0631, B:334:0x076e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0a20 A[PHI: r1
  0x0a20: PHI (r1v15 java.util.Iterator) = 
  (r1v6 java.util.Iterator)
  (r1v6 java.util.Iterator)
  (r1v6 java.util.Iterator)
  (r1v6 java.util.Iterator)
  (r1v16 java.util.Iterator)
 binds: [B:420:0x0957, B:422:0x0963, B:424:0x0969, B:426:0x0975, B:653:0x0a20] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p025M0.InterfaceC0204l
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8c(Object obj) throws IOException {
        Object c0104d;
        Object next;
        Object c0104d2;
        Object next2;
        Object next3;
        Object next4;
        Object c0104d3;
        Object next5;
        Object next6;
        Iterator it;
        Object c0104d4;
        C0502g c0502g;
        Object next7;
        Object c0104d5;
        Object next8;
        Object c0104d6;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Object c0104d7;
        Object c0104d8;
        Object c0104d9;
        Class cls = Integer.TYPE;
        List list = C0131s.f426a;
        Context context = this.f232b;
        int i7 = 0;
        switch (this.f231a) {
            case 0:
                DexKitBridge dexKitBridge = (DexKitBridge) obj;
                AbstractC0223g.m418e(dexKitBridge, "bridge");
                ClassLoader classLoader = context.getClassLoader();
                AbstractC0223g.m415b(classLoader);
                Class clsM44t = C0034g.m44t(classLoader, dexKitBridge, AbstractC0079h.m167E("com.tencent.mm.ui.contact.address.MvvmAddressUIFragment"), AbstractC0120h.m252Z(new String[]{"MvvmAddressUIFragment", "AddressUIFragment"}));
                if (clsM44t == null) {
                    try {
                        C0353a c0353a = new C0353a(i7);
                        c0353a.m608Z("com.tencent.mm.ui.contact");
                        C0361a c0361a = new C0361a();
                        c0361a.m617Y("Address", 1, false);
                        c0353a.f828f = c0361a;
                        C0500e c0500eM1441d = dexKitBridge.m1441d(c0353a);
                        ArrayList<Class> arrayList = new ArrayList();
                        Iterator it2 = c0500eM1441d.iterator();
                        while (it2.hasNext()) {
                            try {
                                c0104d2 = ((C0499d) it2.next()).m963c(classLoader);
                            } catch (Throwable th) {
                                c0104d2 = new C0104d(th);
                            }
                            if (c0104d2 instanceof C0104d) {
                                c0104d2 = null;
                            }
                            Class cls2 = (Class) c0104d2;
                            if (cls2 != null) {
                                arrayList.add(cls2);
                            }
                            break;
                        }
                        ArrayList arrayList2 = new ArrayList(AbstractC0125m.m289c0(arrayList));
                        for (Class cls3 : arrayList) {
                            arrayList2.add(new C0103c(cls3, Integer.valueOf(C0034g.m22M(cls3))));
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj2 : arrayList2) {
                            if (((Number) ((C0103c) obj2).f395b).intValue() > 0) {
                                arrayList3.add(obj2);
                            }
                        }
                        Iterator it3 = arrayList3.iterator();
                        if (it3.hasNext()) {
                            next = it3.next();
                            if (it3.hasNext()) {
                                int iIntValue = ((Number) ((C0103c) next).f395b).intValue();
                                do {
                                    Object next9 = it3.next();
                                    int iIntValue2 = ((Number) ((C0103c) next9).f395b).intValue();
                                    if (iIntValue < iIntValue2) {
                                        next = next9;
                                        iIntValue = iIntValue2;
                                    }
                                } while (it3.hasNext());
                            }
                        } else {
                            next = null;
                        }
                        C0103c c0103c = (C0103c) next;
                        c0104d = c0103c != null ? (Class) c0103c.f394a : null;
                    } catch (Throwable th2) {
                        c0104d = new C0104d(th2);
                    }
                    Throwable thM246a = AbstractC0105e.m246a(c0104d);
                    if (thM246a != null) {
                        AbstractC0731a.m1387d("contact dexkit fragment structure scan fail", thM246a);
                    }
                    if (c0104d instanceof C0104d) {
                        c0104d = null;
                    }
                    clsM44t = (Class) c0104d;
                    if (clsM44t == null) {
                        AbstractC0731a.m1387d("contact dexkit fragment class missing");
                    } else {
                        Class cls4 = clsM44t;
                        Class<?> clsM44t2 = C0034g.m44t(classLoader, dexKitBridge, AbstractC0079h.m167E("com.tencent.mm.ui.contact.address.AddressLiveList"), AbstractC0079h.m167E("AddressLiveList"));
                        if (clsM44t2 == null) {
                            Iterator it4 = C0034g.m37m(cls4).iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    next7 = it4.next();
                                    Method method = (Method) next7;
                                    Class<?>[] parameterTypes = method.getParameterTypes();
                                    AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                                    if (parameterTypes.length == 0) {
                                        Class<?> returnType = method.getReturnType();
                                        AbstractC0223g.m417d(returnType, "getReturnType(...)");
                                        if (C0034g.m23N(returnType) >= 4) {
                                        }
                                    }
                                } else {
                                    next7 = null;
                                }
                            }
                            Method method2 = (Method) next7;
                            if (method2 == null || (clsM44t2 = method2.getReturnType()) == null) {
                                try {
                                    C0353a c0353a2 = new C0353a(0);
                                    c0353a2.m608Z("com.tencent.mm.ui.contact");
                                    C0361a c0361a2 = new C0361a();
                                    c0361a2.m617Y("LiveList", 1, false);
                                    c0353a2.f828f = c0361a2;
                                    C0500e c0500eM1441d2 = dexKitBridge.m1441d(c0353a2);
                                    ArrayList<Class> arrayList4 = new ArrayList();
                                    Iterator it5 = c0500eM1441d2.iterator();
                                    while (it5.hasNext()) {
                                        try {
                                            c0104d6 = ((C0499d) it5.next()).m963c(classLoader);
                                        } catch (Throwable th3) {
                                            c0104d6 = new C0104d(th3);
                                        }
                                        if (c0104d6 instanceof C0104d) {
                                            c0104d6 = null;
                                        }
                                        Class cls5 = (Class) c0104d6;
                                        if (cls5 != null) {
                                            arrayList4.add(cls5);
                                        }
                                        break;
                                    }
                                    ArrayList arrayList5 = new ArrayList(AbstractC0125m.m289c0(arrayList4));
                                    for (Class cls6 : arrayList4) {
                                        arrayList5.add(new C0103c(cls6, Integer.valueOf(C0034g.m23N(cls6))));
                                    }
                                    ArrayList arrayList6 = new ArrayList();
                                    for (Object obj3 : arrayList5) {
                                        if (((Number) ((C0103c) obj3).f395b).intValue() > 0) {
                                            arrayList6.add(obj3);
                                        }
                                    }
                                    Iterator it6 = arrayList6.iterator();
                                    if (it6.hasNext()) {
                                        next8 = it6.next();
                                        if (it6.hasNext()) {
                                            int iIntValue3 = ((Number) ((C0103c) next8).f395b).intValue();
                                            do {
                                                Object next10 = it6.next();
                                                int iIntValue4 = ((Number) ((C0103c) next10).f395b).intValue();
                                                if (iIntValue3 < iIntValue4) {
                                                    next8 = next10;
                                                    iIntValue3 = iIntValue4;
                                                }
                                            } while (it6.hasNext());
                                        }
                                    } else {
                                        next8 = null;
                                    }
                                    C0103c c0103c2 = (C0103c) next8;
                                    c0104d5 = c0103c2 != null ? (Class) c0103c2.f394a : null;
                                } catch (Throwable th4) {
                                    c0104d5 = new C0104d(th4);
                                }
                                Throwable thM246a2 = AbstractC0105e.m246a(c0104d5);
                                if (thM246a2 != null) {
                                    AbstractC0731a.m1387d("contact dexkit live list structure scan fail", thM246a2);
                                }
                                if (c0104d5 instanceof C0104d) {
                                    c0104d5 = null;
                                }
                                clsM44t2 = (Class) c0104d5;
                            }
                            if (clsM44t2 == null) {
                                AbstractC0731a.m1387d("contact dexkit live list class missing", cls4.getName());
                            } else {
                                Class<? super Object> cls7 = clsM44t2;
                                Iterator it7 = C0034g.m37m(cls7).iterator();
                                while (true) {
                                    if (it7.hasNext()) {
                                        next2 = it7.next();
                                        Method method3 = (Method) next2;
                                        if (method3.getParameterTypes().length != 1 || !List.class.isAssignableFrom(method3.getParameterTypes()[0])) {
                                        }
                                    } else {
                                        next2 = null;
                                    }
                                }
                                Method method4 = (Method) next2;
                                if (method4 == null) {
                                    AbstractC0731a.m1387d("contact dexkit live list submit missing", cls7.getName());
                                } else {
                                    Iterator it8 = C0034g.m37m(cls4).iterator();
                                    while (true) {
                                        if (it8.hasNext()) {
                                            next3 = it8.next();
                                            Method method5 = (Method) next3;
                                            Class<?>[] parameterTypes2 = method5.getParameterTypes();
                                            AbstractC0223g.m417d(parameterTypes2, "getParameterTypes(...)");
                                            if (parameterTypes2.length != 0 || !cls7.isAssignableFrom(method5.getReturnType())) {
                                            }
                                        } else {
                                            next3 = null;
                                        }
                                    }
                                    Method methodM50z = (Method) next3;
                                    if (methodM50z == null && (methodM50z = C0034g.m50z(cls4, AbstractC0120h.m252Z(new String[]{"z0", "G0", "F0", "I0"}))) == null) {
                                        AbstractC0731a.m1387d("contact dexkit live list getter missing", cls4.getName(), cls7.getName());
                                    } else {
                                        Iterator it9 = C0034g.m37m(cls4).iterator();
                                        while (true) {
                                            if (it9.hasNext()) {
                                                next4 = it9.next();
                                                Method method6 = (Method) next4;
                                                Class<?>[] parameterTypes3 = method6.getParameterTypes();
                                                AbstractC0223g.m417d(parameterTypes3, "getParameterTypes(...)");
                                                if (parameterTypes3.length == 0) {
                                                    Class<?> returnType2 = method6.getReturnType();
                                                    AbstractC0223g.m417d(returnType2, "getReturnType(...)");
                                                    if (C0034g.m20K(returnType2)) {
                                                    }
                                                }
                                            } else {
                                                next4 = null;
                                            }
                                        }
                                        Method methodM50z2 = (Method) next4;
                                        if (methodM50z2 != null || (methodM50z2 = C0034g.m50z(cls4, AbstractC0120h.m252Z(new String[]{"y0", "F0", "E0", "H0"}))) != null) {
                                            Class<?> returnType3 = methodM50z2.getReturnType();
                                            AbstractC0223g.m415b(returnType3);
                                            if (!C0034g.m20K(returnType3)) {
                                                returnType3 = null;
                                            }
                                            if (returnType3 == null) {
                                                try {
                                                    c0104d3 = Class.forName(methodM50z2.getReturnType().getName(), false, classLoader);
                                                } catch (Throwable th5) {
                                                    c0104d3 = new C0104d(th5);
                                                }
                                                if (c0104d3 instanceof C0104d) {
                                                    c0104d3 = null;
                                                }
                                                returnType3 = (Class) c0104d3;
                                                if (returnType3 == null) {
                                                    AbstractC0731a.m1387d("contact dexkit adapter class missing", methodM50z2.getName(), methodM50z2.getReturnType().getName());
                                                }
                                                break;
                                            }
                                            ArrayList arrayList7 = new ArrayList();
                                            for (Class<?> superclass = returnType3; superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                                                if (C0034g.m20K(superclass)) {
                                                    arrayList7.add(superclass.getName());
                                                }
                                            }
                                            List listM281w0 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList7));
                                            if (listM281w0.isEmpty()) {
                                                listM281w0 = AbstractC0079h.m167E(returnType3.getName());
                                            }
                                            List list2 = listM281w0;
                                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                                            try {
                                                C0499d c0499dM1443f = dexKitBridge.m1443f(returnType3.getName());
                                                if (c0499dM1443f != null && (c0502g = (C0502g) c0499dM1443f.f1586j.m247a()) != null) {
                                                    Iterator it10 = c0502g.iterator();
                                                    while (it10.hasNext()) {
                                                        String str = ((C0499d) ((C0501f) it10.next()).f1591f.m247a()).m962b().f1863a;
                                                        if (C0034g.m18I(str)) {
                                                            linkedHashSet.add(str);
                                                        }
                                                    }
                                                }
                                                break;
                                            } catch (Throwable unused) {
                                            }
                                            Iterator it11 = C0034g.m37m(returnType3).iterator();
                                            while (it11.hasNext()) {
                                                Method method7 = (Method) it11.next();
                                                if (method7.getParameterTypes().length != 1) {
                                                    it = it11;
                                                } else if (AbstractC0223g.m414a(method7.getParameterTypes()[0], cls)) {
                                                    Class<?> returnType4 = method7.getReturnType();
                                                    if (AbstractC0223g.m414a(returnType4, Void.TYPE) || AbstractC0223g.m414a(returnType4, Object.class) || returnType4.getName().equals("java.lang.Object")) {
                                                        it = it11;
                                                    } else if (C0034g.m18I(returnType4.getName())) {
                                                        it = it11;
                                                        linkedHashSet.add(returnType4.getName());
                                                    } else {
                                                        ArrayList<Method> arrayListM37m = C0034g.m37m(returnType4);
                                                        if (!arrayListM37m.isEmpty()) {
                                                            for (Method method8 : arrayListM37m) {
                                                                Class<?>[] parameterTypes4 = method8.getParameterTypes();
                                                                AbstractC0223g.m417d(parameterTypes4, "getParameterTypes(...)");
                                                                if (parameterTypes4.length == 0 && AbstractC0223g.m414a(method8.getReturnType(), String.class) && AbstractC0120h.m254b0(new String[]{"v", "x"}, method8.getName())) {
                                                                    it = it11;
                                                                    linkedHashSet.add(returnType4.getName());
                                                                }
                                                            }
                                                        }
                                                        Field[] declaredFields = returnType4.getDeclaredFields();
                                                        AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
                                                        int length = declaredFields.length;
                                                        int i8 = 0;
                                                        while (i8 < length) {
                                                            it = it11;
                                                            try {
                                                                c0104d4 = Boolean.valueOf(AbstractC0223g.m414a(declaredFields[i8].getType(), Class.forName("com.tencent.mm.storage.s3", false, classLoader)));
                                                            } catch (Throwable th6) {
                                                                c0104d4 = new C0104d(th6);
                                                            }
                                                            Object obj4 = Boolean.FALSE;
                                                            if (c0104d4 instanceof C0104d) {
                                                                c0104d4 = obj4;
                                                            }
                                                            if (((Boolean) c0104d4).booleanValue()) {
                                                                linkedHashSet.add(returnType4.getName());
                                                            } else {
                                                                i8++;
                                                                it11 = it;
                                                            }
                                                            break;
                                                        }
                                                        it = it11;
                                                    }
                                                }
                                                it11 = it;
                                            }
                                            List listM281w02 = AbstractC0123k.m281w0(linkedHashSet);
                                            Class<? super Object> superclass2 = cls7.getSuperclass();
                                            if (superclass2 == null) {
                                                superclass2 = cls7;
                                            }
                                            Iterator it12 = C0034g.m37m(superclass2).iterator();
                                            while (true) {
                                                if (it12.hasNext()) {
                                                    next5 = it12.next();
                                                    Method method9 = (Method) next5;
                                                    if (!AbstractC0223g.m414a(method9.getName(), "r") || method9.getParameterTypes().length != 4 || !method9.getParameterTypes()[0].isAssignableFrom(cls7)) {
                                                    }
                                                } else {
                                                    next5 = null;
                                                }
                                            }
                                            Method method10 = (Method) next5;
                                            if (method10 == null) {
                                                Iterator it13 = C0034g.m37m(superclass2).iterator();
                                                while (true) {
                                                    if (it13.hasNext()) {
                                                        next6 = it13.next();
                                                        Method method11 = (Method) next6;
                                                        if (AbstractC0223g.m414a(method11.getName(), "q") && (method11.getParameterTypes().length == 4 || method11.getParameterTypes().length == 5)) {
                                                            if (method11.getParameterTypes()[0].isAssignableFrom(cls7)) {
                                                            }
                                                        }
                                                    } else {
                                                        next6 = null;
                                                    }
                                                }
                                                method10 = (Method) next6;
                                            }
                                            String name = method10 != null ? method10.getName() : null;
                                            if (name == null) {
                                                name = "";
                                            }
                                            String name2 = cls4.getName();
                                            String name3 = cls7.getName();
                                            String name4 = method4.getName();
                                            AbstractC0223g.m417d(name4, "getName(...)");
                                            String name5 = methodM50z.getName();
                                            AbstractC0223g.m417d(name5, "getName(...)");
                                            String name6 = methodM50z2.getName();
                                            AbstractC0223g.m417d(name6, "getName(...)");
                                            return new C0036i(name2, name3, name4, name5, name6, list2, listM281w02, name);
                                        }
                                        AbstractC0731a.m1387d("contact dexkit adapter getter missing", cls4.getName());
                                    }
                                }
                            }
                            break;
                        }
                    }
                    break;
                }
                return null;
            case 1:
                return m51a(obj);
            case 2:
                return m52d(obj);
            case 3:
                DexKitBridge dexKitBridge2 = (DexKitBridge) obj;
                AbstractC0223g.m418e(dexKitBridge2, "bridge");
                ClassLoader classLoader2 = context.getClassLoader();
                AbstractC0223g.m417d(classLoader2, "getClassLoader(...)");
                List listM45u = C0034g.m45u(dexKitBridge2, AbstractC0079h.m167E("com.tencent.mm.ui.contact"), AbstractC0120h.m252Z(new String[]{"SelectContactUI", "OnlyChatContactMgrUI", "SelectContact"}), false);
                ArrayList arrayList8 = new ArrayList();
                for (Object obj5 : listM45u) {
                    String str2 = (String) obj5;
                    if (AbstractC0299i.m511i0(str2, "SelectContactUI", false) || AbstractC0299i.m511i0(str2, "OnlyChatContactMgrUI", false)) {
                        arrayList8.add(obj5);
                    }
                }
                List listM281w03 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList8));
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                linkedHashSet2.add("com.tencent.mm.ui.contact.h0");
                AbstractC0129q.m291e0(C0034g.m45u(dexKitBridge2, AbstractC0079h.m167E("com.tencent.mm.ui.contact"), AbstractC0079h.m167E("contact"), true), linkedHashSet2);
                ArrayList arrayList9 = new ArrayList();
                Iterator it14 = linkedHashSet2.iterator();
                while (it14.hasNext()) {
                    try {
                        c0104d8 = Class.forName((String) it14.next(), false, classLoader2);
                    } catch (Throwable th7) {
                        c0104d8 = new C0104d(th7);
                    }
                    if (c0104d8 instanceof C0104d) {
                        c0104d8 = null;
                    }
                    Class cls8 = (Class) c0104d8;
                    if (cls8 != null) {
                        arrayList9.add(cls8);
                    }
                    break;
                }
                ArrayList arrayList10 = new ArrayList();
                for (Object obj6 : arrayList9) {
                    if (ListAdapter.class.isAssignableFrom((Class) obj6)) {
                        arrayList10.add(obj6);
                    }
                }
                ArrayList arrayList11 = new ArrayList();
                for (Object obj7 : arrayList10) {
                    Class cls9 = (Class) obj7;
                    AbstractC0223g.m418e(cls9, "clazz");
                    ArrayList<Method> arrayList12 = new ArrayList();
                    Class superclass3 = cls9;
                    while (superclass3 != null && !superclass3.equals(Object.class)) {
                        try {
                            Method[] declaredMethods = superclass3.getDeclaredMethods();
                            i6 = i7;
                            try {
                                AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
                                c0104d7 = AbstractC0120h.m262j0(declaredMethods);
                            } catch (Throwable th8) {
                                th = th8;
                                c0104d7 = new C0104d(th);
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            i6 = i7;
                        }
                        if (c0104d7 instanceof C0104d) {
                            c0104d7 = list;
                        }
                        arrayList12.addAll((Collection) c0104d7);
                        superclass3 = superclass3.getSuperclass();
                        i7 = i6;
                        break;
                    }
                    int i9 = i7;
                    if (arrayList12.isEmpty()) {
                        i2 = i9;
                    } else {
                        Iterator it15 = arrayList12.iterator();
                        while (it15.hasNext()) {
                            Method method12 = (Method) it15.next();
                            Iterator it16 = it15;
                            if (AbstractC0223g.m414a(method12.getName(), "getCount")) {
                                Class<?>[] parameterTypes5 = method12.getParameterTypes();
                                AbstractC0223g.m417d(parameterTypes5, "getParameterTypes(...)");
                                if (parameterTypes5.length == 0 && AbstractC0223g.m414a(method12.getReturnType(), cls)) {
                                    i2 = 1;
                                }
                            }
                            it15 = it16;
                        }
                        i2 = i9;
                    }
                    if (arrayList12.isEmpty()) {
                        i3 = i2;
                        i4 = i9;
                    } else {
                        for (Method method13 : arrayList12) {
                            i3 = i2;
                            if (AbstractC0223g.m414a(method13.getName(), "getItem") && method13.getParameterTypes().length == 1 && AbstractC0223g.m414a(method13.getParameterTypes()[i9], cls)) {
                                i4 = 1;
                            } else {
                                i2 = i3;
                            }
                        }
                        i3 = i2;
                        i4 = i9;
                    }
                    if (arrayList12.isEmpty()) {
                        i5 = i9;
                    } else {
                        for (Method method14 : arrayList12) {
                            if (AbstractC0223g.m414a(method14.getName(), "getView") && method14.getParameterTypes().length == 3 && AbstractC0223g.m414a(method14.getParameterTypes()[i9], cls)) {
                                i5 = 1;
                            }
                        }
                        i5 = i9;
                    }
                    if (i3 != 0 && i4 != 0 && i5 != 0) {
                        arrayList11.add(obj7);
                    }
                    i7 = i9;
                }
                List listM276r0 = AbstractC0123k.m276r0(arrayList11, new C0033f(7, new C0032e(5)));
                HashSet hashSet = new HashSet();
                ArrayList arrayList13 = new ArrayList();
                for (Object obj8 : listM276r0) {
                    if (hashSet.add(((Class) obj8).getName())) {
                        arrayList13.add(obj8);
                    }
                }
                List listM281w04 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m273o0(C0034g.m10A(dexKitBridge2, AbstractC0120h.m252Z(new String[]{"SelectContactUI", "OnlyChatContactMgrUI"}), AbstractC0079h.m175T("mil")), AbstractC0079h.m167E("mil"))));
                if (listM281w03.isEmpty()) {
                    listM281w03 = AbstractC0079h.m167E("com.tencent.mm.ui.contact.SelectContactUI");
                }
                List listM277s0 = AbstractC0123k.m277s0(AbstractC0123k.m281w0(AbstractC0123k.m264A0(listM281w03)), 8);
                ArrayList arrayList14 = new ArrayList(AbstractC0125m.m289c0(arrayList13));
                Iterator it17 = arrayList13.iterator();
                while (it17.hasNext()) {
                    arrayList14.add(((Class) it17.next()).getName());
                }
                List listM277s02 = AbstractC0123k.m277s0(AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList14)), 12);
                if (listM281w04.isEmpty()) {
                    listM281w04 = AbstractC0079h.m167E("mil");
                }
                List listM277s03 = AbstractC0123k.m277s0(AbstractC0123k.m281w0(AbstractC0123k.m264A0(listM281w04)), 6);
                C0053z c0053z = new C0053z(listM277s0, listM277s02, listM277s03);
                if (listM277s0.isEmpty() || listM277s02.isEmpty() || listM277s03.isEmpty()) {
                    return null;
                }
                return c0053z;
            case 4:
                return m53e(obj);
            case 5:
                return m54f(obj);
            case 6:
                return m55g(obj);
            case 7:
                return m56h(obj);
            case 8:
                return m57i(obj);
            case 9:
                DexKitBridge dexKitBridge3 = (DexKitBridge) obj;
                AbstractC0223g.m418e(dexKitBridge3, "bridge");
                ClassLoader classLoader3 = context.getClassLoader();
                AbstractC0223g.m417d(classLoader3, "getClassLoader(...)");
                List listM45u2 = C0034g.m45u(dexKitBridge3, AbstractC0079h.m167E("com.tencent.mm.ui"), AbstractC0120h.m252Z(new String[]{"MvvmContactListUI", "ContactListUI", "label_name"}), false);
                ArrayList arrayList15 = new ArrayList();
                for (Object obj9 : listM45u2) {
                    String str3 = (String) obj9;
                    if (AbstractC0299i.m511i0(str3, "MvvmContactListUI", false) || AbstractC0299i.m511i0(str3, "ContactList", false)) {
                        arrayList15.add(obj9);
                    }
                }
                List listM281w05 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList15));
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                AbstractC0129q.m291e0(C0034g.m45u(dexKitBridge3, AbstractC0079h.m167E("com.tencent.mm.ui"), AbstractC0079h.m167E("contact"), true), linkedHashSet3);
                AbstractC0129q.m291e0(C0034g.m45u(dexKitBridge3, AbstractC0079h.m167E("com.tencent.mm.ui.mvvm"), AbstractC0079h.m167E("adapter"), true), linkedHashSet3);
                ArrayList arrayList16 = new ArrayList();
                Iterator it18 = linkedHashSet3.iterator();
                while (it18.hasNext()) {
                    try {
                        c0104d9 = Class.forName((String) it18.next(), false, classLoader3);
                    } catch (Throwable th10) {
                        c0104d9 = new C0104d(th10);
                    }
                    if (c0104d9 instanceof C0104d) {
                        c0104d9 = null;
                    }
                    Class cls10 = (Class) c0104d9;
                    if (cls10 != null) {
                        arrayList16.add(cls10);
                    }
                    break;
                }
                ArrayList arrayList17 = new ArrayList();
                for (Object obj10 : arrayList16) {
                    if (C0034g.m19J((Class) obj10)) {
                        arrayList17.add(obj10);
                    }
                }
                List listM276r02 = AbstractC0123k.m276r0(arrayList17, new C0033f(15, new C0032e(14)));
                ArrayList arrayList18 = new ArrayList(AbstractC0125m.m289c0(listM276r02));
                Iterator it19 = listM276r02.iterator();
                while (it19.hasNext()) {
                    arrayList18.add(((Class) it19.next()).getName());
                }
                List listM281w06 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList18));
                List listM281w07 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m273o0(C0034g.m10A(dexKitBridge3, AbstractC0120h.m252Z(new String[]{"INTENT_KEY_SEARCH_LABEL_USERNAME_LIST", "label_name", "label_id"}), AbstractC0120h.m263k0(new String[]{"mim", "k12"})), AbstractC0079h.m167E("mim"))));
                if (listM281w05.isEmpty()) {
                    listM281w05 = AbstractC0079h.m167E("com.tencent.mm.ui.mvvm.MvvmContactListUI");
                }
                List listM277s04 = AbstractC0123k.m277s0(AbstractC0123k.m281w0(AbstractC0123k.m264A0(listM281w05)), 8);
                if (!listM281w06.isEmpty()) {
                    list = listM281w06;
                }
                List listM277s05 = AbstractC0123k.m277s0(AbstractC0123k.m281w0(AbstractC0123k.m264A0(list)), 12);
                if (listM281w07.isEmpty()) {
                    listM281w07 = AbstractC0079h.m167E("mim");
                }
                List listM277s06 = AbstractC0123k.m277s0(AbstractC0123k.m281w0(AbstractC0123k.m264A0(listM281w07)), 6);
                C0027a0 c0027a0 = new C0027a0(listM277s04, listM277s05, listM277s06);
                if (listM277s04.isEmpty() || listM277s06.isEmpty()) {
                    return null;
                }
                return c0027a0;
            case 10:
                return m58j(obj);
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                C0095c c0095c = (C0095c) obj;
                AbstractC0223g.m418e(c0095c, "cdnRes");
                if (c0095c.f380d == null && c0095c.f377a == 200 && c0095c.f379c.length != 0) {
                    AbstractC0223g.m415b(context);
                    byte[] bArr = c0095c.f379c;
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(context.getFilesDir(), "res/raw/menu_ui.json"));
                    try {
                        fileOutputStream.write(bArr);
                        fileOutputStream.close();
                        AbstractC0503h.f1602k = System.currentTimeMillis();
                    } catch (Throwable th11) {
                        try {
                            throw th11;
                        } catch (Throwable th12) {
                            AbstractC0079h.m182f(fileOutputStream, th11);
                            throw th12;
                        }
                    }
                } else {
                    AbstractC0731a.m1386c("request jscdn remote menu fail", c0095c);
                }
                AbstractC0503h.f1601j = false;
                return C0109i.f404a;
            case 21:
                return m59k(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C0035h(Context context, int i2) {
        this.f231a = i2;
        this.f232b = context;
    }
}
