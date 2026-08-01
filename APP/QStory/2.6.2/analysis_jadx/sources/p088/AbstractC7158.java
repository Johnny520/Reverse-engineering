package p088;

import androidx.appcompat.app.C0107;
import androidx.appcompat.widget.C0191;
import androidx.compose.foundation.C1067;
import androidx.compose.runtime.internal.C1245;
import androidx.core.view.C2242;
import io.ktor.util.C4210;
import kotlin.collections.C4350;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.internal.AbstractC5506;
import kotlinx.serialization.json.internal.C5488;
import kotlinx.serialization.json.internal.C5497;
import kotlinx.serialization.json.internal.C5498;
import kotlinx.serialization.json.internal.C5499;
import kotlinx.serialization.json.internal.C5502;
import kotlinx.serialization.json.internal.C5503;
import kotlinx.serialization.json.internal.WriteMode;
import kotlinx.serialization.modules.AbstractC5510;
import p089.InterfaceC7183;
import p090.InterfaceC7186;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲楪子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7158 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7159 f19130 = new C7159(new C7176(false, false, false, false, true, "    ", "type", true, ClassDiscriminatorMode.POLYMORPHIC, true), AbstractC5510.f15237);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2242 f19131 = new C2242((byte) 0, 26);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1245 f19132;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7176 f19133;

    public AbstractC7158(C7176 c7176, C1245 c1245) {
        this.f19133 = c7176;
        this.f19132 = c1245;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String m12397(InterfaceC7183 interfaceC7183, Object obj) {
        char[] cArr;
        interfaceC7183.getClass();
        C0107 c0107 = new C0107((byte) 0, 6);
        C5488 c5488 = C5488.f15169;
        synchronized (c5488) {
            C4350 c4350 = c5488.f15171;
            cArr = null;
            char[] cArr2 = (char[]) (c4350.isEmpty() ? null : c4350.removeLast());
            if (cArr2 != null) {
                c5488.f15170 -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        c0107.f315 = cArr;
        try {
            AbstractC5506.m10700(this, c0107, interfaceC7183, obj);
            return c0107.toString();
        } finally {
            c0107.m347();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC7175 m12398(InterfaceC7183 interfaceC7183, Object obj) {
        interfaceC7183.getClass();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        new C5498(this, new C1067(ref$ObjectRef, 26), 1).mo10670(interfaceC7183, obj);
        T t = ref$ObjectRef.element;
        if (t != 0) {
            return (AbstractC7175) t;
        }
        AbstractC4394.m8918("result");
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m12399(String str, InterfaceC7183 interfaceC7183) {
        interfaceC7183.getClass();
        str.getClass();
        C0191 c0191M10685 = AbstractC5506.m10685(this, str);
        Object objMo10644 = new C5497(this, WriteMode.OBJ, c0191M10685, interfaceC7183.getDescriptor(), null).mo10644(interfaceC7183);
        if (c0191M10685.m690() == 10) {
            return objMo10644;
        }
        C0191.m651(c0191M10685, "Expected EOF after parsing, but had " + ((String) c0191M10685.f752).charAt(c0191M10685.f750 - 1) + " instead", 0, null, 6);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m12400(InterfaceC7183 interfaceC7183, AbstractC7175 abstractC7175) {
        InterfaceC7186 c5499;
        interfaceC7183.getClass();
        abstractC7175.getClass();
        String str = null;
        if (abstractC7175 instanceof C7151) {
            c5499 = new C5502(this, (C7151) abstractC7175, str, 12);
        } else if (abstractC7175 instanceof C7156) {
            c5499 = new C5503(this, (C7156) abstractC7175);
        } else {
            if (!(abstractC7175 instanceof C7160) && !abstractC7175.equals(C7162.INSTANCE)) {
                C4210.m8621();
                return null;
            }
            c5499 = new C5499(this, (AbstractC7147) abstractC7175, null);
        }
        return c5499.mo10644(interfaceC7183);
    }
}
