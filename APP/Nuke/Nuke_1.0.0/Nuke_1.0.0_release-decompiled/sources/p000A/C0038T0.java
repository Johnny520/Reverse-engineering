package p000A;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.AbstractC1923e;
import com.bumptech.glide.AbstractC1926h;
import com.bumptech.glide.load.data.InterfaceC1933c;
import com.bumptech.glide.load.data.InterfaceC1934d;
import java.io.File;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import p002A1.C0115D;
import p016C3.C0244a;
import p021D3.RunnableC0267d;
import p027E4.AbstractC0315b0;
import p027E4.C0289C;
import p027E4.C0306U;
import p027E4.C0328o;
import p027E4.InterfaceC0318e;
import p027E4.InterfaceC0320g;
import p027E4.InterfaceC0321h;
import p029F0.InterfaceC0377O;
import p041H0.AbstractC0599j;
import p041H0.AbstractC0601k;
import p041H0.C0564I;
import p041H0.EnumC0557E;
import p041H0.InterfaceC0607n;
import p061L2.AbstractC0973m;
import p068N1.C1013c;
import p078P1.C1147i;
import p078P1.InterfaceC1144f;
import p078P1.InterfaceC1150l;
import p088R1.C1199I;
import p088R1.C1204e;
import p088R1.C1211l;
import p088R1.InterfaceC1194D;
import p088R1.RunnableC1209j;
import p092S0.AbstractC1251D;
import p092S0.C1259L;
import p092S0.C1269g;
import p093S1.C1291c;
import p093S1.InterfaceC1289a;
import p093S1.InterfaceC1296h;
import p095T.AbstractC1346X;
import p095T.AbstractC1385s;
import p095T.C1324L0;
import p095T.C1358e0;
import p095T.C1366i0;
import p095T.InterfaceC1359f;
import p097T1.C1413b;
import p097T1.C1414c;
import p097T1.C1420i;
import p100U.InterfaceC1438K;
import p101U0.C1470e;
import p101U0.InterfaceC1469d;
import p105V.C1483e;
import p107V1.C1517p;
import p110W0.C1577b;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p115X0.C1633h;
import p115X0.C1646u;
import p115X0.InterfaceC1632g;
import p116X1.AbstractC1652a;
import p116X1.C1654c;
import p117X2.AbstractC1665j;
import p118X3.C1684F;
import p121Y1.C1733A;
import p121Y1.C1736D;
import p121Y1.C1741b;
import p121Y1.C1743d;
import p121Y1.InterfaceC1756q;
import p136b0.C1839a;
import p138b4.C1860e;
import p138b4.C1861f;
import p144c4.InterfaceC1915e;
import p152e0.C1995b;
import p152e0.InterfaceC2003j;
import p169h0.AbstractC2206o;
import p186k.C2404A;
import p186k.C2408E;
import p186k.C2435q;
import p195l2.AbstractC2503g;
import p195l2.AbstractC2511o;
import p195l2.C2501e;
import p195l2.C2507k;
import p200m2.AbstractC2602c;
import p208n4.InterfaceC2720s;
import p208n4.InterfaceC2721t;
import p208n4.InterfaceC2722u;

/* JADX INFO: renamed from: A.T0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0038T0 implements InterfaceC0320g, InterfaceC0321h, InterfaceC1933c, InterfaceC1359f, InterfaceC1438K, InterfaceC1469d, InterfaceC1150l, InterfaceC1756q, InterfaceC2721t, InterfaceC2003j {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f168d;

    /* JADX INFO: renamed from: e */
    public Object f169e;

    /* JADX INFO: renamed from: f */
    public Object f170f;

    public /* synthetic */ C0038T0(int i5, Object obj, Object obj2) {
        this.f168d = i5;
        this.f169e = obj;
        this.f170f = obj2;
    }

    /* JADX INFO: renamed from: v */
    public static C1736D m25v(ImageDecoder.Source source, int i5, int i6, C1147i c1147i) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new C1654c(i5, i6, c1147i));
        if (AbstractC1652a.m2970v(drawableDecodeDrawable)) {
            return new C1736D(2, AbstractC1652a.m2955g(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [V.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [V.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX INFO: renamed from: w */
    public static void m26w(C0564I c0564i) {
        if (c0564i.f1709T > 0) {
            if (c0564i.f1700K.f1748d == EnumC0557E.f1676h && !c0564i.m834p() && !c0564i.m835q() && !c0564i.f1710U && c0564i.m801I()) {
                AbstractC2206o abstractC2206o = c0564i.f1699J.f1896f;
                if ((abstractC2206o.f7189g & 256) != 0) {
                    while (abstractC2206o != null) {
                        if ((abstractC2206o.f7188f & 256) != 0) {
                            ?? M1029e = abstractC2206o;
                            ?? c1483e = 0;
                            while (M1029e != 0) {
                                if (M1029e instanceof InterfaceC0607n) {
                                    InterfaceC0607n interfaceC0607n = (InterfaceC0607n) M1029e;
                                    interfaceC0607n.mo654P(AbstractC0601k.m1042r(interfaceC0607n, 256));
                                } else if ((M1029e.f7188f & 256) != 0 && (M1029e instanceof AbstractC0599j)) {
                                    AbstractC2206o abstractC2206o2 = ((AbstractC0599j) M1029e).f1943s;
                                    int i5 = 0;
                                    M1029e = M1029e;
                                    c1483e = c1483e;
                                    while (abstractC2206o2 != null) {
                                        if ((abstractC2206o2.f7188f & 256) != 0) {
                                            i5++;
                                            c1483e = c1483e;
                                            if (i5 == 1) {
                                                M1029e = abstractC2206o2;
                                            } else {
                                                if (c1483e == 0) {
                                                    c1483e = new C1483e(new AbstractC2206o[16]);
                                                }
                                                if (M1029e != 0) {
                                                    c1483e.m2753b(M1029e);
                                                    M1029e = 0;
                                                }
                                                c1483e.m2753b(abstractC2206o2);
                                            }
                                        }
                                        abstractC2206o2 = abstractC2206o2.f7191i;
                                        M1029e = M1029e;
                                        c1483e = c1483e;
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                M1029e = AbstractC0601k.m1029e(c1483e);
                            }
                        }
                        if ((abstractC2206o.f7189g & 256) == 0) {
                            break;
                        } else {
                            abstractC2206o = abstractC2206o.f7191i;
                        }
                    }
                }
            }
            c0564i.f1708S = false;
            C1483e c1483eM843y = c0564i.m843y();
            Object[] objArr = c1483eM843y.f5181d;
            int i6 = c1483eM843y.f5183f;
            for (int i7 = 0; i7 < i6; i7++) {
                m26w((C0564I) objArr[i7]);
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public void m27A(C1684F c1684f) {
        C0289C c0289c = (C0289C) this.f170f;
        try {
            try {
                ((InterfaceC0321h) this.f169e).mo32a(c0289c, c0289c.m514g(c1684f));
            } catch (Throwable th) {
                AbstractC0315b0.m547r(th);
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            AbstractC0315b0.m547r(th2);
            m52u(th2);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m28B(InterfaceC1296h interfaceC1296h, Object obj) {
        HashMap map = (HashMap) this.f170f;
        C1291c c1291c = (C1291c) map.get(interfaceC1296h);
        if (c1291c == null) {
            c1291c = new C1291c(interfaceC1296h);
            c1291c.f4626d = c1291c;
            C1291c c1291c2 = (C1291c) this.f169e;
            c1291c.f4626d = c1291c2.f4626d;
            c1291c.f4625c = c1291c2;
            c1291c2.f4626d = c1291c;
            c1291c.f4626d.f4625c = c1291c;
            map.put(interfaceC1296h, c1291c);
        } else {
            interfaceC1296h.mo2380a();
        }
        if (c1291c.f4624b == null) {
            c1291c.f4624b = new ArrayList();
        }
        c1291c.f4624b.add(obj);
    }

    /* JADX INFO: renamed from: C */
    public void m29C(String str) {
        C1413b c1413b;
        synchronized (this) {
            try {
                c1413b = (C1413b) ((HashMap) this.f169e).get(str);
                AbstractC2503g.m4445c(c1413b, "Argument must not be null");
                int i5 = c1413b.f5059b;
                if (i5 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + c1413b.f5059b);
                }
                int i6 = i5 - 1;
                c1413b.f5059b = i6;
                if (i6 == 0) {
                    C1413b c1413b2 = (C1413b) ((HashMap) this.f169e).remove(str);
                    if (!c1413b2.equals(c1413b)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c1413b + ", but actually removed: " + c1413b2 + ", safeKey: " + str);
                    }
                    C1414c c1414c = (C1414c) this.f170f;
                    synchronized (c1414c.f5060a) {
                        try {
                            if (c1414c.f5060a.size() < 10) {
                                c1414c.f5060a.offer(c1413b2);
                            }
                        } finally {
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c1413b.f5058a.unlock();
    }

    /* JADX INFO: renamed from: D */
    public Object m30D() {
        C1291c c1291c = (C1291c) this.f169e;
        C1291c c1291c2 = c1291c.f4626d;
        while (true) {
            boolean zEquals = c1291c2.equals(c1291c);
            Object obj = c1291c2.f4623a;
            if (zEquals) {
                return null;
            }
            ArrayList arrayList = c1291c2.f4624b;
            int size = arrayList != null ? arrayList.size() : 0;
            Object objRemove = size > 0 ? c1291c2.f4624b.remove(size - 1) : null;
            if (objRemove != null) {
                return objRemove;
            }
            C1291c c1291c3 = c1291c2.f4626d;
            c1291c3.f4625c = c1291c2.f4625c;
            c1291c2.f4625c.f4626d = c1291c3;
            ((HashMap) this.f170f).remove(obj);
            ((InterfaceC1296h) obj).mo2380a();
            c1291c2 = c1291c2.f4626d;
        }
    }

    /* JADX INFO: renamed from: E */
    public void m31E(AbstractC1346X abstractC1346X) {
        Object objM4272g = ((C2408E) this.f170f).m4272g(abstractC1346X);
        if (objM4272g != null) {
            if (!(objM4272g instanceof C2404A)) {
                throw new ClassCastException();
            }
            C2404A c2404a = (C2404A) objM4272g;
            Object[] objArr = c2404a.f7766a;
            if (c2404a.f7767b <= 0) {
                return;
            }
            AbstractC1665j.m2983c(objArr[0], "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
            throw new ClassCastException();
        }
    }

    @Override // p027E4.InterfaceC0321h
    /* JADX INFO: renamed from: a */
    public void mo32a(InterfaceC0318e interfaceC0318e, C0306U c0306u) {
        ((C0328o) this.f170f).f1047d.execute(new RunnableC0267d(this, (InterfaceC0321h) this.f169e, c0306u, 1));
    }

    @Override // p121Y1.InterfaceC1756q
    /* JADX INFO: renamed from: b */
    public void mo33b(InterfaceC1289a interfaceC1289a, Bitmap bitmap) throws IOException {
        IOException iOException = ((C2501e) this.f170f).f8013e;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            interfaceC1289a.mo154e(bitmap);
            throw iOException;
        }
    }

    @Override // p078P1.InterfaceC1140b
    /* JADX INFO: renamed from: c */
    public boolean mo34c(Object obj, File file, C1147i c1147i) {
        return ((C1741b) this.f170f).mo34c(new C1743d((InterfaceC1289a) this.f169e, ((BitmapDrawable) ((InterfaceC1194D) obj).get()).getBitmap()), file, c1147i);
    }

    @Override // p095T.InterfaceC1359f
    public void cancel() {
        if (((C1839a) this.f170f).compareAndSet(1, 1)) {
            return;
        }
        ((C0244a) this.f169e).mo6a();
    }

    @Override // p152e0.InterfaceC2003j
    /* JADX INFO: renamed from: d */
    public Object mo35d(C1995b c1995b, Object obj) {
        return ((InterfaceC1603e) this.f169e).mo0g(c1995b, obj);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1933c
    /* JADX INFO: renamed from: e */
    public void mo36e(Exception exc) {
        C1199I c1199i = (C1199I) this.f170f;
        C1517p c1517p = (C1517p) this.f169e;
        C1517p c1517p2 = c1199i.f3944i;
        if (c1517p2 == null || c1517p2 != c1517p) {
            return;
        }
        C1199I c1199i2 = (C1199I) this.f170f;
        C1517p c1517p3 = (C1517p) this.f169e;
        RunnableC1209j runnableC1209j = c1199i2.f3940e;
        C1204e c1204e = c1199i2.f3945j;
        InterfaceC1934d interfaceC1934d = c1517p3.f5271c;
        runnableC1209j.mo2263a(c1204e, exc, interfaceC1934d, interfaceC1934d.mo2224c());
    }

    @Override // p100U.InterfaceC1438K
    /* JADX INFO: renamed from: f */
    public List mo37f(Integer num) {
        List listMo37f = ((InterfaceC1438K) this.f169e).mo37f(null);
        C1324L0 c1324l0 = (C1324L0) this.f170f;
        int i5 = c1324l0.f4744v;
        return i5 < 0 ? listMo37f : AbstractC0973m.m2019Z(AbstractC1923e.m3473k(c1324l0, num, i5, Integer.valueOf(c1324l0.m2454E(c1324l0.f4724b, i5))), listMo37f);
    }

    @Override // p027E4.InterfaceC0320g
    /* JADX INFO: renamed from: g */
    public Object mo38g(C0289C c0289c) {
        Executor executor = (Executor) this.f170f;
        return executor == null ? c0289c : new C0328o(executor, c0289c);
    }

    @Override // p078P1.InterfaceC1150l
    /* JADX INFO: renamed from: h */
    public int mo39h(C1147i c1147i) {
        return 2;
    }

    @Override // p101U0.InterfaceC1469d
    /* JADX INFO: renamed from: i */
    public int mo40i(int i5) {
        do {
            i5 = ((C1470e) this.f170f).m2746j(i5);
            if (i5 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f169e).charAt(i5)));
        return i5;
    }

    @Override // p101U0.InterfaceC1469d
    /* JADX INFO: renamed from: j */
    public int mo41j(int i5) {
        do {
            i5 = ((C1470e) this.f170f).m2745i(i5);
            if (i5 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f169e).charAt(i5 - 1)));
        return i5;
    }

    @Override // p152e0.InterfaceC2003j
    /* JADX INFO: renamed from: k */
    public Object mo42k(Object obj) {
        return ((InterfaceC1601c) this.f170f).mo1h(obj);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1933c
    /* JADX INFO: renamed from: l */
    public void mo43l(Object obj) {
        C1199I c1199i = (C1199I) this.f170f;
        C1517p c1517p = (C1517p) this.f169e;
        C1517p c1517p2 = c1199i.f3944i;
        if (c1517p2 == null || c1517p2 != c1517p) {
            return;
        }
        C1199I c1199i2 = (C1199I) this.f170f;
        C1517p c1517p3 = (C1517p) this.f169e;
        C1211l c1211l = c1199i2.f3939d.f3975p;
        if (obj != null && c1211l.m2287a(c1517p3.f5271c.mo2224c())) {
            c1199i2.f3943h = obj;
            c1199i2.f3940e.m2280l(2);
        } else {
            RunnableC1209j runnableC1209j = c1199i2.f3940e;
            InterfaceC1144f interfaceC1144f = c1517p3.f5269a;
            InterfaceC1934d interfaceC1934d = c1517p3.f5271c;
            runnableC1209j.mo2264c(interfaceC1144f, obj, interfaceC1934d, interfaceC1934d.mo2224c(), c1199i2.f3945j);
        }
    }

    @Override // p027E4.InterfaceC0321h
    /* JADX INFO: renamed from: m */
    public void mo44m(InterfaceC0318e interfaceC0318e, Throwable th) {
        ((C0328o) this.f170f).f1047d.execute(new RunnableC0267d(this, (InterfaceC0321h) this.f169e, th, 2));
    }

    @Override // p027E4.InterfaceC0320g
    /* JADX INFO: renamed from: n */
    public Type mo45n() {
        return (Type) this.f169e;
    }

    @Override // p101U0.InterfaceC1469d
    /* JADX INFO: renamed from: o */
    public int mo46o(int i5) {
        CharSequence charSequence = (CharSequence) this.f169e;
        do {
            i5 = ((C1470e) this.f170f).m2745i(i5);
            if (i5 == -1 || i5 == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i5)));
        return i5;
    }

    @Override // p208n4.InterfaceC2721t
    /* JADX INFO: renamed from: p */
    public InterfaceC2720s mo47p() {
        return (C1860e) this.f169e;
    }

    @Override // p208n4.InterfaceC2721t
    /* JADX INFO: renamed from: q */
    public InterfaceC2722u mo48q() {
        return (C1861f) this.f170f;
    }

    @Override // p101U0.InterfaceC1469d
    /* JADX INFO: renamed from: r */
    public int mo49r(int i5) {
        do {
            i5 = ((C1470e) this.f170f).m2746j(i5);
            if (i5 == -1 || i5 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f169e).charAt(i5 - 1)));
        return i5;
    }

    @Override // p121Y1.InterfaceC1756q
    /* JADX INFO: renamed from: s */
    public void mo50s() {
        C1733A c1733a = (C1733A) this.f169e;
        synchronized (c1733a) {
            c1733a.f5988f = c1733a.f5986d.length;
        }
    }

    /* JADX INFO: renamed from: t */
    public C1646u m51t(List list) {
        InterfaceC1632g interfaceC1632g;
        Exception e5;
        InterfaceC1632g interfaceC1632g2;
        try {
            int size = list.size();
            int i5 = 0;
            interfaceC1632g = null;
            while (i5 < size) {
                try {
                    interfaceC1632g2 = (InterfaceC1632g) list.get(i5);
                } catch (Exception e6) {
                    e5 = e6;
                }
                try {
                    interfaceC1632g2.mo1453a((C1633h) this.f169e);
                    i5++;
                    interfaceC1632g = interfaceC1632g2;
                } catch (Exception e7) {
                    e5 = e7;
                    interfaceC1632g = interfaceC1632g2;
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                    sb2.append(((C1633h) this.f169e).f5619a.m2738b());
                    sb2.append(", composition=");
                    sb2.append(((C1633h) this.f169e).m2931c());
                    sb2.append(", selection=");
                    C1633h c1633h = (C1633h) this.f169e;
                    sb2.append((Object) C1259L.m2340h(AbstractC1251D.m2313b(c1633h.f5620b, c1633h.f5621c)));
                    sb2.append("):");
                    sb.append(sb2.toString());
                    sb.append('\n');
                    AbstractC0973m.m2015V(list, sb, new C0049a(16, interfaceC1632g, this), 60);
                    String string = sb.toString();
                    AbstractC1665j.m2984d(string, "toString(...)");
                    throw new RuntimeException(string, e5);
                }
            }
            C1633h c1633h2 = (C1633h) this.f169e;
            c1633h2.getClass();
            C1269g c1269g = new C1269g(c1633h2.f5619a.toString());
            C1633h c1633h3 = (C1633h) this.f169e;
            long jM2313b = AbstractC1251D.m2313b(c1633h3.f5620b, c1633h3.f5621c);
            C1259L c1259l = C1259L.m2339g(((C1646u) this.f170f).f5651b) ? null : new C1259L(jM2313b);
            C1646u c1646u = new C1646u(c1269g, c1259l != null ? c1259l.f4538a : AbstractC1251D.m2313b(C1259L.m2337e(jM2313b), C1259L.m2338f(jM2313b)), ((C1633h) this.f169e).m2931c());
            this.f170f = c1646u;
            return c1646u;
        } catch (Exception e8) {
            interfaceC1632g = null;
            e5 = e8;
        }
    }

    public String toString() {
        switch (this.f168d) {
            case 12:
                StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
                C1291c c1291c = (C1291c) this.f169e;
                C1291c c1291c2 = c1291c.f4625c;
                boolean z5 = false;
                while (!c1291c2.equals(c1291c)) {
                    sb.append('{');
                    sb.append(c1291c2.f4623a);
                    sb.append(':');
                    ArrayList arrayList = c1291c2.f4624b;
                    sb.append(arrayList != null ? arrayList.size() : 0);
                    sb.append("}, ");
                    c1291c2 = c1291c2.f4625c;
                    z5 = true;
                }
                if (z5) {
                    sb.delete(sb.length() - 2, sb.length());
                }
                sb.append(" )");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m52u(Throwable th) {
        try {
            ((InterfaceC0321h) this.f169e).mo44m((C0289C) this.f170f, th);
        } catch (Throwable th2) {
            AbstractC0315b0.m547r(th2);
            th2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: x */
    public Object m53x(InterfaceC1296h interfaceC1296h) {
        HashMap map = (HashMap) this.f170f;
        C1291c c1291c = (C1291c) map.get(interfaceC1296h);
        if (c1291c == null) {
            c1291c = new C1291c(interfaceC1296h);
            map.put(interfaceC1296h, c1291c);
        } else {
            interfaceC1296h.mo2380a();
        }
        C1291c c1291c2 = c1291c.f4626d;
        c1291c2.f4625c = c1291c.f4625c;
        c1291c.f4625c.f4626d = c1291c2;
        C1291c c1291c3 = (C1291c) this.f169e;
        c1291c.f4626d = c1291c3;
        C1291c c1291c4 = c1291c3.f4625c;
        c1291c.f4625c = c1291c4;
        c1291c4.f4626d = c1291c;
        c1291c.f4626d.f4625c = c1291c;
        ArrayList arrayList = c1291c.f4624b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return c1291c.f4624b.remove(size - 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    public InterfaceC0377O m54y() {
        return (InterfaceC0377O) ((C1366i0) this.f170f).getValue();
    }

    /* JADX INFO: renamed from: z */
    public String m55z(InterfaceC1144f interfaceC1144f) {
        String str;
        synchronized (((C2507k) this.f169e)) {
            str = (String) ((C2507k) this.f169e).m4447a(interfaceC1144f);
        }
        if (str == null) {
            C1420i c1420i = (C1420i) ((C0072l0) this.f170f).mo99c();
            try {
                interfaceC1144f.mo2199b(c1420i.f5076d);
                byte[] bArrDigest = c1420i.f5076d.digest();
                char[] cArr = AbstractC2511o.f8030b;
                synchronized (cArr) {
                    for (int i5 = 0; i5 < bArrDigest.length; i5++) {
                        byte b2 = bArrDigest[i5];
                        int i6 = i5 * 2;
                        char[] cArr2 = AbstractC2511o.f8029a;
                        cArr[i6] = cArr2[(b2 & 255) >>> 4];
                        cArr[i6 + 1] = cArr2[b2 & 15];
                    }
                    str = new String(cArr);
                }
            } finally {
                ((C0072l0) this.f170f).mo97a(c1420i);
            }
        }
        synchronized (((C2507k) this.f169e)) {
            ((C2507k) this.f169e).m4448d(interfaceC1144f, str);
        }
        return str;
    }

    public /* synthetic */ C0038T0(int i5, Object obj, Object obj2, boolean z5) {
        this.f168d = i5;
        this.f170f = obj;
        this.f169e = obj2;
    }

    public /* synthetic */ C0038T0(int i5, boolean z5) {
        this.f168d = i5;
    }

    public C0038T0(int i5) {
        this.f168d = i5;
        switch (i5) {
            case 9:
                this.f169e = new C1483e(new Reference[16]);
                this.f170f = new ReferenceQueue();
                break;
            case 10:
                this.f169e = new LinkedHashMap();
                this.f170f = new LinkedHashMap();
                break;
            case 11:
            case 15:
            case 18:
            case 19:
            case 21:
            default:
                this.f169e = new C1483e(new C0564I[16]);
                break;
            case 12:
                this.f169e = new C1291c(null);
                this.f170f = new HashMap();
                break;
            case 13:
                this.f169e = AbstractC1385s.m2629s("正在初始化 Dex 分析...");
                this.f170f = new C1358e0(AbstractC1926h.m3567j(0.0f, 0.0f, 1.0f));
                break;
            case 14:
                this.f169e = new C2408E();
                this.f170f = new C2408E();
                break;
            case 16:
                this.f169e = new HashMap();
                this.f170f = new C1414c(0);
                break;
            case 17:
                this.f169e = new C2507k(1000L);
                this.f170f = AbstractC2602c.m4547a(10, new C0115D(26));
                break;
            case 20:
                this.f169e = new C1577b(11);
                this.f170f = new C2435q(16);
                break;
            case 22:
                this.f169e = new ArrayList();
                this.f170f = new ArrayList();
                break;
        }
    }

    public C0038T0(C0564I c0564i, InterfaceC0377O interfaceC0377O) {
        this.f168d = 6;
        this.f169e = c0564i;
        this.f170f = AbstractC1385s.m2629s(interfaceC0377O);
    }

    public C0038T0(C0244a c0244a) {
        this.f168d = 15;
        this.f169e = c0244a;
        this.f170f = new C1839a(0);
    }

    public C0038T0(C1013c c1013c) {
        this.f168d = 27;
        InterfaceC1915e interfaceC1915e = (InterfaceC1915e) c1013c.f3131d;
        this.f169e = new C1860e(c1013c, interfaceC1915e.mo3401f().mo47p(), -1L, true);
        this.f170f = new C1861f(c1013c, interfaceC1915e.mo3401f().mo48q(), -1L, true);
    }
}
