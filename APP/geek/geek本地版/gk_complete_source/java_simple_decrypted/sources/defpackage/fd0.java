package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ljx.wechatmod.R;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class fd0 extends fz {
    public final ut c;

    public fd0(ut r1) {
        this.c = r1;
    }

    @Override // defpackage.fz
    public final int a() {
        return this.c.T.f;
    }

    @Override // defpackage.fz
    public final void c(b00 r5, int r6) {
        ut r0 = this.c;
        int r1 = r0.T.a.c + r6;
        TextView r52 = ((ed0) r5).t;
        r52.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(r1)}));
        Context r62 = r52.getContext();
        if (u80.b().get(1) != r1) goto L5;
        String r63 = String.format(r62.getString(R.string.mtrl_picker_navigate_to_current_year_description), new Object[]{Integer.valueOf(r1)});
    L6:
        r52.setContentDescription(r63);
        d4 r53 = r0.W;
        if (u80.b().get(1) != r1) goto L9;
        Object r54 = r53.c;
    L11:
        throw null;
    L9:
        Object r55 = r53.b;
        goto L11
    L5:
        r63 = String.format(r62.getString(R.string.mtrl_picker_navigate_to_year_description), new Object[]{Integer.valueOf(r1)});
        goto L6
    }

    @Override // defpackage.fz
    public final b00 d(ViewGroup r4) {
        return new ed0((TextView) LayoutInflater.from(r4.getContext()).inflate(R.layout.mtrl_calendar_year, r4, false));
    }
}
