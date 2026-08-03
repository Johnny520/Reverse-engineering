package Yue;

import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7668<T> implements InterfaceC7431<T> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC7431<T> f23073;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC5138<InterfaceC4892<? super T>, InterfaceC4199<? super C8107>, Object> f23074;

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۤ$ۥ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.SubscribedSharedFlow", m1273f = "Share.kt", m1274i = {}, m1275l = {409}, m1276m = "collect", m1277n = {}, m1278s = {})
    public static final class C1320 extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public /* synthetic */ Object f23075;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ C7668<T> f23076;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f23077;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1320(C7668<T> c7668, InterfaceC4199<? super C1320> interfaceC4199) {
            super(interfaceC4199);
            this.f23076 = c7668;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f23075 = obj;
            this.f23077 |= Integer.MIN_VALUE;
            return this.f23076.mo48(null, this);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۡۨۨ۠<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۢۢ<? super Yue.ۥۣۣ۠ۢ<? super T>, ? super Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ>, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    public C7668(@InterfaceC6399 InterfaceC7431<? extends T> interfaceC7431, @InterfaceC6399 InterfaceC5138<? super InterfaceC4892<? super T>, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5138) {
        this.f23073 = interfaceC7431;
        this.f23074 = interfaceC5138;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Yue.InterfaceC7431, Yue.InterfaceC4890
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo48(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
        C1320 c1320;
        if (interfaceC4199 instanceof C1320) {
            c1320 = (C1320) interfaceC4199;
            int i = c1320.f23077;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1320.f23077 = i - Integer.MIN_VALUE;
            } else {
                c1320 = new C1320(this, interfaceC4199);
            }
        }
        Object obj = c1320.f23075;
        Object objM17142 = C5508.m17142();
        int i2 = c1320.f23077;
        if (i2 == 0) {
            C7149.m22422(obj);
            InterfaceC7431<T> interfaceC7431 = this.f23073;
            C7667 c7667 = new C7667(interfaceC4892, this.f23074);
            c1320.f23077 = 1;
            if (interfaceC7431.mo48(c7667, c1320) == objM17142) {
                return objM17142;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7149.m22422(obj);
        }
        throw new C5667();
    }

    @Override // Yue.InterfaceC7431
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public List<T> mo3317() {
        return this.f23073.mo3317();
    }
}
