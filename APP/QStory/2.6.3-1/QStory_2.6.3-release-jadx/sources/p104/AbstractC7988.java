package p104;

import androidx.appcompat.app.C0954;
import androidx.appcompat.widget.C1038;
import androidx.compose.foundation.C1905;
import androidx.compose.runtime.internal.C2080;
import androidx.core.view.C3075;
import io.ktor.util.C5043;
import kotlin.collections.C5183;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.internal.AbstractC6339;
import kotlinx.serialization.json.internal.C6321;
import kotlinx.serialization.json.internal.C6330;
import kotlinx.serialization.json.internal.C6331;
import kotlinx.serialization.json.internal.C6332;
import kotlinx.serialization.json.internal.C6335;
import kotlinx.serialization.json.internal.C6336;
import kotlinx.serialization.json.internal.WriteMode;
import kotlinx.serialization.modules.AbstractC6343;
import p105.InterfaceC8013;
import p106.InterfaceC8016;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲楪子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7988 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7989 f19470 = new C7989(new C8006(false, false, false, false, true, "    ", "type", true, ClassDiscriminatorMode.POLYMORPHIC, true), AbstractC6343.f15582);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C3075 f19471 = new C3075((byte) 0, 26);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2080 f19472;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8006 f19473;

    public AbstractC7988(C8006 c8006, C2080 c2080) {
        this.f19473 = c8006;
        this.f19472 = c2080;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String m12983(InterfaceC8013 interfaceC8013, Object obj) {
        char[] cArr;
        interfaceC8013.getClass();
        C0954 c0954 = new C0954((byte) 0, 6);
        C6321 c6321 = C6321.f15514;
        synchronized (c6321) {
            C5183 c5183 = c6321.f15516;
            cArr = null;
            char[] cArr2 = (char[]) (c5183.isEmpty() ? null : c5183.removeLast());
            if (cArr2 != null) {
                c6321.f15515 -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        c0954.f660 = cArr;
        try {
            AbstractC6339.m11316(this, c0954, interfaceC8013, obj);
            return c0954.toString();
        } finally {
            c0954.m908();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC8005 m12984(InterfaceC8013 interfaceC8013, Object obj) {
        interfaceC8013.getClass();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        new C6331(this, new C1905(ref$ObjectRef, 26), 1).mo11264(interfaceC8013, obj);
        T t = ref$ObjectRef.element;
        if (t != 0) {
            return (AbstractC8005) t;
        }
        AbstractC5227.m9467("result");
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m12985(String str, InterfaceC8013 interfaceC8013) {
        interfaceC8013.getClass();
        str.getClass();
        C1038 c1038M11301 = AbstractC6339.m11301(this, str);
        Object objMo11216 = new C6330(this, WriteMode.OBJ, c1038M11301, interfaceC8013.getDescriptor(), null).mo11216(interfaceC8013);
        if (c1038M11301.m1251() == 10) {
            return objMo11216;
        }
        C1038.m1212(c1038M11301, "Expected EOF after parsing, but had " + ((String) c1038M11301.f1097).charAt(c1038M11301.f1095 - 1) + " instead", 0, null, 6);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m12986(InterfaceC8013 interfaceC8013, AbstractC8005 abstractC8005) {
        InterfaceC8016 c6332;
        interfaceC8013.getClass();
        abstractC8005.getClass();
        String str = null;
        if (abstractC8005 instanceof C7981) {
            c6332 = new C6335(this, (C7981) abstractC8005, str, 12);
        } else if (abstractC8005 instanceof C7986) {
            c6332 = new C6336(this, (C7986) abstractC8005);
        } else {
            if (!(abstractC8005 instanceof C7990) && !abstractC8005.equals(C7992.INSTANCE)) {
                C5043.m9170();
                return null;
            }
            c6332 = new C6332(this, (AbstractC7977) abstractC8005, null);
        }
        return c6332.mo11216(interfaceC8013);
    }
}
