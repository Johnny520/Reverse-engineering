package io.ktor.util.pipeline;

import com.bumptech.glide.AbstractC3054;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AbstractC4387;
import p052.InterfaceC6550;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: io.ktor.util.pipeline.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4200 extends AbstractC4193 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC4356[] f12679;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Object f12680;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f12681;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f12682;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final List f12683;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C4199 f12684;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4200(Object obj, Object obj2, List list) {
        super(obj2);
        obj.getClass();
        obj2.getClass();
        this.f12683 = list;
        this.f12684 = new C4199(this);
        this.f12680 = obj;
        this.f12679 = new InterfaceC4356[list.size()];
        this.f12681 = -1;
    }

    @Override // kotlinx.coroutines.InterfaceC5400
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final InterfaceC4359 mo2420() {
        return this.f12684.getContext();
    }

    @Override // io.ktor.util.pipeline.AbstractC4193
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Object mo8576(InterfaceC4356 interfaceC4356) {
        Object obj;
        if (this.f12682 == this.f12683.size()) {
            obj = this.f12680;
        } else {
            InterfaceC4356 interfaceC4356M6602 = AbstractC3054.m6602(interfaceC4356);
            int i = this.f12681 + 1;
            this.f12681 = i;
            InterfaceC4356[] interfaceC4356Arr = this.f12679;
            interfaceC4356Arr[i] = interfaceC4356M6602;
            if (m8595(true)) {
                int i2 = this.f12681;
                if (i2 < 0) {
                    C5919.m11250("No more continuations to resume");
                    return null;
                }
                this.f12681 = i2 - 1;
                interfaceC4356Arr[i2] = null;
                obj = this.f12680;
            } else {
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
            }
        }
        if (obj == CoroutineSingletons.COROUTINE_SUSPENDED) {
            interfaceC4356.getClass();
        }
        return obj;
    }

    @Override // io.ktor.util.pipeline.AbstractC4193
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo8577() {
        return this.f12680;
    }

    @Override // io.ktor.util.pipeline.AbstractC4193
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo8578() {
        this.f12682 = this.f12683.size();
    }

    @Override // io.ktor.util.pipeline.AbstractC4193
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo8579(Object obj, InterfaceC4356 interfaceC4356) {
        this.f12682 = 0;
        if (this.f12683.size() == 0) {
            return obj;
        }
        mo8581(obj);
        if (this.f12681 < 0) {
            return mo8576(interfaceC4356);
        }
        C5919.m11250("Already started");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m8594(Object obj) {
        int i = this.f12681;
        if (i < 0) {
            C5919.m11250("No more continuations to resume");
            return;
        }
        InterfaceC4356[] interfaceC4356Arr = this.f12679;
        InterfaceC4356 interfaceC4356 = interfaceC4356Arr[i];
        interfaceC4356.getClass();
        int i2 = this.f12681;
        this.f12681 = i2 - 1;
        interfaceC4356Arr[i2] = null;
        if (!Result.m8761isFailureimpl(obj)) {
            interfaceC4356.resumeWith(obj);
            return;
        }
        Throwable thM8758exceptionOrNullimpl = Result.m8758exceptionOrNullimpl(obj);
        thM8758exceptionOrNullimpl.getClass();
        try {
            thM8758exceptionOrNullimpl.getCause();
        } catch (Throwable unused) {
        }
        interfaceC4356.resumeWith(Result.m8755constructorimpl(new Result.Failure(thM8758exceptionOrNullimpl)));
    }

    @Override // io.ktor.util.pipeline.AbstractC4193
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final Object mo8580(Object obj, InterfaceC4356 interfaceC4356) {
        mo8581(obj);
        return mo8576(interfaceC4356);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean m8595(boolean z) {
        InterfaceC6550 interfaceC6550;
        Object obj;
        C4199 c4199;
        do {
            int i = this.f12682;
            List list = this.f12683;
            if (i == list.size()) {
                if (z) {
                    return true;
                }
                m8594(Result.m8755constructorimpl(this.f12680));
                return false;
            }
            this.f12682 = i + 1;
            interfaceC6550 = (InterfaceC6550) list.get(i);
            try {
                obj = this.f12680;
                c4199 = this.f12684;
                interfaceC6550.getClass();
                obj.getClass();
                c4199.getClass();
                AbstractC4387.m8898(3, interfaceC6550);
            } catch (Throwable th) {
                m8594(Result.m8755constructorimpl(new Result.Failure(th)));
                return false;
            }
        } while (interfaceC6550.invoke(this, obj, c4199) != CoroutineSingletons.COROUTINE_SUSPENDED);
        return false;
    }

    @Override // io.ktor.util.pipeline.AbstractC4193
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo8581(Object obj) {
        obj.getClass();
        this.f12680 = obj;
    }
}
