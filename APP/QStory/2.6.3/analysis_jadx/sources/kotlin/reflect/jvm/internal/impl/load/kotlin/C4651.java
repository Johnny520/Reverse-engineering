package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Set;
import kotlin.collections.AbstractC4347;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4826;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4833;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import p070.C6898;
import p072.C6923;
import p077.C6970;
import p175.AbstractC7739;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4651 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C6898 f13588;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C6898 f13589;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C4833 f13592;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Set f13591 = AbstractC7739.m13055(KotlinClassHeader$Kind.CLASS);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Set f13590 = AbstractC4347.m8845(new KotlinClassHeader$Kind[]{KotlinClassHeader$Kind.FILE_FACADE, KotlinClassHeader$Kind.MULTIFILE_CLASS_PART});

    static {
        new C6898(new int[]{1, 1, 2}, false);
        f13589 = new C6898(new int[]{1, 1, 11}, false);
        f13588 = new C6898(new int[]{1, 1, 13}, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean m9253(C6970 c6970) {
        m9256().f14090.getClass();
        m9256().f14090.getClass();
        C6923 c6923 = c6970.f18660;
        return (c6923.f18474 & 2) != 0 && c6923.f18472.equals(f13589);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C6898 m9254() {
        m9256().f14090.getClass();
        return C6898.f18356;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4826 m9255(C6970 c6970) {
        m9256().f14090.getClass();
        C6923 c6923 = c6970.f18660;
        C6898 c6898 = c6923.f18472;
        C6898 c68982 = c6923.f18472;
        C6898 c6898M9254 = m9254();
        c6898M9254.getClass();
        C6898 c68983 = c68982.f18357 ? C6898.f18356 : C6898.f18355;
        int i = c68983.f18410;
        int i2 = c6898M9254.f18410;
        if (i > i2 || (i >= i2 && c68983.f18409 > c6898M9254.f18409)) {
            c6898M9254 = c68983;
        }
        int i3 = c68982.f18409;
        int i4 = c68982.f18410;
        boolean z = false;
        if ((i4 != 1 || i3 != 0) && i4 != 0) {
            int i5 = c6898M9254.f18410;
            if (i4 > i5 || (i4 >= i5 && i3 > c6898M9254.f18409)) {
                z = true;
            }
            z = !z;
        }
        if (z) {
            return null;
        }
        C6898 c68984 = C6898.f18356;
        C6898 c6898M92542 = m9254();
        C6898 c6898M92543 = m9254();
        boolean z2 = c6898.f18357;
        c6898M92543.getClass();
        C6898 c68985 = z2 ? c68984 : C6898.f18355;
        int i6 = c68985.f18410;
        int i7 = c6898M92543.f18410;
        return new C4826(c6898, c68984, c6898M92542, (i6 <= i7 && (i6 < i7 || c68985.f18409 <= c6898M92543.f18409)) ? c6898M92543 : c68985, c6970.m12285());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4833 m9256() {
        C4833 c4833 = this.f13592;
        if (c4833 != null) {
            return c4833;
        }
        AbstractC4395.m8908("components");
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final DeserializedContainerAbiStability m9257(C6970 c6970) {
        m9256().f14090.getClass();
        int i = c6970.f18660.f18474;
        return ((i & 16) == 0 || (i & 32) != 0) ? DeserializedContainerAbiStability.STABLE : DeserializedContainerAbiStability.UNSTABLE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4796 m9258(kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4466 r14, p077.C6970 r15) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.C4651.m9258(kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世楪兰苏哲, 飘花落叶言世楪子哲兰苏.飘花落叶言子楪世哲苏兰):kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪哲苏兰世");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4831 m9259(p077.C6970 r10) {
        /*
            r9 = this;
            java.lang.String r0 = "Could not read data from "
            飘花落叶言世楪哲子兰苏.飘花落叶言子楪世苏兰哲 r1 = r10.f18660
            飘花落叶言世楪哲兰子苏.飘花落叶言子楪世兰哲苏 r2 = r1.f18472
            java.lang.String[] r3 = r1.f18471
            if (r3 != 0) goto Lc
            java.lang.String[] r3 = r1.f18470
        Lc:
            r4 = 0
            if (r3 == 0) goto L1a
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r5 = r1.f18473
            java.util.Set r6 = kotlin.reflect.jvm.internal.impl.load.kotlin.C4651.f13591
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L1a
            goto L1b
        L1a:
            r3 = r4
        L1b:
            if (r3 != 0) goto L1f
            goto L88
        L1f:
            java.lang.String[] r1 = r1.f18469
            if (r1 != 0) goto L25
            goto L88
        L25:
            kotlin.Pair r0 = p067.C6893.m12166(r3, r1)     // Catch: java.lang.Throwable -> L2b kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L2d
            goto L86
        L2b:
            r0 = move-exception
            goto L3c
        L2d:
            r1 = move-exception
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2b
            java.lang.String r5 = r10.m12285()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r0 = r0.concat(r5)     // Catch: java.lang.Throwable -> L2b
            r3.<init>(r0, r1)     // Catch: java.lang.Throwable -> L2b
            throw r3     // Catch: java.lang.Throwable -> L2b
        L3c:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪苏兰哲世 r1 = r9.m9256()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪哲世苏兰 r1 = r1.f14090
            r1.getClass()
            飘花落叶言世楪哲兰子苏.飘花落叶言子楪世兰哲苏 r1 = r9.m9254()
            r1.getClass()
            boolean r3 = r2.f18357
            if (r3 == 0) goto L53
            飘花落叶言世楪哲兰子苏.飘花落叶言子楪世兰哲苏 r3 = p070.C6898.f18356
            goto L55
        L53:
            飘花落叶言世楪哲兰子苏.飘花落叶言子楪世兰哲苏 r3 = p070.C6898.f18355
        L55:
            int r5 = r3.f18410
            int r6 = r1.f18410
            if (r5 <= r6) goto L5c
            goto L65
        L5c:
            if (r5 >= r6) goto L5f
            goto L66
        L5f:
            int r5 = r3.f18409
            int r6 = r1.f18409
            if (r5 <= r6) goto L66
        L65:
            r1 = r3
        L66:
            int r3 = r2.f18409
            int r5 = r2.f18410
            r6 = 0
            r7 = 1
            if (r5 != r7) goto L71
            if (r3 != 0) goto L71
            goto L83
        L71:
            if (r5 != 0) goto L74
            goto L83
        L74:
            int r8 = r1.f18410
            if (r5 <= r8) goto L7a
        L78:
            r6 = r7
            goto L82
        L7a:
            if (r5 >= r8) goto L7d
            goto L82
        L7d:
            int r1 = r1.f18409
            if (r3 <= r1) goto L82
            goto L78
        L82:
            r6 = r6 ^ r7
        L83:
            if (r6 != 0) goto Lb0
            r0 = r4
        L86:
            if (r0 != 0) goto L89
        L88:
            return r4
        L89:
            java.lang.Object r1 = r0.component1()
            飘花落叶言世楪兰子苏哲.飘花落叶言子楪世兰哲苏 r1 = (p067.C6885) r1
            java.lang.Object r0 = r0.component2()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class) r0
            kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪兰世哲苏 r3 = new kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪兰世哲苏
            r9.m9255(r10)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪兰苏哲世 r4 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪兰苏哲世
            boolean r5 = r9.m9253(r10)
            r4.<init>(r5)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability r9 = r9.m9257(r10)
            r3.<init>(r10, r4, r9)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪苏世哲兰 r9 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪苏世哲兰
            r9.<init>(r1, r0, r2, r3)
            return r9
        Lb0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.C4651.m9259(飘花落叶言世楪子哲兰苏.飘花落叶言子楪世哲苏兰):kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪苏世哲兰");
    }
}
