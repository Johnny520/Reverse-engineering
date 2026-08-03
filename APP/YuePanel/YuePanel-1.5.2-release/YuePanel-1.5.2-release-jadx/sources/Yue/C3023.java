package Yue;

import Yue.InterfaceC7144;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: Yue.ۥۣ۟۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3023 extends ClickableSpan {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public static final String f4393 = "ACCESSIBILITY_CLICKABLE_SPAN_ID";

    /* JADX INFO: renamed from: ۥ */
    public final int f38;

    /* JADX INFO: renamed from: ۥ۟ */
    public final C3055 f39;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int f4394;

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public C3023(int i, @InterfaceC6391 C3055 c3055, int i2) {
        this.f38 = i;
        this.f39 = c3055;
        this.f4394 = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@InterfaceC6391 View view) {
        Bundle bundle = new Bundle();
        bundle.putInt(f4393, this.f38);
        this.f39.m6040(this.f4394, bundle);
    }
}
