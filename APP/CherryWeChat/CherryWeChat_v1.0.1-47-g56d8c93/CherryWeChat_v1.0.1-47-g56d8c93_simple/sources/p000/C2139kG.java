package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC1158g;
import androidx.recyclerview.widget.AbstractC1166o;
import io.github.cherrywechat.R;
import java.util.Locale;

/* JADX INFO: renamed from: kG */
/* JADX INFO: loaded from: classes.dex */
public final class C2139kG extends AbstractC1158g {

    /* JADX INFO: renamed from: a */
    public final C0549Mq f7484a;

    public C2139kG(C0549Mq r1) {
        this.f7484a = r1;
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final int getItemCount() {
        return this.f7484a.f1775V.f354f;
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final void onBindViewHolder(AbstractC1166o r6, int r7) {
        C2095jG r62 = (C2095jG) r6;
        C0549Mq r0 = this.f7484a;
        int r1 = r0.f1775V.f349a.f5209c + r7;
        r62.f7371a.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(r1)}));
        TextView r63 = r62.f7371a;
        Context r72 = r63.getContext();
        if (AbstractC2407qD.m4844b().get(1) != r1) goto L5;
        String r73 = String.format(r72.getString(R.string.mtrl_picker_navigate_to_current_year_description), new Object[]{Integer.valueOf(r1)});
    L6:
        r63.setContentDescription(r73);
        C0649P3 r64 = r0.f1778Y;
        if (AbstractC2407qD.m4844b().get(1) != r1) goto L9;
        Object r65 = r64.f2090c;
    L11:
        throw null;
    L9:
        Object r66 = r64.f2089b;
        goto L11
    L5:
        r73 = String.format(r72.getString(R.string.mtrl_picker_navigate_to_year_description), new Object[]{Integer.valueOf(r1)});
        goto L6
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final AbstractC1166o onCreateViewHolder(ViewGroup r3, int r4) {
        return new C2095jG((TextView) LayoutInflater.from(r3.getContext()).inflate(R.layout.mtrl_calendar_year, r3, false));
    }
}
