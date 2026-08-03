package p001A0;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import org.luckypray.dexkit.C1031R;

/* JADX INFO: renamed from: A0.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0050z extends AbstractC0046v {

    /* JADX INFO: renamed from: e */
    public final int f177e;

    /* JADX INFO: renamed from: f */
    public EditText f178f;

    /* JADX INFO: renamed from: g */
    public final ViewOnClickListenerC0025a f179g;

    public C0050z(C0045u r2, int r3) {
        super(r2);
        this.f177e = C1031R.drawable.design_password_eye;
        this.f179g = new ViewOnClickListenerC0025a(2, this);
        if (r3 == 0) goto L6;
        this.f177e = r3;
        return;
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: b */
    public final void mo154b() {
        m156q();
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: c */
    public final int mo58c() {
        return C1031R.string.password_toggle_content_description;
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: d */
    public final int mo59d() {
        return this.f177e;
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: f */
    public final View.OnClickListener mo61f() {
        return this.f179g;
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: k */
    public final boolean mo155k() {
        return true;
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: l */
    public final boolean mo74l() {
        EditText r02 = this.f178f;
        if (r02 != null) goto L5;
    L7:
        boolean r03 = false;
    L9:
        return !r03;
    L5:
        if ((r02.getTransformationMethod() instanceof PasswordTransformationMethod) == false) goto L7;
        r03 = true;
        goto L9
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: m */
    public final void mo63m(EditText r1) {
        this.f178f = r1;
        m156q();
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: r */
    public final void mo65r() {
        EditText r02 = this.f178f;
        if (r02 != null) goto L5;
        return;
    L5:
        if (r02.getInputType() != 16) goto L7;
    L12:
        this.f178f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        return;
    L7:
        if (r02.getInputType() == 128) goto L12;
        if (r02.getInputType() == 144) goto L12;
        if (r02.getInputType() == 224) goto L12;
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: s */
    public final void mo66s() {
        EditText r02 = this.f178f;
        if (r02 == null) goto L6;
        r02.setTransformationMethod(PasswordTransformationMethod.getInstance());
        return;
    }
}
