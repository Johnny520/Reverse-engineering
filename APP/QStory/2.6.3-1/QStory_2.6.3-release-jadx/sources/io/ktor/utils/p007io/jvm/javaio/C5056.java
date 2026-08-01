package io.ktor.utils.p007io.jvm.javaio;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.InterfaceC5084;
import java.io.InputStream;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.AbstractC6231;

/* JADX INFO: renamed from: io.ktor.utils.io.jvm.javaio.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5056 extends InputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5084 f13069;

    public C5056(InterfaceC5084 interfaceC5084) {
        this.f13069 = interfaceC5084;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC5076.m9226(this.f13069);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws Throwable {
        bArr.getClass();
        InterfaceC5084 interfaceC5084 = this.f13069;
        if (interfaceC5084.mo9200()) {
            return -1;
        }
        if (interfaceC5084.mo9202().mo11163()) {
            AbstractC6231.m11044(EmptyCoroutineContext.INSTANCE, new BlockingKt$toInputStream$1$blockingWait$1(interfaceC5084, null));
        }
        int iMo11166 = interfaceC5084.mo9202().mo11166(i, bArr, Math.min(AbstractC5076.m9242(interfaceC5084), i2) + i);
        return iMo11166 >= 0 ? iMo11166 : interfaceC5084.mo9200() ? -1 : 0;
    }

    @Override // java.io.InputStream
    public final int read() throws Throwable {
        InterfaceC5084 interfaceC5084 = this.f13069;
        if (interfaceC5084.mo9200()) {
            return -1;
        }
        if (interfaceC5084.mo9202().mo11163()) {
            AbstractC6231.m11044(EmptyCoroutineContext.INSTANCE, new BlockingKt$toInputStream$1$blockingWait$1(interfaceC5084, null));
        }
        if (interfaceC5084.mo9200()) {
            return -1;
        }
        return interfaceC5084.mo9202().readByte() & DefaultClassResolver.NAME;
    }
}
