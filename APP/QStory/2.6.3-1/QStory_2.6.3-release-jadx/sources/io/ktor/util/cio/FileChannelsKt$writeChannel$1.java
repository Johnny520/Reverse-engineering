package io.ktor.util.cio;

import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.C5061;
import io.ktor.utils.p007io.InterfaceC5084;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.AbstractC6017;
import kotlin.AbstractC6019;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.util.cio.FileChannelsKt$writeChannel$1", m556f = "FileChannels.kt", m557l = {104}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lio/ktor/utils/io/飘花落叶言子世楪苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子世楪苏兰哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class FileChannelsKt$writeChannel$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ File $this_writeChannel;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileChannelsKt$writeChannel$1(File file, InterfaceC5189<? super FileChannelsKt$writeChannel$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_writeChannel = file;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        FileChannelsKt$writeChannel$1 fileChannelsKt$writeChannel$1 = new FileChannelsKt$writeChannel$1(this.$this_writeChannel, interfaceC5189);
        fileChannelsKt$writeChannel$1.L$0 = obj;
        return fileChannelsKt$writeChannel$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(C5061 c5061, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((FileChannelsKt$writeChannel$1) create(c5061, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r0v5 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Closeable closeable;
        ?? r0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C5061 c5061 = (C5061) this.L$0;
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.$this_writeChannel, "rw");
            try {
                InterfaceC5084 interfaceC5084 = c5061.f13076;
                FileChannel channel = randomAccessFile.getChannel();
                channel.getClass();
                this.L$0 = randomAccessFile;
                this.L$1 = randomAccessFile;
                this.I$0 = 0;
                this.label = 1;
                obj = AbstractC5076.m9241(interfaceC5084, channel, Long.MAX_VALUE, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                closeable = randomAccessFile;
                r0 = closeable;
            } catch (Throwable th) {
                th = th;
                closeable = randomAccessFile;
                if (closeable != null) {
                }
                throw th;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            RandomAccessFile randomAccessFile2 = (RandomAccessFile) this.L$1;
            closeable = (Closeable) this.L$0;
            try {
                AbstractC6017.m10769(obj);
                r0 = randomAccessFile2;
            } catch (Throwable th2) {
                th = th2;
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (Throwable th3) {
                        AbstractC6019.m10775(th, th3);
                    }
                }
                throw th;
            }
        }
        r0.setLength(((Number) obj).longValue());
        if (closeable != null) {
            closeable.close();
        }
        return C6008.f15084;
    }
}
