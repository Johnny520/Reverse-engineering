package yyds;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᛲᛳᛶᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0312 extends AbstractC0359 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C2732 f1626;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C1182 f1627;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final ArrayList f1628;

    public C0312(C2732 c2732, C1182 c1182) {
        AbstractC2328.m4341(-206321211835246L);
        AbstractC2328.m4341(-206355571573614L);
        this.f1626 = c2732;
        this.f1627 = c1182;
        this.f1628 = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b2  */
    @Override // yyds.AbstractC0359
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo472(AbstractC0185 abstractC0185, int i) {
        String str;
        boolean z;
        C0263 c0263 = (C0263) abstractC0185;
        AbstractC2328.m4341(-206553140069230L);
        C0324 c0324 = (C0324) this.f1628.get(i);
        C0312 c0312 = c0263.f1452;
        AbstractC2328.m4341(-235020183307118L);
        String str2 = c0324.f1702;
        C1127 c1127 = c0263.f1451;
        TextView textView = c1127.f5190;
        TextView textView2 = c1127.f5195;
        TextView textView3 = c1127.f5188;
        Switch r4 = (Switch) c1127.f5192;
        textView.setText(c0324.f1704);
        c1127.f5189.setText(c0324.f1705.f9232);
        TextView textView4 = c1127.f5191;
        String str3 = c0324.f1707;
        textView4.setText(str3 == null ? AbstractC2328.m4341(-235045953110894L) : AbstractC2328.m4341(-235080312849262L).concat(C0263.m911(180, str3)));
        C2565 c2565 = c0324.f1708;
        int i2 = 8;
        int i3 = 0;
        textView3.setVisibility(c2565 == null ? 8 : 0);
        if (c2565 != null) {
            str = AbstractC2328.m4341(c2565.f12652 ? -235097492718446L : -235110377620334L) + (char) 65306 + C0263.m911(180, c2565.f12651);
        } else {
            str = null;
        }
        textView3.setText(str);
        r4.setOnCheckedChangeListener(null);
        r4.setVisibility(c2565 == null ? 8 : 0);
        if (c2565 != null) {
            z = c2565.f12652;
        }
        r4.setChecked(z);
        r4.setOnCheckedChangeListener(c2565 != null ? new C2558(c0312, i3, c0324) : null);
        String strM4341 = AbstractC2328.m4341(c0324.f1706 ? -235144737358702L : -235179097097070L);
        TextView textView5 = c1127.f5194;
        StringBuilder sb = new StringBuilder(strM4341);
        String str4 = c0324.f1703;
        if (str4 != null) {
            sb.append(AbstractC2328.m4341(-235230636704622L));
            sb.append(str4);
        }
        String str5 = c0324.f1709;
        if (str5 != null) {
            sb.append(AbstractC2328.m4341(-235247816573806L));
            sb.append(C0263.m911(80, str5));
        }
        textView5.setText(sb.toString());
        if (str2 != null && !AbstractC0473.m1313(str2)) {
            i2 = 0;
        }
        textView2.setVisibility(i2);
        textView2.setText(str2);
        ((LinearLayout) c1127.f5193).setOnClickListener(new ViewOnClickListenerC1374(c0312, i3, c0324));
    }

    @Override // yyds.AbstractC0359
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final int mo531() {
        return this.f1628.size();
    }

    @Override // yyds.AbstractC0359
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final AbstractC0185 mo473(ViewGroup viewGroup, int i) {
        AbstractC2328.m4341(-206467240723310L);
        View viewInflate = AbstractC1115.m2309(viewGroup.getContext()).inflate(R.layout.item_ab_test_entry, viewGroup, false);
        int i2 = R.id.abEntryEnabled;
        Switch r3 = (Switch) AbstractC1741.m3479(viewInflate, R.id.abEntryEnabled);
        if (r3 != null) {
            i2 = R.id.abEntryError;
            TextView textView = (TextView) AbstractC1741.m3479(viewInflate, R.id.abEntryError);
            if (textView != null) {
                i2 = R.id.abEntryKey;
                TextView textView2 = (TextView) AbstractC1741.m3479(viewInflate, R.id.abEntryKey);
                if (textView2 != null) {
                    i2 = R.id.abEntryMeta;
                    TextView textView3 = (TextView) AbstractC1741.m3479(viewInflate, R.id.abEntryMeta);
                    if (textView3 != null) {
                        i2 = R.id.abEntryOriginal;
                        TextView textView4 = (TextView) AbstractC1741.m3479(viewInflate, R.id.abEntryOriginal);
                        if (textView4 != null) {
                            i2 = R.id.abEntryOverride;
                            TextView textView5 = (TextView) AbstractC1741.m3479(viewInflate, R.id.abEntryOverride);
                            if (textView5 != null) {
                                i2 = R.id.abEntryType;
                                TextView textView6 = (TextView) AbstractC1741.m3479(viewInflate, R.id.abEntryType);
                                if (textView6 != null) {
                                    LinearLayout linearLayout = (LinearLayout) viewInflate;
                                    C1127 c1127 = new C1127(linearLayout, r3, textView, textView2, textView3, textView4, textView5, textView6);
                                    AbstractC2328.m4341(-206497305494382L);
                                    C2701.f13261.getClass();
                                    C2701.m4793(linearLayout);
                                    return new C0263(this, c1127);
                                }
                            }
                        }
                    }
                }
            }
        }
        C0188.m789(AbstractC2328.m4341(-1745139274515310L).concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }
}
