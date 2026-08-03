package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/DefaultLifecycleObserverAdapter;", "Landroidx/lifecycle/g;", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DefaultLifecycleObserverAdapter implements androidx.lifecycle.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.Q4 f921a;
    public final androidx.lifecycle.g b;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                androidx.lifecycle.e$a[] r0 = androidx.lifecycle.e.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.lifecycle.e$a r1 = androidx.lifecycle.e.a.ON_CREATE     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                androidx.lifecycle.e$a r1 = androidx.lifecycle.e.a.ON_START     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                androidx.lifecycle.e$a r1 = androidx.lifecycle.e.a.ON_RESUME     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
            L22:
                androidx.lifecycle.e$a r1 = androidx.lifecycle.e.a.ON_PAUSE     // Catch: java.lang.NoSuchFieldError -> L2b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            L2b:
                androidx.lifecycle.e$a r1 = androidx.lifecycle.e.a.ON_STOP     // Catch: java.lang.NoSuchFieldError -> L34
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L34
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L34
            L34:
                androidx.lifecycle.e$a r1 = androidx.lifecycle.e.a.ON_DESTROY     // Catch: java.lang.NoSuchFieldError -> L3d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3d
            L3d:
                androidx.lifecycle.e$a r1 = androidx.lifecycle.e.a.ON_ANY     // Catch: java.lang.NoSuchFieldError -> L46
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L46
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L46
            L46:
                androidx.lifecycle.DefaultLifecycleObserverAdapter.a.$EnumSwitchMapping$0 = r0
                return
        }
    }

    public DefaultLifecycleObserverAdapter(a.Q4 r1, androidx.lifecycle.g r2) {
            r0 = this;
            r0.<init>()
            r0.f921a = r1
            r0.b = r2
            return
    }

    @Override // androidx.lifecycle.g
    public final void a(a.InterfaceC0479y9 r4, androidx.lifecycle.e.a r5) {
            r3 = this;
            int[] r0 = androidx.lifecycle.DefaultLifecycleObserverAdapter.a.$EnumSwitchMapping$0
            int r1 = r5.ordinal()
            r0 = r0[r1]
            a.Q4 r1 = r3.f921a
            r2 = 3
            if (r0 == r2) goto L19
            r1 = 7
            if (r0 == r1) goto L11
            goto L1c
        L11:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "ON_ANY must not been send by anybody"
            r4.<init>(r5)
            throw r4
        L19:
            r1.b(r4)
        L1c:
            androidx.lifecycle.g r0 = r3.b
            if (r0 == 0) goto L23
            r0.a(r4, r5)
        L23:
            return
    }
}
