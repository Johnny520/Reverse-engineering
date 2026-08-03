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

    public /* synthetic */ C2240mk(int i, Object obj, Object obj2) {
        this.f7890a = i;
        this.f7891b = obj;
        this.f7892c = obj2;
    }

    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object obj) {
        switch (this.f7890a) {
            case 0:
                ((C2283nk) this.f7891b).f8017b.removeCallbacks((RunnableC2260n3) this.f7892c);
                break;
            case 1:
                AbstractC1166o abstractC1166o = (AbstractC1166o) this.f7891b;
                ArrayList arrayList = (ArrayList) this.f7892c;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int adapterPosition = abstractC1166o.getAdapterPosition();
                if (adapterPosition >= 0 && adapterPosition < arrayList.size()) {
                    ((C0610O7) arrayList.get(adapterPosition)).f1956c = zBooleanValue;
                }
                return C0829TC.f2620a;
            case 2:
                C0762Rp c0762Rp = (C0762Rp) this.f7891b;
                LoadedScript loadedScript = (LoadedScript) this.f7892c;
                Object obj2 = ((C0340Hw) obj).f1148a;
                if (!(obj2 instanceof C0297Gw)) {
                    c0762Rp.m1559a(AbstractC0295Gu.m625r(-483574662821941L) + loadedScript.getName() + AbstractC0295Gu.m625r(-483600432625717L));
                    if (obj2 != null) {
                        c0762Rp.m1559a(AbstractC0295Gu.m625r(-483630497396789L) + obj2 + '\n');
                    }
                }
                Throwable thM726a = C0340Hw.m726a(obj2);
                if (thM726a != null) {
                    c0762Rp.m1559a(AbstractC0295Gu.m625r(-483656267200565L) + loadedScript.getName() + AbstractC0295Gu.m625r(-483682037004341L) + thM726a.getMessage() + '\n');
                }
                c0762Rp.m1560g();
                break;
            default:
                ImageView imageView = (ImageView) this.f7891b;
                Bitmap bitmap = (Bitmap) this.f7892c;
                int iIntValue = ((Integer) obj).intValue();
                C0555Mw.f1823b.getClass();
                if (bitmap != null && !bitmap.isRecycled()) {
                    imageView.setImageBitmap(AbstractC0148Dc.m279m(bitmap, iIntValue));
                }
                return C0829TC.f2620a;
        }
        return C0829TC.f2620a;
    }
}
