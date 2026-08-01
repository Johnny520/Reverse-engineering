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
import com.bumptech.glide.AbstractC3065;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class InputConnectionC0850 implements InputConnection {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f2381;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC1863 f2382;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C0882 f2383;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C0943 f2384;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f2385;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0113 f2386;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f2387;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C2013 f2388;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public boolean f2390;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final ArrayList f2391 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public boolean f2389 = true;

    public InputConnectionC0850(C2013 c2013, C0113 c0113, boolean z, C0943 c0943, C0882 c0882, InterfaceC1863 interfaceC1863) {
        this.f2386 = c0113;
        this.f2385 = z;
        this.f2384 = c0943;
        this.f2383 = c0882;
        this.f2382 = interfaceC1863;
        this.f2388 = c2013;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.f2389;
        if (!z) {
            return z;
        }
        this.f2381++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.f2389;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f2391.clear();
        this.f2381 = 0;
        this.f2389 = false;
        ArrayList arrayList = ((C0851) this.f2386.f357).f2404;
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
        boolean z = this.f2389;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.f2389;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.f2389;
        return z ? this.f2385 : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.f2389;
        if (z) {
            m1665(new C2010(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.f2389;
        if (!z) {
            return z;
        }
        m1665(new C2007(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.f2389;
        if (!z) {
            return z;
        }
        m1665(new C2006(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return m1664();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.f2389;
        if (!z) {
            return z;
        }
        m1665(new C2027());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        C2013 c2013 = this.f2388;
        return TextUtils.getCapsMode(c2013.f5947.f6129, C2035.m3757(c2013.f5946), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.f2390 = z;
        if (z) {
            this.f2387 = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return AbstractC0857.m1669(this.f2388);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (C2035.m3752(this.f2388.f5946)) {
            return null;
        }
        return AbstractC3065.m6829(this.f2388).f6129;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return AbstractC3065.m6826(this.f2388, i).f6129;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return AbstractC3065.m6827(this.f2388, i).f6129;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.f2389;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    m1665(new C2016(0, this.f2388.f5947.f6129.length()));
                    break;
                case R.id.cut:
                    m1663(277);
                    return false;
                case R.id.copy:
                    m1663(278);
                    return false;
                case R.id.paste:
                    m1663(279);
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
        boolean z = this.f2389;
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
                ((C0851) this.f2386.f357).f2394.invoke(new C2028(i2));
            } else {
                i2 = 1;
                ((C0851) this.f2386.f357).f2394.invoke(new C2028(i2));
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
        boolean z = this.f2389;
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
        if (Build.VERSION.SDK_INT >= 34 && (c0943 = this.f2384) != null && (c2068 = c0943.f2688) != null) {
            C0963 c0963M1865 = c0943.m1865();
            if (c2068.equals((c0963M1865 == null || (c2033 = c0963M1865.f2745) == null || (c2034 = c2033.f5991) == null) ? null : c2034.f5997)) {
                boolean zM1608 = AbstractC0789.m1608(previewableHandwritingGesture);
                final C0882 c0882 = this.f2383;
                if (zM1608) {
                    SelectGesture selectGestureM1614 = AbstractC0789.m1614(previewableHandwritingGesture);
                    if (c0882 != null) {
                        long jM1678 = AbstractC0857.m1678(c0943, AbstractC1581.m2871(selectGestureM1614.getSelectionArea()), selectGestureM1614.getGranularity() != 1 ? 0 : 1);
                        C0943 c09432 = c0882.f2487;
                        if (c09432 != null) {
                            c09432.m1863(jM1678);
                        }
                        C0943 c09433 = c0882.f2487;
                        if (c09433 != null) {
                            c09433.m1864(C2035.f6003);
                        }
                        if (!C2035.m3752(jM1678)) {
                            c0882.m1753(false);
                            c0882.m1762(HandleState.None);
                        }
                    }
                } else if (AbstractC0871.m1714(previewableHandwritingGesture)) {
                    DeleteGesture deleteGestureM1716 = AbstractC0871.m1716(previewableHandwritingGesture);
                    if (c0882 != null) {
                        long jM16782 = AbstractC0857.m1678(c0943, AbstractC1581.m2871(deleteGestureM1716.getDeletionArea()), deleteGestureM1716.getGranularity() != 1 ? 0 : 1);
                        C0943 c09434 = c0882.f2487;
                        if (c09434 != null) {
                            c09434.m1864(jM16782);
                        }
                        C0943 c09435 = c0882.f2487;
                        if (c09435 != null) {
                            c09435.m1863(C2035.f6003);
                        }
                        if (!C2035.m3752(jM16782)) {
                            c0882.m1753(false);
                            c0882.m1762(HandleState.None);
                        }
                    }
                } else if (AbstractC0871.m1698(previewableHandwritingGesture)) {
                    SelectRangeGesture selectRangeGestureM1720 = AbstractC0871.m1720(previewableHandwritingGesture);
                    if (c0882 != null) {
                        long jM1671 = AbstractC0857.m1671(c0943, AbstractC1581.m2871(selectRangeGestureM1720.getSelectionStartArea()), AbstractC1581.m2871(selectRangeGestureM1720.getSelectionEndArea()), selectRangeGestureM1720.getGranularity() != 1 ? 0 : 1);
                        C0943 c09436 = c0882.f2487;
                        if (c09436 != null) {
                            c09436.m1863(jM1671);
                        }
                        C0943 c09437 = c0882.f2487;
                        if (c09437 != null) {
                            c09437.m1864(C2035.f6003);
                        }
                        if (!C2035.m3752(jM1671)) {
                            c0882.m1753(false);
                            c0882.m1762(HandleState.None);
                        }
                    }
                } else if (AbstractC0871.m1697(previewableHandwritingGesture)) {
                    DeleteRangeGesture deleteRangeGestureM1715 = AbstractC0871.m1715(previewableHandwritingGesture);
                    if (c0882 != null) {
                        long jM16712 = AbstractC0857.m1671(c0943, AbstractC1581.m2871(deleteRangeGestureM1715.getDeletionStartArea()), AbstractC1581.m2871(deleteRangeGestureM1715.getDeletionEndArea()), deleteRangeGestureM1715.getGranularity() != 1 ? 0 : 1);
                        C0943 c09438 = c0882.f2487;
                        if (c09438 != null) {
                            c09438.m1864(jM16712);
                        }
                        C0943 c09439 = c0882.f2487;
                        if (c09439 != null) {
                            c09439.m1863(C2035.f6003);
                        }
                        if (!C2035.m3752(jM16712)) {
                            c0882.m1753(false);
                            c0882.m1762(HandleState.None);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.compose.foundation.text.input.internal.飘花落叶言子楪哲兰苏世
                        @Override // android.os.CancellationSignal.OnCancelListener
                        public final void onCancel() {
                            C0882 c08822 = c0882;
                            if (c08822 != null) {
                                C0943 c094310 = c08822.f2487;
                                if (c094310 != null) {
                                    c094310.m1864(C2035.f6003);
                                }
                                C0943 c094311 = c08822.f2487;
                                if (c094311 != null) {
                                    c094311.m1863(C2035.f6003);
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
            boolean r0 = r9.f2389
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
            androidx.appcompat.app.飘花落叶言子苏楪哲兰世 r9 = r9.f2386
            java.lang.Object r9 = r9.f357
            androidx.compose.foundation.text.input.internal.飘花落叶言子世楪哲苏兰 r9 = (androidx.compose.foundation.text.input.internal.C0851) r9
            androidx.compose.foundation.text.input.internal.飘花落叶言子楪兰哲苏世 r9 = r9.f2398
            java.lang.Object r4 = r9.f2428
            monitor-enter(r4)
            r9.f2425 = r5     // Catch: java.lang.Throwable -> L6f
            r9.f2437 = r6     // Catch: java.lang.Throwable -> L6f
            r9.f2436 = r1     // Catch: java.lang.Throwable -> L6f
            r9.f2440 = r10     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L71
            r9.f2426 = r2     // Catch: java.lang.Throwable -> L6f
            androidx.compose.ui.text.input.飘花落叶言子楪兰哲世苏 r10 = r9.f2441     // Catch: java.lang.Throwable -> L6f
            if (r10 == 0) goto L71
            r9.m1693()     // Catch: java.lang.Throwable -> L6f
            goto L71
        L6f:
            r9 = move-exception
            goto L75
        L71:
            r9.f2427 = r3     // Catch: java.lang.Throwable -> L6f
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
        boolean z = this.f2389;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((C0851) this.f2386.f357).f2401.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.f2389;
        if (z) {
            m1665(new C2011(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.f2389;
        if (z) {
            m1665(new C2015(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.f2389;
        if (!z) {
            return z;
        }
        m1665(new C2016(i, i2));
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m1663(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m1664() {
        int i = this.f2381 - 1;
        this.f2381 = i;
        if (i == 0) {
            ArrayList arrayList = this.f2391;
            if (!arrayList.isEmpty()) {
                ((C0851) this.f2386.f357).f2395.invoke(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.f2381 > 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m1665(InterfaceC2005 interfaceC2005) {
        this.f2381++;
        try {
            this.f2391.add(interfaceC2005);
        } finally {
            m1664();
        }
    }
}
