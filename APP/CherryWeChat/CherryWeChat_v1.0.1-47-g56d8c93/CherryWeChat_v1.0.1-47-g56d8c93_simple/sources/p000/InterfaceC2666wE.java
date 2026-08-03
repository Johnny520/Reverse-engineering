package p000;

/* JADX INFO: renamed from: wE */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2666wE {
    /* JADX INFO: renamed from: a */
    default AbstractC2580uE mo171a(Class r2) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    /* JADX INFO: renamed from: b */
    default AbstractC2580uE mo2563b(Class r1, C2557ts r2) {
        return mo171a(r1);
    }
}
