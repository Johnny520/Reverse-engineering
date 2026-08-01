package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.ljx.wechatmod.R;

/* JADX INFO: loaded from: classes.dex */
public final class mx extends fj {
    public final int e;
    public EditText f;
    public final qa g;

    public mx(ej r2, int r3) {
        super(r2);
        this.e = R.drawable.design_password_eye;
        this.g = new qa(6, this);
        if (r3 == 0) goto L6;
        this.e = r3;
        return;
    }

    @Override // defpackage.fj
    public final void b() {
        p();
    }

    @Override // defpackage.fj
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // defpackage.fj
    public final int d() {
        return this.e;
    }

    @Override // defpackage.fj
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // defpackage.fj
    public final boolean j() {
        return true;
    }

    @Override // defpackage.fj
    public final boolean k() {
        EditText r0 = this.f;
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

    @Override // defpackage.fj
    public final void l(EditText r1) {
        this.f = r1;
        p();
    }

    @Override // defpackage.fj
    public final void q() {
        EditText r0 = this.f;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.getInputType() != 16) goto L7;
    L12:
        this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        return;
    L7:
        if (r0.getInputType() == 128) goto L12;
        if (r0.getInputType() == 144) goto L12;
        if (r0.getInputType() == 224) goto L12;
    }

    @Override // defpackage.fj
    public final void r() {
        EditText r0 = this.f;
        if (r0 == null) goto L6;
        r0.setTransformationMethod(PasswordTransformationMethod.getInstance());
        return;
    }
}
