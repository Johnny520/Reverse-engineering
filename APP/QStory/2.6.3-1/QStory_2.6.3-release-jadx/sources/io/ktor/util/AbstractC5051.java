package io.ktor.util;

import java.util.List;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6234;
import kotlinx.coroutines.C6249;
import kotlinx.coroutines.C6291;
import kotlinx.coroutines.C6299;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.AbstractC6037;
import kotlinx.coroutines.channels.C6022;
import p050.AbstractC7176;
import p111.C8036;
import p111.ExecutorC8037;

/* JADX INFO: renamed from: io.ktor.util.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5051 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C6249 f13053;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final List f13055 = AbstractC7176.m12490("NativePRNGNonBlocking", "WINDOWS-PRNG", "DRBG");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C6022 f13054 = AbstractC6037.m10841(1024, 6, null);

    static {
        C6234 c6234 = new C6234("nonce-generator");
        C8036 c8036 = AbstractC6227.f15375;
        f13053 = AbstractC6231.m11037(C6299.f15471, ExecutorC8037.f19570.plus(C6291.f15453).plus(c6234), CoroutineStart.LAZY, new NonceKt$nonceGeneratorJob$1(null));
    }
}
