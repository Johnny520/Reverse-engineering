package io.ktor.utils.p007io;

import com.bumptech.glide.AbstractC3897;
import java.nio.ByteBuffer;
import kotlin.AbstractC6017;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.p010io.AbstractC6310;
import kotlinx.p010io.C6304;
import kotlinx.p010io.InterfaceC6313;
import p074.AbstractC7684;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.utils.io.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5072 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC5084 f13089;

    public C5072(InterfaceC5084 interfaceC5084) {
        interfaceC5084.getClass();
        this.f13089 = interfaceC5084;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ByteBuffer m9212(int i, int i2) throws Exception {
        InterfaceC5084 interfaceC5084 = this.f13089;
        if (AbstractC7684.m12638(interfaceC5084.mo9202()) < i2 + i) {
            return null;
        }
        InterfaceC6313 interfaceC6313Mo9202 = interfaceC5084.mo9202();
        interfaceC6313Mo9202.getClass();
        C6304 c6304Peek = interfaceC6313Mo9202.mo11162().peek();
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(AbstractC6310.m11188(c6304Peek, -1));
            AbstractC3897.m7396(c6304Peek, null);
            if (i > 0) {
                byteBufferWrap.position(byteBufferWrap.position() + i);
            }
            return byteBufferWrap;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m9213(int i, ContinuationImpl continuationImpl) {
        LookAheadSuspendSession$awaitAtLeast$1 lookAheadSuspendSession$awaitAtLeast$1;
        if (continuationImpl instanceof LookAheadSuspendSession$awaitAtLeast$1) {
            lookAheadSuspendSession$awaitAtLeast$1 = (LookAheadSuspendSession$awaitAtLeast$1) continuationImpl;
            int i2 = lookAheadSuspendSession$awaitAtLeast$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lookAheadSuspendSession$awaitAtLeast$1.label = i2 - Integer.MIN_VALUE;
            } else {
                lookAheadSuspendSession$awaitAtLeast$1 = new LookAheadSuspendSession$awaitAtLeast$1(this, continuationImpl);
            }
        }
        Object obj = lookAheadSuspendSession$awaitAtLeast$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = lookAheadSuspendSession$awaitAtLeast$1.label;
        if (i3 == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC5084 interfaceC5084 = this.f13089;
            if (AbstractC7684.m12638(interfaceC5084.mo9202()) >= i) {
                return Boolean.TRUE;
            }
            lookAheadSuspendSession$awaitAtLeast$1.L$0 = this;
            lookAheadSuspendSession$awaitAtLeast$1.I$0 = i;
            lookAheadSuspendSession$awaitAtLeast$1.label = 1;
            if (interfaceC5084.mo9201(i, lookAheadSuspendSession$awaitAtLeast$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = lookAheadSuspendSession$awaitAtLeast$1.I$0;
            this = (C5072) lookAheadSuspendSession$awaitAtLeast$1.L$0;
            AbstractC6017.m10769(obj);
        }
        return Boolean.valueOf(AbstractC7684.m12638(this.f13089.mo9202()) >= ((long) i));
    }
}
