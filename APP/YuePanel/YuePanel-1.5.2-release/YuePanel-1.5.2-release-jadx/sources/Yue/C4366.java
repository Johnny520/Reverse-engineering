package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4366 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C4366 f839 = new C4366();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۟ۨۨ۠$ۥ */
    @InterfaceC7507({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$observable$1\n*L\n1#1,73:1\n*E\n"})
    public static final class C0389<T> extends AbstractC6500<T> {

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ InterfaceC5140<InterfaceC5604<?>, T, T, C8107> f840;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۢۤ<? super Yue.ۥ۠ۦۤ۟<?>, ? super T, ? super T, Yue.ۥۣۢ۠ۤ> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0389(T t, InterfaceC5140<? super InterfaceC5604<?>, ? super T, ? super T, C8107> interfaceC5140) {
            super(t);
            this.f840 = interfaceC5140;
        }

        @Override // Yue.AbstractC6500
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void mo12623(@InterfaceC6399 InterfaceC5604<?> interfaceC5604, T t, T t2) {
            C5499.m17103(interfaceC5604, "property");
            this.f840.mo15350(interfaceC5604, t, t2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۟ۨۨ۠$ۥ۟ */
    @InterfaceC7507({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$vetoable$1\n*L\n1#1,73:1\n*E\n"})
    public static final class C0390<T> extends AbstractC6500<T> {

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ InterfaceC5140<InterfaceC5604<?>, T, T, Boolean> f841;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۢۤ<? super Yue.ۥ۠ۦۤ۟<?>, ? super T, ? super T, java.lang.Boolean> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0390(T t, InterfaceC5140<? super InterfaceC5604<?>, ? super T, ? super T, Boolean> interfaceC5140) {
            super(t);
            this.f841 = interfaceC5140;
        }

        @Override // Yue.AbstractC6500
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean mo12624(@InterfaceC6399 InterfaceC5604<?> interfaceC5604, T t, T t2) {
            C5499.m17103(interfaceC5604, "property");
            return this.f841.mo15350(interfaceC5604, t, t2).booleanValue();
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public final <T> InterfaceC7016<Object, T> m1324() {
        return new C6400();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public final <T> InterfaceC7016<Object, T> m1325(T t, @InterfaceC6399 InterfaceC5140<? super InterfaceC5604<?>, ? super T, ? super T, C8107> interfaceC5140) {
        C5499.m17103(interfaceC5140, "onChange");
        return new C0389(t, interfaceC5140);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final <T> InterfaceC7016<Object, T> m12622(T t, @InterfaceC6399 InterfaceC5140<? super InterfaceC5604<?>, ? super T, ? super T, Boolean> interfaceC5140) {
        C5499.m17103(interfaceC5140, "onChange");
        return new C0390(t, interfaceC5140);
    }
}
