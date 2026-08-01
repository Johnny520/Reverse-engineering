package p164l0;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import p010a9.InterfaceC0184l;
import p015b0.C0831p2;
import p018b3.AbstractC0980u0;
import p018b3.C0934a;
import p018b3.C0951g;
import p018b3.C0953h;
import p018b3.C0967o;
import p018b3.C0968o0;
import p018b3.C0970p0;
import p018b3.C0972q0;
import p018b3.C0975s;
import p018b3.C0978t0;
import p018b3.InterfaceC0955i;
import p172l8.C4700i0;
import p179m2.InterfaceC4862j3;
import p185m8.AbstractC5081g0;
import p190n0.C5322b4;
import p319w2.C9137t3;

/* JADX INFO: renamed from: l0.r2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class InputConnectionC4468r2 implements InputConnection {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4400a2 f12986a;

    /* JADX INFO: renamed from: b */
    public final boolean f12987b;

    /* JADX INFO: renamed from: c */
    public final C0831p2 f12988c;

    /* JADX INFO: renamed from: d */
    public final C5322b4 f12989d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC4862j3 f12990e;

    /* JADX INFO: renamed from: f */
    public int f12991f;

    /* JADX INFO: renamed from: g */
    public C0978t0 f12992g;

    /* JADX INFO: renamed from: h */
    public int f12993h;

    /* JADX INFO: renamed from: i */
    public boolean f12994i;

    /* JADX INFO: renamed from: j */
    public final List f12995j = new ArrayList();

    /* JADX INFO: renamed from: k */
    public boolean f12996k = true;

    public InputConnectionC4468r2(C0978t0 c0978t0, InterfaceC4400a2 interfaceC4400a2, boolean z10, C0831p2 c0831p2, C5322b4 c5322b4, InterfaceC4862j3 interfaceC4862j3) {
        this.f12986a = interfaceC4400a2;
        this.f12987b = z10;
        this.f12988c = c0831p2;
        this.f12989d = c5322b4;
        this.f12990e = interfaceC4862j3;
        this.f12992g = c0978t0;
    }

    /* JADX INFO: renamed from: b */
    public static C4700i0 m17314b(InputConnectionC4468r2 inputConnectionC4468r2, InterfaceC0955i interfaceC0955i) {
        inputConnectionC4468r2.m17315c(interfaceC0955i);
        return C4700i0.f13910a;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z10 = this.f12996k;
        return z10 ? m17316d() : z10;
    }

    /* JADX INFO: renamed from: c */
    public final void m17315c(InterfaceC0955i interfaceC0955i) {
        m17316d();
        try {
            this.f12995j.add(interfaceC0955i);
        } finally {
            m17317e();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i10) {
        boolean z10 = this.f12996k;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.f12995j.clear();
        this.f12991f = 0;
        this.f12996k = false;
        this.f12986a.mo17200e(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z10 = this.f12996k;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        boolean z10 = this.f12996k;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z10 = this.f12996k;
        return z10 ? this.f12987b : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i10) {
        boolean z10 = this.f12996k;
        if (z10) {
            m17315c(new C0934a(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m17316d() {
        this.f12991f++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        boolean z10 = this.f12996k;
        if (!z10) {
            return z10;
        }
        m17315c(new C0951g(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        boolean z10 = this.f12996k;
        if (!z10) {
            return z10;
        }
        m17315c(new C0953h(i10, i11));
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m17317e() {
        int i10 = this.f12991f - 1;
        this.f12991f = i10;
        if (i10 == 0 && !this.f12995j.isEmpty()) {
            this.f12986a.mo17199d(AbstractC5081g0.m20560a1(this.f12995j));
            this.f12995j.clear();
        }
        return this.f12991f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return m17317e();
    }

    /* JADX INFO: renamed from: f */
    public final void m17318f(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z10 = this.f12996k;
        if (!z10) {
            return z10;
        }
        m17315c(new C0967o());
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m17319g(C0978t0 c0978t0) {
        this.f12992g = c0978t0;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i10) {
        return TextUtils.getCapsMode(this.f12992g.m3586k(), C9137t3.m35521l(this.f12992g.m3585j()), i10);
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z10 = (i10 & 1) != 0;
        this.f12994i = z10;
        if (z10) {
            this.f12993h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return AbstractC4472s2.m17324b(this.f12992g);
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int i10) {
        if (C9137t3.m35517h(this.f12992g.m3585j())) {
            return null;
        }
        return AbstractC0980u0.m3593a(this.f12992g).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int i10, int i11) {
        return AbstractC0980u0.m3594b(this.f12992g, i10).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int i10, int i11) {
        return AbstractC0980u0.m3595c(this.f12992g, i10).toString();
    }

    /* JADX INFO: renamed from: h */
    public final void m17320h(C0978t0 c0978t0, InterfaceC4404b2 interfaceC4404b2) {
        if (this.f12996k) {
            m17319g(c0978t0);
            if (this.f12994i) {
                interfaceC4404b2.updateExtractedText(this.f12993h, AbstractC4472s2.m17324b(c0978t0));
            }
            C9137t3 c9137t3M3584i = c0978t0.m3584i();
            int iM35521l = c9137t3M3584i != null ? C9137t3.m35521l(c9137t3M3584i.m35527r()) : -1;
            C9137t3 c9137t3M3584i2 = c0978t0.m3584i();
            interfaceC4404b2.mo17205d(C9137t3.m35521l(c0978t0.m3585j()), C9137t3.m35520k(c0978t0.m3585j()), iM35521l, c9137t3M3584i2 != null ? C9137t3.m35520k(c9137t3M3584i2.m35527r()) : -1);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i10) {
        boolean z10 = this.f12996k;
        if (z10) {
            z10 = false;
            switch (i10) {
                case R.id.selectAll:
                    m17315c(new C0972q0(0, this.f12992g.m3586k().length()));
                    break;
                case R.id.cut:
                    m17318f(277);
                    break;
                case R.id.copy:
                    m17318f(278);
                    break;
                case R.id.paste:
                    m17318f(279);
                    break;
            }
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i10) {
        int iM3558a;
        boolean z10 = this.f12996k;
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
        this.f12986a.mo17198c(iM3558a);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            C4413e.f12907a.m17226b(this.f12988c, this.f12989d, handwritingGesture, this.f12990e, executor, intConsumer, new InterfaceC0184l() { // from class: l0.q2
                @Override // p010a9.InterfaceC0184l
                /* JADX INFO: renamed from: m */
                public final Object mo27m(Object obj) {
                    return InputConnectionC4468r2.m17314b(this.f12984q, (InterfaceC0955i) obj);
                }
            });
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z10 = this.f12996k;
        if (z10) {
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C4413e.f12907a.m17227c(this.f12988c, this.f12989d, previewableHandwritingGesture, cancellationSignal);
        }
        return false;
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
        boolean z14 = this.f12996k;
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
        this.f12986a.mo17197b(z16, z17, z12, z13, z10, z11);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f12996k;
        if (!z10) {
            return z10;
        }
        this.f12986a.mo17196a(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i10, int i11) {
        boolean z10 = this.f12996k;
        if (z10) {
            m17315c(new C0968o0(i10, i11));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i10) {
        boolean z10 = this.f12996k;
        if (z10) {
            m17315c(new C0970p0(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i10, int i11) {
        boolean z10 = this.f12996k;
        if (!z10) {
            return z10;
        }
        m17315c(new C0972q0(i10, i11));
        return true;
    }
}
