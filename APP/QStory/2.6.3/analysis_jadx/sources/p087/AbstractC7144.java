package p087;

import androidx.activity.AbstractC0053;
import androidx.window.area.AbstractC2567;
import io.ktor.util.C4211;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.InterfaceC5093;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import net.bytebuddy.pool.TypePool;
import p009.AbstractC6183;
import p089.InterfaceC7184;
import p091.InterfaceC7191;
import p253.AbstractC8190;
import top.yukonga.miuix.kmp.utils.C6057;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7144 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC7191[] f19104 = new InterfaceC7191[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final InterfaceC7184[] f19103 = new InterfaceC7184[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Object f19102 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final InterfaceC7184 m12411(Object obj, InterfaceC7184... interfaceC7184Arr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (interfaceC7184Arr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = interfaceC7184Arr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = InterfaceC7184.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(interfaceC7184Arr, interfaceC7184Arr.length));
            if (objInvoke instanceof InterfaceC7184) {
                return (InterfaceC7184) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw e;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final int m12412(InterfaceC7191 interfaceC7191, InterfaceC7191[] interfaceC7191Arr) {
        interfaceC7191Arr.getClass();
        int iHashCode = (interfaceC7191.mo12382().hashCode() * 31) + Arrays.hashCode(interfaceC7191Arr);
        int iMo12380 = interfaceC7191.mo12380();
        int i = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iMo12380 > 0)) {
                break;
            }
            int i2 = iMo12380 - 1;
            int i3 = i * 31;
            String strMo12382 = interfaceC7191.mo12383(interfaceC7191.mo12380() - iMo12380).mo12382();
            if (strMo12382 != null) {
                iHashCode2 = strMo12382.hashCode();
            }
            i = i3 + iHashCode2;
            iMo12380 = i2;
        }
        int iMo123802 = interfaceC7191.mo12380();
        int iHashCode3 = 1;
        while (true) {
            if (!(iMo123802 > 0)) {
                return (((iHashCode * 31) + i) * 31) + iHashCode3;
            }
            int i4 = iMo123802 - 1;
            int i5 = iHashCode3 * 31;
            AbstractC8190 kind = interfaceC7191.mo12383(interfaceC7191.mo12380() - iMo123802).getKind();
            iHashCode3 = i5 + (kind != null ? kind.hashCode() : 0);
            iMo123802 = i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00af  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p089.InterfaceC7184 m12413(java.lang.Class r17, p089.InterfaceC7184... r18) {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p087.AbstractC7144.m12413(java.lang.Class, 飘花落叶言世苏兰子楪哲.飘花落叶言子楪世苏哲兰[]):飘花落叶言世苏兰子楪哲.飘花落叶言子楪世苏哲兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final InterfaceC7191[] m12414(List list) {
        InterfaceC7191[] interfaceC7191Arr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (interfaceC7191Arr = (InterfaceC7191[]) list.toArray(new InterfaceC7191[0])) == null) ? f19104 : interfaceC7191Arr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Set m12415(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        if (interfaceC7191 instanceof InterfaceC7120) {
            return ((InterfaceC7120) interfaceC7191).mo12405();
        }
        HashSet hashSet = new HashSet(interfaceC7191.mo12380());
        int iMo12380 = interfaceC7191.mo12380();
        for (int i = 0; i < iMo12380; i++) {
            hashSet.add(interfaceC7191.mo12379(i));
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7088 m12416(String str, InterfaceC7184 interfaceC7184) {
        return new C7088(str, new C7087(interfaceC7184));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final String m12417(InterfaceC5093 interfaceC5093) {
        interfaceC5093.getClass();
        String simpleName = interfaceC5093.getSimpleName();
        if (simpleName == null) {
            simpleName = "<local class name not available>";
        }
        return AbstractC0053.m158("Serializer for class '", simpleName, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final InterfaceC5093 m12418(InterfaceC5087 interfaceC5087) {
        InterfaceC5092 interfaceC5092Mo8899 = interfaceC5087.mo8899();
        if (interfaceC5092Mo8899 instanceof InterfaceC5093) {
            return (InterfaceC5093) interfaceC5092Mo8899;
        }
        if (!(interfaceC5092Mo8899 instanceof AbstractC4394)) {
            C4211.m8604(interfaceC5092Mo8899, "Only KClass supported as classifier, got ");
            return null;
        }
        throw new IllegalArgumentException("Captured type parameter " + interfaceC5092Mo8899 + " from generic non-reified function. Such functionality cannot be supported because " + interfaceC5092Mo8899 + " is erased, either specify serializer explicitly or make calling function inline with reified " + interfaceC5092Mo8899 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final String m12419(InterfaceC7191 interfaceC7191) {
        return AbstractC4344.m8810(AbstractC2567.m5067(0, interfaceC7191.mo12380()), ", ", interfaceC7191.mo12382() + '(', ")", new C6057(interfaceC7191, 2), 24);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final void m12420(int i, int i2, InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(interfaceC7191.mo12379(i4));
            }
            i3 >>>= 1;
        }
        throw new MissingFieldException(arrayList, interfaceC7191.mo12382());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final void m12421(String str, InterfaceC5093 interfaceC5093) {
        String string;
        interfaceC5093.getClass();
        String str2 = "in the polymorphic scope of '" + interfaceC5093.getSimpleName() + '\'';
        if (str == null) {
            string = AbstractC6183.m11590(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder sbM11582 = AbstractC6183.m11582("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            AbstractC6183.m11577(sbM11582, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbM11582.append(interfaceC5093.getSimpleName());
            sbM11582.append("' has to be sealed and '@Serializable'.");
            string = sbM11582.toString();
        }
        throw new SerializationException(string);
    }
}
