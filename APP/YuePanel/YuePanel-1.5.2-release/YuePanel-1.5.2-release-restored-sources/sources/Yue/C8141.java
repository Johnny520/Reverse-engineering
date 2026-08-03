package Yue;

import android.widget.CompoundButton;
import android.widget.Switch;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;

/* JADX INFO: renamed from: Yue.ۥۣۣۢۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8141 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ itemInfo f3245;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ Switch f3246;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final /* synthetic */ Class f24129;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final /* synthetic */ String f24130;

    static {
        NativeUtil.classesInit0(923);
    }

    public /* synthetic */ C8141(itemInfo iteminfo, Switch r2, Class cls, String str) {
        this.f3245 = iteminfo;
        this.f3246 = r2;
        this.f24129 = cls;
        this.f24130 = str;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final native void onCheckedChanged(CompoundButton compoundButton, boolean z);
}
