package kotlin.reflect.jvm.internal.impl.km.internal;

import androidx.appcompat.widget.C0137;
import androidx.collection.C0276;
import androidx.compose.animation.core.C0325;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.AbstractC4345;
import kotlin.enums.InterfaceC4365;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.km.C4525;
import kotlin.reflect.jvm.internal.impl.km.C4526;
import kotlin.reflect.jvm.internal.impl.km.C4530;
import kotlin.reflect.jvm.internal.impl.km.C4534;
import kotlin.reflect.jvm.internal.impl.km.C4535;
import kotlin.reflect.jvm.internal.impl.km.C4536;
import kotlin.reflect.jvm.internal.impl.km.C4538;
import kotlin.reflect.jvm.internal.impl.km.C4549;
import kotlin.reflect.jvm.internal.impl.km.MemberKind;
import kotlin.reflect.jvm.internal.impl.km.Modality;
import kotlin.reflect.jvm.internal.impl.km.ReturnValueStatus;
import kotlin.reflect.jvm.internal.impl.km.Visibility;
import p070.AbstractC6899;
import p070.AbstractC6900;
import p070.C6901;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.internal.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4513 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C0137 m9115(C4512 c4512) {
        return new C0137(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$propertyAccessorBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5102
            public Object get(Object obj) {
                return Integer.valueOf(((C4535) obj).f13211);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5112
            public void set(Object obj, Object obj2) {
                ((C4535) obj).f13211 = ((Number) obj2).intValue();
            }
        }, c4512);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C0325 m9116(MutablePropertyReference1Impl mutablePropertyReference1Impl) {
        mutablePropertyReference1Impl.getClass();
        C6901 c6901 = AbstractC6899.f18380;
        c6901.getClass();
        InterfaceC4365 entries = Modality.getEntries();
        InterfaceC4365 entries2 = Modality.getEntries();
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(entries2, 10));
        Iterator<E> it = entries2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Modality) it.next()).getFlag$kotlin_metadata());
        }
        return new C0325(mutablePropertyReference1Impl, c6901, entries, arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m9117(MutablePropertyReference1Impl mutablePropertyReference1Impl) {
        mutablePropertyReference1Impl.getClass();
        AbstractC6899.f18393.getClass();
        InterfaceC4365 entries = MemberKind.getEntries();
        InterfaceC4365 entries2 = MemberKind.getEntries();
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(entries2, 10));
        Iterator<E> it = entries2.iterator();
        while (it.hasNext()) {
            arrayList.add(((MemberKind) it.next()).getFlag$kotlin_metadata());
        }
        entries.getClass();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C0137 m9118(C4512 c4512) {
        return new C0137(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$functionBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5102
            public Object get(Object obj) {
                return Integer.valueOf(((C4538) obj).f13237);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5112
            public void set(Object obj, Object obj2) {
                ((C4538) obj).f13237 = ((Number) obj2).intValue();
            }
        }, c4512);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m9119(C4512 c4512) {
        new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$constructorBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5102
            public Object get(Object obj) {
                return Integer.valueOf(((C4530) obj).f13199);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5112
            public void set(Object obj, Object obj2) {
                ((C4530) obj).f13199 = ((Number) obj2).intValue();
            }
        }.getClass();
        if (c4512.f13156 == 1 && c4512.f13155 == 1) {
            return;
        }
        C0276.m849(c4512, "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", " was passed");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0137 m9120(C4512 c4512) {
        return new C0137(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$classBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5102
            public Object get(Object obj) {
                return Integer.valueOf(((C4549) obj).f13289);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5112
            public void set(Object obj, Object obj2) {
                ((C4549) obj).f13289 = ((Number) obj2).intValue();
            }
        }, c4512);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final void m9121(MutablePropertyReference1Impl mutablePropertyReference1Impl, AbstractC6900 abstractC6900) {
        mutablePropertyReference1Impl.getClass();
        abstractC6900.getClass();
        InterfaceC4365 entries = ReturnValueStatus.getEntries();
        InterfaceC4365 entries2 = ReturnValueStatus.getEntries();
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(entries2, 10));
        Iterator<E> it = entries2.iterator();
        while (it.hasNext()) {
            arrayList.add(new C4512(abstractC6900, ((ReturnValueStatus) it.next()).ordinal()));
        }
        entries.getClass();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C0137 m9122(C4512 c4512) {
        return new C0137(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$propertyBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5102
            public Object get(Object obj) {
                return Integer.valueOf(((C4536) obj).f13218);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5112
            public void set(Object obj, Object obj2) {
                ((C4536) obj).f13218 = ((Number) obj2).intValue();
            }
        }, c4512);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C0137 m9123(C4512 c4512) {
        return new C0137(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$valueParameterBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5102
            public Object get(Object obj) {
                return Integer.valueOf(((C4526) obj).f13188);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5112
            public void set(Object obj, Object obj2) {
                ((C4526) obj).f13188 = ((Number) obj2).intValue();
            }
        }, c4512);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C0325 m9124(MutablePropertyReference1Impl mutablePropertyReference1Impl) {
        mutablePropertyReference1Impl.getClass();
        C6901 c6901 = AbstractC6899.f18381;
        c6901.getClass();
        InterfaceC4365 entries = Visibility.getEntries();
        InterfaceC4365 entries2 = Visibility.getEntries();
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(entries2, 10));
        Iterator<E> it = entries2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Visibility) it.next()).getFlag$kotlin_metadata());
        }
        return new C0325(mutablePropertyReference1Impl, c6901, entries, arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final void m9125(C4512 c4512) {
        new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$typeAliasBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5102
            public Object get(Object obj) {
                return Integer.valueOf(((C4525) obj).f13183);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5112
            public void set(Object obj, Object obj2) {
                ((C4525) obj).f13183 = ((Number) obj2).intValue();
            }
        }.getClass();
        if (c4512.f13156 == 1 && c4512.f13155 == 1) {
            return;
        }
        C0276.m849(c4512, "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", " was passed");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C0137 m9126(C4512 c4512) {
        return new C0137(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$typeBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5102
            public Object get(Object obj) {
                return Integer.valueOf(((C4534) obj).f13208);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5112
            public void set(Object obj, Object obj2) {
                ((C4534) obj).f13208 = ((Number) obj2).intValue();
            }
        }, c4512);
    }
}
