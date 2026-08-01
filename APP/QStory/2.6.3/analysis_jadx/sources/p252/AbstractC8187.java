package p252;

import com.bumptech.glide.AbstractC3056;
import io.ktor.server.application.C4058;
import io.ktor.server.application.InterfaceC4055;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.reflect.InterfaceC5108;
import kotlin.reflect.InterfaceC5110;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.full.AbstractC4406;
import kotlin.reflect.jvm.AbstractC5081;
import p089.C7180;

/* JADX INFO: renamed from: 飘花落叶言楪兰苏世哲子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8187 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ThreadLocal f22560 = new ThreadLocal();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Class f22559 = InterfaceC4055.class;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Class f22558 = C4058.class;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final boolean m13674(InterfaceC5108 interfaceC5108, Class cls) {
        interfaceC5108.getClass();
        cls.getClass();
        Type typeM10094 = AbstractC5081.m10094(interfaceC5108.getType());
        Class<?> cls2 = typeM10094 instanceof Class ? (Class) typeM10094 : null;
        if (cls2 != null) {
            return cls.isAssignableFrom(cls2);
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean m13675(InterfaceC5110 interfaceC5110) {
        interfaceC5110.getClass();
        if (interfaceC5110.isOperator() || interfaceC5110.isInfix() || interfaceC5110.isInline() || interfaceC5110.isAbstract() || interfaceC5110.isSuspend()) {
            return false;
        }
        InterfaceC5108 interfaceC5108M8928 = AbstractC4406.m8928(interfaceC5110);
        Class cls = f22558;
        Class cls2 = f22559;
        if (interfaceC5108M8928 != null && !m13674(interfaceC5108M8928, cls) && !m13674(interfaceC5108M8928, cls2)) {
            return false;
        }
        Method methodM10095 = AbstractC5081.m10095(interfaceC5110);
        if (methodM10095 != null) {
            if (methodM10095.isSynthetic()) {
                return false;
            }
            if (Modifier.isStatic(methodM10095.getModifiers()) && interfaceC5110.getParameters().isEmpty()) {
                return false;
            }
        }
        List<InterfaceC5108> parameters = interfaceC5110.getParameters();
        if (parameters != null && parameters.isEmpty()) {
            return true;
        }
        for (InterfaceC5108 interfaceC5108 : parameters) {
            interfaceC5108.getClass();
            if (!m13674(interfaceC5108, cls) && !m13674(interfaceC5108, cls2) && interfaceC5108.getKind() != KParameter$Kind.INSTANCE && !interfaceC5108.mo9954()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC5110 m13676(ArrayList arrayList) {
        return (InterfaceC5110) AbstractC4344.m8812(AbstractC4344.m8778(arrayList, AbstractC3056.m6718(new C7180(12), new C7180(13), new C7180(14))));
    }
}
