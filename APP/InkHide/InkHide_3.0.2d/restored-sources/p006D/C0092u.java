package p006D;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import p099y.C1074g;
import p099y.InterfaceC1072f;
import p099y.InterfaceC1085q;

/* JADX INFO: renamed from: D.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0092u implements InterfaceC1085q {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C1074g m241a(View view, C1074g c1074g) {
        CharSequence charSequenceCoerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c1074g);
        }
        if (c1074g.f3703a.mo134d() == 2) {
            return c1074g;
        }
        InterfaceC1072f interfaceC1072f = c1074g.f3703a;
        ClipData clipDataMo138i = interfaceC1072f.mo138i();
        int iMo144p = interfaceC1072f.mo144p();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z2 = false;
        for (int i2 = 0; i2 < clipDataMo138i.getItemCount(); i2++) {
            ClipData.Item itemAt = clipDataMo138i.getItemAt(i2);
            if ((iMo144p & 1) != 0) {
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
