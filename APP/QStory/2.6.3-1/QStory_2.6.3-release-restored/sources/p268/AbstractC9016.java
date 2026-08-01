package p268;

import com.bumptech.glide.AbstractC3888;
import io.ktor.server.application.C4890;
import io.ktor.server.application.InterfaceC4887;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.reflect.InterfaceC5940;
import kotlin.reflect.InterfaceC5942;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.full.AbstractC5238;
import kotlin.reflect.jvm.AbstractC5913;
import p105.C8009;

/* JADX INFO: renamed from: 飘花落叶言楪兰苏世哲子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9016 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ThreadLocal f22905 = new ThreadLocal();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Class f22904 = InterfaceC4887.class;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Class f22903 = C4890.class;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final boolean m14233(InterfaceC5940 interfaceC5940, Class cls) {
        interfaceC5940.getClass();
        cls.getClass();
        Type typeM10653 = AbstractC5913.m10653(interfaceC5940.getType());
        Class<?> cls2 = typeM10653 instanceof Class ? (Class) typeM10653 : null;
        if (cls2 != null) {
            return cls.isAssignableFrom(cls2);
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean m14234(InterfaceC5942 interfaceC5942) {
        interfaceC5942.getClass();
        if (interfaceC5942.isOperator() || interfaceC5942.isInfix() || interfaceC5942.isInline() || interfaceC5942.isAbstract() || interfaceC5942.isSuspend()) {
            return false;
        }
        InterfaceC5940 interfaceC5940M9487 = AbstractC5238.m9487(interfaceC5942);
        Class cls = f22903;
        Class cls2 = f22904;
        if (interfaceC5940M9487 != null && !m14233(interfaceC5940M9487, cls) && !m14233(interfaceC5940M9487, cls2)) {
            return false;
        }
        Method methodM10654 = AbstractC5913.m10654(interfaceC5942);
        if (methodM10654 != null) {
            if (methodM10654.isSynthetic()) {
                return false;
            }
            if (Modifier.isStatic(methodM10654.getModifiers()) && interfaceC5942.getParameters().isEmpty()) {
                return false;
            }
        }
        List<InterfaceC5940> parameters = interfaceC5942.getParameters();
        if (parameters != null && parameters.isEmpty()) {
            return true;
        }
        for (InterfaceC5940 interfaceC5940 : parameters) {
            interfaceC5940.getClass();
            if (!m14233(interfaceC5940, cls) && !m14233(interfaceC5940, cls2) && interfaceC5940.getKind() != KParameter$Kind.INSTANCE && !interfaceC5940.mo10513()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC5942 m14235(ArrayList arrayList) {
        return (InterfaceC5942) AbstractC5176.m9371(AbstractC5176.m9337(arrayList, AbstractC3888.m7278(new C8009(12), new C8009(13), new C8009(14))));
    }
}
