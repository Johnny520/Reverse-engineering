package com.p001mr.elaris;

import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p000.AbstractC0278j4;
import p000.AbstractC0423qa;
import p000.AbstractC0449s4;
import p000.AbstractC0497v4;
import p000.AbstractC0545y4;
import p000.C0209f2;
import p000.C0265ia;
import p000.C0401p4;

/* JADX INFO: renamed from: com.mr.elaris.d */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0150d extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f118a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0150d(int i) {
        super(70);
        this.f118a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0233, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x01b8, code lost:
    
        continue;
     */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        C0209f2 c0209f2;
        boolean z;
        int i;
        int i2;
        int iM806o;
        String str;
        Field[] declaredFields;
        Object[] objArr = methodHookParam.args;
        synchronized (AbstractC0449s4.f832b) {
            c0209f2 = AbstractC0449s4.f845o;
        }
        if (!AbstractC0449s4.m895n(c0209f2, true) || objArr == null || objArr.length == 0) {
            z = false;
        } else {
            int i3 = ((C0265ia) c0209f2.f246b).f415d;
            C0401p4 c0401p4 = new C0401p4();
            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
            int i4 = 0;
            while (true) {
                if (i4 < objArr.length) {
                    AbstractC0449s4.m906y(objArr[i4], 0, setNewSetFromMap, c0401p4);
                    if (c0401p4.f698c) {
                        break;
                    } else {
                        i4++;
                    }
                } else {
                    if (c0401p4.f696a < i3 || c0401p4.f697b <= 0) {
                        break;
                    }
                    AbstractC0449s4.m887f(c0209f2, "consumed");
                    AbstractC0449s4.m897p("official mixed send bypassed image hooks pic=" + c0401p4.f696a + " text=" + c0401p4.f697b + " expected=" + i3);
                    z = true;
                }
            }
            z = false;
        }
        if (!z) {
            ConcurrentHashMap concurrentHashMap = AbstractC0423qa.f760i;
            if (!Boolean.TRUE.equals(AbstractC0423qa.f763l.get()) && HookEntry.runtimeBool(Prefs.KEY_ORIGINAL_IMAGE_DEFAULT)) {
                Object objFindContactArg = HookEntry.findContactArg(objArr);
                if (objFindContactArg == null || ((iM806o = AbstractC0423qa.m806o(objFindContactArg, "chatType")) == Integer.MIN_VALUE && (iM806o = AbstractC0423qa.m806o(objFindContactArg, "type")) == Integer.MIN_VALUE)) {
                    iM806o = -1;
                }
                if (iM806o != -2 && objArr != null && objArr.length != 0 && AbstractC0423qa.m803l(objArr)) {
                    int i5 = 0;
                    for (Object obj : objArr) {
                        if (obj instanceof ArrayList) {
                            ArrayList arrayList = (ArrayList) obj;
                            if (arrayList.size() >= 2) {
                                HashSet hashSet = new HashSet();
                                for (int size = arrayList.size() - 1; size >= 0; size--) {
                                    String strM797f = AbstractC0423qa.m797f(AbstractC0423qa.m780A(arrayList.get(size), 0, Collections.newSetFromMap(new IdentityHashMap())));
                                    if (strM797f.length() != 0 && !hashSet.add(strM797f)) {
                                        try {
                                            arrayList.remove(size);
                                            i5++;
                                        } catch (Throwable unused) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (i5 > 0) {
                        AbstractC0423qa.m813v("list", i5);
                    }
                    String str2 = "";
                    Object objFindContactArg2 = HookEntry.findContactArg(objArr);
                    if (objFindContactArg2 == null) {
                        str = "contact:null";
                    } else {
                        int iM806o2 = AbstractC0423qa.m806o(objFindContactArg2, "chatType");
                        if (iM806o2 == Integer.MIN_VALUE && (iM806o2 = AbstractC0423qa.m806o(objFindContactArg2, "type")) == Integer.MIN_VALUE) {
                            iM806o2 = -1;
                        }
                        String strM800i = AbstractC0423qa.m800i(objFindContactArg2, "peerUid", "peerUin", "peer", "uid", "uin");
                        String strM800i2 = AbstractC0423qa.m800i(objFindContactArg2, "guildId", "guild", "guildCode");
                        if (strM800i.length() == 0 && strM800i2.length() == 0) {
                            int i6 = 0;
                            loop6: for (Class<?> superclass = objFindContactArg2.getClass(); superclass != null && superclass != Object.class && i6 < 24; superclass = superclass.getSuperclass()) {
                                try {
                                    declaredFields = superclass.getDeclaredFields();
                                } catch (Throwable unused2) {
                                    declaredFields = null;
                                }
                                if (declaredFields != null) {
                                    int length = declaredFields.length;
                                    int i7 = 0;
                                    while (true) {
                                        if (i7 < length) {
                                            Field field = declaredFields[i7];
                                            int i8 = i6 + 1;
                                            int i9 = i7;
                                            if (i6 >= 24) {
                                                i6 = i8;
                                                break;
                                            }
                                            try {
                                                if (!Modifier.isStatic(field.getModifiers()) && field.getType() == String.class) {
                                                    field.setAccessible(true);
                                                    Object obj2 = field.get(objFindContactArg2);
                                                    if ((obj2 instanceof String) && ((String) obj2).length() > 0) {
                                                        strM800i = (String) obj2;
                                                        break loop6;
                                                    }
                                                }
                                            } catch (Throwable unused3) {
                                            }
                                            i7 = i9 + 1;
                                            i6 = i8;
                                        }
                                    }
                                }
                            }
                            strM800i = "";
                        }
                        str = "contact:" + iM806o2 + ":" + AbstractC0423qa.m815x(strM800i) + ":" + AbstractC0423qa.m815x(strM800i2);
                    }
                    int length2 = objArr.length;
                    String str3 = "";
                    int i10 = 0;
                    int i11 = 0;
                    loop3: while (true) {
                        if (i10 < length2) {
                            Object obj3 = objArr[i10];
                            if (obj3 instanceof Collection) {
                                int i12 = 0;
                                for (Object obj4 : (Collection) obj3) {
                                    i12++;
                                    if (i12 > 8) {
                                        break;
                                    }
                                    String strM797f2 = AbstractC0423qa.m797f(AbstractC0423qa.m780A(obj4, 0, Collections.newSetFromMap(new IdentityHashMap())));
                                    if (strM797f2.length() != 0) {
                                        i11++;
                                        if (str3.length() != 0) {
                                            if (!str3.equals(strM797f2)) {
                                                break loop3;
                                            }
                                        } else {
                                            str3 = strM797f2;
                                        }
                                    }
                                }
                            }
                            i10++;
                        } else if (i11 == 1 && str3.length() != 0) {
                            str2 = str + "|" + str3;
                        }
                    }
                    if (str2.length() != 0) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (concurrentHashMap.size() > 80) {
                            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                                Long l = (Long) entry.getValue();
                                if (l == null || jCurrentTimeMillis - l.longValue() > 8000) {
                                    concurrentHashMap.remove(entry.getKey(), l);
                                }
                            }
                        }
                        Long l2 = (Long) concurrentHashMap.get(str2);
                        concurrentHashMap.put(str2, Long.valueOf(jCurrentTimeMillis));
                        if (l2 != null && jCurrentTimeMillis - l2.longValue() >= 0 && jCurrentTimeMillis - l2.longValue() <= 2600) {
                            AbstractC0423qa.m813v("call", 1);
                            Member member = methodHookParam.method;
                            AbstractC0497v4.m1080G(methodHookParam, member instanceof Method ? ((Method) member).getReturnType() : Void.TYPE);
                            return;
                        }
                    }
                }
            }
        }
        boolean zM803l = AbstractC0423qa.m803l(objArr);
        if (!z && HookEntry.runtimeBool(Prefs.KEY_ORIGINAL_IMAGE_DEFAULT) && zM803l) {
            HookEntry.logOriginalImageSendEntry(objArr);
            HookEntry.patchOriginalImageArgs(objArr);
        }
        if (objArr != null && (i2 = this.f118a) >= 0 && i2 < objArr.length) {
            Object obj5 = objArr[i2];
            if ((obj5 instanceof ArrayList) && !z) {
                ArrayList arrayList2 = (ArrayList) obj5;
                ThreadLocal threadLocal = AbstractC0545y4.f1088a;
                if (HookEntry.runtimeBool(Prefs.KEY_RENAME_APK_FILE) && !arrayList2.isEmpty()) {
                    threadLocal.set(Boolean.TRUE);
                    try {
                        for (Object obj6 : arrayList2) {
                            if (HookEntry.runtimeBool(Prefs.KEY_RENAME_APK_FILE)) {
                                AbstractC0545y4.m1168i(obj6, 0, new HashSet());
                            }
                        }
                    } finally {
                        threadLocal.remove();
                    }
                }
                if (HookEntry.hasDefaultMsgDecorations()) {
                    HookEntry.stripOutgoingMsgDecorations(arrayList2);
                }
            }
        }
        if (HookEntry.CONFIG.bool(Prefs.KEY_PIC_SUMMARY_ENABLED)) {
            Object[] objArr2 = methodHookParam.args;
            Object obj7 = (objArr2 == null || (i = this.f118a) < 0 || i >= objArr2.length) ? null : objArr2[i];
            if (!z && (obj7 instanceof ArrayList)) {
                ArrayList arrayList3 = (ArrayList) obj7;
                boolean z2 = true;
                if (AbstractC0423qa.m804m(arrayList3, true, 0, Collections.newSetFromMap(new IdentityHashMap()))) {
                    String[] strArr = AbstractC0278j4.f459a;
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    Map map = AbstractC0278j4.f462d;
                    synchronized (map) {
                        try {
                            Long l3 = (Long) map.remove(obj7);
                            AbstractC0278j4.m711c(jCurrentTimeMillis2);
                            if (l3 == null || l3.longValue() < jCurrentTimeMillis2) {
                                z2 = false;
                            }
                        } finally {
                        }
                    }
                    if (z2) {
                        return;
                    }
                    HookEntry.rewriteOutgoingPicSummary(arrayList3, HookEntry.findContactArg(methodHookParam.args));
                    return;
                }
            }
            if (z) {
                return;
            }
            HookEntry.logPicSummaryNoPicSend(obj7);
        }
    }
}
