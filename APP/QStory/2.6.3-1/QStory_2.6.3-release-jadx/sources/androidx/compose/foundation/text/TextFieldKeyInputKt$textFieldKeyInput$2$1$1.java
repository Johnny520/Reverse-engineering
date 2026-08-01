package androidx.compose.foundation.text;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import androidx.compose.foundation.lazy.C1597;
import androidx.compose.foundation.text.selection.C1726;
import androidx.compose.foundation.text.selection.C1769;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.p001ui.text.C2902;
import androidx.compose.p001ui.text.input.C2844;
import androidx.compose.p001ui.text.input.C2847;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import p050.AbstractC7176;
import p068.InterfaceC7387;
import p122.AbstractC8137;
import p122.C8139;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final /* synthetic */ class TextFieldKeyInputKt$textFieldKeyInput$2$1$1 extends FunctionReferenceImpl implements InterfaceC7387 {
    public TextFieldKeyInputKt$textFieldKeyInput$2$1$1(Object obj) {
        super(1, obj, C1831.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
    }

    @Override // p068.InterfaceC7387
    public /* synthetic */ Object invoke(Object obj) {
        return m2147invokeZmokQxo(((C8139) obj).f19798);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX INFO: renamed from: invoke-ZmokQxo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean m2147invokeZmokQxo(KeyEvent keyEvent) throws IOException {
        C2844 c2844;
        KeyCommand keyCommandM2429;
        Integer numValueOf;
        C1831 c1831 = (C1831) this.receiver;
        C1769 c1769 = c1831.f3247;
        boolean z = c1831.f3249;
        boolean z2 = true;
        if (keyEvent.getAction() != 0 || Character.isISOControl(keyEvent.getUnicodeChar())) {
            c2844 = null;
        } else {
            C1796 c1796 = c1831.f3257;
            c1796.getClass();
            int unicodeChar = keyEvent.getUnicodeChar();
            if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                c1796.f3078 = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                numValueOf = null;
            } else {
                Integer num = c1796.f3078;
                if (num != null) {
                    c1796.f3078 = null;
                    int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar);
                    Integer numValueOf2 = Integer.valueOf(deadChar);
                    if (deadChar == 0) {
                        numValueOf2 = null;
                    }
                    if (numValueOf2 != null) {
                        unicodeChar = numValueOf2.intValue();
                    }
                    numValueOf = Integer.valueOf(unicodeChar);
                } else {
                    numValueOf = Integer.valueOf(unicodeChar);
                }
            }
            if (numValueOf != null) {
                c2844 = new C2844(new StringBuilder().appendCodePoint(numValueOf.intValue()).toString(), 1);
            }
        }
        if (c2844 != null) {
            if (z) {
                c1831.m2474(AbstractC7176.m12487(c2844));
                c1769.f2986 = null;
            } else {
                z2 = false;
            }
        } else if (AbstractC8137.m13062(keyEvent) == 2 && (keyCommandM2429 = c1831.f3258.m2429(keyEvent)) != null && (!keyCommandM2429.getEditsText() || z)) {
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            ref$BooleanRef.element = true;
            C1597 c1597 = new C1597(keyCommandM2429, c1831, ref$BooleanRef, 4);
            C2847 c2847 = c1831.f3250;
            C1726 c1726 = new C1726(c2847, c1831.f3254, c1831.f3252.m2425(), c1769);
            c1597.invoke(c1726);
            boolean zM4313 = C2869.m4313(c1726.f2863, c2847.f6291);
            C2902 c2902 = c1726.f2870;
            if (!zM4313 || !AbstractC5227.m9466(c2902, c2847.f6292)) {
                c1831.f3255.invoke(C2847.m4275(c2847, c2902, c1726.f2863, 4));
            }
            C1803 c1803 = c1831.f3253;
            if (c1803 != null) {
                c1803.f3095 = true;
            }
            z2 = ref$BooleanRef.element;
        }
        return Boolean.valueOf(z2);
    }
}
