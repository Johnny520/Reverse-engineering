package p088;

import androidx.appcompat.app.C0107;
import androidx.appcompat.widget.C0191;
import androidx.compose.foundation.C1067;
import androidx.compose.runtime.internal.C1245;
import androidx.core.view.C2242;
import io.ktor.util.C4211;
import kotlin.collections.C4351;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.internal.AbstractC5507;
import kotlinx.serialization.json.internal.C5489;
import kotlinx.serialization.json.internal.C5498;
import kotlinx.serialization.json.internal.C5499;
import kotlinx.serialization.json.internal.C5500;
import kotlinx.serialization.json.internal.C5503;
import kotlinx.serialization.json.internal.C5504;
import kotlinx.serialization.json.internal.WriteMode;
import kotlinx.serialization.modules.AbstractC5511;
import p089.InterfaceC7184;
import p090.InterfaceC7187;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲楪子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7159 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7160 f19125 = new C7160(new C7177(false, false, false, false, true, "    ", "type", true, ClassDiscriminatorMode.POLYMORPHIC, true), AbstractC5511.f15237);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2242 f19126 = new C2242((byte) 0, 26);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1245 f19127;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7177 f19128;

    public AbstractC7159(C7177 c7177, C1245 c1245) {
        this.f19128 = c7177;
        this.f19127 = c1245;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String m12424(InterfaceC7184 interfaceC7184, Object obj) {
        char[] cArr;
        interfaceC7184.getClass();
        C0107 c0107 = new C0107((byte) 0, 6);
        C5489 c5489 = C5489.f15169;
        synchronized (c5489) {
            C4351 c4351 = c5489.f15171;
            cArr = null;
            char[] cArr2 = (char[]) (c4351.isEmpty() ? null : c4351.removeLast());
            if (cArr2 != null) {
                c5489.f15170 -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        c0107.f315 = cArr;
        try {
            AbstractC5507.m10757(this, c0107, interfaceC7184, obj);
            return c0107.toString();
        } finally {
            c0107.m348();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC7176 m12425(InterfaceC7184 interfaceC7184, Object obj) {
        interfaceC7184.getClass();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        new C5499(this, new C1067(ref$ObjectRef, 26), 1).mo10705(interfaceC7184, obj);
        T t = ref$ObjectRef.element;
        if (t != 0) {
            return (AbstractC7176) t;
        }
        AbstractC4395.m8908("result");
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m12426(String str, InterfaceC7184 interfaceC7184) {
        interfaceC7184.getClass();
        str.getClass();
        C0191 c0191M10742 = AbstractC5507.m10742(this, str);
        Object objMo10657 = new C5498(this, WriteMode.OBJ, c0191M10742, interfaceC7184.getDescriptor(), null).mo10657(interfaceC7184);
        if (c0191M10742.m691() == 10) {
            return objMo10657;
        }
        C0191.m652(c0191M10742, "Expected EOF after parsing, but had " + ((String) c0191M10742.f752).charAt(c0191M10742.f750 - 1) + " instead", 0, null, 6);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m12427(InterfaceC7184 interfaceC7184, AbstractC7176 abstractC7176) {
        InterfaceC7187 c5500;
        interfaceC7184.getClass();
        abstractC7176.getClass();
        String str = null;
        if (abstractC7176 instanceof C7152) {
            c5500 = new C5503(this, (C7152) abstractC7176, str, 12);
        } else if (abstractC7176 instanceof C7157) {
            c5500 = new C5504(this, (C7157) abstractC7176);
        } else {
            if (!(abstractC7176 instanceof C7161) && !abstractC7176.equals(C7163.INSTANCE)) {
                C4211.m8611();
                return null;
            }
            c5500 = new C5500(this, (AbstractC7148) abstractC7176, null);
        }
        return c5500.mo10657(interfaceC7184);
    }
}
