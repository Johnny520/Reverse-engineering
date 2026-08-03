package p000a;

import android.graphics.Rect;
import android.widget.TextView;
import java.util.ArrayList;

/* JADX INFO: renamed from: a.Fc */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0105Fc implements InterfaceC0064D7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float f362a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f363b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f364c;

    public /* synthetic */ C0105Fc(float f, int i, ArrayList arrayList) {
        this.f362a = f;
        this.f363b = i;
        this.f364c = arrayList;
    }

    @Override // p000a.InterfaceC0064D7
    /* JADX INFO: renamed from: f */
    public final Object mo53f(Object obj) {
        TextView textView = (TextView) obj;
        C0631i9.m1482e(textView, "v");
        if (textView.getVisibility() == 0 && textView.getHeight() > 0 && textView.getTextSize() >= this.f362a) {
            CharSequence text = textView.getText();
            int length = text != null ? text.length() : 0;
            if (1 <= length && length < 7) {
                Rect rect = new Rect();
                if (textView.getGlobalVisibleRect(rect) && rect.top < this.f363b) {
                    this.f364c.add(textView);
                }
            }
        }
        return C0413Wf.f1577a;
    }
}
