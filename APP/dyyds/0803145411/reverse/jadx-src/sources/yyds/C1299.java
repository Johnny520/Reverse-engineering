package yyds;

import com.android.NativeUtil;
import org.json.JSONObject;

/* JADX INFO: renamed from: yyds.ᛶᛳᛶᛲ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C1299 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C1186 f5954;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f5955;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f5956;

    static {
        NativeUtil.classesInit0(251);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1299(C1186 c1186, JSONObject jSONObject, InterfaceC0274 interfaceC0274, int i) {
        super(2, interfaceC0274);
        this.f5956 = i;
        this.f5954 = c1186;
        this.f5955 = jSONObject;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final native Object mo474(Object obj);

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final native InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274);

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final native Object mo511(Object obj, Object obj2);
}
