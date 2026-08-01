package p300uc;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1052o0;
import p024b9.C1062t0;
import p098g9.InterfaceC2549c;
import p172l8.AbstractC4706m;
import p172l8.C4700i0;
import p172l8.EnumC4708o;
import p172l8.InterfaceC4705l;
import p185m8.AbstractC5102r;
import p185m8.AbstractC5106t;
import p185m8.AbstractC5107t0;
import p185m8.AbstractC5109u0;
import p185m8.AbstractC5114x;
import p185m8.InterfaceC5093m0;
import p329wc.AbstractC9216d;
import p329wc.AbstractC9223k;
import p329wc.AbstractC9224l;
import p329wc.C9213a;
import p329wc.InterfaceC9218f;
import p345xc.InterfaceC9485c;
import p345xc.InterfaceC9488f;
import p361yc.AbstractC9671b;
import vc.AbstractC8920a;

/* JADX INFO: renamed from: uc.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8658l extends AbstractC9671b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2549c f28730a;

    /* JADX INFO: renamed from: b */
    public List f28731b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4705l f28732c;

    /* JADX INFO: renamed from: d */
    public final Map f28733d;

    /* JADX INFO: renamed from: e */
    public final Map f28734e;

    /* JADX INFO: renamed from: uc.l$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC5093m0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Iterable f28735a;

        public a(Iterable iterable) {
            this.f28735a = iterable;
        }

        @Override // p185m8.InterfaceC5093m0
        /* JADX INFO: renamed from: a */
        public Object mo20616a(Object obj) {
            return ((InterfaceC8647b) ((Map.Entry) obj).getValue()).mo15953a().mo35888a();
        }

        @Override // p185m8.InterfaceC5093m0
        /* JADX INFO: renamed from: b */
        public Iterator mo20617b() {
            return this.f28735a.iterator();
        }
    }

    public C8658l(final String str, InterfaceC2549c interfaceC2549c, InterfaceC2549c[] interfaceC2549cArr, InterfaceC8647b[] interfaceC8647bArr) {
        str.getClass();
        interfaceC2549c.getClass();
        interfaceC2549cArr.getClass();
        interfaceC8647bArr.getClass();
        this.f28730a = interfaceC2549c;
        this.f28731b = AbstractC5114x.m20800o();
        this.f28732c = AbstractC4706m.m18788b(EnumC4708o.f13922r, new InterfaceC0173a() { // from class: uc.i
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C8658l.m33266n(str, this);
            }
        });
        if (interfaceC2549cArr.length != interfaceC8647bArr.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + mo33261k().mo3794w() + " should be marked @Serializable");
        }
        Map mapM20778s = AbstractC5109u0.m20778s(AbstractC5106t.m20745l1(interfaceC2549cArr, interfaceC8647bArr));
        this.f28733d = mapM20778s;
        a aVar = new a(mapM20778s.entrySet());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator itMo20617b = aVar.mo20617b();
        while (itMo20617b.hasNext()) {
            Object next = itMo20617b.next();
            Object objMo20616a = aVar.mo20616a(next);
            Object obj = linkedHashMap.get(objMo20616a);
            if (obj == null) {
                linkedHashMap.containsKey(objMo20616a);
            }
            Map.Entry entry = (Map.Entry) next;
            Map.Entry entry2 = (Map.Entry) obj;
            String str2 = (String) objMo20616a;
            if (entry2 != null) {
                StringBuilder sb2 = new StringBuilder("Multiple sealed subclasses of '");
                sb2.append(mo33261k());
                sb2.append("' have the same serial name '");
                sb2.append(str2);
                sb2.append("': '");
                sb2.append(entry2.getKey());
                Object key = entry.getKey();
                sb2.append("', '");
                sb2.append(key);
                sb2.append('\'');
                throw new IllegalStateException(sb2.toString().toString());
            }
            linkedHashMap.put(objMo20616a, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC5107t0.m20763e(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (InterfaceC8647b) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.f28734e = linkedHashMap2;
    }

    /* JADX INFO: renamed from: l */
    public static C4700i0 m33264l(final C8658l c8658l, C9213a c9213a) {
        c9213a.getClass();
        C9213a.m35877b(c9213a, "type", AbstractC8920a.m34224D(C1062t0.f3215a).mo15953a(), null, false, 12, null);
        C9213a.m35877b(c9213a, "value", AbstractC9223k.m35908d("kotlinx.serialization.Sealed<" + c8658l.mo33261k().mo3794w() + '>', AbstractC9224l.a.f31484a, new InterfaceC9218f[0], new InterfaceC0184l() { // from class: uc.k
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C8658l.m33265m(this.f28729q, (C9213a) obj);
            }
        }), null, false, 12, null);
        c9213a.m35884h(c8658l.f28731b);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: m */
    public static C4700i0 m33265m(C8658l c8658l, C9213a c9213a) {
        c9213a.getClass();
        for (Map.Entry entry : c8658l.f28734e.entrySet()) {
            C9213a.m35877b(c9213a, (String) entry.getKey(), ((InterfaceC8647b) entry.getValue()).mo15953a(), null, false, 12, null);
        }
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: n */
    public static InterfaceC9218f m33266n(String str, final C8658l c8658l) {
        return AbstractC9223k.m35908d(str, AbstractC9216d.b.f31455a, new InterfaceC9218f[0], new InterfaceC0184l() { // from class: uc.j
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C8658l.m33264l(this.f28728q, (C9213a) obj);
            }
        });
    }

    @Override // p300uc.InterfaceC8647b, p300uc.InterfaceC8662p, p300uc.InterfaceC8645a
    /* JADX INFO: renamed from: a */
    public InterfaceC9218f mo15953a() {
        return (InterfaceC9218f) this.f28732c.getValue();
    }

    @Override // p361yc.AbstractC9671b
    /* JADX INFO: renamed from: i */
    public InterfaceC8645a mo33267i(InterfaceC9485c interfaceC9485c, String str) {
        interfaceC9485c.getClass();
        InterfaceC8647b interfaceC8647b = (InterfaceC8647b) this.f28734e.get(str);
        return interfaceC8647b != null ? interfaceC8647b : super.mo33267i(interfaceC9485c, str);
    }

    @Override // p361yc.AbstractC9671b
    /* JADX INFO: renamed from: j */
    public InterfaceC8662p mo33268j(InterfaceC9488f interfaceC9488f, Object obj) {
        interfaceC9488f.getClass();
        obj.getClass();
        InterfaceC8647b interfaceC8647b = (InterfaceC8647b) this.f28733d.get(AbstractC1052o0.m3807b(obj.getClass()));
        InterfaceC8647b interfaceC8647bMo33268j = interfaceC8647b != null ? interfaceC8647b : super.mo33268j(interfaceC9488f, obj);
        if (interfaceC8647bMo33268j != null) {
            return interfaceC8647bMo33268j;
        }
        return null;
    }

    @Override // p361yc.AbstractC9671b
    /* JADX INFO: renamed from: k */
    public InterfaceC2549c mo33261k() {
        return this.f28730a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8658l(String str, InterfaceC2549c interfaceC2549c, InterfaceC2549c[] interfaceC2549cArr, InterfaceC8647b[] interfaceC8647bArr, Annotation[] annotationArr) {
        this(str, interfaceC2549c, interfaceC2549cArr, interfaceC8647bArr);
        str.getClass();
        interfaceC2549c.getClass();
        interfaceC2549cArr.getClass();
        interfaceC8647bArr.getClass();
        annotationArr.getClass();
        this.f28731b = AbstractC5102r.m20652d(annotationArr);
    }
}
