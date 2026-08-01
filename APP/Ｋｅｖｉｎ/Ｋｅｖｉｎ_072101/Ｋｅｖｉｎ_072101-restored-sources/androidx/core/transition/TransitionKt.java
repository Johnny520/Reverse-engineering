package androidx.core.transition;

/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u001aÆ\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00022#\b\u0006\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0087\b\u001a2\u0010\r\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0087\b\u001a2\u0010\u000f\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0087\b\u001a2\u0010\u0010\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0087\b\u001a2\u0010\u0011\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0087\b\u001a2\u0010\u0012\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0087\b¨\u0006\u0013"}, m115d2 = {"addListener", "Landroid/transition/Transition$TransitionListener;", "Landroid/transition/Transition;", "onEnd", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "transition", "", "onStart", "onCancel", "onResume", "onPause", "doOnCancel", "action", "doOnEnd", "doOnPause", "doOnResume", "doOnStart", "core-ktx_release"}, m116k = 2, m117mv = {1, 8, 0}, m119xi = 48)
public final class TransitionKt {






    public static final android.transition.Transition.TransitionListener addListener(android.transition.Transition r8, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r9, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r10, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r11, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r12, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r13) {
            r0 = 0
            androidx.core.transition.TransitionKt$addListener$listener$1 r7 = new androidx.core.transition.TransitionKt$addListener$listener$1
            r1 = r7
            r2 = r9
            r3 = r12
            r4 = r13
            r5 = r11
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            r2 = r1
            android.transition.Transition$TransitionListener r2 = (android.transition.Transition.TransitionListener) r2
            r8.addListener(r2)
            r2 = r1
            android.transition.Transition$TransitionListener r2 = (android.transition.Transition.TransitionListener) r2
            return r2
    }

    public static /* synthetic */ android.transition.Transition.TransitionListener addListener$default(android.transition.Transition r6, kotlin.jvm.functions.Function1 r7, kotlin.jvm.functions.Function1 r8, kotlin.jvm.functions.Function1 r9, kotlin.jvm.functions.Function1 r10, kotlin.jvm.functions.Function1 r11, int r12, java.lang.Object r13) {
            r13 = r12 & 1
            if (r13 == 0) goto L9
            androidx.core.transition.TransitionKt$addListener$1 r13 = androidx.core.transition.TransitionKt.C01681.INSTANCE
            r7 = r13
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
        L9:
            r13 = r12 & 2
            if (r13 == 0) goto L14
            androidx.core.transition.TransitionKt$addListener$2 r13 = androidx.core.transition.TransitionKt.C01692.INSTANCE
            r8 = r13
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            r0 = r8
            goto L15
        L14:
            r0 = r8
        L15:
            r8 = r12 & 4
            if (r8 == 0) goto L20
            androidx.core.transition.TransitionKt$addListener$3 r8 = androidx.core.transition.TransitionKt.C01703.INSTANCE
            r9 = r8
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            r1 = r9
            goto L21
        L20:
            r1 = r9
        L21:
            r8 = r12 & 8
            if (r8 == 0) goto L2c
            androidx.core.transition.TransitionKt$addListener$4 r8 = androidx.core.transition.TransitionKt.C01714.INSTANCE
            r10 = r8
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            r2 = r10
            goto L2d
        L2c:
            r2 = r10
        L2d:
            r8 = r12 & 16
            if (r8 == 0) goto L38
            androidx.core.transition.TransitionKt$addListener$5 r8 = androidx.core.transition.TransitionKt.C01725.INSTANCE
            r11 = r8
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
            r3 = r11
            goto L39
        L38:
            r3 = r11
        L39:
            r4 = 0
            androidx.core.transition.TransitionKt$addListener$listener$1 r5 = new androidx.core.transition.TransitionKt$addListener$listener$1
            r8 = r5
            r9 = r7
            r10 = r2
            r11 = r3
            r12 = r1
            r13 = r0
            r8.<init>(r9, r10, r11, r12, r13)
            r9 = r8
            android.transition.Transition$TransitionListener r9 = (android.transition.Transition.TransitionListener) r9
            r6.addListener(r9)
            r9 = r8
            android.transition.Transition$TransitionListener r9 = (android.transition.Transition.TransitionListener) r9
            return r9
    }

    public static final android.transition.Transition.TransitionListener doOnCancel(android.transition.Transition r5, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r6) {
            r0 = 0
            r1 = r5
            r2 = 0
            androidx.core.transition.TransitionKt$doOnCancel$$inlined$addListener$default$1 r3 = new androidx.core.transition.TransitionKt$doOnCancel$$inlined$addListener$default$1
            r3.<init>(r6)
            r4 = r3
            android.transition.Transition$TransitionListener r4 = (android.transition.Transition.TransitionListener) r4
            r1.addListener(r4)
            r1 = r3
            android.transition.Transition$TransitionListener r1 = (android.transition.Transition.TransitionListener) r1
            return r1
    }

    public static final android.transition.Transition.TransitionListener doOnEnd(android.transition.Transition r5, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r6) {
            r0 = 0
            r1 = r5
            r2 = 0
            androidx.core.transition.TransitionKt$doOnEnd$$inlined$addListener$default$1 r3 = new androidx.core.transition.TransitionKt$doOnEnd$$inlined$addListener$default$1
            r3.<init>(r6)
            r4 = r3
            android.transition.Transition$TransitionListener r4 = (android.transition.Transition.TransitionListener) r4
            r1.addListener(r4)
            r1 = r3
            android.transition.Transition$TransitionListener r1 = (android.transition.Transition.TransitionListener) r1
            return r1
    }

    public static final android.transition.Transition.TransitionListener doOnPause(android.transition.Transition r5, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r6) {
            r0 = 0
            r1 = r5
            r2 = 0
            androidx.core.transition.TransitionKt$doOnPause$$inlined$addListener$default$1 r3 = new androidx.core.transition.TransitionKt$doOnPause$$inlined$addListener$default$1
            r3.<init>(r6)
            r4 = r3
            android.transition.Transition$TransitionListener r4 = (android.transition.Transition.TransitionListener) r4
            r1.addListener(r4)
            r1 = r3
            android.transition.Transition$TransitionListener r1 = (android.transition.Transition.TransitionListener) r1
            return r1
    }

    public static final android.transition.Transition.TransitionListener doOnResume(android.transition.Transition r5, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r6) {
            r0 = 0
            r1 = r5
            r2 = 0
            androidx.core.transition.TransitionKt$doOnResume$$inlined$addListener$default$1 r3 = new androidx.core.transition.TransitionKt$doOnResume$$inlined$addListener$default$1
            r3.<init>(r6)
            r4 = r3
            android.transition.Transition$TransitionListener r4 = (android.transition.Transition.TransitionListener) r4
            r1.addListener(r4)
            r1 = r3
            android.transition.Transition$TransitionListener r1 = (android.transition.Transition.TransitionListener) r1
            return r1
    }

    public static final android.transition.Transition.TransitionListener doOnStart(android.transition.Transition r5, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r6) {
            r0 = 0
            r1 = r5
            r2 = 0
            androidx.core.transition.TransitionKt$doOnStart$$inlined$addListener$default$1 r3 = new androidx.core.transition.TransitionKt$doOnStart$$inlined$addListener$default$1
            r3.<init>(r6)
            r4 = r3
            android.transition.Transition$TransitionListener r4 = (android.transition.Transition.TransitionListener) r4
            r1.addListener(r4)
            r1 = r3
            android.transition.Transition$TransitionListener r1 = (android.transition.Transition.TransitionListener) r1
            return r1
    }
}
