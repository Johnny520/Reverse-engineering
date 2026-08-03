package p000a;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;

/* JADX INFO: renamed from: a.X2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0418X2 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1581a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1582b;

    public /* synthetic */ C0418X2(int i, Object obj) {
        this.f1581a = i;
        this.f1582b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.f1581a) {
            case 0:
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = ((Chip) this.f1582b).f5600i;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                }
                break;
            default:
                ((InterfaceC0064D7) this.f1582b).mo53f(Boolean.valueOf(z));
                break;
        }
    }
}
