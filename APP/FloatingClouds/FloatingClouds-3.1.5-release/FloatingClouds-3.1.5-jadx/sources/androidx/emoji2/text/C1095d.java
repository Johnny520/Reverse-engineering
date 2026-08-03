package androidx.emoji2.text;

import androidx.emoji2.text.C1094c;
import java.util.concurrent.ThreadPoolExecutor;
import p000a.C0671kb;

/* JADX INFO: renamed from: androidx.emoji2.text.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1095d extends C1094c.h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1094c.h f4502a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ThreadPoolExecutor f4503b;

    public C1095d(C1094c.h hVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f4502a = hVar;
        this.f4503b = threadPoolExecutor;
    }

    @Override // androidx.emoji2.text.C1094c.h
    /* JADX INFO: renamed from: a */
    public final void mo2503a(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f4503b;
        try {
            this.f4502a.mo2503a(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // androidx.emoji2.text.C1094c.h
    /* JADX INFO: renamed from: b */
    public final void mo2504b(C0671kb c0671kb) {
        ThreadPoolExecutor threadPoolExecutor = this.f4503b;
        try {
            this.f4502a.mo2504b(c0671kb);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
