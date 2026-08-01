package com.p001mr.elaris;

import android.view.View;
import p000.AbstractC0219fc;

/* JADX INFO: renamed from: com.mr.elaris.v */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0168v implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f157a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ClassLoader f158b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f159c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f160d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnClickListenerC0168v(Object obj, ClassLoader classLoader, Object obj2, boolean z) {
        this.f157a = obj;
        this.f158b = classLoader;
        this.f159c = obj2;
        this.f160d = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC0219fc.m393f()) {
            HookEntry.log("repeater long press menu view fallback clicked");
            AbstractC0219fc.f273o = System.currentTimeMillis() + 650;
            try {
                view.cancelPendingInputEvents();
            } catch (Throwable unused) {
            }
            try {
                view.setEnabled(false);
            } catch (Throwable unused2) {
            }
            try {
                view.setClickable(false);
            } catch (Throwable unused3) {
            }
            AbstractC0219fc.m389b(view, this.f157a);
            MessageRepeater.repeatFromLongPressMenu(this.f158b, HookEntry.hostContext(), this.f159c, this.f160d);
        }
    }
}
