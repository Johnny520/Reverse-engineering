package p183m6;

import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: m6.t */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5050t {
    /* JADX INFO: renamed from: a */
    public static void m20439a(SharedPreferencesC5046p sharedPreferencesC5046p) {
        if (sharedPreferencesC5046p.f15342o >= 8192 || sharedPreferencesC5046p.f15343p.size() >= 100) {
            m20443e(sharedPreferencesC5046p, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m20440b(SharedPreferencesC5046p sharedPreferencesC5046p) {
        sharedPreferencesC5046p.f15342o = 0;
        sharedPreferencesC5046p.f15343p.clear();
    }

    /* JADX INFO: renamed from: c */
    public static void m20441c(SharedPreferencesC5046p sharedPreferencesC5046p, int i10, int i11) {
        sharedPreferencesC5046p.f15342o += i11 - i10;
        sharedPreferencesC5046p.f15343p.add(new C5054x(i10, i11));
    }

    /* JADX INFO: renamed from: d */
    public static void m20442d(SharedPreferencesC5046p sharedPreferencesC5046p, int i10) {
        int length = sharedPreferencesC5046p.f15335h.f15318b.length;
        int i11 = sharedPreferencesC5046p.f15331d + i10;
        if (i11 >= length) {
            int i12 = sharedPreferencesC5046p.f15342o;
            if (i12 > i10 && i12 > 8192) {
                m20443e(sharedPreferencesC5046p, i10);
                return;
            }
            int iM20421i = AbstractC5049s.m20421i(length, i11);
            byte[] bArr = new byte[iM20421i];
            System.arraycopy(sharedPreferencesC5046p.f15335h.f15318b, 0, bArr, 0, sharedPreferencesC5046p.f15331d);
            sharedPreferencesC5046p.f15335h.f15318b = bArr;
            if (sharedPreferencesC5046p.f15351x == 0) {
                MappedByteBuffer mappedByteBufferM20432t = AbstractC5049s.m20432t(sharedPreferencesC5046p.f15346s, iM20421i);
                MappedByteBuffer mappedByteBufferM20432t2 = AbstractC5049s.m20432t(sharedPreferencesC5046p.f15347t, iM20421i);
                if (mappedByteBufferM20432t != null && mappedByteBufferM20432t2 != null) {
                    sharedPreferencesC5046p.f15348u = mappedByteBufferM20432t;
                    sharedPreferencesC5046p.f15349v = mappedByteBufferM20432t2;
                    return;
                }
                AbstractC5053w.m20451a(sharedPreferencesC5046p, new Exception("map failed"));
                sharedPreferencesC5046p.f15335h.m20368y(0, AbstractC5049s.m20429q(sharedPreferencesC5046p.f15331d - 12, false));
                sharedPreferencesC5046p.f15335h.m20369z(4, sharedPreferencesC5046p.f15332e);
                AbstractC5049s.m20438z(sharedPreferencesC5046p);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m20443e(SharedPreferencesC5046p sharedPreferencesC5046p, int i10) {
        m20444f(sharedPreferencesC5046p.f15343p);
        C5054x c5054x = (C5054x) sharedPreferencesC5046p.f15343p.get(0);
        int i11 = c5054x.f15365q;
        int i12 = sharedPreferencesC5046p.f15331d;
        int i13 = i12 - sharedPreferencesC5046p.f15342o;
        int i14 = i13 - 12;
        int i15 = i13 - i11;
        int i16 = i12 - i11;
        int i17 = 1;
        boolean z10 = i14 < i16 + i15;
        if (!z10) {
            sharedPreferencesC5046p.f15332e ^= sharedPreferencesC5046p.f15335h.m20352g(i11, i16);
        }
        int size = sharedPreferencesC5046p.f15343p.size();
        int i18 = size - 1;
        int i19 = sharedPreferencesC5046p.f15331d - ((C5054x) sharedPreferencesC5046p.f15343p.get(i18)).f15366r;
        int i20 = i19 > 0 ? size : i18;
        int[] iArr = new int[i20];
        int[] iArr2 = new int[i20];
        int i21 = c5054x.f15365q;
        int i22 = c5054x.f15366r;
        while (i17 < size) {
            C5054x c5054x2 = (C5054x) sharedPreferencesC5046p.f15343p.get(i17);
            int i23 = c5054x2.f15365q - i22;
            boolean z11 = z10;
            byte[] bArr = sharedPreferencesC5046p.f15335h.f15318b;
            System.arraycopy(bArr, i22, bArr, i21, i23);
            int i24 = i17 - 1;
            iArr[i24] = i22;
            iArr2[i24] = i22 - i21;
            i21 += i23;
            i22 = c5054x2.f15366r;
            i17++;
            z10 = z11;
        }
        boolean z12 = z10;
        if (i19 > 0) {
            byte[] bArr2 = sharedPreferencesC5046p.f15335h.f15318b;
            System.arraycopy(bArr2, i22, bArr2, i21, i19);
            iArr[i18] = i22;
            iArr2[i18] = i22 - i21;
        }
        m20440b(sharedPreferencesC5046p);
        if (z12) {
            sharedPreferencesC5046p.f15332e = sharedPreferencesC5046p.f15335h.m20352g(12, i14);
        } else {
            sharedPreferencesC5046p.f15332e ^= sharedPreferencesC5046p.f15335h.m20352g(i11, i15);
        }
        sharedPreferencesC5046p.f15331d = i13;
        m20446h(sharedPreferencesC5046p, i11, i10, i15);
        m20447i(sharedPreferencesC5046p, i11, iArr, iArr2);
        AbstractC5053w.m20453c(sharedPreferencesC5046p, "gc finish");
    }

    /* JADX INFO: renamed from: f */
    public static void m20444f(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Collections.sort(arrayList);
        int i10 = 0;
        C5054x c5054x = (C5054x) arrayList.get(0);
        int size = arrayList.size();
        for (int i11 = 1; i11 < size; i11++) {
            C5054x c5054x2 = (C5054x) arrayList.get(i11);
            if (c5054x2.f15365q == c5054x.f15366r) {
                c5054x.f15366r = c5054x2.f15366r;
            } else {
                i10++;
                if (i10 != i11) {
                    arrayList.set(i10, c5054x2);
                }
                c5054x = c5054x2;
            }
        }
        int i12 = i10 + 1;
        if (size > i12) {
            arrayList.subList(i12, size).clear();
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m20445g(SharedPreferencesC5046p sharedPreferencesC5046p, int i10) {
        int i11 = SharedPreferencesC5046p.f15326B;
        int iM20421i = AbstractC5049s.m20421i(i11, i10 + i11);
        byte[] bArr = sharedPreferencesC5046p.f15335h.f15318b;
        if (iM20421i >= bArr.length) {
            return;
        }
        byte[] bArr2 = new byte[iM20421i];
        System.arraycopy(bArr, 0, bArr2, 0, sharedPreferencesC5046p.f15331d);
        sharedPreferencesC5046p.f15335h.f15318b = bArr2;
        if (sharedPreferencesC5046p.f15351x == 0) {
            MappedByteBuffer mappedByteBufferM20408A = AbstractC5049s.m20408A(sharedPreferencesC5046p.f15346s, iM20421i);
            MappedByteBuffer mappedByteBufferM20408A2 = AbstractC5049s.m20408A(sharedPreferencesC5046p.f15347t, iM20421i);
            if (mappedByteBufferM20408A == null || mappedByteBufferM20408A2 == null) {
                AbstractC5053w.m20451a(sharedPreferencesC5046p, new Exception("map failed"));
                AbstractC5049s.m20438z(sharedPreferencesC5046p);
            } else {
                sharedPreferencesC5046p.f15348u = mappedByteBufferM20408A;
                sharedPreferencesC5046p.f15349v = mappedByteBufferM20408A2;
            }
        }
        AbstractC5053w.m20453c(sharedPreferencesC5046p, "truncate finish");
    }

    /* JADX INFO: renamed from: h */
    public static void m20446h(SharedPreferencesC5046p sharedPreferencesC5046p, int i10, int i11, int i12) {
        int iM20429q = AbstractC5049s.m20429q(sharedPreferencesC5046p.f15331d - 12, false);
        if (sharedPreferencesC5046p.f15351x == 0) {
            sharedPreferencesC5046p.f15348u.putInt(0, -1);
            sharedPreferencesC5046p.f15348u.putLong(4, sharedPreferencesC5046p.f15332e);
            sharedPreferencesC5046p.f15348u.position(i10);
            sharedPreferencesC5046p.f15348u.put(sharedPreferencesC5046p.f15335h.f15318b, i10, i12);
            sharedPreferencesC5046p.f15348u.putInt(0, iM20429q);
            sharedPreferencesC5046p.f15349v.putInt(0, iM20429q);
            sharedPreferencesC5046p.f15349v.putLong(4, sharedPreferencesC5046p.f15332e);
            sharedPreferencesC5046p.f15349v.position(i10);
            sharedPreferencesC5046p.f15349v.put(sharedPreferencesC5046p.f15335h.f15318b, i10, i12);
        } else {
            sharedPreferencesC5046p.f15335h.m20368y(0, iM20429q);
            sharedPreferencesC5046p.f15335h.m20369z(4, sharedPreferencesC5046p.f15332e);
        }
        int i13 = sharedPreferencesC5046p.f15331d + i11;
        if (sharedPreferencesC5046p.f15335h.f15318b.length - i13 > 32768) {
            m20445g(sharedPreferencesC5046p, i13);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m20447i(SharedPreferencesC5046p sharedPreferencesC5046p, int i10, int[] iArr, int[] iArr2) {
        for (AbstractC5032b abstractC5032b : sharedPreferencesC5046p.f15333f.values()) {
            int i11 = abstractC5032b.f15306a;
            if (i11 > i10) {
                int i12 = iArr2[AbstractC5056z.m20460a(iArr, i11)];
                abstractC5032b.f15306a -= i12;
                if (abstractC5032b.mo20322a() >= 6) {
                    ((AbstractC5040j) abstractC5032b).f15314c -= i12;
                }
            }
        }
    }
}
