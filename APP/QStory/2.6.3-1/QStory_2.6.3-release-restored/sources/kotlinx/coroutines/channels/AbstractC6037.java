package kotlinx.coroutines.channels;

import androidx.compose.foundation.text.C1850;
import androidx.window.area.AbstractC3400;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6234;
import kotlinx.coroutines.C6276;
import kotlinx.coroutines.C6285;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6037 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static C6036 m10836(InterfaceC6233 interfaceC6233, C6234 c6234, int i, InterfaceC7383 interfaceC7383, int i2) {
        InterfaceC5192 interfaceC5192 = c6234;
        if ((i2 & 1) != 0) {
            interfaceC5192 = EmptyCoroutineContext.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        BufferOverflow bufferOverflow = BufferOverflow.SUSPEND;
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        C6036 c6036 = new C6036(AbstractC6231.m11035(interfaceC6233, interfaceC5192), m10841(i, 4, bufferOverflow), true, true);
        coroutineStart.invoke(interfaceC7383, c6036, c6036);
        return c6036;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final void m10837(InterfaceC6031 interfaceC6031, Throwable th) {
        CancellationException cancellationExceptionM11050 = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationExceptionM11050 == null) {
            cancellationExceptionM11050 = AbstractC6231.m11050("Channel was consumed, consumer had failed", th);
        }
        interfaceC6031.mo10815(cancellationExceptionM11050);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m10838(InterfaceC6028 interfaceC6028, InterfaceC7372 interfaceC7372, ContinuationImpl continuationImpl) {
        ProduceKt$awaitClose$1 produceKt$awaitClose$1;
        if (continuationImpl instanceof ProduceKt$awaitClose$1) {
            produceKt$awaitClose$1 = (ProduceKt$awaitClose$1) continuationImpl;
            int i = produceKt$awaitClose$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                produceKt$awaitClose$1.label = i - Integer.MIN_VALUE;
            } else {
                produceKt$awaitClose$1 = new ProduceKt$awaitClose$1(continuationImpl);
            }
        }
        Object obj = produceKt$awaitClose$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = produceKt$awaitClose$1.label;
        try {
            if (i2 == 0) {
                AbstractC6017.m10769(obj);
                if (produceKt$awaitClose$1.getContext().get(C6285.f15450) != interfaceC6028) {
                    C6755.m11870("awaitClose() can only be invoked from the producer context");
                    return null;
                }
                produceKt$awaitClose$1.L$0 = interfaceC6028;
                produceKt$awaitClose$1.L$1 = interfaceC7372;
                produceKt$awaitClose$1.I$0 = 0;
                produceKt$awaitClose$1.label = 1;
                C6276 c6276 = new C6276(1, AbstractC3400.m5624(produceKt$awaitClose$1));
                c6276.m11102();
                ((AbstractC6043) interfaceC6028).mo8991(new C1850(c6276, 19));
                if (c6276.m11099() == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC7372 = (InterfaceC7372) produceKt$awaitClose$1.L$1;
                AbstractC6017.m10769(obj);
            }
            interfaceC7372.invoke();
            return C6008.f15084;
        } catch (Throwable th) {
            interfaceC7372.invoke();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x014e -> B:48:0x0153). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CoroutineSingletons m10839(long j, long j2, InterfaceC6032 interfaceC6032, ContinuationImpl continuationImpl) {
        TickerChannelsKt$fixedPeriodTicker$1 tickerChannelsKt$fixedPeriodTicker$1;
        InterfaceC6032 interfaceC60322;
        long j3;
        long j4;
        long jM11057;
        long j5;
        long j6;
        InterfaceC6032 interfaceC60323;
        long j7;
        long j8;
        long jNanoTime;
        long j9;
        char c;
        long j10 = j2;
        if (continuationImpl instanceof TickerChannelsKt$fixedPeriodTicker$1) {
            tickerChannelsKt$fixedPeriodTicker$1 = (TickerChannelsKt$fixedPeriodTicker$1) continuationImpl;
            int i = tickerChannelsKt$fixedPeriodTicker$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tickerChannelsKt$fixedPeriodTicker$1.label = i - Integer.MIN_VALUE;
            } else {
                tickerChannelsKt$fixedPeriodTicker$1 = new TickerChannelsKt$fixedPeriodTicker$1(continuationImpl);
            }
        }
        Object obj = tickerChannelsKt$fixedPeriodTicker$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = tickerChannelsKt$fixedPeriodTicker$1.label;
        int i3 = 2;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            long jNanoTime2 = System.nanoTime() + AbstractC6231.m11057(j10);
            interfaceC60322 = interfaceC6032;
            tickerChannelsKt$fixedPeriodTicker$1.L$0 = interfaceC60322;
            tickerChannelsKt$fixedPeriodTicker$1.J$0 = j;
            tickerChannelsKt$fixedPeriodTicker$1.J$1 = j10;
            tickerChannelsKt$fixedPeriodTicker$1.J$2 = jNanoTime2;
            tickerChannelsKt$fixedPeriodTicker$1.label = 1;
            if (AbstractC6231.m11058(j10, tickerChannelsKt$fixedPeriodTicker$1) != coroutineSingletons) {
                j3 = jNanoTime2;
                j4 = j;
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                j7 = tickerChannelsKt$fixedPeriodTicker$1.J$3;
                long j11 = tickerChannelsKt$fixedPeriodTicker$1.J$2;
                j6 = tickerChannelsKt$fixedPeriodTicker$1.J$1;
                j5 = tickerChannelsKt$fixedPeriodTicker$1.J$0;
                interfaceC60323 = (InterfaceC6032) tickerChannelsKt$fixedPeriodTicker$1.L$0;
                AbstractC6017.m10769(obj);
                j8 = j11;
                jNanoTime = System.nanoTime();
                long j12 = j8 - jNanoTime;
                if (j12 >= 0) {
                }
                if (j9 == 0) {
                    long j13 = j5;
                    long j14 = j6;
                    tickerChannelsKt$fixedPeriodTicker$1.L$0 = interfaceC60323;
                    tickerChannelsKt$fixedPeriodTicker$1.J$0 = j13;
                    tickerChannelsKt$fixedPeriodTicker$1.J$1 = j14;
                    tickerChannelsKt$fixedPeriodTicker$1.J$2 = j8;
                    tickerChannelsKt$fixedPeriodTicker$1.J$3 = j7;
                    tickerChannelsKt$fixedPeriodTicker$1.J$4 = jNanoTime;
                    tickerChannelsKt$fixedPeriodTicker$1.J$5 = j9;
                    c = 4;
                    tickerChannelsKt$fixedPeriodTicker$1.label = 4;
                    if (AbstractC6231.m11058(j9 / 1000000, tickerChannelsKt$fixedPeriodTicker$1) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                i3 = 2;
                j11 = j3 + jM11057;
                tickerChannelsKt$fixedPeriodTicker$1.L$0 = interfaceC60322;
                tickerChannelsKt$fixedPeriodTicker$1.J$0 = j4;
                tickerChannelsKt$fixedPeriodTicker$1.J$1 = j10;
                tickerChannelsKt$fixedPeriodTicker$1.J$2 = j11;
                tickerChannelsKt$fixedPeriodTicker$1.J$3 = jM11057;
                tickerChannelsKt$fixedPeriodTicker$1.label = i3;
                if (interfaceC60322.mo8992(C6008.f15084, tickerChannelsKt$fixedPeriodTicker$1) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 == 3) {
                long j15 = tickerChannelsKt$fixedPeriodTicker$1.J$3;
                j3 = tickerChannelsKt$fixedPeriodTicker$1.J$2;
                long j16 = tickerChannelsKt$fixedPeriodTicker$1.J$1;
                long j17 = tickerChannelsKt$fixedPeriodTicker$1.J$0;
                InterfaceC6032 interfaceC60324 = (InterfaceC6032) tickerChannelsKt$fixedPeriodTicker$1.L$0;
                AbstractC6017.m10769(obj);
                j10 = j16;
                j4 = j17;
                jM11057 = j15;
                interfaceC60322 = interfaceC60324;
                i3 = 2;
                j11 = j3 + jM11057;
                tickerChannelsKt$fixedPeriodTicker$1.L$0 = interfaceC60322;
                tickerChannelsKt$fixedPeriodTicker$1.J$0 = j4;
                tickerChannelsKt$fixedPeriodTicker$1.J$1 = j10;
                tickerChannelsKt$fixedPeriodTicker$1.J$2 = j11;
                tickerChannelsKt$fixedPeriodTicker$1.J$3 = jM11057;
                tickerChannelsKt$fixedPeriodTicker$1.label = i3;
                if (interfaceC60322.mo8992(C6008.f15084, tickerChannelsKt$fixedPeriodTicker$1) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 != 4) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j18 = tickerChannelsKt$fixedPeriodTicker$1.J$3;
            j3 = tickerChannelsKt$fixedPeriodTicker$1.J$2;
            long j19 = tickerChannelsKt$fixedPeriodTicker$1.J$1;
            long j20 = tickerChannelsKt$fixedPeriodTicker$1.J$0;
            interfaceC60323 = (InterfaceC6032) tickerChannelsKt$fixedPeriodTicker$1.L$0;
            AbstractC6017.m10769(obj);
            jM11057 = j18;
            j10 = j19;
            j4 = j20;
            c = 4;
            interfaceC60322 = interfaceC60323;
            i3 = 2;
            j11 = j3 + jM11057;
            tickerChannelsKt$fixedPeriodTicker$1.L$0 = interfaceC60322;
            tickerChannelsKt$fixedPeriodTicker$1.J$0 = j4;
            tickerChannelsKt$fixedPeriodTicker$1.J$1 = j10;
            tickerChannelsKt$fixedPeriodTicker$1.J$2 = j11;
            tickerChannelsKt$fixedPeriodTicker$1.J$3 = jM11057;
            tickerChannelsKt$fixedPeriodTicker$1.label = i3;
            if (interfaceC60322.mo8992(C6008.f15084, tickerChannelsKt$fixedPeriodTicker$1) != coroutineSingletons) {
                long j21 = j4;
                j6 = j10;
                j7 = jM11057;
                j5 = j21;
                interfaceC60323 = interfaceC60322;
                j8 = j11;
                jNanoTime = System.nanoTime();
                long j122 = j8 - jNanoTime;
                j9 = j122 >= 0 ? 0L : j122;
                if (j9 == 0 || j7 == 0) {
                    long j132 = j5;
                    long j142 = j6;
                    tickerChannelsKt$fixedPeriodTicker$1.L$0 = interfaceC60323;
                    tickerChannelsKt$fixedPeriodTicker$1.J$0 = j132;
                    tickerChannelsKt$fixedPeriodTicker$1.J$1 = j142;
                    tickerChannelsKt$fixedPeriodTicker$1.J$2 = j8;
                    tickerChannelsKt$fixedPeriodTicker$1.J$3 = j7;
                    tickerChannelsKt$fixedPeriodTicker$1.J$4 = jNanoTime;
                    tickerChannelsKt$fixedPeriodTicker$1.J$5 = j9;
                    c = 4;
                    tickerChannelsKt$fixedPeriodTicker$1.label = 4;
                    if (AbstractC6231.m11058(j9 / 1000000, tickerChannelsKt$fixedPeriodTicker$1) != coroutineSingletons) {
                        j3 = j8;
                        j4 = j132;
                        jM11057 = j7;
                        j10 = j142;
                        interfaceC60322 = interfaceC60323;
                        i3 = 2;
                        j11 = j3 + jM11057;
                        tickerChannelsKt$fixedPeriodTicker$1.L$0 = interfaceC60322;
                        tickerChannelsKt$fixedPeriodTicker$1.J$0 = j4;
                        tickerChannelsKt$fixedPeriodTicker$1.J$1 = j10;
                        tickerChannelsKt$fixedPeriodTicker$1.J$2 = j11;
                        tickerChannelsKt$fixedPeriodTicker$1.J$3 = jM11057;
                        tickerChannelsKt$fixedPeriodTicker$1.label = i3;
                        if (interfaceC60322.mo8992(C6008.f15084, tickerChannelsKt$fixedPeriodTicker$1) != coroutineSingletons) {
                        }
                    }
                } else {
                    long j22 = j6;
                    long j23 = j7 - ((jNanoTime - j8) % j7);
                    long j24 = jNanoTime + j23;
                    tickerChannelsKt$fixedPeriodTicker$1.L$0 = interfaceC60323;
                    tickerChannelsKt$fixedPeriodTicker$1.J$0 = j5;
                    long j25 = j5;
                    tickerChannelsKt$fixedPeriodTicker$1.J$1 = j22;
                    tickerChannelsKt$fixedPeriodTicker$1.J$2 = j24;
                    tickerChannelsKt$fixedPeriodTicker$1.J$3 = j7;
                    tickerChannelsKt$fixedPeriodTicker$1.J$4 = jNanoTime;
                    tickerChannelsKt$fixedPeriodTicker$1.J$5 = j9;
                    tickerChannelsKt$fixedPeriodTicker$1.J$6 = j23;
                    tickerChannelsKt$fixedPeriodTicker$1.label = 3;
                    if (AbstractC6231.m11058(j23 / 1000000, tickerChannelsKt$fixedPeriodTicker$1) != coroutineSingletons) {
                        long j26 = j7;
                        j3 = j24;
                        j10 = j22;
                        j4 = j25;
                        jM11057 = j26;
                        interfaceC60322 = interfaceC60323;
                        i3 = 2;
                        j11 = j3 + jM11057;
                        tickerChannelsKt$fixedPeriodTicker$1.L$0 = interfaceC60322;
                        tickerChannelsKt$fixedPeriodTicker$1.J$0 = j4;
                        tickerChannelsKt$fixedPeriodTicker$1.J$1 = j10;
                        tickerChannelsKt$fixedPeriodTicker$1.J$2 = j11;
                        tickerChannelsKt$fixedPeriodTicker$1.J$3 = jM11057;
                        tickerChannelsKt$fixedPeriodTicker$1.label = i3;
                        if (interfaceC60322.mo8992(C6008.f15084, tickerChannelsKt$fixedPeriodTicker$1) != coroutineSingletons) {
                        }
                    }
                }
            }
            return coroutineSingletons;
        }
        long j27 = tickerChannelsKt$fixedPeriodTicker$1.J$2;
        long j28 = tickerChannelsKt$fixedPeriodTicker$1.J$1;
        j4 = tickerChannelsKt$fixedPeriodTicker$1.J$0;
        InterfaceC6032 interfaceC60325 = (InterfaceC6032) tickerChannelsKt$fixedPeriodTicker$1.L$0;
        AbstractC6017.m10769(obj);
        j3 = j27;
        j10 = j28;
        interfaceC60322 = interfaceC60325;
        jM11057 = AbstractC6231.m11057(j4);
        j11 = j3 + jM11057;
        tickerChannelsKt$fixedPeriodTicker$1.L$0 = interfaceC60322;
        tickerChannelsKt$fixedPeriodTicker$1.J$0 = j4;
        tickerChannelsKt$fixedPeriodTicker$1.J$1 = j10;
        tickerChannelsKt$fixedPeriodTicker$1.J$2 = j11;
        tickerChannelsKt$fixedPeriodTicker$1.J$3 = jM11057;
        tickerChannelsKt$fixedPeriodTicker$1.label = i3;
        if (interfaceC60322.mo8992(C6008.f15084, tickerChannelsKt$fixedPeriodTicker$1) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
    
        if (kotlinx.coroutines.AbstractC6231.m11058(r10, r0) != r1) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0089 -> B:14:0x0034). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CoroutineSingletons m10840(long j, long j2, InterfaceC6032 interfaceC6032, ContinuationImpl continuationImpl) {
        TickerChannelsKt$fixedDelayTicker$1 tickerChannelsKt$fixedDelayTicker$1;
        long j3;
        long j4;
        if (continuationImpl instanceof TickerChannelsKt$fixedDelayTicker$1) {
            tickerChannelsKt$fixedDelayTicker$1 = (TickerChannelsKt$fixedDelayTicker$1) continuationImpl;
            int i = tickerChannelsKt$fixedDelayTicker$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tickerChannelsKt$fixedDelayTicker$1.label = i - Integer.MIN_VALUE;
            } else {
                tickerChannelsKt$fixedDelayTicker$1 = new TickerChannelsKt$fixedDelayTicker$1(continuationImpl);
            }
        }
        Object obj = tickerChannelsKt$fixedDelayTicker$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = tickerChannelsKt$fixedDelayTicker$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            tickerChannelsKt$fixedDelayTicker$1.L$0 = interfaceC6032;
            tickerChannelsKt$fixedDelayTicker$1.J$0 = j;
            tickerChannelsKt$fixedDelayTicker$1.J$1 = j2;
            tickerChannelsKt$fixedDelayTicker$1.label = 1;
            if (AbstractC6231.m11058(j2, tickerChannelsKt$fixedDelayTicker$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            j2 = tickerChannelsKt$fixedDelayTicker$1.J$1;
            j = tickerChannelsKt$fixedDelayTicker$1.J$0;
            interfaceC6032 = (InterfaceC6032) tickerChannelsKt$fixedDelayTicker$1.L$0;
            AbstractC6017.m10769(obj);
        } else if (i2 == 2) {
            j4 = tickerChannelsKt$fixedDelayTicker$1.J$1;
            j3 = tickerChannelsKt$fixedDelayTicker$1.J$0;
            interfaceC6032 = (InterfaceC6032) tickerChannelsKt$fixedDelayTicker$1.L$0;
            AbstractC6017.m10769(obj);
            tickerChannelsKt$fixedDelayTicker$1.L$0 = interfaceC6032;
            tickerChannelsKt$fixedDelayTicker$1.J$0 = j3;
            tickerChannelsKt$fixedDelayTicker$1.J$1 = j4;
            tickerChannelsKt$fixedDelayTicker$1.label = 3;
        } else {
            if (i2 != 3) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j4 = tickerChannelsKt$fixedDelayTicker$1.J$1;
            j3 = tickerChannelsKt$fixedDelayTicker$1.J$0;
            interfaceC6032 = (InterfaceC6032) tickerChannelsKt$fixedDelayTicker$1.L$0;
            AbstractC6017.m10769(obj);
            long j5 = j3;
            j2 = j4;
            j = j5;
        }
        tickerChannelsKt$fixedDelayTicker$1.L$0 = interfaceC6032;
        tickerChannelsKt$fixedDelayTicker$1.J$0 = j;
        tickerChannelsKt$fixedDelayTicker$1.J$1 = j2;
        tickerChannelsKt$fixedDelayTicker$1.label = 2;
        if (interfaceC6032.mo8992(C6008.f15084, tickerChannelsKt$fixedDelayTicker$1) != coroutineSingletons) {
            long j6 = j2;
            j3 = j;
            j4 = j6;
            tickerChannelsKt$fixedDelayTicker$1.L$0 = interfaceC6032;
            tickerChannelsKt$fixedDelayTicker$1.J$0 = j3;
            tickerChannelsKt$fixedDelayTicker$1.J$1 = j4;
            tickerChannelsKt$fixedDelayTicker$1.label = 3;
        }
        return coroutineSingletons;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C6022 m10841(int i, int i2, BufferOverflow bufferOverflow) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if (i == -2) {
            if (bufferOverflow != BufferOverflow.SUSPEND) {
                return new C6038(1, bufferOverflow);
            }
            InterfaceC6039.f15139.getClass();
            return new C6022(C6040.f15140);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? bufferOverflow == BufferOverflow.SUSPEND ? new C6022(i) : new C6038(i, bufferOverflow) : new C6022(Integer.MAX_VALUE) : bufferOverflow == BufferOverflow.SUSPEND ? new C6022(0) : new C6038(1, bufferOverflow);
        }
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            return new C6038(1, BufferOverflow.DROP_OLDEST);
        }
        C6755.m11869("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6 A[Catch: all -> 0x00dd, TRY_LEAVE, TryCatch #2 {all -> 0x00dd, blocks: (B:25:0x0088, B:29:0x00ae, B:31:0x00b6, B:24:0x0081), top: B:45:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m10842(InterfaceC6031 interfaceC6031, InterfaceC6032 interfaceC6032, ContinuationImpl continuationImpl) {
        ChannelsKt__DeprecatedKt$toChannel$1 channelsKt__DeprecatedKt$toChannel$1;
        int i;
        int i2;
        InterfaceC6044 interfaceC6044;
        InterfaceC6032 interfaceC60322;
        int i3;
        InterfaceC6044 it;
        int i4;
        InterfaceC6031 interfaceC60312;
        if (continuationImpl instanceof ChannelsKt__DeprecatedKt$toChannel$1) {
            channelsKt__DeprecatedKt$toChannel$1 = (ChannelsKt__DeprecatedKt$toChannel$1) continuationImpl;
            int i5 = channelsKt__DeprecatedKt$toChannel$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$toChannel$1.label = i5 - Integer.MIN_VALUE;
            } else {
                channelsKt__DeprecatedKt$toChannel$1 = new ChannelsKt__DeprecatedKt$toChannel$1(continuationImpl);
            }
        }
        Object obj = channelsKt__DeprecatedKt$toChannel$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = channelsKt__DeprecatedKt$toChannel$1.label;
        if (i6 != 0) {
            try {
                if (i6 == 1) {
                    int i7 = channelsKt__DeprecatedKt$toChannel$1.I$2;
                    i = channelsKt__DeprecatedKt$toChannel$1.I$1;
                    i2 = channelsKt__DeprecatedKt$toChannel$1.I$0;
                    interfaceC6044 = (InterfaceC6044) channelsKt__DeprecatedKt$toChannel$1.L$5;
                    InterfaceC6031 interfaceC60313 = (InterfaceC6031) channelsKt__DeprecatedKt$toChannel$1.L$3;
                    interfaceC60322 = (InterfaceC6032) channelsKt__DeprecatedKt$toChannel$1.L$1;
                    AbstractC6017.m10769(obj);
                    i3 = i7;
                    interfaceC6031 = interfaceC60313;
                    if (((Boolean) obj).booleanValue()) {
                        interfaceC6031.mo10815(null);
                        return interfaceC60322;
                    }
                    C6023 c6023 = (C6023) interfaceC6044;
                    Object objM10821 = c6023.m10821();
                    channelsKt__DeprecatedKt$toChannel$1.L$0 = null;
                    channelsKt__DeprecatedKt$toChannel$1.L$1 = interfaceC60322;
                    channelsKt__DeprecatedKt$toChannel$1.L$2 = null;
                    channelsKt__DeprecatedKt$toChannel$1.L$3 = interfaceC6031;
                    channelsKt__DeprecatedKt$toChannel$1.L$4 = null;
                    channelsKt__DeprecatedKt$toChannel$1.L$5 = c6023;
                    channelsKt__DeprecatedKt$toChannel$1.L$6 = null;
                    channelsKt__DeprecatedKt$toChannel$1.L$7 = null;
                    channelsKt__DeprecatedKt$toChannel$1.I$0 = i2;
                    channelsKt__DeprecatedKt$toChannel$1.I$1 = i;
                    channelsKt__DeprecatedKt$toChannel$1.I$2 = i3;
                    channelsKt__DeprecatedKt$toChannel$1.I$3 = 0;
                    channelsKt__DeprecatedKt$toChannel$1.label = 2;
                    if (interfaceC60322.mo8992(objM10821, channelsKt__DeprecatedKt$toChannel$1) != coroutineSingletons) {
                        it = c6023;
                        i4 = i;
                        interfaceC6032 = interfaceC60322;
                    }
                    return coroutineSingletons;
                }
                if (i6 != 2) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i8 = channelsKt__DeprecatedKt$toChannel$1.I$2;
                int i9 = channelsKt__DeprecatedKt$toChannel$1.I$1;
                i2 = channelsKt__DeprecatedKt$toChannel$1.I$0;
                InterfaceC6044 interfaceC60442 = (InterfaceC6044) channelsKt__DeprecatedKt$toChannel$1.L$5;
                InterfaceC6031 interfaceC60314 = (InterfaceC6031) channelsKt__DeprecatedKt$toChannel$1.L$3;
                InterfaceC6032 interfaceC60323 = (InterfaceC6032) channelsKt__DeprecatedKt$toChannel$1.L$1;
                AbstractC6017.m10769(obj);
                i3 = i8;
                interfaceC6031 = interfaceC60314;
                it = interfaceC60442;
                i4 = i9;
                interfaceC6032 = interfaceC60323;
            } catch (Throwable th) {
                th = th;
                try {
                    throw th;
                } catch (Throwable th2) {
                    m10837(interfaceC60312, th);
                    throw th2;
                }
            }
        } else {
            AbstractC6017.m10769(obj);
            try {
                it = interfaceC6031.iterator();
                i2 = 0;
                i4 = 0;
                i3 = 0;
            } catch (Throwable th3) {
                interfaceC60312 = interfaceC6031;
                th = th3;
                throw th;
            }
        }
        channelsKt__DeprecatedKt$toChannel$1.L$0 = null;
        channelsKt__DeprecatedKt$toChannel$1.L$1 = interfaceC6032;
        channelsKt__DeprecatedKt$toChannel$1.L$2 = null;
        channelsKt__DeprecatedKt$toChannel$1.L$3 = interfaceC6031;
        channelsKt__DeprecatedKt$toChannel$1.L$4 = null;
        channelsKt__DeprecatedKt$toChannel$1.L$5 = it;
        channelsKt__DeprecatedKt$toChannel$1.L$6 = null;
        channelsKt__DeprecatedKt$toChannel$1.L$7 = null;
        channelsKt__DeprecatedKt$toChannel$1.I$0 = i2;
        channelsKt__DeprecatedKt$toChannel$1.I$1 = i4;
        channelsKt__DeprecatedKt$toChannel$1.I$2 = i3;
        channelsKt__DeprecatedKt$toChannel$1.label = 1;
        C6023 c60232 = (C6023) it;
        Object objM10823 = c60232.m10823(channelsKt__DeprecatedKt$toChannel$1);
        if (objM10823 == coroutineSingletons) {
            return coroutineSingletons;
        }
        interfaceC60322 = interfaceC6032;
        i = i4;
        interfaceC6044 = c60232;
        obj = objM10823;
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
