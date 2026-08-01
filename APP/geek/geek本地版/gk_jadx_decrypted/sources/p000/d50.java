package p000;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class d50 {

    /* JADX INFO: renamed from: a */
    public final TextView f1380a;

    /* JADX INFO: renamed from: b */
    public final TextView f1381b;

    /* JADX INFO: renamed from: c */
    public final ImageView f1382c;

    /* JADX INFO: renamed from: d */
    public final ImageView f1383d;

    /* JADX INFO: renamed from: e */
    public final ImageView f1384e;

    public d50(View view) {
        this.f1380a = (TextView) view.findViewById(R.id.text1);
        this.f1381b = (TextView) view.findViewById(R.id.text2);
        this.f1382c = (ImageView) view.findViewById(R.id.icon1);
        this.f1383d = (ImageView) view.findViewById(R.id.icon2);
        this.f1384e = (ImageView) view.findViewById(com.ljx.wechatmod.R.id.edit_query);
    }
}
