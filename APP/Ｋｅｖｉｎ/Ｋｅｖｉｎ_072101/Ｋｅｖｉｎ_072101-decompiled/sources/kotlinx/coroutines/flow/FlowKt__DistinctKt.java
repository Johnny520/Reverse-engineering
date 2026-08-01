package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Distinct.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\n\u001aT\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\n26\u0010\f\u001a2\u0012\u0013\u0012\u0011H\u000b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u0011H\u000b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00030\u0001\u001a6\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u000b0\n2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u0002H\u00120\u0007\u001au\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\n2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u0002H\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072:\u0010\f\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00030\u0001H\u0002¢\u0006\u0002\b\u0014\",\u0010\u0000\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0004\u0010\u0005\"&\u0010\u0006\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00078\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0005¨\u0006\u0015"}, m115d2 = {"defaultAreEquivalent", "Lkotlin/Function2;", "", "", "getDefaultAreEquivalent$annotations$FlowKt__DistinctKt", "()V", "defaultKeySelector", "Lkotlin/Function1;", "getDefaultKeySelector$annotations$FlowKt__DistinctKt", "distinctUntilChanged", "Lkotlinx/coroutines/flow/Flow;", "T", "areEquivalent", "Lkotlin/ParameterName;", "name", "old", "new", "distinctUntilChangedBy", "K", "keySelector", "distinctUntilChangedBy$FlowKt__DistinctKt", "kotlinx-coroutines-core"}, m116k = 5, m117mv = {1, 6, 0}, m119xi = 48, m120xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__DistinctKt {
    private static final kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Boolean> defaultAreEquivalent = null;
    private static final kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Object> defaultKeySelector = null;

    static {
            kotlinx.coroutines.flow.FlowKt__DistinctKt$defaultKeySelector$1 r0 = kotlinx.coroutines.flow.FlowKt__DistinctKt$defaultKeySelector$1.INSTANCE
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            kotlinx.coroutines.flow.FlowKt__DistinctKt.defaultKeySelector = r0
            kotlinx.coroutines.flow.FlowKt__DistinctKt$defaultAreEquivalent$1 r0 = kotlinx.coroutines.flow.FlowKt__DistinctKt$defaultAreEquivalent$1.INSTANCE
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            kotlinx.coroutines.flow.FlowKt__DistinctKt.defaultAreEquivalent = r0
            return
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> distinctUntilChanged(kotlinx.coroutines.flow.Flow<? extends T> r2) {
            boolean r0 = r2 instanceof kotlinx.coroutines.flow.StateFlow
            if (r0 == 0) goto L7
            r0 = r2
            goto Lf
        L7:
            kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Object> r0 = kotlinx.coroutines.flow.FlowKt__DistinctKt.defaultKeySelector
            kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Boolean> r1 = kotlinx.coroutines.flow.FlowKt__DistinctKt.defaultAreEquivalent
            kotlinx.coroutines.flow.Flow r0 = distinctUntilChangedBy$FlowKt__DistinctKt(r2, r0, r1)
        Lf:
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> distinctUntilChanged(kotlinx.coroutines.flow.Flow<? extends T> r2, kotlin.jvm.functions.Function2<? super T, ? super T, java.lang.Boolean> r3) {
            kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Object> r0 = kotlinx.coroutines.flow.FlowKt__DistinctKt.defaultKeySelector
            r1 = 2
            java.lang.Object r1 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r3, r1)
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            kotlinx.coroutines.flow.Flow r0 = distinctUntilChangedBy$FlowKt__DistinctKt(r2, r0, r1)
            return r0
    }

    public static final <T, K> kotlinx.coroutines.flow.Flow<T> distinctUntilChangedBy(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function1<? super T, ? extends K> r2) {
            kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Boolean> r0 = kotlinx.coroutines.flow.FlowKt__DistinctKt.defaultAreEquivalent
            kotlinx.coroutines.flow.Flow r0 = distinctUntilChangedBy$FlowKt__DistinctKt(r1, r2, r0)
            return r0
    }

    private static final <T> kotlinx.coroutines.flow.Flow<T> distinctUntilChangedBy$FlowKt__DistinctKt(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> r2, kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Boolean> r3) {
            boolean r0 = r1 instanceof kotlinx.coroutines.flow.DistinctFlowImpl
            if (r0 == 0) goto L15
            r0 = r1
            kotlinx.coroutines.flow.DistinctFlowImpl r0 = (kotlinx.coroutines.flow.DistinctFlowImpl) r0
            kotlin.jvm.functions.Function1<T, java.lang.Object> r0 = r0.keySelector
            if (r0 != r2) goto L15
            r0 = r1
            kotlinx.coroutines.flow.DistinctFlowImpl r0 = (kotlinx.coroutines.flow.DistinctFlowImpl) r0
            kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Boolean> r0 = r0.areEquivalent
            if (r0 != r3) goto L15
            r0 = r1
            goto L1c
        L15:
            kotlinx.coroutines.flow.DistinctFlowImpl r0 = new kotlinx.coroutines.flow.DistinctFlowImpl
            r0.<init>(r1, r2, r3)
            kotlinx.coroutines.flow.Flow r0 = (kotlinx.coroutines.flow.Flow) r0
        L1c:
            return r0
    }

    private static /* synthetic */ void getDefaultAreEquivalent$annotations$FlowKt__DistinctKt() {
            return
    }

    private static /* synthetic */ void getDefaultKeySelector$annotations$FlowKt__DistinctKt() {
            return
    }
}
