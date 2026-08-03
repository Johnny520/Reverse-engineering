package p000;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: Lw */
/* JADX INFO: loaded from: classes.dex */
public final class C0512Lw extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float f1673a;

    public C0512Lw(float r1) {
        this.f1673a = r1;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View r9, Outline r10) {
        AbstractC0295Gu.m625r(-438086662197L);
        AbstractC0295Gu.m625r(-459561498677L);
        r10.setRoundRect(0, 0, r9.getWidth(), r9.getHeight(), this.f1673a);
    }
}
