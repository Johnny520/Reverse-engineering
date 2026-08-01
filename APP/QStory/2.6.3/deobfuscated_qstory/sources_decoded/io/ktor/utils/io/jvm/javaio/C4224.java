package io.ktor.utils.io.jvm.javaio;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import io.ktor.utils.io.AbstractC4244;
import io.ktor.utils.io.InterfaceC4252;
import java.io.InputStream;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.AbstractC5399;

/* JADX INFO: renamed from: io.ktor.utils.io.jvm.javaio.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4224 extends InputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC4252 f12724;

    public C4224(InterfaceC4252 interfaceC4252) {
        this.f12724 = interfaceC4252;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC4244.m8667(this.f12724);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws Throwable {
        bArr.getClass();
        InterfaceC4252 interfaceC4252 = this.f12724;
        if (interfaceC4252.mo8641()) {
            return -1;
        }
        if (interfaceC4252.mo8643().mo10604()) {
            AbstractC5399.m10485(EmptyCoroutineContext.INSTANCE, new BlockingKt$toInputStream$1$blockingWait$1(interfaceC4252, null));
        }
        int iMo10607 = interfaceC4252.mo8643().mo10607(i, bArr, Math.min(AbstractC4244.m8683(interfaceC4252), i2) + i);
        return iMo10607 >= 0 ? iMo10607 : interfaceC4252.mo8641() ? -1 : 0;
    }

    @Override // java.io.InputStream
    public final int read() throws Throwable {
        InterfaceC4252 interfaceC4252 = this.f12724;
        if (interfaceC4252.mo8641()) {
            return -1;
        }
        if (interfaceC4252.mo8643().mo10604()) {
            AbstractC5399.m10485(EmptyCoroutineContext.INSTANCE, new BlockingKt$toInputStream$1$blockingWait$1(interfaceC4252, null));
        }
        if (interfaceC4252.mo8641()) {
            return -1;
        }
        return interfaceC4252.mo8643().readByte() & DefaultClassResolver.NAME;
    }
}
