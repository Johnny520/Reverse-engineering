package yyds;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.bytedance.im.core.model.Message;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: yyds.ᛸᛳᛳᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnLongClickListenerC1733 implements View.OnLongClickListener {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f8767;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f8768;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ Object f8769;

    public /* synthetic */ ViewOnLongClickListenerC1733(Object obj, int i, Object obj2) {
        this.f8767 = i;
        this.f8768 = obj;
        this.f8769 = obj2;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.f8767;
        InterfaceC0274 interfaceC0274 = null;
        Object obj = this.f8769;
        Object obj2 = this.f8768;
        int i2 = 1;
        switch (i) {
            case 0:
                String str = (String) obj2;
                C2336.f11496.m4354(AbstractC2328.m4341(-129591621092206L) + str);
                C0469 c0469 = C0469.f2328;
                Context context = ((C0184) obj).f1055.getContext();
                AbstractC2328.m4341(-129621685863278L);
                c0469.m1276(context, str, null);
                break;
            case 1:
                AbstractC2071.m3959(AbstractC2797.m4924(), null, new C0853((Message) obj, interfaceC0274, i2), 3);
                Object obj3 = ((C0488) obj2).f2405;
                String strM4341 = AbstractC2328.m4341(-1040463990260590L);
                Object[] objArr = new Object[0];
                if (obj3 != null) {
                    try {
                        int i3 = AbstractC2293.f11258;
                        C2014 c2014M1327 = AbstractC0476.m1327(obj3);
                        ((C0903) c2014M1327.f10074).f4118 = 2;
                        C1189 c1189M3892 = c2014M1327.m3892();
                        c1189M3892.m4478();
                        c1189M3892.f12003 = strM4341;
                        AbstractC2328.m4341(-872178581668718L);
                        C0536 c0536 = (C0536) AbstractC1595.m3281(c1189M3892.mo736());
                        if (c0536 != null) {
                            c0536.m1372(Arrays.copyOf(objArr, 0));
                        }
                    } catch (Exception e) {
                        C2336.f11496.m4355(AbstractC2328.m4341(-1040498349998958L), e);
                    }
                }
                break;
            case 2:
                C0469.f2328.m1276((Context) obj, ((C1981) obj2).m3815(), null);
                break;
            case 3:
                AbstractC1108.m2308((Aweme) obj2);
                ((Dialog) obj).dismiss();
                break;
            case 4:
                AtomicLong atomicLong = AbstractC1108.f5116;
                AbstractC1108.m2308(((C0172) obj2).f997);
                ((Dialog) obj).dismiss();
                break;
            default:
                ((C2343) obj2).f11520.mo371((C2770) obj);
                break;
        }
        return true;
        return true;
    }
}
