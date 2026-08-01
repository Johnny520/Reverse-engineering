package p310v6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p185m8.AbstractC5114x;
import p310v6.C8842c;
import p376zd.C9987e;

/* JADX INFO: renamed from: v6.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8842c {

    /* JADX INFO: renamed from: b */
    public static final a f29376b = new a(null);

    /* JADX INFO: renamed from: a */
    public final b f29377a;

    /* JADX INFO: renamed from: v6.c$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final char f29378a;

        /* JADX INFO: renamed from: b */
        public final List f29379b;

        /* JADX INFO: renamed from: c */
        public final List f29380c;

        /* JADX INFO: renamed from: d */
        public final b[] f29381d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(char c10, List list, List list2) {
            list.getClass();
            list2.getClass();
            this.f29378a = c10;
            this.f29379b = list;
            this.f29380c = list2;
            b[] bVarArr = new b[256];
            for (int i10 = 0; i10 < 256; i10++) {
                Iterator it = this.f29380c.iterator();
                Object obj = null;
                boolean z10 = false;
                Object obj2 = null;
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((b) next).f29378a == i10) {
                            if (z10) {
                                break;
                            }
                            z10 = true;
                            obj2 = next;
                        }
                    } else if (z10) {
                        obj = obj2;
                    }
                }
                bVarArr[i10] = obj;
            }
            this.f29381d = bVarArr;
        }

        /* JADX INFO: renamed from: a */
        public final b[] m33947a() {
            return this.f29381d;
        }

        /* JADX INFO: renamed from: b */
        public final List m33948b() {
            return this.f29379b;
        }
    }

    public C8842c(b bVar) {
        bVar.getClass();
        this.f29377a = bVar;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ List m33940b(C8842c c8842c, CharSequence charSequence, int i10, int i11, boolean z10, InterfaceC0188p interfaceC0188p, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = charSequence.length();
        }
        if ((i12 & 8) != 0) {
            z10 = false;
        }
        return c8842c.m33941a(charSequence, i10, i11, z10, interfaceC0188p);
    }

    /* JADX INFO: renamed from: a */
    public final List m33941a(CharSequence charSequence, int i10, int i11, boolean z10, InterfaceC0188p interfaceC0188p) {
        charSequence.getClass();
        interfaceC0188p.getClass();
        if (charSequence.length() == 0) {
            C9987e.m38645a("Couldn't search in char tree for empty string");
            return null;
        }
        b bVar = this.f29377a;
        while (i10 < i11) {
            char cCharAt = charSequence.charAt(i10);
            if (((Boolean) interfaceC0188p.invoke(Character.valueOf(cCharAt), Integer.valueOf(cCharAt))).booleanValue()) {
                break;
            }
            b bVar2 = bVar.m33947a()[cCharAt];
            if (bVar2 == null) {
                bVar = z10 ? bVar.m33947a()[Character.toLowerCase(cCharAt)] : null;
                if (bVar == null) {
                    return AbstractC5114x.m20800o();
                }
            } else {
                bVar = bVar2;
            }
            i10++;
        }
        return bVar.m33948b();
    }

    /* JADX INFO: renamed from: v6.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static int m33942a(CharSequence charSequence) {
            charSequence.getClass();
            return charSequence.length();
        }

        /* JADX INFO: renamed from: b */
        public static char m33943b(CharSequence charSequence, int i10) {
            charSequence.getClass();
            return charSequence.charAt(i10);
        }

        /* JADX INFO: renamed from: c */
        public final C8842c m33944c(List list) {
            list.getClass();
            return m33945d(list, new InterfaceC0184l() { // from class: v6.a
                @Override // p010a9.InterfaceC0184l
                /* JADX INFO: renamed from: m */
                public final Object mo27m(Object obj) {
                    return Integer.valueOf(C8842c.a.m33942a((CharSequence) obj));
                }
            }, new InterfaceC0188p() { // from class: v6.b
                @Override // p010a9.InterfaceC0188p
                public final Object invoke(Object obj, Object obj2) {
                    return Character.valueOf(C8842c.a.m33943b((CharSequence) obj, ((Integer) obj2).intValue()));
                }
            });
        }

        /* JADX INFO: renamed from: d */
        public final C8842c m33945d(List list, InterfaceC0184l interfaceC0184l, InterfaceC0188p interfaceC0188p) {
            Object obj;
            list.getClass();
            interfaceC0184l.getClass();
            interfaceC0188p.getClass();
            Iterator it = list.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    Comparable comparable = (Comparable) interfaceC0184l.mo27m(next);
                    do {
                        Object next2 = it.next();
                        Comparable comparable2 = (Comparable) interfaceC0184l.mo27m(next2);
                        if (comparable.compareTo(comparable2) < 0) {
                            next = next2;
                            comparable = comparable2;
                        }
                    } while (it.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            if (obj == null) {
                throw new NoSuchElementException("Unable to build char tree from an empty list");
            }
            int iIntValue = ((Number) interfaceC0184l.mo27m(obj)).intValue();
            if (list == null || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((Number) interfaceC0184l.mo27m(it2.next())).intValue() == 0) {
                        C9987e.m38645a("There should be no empty entries");
                        return null;
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            m33946e(arrayList, list, iIntValue, 0, interfaceC0184l, interfaceC0188p);
            arrayList.trimToSize();
            return new C8842c(new b((char) 0, AbstractC5114x.m20800o(), arrayList));
        }

        /* JADX INFO: renamed from: e */
        public final void m33946e(List list, List list2, int i10, int i11, InterfaceC0184l interfaceC0184l, InterfaceC0188p interfaceC0188p) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list2) {
                Character ch = (Character) interfaceC0188p.invoke(obj, Integer.valueOf(i11));
                ch.charValue();
                Object arrayList = linkedHashMap.get(ch);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(ch, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            InterfaceC0188p interfaceC0188p2 = interfaceC0188p;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                char cCharValue = ((Character) entry.getKey()).charValue();
                List list3 = (List) entry.getValue();
                int i12 = i11 + 1;
                ArrayList arrayList2 = new ArrayList();
                a aVar = C8842c.f29376b;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : list3) {
                    if (((Number) interfaceC0184l.mo27m(obj2)).intValue() > i12) {
                        arrayList3.add(obj2);
                    }
                }
                aVar.m33946e(arrayList2, arrayList3, i10, i12, interfaceC0184l, interfaceC0188p2);
                arrayList2.trimToSize();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : list3) {
                    if (((Number) interfaceC0184l.mo27m(obj3)).intValue() == i12) {
                        arrayList4.add(obj3);
                    }
                }
                list.add(new b(cCharValue, arrayList4, arrayList2));
                interfaceC0188p2 = interfaceC0188p;
            }
        }

        public a() {
        }
    }
}
