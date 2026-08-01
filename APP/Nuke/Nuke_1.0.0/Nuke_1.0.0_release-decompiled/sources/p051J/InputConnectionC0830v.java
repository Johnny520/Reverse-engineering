package p051J;

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
import com.bumptech.glide.AbstractC1922d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p000A.C0036S0;
import p000A.C0066i0;
import p000A.C0078o0;
import p000A.EnumC0052b0;
import p028F.AbstractC0359t;
import p047I0.InterfaceC0697T0;
import p058L.C0920W;
import p061L2.AbstractC0973m;
import p092S0.C1256I;
import p092S0.C1259L;
import p092S0.C1269g;
import p115X0.C1626a;
import p115X0.C1630e;
import p115X0.C1631f;
import p115X0.C1634i;
import p115X0.C1635j;
import p115X0.C1643r;
import p115X0.C1644s;
import p115X0.C1645t;
import p115X0.C1646u;
import p115X0.InterfaceC1632g;
import p117X2.AbstractC1665j;
import p211o0.AbstractC2767z;

/* JADX INFO: renamed from: J.v */
/* JADX INFO: loaded from: classes.dex */
public final class InputConnectionC0830v implements InputConnection {

    /* JADX INFO: renamed from: a */
    public final C0066i0 f2681a;

    /* JADX INFO: renamed from: b */
    public final boolean f2682b;

    /* JADX INFO: renamed from: c */
    public final C0078o0 f2683c;

    /* JADX INFO: renamed from: d */
    public final C0920W f2684d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0697T0 f2685e;

    /* JADX INFO: renamed from: f */
    public int f2686f;

    /* JADX INFO: renamed from: g */
    public C1646u f2687g;

    /* JADX INFO: renamed from: h */
    public int f2688h;

    /* JADX INFO: renamed from: i */
    public boolean f2689i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f2690j = new ArrayList();

    /* JADX INFO: renamed from: k */
    public boolean f2691k = true;

    public InputConnectionC0830v(C1646u c1646u, C0066i0 c0066i0, boolean z5, C0078o0 c0078o0, C0920W c0920w, InterfaceC0697T0 interfaceC0697T0) {
        this.f2681a = c0066i0;
        this.f2682b = z5;
        this.f2683c = c0078o0;
        this.f2684d = c0920w;
        this.f2685e = interfaceC0697T0;
        this.f2687g = c1646u;
    }

    /* JADX INFO: renamed from: a */
    public final void m1472a(InterfaceC1632g interfaceC1632g) {
        this.f2686f++;
        try {
            this.f2690j.add(interfaceC1632g);
        } finally {
            m1473b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1473b() {
        int i5 = this.f2686f - 1;
        this.f2686f = i5;
        if (i5 == 0) {
            ArrayList arrayList = this.f2690j;
            if (!arrayList.isEmpty()) {
                ((C0829u) this.f2681a.f297e).f2670c.mo1h(AbstractC0973m.m2026g0(arrayList));
                arrayList.clear();
            }
        }
        return this.f2686f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z5 = this.f2691k;
        if (!z5) {
            return z5;
        }
        this.f2686f++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m1474c(int i5) {
        sendKeyEvent(new KeyEvent(0, i5));
        sendKeyEvent(new KeyEvent(1, i5));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i5) {
        boolean z5 = this.f2691k;
        if (z5) {
            return false;
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f2690j.clear();
        this.f2686f = 0;
        this.f2691k = false;
        ArrayList arrayList = ((C0829u) this.f2681a.f297e).f2677j;
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
        boolean z5 = this.f2691k;
        if (z5) {
            return false;
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i5, Bundle bundle) {
        boolean z5 = this.f2691k;
        if (z5) {
            return false;
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z5 = this.f2691k;
        return z5 ? this.f2682b : z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i5) {
        boolean z5 = this.f2691k;
        if (z5) {
            m1472a(new C1626a(String.valueOf(charSequence), i5));
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i5, int i6) {
        boolean z5 = this.f2691k;
        if (!z5) {
            return z5;
        }
        m1472a(new C1630e(i5, i6));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i5, int i6) {
        boolean z5 = this.f2691k;
        if (!z5) {
            return z5;
        }
        m1472a(new C1631f(i5, i6));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return m1473b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z5 = this.f2691k;
        if (!z5) {
            return z5;
        }
        m1472a(new C1634i());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i5) {
        C1646u c1646u = this.f2687g;
        return TextUtils.getCapsMode(c1646u.f5650a.f4563e, C1259L.m2338f(c1646u.f5651b), i5);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i5) {
        boolean z5 = (i5 & 1) != 0;
        this.f2689i = z5;
        if (z5) {
            this.f2688h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return AbstractC0825q.m1459d(this.f2687g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i5) {
        if (C1259L.m2335c(this.f2687g.f5651b)) {
            return null;
        }
        return AbstractC1922d.m3434p(this.f2687g).f4563e;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i5, int i6) {
        return AbstractC1922d.m3436s(this.f2687g, i5).f4563e;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i5, int i6) {
        return AbstractC1922d.m3437t(this.f2687g, i5).f4563e;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i5) {
        boolean z5 = this.f2691k;
        if (z5) {
            z5 = false;
            switch (i5) {
                case R.id.selectAll:
                    m1472a(new C1645t(0, this.f2687g.f5650a.f4563e.length()));
                    break;
                case R.id.cut:
                    m1474c(277);
                    return false;
                case R.id.copy:
                    m1474c(278);
                    return false;
                case R.id.paste:
                    m1474c(279);
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
        boolean z5 = this.f2691k;
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
                ((C0829u) this.f2681a.f297e).f2671d.mo1h(new C1635j(i6));
            } else {
                i6 = 1;
                ((C0829u) this.f2681a.f297e).f2671d.mo1h(new C1635j(i6));
            }
        }
        return z5;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x02c7  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void performHandwritingGesture(android.view.inputmethod.HandwritingGesture r21, java.util.concurrent.Executor r22, final java.util.function.IntConsumer r23) {
        /*
            Method dump skipped, instruction units count: 1023
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p051J.InputConnectionC0830v.performHandwritingGesture(android.view.inputmethod.HandwritingGesture, java.util.concurrent.Executor, java.util.function.IntConsumer):void");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z5 = this.f2691k;
        if (z5) {
            return true;
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        C0078o0 c0078o0;
        C1269g c1269g;
        C1256I c1256i;
        if (Build.VERSION.SDK_INT >= 34 && (c0078o0 = this.f2683c) != null && (c1269g = c0078o0.f346j) != null) {
            C0036S0 c0036s0M123d = c0078o0.m123d();
            if (c1269g.equals((c0036s0M123d == null || (c1256i = c0036s0M123d.f161a.f4526a) == null) ? null : c1256i.f4516a)) {
                boolean zM590s = AbstractC0359t.m590s(previewableHandwritingGesture);
                EnumC0052b0 enumC0052b0 = EnumC0052b0.f211d;
                C0920W c0920w = this.f2684d;
                if (zM590s) {
                    SelectGesture selectGestureM584m = AbstractC0359t.m584m(previewableHandwritingGesture);
                    if (c0920w != null) {
                        long jM1464i = AbstractC0825q.m1464i(c0078o0, AbstractC2767z.m4955z(selectGestureM584m.getSelectionArea()), selectGestureM584m.getGranularity() != 1 ? 0 : 1);
                        C0078o0 c0078o02 = c0920w.f2868d;
                        if (c0078o02 != null) {
                            c0078o02.m125f(jM1464i);
                        }
                        C0078o0 c0078o03 = c0920w.f2868d;
                        if (c0078o03 != null) {
                            c0078o03.m124e(C1259L.f4536b);
                        }
                        if (!C1259L.m2335c(jM1464i)) {
                            c0920w.m1945t(false);
                            c0920w.m1942q(enumC0052b0);
                        }
                    }
                } else if (AbstractC0819k.m1424B(previewableHandwritingGesture)) {
                    DeleteGesture deleteGestureM1435i = AbstractC0819k.m1435i(previewableHandwritingGesture);
                    if (c0920w != null) {
                        long jM1464i2 = AbstractC0825q.m1464i(c0078o0, AbstractC2767z.m4955z(deleteGestureM1435i.getDeletionArea()), deleteGestureM1435i.getGranularity() != 1 ? 0 : 1);
                        C0078o0 c0078o04 = c0920w.f2868d;
                        if (c0078o04 != null) {
                            c0078o04.m124e(jM1464i2);
                        }
                        C0078o0 c0078o05 = c0920w.f2868d;
                        if (c0078o05 != null) {
                            c0078o05.m125f(C1259L.f4536b);
                        }
                        if (!C1259L.m2335c(jM1464i2)) {
                            c0920w.m1945t(false);
                            c0920w.m1942q(enumC0052b0);
                        }
                    }
                } else if (AbstractC0819k.m1425C(previewableHandwritingGesture)) {
                    SelectRangeGesture selectRangeGestureM1440n = AbstractC0819k.m1440n(previewableHandwritingGesture);
                    if (c0920w != null) {
                        long jM1457b = AbstractC0825q.m1457b(c0078o0, AbstractC2767z.m4955z(selectRangeGestureM1440n.getSelectionStartArea()), AbstractC2767z.m4955z(selectRangeGestureM1440n.getSelectionEndArea()), selectRangeGestureM1440n.getGranularity() != 1 ? 0 : 1);
                        C0078o0 c0078o06 = c0920w.f2868d;
                        if (c0078o06 != null) {
                            c0078o06.m125f(jM1457b);
                        }
                        C0078o0 c0078o07 = c0920w.f2868d;
                        if (c0078o07 != null) {
                            c0078o07.m124e(C1259L.f4536b);
                        }
                        if (!C1259L.m2335c(jM1457b)) {
                            c0920w.m1945t(false);
                            c0920w.m1942q(enumC0052b0);
                        }
                    }
                } else if (AbstractC0819k.m1426D(previewableHandwritingGesture)) {
                    DeleteRangeGesture deleteRangeGestureM1436j = AbstractC0819k.m1436j(previewableHandwritingGesture);
                    if (c0920w != null) {
                        long jM1457b2 = AbstractC0825q.m1457b(c0078o0, AbstractC2767z.m4955z(deleteRangeGestureM1436j.getDeletionStartArea()), AbstractC2767z.m4955z(deleteRangeGestureM1436j.getDeletionEndArea()), deleteRangeGestureM1436j.getGranularity() != 1 ? 0 : 1);
                        C0078o0 c0078o08 = c0920w.f2868d;
                        if (c0078o08 != null) {
                            c0078o08.m124e(jM1457b2);
                        }
                        C0078o0 c0078o09 = c0920w.f2868d;
                        if (c0078o09 != null) {
                            c0078o09.m125f(C1259L.f4536b);
                        }
                        if (!C1259L.m2335c(jM1457b2)) {
                            c0920w.m1945t(false);
                            c0920w.m1942q(enumC0052b0);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new C0820l(0, c0920w));
                }
                return true;
            }
        }
        return false;
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
            boolean r0 = r9.f2691k
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
            A.i0 r4 = r9.f2681a
            java.lang.Object r4 = r4.f297e
            J.u r4 = (p051J.C0829u) r4
            J.r r4 = r4.f2680m
            java.lang.Object r7 = r4.f2651c
            monitor-enter(r7)
            r4.f2654f = r5     // Catch: java.lang.Throwable -> L6f
            r4.f2655g = r6     // Catch: java.lang.Throwable -> L6f
            r4.f2656h = r1     // Catch: java.lang.Throwable -> L6f
            r4.f2657i = r10     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L71
            r4.f2653e = r2     // Catch: java.lang.Throwable -> L6f
            X0.u r10 = r4.f2658j     // Catch: java.lang.Throwable -> L6f
            if (r10 == 0) goto L71
            r4.m1470a()     // Catch: java.lang.Throwable -> L6f
            goto L71
        L6f:
            r10 = move-exception
            goto L75
        L71:
            r4.f2652d = r3     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r7)
            return r2
        L75:
            monitor-exit(r7)
            throw r10
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p051J.InputConnectionC0830v.requestCursorUpdates(int):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [K2.e, java.lang.Object] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z5 = this.f2691k;
        if (!z5) {
            return z5;
        }
        ((BaseInputConnection) ((C0829u) this.f2681a.f297e).f2678k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i5, int i6) {
        boolean z5 = this.f2691k;
        if (z5) {
            m1472a(new C1643r(i5, i6));
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i5) {
        boolean z5 = this.f2691k;
        if (z5) {
            m1472a(new C1644s(String.valueOf(charSequence), i5));
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i5, int i6) {
        boolean z5 = this.f2691k;
        if (!z5) {
            return z5;
        }
        m1472a(new C1645t(i5, i6));
        return true;
    }
}
