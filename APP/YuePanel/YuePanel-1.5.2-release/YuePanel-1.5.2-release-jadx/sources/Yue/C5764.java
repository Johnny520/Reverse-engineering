package Yue;

import android.widget.TextView;
import com.kongzue.dialogx.interfaces.OnMenuItemClickListener;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5764 implements OnMenuItemClickListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ C5779 f1669;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ C4810 f1670;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final /* synthetic */ TextView f14293;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final /* synthetic */ int f14294;

    static {
        NativeUtil.classesInit0(53);
    }

    public /* synthetic */ C5764(C5779 c5779, C4810 c4810, TextView textView, int i) {
        this.f1669 = c5779;
        this.f1670 = c4810;
        this.f14293 = textView;
        this.f14294 = i;
    }

    @Override // com.kongzue.dialogx.interfaces.OnMenuItemClickListener
    public final native boolean onClick(Object obj, CharSequence charSequence, int i);
}
