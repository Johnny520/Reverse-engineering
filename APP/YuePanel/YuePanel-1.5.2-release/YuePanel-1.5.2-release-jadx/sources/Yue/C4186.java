package Yue;

import Yue.C7148;
import android.content.Context;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7507({"SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,94:1\n314#2,11:95\n*S KotlinDebug\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt\n*L\n81#1:95,11\n*E\n"})
public final class C4186 {

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۧ$ۥ */
    @InterfaceC7507({"SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$1\n*L\n1#1,94:1\n*E\n"})
    public static final class C0344 extends AbstractC5673 implements InterfaceC5124<Throwable, C8107> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC4184 f8507;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ C0345 f8508;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0344(InterfaceC4184 interfaceC4184, C0345 c0345) {
            super(1);
            this.f8507 = interfaceC4184;
            this.f8508 = c0345;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5124
        public /* bridge */ /* synthetic */ C8107 invoke(Throwable th) {
            m12055(th);
            return C8107.f3222;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m12055(@InterfaceC6489 Throwable th) {
            this.f8507.removeOnContextAvailableListener(this.f8508);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۧ$ۥ۟ */
    @InterfaceC7507({"SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$listener$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1#2:95\n*E\n"})
    public static final class C0345 implements InterfaceC6551 {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ InterfaceC3665<R> f728;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ InterfaceC5124<Context, R> f729;

        public C0345(InterfaceC3665<R> interfaceC3665, InterfaceC5124<Context, R> interfaceC5124) {
            this.f728 = interfaceC3665;
            this.f729 = interfaceC5124;
        }

        @Override // Yue.InterfaceC6551
        /* JADX INFO: renamed from: ۥ */
        public void mo1013(@InterfaceC6399 Context context) {
            Object objM3438;
            C5499.m17103(context, "context");
            InterfaceC4199 interfaceC4199 = this.f728;
            InterfaceC5124<Context, R> interfaceC5124 = this.f729;
            try {
                C7148.C1189 c1189 = C7148.f21560;
                objM3438 = C7148.m3438(interfaceC5124.invoke(context));
            } catch (Throwable th) {
                C7148.C1189 c11892 = C7148.f21560;
                objM3438 = C7148.m3438(C7149.m3441(th));
            }
            interfaceC4199.resumeWith(objM3438);
        }
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public static final <R> Object m1141(@InterfaceC6399 InterfaceC4184 interfaceC4184, @InterfaceC6399 InterfaceC5124<Context, R> interfaceC5124, @InterfaceC6399 InterfaceC4199<R> interfaceC4199) {
        Context contextPeekAvailableContext = interfaceC4184.peekAvailableContext();
        if (contextPeekAvailableContext != null) {
            return interfaceC5124.invoke(contextPeekAvailableContext);
        }
        C3666 c3666 = new C3666(C5501.m17135(interfaceC4199), 1);
        c3666.mo10020();
        C0345 c0345 = new C0345(c3666, interfaceC5124);
        interfaceC4184.addOnContextAvailableListener(c0345);
        c3666.mo10021(new C0344(interfaceC4184, c0345));
        Object objM10039 = c3666.m10039();
        if (objM10039 == C5508.m17142()) {
            C4324.m12513(interfaceC4199);
        }
        return objM10039;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final <R> Object m1142(InterfaceC4184 interfaceC4184, InterfaceC5124<Context, R> interfaceC5124, InterfaceC4199<R> interfaceC4199) {
        Context contextPeekAvailableContext = interfaceC4184.peekAvailableContext();
        if (contextPeekAvailableContext != null) {
            return interfaceC5124.invoke(contextPeekAvailableContext);
        }
        C5437.m16931(0);
        C3666 c3666 = new C3666(C5501.m17135(interfaceC4199), 1);
        c3666.mo10020();
        C0345 c0345 = new C0345(c3666, interfaceC5124);
        interfaceC4184.addOnContextAvailableListener(c0345);
        c3666.mo10021(new C0344(interfaceC4184, c0345));
        C8107 c8107 = C8107.f3222;
        Object objM10039 = c3666.m10039();
        if (objM10039 == C5508.m17142()) {
            C4324.m12513(interfaceC4199);
        }
        C5437.m16931(1);
        return objM10039;
    }
}
