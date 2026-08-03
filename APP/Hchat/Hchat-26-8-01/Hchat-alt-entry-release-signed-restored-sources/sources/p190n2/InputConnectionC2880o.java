package p190n2;

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
import gg.AbstractC1416l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p080fb.AbstractC1184v0;
import p119i2.C1939m0;
import p129ig.AbstractC2043a;
import p174m.C2571a;

/* JADX INFO: renamed from: n2.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class InputConnectionC2880o implements InputConnection {

    /* JADX INFO: renamed from: a */
    public final C2571a f9302a;

    /* JADX INFO: renamed from: b */
    public final boolean f9303b;

    /* JADX INFO: renamed from: c */
    public int f9304c;

    /* JADX INFO: renamed from: d */
    public C2884s f9305d;

    /* JADX INFO: renamed from: e */
    public int f9306e;

    /* JADX INFO: renamed from: f */
    public boolean f9307f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f9308g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public boolean f9309h = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InputConnectionC2880o(C2884s c2884s, C2571a c2571a, boolean z9) {
        this.f9302a = c2571a;
        this.f9303b = z9;
        this.f9305d = c2884s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m6287a(InterfaceC2872g interfaceC2872g) {
        this.f9304c++;
        try {
            this.f9308g.add(interfaceC2872g);
        } finally {
            m6288b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m6288b() {
        int i9 = this.f9304c - 1;
        this.f9304c = i9;
        if (i9 == 0) {
            ArrayList arrayList = this.f9308g;
            if (!arrayList.isEmpty()) {
                ((C2887v) this.f9302a.f8339h).f9330e.invoke(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.f9304c > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z9 = this.f9309h;
        if (!z9) {
            return z9;
        }
        this.f9304c++;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m6289c(int i9) {
        sendKeyEvent(new KeyEvent(0, i9));
        sendKeyEvent(new KeyEvent(1, i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i9) {
        boolean z9 = this.f9309h;
        if (z9) {
            return false;
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f9308g.clear();
        this.f9304c = 0;
        this.f9309h = false;
        ArrayList arrayList = ((C2887v) this.f9302a.f8339h).f9334i;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (AbstractC1416l.m3825a(((WeakReference) arrayList.get(i9)).get(), this)) {
                arrayList.remove(i9);
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z9 = this.f9309h;
        if (z9) {
            return false;
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i9, Bundle bundle) {
        boolean z9 = this.f9309h;
        if (z9) {
            return false;
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z9 = this.f9309h;
        return z9 ? this.f9303b : z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i9) {
        boolean z9 = this.f9309h;
        if (z9) {
            m6287a(new C2865a(String.valueOf(charSequence), i9));
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i9, int i10) {
        boolean z9 = this.f9309h;
        if (!z9) {
            return z9;
        }
        m6287a(new C2870e(i9, i10));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i9, int i10) {
        boolean z9 = this.f9309h;
        if (!z9) {
            return z9;
        }
        m6287a(new C2871f(i9, i10));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return m6288b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z9 = this.f9309h;
        if (!z9) {
            return z9;
        }
        m6287a(new C2873h());
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i9) {
        C2884s c2884s = this.f9305d;
        return TextUtils.getCapsMode(c2884s.f9316a.f6529h, C1939m0.m4816f(c2884s.f9317b), i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i9) {
        boolean z9 = (i9 & 1) != 0;
        this.f9307f = z9;
        if (z9) {
            this.f9306e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return AbstractC1184v0.m3187N(this.f9305d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i9) {
        if (C1939m0.m4813c(this.f9305d.f9317b)) {
            return null;
        }
        return AbstractC2043a.m5052z(this.f9305d).f6529h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i9, int i10) {
        return AbstractC2043a.m4996B(this.f9305d, i9).f6529h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i9, int i10) {
        return AbstractC2043a.m4997C(this.f9305d, i9).f6529h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i9) {
        boolean z9 = this.f9309h;
        if (z9) {
            z9 = false;
            switch (i9) {
                case R.id.selectAll:
                    m6287a(new C2883r(0, this.f9305d.f9316a.f6529h.length()));
                    break;
                case R.id.cut:
                    m6289c(277);
                    return false;
                case R.id.copy:
                    m6289c(278);
                    return false;
                case R.id.paste:
                    m6289c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i9) {
        int i10;
        boolean z9 = this.f9309h;
        if (z9) {
            z9 = true;
            if (i9 != 0) {
                switch (i9) {
                    case 2:
                        i10 = 2;
                        break;
                    case 3:
                        i10 = 3;
                        break;
                    case 4:
                        i10 = 4;
                        break;
                    case 5:
                        i10 = 6;
                        break;
                    case 6:
                        i10 = 7;
                        break;
                    case 7:
                        i10 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i9);
                        i10 = 1;
                        break;
                }
                ((C2887v) this.f9302a.f8339h).f9331f.invoke(new C2874i(i10));
            } else {
                i10 = 1;
                ((C2887v) this.f9302a.f8339h).f9331f.invoke(new C2874i(i10));
            }
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z9 = this.f9309h;
        if (z9) {
            return true;
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z9) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean requestCursorUpdates(int i9) {
        boolean z9;
        boolean z10;
        boolean z11;
        C2868c c2868c;
        boolean z12 = this.f9309h;
        if (!z12) {
            return z12;
        }
        boolean z13 = false;
        boolean z14 = (i9 & 1) != 0;
        boolean z15 = (i9 & 2) != 0;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            z10 = (i9 & 16) != 0;
            z11 = (i9 & 8) != 0;
            boolean z16 = (i9 & 4) != 0;
            if (i10 >= 34 && (i9 & 32) != 0) {
                z13 = true;
            }
            if (z10 || z11 || z16 || z13) {
                z9 = z13;
                z13 = z16;
                c2868c = ((C2887v) this.f9302a.f8339h).f9337l;
                synchronized (c2868c.f9271c) {
                    try {
                        c2868c.f9274f = z10;
                        c2868c.f9275g = z11;
                        c2868c.f9276h = z13;
                        c2868c.f9277i = z9;
                        if (z14) {
                            c2868c.f9273e = true;
                            if (c2868c.f9278j != null) {
                                c2868c.m6284a();
                            }
                        }
                        c2868c.f9272d = z15;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return true;
            }
            if (i10 >= 34) {
                z9 = true;
                z13 = true;
            } else {
                z9 = z13;
                z13 = true;
            }
            z10 = z13;
        } else {
            z9 = false;
            z10 = true;
        }
        z11 = z10;
        c2868c = ((C2887v) this.f9302a.f8339h).f9337l;
        synchronized (c2868c.f9271c) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, sf.c] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z9 = this.f9309h;
        if (!z9) {
            return z9;
        }
        ((BaseInputConnection) ((C2887v) this.f9302a.f8339h).f9335j.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i9, int i10) {
        boolean z9 = this.f9309h;
        if (z9) {
            m6287a(new C2881p(i9, i10));
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i9) {
        boolean z9 = this.f9309h;
        if (z9) {
            m6287a(new C2882q(String.valueOf(charSequence), i9));
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i9, int i10) {
        boolean z9 = this.f9309h;
        if (!z9) {
            return z9;
        }
        m6287a(new C2883r(i9, i10));
        return true;
    }
}
