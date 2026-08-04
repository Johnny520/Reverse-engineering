package yyds;

import android.net.Uri;
import com.android.NativeUtil;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: yyds.ᛷᲁᛷᛷ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C1642 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public /* synthetic */ Object f8358;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public List f8359;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public int f8360;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public List f8361;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ C1186 f8362;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final /* synthetic */ Uri f8363;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public C0391 f8364;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public Exception f8365;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public int f8366;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public JSONObject f8367;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final /* synthetic */ EnumC1947 f8368;

    static {
        NativeUtil.classesInit0(42);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1642(Uri uri, InterfaceC0274 interfaceC0274, EnumC1947 enumC1947, C1186 c1186) {
        super(2, interfaceC0274);
        this.f8362 = c1186;
        this.f8368 = enumC1947;
        this.f8363 = uri;
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
