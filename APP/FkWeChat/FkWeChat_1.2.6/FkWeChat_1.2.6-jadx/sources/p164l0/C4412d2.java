package p164l0;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import p010a9.InterfaceC0173a;
import p172l8.AbstractC4706m;
import p172l8.EnumC4708o;
import p172l8.InterfaceC4705l;
import p336x3.C9404l;

/* JADX INFO: renamed from: l0.d2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4412d2 implements InterfaceC4404b2 {

    /* JADX INFO: renamed from: a */
    public final View f12904a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4705l f12905b = AbstractC4706m.m18788b(EnumC4708o.f13923s, new InterfaceC0173a() { // from class: l0.c2
        @Override // p010a9.InterfaceC0173a
        public final Object invoke() {
            return C4412d2.m17223b(this.f12901q);
        }
    });

    /* JADX INFO: renamed from: c */
    public final C9404l f12906c;

    public C4412d2(View view) {
        this.f12904a = view;
        this.f12906c = new C9404l(view);
    }

    /* JADX INFO: renamed from: b */
    public static InputMethodManager m17223b(C4412d2 c4412d2) {
        Object systemService = c4412d2.f12904a.getContext().getSystemService("input_method");
        systemService.getClass();
        return (InputMethodManager) systemService;
    }

    @Override // p164l0.InterfaceC4404b2
    /* JADX INFO: renamed from: a */
    public void mo17203a() {
        if (Build.VERSION.SDK_INT >= 34) {
            C4421g.f12928a.m17248a(m17224f(), this.f12904a);
        }
    }

    @Override // p164l0.InterfaceC4404b2
    /* JADX INFO: renamed from: c */
    public boolean mo17204c() {
        return m17224f().isActive(this.f12904a);
    }

    @Override // p164l0.InterfaceC4404b2
    /* JADX INFO: renamed from: d */
    public void mo17205d(int i10, int i11, int i12, int i13) {
        m17224f().updateSelection(this.f12904a, i10, i11, i12, i13);
    }

    @Override // p164l0.InterfaceC4404b2
    /* JADX INFO: renamed from: e */
    public void mo17206e() {
        m17224f().restartInput(this.f12904a);
    }

    /* JADX INFO: renamed from: f */
    public final InputMethodManager m17224f() {
        return (InputMethodManager) this.f12905b.getValue();
    }

    @Override // p164l0.InterfaceC4404b2
    public void updateCursorAnchorInfo(CursorAnchorInfo cursorAnchorInfo) {
        m17224f().updateCursorAnchorInfo(this.f12904a, cursorAnchorInfo);
    }

    @Override // p164l0.InterfaceC4404b2
    public void updateExtractedText(int i10, ExtractedText extractedText) {
        m17224f().updateExtractedText(this.f12904a, i10, extractedText);
    }
}
