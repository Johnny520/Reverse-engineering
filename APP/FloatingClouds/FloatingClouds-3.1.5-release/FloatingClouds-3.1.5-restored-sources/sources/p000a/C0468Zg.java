package p000a;

import android.annotation.SuppressLint;
import android.widget.ImageButton;

/* JADX INFO: renamed from: a.Zg */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AppCompatCustomView"})
public class C0468Zg extends ImageButton {

    /* JADX INFO: renamed from: a */
    public int f1750a;

    public final int getUserSetVisibility() {
        return this.f1750a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        this.f1750a = i;
    }
}
