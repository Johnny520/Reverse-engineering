package sb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0184l;
import p024b9.C1055q;
import p036c9.InterfaceC1400a;
import p185m8.AbstractC5065a1;
import p185m8.AbstractC5068b1;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5112w;
import p185m8.AbstractC5114x;
import p215oc.C5704b;
import p299ub.AbstractC8635q;

/* JADX INFO: renamed from: sb.t */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7294t extends AbstractC7292r {

    /* JADX INFO: renamed from: sb.t$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements Iterable, InterfaceC1400a {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ InterfaceC7282h f24208q;

        public a(InterfaceC7282h interfaceC7282h) {
            this.f24208q = interfaceC7282h;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f24208q.iterator();
        }
    }

    /* JADX INFO: renamed from: sb.t$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class b extends C1055q implements InterfaceC0184l {

        /* JADX INFO: renamed from: y */
        public static final b f24209y = new b();

        public b() {
            super(1, InterfaceC7282h.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final Iterator mo27m(InterfaceC7282h interfaceC7282h) {
            interfaceC7282h.getClass();
            return interfaceC7282h.iterator();
        }
    }

    /* JADX INFO: renamed from: A */
    public static InterfaceC7282h m28893A(InterfaceC7282h interfaceC7282h) {
        interfaceC7282h.getClass();
        InterfaceC7282h interfaceC7282hM28916z = m28916z(interfaceC7282h, new InterfaceC0184l() { // from class: sb.s
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return Boolean.valueOf(AbstractC7294t.m28894B(obj));
            }
        });
        interfaceC7282hM28916z.getClass();
        return interfaceC7282hM28916z;
    }

    /* JADX INFO: renamed from: B */
    public static final boolean m28894B(Object obj) {
        return obj == null;
    }

    /* JADX INFO: renamed from: C */
    public static Object m28895C(InterfaceC7282h interfaceC7282h) {
        interfaceC7282h.getClass();
        Iterator it = interfaceC7282h.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* JADX INFO: renamed from: D */
    public static InterfaceC7282h m28896D(InterfaceC7282h interfaceC7282h, InterfaceC0184l interfaceC0184l) {
        interfaceC7282h.getClass();
        interfaceC0184l.getClass();
        return new C7280f(interfaceC7282h, interfaceC0184l, b.f24209y);
    }

    /* JADX INFO: renamed from: E */
    public static final Appendable m28897E(InterfaceC7282h interfaceC7282h, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC0184l interfaceC0184l) throws IOException {
        interfaceC7282h.getClass();
        appendable.getClass();
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        charSequence4.getClass();
        appendable.append(charSequence2);
        int i11 = 0;
        for (Object obj : interfaceC7282h) {
            i11++;
            if (i11 > 1) {
                appendable.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            AbstractC8635q.m33234a(appendable, obj, interfaceC0184l);
        }
        if (i10 >= 0 && i11 > i10) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    /* JADX INFO: renamed from: F */
    public static final String m28898F(InterfaceC7282h interfaceC7282h, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC0184l interfaceC0184l) {
        interfaceC7282h.getClass();
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        charSequence4.getClass();
        return ((StringBuilder) m28897E(interfaceC7282h, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, interfaceC0184l)).toString();
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ String m28899G(InterfaceC7282h interfaceC7282h, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC0184l interfaceC0184l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        if ((i11 & 4) != 0) {
            charSequence3 = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            interfaceC0184l = null;
        }
        CharSequence charSequence5 = charSequence4;
        InterfaceC0184l interfaceC0184l2 = interfaceC0184l;
        return m28898F(interfaceC7282h, charSequence, charSequence2, charSequence3, i10, charSequence5, interfaceC0184l2);
    }

    /* JADX INFO: renamed from: H */
    public static Object m28900H(InterfaceC7282h interfaceC7282h) {
        interfaceC7282h.getClass();
        Iterator it = interfaceC7282h.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    /* JADX INFO: renamed from: I */
    public static InterfaceC7282h m28901I(InterfaceC7282h interfaceC7282h, InterfaceC0184l interfaceC0184l) {
        interfaceC7282h.getClass();
        interfaceC0184l.getClass();
        return new C7296v(interfaceC7282h, interfaceC0184l);
    }

    /* JADX INFO: renamed from: J */
    public static InterfaceC7282h m28902J(InterfaceC7282h interfaceC7282h, InterfaceC0184l interfaceC0184l) {
        interfaceC7282h.getClass();
        interfaceC0184l.getClass();
        return m28893A(new C7296v(interfaceC7282h, interfaceC0184l));
    }

    /* JADX INFO: renamed from: K */
    public static InterfaceC7282h m28903K(InterfaceC7282h interfaceC7282h, Iterable iterable) {
        interfaceC7282h.getClass();
        iterable.getClass();
        return AbstractC7291q.m28882j(AbstractC7291q.m28892t(interfaceC7282h, AbstractC5081g0.m20555Y(iterable)));
    }

    /* JADX INFO: renamed from: L */
    public static InterfaceC7282h m28904L(InterfaceC7282h interfaceC7282h, Object obj) {
        interfaceC7282h.getClass();
        return AbstractC7291q.m28882j(AbstractC7291q.m28892t(interfaceC7282h, AbstractC7291q.m28891s(obj)));
    }

    /* JADX INFO: renamed from: M */
    public static InterfaceC7282h m28905M(InterfaceC7282h interfaceC7282h, InterfaceC7282h interfaceC7282h2) {
        interfaceC7282h.getClass();
        interfaceC7282h2.getClass();
        return AbstractC7291q.m28882j(AbstractC7291q.m28892t(interfaceC7282h, interfaceC7282h2));
    }

    /* JADX INFO: renamed from: N */
    public static InterfaceC7282h m28906N(InterfaceC7282h interfaceC7282h, InterfaceC0184l interfaceC0184l) {
        interfaceC7282h.getClass();
        interfaceC0184l.getClass();
        return new C7295u(interfaceC7282h, interfaceC0184l);
    }

    /* JADX INFO: renamed from: O */
    public static final Collection m28907O(InterfaceC7282h interfaceC7282h, Collection collection) {
        interfaceC7282h.getClass();
        collection.getClass();
        Iterator it = interfaceC7282h.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
        return collection;
    }

    /* JADX INFO: renamed from: P */
    public static List m28908P(InterfaceC7282h interfaceC7282h) {
        interfaceC7282h.getClass();
        Iterator it = interfaceC7282h.iterator();
        if (!it.hasNext()) {
            return AbstractC5114x.m20800o();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC5112w.m20789e(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: Q */
    public static List m28909Q(InterfaceC7282h interfaceC7282h) {
        interfaceC7282h.getClass();
        return (List) m28907O(interfaceC7282h, new ArrayList());
    }

    /* JADX INFO: renamed from: R */
    public static Set m28910R(InterfaceC7282h interfaceC7282h) {
        interfaceC7282h.getClass();
        Iterator it = interfaceC7282h.iterator();
        if (!it.hasNext()) {
            return AbstractC5068b1.m20483e();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC5065a1.m20479d(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: v */
    public static Iterable m28912v(InterfaceC7282h interfaceC7282h) {
        interfaceC7282h.getClass();
        return new a(interfaceC7282h);
    }

    /* JADX INFO: renamed from: w */
    public static int m28913w(InterfaceC7282h interfaceC7282h) {
        interfaceC7282h.getClass();
        Iterator it = interfaceC7282h.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                AbstractC5114x.m20809x();
            }
        }
        return i10;
    }

    /* JADX INFO: renamed from: x */
    public static InterfaceC7282h m28914x(InterfaceC7282h interfaceC7282h, int i10) {
        interfaceC7282h.getClass();
        if (i10 >= 0) {
            return i10 == 0 ? interfaceC7282h : interfaceC7282h instanceof InterfaceC7277c ? ((InterfaceC7277c) interfaceC7282h).mo28855a(i10) : new C7276b(interfaceC7282h, i10);
        }
        C5704b.m23087a("Requested element count ", i10, " is less than zero.");
        return null;
    }

    /* JADX INFO: renamed from: y */
    public static InterfaceC7282h m28915y(InterfaceC7282h interfaceC7282h, InterfaceC0184l interfaceC0184l) {
        interfaceC7282h.getClass();
        interfaceC0184l.getClass();
        return new C7279e(interfaceC7282h, true, interfaceC0184l);
    }

    /* JADX INFO: renamed from: z */
    public static InterfaceC7282h m28916z(InterfaceC7282h interfaceC7282h, InterfaceC0184l interfaceC0184l) {
        interfaceC7282h.getClass();
        interfaceC0184l.getClass();
        return new C7279e(interfaceC7282h, false, interfaceC0184l);
    }
}
