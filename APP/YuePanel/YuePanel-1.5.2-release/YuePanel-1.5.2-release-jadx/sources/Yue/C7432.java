package Yue;

import Yue.C7148;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۡۨۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C7432<T> extends AbstractC3015<C7435> implements InterfaceC6308<T>, InterfaceC3669<T>, InterfaceC5154<T> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final int f22526;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final int f22527;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public final EnumC3602 f22528;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    @InterfaceC6489
    public Object[] f22529;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public long f22530;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public long f22531;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public int f22532;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public int f22533;

    /* JADX INFO: renamed from: Yue.ۥۡۨۨۡ$ۥ */
    public static final class C1259 implements InterfaceC4433 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        @InterfaceC5568
        public final C7432<?> f22534;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @InterfaceC5568
        public long f22535;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        @InterfaceC5568
        @InterfaceC6489
        public final Object f22536;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        @InterfaceC6399
        @InterfaceC5568
        public final InterfaceC4199<C8107> f22537;

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ> */
        /* JADX WARN: Multi-variable type inference failed */
        public C1259(@InterfaceC6399 C7432<?> c7432, long j, @InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            this.f22534 = c7432;
            this.f22535 = j;
            this.f22536 = obj;
            this.f22537 = interfaceC4199;
        }

        @Override // Yue.InterfaceC4433
        /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
        public void mo5757() {
            this.f22534.m23286(this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۨۨۡ$ۥ۟ */
    public /* synthetic */ class C1260 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int[] f2880;

        static {
            int[] iArr = new int[EnumC3602.values().length];
            iArr[EnumC3602.SUSPEND.ordinal()] = 1;
            iArr[EnumC3602.DROP_LATEST.ordinal()] = 2;
            iArr[EnumC3602.DROP_OLDEST.ordinal()] = 3;
            f2880 = iArr;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۨۨۡ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.SharedFlowImpl", m1273f = "SharedFlow.kt", m1274i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, m1275l = {373, 380, 383}, m1276m = "collect$suspendImpl", m1277n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "this", "collector", "slot", "collectorJob"}, m1278s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    public static final class C7433 extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f22538;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f22539;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Object f22540;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public Object f22541;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public /* synthetic */ Object f22542;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public final /* synthetic */ C7432<T> f22543;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public int f22544;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7433(C7432<T> c7432, InterfaceC4199<? super C7433> interfaceC4199) {
            super(interfaceC4199);
            this.f22543 = c7432;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f22542 = obj;
            this.f22544 |= Integer.MIN_VALUE;
            return C7432.m23281(this.f22543, null, this);
        }
    }

    public C7432(int i, int i2, @InterfaceC6399 EnumC3602 enumC3602) {
        this.f22526 = i;
        this.f22527 = i2;
        this.f22528 = enumC3602;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v10, resolved type: Yue.ۥۣۣ۠ۢ */
    /* JADX DEBUG: Multi-variable search result rejected for r10v7, resolved type: Yue.ۥۣۣ۠ۢ */
    /* JADX DEBUG: Multi-variable search result rejected for r10v9, resolved type: Yue.ۥۣۣ۠ۢ */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object m23281(C7432 c7432, InterfaceC4892 interfaceC4892, InterfaceC4199 interfaceC4199) throws Throwable {
        C7433 c7433;
        C7432 c74322;
        Throwable th;
        C7435 c7435;
        InterfaceC4892 interfaceC48922;
        InterfaceC5542 interfaceC5542;
        InterfaceC4892 interfaceC48923;
        if (interfaceC4199 instanceof C7433) {
            c7433 = (C7433) interfaceC4199;
            int i = c7433.f22544;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7433.f22544 = i - Integer.MIN_VALUE;
            } else {
                c7433 = new C7433(c7432, interfaceC4199);
            }
        }
        Object obj = c7433.f22542;
        Object objM17142 = C5508.m17142();
        int i2 = c7433.f22544;
        if (i2 != 0) {
            if (i2 == 1) {
                c7435 = (C7435) c7433.f22540;
                InterfaceC4892 interfaceC48924 = (InterfaceC4892) c7433.f22539;
                C7432 c74323 = (C7432) c7433.f22538;
                try {
                    C7149.m22422(obj);
                    interfaceC48922 = interfaceC48924;
                    c7432 = c74323;
                    try {
                        interfaceC5542 = (InterfaceC5542) c7433.getContext().get(InterfaceC5542.f13507);
                        interfaceC48923 = interfaceC48922;
                    } catch (Throwable th2) {
                        c74322 = c7432;
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c74322 = c74323;
                }
            } else {
                if (i2 != 2 && i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC5542 interfaceC55422 = (InterfaceC5542) c7433.f22541;
                c7435 = (C7435) c7433.f22540;
                InterfaceC4892 interfaceC48925 = (InterfaceC4892) c7433.f22539;
                c74322 = (C7432) c7433.f22538;
                try {
                    C7149.m22422(obj);
                    interfaceC48923 = interfaceC48925;
                    interfaceC5542 = interfaceC55422;
                    c7432 = c74322;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            c74322.m5888(c7435);
            throw th;
        }
        C7149.m22422(obj);
        C7435 c7435M5884 = c7432.m5884();
        try {
            if (interfaceC4892 instanceof C7667) {
                c7433.f22538 = c7432;
                c7433.f22539 = interfaceC4892;
                c7433.f22540 = c7435M5884;
                c7433.f22544 = 1;
                if (((C7667) interfaceC4892).m3774(c7433) == objM17142) {
                    return objM17142;
                }
            }
            interfaceC48922 = interfaceC4892;
            c7435 = c7435M5884;
            interfaceC5542 = (InterfaceC5542) c7433.getContext().get(InterfaceC5542.f13507);
            interfaceC48923 = interfaceC48922;
        } catch (Throwable th5) {
            c74322 = c7432;
            th = th5;
            c7435 = c7435M5884;
        }
        while (true) {
            Object objM23305 = c7432.m23305(c7435);
            if (objM23305 == C7434.f2881) {
                c7433.f22538 = c7432;
                c7433.f22539 = interfaceC48923;
                c7433.f22540 = c7435;
                c7433.f22541 = interfaceC5542;
                c7433.f22544 = 2;
                if (c7432.m23285(c7435, c7433) == objM17142) {
                    return objM17142;
                }
            } else {
                if (interfaceC5542 != null) {
                    C5553.m17212(interfaceC5542);
                }
                c7433.f22538 = c7432;
                c7433.f22539 = interfaceC48923;
                c7433.f22540 = c7435;
                c7433.f22541 = interfaceC5542;
                c7433.f22544 = 3;
                if (interfaceC48923.mo10059(objM23305, c7433) == objM17142) {
                    return objM17142;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static /* synthetic */ Object m23282(C7432 c7432, Object obj, InterfaceC4199 interfaceC4199) {
        Object objM23292;
        return (!c7432.mo19612(obj) && (objM23292 = c7432.m23292(obj, interfaceC4199)) == C5508.m17142()) ? objM23292 : C8107.f3222;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public final long m23283() {
        return Math.min(this.f22531, this.f22530);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static /* synthetic */ void m23284() {
    }

    @Override // Yue.InterfaceC7431, Yue.InterfaceC4890
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public Object mo48(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
        return m23281(this, interfaceC4892, interfaceC4199);
    }

    /* JADX DEBUG: Class process forced to load method for inline: Yue.ۥۡۨۨۢ.ۥ۟۟(java.lang.Object[], long):java.lang.Object */
    @Override // Yue.InterfaceC7431
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public List<T> mo3317() {
        synchronized (this) {
            int iM23299 = m23299();
            if (iM23299 == 0) {
                return C3880.m10735();
            }
            ArrayList arrayList = new ArrayList(iM23299);
            Object[] objArr = this.f22529;
            C5499.m17100(objArr);
            for (int i = 0; i < iM23299; i++) {
                arrayList.add(C7434.m23312(objArr, this.f22530 + ((long) i)));
            }
            return arrayList;
        }
    }

    @Override // Yue.InterfaceC5154
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ */
    public InterfaceC4890<T> mo10178(@InterfaceC6399 InterfaceC4225 interfaceC4225, int i, @InterfaceC6399 EnumC3602 enumC3602) {
        return C7434.m23311(this, interfaceC4225, i, enumC3602);
    }

    @Override // Yue.InterfaceC6308, Yue.InterfaceC4892
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public Object mo10059(T t, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        return m23282(this, t, interfaceC4199);
    }

    @Override // Yue.InterfaceC6308
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo19611() {
        synchronized (this) {
            m23306(m23295(), this.f22531, m23295(), m23298());
            C8107 c8107 = C8107.f3222;
        }
    }

    @Override // Yue.InterfaceC6308
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    public boolean mo19612(T t) {
        int i;
        boolean z;
        InterfaceC4199<C8107>[] interfaceC4199ArrM23294 = C3016.f36;
        synchronized (this) {
            if (m23302(t)) {
                interfaceC4199ArrM23294 = m23294(interfaceC4199ArrM23294);
                z = true;
            } else {
                z = false;
            }
        }
        for (InterfaceC4199<C8107> interfaceC4199 : interfaceC4199ArrM23294) {
            if (interfaceC4199 != null) {
                C7148.C1189 c1189 = C7148.f21560;
                interfaceC4199.resumeWith(C7148.m3438(C8107.f3222));
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final Object m23285(C7435 c7435, InterfaceC4199<? super C8107> interfaceC4199) {
        C8107 c8107;
        C3666 c3666 = new C3666(C5501.m17135(interfaceC4199), 1);
        c3666.mo10020();
        synchronized (this) {
            try {
                if (m23304(c7435) < 0) {
                    c7435.f2883 = c3666;
                } else {
                    C7148.C1189 c1189 = C7148.f21560;
                    c3666.resumeWith(C7148.m3438(C8107.f3222));
                }
                c8107 = C8107.f3222;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objM10039 = c3666.m10039();
        if (objM10039 == C5508.m17142()) {
            C4324.m12513(interfaceC4199);
        }
        return objM10039 == C5508.m17142() ? objM10039 : c8107;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public final void m23286(C1259 c1259) {
        synchronized (this) {
            if (c1259.f22535 < m23283()) {
                return;
            }
            Object[] objArr = this.f22529;
            C5499.m17100(objArr);
            if (C7434.m23312(objArr, c1259.f22535) != c1259) {
                return;
            }
            C7434.m23314(objArr, c1259.f22535, C7434.f2881);
            m23287();
            C8107 c8107 = C8107.f3222;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final void m23287() {
        if (this.f22527 != 0 || this.f22533 > 1) {
            Object[] objArr = this.f22529;
            C5499.m17100(objArr);
            while (this.f22533 > 0 && C7434.m23312(objArr, (m23283() + ((long) m23300())) - 1) == C7434.f2881) {
                this.f22533--;
                C7434.m23314(objArr, m23283() + ((long) m23300()), null);
            }
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: Yue.ۥ۟۟ۢۤ.ۥ۟۟۟(Yue.ۥ۟۟ۢۤ):int */
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final void m23288(long j) {
        AbstractC3017[] abstractC3017Arr;
        if (this.f4379 != 0 && (abstractC3017Arr = this.f4378) != null) {
            for (AbstractC3017 abstractC3017 : abstractC3017Arr) {
                if (abstractC3017 != null) {
                    C7435 c7435 = (C7435) abstractC3017;
                    long j2 = c7435.f2882;
                    if (j2 >= 0 && j2 < j) {
                        c7435.f2882 = j;
                    }
                }
            }
        }
        this.f22531 = j;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۟ۢ()LYue/ۥ۟۟ۢۦ; */
    @Override // Yue.AbstractC3015
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C7435 mo5885() {
        return new C7435();
    }

    /* JADX DEBUG: Method merged with bridge method: ۥۣ۟۟۟(I)[LYue/ۥ۟۟ۢۦ; */
    @Override // Yue.AbstractC3015
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C7435[] mo5886(int i) {
        return new C7435[i];
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public final void m23291() {
        Object[] objArr = this.f22529;
        C5499.m17100(objArr);
        C7434.m23314(objArr, m23283(), null);
        this.f22532--;
        long jM23283 = m23283() + 1;
        if (this.f22530 < jM23283) {
            this.f22530 = jM23283;
        }
        if (this.f22531 < jM23283) {
            m23288(jM23283);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public final Object m23292(T t, InterfaceC4199<? super C8107> interfaceC4199) {
        InterfaceC4199<C8107>[] interfaceC4199ArrM23294;
        C1259 c1259;
        C3666 c3666 = new C3666(C5501.m17135(interfaceC4199), 1);
        c3666.mo10020();
        InterfaceC4199<C8107>[] interfaceC4199ArrM232942 = C3016.f36;
        synchronized (this) {
            try {
                if (m23302(t)) {
                    C7148.C1189 c1189 = C7148.f21560;
                    c3666.resumeWith(C7148.m3438(C8107.f3222));
                    interfaceC4199ArrM23294 = m23294(interfaceC4199ArrM232942);
                    c1259 = null;
                } else {
                    C1259 c12592 = new C1259(this, ((long) m23300()) + m23283(), t, c3666);
                    m23293(c12592);
                    this.f22533++;
                    if (this.f22527 == 0) {
                        interfaceC4199ArrM232942 = m23294(interfaceC4199ArrM232942);
                    }
                    interfaceC4199ArrM23294 = interfaceC4199ArrM232942;
                    c1259 = c12592;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c1259 != null) {
            C3668.m735(c3666, c1259);
        }
        for (InterfaceC4199<C8107> interfaceC41992 : interfaceC4199ArrM23294) {
            if (interfaceC41992 != null) {
                C7148.C1189 c11892 = C7148.f21560;
                interfaceC41992.resumeWith(C7148.m3438(C8107.f3222));
            }
        }
        Object objM10039 = c3666.m10039();
        if (objM10039 == C5508.m17142()) {
            C4324.m12513(interfaceC4199);
        }
        return objM10039 == C5508.m17142() ? objM10039 : C8107.f3222;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public final void m23293(Object obj) {
        int iM23300 = m23300();
        Object[] objArrM23301 = this.f22529;
        if (objArrM23301 == null) {
            objArrM23301 = m23301(null, 0, 2);
        } else if (iM23300 >= objArrM23301.length) {
            objArrM23301 = m23301(objArrM23301, iM23300, objArrM23301.length * 2);
        }
        C7434.m23314(objArrM23301, m23283() + ((long) iM23300), obj);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:22:0x0047 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:24:0x0044 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [Yue.ۥ۟ۧۤۢ<Yue.ۥۣۢ۠ۤ>[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public final InterfaceC4199<C8107>[] m23294(InterfaceC4199<C8107>[] interfaceC4199Arr) {
        AbstractC3017[] abstractC3017Arr;
        C7435 c7435;
        InterfaceC4199<? super C8107> interfaceC4199;
        int length = interfaceC4199Arr.length;
        if (this.f4379 != 0 && (abstractC3017Arr = this.f4378) != null) {
            int length2 = abstractC3017Arr.length;
            int i = 0;
            interfaceC4199Arr = interfaceC4199Arr;
            while (i < length2) {
                AbstractC3017 abstractC3017 = abstractC3017Arr[i];
                if (abstractC3017 != null && (interfaceC4199 = (c7435 = (C7435) abstractC3017).f2883) != null && m23304(c7435) >= 0) {
                    int length3 = interfaceC4199Arr.length;
                    interfaceC4199Arr = interfaceC4199Arr;
                    if (length >= length3) {
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) interfaceC4199Arr, Math.max(2, interfaceC4199Arr.length * 2));
                        C5499.m17102(objArrCopyOf, "copyOf(this, newSize)");
                        interfaceC4199Arr = objArrCopyOf;
                    }
                    ((InterfaceC4199[]) interfaceC4199Arr)[length] = interfaceC4199;
                    c7435.f2883 = null;
                    length++;
                }
                i++;
                interfaceC4199Arr = interfaceC4199Arr;
            }
        }
        return (InterfaceC4199[]) interfaceC4199Arr;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public final long m23295() {
        return m23283() + ((long) this.f22532);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public final T m23296() {
        Object[] objArr = this.f22529;
        C5499.m17100(objArr);
        return (T) C7434.m23312(objArr, (this.f22530 + ((long) m23299())) - 1);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public final Object m23297(long j) {
        Object[] objArr = this.f22529;
        C5499.m17100(objArr);
        Object objM23312 = C7434.m23312(objArr, j);
        return objM23312 instanceof C1259 ? ((C1259) objM23312).f22536 : objM23312;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public final long m23298() {
        return m23283() + ((long) this.f22532) + ((long) this.f22533);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final int m23299() {
        return (int) ((m23283() + ((long) this.f22532)) - this.f22530);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final int m23300() {
        return this.f22532 + this.f22533;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final Object[] m23301(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            throw new IllegalStateException("Buffer size overflow".toString());
        }
        Object[] objArr2 = new Object[i2];
        this.f22529 = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long jM23283 = m23283();
        for (int i3 = 0; i3 < i; i3++) {
            long j = ((long) i3) + jM23283;
            C7434.m23314(objArr2, j, C7434.m23312(objArr, j));
        }
        return objArr2;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public final boolean m23302(T t) {
        if (m5889() == 0) {
            return m23303(t);
        }
        if (this.f22532 >= this.f22527 && this.f22531 <= this.f22530) {
            int i = C1260.f2880[this.f22528.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
        }
        m23293(t);
        int i2 = this.f22532 + 1;
        this.f22532 = i2;
        if (i2 > this.f22527) {
            m23291();
        }
        if (m23299() > this.f22526) {
            m23306(this.f22530 + 1, this.f22531, m23295(), m23298());
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public final boolean m23303(T t) {
        if (this.f22526 == 0) {
            return true;
        }
        m23293(t);
        int i = this.f22532 + 1;
        this.f22532 = i;
        if (i > this.f22526) {
            m23291();
        }
        this.f22531 = m23283() + ((long) this.f22532);
        return true;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public final long m23304(C7435 c7435) {
        long j = c7435.f2882;
        if (j < m23295()) {
            return j;
        }
        if (this.f22527 <= 0 && j <= m23283() && this.f22533 != 0) {
            return j;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public final Object m23305(C7435 c7435) {
        Object obj;
        InterfaceC4199<C8107>[] interfaceC4199ArrM23307 = C3016.f36;
        synchronized (this) {
            try {
                long jM23304 = m23304(c7435);
                if (jM23304 < 0) {
                    obj = C7434.f2881;
                } else {
                    long j = c7435.f2882;
                    Object objM23297 = m23297(jM23304);
                    c7435.f2882 = jM23304 + 1;
                    interfaceC4199ArrM23307 = m23307(j);
                    obj = objM23297;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC4199<C8107> interfaceC4199 : interfaceC4199ArrM23307) {
            if (interfaceC4199 != null) {
                C7148.C1189 c1189 = C7148.f21560;
                interfaceC4199.resumeWith(C7148.m3438(C8107.f3222));
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public final void m23306(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long jM23283 = m23283(); jM23283 < jMin; jM23283++) {
            Object[] objArr = this.f22529;
            C5499.m17100(objArr);
            C7434.m23314(objArr, jM23283, null);
        }
        this.f22530 = j;
        this.f22531 = j2;
        this.f22532 = (int) (j3 - jMin);
        this.f22533 = (int) (j4 - j3);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public final InterfaceC4199<C8107>[] m23307(long j) {
        long j2;
        long j3;
        long j4;
        AbstractC3017[] abstractC3017Arr;
        if (j > this.f22531) {
            return C3016.f36;
        }
        long jM23283 = m23283();
        long j5 = ((long) this.f22532) + jM23283;
        if (this.f22527 == 0 && this.f22533 > 0) {
            j5++;
        }
        if (this.f4379 != 0 && (abstractC3017Arr = this.f4378) != null) {
            for (AbstractC3017 abstractC3017 : abstractC3017Arr) {
                if (abstractC3017 != null) {
                    long j6 = ((C7435) abstractC3017).f2882;
                    if (j6 >= 0 && j6 < j5) {
                        j5 = j6;
                    }
                }
            }
        }
        if (j5 <= this.f22531) {
            return C3016.f36;
        }
        long jM23295 = m23295();
        int iMin = m5889() > 0 ? Math.min(this.f22533, this.f22527 - ((int) (jM23295 - j5))) : this.f22533;
        InterfaceC4199<C8107>[] interfaceC4199Arr = C3016.f36;
        long j7 = ((long) this.f22533) + jM23295;
        if (iMin > 0) {
            interfaceC4199Arr = new InterfaceC4199[iMin];
            Object[] objArr = this.f22529;
            C5499.m17100(objArr);
            long j8 = jM23295;
            int i = 0;
            while (true) {
                if (jM23295 >= j7) {
                    j2 = j5;
                    j3 = j7;
                    break;
                }
                Object objM23312 = C7434.m23312(objArr, jM23295);
                j2 = j5;
                C7694 c7694 = C7434.f2881;
                if (objM23312 == c7694) {
                    j3 = j7;
                    j4 = 1;
                } else {
                    if (objM23312 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    }
                    C1259 c1259 = (C1259) objM23312;
                    int i2 = i + 1;
                    j3 = j7;
                    interfaceC4199Arr[i] = c1259.f22537;
                    C7434.m23314(objArr, jM23295, c7694);
                    C7434.m23314(objArr, j8, c1259.f22536);
                    j4 = 1;
                    j8++;
                    if (i2 >= iMin) {
                        break;
                    }
                    i = i2;
                }
                jM23295 += j4;
                j5 = j2;
                j7 = j3;
            }
            jM23295 = j8;
        } else {
            j2 = j5;
            j3 = j7;
        }
        int i3 = (int) (jM23295 - jM23283);
        long j9 = m5889() == 0 ? jM23295 : j2;
        long jMax = Math.max(this.f22530, jM23295 - ((long) Math.min(this.f22526, i3)));
        if (this.f22527 == 0 && jMax < j3) {
            Object[] objArr2 = this.f22529;
            C5499.m17100(objArr2);
            if (C5499.m17094(C7434.m23312(objArr2, jMax), C7434.f2881)) {
                jM23295++;
                jMax++;
            }
        }
        m23306(jMax, j9, jM23295, j3);
        m23287();
        return (interfaceC4199Arr.length == 0) ^ true ? m23294(interfaceC4199Arr) : interfaceC4199Arr;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public final long m23308() {
        long j = this.f22530;
        if (j < this.f22531) {
            this.f22531 = j;
        }
        return j;
    }
}
