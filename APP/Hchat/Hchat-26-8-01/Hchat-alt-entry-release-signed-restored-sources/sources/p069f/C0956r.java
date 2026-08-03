package p069f;

import ac.C0058k;
import af.C0081d;
import androidx.lifecycle.C0100e0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nc.C2959b;
import p000a.AbstractC0000a;
import p003a2.C0014a;
import p007a7.AbstractC0018a;
import p068eh.AbstractC0921a;
import p136j8.C2104o;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: f.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0956r {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3008a = 0;

    /* JADX INFO: renamed from: b */
    public int f3009b;

    /* JADX INFO: renamed from: c */
    public int f3010c;

    /* JADX INFO: renamed from: d */
    public int f3011d;

    /* JADX INFO: renamed from: e */
    public int f3012e;

    /* JADX INFO: renamed from: f */
    public final Object f3013f;

    /* JADX INFO: renamed from: g */
    public final Object f3014g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0956r(int i9) {
        this.f3009b = i9;
        if (i9 <= 0) {
            C2104o.m5294t("maxSize <= 0");
            throw null;
        }
        this.f3013f = new C0100e0(1);
        this.f3014g = new C0014a(12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static C2959b m2350c(C0058k c0058k, C0058k c0058k2, boolean z9) {
        int i9;
        if (z9) {
            int iM345K = c0058k.m345K();
            i9 = 1;
            if (iM345K != 0) {
                if (iM345K == 1) {
                    i9 = 2;
                } else {
                    if (iM345K != 2) {
                        throw new C0081d(AbstractC0921a.m2249l(iM345K, "Unknown annotation visibility value: "));
                    }
                    i9 = 3;
                }
            }
        } else {
            i9 = 0;
        }
        int iM14H0 = AbstractC0000a.m14H0(c0058k);
        int iM14H02 = AbstractC0000a.m14H0(c0058k);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM14H02);
        for (int i10 = 0; i10 < iM14H02; i10++) {
            linkedHashMap.put(c0058k2.m371v(AbstractC0000a.m14H0(c0058k)), AbstractC0018a.m226N(c0058k, c0058k2));
        }
        return new C2959b(i9, c0058k2.m373y(iM14H0), linkedHashMap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public Object m2351a(Object obj) {
        synchronized (((C0014a) this.f3014g)) {
            C0100e0 c0100e0 = (C0100e0) this.f3013f;
            c0100e0.getClass();
            Object obj2 = c0100e0.f284a.get(obj);
            if (obj2 != null) {
                this.f3011d++;
                return obj2;
            }
            this.f3012e++;
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0093, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009b, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m2352b(Object obj, Object obj2) {
        Object objPut;
        obj.getClass();
        synchronized (((C0014a) this.f3014g)) {
            this.f3010c++;
            C0100e0 c0100e0 = (C0100e0) this.f3013f;
            c0100e0.getClass();
            objPut = c0100e0.f284a.put(obj, obj2);
            if (objPut != null) {
                this.f3010c--;
            }
        }
        int i9 = this.f3009b;
        while (true) {
            synchronized (((C0014a) this.f3014g)) {
                try {
                    if (this.f3010c < 0 || (((C0100e0) this.f3013f).f284a.isEmpty() && this.f3010c != 0)) {
                        break;
                    }
                    if (this.f3010c <= i9 || ((C0100e0) this.f3013f).f284a.isEmpty()) {
                        break;
                    }
                    Set setEntrySet = ((C0100e0) this.f3013f).f284a.entrySet();
                    setEntrySet.getClass();
                    Map.Entry entry = (Map.Entry) AbstractC4166m.m8423u1(setEntrySet);
                    if (entry == null) {
                        return objPut;
                    }
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    C0100e0 c0100e02 = (C0100e0) this.f3013f;
                    c0100e02.getClass();
                    key.getClass();
                    c0100e02.f284a.remove(key);
                    int i10 = this.f3010c;
                    value.getClass();
                    this.f3010c = i10 - 1;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public List m2353d(int i9) {
        C0058k c0058k = (C0058k) this.f3013f;
        ByteBuffer byteBuffer = (ByteBuffer) c0058k.f177i;
        if (i9 == 0) {
            return Collections.EMPTY_LIST;
        }
        c0058k.m351a(i9);
        int i10 = byteBuffer.getInt();
        if (i10 == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(i10);
        int iPosition = byteBuffer.position();
        for (int i11 = 0; i11 < i10; i11++) {
            c0058k.m351a((i11 * 4) + iPosition);
            c0058k.m351a(byteBuffer.getInt());
            arrayList.add(m2350c(c0058k, (C0058k) this.f3014g, true));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public void m2354e(int i9) {
        C0058k c0058k = (C0058k) this.f3013f;
        ByteBuffer byteBuffer = (ByteBuffer) c0058k.f177i;
        this.f3009b = i9;
        if (i9 == 0) {
            this.f3010c = 0;
            this.f3011d = 0;
            this.f3012e = 0;
        } else {
            c0058k.f176h = i9;
            c0058k.m336B(4);
            this.f3010c = byteBuffer.getInt();
            this.f3011d = byteBuffer.getInt();
            this.f3012e = byteBuffer.getInt();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        String str;
        switch (this.f3008a) {
            case 0:
                synchronized (((C0014a) this.f3014g)) {
                    try {
                        int i9 = this.f3011d;
                        int i10 = this.f3012e + i9;
                        str = "LruCache[maxSize=" + this.f3009b + ",hits=" + this.f3011d + ",misses=" + this.f3012e + ",hitRate=" + (i10 != 0 ? (i9 * 100) / i10 : 0) + "%]";
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public C0956r(C0058k c0058k, C0058k c0058k2) {
        this.f3013f = c0058k;
        this.f3014g = c0058k2;
    }
}
