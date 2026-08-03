package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3718 {
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public static final <T> AbstractC3716<T> m800(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890) {
        AbstractC3716<T> abstractC3716 = interfaceC4890 instanceof AbstractC3716 ? (AbstractC3716) interfaceC4890 : null;
        if (abstractC3716 == null) {
            return new C3723(interfaceC4890, null, 0, null, 14, null);
        }
        return abstractC3716;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <T, V> Object m10183(@InterfaceC6399 InterfaceC4225 interfaceC4225, V v, @InterfaceC6399 Object obj, @InterfaceC6399 InterfaceC5138<? super V, ? super InterfaceC4199<? super T>, ? extends Object> interfaceC5138, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        Object objM24718 = C7776.m24718(interfaceC4225, obj);
        try {
            Object objInvoke = ((InterfaceC5138) C8012.m25265(interfaceC5138, 2)).invoke(v, new C7563(interfaceC4199, interfaceC4225));
            C7776.m3874(interfaceC4225, objM24718);
            if (objInvoke == C5508.m17142()) {
                C4324.m12513(interfaceC4199);
            }
            return objInvoke;
        } catch (Throwable th) {
            C7776.m3874(interfaceC4225, objM24718);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ Object m10184(InterfaceC4225 interfaceC4225, Object obj, Object obj2, InterfaceC5138 interfaceC5138, InterfaceC4199 interfaceC4199, int i, Object obj3) {
        if ((i & 4) != 0) {
            obj2 = C7776.m3875(interfaceC4225);
        }
        return m10183(interfaceC4225, obj, obj2, interfaceC5138, interfaceC4199);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣۣ۠ۢ<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T> InterfaceC4892<T> m10185(InterfaceC4892<? super T> interfaceC4892, InterfaceC4225 interfaceC4225) {
        return interfaceC4892 instanceof C7324 ? true : interfaceC4892 instanceof C6395 ? interfaceC4892 : new C8101(interfaceC4892, interfaceC4225);
    }
}
