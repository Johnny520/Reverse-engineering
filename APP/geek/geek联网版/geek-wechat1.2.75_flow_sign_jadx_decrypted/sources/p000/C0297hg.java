package p000;

import com.github.megatronking.stringfog.Base64;
import java.io.File;
import java.util.Iterator;

/* JADX INFO: renamed from: hg */
/* JADX INFO: loaded from: classes.dex */
public final class C0297hg implements p20 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2221a;

    /* JADX INFO: renamed from: b */
    public final Object f2222b;

    /* JADX INFO: renamed from: c */
    public final Object f2223c;

    public C0297hg(File file) {
        this.f2221a = 1;
        this.f2222b = file;
        this.f2223c = EnumC0377jk.f2724a;
    }

    @Override // p000.p20
    public final Iterator iterator() {
        switch (this.f2221a) {
            case Base64.DEFAULT /* 0 */:
                return new C0260gg(this);
            default:
                return new C0301hk(this);
        }
    }

    public C0297hg(CharSequence charSequence, C0633qh c0633qh) {
        this.f2221a = 0;
        AbstractC0493mp.m1857g("input", charSequence);
        this.f2222b = charSequence;
        this.f2223c = c0633qh;
    }
}
