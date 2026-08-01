package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.compose.animation.core.C0325;
import androidx.compose.foundation.text.C1012;
import com.bumptech.glide.load.engine.C3004;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4490;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractC4807;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4812;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4815;
import kotlin.reflect.jvm.internal.impl.storage.C4836;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import p070.C6897;
import p077.C6970;
import p079.C6987;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4647 extends AbstractC4629 implements InterfaceC4815 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C4812 f13575;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C0325 f13576;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C6897 f13577;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4836 f13578;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C6987 f13579;

    public C4647(C6987 c6987, C0325 c0325, C4844 c4844, C6970 c6970) {
        super(c6970);
        this.f13578 = c4844.m9589(new C1012(this, 11));
        this.f13579 = c6987;
        this.f13576 = c0325;
        this.f13575 = new C4812(c6987, c0325);
        this.f13577 = C6897.f18361;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4815
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final Object mo9259(AbstractC4807 abstractC4807, ProtoBuf$Property protoBuf$Property, AbstractC4881 abstractC4881) {
        protoBuf$Property.getClass();
        return m9260(abstractC4807, protoBuf$Property, AnnotatedCallableKind.PROPERTY, abstractC4881, C4633.f13548);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractC4629
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final C3004 mo9252(C4687 c4687, InterfaceC4461 interfaceC4461, List list) {
        list.getClass();
        return new C3004(this, AbstractC4490.m9085(this.f13579, c4687, this.f13576), c4687, list, interfaceC4461);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m9260(kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractC4807 r10, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r11, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r12, kotlin.reflect.jvm.internal.impl.types.AbstractC4881 r13, p052.InterfaceC6553 r14) throws java.io.IOException {
        /*
            r9 = this;
            飘花落叶言世楪哲兰子苏.飘花落叶言子楪世苏兰哲 r0 = p070.AbstractC6898.f18372
            int r1 = r11.getFlags()
            java.lang.Boolean r5 = r0.mo12153(r1)
            boolean r6 = p067.C6892.m12140(r11)
            飘花落叶言世楪子哲兰苏.飘花落叶言子楪世苏兰哲 r7 = r9.f13540
            飘花落叶言世楪哲兰子苏.飘花落叶言子楪世兰哲苏 r8 = r9.f13577
            r3 = 1
            r4 = 1
            r2 = r10
            飘花落叶言世楪子哲兰苏.飘花落叶言子楪世哲苏兰 r10 = kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractC4631.m9257(r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            if (r10 != 0) goto L33
            boolean r10 = r2 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4819
            if (r10 == 0) goto L32
            r10 = r2
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪兰哲世苏 r10 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4819) r10
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世哲楪苏兰 r10 = r10.f14013
            boolean r1 = r10 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.C4634
            if (r1 == 0) goto L2c
            kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪兰世哲苏 r10 = (kotlin.reflect.jvm.internal.impl.load.kotlin.C4634) r10
            goto L2d
        L2c:
            r10 = r0
        L2d:
            if (r10 == 0) goto L32
            飘花落叶言世楪子哲兰苏.飘花落叶言子楪世哲苏兰 r10 = r10.f13550
            goto L33
        L32:
            r10 = r0
        L33:
            if (r10 != 0) goto L36
            goto L60
        L36:
            飘花落叶言世楪哲子兰苏.飘花落叶言子楪世苏兰哲 r1 = r10.f18665
            飘花落叶言世楪哲兰子苏.飘花落叶言子楪世兰哲苏 r1 = r1.f18477
            飘花落叶言世楪哲兰子苏.飘花落叶言子楪世兰哲苏 r3 = kotlin.reflect.jvm.internal.impl.load.kotlin.C4650.f13584
            r3.getClass()
            int r4 = r3.f18415
            int r5 = r3.f18414
            int r3 = r3.f18413
            boolean r1 = r1.m12156(r4, r5, r3)
            飘花落叶言世楪哲兰子苏.飘花落叶言子楪苏世哲兰 r3 = r2.f14015
            飘花落叶言世兰楪子苏哲.飘花落叶言子楪苏哲兰世 r2 = r2.f14014
            kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪兰苏世哲 r11 = kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractC4629.m9249(r11, r3, r2, r12, r1)
            if (r11 != 0) goto L54
            goto L60
        L54:
            kotlin.reflect.jvm.internal.impl.storage.飘花落叶言子楪世兰苏哲 r9 = r9.f13578
            java.lang.Object r9 = r9.invoke(r10)
            java.lang.Object r9 = r14.invoke(r9, r11)
            if (r9 != 0) goto L61
        L60:
            return r0
        L61:
            boolean r10 = p049.AbstractC6528.m11964(r13)
            if (r10 == 0) goto Lb9
            kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪苏世哲兰 r9 = (kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4767) r9
            boolean r10 = r9 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.C4750
            if (r10 == 0) goto L7d
            kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子世楪哲苏兰 r10 = new kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子世楪哲苏兰
            kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪世哲兰苏 r9 = (kotlin.reflect.jvm.internal.impl.resolve.constants.C4750) r9
            java.lang.Object r9 = r9.f13901
            java.lang.Number r9 = (java.lang.Number) r9
            byte r9 = r9.byteValue()
            r10.<init>(r9)
            return r10
        L7d:
            boolean r10 = r9 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.C4757
            if (r10 == 0) goto L91
            kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子世楪哲苏兰 r10 = new kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子世楪哲苏兰
            kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪兰哲苏世 r9 = (kotlin.reflect.jvm.internal.impl.resolve.constants.C4757) r9
            java.lang.Object r9 = r9.f13901
            java.lang.Number r9 = (java.lang.Number) r9
            short r9 = r9.shortValue()
            r10.<init>(r9)
            return r10
        L91:
            boolean r10 = r9 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.C4768
            if (r10 == 0) goto La5
            kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子世楪哲苏兰 r10 = new kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子世楪哲苏兰
            kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪苏兰世哲 r9 = (kotlin.reflect.jvm.internal.impl.resolve.constants.C4768) r9
            java.lang.Object r9 = r9.f13901
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r10.<init>(r9)
            return r10
        La5:
            boolean r10 = r9 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.C4759
            if (r10 == 0) goto Lb9
            kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子世楪哲苏兰 r10 = new kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子世楪哲苏兰
            kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪兰苏哲世 r9 = (kotlin.reflect.jvm.internal.impl.resolve.constants.C4759) r9
            java.lang.Object r9 = r9.f13901
            java.lang.Number r9 = (java.lang.Number) r9
            long r11 = r9.longValue()
            r10.<init>(r11)
            return r10
        Lb9:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.C4647.m9260(kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子世楪苏哲兰, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind, kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世):java.lang.Object");
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4815
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final Object mo9261(AbstractC4807 abstractC4807, ProtoBuf$Property protoBuf$Property, AbstractC4881 abstractC4881) {
        protoBuf$Property.getClass();
        return m9260(abstractC4807, protoBuf$Property, AnnotatedCallableKind.PROPERTY_GETTER, abstractC4881, C4633.f13547);
    }
}
