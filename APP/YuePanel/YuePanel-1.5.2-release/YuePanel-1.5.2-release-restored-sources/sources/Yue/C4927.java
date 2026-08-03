package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4927 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final InterfaceC5124<Object, Object> f1217 = C0554.f11452;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public static final InterfaceC5138<Object, Object, Boolean> f1218 = C0553.f11451;

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۤ$ۥ */
    public static final class C0553 extends AbstractC5673 implements InterfaceC5138<Object, Object, Boolean> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C0553 f11451 = new C0553();

        public C0553() {
            super(2);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Boolean invoke(@InterfaceC6489 Object obj, @InterfaceC6489 Object obj2) {
            return Boolean.valueOf(C5499.m17094(obj, obj2));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۤ$ۥ۟ */
    public static final class C0554 extends AbstractC5673 implements InterfaceC5124<Object, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C0554 f11452 = new C0554();

        public C0554() {
            super(1);
        }

        @Override // Yue.InterfaceC5124
        @InterfaceC6489
        public final Object invoke(@InterfaceC6489 Object obj) {
            return obj;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۢۡ<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final <T> InterfaceC4890<T> m1823(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890) {
        return interfaceC4890 instanceof InterfaceC7588 ? interfaceC4890 : m15361(interfaceC4890, f1217, f1218);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public static final <T> InterfaceC4890<T> m1824(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC5138<? super T, ? super T, Boolean> interfaceC5138) {
        return m15361(interfaceC4890, f1217, (InterfaceC5138) C8012.m25265(interfaceC5138, 2));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <T, K> InterfaceC4890<T> m15360(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC5124<? super T, ? extends K> interfaceC5124) {
        return m15361(interfaceC4890, interfaceC5124, f1218);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۢۡ<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15361(InterfaceC4890<? extends T> interfaceC4890, InterfaceC5124<? super T, ? extends Object> interfaceC5124, InterfaceC5138<Object, Object, Boolean> interfaceC5138) {
        if (interfaceC4890 instanceof C4436) {
            C4436 c4436 = (C4436) interfaceC4890;
            if (c4436.f9165 == interfaceC5124 && c4436.f9166 == interfaceC5138) {
                return interfaceC4890;
            }
        }
        return new C4436(interfaceC4890, interfaceC5124, interfaceC5138);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m15362() {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ void m15363() {
    }
}
