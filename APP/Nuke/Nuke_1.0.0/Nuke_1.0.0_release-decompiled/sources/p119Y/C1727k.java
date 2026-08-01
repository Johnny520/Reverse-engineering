package p119Y;

import com.bumptech.glide.AbstractC1926h;
import java.util.Iterator;
import java.util.regex.Matcher;
import me.dartcv.nuke.BuildConfig;
import p000A.C0049a;
import p007B0.C0173F;
import p061L2.AbstractC0961a;
import p061L2.C0979s;
import p117X2.AbstractC1665j;
import p132a3.C1804d;
import p143c3.C1904f;
import p143c3.C1910l;
import p149d3.C1975c;

/* JADX INFO: renamed from: Y.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1727k extends AbstractC0961a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5974d;

    /* JADX INFO: renamed from: e */
    public final Object f5975e;

    public /* synthetic */ C1727k(int i5, Object obj) {
        this.f5974d = i5;
        this.f5975e = obj;
    }

    @Override // p061L2.AbstractC0961a
    /* JADX INFO: renamed from: a */
    public final int mo1974a() {
        switch (this.f5974d) {
            case 0:
                C1719c c1719c = (C1719c) this.f5975e;
                c1719c.getClass();
                return c1719c.f5960e;
            default:
                return ((Matcher) ((C0173F) this.f5975e).f612e).groupCount() + 1;
        }
    }

    /* JADX INFO: renamed from: b */
    public C1975c m3059b(int i5) {
        Matcher matcher = (Matcher) ((C0173F) this.f5975e).f612e;
        C1804d c1804dM3557J = AbstractC1926h.m3557J(matcher.start(i5), matcher.end(i5));
        if (c1804dM3557J.f6140d < 0) {
            return null;
        }
        String strGroup = matcher.group(i5);
        AbstractC1665j.m2984d(strGroup, "group(...)");
        return new C1975c(strGroup, c1804dM3557J);
    }

    @Override // p061L2.AbstractC0961a, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f5974d) {
            case 0:
                return ((C1719c) this.f5975e).containsValue(obj);
            default:
                if (obj == null ? true : obj instanceof C1975c) {
                    return super.contains((C1975c) obj);
                }
                return false;
        }
    }

    @Override // p061L2.AbstractC0961a, java.util.Collection
    public boolean isEmpty() {
        switch (this.f5974d) {
            case BuildConfig.VERSION_CODE /* 1 */:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f5974d) {
            case 0:
                C1728l c1728l = ((C1719c) this.f5975e).f5959d;
                AbstractC1729m[] abstractC1729mArr = new AbstractC1729m[8];
                for (int i5 = 0; i5 < 8; i5++) {
                    abstractC1729mArr[i5] = new C1730n(2);
                }
                return new C1726j(c1728l, abstractC1729mArr);
            default:
                return new C1910l(new C1904f(new C0979s(0, new C1804d(0, size() - 1, 1)), new C0049a(18, this), 2));
        }
    }
}
