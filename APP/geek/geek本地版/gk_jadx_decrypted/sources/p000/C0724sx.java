package p000;

import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: sx */
/* JADX INFO: loaded from: classes.dex */
public class C0724sx {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4467a;

    /* JADX INFO: renamed from: b */
    public final Object[] f4468b;

    /* JADX INFO: renamed from: c */
    public int f4469c;

    public C0724sx(int i) {
        this.f4467a = 0;
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f4468b = new Object[i];
    }

    /* JADX INFO: renamed from: a */
    public Object mo2338a() {
        switch (this.f4467a) {
            case Base64.DEFAULT /* 0 */:
                int i = this.f4469c;
                if (i <= 0) {
                    return null;
                }
                int i2 = i - 1;
                Object[] objArr = this.f4468b;
                Object obj = objArr[i2];
                objArr[i2] = null;
                this.f4469c = i - 1;
                return obj;
            default:
                int i3 = this.f4469c;
                if (i3 <= 0) {
                    return null;
                }
                int i4 = i3 - 1;
                Object[] objArr2 = this.f4468b;
                Object obj2 = objArr2[i4];
                objArr2[i4] = null;
                this.f4469c = i3 - 1;
                return obj2;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2339b(C0586p6 c0586p6) {
        int i = this.f4469c;
        Object[] objArr = this.f4468b;
        if (i < objArr.length) {
            objArr[i] = c0586p6;
            this.f4469c = i + 1;
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean mo2340c(Object obj) {
        int i = 0;
        while (true) {
            int i2 = this.f4469c;
            Object[] objArr = this.f4468b;
            if (i >= i2) {
                if (i2 >= objArr.length) {
                    return false;
                }
                objArr[i2] = obj;
                this.f4469c = i2 + 1;
                return true;
            }
            if (objArr[i] == obj) {
                throw new IllegalStateException("Already in the pool!");
            }
            i++;
        }
    }

    public C0724sx() {
        this.f4467a = 1;
        this.f4468b = new Object[256];
    }
}
