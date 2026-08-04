package yyds;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: yyds.ᲀᲁᛴᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC2087 implements Callable {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f10359;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f10360;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ String f10361;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ Context f10362;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ int f10363;

    public /* synthetic */ CallableC2087(String str, Context context, Object obj, int i, int i2) {
        this.f10360 = i2;
        this.f10361 = str;
        this.f10362 = context;
        this.f10359 = obj;
        this.f10363 = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f10360;
        int i2 = this.f10363;
        Object obj = this.f10359;
        Context context = this.f10362;
        String str = this.f10361;
        switch (i) {
            case 0:
                return AbstractC2672.m4764(str, context, List.of((C1396) obj), i2);
            default:
                try {
                    return AbstractC2672.m4764(str, context, (ArrayList) obj, i2);
                } catch (Throwable unused) {
                    return new C2246(-3);
                }
        }
    }
}
