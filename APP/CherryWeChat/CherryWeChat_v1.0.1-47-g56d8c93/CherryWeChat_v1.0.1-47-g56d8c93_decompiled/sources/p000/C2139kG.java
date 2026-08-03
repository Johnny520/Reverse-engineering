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

    public C2139kG(C0549Mq c0549Mq) {
        this.f7484a = c0549Mq;
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final int getItemCount() {
        return this.f7484a.f1775V.f354f;
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final void onBindViewHolder(AbstractC1166o abstractC1166o, int i) {
        C2095jG c2095jG = (C2095jG) abstractC1166o;
        C0549Mq c0549Mq = this.f7484a;
        int i2 = c0549Mq.f1775V.f349a.f5209c + i;
        c2095jG.f7371a.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        TextView textView = c2095jG.f7371a;
        Context context = textView.getContext();
        textView.setContentDescription(AbstractC2407qD.m4844b().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        C0649P3 c0649p3 = c0549Mq.f1778Y;
        if (AbstractC2407qD.m4844b().get(1) == i2) {
            Object obj = c0649p3.f2090c;
        } else {
            Object obj2 = c0649p3.f2089b;
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final AbstractC1166o onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C2095jG((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
