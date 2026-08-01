package io.ktor.utils.p007io.jvm.javaio;

import io.ktor.utils.p007io.C5069;
import io.ktor.utils.p007io.InterfaceC5084;
import java.io.IOException;
import kotlin.AbstractC6017;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6234;
import kotlinx.coroutines.C6283;
import kotlinx.coroutines.C6285;
import kotlinx.coroutines.InterfaceC6284;
import kotlinx.p010io.C6308;
import kotlinx.p010io.C6309;
import kotlinx.p010io.InterfaceC6313;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.utils.io.jvm.javaio.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5054 implements InterfaceC5084 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC5192 f13063;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C6283 f13064;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C6309 f13065 = new C6309();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C5069 f13066;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6308 f13067;

    public C5054(C6308 c6308, InterfaceC5192 interfaceC5192) {
        this.f13067 = c6308;
        C6283 c6283 = new C6283((InterfaceC6284) interfaceC5192.get(C6285.f15450));
        this.f13064 = c6283;
        this.f13063 = interfaceC5192.plus(c6283).plus(new C6234("RawSourceChannel"));
    }

    @Override // io.ktor.utils.p007io.InterfaceC5084
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo9200() {
        return this.f13066 != null && this.f13065.mo11163();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.p007io.InterfaceC5084
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo9201(int i, ContinuationImpl continuationImpl) {
        RawSourceChannel$awaitContent$1 rawSourceChannel$awaitContent$1;
        if (continuationImpl instanceof RawSourceChannel$awaitContent$1) {
            rawSourceChannel$awaitContent$1 = (RawSourceChannel$awaitContent$1) continuationImpl;
            int i2 = rawSourceChannel$awaitContent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rawSourceChannel$awaitContent$1.label = i2 - Integer.MIN_VALUE;
            } else {
                rawSourceChannel$awaitContent$1 = new RawSourceChannel$awaitContent$1(this, continuationImpl);
            }
        }
        Object obj = rawSourceChannel$awaitContent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = rawSourceChannel$awaitContent$1.label;
        if (i3 == 0) {
            AbstractC6017.m10769(obj);
            if (this.f13066 != null) {
                return Boolean.TRUE;
            }
            RawSourceChannel$awaitContent$2 rawSourceChannel$awaitContent$2 = new RawSourceChannel$awaitContent$2(this, i, null);
            rawSourceChannel$awaitContent$1.L$0 = this;
            rawSourceChannel$awaitContent$1.I$0 = i;
            rawSourceChannel$awaitContent$1.label = 1;
            if (AbstractC6231.m11029(this.f13063, rawSourceChannel$awaitContent$2, rawSourceChannel$awaitContent$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = rawSourceChannel$awaitContent$1.I$0;
            this = (C5054) rawSourceChannel$awaitContent$1.L$0;
            AbstractC6017.m10769(obj);
        }
        return Boolean.valueOf(this.f13065.f15487 >= ((long) i));
    }

    @Override // io.ktor.utils.p007io.InterfaceC5084
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6313 mo9202() {
        return this.f13065;
    }

    @Override // io.ktor.utils.p007io.InterfaceC5084
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Throwable mo9203() {
        C5069 c5069 = this.f13066;
        if (c5069 != null) {
            return c5069.m9211();
        }
        return null;
    }

    @Override // io.ktor.utils.p007io.InterfaceC5084
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo9204(Throwable th) {
        String message;
        String message2;
        if (this.f13066 != null) {
            return;
        }
        String str = "Channel was cancelled";
        if (th == null || (message = th.getMessage()) == null) {
            message = "Channel was cancelled";
        }
        AbstractC6231.m11067(message, th, this.f13064);
        this.f13067.close();
        if (th != null && (message2 = th.getMessage()) != null) {
            str = message2;
        }
        this.f13066 = new C5069(new IOException(str, th));
    }
}
