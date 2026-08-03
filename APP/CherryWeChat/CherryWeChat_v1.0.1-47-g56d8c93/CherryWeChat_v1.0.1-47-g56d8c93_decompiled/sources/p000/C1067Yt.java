package p000;

/* JADX INFO: renamed from: Yt */
/* JADX INFO: loaded from: classes.dex */
public class C1067Yt implements InterfaceC1024Xt {

    /* JADX INFO: renamed from: a */
    public final Object[] f3378a;

    /* JADX INFO: renamed from: b */
    public int f3379b;

    public C1067Yt(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f3378a = new Object[i];
    }

    @Override // p000.InterfaceC1024Xt
    /* JADX INFO: renamed from: a */
    public boolean mo1934a(Object obj) {
        Object[] objArr;
        boolean z;
        int i = this.f3379b;
        int i2 = 0;
        while (true) {
            objArr = this.f3378a;
            if (i2 >= i) {
                z = false;
                break;
            }
            if (objArr[i2] == obj) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i3 = this.f3379b;
        if (i3 >= objArr.length) {
            return false;
        }
        objArr[i3] = obj;
        this.f3379b = i3 + 1;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m2003b(C0564N4 c0564n4) {
        int i = this.f3379b;
        Object[] objArr = this.f3378a;
        if (i < objArr.length) {
            objArr[i] = c0564n4;
            this.f3379b = i + 1;
        }
    }

    @Override // p000.InterfaceC1024Xt
    /* JADX INFO: renamed from: c */
    public Object mo1935c() {
        int i = this.f3379b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f3378a;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f3379b = i - 1;
        return obj;
    }

    public C1067Yt() {
        this.f3378a = new Object[256];
    }
}
