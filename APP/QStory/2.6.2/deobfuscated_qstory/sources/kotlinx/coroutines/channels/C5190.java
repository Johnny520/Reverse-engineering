package kotlinx.coroutines.channels;

import com.bumptech.glide.AbstractC3054;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.reflect.jvm.internal.impl.descriptors.C4484;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5443;
import kotlinx.coroutines.InterfaceC5411;
import kotlinx.coroutines.internal.AbstractC5357;
import kotlinx.coroutines.internal.AbstractC5360;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5190 implements InterfaceC5211, InterfaceC5411 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C5443 f14781;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C5189 f14782;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Object f14783 = AbstractC5188.f14759;

    public C5190(C5189 c5189) {
        this.f14782 = c5189;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object m10258() {
        Object obj = this.f14783;
        C4484 c4484 = AbstractC5188.f14759;
        if (obj == c4484) {
            C5919.m11250("`hasNext()` has not been invoked");
            return null;
        }
        this.f14783 = c4484;
        if (obj != AbstractC5188.f14763) {
            return obj;
        }
        Throwable thM10243 = this.f14782.m10243();
        int i = AbstractC5357.f14940;
        throw thM10243;
    }

    @Override // kotlinx.coroutines.InterfaceC5411
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo10259(AbstractC5360 abstractC5360, int i) {
        C5443 c5443 = this.f14781;
        if (c5443 != null) {
            c5443.mo10259(abstractC5360, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m10260(InterfaceC4356 interfaceC4356) {
        C5200 c5200M10248;
        Object obj = this.f14783;
        boolean z = true;
        if (obj == AbstractC5188.f14759 || obj == AbstractC5188.f14763) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C5189.f14777;
            C5189 c5189 = this.f14782;
            C5200 c5200 = (C5200) atomicReferenceFieldUpdater.get(c5189);
            while (true) {
                if (c5189.m10230()) {
                    this.f14783 = AbstractC5188.f14763;
                    Throwable thM10249 = c5189.m10249();
                    if (thM10249 != null) {
                        int i = AbstractC5357.f14940;
                        throw thM10249;
                    }
                    z = false;
                } else {
                    long andIncrement = C5189.f14779.getAndIncrement(c5189);
                    long j = AbstractC5188.f14751;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (c5200.f14944 != j2) {
                        c5200M10248 = c5189.m10248(j2, c5200);
                        if (c5200M10248 == null) {
                            continue;
                        }
                    } else {
                        c5200M10248 = c5200;
                    }
                    Object objM10225 = c5189.m10225(c5200M10248, i2, andIncrement, null);
                    C4484 c4484 = AbstractC5188.f14755;
                    if (objM10225 == c4484) {
                        C5919.m11250("unreachable");
                        return null;
                    }
                    C4484 c44842 = AbstractC5188.f14758;
                    if (objM10225 == c44842) {
                        if (andIncrement < c5189.m10244()) {
                            c5200M10248.m10353();
                        }
                        c5200 = c5200M10248;
                    } else {
                        if (objM10225 == AbstractC5188.f14754) {
                            C5189 c51892 = this.f14782;
                            C5443 c5443M10488 = AbstractC5398.m10488(AbstractC3054.m6602(interfaceC4356));
                            try {
                                this.f14781 = c5443M10488;
                                Object objM102252 = c51892.m10225(c5200M10248, i2, andIncrement, this);
                                if (objM102252 == c4484) {
                                    mo10259(c5200M10248, i2);
                                } else {
                                    if (objM102252 == c44842) {
                                        if (andIncrement < c51892.m10244()) {
                                            c5200M10248.m10353();
                                        }
                                        C5200 c52002 = (C5200) C5189.f14777.get(c51892);
                                        while (true) {
                                            if (c51892.m10230()) {
                                                C5443 c5443 = this.f14781;
                                                c5443.getClass();
                                                this.f14781 = null;
                                                this.f14783 = AbstractC5188.f14763;
                                                Throwable thM102492 = c5189.m10249();
                                                if (thM102492 == null) {
                                                    c5443.resumeWith(Result.m8755constructorimpl(Boolean.FALSE));
                                                } else {
                                                    c5443.resumeWith(Result.m8755constructorimpl(new Result.Failure(thM102492)));
                                                }
                                            } else {
                                                long andIncrement2 = C5189.f14779.getAndIncrement(c51892);
                                                long j3 = AbstractC5188.f14751;
                                                long j4 = andIncrement2 / j3;
                                                int i3 = (int) (andIncrement2 % j3);
                                                if (c52002.f14944 != j4) {
                                                    C5200 c5200M102482 = c51892.m10248(j4, c52002);
                                                    if (c5200M102482 != null) {
                                                        c52002 = c5200M102482;
                                                    }
                                                }
                                                Object objM102253 = c51892.m10225(c52002, i3, andIncrement2, this);
                                                if (objM102253 == AbstractC5188.f14755) {
                                                    mo10259(c52002, i3);
                                                    break;
                                                }
                                                if (objM102253 == AbstractC5188.f14758) {
                                                    if (andIncrement2 < c51892.m10244()) {
                                                        c52002.m10353();
                                                    }
                                                } else {
                                                    if (objM102253 == AbstractC5188.f14754) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    c52002.m10353();
                                                    this.f14783 = objM102253;
                                                    this.f14781 = null;
                                                }
                                            }
                                        }
                                    } else {
                                        c5200M10248.m10353();
                                        this.f14783 = objM102252;
                                        this.f14781 = null;
                                    }
                                    c5443M10488.mo10430(Boolean.TRUE, null);
                                }
                                Object objM10536 = c5443M10488.m10536();
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                return objM10536;
                            } catch (Throwable th) {
                                c5443M10488.m10529();
                                throw th;
                            }
                        }
                        c5200M10248.m10353();
                        this.f14783 = objM10225;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
