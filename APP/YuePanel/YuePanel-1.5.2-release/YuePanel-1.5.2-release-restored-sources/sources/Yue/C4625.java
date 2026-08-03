package Yue;

import Yue.InterfaceC7144;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.C8812;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
@InterfaceC7113(19)
public final class C4625 implements TextWatcher {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final EditText f9933;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final boolean f9934;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public C8812.AbstractC8818 f9935;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f9936 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int f9937 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public boolean f9938 = true;

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۧۢ$ۥ */
    @InterfaceC7113(19)
    public static class C0460 extends C8812.AbstractC8818 {

        /* JADX INFO: renamed from: ۥ */
        public final Reference<EditText> f1023;

        public C0460(EditText editText) {
            this.f1023 = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.C8812.AbstractC8818
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo1574() {
            super.mo1574();
            C4625.m13912(this.f1023.get(), 1);
        }
    }

    public C4625(EditText editText, boolean z) {
        this.f9933 = editText;
        this.f9934 = z;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m13912(@InterfaceC6490 EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C8812.m29617().m29641(editableText);
            C4616.m1572(editableText, selectionStart, selectionEnd);
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.f9933.isInEditMode() || m13918() || i2 > i3 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iM29632 = C8812.m29617().m29632();
        if (iM29632 != 0) {
            if (iM29632 == 1) {
                C8812.m29617().m29644((Spannable) charSequence, i, i + i3, this.f9936, this.f9937);
                return;
            } else if (iM29632 != 3) {
                return;
            }
        }
        C8812.m29617().m29645(m1585());
    }

    /* JADX INFO: renamed from: ۥ */
    public int m1584() {
        return this.f9937;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final C8812.AbstractC8818 m1585() {
        if (this.f9935 == null) {
            this.f9935 = new C0460(this.f9933);
        }
        return this.f9935;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m13913() {
        return this.f9936;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean m13914() {
        return this.f9938;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m13915(int i) {
        this.f9937 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m13916(boolean z) {
        if (this.f9938 != z) {
            if (this.f9935 != null) {
                C8812.m29617().m29646(this.f9935);
            }
            this.f9938 = z;
            if (z) {
                m13912(this.f9933, C8812.m29617().m29632());
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m13917(int i) {
        this.f9936 = i;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final boolean m13918() {
        return (this.f9938 && (this.f9934 || C8812.m29623())) ? false : true;
    }
}
