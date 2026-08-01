package io.ktor.util.cio;

import androidx.profileinstaller.AbstractC3275;
import com.alibaba.fastjson2.AbstractC3738;
import io.ktor.utils.p007io.C5058;
import java.io.Closeable;
import java.io.IOException;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import kotlin.AbstractC6017;
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
@InterfaceC7691(m555c = "io.ktor.util.cio.FileChannelsAtNioPathKt$readChannel$1", m556f = "FileChannelsAtNioPath.kt", m557l = {34}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class FileChannelsAtNioPathKt$readChannel$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ long $endInclusive;
    final /* synthetic */ long $fileLength;
    final /* synthetic */ long $start;
    final /* synthetic */ Path $this_readChannel;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileChannelsAtNioPathKt$readChannel$1(long j, long j2, long j3, Path path, InterfaceC5189<? super FileChannelsAtNioPathKt$readChannel$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$start = j;
        this.$endInclusive = j2;
        this.$fileLength = j3;
        this.$this_readChannel = path;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        FileChannelsAtNioPathKt$readChannel$1 fileChannelsAtNioPathKt$readChannel$1 = new FileChannelsAtNioPathKt$readChannel$1(this.$start, this.$endInclusive, this.$fileLength, this.$this_readChannel, interfaceC5189);
        fileChannelsAtNioPathKt$readChannel$1.L$0 = obj;
        return fileChannelsAtNioPathKt$readChannel$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(C5058 c5058, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((FileChannelsAtNioPathKt$readChannel$1) create(c5058, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        Throwable th;
        Closeable closeable;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            closeable = (Closeable) this.L$0;
            try {
                AbstractC6017.m10769(obj);
                AbstractC3738.m6868(closeable, null);
                return C6008.f15084;
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    AbstractC3738.m6868(closeable, th);
                    throw th3;
                }
            }
        }
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
        SeekableByteChannel seekableByteChannelNewByteChannel = Files.newByteChannel(this.$this_readChannel, new OpenOption[0]);
        long j4 = this.$start;
        long j5 = this.$endInclusive;
        try {
            seekableByteChannelNewByteChannel.getClass();
            this.L$0 = seekableByteChannelNewByteChannel;
            this.label = 1;
            if (AbstractC5017.m9109(seekableByteChannelNewByteChannel, c5058, j4, j5, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            closeable = seekableByteChannelNewByteChannel;
            AbstractC3738.m6868(closeable, null);
            return C6008.f15084;
        } catch (Throwable th4) {
            th = th4;
            closeable = seekableByteChannelNewByteChannel;
            throw th;
        }
    }
}
