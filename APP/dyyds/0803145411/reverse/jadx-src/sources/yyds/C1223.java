package yyds;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.widget.TextView;
import com.p000ss.android.ugc.awemes.WardDatabase_Impl;
import com.p000ss.android.ugc.awemes.p001ui.ProgressParticleView;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: renamed from: yyds.ᛵᲇᛵᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1223 implements InterfaceC2266 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f5604;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f5605;

    public /* synthetic */ C1223(int i, Object obj) {
        this.f5604 = i;
        this.f5605 = obj;
    }

    @Override // yyds.InterfaceC2266
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final Object mo731() {
        int i = this.f5604;
        AlertDialog alertDialog = null;
        C2746 c2746 = C2746.f13459;
        Object obj = this.f5605;
        switch (i) {
            case 0:
                Object obj2 = ((C0172) obj).f997;
                if (obj2 == null) {
                    AbstractC2328.m4341(-839339261723502L);
                } else {
                    alertDialog = (AlertDialog) obj2;
                }
                alertDialog.dismiss();
                return c2746;
            case 1:
                return ((C0474) ((AbstractC0145) obj).f891.getValue()).getDefaultClassLoader();
            case 2:
                return ((Set) obj).iterator();
            case 3:
                TextView textView = (TextView) obj;
                C1509.f7142.getClass();
                textView.setText(AbstractC2328.m4341(C1509.m3062() ? -1085273384059758L : -1085290563928942L));
                return c2746;
            case 4:
                return ((C2133) obj).mo1348(":memory:");
            case 5:
                return AbstractC2431.m4476(((C1743) obj).f8799);
            case 6:
                C0757 c0757 = (C0757) obj;
                return "(" + AbstractC1595.m3285(c0757.f3504, "", null, null, new C2460(17), 30) + ")" + AbstractC2431.m4476(c0757.f3505);
            case 7:
                C1052 c1052 = (C1052) obj;
                float f = c1052.f4771;
                int i2 = c1052.f4778;
                int i3 = c1052.f4775;
                int i4 = c1052.f4776;
                return new RadialGradient(0.0f, 0.0f, f, new int[]{Color.argb(190, i2, i3, i4), Color.argb(70, i2, i3, i4), Color.argb(0, i2, i3, i4)}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
            case 8:
                EnumC0868 enumC0868 = (EnumC0868) obj;
                Iterator it = C0561.f2674.iterator();
                while (it.hasNext()) {
                    try {
                        ((InterfaceC2266) it.next()).mo731();
                    } catch (Throwable unused) {
                    }
                }
                Iterator it2 = C0561.f2669.iterator();
                while (it2.hasNext()) {
                    try {
                        ((InterfaceC1549) it2.next()).mo371(enumC0868);
                    } catch (Throwable unused2) {
                    }
                }
                return c2746;
            case 9:
                Collection<EnumC0868> collection = (Collection) obj;
                Iterator it3 = C0561.f2674.iterator();
                while (it3.hasNext()) {
                    try {
                        ((InterfaceC2266) it3.next()).mo731();
                    } catch (Throwable unused3) {
                    }
                }
                for (EnumC0868 enumC08682 : collection) {
                    Iterator it4 = C0561.f2669.iterator();
                    while (it4.hasNext()) {
                        try {
                            ((InterfaceC1549) it4.next()).mo371(enumC08682);
                        } catch (Throwable unused4) {
                        }
                    }
                }
                return c2746;
            case 10:
                C1958 c1958 = (C1958) obj;
                Context context = c1958.f9816;
                String str = c1958.f9818;
                C0052 c0052 = new C0052(24);
                c0052.f551 = null;
                C1689 c1689 = new C1689(context, str, c0052, c1958.f9814);
                c1689.setWriteAheadLoggingEnabled(c1958.f9815);
                return c1689;
            case 11:
                try {
                    return (List) ((InterfaceC2266) obj).mo731();
                } catch (SSLPeerUnverifiedException unused5) {
                    return C1860.f9345;
                }
            case 12:
                return (List) obj;
            case 13:
                C0937 c0937 = (C0937) obj;
                c0937.getClass();
                try {
                    c0937.f4318.m923(2, 0, false);
                    break;
                } catch (IOException e) {
                    c0937.m2052(2, 2, e);
                }
                return c2746;
            case 14:
                WardDatabase_Impl wardDatabase_Impl = ((C0522) obj).f2512;
                return Boolean.valueOf(!wardDatabase_Impl.m345() || wardDatabase_Impl.m352());
            case 15:
                ((C2143) obj).m4091();
                return c2746;
            case 16:
                C0660 c0660 = (C0660) obj;
                return c0660.f3151.mo1348(c0660.f3153);
            case 17:
                ProgressParticleView progressParticleView = (ProgressParticleView) obj;
                int i5 = ProgressParticleView.f507;
                float f2 = progressParticleView.f511;
                int i6 = progressParticleView.f525;
                int i7 = progressParticleView.f512;
                int i8 = progressParticleView.f524;
                return new RadialGradient(0.0f, 0.0f, f2, new int[]{Color.argb(160, i6, i7, i8), Color.argb(50, i6, i7, i8), Color.argb(0, i6, i7, i8)}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
            case 18:
                ((Runnable) obj).run();
                return c2746;
            case 19:
                return obj;
            case 20:
                C0647.f3124.getClass();
                C0647.m1573((LinkedHashMap) obj);
                return c2746;
            case 21:
                int i9 = WardDatabase_Impl.f505;
                return new C0380((WardDatabase_Impl) obj);
            default:
                ((C0438) obj).mo731();
                return c2746;
        }
    }
}
