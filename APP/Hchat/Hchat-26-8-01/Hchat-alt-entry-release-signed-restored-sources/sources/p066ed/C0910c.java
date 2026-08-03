package p066ed;

import ae.C0070a;
import af.C0084g;
import com.alibaba.fastjson2.writer.C0640b;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import p012ah.C0086a;
import p246qd.AbstractC3506j;
import p302ud.C4309e;
import p302ud.C4325u;

/* JADX INFO: renamed from: ed.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0910c {

    /* JADX INFO: renamed from: f */
    public static final Set f2832f;

    /* JADX INFO: renamed from: a */
    public final C4325u f2833a;

    /* JADX INFO: renamed from: b */
    public HashMap f2834b;

    /* JADX INFO: renamed from: c */
    public HashMap f2835c;

    /* JADX INFO: renamed from: d */
    public HashMap f2836d;

    /* JADX INFO: renamed from: e */
    public final HashSet f2837e = new HashSet();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AbstractC2846d.m6274b(C0910c.class);
        f2832f = Collections.singleton("java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0910c(C4325u c4325u) {
        this.f2833a = c4325u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m2212a(ArrayList arrayList) {
        AbstractC3506j[] abstractC3506jArr;
        if (this.f2834b == null) {
            this.f2834b = new HashMap(arrayList.size());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C4309e c4309e = (C4309e) it.next();
            AbstractC3506j abstractC3506j = c4309e.f14373m.f10138g;
            String strMo7350l = abstractC3506j.mo7350l();
            C0909b c0909b = new C0909b(c4309e.f14375o.f488b, 1, abstractC3506j);
            InterfaceC2844b interfaceC2844b = C0908a.f2820d;
            AbstractC3506j abstractC3506j2 = c4309e.f14376p;
            if (abstractC3506j2 == null) {
                abstractC3506jArr = C0908a.f2821e;
            } else {
                int size = c4309e.f14377q.size();
                if (size == 0 && abstractC3506j2 == AbstractC3506j.f11394k) {
                    abstractC3506jArr = C0908a.f2822f;
                } else {
                    AbstractC3506j[] abstractC3506jArr2 = new AbstractC3506j[size + 1];
                    abstractC3506jArr2[0] = abstractC3506j2;
                    Iterator it2 = c4309e.f14377q.iterator();
                    int i9 = 1;
                    while (it2.hasNext()) {
                        abstractC3506jArr2[i9] = (AbstractC3506j) it2.next();
                        i9++;
                    }
                    abstractC3506jArr = abstractC3506jArr2;
                }
            }
            c0909b.f2828c = abstractC3506jArr;
            this.f2834b.put(strMo7350l, c0909b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m2213b(C0909b c0909b, HashSet hashSet) {
        for (AbstractC3506j abstractC3506j : c0909b.f2828c) {
            if (abstractC3506j != null) {
                C0909b c0909b2 = (C0909b) this.f2834b.get(abstractC3506j.mo7350l());
                if (c0909b2 == null) {
                    this.f2837e.add(abstractC3506j.mo7350l());
                }
                if (c0909b2 == null) {
                    hashSet.add(abstractC3506j.mo7350l());
                } else if (hashSet.add(c0909b2.f2826a.mo7350l())) {
                    m2213b(c0909b2, hashSet);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final C0909b m2214c(AbstractC3506j abstractC3506j) {
        return (C0909b) this.f2834b.get(abstractC3506j.mo7350l());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final Set m2215d(String str) {
        Set set = (Set) this.f2835c.get(str);
        return set == null ? Collections.EMPTY_SET : set;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m2216e() {
        Collection collectionSingleton;
        HashMap map = new HashMap(this.f2834b.size());
        HashSet hashSet = new HashSet();
        Iterator it = this.f2834b.entrySet().iterator();
        while (it.hasNext()) {
            C0909b c0909b = (C0909b) ((Map.Entry) it.next()).getValue();
            hashSet.clear();
            m2213b(c0909b, hashSet);
            int size = hashSet.size();
            if (size == 0) {
                collectionSingleton = Collections.EMPTY_SET;
            } else if (size != 1) {
                collectionSingleton = new HashSet(hashSet);
            } else {
                String str = (String) hashSet.iterator().next();
                collectionSingleton = str.equals("java.lang.Object") ? f2832f : Collections.singleton(str);
            }
            map.put(c0909b.f2826a.mo7350l(), collectionSingleton);
        }
        this.f2835c = map;
        HashMap map2 = new HashMap(this.f2834b.size());
        ArrayList<String> arrayList = new ArrayList(this.f2834b.keySet());
        Collections.sort(arrayList);
        for (String str2 : arrayList) {
            Iterator it2 = m2215d(str2).iterator();
            while (it2.hasNext()) {
                ((List) map2.computeIfAbsent((String) it2.next(), new C0640b(15))).add(str2);
            }
        }
        this.f2836d = map2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m2217f() {
        C0908a c0908a = new C0908a(this.f2833a);
        long jCurrentTimeMillis = System.currentTimeMillis();
        InputStream resourceAsStream = C0908a.class.getResourceAsStream("/clst/core.jcst");
        try {
            if (resourceAsStream == null) {
                throw new C0084g("Can't load classpath file: /clst/core.jcst");
            }
            c0908a.m2208a(resourceAsStream);
            resourceAsStream.close();
            InterfaceC2844b interfaceC2844b = C0908a.f2820d;
            if (interfaceC2844b.mo6250d()) {
                interfaceC2844b.mo6261o("Clst file loaded in {}ms, android api: {}, classes: {}, methods: {}", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), Integer.valueOf(c0908a.f2824b), Integer.valueOf(c0908a.f2825c.length), Integer.valueOf(Stream.of((Object[]) c0908a.f2825c).mapToInt(new C0070a(8)).sum()));
            }
            if (this.f2834b != null) {
                C0086a.m452k("Classpath already loaded");
                return;
            }
            HashMap map = new HashMap(c0908a.f2825c.length);
            this.f2834b = map;
            for (C0909b c0909b : c0908a.f2825c) {
                map.put(c0909b.f2826a.mo7350l(), c0909b);
            }
        } catch (Throwable th2) {
            if (resourceAsStream != null) {
                try {
                    resourceAsStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
