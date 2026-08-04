package yyds;

import android.app.Activity;
import android.content.Context;
import com.android.NativeUtil;
import com.kongzue.dialogx.interfaces.AbstractC0041;

/* JADX INFO: renamed from: yyds.ᛵᛱᲈᛱ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1027 implements InterfaceC0251 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Activity f4677;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ Context f4678;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ String f4679;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ String f4680;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ C1779 f4681;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ String f4682;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ long f4683;

    static {
        NativeUtil.classesInit0(31);
    }

    public /* synthetic */ C1027(C1779 c1779, long j, String str, String str2, String str3, Activity activity, Context context) {
        this.f4681 = c1779;
        this.f4683 = j;
        this.f4679 = str;
        this.f4682 = str2;
        this.f4680 = str3;
        this.f4677 = activity;
        this.f4678 = context;
    }

    @Override // yyds.InterfaceC0251
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final native void mo901(AbstractC0041 abstractC0041);
}
