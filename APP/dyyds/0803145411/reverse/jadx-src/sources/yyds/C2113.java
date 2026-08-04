package yyds;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.kongzue.dialogx.interfaces.AbstractC0041;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᲀᲇᛵᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2113 extends AbstractC1865 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Context f10449;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ C0947 f10450;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f10451;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2113(int i, Context context, C0947 c0947) {
        super(R.layout.dialog_color_picker);
        this.f10451 = i;
        this.f10449 = context;
        this.f10450 = c0947;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final void m4029(C0947 c0947, C0947 c09472, C0947 c09473, C0947 c09474, C0947 c09475, View view, TextView textView) {
        String strM4000;
        int iArgb = Color.argb(c09472.f4410, c09473.f4410, c09474.f4410, c09475.f4410);
        c0947.f4410 = iArgb;
        view.setBackground(AbstractC1658.m3378(iArgb, false));
        if (c09472.f4410 == 255) {
            strM4000 = AbstractC2104.m4000(new Object[]{Integer.valueOf(c0947.f4410 & 16777215)}, 1, AbstractC2328.m4341(-234607866446702L), -234633636250478L);
        } else {
            strM4000 = AbstractC2104.m4000(new Object[]{Long.valueOf(((long) c0947.f4410) & 4294967295L)}, 1, AbstractC2328.m4341(-234685175858030L), -234710945661806L);
        }
        textView.setText(strM4000);
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final void m4030(C0947 c0947, C0947 c09472, C0947 c09473, C0947 c09474, SeekBar seekBar, SeekBar seekBar2, SeekBar seekBar3, SeekBar seekBar4, TextView textView, TextView textView2, TextView textView3, TextView textView4, C0947 c09475, View view, TextView textView5, C0172 c0172, ArrayList arrayList, int i, View view2) {
        Object next;
        c0947.f4410 = Color.red(i);
        c09472.f4410 = Color.green(i);
        c09473.f4410 = Color.blue(i);
        c09474.f4410 = Color.alpha(i);
        seekBar.setProgress(c0947.f4410);
        seekBar2.setProgress(c09472.f4410);
        seekBar3.setProgress(c09473.f4410);
        seekBar4.setProgress(c09474.f4410);
        textView.setText(String.valueOf(c0947.f4410));
        textView2.setText(String.valueOf(c09472.f4410));
        textView3.setText(String.valueOf(c09473.f4410));
        textView4.setText(String.valueOf(c09474.f4410));
        m4029(c09475, c09474, c0947, c09472, c09473, view, textView5);
        View view3 = (View) c0172.f997;
        if (view3 != null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (AbstractC1544.m3188(((Pair) next).getFirst(), view3)) {
                        break;
                    }
                }
            }
            Pair pair = (Pair) next;
            if (pair != null) {
                view3.setBackground(AbstractC1658.m3378(((Number) pair.getSecond()).intValue(), false));
            }
        }
        view2.setBackground(AbstractC1658.m3378(i, true));
        c0172.f997 = view2;
    }

    @Override // yyds.AbstractC1865
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final void mo890(AbstractC0041 abstractC0041, View view) {
        int i;
        SeekBar seekBar;
        AbstractC2328.m4341(-233469700113262L);
        AbstractC2328.m4341(-233499764884334L);
        final View viewFindViewById = view.findViewById(R.id.colorPreviewLarge);
        final TextView textView = (TextView) view.findViewById(R.id.tvColorHex);
        SeekBar seekBar2 = (SeekBar) view.findViewById(R.id.seekBarRed);
        SeekBar seekBar3 = (SeekBar) view.findViewById(R.id.seekBarGreen);
        SeekBar seekBar4 = (SeekBar) view.findViewById(R.id.seekBarBlue);
        SeekBar seekBar5 = (SeekBar) view.findViewById(R.id.seekBarAlpha);
        TextView textView2 = (TextView) view.findViewById(R.id.tvRedValue);
        TextView textView3 = (TextView) view.findViewById(R.id.tvGreenValue);
        TextView textView4 = (TextView) view.findViewById(R.id.tvBlueValue);
        TextView textView5 = (TextView) view.findViewById(R.id.tvAlphaValue);
        GridLayout gridLayout = (GridLayout) view.findViewById(R.id.colorPalette);
        GridLayout gridLayout2 = (GridLayout) view.findViewById(R.id.recentColorPalette);
        TextView textView6 = (TextView) view.findViewById(R.id.tvRecentLabel);
        final C0947 c0947 = new C0947();
        int i2 = this.f10451;
        c0947.f4410 = Color.red(i2);
        final C0947 c09472 = new C0947();
        c09472.f4410 = Color.green(i2);
        C0947 c09473 = new C0947();
        c09473.f4410 = Color.blue(i2);
        C0947 c09474 = new C0947();
        c09474.f4410 = Color.alpha(i2);
        final ArrayList arrayList = new ArrayList();
        final C0172 c0172 = new C0172();
        seekBar2.setProgress(c0947.f4410);
        seekBar3.setProgress(c09472.f4410);
        seekBar4.setProgress(c09473.f4410);
        seekBar5.setProgress(c09474.f4410);
        textView2.setText(String.valueOf(c0947.f4410));
        textView3.setText(String.valueOf(c09472.f4410));
        textView4.setText(String.valueOf(c09473.f4410));
        textView5.setText(String.valueOf(c09474.f4410));
        TextView textView7 = textView3;
        C0947 c09475 = this.f10450;
        GridLayout gridLayout3 = gridLayout;
        SeekBar seekBar6 = seekBar2;
        final TextView textView8 = textView4;
        final TextView textView9 = textView5;
        m4029(c09475, c09474, c0947, c09472, c09473, viewFindViewById, textView);
        final C0947 c09476 = c09475;
        final C0947 c09477 = c09473;
        Context context = this.f10449;
        float f = context.getResources().getDisplayMetrics().density;
        int i3 = (int) (32.0f * f);
        int i4 = (int) (3.0f * f);
        int i5 = ((context.getResources().getDisplayMetrics().widthPixels - i3) / 8) - (i4 * 2);
        ArrayList arrayListM3377 = AbstractC1658.m3377();
        C0947 c09478 = c09474;
        int i6 = 0;
        if (arrayListM3377.isEmpty()) {
            i = i4;
            seekBar = seekBar5;
        } else {
            textView6.setVisibility(0);
            gridLayout2.setVisibility(0);
            gridLayout2.removeAllViews();
            Iterator it = arrayListM3377.iterator();
            while (it.hasNext()) {
                final int iIntValue = ((Number) it.next()).intValue();
                final View view2 = new View(context);
                Iterator it2 = it;
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i5, i5);
                marginLayoutParams.setMargins(i4, i4, i4, i4);
                view2.setLayoutParams(marginLayoutParams);
                int i7 = i4;
                view2.setBackground(AbstractC1658.m3378(iIntValue, false));
                final int i8 = 1;
                GridLayout gridLayout4 = gridLayout3;
                final SeekBar seekBar7 = seekBar3;
                final SeekBar seekBar8 = seekBar4;
                final SeekBar seekBar9 = seekBar5;
                final TextView textView10 = textView2;
                final C0947 c09479 = c09477;
                final TextView textView11 = textView7;
                final SeekBar seekBar10 = seekBar6;
                final C0947 c094710 = c09478;
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: yyds.ᛵᛴᛳᛶ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        switch (i8) {
                            case 0:
                                C2113.m4030(c0947, c09472, c09479, c094710, seekBar10, seekBar7, seekBar8, seekBar9, textView10, textView11, textView8, textView9, c09476, viewFindViewById, textView, c0172, arrayList, iIntValue, view2);
                                break;
                            default:
                                C2113.m4030(c0947, c09472, c09479, c094710, seekBar10, seekBar7, seekBar8, seekBar9, textView10, textView11, textView8, textView9, c09476, viewFindViewById, textView, c0172, arrayList, iIntValue, view2);
                                break;
                        }
                    }
                };
                c09477 = c09479;
                view2.setOnClickListener(onClickListener);
                gridLayout2.addView(view2);
                c09478 = c094710;
                seekBar6 = seekBar10;
                seekBar4 = seekBar8;
                textView7 = textView11;
                textView8 = textView8;
                textView9 = textView9;
                gridLayout3 = gridLayout4;
                i6 = 0;
                textView2 = textView10;
                c09476 = c09476;
                seekBar3 = seekBar7;
                it = it2;
                i5 = i5;
                seekBar5 = seekBar9;
                i4 = i7;
            }
            i = i4;
            seekBar = seekBar5;
        }
        int i9 = i6;
        int i10 = i5;
        ViewGroup viewGroup = gridLayout3;
        final TextView textView12 = textView2;
        final TextView textView13 = textView;
        final C0947 c094711 = c09478;
        SeekBar seekBar11 = seekBar3;
        SeekBar seekBar12 = seekBar4;
        final C0947 c094712 = c09476;
        SeekBar seekBar13 = seekBar6;
        final TextView textView14 = textView9;
        final TextView textView15 = textView8;
        final TextView textView16 = textView7;
        final int i11 = 0;
        C0172 c01722 = c0172;
        ArrayList arrayList2 = arrayList;
        TextView textView17 = textView12;
        seekBar13.setOnSeekBarChangeListener(new C2171(c01722, i9, new InterfaceC1549() { // from class: yyds.ᲀᛴᛲᛱ
            @Override // yyds.InterfaceC1549
            /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
            public final Object mo371(Object obj) {
                int i12 = i11;
                C2746 c2746 = C2746.f13459;
                TextView textView18 = textView12;
                int iIntValue2 = ((Integer) obj).intValue();
                switch (i12) {
                    case 0:
                        C0947 c094713 = c0947;
                        c094713.f4410 = iIntValue2;
                        textView18.setText(String.valueOf(iIntValue2));
                        C2113.m4029(c094712, c094711, c094713, c09472, c09477, viewFindViewById, textView13);
                        break;
                    case 1:
                        C0947 c094714 = c0947;
                        c094714.f4410 = iIntValue2;
                        textView18.setText(String.valueOf(iIntValue2));
                        C2113.m4029(c094712, c094711, c09472, c094714, c09477, viewFindViewById, textView13);
                        break;
                    case 2:
                        C0947 c094715 = c0947;
                        c094715.f4410 = iIntValue2;
                        textView18.setText(String.valueOf(iIntValue2));
                        C2113.m4029(c094712, c094711, c09472, c09477, c094715, viewFindViewById, textView13);
                        break;
                    default:
                        C0947 c094716 = c0947;
                        c094716.f4410 = iIntValue2;
                        textView18.setText(String.valueOf(iIntValue2));
                        C2113.m4029(c094712, c094716, c094711, c09472, c09477, viewFindViewById, textView13);
                        break;
                }
                return c2746;
            }
        }));
        final int i12 = 1;
        seekBar11.setOnSeekBarChangeListener(new C2171(c01722, i9, new InterfaceC1549() { // from class: yyds.ᲀᛴᛲᛱ
            @Override // yyds.InterfaceC1549
            /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
            public final Object mo371(Object obj) {
                int i122 = i12;
                C2746 c2746 = C2746.f13459;
                TextView textView18 = textView16;
                int iIntValue2 = ((Integer) obj).intValue();
                switch (i122) {
                    case 0:
                        C0947 c094713 = c09472;
                        c094713.f4410 = iIntValue2;
                        textView18.setText(String.valueOf(iIntValue2));
                        C2113.m4029(c094712, c094711, c094713, c0947, c09477, viewFindViewById, textView13);
                        break;
                    case 1:
                        C0947 c094714 = c09472;
                        c094714.f4410 = iIntValue2;
                        textView18.setText(String.valueOf(iIntValue2));
                        C2113.m4029(c094712, c094711, c0947, c094714, c09477, viewFindViewById, textView13);
                        break;
                    case 2:
                        C0947 c094715 = c09472;
                        c094715.f4410 = iIntValue2;
                        textView18.setText(String.valueOf(iIntValue2));
                        C2113.m4029(c094712, c094711, c0947, c09477, c094715, viewFindViewById, textView13);
                        break;
                    default:
                        C0947 c094716 = c09472;
                        c094716.f4410 = iIntValue2;
                        textView18.setText(String.valueOf(iIntValue2));
                        C2113.m4029(c094712, c094716, c094711, c0947, c09477, viewFindViewById, textView13);
                        break;
                }
                return c2746;
            }
        }));
        final int i13 = 2;
        final C0947 c094713 = c09477;
        InterfaceC1549 interfaceC1549 = new InterfaceC1549() { // from class: yyds.ᲀᛴᛲᛱ
            @Override // yyds.InterfaceC1549
            /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
            public final Object mo371(Object obj) {
                int i122 = i13;
                C2746 c2746 = C2746.f13459;
                TextView textView18 = textView15;
                int iIntValue2 = ((Integer) obj).intValue();
                switch (i122) {
                    case 0:
                        C0947 c0947132 = c094713;
                        c0947132.f4410 = iIntValue2;
                        textView18.setText(String.valueOf(iIntValue2));
                        C2113.m4029(c094712, c094711, c0947132, c0947, c09472, viewFindViewById, textView13);
                        break;
                    case 1:
                        C0947 c094714 = c094713;
                        c094714.f4410 = iIntValue2;
                        textView18.setText(String.valueOf(iIntValue2));
                        C2113.m4029(c094712, c094711, c0947, c094714, c09472, viewFindViewById, textView13);
                        break;
                    case 2:
                        C0947 c094715 = c094713;
                        c094715.f4410 = iIntValue2;
                        textView18.setText(String.valueOf(iIntValue2));
                        C2113.m4029(c094712, c094711, c0947, c09472, c094715, viewFindViewById, textView13);
                        break;
                    default:
                        C0947 c094716 = c094713;
                        c094716.f4410 = iIntValue2;
                        textView18.setText(String.valueOf(iIntValue2));
                        C2113.m4029(c094712, c094716, c094711, c0947, c09472, viewFindViewById, textView13);
                        break;
                }
                return c2746;
            }
        };
        final C0947 c094714 = c094713;
        final C0947 c094715 = c094711;
        seekBar12.setOnSeekBarChangeListener(new C2171(c01722, i9, interfaceC1549));
        final int i14 = 3;
        InterfaceC1549 interfaceC15492 = new InterfaceC1549() { // from class: yyds.ᲀᛴᛲᛱ
            @Override // yyds.InterfaceC1549
            /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
            public final Object mo371(Object obj) {
                int i122 = i14;
                C2746 c2746 = C2746.f13459;
                TextView textView18 = textView14;
                int iIntValue2 = ((Integer) obj).intValue();
                switch (i122) {
                    case 0:
                        C0947 c0947132 = c094715;
                        c0947132.f4410 = iIntValue2;
                        textView18.setText(String.valueOf(iIntValue2));
                        C2113.m4029(c094712, c0947, c0947132, c09472, c094714, viewFindViewById, textView13);
                        break;
                    case 1:
                        C0947 c0947142 = c094715;
                        c0947142.f4410 = iIntValue2;
                        textView18.setText(String.valueOf(iIntValue2));
                        C2113.m4029(c094712, c0947, c09472, c0947142, c094714, viewFindViewById, textView13);
                        break;
                    case 2:
                        C0947 c0947152 = c094715;
                        c0947152.f4410 = iIntValue2;
                        textView18.setText(String.valueOf(iIntValue2));
                        C2113.m4029(c094712, c0947, c09472, c094714, c0947152, viewFindViewById, textView13);
                        break;
                    default:
                        C0947 c094716 = c094715;
                        c094716.f4410 = iIntValue2;
                        textView18.setText(String.valueOf(iIntValue2));
                        C2113.m4029(c094712, c094716, c0947, c09472, c094714, viewFindViewById, textView13);
                        break;
                }
                return c2746;
            }
        };
        C0947 c094716 = c094712;
        seekBar.setOnSeekBarChangeListener(new C2171(c01722, i9, interfaceC15492));
        String[] strArr = {AbstractC2328.m4341(-233508354818926L), AbstractC2328.m4341(-233542714557294L), AbstractC2328.m4341(-233577074295662L), AbstractC2328.m4341(-233611434034030L), AbstractC2328.m4341(-233645793772398L), AbstractC2328.m4341(-233680153510766L), AbstractC2328.m4341(-233714513249134L), AbstractC2328.m4341(-233748872987502L), AbstractC2328.m4341(-233783232725870L), AbstractC2328.m4341(-233817592464238L), AbstractC2328.m4341(-233851952202606L), AbstractC2328.m4341(-233886311940974L), AbstractC2328.m4341(-233920671679342L), AbstractC2328.m4341(-233955031417710L), AbstractC2328.m4341(-233989391156078L), AbstractC2328.m4341(-234023750894446L), AbstractC2328.m4341(-234058110632814L), AbstractC2328.m4341(-234092470371182L), AbstractC2328.m4341(-234126830109550L), AbstractC2328.m4341(-234161189847918L), AbstractC2328.m4341(-234195549586286L), AbstractC2328.m4341(-234229909324654L), AbstractC2328.m4341(-234264269063022L), AbstractC2328.m4341(-234298628801390L), AbstractC2328.m4341(-234332988539758L), AbstractC2328.m4341(-234367348278126L), AbstractC2328.m4341(-234401708016494L), AbstractC2328.m4341(-234436067754862L), AbstractC2328.m4341(-234470427493230L), AbstractC2328.m4341(-234504787231598L), AbstractC2328.m4341(-234539146969966L), AbstractC2328.m4341(-234573506708334L)};
        int i15 = i9;
        while (i15 < 32) {
            final int color = Color.parseColor(strArr[i15]);
            final View view3 = new View(context);
            final C0172 c01723 = c01722;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(i10, i10);
            int i16 = i;
            marginLayoutParams2.setMargins(i16, i16, i16, i16);
            view3.setLayoutParams(marginLayoutParams2);
            view3.setBackground(AbstractC1658.m3378(color, false));
            final ArrayList arrayList3 = arrayList2;
            arrayList3.add(new Pair(view3, Integer.valueOf(color)));
            int i17 = i15;
            final int i18 = 0;
            final C0947 c094717 = c094714;
            final C0947 c094718 = c094715;
            final TextView textView18 = textView17;
            final TextView textView19 = textView13;
            final SeekBar seekBar14 = seekBar11;
            final TextView textView20 = textView14;
            final C0947 c094719 = c094716;
            final SeekBar seekBar15 = seekBar12;
            final TextView textView21 = textView16;
            final TextView textView22 = textView15;
            final SeekBar seekBar16 = seekBar13;
            final SeekBar seekBar17 = seekBar;
            View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: yyds.ᛵᛴᛳᛶ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view32) {
                    switch (i18) {
                        case 0:
                            C2113.m4030(c0947, c09472, c094717, c094718, seekBar16, seekBar14, seekBar15, seekBar17, textView18, textView21, textView22, textView20, c094719, viewFindViewById, textView19, c01723, arrayList3, color, view3);
                            break;
                        default:
                            C2113.m4030(c0947, c09472, c094717, c094718, seekBar16, seekBar14, seekBar15, seekBar17, textView18, textView21, textView22, textView20, c094719, viewFindViewById, textView19, c01723, arrayList3, color, view3);
                            break;
                    }
                }
            };
            c094715 = c094718;
            c094714 = c094717;
            seekBar11 = seekBar14;
            textView13 = textView19;
            view3.setOnClickListener(onClickListener2);
            viewGroup.addView(view3);
            i15 = i17 + 1;
            seekBar12 = seekBar15;
            c094716 = c094719;
            textView14 = textView20;
            textView15 = textView22;
            textView16 = textView21;
            textView17 = textView18;
            seekBar = seekBar17;
            c01722 = c01723;
            arrayList2 = arrayList3;
            seekBar13 = seekBar16;
        }
    }
}
