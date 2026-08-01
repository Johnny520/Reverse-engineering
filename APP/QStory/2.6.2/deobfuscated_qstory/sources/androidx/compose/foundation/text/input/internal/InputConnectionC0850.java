package androidx.compose.foundation.text.input.internal;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.appcompat.app.C0113;
import androidx.compose.foundation.text.C0943;
import androidx.compose.foundation.text.C0963;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.contextmenu.internal.AbstractC0789;
import androidx.compose.foundation.text.selection.C0882;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.platform.InterfaceC1863;
import androidx.compose.ui.text.C2033;
import androidx.compose.ui.text.C2034;
import androidx.compose.ui.text.C2035;
import androidx.compose.ui.text.C2068;
import androidx.compose.ui.text.input.C2006;
import androidx.compose.ui.text.input.C2007;
import androidx.compose.ui.text.input.C2010;
import androidx.compose.ui.text.input.C2011;
import androidx.compose.ui.text.input.C2013;
import androidx.compose.ui.text.input.C2015;
import androidx.compose.ui.text.input.C2016;
import androidx.compose.ui.text.input.C2027;
import androidx.compose.ui.text.input.C2028;
import androidx.compose.ui.text.input.InterfaceC2005;
import io.ktor.client.plugins.AbstractC3932;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class InputConnectionC0850 implements InputConnection {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f2380;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC1863 f2381;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C0882 f2382;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C0943 f2383;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f2384;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0113 f2385;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f2386;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C2013 f2387;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public boolean f2389;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final ArrayList f2390 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public boolean f2388 = true;

    public InputConnectionC0850(C2013 c2013, C0113 c0113, boolean z, C0943 c0943, C0882 c0882, InterfaceC1863 interfaceC1863) {
        this.f2385 = c0113;
        this.f2384 = z;
        this.f2383 = c0943;
        this.f2382 = c0882;
        this.f2381 = interfaceC1863;
        this.f2387 = c2013;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.f2388;
        if (!z) {
            return z;
        }
        this.f2380++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.f2388;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f2390.clear();
        this.f2380 = 0;
        this.f2388 = false;
        ArrayList arrayList = ((C0851) this.f2385.f357).f2403;
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
        boolean z = this.f2388;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.f2388;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.f2388;
        return z ? this.f2384 : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.f2388;
        if (z) {
            m1655(new C2010(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.f2388;
        if (!z) {
            return z;
        }
        m1655(new C2007(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.f2388;
        if (!z) {
            return z;
        }
        m1655(new C2006(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return m1654();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.f2388;
        if (!z) {
            return z;
        }
        m1655(new C2027());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        C2013 c2013 = this.f2387;
        return TextUtils.getCapsMode(c2013.f5946.f6128, C2035.m3747(c2013.f5945), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.f2389 = z;
        if (z) {
            this.f2386 = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return AbstractC0857.m1659(this.f2387);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (C2035.m3742(this.f2387.f5945)) {
            return null;
        }
        return AbstractC3932.m8312(this.f2387).f6128;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return AbstractC3932.m8316(this.f2387, i).f6128;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return AbstractC3932.m8317(this.f2387, i).f6128;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.f2388;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    m1655(new C2016(0, this.f2387.f5946.f6128.length()));
                    break;
                case R.id.cut:
                    m1653(277);
                    return false;
                case R.id.copy:
                    m1653(278);
                    return false;
                case R.id.paste:
                    m1653(279);
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
        boolean z = this.f2388;
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
                ((C0851) this.f2385.f357).f2393.invoke(new C2028(i2));
            } else {
                i2 = 1;
                ((C0851) this.f2385.f357).f2393.invoke(new C2028(i2));
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0331  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void performHandwritingGesture(android.view.inputmethod.HandwritingGesture r19, java.util.concurrent.Executor r20, java.util.function.IntConsumer r21) {
        /*
            Method dump skipped, instruction units count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.InputConnectionC0850.performHandwritingGesture(android.view.inputmethod.HandwritingGesture, java.util.concurrent.Executor, java.util.function.IntConsumer):void");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.f2388;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        C0943 c0943;
        C2068 c2068;
        C2033 c2033;
        C2034 c2034;
        if (Build.VERSION.SDK_INT >= 34 && (c0943 = this.f2383) != null && (c2068 = c0943.f2687) != null) {
            C0963 c0963M1855 = c0943.m1855();
            if (c2068.equals((c0963M1855 == null || (c2033 = c0963M1855.f2744) == null || (c2034 = c2033.f5990) == null) ? null : c2034.f5996)) {
                boolean zM1598 = AbstractC0789.m1598(previewableHandwritingGesture);
                final C0882 c0882 = this.f2382;
                if (zM1598) {
                    SelectGesture selectGestureM1604 = AbstractC0789.m1604(previewableHandwritingGesture);
                    if (c0882 != null) {
                        long jM1668 = AbstractC0857.m1668(c0943, AbstractC1581.m2861(selectGestureM1604.getSelectionArea()), selectGestureM1604.getGranularity() != 1 ? 0 : 1);
                        C0943 c09432 = c0882.f2486;
                        if (c09432 != null) {
                            c09432.m1853(jM1668);
                        }
                        C0943 c09433 = c0882.f2486;
                        if (c09433 != null) {
                            c09433.m1854(C2035.f6002);
                        }
                        if (!C2035.m3742(jM1668)) {
                            c0882.m1743(false);
                            c0882.m1752(HandleState.None);
                        }
                    }
                } else if (AbstractC0871.m1704(previewableHandwritingGesture)) {
                    DeleteGesture deleteGestureM1706 = AbstractC0871.m1706(previewableHandwritingGesture);
                    if (c0882 != null) {
                        long jM16682 = AbstractC0857.m1668(c0943, AbstractC1581.m2861(deleteGestureM1706.getDeletionArea()), deleteGestureM1706.getGranularity() != 1 ? 0 : 1);
                        C0943 c09434 = c0882.f2486;
                        if (c09434 != null) {
                            c09434.m1854(jM16682);
                        }
                        C0943 c09435 = c0882.f2486;
                        if (c09435 != null) {
                            c09435.m1853(C2035.f6002);
                        }
                        if (!C2035.m3742(jM16682)) {
                            c0882.m1743(false);
                            c0882.m1752(HandleState.None);
                        }
                    }
                } else if (AbstractC0871.m1688(previewableHandwritingGesture)) {
                    SelectRangeGesture selectRangeGestureM1710 = AbstractC0871.m1710(previewableHandwritingGesture);
                    if (c0882 != null) {
                        long jM1661 = AbstractC0857.m1661(c0943, AbstractC1581.m2861(selectRangeGestureM1710.getSelectionStartArea()), AbstractC1581.m2861(selectRangeGestureM1710.getSelectionEndArea()), selectRangeGestureM1710.getGranularity() != 1 ? 0 : 1);
                        C0943 c09436 = c0882.f2486;
                        if (c09436 != null) {
                            c09436.m1853(jM1661);
                        }
                        C0943 c09437 = c0882.f2486;
                        if (c09437 != null) {
                            c09437.m1854(C2035.f6002);
                        }
                        if (!C2035.m3742(jM1661)) {
                            c0882.m1743(false);
                            c0882.m1752(HandleState.None);
                        }
                    }
                } else if (AbstractC0871.m1687(previewableHandwritingGesture)) {
                    DeleteRangeGesture deleteRangeGestureM1705 = AbstractC0871.m1705(previewableHandwritingGesture);
                    if (c0882 != null) {
                        long jM16612 = AbstractC0857.m1661(c0943, AbstractC1581.m2861(deleteRangeGestureM1705.getDeletionStartArea()), AbstractC1581.m2861(deleteRangeGestureM1705.getDeletionEndArea()), deleteRangeGestureM1705.getGranularity() != 1 ? 0 : 1);
                        C0943 c09438 = c0882.f2486;
                        if (c09438 != null) {
                            c09438.m1854(jM16612);
                        }
                        C0943 c09439 = c0882.f2486;
                        if (c09439 != null) {
                            c09439.m1853(C2035.f6002);
                        }
                        if (!C2035.m3742(jM16612)) {
                            c0882.m1743(false);
                            c0882.m1752(HandleState.None);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.compose.foundation.text.input.internal.飘花落叶言子楪哲兰苏世
                        @Override // android.os.CancellationSignal.OnCancelListener
                        public final void onCancel() {
                            C0882 c08822 = c0882;
                            if (c08822 != null) {
                                C0943 c094310 = c08822.f2486;
                                if (c094310 != null) {
                                    c094310.m1854(C2035.f6002);
                                }
                                C0943 c094311 = c08822.f2486;
                                if (c094311 != null) {
                                    c094311.m1853(C2035.f6002);
                                }
                            }
                        }
                    });
                }
                return true;
            }
        }
        return false;
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
            boolean r0 = r9.f2388
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
            androidx.appcompat.app.飘花落叶言子苏楪哲兰世 r9 = r9.f2385
            java.lang.Object r9 = r9.f357
            androidx.compose.foundation.text.input.internal.飘花落叶言子世楪哲苏兰 r9 = (androidx.compose.foundation.text.input.internal.C0851) r9
            androidx.compose.foundation.text.input.internal.飘花落叶言子楪兰哲苏世 r9 = r9.f2397
            java.lang.Object r4 = r9.f2427
            monitor-enter(r4)
            r9.f2424 = r5     // Catch: java.lang.Throwable -> L6f
            r9.f2436 = r6     // Catch: java.lang.Throwable -> L6f
            r9.f2435 = r1     // Catch: java.lang.Throwable -> L6f
            r9.f2439 = r10     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L71
            r9.f2425 = r2     // Catch: java.lang.Throwable -> L6f
            androidx.compose.ui.text.input.飘花落叶言子楪兰哲世苏 r10 = r9.f2440     // Catch: java.lang.Throwable -> L6f
            if (r10 == 0) goto L71
            r9.m1683()     // Catch: java.lang.Throwable -> L6f
            goto L71
        L6f:
            r9 = move-exception
            goto L75
        L71:
            r9.f2426 = r3     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r4)
            return r2
        L75:
            monitor-exit(r4)
            throw r9
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.InputConnectionC0850.requestCursorUpdates(int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.f2388;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((C0851) this.f2385.f357).f2400.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.f2388;
        if (z) {
            m1655(new C2011(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.f2388;
        if (z) {
            m1655(new C2015(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.f2388;
        if (!z) {
            return z;
        }
        m1655(new C2016(i, i2));
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m1653(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m1654() {
        int i = this.f2380 - 1;
        this.f2380 = i;
        if (i == 0) {
            ArrayList arrayList = this.f2390;
            if (!arrayList.isEmpty()) {
                ((C0851) this.f2385.f357).f2394.invoke(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.f2380 > 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m1655(InterfaceC2005 interfaceC2005) {
        this.f2380++;
        try {
            this.f2390.add(interfaceC2005);
        } finally {
            m1654();
        }
    }
}
