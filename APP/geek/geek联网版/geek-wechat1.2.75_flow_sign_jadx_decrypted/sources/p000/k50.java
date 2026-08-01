package p000;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class k50 {

    /* JADX INFO: renamed from: a */
    public final TextView f2780a;

    /* JADX INFO: renamed from: b */
    public final TextView f2781b;

    /* JADX INFO: renamed from: c */
    public final ImageView f2782c;

    /* JADX INFO: renamed from: d */
    public final ImageView f2783d;

    /* JADX INFO: renamed from: e */
    public final ImageView f2784e;

    public k50(View view) {
        this.f2780a = (TextView) view.findViewById(R.id.text1);
        this.f2781b = (TextView) view.findViewById(R.id.text2);
        this.f2782c = (ImageView) view.findViewById(R.id.icon1);
        this.f2783d = (ImageView) view.findViewById(R.id.icon2);
        this.f2784e = (ImageView) view.findViewById(com.ljx.wechatmod.R.id.edit_query);
    }
}
