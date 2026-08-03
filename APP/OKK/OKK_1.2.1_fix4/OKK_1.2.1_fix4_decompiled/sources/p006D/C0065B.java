package p006D;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: renamed from: D.B */
/* JADX INFO: loaded from: classes.dex */
public final class C0065B extends AbstractC0067D {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f209e;

    public C0065B(int i2, Class cls, int i3, int i4, int i5) {
        this.f209e = i5;
        this.f211a = i2;
        this.f214d = cls;
        this.f213c = i3;
        this.f212b = i4;
    }

    @Override // p006D.AbstractC0067D
    /* JADX INFO: renamed from: b */
    public final Object mo202b(View view) {
        switch (this.f209e) {
            case 0:
                return AbstractC0074K.m258b(view);
            default:
                return AbstractC0076M.m274b(view);
        }
    }

    @Override // p006D.AbstractC0067D
    /* JADX INFO: renamed from: c */
    public final void mo203c(View view, Object obj) {
        switch (this.f209e) {
            case 0:
                AbstractC0074K.m264h(view, (CharSequence) obj);
                break;
            default:
                AbstractC0076M.m278f(view, (CharSequence) obj);
                break;
        }
    }

    @Override // p006D.AbstractC0067D
    /* JADX INFO: renamed from: f */
    public final boolean mo204f(Object obj, Object obj2) {
        switch (this.f209e) {
        }
        return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
    }
}
