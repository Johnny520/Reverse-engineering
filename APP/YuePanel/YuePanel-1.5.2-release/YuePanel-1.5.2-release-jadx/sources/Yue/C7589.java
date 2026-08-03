package Yue;

import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۢ۠۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7589<T> extends AbstractC3015<C7591> implements InterfaceC6309<T>, InterfaceC3669<T>, InterfaceC5154<T> {

    @InterfaceC6399
    private volatile /* synthetic */ Object _state;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int f22949;

    /* JADX INFO: renamed from: Yue.ۥۢ۠۟ۢ$ۥ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.StateFlowImpl", m1273f = "StateFlow.kt", m1274i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, m1275l = {386, 398, 403}, m1276m = "collect", m1277n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "newState", "this", "collector", "slot", "collectorJob", "oldState"}, m1278s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    public static final class C1302 extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f22950;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f22951;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Object f22952;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public Object f22953;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public Object f22954;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public /* synthetic */ Object f22955;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ C7589<T> f22956;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public int f22957;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1302(C7589<T> c7589, InterfaceC4199<? super C1302> interfaceC4199) {
            super(interfaceC4199);
            this.f22956 = c7589;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f22955 = obj;
            this.f22957 |= Integer.MIN_VALUE;
            return this.f22956.mo48(null, this);
        }
    }

    public C7589(@InterfaceC6399 Object obj) {
        this._state = obj;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static /* synthetic */ void m23750() {
    }

    @Override // Yue.InterfaceC6309, Yue.InterfaceC7588
    public T getValue() {
        C7694 c7694 = C6488.f2113;
        T t = (T) this._state;
        if (t == c7694) {
            return null;
        }
        return t;
    }

    @Override // Yue.InterfaceC6309
    public void setValue(T t) {
        if (t == null) {
            t = (T) C6488.f2113;
        }
        m23753(null, t);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:16:0x0043 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:57:0x0024 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:40:0x00b4, B:42:0x00ba], limit reached: 57 */
    /* JADX WARN: Path cross not found for [B:42:0x00ba, B:40:0x00b4], limit reached: 57 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ab, B:38:0x00af, B:40:0x00b4, B:50:0x00d5, B:52:0x00db, B:42:0x00ba, B:46:0x00c1, B:21:0x0060, B:24:0x0073, B:35:0x009c), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ab, B:38:0x00af, B:40:0x00b4, B:50:0x00d5, B:52:0x00db, B:42:0x00ba, B:46:0x00c1, B:21:0x0060, B:24:0x0073, B:35:0x009c), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00db A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ab, B:38:0x00af, B:40:0x00b4, B:50:0x00d5, B:52:0x00db, B:42:0x00ba, B:46:0x00c1, B:21:0x0060, B:24:0x0073, B:35:0x009c), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [Yue.ۥ۟۟ۢۦ] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6, types: [Yue.ۥۢ۠۟ۤ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [Yue.ۥۣۣ۠ۢ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00d9 -> B:36:0x00ab). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00eb -> B:36:0x00ab). Please report as a decompilation issue!!! */
    @Override // Yue.InterfaceC7431, Yue.InterfaceC4890
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo48(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) throws Throwable {
        C1302 c1302;
        C7589<T> c7589;
        C7591 c7591;
        ?? r7;
        InterfaceC5542 interfaceC5542;
        Object obj;
        ?? r72;
        ?? r6;
        boolean zM23765;
        Object obj2;
        if (interfaceC4199 instanceof C1302) {
            c1302 = (C1302) interfaceC4199;
            int i = c1302.f22957;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1302.f22957 = i - Integer.MIN_VALUE;
            } else {
                c1302 = new C1302(this, interfaceC4199);
            }
        }
        Object obj3 = c1302.f22955;
        Object objM17142 = C5508.m17142();
        int i2 = c1302.f22957;
        ?? r62 = 1;
        try {
            if (i2 == 0) {
                C7149.m22422(obj3);
                C7591 c7591M5884 = m5884();
                try {
                    if (interfaceC4892 instanceof C7667) {
                        c1302.f22950 = this;
                        c1302.f22951 = interfaceC4892;
                        c1302.f22952 = c7591M5884;
                        c1302.f22957 = 1;
                        if (((C7667) interfaceC4892).m3774(c1302) == objM17142) {
                            return objM17142;
                        }
                    }
                    c7589 = this;
                    c7591 = c7591M5884;
                } catch (Throwable th) {
                    th = th;
                    c7589 = this;
                    r62 = c7591M5884;
                    c7589.m5888(r62);
                    throw th;
                }
            } else if (i2 == 1) {
                C7591 c75912 = (C7591) c1302.f22952;
                interfaceC4892 = (InterfaceC4892) c1302.f22951;
                c7589 = (C7589) c1302.f22950;
                C7149.m22422(obj3);
                c7591 = c75912;
            } else if (i2 == 2) {
                obj = c1302.f22954;
                interfaceC5542 = (InterfaceC5542) c1302.f22953;
                C7591 c75913 = (C7591) c1302.f22952;
                InterfaceC4892 interfaceC48922 = (InterfaceC4892) c1302.f22951;
                c7589 = (C7589) c1302.f22950;
                C7149.m22422(obj3);
                r6 = c75913;
                r72 = interfaceC48922;
                zM23765 = r6.m23765();
                r62 = r6;
                r7 = r72;
                if (!zM23765) {
                }
                Object obj4 = c7589._state;
                if (interfaceC5542 != null) {
                }
                if (obj != null) {
                }
                if (obj4 != C6488.f2113) {
                }
                c1302.f22950 = c7589;
                c1302.f22951 = r7;
                c1302.f22952 = r62;
                c1302.f22953 = interfaceC5542;
                c1302.f22954 = obj4;
                c1302.f22957 = 2;
                if (r7.mo10059(obj2, c1302) != objM17142) {
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = c1302.f22954;
                interfaceC5542 = (InterfaceC5542) c1302.f22953;
                C7591 c75914 = (C7591) c1302.f22952;
                InterfaceC4892 interfaceC48923 = (InterfaceC4892) c1302.f22951;
                c7589 = (C7589) c1302.f22950;
                C7149.m22422(obj3);
                r62 = c75914;
                r7 = interfaceC48923;
                Object obj42 = c7589._state;
                if (interfaceC5542 != null) {
                    C5553.m17212(interfaceC5542);
                }
                if (obj != null) {
                    r6 = r62;
                    r72 = r7;
                    if (!C5499.m17094(obj, obj42)) {
                    }
                    zM23765 = r6.m23765();
                    r62 = r6;
                    r7 = r72;
                    if (!zM23765) {
                        c1302.f22950 = c7589;
                        c1302.f22951 = r72;
                        c1302.f22952 = r6;
                        c1302.f22953 = interfaceC5542;
                        c1302.f22954 = obj;
                        c1302.f22957 = 3;
                        Object objM23762 = r6.m23762(c1302);
                        r62 = r6;
                        r7 = r72;
                        if (objM23762 == objM17142) {
                            return objM17142;
                        }
                    }
                    Object obj422 = c7589._state;
                    if (interfaceC5542 != null) {
                    }
                    if (obj != null) {
                    }
                }
                obj2 = obj422 != C6488.f2113 ? null : obj422;
                c1302.f22950 = c7589;
                c1302.f22951 = r7;
                c1302.f22952 = r62;
                c1302.f22953 = interfaceC5542;
                c1302.f22954 = obj422;
                c1302.f22957 = 2;
                if (r7.mo10059(obj2, c1302) != objM17142) {
                    return objM17142;
                }
                obj = obj422;
                r6 = r62;
                r72 = r7;
                zM23765 = r6.m23765();
                r62 = r6;
                r7 = r72;
                if (!zM23765) {
                }
                Object obj4222 = c7589._state;
                if (interfaceC5542 != null) {
                }
                if (obj != null) {
                }
                if (obj4222 != C6488.f2113) {
                }
                c1302.f22950 = c7589;
                c1302.f22951 = r7;
                c1302.f22952 = r62;
                c1302.f22953 = interfaceC5542;
                c1302.f22954 = obj4222;
                c1302.f22957 = 2;
                if (r7.mo10059(obj2, c1302) != objM17142) {
                }
            }
            r7 = interfaceC4892;
            interfaceC5542 = (InterfaceC5542) c1302.getContext().get(InterfaceC5542.f13507);
            obj = null;
            r62 = c7591;
            Object obj42222 = c7589._state;
            if (interfaceC5542 != null) {
            }
            if (obj != null) {
            }
            if (obj42222 != C6488.f2113) {
            }
            c1302.f22950 = c7589;
            c1302.f22951 = r7;
            c1302.f22952 = r62;
            c1302.f22953 = interfaceC5542;
            c1302.f22954 = obj42222;
            c1302.f22957 = 2;
            if (r7.mo10059(obj2, c1302) != objM17142) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // Yue.InterfaceC7431
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public List<T> mo3317() {
        return C3879.m10715(getValue());
    }

    @Override // Yue.InterfaceC5154
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ */
    public InterfaceC4890<T> mo10178(@InterfaceC6399 InterfaceC4225 interfaceC4225, int i, @InterfaceC6399 EnumC3602 enumC3602) {
        return C7590.m23755(this, interfaceC4225, i, enumC3602);
    }

    @Override // Yue.InterfaceC6308, Yue.InterfaceC4892
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public Object mo10059(T t, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        setValue(t);
        return C8107.f3222;
    }

    @Override // Yue.InterfaceC6309
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public boolean mo19614(T t, T t2) {
        if (t == null) {
            t = (T) C6488.f2113;
        }
        if (t2 == null) {
            t2 = (T) C6488.f2113;
        }
        return m23753(t, t2);
    }

    @Override // Yue.InterfaceC6308
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo19611() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۟ۢ()LYue/ۥ۟۟ۢۦ; */
    @Override // Yue.AbstractC3015
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C7591 mo5885() {
        return new C7591();
    }

    /* JADX DEBUG: Method merged with bridge method: ۥۣ۟۟۟(I)[LYue/ۥ۟۟ۢۦ; */
    @Override // Yue.AbstractC3015
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C7591[] mo5886(int i) {
        return new C7591[i];
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean m23753(Object obj, Object obj2) {
        int i;
        C7591[] c7591ArrM5890;
        m5890();
        synchronized (this) {
            Object obj3 = this._state;
            if (obj != null && !C5499.m17094(obj3, obj)) {
                return false;
            }
            if (C5499.m17094(obj3, obj2)) {
                return true;
            }
            this._state = obj2;
            int i2 = this.f22949;
            if ((i2 & 1) != 0) {
                this.f22949 = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.f22949 = i3;
            C7591[] c7591ArrM58902 = m5890();
            C8107 c8107 = C8107.f3222;
            while (true) {
                C7591[] c7591Arr = c7591ArrM58902;
                if (c7591Arr != null) {
                    for (C7591 c7591 : c7591Arr) {
                        if (c7591 != null) {
                            c7591.m23764();
                        }
                    }
                }
                synchronized (this) {
                    i = this.f22949;
                    if (i == i3) {
                        this.f22949 = i3 + 1;
                        return true;
                    }
                    c7591ArrM5890 = m5890();
                    C8107 c81072 = C8107.f3222;
                }
                c7591ArrM58902 = c7591ArrM5890;
                i3 = i;
            }
        }
    }

    @Override // Yue.InterfaceC6308
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    public boolean mo19612(T t) {
        setValue(t);
        return true;
    }
}
