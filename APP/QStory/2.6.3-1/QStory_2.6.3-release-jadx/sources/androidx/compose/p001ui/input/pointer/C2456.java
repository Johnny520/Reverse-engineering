package androidx.compose.p001ui.input.pointer;

import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.platform.InterfaceC2698;
import androidx.window.area.AbstractC3400;
import kotlin.AbstractC6017;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6249;
import kotlinx.coroutines.C6276;
import kotlinx.coroutines.InterfaceC6284;
import p068.InterfaceC7383;
import p221.InterfaceC8725;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2456 implements InterfaceC2468, InterfaceC8725, InterfaceC5189 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ C2462 f5086;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C6276 f5087;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C6276 f5088;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C2462 f5089;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public PointerEventPass f5085 = PointerEventPass.Main;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final EmptyCoroutineContext f5084 = EmptyCoroutineContext.INSTANCE;

    public C2456(C2462 c2462, C6276 c6276) {
        this.f5086 = c2462;
        this.f5089 = c2462;
        this.f5087 = c6276;
    }

    @Override // kotlin.coroutines.InterfaceC5189
    public final InterfaceC5192 getContext() {
        return this.f5084;
    }

    @Override // kotlin.coroutines.InterfaceC5189
    public final void resumeWith(Object obj) {
        C2462 c2462 = this.f5086;
        synchronized (c2462.f5100) {
            c2462.f5101.m2615(this);
        }
        this.f5087.resumeWith(obj);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public final float mo1892(float f) {
        return f / this.f5089.mo1816();
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final float mo1893(int i) {
        return this.f5089.mo1893(i);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final long mo1894(float f) {
        return this.f5089.mo1894(f);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世 */
    public final float mo1895(long j) {
        return this.f5089.mo1895(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC2698 m3557() {
        return AbstractC2620.m3906(this.f5086).f5441;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long m3558() {
        C2462 c2462 = this.f5086;
        long jMo1902 = c2462.mo1902(AbstractC2620.m3906(c2462).f5441.mo3839());
        long j = c2462.f5098;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo1902 >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo1902 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object m3559(PointerEventPass pointerEventPass, InterfaceC5189 interfaceC5189) {
        C6276 c6276 = new C6276(1, AbstractC3400.m5624(interfaceC5189));
        c6276.m11102();
        this.f5085 = pointerEventPass;
        this.f5088 = c6276;
        Object objM11099 = c6276.m11099();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM11099;
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1816() {
        return this.f5089.mo1816();
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final long mo1899(long j) {
        return this.f5089.mo1899(j);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final long mo1900(float f) {
        return this.f5089.mo1900(f);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final float mo1901(long j) {
        return this.f5089.mo1901(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3560(long j, InterfaceC7383 interfaceC7383, ContinuationImpl continuationImpl) {
        C0177x2677a771 c0177x2677a771;
        if (continuationImpl instanceof C0177x2677a771) {
            c0177x2677a771 = (C0177x2677a771) continuationImpl;
            int i = c0177x2677a771.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0177x2677a771.label = i - Integer.MIN_VALUE;
            } else {
                c0177x2677a771 = new C0177x2677a771(this, continuationImpl);
            }
        }
        Object obj = c0177x2677a771.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c0177x2677a771.label;
        try {
            if (i2 == 0) {
                AbstractC6017.m10769(obj);
                c0177x2677a771.label = 1;
                Object objM3561 = m3561(j, interfaceC7383, c0177x2677a771);
                return objM3561 == obj2 ? obj2 : objM3561;
            }
            if (i2 == 1) {
                AbstractC6017.m10769(obj);
                return obj;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        } catch (PointerEventTimeoutCancellationException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3561(long j, InterfaceC7383 interfaceC7383, BaseContinuationImpl baseContinuationImpl) throws Throwable {
        C0175x647a7347 c0175x647a7347;
        Throwable th;
        InterfaceC6284 interfaceC6284;
        C6276 c6276;
        if (baseContinuationImpl instanceof C0175x647a7347) {
            c0175x647a7347 = (C0175x647a7347) baseContinuationImpl;
            int i = c0175x647a7347.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0175x647a7347.label = i - Integer.MIN_VALUE;
            } else {
                c0175x647a7347 = new C0175x647a7347(this, baseContinuationImpl);
            }
        }
        Object objInvoke = c0175x647a7347.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c0175x647a7347.label;
        if (i2 != 0) {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC6284 = (InterfaceC6284) c0175x647a7347.L$0;
            try {
                AbstractC6017.m10769(objInvoke);
                interfaceC6284.mo10815(CancelTimeoutCancellationException.INSTANCE);
                return objInvoke;
            } catch (Throwable th2) {
                th = th2;
                interfaceC6284.mo10815(CancelTimeoutCancellationException.INSTANCE);
                throw th;
            }
        }
        AbstractC6017.m10769(objInvoke);
        if (j <= 0 && (c6276 = this.f5088) != null) {
            c6276.resumeWith(Result.m9304constructorimpl(new Result.Failure(new PointerEventTimeoutCancellationException(j))));
        }
        C6249 c6249M11036 = AbstractC6231.m11036(this.f5086.m4427(), null, null, new C0176xf3489d20(j, this, null), 3);
        try {
            c0175x647a7347.L$0 = c6249M11036;
            c0175x647a7347.label = 1;
            objInvoke = interfaceC7383.invoke(this, c0175x647a7347);
            if (objInvoke == obj) {
                return obj;
            }
            interfaceC6284 = c6249M11036;
            interfaceC6284.mo10815(CancelTimeoutCancellationException.INSTANCE);
            return objInvoke;
        } catch (Throwable th3) {
            th = th3;
            interfaceC6284 = c6249M11036;
            interfaceC6284.mo10815(CancelTimeoutCancellationException.INSTANCE);
            throw th;
        }
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public final long mo1902(long j) {
        return this.f5089.mo1902(j);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final int mo1903(float f) {
        return this.f5089.mo1903(f);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1817() {
        return this.f5089.mo1817();
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世 */
    public final float mo1904(float f) {
        return this.f5089.mo1816() * f;
    }
}
