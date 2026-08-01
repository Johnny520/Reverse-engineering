package kotlin.sequences;

import bsh.C2632;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p054.InterfaceC6566;

/* JADX INFO: renamed from: kotlin.sequences.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C5127 extends AbstractC5124 implements Iterator, InterfaceC4356, InterfaceC6566 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public InterfaceC4356 f14668;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f14669;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Iterator f14670;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f14671;

    @Override // kotlin.coroutines.InterfaceC4356
    public final InterfaceC4359 getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f14671;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw m10118();
                }
                Iterator it = this.f14670;
                it.getClass();
                if (it.hasNext()) {
                    this.f14671 = 2;
                    return true;
                }
                this.f14670 = null;
            }
            this.f14671 = 5;
            InterfaceC4356 interfaceC4356 = this.f14668;
            interfaceC4356.getClass();
            this.f14668 = null;
            interfaceC4356.resumeWith(Result.m8755constructorimpl(C5175.f14739));
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f14671;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            C2632.m5291();
            return null;
        }
        if (i == 2) {
            this.f14671 = 1;
            Iterator it = this.f14670;
            it.getClass();
            return it.next();
        }
        if (i != 3) {
            throw m10118();
        }
        this.f14671 = 0;
        Object obj = this.f14669;
        this.f14669 = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.coroutines.InterfaceC4356
    public final void resumeWith(Object obj) {
        AbstractC5184.m10206(obj);
        this.f14671 = 4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final RuntimeException m10118() {
        int i = this.f14671;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f14671);
    }

    @Override // kotlin.sequences.AbstractC5124
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Object mo10116(Iterator it, RestrictedSuspendLambda restrictedSuspendLambda) {
        if (!it.hasNext()) {
            return C5175.f14739;
        }
        this.f14670 = it;
        this.f14671 = 2;
        this.f14668 = restrictedSuspendLambda;
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @Override // kotlin.sequences.AbstractC5124
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final CoroutineSingletons mo10117(Object obj, InterfaceC4356 interfaceC4356) {
        this.f14669 = obj;
        this.f14671 = 3;
        this.f14668 = interfaceC4356;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        interfaceC4356.getClass();
        return coroutineSingletons;
    }
}
