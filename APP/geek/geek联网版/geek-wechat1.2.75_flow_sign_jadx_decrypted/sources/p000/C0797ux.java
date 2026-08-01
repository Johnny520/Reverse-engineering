package p000;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.ljx.wechatmod.R;

/* JADX INFO: renamed from: ux */
/* JADX INFO: loaded from: classes.dex */
public final class C0797ux extends AbstractC0300hj {

    /* JADX INFO: renamed from: e */
    public final int f4852e;

    /* JADX INFO: renamed from: f */
    public EditText f4853f;

    /* JADX INFO: renamed from: g */
    public final ViewOnClickListenerC0923ya f4854g;

    public C0797ux(C0263gj c0263gj, int i) {
        super(c0263gj);
        this.f4852e = R.drawable.design_password_eye;
        this.f4854g = new ViewOnClickListenerC0923ya(6, this);
        if (i != 0) {
            this.f4852e = i;
        }
    }

    @Override // p000.AbstractC0300hj
    /* JADX INFO: renamed from: b */
    public final void mo1396b() {
        m1403p();
    }

    @Override // p000.AbstractC0300hj
    /* JADX INFO: renamed from: c */
    public final int mo599c() {
        return R.string.password_toggle_content_description;
    }

    @Override // p000.AbstractC0300hj
    /* JADX INFO: renamed from: d */
    public final int mo600d() {
        return this.f4852e;
    }

    @Override // p000.AbstractC0300hj
    /* JADX INFO: renamed from: f */
    public final View.OnClickListener mo602f() {
        return this.f4854g;
    }

    @Override // p000.AbstractC0300hj
    /* JADX INFO: renamed from: j */
    public final boolean mo1399j() {
        return true;
    }

    @Override // p000.AbstractC0300hj
    /* JADX INFO: renamed from: k */
    public final boolean mo1400k() {
        EditText editText = this.f4853f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // p000.AbstractC0300hj
    /* JADX INFO: renamed from: l */
    public final void mo604l(EditText editText) {
        this.f4853f = editText;
        m1403p();
    }

    @Override // p000.AbstractC0300hj
    /* JADX INFO: renamed from: q */
    public final void mo606q() {
        EditText editText = this.f4853f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f4853f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // p000.AbstractC0300hj
    /* JADX INFO: renamed from: r */
    public final void mo607r() {
        EditText editText = this.f4853f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
