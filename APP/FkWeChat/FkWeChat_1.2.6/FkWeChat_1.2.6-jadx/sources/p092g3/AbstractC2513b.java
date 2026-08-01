package p092g3;

import android.graphics.Paint;
import p265s1.AbstractC7105l3;
import p265s1.AbstractC7110m3;

/* JADX INFO: renamed from: g3.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2513b {
    /* JADX INFO: renamed from: a */
    public static final Paint.Cap m9019a(int i10) {
        AbstractC7105l3.a aVar = AbstractC7105l3.f23607a;
        return AbstractC7105l3.m27993e(i10, aVar.m27996a()) ? Paint.Cap.BUTT : AbstractC7105l3.m27993e(i10, aVar.m27997b()) ? Paint.Cap.ROUND : AbstractC7105l3.m27993e(i10, aVar.m27998c()) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
    }

    /* JADX INFO: renamed from: b */
    public static final Paint.Join m9020b(int i10) {
        AbstractC7110m3.a aVar = AbstractC7110m3.f23617a;
        return AbstractC7110m3.m28006e(i10, aVar.m28010b()) ? Paint.Join.MITER : AbstractC7110m3.m28006e(i10, aVar.m28011c()) ? Paint.Join.ROUND : AbstractC7110m3.m28006e(i10, aVar.m28009a()) ? Paint.Join.BEVEL : Paint.Join.MITER;
    }
}
