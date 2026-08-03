package lb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends r8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public lb.i f8010e;

    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "swipe_quote"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            r5.getClass()
            ha.k0 r5 = new ha.k0
            java.lang.String r0 = "左滑引用，右滑或长按菜单复读消息"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "swipe_quote"
            java.lang.String r3 = "滑动手势"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r11) {
            r10 = this;
            r11.getClass()
            lb.i r0 = new lb.i
            ia.t r1 = new ia.t
            java.lang.Class<lb.k> r2 = lb.k.class
            java.lang.Class r4 = eh.a.i(r2)
            r8 = 0
            r9 = 10
            r2 = 2
            java.lang.String r5 = "logFeatureError"
            java.lang.String r6 = "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r7 = 0
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.<init>(r11, r1)
            r3.f8010e = r0
            r10.k()
            ke.h r11 = new ke.h
            r0 = 22
            r11.<init>(r10, r0)
            java.lang.Class<f8.e> r0 = f8.e.class
            r10.i(r0, r11)
            return
    }

    public final void k() {
            r5 = this;
            lb.j r0 = new lb.j
            r1 = 0
            r0.<init>(r5, r1)
            r1 = 12
            java.lang.String r2 = "swipe_quote"
            java.lang.String r3 = "滑动手势"
            r4 = 0
            r8.e.f(r1, r0, r2, r3, r4)
            lb.j r0 = new lb.j
            r2 = 1
            r0.<init>(r5, r2)
            java.lang.String r2 = "swipe_quote:repeat_menu"
            java.lang.String r3 = "长按菜单复读"
            r8.e.f(r1, r0, r2, r3, r4)
            return
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "滑动手势"
            return r0
    }
}
