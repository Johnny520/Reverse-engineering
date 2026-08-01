package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mb implements ld {
    public static final mb a = null;

    static {
        a = new mb();
    }

    @Override // defpackage.ld
    public final ge d() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // defpackage.ld
    public final void f(Object r2) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
