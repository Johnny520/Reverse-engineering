package kotlin.reflect.jvm.internal;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.ViewGroup;
import androidx.appcompat.app.AbstractC0080;
import androidx.compose.animation.core.C0325;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.runtime.C1322;
import androidx.concurrent.futures.AbstractFutureC2143;
import androidx.concurrent.futures.C2136;
import androidx.concurrent.futures.C2139;
import androidx.core.os.AbstractC2175;
import androidx.core.view.C2242;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import io.ktor.client.plugins.AbstractC3932;
import io.ktor.server.application.AbstractC4053;
import io.ktor.server.application.C4057;
import io.ktor.server.routing.AbstractC4159;
import io.ktor.server.routing.C4160;
import io.ktor.util.C4203;
import io.ktor.util.C4208;
import io.ktor.util.C4210;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.nio.charset.Charset;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4346;
import kotlin.io.path.AbstractC4365;
import kotlin.io.path.AbstractC4367;
import kotlin.io.path.IllegalFileNameException;
import kotlin.io.path.OnErrorResult;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.CallableReference;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5107;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.jvm.AbstractC5080;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import kotlin.text.AbstractC5131;
import kotlin.text.AbstractC5138;
import kotlin.text.AbstractC5143;
import kotlin.text.AbstractC5144;
import net.bytebuddy.description.method.MethodDescription;
import p007.AbstractC6136;
import p010.AbstractC6154;
import p010.AbstractC6157;
import p010.C6160;
import p010.InterfaceC6159;
import p035.AbstractC6340;
import p047.C6491;
import p052.InterfaceC6550;
import p052.InterfaceC6557;
import p053.AbstractC6560;
import p070.C6897;
import p077.C6969;
import p077.C6970;
import p087.AbstractC7123;
import p087.C7124;
import p089.InterfaceC7183;
import p091.C7189;
import p091.C7191;
import p091.C7194;
import p091.C7197;
import p091.InterfaceC7190;
import p112.C7327;
import p164.AbstractC7665;
import p236.C8102;
import p253.AbstractC8189;
import p254.C8190;
import p299.AbstractC8607;
import p392.AbstractC9121;
import p392.AbstractC9124;
import p392.C9117;
import p392.C9125;
import top.sacz.xphelper.util.DexMethodDescriptor;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5061 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static boolean f14601 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C0325 f14602;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (kotlin.text.AbstractC5138.m10130(r1.f22418, r7) != false) goto L21;
     */
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p236.C8124 m10013(p236.C8124 r6, java.nio.charset.Charset r7) {
        /*
            r6.getClass()
            r7.getClass()
            java.lang.String r7 = r7.name()
            r7.getClass()
            java.lang.Object r0 = r6.f232
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            java.lang.String r2 = "charset"
            if (r1 == 0) goto L5c
            r3 = 1
            if (r1 == r3) goto L44
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L23
            goto L5c
        L23:
            java.util.Iterator r1 = r0.iterator()
        L27:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L5c
            java.lang.Object r3 = r1.next()
            飘花落叶言楪兰世哲子苏.飘花落叶言子楪哲兰世苏 r3 = (p236.C8119) r3
            java.lang.String r4 = r3.f22419
            boolean r4 = kotlin.text.AbstractC5138.m10130(r4, r2)
            if (r4 == 0) goto L27
            java.lang.String r3 = r3.f22418
            boolean r3 = kotlin.text.AbstractC5138.m10130(r3, r7)
            if (r3 == 0) goto L27
            goto L5b
        L44:
            r1 = 0
            java.lang.Object r1 = r0.get(r1)
            飘花落叶言楪兰世哲子苏.飘花落叶言子楪哲兰世苏 r1 = (p236.C8119) r1
            java.lang.String r3 = r1.f22419
            boolean r3 = kotlin.text.AbstractC5138.m10130(r3, r2)
            if (r3 == 0) goto L5c
            java.lang.String r1 = r1.f22418
            boolean r1 = kotlin.text.AbstractC5138.m10130(r1, r7)
            if (r1 == 0) goto L5c
        L5b:
            return r6
        L5c:
            飘花落叶言楪兰世哲子苏.飘花落叶言子楪苏世哲兰 r1 = new 飘花落叶言楪兰世哲子苏.飘花落叶言子楪苏世哲兰
            java.lang.String r3 = r6.f22428
            java.lang.String r4 = r6.f22427
            java.lang.Object r6 = r6.f231
            java.lang.String r6 = (java.lang.String) r6
            飘花落叶言楪兰世哲子苏.飘花落叶言子楪哲兰世苏 r5 = new 飘花落叶言楪兰世哲子苏.飘花落叶言子楪哲兰世苏
            r5.<init>(r2, r7)
            java.util.ArrayList r7 = kotlin.collections.AbstractC4343.m8821(r0, r5)
            r1.<init>(r3, r4, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.AbstractC5061.m10013(飘花落叶言楪兰世哲子苏.飘花落叶言子楪苏世哲兰, java.nio.charset.Charset):飘花落叶言楪兰世哲子苏.飘花落叶言子楪苏世哲兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static void m10014(String str, Set set) {
        try {
            AbstractC0455.m1145(m10021().concat(str), new JSONArray(set.toArray()).toString(), false);
        } catch (Exception e) {
            AbstractC6154.m11561(e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static void m10015(String str, HashMap map) {
        try {
            AbstractC0455.m1145(m10021().concat(str), JSONObject.toJSONString(map, new JSONWriter$Feature[0]), false);
        } catch (Exception e) {
            AbstractC6154.m11561(e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public static final Method m10016(String str) {
        int i = C9125.f25503;
        Method methodInstance = new DexMethodDescriptor(str).getMethodInstance(AbstractC9121.f25497);
        methodInstance.setAccessible(true);
        return methodInstance;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static void m10017(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC2175.m3962(viewGroup, z);
        } else if (f14601) {
            try {
                AbstractC2175.m3962(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                f14601 = false;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static final void m10018(Object obj, String str, Object obj2) {
        int i = C9117.f25488;
        C9117 c9117M14648 = C9117.m14648(obj.getClass());
        c9117M14648.f25490 = str;
        c9117M14648.f25489 = null;
        try {
            ((Field) c9117M14648.m14686()).set(obj, obj2);
        } catch (IllegalAccessException e) {
            C5919.m11252(e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static void m10019(Method method, InterfaceC6159 interfaceC6159) {
        XposedBridge.hookMethod(method, new C6160(interfaceC6159, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static Set m10020(String str) {
        try {
            Set set = (Set) JSONObject.parseObject(AbstractC0455.m1142(m10021().concat(str)), Set.class);
            return set == null ? new HashSet() : set;
        } catch (Exception unused) {
            return new HashSet();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static String m10021() {
        return AbstractC3932.m8313().concat(AbstractC3056.m6668(-3937561983390582183L));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final C8190 m10022(C4057 c4057) {
        C8190 c8190;
        c4057.getClass();
        Iterator it = AbstractC4343.m8804(AbstractC4053.m8467(c4057).m8598().keySet()).iterator();
        do {
            c8190 = null;
            if (!it.hasNext()) {
                break;
            }
            C4208 c4208 = (C4208) it.next();
            C4203 c4203M8467 = AbstractC4053.m8467(c4057);
            c4208.getClass();
            Object obj = c4203M8467.m8598().get(c4208);
            if (obj instanceof C8190) {
                c8190 = (C8190) obj;
            }
        } while (c8190 == null);
        return c8190 == null ? C8190.f22566 : c8190;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static HashMap m10023(String str) {
        try {
            HashMap map = (HashMap) JSONObject.parseObject(AbstractC0455.m1142(m10021().concat(str)), HashMap.class);
            return map == null ? new HashMap() : map;
        } catch (Exception unused) {
            return new HashMap();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final Object m10024(Class cls, String str, Object obj) {
        int i = C9117.f25488;
        C9117 c9117M14648 = C9117.m14648(obj.getClass());
        c9117M14648.f25490 = str;
        c9117M14648.f25489 = cls;
        return c9117M14648.m14653(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static Boolean m10025(Class cls) throws IllegalAccessException, InvocationTargetException {
        cls.getClass();
        Method method = (Method) m10030().f1095;
        if (method == null) {
            return null;
        }
        Object objInvoke = method.invoke(cls, null);
        objInvoke.getClass();
        return (Boolean) objInvoke;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static boolean m10026(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final boolean m10027(InterfaceC5063 interfaceC5063) {
        interfaceC5063.getClass();
        return AbstractC4394.m8917(interfaceC5063.getName(), MethodDescription.CONSTRUCTOR_INTERNAL_NAME);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final boolean m10028(InterfaceC5063 interfaceC5063) {
        interfaceC5063.getClass();
        return interfaceC5063.mo9948() != CallableReference.NO_RECEIVER;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final boolean m10029(InterfaceC5063 interfaceC5063) {
        interfaceC5063.getClass();
        return m10027(interfaceC5063) && interfaceC5063.mo9946().mo8889().isAnnotation();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static C0325 m10030() {
        C0325 c0325;
        C0325 c03252 = f14602;
        if (c03252 != null) {
            return c03252;
        }
        Object obj = null;
        try {
            c0325 = new C0325(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 7);
        } catch (NoSuchMethodException unused) {
            c0325 = new C0325(obj, obj, obj, obj, 7);
        }
        f14602 = c0325;
        return c0325;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final Object m10031(Object obj, String str, Object... objArr) {
        obj.getClass();
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj2 = objArr[i];
            arrayList.add(obj2 == null ? AbstractC9124.class : obj2.getClass());
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        int i2 = C9125.f25503;
        C9125 c9125M14680 = C9125.m14680(obj.getClass());
        c9125M14680.f25504 = str;
        c9125M14680.m14683((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        return c9125M14680.m14682(obj, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C7189 m10032(String str, AbstractC4921 abstractC4921, InterfaceC7190[] interfaceC7190Arr) {
        if (AbstractC5143.m10164(str)) {
            C5919.m11249("Blank serial names are prohibited");
            return null;
        }
        if (abstractC4921.equals(C7197.f19213)) {
            C5919.m11249("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        C7194 c7194 = new C7194(str);
        return new C7189(str, abstractC4921, c7194.f19206.size(), AbstractC4346.m8850(interfaceC7190Arr), c7194);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7189 m10033(String str, AbstractC4921 abstractC4921, InterfaceC7190[] interfaceC7190Arr, InterfaceC6557 interfaceC6557) {
        if (AbstractC5143.m10164(str)) {
            C5919.m11249("Blank serial names are prohibited");
            return null;
        }
        if (abstractC4921.equals(C7197.f19213)) {
            C5919.m11249("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        C7194 c7194 = new C7194(str);
        interfaceC6557.invoke(c7194);
        return new C7189(str, abstractC4921, c7194.f19206.size(), AbstractC4346.m8850(interfaceC7190Arr), c7194);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7327 m10034(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new C7327(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7124 m10035(String str, C7191 c7191) {
        if (AbstractC5143.m10164(str)) {
            C5919.m11249("Blank serial names are prohibited");
            return null;
        }
        for (InterfaceC7183 interfaceC7183 : AbstractC7123.f19066.values()) {
            if (str.equals(interfaceC7183.getDescriptor().mo12355())) {
                StringBuilder sbM11550 = AbstractC6136.m11550("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                sbM11550.append(AbstractC4395.f12971.mo8927(interfaceC7183.getClass()).getSimpleName());
                sbM11550.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                C5919.m11249(AbstractC5144.m10174(sbM11550.toString()));
                return null;
            }
        }
        return new C7124(str, c7191);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final AbstractC4159 m10036(String str, boolean z) {
        if (!z) {
            return AbstractC4159.f12601;
        }
        if (str == null) {
            return AbstractC4159.f12599;
        }
        if (str.length() != 0) {
            return AbstractC4159.f12599;
        }
        return new C4160(0.2d, 1, 2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final AbstractC4159 m10037(List list, int i, String str, String str2, String str3, boolean z) {
        String strM10169;
        list.getClass();
        if (i >= list.size()) {
            return m10036(null, z);
        }
        String str4 = (String) list.get(i);
        if (str4.length() == 0) {
            return m10036(str4, z);
        }
        if (str2 == null) {
            strM10169 = str4;
        } else {
            if (!AbstractC5138.m10125(str4, str2, false)) {
                return m10036(str4, z);
            }
            strM10169 = AbstractC5143.m10169(str2.length(), str4);
        }
        if (str3 != null) {
            if (!strM10169.endsWith(str3)) {
                return m10036(str4, z);
            }
            strM10169 = AbstractC5143.m10170(str3.length(), strM10169);
        }
        return new C4160(((str2 == null || str2.length() == 0) && (str3 == null || str3.length() == 0)) ? 0.8d : 0.9d, new C8102(str, AbstractC8189.m13660(strM10169)), 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static ColorStateList m10038(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !AbstractC7665.m12918(drawable)) {
            return null;
        }
        return AbstractC8607.m14218(drawable).getColorStateList();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final JSONObject m10039() {
        String strM6668;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AbstractC3056.m6668(-3937356748378342823L), AbstractC6157.m11576());
        jSONObject.put(AbstractC3056.m6668(-3937356666773964199L), AbstractC6340.f17462);
        jSONObject.put(AbstractC3056.m6668(-3937356675363898791L), AbstractC3056.m6668(-3937562241088619943L));
        String strM66682 = AbstractC3056.m6668(-3937356632414225831L);
        try {
            Field field = XposedBridge.class.getField(AbstractC3056.m6668(-3937633842488411559L));
            field.setAccessible(true);
            Object obj = field.get(null);
            AbstractC3056.m6668(-3937713569966327207L);
            obj.getClass();
            strM6668 = (String) obj;
        } catch (Exception unused) {
            strM6668 = AbstractC3056.m6668(-3937627554656290215L);
        }
        jSONObject.put(strM66682, strM6668);
        jSONObject.put(AbstractC3056.m6668(-3937356503565206951L), Build.BRAND);
        jSONObject.put(AbstractC3056.m6668(-3937356452025599399L), Build.DISPLAY);
        jSONObject.put(AbstractC3056.m6668(-3937356464910501287L), Build.VERSION.RELEASE);
        jSONObject.put(AbstractC3056.m6668(-3937356426255795623L), Integer.valueOf(Build.VERSION.SDK_INT));
        jSONObject.put(AbstractC3056.m6668(-3937356301701744039L), Build.MODEL);
        return jSONObject;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C6969 m10040(C6970 c6970, C4687 c4687, C6897 c6897) {
        c6970.getClass();
        c4687.getClass();
        c6897.getClass();
        C2242 c2242M12259 = c6970.m12259(c4687, c6897);
        if (c2242M12259 != null) {
            return (C6969) c2242M12259.f6536;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final Object m10041(InterfaceC5063 interfaceC5063) {
        Class clsM9871;
        interfaceC5063.getClass();
        Object objMo9948 = interfaceC5063.mo9948();
        if (!(interfaceC5063 instanceof InterfaceC5074) || !AbstractC4921.m9885((InterfaceC5074) interfaceC5063)) {
            Iterator it = interfaceC5063.mo9964().iterator();
            boolean z = false;
            Object obj = null;
            while (true) {
                if (!it.hasNext()) {
                    if (!z) {
                        break;
                    }
                } else {
                    Object next = it.next();
                    if (((InterfaceC5107) next).getKind() != KParameter$Kind.VALUE) {
                        if (z) {
                            break;
                        }
                        z = true;
                        obj = next;
                    }
                }
            }
            obj = null;
            InterfaceC5107 interfaceC5107 = (InterfaceC5107) obj;
            InterfaceC5086 type = interfaceC5107 != null ? interfaceC5107.getType() : null;
            if (type != null && (clsM9871 = AbstractC4921.m9871(type)) != null) {
                return AbstractC4921.m9894(clsM9871, interfaceC5063).invoke(objMo9948, null);
            }
        }
        return objMo9948;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0108  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p077.C6969 m10042(java.lang.Class r15) throws java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.AbstractC5061.m10042(java.lang.Class):飘花落叶言世楪子哲兰苏.飘花落叶言子楪世哲苏兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final FileVisitResult m10043(InterfaceC6550 interfaceC6550, Path path, Path path2, Path path3, Path path4, Exception exc) {
        int i = AbstractC4365.f12936[((OnErrorResult) interfaceC6550.invoke(path4, m10049(path, path2, path3, path4), exc)).ordinal()];
        if (i == 1) {
            return FileVisitResult.TERMINATE;
        }
        if (i == 2) {
            return FileVisitResult.SKIP_SUBTREE;
        }
        C4210.m8621();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:44:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0095 A[SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p164.C7663[] m10044(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.AbstractC5061.m10044(java.lang.String):飘花落叶言子哲楪苏世兰.飘花落叶言子楪世哲兰苏[]");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final Object m10045(InterfaceC5086 interfaceC5086) {
        Class clsM12029 = AbstractC6560.m12029(AbstractC5080.m10088(interfaceC5086));
        if (clsM12029.isArray()) {
            Object objNewInstance = Array.newInstance(clsM12029.getComponentType(), 0);
            objNewInstance.getClass();
            return objNewInstance;
        }
        throw new KotlinReflectionInternalError("Cannot instantiate the default empty array of type " + clsM12029.getSimpleName() + ", because it is not an array type");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final Object m10046(Class cls, Map map, List list) {
        cls.getClass();
        list.getClass();
        InterfaceC5183 interfaceC5183M10210 = AbstractC5186.m10210(new C1322(map, 12));
        Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C6491(cls, map, AbstractC5186.m10210(new C5027(cls, 17, map)), interfaceC5183M10210, list));
        objNewProxyInstance.getClass();
        return objNewProxyInstance;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static /* synthetic */ Object m10047(Class cls, Map map) {
        Set setKeySet = map.keySet();
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(cls.getDeclaredMethod((String) it.next(), null));
        }
        return m10046(cls, map, arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static float[] m10048(float[] fArr, int i) {
        if (i < 0) {
            C5919.m11245();
            return null;
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final Path m10049(Path path, Path path2, Path path3, Path path4) throws IllegalFileNameException {
        path.getClass();
        try {
            Path pathResolve = path2.resolve(AbstractC4367.m8877(path4, path).toString());
            if (pathResolve.normalize().startsWith(path3)) {
                return pathResolve;
            }
            throw new IllegalFileNameException(path4, pathResolve, "Copying files to outside the specified target directory is prohibited. The directory being recursively copied might contain an entry with an illegal name.");
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "\nthis path: " + path4 + "\nbase path: " + path, e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final Charset m10050(AbstractC0080 abstractC0080) {
        abstractC0080.getClass();
        String strM308 = abstractC0080.m308("charset");
        if (strM308 == null) {
            return null;
        }
        try {
            Charset charset = AbstractC5131.f14688;
            Charset charsetForName = Charset.forName(strM308);
            charsetForName.getClass();
            return charsetForName;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final void m10051(Path path) throws IllegalFileNameException {
        path.getClass();
        Path fileName = path.getFileName();
        String string = fileName != null ? fileName.toString() : null;
        if (string == null) {
            string = "";
        }
        int iHashCode = string.hashCode();
        if (iHashCode != 46) {
            if (iHashCode != 1518) {
                if (iHashCode != 45679) {
                    if (iHashCode != 45724) {
                        if (iHashCode != 1472) {
                            if (iHashCode != 1473 || !string.equals("./")) {
                                return;
                            }
                        } else if (!string.equals("..")) {
                            return;
                        }
                    } else if (!string.equals("..\\")) {
                        return;
                    }
                } else if (!string.equals("../")) {
                    return;
                }
            } else if (!string.equals(".\\")) {
                return;
            }
        } else if (!string.equals(".")) {
            return;
        }
        throw new IllegalFileNameException(path);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public abstract void mo3858(C2136 c2136, Thread thread);

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public abstract int mo10052(boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public abstract int mo10053(boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public abstract void mo3859(C2136 c2136, C2136 c21362);

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public abstract int mo10054(boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract boolean mo3860(AbstractFutureC2143 abstractFutureC2143, C2139 c2139);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public abstract boolean mo3861(AbstractFutureC2143 abstractFutureC2143, C2136 c2136, C2136 c21362);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public abstract boolean mo3862(AbstractFutureC2143 abstractFutureC2143, Object obj, Object obj2);
}
