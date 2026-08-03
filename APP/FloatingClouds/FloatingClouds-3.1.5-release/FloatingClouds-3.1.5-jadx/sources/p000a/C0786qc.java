package p000a;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.C1247R;
import com.google.android.material.textfield.C1318a;

/* JADX INFO: renamed from: a.qc */
/* JADX INFO: loaded from: classes.dex */
public final class C0786qc extends AbstractC0514c6 {

    /* JADX INFO: renamed from: e */
    public final int f3104e;

    /* JADX INFO: renamed from: f */
    public EditText f3105f;

    /* JADX INFO: renamed from: g */
    public final ViewOnClickListenerC0606h3 f3106g;

    public C0786qc(C1318a c1318a, int i) {
        super(c1318a);
        this.f3104e = C1247R.drawable.design_password_eye;
        this.f3106g = new ViewOnClickListenerC0606h3(7, this);
        if (i != 0) {
            this.f3104e = i;
        }
    }

    @Override // p000a.AbstractC0514c6
    /* JADX INFO: renamed from: b */
    public final void mo1265b() {
        m1269q();
    }

    @Override // p000a.AbstractC0514c6
    /* JADX INFO: renamed from: c */
    public final int mo262c() {
        return C1247R.string.password_toggle_content_description;
    }

    @Override // p000a.AbstractC0514c6
    /* JADX INFO: renamed from: d */
    public final int mo263d() {
        return this.f3104e;
    }

    @Override // p000a.AbstractC0514c6
    /* JADX INFO: renamed from: f */
    public final View.OnClickListener mo265f() {
        return this.f3106g;
    }

    @Override // p000a.AbstractC0514c6
    /* JADX INFO: renamed from: k */
    public final boolean mo1267k() {
        return true;
    }

    @Override // p000a.AbstractC0514c6
    /* JADX INFO: renamed from: l */
    public final boolean mo269l() {
        EditText editText = this.f3105f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // p000a.AbstractC0514c6
    /* JADX INFO: renamed from: m */
    public final void mo270m(EditText editText) {
        this.f3105f = editText;
        m1269q();
    }

    @Override // p000a.AbstractC0514c6
    /* JADX INFO: renamed from: r */
    public final void mo155r() {
        EditText editText = this.f3105f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f3105f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // p000a.AbstractC0514c6
    /* JADX INFO: renamed from: s */
    public final void mo273s() {
        EditText editText = this.f3105f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
