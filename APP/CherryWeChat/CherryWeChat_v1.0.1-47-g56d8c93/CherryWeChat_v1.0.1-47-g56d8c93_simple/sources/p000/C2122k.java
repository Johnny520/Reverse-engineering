package p000;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: k */
/* JADX INFO: loaded from: classes.dex */
public final class C2122k extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7452a;

    public /* synthetic */ C2122k(int r1) {
        this.f7452a = r1;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View r7, Outline r8) {
        switch(this.f7452a) {
            case 0: goto L12;
            case 1: goto L10;
            case 2: goto L8;
            case 3: goto L6;
            default: goto L4;
        };
    L4:
        AbstractC0295Gu.m625r(-492529669634101L);
        AbstractC0295Gu.m625r(-492551144470581L);
        r8.setRoundRect(0, 0, r7.getWidth(), r7.getHeight(), AbstractC0295Gu.m616i(12));
        return;
    L6:
        AbstractC0295Gu.m625r(-813110323574837L);
        AbstractC0295Gu.m625r(-813131798411317L);
        r8.setRoundRect(0, 0, r7.getWidth(), r7.getHeight(), AbstractC0295Gu.m616i(12));
        return;
    L8:
        AbstractC0295Gu.m625r(-817662988908597L);
        AbstractC0295Gu.m625r(-817684463745077L);
        r8.setOval(0, 0, r7.getWidth(), r7.getHeight());
        return;
    L10:
        AbstractC0295Gu.m625r(-817607154333749L);
        AbstractC0295Gu.m625r(-817628629170229L);
        r8.setOval(0, 0, r7.getWidth(), r7.getHeight());
        return;
    L12:
        AbstractC0295Gu.m625r(-816954319304757L);
        AbstractC0295Gu.m625r(-816975794141237L);
        r8.setOval(0, 0, r7.getWidth(), r7.getHeight());
    }
}
