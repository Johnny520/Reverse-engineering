package androidx.compose.ui.text.input;

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
import androidx.appcompat.app.C0113;
import androidx.compose.ui.text.C2035;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3065;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class InputConnectionC2012 implements InputConnection {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f5937;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f5938;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C2013 f5939;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f5940;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f5941;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0113 f5942;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList f5944 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f5943 = true;

    public InputConnectionC2012(C2013 c2013, C0113 c0113, boolean z) {
        this.f5942 = c0113;
        this.f5941 = z;
        this.f5939 = c2013;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.f5943;
        if (!z) {
            return z;
        }
        this.f5940++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.f5943;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f5944.clear();
        this.f5940 = 0;
        this.f5943 = false;
        ArrayList arrayList = ((C2000) this.f5942.f357).f5904;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (AbstractC4395.m8907(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.f5943;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.f5943;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.f5943;
        return z ? this.f5941 : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.f5943;
        if (z) {
            m3714(new C2010(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.f5943;
        if (!z) {
            return z;
        }
        m3714(new C2007(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.f5943;
        if (!z) {
            return z;
        }
        m3714(new C2006(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return m3713();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.f5943;
        if (!z) {
            return z;
        }
        m3714(new C2027());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        C2013 c2013 = this.f5939;
        return TextUtils.getCapsMode(c2013.f5947.f6129, C2035.m3757(c2013.f5946), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.f5937 = z;
        if (z) {
            this.f5938 = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return AbstractC3056.m6730(this.f5939);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (C2035.m3752(this.f5939.f5946)) {
            return null;
        }
        return AbstractC3065.m6829(this.f5939).f6129;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return AbstractC3065.m6826(this.f5939, i).f6129;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return AbstractC3065.m6827(this.f5939, i).f6129;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.f5943;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    m3714(new C2016(0, this.f5939.f5947.f6129.length()));
                    break;
                case R.id.cut:
                    m3712(277);
                    return false;
                case R.id.copy:
                    m3712(278);
                    return false;
                case R.id.paste:
                    m3712(279);
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
        boolean z = this.f5943;
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
                    case 6:
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
                ((C2000) this.f5942.f357).f5892.invoke(new C2028(i2));
            } else {
                i2 = 1;
                ((C2000) this.f5942.f357).f5892.invoke(new C2028(i2));
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.f5943;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean requestCursorUpdates(int r10) {
        /*
            r9 = this;
            boolean r0 = r9.f5943
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
            androidx.appcompat.app.飘花落叶言子苏楪哲兰世 r9 = r9.f5942
            java.lang.Object r9 = r9.f357
            androidx.compose.ui.text.input.飘花落叶言子世楪哲苏兰 r9 = (androidx.compose.ui.text.input.C2000) r9
            androidx.compose.ui.text.input.飘花落叶言子楪世苏兰哲 r9 = r9.f5903
            java.lang.Object r4 = r9.f5918
            monitor-enter(r4)
            r9.f5915 = r5     // Catch: java.lang.Throwable -> L6f
            r9.f5928 = r6     // Catch: java.lang.Throwable -> L6f
            r9.f5927 = r1     // Catch: java.lang.Throwable -> L6f
            r9.f5931 = r10     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L71
            r9.f5916 = r2     // Catch: java.lang.Throwable -> L6f
            androidx.compose.ui.text.input.飘花落叶言子楪兰哲世苏 r10 = r9.f5932     // Catch: java.lang.Throwable -> L6f
            if (r10 == 0) goto L71
            r9.m3711()     // Catch: java.lang.Throwable -> L6f
            goto L71
        L6f:
            r9 = move-exception
            goto L75
        L71:
            r9.f5917 = r3     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r4)
            return r2
        L75:
            monitor-exit(r4)
            throw r9
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.input.InputConnectionC2012.requestCursorUpdates(int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.f5943;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((C2000) this.f5942.f357).f5905.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.f5943;
        if (z) {
            m3714(new C2011(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.f5943;
        if (z) {
            m3714(new C2015(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.f5943;
        if (!z) {
            return z;
        }
        m3714(new C2016(i, i2));
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m3712(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m3713() {
        int i = this.f5940 - 1;
        this.f5940 = i;
        if (i == 0) {
            ArrayList arrayList = this.f5944;
            if (!arrayList.isEmpty()) {
                ((C2000) this.f5942.f357).f5893.invoke(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.f5940 > 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3714(InterfaceC2005 interfaceC2005) {
        this.f5940++;
        try {
            this.f5944.add(interfaceC2005);
        } finally {
            m3713();
        }
    }
}
