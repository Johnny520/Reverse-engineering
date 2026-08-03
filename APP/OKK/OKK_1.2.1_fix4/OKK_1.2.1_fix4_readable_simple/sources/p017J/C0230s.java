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
    public final C0103h m630a(View r10, C0103h r11) {
        if (Log.isLoggable("ReceiveContent", 3) == false) goto L6;
        Objects.toString(r11);
    L6:
        if (r11.f270a.mo343f() != 2) goto L8;
        return r11;
    L8:
        InterfaceC0101g r112 = r11.f270a;
        ClipData r02 = r112.mo344h();
        int r113 = r112.mo351q();
        TextView r102 = (TextView) r10;
        Editable r1 = (Editable) r102.getText();
        Context r103 = r102.getContext();
        int r3 = 0;
        boolean r4 = false;
    L10:
        if (r3 >= r02.getItemCount()) goto L22;
        ClipData.Item r5 = r02.getItemAt(r3);
        if ((r113 & 1) == 0) goto L16;
        CharSequence r52 = r5.coerceToText(r103);
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
        r52 = r5.coerceToStyledText(r103);
        goto L17
    L22:
        return null;
    }
}
