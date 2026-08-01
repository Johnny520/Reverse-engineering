package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import java.util.Set;
import kotlin.collections.AbstractC4346;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4825;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4832;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import p070.C6897;
import p072.C6922;
import p077.C6969;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4650 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C6897 f13584;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C6897 f13585;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C4832 f13588;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Set f13587 = AbstractC0455.m1140(KotlinClassHeader$Kind.CLASS);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Set f13586 = AbstractC4346.m8852(new KotlinClassHeader$Kind[]{KotlinClassHeader$Kind.FILE_FACADE, KotlinClassHeader$Kind.MULTIFILE_CLASS_PART});

    static {
        new C6897(new int[]{1, 1, 2}, false);
        f13585 = new C6897(new int[]{1, 1, 11}, false);
        f13584 = new C6897(new int[]{1, 1, 13}, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean m9263(C6969 c6969) {
        m9266().f14086.getClass();
        m9266().f14086.getClass();
        C6922 c6922 = c6969.f18665;
        return (c6922.f18479 & 2) != 0 && c6922.f18477.equals(f13585);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C6897 m9264() {
        m9266().f14086.getClass();
        return C6897.f18361;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4825 m9265(C6969 c6969) {
        m9266().f14086.getClass();
        C6922 c6922 = c6969.f18665;
        C6897 c6897 = c6922.f18477;
        C6897 c68972 = c6922.f18477;
        C6897 c6897M9264 = m9264();
        c6897M9264.getClass();
        C6897 c68973 = c68972.f18362 ? C6897.f18361 : C6897.f18360;
        int i = c68973.f18415;
        int i2 = c6897M9264.f18415;
        if (i > i2 || (i >= i2 && c68973.f18414 > c6897M9264.f18414)) {
            c6897M9264 = c68973;
        }
        int i3 = c68972.f18414;
        int i4 = c68972.f18415;
        boolean z = false;
        if ((i4 != 1 || i3 != 0) && i4 != 0) {
            int i5 = c6897M9264.f18415;
            if (i4 > i5 || (i4 >= i5 && i3 > c6897M9264.f18414)) {
                z = true;
            }
            z = !z;
        }
        if (z) {
            return null;
        }
        C6897 c68974 = C6897.f18361;
        C6897 c6897M92642 = m9264();
        C6897 c6897M92643 = m9264();
        boolean z2 = c6897.f18362;
        c6897M92643.getClass();
        C6897 c68975 = z2 ? c68974 : C6897.f18360;
        int i6 = c68975.f18415;
        int i7 = c6897M92643.f18415;
        return new C4825(c6897, c68974, c6897M92642, (i6 <= i7 && (i6 < i7 || c68975.f18414 <= c6897M92643.f18414)) ? c6897M92643 : c68975, c6969.m12258());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4832 m9266() {
        C4832 c4832 = this.f13588;
        if (c4832 != null) {
            return c4832;
        }
        AbstractC4394.m8918("components");
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final DeserializedContainerAbiStability m9267(C6969 c6969) {
        m9266().f14086.getClass();
        int i = c6969.f18665.f18479;
        return ((i & 16) == 0 || (i & 32) != 0) ? DeserializedContainerAbiStability.STABLE : DeserializedContainerAbiStability.UNSTABLE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4795 m9268(kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4465 r14, p077.C6969 r15) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.C4650.m9268(kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世楪兰苏哲, 飘花落叶言世楪子哲兰苏.飘花落叶言子楪世哲苏兰):kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪哲苏兰世");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4830 m9269(p077.C6969 r10) {
        /*
            r9 = this;
            java.lang.String r0 = "Could not read data from "
            飘花落叶言世楪哲子兰苏.飘花落叶言子楪世苏兰哲 r1 = r10.f18665
            飘花落叶言世楪哲兰子苏.飘花落叶言子楪世兰哲苏 r2 = r1.f18477
            java.lang.String[] r3 = r1.f18476
            if (r3 != 0) goto Lc
            java.lang.String[] r3 = r1.f18475
        Lc:
            r4 = 0
            if (r3 == 0) goto L1a
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r5 = r1.f18478
            java.util.Set r6 = kotlin.reflect.jvm.internal.impl.load.kotlin.C4650.f13587
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L1a
            goto L1b
        L1a:
            r3 = r4
        L1b:
            if (r3 != 0) goto L1f
            goto L88
        L1f:
            java.lang.String[] r1 = r1.f18474
            if (r1 != 0) goto L25
            goto L88
        L25:
            kotlin.Pair r0 = p067.C6892.m12138(r3, r1)     // Catch: java.lang.Throwable -> L2b kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L2d
            goto L86
        L2b:
            r0 = move-exception
            goto L3c
        L2d:
            r1 = move-exception
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2b
            java.lang.String r5 = r10.m12258()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r0 = r0.concat(r5)     // Catch: java.lang.Throwable -> L2b
            r3.<init>(r0, r1)     // Catch: java.lang.Throwable -> L2b
            throw r3     // Catch: java.lang.Throwable -> L2b
        L3c:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪苏兰哲世 r1 = r9.m9266()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪哲世苏兰 r1 = r1.f14086
            r1.getClass()
            飘花落叶言世楪哲兰子苏.飘花落叶言子楪世兰哲苏 r1 = r9.m9264()
            r1.getClass()
            boolean r3 = r2.f18362
            if (r3 == 0) goto L53
            飘花落叶言世楪哲兰子苏.飘花落叶言子楪世兰哲苏 r3 = p070.C6897.f18361
            goto L55
        L53:
            飘花落叶言世楪哲兰子苏.飘花落叶言子楪世兰哲苏 r3 = p070.C6897.f18360
        L55:
            int r5 = r3.f18415
            int r6 = r1.f18415
            if (r5 <= r6) goto L5c
            goto L65
        L5c:
            if (r5 >= r6) goto L5f
            goto L66
        L5f:
            int r5 = r3.f18414
            int r6 = r1.f18414
            if (r5 <= r6) goto L66
        L65:
            r1 = r3
        L66:
            int r3 = r2.f18414
            int r5 = r2.f18415
            r6 = 0
            r7 = 1
            if (r5 != r7) goto L71
            if (r3 != 0) goto L71
            goto L83
        L71:
            if (r5 != 0) goto L74
            goto L83
        L74:
            int r8 = r1.f18415
            if (r5 <= r8) goto L7a
        L78:
            r6 = r7
            goto L82
        L7a:
            if (r5 >= r8) goto L7d
            goto L82
        L7d:
            int r1 = r1.f18414
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
            飘花落叶言世楪兰子苏哲.飘花落叶言子楪世兰哲苏 r1 = (p067.C6884) r1
            java.lang.Object r0 = r0.component2()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class) r0
            kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪兰世哲苏 r3 = new kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪兰世哲苏
            r9.m9265(r10)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪兰苏哲世 r4 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪兰苏哲世
            boolean r5 = r9.m9263(r10)
            r4.<init>(r5)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability r9 = r9.m9267(r10)
            r3.<init>(r10, r4, r9)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪苏世哲兰 r9 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪苏世哲兰
            r9.<init>(r1, r0, r2, r3)
            return r9
        Lb0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.C4650.m9269(飘花落叶言世楪子哲兰苏.飘花落叶言子楪世哲苏兰):kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪苏世哲兰");
    }
}
