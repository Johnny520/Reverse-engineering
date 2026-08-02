package defpackage;

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
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class l62 implements InputConnection {
    public final n4 a;
    public final boolean b;
    public final t91 c;
    public final b03 d;
    public final za3 e;
    public int f;
    public k03 g;
    public int h;
    public boolean i;
    public final ArrayList j = new ArrayList();
    public boolean k = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l62(k03 k03Var, n4 n4Var, boolean z, t91 t91Var, b03 b03Var, za3 za3Var) {
        this.a = n4Var;
        this.b = z;
        this.c = t91Var;
        this.d = b03Var;
        this.e = za3Var;
        this.g = k03Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(rd0 rd0Var) {
        this.f++;
        try {
            this.j.add(rd0Var);
        } finally {
            b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            ArrayList arrayList = this.j;
            if (!arrayList.isEmpty()) {
                ((u91) this.a.i).c.j(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.f > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        this.f++;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.j.clear();
        this.f = 0;
        this.k = false;
        ArrayList arrayList = ((u91) this.a.i).j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (t11.l(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.k;
        return z ? this.b : z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.k;
        if (z) {
            a(new ev(String.valueOf(charSequence), i));
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new z60(i, i2));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new a70(i, i2));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new ej0());
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        k03 k03Var = this.g;
        return TextUtils.getCapsMode(k03Var.a.i, f13.f(k03Var.b), i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.i = z;
        if (z) {
            this.h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return qp0.j(this.g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (f13.c(this.g.b)) {
            return null;
        }
        return t11.A(this.g).i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return t11.B(this.g, i).i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return t11.C(this.g, i).i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.k;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    a(new mp2(0, this.g.a.i.length()));
                    break;
                case R.id.cut:
                    c(277);
                    return false;
                case R.id.copy:
                    c(278);
                    return false;
                case R.id.paste:
                    c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.k;
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
                ((u91) this.a.i).d.j(new wx0(i2));
            } else {
                i2 = 1;
                ((u91) this.a.i).d.j(new wx0(i2));
            }
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03de A[PHI: r6
  0x03de: PHI (r6v1 int) = 
  (r6v0 int)
  (r6v0 int)
  (r6v0 int)
  (r6v15 int)
  (r6v17 int)
  (r6v19 int)
  (r6v21 int)
  (r6v30 int)
  (r6v34 int)
  (r6v38 int)
  (r6v42 int)
  (r6v47 int)
 binds: [B:5:0x0017, B:7:0x001b, B:16:0x0033, B:135:0x02d6, B:111:0x0237, B:102:0x01f2, B:97:0x01dc, B:73:0x015b, B:64:0x0137, B:52:0x00ec, B:39:0x00ac, B:26:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        int i;
        sd sdVar;
        long jH;
        int i2;
        int i3;
        String string;
        int i4;
        z03 z03VarD;
        z03 z03VarD2;
        x03 x03Var;
        if (Build.VERSION.SDK_INT >= 34) {
            v vVar = new v(24, this);
            t91 t91Var = this.c;
            int iX = 3;
            if (t91Var == null || (sdVar = t91Var.j) == null) {
                i = 0;
            } else {
                z03 z03VarD3 = t91Var.d();
                if (sdVar.equals((z03VarD3 == null || (x03Var = z03VarD3.a.a) == null) ? null : x03Var.a)) {
                    boolean zR = mp0.r(handwritingGesture);
                    int i5 = 1;
                    b03 b03Var = this.d;
                    if (zR) {
                        SelectGesture selectGestureN = mp0.n(handwritingGesture);
                        long jD = p40.D(t91Var, rp0.p0(selectGestureN.getSelectionArea()), selectGestureN.getGranularity() != 1 ? 0 : 1);
                        if (f13.c(jD)) {
                            iX = tl.x(mp0.j(selectGestureN), vVar);
                            i = 0;
                        } else {
                            vVar.j(new mp2((int) (jD >> 32), (int) (jD & 4294967295L)));
                            if (b03Var != null) {
                                b03Var.h(true);
                            }
                            i = 0;
                            iX = 1;
                        }
                    } else if (mp0.D(handwritingGesture)) {
                        DeleteGesture deleteGestureJ = zr0.j(handwritingGesture);
                        int i6 = deleteGestureJ.getGranularity() != 1 ? 0 : 1;
                        long jD2 = p40.D(t91Var, rp0.p0(deleteGestureJ.getDeletionArea()), i6);
                        if (f13.c(jD2)) {
                            iX = tl.x(mp0.j(deleteGestureJ), vVar);
                            i = 0;
                        } else {
                            tl.Q(jD2, sdVar, i6 == 1, vVar);
                            i = 0;
                            iX = 1;
                        }
                    } else if (zr0.o(handwritingGesture)) {
                        SelectRangeGesture selectRangeGestureL = zr0.l(handwritingGesture);
                        long jD3 = p40.d(t91Var, rp0.p0(selectRangeGestureL.getSelectionStartArea()), rp0.p0(selectRangeGestureL.getSelectionEndArea()), selectRangeGestureL.getGranularity() != 1 ? 0 : 1);
                        if (f13.c(jD3)) {
                            iX = tl.x(mp0.j(selectRangeGestureL), vVar);
                            i = 0;
                        } else {
                            vVar.j(new mp2((int) (jD3 >> 32), (int) (jD3 & 4294967295L)));
                            if (b03Var != null) {
                                b03Var.h(true);
                            }
                            i = 0;
                            iX = 1;
                        }
                    } else if (zr0.r(handwritingGesture)) {
                        DeleteRangeGesture deleteRangeGestureK = zr0.k(handwritingGesture);
                        int i7 = deleteRangeGestureK.getGranularity() != 1 ? 0 : 1;
                        long jD4 = p40.d(t91Var, rp0.p0(deleteRangeGestureK.getDeletionStartArea()), rp0.p0(deleteRangeGestureK.getDeletionEndArea()), i7);
                        if (f13.c(jD4)) {
                            iX = tl.x(mp0.j(deleteRangeGestureK), vVar);
                            i = 0;
                        } else {
                            tl.Q(jD4, sdVar, i7 == 1, vVar);
                            i = 0;
                            iX = 1;
                        }
                    } else {
                        boolean zC = mp0.C(handwritingGesture);
                        za3 za3Var = this.e;
                        int i8 = -1;
                        if (zC) {
                            JoinOrSplitGesture joinOrSplitGestureL = mp0.l(handwritingGesture);
                            if (za3Var == null) {
                                iX = tl.x(mp0.v(joinOrSplitGestureL), vVar);
                            } else {
                                int iC = p40.c(t91Var, p40.f(joinOrSplitGestureL.getJoinOrSplitPoint()), za3Var);
                                if (iC == -1 || ((z03VarD2 = t91Var.d()) != null && p40.e(z03VarD2.a, iC))) {
                                    iX = tl.x(mp0.j(joinOrSplitGestureL), vVar);
                                } else {
                                    int iCharCount = iC;
                                    while (iCharCount > 0) {
                                        int iCodePointBefore = Character.codePointBefore(sdVar, iCharCount);
                                        if (!p40.K(iCodePointBefore)) {
                                            break;
                                        } else {
                                            iCharCount -= Character.charCount(iCodePointBefore);
                                        }
                                    }
                                    while (iC < sdVar.i.length()) {
                                        int iCodePointAt = Character.codePointAt(sdVar, iC);
                                        if (!p40.K(iCodePointAt)) {
                                            break;
                                        } else {
                                            iC += Character.charCount(iCodePointAt);
                                        }
                                    }
                                    long jI = fg1.i(iCharCount, iC);
                                    if (f13.c(jI)) {
                                        int i9 = (int) (jI >> 32);
                                        vVar.j(new as0(new rd0[]{new mp2(i9, i9), new ev(" ", 1)}));
                                    } else {
                                        tl.Q(jI, sdVar, false, vVar);
                                    }
                                    i = 0;
                                    iX = 1;
                                }
                            }
                            i = 0;
                        } else {
                            if (mp0.x(handwritingGesture)) {
                                InsertGesture insertGestureK = mp0.k(handwritingGesture);
                                if (za3Var == null) {
                                    iX = tl.x(mp0.v(insertGestureK), vVar);
                                } else {
                                    int iC2 = p40.c(t91Var, p40.f(insertGestureK.getInsertionPoint()), za3Var);
                                    if (iC2 == -1 || ((z03VarD = t91Var.d()) != null && p40.e(z03VarD.a, iC2))) {
                                        iX = tl.x(mp0.j(insertGestureK), vVar);
                                    } else {
                                        vVar.j(new as0(new rd0[]{new mp2(iC2, iC2), new ev(insertGestureK.getTextToInsert(), 1)}));
                                        i = 0;
                                        iX = 1;
                                    }
                                }
                            } else if (mp0.A(handwritingGesture)) {
                                RemoveSpaceGesture removeSpaceGestureM = mp0.m(handwritingGesture);
                                z03 z03VarD4 = t91Var.d();
                                y03 y03Var = z03VarD4 != null ? z03VarD4.a : null;
                                long jF = p40.f(removeSpaceGestureM.getStartPoint());
                                long jF2 = p40.f(removeSpaceGestureM.getEndPoint());
                                c61 c61VarC = t91Var.c();
                                if (y03Var != null) {
                                    lj1 lj1Var = y03Var.b;
                                    if (c61VarC == null) {
                                        jH = f13.b;
                                    } else {
                                        long jS = c61VarC.s(jF);
                                        long jS2 = c61VarC.s(jF2);
                                        int iB = p40.B(lj1Var, jS, za3Var);
                                        int iB2 = p40.B(lj1Var, jS2, za3Var);
                                        if (iB != -1) {
                                            if (iB2 != -1) {
                                                iB = Math.min(iB, iB2);
                                            }
                                            iB2 = iB;
                                        } else if (iB2 == -1) {
                                            jH = f13.b;
                                        }
                                        float fB = (lj1Var.b(iB2) + lj1Var.f(iB2)) / 2.0f;
                                        int i10 = (int) (jS >> 32);
                                        int i11 = (int) (jS2 >> 32);
                                        jH = lj1Var.h(new o62(Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), fB - 0.1f, Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), fB + 0.1f), 0, gd3.M);
                                    }
                                    if (f13.c(jH)) {
                                        iX = tl.x(mp0.j(removeSpaceGestureM), vVar);
                                    } else {
                                        String str = sdVar.subSequence(f13.f(jH), f13.e(jH)).i;
                                        Pattern patternCompile = Pattern.compile("\\s+");
                                        patternCompile.getClass();
                                        str.getClass();
                                        Matcher matcher = patternCompile.matcher(str);
                                        matcher.getClass();
                                        kj1 kj1Var = !matcher.find(0) ? null : new kj1(matcher, str);
                                        if (kj1Var == null) {
                                            string = str.toString();
                                            i = 0;
                                            i3 = -1;
                                            i4 = -1;
                                            i2 = -1;
                                        } else {
                                            int length = str.length();
                                            StringBuilder sb = new StringBuilder(length);
                                            int i12 = 0;
                                            i = 0;
                                            i2 = -1;
                                            while (true) {
                                                sb.append((CharSequence) str, i12, kj1Var.z().h);
                                                if (i2 == i8) {
                                                    i2 = kj1Var.z().h;
                                                }
                                                i3 = kj1Var.z().i + i5;
                                                sb.append((CharSequence) "");
                                                i12 = kj1Var.z().i + i5;
                                                CharSequence charSequence = (CharSequence) kj1Var.j;
                                                Matcher matcher2 = (Matcher) kj1Var.i;
                                                int iEnd = matcher2.end() + (matcher2.end() == matcher2.start() ? 1 : 0);
                                                if (iEnd <= charSequence.length()) {
                                                    Matcher matcher3 = matcher2.pattern().matcher(charSequence);
                                                    matcher3.getClass();
                                                    kj1Var = !matcher3.find(iEnd) ? null : new kj1(matcher3, charSequence);
                                                } else {
                                                    kj1Var = null;
                                                }
                                                if (i12 >= length || kj1Var == null) {
                                                    break;
                                                }
                                                i8 = -1;
                                                i5 = 1;
                                            }
                                            if (i12 < length) {
                                                sb.append((CharSequence) str, i12, length);
                                            }
                                            string = sb.toString();
                                            i4 = -1;
                                        }
                                        if (i2 == i4 || i3 == i4) {
                                            iX = tl.x(mp0.j(removeSpaceGestureM), vVar);
                                        } else {
                                            int i13 = (int) (jH >> 32);
                                            String strSubstring = string.substring(i2, string.length() - (f13.d(jH) - i3));
                                            mp2 mp2Var = new mp2(i13 + i2, i13 + i3);
                                            iX = 1;
                                            ev evVar = new ev(strSubstring, 1);
                                            rd0[] rd0VarArr = new rd0[2];
                                            rd0VarArr[i] = mp2Var;
                                            rd0VarArr[1] = evVar;
                                            vVar.j(new as0(rd0VarArr));
                                        }
                                    }
                                }
                            } else {
                                i = 0;
                                iX = 2;
                            }
                            i = 0;
                        }
                    }
                }
            }
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new pe(iX, i, intConsumer));
            } else {
                intConsumer.accept(iX);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.k;
        if (z) {
            return true;
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        t91 t91Var;
        sd sdVar;
        x03 x03Var;
        if (Build.VERSION.SDK_INT >= 34 && (t91Var = this.c) != null && (sdVar = t91Var.j) != null) {
            z03 z03VarD = t91Var.d();
            if (sdVar.equals((z03VarD == null || (x03Var = z03VarD.a.a) == null) ? null : x03Var.a)) {
                boolean zR = mp0.r(previewableHandwritingGesture);
                int i = 1;
                tr0 tr0Var = tr0.h;
                b03 b03Var = this.d;
                if (zR) {
                    SelectGesture selectGestureN = mp0.n(previewableHandwritingGesture);
                    if (b03Var != null) {
                        long jD = p40.D(t91Var, rp0.p0(selectGestureN.getSelectionArea()), selectGestureN.getGranularity() != 1 ? 0 : 1);
                        t91 t91Var2 = b03Var.d;
                        if (t91Var2 != null) {
                            t91Var2.f(jD);
                        }
                        t91 t91Var3 = b03Var.d;
                        if (t91Var3 != null) {
                            t91Var3.e(f13.b);
                        }
                        if (!f13.c(jD)) {
                            b03Var.t(false);
                            b03Var.q(tr0Var);
                        }
                    }
                } else if (mp0.D(previewableHandwritingGesture)) {
                    DeleteGesture deleteGestureJ = zr0.j(previewableHandwritingGesture);
                    if (b03Var != null) {
                        long jD2 = p40.D(t91Var, rp0.p0(deleteGestureJ.getDeletionArea()), deleteGestureJ.getGranularity() != 1 ? 0 : 1);
                        t91 t91Var4 = b03Var.d;
                        if (t91Var4 != null) {
                            t91Var4.e(jD2);
                        }
                        t91 t91Var5 = b03Var.d;
                        if (t91Var5 != null) {
                            t91Var5.f(f13.b);
                        }
                        if (!f13.c(jD2)) {
                            b03Var.t(false);
                            b03Var.q(tr0Var);
                        }
                    }
                } else if (zr0.o(previewableHandwritingGesture)) {
                    SelectRangeGesture selectRangeGestureL = zr0.l(previewableHandwritingGesture);
                    if (b03Var != null) {
                        long jD3 = p40.d(t91Var, rp0.p0(selectRangeGestureL.getSelectionStartArea()), rp0.p0(selectRangeGestureL.getSelectionEndArea()), selectRangeGestureL.getGranularity() != 1 ? 0 : 1);
                        t91 t91Var6 = b03Var.d;
                        if (t91Var6 != null) {
                            t91Var6.f(jD3);
                        }
                        t91 t91Var7 = b03Var.d;
                        if (t91Var7 != null) {
                            t91Var7.e(f13.b);
                        }
                        if (!f13.c(jD3)) {
                            b03Var.t(false);
                            b03Var.q(tr0Var);
                        }
                    }
                } else if (zr0.r(previewableHandwritingGesture)) {
                    DeleteRangeGesture deleteRangeGestureK = zr0.k(previewableHandwritingGesture);
                    if (b03Var != null) {
                        long jD4 = p40.d(t91Var, rp0.p0(deleteRangeGestureK.getDeletionStartArea()), rp0.p0(deleteRangeGestureK.getDeletionEndArea()), deleteRangeGestureK.getGranularity() != 1 ? 0 : 1);
                        t91 t91Var8 = b03Var.d;
                        if (t91Var8 != null) {
                            t91Var8.e(jD4);
                        }
                        t91 t91Var9 = b03Var.d;
                        if (t91Var9 != null) {
                            t91Var9.f(f13.b);
                        }
                        if (!f13.c(jD4)) {
                            b03Var.t(false);
                            b03Var.q(tr0Var);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new dx(i, b03Var));
                }
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        n91 n91Var;
        boolean z4 = this.k;
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
                n91Var = ((u91) this.a.i).m;
                synchronized (n91Var.c) {
                    try {
                        n91Var.f = z2;
                        n91Var.g = z3;
                        n91Var.h = z5;
                        n91Var.i = z;
                        if (z6) {
                            n91Var.e = true;
                            if (n91Var.j != null) {
                                n91Var.a();
                            }
                        }
                        n91Var.d = z7;
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
        n91Var = ((u91) this.a.i).m;
        synchronized (n91Var.c) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((u91) this.a.i).k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.k;
        if (z) {
            a(new kp2(i, i2));
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.k;
        if (z) {
            a(new lp2(String.valueOf(charSequence), i));
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new mp2(i, i2));
        return true;
    }
}
