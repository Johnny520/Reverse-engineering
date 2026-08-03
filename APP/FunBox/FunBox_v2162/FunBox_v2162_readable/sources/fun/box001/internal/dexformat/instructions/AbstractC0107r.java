package fun.box001.internal.dexformat.instructions;

/* JADX INFO: renamed from: g.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0107r extends AbstractC0108s {

    /* JADX INFO: renamed from: a */
    private int f407a = -1;

    /* JADX INFO: renamed from: e */
    public final int m317e() {
        int i2 = this.f407a;
        if (i2 >= 0) {
            return i2;
        }
        throw new RuntimeException("index not yet set");
    }

    /* JADX INFO: renamed from: f */
    public final boolean m318f() {
        return this.f407a >= 0;
    }

    /* JADX INFO: renamed from: g */
    public final String m319g() {
        return "[" + Integer.toHexString(this.f407a) + ']';
    }

    /* JADX INFO: renamed from: h */
    public final void m320h(int i2) {
        if (this.f407a != -1) {
            throw new RuntimeException("index already set");
        }
        this.f407a = i2;
    }
}
