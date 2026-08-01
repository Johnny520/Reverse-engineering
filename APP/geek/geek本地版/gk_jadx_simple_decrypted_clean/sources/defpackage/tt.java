package defpackage;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.c;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class tt extends qz {
    public final /* synthetic */ c a;
    public final /* synthetic */ MaterialButton b;
    public final /* synthetic */ ut c;

    public tt(ut r1, c r2, MaterialButton r3) {
        this.c = r1;
        this.a = r2;
        this.b = r3;
    }

    @Override // defpackage.qz
    public final void a(RecyclerView r1, int r2) {
        if (r2 != 0) goto L5;
        r1.announceForAccessibility(this.b.getText());
        return;
    }

    @Override // defpackage.qz
    public final void b(RecyclerView r4, int r5, int r6) {
        c8 r42 = this.a.c;
        ut r62 = this.c;
        if (r5 >= 0) goto L8;
        LinearLayoutManager r52 = (LinearLayoutManager) r62.Y.getLayoutManager();
        View r53 = r52.K0(0, r52.v(), false);
        if (r53 != null) goto L7;
        int r54 = -1;
    L9:
        Calendar r0 = u80.a(r42.a.a);
        r0.add(2, r54);
        r62.U = new zv(r0);
        Calendar r43 = u80.a(r42.a.a);
        r43.add(2, r54);
        r43.set(5, 1);
        Calendar r44 = u80.a(r43);
        r44.get(2);
        r44.get(1);
        r44.getMaximum(7);
        r44.getActualMaximum(5);
        r44.getTimeInMillis();
        long r45 = r44.getTimeInMillis();
        Locale r63 = Locale.getDefault();
        AtomicReference r02 = u80.a;
        DateFormat r64 = DateFormat.getInstanceForSkeleton("yMMMM", r63);
        r64.setTimeZone(TimeZone.getTimeZone("UTC"));
        r64.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        String r46 = r64.format(new Date(r45));
        this.b.setText(r46);
        return;
    L7:
        r54 = nz.F(r53);
        goto L9
    L8:
        r54 = ((LinearLayoutManager) r62.Y.getLayoutManager()).I0();
        goto L9
    }
}
