package p006D;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: renamed from: D.B */
/* JADX INFO: loaded from: classes.dex */
public final class C0065B extends AbstractC0067D {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f209e;

    public C0065B(int r1, Class r2, int r3, int r4, int r5) {
        this.f209e = r5;
        this.f211a = r1;
        this.f214d = r2;
        this.f213c = r3;
        this.f212b = r4;
    }

    @Override // p006D.AbstractC0067D
    /* JADX INFO: renamed from: b */
    public final Object mo202b(View r2) {
        switch(this.f209e) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return AbstractC0076M.m274b(r2);
    L7:
        return AbstractC0074K.m258b(r2);
    }

    @Override // p006D.AbstractC0067D
    /* JADX INFO: renamed from: c */
    public final void mo203c(View r2, Object r3) {
        switch(this.f209e) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        AbstractC0076M.m278f(r2, (CharSequence) r3);
        return;
    L6:
        AbstractC0074K.m264h(r2, (CharSequence) r3);
    }

    @Override // p006D.AbstractC0067D
    /* JADX INFO: renamed from: f */
    public final boolean mo204f(Object r2, Object r3) {
        switch(this.f209e) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return !TextUtils.equals((CharSequence) r2, (CharSequence) r3);
    L7:
        return !TextUtils.equals((CharSequence) r2, (CharSequence) r3);
    }
}
