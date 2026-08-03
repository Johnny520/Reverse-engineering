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

    public /* synthetic */ C2132k9(KeyEvent.Callback callback, int i) {
        this.f7476a = i;
        this.f7477b = callback;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.f7476a) {
            case 0:
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = ((Chip) this.f7477b).f4515i;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                }
                break;
            default:
                MainActivity.onCreate$lambda$0((MainActivity) this.f7477b, compoundButton, z);
                break;
        }
    }
}
