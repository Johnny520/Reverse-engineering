package p000;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.ljx.wechatmod.R;

/* JADX INFO: renamed from: mx */
/* JADX INFO: loaded from: classes.dex */
public final class C0501mx extends AbstractC0226fj {

    /* JADX INFO: renamed from: e */
    public final int f3294e;

    /* JADX INFO: renamed from: f */
    public EditText f3295f;

    /* JADX INFO: renamed from: g */
    public final ViewOnClickListenerC0627qa f3296g;

    public C0501mx(C0189ej c0189ej, int i) {
        super(c0189ej);
        this.f3294e = R.drawable.design_password_eye;
        this.f3296g = new ViewOnClickListenerC0627qa(6, this);
        if (i != 0) {
            this.f3294e = i;
        }
    }

    @Override // p000.AbstractC0226fj
    /* JADX INFO: renamed from: b */
    public final void mo1214b() {
        m1228p();
    }

    @Override // p000.AbstractC0226fj
    /* JADX INFO: renamed from: c */
    public final int mo1215c() {
        return R.string.password_toggle_content_description;
    }

    @Override // p000.AbstractC0226fj
    /* JADX INFO: renamed from: d */
    public final int mo1216d() {
        return this.f3294e;
    }

    @Override // p000.AbstractC0226fj
    /* JADX INFO: renamed from: f */
    public final View.OnClickListener mo1218f() {
        return this.f3296g;
    }

    @Override // p000.AbstractC0226fj
    /* JADX INFO: renamed from: j */
    public final boolean mo1222j() {
        return true;
    }

    @Override // p000.AbstractC0226fj
    /* JADX INFO: renamed from: k */
    public final boolean mo1223k() {
        EditText editText = this.f3295f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // p000.AbstractC0226fj
    /* JADX INFO: renamed from: l */
    public final void mo1224l(EditText editText) {
        this.f3295f = editText;
        m1228p();
    }

    @Override // p000.AbstractC0226fj
    /* JADX INFO: renamed from: q */
    public final void mo1229q() {
        EditText editText = this.f3295f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f3295f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // p000.AbstractC0226fj
    /* JADX INFO: renamed from: r */
    public final void mo1230r() {
        EditText editText = this.f3295f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
