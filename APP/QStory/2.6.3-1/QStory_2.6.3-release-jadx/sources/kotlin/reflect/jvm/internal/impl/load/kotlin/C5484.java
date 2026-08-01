package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.activity.AbstractC0900;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC5661;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5725;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC5683;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.text.AbstractC5976;
import net.bytebuddy.pool.TypePool;
import p087.AbstractC7742;
import p098.C7864;
import p114.C8069;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5484 implements InterfaceC5661 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5484 f13940 = new C5484();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5484 f13939 = new C5484();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C5484 f13938 = new C5484();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static LinkedHashSet m9819(String str, String... strArr) {
        return m9821("java/util/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static LinkedHashSet m9820(String str, String... strArr) {
        return m9821("java/lang/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static LinkedHashSet m9821(String str, String... strArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + str2);
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static AbstractC5477 m9822(String str) {
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
            return new C5473(jvmPrimitiveType);
        }
        if (cCharAt == 'V') {
            return new C5473(null);
        }
        if (cCharAt == '[') {
            return new C5482(m9822(str.substring(1)));
        }
        if (cCharAt == 'L') {
            AbstractC5976.m10718(str, TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER);
        }
        return new C5474(AbstractC0900.m721(1, 1, str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String[] m9823(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static String m9824(AbstractC5477 abstractC5477) {
        String desc;
        abstractC5477.getClass();
        if (abstractC5477 instanceof C5482) {
            return "[".concat(m9824(((C5482) abstractC5477).f13932));
        }
        if (abstractC5477 instanceof C5473) {
            JvmPrimitiveType jvmPrimitiveType = ((C5473) abstractC5477).f13912;
            return (jvmPrimitiveType == null || (desc = jvmPrimitiveType.getDesc()) == null) ? "V" : desc;
        }
        if (abstractC5477 instanceof C5474) {
            return AbstractC0900.m708(new StringBuilder("L"), ((C5474) abstractC5477).f13913, TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER);
        }
        C5043.m9170();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC5661
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public AbstractC5714 mo9825(ProtoBuf$Type protoBuf$Type, String str, AbstractC5710 abstractC5710, AbstractC5710 abstractC57102) {
        protoBuf$Type.getClass();
        str.getClass();
        abstractC5710.getClass();
        abstractC57102.getClass();
        if (!str.equals("kotlin.jvm.PlatformType")) {
            return C8069.m13029(ErrorTypeKind.ERROR_FLEXIBLE_TYPE, str, abstractC5710.toString(), abstractC57102.toString());
        }
        if (!protoBuf$Type.hasExtension(AbstractC7742.f18772)) {
            return AbstractC5725.m10368(abstractC5710, abstractC57102);
        }
        C7864 c7864 = new C7864(abstractC5710, abstractC57102);
        InterfaceC5683.f14478.m10157(abstractC5710, abstractC57102);
        return c7864;
    }
}
