package Yue;

import android.widget.TextView;
import com.kongzue.dialogx.interfaces.OnMenuItemClickListener;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5763 implements OnMenuItemClickListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ C5779 f1667;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ C4810 f1668;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final /* synthetic */ TextView f14291;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final /* synthetic */ int f14292;

    static {
        NativeUtil.classesInit0(1006);
    }

    public /* synthetic */ C5763(C5779 c5779, C4810 c4810, TextView textView, int i) {
        this.f1667 = c5779;
        this.f1668 = c4810;
        this.f14291 = textView;
        this.f14292 = i;
    }

    @Override // com.kongzue.dialogx.interfaces.OnMenuItemClickListener
    public final native boolean onClick(Object obj, CharSequence charSequence, int i);
}
