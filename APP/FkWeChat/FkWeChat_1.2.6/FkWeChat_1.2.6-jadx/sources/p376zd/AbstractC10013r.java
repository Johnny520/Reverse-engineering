package p376zd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okio.AbstractC5795a;
import okio.C5799e;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1052o0;
import p185m8.AbstractC5067b0;
import sb.AbstractC7294t;
import sb.InterfaceC7282h;

/* JADX INFO: renamed from: zd.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC10013r extends AbstractC5795a {
    private final AbstractC5795a delegate;

    public AbstractC10013r(AbstractC5795a abstractC5795a) {
        abstractC5795a.getClass();
        this.delegate = abstractC5795a;
    }

    /* JADX INFO: renamed from: c */
    public static C5799e m38828c(AbstractC10013r abstractC10013r, C5799e c5799e) {
        c5799e.getClass();
        return abstractC10013r.onPathResult(c5799e, "listRecursively");
    }

    @Override // okio.AbstractC5795a
    public InterfaceC10020u0 appendingSink(C5799e c5799e, boolean z10) {
        c5799e.getClass();
        return this.delegate.appendingSink(onPathParameter(c5799e, "appendingSink", "file"), z10);
    }

    @Override // okio.AbstractC5795a
    public void atomicMove(C5799e c5799e, C5799e c5799e2) {
        c5799e.getClass();
        c5799e2.getClass();
        this.delegate.atomicMove(onPathParameter(c5799e, "atomicMove", "source"), onPathParameter(c5799e2, "atomicMove", "target"));
    }

    @Override // okio.AbstractC5795a
    public C5799e canonicalize(C5799e c5799e) {
        c5799e.getClass();
        return onPathResult(this.delegate.canonicalize(onPathParameter(c5799e, "canonicalize", "path")), "canonicalize");
    }

    @Override // okio.AbstractC5795a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // okio.AbstractC5795a
    public void createDirectory(C5799e c5799e, boolean z10) {
        c5799e.getClass();
        this.delegate.createDirectory(onPathParameter(c5799e, "createDirectory", "dir"), z10);
    }

    @Override // okio.AbstractC5795a
    public void createSymlink(C5799e c5799e, C5799e c5799e2) {
        c5799e.getClass();
        c5799e2.getClass();
        this.delegate.createSymlink(onPathParameter(c5799e, "createSymlink", "source"), onPathParameter(c5799e2, "createSymlink", "target"));
    }

    public final AbstractC5795a delegate() {
        return this.delegate;
    }

    @Override // okio.AbstractC5795a
    public void delete(C5799e c5799e, boolean z10) {
        c5799e.getClass();
        this.delegate.delete(onPathParameter(c5799e, "delete", "path"), z10);
    }

    @Override // okio.AbstractC5795a
    public List<C5799e> list(C5799e c5799e) {
        c5799e.getClass();
        List list = this.delegate.list(onPathParameter(c5799e, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((C5799e) it.next(), "list"));
        }
        AbstractC5067b0.m20481C(arrayList);
        return arrayList;
    }

    @Override // okio.AbstractC5795a
    public List<C5799e> listOrNull(C5799e c5799e) {
        c5799e.getClass();
        List listListOrNull = this.delegate.listOrNull(onPathParameter(c5799e, "listOrNull", "dir"));
        if (listListOrNull == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listListOrNull.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((C5799e) it.next(), "listOrNull"));
        }
        AbstractC5067b0.m20481C(arrayList);
        return arrayList;
    }

    @Override // okio.AbstractC5795a
    public InterfaceC7282h listRecursively(C5799e c5799e, boolean z10) {
        c5799e.getClass();
        return AbstractC7294t.m28901I(this.delegate.listRecursively(onPathParameter(c5799e, "listRecursively", "dir"), z10), new InterfaceC0184l() { // from class: zd.q
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return AbstractC10013r.m38828c(this.f33614q, (C5799e) obj);
            }
        });
    }

    @Override // okio.AbstractC5795a
    public C10009p metadataOrNull(C5799e c5799e) {
        c5799e.getClass();
        C10009p c10009pMetadataOrNull = this.delegate.metadataOrNull(onPathParameter(c5799e, "metadataOrNull", "path"));
        if (c10009pMetadataOrNull == null) {
            return null;
        }
        return c10009pMetadataOrNull.m38818d() == null ? c10009pMetadataOrNull : C10009p.m38815b(c10009pMetadataOrNull, false, false, onPathResult(c10009pMetadataOrNull.m38818d(), "metadataOrNull"), null, null, null, null, null, 251, null);
    }

    public C5799e onPathParameter(C5799e c5799e, String str, String str2) {
        c5799e.getClass();
        str.getClass();
        str2.getClass();
        return c5799e;
    }

    public C5799e onPathResult(C5799e c5799e, String str) {
        c5799e.getClass();
        str.getClass();
        return c5799e;
    }

    @Override // okio.AbstractC5795a
    public AbstractC10007o openReadOnly(C5799e c5799e) {
        c5799e.getClass();
        return this.delegate.openReadOnly(onPathParameter(c5799e, "openReadOnly", "file"));
    }

    @Override // okio.AbstractC5795a
    public AbstractC10007o openReadWrite(C5799e c5799e, boolean z10, boolean z11) {
        c5799e.getClass();
        return this.delegate.openReadWrite(onPathParameter(c5799e, "openReadWrite", "file"), z10, z11);
    }

    @Override // okio.AbstractC5795a
    public InterfaceC10020u0 sink(C5799e c5799e, boolean z10) {
        c5799e.getClass();
        return this.delegate.sink(onPathParameter(c5799e, "sink", "file"), z10);
    }

    @Override // okio.AbstractC5795a
    public InterfaceC10024w0 source(C5799e c5799e) {
        c5799e.getClass();
        return this.delegate.source(onPathParameter(c5799e, "source", "file"));
    }

    public String toString() {
        return AbstractC1052o0.m3807b(getClass()).mo3794w() + '(' + this.delegate + ')';
    }
}
