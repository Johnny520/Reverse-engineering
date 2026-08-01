package androidx.fragment.app;

import java.util.concurrent.CopyOnWriteArrayList;
import p064f0.C0556b;

/* JADX INFO: renamed from: androidx.fragment.app.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0443u {

    /* JADX INFO: renamed from: a */
    public boolean f1413a;

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList f1414b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f1415c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f1416d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0443u(C0556b c0556b) {
        this(true);
        this.f1415c = 1;
        this.f1416d = c0556b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0443u(boolean z2) {
        this.f1414b = new CopyOnWriteArrayList();
        this.f1413a = z2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0443u(C0448z c0448z) {
        this(false);
        this.f1415c = 0;
        this.f1416d = c0448z;
    }
}
