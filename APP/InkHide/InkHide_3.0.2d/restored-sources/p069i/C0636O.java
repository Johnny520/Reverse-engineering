package p069i;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: renamed from: i.O */
/* JADX INFO: loaded from: classes.dex */
public final class C0636O implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2182b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2183c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0636O(int i2, Object obj) {
        this.f2182b = i2;
        this.f2183c = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        switch (this.f2182b) {
            case 0:
                C0640Q c0640q = (C0640Q) this.f2183c;
                c0640q.f2198G.setSelection(i2);
                C0647U c0647u = c0640q.f2198G;
                if (c0647u.getOnItemClickListener() != null) {
                    c0647u.performItemClick(view, i2, c0640q.f2195D.getItemId(i2));
                }
                c0640q.dismiss();
                break;
            default:
                ((SearchView) this.f2183c).m684o(i2);
                break;
        }
    }
}
