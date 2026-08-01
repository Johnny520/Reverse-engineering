package io.ktor.util.cio;

import androidx.profileinstaller.AbstractC3275;
import io.ktor.utils.p007io.C5058;
import java.io.Closeable;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.AbstractC6017;
import kotlin.AbstractC6019;
import kotlin.C6008;
import kotlin.InterfaceC6016;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.util.cio.FileChannelsKt$readChannel$writer$1", m556f = "FileChannels.kt", m557l = {42}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class FileChannelsKt$readChannel$writer$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ long $endInclusive;
    final /* synthetic */ long $fileLength;
    final /* synthetic */ InterfaceC6016 $randomAccessFile$delegate;
    final /* synthetic */ long $start;
    int I$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileChannelsKt$readChannel$writer$1(long j, long j2, long j3, InterfaceC6016 interfaceC6016, InterfaceC5189<? super FileChannelsKt$readChannel$writer$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$start = j;
        this.$endInclusive = j2;
        this.$fileLength = j3;
        this.$randomAccessFile$delegate = interfaceC6016;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        FileChannelsKt$readChannel$writer$1 fileChannelsKt$readChannel$writer$1 = new FileChannelsKt$readChannel$writer$1(this.$start, this.$endInclusive, this.$fileLength, this.$randomAccessFile$delegate, interfaceC5189);
        fileChannelsKt$readChannel$writer$1.L$0 = obj;
        return fileChannelsKt$readChannel$writer$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(C5058 c5058, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((FileChannelsKt$readChannel$writer$1) create(c5058, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        Closeable closeable;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C5058 c5058 = (C5058) this.L$0;
            long j = this.$start;
            if (j < 0) {
                C6755.m11873(AbstractC3275.m5143(j, "start position shouldn't be negative but it is "));
                return null;
            }
            long j2 = this.$endInclusive;
            long j3 = this.$fileLength;
            if (j2 > j3 - 1) {
                throw new IllegalArgumentException(("endInclusive points to the position out of the file: file size = " + j3 + ", endInclusive = " + j2).toString());
            }
            RandomAccessFile randomAccessFile = (RandomAccessFile) this.$randomAccessFile$delegate.getValue();
            long j4 = this.$start;
            long j5 = this.$endInclusive;
            try {
                FileChannel channel = randomAccessFile.getChannel();
                channel.getClass();
                this.L$0 = randomAccessFile;
                this.I$0 = 0;
                this.label = 1;
                if (AbstractC5017.m9109(channel, c5058, j4, j5, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                closeable = randomAccessFile;
                if (closeable != null) {
                }
                return C6008.f15084;
            } catch (Throwable th2) {
                th = th2;
                closeable = randomAccessFile;
                if (closeable != null) {
                    throw th;
                }
                try {
                    closeable.close();
                    throw th;
                } catch (Throwable th3) {
                    AbstractC6019.m10775(th, th3);
                    throw th;
                }
            }
        }
        if (i != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        closeable = (Closeable) this.L$0;
        try {
            AbstractC6017.m10769(obj);
            if (closeable != null) {
                closeable.close();
            }
            return C6008.f15084;
        } catch (Throwable th4) {
            th = th4;
            if (closeable != null) {
            }
        }
    }
}
