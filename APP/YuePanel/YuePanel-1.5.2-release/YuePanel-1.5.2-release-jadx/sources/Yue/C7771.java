package Yue;

import Yue.InterfaceC7144;
import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: Yue.ۥۢۡۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public final class C7771 implements InterfaceC6557 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f3069 = "ReceiveContent";

    /* JADX INFO: renamed from: ۥ۟ */
    public static CharSequence m3865(@InterfaceC6391 Context context, @InterfaceC6391 ClipData.Item item, int i) {
        if ((i & 1) == 0) {
            return item.coerceToStyledText(context);
        }
        CharSequence charSequenceCoerceToText = item.coerceToText(context);
        return charSequenceCoerceToText instanceof Spanned ? charSequenceCoerceToText.toString() : charSequenceCoerceToText;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m24705(@InterfaceC6391 Editable editable, @InterfaceC6391 CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
        int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, iMax2);
        editable.replace(iMax, iMax2, charSequence);
    }

    @Override // Yue.InterfaceC6557
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ */
    public C4152 mo3019(@InterfaceC6391 View view, @InterfaceC6391 C4152 c4152) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c4152);
        }
        if (c4152.m12030() == 2) {
            return c4152;
        }
        ClipData clipDataM12026 = c4152.m12026();
        int iM12028 = c4152.m12028();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < clipDataM12026.getItemCount(); i++) {
            CharSequence charSequenceM3865 = m3865(context, clipDataM12026.getItemAt(i), iM12028);
            if (charSequenceM3865 != null) {
                if (z) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceM3865);
                } else {
                    m24705(editable, charSequenceM3865);
                    z = true;
                }
            }
        }
        return null;
    }
}
