package kotlinx.coroutines.channels;

import androidx.window.area.AbstractC3400;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6276;
import kotlinx.coroutines.InterfaceC6244;
import kotlinx.coroutines.internal.AbstractC6190;
import kotlinx.coroutines.internal.AbstractC6193;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6023 implements InterfaceC6044, InterfaceC6244 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C6276 f15126;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C6022 f15127;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Object f15128 = AbstractC6021.f15104;

    public C6023(C6022 c6022) {
        this.f15127 = c6022;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object m10821() {
        Object obj = this.f15128;
        C5317 c5317 = AbstractC6021.f15104;
        if (obj == c5317) {
            C6755.m11870("`hasNext()` has not been invoked");
            return null;
        }
        this.f15128 = c5317;
        if (obj != AbstractC6021.f15108) {
            return obj;
        }
        Throwable thM10812 = this.f15127.m10812();
        int i = AbstractC6190.f15285;
        throw thM10812;
    }

    @Override // kotlinx.coroutines.InterfaceC6244
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo10822(AbstractC6193 abstractC6193, int i) {
        C6276 c6276 = this.f15126;
        if (c6276 != null) {
            c6276.mo10822(abstractC6193, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m10823(InterfaceC5189 interfaceC5189) {
        C6033 c6033M10810;
        Object obj = this.f15128;
        boolean z = true;
        if (obj == AbstractC6021.f15104 || obj == AbstractC6021.f15108) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C6022.f15122;
            C6022 c6022 = this.f15127;
            C6033 c6033 = (C6033) atomicReferenceFieldUpdater.get(c6022);
            while (true) {
                if (c6022.m10793()) {
                    this.f15128 = AbstractC6021.f15108;
                    Throwable thM10811 = c6022.m10811();
                    if (thM10811 != null) {
                        int i = AbstractC6190.f15285;
                        throw thM10811;
                    }
                    z = false;
                } else {
                    long andIncrement = C6022.f15124.getAndIncrement(c6022);
                    long j = AbstractC6021.f15096;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (c6033.f15289 != j2) {
                        c6033M10810 = c6022.m10810(j2, c6033);
                        if (c6033M10810 == null) {
                            continue;
                        }
                    } else {
                        c6033M10810 = c6033;
                    }
                    Object objM10788 = c6022.m10788(c6033M10810, i2, andIncrement, null);
                    C5317 c5317 = AbstractC6021.f15100;
                    if (objM10788 == c5317) {
                        C6755.m11870("unreachable");
                        return null;
                    }
                    C5317 c53172 = AbstractC6021.f15103;
                    if (objM10788 == c53172) {
                        if (andIncrement < c6022.m10807()) {
                            c6033M10810.m10916();
                        }
                        c6033 = c6033M10810;
                    } else {
                        if (objM10788 == AbstractC6021.f15099) {
                            C6022 c60222 = this.f15127;
                            C6276 c6276M11051 = AbstractC6231.m11051(AbstractC3400.m5624(interfaceC5189));
                            try {
                                this.f15126 = c6276M11051;
                                Object objM107882 = c60222.m10788(c6033M10810, i2, andIncrement, this);
                                if (objM107882 == c5317) {
                                    mo10822(c6033M10810, i2);
                                } else {
                                    if (objM107882 == c53172) {
                                        if (andIncrement < c60222.m10807()) {
                                            c6033M10810.m10916();
                                        }
                                        C6033 c60332 = (C6033) C6022.f15122.get(c60222);
                                        while (true) {
                                            if (c60222.m10793()) {
                                                C6276 c6276 = this.f15126;
                                                c6276.getClass();
                                                this.f15126 = null;
                                                this.f15128 = AbstractC6021.f15108;
                                                Throwable thM108112 = c6022.m10811();
                                                if (thM108112 == null) {
                                                    c6276.resumeWith(Result.m9304constructorimpl(Boolean.FALSE));
                                                } else {
                                                    c6276.resumeWith(Result.m9304constructorimpl(new Result.Failure(thM108112)));
                                                }
                                            } else {
                                                long andIncrement2 = C6022.f15124.getAndIncrement(c60222);
                                                long j3 = AbstractC6021.f15096;
                                                long j4 = andIncrement2 / j3;
                                                int i3 = (int) (andIncrement2 % j3);
                                                if (c60332.f15289 != j4) {
                                                    C6033 c6033M108102 = c60222.m10810(j4, c60332);
                                                    if (c6033M108102 != null) {
                                                        c60332 = c6033M108102;
                                                    }
                                                }
                                                Object objM107883 = c60222.m10788(c60332, i3, andIncrement2, this);
                                                if (objM107883 == AbstractC6021.f15100) {
                                                    mo10822(c60332, i3);
                                                    break;
                                                }
                                                if (objM107883 == AbstractC6021.f15103) {
                                                    if (andIncrement2 < c60222.m10807()) {
                                                        c60332.m10916();
                                                    }
                                                } else {
                                                    if (objM107883 == AbstractC6021.f15099) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    c60332.m10916();
                                                    this.f15128 = objM107883;
                                                    this.f15126 = null;
                                                }
                                            }
                                        }
                                    } else {
                                        c6033M10810.m10916();
                                        this.f15128 = objM107882;
                                        this.f15126 = null;
                                    }
                                    c6276M11051.mo10993(Boolean.TRUE, null);
                                }
                                Object objM11099 = c6276M11051.m11099();
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                return objM11099;
                            } catch (Throwable th) {
                                c6276M11051.m11092();
                                throw th;
                            }
                        }
                        c6033M10810.m10916();
                        this.f15128 = objM10788;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
