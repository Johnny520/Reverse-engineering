package io.ktor.util.cio;

import androidx.profileinstaller.AbstractC2442;
import com.bumptech.glide.AbstractC3065;
import io.ktor.utils.io.C4225;
import java.io.Closeable;
import java.io.IOException;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.util.cio.FileChannelsAtNioPathKt$readChannel$1", f = "FileChannelsAtNioPath.kt", l = {34}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;)V"}, k = 3, mv = {2, 0, 0})
final class FileChannelsAtNioPathKt$readChannel$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ long $endInclusive;
    final /* synthetic */ long $fileLength;
    final /* synthetic */ long $start;
    final /* synthetic */ Path $this_readChannel;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileChannelsAtNioPathKt$readChannel$1(long j, long j2, long j3, Path path, InterfaceC4356<? super FileChannelsAtNioPathKt$readChannel$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$start = j;
        this.$endInclusive = j2;
        this.$fileLength = j3;
        this.$this_readChannel = path;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        FileChannelsAtNioPathKt$readChannel$1 fileChannelsAtNioPathKt$readChannel$1 = new FileChannelsAtNioPathKt$readChannel$1(this.$start, this.$endInclusive, this.$fileLength, this.$this_readChannel, interfaceC4356);
        fileChannelsAtNioPathKt$readChannel$1.L$0 = obj;
        return fileChannelsAtNioPathKt$readChannel$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(C4225 c4225, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((FileChannelsAtNioPathKt$readChannel$1) create(c4225, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        Throwable th;
        Closeable closeable;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            closeable = (Closeable) this.L$0;
            try {
                AbstractC5184.m10206(obj);
                AbstractC3065.m6841(closeable, null);
                return C5175.f14739;
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    AbstractC3065.m6841(closeable, th);
                    throw th3;
                }
            }
        }
        AbstractC5184.m10206(obj);
        C4225 c4225 = (C4225) this.L$0;
        long j = this.$start;
        if (j < 0) {
            C5919.m11253(AbstractC2442.m4572(j, "start position shouldn't be negative but it is "));
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
            if (AbstractC4184.m8560(seekableByteChannelNewByteChannel, c4225, j4, j5, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            closeable = seekableByteChannelNewByteChannel;
            AbstractC3065.m6841(closeable, null);
            return C5175.f14739;
        } catch (Throwable th4) {
            th = th4;
            closeable = seekableByteChannelNewByteChannel;
            throw th;
        }
    }
}
