package p000;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: eo */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0173eo implements f40 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2521h;

    /* JADX INFO: renamed from: i */
    public final Object f2522i;

    public /* synthetic */ C0173eo(int i, Object obj) {
        this.f2521h = i;
        this.f2522i = obj;
    }

    @Override // p000.f40
    /* JADX INFO: renamed from: a */
    public final Class mo1371a() {
        switch (this.f2521h) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.f2522i.getClass();
        }
    }

    @Override // p000.f40
    /* JADX INFO: renamed from: b */
    public final void mo1372b() {
        int i = this.f2521h;
    }

    @Override // p000.f40
    /* JADX INFO: renamed from: c */
    public final void mo1373c(i32 i32Var, e40 e40Var) {
        int i = this.f2521h;
        Object obj = this.f2522i;
        switch (i) {
            case 0:
                try {
                    e40Var.mo636h(AbstractC0431lo.m2950a((File) obj));
                } catch (IOException e) {
                    if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                        Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                    }
                    e40Var.mo635d(e);
                    return;
                }
                break;
            default:
                e40Var.mo636h(obj);
                break;
        }
    }

    @Override // p000.f40
    public final void cancel() {
        int i = this.f2521h;
    }

    @Override // p000.f40
    /* JADX INFO: renamed from: e */
    public final int mo1374e() {
        switch (this.f2521h) {
        }
        return 1;
    }

    /* JADX INFO: renamed from: d */
    private final void m1367d() {
    }

    /* JADX INFO: renamed from: f */
    private final void m1368f() {
    }

    /* JADX INFO: renamed from: g */
    private final void m1369g() {
    }

    /* JADX INFO: renamed from: h */
    private final void m1370h() {
    }
}
