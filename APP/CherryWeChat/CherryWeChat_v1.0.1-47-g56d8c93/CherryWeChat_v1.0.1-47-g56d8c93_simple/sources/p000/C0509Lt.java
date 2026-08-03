package p000;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: Lt */
/* JADX INFO: loaded from: classes.dex */
public final class C0509Lt extends AbstractC1221bg {

    /* JADX INFO: renamed from: e */
    public final int f1665e;

    /* JADX INFO: renamed from: f */
    public EditText f1666f;

    /* JADX INFO: renamed from: g */
    public final ViewOnClickListenerC1477h f1667g;

    public C0509Lt(C1141ag r2, int r3) {
        super(r2);
        this.f1665e = R.drawable.design_password_eye;
        this.f1667g = new ViewOnClickListenerC1477h(8, this);
        if (r3 == 0) goto L6;
        this.f1665e = r3;
        return;
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: b */
    public final void mo992b() {
        m2348p();
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: c */
    public final int mo947c() {
        return R.string.password_toggle_content_description;
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: d */
    public final int mo948d() {
        return this.f1665e;
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: f */
    public final View.OnClickListener mo950f() {
        return this.f1667g;
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: j */
    public final boolean mo993j() {
        return true;
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: k */
    public final boolean mo953k() {
        EditText r0 = this.f1666f;
        if (r0 != null) goto L5;
    L7:
        boolean r02 = false;
    L9:
        return !r02;
    L5:
        if ((r0.getTransformationMethod() instanceof PasswordTransformationMethod) == false) goto L7;
        r02 = true;
        goto L9
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: l */
    public final void mo954l(EditText r1) {
        this.f1666f = r1;
        m2348p();
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: q */
    public final void mo957q() {
        EditText r0 = this.f1666f;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.getInputType() != 16) goto L7;
    L12:
        this.f1666f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        return;
    L7:
        if (r0.getInputType() == 128) goto L12;
        if (r0.getInputType() == 144) goto L12;
        if (r0.getInputType() == 224) goto L12;
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: r */
    public final void mo958r() {
        EditText r0 = this.f1666f;
        if (r0 == null) goto L6;
        r0.setTransformationMethod(PasswordTransformationMethod.getInstance());
        return;
    }
}
