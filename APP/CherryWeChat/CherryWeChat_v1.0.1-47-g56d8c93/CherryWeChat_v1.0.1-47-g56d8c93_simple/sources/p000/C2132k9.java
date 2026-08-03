package p000;

import android.view.KeyEvent;
import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
import io.github.cherrywechat.p002ui.activity.MainActivity;

/* JADX INFO: renamed from: k9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2132k9 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7476a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ KeyEvent.Callback f7477b;

    public /* synthetic */ C2132k9(KeyEvent.Callback r1, int r2) {
        this.f7476a = r2;
        this.f7477b = r1;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton r2, boolean r3) {
        switch(this.f7476a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        MainActivity.m3555b((MainActivity) this.f7477b, r2, r3);
        return;
    L6:
        CompoundButton.OnCheckedChangeListener r0 = ((Chip) this.f7477b).f4515i;
        if (r0 == null) goto L10;
        r0.onCheckedChanged(r2, r3);
        return;
    }
}
