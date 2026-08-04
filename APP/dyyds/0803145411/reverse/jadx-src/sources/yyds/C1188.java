package yyds;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.kongzue.dialogx.interfaces.AbstractC0041;
import com.p000ss.android.ugc.aweme.yyds.R;

/* JADX INFO: renamed from: yyds.ᛵᲀᲀᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C1188 extends AbstractC0041 {

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public int f5434;

    /* JADX INFO: renamed from: ᛱᛸᲁᲇ, reason: contains not printable characters */
    public String f5435;

    /* JADX INFO: renamed from: ᛱᲀᲈᛲ, reason: contains not printable characters */
    public C2283 f5436;

    /* JADX INFO: renamed from: ᛲᛱᲁᛳ, reason: contains not printable characters */
    public String f5437;

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public AbstractC1865 f5438;

    /* JADX INFO: renamed from: ᛲᲀᛲᛲ, reason: contains not printable characters */
    public InterfaceC1376 f5439;

    /* JADX INFO: renamed from: ᛲᲀᛵᛷ, reason: contains not printable characters */
    public C2789 f5440;

    /* JADX INFO: renamed from: ᛶᛴᛱᛲ, reason: contains not printable characters */
    public C2321 f5442;

    /* JADX INFO: renamed from: ᛶᲀᲈᲇ, reason: contains not printable characters */
    public C2544 f5443;

    /* JADX INFO: renamed from: ᛷᛴᛴᲁ, reason: contains not printable characters */
    public InterfaceC2185 f5444;

    /* JADX INFO: renamed from: ᛷᛶᛷᲀ, reason: contains not printable characters */
    public String f5445;

    /* JADX INFO: renamed from: ᛷᲇᛲᛱ, reason: contains not printable characters */
    public String f5447;

    /* JADX INFO: renamed from: ᛸᛴᛵᛶ, reason: contains not printable characters */
    public String f5448;

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public int f5449;

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public C2207 f5450;

    /* JADX INFO: renamed from: ᲀᛴᲁᲈ, reason: contains not printable characters */
    public String f5451;

    /* JADX INFO: renamed from: ᲁᛵᲁᲁ, reason: contains not printable characters */
    public int f5452;

    /* JADX INFO: renamed from: ᲈᛷᲈᛶ, reason: contains not printable characters */
    public String f5454;

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public boolean f5441 = true;

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public C1188 f5446 = this;

    /* JADX INFO: renamed from: ᲁᛶᛴᛸ, reason: contains not printable characters */
    public float f5453 = AbstractC1655.f8455;

    /* JADX INFO: renamed from: ᛶᲀᲈᲇ, reason: contains not printable characters */
    public static C1188 m2386(Context context) {
        C1188 c1188 = new C1188();
        c1188.f5441 = true;
        c1188.f5446 = c1188;
        c1188.f5453 = AbstractC1655.f8455;
        c1188.f408 = context;
        return c1188;
    }

    /* JADX INFO: renamed from: ᛱᲀᲈᛲ */
    public void mo956() {
        if (mo961() == null) {
            return;
        }
        AbstractC0041.m266(new RunnableC2373(this, 0));
    }

    /* JADX INFO: renamed from: ᛲᲀᛲᛲ */
    public boolean mo957() {
        int i = this.f5452;
        return i != 0 ? i == 1 : this.f406;
    }

    /* JADX INFO: renamed from: ᛲᲀᛵᛷ, reason: contains not printable characters */
    public final void m2387() {
        AbstractC0041.m266(new RunnableC2373(this, 1));
    }

    /* JADX INFO: renamed from: ᛳᛷᛶᛲ, reason: contains not printable characters */
    public final void m2388(Activity activity) {
        int iM276;
        m287();
        if (m279() != null) {
            AbstractC0041.m259(activity, m279());
            return;
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
        View viewM290 = m290(i);
        this.f5436 = new C2283(this, viewM290);
        if (viewM290 != null) {
            viewM290.setTag(this.f5446);
        }
        AbstractC0041.m259(activity, viewM290);
    }

    /* JADX INFO: renamed from: ᛴᛸᛴᛸ, reason: contains not printable characters */
    public final void m2389(Context context) {
        int iM276;
        this.f408 = context;
        m287();
        if (m279() != null) {
            AbstractC0041.m258(m279());
            return;
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
        View viewM289 = m289(context, i);
        this.f5436 = new C2283(this, viewM289);
        if (viewM289 != null) {
            viewM289.setTag(this.f5446);
        }
        AbstractC0041.m258(viewM289);
    }

    /* JADX INFO: renamed from: ᛵᲈᲇᛵ, reason: contains not printable characters */
    public final void m2390() {
        int iM276;
        m287();
        if (m279() != null) {
            AbstractC0041.m258(m279());
            return;
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
        View viewM290 = m290(i);
        this.f5436 = new C2283(this, viewM290);
        if (viewM290 != null) {
            viewM290.setTag(this.f5446);
        }
        AbstractC0041.m258(viewM290);
    }

    /* JADX INFO: renamed from: ᛶᛴᛱᛲ */
    public boolean mo960() {
        return false;
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC0041
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public String mo283() {
        return getClass().getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }

    /* JADX INFO: renamed from: ᛷᛴᛴᲁ */
    public C2283 mo961() {
        return this.f5436;
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC0041
    /* JADX INFO: renamed from: ᲀᛴᲁᲈ */
    public void mo288() {
        int iM276;
        if (m279() != null) {
            AbstractC0041.m260(m279());
            this.f407 = false;
        }
        if (((RelativeLayout) mo961().f11236) != null) {
            ((RelativeLayout) mo961().f11236).removeAllViews();
        }
        if (((ViewGroup) mo961().f11238) != null) {
            ((ViewGroup) mo961().f11238).removeAllViews();
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
        this.f402 = 0L;
        View viewM290 = m290(i);
        this.f5436 = new C2283(this, viewM290);
        if (viewM290 != null) {
            viewM290.setTag(this.f5446);
        }
        AbstractC0041.m258(viewM290);
    }

    /* JADX INFO: renamed from: ᲁᛵᲁᲁ */
    public C1188 mo962(CharSequence charSequence, InterfaceC1376 interfaceC1376) {
        this.f5447 = (String) charSequence;
        this.f5444 = interfaceC1376;
        mo956();
        return this;
    }
}
