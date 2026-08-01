package p083;

import androidx.compose.animation.core.C0325;
import androidx.compose.foundation.text.C1012;
import io.ktor.util.C4207;
import java.util.Iterator;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4347;
import kotlin.collections.C4346;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4430;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.storage.C4848;
import kotlin.sequences.AbstractC5122;
import kotlin.sequences.C5115;
import kotlin.sequences.C5116;
import kotlin.sequences.C5121;
import kotlin.sequences.InterfaceC5127;
import p046.InterfaceC6478;
import p046.InterfaceC6481;
import p049.AbstractC6527;
import p081.InterfaceC7028;
import p084.AbstractC7045;
import p253.AbstractC8190;

/* JADX INFO: renamed from: 飘花落叶言世楪苏哲兰子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7039 implements InterfaceC6481 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C4848 f18883;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC7028 f18884;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f18885;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0325 f18886;

    public C7039(C0325 c0325, InterfaceC7028 interfaceC7028, boolean z) {
        c0325.getClass();
        interfaceC7028.getClass();
        this.f18886 = c0325;
        this.f18884 = interfaceC7028;
        this.f18885 = z;
        this.f18883 = ((C7041) c0325.f1095).f18894.m9578(new C1012(this, 27));
    }

    @Override // p046.InterfaceC6481
    public final boolean isEmpty() {
        return this.f18884.getAnnotations().isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        InterfaceC7028 interfaceC7028 = this.f18884;
        C5121 c5121M10111 = AbstractC5122.m10111(AbstractC4344.m8803(interfaceC7028.getAnnotations()), this.f18883);
        C4691 c4691 = AbstractC7045.f18920;
        return new C5116(new C5115(AbstractC5122.m10116(AbstractC4347.m8838(new InterfaceC5127[]{c5121M10111, new C4346(AbstractC7045.m12376(AbstractC6527.f17893, interfaceC7028, this.f18886), 4)})), false, new C4207(6)));
    }

    @Override // p046.InterfaceC6481
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final InterfaceC6478 mo9517(C4687 c4687) {
        InterfaceC6478 interfaceC6478;
        c4687.getClass();
        InterfaceC7028 interfaceC7028 = this.f18884;
        C4430 c4430Mo8972 = interfaceC7028.mo8972(c4687);
        if (c4430Mo8972 != null && (interfaceC6478 = (InterfaceC6478) this.f18883.invoke(c4430Mo8972)) != null) {
            return interfaceC6478;
        }
        C4691 c4691 = AbstractC7045.f18920;
        return AbstractC7045.m12376(c4687, interfaceC7028, this.f18886);
    }

    @Override // p046.InterfaceC6481
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final /* bridge */ boolean mo9518(C4687 c4687) {
        return AbstractC8190.m13700(this, c4687);
    }
}
