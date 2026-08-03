package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;", "Landroidx/lifecycle/LifecycleEventObserver;", "", "Landroidx/lifecycle/GeneratedAdapter;", "generatedAdapters", "<init>", "([Landroidx/lifecycle/GeneratedAdapter;)V", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "LYue/ۥۣۢ۠ۤ;", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "[Landroidx/lifecycle/GeneratedAdapter;", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
public final class CompositeGeneratedAdaptersObserver implements androidx.lifecycle.LifecycleEventObserver {

    @Yue.InterfaceC4418
    private final androidx.lifecycle.GeneratedAdapter[] generatedAdapters;

    public CompositeGeneratedAdaptersObserver(@Yue.InterfaceC4418 androidx.lifecycle.GeneratedAdapter[] r2) {
            r1 = this;
            java.lang.String r0 = "generatedAdapters"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.generatedAdapters = r2
            return
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@Yue.InterfaceC4418 androidx.lifecycle.LifecycleOwner r7, @Yue.InterfaceC4418 androidx.lifecycle.Lifecycle.Event r8) {
            r6 = this;
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r7, r0)
            java.lang.String r0 = "event"
            Yue.C3329.m13906(r8, r0)
            androidx.lifecycle.MethodCallsLogger r0 = new androidx.lifecycle.MethodCallsLogger
            r0.<init>()
            androidx.lifecycle.GeneratedAdapter[] r1 = r6.generatedAdapters
            int r2 = r1.length
            r3 = 0
            r4 = r3
        L14:
            if (r4 >= r2) goto L1e
            r5 = r1[r4]
            r5.callMethods(r7, r8, r3, r0)
            int r4 = r4 + 1
            goto L14
        L1e:
            androidx.lifecycle.GeneratedAdapter[] r1 = r6.generatedAdapters
            int r2 = r1.length
        L21:
            if (r3 >= r2) goto L2c
            r4 = r1[r3]
            r5 = 1
            r4.callMethods(r7, r8, r5, r0)
            int r3 = r3 + 1
            goto L21
        L2c:
            return
    }
}
