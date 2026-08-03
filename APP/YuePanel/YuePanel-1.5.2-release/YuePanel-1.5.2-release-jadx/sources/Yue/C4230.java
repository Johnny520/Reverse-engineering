package Yue;

import Yue.C7060;
import Yue.InterfaceC4225;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۦۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4230 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final String f749 = " @";

    /* JADX INFO: renamed from: Yue.ۥ۟ۧۦۧ$ۥ */
    public static final class C0358 extends AbstractC5673 implements InterfaceC5138<InterfaceC4225, InterfaceC4225.InterfaceC0357, InterfaceC4225> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C0358 f8582 = new C0358();

        public C0358() {
            super(2);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final InterfaceC4225 invoke(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 InterfaceC4225.InterfaceC0357 interfaceC0357) {
            return interfaceC0357 instanceof InterfaceC4223 ? interfaceC4225.plus(((InterfaceC4223) interfaceC0357).m12157()) : interfaceC4225.plus(interfaceC0357);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۧۦۧ$ۥ۟ */
    public static final class C0359 extends AbstractC5673 implements InterfaceC5138<InterfaceC4225, InterfaceC4225.InterfaceC0357, InterfaceC4225> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C7060.C7066<InterfaceC4225> f8583;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ boolean f8584;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0359(C7060.C7066<InterfaceC4225> c7066, boolean z) {
            super(2);
            this.f8583 = c7066;
            this.f8584 = z;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        /* JADX WARN: Type inference failed for: r2v2, types: [T, Yue.ۥ۟ۧۦۥ] */
        @Override // Yue.InterfaceC5138
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final InterfaceC4225 invoke(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 InterfaceC4225.InterfaceC0357 interfaceC0357) {
            if (!(interfaceC0357 instanceof InterfaceC4223)) {
                return interfaceC4225.plus(interfaceC0357);
            }
            InterfaceC4225.InterfaceC0357 interfaceC03572 = this.f8583.f21353.get(interfaceC0357.getKey());
            if (interfaceC03572 != null) {
                C7060.C7066<InterfaceC4225> c7066 = this.f8583;
                c7066.f21353 = c7066.f21353.minusKey(interfaceC0357.getKey());
                return interfaceC4225.plus(((InterfaceC4223) interfaceC0357).m12156(interfaceC03572));
            }
            InterfaceC4223 interfaceC4223M12157 = (InterfaceC4223) interfaceC0357;
            if (this.f8584) {
                interfaceC4223M12157 = interfaceC4223M12157.m12157();
            }
            return interfaceC4225.plus(interfaceC4223M12157);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۧۦۧ$ۥ۟۟, reason: contains not printable characters */
    public static final class C4231 extends AbstractC5673 implements InterfaceC5138<Boolean, InterfaceC4225.InterfaceC0357, Boolean> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C4231 f8585 = new C4231();

        public C4231() {
            super(2);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5138
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, InterfaceC4225.InterfaceC0357 interfaceC0357) {
            return m12172(bool.booleanValue(), interfaceC0357);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Boolean m12172(boolean z, @InterfaceC6399 InterfaceC4225.InterfaceC0357 interfaceC0357) {
            return Boolean.valueOf(z || (interfaceC0357 instanceof InterfaceC4223));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Yue.ۥ۟ۧۦۥ */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    /* JADX INFO: renamed from: ۥ */
    public static final InterfaceC4225 m1195(InterfaceC4225 interfaceC4225, InterfaceC4225 interfaceC42252, boolean z) {
        boolean zM12163 = m12163(interfaceC4225);
        boolean zM121632 = m12163(interfaceC42252);
        if (!zM12163 && !zM121632) {
            return interfaceC4225.plus(interfaceC42252);
        }
        C7060.C7066 c7066 = new C7060.C7066();
        c7066.f21353 = interfaceC42252;
        C4629 c4629 = C4629.f9940;
        InterfaceC4225 interfaceC42253 = (InterfaceC4225) interfaceC4225.fold(c4629, new C0359(c7066, z));
        if (zM121632) {
            c7066.f21353 = ((InterfaceC4225) c7066.f21353).fold(c4629, C0358.f8582);
        }
        return interfaceC42253.plus((InterfaceC4225) c7066.f21353);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ */
    public static final String m1196(@InterfaceC6399 InterfaceC4225 interfaceC4225) {
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final boolean m12163(InterfaceC4225 interfaceC4225) {
        return ((Boolean) interfaceC4225.fold(Boolean.FALSE, C4231.f8585)).booleanValue();
    }

    @InterfaceC6399
    @InterfaceC5495
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final InterfaceC4225 m12164(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 InterfaceC4225 interfaceC42252) {
        return !m12163(interfaceC42252) ? interfaceC4225.plus(interfaceC42252) : m1195(interfaceC4225, interfaceC42252, false);
    }

    @InterfaceC6399
    @InterfaceC4764
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final InterfaceC4225 m12165(@InterfaceC6399 InterfaceC4243 interfaceC4243, @InterfaceC6399 InterfaceC4225 interfaceC4225) {
        InterfaceC4225 interfaceC4225M1195 = m1195(interfaceC4243.getCoroutineContext(), interfaceC4225, true);
        return (interfaceC4225M1195 == C4423.m1371() || interfaceC4225M1195.get(InterfaceC4202.f8519) != null) ? interfaceC4225M1195 : interfaceC4225M1195.plus(C4423.m1371());
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final C8102<?> m12166(@InterfaceC6399 InterfaceC4246 interfaceC4246) {
        while (!(interfaceC4246 instanceof C4418) && (interfaceC4246 = interfaceC4246.getCallerFrame()) != null) {
            if (interfaceC4246 instanceof C8102) {
                return (C8102) interfaceC4246;
            }
        }
        return null;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final C8102<?> m12167(@InterfaceC6399 InterfaceC4199<?> interfaceC4199, @InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6489 Object obj) {
        if (!(interfaceC4199 instanceof InterfaceC4246) || interfaceC4225.get(C8104.f24031) == null) {
            return null;
        }
        C8102<?> c8102M12166 = m12166((InterfaceC4246) interfaceC4199);
        if (c8102M12166 != null) {
            c8102M12166.m26702(interfaceC4225, obj);
        }
        return c8102M12166;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[DONT_GENERATE] */
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> T m12168(@InterfaceC6399 InterfaceC4199<?> interfaceC4199, @InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC5122<? extends T> interfaceC5122) {
        InterfaceC4225 context = interfaceC4199.getContext();
        Object objM24718 = C7776.m24718(context, obj);
        C8102<?> c8102M12167 = objM24718 != C7776.f3074 ? m12167(interfaceC4199, context, objM24718) : null;
        try {
            return interfaceC5122.invoke();
        } finally {
            C5437.m16930(1);
            if (c8102M12167 == null || c8102M12167.m26701()) {
                C7776.m3874(context, objM24718);
            }
            C5437.m16929(1);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final <T> T m12169(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC5122<? extends T> interfaceC5122) {
        Object objM24718 = C7776.m24718(interfaceC4225, obj);
        try {
            return interfaceC5122.invoke();
        } finally {
            C5437.m16930(1);
            C7776.m3874(interfaceC4225, objM24718);
            C5437.m16929(1);
        }
    }
}
