package p083;

import androidx.compose.animation.core.C0325;
import androidx.compose.foundation.text.C1012;
import io.ktor.client.plugins.AbstractC3932;
import io.ktor.util.C4206;
import java.util.Iterator;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4346;
import kotlin.collections.C4345;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4429;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.storage.C4847;
import kotlin.sequences.AbstractC5121;
import kotlin.sequences.C5114;
import kotlin.sequences.C5115;
import kotlin.sequences.C5120;
import kotlin.sequences.InterfaceC5126;
import p046.InterfaceC6477;
import p046.InterfaceC6480;
import p049.AbstractC6526;
import p081.InterfaceC7027;
import p084.AbstractC7044;

/* JADX INFO: renamed from: 飘花落叶言世楪苏哲兰子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7038 implements InterfaceC6480 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C4847 f18888;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC7027 f18889;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f18890;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0325 f18891;

    public C7038(C0325 c0325, InterfaceC7027 interfaceC7027, boolean z) {
        c0325.getClass();
        interfaceC7027.getClass();
        this.f18891 = c0325;
        this.f18889 = interfaceC7027;
        this.f18890 = z;
        this.f18888 = ((C7040) c0325.f1095).f18899.m9588(new C1012(this, 27));
    }

    @Override // p046.InterfaceC6480
    public final boolean isEmpty() {
        return this.f18889.getAnnotations().isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        InterfaceC7027 interfaceC7027 = this.f18889;
        C5120 c5120M10111 = AbstractC5121.m10111(AbstractC4343.m8790(interfaceC7027.getAnnotations()), this.f18888);
        C4690 c4690 = AbstractC7044.f18925;
        return new C5115(new C5114(AbstractC5121.m10108(AbstractC4346.m8841(new InterfaceC5126[]{c5120M10111, new C4345(AbstractC7044.m12349(AbstractC6526.f17897, interfaceC7027, this.f18891), 4)})), false, new C4206(6)));
    }

    @Override // p046.InterfaceC6480
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final InterfaceC6477 mo9527(C4686 c4686) {
        InterfaceC6477 interfaceC6477;
        c4686.getClass();
        InterfaceC7027 interfaceC7027 = this.f18889;
        C4429 c4429Mo8982 = interfaceC7027.mo8982(c4686);
        if (c4429Mo8982 != null && (interfaceC6477 = (InterfaceC6477) this.f18888.invoke(c4429Mo8982)) != null) {
            return interfaceC6477;
        }
        C4690 c4690 = AbstractC7044.f18925;
        return AbstractC7044.m12349(c4686, interfaceC7027, this.f18891);
    }

    @Override // p046.InterfaceC6480
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final /* bridge */ boolean mo9528(C4686 c4686) {
        return AbstractC3932.m8314(this, c4686);
    }
}
