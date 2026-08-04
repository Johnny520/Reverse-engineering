package yyds;

import android.widget.CompoundButton;
import com.android.NativeUtil;

/* JADX INFO: renamed from: yyds.ᛸᛱᛷᛳ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1703 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f8638;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f8639;

    static {
        NativeUtil.classesInit0(99);
    }

    public /* synthetic */ C1703(int i, Object obj) {
        this.f8638 = i;
        this.f8639 = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final native void onCheckedChanged(CompoundButton compoundButton, boolean z);
}
