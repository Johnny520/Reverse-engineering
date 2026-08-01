package kotlin.reflect.jvm.internal.impl.km.internal;

import androidx.appcompat.widget.C0137;
import androidx.collection.C0276;
import androidx.compose.animation.core.C0325;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.AbstractC4344;
import kotlin.enums.InterfaceC4364;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.km.C4524;
import kotlin.reflect.jvm.internal.impl.km.C4525;
import kotlin.reflect.jvm.internal.impl.km.C4529;
import kotlin.reflect.jvm.internal.impl.km.C4533;
import kotlin.reflect.jvm.internal.impl.km.C4534;
import kotlin.reflect.jvm.internal.impl.km.C4535;
import kotlin.reflect.jvm.internal.impl.km.C4537;
import kotlin.reflect.jvm.internal.impl.km.C4548;
import kotlin.reflect.jvm.internal.impl.km.MemberKind;
import kotlin.reflect.jvm.internal.impl.km.Modality;
import kotlin.reflect.jvm.internal.impl.km.ReturnValueStatus;
import kotlin.reflect.jvm.internal.impl.km.Visibility;
import p070.AbstractC6898;
import p070.AbstractC6899;
import p070.C6900;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.internal.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4512 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C0137 m9125(C4511 c4511) {
        return new C0137(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$propertyAccessorBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5101
            public Object get(Object obj) {
                return Integer.valueOf(((C4534) obj).f13207);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5111
            public void set(Object obj, Object obj2) {
                ((C4534) obj).f13207 = ((Number) obj2).intValue();
            }
        }, c4511);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C0325 m9126(MutablePropertyReference1Impl mutablePropertyReference1Impl) {
        mutablePropertyReference1Impl.getClass();
        C6900 c6900 = AbstractC6898.f18385;
        c6900.getClass();
        InterfaceC4364 entries = Modality.getEntries();
        InterfaceC4364 entries2 = Modality.getEntries();
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(entries2, 10));
        Iterator<E> it = entries2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Modality) it.next()).getFlag$kotlin_metadata());
        }
        return new C0325(mutablePropertyReference1Impl, c6900, entries, arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m9127(MutablePropertyReference1Impl mutablePropertyReference1Impl) {
        mutablePropertyReference1Impl.getClass();
        AbstractC6898.f18398.getClass();
        InterfaceC4364 entries = MemberKind.getEntries();
        InterfaceC4364 entries2 = MemberKind.getEntries();
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(entries2, 10));
        Iterator<E> it = entries2.iterator();
        while (it.hasNext()) {
            arrayList.add(((MemberKind) it.next()).getFlag$kotlin_metadata());
        }
        entries.getClass();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C0137 m9128(C4511 c4511) {
        return new C0137(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$functionBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5101
            public Object get(Object obj) {
                return Integer.valueOf(((C4537) obj).f13233);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5111
            public void set(Object obj, Object obj2) {
                ((C4537) obj).f13233 = ((Number) obj2).intValue();
            }
        }, c4511);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m9129(C4511 c4511) {
        new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$constructorBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5101
            public Object get(Object obj) {
                return Integer.valueOf(((C4529) obj).f13195);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5111
            public void set(Object obj, Object obj2) {
                ((C4529) obj).f13195 = ((Number) obj2).intValue();
            }
        }.getClass();
        if (c4511.f13152 == 1 && c4511.f13151 == 1) {
            return;
        }
        C0276.m848(c4511, "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", " was passed");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0137 m9130(C4511 c4511) {
        return new C0137(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$classBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5101
            public Object get(Object obj) {
                return Integer.valueOf(((C4548) obj).f13285);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5111
            public void set(Object obj, Object obj2) {
                ((C4548) obj).f13285 = ((Number) obj2).intValue();
            }
        }, c4511);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final void m9131(MutablePropertyReference1Impl mutablePropertyReference1Impl, AbstractC6899 abstractC6899) {
        mutablePropertyReference1Impl.getClass();
        abstractC6899.getClass();
        InterfaceC4364 entries = ReturnValueStatus.getEntries();
        InterfaceC4364 entries2 = ReturnValueStatus.getEntries();
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(entries2, 10));
        Iterator<E> it = entries2.iterator();
        while (it.hasNext()) {
            arrayList.add(new C4511(abstractC6899, ((ReturnValueStatus) it.next()).ordinal()));
        }
        entries.getClass();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C0137 m9132(C4511 c4511) {
        return new C0137(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$propertyBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5101
            public Object get(Object obj) {
                return Integer.valueOf(((C4535) obj).f13214);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5111
            public void set(Object obj, Object obj2) {
                ((C4535) obj).f13214 = ((Number) obj2).intValue();
            }
        }, c4511);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C0137 m9133(C4511 c4511) {
        return new C0137(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$valueParameterBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5101
            public Object get(Object obj) {
                return Integer.valueOf(((C4525) obj).f13184);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5111
            public void set(Object obj, Object obj2) {
                ((C4525) obj).f13184 = ((Number) obj2).intValue();
            }
        }, c4511);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C0325 m9134(MutablePropertyReference1Impl mutablePropertyReference1Impl) {
        mutablePropertyReference1Impl.getClass();
        C6900 c6900 = AbstractC6898.f18386;
        c6900.getClass();
        InterfaceC4364 entries = Visibility.getEntries();
        InterfaceC4364 entries2 = Visibility.getEntries();
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(entries2, 10));
        Iterator<E> it = entries2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Visibility) it.next()).getFlag$kotlin_metadata());
        }
        return new C0325(mutablePropertyReference1Impl, c6900, entries, arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final void m9135(C4511 c4511) {
        new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$typeAliasBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5101
            public Object get(Object obj) {
                return Integer.valueOf(((C4524) obj).f13179);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5111
            public void set(Object obj, Object obj2) {
                ((C4524) obj).f13179 = ((Number) obj2).intValue();
            }
        }.getClass();
        if (c4511.f13152 == 1 && c4511.f13151 == 1) {
            return;
        }
        C0276.m848(c4511, "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", " was passed");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C0137 m9136(C4511 c4511) {
        return new C0137(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$typeBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5101
            public Object get(Object obj) {
                return Integer.valueOf(((C4533) obj).f13204);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5111
            public void set(Object obj, Object obj2) {
                ((C4533) obj).f13204 = ((Number) obj2).intValue();
            }
        }, c4511);
    }
}
