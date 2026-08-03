package p000;

import io.sentry.android.replay.capture.AbstractC1767e;

/* JADX INFO: renamed from: ys */
/* JADX INFO: loaded from: classes.dex */
public final class C2772ys extends AbstractC0209Eu implements InterfaceC0674Pm, InterfaceC1416fj {
    public C2772ys(String r7, String r8) {
        super(0, AbstractC1767e.class, C0179E6.f530a, r7, r8);
    }

    @Override // p000.AbstractC0222F6
    /* JADX INFO: renamed from: c */
    public final InterfaceC0459Km mo436c() {
        AbstractC0425Jv.f1405a.getClass();
        return this;
    }

    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object r1) {
        m5343h();
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public final void m5343h() {
        if (this.f615g == true) goto L11;
        InterfaceC0459Km r0 = m402f();
        if (r0 == this) goto L9;
        ((C2772ys) ((InterfaceC0674Pm) r0)).m5343h();
        return;
    L9:
        throw new C1541ic("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    L11:
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
    }
}
