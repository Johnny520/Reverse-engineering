package p108V3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.C1945n;
import com.bumptech.glide.ComponentCallbacks2C1921c;
import com.bumptech.glide.ComponentCallbacks2C1947p;
import me.dartcv.nuke.BuildConfig;
import p056K2.C0891q;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p121Y1.C1747h;
import p121Y1.C1749j;
import p121Y1.C1755p;

/* JADX INFO: renamed from: V3.r */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1565r implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5443d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Context f5444e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f5445f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1565r(Context context, String str, int i5) {
        this.f5443d = i5;
        this.f5444e = context;
        this.f5445f = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        ImageView imageView = (ImageView) obj;
        switch (this.f5443d) {
            case 0:
                AbstractC1665j.m2985e(imageView, "imageView");
                ComponentCallbacks2C1947p componentCallbacks2C1947pM3415c = ComponentCallbacks2C1921c.m3415c(this.f5444e);
                componentCallbacks2C1947pM3415c.getClass();
                C1945n c1945nM3604B = new C1945n(componentCallbacks2C1947pM3415c.f6608d, componentCallbacks2C1947pM3415c, Drawable.class, componentCallbacks2C1947pM3415c.f6609e).m3604B(this.f5445f);
                c1945nM3604B.getClass();
                ((C1945n) c1945nM3604B.m4048s(C1755p.f6033c, new C1749j())).m3611z(imageView);
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                AbstractC1665j.m2985e(imageView, "imageView");
                ComponentCallbacks2C1947p componentCallbacks2C1947pM3415c2 = ComponentCallbacks2C1921c.m3415c(this.f5444e);
                componentCallbacks2C1947pM3415c2.getClass();
                C1945n c1945nM3604B2 = new C1945n(componentCallbacks2C1947pM3415c2.f6608d, componentCallbacks2C1947pM3415c2, Drawable.class, componentCallbacks2C1947pM3415c2.f6609e).m3604B(this.f5445f);
                c1945nM3604B2.getClass();
                ((C1945n) c1945nM3604B2.m4048s(C1755p.f6034d, new C1747h())).m3611z(imageView);
                break;
            default:
                AbstractC1665j.m2985e(imageView, "imageView");
                ComponentCallbacks2C1947p componentCallbacks2C1947pM3415c3 = ComponentCallbacks2C1921c.m3415c(this.f5444e);
                componentCallbacks2C1947pM3415c3.getClass();
                C1945n c1945nM3604B3 = new C1945n(componentCallbacks2C1947pM3415c3.f6608d, componentCallbacks2C1947pM3415c3, Drawable.class, componentCallbacks2C1947pM3415c3.f6609e).m3604B(this.f5445f);
                c1945nM3604B3.getClass();
                ((C1945n) c1945nM3604B3.m4048s(C1755p.f6033c, new C1749j())).m3611z(imageView);
                break;
        }
        return C0891q.f2780a;
    }
}
