package p243q9;

/* JADX INFO: renamed from: q9.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6327b implements InterfaceC6326a {

    /* JADX INFO: renamed from: q */
    public final InterfaceC6333h f19850q;

    public AbstractC6327b(InterfaceC6333h interfaceC6333h) {
        if (interfaceC6333h == null) {
            m24993N(0);
        }
        this.f19850q = interfaceC6333h;
    }

    /* JADX INFO: renamed from: N */
    private static /* synthetic */ void m24993N(int i10) {
        String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 1 ? 3 : 2];
        if (i10 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i10 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i10 != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 1) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // p243q9.InterfaceC6326a
    public InterfaceC6333h getAnnotations() {
        InterfaceC6333h interfaceC6333h = this.f19850q;
        if (interfaceC6333h == null) {
            m24993N(1);
        }
        return interfaceC6333h;
    }
}
