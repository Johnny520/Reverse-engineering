package kotlin.reflect.jvm.internal.impl.km.jvm;

import androidx.appcompat.widget.C0137;
import androidx.collection.C0276;
import com.bumptech.glide.AbstractC3056;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.jvm.internal.impl.km.C4536;
import kotlin.reflect.jvm.internal.impl.km.C4549;
import kotlin.reflect.jvm.internal.impl.km.internal.AbstractC4513;
import kotlin.reflect.jvm.internal.impl.km.internal.C4512;
import p067.AbstractC6888;
import p070.AbstractC6899;
import p070.C6902;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.jvm.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4519 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C0137 f13167;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5088[] f13168 = {new MutablePropertyReference1Impl(AbstractC4519.class, "hasAnnotationsInBytecode", "getHasAnnotationsInBytecode(Lkotlin/metadata/KmClass;)Z", 1), new MutablePropertyReference1Impl(AbstractC4519.class, "hasAnnotationsInBytecode", "getHasAnnotationsInBytecode(Lkotlin/metadata/KmConstructor;)Z", 1), new MutablePropertyReference1Impl(AbstractC4519.class, "hasAnnotationsInBytecode", "getHasAnnotationsInBytecode(Lkotlin/metadata/KmFunction;)Z", 1), new MutablePropertyReference1Impl(AbstractC4519.class, "hasAnnotationsInBytecode", "getHasAnnotationsInBytecode(Lkotlin/metadata/KmProperty;)Z", 1), new MutablePropertyReference1Impl(AbstractC4519.class, "hasAnnotationsInBytecode", "getHasAnnotationsInBytecode(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new MutablePropertyReference1Impl(AbstractC4519.class, "hasAnnotationsInBytecode", "getHasAnnotationsInBytecode(Lkotlin/metadata/KmValueParameter;)Z", 1), new MutablePropertyReference1Impl(AbstractC4519.class, "isMovedFromInterfaceCompanion", "isMovedFromInterfaceCompanion(Lkotlin/metadata/KmProperty;)Z", 1), new MutablePropertyReference1Impl(AbstractC4519.class, "hasMethodBodiesInInterface", "getHasMethodBodiesInInterface(Lkotlin/metadata/KmClass;)Z", 1), new MutablePropertyReference1Impl(AbstractC4519.class, "isCompiledInCompatibilityMode", "isCompiledInCompatibilityMode(Lkotlin/metadata/KmClass;)Z", 1)};

    static {
        C6902 c6902 = AbstractC6899.f18382;
        c6902.getClass();
        AbstractC4513.m9120(new C4512(c6902, 1));
        AbstractC4513.m9119(new C4512(c6902, 1));
        AbstractC4513.m9118(new C4512(c6902, 1));
        AbstractC4513.m9122(new C4512(c6902, 1));
        AbstractC4513.m9115(new C4512(c6902, 1));
        AbstractC4513.m9123(new C4512(c6902, 1));
        JvmAttributes$isMovedFromInterfaceCompanion$2 jvmAttributes$isMovedFromInterfaceCompanion$2 = new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.jvm.JvmAttributes$isMovedFromInterfaceCompanion$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5102
            public Object get(Object obj) {
                InterfaceC5088[] interfaceC5088Arr = AbstractC4519.f13168;
                return Integer.valueOf(AbstractC3056.m6706((C4536) obj).f18944);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5112
            public void set(Object obj, Object obj2) {
                int iIntValue = ((Number) obj2).intValue();
                InterfaceC5088[] interfaceC5088Arr = AbstractC4519.f13168;
                AbstractC3056.m6706((C4536) obj).f18944 = iIntValue;
            }
        };
        C6902 c69022 = AbstractC6888.f18339;
        c69022.getClass();
        f13167 = new C0137(jvmAttributes$isMovedFromInterfaceCompanion$2, new C4512(c69022.f18404, c69022.f18403, 1));
        JvmAttributes$hasMethodBodiesInInterface$2 jvmAttributes$hasMethodBodiesInInterface$2 = new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.jvm.JvmAttributes$hasMethodBodiesInInterface$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5102
            public Object get(Object obj) {
                InterfaceC5088[] interfaceC5088Arr = AbstractC4519.f13168;
                return Integer.valueOf(AbstractC3056.m6716((C4549) obj).f18952);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5112
            public void set(Object obj, Object obj2) {
                int iIntValue = ((Number) obj2).intValue();
                InterfaceC5088[] interfaceC5088Arr = AbstractC4519.f13168;
                AbstractC3056.m6716((C4549) obj).f18952 = iIntValue;
            }
        };
        C6902 c69023 = AbstractC6888.f18338;
        c69023.getClass();
        int i = c69023.f18404;
        int i2 = c69023.f18403;
        C4512 c4512 = new C4512(i, i2, 1);
        jvmAttributes$hasMethodBodiesInInterface$2.getClass();
        if (i2 != 1) {
            C0276.m849(c4512, "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", " was passed");
            return;
        }
        JvmAttributes$isCompiledInCompatibilityMode$2 jvmAttributes$isCompiledInCompatibilityMode$2 = new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.jvm.JvmAttributes$isCompiledInCompatibilityMode$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5102
            public Object get(Object obj) {
                InterfaceC5088[] interfaceC5088Arr = AbstractC4519.f13168;
                return Integer.valueOf(AbstractC3056.m6716((C4549) obj).f18952);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5112
            public void set(Object obj, Object obj2) {
                int iIntValue = ((Number) obj2).intValue();
                InterfaceC5088[] interfaceC5088Arr = AbstractC4519.f13168;
                AbstractC3056.m6716((C4549) obj).f18952 = iIntValue;
            }
        };
        C6902 c69024 = AbstractC6888.f18337;
        c69024.getClass();
        int i3 = c69024.f18404;
        int i4 = c69024.f18403;
        C4512 c45122 = new C4512(i3, i4, 1);
        jvmAttributes$isCompiledInCompatibilityMode$2.getClass();
        if (i4 == 1) {
            return;
        }
        C0276.m849(c45122, "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", " was passed");
    }
}
