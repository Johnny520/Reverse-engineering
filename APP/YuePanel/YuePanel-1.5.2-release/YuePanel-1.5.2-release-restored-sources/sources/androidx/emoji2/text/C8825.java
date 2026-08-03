package androidx.emoji2.text;

import Yue.AbstractC4622;
import Yue.C7508;
import Yue.C8033;
import Yue.C8109;
import Yue.InterfaceC3262;
import Yue.InterfaceC5459;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7113;
import Yue.InterfaceC7144;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.C8812;
import androidx.emoji2.text.C8833;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
@InterfaceC3262
@InterfaceC7113(19)
public final class C8825 {

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f29539 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f29540 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f29541 = 3;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f29542 = 16;

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6391
    public final C8812.InterfaceC8824 f3771;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6391
    public final C8833 f3772;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6391
    public C8812.InterfaceC8817 f29543;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final boolean f29544;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6490
    public final int[] f29545;

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟۟$ۥ */
    @InterfaceC7113(19)
    public static final class C1672 {

        /* JADX INFO: renamed from: ۥ */
        public static final int f3773 = -1;

        /* JADX INFO: renamed from: ۥ */
        public static int m4790(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    i--;
                    if (i < 0) {
                        return z ? -1 : 0;
                    }
                    char cCharAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        i2--;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i2--;
                    } else {
                        if (Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        z = true;
                    }
                }
                return i;
            }
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static int m4791(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    if (i >= length) {
                        if (z) {
                            return -1;
                        }
                        return length;
                    }
                    char cCharAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i2--;
                        i++;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i2--;
                        i++;
                    } else {
                        if (Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i++;
                        z = true;
                    }
                }
                return i;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟۟$ۥ۟ */
    public static class C1673 implements InterfaceC8826<C8109> {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6490
        public C8109 f3774;

        /* JADX INFO: renamed from: ۥ۟ */
        public final C8812.InterfaceC8824 f3775;

        public C1673(@InterfaceC6490 C8109 c8109, C8812.InterfaceC8824 interfaceC8824) {
            this.f3774 = c8109;
            this.f3775 = interfaceC8824;
        }

        @Override // androidx.emoji2.text.C8825.InterfaceC8826
        /* JADX INFO: renamed from: ۥ */
        public boolean mo4792(@InterfaceC6391 CharSequence charSequence, int i, int i2, C8033 c8033) {
            if (c8033.m25406()) {
                return true;
            }
            if (this.f3774 == null) {
                this.f3774 = new C8109(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.f3774.setSpan(this.f3775.mo4787(c8033), i, i2, 33);
            return true;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟()Ljava/lang/Object; */
        @Override // androidx.emoji2.text.C8825.InterfaceC8826
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public C8109 mo4793() {
            return this.f3774;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟۟$ۥ۟۟, reason: contains not printable characters */
    public interface InterfaceC8826<T> {
        /* JADX INFO: renamed from: ۥ */
        boolean mo4792(@InterfaceC6391 CharSequence charSequence, int i, int i2, C8033 c8033);

        /* JADX INFO: renamed from: ۥ۟ */
        T mo4793();
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟۟$ۥ۟۟۟, reason: contains not printable characters */
    public static class C8827 implements InterfaceC8826<C8827> {

        /* JADX INFO: renamed from: ۥ */
        public final int f3776;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f3777 = -1;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f29546 = -1;

        public C8827(int i) {
            this.f3776 = i;
        }

        @Override // androidx.emoji2.text.C8825.InterfaceC8826
        /* JADX INFO: renamed from: ۥ */
        public boolean mo4792(@InterfaceC6391 CharSequence charSequence, int i, int i2, C8033 c8033) {
            int i3 = this.f3776;
            if (i > i3 || i3 >= i2) {
                return i2 <= i3;
            }
            this.f3777 = i;
            this.f29546 = i2;
            return false;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟()Ljava/lang/Object; */
        @Override // androidx.emoji2.text.C8825.InterfaceC8826
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public C8827 mo4793() {
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟۟$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C8828 implements InterfaceC8826<C8828> {

        /* JADX INFO: renamed from: ۥ */
        public final String f3778;

        public C8828(String str) {
            this.f3778 = str;
        }

        @Override // androidx.emoji2.text.C8825.InterfaceC8826
        /* JADX INFO: renamed from: ۥ */
        public boolean mo4792(@InterfaceC6391 CharSequence charSequence, int i, int i2, C8033 c8033) {
            if (!TextUtils.equals(charSequence.subSequence(i, i2), this.f3778)) {
                return true;
            }
            c8033.m25408(true);
            return false;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟()Ljava/lang/Object; */
        @Override // androidx.emoji2.text.C8825.InterfaceC8826
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public C8828 mo4793() {
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟۟$ۥ۟۟۟۠, reason: contains not printable characters */
    public static final class C8829 {

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static final int f29547 = 1;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static final int f29548 = 2;

        /* JADX INFO: renamed from: ۥ */
        public int f3779 = 1;

        /* JADX INFO: renamed from: ۥ۟ */
        public final C8833.C1677 f3780;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public C8833.C1677 f29549;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public C8833.C1677 f29550;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f29551;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int f29552;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final boolean f29553;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final int[] f29554;

        public C8829(C8833.C1677 c1677, boolean z, int[] iArr) {
            this.f3780 = c1677;
            this.f29549 = c1677;
            this.f29553 = z;
            this.f29554 = iArr;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static boolean m29679(int i) {
            return i == 65039;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static boolean m29680(int i) {
            return i == 65038;
        }

        /* JADX INFO: renamed from: ۥ */
        public int m4794(int i) {
            C8833.C1677 c1677M4802 = this.f29549.m4802(i);
            int iM29683 = 2;
            if (this.f3779 != 2) {
                if (c1677M4802 == null) {
                    iM29683 = m29683();
                } else {
                    this.f3779 = 2;
                    this.f29549 = c1677M4802;
                    this.f29552 = 1;
                }
            } else if (c1677M4802 != null) {
                this.f29549 = c1677M4802;
                this.f29552++;
            } else if (m29680(i)) {
                iM29683 = m29683();
            } else if (!m29679(i)) {
                if (this.f29549.m4803() != null) {
                    iM29683 = 3;
                    if (this.f29552 != 1 || m29684()) {
                        this.f29550 = this.f29549;
                        m29683();
                    } else {
                        iM29683 = m29683();
                    }
                } else {
                    iM29683 = m29683();
                }
            }
            this.f29551 = i;
            return iM29683;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public C8033 m4795() {
            return this.f29549.m4803();
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public C8033 m29681() {
            return this.f29550.m4803();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean m29682() {
            return this.f3779 == 2 && this.f29549.m4803() != null && (this.f29552 > 1 || m29684());
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final int m29683() {
            this.f3779 = 1;
            this.f29549 = this.f3780;
            this.f29552 = 0;
            return 1;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final boolean m29684() {
            if (this.f29549.m4803().m25405() || m29679(this.f29551)) {
                return true;
            }
            if (this.f29553) {
                if (this.f29554 == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f29554, this.f29549.m4803().m4051(0)) < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public C8825(@InterfaceC6391 C8833 c8833, @InterfaceC6391 C8812.InterfaceC8824 interfaceC8824, @InterfaceC6391 C8812.InterfaceC8817 interfaceC8817, boolean z, @InterfaceC6490 int[] iArr, @InterfaceC6391 Set<int[]> set) {
        this.f3771 = interfaceC8824;
        this.f3772 = c8833;
        this.f29543 = interfaceC8817;
        this.f29544 = z;
        this.f29545 = iArr;
        m29673(set);
    }

    /* JADX INFO: renamed from: ۥ */
    public static boolean m4788(@InterfaceC6391 Editable editable, @InterfaceC6391 KeyEvent keyEvent, boolean z) {
        AbstractC4622[] abstractC4622Arr;
        if (m29668(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!m29667(selectionStart, selectionEnd) && (abstractC4622Arr = (AbstractC4622[]) editable.getSpans(selectionStart, selectionEnd, AbstractC4622.class)) != null && abstractC4622Arr.length > 0) {
            for (AbstractC4622 abstractC4622 : abstractC4622Arr) {
                int spanStart = editable.getSpanStart(abstractC4622);
                int spanEnd = editable.getSpanEnd(abstractC4622);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static boolean m29665(@InterfaceC6391 InputConnection inputConnection, @InterfaceC6391 Editable editable, @InterfaceC5459(from = 0) int i, @InterfaceC5459(from = 0) int i2, boolean z) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (m29667(selectionStart, selectionEnd)) {
                return false;
            }
            if (z) {
                iMax = C1672.m4790(editable, selectionStart, Math.max(i, 0));
                iMin = C1672.m4791(editable, selectionEnd, Math.max(i2, 0));
                if (iMax == -1 || iMin == -1) {
                    return false;
                }
            } else {
                iMax = Math.max(selectionStart - i, 0);
                iMin = Math.min(selectionEnd + i2, editable.length());
            }
            AbstractC4622[] abstractC4622Arr = (AbstractC4622[]) editable.getSpans(iMax, iMin, AbstractC4622.class);
            if (abstractC4622Arr != null && abstractC4622Arr.length > 0) {
                for (AbstractC4622 abstractC4622 : abstractC4622Arr) {
                    int spanStart = editable.getSpanStart(abstractC4622);
                    int spanEnd = editable.getSpanEnd(abstractC4622);
                    iMax = Math.min(spanStart, iMax);
                    iMin = Math.max(spanEnd, iMin);
                }
                int iMax2 = Math.max(iMax, 0);
                int iMin2 = Math.min(iMin, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(iMax2, iMin2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static boolean m29666(@InterfaceC6391 Editable editable, int i, @InterfaceC6391 KeyEvent keyEvent) {
        if (!(i != 67 ? i != 112 ? false : m4788(editable, keyEvent, true) : m4788(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean m29667(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static boolean m29668(@InterfaceC6391 KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public int m4789(@InterfaceC6391 CharSequence charSequence, @InterfaceC5459(from = 0) int i) {
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            AbstractC4622[] abstractC4622Arr = (AbstractC4622[]) spanned.getSpans(i, i + 1, AbstractC4622.class);
            if (abstractC4622Arr.length > 0) {
                return spanned.getSpanEnd(abstractC4622Arr[0]);
            }
        }
        return ((C8827) m29675(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new C8827(i))).f29546;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m29669(@InterfaceC6391 CharSequence charSequence) {
        return m29670(charSequence, this.f3772.m29701());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int m29670(@InterfaceC6391 CharSequence charSequence, int i) {
        C8829 c8829 = new C8829(this.f3772.m29702(), this.f29544, this.f29545);
        int length = charSequence.length();
        int iCharCount = 0;
        int i2 = 0;
        int i3 = 0;
        while (iCharCount < length) {
            int iCodePointAt = Character.codePointAt(charSequence, iCharCount);
            int iM4794 = c8829.m4794(iCodePointAt);
            C8033 c8033M4795 = c8829.m4795();
            if (iM4794 == 1) {
                iCharCount += Character.charCount(iCodePointAt);
                i3 = 0;
            } else if (iM4794 == 2) {
                iCharCount += Character.charCount(iCodePointAt);
            } else if (iM4794 == 3) {
                c8033M4795 = c8829.m29681();
                if (c8033M4795.m25397() <= i) {
                    i2++;
                }
            }
            if (c8033M4795 != null && c8033M4795.m25397() <= i) {
                i3++;
            }
        }
        if (i2 != 0) {
            return 2;
        }
        if (!c8829.m29682() || c8829.m4795().m25397() > i) {
            return i3 == 0 ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m29671(@InterfaceC6391 CharSequence charSequence, @InterfaceC5459(from = 0) int i) {
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            AbstractC4622[] abstractC4622Arr = (AbstractC4622[]) spanned.getSpans(i, i + 1, AbstractC4622.class);
            if (abstractC4622Arr.length > 0) {
                return spanned.getSpanStart(abstractC4622Arr[0]);
            }
        }
        return ((C8827) m29675(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new C8827(i))).f3777;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final boolean m29672(CharSequence charSequence, int i, int i2, C8033 c8033) {
        if (c8033.m25398() == 0) {
            c8033.m25409(this.f29543.mo4780(charSequence, i, i2, c8033.m25402()));
        }
        return c8033.m25398() == 2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m29673(@InterfaceC6391 Set<int[]> set) {
        if (set.isEmpty()) {
            return;
        }
        for (int[] iArr : set) {
            String str = new String(iArr, 0, iArr.length);
            m29675(str, 0, str.length(), 1, true, new C8828(str));
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[GOTO]}, finally: {[GOTO, CHECK_CAST, INVOKE, IF] complete} */
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public CharSequence m29674(@InterfaceC6391 CharSequence charSequence, @InterfaceC5459(from = 0) int i, @InterfaceC5459(from = 0) int i2, @InterfaceC5459(from = 0) int i3, boolean z) {
        C8109 c8109;
        AbstractC4622[] abstractC4622Arr;
        boolean z2 = charSequence instanceof C7508;
        if (z2) {
            ((C7508) charSequence).m3700();
        }
        if (!z2) {
            try {
                c8109 = charSequence instanceof Spannable ? new C8109((Spannable) charSequence) : (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i + (-1), i2 + 1, AbstractC4622.class) > i2) ? null : new C8109(charSequence);
            } finally {
                if (z2) {
                    ((C7508) charSequence).m23468();
                }
            }
        }
        if (c8109 != null && (abstractC4622Arr = (AbstractC4622[]) c8109.getSpans(i, i2, AbstractC4622.class)) != null && abstractC4622Arr.length > 0) {
            for (AbstractC4622 abstractC4622 : abstractC4622Arr) {
                int spanStart = c8109.getSpanStart(abstractC4622);
                int spanEnd = c8109.getSpanEnd(abstractC4622);
                if (spanStart != i2) {
                    c8109.removeSpan(abstractC4622);
                }
                i = Math.min(spanStart, i);
                i2 = Math.max(spanEnd, i2);
            }
        }
        int i4 = i2;
        if (i != i4 && i < charSequence.length()) {
            if (i3 != Integer.MAX_VALUE && c8109 != null) {
                i3 -= ((AbstractC4622[]) c8109.getSpans(0, c8109.length(), AbstractC4622.class)).length;
            }
            C8109 c81092 = (C8109) m29675(charSequence, i, i4, i3, z, new C1673(c8109, this.f3771));
            if (c81092 == null) {
                if (z2) {
                    ((C7508) charSequence).m23468();
                }
                return charSequence;
            }
            Spannable spannableM4138 = c81092.m4138();
            if (z2) {
                ((C7508) charSequence).m23468();
            }
            return spannableM4138;
        }
        return charSequence;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final <T> T m29675(@InterfaceC6391 CharSequence charSequence, @InterfaceC5459(from = 0) int i, @InterfaceC5459(from = 0) int i2, @InterfaceC5459(from = 0) int i3, boolean z, InterfaceC8826<T> interfaceC8826) {
        int iCharCount;
        C8829 c8829 = new C8829(this.f3772.m29702(), this.f29544, this.f29545);
        int i4 = 0;
        boolean zMo4792 = true;
        int iCodePointAt = Character.codePointAt(charSequence, i);
        loop0: while (true) {
            iCharCount = i;
            while (i < i2 && i4 < i3 && zMo4792) {
                int iM4794 = c8829.m4794(iCodePointAt);
                if (iM4794 == 1) {
                    iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                    if (iCharCount < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                    i = iCharCount;
                } else if (iM4794 == 2) {
                    i += Character.charCount(iCodePointAt);
                    if (i < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, i);
                    }
                } else if (iM4794 == 3) {
                    if (z || !m29672(charSequence, iCharCount, i, c8829.m29681())) {
                        zMo4792 = interfaceC8826.mo4792(charSequence, iCharCount, i, c8829.m29681());
                        i4++;
                    }
                }
            }
            break loop0;
        }
        if (c8829.m29682() && i4 < i3 && zMo4792 && (z || !m29672(charSequence, iCharCount, i, c8829.m4795()))) {
            interfaceC8826.mo4792(charSequence, iCharCount, i, c8829.m4795());
        }
        return interfaceC8826.mo4793();
    }
}
