package p230;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.animation.core.C0325;
import androidx.core.view.AbstractC2270;
import androidx.recyclerview.widget.C2492;
import com.alibaba.fastjson2.AbstractC2933;
import com.alibaba.fastjson2.InterfaceC2916;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.annotation.JSONCompiler$CompilerOption;
import com.alibaba.fastjson2.reader.C2770;
import com.alibaba.fastjson2.reader.C2771;
import com.alibaba.fastjson2.reader.C2780;
import com.alibaba.fastjson2.util.AbstractC2854;
import com.alibaba.fastjson2.util.AbstractC2860;
import com.alibaba.fastjson2.util.AbstractC2865;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.gson.C3252;
import com.google.gson.C3253;
import com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN;
import com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN;
import com.kongzue.dialogx.interfaces.InterfaceC3745;
import com.kongzue.dialogx.util.views.InterfaceC3757;
import io.github.oshai.kotlinlogging.Level;
import io.ktor.util.C4211;
import io.ktor.util.internal.C4190;
import io.ktor.util.internal.C4191;
import io.ktor.utils.io.C4248;
import io.modelcontextprotocol.kotlin.sdk.server.C4293;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.AbstractC5187;
import kotlin.jvm.internal.AbstractC4388;
import kotlin.reflect.jvm.internal.impl.descriptors.C4485;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import net.bytebuddy.utility.JavaConstant;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import p087.C7068;
import p089.C7180;
import p155.InterfaceC7615;
import p167.C7712;
import p238.AbstractC8131;
import p238.AbstractC8132;
import p240.C8134;
import p240.C8135;
import p242.C8143;
import p249.C8159;
import p249.InterfaceC8160;
import p251.C8183;
import p251.SharedPreferencesC8176;
import p257.C8200;
import p257.C8208;
import p257.C8209;
import p257.C8212;
import p257.C8233;
import p257.C8239;
import p257.C8240;
import p261.AbstractC8248;
import p278.C8363;
import p278.C8365;
import p279.InterfaceC8366;
import p279.InterfaceC8367;
import p279.InterfaceC8369;
import p287.AbstractC8405;
import p291.C8448;
import p291.C8521;
import p291.C8539;
import p291.InterfaceC8523;
import p345.C8834;
import p348.InterfaceC8843;
import p353.InterfaceC8873;
import p396.C9113;
import p398.InterfaceC9141;
import top.yukonga.miuix.kmp.utils.C6057;

/* JADX INFO: renamed from: 飘花落叶言楪世子苏兰哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8049 implements InterfaceC8160, InterfaceC3757, InterfaceC3745, InterfaceC7615, InterfaceC8873 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static String f22218 = "";

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f22219;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22220;

    public C8049(int i) {
        this.f22220 = i;
        switch (i) {
            case 15:
                String strM13973 = AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵呜");
                AbstractC8405.m13973("喵喵喵呜呜喵呜喵~喵喵喵呜喵喵喵呜");
                C8183 c8183 = new C8183(f22218, strM13973);
                c8183.f22550 = new C4485();
                this.f22219 = c8183.m13673();
                break;
            case 16:
                C8834 c8834 = C8834.f24936;
                C3252 c3252 = new C3252();
                c3252.m7334();
                C3253 c3253M7335 = c3252.m7335();
                C0325 c0325 = new C0325(19);
                c0325.m971(AbstractC8405.m13972(2860));
                C8834.f24936.getClass();
                c0325.f1095 = C8834.m14491(false);
                ((ArrayList) c0325.f1094).add(new C9113(c3253M7335));
                Object objM548 = c0325.m970().m548(InterfaceC8843.class);
                AbstractC8405.m13972(2861);
                objM548.getClass();
                this.f22219 = (InterfaceC8843) objM548;
                break;
            default:
                this.f22219 = new C8143();
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static Class m13528(Class cls) {
        String name = cls.getName();
        if (!"com.fasterxml.jackson.databind.JsonSerializer$None".equals(name) && InterfaceC8523.class.isAssignableFrom(cls)) {
            return cls;
        }
        if ("com.fasterxml.jackson.databind.ser.std.ToStringSerializer".equals(name)) {
            return C8448.class;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static void m13529(C8363 c8363, InterfaceC8367 interfaceC8367) {
        String strName = interfaceC8367.name();
        if (!strName.isEmpty()) {
            c8363.f23049 = strName;
        }
        String strDefaultValue = interfaceC8367.defaultValue();
        if (!strDefaultValue.isEmpty()) {
            c8363.f23059 = strDefaultValue;
        }
        m13530(c8363, interfaceC8367.format());
        String strLabel = interfaceC8367.label();
        if (!strLabel.isEmpty()) {
            c8363.f23047 = strLabel;
        }
        String strLocale = interfaceC8367.locale();
        if (!strLocale.isEmpty()) {
            String[] strArrSplit = strLocale.split(JavaConstant.Dynamic.DEFAULT_NAME);
            if (strArrSplit.length == 2) {
                c8363.f23056 = new Locale(strArrSplit[0], strArrSplit[1]);
            }
        }
        boolean zSerialize = interfaceC8367.serialize();
        boolean z = !zSerialize;
        if (!c8363.f23044) {
            c8363.f23044 = z;
        }
        if (!interfaceC8367.skipTransient()) {
            c8363.f23054 = false;
            if (c8363.f23055 && !c8363.f23058) {
                c8363.f23044 = false;
            }
        }
        if (interfaceC8367.unwrapped()) {
            c8363.f23045 |= 562949953421312L;
        }
        for (JSONWriter$Feature jSONWriter$Feature : interfaceC8367.serializeFeatures()) {
            c8363.f23045 |= jSONWriter$Feature.mask;
            if (c8363.f23044 && !c8363.f23055 && zSerialize && jSONWriter$Feature == JSONWriter$Feature.FieldBased) {
                c8363.f23044 = false;
            }
        }
        int iOrdinal = interfaceC8367.ordinal();
        if (iOrdinal != 0) {
            c8363.f23046 = iOrdinal;
        }
        if (interfaceC8367.value()) {
            c8363.f23045 |= 281474976710656L;
        }
        if (interfaceC8367.jsonDirect()) {
            c8363.f23045 |= 1125899906842624L;
        }
        Class clsSerializeUsing = interfaceC8367.serializeUsing();
        if (InterfaceC8523.class.isAssignableFrom(clsSerializeUsing)) {
            c8363.f23060 = clsSerializeUsing;
        }
        Class clsContentAs = interfaceC8367.contentAs();
        if (clsContentAs != Void.class) {
            c8363.f23053 = clsContentAs;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static void m13530(C8363 c8363, String str) {
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
        c8363.f23048 = strTrim;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static void m13531(C8363 c8363, Enum[] enumArr) {
        for (Enum r0 : enumArr) {
            String strName = r0.name();
            strName.getClass();
            switch (strName) {
                case "DisableCircularReferenceDetect":
                    c8363.f23045 |= 144115188075855872L;
                    break;
                case "WriteNullNumberAsZero":
                    c8363.f23045 |= JSONWriter$Feature.WriteNullNumberAsZero.mask;
                    break;
                case "IgnoreErrorGetter":
                    c8363.f23045 |= JSONWriter$Feature.IgnoreErrorGetter.mask;
                    break;
                case "UseISO8601DateFormat":
                    c8363.f23048 = "iso8601";
                    break;
                case "WriteBigDecimalAsPlain":
                    c8363.f23045 |= JSONWriter$Feature.WriteBigDecimalAsPlain.mask;
                    break;
                case "WriteEnumUsingToString":
                    c8363.f23045 |= JSONWriter$Feature.WriteEnumUsingToString.mask;
                    break;
                case "BrowserCompatible":
                    c8363.f23045 |= JSONWriter$Feature.BrowserCompatible.mask;
                    break;
                case "WriteNullStringAsEmpty":
                    c8363.f23045 |= JSONWriter$Feature.WriteNullStringAsEmpty.mask;
                    break;
                case "NotWriteRootClassName":
                    c8363.f23045 |= JSONWriter$Feature.NotWriteRootClassName.mask;
                    break;
                case "WriteNullListAsEmpty":
                    c8363.f23045 |= JSONWriter$Feature.WriteNullListAsEmpty.mask;
                    break;
                case "WriteNonStringValueAsString":
                    c8363.f23045 |= JSONWriter$Feature.WriteNonStringValueAsString.mask;
                    break;
                case "WriteNullBooleanAsFalse":
                    c8363.f23045 |= JSONWriter$Feature.WriteNullBooleanAsFalse.mask;
                    break;
                case "WriteClassName":
                    c8363.f23045 |= JSONWriter$Feature.WriteClassName.mask;
                    break;
                case "WriteMapNullValue":
                    c8363.f23045 |= JSONWriter$Feature.WriteNulls.mask;
                    break;
            }
        }
    }

    @Override // p249.InterfaceC8160
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public void mo9045(C4293 c4293) {
        m13538(Level.WARN, new C6057(c4293, 7));
    }

    @Override // p249.InterfaceC8160
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public void mo9046(InterfaceC6543 interfaceC6543) {
        m13538(Level.INFO, new C4248(interfaceC6543, 4));
    }

    @Override // p249.InterfaceC8160
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public void mo9047(InterfaceC6543 interfaceC6543) {
        m13538(Level.TRACE, new C4248(interfaceC6543, 2));
    }

    @Override // p249.InterfaceC8160
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo9048(InterfaceC6543 interfaceC6543) {
        m13538(Level.DEBUG, new C4248(interfaceC6543, 5));
    }

    @Override // p155.InterfaceC7615
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public boolean mo341(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f22219;
        if (!swipeDismissBehavior.mo7009(view)) {
            return false;
        }
        boolean z = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.f10011;
        int width = (!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth();
        WeakHashMap weakHashMap = AbstractC2270.f6594;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        return true;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3745
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo8063(Rect rect) {
        C2492 c2492 = (C2492) this.f22219;
        if (((C8212) c2492.f7463).f22654 == DialogXStyle$PopTipSettings$ALIGN.TOP_INSIDE) {
            ((LinearLayout) c2492.f7461).setPadding(0, rect.top, 0, 0);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public void m13532(C8135 c8135, Object obj) throws Throwable {
        C4191 c4191 = (C4191) ((C8143) this.f22219).m13597(c8135);
        Throwable th = null;
        if (c4191 != null) {
            Object objM8558 = c4191.m8558();
            objM8558.getClass();
            for (C4190 c4190M8557 = (C4190) objM8558; !c4190M8557.equals(c4191); c4190M8557 = c4190M8557.m8557()) {
                if (c4190M8557 instanceof C8134) {
                    try {
                        InterfaceC6558 interfaceC6558 = ((C8134) c4190M8557).f22444;
                        AbstractC4388.m8888(1, interfaceC6558);
                        interfaceC6558.invoke(obj);
                    } catch (Throwable th2) {
                        if (th != null) {
                            AbstractC5187.m10216(th, th2);
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
    public void m13533(Object obj, String str) {
        SharedPreferencesC8176 sharedPreferencesC8176 = (SharedPreferencesC8176) this.f22219;
        AbstractC8405.m13973("喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜呜");
        AbstractC8405.m13973("喵喵喵喵喵呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵喵喵喵喵喵喵");
        if (obj instanceof String) {
            sharedPreferencesC8176.putString(str, (String) obj);
            return;
        }
        if (obj instanceof Integer) {
            sharedPreferencesC8176.putInt(str, ((Number) obj).intValue());
            return;
        }
        if (obj instanceof Boolean) {
            sharedPreferencesC8176.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Float) {
            sharedPreferencesC8176.putFloat(str, ((Number) obj).floatValue());
            return;
        }
        if (obj instanceof Long) {
            sharedPreferencesC8176.putLong(str, ((Number) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            sharedPreferencesC8176.m13668(str, ((Number) obj).doubleValue());
        } else if (obj instanceof byte[]) {
            sharedPreferencesC8176.m13664(str, (byte[]) obj);
        } else {
            sharedPreferencesC8176.putString(str, InterfaceC2916.m6375(obj));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public void m13534(C8135 c8135, InterfaceC6558 interfaceC6558) {
        ((C4191) ((C8143) this.f22219).m13598(c8135, new C7180(11))).m8562(new C8134(interfaceC6558));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public void m13535(C8365 c8365, C8363 c8363, Class cls, Method method) {
        Field fieldM5814;
        Method declaredMethod;
        C8539 c8539 = ((C8521) this.f22219).f23707;
        Class cls2 = (Class) c8539.f23783.get(cls);
        String name = method.getName();
        if ("getTargetSql".equals(name) && cls != null && cls.getName().startsWith("com.baomidou.mybatisplus.")) {
            c8363.f23045 |= JSONWriter$Feature.IgnoreErrorGetter.mask;
        }
        if (cls2 != null && cls2 != cls) {
            try {
                declaredMethod = cls2.getDeclaredMethod(name, method.getParameterTypes());
            } catch (Exception unused) {
                declaredMethod = null;
            }
            if (declaredMethod != null) {
                m13535(c8365, c8363, cls2, declaredMethod);
            }
        }
        if (((Class) c8539.f23783.get(method.getReturnType())) != null) {
            c8363.f23063 = true;
        }
        Class cls3 = AbstractC2854.f8930;
        int i = 0;
        if (cls3 != null && method.getAnnotation(cls3) != null) {
            c8363.f23044 = true;
            c8363.f23055 = true;
            if (!c8365.f23081) {
                c8363.f23054 = false;
                c8363.f23044 = false;
            }
        }
        if (cls != null) {
            Class superclass = cls.getSuperclass();
            Method methodM5797 = AbstractC2865.m5797(method, superclass);
            boolean z = c8363.f23044;
            if (methodM5797 != null) {
                m13535(c8365, c8363, superclass, methodM5797);
                Field fieldM58142 = AbstractC2865.m5814(method, cls);
                int modifiers = methodM5797.getModifiers();
                if (fieldM58142 != null && z != c8363.f23044 && !Modifier.isAbstract(modifiers) && !methodM5797.equals(method)) {
                    c8363.f23044 = z;
                }
            }
            for (Class<?> cls4 : cls.getInterfaces()) {
                Method methodM57972 = AbstractC2865.m5797(method, cls4);
                if (superclass != null && methodM57972 != null) {
                    m13535(c8365, c8363, superclass, methodM57972);
                }
            }
        }
        c8363.f23058 = false;
        m13537(c8363, AbstractC2865.m5820(method));
        if (!cls.getName().startsWith("java.lang") && !AbstractC2865.m5790(cls) && (fieldM5814 = AbstractC2865.m5814(method, cls)) != null) {
            c8363.f23045 |= 4503599627370496L;
            m13536(c8365, c8363, cls, fieldM5814);
        }
        boolean z2 = c8365.f23093;
        if (!z2 || c8365.f23109 == null || c8365.f23108 == null) {
            return;
        }
        String strM5804 = AbstractC2865.m5804(method, z2, null);
        while (true) {
            String[] strArr = c8365.f23108;
            if (i >= strArr.length) {
                return;
            }
            if (strM5804.equals(strArr[i])) {
                Annotation[][] parameterAnnotations = c8365.f23109.getParameterAnnotations();
                if (i < parameterAnnotations.length) {
                    m13537(c8363, parameterAnnotations[i]);
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
        To view partially-correct add '--show-bad-code' argument
    */
    public void m13536(p278.C8365 r18, p278.C8363 r19, java.lang.Class r20, java.lang.reflect.Field r21) {
        /*
            Method dump skipped, instruction units count: 809
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p230.C8049.m13536(飘花落叶言楪子世兰哲苏.飘花落叶言子楪世苏哲兰, 飘花落叶言楪子世兰哲苏.飘花落叶言子楪世哲苏兰, java.lang.Class, java.lang.reflect.Field):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public void m13537(C8363 c8363, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            InterfaceC8367 interfaceC8367 = (InterfaceC8367) AbstractC2865.m5819(annotation, InterfaceC8367.class);
            if (interfaceC8367 != null) {
                m13529(c8363, interfaceC8367);
            } else {
                if (clsAnnotationType == InterfaceC8369.class && ((InterfaceC8369) annotation).value() == JSONCompiler$CompilerOption.LAMBDA) {
                    c8363.f23045 |= 18014398509481984L;
                }
                boolean z = AbstractC2933.f9288;
                String name = clsAnnotationType.getName();
                if (name.equals("com.fasterxml.jackson.annotation.JsonInclude")) {
                    if (z) {
                        AbstractC2865.m5811(annotation.getClass(), new C2780(annotation, c8363, 5));
                    }
                } else if (name.equals("com.fasterxml.jackson.databind.annotation.JsonSerialize")) {
                    if (z) {
                        AbstractC2865.m5811(annotation.getClass(), new C2780(this, annotation, c8363, 9));
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonFormat")) {
                    if (z) {
                        AbstractC2865.m5788(c8363, annotation);
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonIgnore")) {
                    if (z) {
                        AbstractC2865.m5789(c8363, annotation);
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonValue")) {
                    if (z) {
                        c8363.f23045 |= 281474976710656L;
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonAnyGetter")) {
                    if (z) {
                        c8363.f23045 |= 562949953421312L;
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonProperty")) {
                    if (z) {
                        AbstractC2865.m5811(annotation.getClass(), new C2780(annotation, c8363, 11));
                    }
                } else if (name.equals("java.beans.Transient")) {
                    if (c8363.f23054) {
                        c8363.f23044 = true;
                    }
                    c8363.f23055 = true;
                } else if (name.equals("com.alibaba.fastjson.annotation.JSONField")) {
                    AbstractC2865.m5811(annotation.getClass(), new C2780(this, annotation, c8363, 10));
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonRawValue")) {
                    if (z) {
                        c8363.f23045 |= 1125899906842624L;
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonUnwrapped") && z) {
                    AbstractC2865.m5811(annotation.getClass(), new C2780(annotation, c8363, 8));
                }
            }
        }
    }

    @Override // com.kongzue.dialogx.util.views.InterfaceC3757
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public boolean mo8083() {
        switch (this.f22220) {
            case 4:
                C8240 c8240 = ((C8239) this.f22219).f22745;
                if (c8240.f11585) {
                    c8240.m13764();
                }
                break;
            case 5:
                C8233 c8233 = (C8233) ((C0325) this.f22219).f1093;
                BaseDialog$BOOLEAN baseDialog$BOOLEAN = c8233.f22724;
                if (baseDialog$BOOLEAN != null ? baseDialog$BOOLEAN == BaseDialog$BOOLEAN.TRUE : c8233.f11585) {
                    c8233.m13755();
                }
                break;
            case 6:
                C8208 c8208 = ((C8209) this.f22219).f22640;
                c8208.getClass();
                if (c8208.mo13725()) {
                    c8208.m13730();
                }
                break;
            default:
                if (((C8200) this.f22219).f22592.f22575 == null) {
                    AbstractC4922 abstractC4922 = AbstractC8248.f22823;
                }
                break;
        }
        return true;
    }

    @Override // p249.InterfaceC8160
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public void mo9055(Throwable th, InterfaceC6543 interfaceC6543) {
        m13538(Level.ERROR, new C7068(interfaceC6543, 2, th));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public void m13538(Level level, InterfaceC6558 interfaceC6558) {
        boolean zIsTraceEnabled;
        level.getClass();
        InterfaceC9141 interfaceC9141 = (InterfaceC9141) this.f22219;
        switch (AbstractC8131.f22441[level.ordinal()]) {
            case 1:
                zIsTraceEnabled = interfaceC9141.isTraceEnabled(null);
                break;
            case 2:
                zIsTraceEnabled = interfaceC9141.isDebugEnabled(null);
                break;
            case 3:
                zIsTraceEnabled = interfaceC9141.isInfoEnabled(null);
                break;
            case 4:
                zIsTraceEnabled = interfaceC9141.isWarnEnabled(null);
                break;
            case 5:
                zIsTraceEnabled = interfaceC9141.isErrorEnabled(null);
                break;
            case 6:
                zIsTraceEnabled = false;
                break;
            default:
                C4211.m8611();
        }
        if (zIsTraceEnabled) {
            C8159 c8159 = new C8159();
            interfaceC6558.invoke(c8159);
            String str = c8159.f22499;
            Throwable th = c8159.f22498;
            switch (AbstractC8132.f22442[level.ordinal()]) {
                case 1:
                    interfaceC9141.trace(null, str, th);
                    break;
                case 2:
                    interfaceC9141.debug(null, str, th);
                    break;
                case 3:
                    interfaceC9141.info(null, str, th);
                    break;
                case 4:
                    interfaceC9141.warn(null, str, th);
                    break;
                case 5:
                    interfaceC9141.error(null, str, th);
                    break;
                case 6:
                    break;
                default:
                    C4211.m8611();
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public void m13539(Class cls, C8365 c8365) {
        Class cls2;
        String str;
        if (cls != null) {
            Class superclass = cls.getSuperclass();
            if (superclass != Object.class && superclass != null && superclass != Enum.class) {
                m13539(superclass, c8365);
            }
            for (Class<?> cls3 : cls.getInterfaces()) {
                if (cls3 != Serializable.class) {
                    m13539(cls3, c8365);
                }
            }
            if (c8365.f23087 != null && c8365.f23106 != null) {
                int i = 0;
                while (true) {
                    Class[] clsArr = c8365.f23087;
                    if (i >= clsArr.length) {
                        break;
                    }
                    if (clsArr[i] == cls) {
                        String[] strArr = c8365.f23106;
                        if (i < strArr.length && (str = strArr[i]) != null && str.length() != 0) {
                            c8365.f23091 = str;
                            break;
                        }
                    }
                    i++;
                }
            }
        }
        Annotation[] annotationArrM5820 = AbstractC2865.m5820(cls);
        InterfaceC8366 interfaceC8366 = null;
        int i2 = 0;
        Annotation annotation = null;
        while (true) {
            int i3 = 1;
            if (i2 >= annotationArrM5820.length) {
                break;
            }
            Annotation annotation2 = annotationArrM5820[i2];
            Class<? extends Annotation> clsAnnotationType = annotation2.annotationType();
            if (interfaceC8366 == null) {
                interfaceC8366 = (InterfaceC8366) AbstractC2865.m5819(annotation2, InterfaceC8366.class);
            }
            if (interfaceC8366 != annotation2) {
                if (clsAnnotationType == InterfaceC8369.class && ((InterfaceC8369) annotation2).value() == JSONCompiler$CompilerOption.LAMBDA) {
                    c8365.f23099 |= 18014398509481984L;
                }
                boolean z = AbstractC2933.f9288;
                String name = clsAnnotationType.getName();
                if (name.equals("com.fasterxml.jackson.annotation.JsonInclude")) {
                    if (z) {
                        AbstractC2865.m5811(annotation2.getClass(), new C2771(annotation2, c8365, 6));
                    }
                } else if (name.equals("com.fasterxml.jackson.databind.annotation.JsonSerialize")) {
                    if (z) {
                        AbstractC2865.m5811(annotation2.getClass(), new C2771(this, annotation2, c8365));
                        if (c8365.f23097 != null && Enum.class.isAssignableFrom(cls)) {
                            c8365.f23103 = true;
                        }
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonFormat")) {
                    if (z) {
                        AbstractC2865.m5811(annotation2.getClass(), new C2771(annotation2, c8365, 8));
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonSubTypes")) {
                    if (z) {
                        AbstractC2865.m5811(annotation2.getClass(), new C2771(annotation2, c8365, 13));
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonPropertyOrder")) {
                    if (z) {
                        Class<?> cls4 = annotation2.getClass();
                        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                        AbstractC2865.m5811(cls4, new C2770(annotation2, c8365, atomicBoolean, i3));
                        String[] strArr2 = c8365.f23102;
                        if (strArr2 == null || strArr2.length == 0) {
                            c8365.f23084 = atomicBoolean.get();
                        }
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonTypeInfo")) {
                    if (z) {
                        AbstractC2865.m5811(annotation2.getClass(), new C2771(annotation2, c8365, 14));
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonTypeName")) {
                    if (z) {
                        AbstractC2865.m5811(annotation2.getClass(), new C2771(annotation2, c8365, 7));
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonIgnoreProperties")) {
                    if (z) {
                        AbstractC2865.m5811(annotation2.getClass(), new C2771(annotation2, c8365, 12));
                    }
                } else if (name.equals("kotlin.Metadata")) {
                    c8365.f23093 = true;
                    AbstractC2860.m5776(cls, c8365);
                } else if (name.equals("com.alibaba.fastjson.annotation.JSONType")) {
                    annotation = annotation2;
                }
            }
            i2++;
        }
        if (interfaceC8366 == null && (cls2 = (Class) ((C8521) this.f22219).f23707.f23783.get(cls)) != null) {
            Annotation[] annotationArrM58202 = AbstractC2865.m5820(cls2);
            int i4 = 0;
            while (i4 < annotationArrM58202.length) {
                Annotation annotation3 = annotationArrM58202[i4];
                Class<? extends Annotation> clsAnnotationType2 = annotation3.annotationType();
                InterfaceC8366 interfaceC83662 = (InterfaceC8366) AbstractC2865.m5819(annotation3, InterfaceC8366.class);
                if (interfaceC83662 != annotation3 && "com.alibaba.fastjson.annotation.JSONType".equals(clsAnnotationType2.getName())) {
                    annotation = annotation3;
                }
                i4++;
                interfaceC8366 = interfaceC83662;
            }
        }
        if (interfaceC8366 != null) {
            Class[] clsArrSeeAlso = interfaceC8366.seeAlso();
            if (clsArrSeeAlso.length != 0) {
                c8365.f23087 = clsArrSeeAlso;
            }
            String strTypeKey = interfaceC8366.typeKey();
            if (!strTypeKey.isEmpty()) {
                c8365.f23092 = strTypeKey;
            }
            String strTypeName = interfaceC8366.typeName();
            if (!strTypeName.isEmpty()) {
                c8365.f23091 = strTypeName;
            }
            for (JSONWriter$Feature jSONWriter$Feature : interfaceC8366.serializeFeatures()) {
                c8365.f23099 |= jSONWriter$Feature.mask;
            }
            c8365.f23104 = interfaceC8366.naming().name();
            String[] strArrIgnores = interfaceC8366.ignores();
            if (strArrIgnores.length > 0) {
                c8365.f23101 = strArrIgnores;
            }
            String[] strArrIncludes = interfaceC8366.includes();
            if (strArrIncludes.length > 0) {
                c8365.f23094 = strArrIncludes;
            }
            String[] strArrOrders = interfaceC8366.orders();
            if (strArrOrders.length > 0) {
                c8365.f23102 = strArrOrders;
            }
            Class clsSerializer = interfaceC8366.serializer();
            if (InterfaceC8523.class.isAssignableFrom(clsSerializer)) {
                c8365.f23097 = clsSerializer;
                c8365.f23103 = true;
            }
            Class[] clsArrSerializeFilters = interfaceC8366.serializeFilters();
            if (clsArrSerializeFilters.length != 0) {
                c8365.f23095 = clsArrSerializeFilters;
            }
            String str2 = interfaceC8366.format();
            if (!str2.isEmpty()) {
                c8365.f23086 = str2;
            }
            String strLocale = interfaceC8366.locale();
            if (!strLocale.isEmpty()) {
                String[] strArrSplit = strLocale.split(JavaConstant.Dynamic.DEFAULT_NAME);
                if (strArrSplit.length == 2) {
                    c8365.f23085 = new Locale(strArrSplit[0], strArrSplit[1]);
                }
            }
            if (!interfaceC8366.alphabetic()) {
                c8365.f23084 = false;
            }
            if (interfaceC8366.writeEnumAsJavaBean()) {
                c8365.f23103 = true;
            }
            String strRootName = interfaceC8366.rootName();
            if (!strRootName.isEmpty()) {
                c8365.f23082 = strRootName;
            }
            if (c8365.f23081) {
                c8365.f23081 = interfaceC8366.skipTransient();
            }
        } else if (annotation != null) {
            AbstractC2865.m5811(annotation.annotationType(), new C2771(c8365, annotation, 10));
        }
        Class[] clsArr2 = c8365.f23087;
        if (clsArr2 == null || clsArr2.length == 0) {
            return;
        }
        String str3 = c8365.f23091;
        if (str3 == null || str3.length() == 0) {
            for (Class cls5 : c8365.f23087) {
                if (cls5 == cls) {
                    c8365.f23091 = cls.getSimpleName();
                    return;
                }
            }
        }
    }

    @Override // p249.InterfaceC8160
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public void mo9058(InterfaceC6543 interfaceC6543) {
        m13538(Level.ERROR, new C4248(interfaceC6543, 3));
    }

    public /* synthetic */ C8049(Object obj, int i) {
        this.f22220 = i;
        this.f22219 = obj;
    }

    public /* synthetic */ C8049(int i, boolean z) {
        this.f22220 = i;
    }

    public C8049(Context context) {
        this.f22220 = 0;
        this.f22219 = new C7712(context, 9);
    }
}
