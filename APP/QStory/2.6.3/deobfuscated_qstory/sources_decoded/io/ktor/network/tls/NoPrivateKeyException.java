package io.ktor.network.tls;

import java.security.KeyStore;
import kotlin.Metadata;
import kotlinx.coroutines.InterfaceC5434;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\r¨\u0006\u000e"}, d2 = {"Lio/ktor/network/tls/NoPrivateKeyException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "Lkotlinx/coroutines/飘花落叶言子楪兰苏世哲;", "", "alias", "Ljava/security/KeyStore;", "store", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/security/KeyStore;)V", "createCopy", "()Lio/ktor/network/tls/NoPrivateKeyException;", "Ljava/lang/String;", "Ljava/security/KeyStore;", "ktor-network-tls"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NoPrivateKeyException extends IllegalStateException implements InterfaceC5434 {
    private final String alias;
    private final KeyStore store;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoPrivateKeyException(String str, KeyStore keyStore) {
        super("Failed to find private key for alias " + str + ". Please check your key store: " + keyStore);
        str.getClass();
        keyStore.getClass();
        this.alias = str;
        this.store = keyStore;
    }

    @Override // kotlinx.coroutines.InterfaceC5434
    public NoPrivateKeyException createCopy() {
        NoPrivateKeyException noPrivateKeyException = new NoPrivateKeyException(this.alias, this.store);
        noPrivateKeyException.initCause(this);
        return noPrivateKeyException;
    }
}
