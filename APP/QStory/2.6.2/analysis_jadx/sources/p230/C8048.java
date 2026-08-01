package p230;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.animation.core.C0325;
import androidx.core.view.AbstractC2270;
import androidx.recyclerview.widget.C2492;
import com.alibaba.fastjson2.AbstractC2932;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.annotation.JSONCompiler$CompilerOption;
import com.alibaba.fastjson2.reader.C2769;
import com.alibaba.fastjson2.reader.C2770;
import com.alibaba.fastjson2.reader.C2779;
import com.alibaba.fastjson2.util.AbstractC2853;
import com.alibaba.fastjson2.util.AbstractC2859;
import com.alibaba.fastjson2.util.AbstractC2864;
import com.bumptech.glide.AbstractC3056;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.gson.C3251;
import com.google.gson.C3252;
import com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN;
import com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN;
import com.kongzue.dialogx.interfaces.InterfaceC3744;
import com.kongzue.dialogx.util.views.InterfaceC3756;
import io.github.oshai.kotlinlogging.Level;
import io.ktor.util.C4210;
import io.ktor.util.internal.C4189;
import io.ktor.util.internal.C4190;
import io.ktor.utils.io.C4247;
import io.modelcontextprotocol.kotlin.sdk.server.C4292;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.AbstractC5186;
import kotlin.jvm.internal.AbstractC4387;
import net.bytebuddy.utility.JavaConstant;
import p033.AbstractC6325;
import p052.InterfaceC6542;
import p052.InterfaceC6557;
import p087.C7067;
import p089.C7179;
import p155.InterfaceC7614;
import p167.C7711;
import p238.AbstractC8130;
import p238.AbstractC8131;
import p240.C8133;
import p240.C8134;
import p242.C8142;
import p249.C8158;
import p249.InterfaceC8159;
import p257.C8199;
import p257.C8207;
import p257.C8208;
import p257.C8211;
import p257.C8232;
import p257.C8238;
import p257.C8239;
import p261.AbstractC8247;
import p278.C8362;
import p278.C8364;
import p279.InterfaceC8365;
import p279.InterfaceC8366;
import p279.InterfaceC8368;
import p291.C8456;
import p291.C8529;
import p291.C8547;
import p291.InterfaceC8531;
import p348.InterfaceC8861;
import p349.C8865;
import p353.InterfaceC8884;
import p398.C9152;
import p400.InterfaceC9156;
import top.yukonga.miuix.kmp.utils.C6051;

/* JADX INFO: renamed from: 飘花落叶言楪世子苏兰哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8048 implements InterfaceC8159, InterfaceC3756, InterfaceC3744, InterfaceC7614, InterfaceC8884 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f22221;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22222;

    public C8048(int i) {
        this.f22222 = i;
        switch (i) {
            case 15:
                C8865 c8865 = C8865.f24976;
                C3251 c3251 = new C3251();
                c3251.m7347();
                C3252 c3252M7348 = c3251.m7348();
                C0325 c0325 = new C0325(19);
                c0325.m971(AbstractC3056.m6668(-3937274572769068455L));
                C8865.f24976.getClass();
                c0325.f1095 = C8865.m14511(false);
                ((ArrayList) c0325.f1094).add(new C9152(c3252M7348));
                Object objM547 = c0325.m970().m547(InterfaceC8861.class);
                AbstractC3056.m6668(-3937274383790507431L);
                objM547.getClass();
                this.f22221 = (InterfaceC8861) objM547;
                break;
            default:
                this.f22221 = new C8142();
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static Class m13500(Class cls) {
        String name = cls.getName();
        if (!"com.fasterxml.jackson.databind.JsonSerializer$None".equals(name) && InterfaceC8531.class.isAssignableFrom(cls)) {
            return cls;
        }
        if ("com.fasterxml.jackson.databind.ser.std.ToStringSerializer".equals(name)) {
            return C8456.class;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static void m13501(C8362 c8362, InterfaceC8366 interfaceC8366) {
        String strName = interfaceC8366.name();
        if (!strName.isEmpty()) {
            c8362.f23050 = strName;
        }
        String strDefaultValue = interfaceC8366.defaultValue();
        if (!strDefaultValue.isEmpty()) {
            c8362.f23060 = strDefaultValue;
        }
        m13502(c8362, interfaceC8366.format());
        String strLabel = interfaceC8366.label();
        if (!strLabel.isEmpty()) {
            c8362.f23048 = strLabel;
        }
        String strLocale = interfaceC8366.locale();
        if (!strLocale.isEmpty()) {
            String[] strArrSplit = strLocale.split(JavaConstant.Dynamic.DEFAULT_NAME);
            if (strArrSplit.length == 2) {
                c8362.f23057 = new Locale(strArrSplit[0], strArrSplit[1]);
            }
        }
        boolean zSerialize = interfaceC8366.serialize();
        boolean z = !zSerialize;
        if (!c8362.f23045) {
            c8362.f23045 = z;
        }
        if (!interfaceC8366.skipTransient()) {
            c8362.f23055 = false;
            if (c8362.f23056 && !c8362.f23059) {
                c8362.f23045 = false;
            }
        }
        if (interfaceC8366.unwrapped()) {
            c8362.f23046 |= 562949953421312L;
        }
        for (JSONWriter$Feature jSONWriter$Feature : interfaceC8366.serializeFeatures()) {
            c8362.f23046 |= jSONWriter$Feature.mask;
            if (c8362.f23045 && !c8362.f23056 && zSerialize && jSONWriter$Feature == JSONWriter$Feature.FieldBased) {
                c8362.f23045 = false;
            }
        }
        int iOrdinal = interfaceC8366.ordinal();
        if (iOrdinal != 0) {
            c8362.f23047 = iOrdinal;
        }
        if (interfaceC8366.value()) {
            c8362.f23046 |= 281474976710656L;
        }
        if (interfaceC8366.jsonDirect()) {
            c8362.f23046 |= 1125899906842624L;
        }
        Class clsSerializeUsing = interfaceC8366.serializeUsing();
        if (InterfaceC8531.class.isAssignableFrom(clsSerializeUsing)) {
            c8362.f23061 = clsSerializeUsing;
        }
        Class clsContentAs = interfaceC8366.contentAs();
        if (clsContentAs != Void.class) {
            c8362.f23054 = clsContentAs;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static void m13502(C8362 c8362, String str) {
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
        c8362.f23049 = strTrim;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static void m13503(C8362 c8362, Enum[] enumArr) {
        for (Enum r0 : enumArr) {
            String strName = r0.name();
            strName.getClass();
            switch (strName) {
                case "DisableCircularReferenceDetect":
                    c8362.f23046 |= 144115188075855872L;
                    break;
                case "WriteNullNumberAsZero":
                    c8362.f23046 |= JSONWriter$Feature.WriteNullNumberAsZero.mask;
                    break;
                case "IgnoreErrorGetter":
                    c8362.f23046 |= JSONWriter$Feature.IgnoreErrorGetter.mask;
                    break;
                case "UseISO8601DateFormat":
                    c8362.f23049 = "iso8601";
                    break;
                case "WriteBigDecimalAsPlain":
                    c8362.f23046 |= JSONWriter$Feature.WriteBigDecimalAsPlain.mask;
                    break;
                case "WriteEnumUsingToString":
                    c8362.f23046 |= JSONWriter$Feature.WriteEnumUsingToString.mask;
                    break;
                case "BrowserCompatible":
                    c8362.f23046 |= JSONWriter$Feature.BrowserCompatible.mask;
                    break;
                case "WriteNullStringAsEmpty":
                    c8362.f23046 |= JSONWriter$Feature.WriteNullStringAsEmpty.mask;
                    break;
                case "NotWriteRootClassName":
                    c8362.f23046 |= JSONWriter$Feature.NotWriteRootClassName.mask;
                    break;
                case "WriteNullListAsEmpty":
                    c8362.f23046 |= JSONWriter$Feature.WriteNullListAsEmpty.mask;
                    break;
                case "WriteNonStringValueAsString":
                    c8362.f23046 |= JSONWriter$Feature.WriteNonStringValueAsString.mask;
                    break;
                case "WriteNullBooleanAsFalse":
                    c8362.f23046 |= JSONWriter$Feature.WriteNullBooleanAsFalse.mask;
                    break;
                case "WriteClassName":
                    c8362.f23046 |= JSONWriter$Feature.WriteClassName.mask;
                    break;
                case "WriteMapNullValue":
                    c8362.f23046 |= JSONWriter$Feature.WriteNulls.mask;
                    break;
            }
        }
    }

    @Override // p249.InterfaceC8159
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public void mo9055(C4292 c4292) {
        m13509(Level.WARN, new C6051(c4292, 7));
    }

    @Override // p249.InterfaceC8159
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public void mo9056(InterfaceC6542 interfaceC6542) {
        m13509(Level.INFO, new C4247(interfaceC6542, 4));
    }

    @Override // p249.InterfaceC8159
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public void mo9057(InterfaceC6542 interfaceC6542) {
        m13509(Level.TRACE, new C4247(interfaceC6542, 2));
    }

    @Override // p249.InterfaceC8159
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo9058(InterfaceC6542 interfaceC6542) {
        m13509(Level.DEBUG, new C4247(interfaceC6542, 5));
    }

    @Override // p155.InterfaceC7614
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public boolean mo340(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f22221;
        if (!swipeDismissBehavior.mo7022(view)) {
            return false;
        }
        boolean z = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.f10006;
        int width = (!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth();
        WeakHashMap weakHashMap = AbstractC2270.f6593;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        return true;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3744
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo8076(Rect rect) {
        C2492 c2492 = (C2492) this.f22221;
        if (((C8211) c2492.f7462).f22655 == DialogXStyle$PopTipSettings$ALIGN.TOP_INSIDE) {
            ((LinearLayout) c2492.f7460).setPadding(0, rect.top, 0, 0);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public void m13504(C8134 c8134, InterfaceC6557 interfaceC6557) {
        ((C4190) ((C8142) this.f22221).m13569(c8134, new C7179(11))).m8572(new C8133(interfaceC6557));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public void m13505(C8134 c8134, Object obj) throws Throwable {
        C4190 c4190 = (C4190) ((C8142) this.f22221).m13568(c8134);
        Throwable th = null;
        if (c4190 != null) {
            Object objM8568 = c4190.m8568();
            objM8568.getClass();
            for (C4189 c4189M8567 = (C4189) objM8568; !c4189M8567.equals(c4190); c4189M8567 = c4189M8567.m8567()) {
                if (c4189M8567 instanceof C8133) {
                    try {
                        InterfaceC6557 interfaceC6557 = ((C8133) c4189M8567).f22446;
                        AbstractC4387.m8898(1, interfaceC6557);
                        interfaceC6557.invoke(obj);
                    } catch (Throwable th2) {
                        if (th != null) {
                            AbstractC5186.m10212(th, th2);
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

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public void m13506(C8364 c8364, C8362 c8362, Class cls, Method method) {
        Field fieldM5769;
        Method declaredMethod;
        C8547 c8547 = ((C8529) this.f22221).f23716;
        Class cls2 = (Class) c8547.f23792.get(cls);
        String name = method.getName();
        if ("getTargetSql".equals(name) && cls != null && cls.getName().startsWith("com.baomidou.mybatisplus.")) {
            c8362.f23046 |= JSONWriter$Feature.IgnoreErrorGetter.mask;
        }
        if (cls2 != null && cls2 != cls) {
            try {
                declaredMethod = cls2.getDeclaredMethod(name, method.getParameterTypes());
            } catch (Exception unused) {
                declaredMethod = null;
            }
            if (declaredMethod != null) {
                m13506(c8364, c8362, cls2, declaredMethod);
            }
        }
        if (((Class) c8547.f23792.get(method.getReturnType())) != null) {
            c8362.f23064 = true;
        }
        Class cls3 = AbstractC2853.f8928;
        int i = 0;
        if (cls3 != null && method.getAnnotation(cls3) != null) {
            c8362.f23045 = true;
            c8362.f23056 = true;
            if (!c8364.f23082) {
                c8362.f23055 = false;
                c8362.f23045 = false;
            }
        }
        if (cls != null) {
            Class superclass = cls.getSuperclass();
            Method methodM5752 = AbstractC2864.m5752(method, superclass);
            boolean z = c8362.f23045;
            if (methodM5752 != null) {
                m13506(c8364, c8362, superclass, methodM5752);
                Field fieldM57692 = AbstractC2864.m5769(method, cls);
                int modifiers = methodM5752.getModifiers();
                if (fieldM57692 != null && z != c8362.f23045 && !Modifier.isAbstract(modifiers) && !methodM5752.equals(method)) {
                    c8362.f23045 = z;
                }
            }
            for (Class<?> cls4 : cls.getInterfaces()) {
                Method methodM57522 = AbstractC2864.m5752(method, cls4);
                if (superclass != null && methodM57522 != null) {
                    m13506(c8364, c8362, superclass, methodM57522);
                }
            }
        }
        c8362.f23059 = false;
        m13508(c8362, AbstractC2864.m5775(method));
        if (!cls.getName().startsWith("java.lang") && !AbstractC2864.m5745(cls) && (fieldM5769 = AbstractC2864.m5769(method, cls)) != null) {
            c8362.f23046 |= 4503599627370496L;
            m13507(c8364, c8362, cls, fieldM5769);
        }
        boolean z2 = c8364.f23094;
        if (!z2 || c8364.f23110 == null || c8364.f23109 == null) {
            return;
        }
        String strM5759 = AbstractC2864.m5759(method, z2, null);
        while (true) {
            String[] strArr = c8364.f23109;
            if (i >= strArr.length) {
                return;
            }
            if (strM5759.equals(strArr[i])) {
                Annotation[][] parameterAnnotations = c8364.f23110.getParameterAnnotations();
                if (i < parameterAnnotations.length) {
                    m13508(c8362, parameterAnnotations[i]);
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
    public void m13507(p278.C8364 r18, p278.C8362 r19, java.lang.Class r20, java.lang.reflect.Field r21) {
        /*
            Method dump skipped, instruction units count: 809
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p230.C8048.m13507(飘花落叶言楪子世兰哲苏.飘花落叶言子楪世苏哲兰, 飘花落叶言楪子世兰哲苏.飘花落叶言子楪世哲苏兰, java.lang.Class, java.lang.reflect.Field):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public void m13508(C8362 c8362, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            InterfaceC8366 interfaceC8366 = (InterfaceC8366) AbstractC2864.m5774(annotation, InterfaceC8366.class);
            if (interfaceC8366 != null) {
                m13501(c8362, interfaceC8366);
            } else {
                if (clsAnnotationType == InterfaceC8368.class && ((InterfaceC8368) annotation).value() == JSONCompiler$CompilerOption.LAMBDA) {
                    c8362.f23046 |= 18014398509481984L;
                }
                boolean z = AbstractC2932.f9286;
                String name = clsAnnotationType.getName();
                if (name.equals("com.fasterxml.jackson.annotation.JsonInclude")) {
                    if (z) {
                        AbstractC2864.m5766(annotation.getClass(), new C2779(annotation, c8362, 5));
                    }
                } else if (name.equals("com.fasterxml.jackson.databind.annotation.JsonSerialize")) {
                    if (z) {
                        AbstractC2864.m5766(annotation.getClass(), new C2779(this, annotation, c8362, 9));
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonFormat")) {
                    if (z) {
                        AbstractC2864.m5743(c8362, annotation);
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonIgnore")) {
                    if (z) {
                        AbstractC2864.m5744(c8362, annotation);
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonValue")) {
                    if (z) {
                        c8362.f23046 |= 281474976710656L;
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonAnyGetter")) {
                    if (z) {
                        c8362.f23046 |= 562949953421312L;
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonProperty")) {
                    if (z) {
                        AbstractC2864.m5766(annotation.getClass(), new C2779(annotation, c8362, 11));
                    }
                } else if (name.equals("java.beans.Transient")) {
                    if (c8362.f23055) {
                        c8362.f23045 = true;
                    }
                    c8362.f23056 = true;
                } else if (name.equals("com.alibaba.fastjson.annotation.JSONField")) {
                    AbstractC2864.m5766(annotation.getClass(), new C2779(this, annotation, c8362, 10));
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonRawValue")) {
                    if (z) {
                        c8362.f23046 |= 1125899906842624L;
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonUnwrapped") && z) {
                    AbstractC2864.m5766(annotation.getClass(), new C2779(annotation, c8362, 8));
                }
            }
        }
    }

    @Override // com.kongzue.dialogx.util.views.InterfaceC3756
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public boolean mo8096() {
        switch (this.f22222) {
            case 4:
                C8239 c8239 = ((C8238) this.f22221).f22746;
                if (c8239.f11580) {
                    c8239.m13747();
                }
                break;
            case 5:
                C8232 c8232 = (C8232) ((C0325) this.f22221).f1093;
                BaseDialog$BOOLEAN baseDialog$BOOLEAN = c8232.f22725;
                if (baseDialog$BOOLEAN != null ? baseDialog$BOOLEAN == BaseDialog$BOOLEAN.TRUE : c8232.f11580) {
                    c8232.m13739();
                }
                break;
            case 6:
                C8207 c8207 = ((C8208) this.f22221).f22641;
                c8207.getClass();
                if (c8207.mo13708()) {
                    c8207.m13713();
                }
                break;
            default:
                if (((C8199) this.f22221).f22593.f22576 == null) {
                    AbstractC6325 abstractC6325 = AbstractC8247.f22824;
                }
                break;
        }
        return true;
    }

    @Override // p249.InterfaceC8159
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public void mo9065(Throwable th, InterfaceC6542 interfaceC6542) {
        m13509(Level.ERROR, new C7067(interfaceC6542, 2, th));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public void m13509(Level level, InterfaceC6557 interfaceC6557) {
        boolean zIsTraceEnabled;
        level.getClass();
        InterfaceC9156 interfaceC9156 = (InterfaceC9156) this.f22221;
        switch (AbstractC8130.f22443[level.ordinal()]) {
            case 1:
                zIsTraceEnabled = interfaceC9156.isTraceEnabled(null);
                break;
            case 2:
                zIsTraceEnabled = interfaceC9156.isDebugEnabled(null);
                break;
            case 3:
                zIsTraceEnabled = interfaceC9156.isInfoEnabled(null);
                break;
            case 4:
                zIsTraceEnabled = interfaceC9156.isWarnEnabled(null);
                break;
            case 5:
                zIsTraceEnabled = interfaceC9156.isErrorEnabled(null);
                break;
            case 6:
                zIsTraceEnabled = false;
                break;
            default:
                C4210.m8621();
        }
        if (zIsTraceEnabled) {
            C8158 c8158 = new C8158();
            interfaceC6557.invoke(c8158);
            String str = c8158.f22501;
            Throwable th = c8158.f22500;
            switch (AbstractC8131.f22444[level.ordinal()]) {
                case 1:
                    interfaceC9156.trace(null, str, th);
                    break;
                case 2:
                    interfaceC9156.debug(null, str, th);
                    break;
                case 3:
                    interfaceC9156.info(null, str, th);
                    break;
                case 4:
                    interfaceC9156.warn(null, str, th);
                    break;
                case 5:
                    interfaceC9156.error(null, str, th);
                    break;
                case 6:
                    break;
                default:
                    C4210.m8621();
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public void m13510(Class cls, C8364 c8364) {
        Class cls2;
        String str;
        if (cls != null) {
            Class superclass = cls.getSuperclass();
            if (superclass != Object.class && superclass != null && superclass != Enum.class) {
                m13510(superclass, c8364);
            }
            for (Class<?> cls3 : cls.getInterfaces()) {
                if (cls3 != Serializable.class) {
                    m13510(cls3, c8364);
                }
            }
            if (c8364.f23088 != null && c8364.f23107 != null) {
                int i = 0;
                while (true) {
                    Class[] clsArr = c8364.f23088;
                    if (i >= clsArr.length) {
                        break;
                    }
                    if (clsArr[i] == cls) {
                        String[] strArr = c8364.f23107;
                        if (i < strArr.length && (str = strArr[i]) != null && str.length() != 0) {
                            c8364.f23092 = str;
                            break;
                        }
                    }
                    i++;
                }
            }
        }
        Annotation[] annotationArrM5775 = AbstractC2864.m5775(cls);
        InterfaceC8365 interfaceC8365 = null;
        int i2 = 0;
        Annotation annotation = null;
        while (true) {
            int i3 = 1;
            if (i2 >= annotationArrM5775.length) {
                break;
            }
            Annotation annotation2 = annotationArrM5775[i2];
            Class<? extends Annotation> clsAnnotationType = annotation2.annotationType();
            if (interfaceC8365 == null) {
                interfaceC8365 = (InterfaceC8365) AbstractC2864.m5774(annotation2, InterfaceC8365.class);
            }
            if (interfaceC8365 != annotation2) {
                if (clsAnnotationType == InterfaceC8368.class && ((InterfaceC8368) annotation2).value() == JSONCompiler$CompilerOption.LAMBDA) {
                    c8364.f23100 |= 18014398509481984L;
                }
                boolean z = AbstractC2932.f9286;
                String name = clsAnnotationType.getName();
                if (name.equals("com.fasterxml.jackson.annotation.JsonInclude")) {
                    if (z) {
                        AbstractC2864.m5766(annotation2.getClass(), new C2770(annotation2, c8364, 6));
                    }
                } else if (name.equals("com.fasterxml.jackson.databind.annotation.JsonSerialize")) {
                    if (z) {
                        AbstractC2864.m5766(annotation2.getClass(), new C2770(this, annotation2, c8364));
                        if (c8364.f23098 != null && Enum.class.isAssignableFrom(cls)) {
                            c8364.f23104 = true;
                        }
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonFormat")) {
                    if (z) {
                        AbstractC2864.m5766(annotation2.getClass(), new C2770(annotation2, c8364, 8));
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonSubTypes")) {
                    if (z) {
                        AbstractC2864.m5766(annotation2.getClass(), new C2770(annotation2, c8364, 13));
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonPropertyOrder")) {
                    if (z) {
                        Class<?> cls4 = annotation2.getClass();
                        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                        AbstractC2864.m5766(cls4, new C2769(annotation2, c8364, atomicBoolean, i3));
                        String[] strArr2 = c8364.f23103;
                        if (strArr2 == null || strArr2.length == 0) {
                            c8364.f23085 = atomicBoolean.get();
                        }
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonTypeInfo")) {
                    if (z) {
                        AbstractC2864.m5766(annotation2.getClass(), new C2770(annotation2, c8364, 14));
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonTypeName")) {
                    if (z) {
                        AbstractC2864.m5766(annotation2.getClass(), new C2770(annotation2, c8364, 7));
                    }
                } else if (name.equals("com.fasterxml.jackson.annotation.JsonIgnoreProperties")) {
                    if (z) {
                        AbstractC2864.m5766(annotation2.getClass(), new C2770(annotation2, c8364, 12));
                    }
                } else if (name.equals("kotlin.Metadata")) {
                    c8364.f23094 = true;
                    AbstractC2859.m5731(cls, c8364);
                } else if (name.equals("com.alibaba.fastjson.annotation.JSONType")) {
                    annotation = annotation2;
                }
            }
            i2++;
        }
        if (interfaceC8365 == null && (cls2 = (Class) ((C8529) this.f22221).f23716.f23792.get(cls)) != null) {
            Annotation[] annotationArrM57752 = AbstractC2864.m5775(cls2);
            int i4 = 0;
            while (i4 < annotationArrM57752.length) {
                Annotation annotation3 = annotationArrM57752[i4];
                Class<? extends Annotation> clsAnnotationType2 = annotation3.annotationType();
                InterfaceC8365 interfaceC83652 = (InterfaceC8365) AbstractC2864.m5774(annotation3, InterfaceC8365.class);
                if (interfaceC83652 != annotation3 && "com.alibaba.fastjson.annotation.JSONType".equals(clsAnnotationType2.getName())) {
                    annotation = annotation3;
                }
                i4++;
                interfaceC8365 = interfaceC83652;
            }
        }
        if (interfaceC8365 != null) {
            Class[] clsArrSeeAlso = interfaceC8365.seeAlso();
            if (clsArrSeeAlso.length != 0) {
                c8364.f23088 = clsArrSeeAlso;
            }
            String strTypeKey = interfaceC8365.typeKey();
            if (!strTypeKey.isEmpty()) {
                c8364.f23093 = strTypeKey;
            }
            String strTypeName = interfaceC8365.typeName();
            if (!strTypeName.isEmpty()) {
                c8364.f23092 = strTypeName;
            }
            for (JSONWriter$Feature jSONWriter$Feature : interfaceC8365.serializeFeatures()) {
                c8364.f23100 |= jSONWriter$Feature.mask;
            }
            c8364.f23105 = interfaceC8365.naming().name();
            String[] strArrIgnores = interfaceC8365.ignores();
            if (strArrIgnores.length > 0) {
                c8364.f23102 = strArrIgnores;
            }
            String[] strArrIncludes = interfaceC8365.includes();
            if (strArrIncludes.length > 0) {
                c8364.f23095 = strArrIncludes;
            }
            String[] strArrOrders = interfaceC8365.orders();
            if (strArrOrders.length > 0) {
                c8364.f23103 = strArrOrders;
            }
            Class clsSerializer = interfaceC8365.serializer();
            if (InterfaceC8531.class.isAssignableFrom(clsSerializer)) {
                c8364.f23098 = clsSerializer;
                c8364.f23104 = true;
            }
            Class[] clsArrSerializeFilters = interfaceC8365.serializeFilters();
            if (clsArrSerializeFilters.length != 0) {
                c8364.f23096 = clsArrSerializeFilters;
            }
            String str2 = interfaceC8365.format();
            if (!str2.isEmpty()) {
                c8364.f23087 = str2;
            }
            String strLocale = interfaceC8365.locale();
            if (!strLocale.isEmpty()) {
                String[] strArrSplit = strLocale.split(JavaConstant.Dynamic.DEFAULT_NAME);
                if (strArrSplit.length == 2) {
                    c8364.f23086 = new Locale(strArrSplit[0], strArrSplit[1]);
                }
            }
            if (!interfaceC8365.alphabetic()) {
                c8364.f23085 = false;
            }
            if (interfaceC8365.writeEnumAsJavaBean()) {
                c8364.f23104 = true;
            }
            String strRootName = interfaceC8365.rootName();
            if (!strRootName.isEmpty()) {
                c8364.f23083 = strRootName;
            }
            if (c8364.f23082) {
                c8364.f23082 = interfaceC8365.skipTransient();
            }
        } else if (annotation != null) {
            AbstractC2864.m5766(annotation.annotationType(), new C2770(c8364, annotation, 10));
        }
        Class[] clsArr2 = c8364.f23088;
        if (clsArr2 == null || clsArr2.length == 0) {
            return;
        }
        String str3 = c8364.f23092;
        if (str3 == null || str3.length() == 0) {
            for (Class cls5 : c8364.f23088) {
                if (cls5 == cls) {
                    c8364.f23092 = cls.getSimpleName();
                    return;
                }
            }
        }
    }

    @Override // p249.InterfaceC8159
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public void mo9068(InterfaceC6542 interfaceC6542) {
        m13509(Level.ERROR, new C4247(interfaceC6542, 3));
    }

    public /* synthetic */ C8048(Object obj, int i) {
        this.f22222 = i;
        this.f22221 = obj;
    }

    public /* synthetic */ C8048(int i, boolean z) {
        this.f22222 = i;
    }

    public C8048(Context context) {
        this.f22222 = 0;
        this.f22221 = new C7711(context, 9);
    }
}
