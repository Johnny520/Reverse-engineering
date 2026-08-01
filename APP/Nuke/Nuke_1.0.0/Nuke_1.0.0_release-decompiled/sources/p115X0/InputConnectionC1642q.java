package p115X0;

import android.R;
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

    public InputConnectionC1642q(C1646u c1646u, C0066i0 c0066i0, boolean z5) {
        this.f5636a = c0066i0;
        this.f5637b = z5;
        this.f5639d = c1646u;
    }

    /* JADX INFO: renamed from: a */
    public final void m2941a(InterfaceC1632g interfaceC1632g) {
        this.f5638c++;
        try {
            this.f5642g.add(interfaceC1632g);
        } finally {
            m2942b();
        }
    }

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

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z5 = this.f5643h;
        if (!z5) {
            return z5;
        }
        this.f5638c++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m2943c(int i5) {
        sendKeyEvent(new KeyEvent(0, i5));
        sendKeyEvent(new KeyEvent(1, i5));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i5) {
        boolean z5 = this.f5643h;
        if (z5) {
            return false;
        }
        return z5;
    }

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

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z5 = this.f5643h;
        if (z5) {
            return false;
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i5, Bundle bundle) {
        boolean z5 = this.f5643h;
        if (z5) {
            return false;
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z5 = this.f5643h;
        return z5 ? this.f5637b : z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i5) {
        boolean z5 = this.f5643h;
        if (z5) {
            m2941a(new C1626a(String.valueOf(charSequence), i5));
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i5, int i6) {
        boolean z5 = this.f5643h;
        if (!z5) {
            return z5;
        }
        m2941a(new C1630e(i5, i6));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i5, int i6) {
        boolean z5 = this.f5643h;
        if (!z5) {
            return z5;
        }
        m2941a(new C1631f(i5, i6));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return m2942b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z5 = this.f5643h;
        if (!z5) {
            return z5;
        }
        m2941a(new C1634i());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i5) {
        C1646u c1646u = this.f5639d;
        return TextUtils.getCapsMode(c1646u.f5650a.f4563e, C1259L.m2338f(c1646u.f5651b), i5);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i5) {
        boolean z5 = (i5 & 1) != 0;
        this.f5641f = z5;
        if (z5) {
            this.f5640e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return AbstractC1785a.m3257s(this.f5639d);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i5) {
        if (C1259L.m2335c(this.f5639d.f5651b)) {
            return null;
        }
        return AbstractC1922d.m3434p(this.f5639d).f4563e;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i5, int i6) {
        return AbstractC1922d.m3436s(this.f5639d, i5).f4563e;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i5, int i6) {
        return AbstractC1922d.m3437t(this.f5639d, i5).f4563e;
    }

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

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z5 = this.f5643h;
        if (z5) {
            return true;
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z5) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean requestCursorUpdates(int r10) {
        /*
            r9 = this;
            boolean r0 = r9.f5643h
            if (r0 == 0) goto L77
            r0 = r10 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lc
            r0 = r2
            goto Ld
        Lc:
            r0 = r1
        Ld:
            r3 = r10 & 2
            if (r3 == 0) goto L13
            r3 = r2
            goto L14
        L13:
            r3 = r1
        L14:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 < r5) goto L4d
            r5 = r10 & 16
            if (r5 == 0) goto L20
            r5 = r2
            goto L21
        L20:
            r5 = r1
        L21:
            r6 = r10 & 8
            if (r6 == 0) goto L27
            r6 = r2
            goto L28
        L27:
            r6 = r1
        L28:
            r7 = r10 & 4
            if (r7 == 0) goto L2e
            r7 = r2
            goto L2f
        L2e:
            r7 = r1
        L2f:
            r8 = 34
            if (r4 < r8) goto L38
            r10 = r10 & 32
            if (r10 == 0) goto L38
            r1 = r2
        L38:
            if (r5 != 0) goto L4a
            if (r6 != 0) goto L4a
            if (r7 != 0) goto L4a
            if (r1 != 0) goto L4a
            if (r4 < r8) goto L47
            r10 = r2
            r1 = r10
        L44:
            r5 = r1
        L45:
            r6 = r5
            goto L50
        L47:
            r10 = r1
            r1 = r2
            goto L44
        L4a:
            r10 = r1
            r1 = r7
            goto L50
        L4d:
            r10 = r1
            r5 = r2
            goto L45
        L50:
            A.i0 r4 = r9.f5636a
            java.lang.Object r4 = r4.f297e
            X0.x r4 = (p115X0.C1649x) r4
            X0.c r4 = r4.f5671l
            java.lang.Object r7 = r4.f5599c
            monitor-enter(r7)
            r4.f5602f = r5     // Catch: java.lang.Throwable -> L6f
            r4.f5603g = r6     // Catch: java.lang.Throwable -> L6f
            r4.f5604h = r1     // Catch: java.lang.Throwable -> L6f
            r4.f5605i = r10     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L71
            r4.f5601e = r2     // Catch: java.lang.Throwable -> L6f
            X0.u r10 = r4.f5606j     // Catch: java.lang.Throwable -> L6f
            if (r10 == 0) goto L71
            r4.m2928a()     // Catch: java.lang.Throwable -> L6f
            goto L71
        L6f:
            r10 = move-exception
            goto L75
        L71:
            r4.f5600d = r3     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r7)
            return r2
        L75:
            monitor-exit(r7)
            throw r10
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p115X0.InputConnectionC1642q.requestCursorUpdates(int):boolean");
    }

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

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i5, int i6) {
        boolean z5 = this.f5643h;
        if (z5) {
            m2941a(new C1643r(i5, i6));
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i5) {
        boolean z5 = this.f5643h;
        if (z5) {
            m2941a(new C1644s(String.valueOf(charSequence), i5));
        }
        return z5;
    }

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
