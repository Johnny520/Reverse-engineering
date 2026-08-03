package p001A0;

import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: renamed from: A0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0031g extends AbstractC0046v {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f83e;

    public /* synthetic */ C0031g(C0045u r1, int r2) {
        this.f83e = r2;
        super(r1);
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: r */
    public void mo65r() {
        switch(this.f83e) {
            case 0: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        C0045u r02 = this.f139b;
        r02.f130o = null;
        CheckableImageButton r03 = r02.f122g;
        r03.setOnLongClickListener(null);
        AbstractC0040p.m89T(r03, null);
    }
}
