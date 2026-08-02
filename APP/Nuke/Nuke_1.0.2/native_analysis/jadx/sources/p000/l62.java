package p000;

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
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class l62 implements InputConnection {

    /* JADX INFO: renamed from: a */
    public final C0485n4 f5950a;

    /* JADX INFO: renamed from: b */
    public final boolean f5951b;

    /* JADX INFO: renamed from: c */
    public final t91 f5952c;

    /* JADX INFO: renamed from: d */
    public final b03 f5953d;

    /* JADX INFO: renamed from: e */
    public final za3 f5954e;

    /* JADX INFO: renamed from: f */
    public int f5955f;

    /* JADX INFO: renamed from: g */
    public k03 f5956g;

    /* JADX INFO: renamed from: h */
    public int f5957h;

    /* JADX INFO: renamed from: i */
    public boolean f5958i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f5959j = new ArrayList();

    /* JADX INFO: renamed from: k */
    public boolean f5960k = true;

    public l62(k03 k03Var, C0485n4 c0485n4, boolean z, t91 t91Var, b03 b03Var, za3 za3Var) {
        this.f5950a = c0485n4;
        this.f5951b = z;
        this.f5952c = t91Var;
        this.f5953d = b03Var;
        this.f5954e = za3Var;
        this.f5956g = k03Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m2846a(rd0 rd0Var) {
        this.f5955f++;
        try {
            this.f5959j.add(rd0Var);
        } finally {
            m2847b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2847b() {
        int i = this.f5955f - 1;
        this.f5955f = i;
        if (i == 0) {
            ArrayList arrayList = this.f5959j;
            if (!arrayList.isEmpty()) {
                ((u91) this.f5950a.f6983i).f11159c.mo5j(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.f5955f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.f5960k;
        if (!z) {
            return z;
        }
        this.f5955f++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m2848c(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.f5960k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f5959j.clear();
        this.f5955f = 0;
        this.f5960k = false;
        ArrayList arrayList = ((u91) this.f5950a.f6983i).f11166j;
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
        boolean z = this.f5960k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.f5960k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.f5960k;
        return z ? this.f5951b : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.f5960k;
        if (z) {
            m2846a(new C0180ev(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.f5960k;
        if (!z) {
            return z;
        }
        m2846a(new z60(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.f5960k;
        if (!z) {
            return z;
        }
        m2846a(new a70(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return m2847b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.f5960k;
        if (!z) {
            return z;
        }
        m2846a(new ej0());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        k03 k03Var = this.f5956g;
        return TextUtils.getCapsMode(k03Var.f5296a.f10051i, f13.m1497f(k03Var.f5297b), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.f5958i = z;
        if (z) {
            this.f5957h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return qp0.m4255j(this.f5956g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (f13.m1494c(this.f5956g.f5297b)) {
            return null;
        }
        return t11.m5049A(this.f5956g).f10051i;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return t11.m5050B(this.f5956g, i).f10051i;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return t11.m5051C(this.f5956g, i).f10051i;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.f5960k;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    m2846a(new mp2(0, this.f5956g.f5296a.f10051i.length()));
                    break;
                case R.id.cut:
                    m2848c(277);
                    return false;
                case R.id.copy:
                    m2848c(278);
                    return false;
                case R.id.paste:
                    m2848c(279);
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
        boolean z = this.f5960k;
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
                ((u91) this.f5950a.f6983i).f11160d.mo5j(new wx0(i2));
            } else {
                i2 = 1;
                ((u91) this.f5950a.f6983i).f11160d.mo5j(new wx0(i2));
            }
        }
        return z;
    }

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
        C0690sd c0690sd;
        long jM2921h;
        int i2;
        int i3;
        String string;
        int i4;
        z03 z03VarM5146d;
        z03 z03VarM5146d2;
        x03 x03Var;
        if (Build.VERSION.SDK_INT >= 34) {
            C0792v c0792v = new C0792v(24, this);
            t91 t91Var = this.f5952c;
            int iM5325x = 3;
            if (t91Var == null || (c0690sd = t91Var.f10631j) == null) {
                i = 0;
            } else {
                z03 z03VarM5146d3 = t91Var.m5146d();
                if (c0690sd.equals((z03VarM5146d3 == null || (x03Var = z03VarM5146d3.f13697a.f13266a) == null) ? null : x03Var.f12754a)) {
                    boolean zM3178r = mp0.m3178r(handwritingGesture);
                    int i5 = 1;
                    b03 b03Var = this.f5953d;
                    if (zM3178r) {
                        SelectGesture selectGestureM3174n = mp0.m3174n(handwritingGesture);
                        long jM3694D = p40.m3694D(t91Var, rp0.m4555p0(selectGestureM3174n.getSelectionArea()), selectGestureM3174n.getGranularity() != 1 ? 0 : 1);
                        if (f13.m1494c(jM3694D)) {
                            iM5325x = AbstractC0738tl.m5325x(mp0.m3170j(selectGestureM3174n), c0792v);
                            i = 0;
                        } else {
                            c0792v.mo5j(new mp2((int) (jM3694D >> 32), (int) (jM3694D & 4294967295L)));
                            if (b03Var != null) {
                                b03Var.m344h(true);
                            }
                            i = 0;
                            iM5325x = 1;
                        }
                    } else if (mp0.m3160D(handwritingGesture)) {
                        DeleteGesture deleteGestureM6492j = zr0.m6492j(handwritingGesture);
                        int i6 = deleteGestureM6492j.getGranularity() != 1 ? 0 : 1;
                        long jM3694D2 = p40.m3694D(t91Var, rp0.m4555p0(deleteGestureM6492j.getDeletionArea()), i6);
                        if (f13.m1494c(jM3694D2)) {
                            iM5325x = AbstractC0738tl.m5325x(mp0.m3170j(deleteGestureM6492j), c0792v);
                            i = 0;
                        } else {
                            AbstractC0738tl.m5289Q(jM3694D2, c0690sd, i6 == 1, c0792v);
                            i = 0;
                            iM5325x = 1;
                        }
                    } else if (zr0.m6497o(handwritingGesture)) {
                        SelectRangeGesture selectRangeGestureM6494l = zr0.m6494l(handwritingGesture);
                        long jM3722d = p40.m3722d(t91Var, rp0.m4555p0(selectRangeGestureM6494l.getSelectionStartArea()), rp0.m4555p0(selectRangeGestureM6494l.getSelectionEndArea()), selectRangeGestureM6494l.getGranularity() != 1 ? 0 : 1);
                        if (f13.m1494c(jM3722d)) {
                            iM5325x = AbstractC0738tl.m5325x(mp0.m3170j(selectRangeGestureM6494l), c0792v);
                            i = 0;
                        } else {
                            c0792v.mo5j(new mp2((int) (jM3722d >> 32), (int) (jM3722d & 4294967295L)));
                            if (b03Var != null) {
                                b03Var.m344h(true);
                            }
                            i = 0;
                            iM5325x = 1;
                        }
                    } else if (zr0.m6500r(handwritingGesture)) {
                        DeleteRangeGesture deleteRangeGestureM6493k = zr0.m6493k(handwritingGesture);
                        int i7 = deleteRangeGestureM6493k.getGranularity() != 1 ? 0 : 1;
                        long jM3722d2 = p40.m3722d(t91Var, rp0.m4555p0(deleteRangeGestureM6493k.getDeletionStartArea()), rp0.m4555p0(deleteRangeGestureM6493k.getDeletionEndArea()), i7);
                        if (f13.m1494c(jM3722d2)) {
                            iM5325x = AbstractC0738tl.m5325x(mp0.m3170j(deleteRangeGestureM6493k), c0792v);
                            i = 0;
                        } else {
                            AbstractC0738tl.m5289Q(jM3722d2, c0690sd, i7 == 1, c0792v);
                            i = 0;
                            iM5325x = 1;
                        }
                    } else {
                        boolean zM3159C = mp0.m3159C(handwritingGesture);
                        za3 za3Var = this.f5954e;
                        int i8 = -1;
                        if (zM3159C) {
                            JoinOrSplitGesture joinOrSplitGestureM3172l = mp0.m3172l(handwritingGesture);
                            if (za3Var == null) {
                                iM5325x = AbstractC0738tl.m5325x(mp0.m3182v(joinOrSplitGestureM3172l), c0792v);
                            } else {
                                int iM3720c = p40.m3720c(t91Var, p40.m3724f(joinOrSplitGestureM3172l.getJoinOrSplitPoint()), za3Var);
                                if (iM3720c == -1 || ((z03VarM5146d2 = t91Var.m5146d()) != null && p40.m3723e(z03VarM5146d2.f13697a, iM3720c))) {
                                    iM5325x = AbstractC0738tl.m5325x(mp0.m3170j(joinOrSplitGestureM3172l), c0792v);
                                } else {
                                    int iCharCount = iM3720c;
                                    while (iCharCount > 0) {
                                        int iCodePointBefore = Character.codePointBefore(c0690sd, iCharCount);
                                        if (!p40.m3701K(iCodePointBefore)) {
                                            break;
                                        } else {
                                            iCharCount -= Character.charCount(iCodePointBefore);
                                        }
                                    }
                                    while (iM3720c < c0690sd.f10051i.length()) {
                                        int iCodePointAt = Character.codePointAt(c0690sd, iM3720c);
                                        if (!p40.m3701K(iCodePointAt)) {
                                            break;
                                        } else {
                                            iM3720c += Character.charCount(iCodePointAt);
                                        }
                                    }
                                    long jM1636i = fg1.m1636i(iCharCount, iM3720c);
                                    if (f13.m1494c(jM1636i)) {
                                        int i9 = (int) (jM1636i >> 32);
                                        c0792v.mo5j(new as0(new rd0[]{new mp2(i9, i9), new C0180ev(" ", 1)}));
                                    } else {
                                        AbstractC0738tl.m5289Q(jM1636i, c0690sd, false, c0792v);
                                    }
                                    i = 0;
                                    iM5325x = 1;
                                }
                            }
                            i = 0;
                        } else {
                            if (mp0.m3184x(handwritingGesture)) {
                                InsertGesture insertGestureM3171k = mp0.m3171k(handwritingGesture);
                                if (za3Var == null) {
                                    iM5325x = AbstractC0738tl.m5325x(mp0.m3182v(insertGestureM3171k), c0792v);
                                } else {
                                    int iM3720c2 = p40.m3720c(t91Var, p40.m3724f(insertGestureM3171k.getInsertionPoint()), za3Var);
                                    if (iM3720c2 == -1 || ((z03VarM5146d = t91Var.m5146d()) != null && p40.m3723e(z03VarM5146d.f13697a, iM3720c2))) {
                                        iM5325x = AbstractC0738tl.m5325x(mp0.m3170j(insertGestureM3171k), c0792v);
                                    } else {
                                        c0792v.mo5j(new as0(new rd0[]{new mp2(iM3720c2, iM3720c2), new C0180ev(insertGestureM3171k.getTextToInsert(), 1)}));
                                        i = 0;
                                        iM5325x = 1;
                                    }
                                }
                            } else if (mp0.m3157A(handwritingGesture)) {
                                RemoveSpaceGesture removeSpaceGestureM3173m = mp0.m3173m(handwritingGesture);
                                z03 z03VarM5146d4 = t91Var.m5146d();
                                y03 y03Var = z03VarM5146d4 != null ? z03VarM5146d4.f13697a : null;
                                long jM3724f = p40.m3724f(removeSpaceGestureM3173m.getStartPoint());
                                long jM3724f2 = p40.m3724f(removeSpaceGestureM3173m.getEndPoint());
                                c61 c61VarM5145c = t91Var.m5145c();
                                if (y03Var != null) {
                                    lj1 lj1Var = y03Var.f13267b;
                                    if (c61VarM5145c == null) {
                                        jM2921h = f13.f2737b;
                                    } else {
                                        long jMo652s = c61VarM5145c.mo652s(jM3724f);
                                        long jMo652s2 = c61VarM5145c.mo652s(jM3724f2);
                                        int iM3692B = p40.m3692B(lj1Var, jMo652s, za3Var);
                                        int iM3692B2 = p40.m3692B(lj1Var, jMo652s2, za3Var);
                                        if (iM3692B != -1) {
                                            if (iM3692B2 != -1) {
                                                iM3692B = Math.min(iM3692B, iM3692B2);
                                            }
                                            iM3692B2 = iM3692B;
                                        } else if (iM3692B2 == -1) {
                                            jM2921h = f13.f2737b;
                                        }
                                        float fM2915b = (lj1Var.m2915b(iM3692B2) + lj1Var.m2919f(iM3692B2)) / 2.0f;
                                        int i10 = (int) (jMo652s >> 32);
                                        int i11 = (int) (jMo652s2 >> 32);
                                        jM2921h = lj1Var.m2921h(new o62(Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), fM2915b - 0.1f, Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), fM2915b + 0.1f), 0, gd3.f3426M);
                                    }
                                    if (f13.m1494c(jM2921h)) {
                                        iM5325x = AbstractC0738tl.m5325x(mp0.m3170j(removeSpaceGestureM3173m), c0792v);
                                    } else {
                                        String str = c0690sd.subSequence(f13.m1497f(jM2921h), f13.m1496e(jM2921h)).f10051i;
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
                                                sb.append((CharSequence) str, i12, kj1Var.m2717z().f25h);
                                                if (i2 == i8) {
                                                    i2 = kj1Var.m2717z().f25h;
                                                }
                                                i3 = kj1Var.m2717z().f26i + i5;
                                                sb.append((CharSequence) "");
                                                i12 = kj1Var.m2717z().f26i + i5;
                                                CharSequence charSequence = (CharSequence) kj1Var.f5595j;
                                                Matcher matcher2 = (Matcher) kj1Var.f5594i;
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
                                            iM5325x = AbstractC0738tl.m5325x(mp0.m3170j(removeSpaceGestureM3173m), c0792v);
                                        } else {
                                            int i13 = (int) (jM2921h >> 32);
                                            String strSubstring = string.substring(i2, string.length() - (f13.m1495d(jM2921h) - i3));
                                            mp2 mp2Var = new mp2(i13 + i2, i13 + i3);
                                            iM5325x = 1;
                                            C0180ev c0180ev = new C0180ev(strSubstring, 1);
                                            rd0[] rd0VarArr = new rd0[2];
                                            rd0VarArr[i] = mp2Var;
                                            rd0VarArr[1] = c0180ev;
                                            c0792v.mo5j(new as0(rd0VarArr));
                                        }
                                    }
                                }
                            } else {
                                i = 0;
                                iM5325x = 2;
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
                executor.execute(new RunnableC0577pe(iM5325x, i, intConsumer));
            } else {
                intConsumer.accept(iM5325x);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.f5960k;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        t91 t91Var;
        C0690sd c0690sd;
        x03 x03Var;
        if (Build.VERSION.SDK_INT >= 34 && (t91Var = this.f5952c) != null && (c0690sd = t91Var.f10631j) != null) {
            z03 z03VarM5146d = t91Var.m5146d();
            if (c0690sd.equals((z03VarM5146d == null || (x03Var = z03VarM5146d.f13697a.f13266a) == null) ? null : x03Var.f12754a)) {
                boolean zM3178r = mp0.m3178r(previewableHandwritingGesture);
                int i = 1;
                tr0 tr0Var = tr0.f10906h;
                b03 b03Var = this.f5953d;
                if (zM3178r) {
                    SelectGesture selectGestureM3174n = mp0.m3174n(previewableHandwritingGesture);
                    if (b03Var != null) {
                        long jM3694D = p40.m3694D(t91Var, rp0.m4555p0(selectGestureM3174n.getSelectionArea()), selectGestureM3174n.getGranularity() != 1 ? 0 : 1);
                        t91 t91Var2 = b03Var.f483d;
                        if (t91Var2 != null) {
                            t91Var2.m5148f(jM3694D);
                        }
                        t91 t91Var3 = b03Var.f483d;
                        if (t91Var3 != null) {
                            t91Var3.m5147e(f13.f2737b);
                        }
                        if (!f13.m1494c(jM3694D)) {
                            b03Var.m356t(false);
                            b03Var.m353q(tr0Var);
                        }
                    }
                } else if (mp0.m3160D(previewableHandwritingGesture)) {
                    DeleteGesture deleteGestureM6492j = zr0.m6492j(previewableHandwritingGesture);
                    if (b03Var != null) {
                        long jM3694D2 = p40.m3694D(t91Var, rp0.m4555p0(deleteGestureM6492j.getDeletionArea()), deleteGestureM6492j.getGranularity() != 1 ? 0 : 1);
                        t91 t91Var4 = b03Var.f483d;
                        if (t91Var4 != null) {
                            t91Var4.m5147e(jM3694D2);
                        }
                        t91 t91Var5 = b03Var.f483d;
                        if (t91Var5 != null) {
                            t91Var5.m5148f(f13.f2737b);
                        }
                        if (!f13.m1494c(jM3694D2)) {
                            b03Var.m356t(false);
                            b03Var.m353q(tr0Var);
                        }
                    }
                } else if (zr0.m6497o(previewableHandwritingGesture)) {
                    SelectRangeGesture selectRangeGestureM6494l = zr0.m6494l(previewableHandwritingGesture);
                    if (b03Var != null) {
                        long jM3722d = p40.m3722d(t91Var, rp0.m4555p0(selectRangeGestureM6494l.getSelectionStartArea()), rp0.m4555p0(selectRangeGestureM6494l.getSelectionEndArea()), selectRangeGestureM6494l.getGranularity() != 1 ? 0 : 1);
                        t91 t91Var6 = b03Var.f483d;
                        if (t91Var6 != null) {
                            t91Var6.m5148f(jM3722d);
                        }
                        t91 t91Var7 = b03Var.f483d;
                        if (t91Var7 != null) {
                            t91Var7.m5147e(f13.f2737b);
                        }
                        if (!f13.m1494c(jM3722d)) {
                            b03Var.m356t(false);
                            b03Var.m353q(tr0Var);
                        }
                    }
                } else if (zr0.m6500r(previewableHandwritingGesture)) {
                    DeleteRangeGesture deleteRangeGestureM6493k = zr0.m6493k(previewableHandwritingGesture);
                    if (b03Var != null) {
                        long jM3722d2 = p40.m3722d(t91Var, rp0.m4555p0(deleteRangeGestureM6493k.getDeletionStartArea()), rp0.m4555p0(deleteRangeGestureM6493k.getDeletionEndArea()), deleteRangeGestureM6493k.getGranularity() != 1 ? 0 : 1);
                        t91 t91Var8 = b03Var.f483d;
                        if (t91Var8 != null) {
                            t91Var8.m5147e(jM3722d2);
                        }
                        t91 t91Var9 = b03Var.f483d;
                        if (t91Var9 != null) {
                            t91Var9.m5148f(f13.f2737b);
                        }
                        if (!f13.m1494c(jM3722d2)) {
                            b03Var.m356t(false);
                            b03Var.m353q(tr0Var);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new C0145dx(i, b03Var));
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
    */
    public final boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        n91 n91Var;
        boolean z4 = this.f5960k;
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
                n91Var = ((u91) this.f5950a.f6983i).f11169m;
                synchronized (n91Var.f7060c) {
                    try {
                        n91Var.f7063f = z2;
                        n91Var.f7064g = z3;
                        n91Var.f7065h = z5;
                        n91Var.f7066i = z;
                        if (z6) {
                            n91Var.f7062e = true;
                            if (n91Var.f7067j != null) {
                                n91Var.m3259a();
                            }
                        }
                        n91Var.f7061d = z7;
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
        n91Var = ((u91) this.f5950a.f6983i).f11169m;
        synchronized (n91Var.f7060c) {
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.f5960k;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((u91) this.f5950a.f6983i).f11167k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.f5960k;
        if (z) {
            m2846a(new kp2(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.f5960k;
        if (z) {
            m2846a(new lp2(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.f5960k;
        if (!z) {
            return z;
        }
        m2846a(new mp2(i, i2));
        return true;
    }
}
