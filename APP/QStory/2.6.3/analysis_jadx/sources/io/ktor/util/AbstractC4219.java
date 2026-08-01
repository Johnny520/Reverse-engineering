package io.ktor.util;

import java.util.List;
import kotlinx.coroutines.AbstractC5395;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5402;
import kotlinx.coroutines.C5417;
import kotlinx.coroutines.C5459;
import kotlinx.coroutines.C5467;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.AbstractC5205;
import kotlinx.coroutines.channels.C5190;
import p034.AbstractC6347;
import p095.C7207;
import p095.ExecutorC7208;

/* JADX INFO: renamed from: io.ktor.util.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4219 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5417 f12708;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final List f12710 = AbstractC6347.m11931("NativePRNGNonBlocking", "WINDOWS-PRNG", "DRBG");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5190 f12709 = AbstractC5205.m10282(1024, 6, null);

    static {
        C5402 c5402 = new C5402("nonce-generator");
        C7207 c7207 = AbstractC5395.f15030;
        f12708 = AbstractC5399.m10478(C5467.f15126, ExecutorC7208.f19225.plus(C5459.f15108).plus(c5402), CoroutineStart.LAZY, new NonceKt$nonceGeneratorJob$1(null));
    }
}
