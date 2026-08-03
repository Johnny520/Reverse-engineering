package com.yuexin.panel.panel.voice.items.base;

import Yue.InterfaceC5615;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.LinearLayout;
import com.nmmedit.protect.NativeUtil;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC5615
public abstract class MainItems {
    static {
        NativeUtil.classesInit0(909);
    }

    public abstract View buildView(Context context, int i, String str);

    public abstract HashMap<String, List> getInitMap();

    public native void onActivityResult(Intent intent, List<Uri> list, boolean z);

    public abstract void onBuild(View view, Context context, LinearLayout linearLayout);

    public native void onLast(Context context, LinearLayout linearLayout, String str);

    public native void onMore(Context context, LinearLayout linearLayout, String str);

    public native void onNext(Context context, LinearLayout linearLayout, String str);

    public abstract void onNextItem(Context context, LinearLayout linearLayout);

    public native void onSearch(String str, Context context, LinearLayout linearLayout);
}
