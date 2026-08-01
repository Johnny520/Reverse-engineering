package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.activity.AbstractC0053;
import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4829;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4893;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4851;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.text.AbstractC5144;
import net.bytebuddy.pool.TypePool;
import p071.AbstractC6913;
import p082.C7035;
import p098.C7240;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4652 implements InterfaceC4829 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4652 f13595 = new C4652();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4652 f13594 = new C4652();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4652 f13593 = new C4652();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static LinkedHashSet m9260(String str, String... strArr) {
        return m9262("java/util/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static LinkedHashSet m9261(String str, String... strArr) {
        return m9262("java/lang/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static LinkedHashSet m9262(String str, String... strArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + str2);
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static AbstractC4645 m9263(String str) {
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
            return new C4641(jvmPrimitiveType);
        }
        if (cCharAt == 'V') {
            return new C4641(null);
        }
        if (cCharAt == '[') {
            return new C4650(m9263(str.substring(1)));
        }
        if (cCharAt == 'L') {
            AbstractC5144.m10159(str, TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER);
        }
        return new C4642(AbstractC0053.m161(1, 1, str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String[] m9264(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static String m9265(AbstractC4645 abstractC4645) {
        String desc;
        abstractC4645.getClass();
        if (abstractC4645 instanceof C4650) {
            return "[".concat(m9265(((C4650) abstractC4645).f13587));
        }
        if (abstractC4645 instanceof C4641) {
            JvmPrimitiveType jvmPrimitiveType = ((C4641) abstractC4645).f13567;
            return (jvmPrimitiveType == null || (desc = jvmPrimitiveType.getDesc()) == null) ? "V" : desc;
        }
        if (abstractC4645 instanceof C4642) {
            return AbstractC0053.m148(new StringBuilder("L"), ((C4642) abstractC4645).f13568, TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER);
        }
        C4211.m8611();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4829
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public AbstractC4882 mo9266(ProtoBuf$Type protoBuf$Type, String str, AbstractC4878 abstractC4878, AbstractC4878 abstractC48782) {
        protoBuf$Type.getClass();
        str.getClass();
        abstractC4878.getClass();
        abstractC48782.getClass();
        if (!str.equals("kotlin.jvm.PlatformType")) {
            return C7240.m12470(ErrorTypeKind.ERROR_FLEXIBLE_TYPE, str, abstractC4878.toString(), abstractC48782.toString());
        }
        if (!protoBuf$Type.hasExtension(AbstractC6913.f18427)) {
            return AbstractC4893.m9809(abstractC4878, abstractC48782);
        }
        C7035 c7035 = new C7035(abstractC4878, abstractC48782);
        InterfaceC4851.f14133.m9598(abstractC4878, abstractC48782);
        return c7035;
    }
}
