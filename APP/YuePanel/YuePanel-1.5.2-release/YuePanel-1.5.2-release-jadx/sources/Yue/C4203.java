package Yue;

import Yue.C7148;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۤۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4203 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۟ۧۤۦ$ۥ */
    @InterfaceC7507({"SMAP\nContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Continuation.kt\nkotlin/coroutines/ContinuationKt$Continuation$1\n*L\n1#1,161:1\n*E\n"})
    public static final class C0350<T> implements InterfaceC4199<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC4225 f8521;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5124<C7148<? extends T>, C8107> f8522;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۡ۟<? super Yue.ۥۡۦۧۤ<? extends T>, Yue.ۥۣۢ۠ۤ> */
        /* JADX WARN: Multi-variable type inference failed */
        public C0350(InterfaceC4225 interfaceC4225, InterfaceC5124<? super C7148<? extends T>, C8107> interfaceC5124) {
            this.f8521 = interfaceC4225;
            this.f8522 = interfaceC5124;
        }

        @Override // Yue.InterfaceC4199
        @InterfaceC6399
        public InterfaceC4225 getContext() {
            return this.f8521;
        }

        @Override // Yue.InterfaceC4199
        public void resumeWith(@InterfaceC6399 Object obj) {
            this.f8522.invoke(C7148.m3437(obj));
        }
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ */
    public static final <T> InterfaceC4199<T> m1163(InterfaceC4225 interfaceC4225, InterfaceC5124<? super C7148<? extends T>, C8107> interfaceC5124) {
        C5499.m17103(interfaceC4225, "context");
        C5499.m17103(interfaceC5124, "resumeWith");
        return new C0350(interfaceC4225, interfaceC5124);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟ */
    public static final <T> InterfaceC4199<C8107> m1164(@InterfaceC6399 InterfaceC5124<? super InterfaceC4199<? super T>, ? extends Object> interfaceC5124, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        C5499.m17103(interfaceC5124, "<this>");
        C5499.m17103(interfaceC4199, "completion");
        return new C7207(C5501.m17135(C5501.m2258(interfaceC5124, interfaceC4199)), C5508.m17142());
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <R, T> InterfaceC4199<C8107> m12095(@InterfaceC6399 InterfaceC5138<? super R, ? super InterfaceC4199<? super T>, ? extends Object> interfaceC5138, R r, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        C5499.m17103(interfaceC5138, "<this>");
        C5499.m17103(interfaceC4199, "completion");
        return new C7207(C5501.m17135(C5501.m17133(interfaceC5138, r, interfaceC4199)), C5508.m17142());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final InterfaceC4225 m12096() {
        throw new C6398("Implemented as intrinsic");
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m12097() {
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <T> void m12098(InterfaceC4199<? super T> interfaceC4199, T t) {
        C5499.m17103(interfaceC4199, "<this>");
        C7148.C1189 c1189 = C7148.f21560;
        interfaceC4199.resumeWith(C7148.m3438(t));
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <T> void m12099(InterfaceC4199<? super T> interfaceC4199, Throwable th) {
        C5499.m17103(interfaceC4199, "<this>");
        C5499.m17103(th, "exception");
        C7148.C1189 c1189 = C7148.f21560;
        interfaceC4199.resumeWith(C7148.m3438(C7149.m3441(th)));
    }

    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final <T> void m12100(@InterfaceC6399 InterfaceC5124<? super InterfaceC4199<? super T>, ? extends Object> interfaceC5124, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        C5499.m17103(interfaceC5124, "<this>");
        C5499.m17103(interfaceC4199, "completion");
        InterfaceC4199 interfaceC4199M17135 = C5501.m17135(C5501.m2258(interfaceC5124, interfaceC4199));
        C7148.C1189 c1189 = C7148.f21560;
        interfaceC4199M17135.resumeWith(C7148.m3438(C8107.f3222));
    }

    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final <R, T> void m12101(@InterfaceC6399 InterfaceC5138<? super R, ? super InterfaceC4199<? super T>, ? extends Object> interfaceC5138, R r, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        C5499.m17103(interfaceC5138, "<this>");
        C5499.m17103(interfaceC4199, "completion");
        InterfaceC4199 interfaceC4199M17135 = C5501.m17135(C5501.m17133(interfaceC5138, r, interfaceC4199));
        C7148.C1189 c1189 = C7148.f21560;
        interfaceC4199M17135.resumeWith(C7148.m3438(C8107.f3222));
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final <T> Object m12102(InterfaceC5124<? super InterfaceC4199<? super T>, C8107> interfaceC5124, InterfaceC4199<? super T> interfaceC4199) throws Throwable {
        C5437.m16931(0);
        C7207 c7207 = new C7207(C5501.m17135(interfaceC4199));
        interfaceC5124.invoke(c7207);
        Object objM3500 = c7207.m3500();
        if (objM3500 == C5508.m17142()) {
            C4324.m12513(interfaceC4199);
        }
        C5437.m16931(1);
        return objM3500;
    }
}
