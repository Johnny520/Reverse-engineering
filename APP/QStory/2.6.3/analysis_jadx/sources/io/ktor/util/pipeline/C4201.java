package io.ktor.util.pipeline;

import androidx.window.area.AbstractC2567;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AbstractC4388;
import p052.InterfaceC6551;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: io.ktor.util.pipeline.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4201 extends AbstractC4194 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC4357[] f12683;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Object f12684;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f12685;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f12686;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final List f12687;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C4200 f12688;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4201(Object obj, Object obj2, List list) {
        super(obj2);
        obj.getClass();
        obj2.getClass();
        this.f12687 = list;
        this.f12688 = new C4200(this);
        this.f12684 = obj;
        this.f12683 = new InterfaceC4357[list.size()];
        this.f12685 = -1;
    }

    @Override // kotlinx.coroutines.InterfaceC5401
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC4360 mo2430() {
        return this.f12688.getContext();
    }

    @Override // io.ktor.util.pipeline.AbstractC4194
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Object mo8566(InterfaceC4357 interfaceC4357) {
        Object obj;
        if (this.f12686 == this.f12687.size()) {
            obj = this.f12684;
        } else {
            InterfaceC4357 interfaceC4357M5064 = AbstractC2567.m5064(interfaceC4357);
            int i = this.f12685 + 1;
            this.f12685 = i;
            InterfaceC4357[] interfaceC4357Arr = this.f12683;
            interfaceC4357Arr[i] = interfaceC4357M5064;
            if (m8585(true)) {
                int i2 = this.f12685;
                if (i2 < 0) {
                    C5925.m11311("No more continuations to resume");
                    return null;
                }
                this.f12685 = i2 - 1;
                interfaceC4357Arr[i2] = null;
                obj = this.f12684;
            } else {
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
            }
        }
        if (obj == CoroutineSingletons.COROUTINE_SUSPENDED) {
            interfaceC4357.getClass();
        }
        return obj;
    }

    @Override // io.ktor.util.pipeline.AbstractC4194
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo8567() {
        return this.f12684;
    }

    @Override // io.ktor.util.pipeline.AbstractC4194
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo8568() {
        this.f12686 = this.f12687.size();
    }

    @Override // io.ktor.util.pipeline.AbstractC4194
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo8569(Object obj, InterfaceC4357 interfaceC4357) {
        this.f12686 = 0;
        if (this.f12687.size() == 0) {
            return obj;
        }
        mo8571(obj);
        if (this.f12685 < 0) {
            return mo8566(interfaceC4357);
        }
        C5925.m11311("Already started");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m8584(Object obj) {
        int i = this.f12685;
        if (i < 0) {
            C5925.m11311("No more continuations to resume");
            return;
        }
        InterfaceC4357[] interfaceC4357Arr = this.f12683;
        InterfaceC4357 interfaceC4357 = interfaceC4357Arr[i];
        interfaceC4357.getClass();
        int i2 = this.f12685;
        this.f12685 = i2 - 1;
        interfaceC4357Arr[i2] = null;
        if (!Result.m8751isFailureimpl(obj)) {
            interfaceC4357.resumeWith(obj);
            return;
        }
        Throwable thM8748exceptionOrNullimpl = Result.m8748exceptionOrNullimpl(obj);
        thM8748exceptionOrNullimpl.getClass();
        try {
            thM8748exceptionOrNullimpl.getCause();
        } catch (Throwable unused) {
        }
        interfaceC4357.resumeWith(Result.m8745constructorimpl(new Result.Failure(thM8748exceptionOrNullimpl)));
    }

    @Override // io.ktor.util.pipeline.AbstractC4194
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final Object mo8570(Object obj, InterfaceC4357 interfaceC4357) {
        mo8571(obj);
        return mo8566(interfaceC4357);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean m8585(boolean z) {
        InterfaceC6551 interfaceC6551;
        Object obj;
        C4200 c4200;
        do {
            int i = this.f12686;
            List list = this.f12687;
            if (i == list.size()) {
                if (z) {
                    return true;
                }
                m8584(Result.m8745constructorimpl(this.f12684));
                return false;
            }
            this.f12686 = i + 1;
            interfaceC6551 = (InterfaceC6551) list.get(i);
            try {
                obj = this.f12684;
                c4200 = this.f12688;
                interfaceC6551.getClass();
                obj.getClass();
                c4200.getClass();
                AbstractC4388.m8888(3, interfaceC6551);
            } catch (Throwable th) {
                m8584(Result.m8745constructorimpl(new Result.Failure(th)));
                return false;
            }
        } while (interfaceC6551.invoke(this, obj, c4200) != CoroutineSingletons.COROUTINE_SUSPENDED);
        return false;
    }

    @Override // io.ktor.util.pipeline.AbstractC4194
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo8571(Object obj) {
        obj.getClass();
        this.f12684 = obj;
    }
}
