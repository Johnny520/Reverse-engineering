package p000;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: renamed from: aE */
/* JADX INFO: loaded from: classes.dex */
public final class C1132aE extends AbstractC2289nq {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f3582e;

    public C1132aE(int i, Class cls, int i2, int i3, int i4) {
        this.f3582e = i4;
        this.f8034a = i;
        this.f8037d = cls;
        this.f8036c = i2;
        this.f8035b = i3;
    }

    @Override // p000.AbstractC2289nq
    /* JADX INFO: renamed from: c */
    public final Object mo2051c(View view) {
        switch (this.f3582e) {
            case 0:
                return Boolean.valueOf(AbstractC1492hE.m2852c(view));
            case 1:
                return AbstractC1492hE.m2850a(view);
            case 2:
                return AbstractC2093jE.m4278b(view);
            default:
                return Boolean.valueOf(AbstractC1492hE.m2851b(view));
        }
    }

    @Override // p000.AbstractC2289nq
    /* JADX INFO: renamed from: d */
    public final void mo2052d(View view, Object obj) {
        switch (this.f3582e) {
            case 0:
                AbstractC1492hE.m2855f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                AbstractC1492hE.m2854e(view, (CharSequence) obj);
                break;
            case 2:
                AbstractC2093jE.m4279c(view, (CharSequence) obj);
                break;
            default:
                AbstractC1492hE.m2853d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // p000.AbstractC2289nq
    /* JADX INFO: renamed from: g */
    public final boolean mo2053g(Object obj, Object obj2) {
        boolean zEquals;
        switch (this.f3582e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            case 2:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
        return !zEquals;
    }
}
