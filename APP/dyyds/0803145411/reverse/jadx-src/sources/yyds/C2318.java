package yyds;

import android.R;
import android.media.MediaPlayer;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᲁᲀᛷᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2318 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f11367;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ C0184 f11368;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f11369;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2318(C0184 c0184, InterfaceC0274 interfaceC0274, int i) {
        super(2, interfaceC0274);
        this.f11369 = i;
        this.f11368 = c0184;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final Object mo474(Object obj) throws Throwable {
        MediaPlayer mediaPlayer;
        int i = this.f11369;
        C2746 c2746 = C2746.f13459;
        EnumC1765 enumC1765 = EnumC1765.f8858;
        C0184 c0184 = this.f11368;
        InterfaceC0274 interfaceC0274 = null;
        switch (i) {
            case 0:
                Spinner spinner = c0184.f1059;
                TextView textView = c0184.f1086;
                int i2 = this.f11367;
                int i3 = 0;
                try {
                    if (i2 == 0) {
                        AbstractC1544.m3189(obj);
                        textView.setVisibility(0);
                        C1206 c1206 = AbstractC0221.f1238;
                        ExecutorC2482 executorC2482 = ExecutorC2482.f12272;
                        C0853 c0853 = new C0853(c0184, interfaceC0274, i3);
                        this.f11367 = 1;
                        obj = AbstractC2071.m3955(executorC2482, c0853, this);
                        if (obj == enumC1765) {
                            return enumC1765;
                        }
                    } else {
                        if (i2 != 1) {
                            C0188.m800(AbstractC2328.m4341(-150185989276526L));
                            return null;
                        }
                        AbstractC1544.m3189(obj);
                    }
                    List list = (List) obj;
                    c0184.f1051 = list;
                    ArrayAdapter arrayAdapter = new ArrayAdapter(c0184.f1057, R.layout.simple_spinner_item, list);
                    arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
                    spinner.setAdapter((SpinnerAdapter) arrayAdapter);
                    C1509.f7142.getClass();
                    String str = (String) C1509.f7217.m1579(C1509.f7179[199]);
                    if (str.length() > 0) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                i3 = -1;
                            } else if (!AbstractC1544.m3188(((C2302) it.next()).f11306, str)) {
                                i3++;
                            }
                        }
                        if (i3 >= 0) {
                            spinner.setSelection(i3);
                        }
                    }
                    textView.setVisibility(8);
                    return c2746;
                } catch (Exception e) {
                    C2336.f11496.m4358(AbstractC2328.m4341(-150052845290350L), e);
                    textView.setText(AbstractC2328.m4341(-150091499996014L));
                    AbstractC1960.m3789(AbstractC2328.m4341(-150138744636270L) + e.getMessage());
                    return c2746;
                }
            default:
                int i4 = this.f11367;
                if (i4 != 0 && i4 != 1) {
                    C0188.m800(AbstractC2328.m4341(-202468626170734L));
                    return null;
                }
                AbstractC1544.m3189(obj);
                while (c0184.f1067 && (mediaPlayer = c0184.f1062) != null && mediaPlayer.isPlaying()) {
                    try {
                        int currentPosition = mediaPlayer.getCurrentPosition();
                        int duration = mediaPlayer.getDuration();
                        if (duration > 0) {
                            c0184.f1066.setProgress((currentPosition * 100) / duration);
                            c0184.f1063.setText(C0184.m762(currentPosition));
                        }
                    } catch (Exception e2) {
                        C2336.f11496.m4354(AbstractC2328.m4341(-202429971465070L) + e2.getMessage());
                    }
                    this.f11367 = 1;
                    if (AbstractC0902.m2018(100L, this) == enumC1765) {
                        return enumC1765;
                    }
                }
                return c2746;
        }
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        int i = this.f11369;
        C0184 c0184 = this.f11368;
        switch (i) {
            case 0:
                return new C2318(c0184, interfaceC0274, 0);
            default:
                return new C2318(c0184, interfaceC0274, 1);
        }
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) {
        int i = this.f11369;
        C2746 c2746 = C2746.f13459;
        InterfaceC0990 interfaceC0990 = (InterfaceC0990) obj;
        InterfaceC0274 interfaceC0274 = (InterfaceC0274) obj2;
        switch (i) {
        }
        return ((C2318) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
    }
}
