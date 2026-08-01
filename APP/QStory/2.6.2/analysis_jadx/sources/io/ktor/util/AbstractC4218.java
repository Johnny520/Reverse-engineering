package io.ktor.util;

import java.util.List;
import kotlinx.coroutines.AbstractC5394;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5401;
import kotlinx.coroutines.C5416;
import kotlinx.coroutines.C5458;
import kotlinx.coroutines.C5466;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.AbstractC5204;
import kotlinx.coroutines.channels.C5189;
import p095.C7206;
import p095.ExecutorC7207;
import p253.AbstractC8189;

/* JADX INFO: renamed from: io.ktor.util.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4218 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5416 f12704;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final List f12706 = AbstractC8189.m13659("NativePRNGNonBlocking", "WINDOWS-PRNG", "DRBG");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5189 f12705 = AbstractC5204.m10278(1024, 6, null);

    static {
        C5401 c5401 = new C5401("nonce-generator");
        C7206 c7206 = AbstractC5394.f15030;
        f12704 = AbstractC5398.m10474(C5466.f15126, ExecutorC7207.f19230.plus(C5458.f15108).plus(c5401), CoroutineStart.LAZY, new NonceKt$nonceGeneratorJob$1(null));
    }
}
