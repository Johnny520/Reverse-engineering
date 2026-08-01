package p099;

import androidx.compose.animation.core.C1171;
import androidx.compose.foundation.text.C1850;
import io.ktor.util.C5039;
import java.util.Iterator;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5179;
import kotlin.collections.C5178;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5262;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.storage.C5680;
import kotlin.sequences.AbstractC5954;
import kotlin.sequences.C5947;
import kotlin.sequences.C5948;
import kotlin.sequences.C5953;
import kotlin.sequences.InterfaceC5959;
import p062.InterfaceC7307;
import p062.InterfaceC7310;
import p065.AbstractC7356;
import p097.InterfaceC7857;
import p100.AbstractC7874;
import p269.AbstractC9019;

/* JADX INFO: renamed from: 飘花落叶言世楪苏哲兰子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7868 implements InterfaceC7310 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C5680 f19228;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC7857 f19229;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f19230;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1171 f19231;

    public C7868(C1171 c1171, InterfaceC7857 interfaceC7857, boolean z) {
        c1171.getClass();
        interfaceC7857.getClass();
        this.f19231 = c1171;
        this.f19229 = interfaceC7857;
        this.f19230 = z;
        this.f19228 = ((C7870) c1171.f1440).f19239.m10137(new C1850(this, 27));
    }

    @Override // p062.InterfaceC7310
    public final boolean isEmpty() {
        return this.f19229.getAnnotations().isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        InterfaceC7857 interfaceC7857 = this.f19229;
        C5953 c5953M10670 = AbstractC5954.m10670(AbstractC5176.m9362(interfaceC7857.getAnnotations()), this.f19228);
        C5523 c5523 = AbstractC7874.f19265;
        return new C5948(new C5947(AbstractC5954.m10675(AbstractC5179.m9397(new InterfaceC5959[]{c5953M10670, new C5178(AbstractC7874.m12935(AbstractC7356.f18238, interfaceC7857, this.f19231), 4)})), false, new C5039(6)));
    }

    @Override // p062.InterfaceC7310
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final InterfaceC7307 mo10076(C5519 c5519) {
        InterfaceC7307 interfaceC7307;
        c5519.getClass();
        InterfaceC7857 interfaceC7857 = this.f19229;
        C5262 c5262Mo9531 = interfaceC7857.mo9531(c5519);
        if (c5262Mo9531 != null && (interfaceC7307 = (InterfaceC7307) this.f19228.invoke(c5262Mo9531)) != null) {
            return interfaceC7307;
        }
        C5523 c5523 = AbstractC7874.f19265;
        return AbstractC7874.m12935(c5519, interfaceC7857, this.f19231);
    }

    @Override // p062.InterfaceC7310
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final /* bridge */ boolean mo10077(C5519 c5519) {
        return AbstractC9019.m14259(this, c5519);
    }
}
