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
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import com.bumptech.glide.AbstractC1922d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000A.C0036S0;
import p000A.C0049a;
import p000A.C0066i0;
import p000A.C0078o0;
import p000A.EnumC0052b0;
import p007B0.C0173F;
import p028F.AbstractC0359t;
import p029F0.InterfaceC0430v;
import p047I0.InterfaceC0697T0;
import p058L.C0920W;
import p061L2.AbstractC0973m;
import p092S0.AbstractC1251D;
import p092S0.C1255H;
import p092S0.C1256I;
import p092S0.C1257J;
import p092S0.C1259L;
import p092S0.C1269g;
import p092S0.C1277o;
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
import p204n0.C2684c;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InputConnectionC0830v(C1646u c1646u, C0066i0 c0066i0, boolean z5, C0078o0 c0078o0, C0920W c0920w, InterfaceC0697T0 interfaceC0697T0) {
        this.f2681a = c0066i0;
        this.f2682b = z5;
        this.f2683c = c0078o0;
        this.f2684d = c0920w;
        this.f2685e = interfaceC0697T0;
        this.f2687g = c1646u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1472a(InterfaceC1632g interfaceC1632g) {
        this.f2686f++;
        try {
            this.f2690j.add(interfaceC1632g);
        } finally {
            m1473b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z5 = this.f2691k;
        if (!z5) {
            return z5;
        }
        this.f2686f++;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m1474c(int i5) {
        sendKeyEvent(new KeyEvent(0, i5));
        sendKeyEvent(new KeyEvent(1, i5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i5) {
        boolean z5 = this.f2691k;
        if (z5) {
            return false;
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z5 = this.f2691k;
        if (z5) {
            return false;
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i5, Bundle bundle) {
        boolean z5 = this.f2691k;
        if (z5) {
            return false;
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z5 = this.f2691k;
        return z5 ? this.f2682b : z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i5) {
        boolean z5 = this.f2691k;
        if (z5) {
            m1472a(new C1626a(String.valueOf(charSequence), i5));
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i5, int i6) {
        boolean z5 = this.f2691k;
        if (!z5) {
            return z5;
        }
        m1472a(new C1630e(i5, i6));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i5, int i6) {
        boolean z5 = this.f2691k;
        if (!z5) {
            return z5;
        }
        m1472a(new C1631f(i5, i6));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return m1473b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z5 = this.f2691k;
        if (!z5) {
            return z5;
        }
        m1472a(new C1634i());
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i5) {
        C1646u c1646u = this.f2687g;
        return TextUtils.getCapsMode(c1646u.f5650a.f4563e, C1259L.m2338f(c1646u.f5651b), i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i5) {
        boolean z5 = (i5 & 1) != 0;
        this.f2689i = z5;
        if (z5) {
            this.f2688h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return AbstractC0825q.m1459d(this.f2687g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i5) {
        if (C1259L.m2335c(this.f2687g.f5651b)) {
            return null;
        }
        return AbstractC1922d.m3434p(this.f2687g).f4563e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i5, int i6) {
        return AbstractC1922d.m3436s(this.f2687g, i5).f4563e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i5, int i6) {
        return AbstractC1922d.m3437t(this.f2687g, i5).f4563e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c7  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, final IntConsumer intConsumer) {
        C1269g c1269g;
        long jM2367h;
        int i5;
        int i6;
        RemoveSpaceGesture removeSpaceGesture;
        String string;
        int i7;
        int iM1456a;
        C0036S0 c0036s0M123d;
        int iM1456a2;
        C0036S0 c0036s0M123d2;
        C1256I c1256i;
        if (Build.VERSION.SDK_INT >= 34) {
            C0049a c0049a = new C0049a(7, this);
            C0078o0 c0078o0 = this.f2683c;
            final int iM1462g = 3;
            if (c0078o0 != null && (c1269g = c0078o0.f346j) != null) {
                C0036S0 c0036s0M123d3 = c0078o0.m123d();
                if (c1269g.equals((c0036s0M123d3 == null || (c1256i = c0036s0M123d3.f161a.f4526a) == null) ? null : c1256i.f4516a)) {
                    boolean zM590s = AbstractC0359t.m590s(handwritingGesture);
                    C0920W c0920w = this.f2684d;
                    if (zM590s) {
                        SelectGesture selectGestureM584m = AbstractC0359t.m584m(handwritingGesture);
                        long jM1464i = AbstractC0825q.m1464i(c0078o0, AbstractC2767z.m4955z(selectGestureM584m.getSelectionArea()), selectGestureM584m.getGranularity() == 1 ? 1 : 0);
                        if (C1259L.m2335c(jM1464i)) {
                            iM1462g = AbstractC0825q.m1462g(AbstractC0819k.m1437k(selectGestureM584m), c0049a);
                        } else {
                            c0049a.mo1h(new C1645t((int) (jM1464i >> 32), (int) (jM1464i & 4294967295L)));
                            if (c0920w != null) {
                                c0920w.m1933h(true);
                            }
                            iM1462g = 1;
                        }
                    } else if (AbstractC0819k.m1424B(handwritingGesture)) {
                        DeleteGesture deleteGestureM1435i = AbstractC0819k.m1435i(handwritingGesture);
                        int i8 = deleteGestureM1435i.getGranularity() != 1 ? 0 : 1;
                        long jM1464i2 = AbstractC0825q.m1464i(c0078o0, AbstractC2767z.m4955z(deleteGestureM1435i.getDeletionArea()), i8);
                        if (C1259L.m2335c(jM1464i2)) {
                            iM1462g = AbstractC0825q.m1462g(AbstractC0819k.m1437k(deleteGestureM1435i), c0049a);
                        } else {
                            AbstractC0825q.m1469n(jM1464i2, c1269g, i8 == 1, c0049a);
                            iM1462g = 1;
                        }
                    } else if (AbstractC0819k.m1425C(handwritingGesture)) {
                        SelectRangeGesture selectRangeGestureM1440n = AbstractC0819k.m1440n(handwritingGesture);
                        long jM1457b = AbstractC0825q.m1457b(c0078o0, AbstractC2767z.m4955z(selectRangeGestureM1440n.getSelectionStartArea()), AbstractC2767z.m4955z(selectRangeGestureM1440n.getSelectionEndArea()), selectRangeGestureM1440n.getGranularity() == 1 ? 1 : 0);
                        if (C1259L.m2335c(jM1457b)) {
                            iM1462g = AbstractC0825q.m1462g(AbstractC0819k.m1437k(selectRangeGestureM1440n), c0049a);
                        } else {
                            c0049a.mo1h(new C1645t((int) (jM1457b >> 32), (int) (jM1457b & 4294967295L)));
                            if (c0920w != null) {
                                c0920w.m1933h(true);
                            }
                            iM1462g = 1;
                        }
                    } else if (AbstractC0819k.m1426D(handwritingGesture)) {
                        DeleteRangeGesture deleteRangeGestureM1436j = AbstractC0819k.m1436j(handwritingGesture);
                        int i9 = deleteRangeGestureM1436j.getGranularity() != 1 ? 0 : 1;
                        long jM1457b2 = AbstractC0825q.m1457b(c0078o0, AbstractC2767z.m4955z(deleteRangeGestureM1436j.getDeletionStartArea()), AbstractC2767z.m4955z(deleteRangeGestureM1436j.getDeletionEndArea()), i9);
                        if (C1259L.m2335c(jM1457b2)) {
                            iM1462g = AbstractC0825q.m1462g(AbstractC0819k.m1437k(deleteRangeGestureM1436j), c0049a);
                        } else {
                            AbstractC0825q.m1469n(jM1457b2, c1269g, i9 == 1, c0049a);
                            iM1462g = 1;
                        }
                    } else {
                        boolean zM1452z = AbstractC0819k.m1452z(handwritingGesture);
                        InterfaceC0697T0 interfaceC0697T0 = this.f2685e;
                        int i10 = -1;
                        if (zM1452z) {
                            JoinOrSplitGesture joinOrSplitGestureM1438l = AbstractC0819k.m1438l(handwritingGesture);
                            if (interfaceC0697T0 == null || (iM1456a2 = AbstractC0825q.m1456a(c0078o0, AbstractC0825q.m1460e(joinOrSplitGestureM1438l.getJoinOrSplitPoint()), interfaceC0697T0)) == -1 || ((c0036s0M123d2 = c0078o0.m123d()) != null && AbstractC0825q.m1458c(c0036s0M123d2.f161a, iM1456a2))) {
                                iM1462g = AbstractC0825q.m1462g(AbstractC0819k.m1437k(joinOrSplitGestureM1438l), c0049a);
                            } else {
                                int iCharCount = iM1456a2;
                                while (iCharCount > 0) {
                                    int iCodePointBefore = Character.codePointBefore(c1269g, iCharCount);
                                    if (!AbstractC0825q.m1466k(iCodePointBefore)) {
                                        break;
                                    } else {
                                        iCharCount -= Character.charCount(iCodePointBefore);
                                    }
                                }
                                while (iM1456a2 < c1269g.f4563e.length()) {
                                    int iCodePointAt = Character.codePointAt(c1269g, iM1456a2);
                                    if (!AbstractC0825q.m1466k(iCodePointAt)) {
                                        break;
                                    } else {
                                        iM1456a2 += Character.charCount(iCodePointAt);
                                    }
                                }
                                long jM2313b = AbstractC1251D.m2313b(iCharCount, iM1456a2);
                                if (C1259L.m2335c(jM2313b)) {
                                    int i11 = (int) (jM2313b >> 32);
                                    c0049a.mo1h(new C0821m(new InterfaceC1632g[]{new C1645t(i11, i11), new C1626a(" ", 1)}));
                                } else {
                                    AbstractC0825q.m1469n(jM2313b, c1269g, false, c0049a);
                                }
                                iM1462g = 1;
                            }
                        } else if (AbstractC0359t.m595x(handwritingGesture)) {
                            InsertGesture insertGestureM583l = AbstractC0359t.m583l(handwritingGesture);
                            if (interfaceC0697T0 == null || (iM1456a = AbstractC0825q.m1456a(c0078o0, AbstractC0825q.m1460e(insertGestureM583l.getInsertionPoint()), interfaceC0697T0)) == -1 || ((c0036s0M123d = c0078o0.m123d()) != null && AbstractC0825q.m1458c(c0036s0M123d.f161a, iM1456a))) {
                                iM1462g = AbstractC0825q.m1462g(AbstractC0819k.m1437k(insertGestureM583l), c0049a);
                            } else {
                                c0049a.mo1h(new C0821m(new InterfaceC1632g[]{new C1645t(iM1456a, iM1456a), new C1626a(insertGestureM583l.getTextToInsert(), 1)}));
                                iM1462g = 1;
                            }
                        } else if (AbstractC0819k.m1446t(handwritingGesture)) {
                            RemoveSpaceGesture removeSpaceGestureM1439m = AbstractC0819k.m1439m(handwritingGesture);
                            C0036S0 c0036s0M123d4 = c0078o0.m123d();
                            C1257J c1257j = c0036s0M123d4 != null ? c0036s0M123d4.f161a : null;
                            long jM1460e = AbstractC0825q.m1460e(removeSpaceGestureM1439m.getStartPoint());
                            long jM1460e2 = AbstractC0825q.m1460e(removeSpaceGestureM1439m.getEndPoint());
                            InterfaceC0430v interfaceC0430vM122c = c0078o0.m122c();
                            if (c1257j != null) {
                                C1277o c1277o = c1257j.f4527b;
                                if (interfaceC0430vM122c == null) {
                                    jM2367h = C1259L.f4536b;
                                } else {
                                    long jMo631B = interfaceC0430vM122c.mo631B(jM1460e);
                                    long jMo631B2 = interfaceC0430vM122c.mo631B(jM1460e2);
                                    int iM1463h = AbstractC0825q.m1463h(c1277o, jMo631B, interfaceC0697T0);
                                    int iM1463h2 = AbstractC0825q.m1463h(c1277o, jMo631B2, interfaceC0697T0);
                                    if (iM1463h != -1) {
                                        if (iM1463h2 != -1) {
                                            iM1463h = Math.min(iM1463h, iM1463h2);
                                        }
                                        iM1463h2 = iM1463h;
                                    } else if (iM1463h2 == -1) {
                                        jM2367h = C1259L.f4536b;
                                    }
                                    float fM2361b = (c1277o.m2361b(iM1463h2) + c1277o.m2365f(iM1463h2)) / 2;
                                    int i12 = (int) (jMo631B >> 32);
                                    int i13 = (int) (jMo631B2 >> 32);
                                    jM2367h = c1277o.m2367h(new C2684c(Math.min(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13)), fM2361b - 0.1f, Math.max(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13)), fM2361b + 0.1f), 0, C1255H.f4514a);
                                }
                                if (C1259L.m2335c(jM2367h)) {
                                    iM1462g = AbstractC0825q.m1462g(AbstractC0819k.m1437k(removeSpaceGestureM1439m), c0049a);
                                } else {
                                    String str = c1269g.subSequence(C1259L.m2338f(jM2367h), C1259L.m2337e(jM2367h)).f4563e;
                                    Pattern patternCompile = Pattern.compile("\\s+");
                                    AbstractC1665j.m2984d(patternCompile, "compile(...)");
                                    AbstractC1665j.m2985e(str, "input");
                                    Matcher matcher = patternCompile.matcher(str);
                                    AbstractC1665j.m2984d(matcher, "matcher(...)");
                                    C0173F c0173f = !matcher.find(0) ? null : new C0173F(matcher, str);
                                    if (c0173f == null) {
                                        string = str.toString();
                                        removeSpaceGesture = removeSpaceGestureM1439m;
                                        i7 = -1;
                                        i6 = -1;
                                        i5 = -1;
                                    } else {
                                        int length = str.length();
                                        StringBuilder sb = new StringBuilder(length);
                                        C0173F c0173f2 = c0173f;
                                        i5 = -1;
                                        int i14 = 0;
                                        while (true) {
                                            sb.append((CharSequence) str, i14, c0173f2.m253h().f6140d);
                                            if (i5 == i10) {
                                                i5 = c0173f2.m253h().f6140d;
                                            }
                                            i6 = c0173f2.m253h().f6141e + 1;
                                            sb.append((CharSequence) "");
                                            i14 = c0173f2.m253h().f6141e + 1;
                                            CharSequence charSequence = (CharSequence) c0173f2.f613f;
                                            Matcher matcher2 = (Matcher) c0173f2.f612e;
                                            removeSpaceGesture = removeSpaceGestureM1439m;
                                            int iEnd = matcher2.end() + (matcher2.end() == matcher2.start() ? 1 : 0);
                                            if (iEnd <= charSequence.length()) {
                                                Matcher matcher3 = matcher2.pattern().matcher(charSequence);
                                                AbstractC1665j.m2984d(matcher3, "matcher(...)");
                                                c0173f2 = !matcher3.find(iEnd) ? null : new C0173F(matcher3, charSequence);
                                            } else {
                                                c0173f2 = null;
                                            }
                                            if (i14 >= length || c0173f2 == null) {
                                                break;
                                            }
                                            removeSpaceGestureM1439m = removeSpaceGesture;
                                            i10 = -1;
                                        }
                                        if (i14 < length) {
                                            sb.append((CharSequence) str, i14, length);
                                        }
                                        string = sb.toString();
                                        AbstractC1665j.m2984d(string, "toString(...)");
                                        i7 = -1;
                                    }
                                    if (i5 == i7 || i6 == i7) {
                                        iM1462g = AbstractC0825q.m1462g(AbstractC0819k.m1437k(removeSpaceGesture), c0049a);
                                    } else {
                                        int i15 = (int) (jM2367h >> 32);
                                        String strSubstring = string.substring(i5, string.length() - (C1259L.m2336d(jM2367h) - i6));
                                        AbstractC1665j.m2984d(strSubstring, "substring(...)");
                                        iM1462g = 1;
                                        c0049a.mo1h(new C0821m(new InterfaceC1632g[]{new C1645t(i15 + i5, i15 + i6), new C1626a(strSubstring, 1)}));
                                    }
                                }
                            }
                        } else {
                            iM1462g = 2;
                        }
                    }
                }
            }
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new Runnable() { // from class: J.d
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        intConsumer.accept(iM1462g);
                    }
                });
            } else {
                intConsumer.accept(iM1462g);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z5 = this.f2691k;
        if (z5) {
            return true;
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
        C0826r c0826r;
        boolean z8 = this.f2691k;
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
                c0826r = ((C0829u) this.f2681a.f297e).f2680m;
                synchronized (c0826r.f2651c) {
                    try {
                        c0826r.f2654f = z6;
                        c0826r.f2655g = z7;
                        c0826r.f2656h = z9;
                        c0826r.f2657i = z5;
                        if (z10) {
                            c0826r.f2653e = true;
                            if (c0826r.f2658j != null) {
                                c0826r.m1470a();
                            }
                        }
                        c0826r.f2652d = z11;
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
        c0826r = ((C0829u) this.f2681a.f297e).f2680m;
        synchronized (c0826r.f2651c) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i5, int i6) {
        boolean z5 = this.f2691k;
        if (z5) {
            m1472a(new C1643r(i5, i6));
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i5) {
        boolean z5 = this.f2691k;
        if (z5) {
            m1472a(new C1644s(String.valueOf(charSequence), i5));
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
