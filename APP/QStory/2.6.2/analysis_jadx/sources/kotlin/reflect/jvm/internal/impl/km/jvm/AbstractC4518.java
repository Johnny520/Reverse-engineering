package kotlin.reflect.jvm.internal.impl.km.jvm;

import androidx.appcompat.widget.C0137;
import androidx.collection.C0276;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.jvm.internal.impl.km.C4535;
import kotlin.reflect.jvm.internal.impl.km.C4548;
import kotlin.reflect.jvm.internal.impl.km.internal.AbstractC4512;
import kotlin.reflect.jvm.internal.impl.km.internal.C4511;
import p067.AbstractC6887;
import p070.AbstractC6898;
import p070.C6901;
import p251.AbstractC8174;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.jvm.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4518 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C0137 f13163;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5087[] f13164 = {new MutablePropertyReference1Impl(AbstractC4518.class, "hasAnnotationsInBytecode", "getHasAnnotationsInBytecode(Lkotlin/metadata/KmClass;)Z", 1), new MutablePropertyReference1Impl(AbstractC4518.class, "hasAnnotationsInBytecode", "getHasAnnotationsInBytecode(Lkotlin/metadata/KmConstructor;)Z", 1), new MutablePropertyReference1Impl(AbstractC4518.class, "hasAnnotationsInBytecode", "getHasAnnotationsInBytecode(Lkotlin/metadata/KmFunction;)Z", 1), new MutablePropertyReference1Impl(AbstractC4518.class, "hasAnnotationsInBytecode", "getHasAnnotationsInBytecode(Lkotlin/metadata/KmProperty;)Z", 1), new MutablePropertyReference1Impl(AbstractC4518.class, "hasAnnotationsInBytecode", "getHasAnnotationsInBytecode(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new MutablePropertyReference1Impl(AbstractC4518.class, "hasAnnotationsInBytecode", "getHasAnnotationsInBytecode(Lkotlin/metadata/KmValueParameter;)Z", 1), new MutablePropertyReference1Impl(AbstractC4518.class, "isMovedFromInterfaceCompanion", "isMovedFromInterfaceCompanion(Lkotlin/metadata/KmProperty;)Z", 1), new MutablePropertyReference1Impl(AbstractC4518.class, "hasMethodBodiesInInterface", "getHasMethodBodiesInInterface(Lkotlin/metadata/KmClass;)Z", 1), new MutablePropertyReference1Impl(AbstractC4518.class, "isCompiledInCompatibilityMode", "isCompiledInCompatibilityMode(Lkotlin/metadata/KmClass;)Z", 1)};

    static {
        C6901 c6901 = AbstractC6898.f18387;
        c6901.getClass();
        AbstractC4512.m9130(new C4511(c6901, 1));
        AbstractC4512.m9129(new C4511(c6901, 1));
        AbstractC4512.m9128(new C4511(c6901, 1));
        AbstractC4512.m9132(new C4511(c6901, 1));
        AbstractC4512.m9125(new C4511(c6901, 1));
        AbstractC4512.m9133(new C4511(c6901, 1));
        JvmAttributes$isMovedFromInterfaceCompanion$2 jvmAttributes$isMovedFromInterfaceCompanion$2 = new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.jvm.JvmAttributes$isMovedFromInterfaceCompanion$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5101
            public Object get(Object obj) {
                InterfaceC5087[] interfaceC5087Arr = AbstractC4518.f13164;
                return Integer.valueOf(AbstractC8174.m13610((C4535) obj).f18949);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5111
            public void set(Object obj, Object obj2) {
                int iIntValue = ((Number) obj2).intValue();
                InterfaceC5087[] interfaceC5087Arr = AbstractC4518.f13164;
                AbstractC8174.m13610((C4535) obj).f18949 = iIntValue;
            }
        };
        C6901 c69012 = AbstractC6887.f18344;
        c69012.getClass();
        f13163 = new C0137(jvmAttributes$isMovedFromInterfaceCompanion$2, new C4511(c69012.f18409, c69012.f18408, 1));
        JvmAttributes$hasMethodBodiesInInterface$2 jvmAttributes$hasMethodBodiesInInterface$2 = new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.jvm.JvmAttributes$hasMethodBodiesInInterface$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5101
            public Object get(Object obj) {
                InterfaceC5087[] interfaceC5087Arr = AbstractC4518.f13164;
                return Integer.valueOf(AbstractC8174.m13619((C4548) obj).f18957);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5111
            public void set(Object obj, Object obj2) {
                int iIntValue = ((Number) obj2).intValue();
                InterfaceC5087[] interfaceC5087Arr = AbstractC4518.f13164;
                AbstractC8174.m13619((C4548) obj).f18957 = iIntValue;
            }
        };
        C6901 c69013 = AbstractC6887.f18343;
        c69013.getClass();
        int i = c69013.f18409;
        int i2 = c69013.f18408;
        C4511 c4511 = new C4511(i, i2, 1);
        jvmAttributes$hasMethodBodiesInInterface$2.getClass();
        if (i2 != 1) {
            C0276.m848(c4511, "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", " was passed");
            return;
        }
        JvmAttributes$isCompiledInCompatibilityMode$2 jvmAttributes$isCompiledInCompatibilityMode$2 = new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.jvm.JvmAttributes$isCompiledInCompatibilityMode$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5101
            public Object get(Object obj) {
                InterfaceC5087[] interfaceC5087Arr = AbstractC4518.f13164;
                return Integer.valueOf(AbstractC8174.m13619((C4548) obj).f18957);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5111
            public void set(Object obj, Object obj2) {
                int iIntValue = ((Number) obj2).intValue();
                InterfaceC5087[] interfaceC5087Arr = AbstractC4518.f13164;
                AbstractC8174.m13619((C4548) obj).f18957 = iIntValue;
            }
        };
        C6901 c69014 = AbstractC6887.f18342;
        c69014.getClass();
        int i3 = c69014.f18409;
        int i4 = c69014.f18408;
        C4511 c45112 = new C4511(i3, i4, 1);
        jvmAttributes$isCompiledInCompatibilityMode$2.getClass();
        if (i4 == 1) {
            return;
        }
        C0276.m848(c45112, "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", " was passed");
    }
}
