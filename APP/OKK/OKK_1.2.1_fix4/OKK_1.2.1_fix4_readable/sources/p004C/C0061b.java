package p004C;

import p031Q0.AbstractC0307g;
import p069m.C0983c;

/* JADX INFO: renamed from: C.b */
/* JADX INFO: loaded from: classes.dex */
public class C0061b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f205a;

    /* JADX INFO: renamed from: b */
    public final Object[] f206b;

    /* JADX INFO: renamed from: c */
    public int f207c;

    public C0061b(int i2) {
        this.f205a = 0;
        if (i2 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0".toString());
        }
        this.f206b = new Object[i2];
    }

    /* JADX INFO: renamed from: a */
    public Object mo198a() {
        switch (this.f205a) {
            case 0:
                int i2 = this.f207c;
                if (i2 <= 0) {
                    return null;
                }
                int i3 = i2 - 1;
                Object[] objArr = this.f206b;
                Object obj = objArr[i3];
                AbstractC0307g.m701c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
                objArr[i3] = null;
                this.f207c--;
                return obj;
            default:
                int i4 = this.f207c;
                if (i4 <= 0) {
                    return null;
                }
                int i5 = i4 - 1;
                Object[] objArr2 = this.f206b;
                Object obj2 = objArr2[i5];
                objArr2[i5] = null;
                this.f207c = i4 - 1;
                return obj2;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m199b(C0983c c0983c) {
        int i2 = this.f207c;
        Object[] objArr = this.f206b;
        if (i2 < objArr.length) {
            objArr[i2] = c0983c;
            this.f207c = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean mo200c(Object obj) {
        Object[] objArr;
        boolean z2;
        AbstractC0307g.m703e(obj, "instance");
        int i2 = this.f207c;
        int i3 = 0;
        while (true) {
            objArr = this.f206b;
            if (i3 >= i2) {
                z2 = false;
                break;
            }
            if (objArr[i3] == obj) {
                z2 = true;
                break;
            }
            i3++;
        }
        if (!(!z2)) {
            throw new IllegalStateException("Already in the pool!".toString());
        }
        int i4 = this.f207c;
        if (i4 >= objArr.length) {
            return false;
        }
        objArr[i4] = obj;
        this.f207c = i4 + 1;
        return true;
    }

    public C0061b() {
        this.f205a = 1;
        this.f206b = new Object[256];
    }
}
