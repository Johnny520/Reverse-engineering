package defpackage;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ljx.wechatmod.ui.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qa implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qa(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r4) {
        switch(this.a) {
            case 0: goto L27;
            case 1: goto L25;
            case 2: goto L23;
            case 3: goto L21;
            case 4: goto L19;
            case 5: goto L17;
            default: goto L4;
        };
    L4:
        mx r42 = (mx) this.b;
        EditText r0 = r42.f;
        if (r0 == null) goto L35;
        int r02 = r0.getSelectionEnd();
        EditText r1 = r42.f;
        if (r1 != null) goto L10;
    L12:
        r42.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
    L13:
        if (r02 < 0) goto L15;
        r42.f.setSelection(r02);
    L15:
        r42.p();
        return;
    L10:
        if ((r1.getTransformationMethod() instanceof PasswordTransformationMethod) == false) goto L12;
        r42.f.setTransformationMethod(null);
        goto L13
    L35:
        return;
    L17:
        ((bu) this.b).E();
        throw null;
    L19:
        MainActivity.f((MainActivity) this.b, r4);
        return;
    L21:
        TextView r03 = (TextView) this.b;
        gn r12 = gn.a;
        ip.l(r4);
        r12.getClass();
        gn.i(r4, 1);
        r03.setText("\u5df2\u6e05\u7a7a");
        return;
    L23:
        ((FrameLayout) this.b).performClick();
        return;
    L25:
        ((ph) this.b).t();
        return;
    L27:
        ua r43 = (ua) this.b;
        EditText r04 = r43.i;
        if (r04 == null) goto L36;
        Editable r05 = r04.getText();
        if (r05 == null) goto L33;
        r05.clear();
    L33:
        r43.p();
        return;
    }
}
