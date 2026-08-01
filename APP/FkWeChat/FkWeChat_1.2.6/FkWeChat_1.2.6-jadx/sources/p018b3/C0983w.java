package p018b3;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1067w;
import p172l8.AbstractC4706m;
import p172l8.EnumC4708o;
import p172l8.InterfaceC4705l;
import p336x3.C9404l;

/* JADX INFO: renamed from: b3.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0983w implements InterfaceC0981v {

    /* JADX INFO: renamed from: a */
    public final View f3002a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4705l f3003b = AbstractC4706m.m18788b(EnumC4708o.f13923s, new a());

    /* JADX INFO: renamed from: c */
    public final C9404l f3004c;

    /* JADX INFO: renamed from: b3.w$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0173a {
        public a() {
            super(0);
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputMethodManager invoke() {
            Object systemService = C0983w.this.f3002a.getContext().getSystemService("input_method");
            systemService.getClass();
            return (InputMethodManager) systemService;
        }
    }

    public C0983w(View view) {
        this.f3002a = view;
        this.f3004c = new C9404l(view);
    }

    /* JADX INFO: renamed from: b */
    public final InputMethodManager m3609b() {
        return (InputMethodManager) this.f3003b.getValue();
    }

    @Override // p018b3.InterfaceC0981v
    /* JADX INFO: renamed from: c */
    public boolean mo3596c() {
        return m3609b().isActive(this.f3002a);
    }

    @Override // p018b3.InterfaceC0981v
    /* JADX INFO: renamed from: d */
    public void mo3597d(int i10, int i11, int i12, int i13) {
        m3609b().updateSelection(this.f3002a, i10, i11, i12, i13);
    }

    @Override // p018b3.InterfaceC0981v
    /* JADX INFO: renamed from: e */
    public void mo3598e() {
        m3609b().restartInput(this.f3002a);
    }

    @Override // p018b3.InterfaceC0981v
    /* JADX INFO: renamed from: f */
    public void mo3599f() {
        this.f3004c.m36541a();
    }

    @Override // p018b3.InterfaceC0981v
    /* JADX INFO: renamed from: g */
    public void mo3600g() {
        this.f3004c.m36542b();
    }

    @Override // p018b3.InterfaceC0981v
    public void updateCursorAnchorInfo(CursorAnchorInfo cursorAnchorInfo) {
        m3609b().updateCursorAnchorInfo(this.f3002a, cursorAnchorInfo);
    }

    @Override // p018b3.InterfaceC0981v
    public void updateExtractedText(int i10, ExtractedText extractedText) {
        m3609b().updateExtractedText(this.f3002a, i10, extractedText);
    }
}
