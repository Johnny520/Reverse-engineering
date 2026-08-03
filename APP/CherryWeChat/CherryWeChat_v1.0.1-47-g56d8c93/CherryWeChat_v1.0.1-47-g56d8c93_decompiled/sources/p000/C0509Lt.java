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

    public C0509Lt(C1141ag c1141ag, int i) {
        super(c1141ag);
        this.f1665e = R.drawable.design_password_eye;
        this.f1667g = new ViewOnClickListenerC1477h(8, this);
        if (i != 0) {
            this.f1665e = i;
        }
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
        EditText editText = this.f1666f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: l */
    public final void mo954l(EditText editText) {
        this.f1666f = editText;
        m2348p();
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: q */
    public final void mo957q() {
        EditText editText = this.f1666f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f1666f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: r */
    public final void mo958r() {
        EditText editText = this.f1666f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
