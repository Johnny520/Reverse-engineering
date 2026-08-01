package kotlin.reflect.jvm.internal.impl.p009km.jvm;

import androidx.appcompat.widget.C0984;
import androidx.collection.C1123;
import com.bumptech.glide.AbstractC3888;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.jvm.internal.impl.p009km.C5368;
import kotlin.reflect.jvm.internal.impl.p009km.C5381;
import kotlin.reflect.jvm.internal.impl.p009km.internal.AbstractC5345;
import kotlin.reflect.jvm.internal.impl.p009km.internal.C5344;
import p083.AbstractC7717;
import p086.AbstractC7728;
import p086.C7731;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.jvm.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5351 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C0984 f13512;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5920[] f13513 = {new MutablePropertyReference1Impl(AbstractC5351.class, "hasAnnotationsInBytecode", "getHasAnnotationsInBytecode(Lkotlin/metadata/KmClass;)Z", 1), new MutablePropertyReference1Impl(AbstractC5351.class, "hasAnnotationsInBytecode", "getHasAnnotationsInBytecode(Lkotlin/metadata/KmConstructor;)Z", 1), new MutablePropertyReference1Impl(AbstractC5351.class, "hasAnnotationsInBytecode", "getHasAnnotationsInBytecode(Lkotlin/metadata/KmFunction;)Z", 1), new MutablePropertyReference1Impl(AbstractC5351.class, "hasAnnotationsInBytecode", "getHasAnnotationsInBytecode(Lkotlin/metadata/KmProperty;)Z", 1), new MutablePropertyReference1Impl(AbstractC5351.class, "hasAnnotationsInBytecode", "getHasAnnotationsInBytecode(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new MutablePropertyReference1Impl(AbstractC5351.class, "hasAnnotationsInBytecode", "getHasAnnotationsInBytecode(Lkotlin/metadata/KmValueParameter;)Z", 1), new MutablePropertyReference1Impl(AbstractC5351.class, "isMovedFromInterfaceCompanion", "isMovedFromInterfaceCompanion(Lkotlin/metadata/KmProperty;)Z", 1), new MutablePropertyReference1Impl(AbstractC5351.class, "hasMethodBodiesInInterface", "getHasMethodBodiesInInterface(Lkotlin/metadata/KmClass;)Z", 1), new MutablePropertyReference1Impl(AbstractC5351.class, "isCompiledInCompatibilityMode", "isCompiledInCompatibilityMode(Lkotlin/metadata/KmClass;)Z", 1)};

    static {
        C7731 c7731 = AbstractC7728.f18727;
        c7731.getClass();
        AbstractC5345.m9679(new C5344(c7731, 1));
        AbstractC5345.m9678(new C5344(c7731, 1));
        AbstractC5345.m9677(new C5344(c7731, 1));
        AbstractC5345.m9681(new C5344(c7731, 1));
        AbstractC5345.m9674(new C5344(c7731, 1));
        AbstractC5345.m9682(new C5344(c7731, 1));
        JvmAttributes$isMovedFromInterfaceCompanion$2 jvmAttributes$isMovedFromInterfaceCompanion$2 = new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.jvm.JvmAttributes$isMovedFromInterfaceCompanion$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5934
            public Object get(Object obj) {
                InterfaceC5920[] interfaceC5920Arr = AbstractC5351.f13513;
                return Integer.valueOf(AbstractC3888.m7266((C5368) obj).f19289);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5944
            public void set(Object obj, Object obj2) {
                int iIntValue = ((Number) obj2).intValue();
                InterfaceC5920[] interfaceC5920Arr = AbstractC5351.f13513;
                AbstractC3888.m7266((C5368) obj).f19289 = iIntValue;
            }
        };
        C7731 c77312 = AbstractC7717.f18684;
        c77312.getClass();
        f13512 = new C0984(jvmAttributes$isMovedFromInterfaceCompanion$2, new C5344(c77312.f18749, c77312.f18748, 1));
        JvmAttributes$hasMethodBodiesInInterface$2 jvmAttributes$hasMethodBodiesInInterface$2 = new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.jvm.JvmAttributes$hasMethodBodiesInInterface$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5934
            public Object get(Object obj) {
                InterfaceC5920[] interfaceC5920Arr = AbstractC5351.f13513;
                return Integer.valueOf(AbstractC3888.m7276((C5381) obj).f19297);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5944
            public void set(Object obj, Object obj2) {
                int iIntValue = ((Number) obj2).intValue();
                InterfaceC5920[] interfaceC5920Arr = AbstractC5351.f13513;
                AbstractC3888.m7276((C5381) obj).f19297 = iIntValue;
            }
        };
        C7731 c77313 = AbstractC7717.f18683;
        c77313.getClass();
        int i = c77313.f18749;
        int i2 = c77313.f18748;
        C5344 c5344 = new C5344(i, i2, 1);
        jvmAttributes$hasMethodBodiesInInterface$2.getClass();
        if (i2 != 1) {
            C1123.m1409(c5344, "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", " was passed");
            return;
        }
        JvmAttributes$isCompiledInCompatibilityMode$2 jvmAttributes$isCompiledInCompatibilityMode$2 = new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.jvm.JvmAttributes$isCompiledInCompatibilityMode$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5934
            public Object get(Object obj) {
                InterfaceC5920[] interfaceC5920Arr = AbstractC5351.f13513;
                return Integer.valueOf(AbstractC3888.m7276((C5381) obj).f19297);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5944
            public void set(Object obj, Object obj2) {
                int iIntValue = ((Number) obj2).intValue();
                InterfaceC5920[] interfaceC5920Arr = AbstractC5351.f13513;
                AbstractC3888.m7276((C5381) obj).f19297 = iIntValue;
            }
        };
        C7731 c77314 = AbstractC7717.f18682;
        c77314.getClass();
        int i3 = c77314.f18749;
        int i4 = c77314.f18748;
        C5344 c53442 = new C5344(i3, i4, 1);
        jvmAttributes$isCompiledInCompatibilityMode$2.getClass();
        if (i4 == 1) {
            return;
        }
        C1123.m1409(c53442, "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", " was passed");
    }
}
