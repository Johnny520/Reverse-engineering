package p207o5;

import ac.C0058k;
import androidx.lifecycle.C0119x;
import com.alibaba.fastjson2.JSONB;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p005a5.C0016a;
import p046d6.C0709f;
import p074f5.EnumC1065a;
import p150k5.C2270u;
import p150k5.C2274y;
import p150k5.C2275z;
import p162l3.C2469w;
import p174m.C2571a;
import p271s5.InterfaceC3929a;
import p283t5.InterfaceC4121d;

/* JADX INFO: renamed from: o5.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3053h extends AbstractC3055j {

    /* JADX INFO: renamed from: j */
    public static final C2469w f9884j = new C2469w(10);

    /* JADX INFO: renamed from: g */
    public final C2270u f9885g;

    /* JADX INFO: renamed from: h */
    public final int f9886h;

    /* JADX INFO: renamed from: i */
    public final C0058k f9887i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3053h(C2270u c2270u, int i9, C0058k c0058k) {
        this.f9885g = c2270u;
        this.f9886h = i9;
        this.f9887i = c0058k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p207o5.AbstractC3055j
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Iterator mo6494a() {
        return m6495b(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C3052g m6495b(C0016a c0016a) {
        if (c0016a == null) {
            C0119x c0119x = this.f9885g.f7532b;
            c0119x.getClass();
            C0016a c0016a2 = new C0016a(this.f9886h, 5, c0119x);
            c0016a2.m213q();
            c0016a = c0016a2;
        }
        return new C3052g(this, c0016a, c0016a.m211o(false));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i9;
        Object next;
        InterfaceC3929a interfaceC3929a;
        String type;
        C3053h c3053h = this;
        C0058k c0058k = c3053h.f9887i;
        C2275z c2275z = (C2275z) c0058k.f178j;
        C2270u c2270u = c3053h.f9885g;
        C0119x c0119x = c2270u.f7532b;
        c0119x.getClass();
        int i10 = c3053h.f9886h;
        C0016a c0016a = new C0016a(i10, 5, c0119x);
        byte[] bArr = (byte[]) c0119x.f310h;
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        int i12 = b10 & 255;
        if (i12 > 127) {
            int i13 = i10 + 2;
            byte b11 = bArr[i11];
            int i14 = b11 & 255;
            int i15 = ((b11 & JSONB.Constants.BC_SYMBOL) << 7) | (b10 & JSONB.Constants.BC_SYMBOL);
            if (i14 > 127) {
                int i16 = i10 + 3;
                byte b12 = bArr[i13];
                int i17 = b12 & 255;
                i12 = ((b12 & JSONB.Constants.BC_SYMBOL) << 14) | i15;
                if (i17 > 127) {
                    i11 = i10 + 4;
                    byte b13 = bArr[i16];
                    int i18 = b13 & 255;
                    i12 |= (b13 & JSONB.Constants.BC_SYMBOL) << 21;
                    if (i18 > 127) {
                        i16 = i10 + 5;
                        byte b14 = bArr[i11];
                        if (b14 < 0) {
                            throw new C0709f(null, "Invalid uleb128 integer encountered at offset 0x%x", Integer.valueOf(i10));
                        }
                        i12 |= b14 << 28;
                        i11 = i16;
                    }
                    i9 = i12;
                } else {
                    i11 = i16;
                    i9 = i12;
                }
            } else {
                i9 = i15;
                i11 = i13;
            }
        } else {
            i9 = i12;
        }
        c0016a.f55h = i11;
        int iM369t = c0058k.m369t();
        int iM583N = ((C2270u) c0058k.f177i).f7532b.m583N(c0058k.f176h + 12);
        Iterator it = c0058k.m365p().iterator();
        while (true) {
            AbstractC3065t abstractC3065t = (AbstractC3065t) it;
            next = abstractC3065t.next();
            if (!abstractC3065t.hasNext()) {
                break;
            }
            c3053h = this;
        }
        int iMo5877c = iM583N - ((InterfaceC4121d) next).mo5877c();
        InterfaceC3929a[] interfaceC3929aArr = new InterfaceC3929a[iM369t];
        C2469w c2469w = f9884j;
        Arrays.fill(interfaceC3929aArr, c2469w);
        List listMo4930g1 = c2275z.mo4930g1();
        C2270u c2270u2 = c2275z.f7570j;
        int i19 = c2275z.f7574n;
        List c2274y = i19 > 0 ? new C2274y(c2270u2, i19, c2270u2.f7532b.m583N(i19), 3) : Collections.EMPTY_LIST;
        C3052g c3052gM6495b = c3053h.m6495b(c0016a);
        Iterator it2 = listMo4930g1.iterator();
        Iterator it3 = c2274y.iterator();
        int i20 = 0;
        if (!EnumC1065a.STATIC.m2688a(c2275z.f7572l)) {
            interfaceC3929aArr[0] = new C2571a(c3053h, 8);
            i20 = 1;
        }
        while (it2.hasNext()) {
            int i21 = i20 + 1;
            InterfaceC3929a[] interfaceC3929aArr2 = interfaceC3929aArr;
            interfaceC3929aArr2[i20] = new C3061p(c3052gM6495b.hasNext() ? (String) c3052gM6495b.next() : null, ((CharSequence) it2.next()).toString(), it3.hasNext() ? (Set) it3.next() : Collections.EMPTY_SET);
            i20 = i21;
            interfaceC3929aArr = interfaceC3929aArr2;
        }
        InterfaceC3929a[] interfaceC3929aArr3 = interfaceC3929aArr;
        if (i20 < iM369t) {
            int i22 = iM369t - 1;
            while (true) {
                i20--;
                if (i20 <= -1 || ((type = (interfaceC3929a = interfaceC3929aArr3[i20]).getType()) != null && ((type.equals("J") || type.equals("D")) && i22 - 1 == i20))) {
                    break;
                }
                interfaceC3929aArr3[i22] = interfaceC3929a;
                interfaceC3929aArr3[i20] = c2469w;
                i22--;
            }
        }
        return new C3051f(c3053h, c2270u.f7532b, c0016a.f55h, i9, iMo5877c, interfaceC3929aArr3);
    }
}
