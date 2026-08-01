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
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.activity.compose.C0849;
import androidx.appcompat.app.C0960;
import androidx.compose.foundation.text.C1781;
import androidx.compose.foundation.text.C1801;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.contextmenu.internal.AbstractC1629;
import androidx.compose.foundation.text.selection.C1720;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.layout.InterfaceC2530;
import androidx.compose.p001ui.platform.InterfaceC2698;
import androidx.compose.p001ui.text.AbstractC2882;
import androidx.compose.p001ui.text.C2867;
import androidx.compose.p001ui.text.C2868;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.p001ui.text.C2877;
import androidx.compose.p001ui.text.C2896;
import androidx.compose.p001ui.text.C2902;
import androidx.compose.p001ui.text.input.C2840;
import androidx.compose.p001ui.text.input.C2841;
import androidx.compose.p001ui.text.input.C2844;
import androidx.compose.p001ui.text.input.C2845;
import androidx.compose.p001ui.text.input.C2847;
import androidx.compose.p001ui.text.input.C2849;
import androidx.compose.p001ui.text.input.C2850;
import androidx.compose.p001ui.text.input.C2861;
import androidx.compose.p001ui.text.input.C2862;
import androidx.compose.p001ui.text.input.InterfaceC2839;
import com.bumptech.glide.AbstractC3897;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.text.Regex;
import p128.C8157;
import p128.C8158;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class InputConnectionC1688 implements InputConnection {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f2726;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC2698 f2727;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C1720 f2728;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1781 f2729;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f2730;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0960 f2731;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f2732;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C2847 f2733;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public boolean f2735;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final ArrayList f2736 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public boolean f2734 = true;

    public InputConnectionC1688(C2847 c2847, C0960 c0960, boolean z, C1781 c1781, C1720 c1720, InterfaceC2698 interfaceC2698) {
        this.f2731 = c0960;
        this.f2730 = z;
        this.f2729 = c1781;
        this.f2728 = c1720;
        this.f2727 = interfaceC2698;
        this.f2733 = c2847;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.f2734;
        if (!z) {
            return z;
        }
        this.f2726++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.f2734;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f2736.clear();
        this.f2726 = 0;
        this.f2734 = false;
        ArrayList arrayList = ((C1689) this.f2731.f702).f2749;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (AbstractC5227.m9466(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.f2734;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.f2734;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.f2734;
        return z ? this.f2730 : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.f2734;
        if (z) {
            m2225(new C2844(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.f2734;
        if (!z) {
            return z;
        }
        m2225(new C2841(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.f2734;
        if (!z) {
            return z;
        }
        m2225(new C2840(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return m2224();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.f2734;
        if (!z) {
            return z;
        }
        m2225(new C2861());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        C2847 c2847 = this.f2733;
        return TextUtils.getCapsMode(c2847.f6292.f6474, C2869.m4317(c2847.f6291), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.f2735 = z;
        if (z) {
            this.f2732 = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return AbstractC1695.m2229(this.f2733);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (C2869.m4312(this.f2733.f6291)) {
            return null;
        }
        return AbstractC3897.m7389(this.f2733).f6474;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return AbstractC3897.m7386(this.f2733, i).f6474;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return AbstractC3897.m7387(this.f2733, i).f6474;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.f2734;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    m2225(new C2850(0, this.f2733.f6292.f6474.length()));
                    break;
                case R.id.cut:
                    m2223(277);
                    return false;
                case R.id.copy:
                    m2223(278);
                    return false;
                case R.id.paste:
                    m2223(279);
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
        boolean z = this.f2734;
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
                ((C1689) this.f2731.f702).f2739.invoke(new C2862(i2));
            } else {
                i2 = 1;
                ((C1689) this.f2731.f702).f2739.invoke(new C2862(i2));
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0331  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        C2902 c2902;
        long jM4353;
        int i;
        int iM4354;
        C1801 c1801M2425;
        C2867 c2867;
        C2867 c28672;
        long jMo3639;
        int iM2234;
        char c;
        int iCharCount;
        C1801 c1801M24252;
        C2867 c28673;
        C2867 c28674;
        long jMo36392;
        int iM22342;
        C2867 c28675;
        C2868 c2868;
        if (Build.VERSION.SDK_INT >= 34) {
            C1715 c1715 = new C1715(this, 4);
            int i2 = 0;
            C1781 c1781 = this.f2729;
            int iM2235 = 3;
            if (c1781 != null && (c2902 = c1781.f3033) != null) {
                C1801 c1801M24253 = c1781.m2425();
                if (c2902.equals((c1801M24253 == null || (c28675 = c1801M24253.f3090) == null || (c2868 = c28675.f6336) == null) ? null : c2868.f6342)) {
                    boolean zM2168 = AbstractC1629.m2168(handwritingGesture);
                    C1720 c1720 = this.f2728;
                    if (zM2168) {
                        SelectGesture selectGestureM2174 = AbstractC1629.m2174(handwritingGesture);
                        long jM2238 = AbstractC1695.m2238(c1781, AbstractC2416.m3431(selectGestureM2174.getSelectionArea()), selectGestureM2174.getGranularity() != 1 ? 0 : 1);
                        if (C2869.m4312(jM2238)) {
                            iM2235 = AbstractC1695.m2235(AbstractC1629.m2183(selectGestureM2174), c1715);
                        } else {
                            c1715.invoke(new C2850((int) (jM2238 >> 32), (int) (jM2238 & 4294967295L)));
                            if (c1720 != null) {
                                c1720.m2334(true);
                            }
                            iM2235 = 1;
                        }
                    } else if (AbstractC1709.m2274(handwritingGesture)) {
                        DeleteGesture deleteGestureM2276 = AbstractC1709.m2276(handwritingGesture);
                        int i3 = deleteGestureM2276.getGranularity() != 1 ? 0 : 1;
                        long jM22382 = AbstractC1695.m2238(c1781, AbstractC2416.m3431(deleteGestureM2276.getDeletionArea()), i3);
                        if (C2869.m4312(jM22382)) {
                            iM2235 = AbstractC1695.m2235(AbstractC1629.m2183(deleteGestureM2276), c1715);
                        } else {
                            AbstractC1695.m2232(jM22382, c2902, i3 == 1, c1715);
                            iM2235 = 1;
                        }
                    } else if (AbstractC1709.m2258(handwritingGesture)) {
                        SelectRangeGesture selectRangeGestureM2280 = AbstractC1709.m2280(handwritingGesture);
                        long jM2231 = AbstractC1695.m2231(c1781, AbstractC2416.m3431(selectRangeGestureM2280.getSelectionStartArea()), AbstractC2416.m3431(selectRangeGestureM2280.getSelectionEndArea()), selectRangeGestureM2280.getGranularity() != 1 ? 0 : 1);
                        if (C2869.m4312(jM2231)) {
                            iM2235 = AbstractC1695.m2235(AbstractC1629.m2183(selectRangeGestureM2280), c1715);
                        } else {
                            c1715.invoke(new C2850((int) (jM2231 >> 32), (int) (jM2231 & 4294967295L)));
                            if (c1720 != null) {
                                c1720.m2334(true);
                            }
                            iM2235 = 1;
                        }
                    } else if (AbstractC1709.m2257(handwritingGesture)) {
                        DeleteRangeGesture deleteRangeGestureM2275 = AbstractC1709.m2275(handwritingGesture);
                        int i4 = deleteRangeGestureM2275.getGranularity() != 1 ? 0 : 1;
                        long jM22312 = AbstractC1695.m2231(c1781, AbstractC2416.m3431(deleteRangeGestureM2275.getDeletionStartArea()), AbstractC2416.m3431(deleteRangeGestureM2275.getDeletionEndArea()), i4);
                        if (C2869.m4312(jM22312)) {
                            iM2235 = AbstractC1695.m2235(AbstractC1629.m2183(deleteRangeGestureM2275), c1715);
                        } else {
                            AbstractC1695.m2232(jM22312, c2902, i4 == 1, c1715);
                            iM2235 = 1;
                        }
                    } else {
                        boolean zM2158 = AbstractC1629.m2158(handwritingGesture);
                        InterfaceC2698 interfaceC2698 = this.f2727;
                        if (zM2158) {
                            JoinOrSplitGesture joinOrSplitGestureM2181 = AbstractC1629.m2181(handwritingGesture);
                            if (interfaceC2698 == null) {
                                iM2235 = AbstractC1695.m2235(AbstractC1709.m2279(joinOrSplitGestureM2181), c1715);
                            } else {
                                long jM2228 = AbstractC1695.m2228(joinOrSplitGestureM2181.getJoinOrSplitPoint());
                                C1801 c1801M24254 = c1781.m2425();
                                if (c1801M24254 == null || (c28674 = c1801M24254.f3090) == null) {
                                    c = ' ';
                                } else {
                                    C2896 c2896 = c28674.f6335;
                                    c = ' ';
                                    InterfaceC2530 interfaceC2530M2426 = c1781.m2426();
                                    if (interfaceC2530M2426 != null && (iM22342 = AbstractC1695.m2234(c2896, (jMo36392 = interfaceC2530M2426.mo3639(jM2228)), interfaceC2698)) != -1) {
                                        iCharCount = c2896.m4354(C8158.m13089(jMo36392, (c2896.m4350(iM22342) + c2896.m4346(iM22342)) / 2.0f, 1));
                                    }
                                    if (iCharCount == -1 && ((c1801M24252 = c1781.m2425()) == null || (c28673 = c1801M24252.f3090) == null || !AbstractC1695.m2230(c28673, iCharCount))) {
                                        int iCharCount2 = iCharCount;
                                        while (iCharCount2 > 0) {
                                            int iCodePointBefore = Character.codePointBefore(c2902, iCharCount2);
                                            if (!AbstractC1695.m2236(iCodePointBefore)) {
                                                break;
                                            } else {
                                                iCharCount2 -= Character.charCount(iCodePointBefore);
                                            }
                                        }
                                        while (iCharCount < c2902.length()) {
                                            int iCodePointAt = Character.codePointAt(c2902, iCharCount);
                                            if (!AbstractC1695.m2236(iCodePointAt)) {
                                                break;
                                            } else {
                                                iCharCount += Character.charCount(iCodePointAt);
                                            }
                                        }
                                        long jM4330 = AbstractC2882.m4330(iCharCount2, iCharCount);
                                        if (C2869.m4312(jM4330)) {
                                            int i5 = (int) (jM4330 >> c);
                                            c1715.invoke(new C1702(new InterfaceC2839[]{new C2850(i5, i5), new C2844(" ", 1)}));
                                        } else {
                                            AbstractC1695.m2232(jM4330, c2902, false, c1715);
                                        }
                                        iM2235 = 1;
                                    } else {
                                        iM2235 = AbstractC1695.m2235(AbstractC1629.m2183(joinOrSplitGestureM2181), c1715);
                                    }
                                }
                                iCharCount = -1;
                                if (iCharCount == -1) {
                                }
                                iM2235 = AbstractC1695.m2235(AbstractC1629.m2183(joinOrSplitGestureM2181), c1715);
                            }
                        } else if (AbstractC1629.m2169(handwritingGesture)) {
                            InsertGesture insertGestureM2184 = AbstractC1629.m2184(handwritingGesture);
                            if (interfaceC2698 == null) {
                                iM2235 = AbstractC1695.m2235(AbstractC1709.m2279(insertGestureM2184), c1715);
                            } else {
                                long jM22282 = AbstractC1695.m2228(insertGestureM2184.getInsertionPoint());
                                C1801 c1801M24255 = c1781.m2425();
                                if (c1801M24255 == null || (c28672 = c1801M24255.f3090) == null) {
                                    iM4354 = -1;
                                    if (iM4354 == -1 && ((c1801M2425 = c1781.m2425()) == null || (c2867 = c1801M2425.f3090) == null || !AbstractC1695.m2230(c2867, iM4354))) {
                                        c1715.invoke(new C1702(new InterfaceC2839[]{new C2850(iM4354, iM4354), new C2844(insertGestureM2184.getTextToInsert(), 1)}));
                                        iM2235 = 1;
                                    } else {
                                        iM2235 = AbstractC1695.m2235(AbstractC1629.m2183(insertGestureM2184), c1715);
                                    }
                                } else {
                                    C2896 c28962 = c28672.f6335;
                                    InterfaceC2530 interfaceC2530M24262 = c1781.m2426();
                                    if (interfaceC2530M24262 != null && (iM2234 = AbstractC1695.m2234(c28962, (jMo3639 = interfaceC2530M24262.mo3639(jM22282)), interfaceC2698)) != -1) {
                                        iM4354 = c28962.m4354(C8158.m13089(jMo3639, (c28962.m4350(iM2234) + c28962.m4346(iM2234)) / 2.0f, 1));
                                    }
                                    if (iM4354 == -1) {
                                    }
                                    iM2235 = AbstractC1695.m2235(AbstractC1629.m2183(insertGestureM2184), c1715);
                                }
                            }
                        } else if (AbstractC1629.m2160(handwritingGesture)) {
                            RemoveSpaceGesture removeSpaceGestureM2182 = AbstractC1629.m2182(handwritingGesture);
                            C1801 c1801M24256 = c1781.m2425();
                            C2867 c28676 = c1801M24256 != null ? c1801M24256.f3090 : null;
                            long jM22283 = AbstractC1695.m2228(removeSpaceGestureM2182.getStartPoint());
                            long jM22284 = AbstractC1695.m2228(removeSpaceGestureM2182.getEndPoint());
                            InterfaceC2530 interfaceC2530M24263 = c1781.m2426();
                            if (c28676 != null) {
                                C2896 c28963 = c28676.f6335;
                                if (interfaceC2530M24263 == null) {
                                    jM4353 = C2869.f6348;
                                } else {
                                    long jMo36393 = interfaceC2530M24263.mo3639(jM22283);
                                    long jMo36394 = interfaceC2530M24263.mo3639(jM22284);
                                    int iM22343 = AbstractC1695.m2234(c28963, jMo36393, interfaceC2698);
                                    int iM22344 = AbstractC1695.m2234(c28963, jMo36394, interfaceC2698);
                                    if (iM22343 != -1) {
                                        if (iM22344 != -1) {
                                            iM22343 = Math.min(iM22343, iM22344);
                                        }
                                        iM22344 = iM22343;
                                    } else if (iM22344 == -1) {
                                        jM4353 = C2869.f6348;
                                    }
                                    float fM4350 = (c28963.m4350(iM22344) + c28963.m4346(iM22344)) / 2.0f;
                                    int i6 = (int) (jMo36393 >> 32);
                                    int i7 = (int) (jMo36394 >> 32);
                                    jM4353 = c28963.m4353(new C8157(Math.min(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7)), fM4350 - 0.1f, Math.max(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7)), fM4350 + 0.1f), 0, C2877.f6391);
                                }
                                if (C2869.m4312(jM4353)) {
                                    iM2235 = AbstractC1695.m2235(AbstractC1629.m2183(removeSpaceGestureM2182), c1715);
                                } else {
                                    Ref$IntRef ref$IntRef = new Ref$IntRef();
                                    ref$IntRef.element = -1;
                                    Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                                    ref$IntRef2.element = -1;
                                    String strReplace = new Regex("\\s+").replace(c2902.subSequence(C2869.m4317(jM4353), C2869.m4310(jM4353)).toString(), new C0849(ref$IntRef, 14, ref$IntRef2));
                                    int i8 = ref$IntRef.element;
                                    if (i8 == -1 || (i = ref$IntRef2.element) == -1) {
                                        iM2235 = AbstractC1695.m2235(AbstractC1629.m2183(removeSpaceGestureM2182), c1715);
                                    } else {
                                        int i9 = (int) (jM4353 >> 32);
                                        c1715.invoke(new C1702(new InterfaceC2839[]{new C2850(i9 + i8, i9 + i), new C2844(strReplace.substring(i8, strReplace.length() - (C2869.m4311(jM4353) - ref$IntRef2.element)), 1)}));
                                        iM2235 = 1;
                                    }
                                }
                            }
                        } else {
                            iM2235 = 2;
                        }
                    }
                }
            }
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new RunnableC1714(intConsumer, iM2235, i2));
            } else {
                intConsumer.accept(iM2235);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.f2734;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        C1781 c1781;
        C2902 c2902;
        C2867 c2867;
        C2868 c2868;
        if (Build.VERSION.SDK_INT >= 34 && (c1781 = this.f2729) != null && (c2902 = c1781.f3033) != null) {
            C1801 c1801M2425 = c1781.m2425();
            if (c2902.equals((c1801M2425 == null || (c2867 = c1801M2425.f3090) == null || (c2868 = c2867.f6336) == null) ? null : c2868.f6342)) {
                boolean zM2168 = AbstractC1629.m2168(previewableHandwritingGesture);
                final C1720 c1720 = this.f2728;
                if (zM2168) {
                    SelectGesture selectGestureM2174 = AbstractC1629.m2174(previewableHandwritingGesture);
                    if (c1720 != null) {
                        long jM2238 = AbstractC1695.m2238(c1781, AbstractC2416.m3431(selectGestureM2174.getSelectionArea()), selectGestureM2174.getGranularity() != 1 ? 0 : 1);
                        C1781 c17812 = c1720.f2832;
                        if (c17812 != null) {
                            c17812.m2423(jM2238);
                        }
                        C1781 c17813 = c1720.f2832;
                        if (c17813 != null) {
                            c17813.m2424(C2869.f6348);
                        }
                        if (!C2869.m4312(jM2238)) {
                            c1720.m2313(false);
                            c1720.m2322(HandleState.None);
                        }
                    }
                } else if (AbstractC1709.m2274(previewableHandwritingGesture)) {
                    DeleteGesture deleteGestureM2276 = AbstractC1709.m2276(previewableHandwritingGesture);
                    if (c1720 != null) {
                        long jM22382 = AbstractC1695.m2238(c1781, AbstractC2416.m3431(deleteGestureM2276.getDeletionArea()), deleteGestureM2276.getGranularity() != 1 ? 0 : 1);
                        C1781 c17814 = c1720.f2832;
                        if (c17814 != null) {
                            c17814.m2424(jM22382);
                        }
                        C1781 c17815 = c1720.f2832;
                        if (c17815 != null) {
                            c17815.m2423(C2869.f6348);
                        }
                        if (!C2869.m4312(jM22382)) {
                            c1720.m2313(false);
                            c1720.m2322(HandleState.None);
                        }
                    }
                } else if (AbstractC1709.m2258(previewableHandwritingGesture)) {
                    SelectRangeGesture selectRangeGestureM2280 = AbstractC1709.m2280(previewableHandwritingGesture);
                    if (c1720 != null) {
                        long jM2231 = AbstractC1695.m2231(c1781, AbstractC2416.m3431(selectRangeGestureM2280.getSelectionStartArea()), AbstractC2416.m3431(selectRangeGestureM2280.getSelectionEndArea()), selectRangeGestureM2280.getGranularity() != 1 ? 0 : 1);
                        C1781 c17816 = c1720.f2832;
                        if (c17816 != null) {
                            c17816.m2423(jM2231);
                        }
                        C1781 c17817 = c1720.f2832;
                        if (c17817 != null) {
                            c17817.m2424(C2869.f6348);
                        }
                        if (!C2869.m4312(jM2231)) {
                            c1720.m2313(false);
                            c1720.m2322(HandleState.None);
                        }
                    }
                } else if (AbstractC1709.m2257(previewableHandwritingGesture)) {
                    DeleteRangeGesture deleteRangeGestureM2275 = AbstractC1709.m2275(previewableHandwritingGesture);
                    if (c1720 != null) {
                        long jM22312 = AbstractC1695.m2231(c1781, AbstractC2416.m3431(deleteRangeGestureM2275.getDeletionStartArea()), AbstractC2416.m3431(deleteRangeGestureM2275.getDeletionEndArea()), deleteRangeGestureM2275.getGranularity() != 1 ? 0 : 1);
                        C1781 c17818 = c1720.f2832;
                        if (c17818 != null) {
                            c17818.m2424(jM22312);
                        }
                        C1781 c17819 = c1720.f2832;
                        if (c17819 != null) {
                            c17819.m2423(C2869.f6348);
                        }
                        if (!C2869.m4312(jM22312)) {
                            c1720.m2313(false);
                            c1720.m2322(HandleState.None);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.compose.foundation.text.input.internal.飘花落叶言子楪哲兰苏世
                        @Override // android.os.CancellationSignal.OnCancelListener
                        public final void onCancel() {
                            C1720 c17202 = c1720;
                            if (c17202 != null) {
                                C1781 c178110 = c17202.f2832;
                                if (c178110 != null) {
                                    c178110.m2424(C2869.f6348);
                                }
                                C1781 c178111 = c17202.f2832;
                                if (c178111 != null) {
                                    c178111.m2423(C2869.f6348);
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
    */
    public final boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        C1704 c1704;
        boolean z4 = this.f2734;
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
                c1704 = ((C1689) this.f2731.f702).f2743;
                synchronized (c1704.f2773) {
                    try {
                        c1704.f2770 = z2;
                        c1704.f2782 = z3;
                        c1704.f2781 = z5;
                        c1704.f2785 = z;
                        if (z6) {
                            c1704.f2771 = true;
                            if (c1704.f2786 != null) {
                                c1704.m2253();
                            }
                        }
                        c1704.f2772 = z7;
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
        c1704 = ((C1689) this.f2731.f702).f2743;
        synchronized (c1704.f2773) {
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.f2734;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((C1689) this.f2731.f702).f2746.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.f2734;
        if (z) {
            m2225(new C2845(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.f2734;
        if (z) {
            m2225(new C2849(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.f2734;
        if (!z) {
            return z;
        }
        m2225(new C2850(i, i2));
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m2223(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m2224() {
        int i = this.f2726 - 1;
        this.f2726 = i;
        if (i == 0) {
            ArrayList arrayList = this.f2736;
            if (!arrayList.isEmpty()) {
                ((C1689) this.f2731.f702).f2740.invoke(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.f2726 > 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m2225(InterfaceC2839 interfaceC2839) {
        this.f2726++;
        try {
            this.f2736.add(interfaceC2839);
        } finally {
            m2224();
        }
    }
}
