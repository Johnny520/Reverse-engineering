package yyds;

import android.view.View;
import android.view.ViewGroup;
import com.kongzue.dialogx.interfaces.AbstractC0041;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: yyds.ᛶᛳᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1304 implements Runnable {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0041 f5967;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f5968;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ View f5969;

    public /* synthetic */ RunnableC1304(View view, AbstractC0041 abstractC0041, int i) {
        this.f5968 = i;
        this.f5969 = view;
        this.f5967 = abstractC0041;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5968;
        View view = this.f5969;
        AbstractC0041 abstractC0041 = this.f5967;
        switch (i) {
            case 0:
                if (view.getParent() == abstractC0041.m278()) {
                    AbstractC0041.m269(((AbstractC0041) view.getTag()).mo283().concat("已处于显示状态，请勿重复执行 show() 指令。"));
                } else {
                    if (view.getParent() != null) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    abstractC0041.m278().addView(view);
                }
                break;
            default:
                if (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) view.getParent()).removeView(view);
                } else if (abstractC0041.m278() != null) {
                    abstractC0041.m278().removeView(view);
                }
                if (AbstractC0041.f392 != null) {
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(AbstractC0041.f392);
                    for (int size = copyOnWriteArrayList.size() - 1; size >= 0; size--) {
                        AbstractC0041 abstractC00412 = (AbstractC0041) copyOnWriteArrayList.get(size);
                        if (abstractC00412.m282() == AbstractC0041.m264() && abstractC00412.f407 && abstractC00412.m279() != null) {
                            View viewFindViewById = abstractC00412.m279().findViewById(R.id.box_root);
                            if ((viewFindViewById instanceof DialogXBaseRelativeLayout) && ((DialogXBaseRelativeLayout) viewFindViewById).f421) {
                                viewFindViewById.requestFocus();
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
