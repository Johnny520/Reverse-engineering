package kotlin.sequences;

import bsh.C3466;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p070.InterfaceC7396;

/* JADX INFO: renamed from: kotlin.sequences.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C5960 extends AbstractC5957 implements Iterator, InterfaceC5189, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public InterfaceC5189 f15013;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f15014;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Iterator f15015;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f15016;

    @Override // kotlin.coroutines.InterfaceC5189
    public final InterfaceC5192 getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f15016;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw m10681();
                }
                Iterator it = this.f15015;
                it.getClass();
                if (it.hasNext()) {
                    this.f15016 = 2;
                    return true;
                }
                this.f15015 = null;
            }
            this.f15016 = 5;
            InterfaceC5189 interfaceC5189 = this.f15013;
            interfaceC5189.getClass();
            this.f15013 = null;
            interfaceC5189.resumeWith(Result.m9304constructorimpl(C6008.f15084));
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f15016;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            C3466.m5896();
            return null;
        }
        if (i == 2) {
            this.f15016 = 1;
            Iterator it = this.f15015;
            it.getClass();
            return it.next();
        }
        if (i != 3) {
            throw m10681();
        }
        this.f15016 = 0;
        Object obj = this.f15014;
        this.f15014 = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.coroutines.InterfaceC5189
    public final void resumeWith(Object obj) {
        AbstractC6017.m10769(obj);
        this.f15016 = 4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final RuntimeException m10681() {
        int i = this.f15016;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f15016);
    }

    @Override // kotlin.sequences.AbstractC5957
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Object mo10679(Iterator it, RestrictedSuspendLambda restrictedSuspendLambda) {
        if (!it.hasNext()) {
            return C6008.f15084;
        }
        this.f15015 = it;
        this.f15016 = 2;
        this.f15013 = restrictedSuspendLambda;
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @Override // kotlin.sequences.AbstractC5957
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final CoroutineSingletons mo10680(Object obj, InterfaceC5189 interfaceC5189) {
        this.f15014 = obj;
        this.f15016 = 3;
        this.f15013 = interfaceC5189;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        interfaceC5189.getClass();
        return coroutineSingletons;
    }
}
