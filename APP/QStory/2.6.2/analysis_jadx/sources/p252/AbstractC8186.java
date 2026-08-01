package p252;

import io.ktor.server.application.C4057;
import io.ktor.server.application.InterfaceC4054;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.reflect.InterfaceC5107;
import kotlin.reflect.InterfaceC5109;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.full.AbstractC4405;
import kotlin.reflect.jvm.AbstractC5080;
import p089.C7179;
import p175.AbstractC7738;

/* JADX INFO: renamed from: 飘花落叶言楪兰苏世哲子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8186 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ThreadLocal f22561 = new ThreadLocal();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Class f22560 = InterfaceC4054.class;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Class f22559 = C4057.class;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final boolean m13650(InterfaceC5107 interfaceC5107, Class cls) {
        interfaceC5107.getClass();
        cls.getClass();
        Type typeM10090 = AbstractC5080.m10090(interfaceC5107.getType());
        Class<?> cls2 = typeM10090 instanceof Class ? (Class) typeM10090 : null;
        if (cls2 != null) {
            return cls.isAssignableFrom(cls2);
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean m13651(InterfaceC5109 interfaceC5109) {
        interfaceC5109.getClass();
        if (interfaceC5109.isOperator() || interfaceC5109.isInfix() || interfaceC5109.isInline() || interfaceC5109.isAbstract() || interfaceC5109.isSuspend()) {
            return false;
        }
        InterfaceC5107 interfaceC5107M8938 = AbstractC4405.m8938(interfaceC5109);
        Class cls = f22559;
        Class cls2 = f22560;
        if (interfaceC5107M8938 != null && !m13650(interfaceC5107M8938, cls) && !m13650(interfaceC5107M8938, cls2)) {
            return false;
        }
        Method methodM10091 = AbstractC5080.m10091(interfaceC5109);
        if (methodM10091 != null) {
            if (methodM10091.isSynthetic()) {
                return false;
            }
            if (Modifier.isStatic(methodM10091.getModifiers()) && interfaceC5109.getParameters().isEmpty()) {
                return false;
            }
        }
        List<InterfaceC5107> parameters = interfaceC5109.getParameters();
        if (parameters != null && parameters.isEmpty()) {
            return true;
        }
        for (InterfaceC5107 interfaceC5107 : parameters) {
            interfaceC5107.getClass();
            if (!m13650(interfaceC5107, cls) && !m13650(interfaceC5107, cls2) && interfaceC5107.getKind() != KParameter$Kind.INSTANCE && !interfaceC5107.mo9957()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC5109 m13652(ArrayList arrayList) {
        return (InterfaceC5109) AbstractC4343.m8810(AbstractC4343.m8817(arrayList, AbstractC7738.m13041(new C7179(12), new C7179(13), new C7179(14))));
    }
}
