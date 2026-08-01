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
import com.bumptech.glide.AbstractC3054;
import io.ktor.client.plugins.AbstractC3932;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class InputConnectionC2012 implements InputConnection {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f5936;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f5937;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C2013 f5938;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f5939;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f5940;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0113 f5941;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList f5943 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f5942 = true;

    public InputConnectionC2012(C2013 c2013, C0113 c0113, boolean z) {
        this.f5941 = c0113;
        this.f5940 = z;
        this.f5938 = c2013;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.f5942;
        if (!z) {
            return z;
        }
        this.f5939++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.f5942;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f5943.clear();
        this.f5939 = 0;
        this.f5942 = false;
        ArrayList arrayList = ((C2000) this.f5941.f357).f5903;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (AbstractC4394.m8917(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.f5942;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.f5942;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.f5942;
        return z ? this.f5940 : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.f5942;
        if (z) {
            m3704(new C2010(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.f5942;
        if (!z) {
            return z;
        }
        m3704(new C2007(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.f5942;
        if (!z) {
            return z;
        }
        m3704(new C2006(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return m3703();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.f5942;
        if (!z) {
            return z;
        }
        m3704(new C2027());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        C2013 c2013 = this.f5938;
        return TextUtils.getCapsMode(c2013.f5946.f6128, C2035.m3747(c2013.f5945), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.f5936 = z;
        if (z) {
            this.f5937 = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return AbstractC3054.m6579(this.f5938);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (C2035.m3742(this.f5938.f5945)) {
            return null;
        }
        return AbstractC3932.m8312(this.f5938).f6128;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return AbstractC3932.m8316(this.f5938, i).f6128;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return AbstractC3932.m8317(this.f5938, i).f6128;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.f5942;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    m3704(new C2016(0, this.f5938.f5946.f6128.length()));
                    break;
                case R.id.cut:
                    m3702(277);
                    return false;
                case R.id.copy:
                    m3702(278);
                    return false;
                case R.id.paste:
                    m3702(279);
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
        boolean z = this.f5942;
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
                ((C2000) this.f5941.f357).f5891.invoke(new C2028(i2));
            } else {
                i2 = 1;
                ((C2000) this.f5941.f357).f5891.invoke(new C2028(i2));
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.f5942;
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
            boolean r0 = r9.f5942
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
            androidx.appcompat.app.飘花落叶言子苏楪哲兰世 r9 = r9.f5941
            java.lang.Object r9 = r9.f357
            androidx.compose.ui.text.input.飘花落叶言子世楪哲苏兰 r9 = (androidx.compose.ui.text.input.C2000) r9
            androidx.compose.ui.text.input.飘花落叶言子楪世苏兰哲 r9 = r9.f5902
            java.lang.Object r4 = r9.f5917
            monitor-enter(r4)
            r9.f5914 = r5     // Catch: java.lang.Throwable -> L6f
            r9.f5927 = r6     // Catch: java.lang.Throwable -> L6f
            r9.f5926 = r1     // Catch: java.lang.Throwable -> L6f
            r9.f5930 = r10     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L71
            r9.f5915 = r2     // Catch: java.lang.Throwable -> L6f
            androidx.compose.ui.text.input.飘花落叶言子楪兰哲世苏 r10 = r9.f5931     // Catch: java.lang.Throwable -> L6f
            if (r10 == 0) goto L71
            r9.m3701()     // Catch: java.lang.Throwable -> L6f
            goto L71
        L6f:
            r9 = move-exception
            goto L75
        L71:
            r9.f5916 = r3     // Catch: java.lang.Throwable -> L6f
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
        boolean z = this.f5942;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((C2000) this.f5941.f357).f5904.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.f5942;
        if (z) {
            m3704(new C2011(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.f5942;
        if (z) {
            m3704(new C2015(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.f5942;
        if (!z) {
            return z;
        }
        m3704(new C2016(i, i2));
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m3702(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m3703() {
        int i = this.f5939 - 1;
        this.f5939 = i;
        if (i == 0) {
            ArrayList arrayList = this.f5943;
            if (!arrayList.isEmpty()) {
                ((C2000) this.f5941.f357).f5892.invoke(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.f5939 > 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3704(InterfaceC2005 interfaceC2005) {
        this.f5939++;
        try {
            this.f5943.add(interfaceC2005);
        } finally {
            m3703();
        }
    }
}
