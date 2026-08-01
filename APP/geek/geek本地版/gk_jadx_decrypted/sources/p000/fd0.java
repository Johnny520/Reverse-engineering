package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ljx.wechatmod.R;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class fd0 extends AbstractC0242fz {

    /* JADX INFO: renamed from: c */
    public final C0794ut f1933c;

    public fd0(C0794ut c0794ut) {
        this.f1933c = c0794ut;
    }

    @Override // p000.AbstractC0242fz
    /* JADX INFO: renamed from: a */
    public final int mo757a() {
        return this.f1933c.f4761T.f914f;
    }

    @Override // p000.AbstractC0242fz
    /* JADX INFO: renamed from: c */
    public final void mo759c(b00 b00Var, int i) {
        C0794ut c0794ut = this.f1933c;
        int i2 = c0794ut.f4761T.f909a.f5621c + i;
        TextView textView = ((ed0) b00Var).f1773t;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        Context context = textView.getContext();
        textView.setContentDescription(u80.m2427b().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        C0138d4 c0138d4 = c0794ut.f4764W;
        if (u80.m2427b().get(1) == i2) {
            Object obj = c0138d4.f1364c;
        } else {
            Object obj2 = c0138d4.f1363b;
        }
        throw null;
    }

    @Override // p000.AbstractC0242fz
    /* JADX INFO: renamed from: d */
    public final b00 mo760d(ViewGroup viewGroup) {
        return new ed0((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
