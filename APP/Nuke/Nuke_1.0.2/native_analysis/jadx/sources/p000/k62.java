package p000;

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
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class k62 implements InputConnection {

    /* JADX INFO: renamed from: a */
    public final hh1 f5354a;

    /* JADX INFO: renamed from: b */
    public final boolean f5355b;

    /* JADX INFO: renamed from: c */
    public int f5356c;

    /* JADX INFO: renamed from: d */
    public k03 f5357d;

    /* JADX INFO: renamed from: e */
    public int f5358e;

    /* JADX INFO: renamed from: f */
    public boolean f5359f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f5360g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public boolean f5361h = true;

    public k62(k03 k03Var, hh1 hh1Var, boolean z) {
        this.f5354a = hh1Var;
        this.f5355b = z;
        this.f5357d = k03Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m2611a(rd0 rd0Var) {
        this.f5356c++;
        try {
            this.f5360g.add(rd0Var);
        } finally {
            m2612b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2612b() {
        int i = this.f5356c - 1;
        this.f5356c = i;
        if (i == 0) {
            ArrayList arrayList = this.f5360g;
            if (!arrayList.isEmpty()) {
                ((q03) this.f5354a.f4019i).f8671e.mo5j(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.f5356c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.f5361h;
        if (!z) {
            return z;
        }
        this.f5356c++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m2613c(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.f5361h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f5360g.clear();
        this.f5356c = 0;
        this.f5361h = false;
        ArrayList arrayList = ((q03) this.f5354a.f4019i).f8675i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (t11.m5086l(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.f5361h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.f5361h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.f5361h;
        return z ? this.f5355b : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.f5361h;
        if (z) {
            m2611a(new C0180ev(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.f5361h;
        if (!z) {
            return z;
        }
        m2611a(new z60(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.f5361h;
        if (!z) {
            return z;
        }
        m2611a(new a70(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return m2612b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.f5361h;
        if (!z) {
            return z;
        }
        m2611a(new ej0());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        k03 k03Var = this.f5357d;
        return TextUtils.getCapsMode(k03Var.f5296a.f10051i, f13.m1497f(k03Var.f5297b), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.f5359f = z;
        if (z) {
            this.f5358e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return AbstractC0179eu.m1451c0(this.f5357d);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (f13.m1494c(this.f5357d.f5297b)) {
            return null;
        }
        return t11.m5049A(this.f5357d).f10051i;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return t11.m5050B(this.f5357d, i).f10051i;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return t11.m5051C(this.f5357d, i).f10051i;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.f5361h;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    m2611a(new mp2(0, this.f5357d.f5296a.f10051i.length()));
                    break;
                case R.id.cut:
                    m2613c(277);
                    return false;
                case R.id.copy:
                    m2613c(278);
                    return false;
                case R.id.paste:
                    m2613c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.f5361h;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case AIChatConfig.DefaultContextRounds /* 6 */:
                        i2 = 7;
                        break;
                    case 7:
                        i2 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                        i2 = 1;
                        break;
                }
                ((q03) this.f5354a.f4019i).f8672f.mo5j(new wx0(i2));
            } else {
                i2 = 1;
                ((q03) this.f5354a.f4019i).f8672f.mo5j(new wx0(i2));
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.f5361h;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        t30 t30Var;
        boolean z4 = this.f5361h;
        if (!z4) {
            return z4;
        }
        boolean z5 = false;
        boolean z6 = (i & 1) != 0;
        boolean z7 = (i & 2) != 0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            z2 = (i & 16) != 0;
            z3 = (i & 8) != 0;
            boolean z8 = (i & 4) != 0;
            if (i2 >= 34 && (i & 32) != 0) {
                z5 = true;
            }
            if (z2 || z3 || z8 || z5) {
                z = z5;
                z5 = z8;
                t30Var = ((q03) this.f5354a.f4019i).f8678l;
                synchronized (t30Var.f10511c) {
                    try {
                        t30Var.f10514f = z2;
                        t30Var.f10515g = z3;
                        t30Var.f10516h = z5;
                        t30Var.f10517i = z;
                        if (z6) {
                            t30Var.f10513e = true;
                            if (t30Var.f10518j != null) {
                                t30Var.m5114a();
                            }
                        }
                        t30Var.f10512d = z7;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return true;
            }
            if (i2 >= 34) {
                z = true;
                z5 = true;
            } else {
                z = z5;
                z5 = true;
            }
            z2 = z5;
        } else {
            z = false;
            z2 = true;
        }
        z3 = z2;
        t30Var = ((q03) this.f5354a.f4019i).f8678l;
        synchronized (t30Var.f10511c) {
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.f5361h;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((q03) this.f5354a.f4019i).f8676j.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.f5361h;
        if (z) {
            m2611a(new kp2(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.f5361h;
        if (z) {
            m2611a(new lp2(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.f5361h;
        if (!z) {
            return z;
        }
        m2611a(new mp2(i, i2));
        return true;
    }
}
