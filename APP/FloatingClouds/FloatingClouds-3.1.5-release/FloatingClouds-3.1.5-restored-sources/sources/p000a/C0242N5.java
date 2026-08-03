package p000a;

import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import androidx.emoji2.text.C1094c;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: a.N5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0242N5 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final EditText f844a;

    /* JADX INFO: renamed from: b */
    public final a f845b;

    /* JADX INFO: renamed from: a.N5$a */
    public static class a {
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
        
            if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
        
            if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
         */
        /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:93:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static boolean m682a(C0242N5 c0242n5, Editable editable, int i, int i2, boolean z) {
            int iMin;
            if (editable != null && i >= 0 && i2 >= 0) {
                int selectionStart = Selection.getSelectionStart(editable);
                int selectionEnd = Selection.getSelectionEnd(editable);
                if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                    if (z) {
                        int iMax = Math.max(i, 0);
                        int length = editable.length();
                        if (selectionStart < 0 || length < selectionStart || iMax < 0) {
                            selectionStart = -1;
                            int iMax2 = Math.max(i2, 0);
                            iMin = editable.length();
                            if (selectionEnd >= 0 || iMin < selectionEnd || iMax2 < 0) {
                                iMin = -1;
                                if (selectionStart != -1 && iMin != -1) {
                                }
                            } else {
                                loop2: while (true) {
                                    boolean z2 = false;
                                    while (true) {
                                        if (iMax2 == 0) {
                                            iMin = selectionEnd;
                                            break loop2;
                                        }
                                        if (selectionEnd >= iMin) {
                                            if (z2) {
                                                break;
                                            }
                                        } else {
                                            char cCharAt = editable.charAt(selectionEnd);
                                            if (z2) {
                                                break;
                                            }
                                            if (!Character.isSurrogate(cCharAt)) {
                                                iMax2--;
                                                selectionEnd++;
                                            } else {
                                                if (Character.isLowSurrogate(cCharAt)) {
                                                    break loop2;
                                                }
                                                selectionEnd++;
                                                z2 = true;
                                            }
                                        }
                                    }
                                    iMax2--;
                                    selectionEnd++;
                                }
                                iMin = -1;
                                if (selectionStart != -1) {
                                }
                            }
                        } else {
                            loop0: while (true) {
                                boolean z3 = false;
                                while (true) {
                                    if (iMax == 0) {
                                        break loop0;
                                    }
                                    selectionStart--;
                                    if (selectionStart >= 0) {
                                        char cCharAt2 = editable.charAt(selectionStart);
                                        if (z3) {
                                            break;
                                        }
                                        if (!Character.isSurrogate(cCharAt2)) {
                                            iMax--;
                                        } else {
                                            if (Character.isHighSurrogate(cCharAt2)) {
                                                break loop0;
                                            }
                                            z3 = true;
                                        }
                                    } else {
                                        if (z3) {
                                            break loop0;
                                        }
                                        selectionStart = 0;
                                    }
                                }
                                iMax--;
                            }
                            selectionStart = -1;
                            int iMax22 = Math.max(i2, 0);
                            iMin = editable.length();
                            if (selectionEnd >= 0) {
                                iMin = -1;
                                if (selectionStart != -1) {
                                }
                            }
                        }
                    } else {
                        selectionStart = Math.max(selectionStart - i, 0);
                        iMin = Math.min(selectionEnd + i2, editable.length());
                    }
                    AbstractC0313R5[] abstractC0313R5Arr = (AbstractC0313R5[]) editable.getSpans(selectionStart, iMin, AbstractC0313R5.class);
                    if (abstractC0313R5Arr != null && abstractC0313R5Arr.length > 0) {
                        for (AbstractC0313R5 abstractC0313R5 : abstractC0313R5Arr) {
                            int spanStart = editable.getSpanStart(abstractC0313R5);
                            int spanEnd = editable.getSpanEnd(abstractC0313R5);
                            selectionStart = Math.min(spanStart, selectionStart);
                            iMin = Math.max(spanEnd, iMin);
                        }
                        int iMax3 = Math.max(selectionStart, 0);
                        int iMin2 = Math.min(iMin, editable.length());
                        c0242n5.beginBatchEdit();
                        editable.delete(iMax3, iMin2);
                        c0242n5.endBatchEdit();
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public C0242N5(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        a aVar = new a();
        super(inputConnection, false);
        this.f844a = editText;
        this.f845b = aVar;
        if (C1094c.f4484k != null) {
            C1094c c1094cM2505a = C1094c.m2505a();
            if (c1094cM2505a.m2506b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            C1094c.a aVar2 = c1094cM2505a.f4489e;
            aVar2.getClass();
            Bundle bundle = editorInfo.extras;
            C0652jb c0652jb = aVar2.f4495c.f2505a;
            int iM849a = c0652jb.m849a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iM849a != 0 ? ((ByteBuffer) c0652jb.f1105d).getInt(iM849a + c0652jb.f1102a) : 0);
            Bundle bundle2 = editorInfo.extras;
            aVar2.f4496a.getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.f844a.getEditableText();
        this.f845b.getClass();
        return a.m682a(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.f844a.getEditableText();
        this.f845b.getClass();
        return a.m682a(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
