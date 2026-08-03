package p000;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import java.util.Objects;

/* JADX INFO: renamed from: zA */
/* JADX INFO: loaded from: classes.dex */
public final class C2791zA {
    /* JADX INFO: renamed from: a */
    public static C2798zb m5360a(View r9, C2798zb r10) {
        if (Log.isLoggable("ReceiveContent", 3) == false) goto L5;
        Objects.toString(r10);
    L5:
        InterfaceC2755yb r0 = r10.f9467a;
        if (r0.mo243q() != 2) goto L8;
        return r10;
    L8:
        ClipData r102 = r0.mo231a();
        int r02 = r0.mo238k();
        TextView r92 = (TextView) r9;
        Editable r1 = (Editable) r92.getText();
        Context r93 = r92.getContext();
        int r3 = 0;
        boolean r4 = false;
    L10:
        if (r3 >= r102.getItemCount()) goto L22;
        ClipData.Item r5 = r102.getItemAt(r3);
        if ((r02 & 1) == 0) goto L16;
        CharSequence r52 = r5.coerceToText(r93);
        if ((r52 instanceof Spanned) == false) goto L17;
        r52 = r52.toString();
    L17:
        if (r52 == null) goto L21;
        if (r4 == true) goto L20;
        int r42 = Selection.getSelectionStart(r1);
        int r7 = Selection.getSelectionEnd(r1);
        int r8 = Math.max(0, Math.min(r42, r7));
        int r43 = Math.max(0, Math.max(r42, r7));
        Selection.setSelection(r1, r43);
        r1.replace(r8, r43, r52);
        r4 = true;
        goto L21
    L20:
        r1.insert(Selection.getSelectionEnd(r1), "\n");
        r1.insert(Selection.getSelectionEnd(r1), r52);
    L21:
        r3 = r3 + 1;
        goto L10
    L16:
        r52 = r5.coerceToStyledText(r93);
        goto L17
    L22:
        return null;
    }
}
