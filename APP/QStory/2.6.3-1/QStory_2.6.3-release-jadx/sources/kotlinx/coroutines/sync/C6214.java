package kotlinx.coroutines.sync;

import androidx.compose.foundation.C1905;
import androidx.compose.foundation.C1931;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5192;
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import kotlinx.coroutines.C6276;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.InterfaceC6244;
import kotlinx.coroutines.InterfaceC6279;
import kotlinx.coroutines.internal.AbstractC6193;
import p068.InterfaceC7380;

/* JADX INFO: renamed from: kotlinx.coroutines.sync.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6214 implements InterfaceC6279, InterfaceC6244 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C6212 f15341;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C6276 f15342;

    public C6214(C6212 c6212, C6276 c6276) {
        this.f15341 = c6212;
        this.f15342 = c6276;
    }

    @Override // kotlin.coroutines.InterfaceC5189
    public final InterfaceC5192 getContext() {
        return this.f15342.f15440;
    }

    @Override // kotlin.coroutines.InterfaceC5189
    public final void resumeWith(Object obj) {
        this.f15342.resumeWith(obj);
    }

    @Override // kotlinx.coroutines.InterfaceC6279
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void mo10992(Object obj) throws DispatchException {
        this.f15342.mo10992(obj);
    }

    @Override // kotlinx.coroutines.InterfaceC6279
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo10993(Object obj, InterfaceC7380 interfaceC7380) throws DispatchException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C6212.f15336;
        C6212 c6212 = this.f15341;
        atomicReferenceFieldUpdater.set(c6212, null);
        C1905 c1905 = new C1905(c6212, 24, this);
        C6276 c6276 = this.f15342;
        c6276.m11097(C6008.f15084, c6276.f15376, new C1931(c1905, 1));
    }

    @Override // kotlinx.coroutines.InterfaceC6244
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo10822(AbstractC6193 abstractC6193, int i) {
        this.f15342.mo10822(abstractC6193, i);
    }

    @Override // kotlinx.coroutines.InterfaceC6279
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo10994(Throwable th) {
        return this.f15342.mo10994(th);
    }

    @Override // kotlinx.coroutines.InterfaceC6279
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5317 mo10995(Object obj, InterfaceC7380 interfaceC7380) {
        C6212 c6212 = this.f15341;
        C1931 c1931 = new C1931(c6212, 2, this);
        C5317 c5317M11095 = this.f15342.m11095((C6008) obj, c1931);
        if (c5317M11095 != null) {
            C6212.f15336.set(c6212, null);
        }
        return c5317M11095;
    }
}
