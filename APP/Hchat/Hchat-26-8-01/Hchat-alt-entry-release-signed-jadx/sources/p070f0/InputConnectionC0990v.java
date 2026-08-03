package p070f0;

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
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.lifecycle.C0119x;
import gg.AbstractC1416l;
import gg.C1423s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import p015b0.AbstractC0130a0;
import p015b0.C0136d0;
import p057e1.C0808c;
import p058e2.C0814d;
import p071f1.AbstractC0996c0;
import p100h0.C1511d1;
import p119i2.AbstractC1923e0;
import p119i2.C1926g;
import p119i2.C1931i0;
import p119i2.C1933j0;
import p119i2.C1935k0;
import p119i2.C1939m0;
import p119i2.C1942o;
import p129ig.AbstractC2043a;
import p190n2.C2865a;
import p190n2.C2870e;
import p190n2.C2871f;
import p190n2.C2873h;
import p190n2.C2874i;
import p190n2.C2881p;
import p190n2.C2882q;
import p190n2.C2883r;
import p190n2.C2884s;
import p190n2.InterfaceC2872g;
import p218og.C3147k;
import p308v1.InterfaceC4428t;
import p321w.C4618m1;
import p321w.C4629q0;
import p321w.EnumC4602h0;
import p357y1.InterfaceC5905l2;

/* JADX INFO: renamed from: f0.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class InputConnectionC0990v implements InputConnection {

    /* JADX INFO: renamed from: a */
    public final C0119x f3136a;

    /* JADX INFO: renamed from: b */
    public final boolean f3137b;

    /* JADX INFO: renamed from: c */
    public final C4629q0 f3138c;

    /* JADX INFO: renamed from: d */
    public final C1511d1 f3139d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5905l2 f3140e;

    /* JADX INFO: renamed from: f */
    public int f3141f;

    /* JADX INFO: renamed from: g */
    public C2884s f3142g;

    /* JADX INFO: renamed from: h */
    public int f3143h;

    /* JADX INFO: renamed from: i */
    public boolean f3144i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f3145j = new ArrayList();

    /* JADX INFO: renamed from: k */
    public boolean f3146k = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InputConnectionC0990v(C2884s c2884s, C0119x c0119x, boolean z9, C4629q0 c4629q0, C1511d1 c1511d1, InterfaceC5905l2 interfaceC5905l2) {
        this.f3136a = c0119x;
        this.f3137b = z9;
        this.f3138c = c4629q0;
        this.f3139d = c1511d1;
        this.f3140e = interfaceC5905l2;
        this.f3142g = c2884s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m2447a(InterfaceC2872g interfaceC2872g) {
        this.f3141f++;
        try {
            this.f3145j.add(interfaceC2872g);
        } finally {
            m2448b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m2448b() {
        int i9 = this.f3141f - 1;
        this.f3141f = i9;
        if (i9 == 0) {
            ArrayList arrayList = this.f3145j;
            if (!arrayList.isEmpty()) {
                ((C0989u) this.f3136a.f310h).f3125c.invoke(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.f3141f > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z9 = this.f3146k;
        if (!z9) {
            return z9;
        }
        this.f3141f++;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m2449c(int i9) {
        sendKeyEvent(new KeyEvent(0, i9));
        sendKeyEvent(new KeyEvent(1, i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i9) {
        boolean z9 = this.f3146k;
        if (z9) {
            return false;
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f3145j.clear();
        this.f3141f = 0;
        this.f3146k = false;
        ArrayList arrayList = ((C0989u) this.f3136a.f310h).f3132j;
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
        boolean z9 = this.f3146k;
        if (z9) {
            return false;
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i9, Bundle bundle) {
        boolean z9 = this.f3146k;
        if (z9) {
            return false;
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z9 = this.f3146k;
        return z9 ? this.f3137b : z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i9) {
        boolean z9 = this.f3146k;
        if (z9) {
            m2447a(new C2865a(String.valueOf(charSequence), i9));
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i9, int i10) {
        boolean z9 = this.f3146k;
        if (!z9) {
            return z9;
        }
        m2447a(new C2870e(i9, i10));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i9, int i10) {
        boolean z9 = this.f3146k;
        if (!z9) {
            return z9;
        }
        m2447a(new C2871f(i9, i10));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return m2448b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z9 = this.f3146k;
        if (!z9) {
            return z9;
        }
        m2447a(new C2873h());
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i9) {
        C2884s c2884s = this.f3142g;
        return TextUtils.getCapsMode(c2884s.f9316a.f6529h, C1939m0.m4816f(c2884s.f9317b), i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i9) {
        boolean z9 = (i9 & 1) != 0;
        this.f3144i = z9;
        if (z9) {
            this.f3143h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return AbstractC0985q.m2434d(this.f3142g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i9) {
        if (C1939m0.m4813c(this.f3142g.f9317b)) {
            return null;
        }
        return AbstractC2043a.m5052z(this.f3142g).f6529h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i9, int i10) {
        return AbstractC2043a.m4996B(this.f3142g, i9).f6529h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i9, int i10) {
        return AbstractC2043a.m4997C(this.f3142g, i9).f6529h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i9) {
        boolean z9 = this.f3146k;
        if (z9) {
            z9 = false;
            switch (i9) {
                case R.id.selectAll:
                    m2447a(new C2883r(0, this.f3142g.f9316a.f6529h.length()));
                    break;
                case R.id.cut:
                    m2449c(277);
                    return false;
                case R.id.copy:
                    m2449c(278);
                    return false;
                case R.id.paste:
                    m2449c(279);
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
        boolean z9 = this.f3146k;
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
                ((C0989u) this.f3136a.f310h).f3126d.invoke(new C2874i(i10));
            } else {
                i10 = 1;
                ((C0989u) this.f3136a.f310h).f3126d.invoke(new C2874i(i10));
            }
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02d0  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        C1926g c1926g;
        long jM4831h;
        int i9;
        int iM2431a;
        C4618m1 c4618m1M9051d;
        int iM2431a2;
        C4618m1 c4618m1M9051d2;
        C1933j0 c1933j0;
        if (Build.VERSION.SDK_INT >= 34) {
            C0136d0 c0136d0 = new C0136d0(this, 12);
            C4629q0 c4629q0 = this.f3138c;
            int iM2437g = 3;
            if (c4629q0 != null && (c1926g = c4629q0.f15335j) != null) {
                C4618m1 c4618m1M9051d3 = c4629q0.m9051d();
                if (c1926g.equals((c4618m1M9051d3 == null || (c1933j0 = c4618m1M9051d3.f15293a.f6561a) == null) ? null : c1933j0.f6549a)) {
                    boolean zM673q = AbstractC0130a0.m673q(handwritingGesture);
                    C1511d1 c1511d1 = this.f3139d;
                    if (zM673q) {
                        SelectGesture selectGestureM666j = AbstractC0130a0.m666j(handwritingGesture);
                        long jM2439i = AbstractC0985q.m2439i(c4629q0, AbstractC0996c0.m2528y(selectGestureM666j.getSelectionArea()), selectGestureM666j.getGranularity() != 1 ? 0 : 1);
                        if (C1939m0.m4813c(jM2439i)) {
                            iM2437g = AbstractC0985q.m2437g(AbstractC0130a0.m662f(selectGestureM666j), c0136d0);
                        } else {
                            c0136d0.invoke(new C2883r((int) (jM2439i >> 32), (int) (jM2439i & 4294967295L)));
                            if (c1511d1 != null) {
                                c1511d1.m4022h(true);
                            }
                            iM2437g = 1;
                        }
                    } else if (AbstractC0130a0.m680x(handwritingGesture)) {
                        DeleteGesture deleteGestureM660d = AbstractC0130a0.m660d(handwritingGesture);
                        int i10 = deleteGestureM660d.getGranularity() != 1 ? 0 : 1;
                        long jM2439i2 = AbstractC0985q.m2439i(c4629q0, AbstractC0996c0.m2528y(deleteGestureM660d.getDeletionArea()), i10);
                        if (C1939m0.m4813c(jM2439i2)) {
                            iM2437g = AbstractC0985q.m2437g(AbstractC0130a0.m662f(deleteGestureM660d), c0136d0);
                        } else {
                            AbstractC0985q.m2444n(jM2439i2, c1926g, i10 == 1, c0136d0);
                            iM2437g = 1;
                        }
                    } else if (AbstractC0130a0.m682z(handwritingGesture)) {
                        SelectRangeGesture selectRangeGestureM667k = AbstractC0130a0.m667k(handwritingGesture);
                        long jM2432b = AbstractC0985q.m2432b(c4629q0, AbstractC0996c0.m2528y(selectRangeGestureM667k.getSelectionStartArea()), AbstractC0996c0.m2528y(selectRangeGestureM667k.getSelectionEndArea()), selectRangeGestureM667k.getGranularity() != 1 ? 0 : 1);
                        if (C1939m0.m4813c(jM2432b)) {
                            iM2437g = AbstractC0985q.m2437g(AbstractC0130a0.m662f(selectRangeGestureM667k), c0136d0);
                        } else {
                            c0136d0.invoke(new C2883r((int) (jM2432b >> 32), (int) (jM2432b & 4294967295L)));
                            if (c1511d1 != null) {
                                c1511d1.m4022h(true);
                            }
                            iM2437g = 1;
                        }
                    } else if (AbstractC0130a0.m654B(handwritingGesture)) {
                        DeleteRangeGesture deleteRangeGestureM661e = AbstractC0130a0.m661e(handwritingGesture);
                        int i11 = deleteRangeGestureM661e.getGranularity() != 1 ? 0 : 1;
                        long jM2432b2 = AbstractC0985q.m2432b(c4629q0, AbstractC0996c0.m2528y(deleteRangeGestureM661e.getDeletionStartArea()), AbstractC0996c0.m2528y(deleteRangeGestureM661e.getDeletionEndArea()), i11);
                        if (C1939m0.m4813c(jM2432b2)) {
                            iM2437g = AbstractC0985q.m2437g(AbstractC0130a0.m662f(deleteRangeGestureM661e), c0136d0);
                        } else {
                            AbstractC0985q.m2444n(jM2432b2, c1926g, i11 == 1, c0136d0);
                            iM2437g = 1;
                        }
                    } else {
                        boolean zM656D = AbstractC0130a0.m656D(handwritingGesture);
                        InterfaceC5905l2 interfaceC5905l2 = this.f3140e;
                        if (zM656D) {
                            JoinOrSplitGesture joinOrSplitGestureM664h = AbstractC0130a0.m664h(handwritingGesture);
                            if (interfaceC5905l2 == null || (iM2431a2 = AbstractC0985q.m2431a(c4629q0, AbstractC0985q.m2435e(joinOrSplitGestureM664h.getJoinOrSplitPoint()), interfaceC5905l2)) == -1 || ((c4618m1M9051d2 = c4629q0.m9051d()) != null && AbstractC0985q.m2433c(c4618m1M9051d2.f15293a, iM2431a2))) {
                                iM2437g = AbstractC0985q.m2437g(AbstractC0130a0.m662f(joinOrSplitGestureM664h), c0136d0);
                            } else {
                                int iCharCount = iM2431a2;
                                while (iCharCount > 0) {
                                    int iCodePointBefore = Character.codePointBefore(c1926g, iCharCount);
                                    if (!AbstractC0985q.m2441k(iCodePointBefore)) {
                                        break;
                                    } else {
                                        iCharCount -= Character.charCount(iCodePointBefore);
                                    }
                                }
                                while (iM2431a2 < c1926g.f6529h.length()) {
                                    int iCodePointAt = Character.codePointAt(c1926g, iM2431a2);
                                    if (!AbstractC0985q.m2441k(iCodePointAt)) {
                                        break;
                                    } else {
                                        iM2431a2 += Character.charCount(iCodePointAt);
                                    }
                                }
                                long jM4784b = AbstractC1923e0.m4784b(iCharCount, iM2431a2);
                                if (C1939m0.m4813c(jM4784b)) {
                                    int i12 = (int) (jM4784b >> 32);
                                    c0136d0.invoke(new C0981m(new InterfaceC2872g[]{new C2883r(i12, i12), new C2865a(" ", 1)}));
                                } else {
                                    AbstractC0985q.m2444n(jM4784b, c1926g, false, c0136d0);
                                }
                                iM2437g = 1;
                            }
                        } else if (AbstractC0130a0.m676t(handwritingGesture)) {
                            InsertGesture insertGestureM663g = AbstractC0130a0.m663g(handwritingGesture);
                            if (interfaceC5905l2 == null || (iM2431a = AbstractC0985q.m2431a(c4629q0, AbstractC0985q.m2435e(insertGestureM663g.getInsertionPoint()), interfaceC5905l2)) == -1 || ((c4618m1M9051d = c4629q0.m9051d()) != null && AbstractC0985q.m2433c(c4618m1M9051d.f15293a, iM2431a))) {
                                iM2437g = AbstractC0985q.m2437g(AbstractC0130a0.m662f(insertGestureM663g), c0136d0);
                            } else {
                                c0136d0.invoke(new C0981m(new InterfaceC2872g[]{new C2883r(iM2431a, iM2431a), new C2865a(insertGestureM663g.getTextToInsert(), 1)}));
                                iM2437g = 1;
                            }
                        } else if (AbstractC0130a0.m678v(handwritingGesture)) {
                            RemoveSpaceGesture removeSpaceGestureM665i = AbstractC0130a0.m665i(handwritingGesture);
                            C4618m1 c4618m1M9051d4 = c4629q0.m9051d();
                            C1935k0 c1935k0 = c4618m1M9051d4 != null ? c4618m1M9051d4.f15293a : null;
                            long jM2435e = AbstractC0985q.m2435e(removeSpaceGestureM665i.getStartPoint());
                            long jM2435e2 = AbstractC0985q.m2435e(removeSpaceGestureM665i.getEndPoint());
                            InterfaceC4428t interfaceC4428tM9050c = c4629q0.m9050c();
                            if (c1935k0 != null) {
                                C1942o c1942o = c1935k0.f6562b;
                                if (interfaceC4428tM9050c == null) {
                                    jM4831h = C1939m0.f6573b;
                                } else {
                                    long jMo8865j0 = interfaceC4428tM9050c.mo8865j0(jM2435e);
                                    long jMo8865j02 = interfaceC4428tM9050c.mo8865j0(jM2435e2);
                                    int iM2438h = AbstractC0985q.m2438h(c1942o, jMo8865j0, interfaceC5905l2);
                                    int iM2438h2 = AbstractC0985q.m2438h(c1942o, jMo8865j02, interfaceC5905l2);
                                    if (iM2438h != -1) {
                                        if (iM2438h2 != -1) {
                                            iM2438h = Math.min(iM2438h, iM2438h2);
                                        }
                                        iM2438h2 = iM2438h;
                                    } else if (iM2438h2 == -1) {
                                        jM4831h = C1939m0.f6573b;
                                    }
                                    float fM4825b = (c1942o.m4825b(iM2438h2) + c1942o.m4829f(iM2438h2)) / 2;
                                    int i13 = (int) (jMo8865j0 >> 32);
                                    int i14 = (int) (jMo8865j02 >> 32);
                                    jM4831h = c1942o.m4831h(new C0808c(Math.min(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14)), fM4825b - 0.1f, Math.max(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14)), fM4825b + 0.1f), 0, C1931i0.f6546a);
                                }
                                if (C1939m0.m4813c(jM4831h)) {
                                    iM2437g = AbstractC0985q.m2437g(AbstractC0130a0.m662f(removeSpaceGestureM665i), c0136d0);
                                } else {
                                    C1423s c1423s = new C1423s();
                                    c1423s.f4736g = -1;
                                    C1423s c1423s2 = new C1423s();
                                    c1423s2.f4736g = -1;
                                    String strM6684e = new C3147k("\\s+").m6684e(c1926g.subSequence(C1939m0.m4816f(jM4831h), C1939m0.m4815e(jM4831h)).f6529h, new C0980l(c1423s, c1423s2, 0));
                                    int i15 = c1423s.f4736g;
                                    if (i15 == -1 || (i9 = c1423s2.f4736g) == -1) {
                                        iM2437g = AbstractC0985q.m2437g(AbstractC0130a0.m662f(removeSpaceGestureM665i), c0136d0);
                                    } else {
                                        int i16 = (int) (jM4831h >> 32);
                                        c0136d0.invoke(new C0981m(new InterfaceC2872g[]{new C2883r(i16 + i15, i16 + i9), new C2865a(strM6684e.substring(i15, strM6684e.length() - (C1939m0.m4814d(jM4831h) - c1423s2.f4736g)), 1)}));
                                        iM2437g = 1;
                                    }
                                }
                            }
                        } else {
                            iM2437g = 2;
                        }
                    }
                }
            }
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new RunnableC0972d(iM2437g, 0, intConsumer));
            } else {
                intConsumer.accept(iM2437g);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z9 = this.f3146k;
        if (z9) {
            return true;
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        C4629q0 c4629q0;
        C1926g c1926g;
        C1933j0 c1933j0;
        if (Build.VERSION.SDK_INT >= 34 && (c4629q0 = this.f3138c) != null && (c1926g = c4629q0.f15335j) != null) {
            C4618m1 c4618m1M9051d = c4629q0.m9051d();
            if (c1926g.equals((c4618m1M9051d == null || (c1933j0 = c4618m1M9051d.f15293a.f6561a) == null) ? null : c1933j0.f6549a)) {
                boolean zM673q = AbstractC0130a0.m673q(previewableHandwritingGesture);
                EnumC4602h0 enumC4602h0 = EnumC4602h0.f15180g;
                C1511d1 c1511d1 = this.f3139d;
                if (zM673q) {
                    SelectGesture selectGestureM666j = AbstractC0130a0.m666j(previewableHandwritingGesture);
                    if (c1511d1 != null) {
                        long jM2439i = AbstractC0985q.m2439i(c4629q0, AbstractC0996c0.m2528y(selectGestureM666j.getSelectionArea()), selectGestureM666j.getGranularity() != 1 ? 0 : 1);
                        C4629q0 c4629q02 = c1511d1.f5032d;
                        if (c4629q02 != null) {
                            c4629q02.m9053f(jM2439i);
                        }
                        C4629q0 c4629q03 = c1511d1.f5032d;
                        if (c4629q03 != null) {
                            c4629q03.m9052e(C1939m0.f6573b);
                        }
                        if (!C1939m0.m4813c(jM2439i)) {
                            c1511d1.m4034t(false);
                            c1511d1.m4031q(enumC4602h0);
                        }
                    }
                } else if (AbstractC0130a0.m680x(previewableHandwritingGesture)) {
                    DeleteGesture deleteGestureM660d = AbstractC0130a0.m660d(previewableHandwritingGesture);
                    if (c1511d1 != null) {
                        long jM2439i2 = AbstractC0985q.m2439i(c4629q0, AbstractC0996c0.m2528y(deleteGestureM660d.getDeletionArea()), deleteGestureM660d.getGranularity() != 1 ? 0 : 1);
                        C4629q0 c4629q04 = c1511d1.f5032d;
                        if (c4629q04 != null) {
                            c4629q04.m9052e(jM2439i2);
                        }
                        C4629q0 c4629q05 = c1511d1.f5032d;
                        if (c4629q05 != null) {
                            c4629q05.m9053f(C1939m0.f6573b);
                        }
                        if (!C1939m0.m4813c(jM2439i2)) {
                            c1511d1.m4034t(false);
                            c1511d1.m4031q(enumC4602h0);
                        }
                    }
                } else if (AbstractC0130a0.m682z(previewableHandwritingGesture)) {
                    SelectRangeGesture selectRangeGestureM667k = AbstractC0130a0.m667k(previewableHandwritingGesture);
                    if (c1511d1 != null) {
                        long jM2432b = AbstractC0985q.m2432b(c4629q0, AbstractC0996c0.m2528y(selectRangeGestureM667k.getSelectionStartArea()), AbstractC0996c0.m2528y(selectRangeGestureM667k.getSelectionEndArea()), selectRangeGestureM667k.getGranularity() != 1 ? 0 : 1);
                        C4629q0 c4629q06 = c1511d1.f5032d;
                        if (c4629q06 != null) {
                            c4629q06.m9053f(jM2432b);
                        }
                        C4629q0 c4629q07 = c1511d1.f5032d;
                        if (c4629q07 != null) {
                            c4629q07.m9052e(C1939m0.f6573b);
                        }
                        if (!C1939m0.m4813c(jM2432b)) {
                            c1511d1.m4034t(false);
                            c1511d1.m4031q(enumC4602h0);
                        }
                    }
                } else if (AbstractC0130a0.m654B(previewableHandwritingGesture)) {
                    DeleteRangeGesture deleteRangeGestureM661e = AbstractC0130a0.m661e(previewableHandwritingGesture);
                    if (c1511d1 != null) {
                        long jM2432b2 = AbstractC0985q.m2432b(c4629q0, AbstractC0996c0.m2528y(deleteRangeGestureM661e.getDeletionStartArea()), AbstractC0996c0.m2528y(deleteRangeGestureM661e.getDeletionEndArea()), deleteRangeGestureM661e.getGranularity() != 1 ? 0 : 1);
                        C4629q0 c4629q08 = c1511d1.f5032d;
                        if (c4629q08 != null) {
                            c4629q08.m9052e(jM2432b2);
                        }
                        C4629q0 c4629q09 = c1511d1.f5032d;
                        if (c4629q09 != null) {
                            c4629q09.m9053f(C1939m0.f6573b);
                        }
                        if (!C1939m0.m4813c(jM2432b2)) {
                            c1511d1.m4034t(false);
                            c1511d1.m4031q(enumC4602h0);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new C0814d(c1511d1, 1));
                }
                return true;
            }
        }
        return false;
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
        C0986r c0986r;
        boolean z12 = this.f3146k;
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
                c0986r = ((C0989u) this.f3136a.f310h).f3135m;
                synchronized (c0986r.f3106c) {
                    try {
                        c0986r.f3109f = z10;
                        c0986r.f3110g = z11;
                        c0986r.f3111h = z13;
                        c0986r.f3112i = z9;
                        if (z14) {
                            c0986r.f3108e = true;
                            if (c0986r.f3113j != null) {
                                c0986r.m2445a();
                            }
                        }
                        c0986r.f3107d = z15;
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
        c0986r = ((C0989u) this.f3136a.f310h).f3135m;
        synchronized (c0986r.f3106c) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, sf.c] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z9 = this.f3146k;
        if (!z9) {
            return z9;
        }
        ((BaseInputConnection) ((C0989u) this.f3136a.f310h).f3133k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i9, int i10) {
        boolean z9 = this.f3146k;
        if (z9) {
            m2447a(new C2881p(i9, i10));
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i9) {
        boolean z9 = this.f3146k;
        if (z9) {
            m2447a(new C2882q(String.valueOf(charSequence), i9));
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i9, int i10) {
        boolean z9 = this.f3146k;
        if (!z9) {
            return z9;
        }
        m2447a(new C2883r(i9, i10));
        return true;
    }
}
