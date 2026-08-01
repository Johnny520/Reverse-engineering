package defpackage;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class d50 {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public final ImageView d;
    public final ImageView e;

    public d50(View r2) {
        this.a = (TextView) r2.findViewById(R.id.text1);
        this.b = (TextView) r2.findViewById(R.id.text2);
        this.c = (ImageView) r2.findViewById(R.id.icon1);
        this.d = (ImageView) r2.findViewById(R.id.icon2);
        this.e = (ImageView) r2.findViewById(com.ljx.wechatmod.R.id.edit_query);
    }
}
