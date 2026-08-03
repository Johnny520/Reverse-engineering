package p017J;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import java.util.Objects;
import p006D.C0103h;
import p006D.InterfaceC0101g;
import p006D.InterfaceC0123r;

/* JADX INFO: renamed from: J.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0230s implements InterfaceC0123r {
    /* JADX INFO: renamed from: a */
    public final C0103h m630a(View view, C0103h c0103h) {
        CharSequence charSequenceCoerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Objects.toString(c0103h);
        }
        if (c0103h.f270a.mo343f() == 2) {
            return c0103h;
        }
        InterfaceC0101g interfaceC0101g = c0103h.f270a;
        ClipData clipDataMo344h = interfaceC0101g.mo344h();
        int iMo351q = interfaceC0101g.mo351q();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z2 = false;
        for (int i2 = 0; i2 < clipDataMo344h.getItemCount(); i2++) {
            ClipData.Item itemAt = clipDataMo344h.getItemAt(i2);
            if ((iMo351q & 1) != 0) {
                charSequenceCoerceToStyledText = itemAt.coerceToText(context);
                if (charSequenceCoerceToStyledText instanceof Spanned) {
                    charSequenceCoerceToStyledText = charSequenceCoerceToStyledText.toString();
                }
            } else {
                charSequenceCoerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (charSequenceCoerceToStyledText != null) {
                if (z2) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceCoerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, iMax2);
                    editable.replace(iMax, iMax2, charSequenceCoerceToStyledText);
                    z2 = true;
                }
            }
        }
        return null;
    }
}
