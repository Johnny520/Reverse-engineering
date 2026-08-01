package io.ktor.utils.io.jvm.javaio;

import io.ktor.utils.io.InterfaceC4247;
import java.io.OutputStream;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.AbstractC5399;

/* JADX INFO: renamed from: io.ktor.utils.io.jvm.javaio.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4223 extends OutputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC4247 f12723;

    public C4223(InterfaceC4247 interfaceC4247) {
        this.f12723 = interfaceC4247;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        AbstractC5399.m10485(EmptyCoroutineContext.INSTANCE, new BlockingKt$toOutputStream$1$close$1(this.f12723, null));
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws Throwable {
        AbstractC5399.m10485(EmptyCoroutineContext.INSTANCE, new BlockingKt$toOutputStream$1$flush$1(this.f12723, null));
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws Throwable {
        bArr.getClass();
        AbstractC5399.m10485(EmptyCoroutineContext.INSTANCE, new BlockingKt$toOutputStream$1$write$2(this.f12723, bArr, i, i2, null));
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws Throwable {
        AbstractC5399.m10485(EmptyCoroutineContext.INSTANCE, new BlockingKt$toOutputStream$1$write$1(this.f12723, i, null));
    }
}
