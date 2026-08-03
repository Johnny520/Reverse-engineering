package p000a;

/* JADX INFO: renamed from: a.Cc */
/* JADX INFO: loaded from: classes.dex */
public class C0051Cc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f181a;

    /* JADX INFO: renamed from: b */
    public final Object[] f182b;

    /* JADX INFO: renamed from: c */
    public int f183c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0051Cc(int i) {
        this.f181a = 0;
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f182b = new Object[i];
    }

    /* JADX INFO: renamed from: a */
    public Object mo128a() {
        switch (this.f181a) {
            case 0:
                int i = this.f183c;
                if (i <= 0) {
                    return null;
                }
                int i2 = i - 1;
                Object[] objArr = this.f182b;
                Object obj = objArr[i2];
                C0631i9.m1480c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
                objArr[i2] = null;
                this.f183c--;
                return obj;
            default:
                int i3 = this.f183c;
                if (i3 <= 0) {
                    return null;
                }
                int i4 = i3 - 1;
                Object[] objArr2 = this.f182b;
                Object obj2 = objArr2[i4];
                objArr2[i4] = null;
                this.f183c = i3 - 1;
                return obj2;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m129b(C0184K1 c0184k1) {
        int i = this.f183c;
        Object[] objArr = this.f182b;
        if (i < objArr.length) {
            objArr[i] = c0184k1;
            this.f183c = i + 1;
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean mo130c(Object obj) {
        Object[] objArr;
        boolean z;
        C0631i9.m1482e(obj, "instance");
        int i = this.f183c;
        int i2 = 0;
        while (true) {
            objArr = this.f182b;
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
        int i3 = this.f183c;
        if (i3 >= objArr.length) {
            return false;
        }
        objArr[i3] = obj;
        this.f183c = i3 + 1;
        return true;
    }

    public C0051Cc() {
        this.f181a = 1;
        this.f182b = new Object[256];
    }

    public C0051Cc(int i, C0350T6[] c0350t6Arr) {
        this.f181a = 2;
        this.f183c = i;
        this.f182b = c0350t6Arr;
    }
}
