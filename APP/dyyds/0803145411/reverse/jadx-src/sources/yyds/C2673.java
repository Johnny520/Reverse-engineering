package yyds;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.app.CustomCardView;
import com.bumptech.glide.ComponentCallbacks2C0040;
import com.p000ss.android.ugc.aweme.yyds.R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.ugc.aweme.ImageUrlStruct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: yyds.ᲈᛶᛱᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2673 extends AbstractC0359 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final LinkedHashMap f13118;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C1565 f13119;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final ArrayList f13120;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final LinkedHashSet f13121;

    public C2673(C1565 c1565) {
        AbstractC2328.m4341(-121933694403438L);
        this.f13119 = c1565;
        this.f13120 = new ArrayList();
        this.f13121 = new LinkedHashSet();
        this.f13118 = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static String m4765(Aweme aweme) {
        String str = aweme.aid;
        if (str != null) {
            return str;
        }
        return "@" + System.identityHashCode(aweme);
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final boolean m4766(Aweme aweme) {
        String strM4765 = m4765(aweme);
        LinkedHashMap linkedHashMap = this.f13118;
        Object objValueOf = linkedHashMap.get(strM4765);
        if (objValueOf == null) {
            Map map = C2609.f12814;
            String strM4682 = C2609.m4682(aweme);
            objValueOf = Boolean.valueOf(!(strM4682 == null || AbstractC0473.m1313(strM4682)));
            linkedHashMap.put(strM4765, objValueOf);
        }
        return ((Boolean) objValueOf).booleanValue();
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final void m4767() {
        C0497 c0497M3163 = AbstractC1529.m3163(new C0558(1, this.f13120), new C2635(1, this, C2673.class, AbstractC2328.m4341(-150843119272814L), AbstractC2328.m4341(-150894658880366L), 0, 13));
        HashSet hashSet = new HashSet();
        C1119 c1119 = new C1119(c0497M3163);
        while (c1119.hasNext()) {
            hashSet.add(m4765((Aweme) c1119.next()));
        }
        LinkedHashSet linkedHashSet = this.f13121;
        linkedHashSet.retainAll(hashSet);
        this.f13119.mo511(Integer.valueOf(linkedHashSet.size()), Integer.valueOf(hashSet.size()));
    }

    @Override // yyds.AbstractC0359
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final void mo472(AbstractC0185 abstractC0185, int i) {
        String str;
        ImageUrlStruct imageUrlStruct;
        List list;
        String str2;
        UrlModel urlModel;
        List list2;
        C1526 c1526 = (C1526) abstractC0185;
        AbstractC2328.m4341(-122139852833646L);
        Aweme aweme = (Aweme) this.f13120.get(i);
        C0913 c0913 = c1526.f7355;
        AbstractC2328.m4341(-213751505257326L);
        C2673 c2673 = c1526.f7356;
        String strM4765 = m4765(aweme);
        boolean zM4766 = c2673.m4766(aweme);
        boolean z = zM4766 && c2673.f13121.contains(strM4765);
        Video video = aweme.video;
        if (video == null || (urlModel = video.cover) == null || (list2 = urlModel.urlList) == null || (str = (String) AbstractC1595.m3281(list2)) == null) {
            List list3 = aweme.images;
            str = (list3 == null || (imageUrlStruct = (ImageUrlStruct) AbstractC1595.m3281(list3)) == null || (list = imageUrlStruct.urlList) == null) ? null : (String) AbstractC1595.m3281(list);
        }
        TextView textView = (TextView) c0913.f4164;
        ImageView imageView = (ImageView) c0913.f4165;
        CustomCardView customCardView = (CustomCardView) c0913.f4163;
        int i2 = i + 1;
        textView.setText(String.valueOf(i2));
        customCardView.setAlpha(zM4766 ? 1.0f : 0.58f);
        customCardView.setClickable(zM4766);
        if (!zM4766) {
            str2 = AbstractC2328.m4341(-213777275061102L) + i2 + AbstractC2328.m4341(-213790159962990L);
        } else if (z) {
            str2 = AbstractC2328.m4341(-213833109635950L) + i2 + AbstractC2328.m4341(-213845994537838L);
        } else {
            str2 = AbstractC2328.m4341(-213901829112686L) + i2 + AbstractC2328.m4341(-213914714014574L);
        }
        customCardView.setContentDescription(str2);
        ((View) c0913.f4161).setVisibility(z ? 0 : 8);
        ((TextView) c0913.f4162).setVisibility(z ? 0 : 8);
        ((TextView) c0913.f4160).setVisibility(zM4766 ? 8 : 0);
        TextView textView2 = (TextView) c0913.f4159;
        List list4 = aweme.images;
        textView2.setVisibility((list4 == null || list4.isEmpty()) ? 8 : 0);
        customCardView.setOnClickListener(new ViewOnClickListenerC2021(zM4766, c1526, c2673));
        C0472 c0472 = (C0472) ComponentCallbacks2C0040.m252(imageView.getContext()).m4277(str).m1786(C2340.f11504);
        c0472.getClass();
        ((C0472) c0472.m1789(C1268.f5845, new C0670())).m1283(imageView);
    }

    @Override // yyds.AbstractC0359
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final int mo531() {
        return this.f13120.size();
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final void m4768(int i, ArrayList arrayList) {
        if (arrayList.isEmpty() || i <= 0) {
            return;
        }
        ArrayList<C2807> arrayList2 = new ArrayList();
        int iIntValue = ((Number) AbstractC1595.m3280(arrayList)).intValue();
        Iterator it = AbstractC1595.m3264(1, arrayList).iterator();
        int i2 = iIntValue;
        while (it.hasNext()) {
            int iIntValue2 = ((Number) it.next()).intValue();
            if (iIntValue2 != i2 + 1) {
                arrayList2.add(new C2807(iIntValue, i2, 1));
                iIntValue = iIntValue2;
            }
            i2 = iIntValue2;
        }
        arrayList2.add(new C2807(iIntValue, i2, 1));
        int size = arrayList2.size();
        C0812 c0812 = this.f1869;
        if (size > 12) {
            c0812.m1869(0, i);
            return;
        }
        for (C2807 c2807 : arrayList2) {
            int i3 = c2807.f12492;
            c0812.m1869(i3, (c2807.f12493 - i3) + 1);
        }
    }

    @Override // yyds.AbstractC0359
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final AbstractC0185 mo473(ViewGroup viewGroup, int i) {
        AbstractC2328.m4341(-122053953487726L);
        View viewInflate = AbstractC1115.m2309(viewGroup.getContext()).inflate(R.layout.item_profile_batch_aweme, viewGroup, false);
        int i2 = R.id.iv_cover;
        ImageView imageView = (ImageView) AbstractC1741.m3479(viewInflate, R.id.iv_cover);
        if (imageView != null) {
            i2 = R.id.selection_overlay;
            View viewM3479 = AbstractC1741.m3479(viewInflate, R.id.selection_overlay);
            if (viewM3479 != null) {
                i2 = R.id.tv_index;
                TextView textView = (TextView) AbstractC1741.m3479(viewInflate, R.id.tv_index);
                if (textView != null) {
                    i2 = R.id.tv_selected;
                    TextView textView2 = (TextView) AbstractC1741.m3479(viewInflate, R.id.tv_selected);
                    if (textView2 != null) {
                        i2 = R.id.tv_type;
                        TextView textView3 = (TextView) AbstractC1741.m3479(viewInflate, R.id.tv_type);
                        if (textView3 != null) {
                            i2 = R.id.tv_unavailable;
                            TextView textView4 = (TextView) AbstractC1741.m3479(viewInflate, R.id.tv_unavailable);
                            if (textView4 != null) {
                                C0913 c0913 = new C0913((CustomCardView) viewInflate, imageView, viewM3479, textView, textView2, textView3, textView4);
                                AbstractC2328.m4341(-122084018258798L);
                                return new C1526(this, c0913);
                            }
                        }
                    }
                }
            }
        }
        C0188.m789(AbstractC2328.m4341(-1740389040685934L).concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }
}
