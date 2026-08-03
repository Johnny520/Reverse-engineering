package p001A0;

import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: renamed from: A0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0031g extends AbstractC0046v {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f83e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0031g(C0045u c0045u, int i2) {
        super(c0045u);
        this.f83e = i2;
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: r */
    public void mo65r() {
        switch (this.f83e) {
            case 0:
                C0045u c0045u = this.f139b;
                c0045u.f130o = null;
                CheckableImageButton checkableImageButton = c0045u.f122g;
                checkableImageButton.setOnLongClickListener(null);
                AbstractC0040p.m89T(checkableImageButton, null);
                break;
        }
    }
}
