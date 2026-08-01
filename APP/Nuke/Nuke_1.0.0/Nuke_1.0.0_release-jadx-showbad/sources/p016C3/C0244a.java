package p016C3;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bumptech.glide.AbstractC1923e;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.concurrent.ConcurrentHashMap;
import me.dartcv.nuke.BuildConfig;
import nuke.data.cipher.NativeCrypto;
import p007B0.C0190d;
import p014C1.C0240b;
import p021D3.C0274k;
import p041H0.AbstractC0596h0;
import p044H3.AbstractC0646a;
import p049I2.AbstractC0797o;
import p049I2.C0793k;
import p049I2.SharedPreferencesC0796n;
import p053J3.C0859t;
import p056K2.C0887m;
import p056K2.C0891q;
import p061L2.AbstractC0973m;
import p061L2.C0981u;
import p095T.AbstractC1346X;
import p095T.C1311F;
import p095T.C1316H0;
import p095T.C1324L0;
import p095T.C1349a;
import p095T.C1383r;
import p095T.InterfaceC1347Y;
import p100U.C1440a;
import p100U.C1441b;
import p100U.InterfaceC1438K;
import p105V.C1483e;
import p108V3.C1544Q;
import p108V3.C1551d;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p117X2.C1673r;
import p118X3.C1691a;
import p118X3.C1696f;
import p118X3.C1705o;
import p127Z2.AbstractC1784a;
import p132a3.C1804d;
import p136b0.AbstractC1840b;
import p136b0.C1839a;
import p149d3.AbstractC1976d;
import p153e1.C2016l;
import p163g0.C2169a;
import p163g0.C2170b;
import p179i4.AbstractC2352g;
import p186k.C2439u;
import p204n0.C2684c;
import p227r.C2962L0;
import p227r.C2976a;
import p227r.C2988g;
import p227r.C2992i;
import p227r.InterfaceC2982d;
import p236s3.C3186b;
import p238t.AbstractC3204b;
import p255w.C3372c;
import p255w.C3375f;
import p255w.C3377h;
import p255w.C3385p;
import p260x.C3443z;
import p266y.C3478h;

/* JADX INFO: renamed from: C3.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0244a implements InterfaceC1599a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f815d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f816e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f817f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f818g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0244a(C1383r c1383r, C1440a c1440a, C1316H0 c1316h0, AbstractC1346X abstractC1346X) {
        this.f815d = 1;
        this.f816e = c1383r;
        this.f817f = c1440a;
        this.f818g = c1316h0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        Iterable iterableM4211y;
        int i5;
        int i6 = this.f815d;
        C0891q c0891q = C0891q.f2780a;
        Object obj = this.f818g;
        Object obj2 = this.f817f;
        Object obj3 = this.f816e;
        switch (i6) {
            case 0:
                C0245b c0245b = (C0245b) obj3;
                String str = (String) obj2;
                String str2 = (String) obj;
                SharedPreferencesC0796n sharedPreferencesC0796n = c0245b.f819a;
                ConcurrentHashMap concurrentHashMap = c0245b.f822d;
                String strConfKeyName = (String) concurrentHashMap.get(str);
                if (strConfKeyName == null) {
                    AbstractC1665j.m2985e(str, "key");
                    strConfKeyName = NativeCrypto.INSTANCE.confKeyName(str);
                    concurrentHashMap.put(str, strConfKeyName);
                }
                AbstractC1665j.m2985e(str2, "plainText");
                sharedPreferencesC0796n.putString(strConfKeyName, NativeCrypto.INSTANCE.confEncrypt(str2));
                return c0891q;
            case BuildConfig.VERSION_CODE /* 1 */:
                C1383r c1383r = (C1383r) obj3;
                C1440a c1440a = (C1440a) obj2;
                C1316H0 c1316h0 = (C1316H0) obj;
                C1441b c1441b = c1383r.f4875M;
                C1440a c1440a2 = c1441b.f5104b;
                try {
                    c1441b.f5104b = c1440a;
                    C1316H0 c1316h02 = c1383r.f4869G;
                    int[] iArr = c1383r.f4898o;
                    C2439u c2439u = c1383r.f4905v;
                    c1383r.f4898o = null;
                    c1383r.f4905v = null;
                    try {
                        c1383r.f4869G = c1316h0;
                        boolean z5 = c1441b.f5107e;
                        try {
                            c1441b.f5107e = false;
                            throw null;
                        } catch (Throwable th) {
                            c1441b.f5107e = z5;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        c1383r.f4869G = c1316h02;
                        c1383r.f4898o = iArr;
                        c1383r.f4905v = c2439u;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    c1441b.f5104b = c1440a2;
                    throw th3;
                }
            case 2:
                C1349a c1349a = (C1349a) obj3;
                C1324L0 c1324l0 = (C1324L0) obj2;
                InterfaceC1438K interfaceC1438K = (InterfaceC1438K) obj;
                if (c1349a != null) {
                    c1324l0.m2471a(c1324l0.m2473c(c1349a) - c1324l0.f4742t);
                }
                List listM3473k = AbstractC1923e.m3473k(c1324l0, null, c1324l0.f4742t, null);
                C2170b c2170b = (C2170b) AbstractC0973m.m2018Y(listM3473k);
                Integer num = c2170b != null ? c2170b.f7130b : null;
                List listMo37f = interfaceC1438K.mo37f(num);
                if (num != null && !listMo37f.isEmpty()) {
                    C2170b c2170b2 = (C2170b) AbstractC0973m.m2012S(listMo37f);
                    int size = listMo37f.size() - 1;
                    if (size <= 0) {
                        iterableM4211y = C0981u.f3047d;
                    } else if (size == 1) {
                        iterableM4211y = AbstractC2352g.m4211y(AbstractC0973m.m2017X(listMo37f));
                    } else {
                        ArrayList arrayList = new ArrayList(size);
                        if (listMo37f instanceof RandomAccess) {
                            int size2 = listMo37f.size();
                            while (i < size2) {
                                arrayList.add(listMo37f.get(i));
                                i++;
                            }
                        } else {
                            ListIterator listIterator = listMo37f.listIterator(1);
                            while (listIterator.hasNext()) {
                                arrayList.add(listIterator.next());
                            }
                        }
                        iterableM4211y = arrayList;
                    }
                    listMo37f = AbstractC0973m.m2019Z(AbstractC2352g.m4211y(new C2170b(c2170b2.f7129a, null, num)), iterableM4211y);
                }
                return new C2169a(AbstractC0973m.m2019Z(listM3473k, listMo37f));
            case 3:
                Context context = (Context) obj3;
                ((InterfaceC1347Y) obj).setValue(null);
                String string = AbstractC1976d.m3647o0(((C1551d) obj2).f5402a).toString();
                if (!AbstractC1976d.m3637e0(string)) {
                    try {
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(string));
                        intent.addFlags(268435456);
                        context.startActivity(intent);
                    } catch (Throwable th4) {
                        AbstractC1784a.m3229o(th4);
                    }
                    break;
                }
                return c0891q;
            case 4:
                InterfaceC1347Y interfaceC1347Y = (InterfaceC1347Y) obj2;
                InterfaceC1347Y interfaceC1347Y2 = (InterfaceC1347Y) obj;
                C0887m c0887m = C0274k.f881a;
                AbstractC0646a abstractC0646a = ((C1544Q) obj3).f5366a;
                String strMo1118c = abstractC0646a.mo1118c();
                AbstractC1665j.m2985e(strMo1118c, "hookerId");
                List listM465h = C0274k.m465h();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : listM465h) {
                    if (!AbstractC1665j.m2981a(((C0859t) obj4).m1830l(), strMo1118c)) {
                        arrayList2.add(obj4);
                    }
                }
                try {
                    C0274k.m466i().m450d("hooker_debug_records", arrayList2, new C3186b(C0859t.Companion.serializer()));
                    break;
                } catch (Throwable th5) {
                    AbstractC1784a.m3229o(th5);
                }
                abstractC0646a.f2057b.clear();
                interfaceC1347Y.setValue(Integer.valueOf(((Number) interfaceC1347Y.getValue()).intValue() + 1));
                interfaceC1347Y2.setValue(null);
                return c0891q;
            case 5:
                InterfaceC1601c interfaceC1601c = (InterfaceC1601c) obj3;
                String str3 = (String) obj2;
                String str4 = (String) obj;
                if (str3 == null) {
                    str3 = str4;
                }
                interfaceC1601c.mo1h(str3);
                return c0891q;
            case 6:
                ((AbstractC1840b) obj3).mo2500a();
                C1839a c1839a = (C1839a) ((C0240b) obj2).f810c;
                int i7 = ((C1673r) obj).f5707d;
                do {
                    i5 = c1839a.get();
                } while (!c1839a.compareAndSet(i5, ((i5 >>> 27) & 15) == i7 ? i5 - 1 : i5));
                return c0891q;
            case 7:
                AbstractC0797o abstractC0797o = ((C1696f) obj3).f5804b;
                AbstractC1665j.m2982b(abstractC0797o);
                return abstractC0797o.mo1402i(((C1691a) obj).f5782h.f5871d, ((C1705o) obj2).m3021a());
            case 8:
                C2992i c2992i = (C2992i) obj3;
                C2962L0 c2962l0 = (C2962L0) obj2;
                InterfaceC2982d interfaceC2982d = (InterfaceC2982d) obj;
                C2976a c2976a = c2992i.f9474v;
                while (true) {
                    C1483e c1483e = c2976a.f9424a;
                    int i8 = c1483e.f5183f;
                    if (i8 != 0) {
                        if (i8 == 0) {
                            throw new NoSuchElementException("MutableVector is empty.");
                        }
                        C2684c c2684c = (C2684c) ((C2988g) c1483e.f5181d[i8 - 1]).f9458a.mo6a();
                        if (c2684c == null ? true : C2992i.m5204K0(c2992i, c2684c, 0L, 0L, 3)) {
                            C1483e c1483e2 = c2976a.f9424a;
                            ((C2988g) c1483e2.m2762k(c1483e2.f5183f - 1)).f9459b.mo278i(c0891q);
                        }
                    }
                }
                if (c2992i.f9475w) {
                    C2684c c2684c2 = (C2684c) c2992i.f9473u.mo6a();
                    if (((c2684c2 == null || !C2992i.m5204K0(c2992i, c2684c2, 0L, 0L, 3)) ? 0 : 1) != 0) {
                        c2992i.f9475w = false;
                    }
                }
                c2962l0.f9380e = C2992i.m5203J0(c2992i, interfaceC2982d, 0L);
                return c0891q;
            case 9:
                C3385p c3385p = (C3385p) obj2;
                C3375f c3375f = (C3375f) ((C1311F) obj3).getValue();
                return new C3377h(c3385p, c3375f, (C3372c) obj, new C0793k((C1804d) ((C3443z) c3385p.f10563e.f744e).getValue(), c3375f));
            default:
                C3478h c3478h = (C3478h) obj3;
                C2684c c2684cM5711J0 = C3478h.m5711J0(c3478h, (AbstractC0596h0) obj2, (C0190d) obj);
                if (c2684cM5711J0 == null) {
                    return null;
                }
                C2992i c2992i2 = c3478h.f10798r;
                if (C2016l.m3704a(c2992i2.f9476x, 0L)) {
                    AbstractC3204b.m5477c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return c2684cM5711J0.m4658i(c2992i2.m5206M0(c2684cM5711J0, c2992i2.f9476x, 0L) ^ (-9223372034707292160L));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C0244a(Object obj, Object obj2, Object obj3, int i5) {
        this.f815d = i5;
        this.f816e = obj;
        this.f817f = obj2;
        this.f818g = obj3;
    }
}
