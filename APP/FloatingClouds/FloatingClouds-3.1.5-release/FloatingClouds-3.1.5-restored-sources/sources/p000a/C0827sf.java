package p000a;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import p000a.C0251Ne;
import p000a.C0901wd;

/* JADX INFO: renamed from: a.sf */
/* JADX INFO: loaded from: classes.dex */
public final class C0827sf implements InterfaceC0269Oe {
    @Override // p000a.InterfaceC0269Oe
    /* JADX INFO: renamed from: a */
    public final C0251Ne.a mo750a(Activity activity, View view, Class<?> cls) {
        Object objM2206a;
        CharSequence text;
        String string;
        C0251Ne.a aVar = C0251Ne.a.f861c;
        if (view == null) {
            return aVar;
        }
        try {
            C0789qf.f3115a.getClass();
            objM2206a = C0789qf.m1844a(activity, view);
        } catch (Throwable th) {
            objM2206a = C0920xd.m2206a(th);
        }
        if (objM2206a instanceof C0901wd.a) {
            objM2206a = null;
        }
        TextView textView = (TextView) objM2206a;
        if (textView == null || !textView.isAttachedToWindow() || textView.getVisibility() != 0 || (text = textView.getText()) == null || (string = text.toString()) == null) {
            return aVar;
        }
        C0789qf.f3115a.getClass();
        return C0789qf.f3116b.contains(string) ? C0251Ne.a.f859a : !C0034Be.m101P(string) ? C0251Ne.a.f860b : aVar;
    }

    @Override // p000a.InterfaceC0269Oe
    /* JADX INFO: renamed from: b */
    public final String mo751b() {
        return "titleText";
    }
}
