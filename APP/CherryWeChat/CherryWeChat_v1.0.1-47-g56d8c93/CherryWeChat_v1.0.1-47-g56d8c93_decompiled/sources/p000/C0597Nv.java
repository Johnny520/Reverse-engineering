package p000;

/* JADX INFO: renamed from: Nv */
/* JADX INFO: loaded from: classes.dex */
public final class C0597Nv extends RuntimeException {
    public C0597Nv(Class cls) {
        super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
    }
}
