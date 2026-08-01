package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p001mr.elaris.HookEntry;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: x2 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0527x2 implements InterfaceC0286jc {

    /* JADX INFO: renamed from: a */
    public final Object f1027a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0527x2() {
        this.f1027a = new ArrayList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0286jc
    /* JADX INFO: renamed from: a */
    public boolean mo230a() {
        View view = (View) this.f1027a;
        if (AbstractC0219fc.m393f()) {
            return view == null || AbstractC0219fc.m397j(HookEntry.topActivity()) == view;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't wrap try/catch for region: R(8:64|12|(9:18|(1:20)|(1:22)|23|(1:26)|(1:29)|(0)(1:44)|45|(1:75)(6:48|62|49|70|(1:55)|77))(1:17)|66|33|(3:60|40|(2:42|(0)))(2:37|(0)(0))|45|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m1130b(View view, int i, Set set) {
        int iMin;
        CharSequence text;
        ArrayList arrayList = (ArrayList) this.f1027a;
        if (view == null || i > 8 || arrayList.size() >= 96 || set == null || !set.add(view)) {
            return;
        }
        if (view.getVisibility() == 0 && view.getAlpha() > 0.01f) {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width <= 0) {
                width = view.getMeasuredWidth();
            }
            if (height <= 0) {
                height = view.getMeasuredHeight();
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (width <= 0 && layoutParams != null) {
                width = layoutParams.width;
            }
            if (height <= 0 && layoutParams != null) {
                height = layoutParams.height;
            }
            if (width != 0 && height != 0) {
                arrayList.add(new C0536xb(view));
            }
            if (view instanceof ViewGroup) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            try {
                iMin = Math.min(viewGroup.getChildCount(), 48);
            } catch (Throwable unused) {
                iMin = 0;
            }
            for (int i2 = 0; i2 < iMin && arrayList.size() < 96; i2++) {
                m1130b(viewGroup.getChildAt(i2), i + 1, set);
            }
            return;
        }
        if (!(view instanceof TextView) || (text = ((TextView) view).getText()) == null) {
            try {
                if (view instanceof ImageView) {
                    if (((ImageView) view).getDrawable() != null) {
                    }
                }
            } catch (Throwable unused2) {
            }
        } else if (text.length() > 0) {
        }
        if (view instanceof ViewGroup) {
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [q.run():void] */
    public /* synthetic */ C0527x2(Object obj) {
        this.f1027a = obj;
    }
}
