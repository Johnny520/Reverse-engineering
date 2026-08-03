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

    public C0050z(C0045u c0045u, int i2) {
        super(c0045u);
        this.f177e = C1031R.drawable.design_password_eye;
        this.f179g = new ViewOnClickListenerC0025a(2, this);
        if (i2 != 0) {
            this.f177e = i2;
        }
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
        EditText editText = this.f178f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: m */
    public final void mo63m(EditText editText) {
        this.f178f = editText;
        m156q();
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: r */
    public final void mo65r() {
        EditText editText = this.f178f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f178f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: s */
    public final void mo66s() {
        EditText editText = this.f178f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
