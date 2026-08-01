package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.activity.AbstractC0053;
import io.ktor.util.C4210;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4828;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4892;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4850;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.text.AbstractC5143;
import net.bytebuddy.pool.TypePool;
import p071.AbstractC6912;
import p082.C7034;
import p098.C7239;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4651 implements InterfaceC4828 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4651 f13591 = new C4651();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4651 f13590 = new C4651();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4651 f13589 = new C4651();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static LinkedHashSet m9270(String str, String... strArr) {
        return m9272("java/util/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static LinkedHashSet m9271(String str, String... strArr) {
        return m9272("java/lang/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static LinkedHashSet m9272(String str, String... strArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + str2);
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static AbstractC4644 m9273(String str) {
        JvmPrimitiveType jvmPrimitiveType;
        char cCharAt = str.charAt(0);
        JvmPrimitiveType[] jvmPrimitiveTypeArrValues = JvmPrimitiveType.values();
        int length = jvmPrimitiveTypeArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                jvmPrimitiveType = null;
                break;
            }
            jvmPrimitiveType = jvmPrimitiveTypeArrValues[i];
            if (jvmPrimitiveType.getDesc().charAt(0) == cCharAt) {
                break;
            }
            i++;
        }
        if (jvmPrimitiveType != null) {
            return new C4640(jvmPrimitiveType);
        }
        if (cCharAt == 'V') {
            return new C4640(null);
        }
        if (cCharAt == '[') {
            return new C4649(m9273(str.substring(1)));
        }
        if (cCharAt == 'L') {
            AbstractC5143.m10155(str, TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER);
        }
        return new C4641(AbstractC0053.m160(1, 1, str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String[] m9274(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static String m9275(AbstractC4644 abstractC4644) {
        String desc;
        abstractC4644.getClass();
        if (abstractC4644 instanceof C4649) {
            return "[".concat(m9275(((C4649) abstractC4644).f13583));
        }
        if (abstractC4644 instanceof C4640) {
            JvmPrimitiveType jvmPrimitiveType = ((C4640) abstractC4644).f13563;
            return (jvmPrimitiveType == null || (desc = jvmPrimitiveType.getDesc()) == null) ? "V" : desc;
        }
        if (abstractC4644 instanceof C4641) {
            return AbstractC0053.m155(new StringBuilder("L"), ((C4641) abstractC4644).f13564, TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER);
        }
        C4210.m8621();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4828
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public AbstractC4881 mo9276(ProtoBuf$Type protoBuf$Type, String str, AbstractC4877 abstractC4877, AbstractC4877 abstractC48772) {
        protoBuf$Type.getClass();
        str.getClass();
        abstractC4877.getClass();
        abstractC48772.getClass();
        if (!str.equals("kotlin.jvm.PlatformType")) {
            return C7239.m12443(ErrorTypeKind.ERROR_FLEXIBLE_TYPE, str, abstractC4877.toString(), abstractC48772.toString());
        }
        if (!protoBuf$Type.hasExtension(AbstractC6912.f18432)) {
            return AbstractC4892.m9815(abstractC4877, abstractC48772);
        }
        C7034 c7034 = new C7034(abstractC4877, abstractC48772);
        InterfaceC4850.f14129.m9608(abstractC4877, abstractC48772);
        return c7034;
    }
}
