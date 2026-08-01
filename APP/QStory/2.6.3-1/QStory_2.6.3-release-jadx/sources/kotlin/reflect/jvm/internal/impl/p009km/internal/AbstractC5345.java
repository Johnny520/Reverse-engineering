package kotlin.reflect.jvm.internal.impl.p009km.internal;

import androidx.appcompat.widget.C0984;
import androidx.collection.C1123;
import androidx.compose.animation.core.C1171;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.AbstractC5177;
import kotlin.enums.InterfaceC5197;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.p009km.C5357;
import kotlin.reflect.jvm.internal.impl.p009km.C5358;
import kotlin.reflect.jvm.internal.impl.p009km.C5362;
import kotlin.reflect.jvm.internal.impl.p009km.C5366;
import kotlin.reflect.jvm.internal.impl.p009km.C5367;
import kotlin.reflect.jvm.internal.impl.p009km.C5368;
import kotlin.reflect.jvm.internal.impl.p009km.C5370;
import kotlin.reflect.jvm.internal.impl.p009km.C5381;
import kotlin.reflect.jvm.internal.impl.p009km.MemberKind;
import kotlin.reflect.jvm.internal.impl.p009km.Modality;
import kotlin.reflect.jvm.internal.impl.p009km.ReturnValueStatus;
import kotlin.reflect.jvm.internal.impl.p009km.Visibility;
import p086.AbstractC7728;
import p086.AbstractC7729;
import p086.C7730;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.internal.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5345 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C0984 m9674(C5344 c5344) {
        return new C0984(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$propertyAccessorBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5934
            public Object get(Object obj) {
                return Integer.valueOf(((C5367) obj).f13556);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5944
            public void set(Object obj, Object obj2) {
                ((C5367) obj).f13556 = ((Number) obj2).intValue();
            }
        }, c5344);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C1171 m9675(MutablePropertyReference1Impl mutablePropertyReference1Impl) {
        mutablePropertyReference1Impl.getClass();
        C7730 c7730 = AbstractC7728.f18725;
        c7730.getClass();
        InterfaceC5197 entries = Modality.getEntries();
        InterfaceC5197 entries2 = Modality.getEntries();
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(entries2, 10));
        Iterator<E> it = entries2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Modality) it.next()).getFlag$kotlin_metadata());
        }
        return new C1171(mutablePropertyReference1Impl, c7730, entries, arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m9676(MutablePropertyReference1Impl mutablePropertyReference1Impl) {
        mutablePropertyReference1Impl.getClass();
        AbstractC7728.f18738.getClass();
        InterfaceC5197 entries = MemberKind.getEntries();
        InterfaceC5197 entries2 = MemberKind.getEntries();
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(entries2, 10));
        Iterator<E> it = entries2.iterator();
        while (it.hasNext()) {
            arrayList.add(((MemberKind) it.next()).getFlag$kotlin_metadata());
        }
        entries.getClass();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C0984 m9677(C5344 c5344) {
        return new C0984(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$functionBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5934
            public Object get(Object obj) {
                return Integer.valueOf(((C5370) obj).f13582);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5944
            public void set(Object obj, Object obj2) {
                ((C5370) obj).f13582 = ((Number) obj2).intValue();
            }
        }, c5344);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m9678(C5344 c5344) {
        new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$constructorBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5934
            public Object get(Object obj) {
                return Integer.valueOf(((C5362) obj).f13544);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5944
            public void set(Object obj, Object obj2) {
                ((C5362) obj).f13544 = ((Number) obj2).intValue();
            }
        }.getClass();
        if (c5344.f13501 == 1 && c5344.f13500 == 1) {
            return;
        }
        C1123.m1409(c5344, "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", " was passed");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0984 m9679(C5344 c5344) {
        return new C0984(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$classBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5934
            public Object get(Object obj) {
                return Integer.valueOf(((C5381) obj).f13634);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5944
            public void set(Object obj, Object obj2) {
                ((C5381) obj).f13634 = ((Number) obj2).intValue();
            }
        }, c5344);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final void m9680(MutablePropertyReference1Impl mutablePropertyReference1Impl, AbstractC7729 abstractC7729) {
        mutablePropertyReference1Impl.getClass();
        abstractC7729.getClass();
        InterfaceC5197 entries = ReturnValueStatus.getEntries();
        InterfaceC5197 entries2 = ReturnValueStatus.getEntries();
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(entries2, 10));
        Iterator<E> it = entries2.iterator();
        while (it.hasNext()) {
            arrayList.add(new C5344(abstractC7729, ((ReturnValueStatus) it.next()).ordinal()));
        }
        entries.getClass();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C0984 m9681(C5344 c5344) {
        return new C0984(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$propertyBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5934
            public Object get(Object obj) {
                return Integer.valueOf(((C5368) obj).f13563);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5944
            public void set(Object obj, Object obj2) {
                ((C5368) obj).f13563 = ((Number) obj2).intValue();
            }
        }, c5344);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C0984 m9682(C5344 c5344) {
        return new C0984(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$valueParameterBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5934
            public Object get(Object obj) {
                return Integer.valueOf(((C5358) obj).f13533);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5944
            public void set(Object obj, Object obj2) {
                ((C5358) obj).f13533 = ((Number) obj2).intValue();
            }
        }, c5344);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C1171 m9683(MutablePropertyReference1Impl mutablePropertyReference1Impl) {
        mutablePropertyReference1Impl.getClass();
        C7730 c7730 = AbstractC7728.f18726;
        c7730.getClass();
        InterfaceC5197 entries = Visibility.getEntries();
        InterfaceC5197 entries2 = Visibility.getEntries();
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(entries2, 10));
        Iterator<E> it = entries2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Visibility) it.next()).getFlag$kotlin_metadata());
        }
        return new C1171(mutablePropertyReference1Impl, c7730, entries, arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final void m9684(C5344 c5344) {
        new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$typeAliasBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5934
            public Object get(Object obj) {
                return Integer.valueOf(((C5357) obj).f13528);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5944
            public void set(Object obj, Object obj2) {
                ((C5357) obj).f13528 = ((Number) obj2).intValue();
            }
        }.getClass();
        if (c5344.f13501 == 1 && c5344.f13500 == 1) {
            return;
        }
        C1123.m1409(c5344, "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", " was passed");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C0984 m9685(C5344 c5344) {
        return new C0984(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$typeBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5934
            public Object get(Object obj) {
                return Integer.valueOf(((C5366) obj).f13553);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5944
            public void set(Object obj, Object obj2) {
                ((C5366) obj).f13553 = ((Number) obj2).intValue();
            }
        }, c5344);
    }
}
