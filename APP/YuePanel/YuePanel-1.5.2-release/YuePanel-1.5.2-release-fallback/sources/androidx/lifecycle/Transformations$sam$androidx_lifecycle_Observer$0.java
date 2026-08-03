package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC4201(k = 3, mv = {1, 8, 0}, xi = 48)
public final class Transformations$sam$androidx_lifecycle_Observer$0 implements androidx.lifecycle.Observer, Yue.InterfaceC2849 {
    private final /* synthetic */ Yue.InterfaceC2825 function;

    public Transformations$sam$androidx_lifecycle_Observer$0(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "function"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.function = r2
            return
    }

    public final boolean equals(@Yue.InterfaceC4543 java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof androidx.lifecycle.Observer
            r1 = 0
            if (r0 == 0) goto L17
            boolean r0 = r3 instanceof Yue.InterfaceC2849
            if (r0 == 0) goto L17
            Yue.ۥۣۣ۠ۢ r0 = r2.getFunctionDelegate()
            Yue.ۥۣۣ۠ۡ r3 = (Yue.InterfaceC2849) r3
            Yue.ۥۣۣ۠ۢ r3 = r3.getFunctionDelegate()
            boolean r1 = Yue.C3329.m13897(r0, r3)
        L17:
            return r1
    }

    @Override // Yue.InterfaceC2849
    @Yue.InterfaceC4418
    public final Yue.InterfaceC2840<?> getFunctionDelegate() {
            r1 = this;
            Yue.ۥۣ۠ۡ۟ r0 = r1.function
            return r0
    }

    public final int hashCode() {
            r1 = this;
            Yue.ۥۣۣ۠ۢ r0 = r1.getFunctionDelegate()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(java.lang.Object r2) {
            r1 = this;
            Yue.ۥۣ۠ۡ۟ r0 = r1.function
            r0.invoke(r2)
            return
    }
}
