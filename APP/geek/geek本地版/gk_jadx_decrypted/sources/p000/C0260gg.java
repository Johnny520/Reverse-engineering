package p000;

import com.github.megatronking.stringfog.Base64;
import java.io.File;
import java.util.Iterator;

/* JADX INFO: renamed from: gg */
/* JADX INFO: loaded from: classes.dex */
public final class C0260gg implements i20 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2124a;

    /* JADX INFO: renamed from: b */
    public final Object f2125b;

    /* JADX INFO: renamed from: c */
    public final Object f2126c;

    public C0260gg(File file) {
        this.f2124a = 1;
        this.f2125b = file;
        this.f2126c = EnumC0301hk.f2281a;
    }

    @Override // p000.i20
    public final Iterator iterator() {
        switch (this.f2124a) {
            case Base64.DEFAULT /* 0 */:
                return new C0223fg(this);
            default:
                return new C0227fk(this);
        }
    }

    public C0260gg(CharSequence charSequence, C0559oh c0559oh) {
        this.f2124a = 0;
        AbstractC0346ip.m1503o("input", charSequence);
        this.f2125b = charSequence;
        this.f2126c = c0559oh;
    }
}
