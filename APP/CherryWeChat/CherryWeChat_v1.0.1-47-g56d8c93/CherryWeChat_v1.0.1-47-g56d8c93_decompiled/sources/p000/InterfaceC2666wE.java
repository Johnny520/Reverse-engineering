package p000;

/* JADX INFO: renamed from: wE */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2666wE {
    /* JADX INFO: renamed from: a */
    default AbstractC2580uE mo171a(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    /* JADX INFO: renamed from: b */
    default AbstractC2580uE mo2563b(Class cls, C2557ts c2557ts) {
        return mo171a(cls);
    }
}
