package yyds;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.ComponentCallbacks2C0040;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛶᲈᛲᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1460 extends AbstractC0359 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final int f6959;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ int f6960 = 0;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Context f6961;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final InterfaceC1549 f6962;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final List f6963;

    public C1460(Context context, List list, int i, C0485 c0485) {
        AbstractC2328.m4341(-1538980844307310L);
        AbstractC2328.m4341(-1539015204045678L);
        this.f6961 = context;
        this.f6963 = list;
        this.f6959 = i;
        this.f6962 = c0485;
    }

    @Override // yyds.AbstractC0359
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final void mo472(AbstractC0185 abstractC0185, int i) {
        int i2 = this.f6960;
        int i3 = this.f6959;
        List list = this.f6963;
        switch (i2) {
            case 0:
                C2750 c2750 = (C2750) abstractC0185;
                AbstractC2328.m4341(-1539088218489710L);
                C2236 c2236 = (C2236) list.get(i);
                c2750.f13464.setText(c2236.f11039);
                TextView textView = c2750.f13467;
                int i4 = c2236.f11040;
                textView.setText(String.valueOf(i4));
                i = i3 > 0 ? (int) ((((double) i4) * 100.0d) / ((double) i3)) : 0;
                TextView textView2 = c2750.f13466;
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append('%');
                textView2.setText(sb.toString());
                c2750.f13465.setProgress(i);
                c2750.f13463.setOnClickListener(new ViewOnClickListenerC1374(this, 5, c2236));
                break;
            default:
                C0672 c0672 = (C0672) abstractC0185;
                AbstractC2328.m4341(-1113942290760558L);
                ImageView imageView = c0672.f3208;
                final C2484 c2484 = (C2484) list.get(i);
                TextView textView3 = c0672.f3212;
                String strM4341 = c2484.f12278;
                String str = c2484.f12279;
                int i5 = c2484.f12280;
                if (strM4341 == null) {
                    strM4341 = AbstractC2328.m4341(-1113972355531630L);
                }
                textView3.setText(strM4341);
                c0672.f3211.setText(AbstractC2328.m4341(-1113993830368110L) + c2484.f12277);
                c0672.f3210.setText(String.valueOf(i5));
                int i6 = i3 > 0 ? (int) ((((double) i5) * 100.0d) / ((double) i3)) : 0;
                TextView textView4 = c0672.f3207;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i6);
                sb2.append('%');
                textView4.setText(sb2.toString());
                c0672.f3213.setProgress(i6);
                if (str != null && str.length() != 0) {
                    try {
                        ((C0472) ((C0472) ComponentCallbacks2C0040.m252(this.f6961).m4277(str).m1790()).m1786(C2340.f11504)).m1283(imageView);
                    } catch (Exception e) {
                        C2336.f11496.m4355(AbstractC2328.m4341(-1114019600171886L), e);
                    }
                }
                imageView.setOnClickListener(new View.OnClickListener(this) { // from class: yyds.ᛱᛲᲈᛸ

                    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
                    public final /* synthetic */ C1460 f682;

                    {
                        this.f682 = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i7 = i;
                        C2484 c24842 = c2484;
                        C1460 c1460 = this.f682;
                        switch (i7) {
                            case 0:
                                try {
                                    AbstractC1367.m2782(c1460.f6961, c24842.f12277);
                                } catch (Exception e2) {
                                    C2336.f11496.m4355(AbstractC2328.m4341(-1114058254877550L), e2);
                                    return;
                                }
                                break;
                            case 1:
                                try {
                                    AbstractC1367.m2782(c1460.f6961, c24842.f12277);
                                } catch (Exception e3) {
                                    C2336.f11496.m4355(AbstractC2328.m4341(-1114096909583214L), e3);
                                    return;
                                }
                                break;
                            default:
                                ((C0485) c1460.f6962).mo371(c24842);
                                break;
                        }
                    }
                });
                final int i7 = 1;
                c0672.f1093.setOnClickListener(new View.OnClickListener(this) { // from class: yyds.ᛱᛲᲈᛸ

                    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
                    public final /* synthetic */ C1460 f682;

                    {
                        this.f682 = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i72 = i7;
                        C2484 c24842 = c2484;
                        C1460 c1460 = this.f682;
                        switch (i72) {
                            case 0:
                                try {
                                    AbstractC1367.m2782(c1460.f6961, c24842.f12277);
                                } catch (Exception e2) {
                                    C2336.f11496.m4355(AbstractC2328.m4341(-1114058254877550L), e2);
                                    return;
                                }
                                break;
                            case 1:
                                try {
                                    AbstractC1367.m2782(c1460.f6961, c24842.f12277);
                                } catch (Exception e3) {
                                    C2336.f11496.m4355(AbstractC2328.m4341(-1114096909583214L), e3);
                                    return;
                                }
                                break;
                            default:
                                ((C0485) c1460.f6962).mo371(c24842);
                                break;
                        }
                    }
                });
                final int i8 = 2;
                c0672.f3209.setOnClickListener(new View.OnClickListener(this) { // from class: yyds.ᛱᛲᲈᛸ

                    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
                    public final /* synthetic */ C1460 f682;

                    {
                        this.f682 = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i72 = i8;
                        C2484 c24842 = c2484;
                        C1460 c1460 = this.f682;
                        switch (i72) {
                            case 0:
                                try {
                                    AbstractC1367.m2782(c1460.f6961, c24842.f12277);
                                } catch (Exception e2) {
                                    C2336.f11496.m4355(AbstractC2328.m4341(-1114058254877550L), e2);
                                    return;
                                }
                                break;
                            case 1:
                                try {
                                    AbstractC1367.m2782(c1460.f6961, c24842.f12277);
                                } catch (Exception e3) {
                                    C2336.f11496.m4355(AbstractC2328.m4341(-1114096909583214L), e3);
                                    return;
                                }
                                break;
                            default:
                                ((C0485) c1460.f6962).mo371(c24842);
                                break;
                        }
                    }
                });
                break;
        }
    }

    @Override // yyds.AbstractC0359
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final int mo531() {
        int i = this.f6960;
        List list = this.f6963;
        switch (i) {
        }
        return list.size();
    }

    @Override // yyds.AbstractC0359
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final AbstractC0185 mo473(ViewGroup viewGroup, int i) {
        int i2 = this.f6960;
        Context context = this.f6961;
        switch (i2) {
            case 0:
                AbstractC2328.m4341(-1539058153718638L);
                return new C2750(AbstractC1115.m2309(context).inflate(R.layout.ward_stats_item_layout, viewGroup, false));
            default:
                AbstractC2328.m4341(-1113912225989486L);
                return new C0672(AbstractC1115.m2309(context).inflate(R.layout.user_stats_item_layout, viewGroup, false));
        }
    }

    public C1460(Context context, List list, int i, C0485 c0485, byte b) {
        AbstractC2328.m4341(-1113834916578158L);
        AbstractC2328.m4341(-1113869276316526L);
        this.f6961 = context;
        this.f6963 = list;
        this.f6959 = i;
        this.f6962 = c0485;
    }
}
