package p087;

import androidx.activity.AbstractC0053;
import io.ktor.util.C4210;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.AbstractC4393;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5091;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import net.bytebuddy.pool.TypePool;
import p000.AbstractC6087;
import p007.AbstractC6136;
import p089.InterfaceC7183;
import p091.InterfaceC7190;
import top.yukonga.miuix.kmp.utils.C6051;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7143 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC7190[] f19109 = new InterfaceC7190[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final InterfaceC7183[] f19108 = new InterfaceC7183[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Object f19107 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final InterfaceC7183 m12384(Object obj, InterfaceC7183... interfaceC7183Arr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (interfaceC7183Arr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = interfaceC7183Arr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = InterfaceC7183.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(interfaceC7183Arr, interfaceC7183Arr.length));
            if (objInvoke instanceof InterfaceC7183) {
                return (InterfaceC7183) objInvoke;
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
    public static final int m12385(InterfaceC7190 interfaceC7190, InterfaceC7190[] interfaceC7190Arr) {
        interfaceC7190Arr.getClass();
        int iHashCode = (interfaceC7190.mo12355().hashCode() * 31) + Arrays.hashCode(interfaceC7190Arr);
        int iMo12353 = interfaceC7190.mo12353();
        int i = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iMo12353 > 0)) {
                break;
            }
            int i2 = iMo12353 - 1;
            int i3 = i * 31;
            String strMo12355 = interfaceC7190.mo12356(interfaceC7190.mo12353() - iMo12353).mo12355();
            if (strMo12355 != null) {
                iHashCode2 = strMo12355.hashCode();
            }
            i = i3 + iHashCode2;
            iMo12353 = i2;
        }
        int iMo123532 = interfaceC7190.mo12353();
        int iHashCode3 = 1;
        while (true) {
            if (!(iMo123532 > 0)) {
                return (((iHashCode * 31) + i) * 31) + iHashCode3;
            }
            int i4 = iMo123532 - 1;
            int i5 = iHashCode3 * 31;
            AbstractC4921 kind = interfaceC7190.mo12356(interfaceC7190.mo12353() - iMo123532).getKind();
            iHashCode3 = i5 + (kind != null ? kind.hashCode() : 0);
            iMo123532 = i4;
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
    public static final p089.InterfaceC7183 m12386(java.lang.Class r17, p089.InterfaceC7183... r18) {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p087.AbstractC7143.m12386(java.lang.Class, 飘花落叶言世苏兰子楪哲.飘花落叶言子楪世苏哲兰[]):飘花落叶言世苏兰子楪哲.飘花落叶言子楪世苏哲兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final InterfaceC7190[] m12387(List list) {
        InterfaceC7190[] interfaceC7190Arr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (interfaceC7190Arr = (InterfaceC7190[]) list.toArray(new InterfaceC7190[0])) == null) ? f19109 : interfaceC7190Arr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Set m12388(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        if (interfaceC7190 instanceof InterfaceC7119) {
            return ((InterfaceC7119) interfaceC7190).mo12378();
        }
        HashSet hashSet = new HashSet(interfaceC7190.mo12353());
        int iMo12353 = interfaceC7190.mo12353();
        for (int i = 0; i < iMo12353; i++) {
            hashSet.add(interfaceC7190.mo12352(i));
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7087 m12389(String str, InterfaceC7183 interfaceC7183) {
        return new C7087(str, new C7086(interfaceC7183));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final String m12390(InterfaceC5092 interfaceC5092) {
        interfaceC5092.getClass();
        String simpleName = interfaceC5092.getSimpleName();
        if (simpleName == null) {
            simpleName = "<local class name not available>";
        }
        return AbstractC0053.m156("Serializer for class '", simpleName, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final InterfaceC5092 m12391(InterfaceC5086 interfaceC5086) {
        InterfaceC5091 interfaceC5091Mo8909 = interfaceC5086.mo8909();
        if (interfaceC5091Mo8909 instanceof InterfaceC5092) {
            return (InterfaceC5092) interfaceC5091Mo8909;
        }
        if (!(interfaceC5091Mo8909 instanceof AbstractC4393)) {
            C4210.m8614(interfaceC5091Mo8909, "Only KClass supported as classifier, got ");
            return null;
        }
        throw new IllegalArgumentException("Captured type parameter " + interfaceC5091Mo8909 + " from generic non-reified function. Such functionality cannot be supported because " + interfaceC5091Mo8909 + " is erased, either specify serializer explicitly or make calling function inline with reified " + interfaceC5091Mo8909 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final String m12392(InterfaceC7190 interfaceC7190) {
        return AbstractC4343.m8813(AbstractC6087.m11422(0, interfaceC7190.mo12353()), ", ", interfaceC7190.mo12355() + '(', ")", new C6051(interfaceC7190, 2), 24);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final void m12393(int i, int i2, InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(interfaceC7190.mo12352(i4));
            }
            i3 >>>= 1;
        }
        throw new MissingFieldException(arrayList, interfaceC7190.mo12355());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final void m12394(String str, InterfaceC5092 interfaceC5092) {
        String string;
        interfaceC5092.getClass();
        String str2 = "in the polymorphic scope of '" + interfaceC5092.getSimpleName() + '\'';
        if (str == null) {
            string = AbstractC6136.m11558(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder sbM11551 = AbstractC6136.m11551("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            AbstractC6136.m11530(sbM11551, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbM11551.append(interfaceC5092.getSimpleName());
            sbM11551.append("' has to be sealed and '@Serializable'.");
            string = sbM11551.toString();
        }
        throw new SerializationException(string);
    }
}
