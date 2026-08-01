package kotlinx.coroutines.channels;

import androidx.window.area.AbstractC2567;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.reflect.jvm.internal.impl.descriptors.C4485;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5444;
import kotlinx.coroutines.InterfaceC5412;
import kotlinx.coroutines.internal.AbstractC5358;
import kotlinx.coroutines.internal.AbstractC5361;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5191 implements InterfaceC5212, InterfaceC5412 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C5444 f14781;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C5190 f14782;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Object f14783 = AbstractC5189.f14759;

    public C5191(C5190 c5190) {
        this.f14782 = c5190;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object m10262() {
        Object obj = this.f14783;
        C4485 c4485 = AbstractC5189.f14759;
        if (obj == c4485) {
            C5925.m11311("`hasNext()` has not been invoked");
            return null;
        }
        this.f14783 = c4485;
        if (obj != AbstractC5189.f14763) {
            return obj;
        }
        Throwable thM10253 = this.f14782.m10253();
        int i = AbstractC5358.f14940;
        throw thM10253;
    }

    @Override // kotlinx.coroutines.InterfaceC5412
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo10263(AbstractC5361 abstractC5361, int i) {
        C5444 c5444 = this.f14781;
        if (c5444 != null) {
            c5444.mo10263(abstractC5361, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m10264(InterfaceC4357 interfaceC4357) {
        C5201 c5201M10251;
        Object obj = this.f14783;
        boolean z = true;
        if (obj == AbstractC5189.f14759 || obj == AbstractC5189.f14763) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C5190.f14777;
            C5190 c5190 = this.f14782;
            C5201 c5201 = (C5201) atomicReferenceFieldUpdater.get(c5190);
            while (true) {
                if (c5190.m10234()) {
                    this.f14783 = AbstractC5189.f14763;
                    Throwable thM10252 = c5190.m10252();
                    if (thM10252 != null) {
                        int i = AbstractC5358.f14940;
                        throw thM10252;
                    }
                    z = false;
                } else {
                    long andIncrement = C5190.f14779.getAndIncrement(c5190);
                    long j = AbstractC5189.f14751;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (c5201.f14944 != j2) {
                        c5201M10251 = c5190.m10251(j2, c5201);
                        if (c5201M10251 == null) {
                            continue;
                        }
                    } else {
                        c5201M10251 = c5201;
                    }
                    Object objM10229 = c5190.m10229(c5201M10251, i2, andIncrement, null);
                    C4485 c4485 = AbstractC5189.f14755;
                    if (objM10229 == c4485) {
                        C5925.m11311("unreachable");
                        return null;
                    }
                    C4485 c44852 = AbstractC5189.f14758;
                    if (objM10229 == c44852) {
                        if (andIncrement < c5190.m10248()) {
                            c5201M10251.m10357();
                        }
                        c5201 = c5201M10251;
                    } else {
                        if (objM10229 == AbstractC5189.f14754) {
                            C5190 c51902 = this.f14782;
                            C5444 c5444M10492 = AbstractC5399.m10492(AbstractC2567.m5064(interfaceC4357));
                            try {
                                this.f14781 = c5444M10492;
                                Object objM102292 = c51902.m10229(c5201M10251, i2, andIncrement, this);
                                if (objM102292 == c4485) {
                                    mo10263(c5201M10251, i2);
                                } else {
                                    if (objM102292 == c44852) {
                                        if (andIncrement < c51902.m10248()) {
                                            c5201M10251.m10357();
                                        }
                                        C5201 c52012 = (C5201) C5190.f14777.get(c51902);
                                        while (true) {
                                            if (c51902.m10234()) {
                                                C5444 c5444 = this.f14781;
                                                c5444.getClass();
                                                this.f14781 = null;
                                                this.f14783 = AbstractC5189.f14763;
                                                Throwable thM102522 = c5190.m10252();
                                                if (thM102522 == null) {
                                                    c5444.resumeWith(Result.m8745constructorimpl(Boolean.FALSE));
                                                } else {
                                                    c5444.resumeWith(Result.m8745constructorimpl(new Result.Failure(thM102522)));
                                                }
                                            } else {
                                                long andIncrement2 = C5190.f14779.getAndIncrement(c51902);
                                                long j3 = AbstractC5189.f14751;
                                                long j4 = andIncrement2 / j3;
                                                int i3 = (int) (andIncrement2 % j3);
                                                if (c52012.f14944 != j4) {
                                                    C5201 c5201M102512 = c51902.m10251(j4, c52012);
                                                    if (c5201M102512 != null) {
                                                        c52012 = c5201M102512;
                                                    }
                                                }
                                                Object objM102293 = c51902.m10229(c52012, i3, andIncrement2, this);
                                                if (objM102293 == AbstractC5189.f14755) {
                                                    mo10263(c52012, i3);
                                                    break;
                                                }
                                                if (objM102293 == AbstractC5189.f14758) {
                                                    if (andIncrement2 < c51902.m10248()) {
                                                        c52012.m10357();
                                                    }
                                                } else {
                                                    if (objM102293 == AbstractC5189.f14754) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    c52012.m10357();
                                                    this.f14783 = objM102293;
                                                    this.f14781 = null;
                                                }
                                            }
                                        }
                                    } else {
                                        c5201M10251.m10357();
                                        this.f14783 = objM102292;
                                        this.f14781 = null;
                                    }
                                    c5444M10492.mo10434(Boolean.TRUE, null);
                                }
                                Object objM10540 = c5444M10492.m10540();
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                return objM10540;
                            } catch (Throwable th) {
                                c5444M10492.m10533();
                                throw th;
                            }
                        }
                        c5201M10251.m10357();
                        this.f14783 = objM10229;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
