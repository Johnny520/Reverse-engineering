package yyds;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛷᲇᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1673 implements TextWatcher {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ TextView f8532;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ C0172 f8533;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ EditText f8534;

    public C1673(C0172 c0172, EditText editText, TextView textView) {
        this.f8533 = c0172;
        this.f8534 = editText;
        this.f8532 = textView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String strM4341;
        if (editable == null || (strM4341 = editable.toString()) == null) {
            strM4341 = AbstractC2328.m4341(-193376180405102L);
        }
        List listM1296 = AbstractC0473.m1296(strM4341, new String[]{AbstractC2328.m4341(-193380475372398L)}, 6);
        ArrayList arrayList = new ArrayList(AbstractC0055.m419(listM1296, 10));
        Iterator it = listM1296.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC0473.m1314((String) it.next()).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        this.f8533.f997 = AbstractC1595.m3273(arrayList2);
        C1807.m3584(this.f8534, this.f8532);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
