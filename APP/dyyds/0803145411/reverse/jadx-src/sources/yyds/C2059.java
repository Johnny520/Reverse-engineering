package yyds;

import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import com.kongzue.dialogx.interfaces.AbstractC0041;
import com.p000ss.android.ugc.aweme.yyds.R;

/* JADX INFO: renamed from: yyds.ᲀᛸᲇᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2059 extends C1188 {
    @Override // yyds.C1188
    /* JADX INFO: renamed from: ᛲᲀᛲᛲ */
    public final boolean mo957() {
        int i = this.f5452;
        return i != 0 ? i == 1 : this.f406;
    }

    @Override // yyds.C1188, com.kongzue.dialogx.interfaces.AbstractC0041
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final String mo283() {
        return C2059.class.getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }

    @Override // yyds.C1188, com.kongzue.dialogx.interfaces.AbstractC0041
    /* JADX INFO: renamed from: ᲀᛴᲁᲈ */
    public final void mo288() {
        int iM276;
        EditText editText;
        if (m279() != null) {
            AbstractC0041.m260(m279());
            this.f407 = false;
        }
        RelativeLayout relativeLayout = (RelativeLayout) this.f5436.f11236;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        int iM2762 = m276(mo277());
        int i = R.layout.layout_dialogx_material_dark;
        if (iM2762 != 0) {
            iM276 = m276(mo277());
        } else {
            boolean zMo277 = mo277();
            this.f398.getClass();
            iM276 = zMo277 ? R.layout.layout_dialogx_material : R.layout.layout_dialogx_material_dark;
        }
        if (iM276 != 0) {
            i = iM276;
        } else if (mo277()) {
            i = R.layout.layout_dialogx_material;
        }
        C2283 c2283 = this.f5436;
        String string = (c2283 == null || (editText = c2283.f11239) == null) ? this.f5435 : editText.getText().toString();
        this.f402 = 0L;
        View viewM290 = m290(i);
        this.f5436 = new C2283(this, viewM290);
        if (viewM290 != null) {
            viewM290.setTag(this.f5446);
        }
        AbstractC0041.m258(viewM290);
        this.f5435 = string;
        mo956();
    }
}
