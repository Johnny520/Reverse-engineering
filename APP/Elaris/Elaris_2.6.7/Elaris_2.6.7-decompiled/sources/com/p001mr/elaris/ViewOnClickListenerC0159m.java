package com.p001mr.elaris;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import p000.AbstractC0552yb;

/* JADX INFO: renamed from: com.mr.elaris.m */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0159m implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ImageView f132a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ClassLoader f133b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnClickListenerC0159m(ImageView imageView, ClassLoader classLoader) {
        this.f132a = imageView;
        this.f133b = classLoader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ImageView imageView = this.f132a;
        if (MessageRepeater.shouldTriggerRepeat(imageView, view)) {
            Object objM1170a = AbstractC0552yb.m1170a(imageView);
            HookEntry.log("repeater trigger clicked");
            Object objMsgRecordFromAny = MessageRepeater.msgRecordFromAny(objM1170a);
            if (objMsgRecordFromAny != null) {
                MessageRepeater.logMsgDetails(objMsgRecordFromAny);
            }
            Context context = view == null ? null : view.getContext();
            if (view == null) {
                view = imageView;
            }
            MessageRepeater.scheduleAioMessageRefresh(view);
            MessageRepeater.repeatAsyncSmart(this.f133b, context, objM1170a);
        }
    }
}
