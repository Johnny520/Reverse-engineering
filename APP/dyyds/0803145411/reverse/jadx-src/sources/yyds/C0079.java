package yyds;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛱᛲᛶᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0079 extends AbstractC0387 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C0748 f652;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Context f653;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C0748 f654;

    public native C0079(Context context, C0748 c0748, C0748 c07482);

    @Override // yyds.AbstractC0359
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void mo472(AbstractC0185 abstractC0185, int i) {
        String string;
        List listSingletonList;
        List listSingletonList2;
        int i2;
        String strM4830;
        C0150 c0150 = (C0150) abstractC0185;
        AbstractC2328.m4341(-341243314471790L);
        Object obj = this.f1986.f2106.get(i);
        AbstractC2328.m4341(-341273379242862L);
        final C2721 c2721 = (C2721) obj;
        ImageView imageView = c0150.f933;
        final C0079 c0079 = c0150.f932;
        AbstractC2328.m4341(-1164348026946414L);
        c0150.f935.setText(c2721.m4838());
        c0150.f939.setText((!AbstractC1544.m3188(c2721.m4832(), Boolean.TRUE) || (strM4830 = c2721.m4830()) == null || AbstractC0473.m1313(strM4830)) ? c2721.m4844() + '-' + c2721.m4841() + AbstractC2328.m4341(-1164412451455854L) : c2721.m4844() + '-' + c2721.m4841() + AbstractC2328.m4341(-1164373796750190L) + c2721.m4830());
        List listM4839 = c2721.m4839();
        List<C1132> list = C1860.f9345;
        if (listM4839 == null) {
            listM4839 = list;
        }
        int size = listM4839.size();
        List listM4834 = c2721.m4834();
        if (listM4834 == null) {
            listM4834 = list;
        }
        int size2 = listM4834.size();
        TextView textView = c0150.f938;
        C0963 c0963 = C0963.f4446;
        String strM4836 = c2721.m4836();
        c0963.getClass();
        String strM2102 = C0963.m2102(strM4836);
        if (strM2102.equals(AbstractC2328.m4341(-1164425336357742L))) {
            string = size2 + AbstractC2328.m4341(-1164451106161518L);
        } else if (strM2102.equals(AbstractC2328.m4341(-1164468286030702L))) {
            string = size + AbstractC2328.m4341(-1164494055834478L) + size2 + AbstractC2328.m4341(-1164515530670958L);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(size);
            sb.append((char) 26465);
            string = sb.toString();
        }
        textView.setText(string);
        List listM48392 = c2721.m4839();
        List list2 = listM48392;
        if (listM48392 == null) {
            list2 = list;
        }
        List listM48342 = c2721.m4834();
        if (listM48342 != null) {
            list = listM48342;
        }
        ArrayList arrayList = new ArrayList(AbstractC0055.m419(list, 10));
        for (C1132 c1132 : list) {
            StringBuilder sb2 = new StringBuilder(AbstractC2328.m4341(-1164532710540142L));
            String strM2318 = c1132.m2318();
            if (AbstractC0473.m1313(strM2318)) {
                strM2318 = c1132.m2320();
            }
            sb2.append(strM2318);
            arrayList.add(sb2.toString());
        }
        TextView textView2 = c0150.f937;
        C0963 c09632 = C0963.f4446;
        String strM48362 = c2721.m4836();
        c09632.getClass();
        String strM21022 = C0963.m2102(strM48362);
        if (strM21022.equals(AbstractC2328.m4341(-1164558480343918L))) {
            boolean zIsEmpty = arrayList.isEmpty();
            listSingletonList2 = arrayList;
            if (zIsEmpty) {
                listSingletonList2 = Collections.singletonList(AbstractC2328.m4341(-1164584250147694L));
            }
        } else {
            if (strM21022.equals(AbstractC2328.m4341(-1164605724984174L))) {
                ArrayList arrayListM3284 = AbstractC1595.m3284(list2, arrayList);
                boolean zIsEmpty2 = arrayListM3284.isEmpty();
                listSingletonList = arrayListM3284;
                if (zIsEmpty2) {
                    listSingletonList = Collections.singletonList(AbstractC2328.m4341(-1164631494787950L));
                }
            } else {
                boolean zIsEmpty3 = list2.isEmpty();
                listSingletonList = list2;
                if (zIsEmpty3) {
                    listSingletonList = Collections.singletonList(AbstractC2328.m4341(-1164652969624430L));
                }
            }
            listSingletonList2 = listSingletonList;
        }
        textView2.setText(AbstractC1595.m3285(listSingletonList2, AbstractC2328.m4341(-1164674444460910L), null, null, null, 62));
        List listM3608 = AbstractC1838.m3608();
        final int i3 = 0;
        if (listM3608.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it = listM3608.iterator();
            i2 = 0;
            while (it.hasNext()) {
                if (AbstractC1544.m3188(((C1981) it.next()).m3812(), c2721.m4840()) && (i2 = i2 + 1) < 0) {
                    AbstractC2725.m4851();
                    throw null;
                }
            }
        }
        TextView textView3 = c0150.f941;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(i2);
        sb3.append((char) 20010);
        textView3.setText(sb3.toString());
        c0150.f934.setOnClickListener(new ViewOnClickListenerC1462(4, c0150));
        c0150.f936.setOnClickListener(new View.OnClickListener(c0079) { // from class: yyds.ᲁᲁᛷᛶ

            /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
            public final /* synthetic */ C0079 f11495;

            {
                this.f11495 = c0079;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                C2721 c27212 = c2721;
                C0079 c00792 = this.f11495;
                switch (i4) {
                    case 0:
                        c00792.f654.mo371(c27212);
                        break;
                    default:
                        c00792.f652.mo371(c27212);
                        break;
                }
            }
        });
        final int i4 = 1;
        imageView.setOnClickListener(new View.OnClickListener(c0079) { // from class: yyds.ᲁᲁᛷᛶ

            /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
            public final /* synthetic */ C0079 f11495;

            {
                this.f11495 = c0079;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i4;
                C2721 c27212 = c2721;
                C0079 c00792 = this.f11495;
                switch (i42) {
                    case 0:
                        c00792.f654.mo371(c27212);
                        break;
                    default:
                        c00792.f652.mo371(c27212);
                        break;
                }
            }
        });
        if (AbstractC1544.m3188(c2721.m4840(), AbstractC2328.m4341(-1164683034395502L))) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
        }
    }

    @Override // yyds.AbstractC0359
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final AbstractC0185 mo473(ViewGroup viewGroup, int i) {
        AbstractC2328.m4341(-341213249700718L);
        return new C0150(this, AbstractC1115.m2309(this.f653).inflate(R.layout.item_fire_group, viewGroup, false));
    }
}
