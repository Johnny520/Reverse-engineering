package p056f0;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: f0.S */
/* JADX INFO: loaded from: classes.dex */
public final class C0807S extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2928a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2929b;

    public /* synthetic */ C0807S(int r1, int r2) {
        this.f2928a = r2;
        this.f2929b = r1;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View r8, Outline r9) {
        switch(this.f2928a) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        AbstractC0307g.m703e(r8, "v");
        AbstractC0307g.m703e(r9, "outline");
        if (r8.getWidth() > 0) goto L7;
        return;
    L7:
        if (r8.getHeight() <= 0) goto L17;
        r9.setRoundRect(0, 0, r8.getWidth(), r8.getHeight(), this.f2929b);
        return;
    L17:
        return;
    L10:
        AbstractC0307g.m703e(r8, "v");
        AbstractC0307g.m703e(r9, "outline");
        if (r8.getWidth() > 0) goto L13;
        return;
    L13:
        if (r8.getHeight() <= 0) goto L19;
        r9.setRoundRect(0, 0, r8.getWidth(), r8.getHeight(), this.f2929b);
        return;
    }
}
