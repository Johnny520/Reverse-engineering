package p000;

import com.bumptech.glide.ComponentCallbacks2C1273a;
import com.youth.banner.Banner;
import com.youth.banner.adapter.BannerImageAdapter;
import com.youth.banner.holder.BannerImageHolder;
import java.util.List;

/* JADX INFO: renamed from: gq */
/* JADX INFO: loaded from: classes.dex */
public final class C1467gq extends BannerImageAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Banner f5202a;

    public C1467gq(Banner r1, List r2) {
        this.f5202a = r1;
        super(r2);
    }

    @Override // com.youth.banner.holder.IViewHolder
    public final void onBindView(Object r1, Object r2, int r3, int r4) {
        AbstractC0295Gu.m625r(-810301414963253L);
        AbstractC0295Gu.m625r(-810331479734325L);
        ((C1193aw) ComponentCallbacks2C1273a.m2414c(this.f5202a.getContext()).m2833n(((C1304d1) r2).f4746b).m5309b()).m2298A(((BannerImageHolder) r1).imageView);
    }
}
