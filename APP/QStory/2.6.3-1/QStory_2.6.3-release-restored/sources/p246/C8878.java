package p246;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.animation.core.C1171;
import androidx.core.view.AbstractC3103;
import androidx.recyclerview.widget.C3325;
import com.alibaba.fastjson2.AbstractC3766;
import com.alibaba.fastjson2.InterfaceC3749;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.annotation.JSONCompiler$CompilerOption;
import com.alibaba.fastjson2.reader.C3603;
import com.alibaba.fastjson2.reader.C3604;
import com.alibaba.fastjson2.reader.C3613;
import com.alibaba.fastjson2.util.AbstractC3687;
import com.alibaba.fastjson2.util.AbstractC3693;
import com.alibaba.fastjson2.util.AbstractC3698;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.gson.C4084;
import com.google.gson.C4085;
import com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN;
import com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN;
import com.kongzue.dialogx.interfaces.InterfaceC4577;
import com.kongzue.dialogx.util.views.InterfaceC4589;
import io.github.oshai.kotlinlogging.Level;
import io.ktor.util.C5043;
import io.ktor.util.internal.C5022;
import io.ktor.util.internal.C5023;
import io.ktor.utils.p007io.C5080;
import io.modelcontextprotocol.kotlin.sdk.server.C5125;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.AbstractC6019;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5220;
import kotlin.reflect.InterfaceC5940;
import kotlin.reflect.InterfaceC5942;
import kotlin.reflect.jvm.internal.C5836;
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import net.bytebuddy.utility.JavaConstant;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p103.C7897;
import p105.C8009;
import p171.InterfaceC8444;
import p183.C8541;
import p254.AbstractC8960;
import p254.AbstractC8961;
import p256.C8963;
import p256.C8964;
import p258.C8972;
import p265.C8988;
import p265.InterfaceC8989;
import p267.C9012;
import p267.SharedPreferencesC9005;
import p273.C9029;
import p273.C9037;
import p273.C9038;
import p273.C9041;
import p273.C9062;
import p273.C9068;
import p273.C9069;
import p277.AbstractC9077;
import p294.C9192;
import p294.C9194;
import p295.InterfaceC9195;
import p295.InterfaceC9196;
import p295.InterfaceC9198;
import p307.C9277;
import p307.C9350;
import p307.C9368;
import p307.InterfaceC9352;
import p361.C9663;
import p364.InterfaceC9672;
import p369.InterfaceC9702;
import p412.C9942;
import p414.InterfaceC9970;
import top.yukonga.miuix.kmp.utils.C6886;

/* JADX INFO: renamed from: 飘花落叶言楪世子苏兰哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8878 implements InterfaceC8989, InterfaceC4589, InterfaceC4577, InterfaceC8444, InterfaceC9702 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static String f22563 = "";

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f22564;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22565;

    public C8878(int i) {
        this.f22565 = i;
        switch (i) {
            case 15:
                String strM14532 = "default";
                "id";
                C9012 c9012 = new C9012(f22563, strM14532);
                c9012.f22895 = new C5317();
                this.f22564 = c9012.m14232();
                break;
            case 16:
                C9663 c9663 = C9663.f25281;
                C4084 c4084 = new C4084();
                c4084.m7893();
                C4085 c4085M7894 = c4084.m7894();
                C1171 c1171 = new C1171(19);
                c1171.m1531("https://qstory.suzhelan.top");
                C9663.f25281.getClass();
                c1171.f1440 = C9663.m15050(false);
                ((ArrayList) c1171.f1439).add(new C9942(c4085M7894));
                Object objM1108 = c1171.m1530().m1108(InterfaceC9672.class);
                "create(...)";
                objM1108.getClass();
                this.f22564 = (InterfaceC9672) objM1108;
                break;
            default:
                this.f22564 = new C8972();
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static Class m14087(Class cls) {
        String name = cls.getName();
        if (!"com.fasterxml.jackson.databind.JsonSerializer$None".equals(name) && InterfaceC9352.class.isAssignableFrom(cls)) {
            return cls;
        }
        if ("com.fasterxml.jackson.databind.ser.std.ToStringSerializer".equals(name)) {
            return C9277.class;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static void m14088(C9192 c9192, InterfaceC9196 interfaceC9196) {
        String strName = interfaceC9196.name();
        if (!strName.isEmpty()) {
            c9192.f23394 = strName;
        }
        String strDefaultValue = interfaceC9196.defaultValue();
        if (!strDefaultValue.isEmpty()) {
            c9192.f23404 = strDefaultValue;
        }
        m14089(c9192, interfaceC9196.format());
        String strLabel = interfaceC9196.label();
        if (!strLabel.isEmpty()) {
            c9192.f23392 = strLabel;
        }
        String strLocale = interfaceC9196.locale();
        if (!strLocale.isEmpty()) {
            String[] strArrSplit = strLocale.split(JavaConstant.Dynamic.DEFAULT_NAME);
            if (strArrSplit.length == 2) {
                c9192.f23401 = new Locale(strArrSplit[0], strArrSplit[1]);
            }
        }
        boolean zSerialize = interfaceC9196.serialize();
        boolean z = !zSerialize;
        if (!c9192.f23389) {
            c9192.f23389 = z;
        }
        if (!interfaceC9196.skipTransient()) {
            c9192.f23399 = false;
            if (c9192.f23400 && !c9192.f23403) {
                c9192.f23389 = false;
            }
        }
        if (interfaceC9196.unwrapped()) {
            c9192.f23390 |= 562949953421312L;
        }
        for (JSONWriter$Feature jSONWriter$Feature : interfaceC9196.serializeFeatures()) {
            c9192.f23390 |= jSONWriter$Feature.mask;
            if (c9192.f23389 && !c9192.f23400 && zSerialize && jSONWriter$Feature == JSONWriter$Feature.FieldBased) {
                c9192.f23389 = false;
            }
        }
        int iOrdinal = interfaceC9196.ordinal();
        if (iOrdinal != 0) {
            c9192.f23391 = iOrdinal;
        }
        if (interfaceC9196.value()) {
            c9192.f23390 |= 281474976710656L;
        }
        if (interfaceC9196.jsonDirect()) {
            c9192.f23390 |= 1125899906842624L;
        }
        Class clsSerializeUsing = interfaceC9196.serializeUsing();
        if (InterfaceC9352.class.isAssignableFrom(clsSerializeUsing)) {
            c9192.f23405 = clsSerializeUsing;
        }
        Class clsContentAs = interfaceC9196.contentAs();
        if (clsContentAs != Void.class) {
            c9192.f23398 = clsContentAs;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static void m14089(C9192 c9192, String str) {
        if (str.isEmpty()) {
            return;
        }
        String strTrim = str.trim();
        if (strTrim.indexOf(84) != -1 && !strTrim.contains("'T'")) {
            strTrim = strTrim.replace("T", "'T'");
        }
        if (strTrim.isEmpty()) {
            return;
        }
        c9192.f23393 = strTrim;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static void m14090(C9192 c9192, Enum[] enumArr) {
        for (Enum r0 : enumArr) {
            String strName = r0.name();
            strName.getClass();
            switch (strName) {
                case "DisableCircularReferenceDetect":
                    c9192.f23390 |= 144115188075855872L;
                    break;
                case "WriteNullNumberAsZero":
                    c9192.f23390 |= JSONWriter$Feature.WriteNullNumberAsZero.mask;
                    break;
                case "IgnoreErrorGetter":
                    c9192.f23390 |= JSONWriter$Feature.IgnoreErrorGetter.mask;
                    break;
                case "UseISO8601DateFormat":
                    c9192.f23393 = "iso8601";
                    break;
                case "WriteBigDecimalAsPlain":
                    c9192.f23390 |= JSONWriter$Feature.WriteBigDecimalAsPlain.mask;
                    break;
                case "WriteEnumUsingToString":
                    c9192.f23390 |= JSONWriter$Feature.WriteEnumUsingToString.mask;
                    break;
                case "BrowserCompatible":
                    c9192.f23390 |= JSONWriter$Feature.BrowserCompatible.mask;
                    break;
                case "WriteNullStringAsEmpty":
                    c9192.f23390 |= JSONWriter$Feature.WriteNullStringAsEmpty.mask;
                    break;
                case "NotWriteRootClassName":
                    c9192.f23390 |= JSONWriter$Feature.NotWriteRootClassName.mask;
                    break;
                case "WriteNullListAsEmpty":
                    c9192.f23390 |= JSONWriter$Feature.WriteNullListAsEmpty.mask;
                    break;
                case "WriteNonStringValueAsString":
                    c9192.f23390 |= JSONWriter$Feature.WriteNonStringValueAsString.mask;
                    break;
                case "WriteNullBooleanAsFalse":
                    c9192.f23390 |= JSONWriter$Feature.WriteNullBooleanAsFalse.mask;
                    break;
                case "WriteClassName":
                    c9192.f23390 |= JSONWriter$Feature.WriteClassName.mask;
                    break;
                case "WriteMapNullValue":
                    c9192.f23390 |= JSONWriter$Feature.WriteNulls.mask;
                    break;
            }
        }
    }

    @Override // p265.InterfaceC8989
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public void mo9604(C5125 c5125) {
        m14097(Level.WARN, new C6886(c5125, 7));
    }

    @Override // p265.InterfaceC8989
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public void mo9605(InterfaceC7372 interfaceC7372) {
        m14097(Level.INFO, new C5080(interfaceC7372, 4));
    }

    @Override // p265.InterfaceC8989
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public void mo9606(InterfaceC7372 interfaceC7372) {
        m14097(Level.TRACE, new C5080(interfaceC7372, 2));
    }

    @Override // p265.InterfaceC8989
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo9607(InterfaceC7372 interfaceC7372) {
        m14097(Level.DEBUG, new C5080(interfaceC7372, 5));
    }

    @Override // p171.InterfaceC8444
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public boolean mo901(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f22564;
        if (!swipeDismissBehavior.mo7568(view)) {
            return false;
        }
        boolean z = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.f10356;
        int width = (!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth();
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        return true;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC4577
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo8622(Rect rect) {
        C3325 c3325 = (C3325) this.f22564;
        if (((C9041) c3325.f7808).f22999 == DialogXStyle$PopTipSettings$ALIGN.TOP_INSIDE) {
            ((LinearLayout) c3325.f7806).setPadding(0, rect.top, 0, 0);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public void m14091(C8964 c8964, Object obj) throws Throwable {
        C5023 c5023 = (C5023) ((C8972) this.f22564).m14156(c8964);
        Throwable th = null;
        if (c5023 != null) {
            Object objM9117 = c5023.m9117();
            objM9117.getClass();
            for (C5022 c5022M9116 = (C5022) objM9117; !c5022M9116.equals(c5023); c5022M9116 = c5022M9116.m9116()) {
                if (c5022M9116 instanceof C8963) {
                    try {
                        InterfaceC7387 interfaceC7387 = ((C8963) c5022M9116).f22789;
                        AbstractC5220.m9447(1, interfaceC7387);
                        interfaceC7387.invoke(obj);
                    } catch (Throwable th2) {
                        if (th != null) {
                            AbstractC6019.m10775(th, th2);
                        } else {
                            th = th2;
                        }
                    }
                }
            }
        }
        if (th != null) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public void m14092(Object obj, String str) {
        SharedPreferencesC9005 sharedPreferencesC9005 = (SharedPreferencesC9005) this.f22564;
        "key";
        "value";
        if (obj instanceof String) {
            sharedPreferencesC9005.putString(str, (String) obj);
            return;
        }
        if (obj instanceof Integer) {
            sharedPreferencesC9005.putInt(str, ((Number) obj).intValue());
            return;
        }
        if (obj instanceof Boolean) {
            sharedPreferencesC9005.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Float) {
            sharedPreferencesC9005.putFloat(str, ((Number) obj).floatValue());
            return;
        }
        if (obj instanceof Long) {
            sharedPreferencesC9005.putLong(str, ((Number) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            sharedPreferencesC9005.m14227(str, ((Number) obj).doubleValue());
        } else if (obj instanceof byte[]) {
            sharedPreferencesC9005.m14223(str, (byte[]) obj);
        } else {
            sharedPreferencesC9005.putString(str, InterfaceC3749.m6935(obj));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public void m14093(C8964 c8964, InterfaceC7387 interfaceC7387) {
        ((C5023) ((C8972) this.f22564).m14157(c8964, new C8009(11))).m9121(new C8963(interfaceC7387));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public void m14094(C9194 c9194, C9192 c9192, Class cls, Method method) {
        Field fieldM6374;
        Method declaredMethod;
        C9368 c9368 = ((C9350) this.f22564).f24052;
        Class cls2 = (Class) c9368.f24128.get(cls);
        String name = method.getName();
        if ("getTargetSql".equals(name) && cls != null && cls.getName().startsWith("com.baomidou.mybatisplus.")) {
            c9192.f23390 |= JSONWriter$Feature.IgnoreErrorGetter.mask;
        }
        if (cls2 != null && cls2 != cls) {
            try {
                declaredMethod = cls2.getDeclaredMethod(name, method.getParameterTypes());
            } catch (Exception unused) {
                declaredMethod = null;
            }
            if (declaredMethod != null) {
                m14094(c9194, c9192, cls2, declaredMethod);
            }
        }
        if (((Class) c9368.f24128.get(method.getReturnType())) != null) {
            c9192.f23408 = true;
        }
        Class cls3 = AbstractC3687.f9275;
        int i = 0;
        if (cls3 != null && method.getAnnotation(cls3) != null) {
            c9192.f23389 = true;
            c9192.f23400 = true;
            if (!c9194.f23426) {
                c9192.f23399 = false;
                c9192.f23389 = false;
            }
        }
        if (cls != null) {
            Class superclass = cls.getSuperclass();
            Method methodM6357 = AbstractC3698.m6357(method, superclass);
            boolean z = c9192.f23389;
            if (methodM6357 != null) {
                m14094(c9194, c9192, superclass, methodM6357);
                Field fieldM63742 = AbstractC3698.m6374(method, cls);
                int modifiers = methodM6357.getModifiers();
                if (fieldM63742 != null && z != c9192.f23389 && !Modifier.isAbstract(modifiers) && !methodM6357.equals(method)) {
                    c9192.f23389 = z;
                }
            }
            for (Class<?> cls4 : cls.getInterfaces()) {
                Method methodM63572 = AbstractC3698.m6357(method, cls4);
                if (superclass != null && methodM63572 != null) {
                    m14094(c9194, c9192, superclass, methodM63572);
                }
            }
        }
        c9192.f23403 = false;
        m14096(c9192, AbstractC3698.m6380(method));
        if (!cls.getName().startsWith("java.lang") && !AbstractC3698.m6350(cls) && (fieldM6374 = AbstractC3698.m6374(method, cls)) != null) {
            c9192.f23390 |= 4503599627370496L;
            m14095(c9194, c9192, cls, fieldM6374);
        }
        boolean z2 = c9194.f23438;
        if (!z2 || c9194.f23454 == null || c9194.f23453 == null) {
            return;
        }
        String strM6364 = AbstractC3698.m6364(method, z2, null);
        while (true) {
            String[] strArr = c9194.f23453;
            if (i >= strArr.length) {
                return;
            }
            if (strM6364.equals(strArr[i])) {
                Annotation[][] parameterAnnotations = c9194.f23454.getParameterAnnotations();
                if (i < parameterAnnotations.length) {
                    m14096(c9192, parameterAnnotations[i]);
                    return;
                }
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x01a9 A[EDGE_INSN: B:214:0x01a9->B:111:0x01a9 BREAK  A[LOOP:1: B:105:0x018f->B:110:0x01a6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e1  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m14095(C9194 c9194, C9192 c9192, Class cls, Field field) {
        Object obj;
        String[] strArr;
        int i;
        int i2;
        Class cls2;
        Field declaredField;
        InterfaceC9196 interfaceC9196 = null;
        if (cls != null && (cls2 = (Class) ((C9350) this.f22564).f24052.f24128.get(cls)) != null && cls2 != cls) {
            try {
                declaredField = cls2.getDeclaredField(field.getName());
            } catch (Exception unused) {
                declaredField = null;
            }
            if (declaredField != null) {
                m14095(c9194, c9192, cls2, declaredField);
            }
        }
        int i3 = 1;
        if (((Class) ((C9350) this.f22564).f24052.f24128.get(field.getType())) != null) {
            c9192.f23408 = true;
        }
        if (Modifier.isTransient(field.getModifiers())) {
            c9192.f23400 = true;
            if (c9192.f23399 && c9194.f23426) {
                c9192.f23389 = true;
            }
        }
        Annotation[] annotationArrM6380 = AbstractC3698.m6380(field);
        if (annotationArrM6380.length == 0) {
            if (AbstractC3693.f9315 == null && !AbstractC3693.f9314) {
                try {
                    AbstractC3693.f9315 = Metadata.class;
                } catch (Throwable unused2) {
                    AbstractC3693.f9314 = true;
                }
            }
            if (AbstractC3693.f9315 != null && cls.isAnnotationPresent(AbstractC3693.f9315)) {
                annotationArrM6380 = AbstractC3698.m6380(field.getType());
                Constructor[] constructorArrM6381 = AbstractC3698.m6381(cls);
                int length = constructorArrM6381.length;
                Constructor constructor = null;
                int i4 = 0;
                while (i4 < length) {
                    Constructor constructor2 = constructorArrM6381[i4];
                    Class<?>[] parameterTypes = constructor2.getParameterTypes();
                    if (parameterTypes.length > 0) {
                        i2 = i3;
                        if ("kotlin.jvm.internal.飘花落叶言子楪世哲苏兰".equals(parameterTypes[parameterTypes.length - i3].getName())) {
                        }
                        i4++;
                        i3 = i2;
                    } else {
                        i2 = i3;
                    }
                    if (constructor == null || constructor.getParameterTypes().length < parameterTypes.length) {
                        constructor = constructor2;
                    }
                    i4++;
                    i3 = i2;
                }
                boolean z = i3;
                if (constructor != null) {
                    if (AbstractC3693.f9312 == null && !AbstractC3693.f9313) {
                        try {
                            HashSet hashSet = C5836.f14768;
                            AbstractC3693.f9312 = C5836.class.getConstructor(Class.class);
                        } catch (Throwable unused3) {
                            AbstractC3693.f9313 = z;
                        }
                    }
                    if (AbstractC3693.f9312 != null) {
                        if (AbstractC3693.f9311 == null && !AbstractC3693.f9313) {
                            try {
                                HashSet hashSet2 = C5836.f14768;
                                AbstractC3693.f9311 = C5836.class.getMethod("getConstructors", null);
                            } catch (Throwable unused4) {
                                AbstractC3693.f9313 = z;
                            }
                        }
                        if (AbstractC3693.f9310 == null && !AbstractC3693.f9313) {
                            try {
                                AbstractC3693.f9310 = InterfaceC5942.class.getMethod("getParameters", null);
                            } catch (Throwable unused5) {
                                AbstractC3693.f9313 = z;
                            }
                        }
                        if (AbstractC3693.f9317 == null && !AbstractC3693.f9313) {
                            try {
                                AbstractC3693.f9317 = InterfaceC5940.class.getMethod("getName", null);
                            } catch (Throwable unused6) {
                                AbstractC3693.f9313 = z;
                            }
                        }
                        if (AbstractC3693.f9316) {
                            strArr = null;
                            i = 0;
                            while (true) {
                                if (i >= strArr.length) {
                                    break;
                                }
                                if (strArr[i].equals(field.getName())) {
                                    annotationArrM6380 = constructor.getParameterAnnotations()[i];
                                    break;
                                }
                                i++;
                            }
                            if (c9192.f23389) {
                                for (Annotation annotation : annotationArrM6380) {
                                    if (annotation.annotationType() == InterfaceC9196.class) {
                                        c9192.f23389 = !((InterfaceC9196) r7).serialize();
                                    }
                                }
                            }
                        } else {
                            try {
                                obj = null;
                                for (Object obj2 : (Iterable) AbstractC3693.f9311.invoke(AbstractC3693.f9312.newInstance(cls), null)) {
                                    List list = (List) AbstractC3693.f9310.invoke(obj2, null);
                                    if (obj == null || list.size() != 0) {
                                        obj = obj2;
                                    }
                                }
                            } catch (Throwable th) {
                                th.printStackTrace();
                                AbstractC3693.f9316 = z;
                            }
                            if (obj != null) {
                                List list2 = (List) AbstractC3693.f9310.invoke(obj, null);
                                strArr = new String[list2.size()];
                                for (int i5 = 0; i5 < list2.size(); i5++) {
                                    strArr[i5] = (String) AbstractC3693.f9317.invoke(list2.get(i5), null);
                                }
                                i = 0;
                                while (true) {
                                    if (i >= strArr.length) {
                                    }
                                    i++;
                                }
                                if (c9192.f23389) {
                                }
                            }
                            strArr = null;
                            i = 0;
                            while (true) {
                                if (i >= strArr.length) {
                                }
                                i++;
                            }
                            if (c9192.f23389) {
                            }
                        }
                    }
                }
            }
        }
        for (Annotation annotation2 : annotationArrM6380) {
            Class<? extends Annotation> clsAnnotationType = annotation2.annotationType();
            if (interfaceC9196 != null || (interfaceC9196 = (InterfaceC9196) AbstractC3698.m6379(annotation2, InterfaceC9196.class)) != annotation2) {
                String name = clsAnnotationType.getName();
                boolean z2 = AbstractC3766.f9633;
                if (name.equals("飘花落叶言楪哲子世兰苏.飘花落叶言子楪世苏兰哲")) {
                    if (AbstractC3766.f9632) {
                        AbstractC3698.m6371(annotation2.getClass(), new C3613(annotation2, c9192, 7));
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonInclude")) {
                    if (z2) {
                        AbstractC3698.m6371(annotation2.getClass(), new C3604(annotation2, c9194, 6));
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonManagedReference")) {
                    if (z2) {
                        c9192.f23390 |= JSONWriter$Feature.ReferenceDetection.mask;
                    }
                } else if (name.equals("com.fasterxml.jackson.databind.annotation.JsonSerialize")) {
                    if (z2) {
                        AbstractC3698.m6371(annotation2.getClass(), new C3613(this, annotation2, c9192, 9));
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonFormat")) {
                    if (z2) {
                        AbstractC3698.m6348(c9192, annotation2);
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonIgnore")) {
                    if (z2) {
                        AbstractC3698.m6349(c9192, annotation2);
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonValue")) {
                    if (z2) {
                        c9192.f23390 |= 281474976710656L;
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonAnyGetter")) {
                    if (z2) {
                        c9192.f23390 |= 562949953421312L;
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonProperty")) {
                    if (z2) {
                        AbstractC3698.m6371(annotation2.getClass(), new C3613(annotation2, c9192, 11));
                    }
                } else if (name.equals("com.alibaba.fastjson.annotation.JSONField")) {
                    AbstractC3698.m6371(annotation2.getClass(), new C3613(this, annotation2, c9192, 10));
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonBackReference")) {
                    if (z2) {
                        c9192.f23390 |= 2305843009213693952L;
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonRawValue") && z2) {
                    c9192.f23390 = 1125899906842624L | c9192.f23390;
                }
            }
        }
        if (interfaceC9196 == null) {
            return;
        }
        m14088(c9192, interfaceC9196);
        Class clsWriteUsing = interfaceC9196.writeUsing();
        if (InterfaceC9352.class.isAssignableFrom(clsWriteUsing)) {
            c9192.f23405 = clsWriteUsing;
        }
        Class clsSerializeUsing = interfaceC9196.serializeUsing();
        if (InterfaceC9352.class.isAssignableFrom(clsSerializeUsing)) {
            c9192.f23405 = clsSerializeUsing;
        }
        if (interfaceC9196.jsonDirect()) {
            c9192.f23390 |= 1125899906842624L;
        }
        if ((c9192.f23390 & JSONWriter$Feature.WriteNonStringValueAsString.mask) == 0 || String.class.equals(field.getType()) || c9192.f23405 != null) {
            return;
        }
        c9192.f23405 = C9277.class;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public void m14096(C9192 c9192, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            InterfaceC9196 interfaceC9196 = (InterfaceC9196) AbstractC3698.m6379(annotation, InterfaceC9196.class);
            if (interfaceC9196 != null) {
                m14088(c9192, interfaceC9196);
            } else {
                if (clsAnnotationType == InterfaceC9198.class && ((InterfaceC9198) annotation).value() == JSONCompiler$CompilerOption.LAMBDA) {
                    c9192.f23390 |= 18014398509481984L;
                }
                boolean z = AbstractC3766.f9633;
                String name = clsAnnotationType.getName();
                if (name.equals("com.fasterxml.jackson.annotation.JsonInclude")) {
                    if (z) {
                        AbstractC3698.m6371(annotation.getClass(), new C3613(annotation, c9192, 5));
                    }
                } else if (name.equals("com.fasterxml.jackson.databind.annotation.JsonSerialize")) {
                    if (z) {
                        AbstractC3698.m6371(annotation.getClass(), new C3613(this, annotation, c9192, 9));
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonFormat")) {
                    if (z) {
                        AbstractC3698.m6348(c9192, annotation);
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonIgnore")) {
                    if (z) {
                        AbstractC3698.m6349(c9192, annotation);
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonValue")) {
                    if (z) {
                        c9192.f23390 |= 281474976710656L;
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonAnyGetter")) {
                    if (z) {
                        c9192.f23390 |= 562949953421312L;
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonProperty")) {
                    if (z) {
                        AbstractC3698.m6371(annotation.getClass(), new C3613(annotation, c9192, 11));
                    }
                } else if (name.equals("java.beans.Transient")) {
                    if (c9192.f23399) {
                        c9192.f23389 = true;
                    }
                    c9192.f23400 = true;
                } else if (name.equals("com.alibaba.fastjson.annotation.JSONField")) {
                    AbstractC3698.m6371(annotation.getClass(), new C3613(this, annotation, c9192, 10));
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonRawValue")) {
                    if (z) {
                        c9192.f23390 |= 1125899906842624L;
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonUnwrapped") && z) {
                    AbstractC3698.m6371(annotation.getClass(), new C3613(annotation, c9192, 8));
                }
            }
        }
    }

    @Override // com.kongzue.dialogx.util.views.InterfaceC4589
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public boolean mo8642() {
        switch (this.f22565) {
            case 4:
                C9069 c9069 = ((C9068) this.f22564).f23090;
                if (c9069.f11930) {
                    c9069.m14323();
                }
                break;
            case 5:
                C9062 c9062 = (C9062) ((C1171) this.f22564).f1438;
                BaseDialog$BOOLEAN baseDialog$BOOLEAN = c9062.f23069;
                if (baseDialog$BOOLEAN != null ? baseDialog$BOOLEAN == BaseDialog$BOOLEAN.TRUE : c9062.f11930) {
                    c9062.m14314();
                }
                break;
            case 6:
                C9037 c9037 = ((C9038) this.f22564).f22985;
                c9037.getClass();
                if (c9037.mo14284()) {
                    c9037.m14289();
                }
                break;
            default:
                if (((C9029) this.f22564).f22937.f22920 == null) {
                    AbstractC5754 abstractC5754 = AbstractC9077.f23168;
                }
                break;
        }
        return true;
    }

    @Override // p265.InterfaceC8989
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public void mo9614(Throwable th, InterfaceC7372 interfaceC7372) {
        m14097(Level.ERROR, new C7897(interfaceC7372, 2, th));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public void m14097(Level level, InterfaceC7387 interfaceC7387) {
        boolean zIsTraceEnabled;
        level.getClass();
        InterfaceC9970 interfaceC9970 = (InterfaceC9970) this.f22564;
        switch (AbstractC8960.f22786[level.ordinal()]) {
            case 1:
                zIsTraceEnabled = interfaceC9970.isTraceEnabled(null);
                break;
            case 2:
                zIsTraceEnabled = interfaceC9970.isDebugEnabled(null);
                break;
            case 3:
                zIsTraceEnabled = interfaceC9970.isInfoEnabled(null);
                break;
            case 4:
                zIsTraceEnabled = interfaceC9970.isWarnEnabled(null);
                break;
            case 5:
                zIsTraceEnabled = interfaceC9970.isErrorEnabled(null);
                break;
            case 6:
                zIsTraceEnabled = false;
                break;
            default:
                C5043.m9170();
        }
        if (zIsTraceEnabled) {
            C8988 c8988 = new C8988();
            interfaceC7387.invoke(c8988);
            String str = c8988.f22844;
            Throwable th = c8988.f22843;
            switch (AbstractC8961.f22787[level.ordinal()]) {
                case 1:
                    interfaceC9970.trace(null, str, th);
                    break;
                case 2:
                    interfaceC9970.debug(null, str, th);
                    break;
                case 3:
                    interfaceC9970.info(null, str, th);
                    break;
                case 4:
                    interfaceC9970.warn(null, str, th);
                    break;
                case 5:
                    interfaceC9970.error(null, str, th);
                    break;
                case 6:
                    break;
                default:
                    C5043.m9170();
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public void m14098(Class cls, C9194 c9194) {
        Class cls2;
        String str;
        if (cls != null) {
            Class superclass = cls.getSuperclass();
            if (superclass != Object.class && superclass != null && superclass != Enum.class) {
                m14098(superclass, c9194);
            }
            for (Class<?> cls3 : cls.getInterfaces()) {
                if (cls3 != Serializable.class) {
                    m14098(cls3, c9194);
                }
            }
            if (c9194.f23432 != null && c9194.f23451 != null) {
                int i = 0;
                while (true) {
                    Class[] clsArr = c9194.f23432;
                    if (i >= clsArr.length) {
                        break;
                    }
                    if (clsArr[i] == cls) {
                        String[] strArr = c9194.f23451;
                        if (i < strArr.length && (str = strArr[i]) != null && str.length() != 0) {
                            c9194.f23436 = str;
                            break;
                        }
                    }
                    i++;
                }
            }
        }
        Annotation[] annotationArrM6380 = AbstractC3698.m6380(cls);
        InterfaceC9195 interfaceC9195 = null;
        int i2 = 0;
        Annotation annotation = null;
        while (true) {
            int i3 = 1;
            if (i2 >= annotationArrM6380.length) {
                break;
            }
            Annotation annotation2 = annotationArrM6380[i2];
            Class<? extends Annotation> clsAnnotationType = annotation2.annotationType();
            if (interfaceC9195 == null) {
                interfaceC9195 = (InterfaceC9195) AbstractC3698.m6379(annotation2, InterfaceC9195.class);
            }
            if (interfaceC9195 != annotation2) {
                if (clsAnnotationType == InterfaceC9198.class && ((InterfaceC9198) annotation2).value() == JSONCompiler$CompilerOption.LAMBDA) {
                    c9194.f23444 |= 18014398509481984L;
                }
                boolean z = AbstractC3766.f9633;
                String name = clsAnnotationType.getName();
                if (name.equals("com.fasterxml.jackson.annotation.JsonInclude")) {
                    if (z) {
                        AbstractC3698.m6371(annotation2.getClass(), new C3604(annotation2, c9194, 6));
                    }
                } else if (name.equals("com.fasterxml.jackson.databind.annotation.JsonSerialize")) {
                    if (z) {
                        AbstractC3698.m6371(annotation2.getClass(), new C3604(this, annotation2, c9194));
                        if (c9194.f23442 != null && Enum.class.isAssignableFrom(cls)) {
                            c9194.f23448 = true;
                        }
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonFormat")) {
                    if (z) {
                        AbstractC3698.m6371(annotation2.getClass(), new C3604(annotation2, c9194, 8));
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonSubTypes")) {
                    if (z) {
                        AbstractC3698.m6371(annotation2.getClass(), new C3604(annotation2, c9194, 13));
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonPropertyOrder")) {
                    if (z) {
                        Class<?> cls4 = annotation2.getClass();
                        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                        AbstractC3698.m6371(cls4, new C3603(annotation2, c9194, atomicBoolean, i3));
                        String[] strArr2 = c9194.f23447;
                        if (strArr2 == null || strArr2.length == 0) {
                            c9194.f23429 = atomicBoolean.get();
                        }
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonTypeInfo")) {
                    if (z) {
                        AbstractC3698.m6371(annotation2.getClass(), new C3604(annotation2, c9194, 14));
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonTypeName")) {
                    if (z) {
                        AbstractC3698.m6371(annotation2.getClass(), new C3604(annotation2, c9194, 7));
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonIgnoreProperties")) {
                    if (z) {
                        AbstractC3698.m6371(annotation2.getClass(), new C3604(annotation2, c9194, 12));
                    }
                } else if (name.equals("kotlin.Metadata")) {
                    c9194.f23438 = true;
                    AbstractC3693.m6336(cls, c9194);
                } else if (name.equals("com.alibaba.fastjson.annotation.JSONType")) {
                    annotation = annotation2;
                }
            }
            i2++;
        }
        if (interfaceC9195 == null && (cls2 = (Class) ((C9350) this.f22564).f24052.f24128.get(cls)) != null) {
            Annotation[] annotationArrM63802 = AbstractC3698.m6380(cls2);
            int i4 = 0;
            while (i4 < annotationArrM63802.length) {
                Annotation annotation3 = annotationArrM63802[i4];
                Class<? extends Annotation> clsAnnotationType2 = annotation3.annotationType();
                InterfaceC9195 interfaceC91952 = (InterfaceC9195) AbstractC3698.m6379(annotation3, InterfaceC9195.class);
                if (interfaceC91952 != annotation3 && "com.alibaba.fastjson.annotation.JSONType".equals(clsAnnotationType2.getName())) {
                    annotation = annotation3;
                }
                i4++;
                interfaceC9195 = interfaceC91952;
            }
        }
        if (interfaceC9195 != null) {
            Class[] clsArrSeeAlso = interfaceC9195.seeAlso();
            if (clsArrSeeAlso.length != 0) {
                c9194.f23432 = clsArrSeeAlso;
            }
            String strTypeKey = interfaceC9195.typeKey();
            if (!strTypeKey.isEmpty()) {
                c9194.f23437 = strTypeKey;
            }
            String strTypeName = interfaceC9195.typeName();
            if (!strTypeName.isEmpty()) {
                c9194.f23436 = strTypeName;
            }
            for (JSONWriter$Feature jSONWriter$Feature : interfaceC9195.serializeFeatures()) {
                c9194.f23444 |= jSONWriter$Feature.mask;
            }
            c9194.f23449 = interfaceC9195.naming().name();
            String[] strArrIgnores = interfaceC9195.ignores();
            if (strArrIgnores.length > 0) {
                c9194.f23446 = strArrIgnores;
            }
            String[] strArrIncludes = interfaceC9195.includes();
            if (strArrIncludes.length > 0) {
                c9194.f23439 = strArrIncludes;
            }
            String[] strArrOrders = interfaceC9195.orders();
            if (strArrOrders.length > 0) {
                c9194.f23447 = strArrOrders;
            }
            Class clsSerializer = interfaceC9195.serializer();
            if (InterfaceC9352.class.isAssignableFrom(clsSerializer)) {
                c9194.f23442 = clsSerializer;
                c9194.f23448 = true;
            }
            Class[] clsArrSerializeFilters = interfaceC9195.serializeFilters();
            if (clsArrSerializeFilters.length != 0) {
                c9194.f23440 = clsArrSerializeFilters;
            }
            String str2 = interfaceC9195.format();
            if (!str2.isEmpty()) {
                c9194.f23431 = str2;
            }
            String strLocale = interfaceC9195.locale();
            if (!strLocale.isEmpty()) {
                String[] strArrSplit = strLocale.split(JavaConstant.Dynamic.DEFAULT_NAME);
                if (strArrSplit.length == 2) {
                    c9194.f23430 = new Locale(strArrSplit[0], strArrSplit[1]);
                }
            }
            if (!interfaceC9195.alphabetic()) {
                c9194.f23429 = false;
            }
            if (interfaceC9195.writeEnumAsJavaBean()) {
                c9194.f23448 = true;
            }
            String strRootName = interfaceC9195.rootName();
            if (!strRootName.isEmpty()) {
                c9194.f23427 = strRootName;
            }
            if (c9194.f23426) {
                c9194.f23426 = interfaceC9195.skipTransient();
            }
        } else if (annotation != null) {
            AbstractC3698.m6371(annotation.annotationType(), new C3604(c9194, annotation, 10));
        }
        Class[] clsArr2 = c9194.f23432;
        if (clsArr2 == null || clsArr2.length == 0) {
            return;
        }
        String str3 = c9194.f23436;
        if (str3 == null || str3.length() == 0) {
            for (Class cls5 : c9194.f23432) {
                if (cls5 == cls) {
                    c9194.f23436 = cls.getSimpleName();
                    return;
                }
            }
        }
    }

    @Override // p265.InterfaceC8989
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public void mo9617(InterfaceC7372 interfaceC7372) {
        m14097(Level.ERROR, new C5080(interfaceC7372, 3));
    }

    public /* synthetic */ C8878(Object obj, int i) {
        this.f22565 = i;
        this.f22564 = obj;
    }

    public /* synthetic */ C8878(int i, boolean z) {
        this.f22565 = i;
    }

    public C8878(Context context) {
        this.f22565 = 0;
        this.f22564 = new C8541(context, 9);
    }
}
