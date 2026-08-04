package yyds;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: renamed from: yyds.ᛶᲀᛴᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1407 implements TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f6660;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f6661;

    public /* synthetic */ C1407(int i, Object obj) {
        this.f6660 = i;
        this.f6661 = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        int i2 = this.f6660;
        Object obj = this.f6661;
        switch (i2) {
            case 0:
                if (i == 3 || (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 66)) {
                    ((C1022) obj).m2226();
                }
                break;
            default:
                ((SearchView) obj).m64();
                break;
        }
        return true;
    }
}
