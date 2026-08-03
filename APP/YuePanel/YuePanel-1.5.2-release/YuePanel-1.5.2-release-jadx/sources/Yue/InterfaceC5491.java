package Yue;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۦۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5491 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C0777 f1541 = C0777.f1542;

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۦۤ$ۥ */
    public interface InterfaceC0776 {
        @InterfaceC6399
        InterfaceC3645 call();

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        InterfaceC0776 mo2247(int i, @InterfaceC6399 TimeUnit timeUnit);

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟ */
        C7101 mo2248();

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        int mo17077();

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        int mo17078();

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        InterfaceC0776 mo17079(int i, @InterfaceC6399 TimeUnit timeUnit);

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        InterfaceC4107 mo17080();

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        InterfaceC0776 mo17081(int i, @InterfaceC6399 TimeUnit timeUnit);

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        int mo17082();

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        C7141 mo17083(@InterfaceC6399 C7101 c7101) throws IOException;
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۦۤ$ۥ۟ */
    public static final class C0777 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ C0777 f1542 = new C0777();

        /* JADX INFO: renamed from: Yue.ۥ۠ۥۦۤ$ۥ۟$ۥ, reason: contains not printable characters */
        @InterfaceC7507({"SMAP\nInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Interceptor.kt\nokhttp3/Interceptor$Companion$invoke$1\n*L\n1#1,105:1\n*E\n"})
        public static final class C5492 implements InterfaceC5491 {

            /* JADX INFO: renamed from: ۥ۟ */
            public final /* synthetic */ InterfaceC5124<InterfaceC0776, C7141> f1543;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۡ۟<? super Yue.ۥ۠ۥۦۤ$ۥ, Yue.ۥۡۦۧ> */
            /* JADX WARN: Multi-variable type inference failed */
            public C5492(InterfaceC5124<? super InterfaceC0776, C7141> interfaceC5124) {
                this.f1543 = interfaceC5124;
            }

            @Override // Yue.InterfaceC5491
            @InterfaceC6399
            /* JADX INFO: renamed from: ۥ */
            public final C7141 mo638(@InterfaceC6399 InterfaceC0776 interfaceC0776) {
                C5499.m17103(interfaceC0776, "it");
                return this.f1543.invoke(interfaceC0776);
            }
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final InterfaceC5491 m2249(@InterfaceC6399 InterfaceC5124<? super InterfaceC0776, C7141> interfaceC5124) {
            C5499.m17103(interfaceC5124, "block");
            return new C5492(interfaceC5124);
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    C7141 mo638(@InterfaceC6399 InterfaceC0776 interfaceC0776) throws IOException;
}
