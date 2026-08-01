package p069i;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;
import p088s0.C0990l;

/* JADX INFO: renamed from: i.R0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0642R0 implements TextWatcher {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2199b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2200c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0642R0(int i2, Object obj) {
        this.f2199b = i2;
        this.f2200c = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i2 = this.f2199b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        int i5 = this.f2199b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        switch (this.f2199b) {
            case 0:
                SearchView searchView = (SearchView) this.f2200c;
                Editable text = searchView.f1055q.getText();
                searchView.f1047W = text;
                boolean zIsEmpty = TextUtils.isEmpty(text);
                searchView.m692w(!zIsEmpty);
                int i5 = 8;
                if (searchView.f1046V && !searchView.f1039O && zIsEmpty) {
                    searchView.f1060v.setVisibility(8);
                    i5 = 0;
                }
                searchView.f1062x.setVisibility(i5);
                searchView.m688s();
                searchView.m691v();
                charSequence.toString();
                break;
            default:
                String string = charSequence != null ? charSequence.toString() : null;
                if (string == null) {
                    string = "";
                }
                ((C0990l) this.f2200c).m2196c(string);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m1260a(Editable editable) {
    }

    /* JADX INFO: renamed from: b */
    private final void m1261b(Editable editable) {
    }

    /* JADX INFO: renamed from: c */
    private final void m1262c(int i2, int i3, int i4, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: d */
    private final void m1263d(int i2, int i3, int i4, CharSequence charSequence) {
    }
}
