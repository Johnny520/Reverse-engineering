package p018b3;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.util.ArrayList;
import java.util.List;
import p185m8.AbstractC5081g0;
import p319w2.C9137t3;

/* JADX INFO: renamed from: b3.n0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class InputConnectionC0966n0 implements InputConnection {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0979u f2958a;

    /* JADX INFO: renamed from: b */
    public final boolean f2959b;

    /* JADX INFO: renamed from: c */
    public int f2960c;

    /* JADX INFO: renamed from: d */
    public C0978t0 f2961d;

    /* JADX INFO: renamed from: e */
    public int f2962e;

    /* JADX INFO: renamed from: f */
    public boolean f2963f;

    /* JADX INFO: renamed from: g */
    public final List f2964g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public boolean f2965h = true;

    public InputConnectionC0966n0(C0978t0 c0978t0, InterfaceC0979u interfaceC0979u, boolean z10) {
        this.f2958a = interfaceC0979u;
        this.f2959b = z10;
        this.f2961d = c0978t0;
    }

    /* JADX INFO: renamed from: b */
    public final void m3524b(InterfaceC0955i interfaceC0955i) {
        m3525c();
        try {
            this.f2964g.add(interfaceC0955i);
        } finally {
            m3526d();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z10 = this.f2965h;
        return z10 ? m3525c() : z10;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m3525c() {
        this.f2960c++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i10) {
        boolean z10 = this.f2965h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.f2964g.clear();
        this.f2960c = 0;
        this.f2965h = false;
        this.f2958a.mo3592e(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z10 = this.f2965h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        boolean z10 = this.f2965h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z10 = this.f2965h;
        return z10 ? this.f2959b : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i10) {
        boolean z10 = this.f2965h;
        if (z10) {
            m3524b(new C0934a(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3526d() {
        int i10 = this.f2960c - 1;
        this.f2960c = i10;
        if (i10 == 0 && !this.f2964g.isEmpty()) {
            this.f2958a.mo3591d(AbstractC5081g0.m20560a1(this.f2964g));
            this.f2964g.clear();
        }
        return this.f2960c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        boolean z10 = this.f2965h;
        if (!z10) {
            return z10;
        }
        m3524b(new C0951g(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        boolean z10 = this.f2965h;
        if (!z10) {
            return z10;
        }
        m3524b(new C0953h(i10, i11));
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final void m3527e(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return m3526d();
    }

    /* JADX INFO: renamed from: f */
    public final void m3528f(C0978t0 c0978t0) {
        this.f2961d = c0978t0;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z10 = this.f2965h;
        if (!z10) {
            return z10;
        }
        m3524b(new C0967o());
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m3529g(C0978t0 c0978t0, InterfaceC0981v interfaceC0981v) {
        if (this.f2965h) {
            m3528f(c0978t0);
            if (this.f2963f) {
                interfaceC0981v.updateExtractedText(this.f2962e, AbstractC0985x.m3611a(c0978t0));
            }
            C9137t3 c9137t3M3584i = c0978t0.m3584i();
            int iM35521l = c9137t3M3584i != null ? C9137t3.m35521l(c9137t3M3584i.m35527r()) : -1;
            C9137t3 c9137t3M3584i2 = c0978t0.m3584i();
            interfaceC0981v.mo3597d(C9137t3.m35521l(c0978t0.m3585j()), C9137t3.m35520k(c0978t0.m3585j()), iM35521l, c9137t3M3584i2 != null ? C9137t3.m35520k(c9137t3M3584i2.m35527r()) : -1);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i10) {
        return TextUtils.getCapsMode(this.f2961d.m3586k(), C9137t3.m35521l(this.f2961d.m3585j()), i10);
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z10 = (i10 & 1) != 0;
        this.f2963f = z10;
        if (z10) {
            this.f2962e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return AbstractC0985x.m3611a(this.f2961d);
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int i10) {
        if (C9137t3.m35517h(this.f2961d.m3585j())) {
            return null;
        }
        return AbstractC0980u0.m3593a(this.f2961d).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int i10, int i11) {
        return AbstractC0980u0.m3594b(this.f2961d, i10).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int i10, int i11) {
        return AbstractC0980u0.m3595c(this.f2961d, i10).toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i10) {
        boolean z10 = this.f2965h;
        if (z10) {
            z10 = false;
            switch (i10) {
                case R.id.selectAll:
                    m3524b(new C0972q0(0, this.f2961d.m3586k().length()));
                    break;
                case R.id.cut:
                    m3527e(277);
                    break;
                case R.id.copy:
                    m3527e(278);
                    break;
                case R.id.paste:
                    m3527e(279);
                    break;
            }
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i10) {
        int iM3558a;
        boolean z10 = this.f2965h;
        if (!z10) {
            return z10;
        }
        if (i10 != 0) {
            switch (i10) {
                case 2:
                    iM3558a = C0975s.f2976b.m3560c();
                    break;
                case 3:
                    iM3558a = C0975s.f2976b.m3564g();
                    break;
                case 4:
                    iM3558a = C0975s.f2976b.m3565h();
                    break;
                case 5:
                    iM3558a = C0975s.f2976b.m3561d();
                    break;
                case 6:
                    iM3558a = C0975s.f2976b.m3559b();
                    break;
                case 7:
                    iM3558a = C0975s.f2976b.m3563f();
                    break;
                default:
                    Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i10);
                    iM3558a = C0975s.f2976b.m3558a();
                    break;
            }
        } else {
            iM3558a = C0975s.f2976b.m3558a();
        }
        this.f2958a.mo3590c(iM3558a);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z10 = this.f2965h;
        if (z10) {
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z10) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = this.f2965h;
        if (!z14) {
            return z14;
        }
        boolean z15 = false;
        boolean z16 = (i10 & 1) != 0;
        boolean z17 = (i10 & 2) != 0;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            boolean z18 = (i10 & 16) != 0;
            boolean z19 = (i10 & 8) != 0;
            boolean z20 = (i10 & 4) != 0;
            if (i11 >= 34 && (i10 & 32) != 0) {
                z15 = true;
            }
            if (z18 || z19 || z20 || z15) {
                z11 = z15;
                z10 = z20;
                z13 = z19;
                z12 = z18;
            } else if (i11 >= 34) {
                z12 = true;
                z13 = true;
                z10 = true;
                z11 = true;
            } else {
                z11 = z15;
                z12 = true;
                z13 = true;
                z10 = true;
            }
        } else {
            z10 = false;
            z11 = false;
            z12 = true;
            z13 = true;
        }
        this.f2958a.mo3589b(z16, z17, z12, z13, z10, z11);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f2965h;
        if (!z10) {
            return z10;
        }
        this.f2958a.mo3588a(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i10, int i11) {
        boolean z10 = this.f2965h;
        if (z10) {
            m3524b(new C0968o0(i10, i11));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i10) {
        boolean z10 = this.f2965h;
        if (z10) {
            m3524b(new C0970p0(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i10, int i11) {
        boolean z10 = this.f2965h;
        if (!z10) {
            return z10;
        }
        m3524b(new C0972q0(i10, i11));
        return true;
    }
}
