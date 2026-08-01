package p099y;

import android.text.TextUtils;
import android.view.View;
import p012G.AbstractC0139c;

/* JADX INFO: renamed from: y.x */
/* JADX INFO: loaded from: classes.dex */
public final class C1092x extends AbstractC0139c {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f3731e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1092x(int i2, Class cls, int i3, int i4, int i5) {
        this.f3731e = i5;
        this.f434a = i2;
        this.f437d = cls;
        this.f436c = i3;
        this.f435b = i4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p012G.AbstractC0139c
    /* JADX INFO: renamed from: b */
    public final Object mo304b(View view) {
        switch (this.f3731e) {
            case 0:
                return Boolean.valueOf(AbstractC1041E.m2259d(view));
            case 1:
                return AbstractC1041E.m2257b(view);
            default:
                return Boolean.valueOf(AbstractC1041E.m2258c(view));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p012G.AbstractC0139c
    /* JADX INFO: renamed from: c */
    public final void mo305c(View view, Object obj) {
        switch (this.f3731e) {
            case 0:
                AbstractC1041E.m2265j(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                AbstractC1041E.m2263h(view, (CharSequence) obj);
                break;
            default:
                AbstractC1041E.m2262g(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p012G.AbstractC0139c
    /* JADX INFO: renamed from: e */
    public final boolean mo307e(Object obj, Object obj2) {
        switch (this.f3731e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
