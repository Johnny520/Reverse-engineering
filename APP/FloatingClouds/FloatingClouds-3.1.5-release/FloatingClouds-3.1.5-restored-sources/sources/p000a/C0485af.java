package p000a;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import p000a.C0401W3;

/* JADX INFO: renamed from: a.af */
/* JADX INFO: loaded from: classes.dex */
public final class C0485af implements InterfaceC0539dc {
    @Override // p000a.InterfaceC0539dc
    /* JADX INFO: renamed from: a */
    public final C0401W3 mo1172a(View view, C0401W3 c0401w3) {
        CharSequence charSequenceCoerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c0401w3);
        }
        if (c0401w3.f1528a.mo1047d() == 2) {
            return c0401w3;
        }
        C0401W3.e eVar = c0401w3.f1528a;
        ClipData clipDataMo1044a = eVar.mo1044a();
        int iMo1045b = eVar.mo1045b();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < clipDataMo1044a.getItemCount(); i++) {
            ClipData.Item itemAt = clipDataMo1044a.getItemAt(i);
            if ((iMo1045b & 1) != 0) {
                charSequenceCoerceToStyledText = itemAt.coerceToText(context);
                if (charSequenceCoerceToStyledText instanceof Spanned) {
                    charSequenceCoerceToStyledText = charSequenceCoerceToStyledText.toString();
                }
            } else {
                charSequenceCoerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (charSequenceCoerceToStyledText != null) {
                if (z) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceCoerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, iMax2);
                    editable.replace(iMax, iMax2, charSequenceCoerceToStyledText);
                    z = true;
                }
            }
        }
        return null;
    }
}
