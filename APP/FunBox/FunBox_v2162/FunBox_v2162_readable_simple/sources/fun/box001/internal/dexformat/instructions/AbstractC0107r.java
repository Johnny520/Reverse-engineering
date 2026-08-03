package fun.box001.internal.dexformat.instructions;

/* JADX INFO: renamed from: g.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0107r extends AbstractC0108s {

    /* JADX INFO: renamed from: a */
    private int f407a;

    public AbstractC0107r() {
        this.f407a = -1;
    }

    /* JADX INFO: renamed from: e */
    public final int m317e() {
        int r0 = this.f407a;
        if (r0 < 0) goto L6;
        return r0;
    L6:
        throw new RuntimeException("index not yet set");
    }

    /* JADX INFO: renamed from: f */
    public final boolean m318f() {
        if (this.f407a < 0) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final String m319g() {
        return "[" + Integer.toHexString(this.f407a) + ']';
    }

    /* JADX INFO: renamed from: h */
    public final void m320h(int r3) {
        if (this.f407a != (-1)) goto L7;
        this.f407a = r3;
        return;
    L7:
        throw new RuntimeException("index already set");
    }
}
