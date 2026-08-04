package yyds;

import android.content.Context;
import android.content.DialogInterface;
import com.android.NativeUtil;
import java.util.Map;

/* JADX INFO: renamed from: yyds.ᲀᛷᛶᛸ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC2035 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f10139;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f10140;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f10141;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ Object f10142;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f10143;

    static {
        NativeUtil.classesInit0(5);
    }

    public /* synthetic */ DialogInterfaceOnClickListenerC2035(C0172 c0172, C2086 c2086, Context context, Map map) {
        this.f10141 = 1;
        this.f10139 = c0172;
        this.f10142 = c2086;
        this.f10143 = context;
        this.f10140 = map;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final native void onClick(DialogInterface dialogInterface, int i);

    public /* synthetic */ DialogInterfaceOnClickListenerC2035(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f10141 = i;
        this.f10143 = obj;
        this.f10139 = obj2;
        this.f10142 = obj3;
        this.f10140 = obj4;
    }
}
