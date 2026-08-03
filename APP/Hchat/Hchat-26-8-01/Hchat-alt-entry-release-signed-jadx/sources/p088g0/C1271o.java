package p088g0;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import okhttp3.HttpUrl;
import p025bc.AbstractC0255e;
import p041d1.C0655c0;
import p057e1.C0807b;
import p057e1.C0808c;
import p057e1.C0810e;
import p085fg.InterfaceC1231l;
import p100h0.AbstractC1537m0;
import p116i.C1769m;
import p116i.C1772n;
import p116i.C1778p;
import p117i0.C1817c1;
import p119i2.C1950u;
import p119i2.InterfaceC1916b;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3143g;
import p218og.C3145i;
import p218og.InterfaceC3142f;
import p276sf.C3967n;
import p293u2.C4236f;
import p293u2.C4237g;
import p293u2.C4240j;
import p293u2.C4242l;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: g0.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1271o implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f4223g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [be.k.<init>(i2.g, i2.n0, java.util.List, u2.c, m2.d):void, h0.m0.<clinit>():void, ha.h.i(java.lang.String):void, ha.z.p(java.lang.Class):ha.x, i.d.<clinit>():void, i.d.h(i.l, java.lang.Float, i.k, boolean, fg.l, yf.c, int):java.lang.Object] */
    public /* synthetic */ C1271o(int i9) {
        this.f4223g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        int i9 = this.f4223g;
        C3967n c3967n = C3967n.f12976a;
        switch (i9) {
            case 0:
                return Boolean.TRUE;
            case 1:
                return String.format("%02x", Arrays.copyOf(new Object[]{Integer.valueOf(((Byte) obj).byteValue() & 255)}, 1));
            case 2:
                C0807b c0807b = (C0807b) obj;
                long j3 = c0807b.f2414a;
                return (9223372034707292159L & j3) != 9205357640488583168L ? new C1772n(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (c0807b.f2414a & 4294967295L))) : AbstractC1537m0.f5124a;
            case 3:
                C1772n c1772n = (C1772n) obj;
                return new C0807b((((long) Float.floatToRawIntBits(c1772n.f5914a)) << 32) | (((long) Float.floatToRawIntBits(c1772n.f5915b)) & 4294967295L));
            case 4:
                ((String) obj).getClass();
                return Boolean.valueOf(!AbstractC3149m.m6721t0(r10));
            case 5:
                ((String) obj).getClass();
                return Boolean.valueOf(!AbstractC3149m.m6721t0(r10));
            case 6:
                ((String) obj).getClass();
                return Boolean.valueOf(!AbstractC3149m.m6721t0(r10));
            case 7:
                Method method = (Method) obj;
                method.getClass();
                String genericString = method.toGenericString();
                genericString.getClass();
                return genericString;
            case 8:
                InterfaceC3142f interfaceC3142f = (InterfaceC3142f) obj;
                interfaceC3142f.getClass();
                C3145i c3145i = (C3145i) interfaceC3142f;
                String str = (String) ((C3143g) c3145i.m6676a()).get(1);
                String string = AbstractC3149m.m6703R0((String) ((C3143g) c3145i.m6676a()).get(2)).toString();
                List listM6691F0 = AbstractC3149m.m6691F0(string, new char[]{','}, 6);
                ArrayList arrayList = new ArrayList();
                Iterator it = listM6691F0.iterator();
                while (it.hasNext()) {
                    Integer numM6742f0 = AbstractC3156t.m6742f0(AbstractC3149m.m6703R0((String) it.next()).toString());
                    if (numM6742f0 != null) {
                        arrayList.add(numM6742f0);
                    }
                }
                Set setM8412U1 = AbstractC4166m.m8412U1(arrayList);
                if (setM8412U1.contains(0) && setM8412U1.contains(2)) {
                    return c3145i.m6678c();
                }
                if (AbstractC3149m.m6721t0(string)) {
                    string = null;
                }
                String strConcat = string != null ? ",".concat(string) : null;
                if (strConcat == null) {
                    strConcat = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                return AbstractC0255e.m1022k("(", str, " in (0,2", strConcat, "))");
            case 9:
                return c3967n;
            case 10:
                return new C1769m(((Float) obj).floatValue());
            case 11:
                return new C1769m(((Integer) obj).intValue());
            case 12:
                return Integer.valueOf((int) ((C1769m) obj).f5910a);
            case 13:
                return new C1769m(((C4236f) obj).f13909g);
            case 14:
                return new C4236f(((C1769m) obj).f5910a);
            case 15:
                C4237g c4237g = (C4237g) obj;
                return new C1772n(Float.intBitsToFloat((int) (c4237g.f13910a >> 32)), Float.intBitsToFloat((int) (c4237g.f13910a & 4294967295L)));
            case 16:
                C1772n c1772n2 = (C1772n) obj;
                return new C4237g((((long) Float.floatToRawIntBits(c1772n2.f5914a)) << 32) | (((long) Float.floatToRawIntBits(c1772n2.f5915b)) & 4294967295L));
            case 17:
                C0810e c0810e = (C0810e) obj;
                return new C1772n(Float.intBitsToFloat((int) (c0810e.f2428a >> 32)), Float.intBitsToFloat((int) (c0810e.f2428a & 4294967295L)));
            case 18:
                C1772n c1772n3 = (C1772n) obj;
                return new C0810e((((long) Float.floatToRawIntBits(c1772n3.f5914a)) << 32) | (((long) Float.floatToRawIntBits(c1772n3.f5915b)) & 4294967295L));
            case 19:
                C0807b c0807b2 = (C0807b) obj;
                return new C1772n(Float.intBitsToFloat((int) (c0807b2.f2414a >> 32)), Float.intBitsToFloat((int) (c0807b2.f2414a & 4294967295L)));
            case 20:
                C1772n c1772n4 = (C1772n) obj;
                return new C0807b((((long) Float.floatToRawIntBits(c1772n4.f5914a)) << 32) | (((long) Float.floatToRawIntBits(c1772n4.f5915b)) & 4294967295L));
            case 21:
                long j4 = ((C4240j) obj).f13912a;
                return new C1772n((int) (j4 >> 32), (int) (j4 & 4294967295L));
            case 22:
                C1772n c1772n5 = (C1772n) obj;
                return new C4240j((((long) Math.round(c1772n5.f5914a)) << 32) | (((long) Math.round(c1772n5.f5915b)) & 4294967295L));
            case 23:
                long j5 = ((C4242l) obj).f13918a;
                return new C1772n((int) (j5 >> 32), (int) (j5 & 4294967295L));
            case 24:
                C1772n c1772n6 = (C1772n) obj;
                int iRound = Math.round(c1772n6.f5914a);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(c1772n6.f5915b);
                return new C4242l((((long) iRound) << 32) | (((long) (iRound2 >= 0 ? iRound2 : 0)) & 4294967295L));
            case 25:
                C0808c c0808c = (C0808c) obj;
                return new C1778p(c0808c.f2416a, c0808c.f2417b, c0808c.f2418c, c0808c.f2419d);
            case 26:
                C1778p c1778p = (C1778p) obj;
                return new C0808c(c1778p.f5924a, c1778p.f5925b, c1778p.f5926c, c1778p.f5927d);
            case 27:
                return Float.valueOf(((C1769m) obj).f5910a);
            case 28:
                C0655c0 c0655c0 = ((C1817c1) obj).f6036a;
                if (c0655c0 != null) {
                    c0655c0.invoke();
                }
                return c3967n;
            default:
                return Boolean.valueOf(!(((InterfaceC1916b) obj) instanceof C1950u));
        }
    }
}
