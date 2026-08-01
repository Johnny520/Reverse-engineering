package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ya0 {
    public boolean a;
    public int b;
    public final /* synthetic */ ActionBarContextView c;

    public a(ActionBarContextView r1) {
        this.c = r1;
        this.a = false;
    }

    @Override // defpackage.ya0
    public final void a() {
        if (this.a == false) goto L5;
        return;
    L5:
        ActionBarContextView r1 = this.c;
        r1.f = null;
        ActionBarContextView.b(r1, this.b);
    }

    @Override // defpackage.ya0
    public final void b(View r1) {
        this.a = true;
    }

    @Override // defpackage.ya0
    public final void c() {
        ActionBarContextView.a(this.c);
        this.a = false;
    }
}
