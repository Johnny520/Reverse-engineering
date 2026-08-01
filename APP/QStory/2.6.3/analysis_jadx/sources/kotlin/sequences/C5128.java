package kotlin.sequences;

import bsh.C2633;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p054.InterfaceC6567;

/* JADX INFO: renamed from: kotlin.sequences.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C5128 extends AbstractC5125 implements Iterator, InterfaceC4357, InterfaceC6567 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public InterfaceC4357 f14668;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f14669;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Iterator f14670;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f14671;

    @Override // kotlin.coroutines.InterfaceC4357
    public final InterfaceC4360 getContext() {
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
                    throw m10122();
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
            InterfaceC4357 interfaceC4357 = this.f14668;
            interfaceC4357.getClass();
            this.f14668 = null;
            interfaceC4357.resumeWith(Result.m8745constructorimpl(C5176.f14739));
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f14671;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            C2633.m5336();
            return null;
        }
        if (i == 2) {
            this.f14671 = 1;
            Iterator it = this.f14670;
            it.getClass();
            return it.next();
        }
        if (i != 3) {
            throw m10122();
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

    @Override // kotlin.coroutines.InterfaceC4357
    public final void resumeWith(Object obj) {
        AbstractC5185.m10210(obj);
        this.f14671 = 4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final RuntimeException m10122() {
        int i = this.f14671;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f14671);
    }

    @Override // kotlin.sequences.AbstractC5125
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Object mo10120(Iterator it, RestrictedSuspendLambda restrictedSuspendLambda) {
        if (!it.hasNext()) {
            return C5176.f14739;
        }
        this.f14670 = it;
        this.f14671 = 2;
        this.f14668 = restrictedSuspendLambda;
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @Override // kotlin.sequences.AbstractC5125
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final CoroutineSingletons mo10121(Object obj, InterfaceC4357 interfaceC4357) {
        this.f14669 = obj;
        this.f14671 = 3;
        this.f14668 = interfaceC4357;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        interfaceC4357.getClass();
        return coroutineSingletons;
    }
}
