package p000;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ya */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0956ya implements InterfaceC0904ww {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f7589d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f7590e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0956ya(pe0 pe0Var, int i) {
        this.f7589d = 0;
        this.f7590e = pe0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v15, resolved type: java.util.Set[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c3  */
    @Override // p000.InterfaceC0904ww
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        zw0 zw0Var;
        Collection collectionM5249S;
        Object next;
        uo0 uo0Var;
        Object next2;
        char c = 7;
        Object objM2956y = null;
        switch (this.f7589d) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0993za.m5464a((pe0) this.f7590e, (InterfaceC0356ji) obj, j50.m1649A(1));
                return na1.f4229a;
            case 1:
                iu0 iu0Var = (iu0) this.f7590e;
                ((Integer) obj).getClass();
                if (obj2 instanceof InterfaceC0852vh) {
                    InterfaceC0852vh interfaceC0852vh = (InterfaceC0852vh) obj2;
                    kh0 kh0Var = iu0Var.f2625h;
                    if (kh0Var == null) {
                        kh0 kh0Var2 = ey0.f1546a;
                        kh0Var = new kh0();
                        iu0Var.f2625h = kh0Var;
                    }
                    kh0Var.m1900k(interfaceC0852vh);
                    iu0Var.f2623f.m4072b(interfaceC0852vh);
                }
                if (obj2 instanceof ku0) {
                    iu0Var.m1602e((ku0) obj2);
                }
                if (obj2 instanceof ht0) {
                    ((ht0) obj2).m1505c();
                }
                return na1.f4229a;
            case 2:
                vw0 vw0Var = (vw0) obj;
                List list = (List) ((InterfaceC0904ww) this.f7590e).invoke(vw0Var, obj2);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Object obj3 = list.get(i);
                    if (obj3 != null && (zw0Var = vw0Var.f6831e) != null && !zw0Var.mo215b(obj3)) {
                        throw new IllegalArgumentException(("item at index " + i + " can't be saved: " + obj3).toString());
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
            case 3:
                return zc0.m5518X((Bitmap) this.f7590e, (InterfaceC0356ji) obj, ((Integer) obj2).intValue());
            case 4:
                return zc0.m5489I0((wg0) this.f7590e, (InterfaceC0356ji) obj, ((Integer) obj2).intValue());
            case 5:
                ot0 ot0Var = (ot0) this.f7590e;
                Set set = (Set) obj;
                synchronized (ot0Var.f4633c) {
                    try {
                        if (((jt0) ot0Var.f4651u.getValue()).compareTo(jt0.f2945h) >= 0) {
                            kh0 kh0Var3 = ot0Var.f4638h;
                            if (set instanceof fy0) {
                                kh0 kh0Var4 = ((fy0) set).f1821d;
                                Object[] objArr = kh0Var4.f3151b;
                                long[] jArr = kh0Var4.f3150a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i2 = 0;
                                    while (true) {
                                        long j = jArr[i2];
                                        if ((((~j) << c) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                                            for (int i4 = 0; i4 < i3; i4++) {
                                                if ((j & 255) < 128) {
                                                    Object obj4 = objArr[(i2 << 3) + i4];
                                                    if (!(obj4 instanceof e41) || ((e41) obj4).m782e(1)) {
                                                        kh0Var3.m1890a(obj4);
                                                    }
                                                }
                                                j >>= 8;
                                            }
                                            if (i3 == 8) {
                                                if (i2 != length) {
                                                    i2++;
                                                    c = 7;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                for (Object obj5 : set) {
                                    if (!(obj5 instanceof e41) || ((e41) obj5).m782e(1)) {
                                        kh0Var3.m1890a(obj5);
                                    }
                                }
                            }
                            objM2956y = ot0Var.m2956y();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (objM2956y != null) {
                    ((C0884wc) objM2956y).mo541i(na1.f4229a);
                }
                return na1.f4229a;
            case 6:
                mw0 mw0Var = (mw0) this.f7590e;
                int iIntValue = ((Integer) obj).intValue();
                InterfaceC0515nk interfaceC0515nk = (InterfaceC0515nk) obj2;
                InterfaceC0554ok key = interfaceC0515nk.getKey();
                InterfaceC0515nk interfaceC0515nkMo64l = mw0Var.f4054h.mo64l(key);
                if (key != C0496n2.f4129I) {
                    iIntValue = interfaceC0515nk != interfaceC0515nkMo64l ? Integer.MIN_VALUE : iIntValue + 1;
                } else {
                    c40 c40Var = (c40) interfaceC0515nkMo64l;
                    c40 parent = (c40) interfaceC0515nk;
                    while (parent != null) {
                        if (parent != c40Var && (parent instanceof gy0)) {
                            InterfaceC0126de interfaceC0126deM1621M = ((gy0) parent).m1621M();
                            parent = interfaceC0126deM1621M != null ? interfaceC0126deM1621M.getParent() : null;
                        } else {
                            objM2956y = parent;
                            if (objM2956y == c40Var) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + objM2956y + ", expected child of " + c40Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                            if (c40Var != null) {
                            }
                        }
                    }
                    if (objM2956y == c40Var) {
                    }
                }
                return Integer.valueOf(iIntValue);
            case 7:
                dz0 dz0Var = (dz0) this.f7590e;
                AbstractC0307i4.m1547w(dz0Var.m2879k0(), null, new cz0(dz0Var, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null), 3);
                return Boolean.TRUE;
            case 8:
                C0834vb c0834vb = (C0834vb) this.f7590e;
                Set set2 = (Set) obj;
                if (set2 instanceof fy0) {
                    kh0 kh0Var5 = ((fy0) set2).f1821d;
                    Object[] objArr2 = kh0Var5.f3151b;
                    long[] jArr2 = kh0Var5.f3150a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j2 = jArr2[i5];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8 - ((~(i5 - length2)) >>> 31);
                                for (int i7 = 0; i7 < i6; i7++) {
                                    if ((j2 & 255) < 128) {
                                        Object obj6 = objArr2[(i5 << 3) + i7];
                                        if (!(obj6 instanceof e41) || ((e41) obj6).m782e(4)) {
                                        }
                                    }
                                    j2 >>= 8;
                                }
                                if (i6 == 8) {
                                    if (i5 != length2) {
                                        i5++;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    Set set3 = set2;
                    if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                        for (Object obj7 : set3) {
                            if (!(obj7 instanceof e41) || ((e41) obj7).m782e(4)) {
                                c0834vb.mo1710s(set2);
                            }
                        }
                    }
                }
                return na1.f4229a;
            case 9:
                e31 e31Var = (e31) this.f7590e;
                Collection collection = (Set) obj;
                AtomicReference atomicReference = e31Var.f1285b;
                while (true) {
                    Object obj8 = atomicReference.get();
                    if (obj8 == null) {
                        collectionM5249S = collection;
                    } else if (obj8 instanceof Set) {
                        collectionM5249S = o30.m2783w(obj8, collection);
                    } else {
                        if (!(obj8 instanceof List)) {
                            AbstractC0653qi.m3253b("Unexpected notification");
                            throw new C0725sg();
                        }
                        collectionM5249S = AbstractC0960ye.m5249S((Collection) obj8, o30.m2782v(collection));
                    }
                    while (!atomicReference.compareAndSet(obj8, collectionM5249S)) {
                        if (atomicReference.get() != obj8) {
                        }
                        break;
                    }
                    if (e31Var.m776a()) {
                        e31Var.f1284a.invoke(new C0381k6(13, e31Var));
                    }
                    return na1.f4229a;
                }
                break;
            case 10:
                List list2 = (List) this.f7590e;
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                charSequence.getClass();
                if (list2.size() == 1) {
                    int size2 = list2.size();
                    if (size2 == 0) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    if (size2 != 1) {
                        C0921xc.m5131l("List has more than one element.");
                        return null;
                    }
                    String str = (String) list2.get(0);
                    int iM1768Z = k41.m1768Z(charSequence, str, iIntValue2, false, 4);
                    uo0Var = iM1768Z < 0 ? null : new uo0(Integer.valueOf(iM1768Z), str);
                } else {
                    if (iIntValue2 < 0) {
                        iIntValue2 = 0;
                    }
                    int i8 = new z20(iIntValue2, charSequence.length(), 1).f7249e;
                    if (charSequence instanceof String) {
                        if (iIntValue2 <= i8) {
                            while (true) {
                                Iterator it = list2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        String str2 = (String) next2;
                                        if (str2.regionMatches(0, (String) charSequence, iIntValue2, str2.length())) {
                                        }
                                    } else {
                                        next2 = null;
                                    }
                                }
                                String str3 = (String) next2;
                                if (str3 != null) {
                                    uo0Var = new uo0(Integer.valueOf(iIntValue2), str3);
                                } else if (iIntValue2 != i8) {
                                    iIntValue2++;
                                }
                            }
                        }
                    } else if (iIntValue2 <= i8) {
                        while (true) {
                            Iterator it2 = list2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    String str4 = (String) next;
                                    if (k41.m1772d0(str4, charSequence, iIntValue2, str4.length(), false)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            String str5 = (String) next;
                            if (str5 != null) {
                                uo0Var = new uo0(Integer.valueOf(iIntValue2), str5);
                            } else if (iIntValue2 != i8) {
                                iIntValue2++;
                            }
                        }
                    }
                }
                if (uo0Var != null) {
                    return new uo0(uo0Var.f6274d, Integer.valueOf(((String) uo0Var.f6275e).length()));
                }
                return null;
            case 11:
                ((InterfaceC0742sw) this.f7590e).invoke(obj);
                return na1.f4229a;
            default:
                return new w20(((C0276ha) this.f7590e).m1284a(0L, ((d30) obj).f953a, (k50) obj2));
        }
    }

    public /* synthetic */ C0956ya(int i, Object obj) {
        this.f7589d = i;
        this.f7590e = obj;
    }
}
