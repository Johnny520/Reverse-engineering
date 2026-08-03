package p000a;

import android.view.View;
import com.google.android.material.datepicker.C1284c;

/* JADX INFO: renamed from: a.Ja */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0175Ja implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1284c f614a;

    public ViewOnClickListenerC0175Ja(C1284c c1284c) {
        this.f614a = c1284c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1284c c1284c = this.f614a;
        C1284c.d dVar = c1284c.f5696b0;
        C1284c.d dVar2 = C1284c.d.f5708b;
        C1284c.d dVar3 = C1284c.d.f5707a;
        if (dVar == dVar2) {
            c1284c.m3216H(dVar3);
        } else if (dVar == dVar3) {
            c1284c.m3216H(dVar2);
        }
    }
}
