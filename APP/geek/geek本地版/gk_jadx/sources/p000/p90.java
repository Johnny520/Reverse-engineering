package p000;

import android.text.TextUtils;
import android.view.View;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: loaded from: classes.dex */
public final class p90 extends t50 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f3685e;

    public p90(int i, Class cls, int i2, int i3, int i4) {
        this.f3685e = i4;
        this.f4510a = i;
        this.f4513d = cls;
        this.f4512c = i2;
        this.f4511b = i3;
    }

    @Override // p000.t50
    /* JADX INFO: renamed from: b */
    public final Object mo2068b(View view) {
        switch (this.f3685e) {
            case Base64.DEFAULT /* 0 */:
                return Boolean.valueOf(ca0.m651d(view));
            case Base64.NO_PADDING /* 1 */:
                return ca0.m649b(view);
            default:
                return Boolean.valueOf(ca0.m650c(view));
        }
    }

    @Override // p000.t50
    /* JADX INFO: renamed from: c */
    public final void mo2069c(View view, Object obj) {
        switch (this.f3685e) {
            case Base64.DEFAULT /* 0 */:
                ca0.m656i(view, ((Boolean) obj).booleanValue());
                break;
            case Base64.NO_PADDING /* 1 */:
                ca0.m655h(view, (CharSequence) obj);
                break;
            default:
                ca0.m654g(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // p000.t50
    /* JADX INFO: renamed from: e */
    public final boolean mo2070e(Object obj, Object obj2) {
        switch (this.f3685e) {
            case Base64.DEFAULT /* 0 */:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case Base64.NO_PADDING /* 1 */:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
