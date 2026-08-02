package p000;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.ConnectivityManager;
import java.io.InputStream;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class r80 implements kh1, bq0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f9425h;

    /* JADX INFO: renamed from: i */
    public final Context f9426i;

    public /* synthetic */ r80(Context context, int i) {
        this.f9425h = i;
        this.f9426i = context;
    }

    @Override // p000.bq0
    public Object get() {
        return (ConnectivityManager) this.f9426i.getSystemService("connectivity");
    }

    @Override // p000.kh1
    /* JADX INFO: renamed from: q */
    public jh1 mo1330q(kj1 kj1Var) {
        int i = this.f9425h;
        Context context = this.f9426i;
        switch (i) {
            case 0:
                return new C0733tg(context, this);
            case 1:
                return new C0733tg(context, this);
            case 2:
                return new C0733tg(context, this);
            case 3:
            default:
                return new C0733tg(context, kj1Var.m2708g(Integer.class, InputStream.class));
            case 4:
                return new uf1(context, 0);
            case 5:
                return new uf1(context, 1);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return new uf1(context, 2);
            case 7:
                return new C0733tg(context, kj1Var.m2708g(Integer.class, AssetFileDescriptor.class));
        }
    }
}
