package androidx.appcompat.widget;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.InterfaceC8753;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class FitWindowsFrameLayout extends FrameLayout implements InterfaceC8753 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public InterfaceC8753.InterfaceC1630 f26236;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FitWindowsFrameLayout(@InterfaceC6391 Context context) {
        super(context);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        InterfaceC8753.InterfaceC1630 interfaceC1630 = this.f26236;
        if (interfaceC1630 != null) {
            interfaceC1630.mo4614(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.InterfaceC8753
    public void setOnFitSystemWindowsListener(InterfaceC8753.InterfaceC1630 interfaceC1630) {
        this.f26236 = interfaceC1630;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public FitWindowsFrameLayout(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
