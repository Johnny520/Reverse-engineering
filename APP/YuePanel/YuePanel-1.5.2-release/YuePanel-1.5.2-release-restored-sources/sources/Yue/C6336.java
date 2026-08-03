package Yue;

import android.content.Context;
import com.kongzue.dialogx.interfaces.OnMenuItemClickListener;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥۣۡۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6336 implements OnMenuItemClickListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ String f2016;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ Context f2017;

    static {
        NativeUtil.classesInit0(846);
    }

    public /* synthetic */ C6336(String str, Context context) {
        this.f2016 = str;
        this.f2017 = context;
    }

    @Override // com.kongzue.dialogx.interfaces.OnMenuItemClickListener
    public final native boolean onClick(Object obj, CharSequence charSequence, int i);
}
