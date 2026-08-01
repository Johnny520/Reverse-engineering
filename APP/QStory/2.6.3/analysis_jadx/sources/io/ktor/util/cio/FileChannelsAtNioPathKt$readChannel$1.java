package io.ktor.util.cio;

import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.AbstractC2905;
import io.ktor.utils.io.C4226;
import java.io.Closeable;
import java.io.IOException;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.util.cio.FileChannelsAtNioPathKt$readChannel$1", f = "FileChannelsAtNioPath.kt", l = {34}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;)V"}, k = 3, mv = {2, 0, 0})
final class FileChannelsAtNioPathKt$readChannel$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ long $endInclusive;
    final /* synthetic */ long $fileLength;
    final /* synthetic */ long $start;
    final /* synthetic */ Path $this_readChannel;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileChannelsAtNioPathKt$readChannel$1(long j, long j2, long j3, Path path, InterfaceC4357<? super FileChannelsAtNioPathKt$readChannel$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$start = j;
        this.$endInclusive = j2;
        this.$fileLength = j3;
        this.$this_readChannel = path;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        FileChannelsAtNioPathKt$readChannel$1 fileChannelsAtNioPathKt$readChannel$1 = new FileChannelsAtNioPathKt$readChannel$1(this.$start, this.$endInclusive, this.$fileLength, this.$this_readChannel, interfaceC4357);
        fileChannelsAtNioPathKt$readChannel$1.L$0 = obj;
        return fileChannelsAtNioPathKt$readChannel$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(C4226 c4226, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((FileChannelsAtNioPathKt$readChannel$1) create(c4226, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        Throwable th;
        Closeable closeable;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            closeable = (Closeable) this.L$0;
            try {
                AbstractC5185.m10210(obj);
                AbstractC2905.m6308(closeable, null);
                return C5176.f14739;
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    AbstractC2905.m6308(closeable, th);
                    throw th3;
                }
            }
        }
        AbstractC5185.m10210(obj);
        C4226 c4226 = (C4226) this.L$0;
        long j = this.$start;
        if (j < 0) {
            C5925.m11314(AbstractC2442.m4583(j, "start position shouldn't be negative but it is "));
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
            if (AbstractC4185.m8550(seekableByteChannelNewByteChannel, c4226, j4, j5, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            closeable = seekableByteChannelNewByteChannel;
            AbstractC2905.m6308(closeable, null);
            return C5176.f14739;
        } catch (Throwable th4) {
            th = th4;
            closeable = seekableByteChannelNewByteChannel;
            throw th;
        }
    }
}
