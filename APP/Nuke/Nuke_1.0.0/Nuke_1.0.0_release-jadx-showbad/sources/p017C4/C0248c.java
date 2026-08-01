package p017C4;

import java.util.concurrent.ConcurrentHashMap;
import me.dartcv.nuke.BuildConfig;
import p002A1.C0115D;
import p005A4.InterfaceC0161a;

/* JADX INFO: renamed from: C4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0248c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f825a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0161a f826b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0248c(int i5) {
        this.f825a = i5;
        switch (i5) {
            case BuildConfig.VERSION_CODE /* 1 */:
                this.f826b = new C0251f();
                new ConcurrentHashMap();
                new ThreadLocal();
                new C0246a();
                break;
            default:
                this.f826b = new C0115D(7);
                new ConcurrentHashMap();
                break;
        }
    }
}
