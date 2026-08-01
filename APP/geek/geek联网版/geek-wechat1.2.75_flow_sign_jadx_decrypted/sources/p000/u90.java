package p000;

import android.text.TextUtils;
import android.view.View;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: loaded from: classes.dex */
public final class u90 extends z50 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f4670e;

    public u90(int i, Class cls, int i2, int i3, int i4) {
        this.f4670e = i4;
        this.f5547a = i;
        this.f5550d = cls;
        this.f5549c = i2;
        this.f5548b = i3;
    }

    @Override // p000.z50
    /* JADX INFO: renamed from: b */
    public final Object mo2447b(View view) {
        switch (this.f4670e) {
            case Base64.DEFAULT /* 0 */:
                return Boolean.valueOf(ha0.m1366d(view));
            case Base64.NO_PADDING /* 1 */:
                return ha0.m1364b(view);
            default:
                return Boolean.valueOf(ha0.m1365c(view));
        }
    }

    @Override // p000.z50
    /* JADX INFO: renamed from: c */
    public final void mo2448c(View view, Object obj) {
        switch (this.f4670e) {
            case Base64.DEFAULT /* 0 */:
                ha0.m1371i(view, ((Boolean) obj).booleanValue());
                break;
            case Base64.NO_PADDING /* 1 */:
                ha0.m1370h(view, (CharSequence) obj);
                break;
            default:
                ha0.m1369g(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // p000.z50
    /* JADX INFO: renamed from: e */
    public final boolean mo2449e(Object obj, Object obj2) {
        switch (this.f4670e) {
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
