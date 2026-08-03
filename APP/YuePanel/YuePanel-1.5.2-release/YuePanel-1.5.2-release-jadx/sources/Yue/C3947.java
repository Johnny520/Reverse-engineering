package Yue;

import com.kongzue.dialogx.interfaces.OnMenuItemClickListener;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.utils.entity.comment.CommentBean;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۦ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3947 implements OnMenuItemClickListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ C3932 f580;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ int f581;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final /* synthetic */ CommentBean f7621;

    static {
        NativeUtil.classesInit0(483);
    }

    public /* synthetic */ C3947(C3932 c3932, int i, CommentBean commentBean) {
        this.f580 = c3932;
        this.f581 = i;
        this.f7621 = commentBean;
    }

    @Override // com.kongzue.dialogx.interfaces.OnMenuItemClickListener
    public final native boolean onClick(Object obj, CharSequence charSequence, int i);
}
