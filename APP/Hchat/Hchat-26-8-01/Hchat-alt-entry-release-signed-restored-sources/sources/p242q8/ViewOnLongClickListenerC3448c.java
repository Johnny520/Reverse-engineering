package p242q8;

import android.content.Context;
import android.view.View;
import p007a7.AbstractC0018a;
import p025bc.AbstractC0255e;

/* JADX INFO: renamed from: q8.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnLongClickListenerC3448c implements View.OnLongClickListener {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (view != null) {
            try {
                Context context = view.getContext();
                if (context != null) {
                    AbstractC0018a.m231S(context, null, false);
                    return true;
                }
            } catch (Throwable th2) {
                AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:SettingsInjector] [PlusLongPress] 长按打开失败: "), th2);
                return false;
            }
        }
        return false;
    }
}
