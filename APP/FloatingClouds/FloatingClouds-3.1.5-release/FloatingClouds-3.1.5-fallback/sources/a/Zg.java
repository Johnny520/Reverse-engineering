package a;

/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"AppCompatCustomView"})
public class Zg extends android.widget.ImageButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f382a;

    public final int getUserSetVisibility() {
            r1 = this;
            int r0 = r1.f382a
            return r0
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int r1) {
            r0 = this;
            super.setVisibility(r1)
            r0.f382a = r1
            return
    }
}
