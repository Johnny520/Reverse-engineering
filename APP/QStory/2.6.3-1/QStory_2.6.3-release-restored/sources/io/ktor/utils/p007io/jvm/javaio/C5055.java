package io.ktor.utils.p007io.jvm.javaio;

import io.ktor.utils.p007io.InterfaceC5079;
import java.io.OutputStream;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.AbstractC6231;

/* JADX INFO: renamed from: io.ktor.utils.io.jvm.javaio.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5055 extends OutputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5079 f13068;

    public C5055(InterfaceC5079 interfaceC5079) {
        this.f13068 = interfaceC5079;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        AbstractC6231.m11044(EmptyCoroutineContext.INSTANCE, new BlockingKt$toOutputStream$1$close$1(this.f13068, null));
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws Throwable {
        AbstractC6231.m11044(EmptyCoroutineContext.INSTANCE, new BlockingKt$toOutputStream$1$flush$1(this.f13068, null));
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws Throwable {
        bArr.getClass();
        AbstractC6231.m11044(EmptyCoroutineContext.INSTANCE, new BlockingKt$toOutputStream$1$write$2(this.f13068, bArr, i, i2, null));
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws Throwable {
        AbstractC6231.m11044(EmptyCoroutineContext.INSTANCE, new BlockingKt$toOutputStream$1$write$1(this.f13068, i, null));
    }
}
