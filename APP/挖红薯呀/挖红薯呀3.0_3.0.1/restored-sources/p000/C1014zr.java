package p000;

import android.text.TextUtils;

/* JADX INFO: renamed from: zr */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C1014zr implements InterfaceC0973yr {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f7986d;

    /* JADX INFO: renamed from: e */
    public final String f7987e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1014zr(String str, int i) {
        this.f7986d = i;
        this.f7987e = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0973yr
    /* JADX INFO: renamed from: g */
    public boolean mo612g(CharSequence charSequence, int i, int i2, y91 y91Var) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.f7987e)) {
            return true;
        }
        y91Var.f7588c = (y91Var.f7588c & 3) | 4;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f7986d) {
            case 1:
                return "<" + this.f7987e + '>';
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC0973yr
    /* JADX INFO: renamed from: a */
    public Object mo608a() {
        return this;
    }
}
