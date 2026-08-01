package io.ktor.util.pipeline;

import androidx.window.area.AbstractC3400;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AbstractC5220;
import p068.InterfaceC7380;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.util.pipeline.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5033 extends AbstractC5026 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC5189[] f13028;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Object f13029;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f13030;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f13031;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final List f13032;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C5032 f13033;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5033(Object obj, Object obj2, List list) {
        super(obj2);
        obj.getClass();
        obj2.getClass();
        this.f13032 = list;
        this.f13033 = new C5032(this);
        this.f13029 = obj;
        this.f13028 = new InterfaceC5189[list.size()];
        this.f13030 = -1;
    }

    @Override // kotlinx.coroutines.InterfaceC6233
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC5192 mo2990() {
        return this.f13033.getContext();
    }

    @Override // io.ktor.util.pipeline.AbstractC5026
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Object mo9125(InterfaceC5189 interfaceC5189) {
        Object obj;
        if (this.f13031 == this.f13032.size()) {
            obj = this.f13029;
        } else {
            InterfaceC5189 interfaceC5189M5624 = AbstractC3400.m5624(interfaceC5189);
            int i = this.f13030 + 1;
            this.f13030 = i;
            InterfaceC5189[] interfaceC5189Arr = this.f13028;
            interfaceC5189Arr[i] = interfaceC5189M5624;
            if (m9144(true)) {
                int i2 = this.f13030;
                if (i2 < 0) {
                    C6755.m11870("No more continuations to resume");
                    return null;
                }
                this.f13030 = i2 - 1;
                interfaceC5189Arr[i2] = null;
                obj = this.f13029;
            } else {
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
            }
        }
        if (obj == CoroutineSingletons.COROUTINE_SUSPENDED) {
            interfaceC5189.getClass();
        }
        return obj;
    }

    @Override // io.ktor.util.pipeline.AbstractC5026
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo9126() {
        return this.f13029;
    }

    @Override // io.ktor.util.pipeline.AbstractC5026
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo9127() {
        this.f13031 = this.f13032.size();
    }

    @Override // io.ktor.util.pipeline.AbstractC5026
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo9128(Object obj, InterfaceC5189 interfaceC5189) {
        this.f13031 = 0;
        if (this.f13032.size() == 0) {
            return obj;
        }
        mo9130(obj);
        if (this.f13030 < 0) {
            return mo9125(interfaceC5189);
        }
        C6755.m11870("Already started");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m9143(Object obj) {
        int i = this.f13030;
        if (i < 0) {
            C6755.m11870("No more continuations to resume");
            return;
        }
        InterfaceC5189[] interfaceC5189Arr = this.f13028;
        InterfaceC5189 interfaceC5189 = interfaceC5189Arr[i];
        interfaceC5189.getClass();
        int i2 = this.f13030;
        this.f13030 = i2 - 1;
        interfaceC5189Arr[i2] = null;
        if (!Result.m9310isFailureimpl(obj)) {
            interfaceC5189.resumeWith(obj);
            return;
        }
        Throwable thM9307exceptionOrNullimpl = Result.m9307exceptionOrNullimpl(obj);
        thM9307exceptionOrNullimpl.getClass();
        try {
            thM9307exceptionOrNullimpl.getCause();
        } catch (Throwable unused) {
        }
        interfaceC5189.resumeWith(Result.m9304constructorimpl(new Result.Failure(thM9307exceptionOrNullimpl)));
    }

    @Override // io.ktor.util.pipeline.AbstractC5026
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final Object mo9129(Object obj, InterfaceC5189 interfaceC5189) {
        mo9130(obj);
        return mo9125(interfaceC5189);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean m9144(boolean z) {
        InterfaceC7380 interfaceC7380;
        Object obj;
        C5032 c5032;
        do {
            int i = this.f13031;
            List list = this.f13032;
            if (i == list.size()) {
                if (z) {
                    return true;
                }
                m9143(Result.m9304constructorimpl(this.f13029));
                return false;
            }
            this.f13031 = i + 1;
            interfaceC7380 = (InterfaceC7380) list.get(i);
            try {
                obj = this.f13029;
                c5032 = this.f13033;
                interfaceC7380.getClass();
                obj.getClass();
                c5032.getClass();
                AbstractC5220.m9447(3, interfaceC7380);
            } catch (Throwable th) {
                m9143(Result.m9304constructorimpl(new Result.Failure(th)));
                return false;
            }
        } while (interfaceC7380.invoke(this, obj, c5032) != CoroutineSingletons.COROUTINE_SUSPENDED);
        return false;
    }

    @Override // io.ktor.util.pipeline.AbstractC5026
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo9130(Object obj) {
        obj.getClass();
        this.f13029 = obj;
    }
}
