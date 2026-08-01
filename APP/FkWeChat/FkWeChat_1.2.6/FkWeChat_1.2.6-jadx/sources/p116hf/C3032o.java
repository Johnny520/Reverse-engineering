package p116hf;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import p086ff.InterfaceC2433a;
import p086ff.InterfaceC2436d;

/* JADX INFO: renamed from: hf.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C3032o implements InterfaceC2433a {

    /* JADX INFO: renamed from: a */
    public volatile boolean f8045a = false;

    /* JADX INFO: renamed from: b */
    public final Map f8046b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    public final LinkedBlockingQueue f8047c = new LinkedBlockingQueue();

    @Override // p086ff.InterfaceC2433a
    /* JADX INFO: renamed from: a */
    public synchronized InterfaceC2436d mo8794a(String str) {
        C3031n c3031n;
        c3031n = (C3031n) this.f8046b.get(str);
        if (c3031n == null) {
            c3031n = new C3031n(str, this.f8047c, this.f8045a);
            this.f8046b.put(str, c3031n);
        }
        return c3031n;
    }

    /* JADX INFO: renamed from: b */
    public void m11206b() {
        this.f8046b.clear();
        this.f8047c.clear();
    }

    /* JADX INFO: renamed from: c */
    public LinkedBlockingQueue m11207c() {
        return this.f8047c;
    }

    /* JADX INFO: renamed from: d */
    public List m11208d() {
        return new ArrayList(this.f8046b.values());
    }

    /* JADX INFO: renamed from: e */
    public void m11209e() {
        this.f8045a = true;
    }
}
