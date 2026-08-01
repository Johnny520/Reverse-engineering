package p115X0;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import com.bumptech.glide.AbstractC1922d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p000A.C0066i0;
import p061L2.AbstractC0973m;
import p092S0.C1259L;
import p117X2.AbstractC1665j;
import p128a.AbstractC1785a;

/* JADX INFO: renamed from: X0.q */
/* JADX INFO: loaded from: classes.dex */
public final class InputConnectionC1642q implements InputConnection {

    /* JADX INFO: renamed from: a */
    public final C0066i0 f5636a;

    /* JADX INFO: renamed from: b */
    public final boolean f5637b;

    /* JADX INFO: renamed from: c */
    public int f5638c;

    /* JADX INFO: renamed from: d */
    public C1646u f5639d;

    /* JADX INFO: renamed from: e */
    public int f5640e;

    /* JADX INFO: renamed from: f */
    public boolean f5641f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f5642g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public boolean f5643h = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InputConnectionC1642q(C1646u c1646u, C0066i0 c0066i0, boolean z5) {
        this.f5636a = c0066i0;
        this.f5637b = z5;
        this.f5639d = c1646u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m2941a(InterfaceC1632g interfaceC1632g) {
        this.f5638c++;
        try {
            this.f5642g.add(interfaceC1632g);
        } finally {
            m2942b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m2942b() {
        int i5 = this.f5638c - 1;
        this.f5638c = i5;
        if (i5 == 0) {
            ArrayList arrayList = this.f5642g;
            if (!arrayList.isEmpty()) {
                ((C1649x) this.f5636a.f297e).f5664e.mo1h(AbstractC0973m.m2026g0(arrayList));
                arrayList.clear();
            }
        }
        return this.f5638c > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z5 = this.f5643h;
        if (!z5) {
            return z5;
        }
        this.f5638c++;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m2943c(int i5) {
        sendKeyEvent(new KeyEvent(0, i5));
        sendKeyEvent(new KeyEvent(1, i5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i5) {
        boolean z5 = this.f5643h;
        if (z5) {
            return false;
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f5642g.clear();
        this.f5638c = 0;
        this.f5643h = false;
        ArrayList arrayList = ((C1649x) this.f5636a.f297e).f5668i;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (AbstractC1665j.m2981a(((WeakReference) arrayList.get(i5)).get(), this)) {
                arrayList.remove(i5);
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z5 = this.f5643h;
        if (z5) {
            return false;
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i5, Bundle bundle) {
        boolean z5 = this.f5643h;
        if (z5) {
            return false;
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z5 = this.f5643h;
        return z5 ? this.f5637b : z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i5) {
        boolean z5 = this.f5643h;
        if (z5) {
            m2941a(new C1626a(String.valueOf(charSequence), i5));
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i5, int i6) {
        boolean z5 = this.f5643h;
        if (!z5) {
            return z5;
        }
        m2941a(new C1630e(i5, i6));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i5, int i6) {
        boolean z5 = this.f5643h;
        if (!z5) {
            return z5;
        }
        m2941a(new C1631f(i5, i6));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return m2942b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z5 = this.f5643h;
        if (!z5) {
            return z5;
        }
        m2941a(new C1634i());
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i5) {
        C1646u c1646u = this.f5639d;
        return TextUtils.getCapsMode(c1646u.f5650a.f4563e, C1259L.m2338f(c1646u.f5651b), i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i5) {
        boolean z5 = (i5 & 1) != 0;
        this.f5641f = z5;
        if (z5) {
            this.f5640e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return AbstractC1785a.m3257s(this.f5639d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i5) {
        if (C1259L.m2335c(this.f5639d.f5651b)) {
            return null;
        }
        return AbstractC1922d.m3434p(this.f5639d).f4563e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i5, int i6) {
        return AbstractC1922d.m3436s(this.f5639d, i5).f4563e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i5, int i6) {
        return AbstractC1922d.m3437t(this.f5639d, i5).f4563e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i5) {
        boolean z5 = this.f5643h;
        if (z5) {
            z5 = false;
            switch (i5) {
                case R.id.selectAll:
                    m2941a(new C1645t(0, this.f5639d.f5650a.f4563e.length()));
                    break;
                case R.id.cut:
                    m2943c(277);
                    return false;
                case R.id.copy:
                    m2943c(278);
                    return false;
                case R.id.paste:
                    m2943c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i5) {
        int i6;
        boolean z5 = this.f5643h;
        if (z5) {
            z5 = true;
            if (i5 != 0) {
                switch (i5) {
                    case 2:
                        i6 = 2;
                        break;
                    case 3:
                        i6 = 3;
                        break;
                    case 4:
                        i6 = 4;
                        break;
                    case 5:
                        i6 = 6;
                        break;
                    case 6:
                        i6 = 7;
                        break;
                    case 7:
                        i6 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i5);
                        i6 = 1;
                        break;
                }
                ((C1649x) this.f5636a.f297e).f5665f.mo1h(new C1635j(i6));
            } else {
                i6 = 1;
                ((C1649x) this.f5636a.f297e).f5665f.mo1h(new C1635j(i6));
            }
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z5 = this.f5643h;
        if (z5) {
            return true;
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z5) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean requestCursorUpdates(int i5) {
        boolean z5;
        boolean z6;
        boolean z7;
        C1628c c1628c;
        boolean z8 = this.f5643h;
        if (!z8) {
            return z8;
        }
        boolean z9 = false;
        boolean z10 = (i5 & 1) != 0;
        boolean z11 = (i5 & 2) != 0;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 33) {
            z6 = (i5 & 16) != 0;
            z7 = (i5 & 8) != 0;
            boolean z12 = (i5 & 4) != 0;
            if (i6 >= 34 && (i5 & 32) != 0) {
                z9 = true;
            }
            if (z6 || z7 || z12 || z9) {
                z5 = z9;
                z9 = z12;
                c1628c = ((C1649x) this.f5636a.f297e).f5671l;
                synchronized (c1628c.f5599c) {
                    try {
                        c1628c.f5602f = z6;
                        c1628c.f5603g = z7;
                        c1628c.f5604h = z9;
                        c1628c.f5605i = z5;
                        if (z10) {
                            c1628c.f5601e = true;
                            if (c1628c.f5606j != null) {
                                c1628c.m2928a();
                            }
                        }
                        c1628c.f5600d = z11;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return true;
            }
            if (i6 >= 34) {
                z5 = true;
                z9 = true;
            } else {
                z5 = z9;
                z9 = true;
            }
            z6 = z9;
        } else {
            z5 = false;
            z6 = true;
        }
        z7 = z6;
        c1628c = ((C1649x) this.f5636a.f297e).f5671l;
        synchronized (c1628c.f5599c) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v4, types: [K2.e, java.lang.Object] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z5 = this.f5643h;
        if (!z5) {
            return z5;
        }
        ((BaseInputConnection) ((C1649x) this.f5636a.f297e).f5669j.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i5, int i6) {
        boolean z5 = this.f5643h;
        if (z5) {
            m2941a(new C1643r(i5, i6));
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i5) {
        boolean z5 = this.f5643h;
        if (z5) {
            m2941a(new C1644s(String.valueOf(charSequence), i5));
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i5, int i6) {
        boolean z5 = this.f5643h;
        if (!z5) {
            return z5;
        }
        m2941a(new C1645t(i5, i6));
        return true;
    }
}
