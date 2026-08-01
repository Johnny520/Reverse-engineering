package io.ktor.utils.io.jvm.javaio;

import io.ktor.utils.io.InterfaceC4246;
import java.io.OutputStream;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.AbstractC5398;

/* JADX INFO: renamed from: io.ktor.utils.io.jvm.javaio.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4222 extends OutputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC4246 f12719;

    public C4222(InterfaceC4246 interfaceC4246) {
        this.f12719 = interfaceC4246;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        AbstractC5398.m10481(EmptyCoroutineContext.INSTANCE, new BlockingKt$toOutputStream$1$close$1(this.f12719, null));
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws Throwable {
        AbstractC5398.m10481(EmptyCoroutineContext.INSTANCE, new BlockingKt$toOutputStream$1$flush$1(this.f12719, null));
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws Throwable {
        bArr.getClass();
        AbstractC5398.m10481(EmptyCoroutineContext.INSTANCE, new BlockingKt$toOutputStream$1$write$2(this.f12719, bArr, i, i2, null));
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws Throwable {
        AbstractC5398.m10481(EmptyCoroutineContext.INSTANCE, new BlockingKt$toOutputStream$1$write$1(this.f12719, i, null));
    }
}
