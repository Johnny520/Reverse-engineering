package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ljx.wechatmod.R;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class kd0 extends AbstractC0503mz {

    /* JADX INFO: renamed from: c */
    public final C0942yt f2824c;

    public kd0(C0942yt c0942yt) {
        this.f2824c = c0942yt;
    }

    @Override // p000.AbstractC0503mz
    /* JADX INFO: renamed from: a */
    public final int mo715a() {
        return this.f2824c.f5493T.f3104f;
    }

    @Override // p000.AbstractC0503mz
    /* JADX INFO: renamed from: c */
    public final void mo717c(i00 i00Var, int i) {
        C0942yt c0942yt = this.f2824c;
        int i2 = c0942yt.f5493T.f3099a.f2062c + i;
        TextView textView = ((jd0) i00Var).f2712t;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        Context context = textView.getContext();
        textView.setContentDescription(z80.m2820b().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        C0138d4 c0138d4 = c0942yt.f5496W;
        if (z80.m2820b().get(1) == i2) {
            Object obj = c0138d4.f1298c;
        } else {
            Object obj2 = c0138d4.f1297b;
        }
        throw null;
    }

    @Override // p000.AbstractC0503mz
    /* JADX INFO: renamed from: d */
    public final i00 mo718d(ViewGroup viewGroup) {
        return new jd0((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
