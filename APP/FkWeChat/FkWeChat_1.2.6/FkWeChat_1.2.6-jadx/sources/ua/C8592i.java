package ua;

import gb.AbstractC2650c1;
import gb.AbstractC2706r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5106t;
import p186m9.EnumC5132m;
import p229p9.InterfaceC6005h0;

/* JADX INFO: renamed from: ua.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8592i {

    /* JADX INFO: renamed from: a */
    public static final C8592i f28628a = new C8592i();

    /* JADX INFO: renamed from: d */
    public static final AbstractC2706r0 m33011d(EnumC5132m enumC5132m, InterfaceC6005h0 interfaceC6005h0) {
        interfaceC6005h0.getClass();
        AbstractC2650c1 abstractC2650c1M20907P = interfaceC6005h0.mo12669t().m20907P(enumC5132m);
        abstractC2650c1M20907P.getClass();
        return abstractC2650c1M20907P;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ AbstractC8590g m33012f(C8592i c8592i, Object obj, InterfaceC6005h0 interfaceC6005h0, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            interfaceC6005h0 = null;
        }
        return c8592i.m33015e(obj, interfaceC6005h0);
    }

    /* JADX INFO: renamed from: b */
    public final C8581b m33013b(List list, AbstractC2706r0 abstractC2706r0) {
        list.getClass();
        abstractC2706r0.getClass();
        return new C8609z(list, abstractC2706r0);
    }

    /* JADX INFO: renamed from: c */
    public final C8581b m33014c(List list, InterfaceC6005h0 interfaceC6005h0, EnumC5132m enumC5132m) {
        List listM20554X0 = AbstractC5081g0.m20554X0(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listM20554X0.iterator();
        while (it.hasNext()) {
            AbstractC8590g abstractC8590gM33012f = m33012f(this, it.next(), null, 2, null);
            if (abstractC8590gM33012f != null) {
                arrayList.add(abstractC8590gM33012f);
            }
        }
        if (interfaceC6005h0 == null) {
            return new C8581b(arrayList, new C8591h(enumC5132m));
        }
        AbstractC2650c1 abstractC2650c1M20907P = interfaceC6005h0.mo12669t().m20907P(enumC5132m);
        abstractC2650c1M20907P.getClass();
        return new C8609z(arrayList, abstractC2650c1M20907P);
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC8590g m33015e(Object obj, InterfaceC6005h0 interfaceC6005h0) {
        if (obj instanceof Byte) {
            return new C8585d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new C8606w(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new C8597n(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new C8603t(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new C8587e(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new C8596m(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new C8593j(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new C8583c(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new C8607x((String) obj);
        }
        if (obj instanceof byte[]) {
            return m33014c(AbstractC5106t.m20701P0((byte[]) obj), interfaceC6005h0, EnumC5132m.f15468y);
        }
        if (obj instanceof short[]) {
            return m33014c(AbstractC5106t.m20715W0((short[]) obj), interfaceC6005h0, EnumC5132m.f15469z);
        }
        if (obj instanceof int[]) {
            return m33014c(AbstractC5106t.m20709T0((int[]) obj), interfaceC6005h0, EnumC5132m.f15458A);
        }
        if (obj instanceof long[]) {
            return m33014c(AbstractC5106t.m20711U0((long[]) obj), interfaceC6005h0, EnumC5132m.f15460C);
        }
        if (obj instanceof char[]) {
            return m33014c(AbstractC5106t.m20703Q0((char[]) obj), interfaceC6005h0, EnumC5132m.f15467x);
        }
        if (obj instanceof float[]) {
            return m33014c(AbstractC5106t.m20707S0((float[]) obj), interfaceC6005h0, EnumC5132m.f15459B);
        }
        if (obj instanceof double[]) {
            return m33014c(AbstractC5106t.m20705R0((double[]) obj), interfaceC6005h0, EnumC5132m.f15461D);
        }
        if (obj instanceof boolean[]) {
            return m33014c(AbstractC5106t.m20717X0((boolean[]) obj), interfaceC6005h0, EnumC5132m.f15466w);
        }
        if (obj == null) {
            return new C8604u();
        }
        return null;
    }
}
