package p077P0;

import p112W2.InterfaceC1603e;

/* JADX INFO: renamed from: P0.v */
/* JADX INFO: loaded from: classes.dex */
public final class C1135v {

    /* JADX INFO: renamed from: a */
    public final String f3767a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1603e f3768b;

    /* JADX INFO: renamed from: c */
    public final boolean f3769c;

    public C1135v(String str, InterfaceC1603e interfaceC1603e) {
        this.f3767a = str;
        this.f3768b = interfaceC1603e;
    }

    public final String toString() {
        return "AccessibilityKey: " + this.f3767a;
    }

    public /* synthetic */ C1135v(String str) {
        this(str, C1123j.f3670y);
    }

    public C1135v(String str, int i5) {
        this(str);
        this.f3769c = true;
    }

    public C1135v(String str, boolean z5, InterfaceC1603e interfaceC1603e) {
        this(str, interfaceC1603e);
        this.f3769c = z5;
    }
}
