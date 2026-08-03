package Yue;

import android.widget.TextView;
import com.kongzue.dialogx.interfaces.OnMenuItemClickListener;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥۡ۠ۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6173 implements OnMenuItemClickListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ C6185 f1873;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ Object f1874;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final /* synthetic */ TextView f15090;

    static {
        NativeUtil.classesInit0(167);
    }

    public /* synthetic */ C6173(C6185 c6185, Object obj, TextView textView) {
        this.f1873 = c6185;
        this.f1874 = obj;
        this.f15090 = textView;
    }

    @Override // com.kongzue.dialogx.interfaces.OnMenuItemClickListener
    public final native boolean onClick(Object obj, CharSequence charSequence, int i);
}
