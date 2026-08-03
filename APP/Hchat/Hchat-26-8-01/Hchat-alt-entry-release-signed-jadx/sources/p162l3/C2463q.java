package p162l3;

import android.text.TextUtils;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: l3.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2463q implements InterfaceC2461o {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f8078g;

    /* JADX INFO: renamed from: h */
    public final String f8079h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2463q(String str, int i9) {
        this.f8078g = i9;
        this.f8079h = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p162l3.InterfaceC2461o
    /* JADX INFO: renamed from: a */
    public boolean mo624a(CharSequence charSequence, int i9, int i10, C2467u c2467u) {
        if (!TextUtils.equals(charSequence.subSequence(i9, i10), this.f8079h)) {
            return true;
        }
        c2467u.f8097c = (c2467u.f8097c & 3) | 4;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f8078g) {
            case 1:
                return AbstractC0921a.m2254q(new StringBuilder("<"), this.f8079h, '>');
            default:
                return super.toString();
        }
    }

    @Override // p162l3.InterfaceC2461o
    /* JADX INFO: renamed from: e */
    public Object mo627e() {
        return this;
    }
}
