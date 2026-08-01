package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class b2 {
    public final ContextThemeWrapper a;
    public final LayoutInflater b;
    public Drawable c;
    public CharSequence d;
    public View e;
    public lu f;
    public Object g;
    public DialogInterface.OnClickListener h;
    public boolean i;
    public int j;

    public b2(ContextThemeWrapper r2) {
        this.j = -1;
        this.a = r2;
        this.b = (LayoutInflater) r2.getSystemService("layout_inflater");
    }
}
