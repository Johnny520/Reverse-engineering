package Yue;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5722 {

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۢ۠$ۥ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.LintKt$retry$1", m1273f = "Lint.kt", m1274i = {}, m1275l = {}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
    public static final class C0849 extends AbstractC7690 implements InterfaceC5138<Throwable, InterfaceC4199<? super Boolean>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f14135;

        public C0849(InterfaceC4199<? super C0849> interfaceC4199) {
            super(2, interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            return new C0849(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            C5508.m17142();
            if (this.f14135 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7149.m22422(obj);
            return C3590.m636(true);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(@InterfaceC6399 Throwable th, @InterfaceC6489 InterfaceC4199<? super Boolean> interfaceC4199) {
            return ((C0849) create(th, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "cancel() is resolved into the extension of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext().cancel() instead or specify the receiver of cancel() explicitly", replaceWith = @InterfaceC7097(expression = "currentCoroutineContext().cancel(cause)", imports = {}))
    /* JADX INFO: renamed from: ۥ */
    public static final void m2403(@InterfaceC6399 InterfaceC4892<?> interfaceC4892, @InterfaceC6489 CancellationException cancellationException) {
        C4896.m15250();
        throw new C5667();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static /* synthetic */ void m2404(InterfaceC4892 interfaceC4892, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        m2403(interfaceC4892, cancellationException);
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "Applying 'cancellable' to a SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @InterfaceC7097(expression = "this", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m17684(@InterfaceC6399 InterfaceC7431<? extends T> interfaceC7431) {
        C4896.m15250();
        throw new C5667();
    }

    @InterfaceC5438
    @InterfaceC4372(level = EnumC0393.f8970, message = "SharedFlow never completes, so this operator typically has not effect, it can only catch exceptions from 'onSubscribe' operator", replaceWith = @InterfaceC7097(expression = "this", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m17685(InterfaceC7431<? extends T> interfaceC7431, InterfaceC5140<? super InterfaceC4892<? super T>, ? super Throwable, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5140) {
        return C4896.m15165(interfaceC7431, interfaceC5140);
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "Applying 'conflate' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @InterfaceC7097(expression = "this", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m17686(@InterfaceC6399 InterfaceC7588<? extends T> interfaceC7588) {
        C4896.m15250();
        throw new C5667();
    }

    @InterfaceC5438
    @InterfaceC4372(level = EnumC0393.f8970, message = "SharedFlow never completes, so this terminal operation never completes.")
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <T> Object m17687(InterfaceC7431<? extends T> interfaceC7431, InterfaceC4199<? super Integer> interfaceC4199) {
        C5437.m16931(0);
        Object objM15195 = C4896.m15195(interfaceC7431, interfaceC4199);
        C5437.m16931(1);
        return objM15195;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "Applying 'distinctUntilChanged' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @InterfaceC7097(expression = "this", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m17688(@InterfaceC6399 InterfaceC7588<? extends T> interfaceC7588) {
        C4896.m15250();
        throw new C5667();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "Applying 'flowOn' to SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @InterfaceC7097(expression = "this", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m17689(@InterfaceC6399 InterfaceC7431<? extends T> interfaceC7431, @InterfaceC6399 InterfaceC4225 interfaceC4225) {
        C4896.m15250();
        throw new C5667();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final InterfaceC4225 m17690(@InterfaceC6399 InterfaceC4892<?> interfaceC4892) {
        C4896.m15250();
        throw new C5667();
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "coroutineContext is resolved into the property of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext() instead or specify the receiver of coroutineContext explicitly", replaceWith = @InterfaceC7097(expression = "currentCoroutineContext()", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static /* synthetic */ void m17691(InterfaceC4892 interfaceC4892) {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final boolean m17692(@InterfaceC6399 InterfaceC4892<?> interfaceC4892) {
        C4896.m15250();
        throw new C5667();
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "isActive is resolved into the extension of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext().isActive or cancellable() operator instead or specify the receiver of isActive explicitly. Additionally, flow {} builder emissions are cancellable by default.", replaceWith = @InterfaceC7097(expression = "currentCoroutineContext().isActive", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static /* synthetic */ void m17693(InterfaceC4892 interfaceC4892) {
    }

    @InterfaceC5438
    @InterfaceC4372(level = EnumC0393.f8970, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @InterfaceC7097(expression = "this", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m17694(InterfaceC7431<? extends T> interfaceC7431, long j, InterfaceC5138<? super Throwable, ? super InterfaceC4199<? super Boolean>, ? extends Object> interfaceC5138) {
        return C4896.m15270(interfaceC7431, j, interfaceC5138);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC4890 m17695(InterfaceC7431 interfaceC7431, long j, InterfaceC5138 interfaceC5138, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Long.MAX_VALUE;
        }
        if ((i & 2) != 0) {
            interfaceC5138 = new C0849(null);
        }
        return C4896.m15270(interfaceC7431, j, interfaceC5138);
    }

    @InterfaceC5438
    @InterfaceC4372(level = EnumC0393.f8970, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @InterfaceC7097(expression = "this", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m17696(InterfaceC7431<? extends T> interfaceC7431, InterfaceC5141<? super InterfaceC4892<? super T>, ? super Throwable, ? super Long, ? super InterfaceC4199<? super Boolean>, ? extends Object> interfaceC5141) {
        return C4896.m15272(interfaceC7431, interfaceC5141);
    }

    @InterfaceC5438
    @InterfaceC4372(level = EnumC0393.f8970, message = "SharedFlow never completes, so this terminal operation never completes.")
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final <T> Object m17697(InterfaceC7431<? extends T> interfaceC7431, InterfaceC4199<? super List<? extends T>> interfaceC4199) {
        C5437.m16931(0);
        Object objM15332 = C4914.m15332(interfaceC7431, null, interfaceC4199, 1, null);
        C5437.m16931(1);
        return objM15332;
    }

    @InterfaceC5438
    @InterfaceC4372(level = EnumC0393.f8970, message = "SharedFlow never completes, so this terminal operation never completes.")
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final <T> Object m17698(InterfaceC7431<? extends T> interfaceC7431, InterfaceC4199<? super Set<? extends T>> interfaceC4199) {
        C5437.m16931(0);
        Object objM15334 = C4914.m15334(interfaceC7431, null, interfaceC4199, 1, null);
        C5437.m16931(1);
        return objM15334;
    }
}
