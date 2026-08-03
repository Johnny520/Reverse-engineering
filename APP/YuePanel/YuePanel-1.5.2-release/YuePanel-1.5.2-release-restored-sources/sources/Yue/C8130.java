package Yue;

import android.widget.CompoundButton;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥۣۢۢۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8130 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ C8131 f3234;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ String f3235;

    static {
        NativeUtil.classesInit0(938);
    }

    public /* synthetic */ C8130(C8131 c8131, String str) {
        this.f3234 = c8131;
        this.f3235 = str;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final native void onCheckedChanged(CompoundButton compoundButton, boolean z);
}
