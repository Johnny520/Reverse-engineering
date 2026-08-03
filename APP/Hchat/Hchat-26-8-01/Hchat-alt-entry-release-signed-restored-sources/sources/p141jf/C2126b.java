package p141jf;

import ac.C0058k;
import bsh.C0353j;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mh.AbstractC2846d;
import nc.C2958a;
import okhttp3.internal.http2.Settings;
import p000a.AbstractC0000a;
import p005a5.C0016a;
import p007a7.AbstractC0018a;
import p069f.C0956r;
import p084ff.C1219e;
import p232pc.C3389k;
import p245qc.C3495e;

/* JADX INFO: renamed from: jf.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2126b {

    /* JADX INFO: renamed from: a */
    public final C0058k f7086a;

    /* JADX INFO: renamed from: b */
    public final C0956r f7087b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AbstractC2846d.m6274b(C2126b.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2126b(C0058k c0058k, C0956r c0956r) {
        this.f7086a = c0058k;
        this.f7087b = c0956r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final ArrayList m5348a() {
        List listM2353d;
        ArrayList arrayList = new ArrayList();
        C0058k c0058k = this.f7086a;
        c0058k.m336B(16);
        String strM371v = c0058k.m371v(((ByteBuffer) c0058k.f177i).getInt());
        if (strM371v != null && !strM371v.isEmpty()) {
            arrayList.add(new C3389k(strM371v));
        }
        String strM5349b = m5349b();
        c0058k.m336B(20);
        int i9 = ((ByteBuffer) c0058k.f177i).getInt();
        C0956r c0956r = this.f7087b;
        c0956r.m2354e(i9);
        int i10 = c0956r.f3009b;
        if (i10 == 0) {
            listM2353d = Collections.EMPTY_LIST;
        } else {
            C0058k c0058k2 = (C0058k) c0956r.f3013f;
            c0058k2.m351a(i10);
            listM2353d = c0956r.m2353d(((ByteBuffer) c0058k2.f177i).getInt());
        }
        AbstractC2125a.m5347a(strM5349b, arrayList, listM2353d);
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final String m5349b() {
        C0058k c0058k = this.f7086a;
        c0058k.m336B(0);
        String strM373y = c0058k.m373y(((ByteBuffer) c0058k.f177i).getInt());
        if (strM373y != null) {
            return strM373y;
        }
        C0353j.m1305c("Unknown class type");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m5350c(C3495e c3495e, C0058k c0058k, C2128d c2128d, int i9, Map map, boolean z9) {
        List listM220H;
        C0058k c0058k2 = this.f7086a;
        if (z9) {
            C0058k c0058kM356g = c0058k.m356g();
            c0058k2.m336B(28);
            int i10 = ((ByteBuffer) c0058k2.f177i).getInt();
            if (i10 == 0) {
                listM220H = Collections.EMPTY_LIST;
            } else {
                c0058kM356g.m351a(i10);
                listM220H = AbstractC0018a.m220H(c0058kM356g, (C0058k) this.f7087b.f3014g);
            }
        } else {
            listM220H = null;
        }
        int i11 = 0;
        int iM14H0 = 0;
        while (i11 < i9) {
            iM14H0 += AbstractC0000a.m14H0(c0058k);
            int iM14H02 = AbstractC0000a.m14H0(c0058k);
            c0058k2.m359j(c2128d, iM14H0);
            c2128d.f7094e = iM14H02;
            Integer num = (Integer) map.get(Integer.valueOf(iM14H0));
            c2128d.f7095f = num != null ? num.intValue() : 0;
            c2128d.f7096g = (!z9 || i11 >= listM220H.size()) ? null : (C2958a) listM220H.get(i11);
            c3495e.accept(c2128d);
            i11++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m5351d(C3495e c3495e, C0058k c0058k, C2130f c2130f, int i9, Map map, Map map2) {
        C0058k c0058k2 = this.f7086a;
        C0016a c0016a = new C0016a(c0058k2.m356g());
        int iM14H0 = 0;
        for (int i10 = 0; i10 < i9; i10++) {
            iM14H0 += AbstractC0000a.m14H0(c0058k);
            int iM14H02 = AbstractC0000a.m14H0(c0058k);
            int iM14H03 = AbstractC0000a.m14H0(c0058k);
            C2132h c2132h = c2130f.f7107b;
            c2132h.f7115b = null;
            c2132h.f7116c = null;
            c2132h.f7117d = null;
            c2132h.f7118e = null;
            c2132h.f7114a = ((((C1219e) c0058k2.f178j).f4084a & Settings.DEFAULT_INITIAL_WINDOW_SIZE) << 16) | (65535 & iM14H0);
            c2132h.f7119f = iM14H0;
            c2132h.f7120g = c0058k2;
            c2130f.f7108c = iM14H02;
            if (iM14H03 == 0) {
                c2130f.f7111f = null;
            } else {
                c0016a.f55h = iM14H0;
                ((C0058k) c0016a.f56i).f176h = iM14H03;
                c2130f.f7111f = c0016a;
            }
            Integer num = (Integer) map.get(Integer.valueOf(iM14H0));
            c2130f.f7109d = num != null ? num.intValue() : 0;
            Integer num2 = (Integer) map2.get(Integer.valueOf(iM14H0));
            c2130f.f7110e = num2 != null ? num2.intValue() : 0;
            c3495e.accept(c2130f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m5352e(C3495e c3495e, C3495e c3495e2) {
        Map map;
        Map map2;
        Map map3;
        C2126b c2126b;
        int i9;
        C3495e c3495e3;
        C0956r c0956r = this.f7087b;
        C0058k c0058k = (C0058k) c0956r.f3013f;
        C0058k c0058k2 = this.f7086a;
        c0058k2.m336B(24);
        int i10 = ((ByteBuffer) c0058k2.f177i).getInt();
        if (i10 == 0) {
            return;
        }
        C0058k c0058k3 = new C0058k((C1219e) c0058k2.f178j, i10);
        int iM14H0 = AbstractC0000a.m14H0(c0058k3);
        int iM14H02 = AbstractC0000a.m14H0(c0058k3);
        int iM14H03 = AbstractC0000a.m14H0(c0058k3);
        int iM14H04 = AbstractC0000a.m14H0(c0058k3);
        int i11 = iM14H0 + iM14H02;
        c3495e.f11360b = i11 == 0 ? Collections.EMPTY_LIST : new ArrayList(i11);
        int i12 = iM14H03 + iM14H04;
        c3495e2.f11360b = i12 == 0 ? Collections.EMPTY_LIST : new ArrayList(i12);
        c0058k2.m336B(20);
        c0956r.m2354e(((ByteBuffer) c0058k2.f177i).getInt());
        if (c0956r.f3010c == 0) {
            map = Collections.EMPTY_MAP;
        } else {
            c0058k.m336B(16);
            ByteBuffer byteBuffer = (ByteBuffer) c0058k.f177i;
            HashMap map4 = new HashMap(c0956r.f3010c);
            for (int i13 = 0; i13 < c0956r.f3010c; i13++) {
                map4.put(Integer.valueOf(byteBuffer.getInt()), Integer.valueOf(byteBuffer.getInt()));
            }
            map = map4;
        }
        C2128d c2128d = new C2128d(c0956r);
        c2128d.f7091b = m5349b();
        Map map5 = map;
        m5350c(c3495e, c0058k3, c2128d, iM14H0, map5, true);
        m5350c(c3495e, c0058k3, c2128d, iM14H02, map5, false);
        C2130f c2130f = new C2130f(c0956r);
        c2130f.f7107b = new C2132h();
        if (c0956r.f3011d == 0) {
            map2 = Collections.EMPTY_MAP;
        } else {
            c0058k.m336B((c0956r.f3010c * 8) + 16);
            ByteBuffer byteBuffer2 = (ByteBuffer) c0058k.f177i;
            HashMap map6 = new HashMap(c0956r.f3011d);
            for (int i14 = 0; i14 < c0956r.f3011d; i14++) {
                map6.put(Integer.valueOf(byteBuffer2.getInt()), Integer.valueOf(byteBuffer2.getInt()));
            }
            map2 = map6;
        }
        if (c0956r.f3012e == 0) {
            map3 = Collections.EMPTY_MAP;
            i9 = iM14H03;
            c3495e3 = c3495e2;
            c2126b = this;
        } else {
            c0058k.m336B((c0956r.f3011d * 8) + (c0956r.f3010c * 8) + 16);
            ByteBuffer byteBuffer3 = (ByteBuffer) c0058k.f177i;
            HashMap map7 = new HashMap(c0956r.f3012e);
            for (int i15 = 0; i15 < c0956r.f3012e; i15++) {
                map7.put(Integer.valueOf(byteBuffer3.getInt()), Integer.valueOf(byteBuffer3.getInt()));
            }
            map3 = map7;
            c2126b = this;
            i9 = iM14H03;
            c3495e3 = c3495e2;
        }
        c2126b.m5351d(c3495e3, c0058k3, c2130f, i9, map2, map3);
        c2126b.m5351d(c3495e3, c0058k3, c2130f, iM14H04, map2, map3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return m5349b();
    }
}
