package io.ktor.client.call;

import com.bumptech.glide.AbstractC3889;
import io.ktor.client.statement.C4777;
import io.ktor.http.content.C4824;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.AbstractC6017;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5925;
import kotlin.text.AbstractC5976;
import kotlinx.coroutines.InterfaceC6233;
import p075.C7686;
import p257.InterfaceC8970;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.client.call.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C4700 implements InterfaceC6233 {
    private volatile /* synthetic */ int received;

    static {
        AbstractC5228.f13320.mo9476(Object.class);
        try {
            AbstractC5228.m9471(Object.class);
        } catch (Throwable unused) {
        }
        if (AbstractC5976.m10731("CustomResponse")) {
            C6755.m11869("Name can't be blank");
        } else {
            AtomicIntegerFieldUpdater.newUpdater(C4700.class, "received");
        }
    }

    public final String toString() {
        m8810();
        throw null;
    }

    @Override // kotlinx.coroutines.InterfaceC6233
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC5192 mo2990() {
        m8809();
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m8809() {
        AbstractC5227.m9467("response");
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC8970 m8810() {
        AbstractC5227.m9467("request");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8811(ContinuationImpl continuationImpl) {
        HttpClientCall$bodyNullable$1 httpClientCall$bodyNullable$1;
        if (continuationImpl instanceof HttpClientCall$bodyNullable$1) {
            httpClientCall$bodyNullable$1 = (HttpClientCall$bodyNullable$1) continuationImpl;
            int i = httpClientCall$bodyNullable$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                httpClientCall$bodyNullable$1.label = i - Integer.MIN_VALUE;
            } else {
                httpClientCall$bodyNullable$1 = new HttpClientCall$bodyNullable$1(this, continuationImpl);
            }
        }
        Object obj = httpClientCall$bodyNullable$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = httpClientCall$bodyNullable$1.label;
        if (i2 != 0) {
            try {
                if (i2 == 1) {
                    C7686 c7686 = (C7686) httpClientCall$bodyNullable$1.L$1;
                    C4700 c4700 = (C4700) httpClientCall$bodyNullable$1.L$0;
                    AbstractC6017.m10769(obj);
                    c7686.getClass();
                    obj.getClass();
                    c4700.getClass();
                    throw null;
                }
                if (i2 != 2) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                C7686 c76862 = (C7686) httpClientCall$bodyNullable$1.L$1;
                C4700 c47002 = (C4700) httpClientCall$bodyNullable$1.L$0;
                AbstractC6017.m10769(obj);
                Object obj2 = ((C4777) obj).f12502;
                if (AbstractC5227.m9466(obj2, C4824.f12592)) {
                    obj2 = null;
                }
                if (obj2 != null) {
                    InterfaceC5925 interfaceC5925 = c76862.f18643;
                    interfaceC5925.getClass();
                    if (!AbstractC3889.m7316(interfaceC5925).isInstance(obj2)) {
                        AbstractC5228.f13320.mo9476(obj2.getClass());
                        c47002.m8809();
                        throw null;
                    }
                }
                return obj2;
            } catch (Throwable unused) {
                this = httpClientCall$bodyNullable$1;
            }
        } else {
            AbstractC6017.m10769(obj);
            try {
                m8809();
                throw null;
            } catch (Throwable unused2) {
            }
        }
        this.m8809();
        throw null;
    }
}
