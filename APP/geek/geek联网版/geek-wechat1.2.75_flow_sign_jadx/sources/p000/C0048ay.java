package p000;

import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: ay */
/* JADX INFO: loaded from: classes.dex */
public class C0048ay {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f646a;

    /* JADX INFO: renamed from: b */
    public final Object[] f647b;

    /* JADX INFO: renamed from: c */
    public int f648c;

    public C0048ay(int i) {
        this.f646a = 0;
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f647b = new Object[i];
    }

    /* JADX INFO: renamed from: a */
    public Object mo475a() {
        switch (this.f646a) {
            case Base64.DEFAULT /* 0 */:
                int i = this.f648c;
                if (i <= 0) {
                    return null;
                }
                int i2 = i - 1;
                Object[] objArr = this.f647b;
                Object obj = objArr[i2];
                objArr[i2] = null;
                this.f648c = i - 1;
                return obj;
            default:
                int i3 = this.f648c;
                if (i3 <= 0) {
                    return null;
                }
                int i4 = i3 - 1;
                Object[] objArr2 = this.f647b;
                Object obj2 = objArr2[i4];
                objArr2[i4] = null;
                this.f648c = i3 - 1;
                return obj2;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m476b(C0585p6 c0585p6) {
        int i = this.f648c;
        Object[] objArr = this.f647b;
        if (i < objArr.length) {
            objArr[i] = c0585p6;
            this.f648c = i + 1;
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean mo477c(Object obj) {
        int i = 0;
        while (true) {
            int i2 = this.f648c;
            Object[] objArr = this.f647b;
            if (i >= i2) {
                if (i2 >= objArr.length) {
                    return false;
                }
                objArr[i2] = obj;
                this.f648c = i2 + 1;
                return true;
            }
            if (objArr[i] == obj) {
                throw new IllegalStateException("Already in the pool!");
            }
            i++;
        }
    }

    public C0048ay() {
        this.f646a = 1;
        this.f647b = new Object[256];
    }
}
