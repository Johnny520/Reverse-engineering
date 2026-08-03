package ca;

import java.util.Map;
import p028c1.C0374d;
import p063e9.C0838i;
import p065eb.C0866f;
import p065eb.C0874j;
import p071f1.C1017n;
import p072f2.InterfaceC1062y;
import p085fg.InterfaceC1231l;
import p100h0.AbstractC1522h0;
import p100h0.C1519g0;
import p100h0.EnumC1516f0;
import p101h1.C1570g;
import p101h1.InterfaceC1567d;
import p117i0.C1811b;
import p174m.C2595e3;
import p211o9.C3099l;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p219oh.AbstractC3165h;
import p249qg.C3564g;
import p276sf.C3959f;
import p276sf.C3967n;
import p315v8.C4527g;
import p321w.EnumC4599g0;
import p345x8.C5716i;

/* JADX INFO: renamed from: ca.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0512c implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1564g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ long f1565h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0512c(long j3, int i9) {
        this.f1564g = i9;
        this.f1565h = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        C3564g c3564g;
        Object c3959f;
        int i9 = this.f1564g;
        int i10 = 2;
        C3967n c3967n = C3967n.f12976a;
        long j3 = this.f1565h;
        switch (i9) {
            case 0:
                String str = (String) obj;
                str.getClass();
                if (!AbstractC3149m.m6721t0(str) && !str.equals(String.valueOf(j3))) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return Boolean.valueOf(j3 - ((C0838i) entry.getValue()).f2549b > 15000);
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                Object value = entry2.getValue();
                value.getClass();
                return Boolean.valueOf(j3 - ((Number) value).longValue() > 5000);
            case 3:
                Map.Entry entry3 = (Map.Entry) obj;
                entry3.getClass();
                Object value2 = entry3.getValue();
                value2.getClass();
                return Boolean.valueOf(j3 - ((Number) value2).longValue() > 5000);
            case 4:
                Map.Entry entry4 = (Map.Entry) obj;
                entry4.getClass();
                Object value3 = entry4.getValue();
                value3.getClass();
                long jLongValue = j3 - ((Number) value3).longValue();
                C0866f c0866f = C0866f.f2660a;
                Object key = entry4.getKey();
                key.getClass();
                return Boolean.valueOf(jLongValue > (AbstractC3156t.m6740d0((String) key, "msg:", false) ? 60000L : 1000L));
            case 5:
                Map.Entry entry5 = (Map.Entry) obj;
                entry5.getClass();
                Object value4 = entry5.getValue();
                value4.getClass();
                return Boolean.valueOf(j3 - ((Number) value4).longValue() > 3000);
            case 6:
                Map.Entry entry6 = (Map.Entry) obj;
                entry6.getClass();
                return Boolean.valueOf(j3 - ((C0874j) entry6.getValue()).f2684e > 600000);
            case 7:
                C1811b c1811b = (C1811b) obj;
                InterfaceC1231l interfaceC1231l = c1811b.f6030b;
                if (interfaceC1231l != null && (c3564g = c1811b.f6029a) != null) {
                    try {
                        c3959f = interfaceC1231l.invoke(Long.valueOf(j3));
                    } catch (Throwable th2) {
                        c3959f = new C3959f(th2);
                    }
                    c3564g.resumeWith(c3959f);
                    break;
                }
                return c3967n;
            case 8:
                Map.Entry entry7 = (Map.Entry) obj;
                entry7.getClass();
                return Boolean.valueOf(j3 - ((C3099l) entry7.getValue()).f10008b > 120000);
            case 9:
                Map.Entry entry8 = (Map.Entry) obj;
                entry8.getClass();
                Object value5 = entry8.getValue();
                value5.getClass();
                return Boolean.valueOf(j3 - ((Number) value5).longValue() > 5000);
            case 10:
                Map.Entry entry9 = (Map.Entry) obj;
                entry9.getClass();
                Object value6 = entry9.getValue();
                value6.getClass();
                return Boolean.valueOf(j3 - ((Number) value6).longValue() > 5000);
            case 11:
                InterfaceC1567d interfaceC1567d = (InterfaceC1567d) obj;
                interfaceC1567d.getClass();
                InterfaceC1567d.m4087Z(interfaceC1567d, this.f1565h, 0L, 0.0f, 0, 126);
                return c3967n;
            case 12:
                Map.Entry entry10 = (Map.Entry) obj;
                entry10.getClass();
                Object value7 = entry10.getValue();
                value7.getClass();
                return Boolean.valueOf(j3 - ((Number) value7).longValue() > 15000);
            case 13:
                Map.Entry entry11 = (Map.Entry) obj;
                entry11.getClass();
                return Boolean.valueOf(((Number) entry11.getValue()).longValue() < j3);
            case 14:
                return Boolean.valueOf(((C4527g) obj).f14937e < j3);
            case 15:
                C0374d c0374d = (C0374d) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (c0374d.f1051g.mo1324a() >> 32)) / 2.0f;
                return c0374d.m1334e(new C2595e3(fIntBitsToFloat, AbstractC3165h.m6791r(c0374d, fIntBitsToFloat), new C1017n(j3, 5), i10));
            case 16:
                ((InterfaceC1062y) obj).mo2644a(AbstractC1522h0.f5086c, new C1519g0(EnumC4599g0.f15156g, this.f1565h, EnumC1516f0.f5067h, true));
                return c3967n;
            case 17:
                InterfaceC1567d interfaceC1567d2 = (InterfaceC1567d) obj;
                interfaceC1567d2.getClass();
                InterfaceC1567d.m4087Z(interfaceC1567d2, this.f1565h, 0L, 0.0f, 0, 126);
                return c3967n;
            case 18:
                InterfaceC1567d interfaceC1567d3 = (InterfaceC1567d) obj;
                interfaceC1567d3.getClass();
                InterfaceC1567d.m4087Z(interfaceC1567d3, this.f1565h, 0L, 0.0f, 0, 126);
                return c3967n;
            case 19:
                InterfaceC1567d interfaceC1567d4 = (InterfaceC1567d) obj;
                interfaceC1567d4.getClass();
                InterfaceC1567d.m4087Z(interfaceC1567d4, this.f1565h, 0L, 0.0f, 0, 126);
                return c3967n;
            case 20:
                InterfaceC1567d interfaceC1567d5 = (InterfaceC1567d) obj;
                interfaceC1567d5.getClass();
                interfaceC1567d5.mo4080x(this.f1565h, InterfaceC1567d.m4088n0(interfaceC1567d5.mo4091a(), 0L), new C1570g(interfaceC1567d5.mo1601x0(2), 0.0f, 0, 0, 30));
                return c3967n;
            default:
                Map.Entry entry12 = (Map.Entry) obj;
                entry12.getClass();
                return Boolean.valueOf(j3 - ((C5716i) entry12.getValue()).f23252b > 600000);
        }
    }
}
