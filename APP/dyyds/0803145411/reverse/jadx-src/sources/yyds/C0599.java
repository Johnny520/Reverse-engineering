package yyds;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: yyds.ᛳᛵᲀᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0599 extends AbstractC0598 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f2828;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ Object f2829;

    public /* synthetic */ C0599(int i, Object obj) {
        this.f2828 = i;
        this.f2829 = obj;
    }

    @Override // yyds.AbstractC0598
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final void mo1489() {
        int i = this.f2828;
        EnumC1464 enumC1464 = EnumC1464.f6967;
        Object obj = this.f2829;
        int i2 = 1;
        switch (i) {
            case 0:
                C0763 c0763 = ((C2457) obj).f12138;
                c0763.f407 = true;
                c0763.m291(enumC1464);
                c0763.getClass();
                C1344 c1344 = new C1344();
                C0763 c07632 = c0763.f3523;
                c1344.m2748();
                C0763 c07633 = c0763.f3523;
                c0763.mo285();
                c0763.mo1719();
                break;
            case 1:
                C2283 c2283 = (C2283) obj;
                EditText editText = c2283.f11239;
                C1188 c1188 = (C1188) c2283.f11233;
                c1188.f407 = true;
                c1188.m291(enumC1464);
                c1188.mo285();
                new C1344().m2748();
                C1188 c11882 = c1188.f5446;
                C2207 c2207 = c1188.f5450;
                if (c2207 == null) {
                    c2207 = new C2207(i2, c2283);
                    c1188.f5450 = c2207;
                }
                c2207.m4196(c11882);
                c1188.f398.getClass();
                C1188 c11883 = c1188.f5446;
                if (!(c11883 instanceof C2059) || !c1188.f396) {
                    if ((c11883 instanceof C2059) && c1188.f5440 != null) {
                        editText.clearFocus();
                        editText.requestFocus();
                        editText.selectAll();
                        break;
                    }
                } else {
                    editText.postDelayed(new RunnableC0871(11, this), 300L);
                    break;
                }
                break;
            default:
                C2458 c2458 = (C2458) obj;
                C1624 c1624 = c2458.f12153;
                c1624.f407 = true;
                c1624.m291(enumC1464);
                c2458.f12151.setAlpha(0.0f);
                c2458.f12154.post(new RunnableC0871(18, this));
                break;
        }
    }

    @Override // yyds.AbstractC0598
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final void mo1490() {
        switch (this.f2828) {
            case 0:
                C2457 c2457 = (C2457) this.f2829;
                C0763 c0763 = c2457.f12138;
                c0763.f407 = false;
                C1344 c1344 = new C1344();
                C0763 c07632 = c0763.f3523;
                c1344.m2747();
                C0763 c07633 = c0763.f3523;
                c0763.m291(EnumC1464.f6969);
                c0763.f3516 = null;
                c2457.f12131 = null;
                WeakReference weakReference = AbstractC1655.f8450;
                break;
            case 1:
                C1188 c1188 = (C1188) ((C2283) this.f2829).f11233;
                c1188.f407 = false;
                new C1344().m2747();
                c1188.m291(EnumC1464.f6969);
                WeakReference weakReference2 = AbstractC1655.f8450;
                break;
            default:
                ((C2458) this.f2829).f12153.m3326();
                break;
        }
    }
}
