package yyds;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.android.NativeUtil;
import com.kongzue.dialogx.interfaces.AbstractC0041;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: yyds.ᲈᛷᛳᛴ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C2698 extends AbstractC1865 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Context f13250;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ Aweme f13251;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f13252;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C2585 f13253;

    static {
        NativeUtil.classesInit0(232);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2698(Context context, Aweme aweme, C2585 c2585, LinearLayout linearLayout, int i) {
        super(linearLayout);
        this.f13252 = i;
        this.f13250 = context;
        this.f13251 = aweme;
        this.f13253 = c2585;
    }

    @Override // yyds.AbstractC1865
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final native void mo890(AbstractC0041 abstractC0041, View view);
}
