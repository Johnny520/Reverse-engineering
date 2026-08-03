package p000;

import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.recyclerview.widget.AbstractC1166o;
import io.github.cherrywechat.lua.loader.LoadedScript;
import java.util.ArrayList;

/* JADX INFO: renamed from: mk */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2240mk implements InterfaceC1416fj {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7890a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f7891b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f7892c;

    public /* synthetic */ C2240mk(int r1, Object r2, Object r3) {
        this.f7890a = r1;
        this.f7891b = r2;
        this.f7892c = r3;
    }

    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object r7) {
        switch(this.f7890a) {
            case 0: goto L30;
            case 1: goto L23;
            case 2: goto L12;
            default: goto L4;
        };
    L4:
        ImageView r0 = (ImageView) this.f7891b;
        Bitmap r1 = (Bitmap) this.f7892c;
        int r72 = ((Integer) r7).intValue();
        C0555Mw.f1823b.getClass();
        if (r1 == null) goto L11;
        if (r1.isRecycled() == true) goto L11;
        r0.setImageBitmap(AbstractC0148Dc.m279m(r1, r72));
    L11:
        return C0829TC.f2620a;
    L12:
        C0762Rp r02 = (C0762Rp) this.f7891b;
        LoadedScript r12 = (LoadedScript) this.f7892c;
        Object r73 = ((C0340Hw) r7).f1148a;
        if ((r73 instanceof C0297Gw) == true) goto L17;
        r02.m1559a(AbstractC0295Gu.m625r(-483574662821941L) + r12.getName() + AbstractC0295Gu.m625r(-483600432625717L));
        if (r73 == null) goto L17;
        r02.m1559a(AbstractC0295Gu.m625r(-483630497396789L) + r73 + '\n');
    L17:
        Throwable r74 = C0340Hw.m726a(r73);
        if (r74 == null) goto L20;
        r02.m1559a(AbstractC0295Gu.m625r(-483656267200565L) + r12.getName() + AbstractC0295Gu.m625r(-483682037004341L) + r74.getMessage() + '\n');
    L20:
        r02.m1560g();
    L22:
        return C0829TC.f2620a;
    L23:
        AbstractC1166o r03 = (AbstractC1166o) this.f7891b;
        ArrayList r13 = (ArrayList) this.f7892c;
        boolean r75 = ((Boolean) r7).booleanValue();
        int r04 = r03.getAdapterPosition();
        if (r04 < 0) goto L29;
        if (r04 >= r13.size()) goto L29;
        ((C0610O7) r13.get(r04)).f1956c = r75;
    L29:
        return C0829TC.f2620a;
    L30:
        C2283nk r05 = (C2283nk) this.f7891b;
        Throwable r76 = (Throwable) r7;
        r05.f8017b.removeCallbacks((RunnableC2260n3) this.f7892c);
        goto L22
    }
}
