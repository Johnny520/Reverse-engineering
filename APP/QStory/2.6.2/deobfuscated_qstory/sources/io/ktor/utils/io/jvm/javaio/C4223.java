package io.ktor.utils.io.jvm.javaio;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import io.ktor.utils.io.AbstractC4243;
import io.ktor.utils.io.InterfaceC4251;
import java.io.InputStream;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.AbstractC5398;

/* JADX INFO: renamed from: io.ktor.utils.io.jvm.javaio.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4223 extends InputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC4251 f12720;

    public C4223(InterfaceC4251 interfaceC4251) {
        this.f12720 = interfaceC4251;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC4243.m8677(this.f12720);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws Throwable {
        bArr.getClass();
        InterfaceC4251 interfaceC4251 = this.f12720;
        if (interfaceC4251.mo8651()) {
            return -1;
        }
        if (interfaceC4251.mo8653().mo10601()) {
            AbstractC5398.m10481(EmptyCoroutineContext.INSTANCE, new BlockingKt$toInputStream$1$blockingWait$1(interfaceC4251, null));
        }
        int iMo10603 = interfaceC4251.mo8653().mo10603(i, bArr, Math.min(AbstractC4243.m8693(interfaceC4251), i2) + i);
        return iMo10603 >= 0 ? iMo10603 : interfaceC4251.mo8651() ? -1 : 0;
    }

    @Override // java.io.InputStream
    public final int read() throws Throwable {
        InterfaceC4251 interfaceC4251 = this.f12720;
        if (interfaceC4251.mo8651()) {
            return -1;
        }
        if (interfaceC4251.mo8653().mo10601()) {
            AbstractC5398.m10481(EmptyCoroutineContext.INSTANCE, new BlockingKt$toInputStream$1$blockingWait$1(interfaceC4251, null));
        }
        if (interfaceC4251.mo8651()) {
            return -1;
        }
        return interfaceC4251.mo8653().readByte() & DefaultClassResolver.NAME;
    }
}
