package androidx.recyclerview.widget;

import Yue.InterfaceC5736;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.C8946;
import androidx.recyclerview.widget.C8961;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8947<T> {

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final Executor f30090 = new ExecutorC8950();

    /* JADX INFO: renamed from: ۥ */
    public final InterfaceC5736 f3920;

    /* JADX INFO: renamed from: ۥ۟ */
    public final C8946<T> f3921;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Executor f30091;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final List<InterfaceC1762<T>> f30092;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6490
    public List<T> f30093;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6391
    public List<T> f30094;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int f30095;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟$ۥ */
    public class RunnableC1761 implements Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ List f30096;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ List f30097;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ int f30098;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ Runnable f30099;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟$ۥ$ۥ, reason: contains not printable characters */
        public class C8948 extends C8961.AbstractC1768 {
            public C8948() {
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟ */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.C8961.AbstractC1768
            /* JADX INFO: renamed from: ۥ */
            public boolean mo4972(int i, int i2) {
                Object obj = RunnableC1761.this.f30096.get(i);
                Object obj2 = RunnableC1761.this.f30097.get(i2);
                if (obj != null && obj2 != null) {
                    return C8947.this.f3921.m4967().m4984(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟ */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.C8961.AbstractC1768
            /* JADX INFO: renamed from: ۥ۟ */
            public boolean mo4973(int i, int i2) {
                Object obj = RunnableC1761.this.f30096.get(i);
                Object obj2 = RunnableC1761.this.f30097.get(i2);
                return (obj == null || obj2 == null) ? obj == null && obj2 == null : C8947.this.f3921.m4967().m4985(obj, obj2);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟ */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.C8961.AbstractC1768
            @InterfaceC6490
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public Object mo30527(int i, int i2) {
                Object obj = RunnableC1761.this.f30096.get(i);
                Object obj2 = RunnableC1761.this.f30097.get(i2);
                if (obj == null || obj2 == null) {
                    throw new AssertionError();
                }
                return C8947.this.f3921.m4967().m30580(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.C8961.AbstractC1768
            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public int mo30528() {
                return RunnableC1761.this.f30097.size();
            }

            @Override // androidx.recyclerview.widget.C8961.AbstractC1768
            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public int mo30529() {
                return RunnableC1761.this.f30096.size();
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟$ۥ$ۥ۟, reason: contains not printable characters */
        public class RunnableC8949 implements Runnable {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ C8961.C8962 f30101;

            public RunnableC8949(C8961.C8962 c8962) {
                this.f30101 = c8962;
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC1761 runnableC1761 = RunnableC1761.this;
                C8947 c8947 = C8947.this;
                if (c8947.f30095 == runnableC1761.f30098) {
                    c8947.m30522(runnableC1761.f30097, this.f30101, runnableC1761.f30099);
                }
            }
        }

        public RunnableC1761(List list, List list2, int i, Runnable runnable) {
            this.f30096 = list;
            this.f30097 = list2;
            this.f30098 = i;
            this.f30099 = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            C8947.this.f30091.execute(new RunnableC8949(C8961.m4979(new C8948())));
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟$ۥ۟ */
    public interface InterfaceC1762<T> {
        /* JADX INFO: renamed from: ۥ */
        void mo4974(@InterfaceC6391 List<T> list, @InterfaceC6391 List<T> list2);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟$ۥ۟۟, reason: contains not printable characters */
    public static class ExecutorC8950 implements Executor {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final Handler f30103 = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(@InterfaceC6391 Runnable runnable) {
            this.f30103.post(runnable);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8947(@InterfaceC6391 RecyclerView.AbstractC8909 abstractC8909, @InterfaceC6391 C8961.AbstractC8963<T> abstractC8963) {
        this(new C1759(abstractC8909), new C8946.C1760(abstractC8963).m4968());
    }

    /* JADX INFO: renamed from: ۥ */
    public void m4970(@InterfaceC6391 InterfaceC1762<T> interfaceC1762) {
        this.f30092.add(interfaceC1762);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟ */
    public List<T> m4971() {
        return this.f30094;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m30522(@InterfaceC6391 List<T> list, @InterfaceC6391 C8961.C8962 c8962, @InterfaceC6490 Runnable runnable) {
        List<T> list2 = this.f30094;
        this.f30093 = list;
        this.f30094 = Collections.unmodifiableList(list);
        c8962.m30573(this.f3920);
        m30523(list2, runnable);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m30523(@InterfaceC6391 List<T> list, @InterfaceC6490 Runnable runnable) {
        Iterator<InterfaceC1762<T>> it = this.f30092.iterator();
        while (it.hasNext()) {
            it.next().mo4974(list, this.f30094);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m30524(@InterfaceC6391 InterfaceC1762<T> interfaceC1762) {
        this.f30092.remove(interfaceC1762);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m30525(@InterfaceC6490 List<T> list) {
        m30526(list, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m30526(@InterfaceC6490 List<T> list, @InterfaceC6490 Runnable runnable) {
        int i = this.f30095 + 1;
        this.f30095 = i;
        List<T> list2 = this.f30093;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.f30094;
        if (list == null) {
            int size = list2.size();
            this.f30093 = null;
            this.f30094 = Collections.emptyList();
            this.f3920.mo9454(0, size);
            m30523(list3, runnable);
            return;
        }
        if (list2 != null) {
            this.f3921.m4966().execute(new RunnableC1761(list2, list, i, runnable));
            return;
        }
        this.f30093 = list;
        this.f30094 = Collections.unmodifiableList(list);
        this.f3920.mo596(0, list.size());
        m30523(list3, runnable);
    }

    public C8947(@InterfaceC6391 InterfaceC5736 interfaceC5736, @InterfaceC6391 C8946<T> c8946) {
        this.f30092 = new CopyOnWriteArrayList();
        this.f30094 = Collections.emptyList();
        this.f3920 = interfaceC5736;
        this.f3921 = c8946;
        if (c8946.m30520() != null) {
            this.f30091 = c8946.m30520();
        } else {
            this.f30091 = f30090;
        }
    }
}
