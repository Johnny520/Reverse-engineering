package p000;

import io.sentry.android.replay.capture.AbstractC1767e;

/* JADX INFO: renamed from: ys */
/* JADX INFO: loaded from: classes.dex */
public final class C2772ys extends AbstractC0209Eu implements InterfaceC0674Pm, InterfaceC1416fj {
    public C2772ys(String str, String str2) {
        super(0, AbstractC1767e.class, C0179E6.f530a, str, str2);
    }

    @Override // p000.AbstractC0222F6
    /* JADX INFO: renamed from: c */
    public final InterfaceC0459Km mo436c() {
        AbstractC0425Jv.f1405a.getClass();
        return this;
    }

    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object obj) {
        m5343h();
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public final void m5343h() {
        if (this.f615g) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        InterfaceC0459Km interfaceC0459KmM402f = m402f();
        if (interfaceC0459KmM402f == this) {
            throw new C1541ic("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((C2772ys) ((InterfaceC0674Pm) interfaceC0459KmM402f)).m5343h();
    }
}
