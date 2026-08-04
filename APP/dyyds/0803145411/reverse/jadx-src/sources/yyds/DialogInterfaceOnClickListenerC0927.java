package yyds;

import android.content.DialogInterface;
import com.android.NativeUtil;

/* JADX INFO: renamed from: yyds.ᛴᲀᛱ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0927 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f4245;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f4246;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ Object f4247;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f4248;

    static {
        NativeUtil.classesInit0(236);
    }

    public /* synthetic */ DialogInterfaceOnClickListenerC0927(Object obj, Object obj2, Object obj3, int i) {
        this.f4246 = i;
        this.f4248 = obj;
        this.f4245 = obj2;
        this.f4247 = obj3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final native void onClick(DialogInterface dialogInterface, int i);
}
