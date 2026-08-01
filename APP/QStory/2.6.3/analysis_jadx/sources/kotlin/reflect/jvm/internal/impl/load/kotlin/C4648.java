package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.compose.animation.core.C0325;
import androidx.compose.foundation.text.C1012;
import com.bumptech.glide.load.engine.C3005;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4491;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractC4808;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4813;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4816;
import kotlin.reflect.jvm.internal.impl.storage.C4837;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import p070.C6898;
import p077.C6971;
import p079.C6988;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4648 extends AbstractC4630 implements InterfaceC4816 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C4813 f13579;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C0325 f13580;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C6898 f13581;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4837 f13582;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C6988 f13583;

    public C4648(C6988 c6988, C0325 c0325, C4845 c4845, C6971 c6971) {
        super(c6971);
        this.f13582 = c4845.m9579(new C1012(this, 11));
        this.f13583 = c6988;
        this.f13580 = c0325;
        this.f13579 = new C4813(c6988, c0325);
        this.f13581 = C6898.f18356;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4816
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final Object mo9249(AbstractC4808 abstractC4808, ProtoBuf$Property protoBuf$Property, AbstractC4882 abstractC4882) {
        protoBuf$Property.getClass();
        return m9250(abstractC4808, protoBuf$Property, AnnotatedCallableKind.PROPERTY, abstractC4882, C4634.f13552);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractC4630
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final C3005 mo9242(C4688 c4688, InterfaceC4462 interfaceC4462, List list) {
        list.getClass();
        return new C3005(this, AbstractC4491.m9075(this.f13583, c4688, this.f13580), c4688, list, interfaceC4462);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m9250(kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractC4808 r10, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r11, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r12, kotlin.reflect.jvm.internal.impl.types.AbstractC4882 r13, p052.InterfaceC6554 r14) throws java.io.IOException {
        /*
            r9 = this;
            飘花落叶言世楪哲兰子苏.飘花落叶言子楪世苏兰哲 r0 = p070.AbstractC6899.f18367
            int r1 = r11.getFlags()
            java.lang.Boolean r5 = r0.mo12181(r1)
            boolean r6 = p067.C6893.m12168(r11)
            飘花落叶言世楪子哲兰苏.飘花落叶言子楪世苏兰哲 r7 = r9.f13544
            飘花落叶言世楪哲兰子苏.飘花落叶言子楪世兰哲苏 r8 = r9.f13581
            r3 = 1
            r4 = 1
            r2 = r10
            飘花落叶言世楪子哲兰苏.飘花落叶言子楪世哲苏兰 r10 = kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractC4632.m9247(r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            if (r10 != 0) goto L33
            boolean r10 = r2 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4820
            if (r10 == 0) goto L32
            r10 = r2
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪兰哲世苏 r10 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4820) r10
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世哲楪苏兰 r10 = r10.f14017
            boolean r1 = r10 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.C4635
            if (r1 == 0) goto L2c
            kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪兰世哲苏 r10 = (kotlin.reflect.jvm.internal.impl.load.kotlin.C4635) r10
            goto L2d
        L2c:
            r10 = r0
        L2d:
            if (r10 == 0) goto L32
            飘花落叶言世楪子哲兰苏.飘花落叶言子楪世哲苏兰 r10 = r10.f13554
            goto L33
        L32:
            r10 = r0
        L33:
            if (r10 != 0) goto L36
            goto L60
        L36:
            飘花落叶言世楪哲子兰苏.飘花落叶言子楪世苏兰哲 r1 = r10.f18660
            飘花落叶言世楪哲兰子苏.飘花落叶言子楪世兰哲苏 r1 = r1.f18472
            飘花落叶言世楪哲兰子苏.飘花落叶言子楪世兰哲苏 r3 = kotlin.reflect.jvm.internal.impl.load.kotlin.C4651.f13588
            r3.getClass()
            int r4 = r3.f18410
            int r5 = r3.f18409
            int r3 = r3.f18408
            boolean r1 = r1.m12184(r4, r5, r3)
            飘花落叶言世楪哲兰子苏.飘花落叶言子楪苏世哲兰 r3 = r2.f14019
            飘花落叶言世兰子哲苏楪.飘花落叶言子楪苏哲兰世 r2 = r2.f14018
            kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪兰苏世哲 r11 = kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractC4630.m9239(r11, r3, r2, r12, r1)
            if (r11 != 0) goto L54
            goto L60
        L54:
            kotlin.reflect.jvm.internal.impl.storage.飘花落叶言子楪世兰苏哲 r9 = r9.f13582
            java.lang.Object r9 = r9.invoke(r10)
            java.lang.Object r9 = r14.invoke(r9, r11)
            if (r9 != 0) goto L61
        L60:
            return r0
        L61:
            boolean r10 = p049.AbstractC6529.m12007(r13)
            if (r10 == 0) goto Lb9
            kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪苏世哲兰 r9 = (kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4768) r9
            boolean r10 = r9 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.C4751
            if (r10 == 0) goto L7d
            kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子世楪哲苏兰 r10 = new kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子世楪哲苏兰
            kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪世哲兰苏 r9 = (kotlin.reflect.jvm.internal.impl.resolve.constants.C4751) r9
            java.lang.Object r9 = r9.f13905
            java.lang.Number r9 = (java.lang.Number) r9
            byte r9 = r9.byteValue()
            r10.<init>(r9)
            return r10
        L7d:
            boolean r10 = r9 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.C4758
            if (r10 == 0) goto L91
            kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子世楪哲苏兰 r10 = new kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子世楪哲苏兰
            kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪兰哲苏世 r9 = (kotlin.reflect.jvm.internal.impl.resolve.constants.C4758) r9
            java.lang.Object r9 = r9.f13905
            java.lang.Number r9 = (java.lang.Number) r9
            short r9 = r9.shortValue()
            r10.<init>(r9)
            return r10
        L91:
            boolean r10 = r9 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.C4769
            if (r10 == 0) goto La5
            kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子世楪哲苏兰 r10 = new kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子世楪哲苏兰
            kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪苏兰世哲 r9 = (kotlin.reflect.jvm.internal.impl.resolve.constants.C4769) r9
            java.lang.Object r9 = r9.f13905
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r10.<init>(r9)
            return r10
        La5:
            boolean r10 = r9 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.C4760
            if (r10 == 0) goto Lb9
            kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子世楪哲苏兰 r10 = new kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子世楪哲苏兰
            kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪兰苏哲世 r9 = (kotlin.reflect.jvm.internal.impl.resolve.constants.C4760) r9
            java.lang.Object r9 = r9.f13905
            java.lang.Number r9 = (java.lang.Number) r9
            long r11 = r9.longValue()
            r10.<init>(r11)
            return r10
        Lb9:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.C4648.m9250(kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子世楪苏哲兰, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind, kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世):java.lang.Object");
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4816
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final Object mo9251(AbstractC4808 abstractC4808, ProtoBuf$Property protoBuf$Property, AbstractC4882 abstractC4882) {
        protoBuf$Property.getClass();
        return m9250(abstractC4808, protoBuf$Property, AnnotatedCallableKind.PROPERTY_GETTER, abstractC4882, C4634.f13551);
    }
}
