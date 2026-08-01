package p179m2;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p018b3.AbstractC0954h0;
import p018b3.InterfaceInputConnectionC0935a0;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1067w;
import p166l2.C4568m2;
import p172l8.C4700i0;
import p349y0.C9508c;

/* JADX INFO: renamed from: m2.d2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4831d2 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4901r2 f14364a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0173a f14365b;

    /* JADX INFO: renamed from: c */
    public final Object f14366c = new Object();

    /* JADX INFO: renamed from: d */
    public C9508c f14367d = new C9508c(new C4568m2[16], 0);

    /* JADX INFO: renamed from: e */
    public boolean f14368e;

    /* JADX INFO: renamed from: m2.d2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0184l {
        public a() {
            super(1);
        }

        /* JADX INFO: renamed from: a */
        public final void m19324a(InterfaceInputConnectionC0935a0 interfaceInputConnectionC0935a0) {
            interfaceInputConnectionC0935a0.mo3447a();
            C9508c c9508c = C4831d2.this.f14367d;
            Object[] objArr = c9508c.f32299q;
            int iM37039l = c9508c.m37039l();
            int i10 = 0;
            while (true) {
                if (i10 >= iM37039l) {
                    i10 = -1;
                    break;
                } else if (AbstractC1061t.m3842c((C4568m2) objArr[i10], interfaceInputConnectionC0935a0)) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 >= 0) {
                C4831d2.this.f14367d.m37045r(i10);
            }
            if (C4831d2.this.f14367d.m37039l() == 0) {
                C4831d2.this.f14365b.invoke();
            }
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m19324a((InterfaceInputConnectionC0935a0) obj);
            return C4700i0.f13910a;
        }
    }

    public C4831d2(InterfaceC4901r2 interfaceC4901r2, InterfaceC0173a interfaceC0173a) {
        this.f14364a = interfaceC4901r2;
        this.f14365b = interfaceC0173a;
    }

    /* JADX INFO: renamed from: c */
    public final InputConnection m19321c(EditorInfo editorInfo) {
        synchronized (this.f14366c) {
            if (this.f14368e) {
                return null;
            }
            InterfaceInputConnectionC0935a0 interfaceInputConnectionC0935a0M3482a = AbstractC0954h0.m3482a(this.f14364a.mo17297a(editorInfo), new a());
            this.f14367d.m37029b(new C4568m2(interfaceInputConnectionC0935a0M3482a));
            return interfaceInputConnectionC0935a0M3482a;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m19322d() {
        synchronized (this.f14366c) {
            try {
                this.f14368e = true;
                C9508c c9508c = this.f14367d;
                Object[] objArr = c9508c.f32299q;
                int iM37039l = c9508c.m37039l();
                for (int i10 = 0; i10 < iM37039l; i10++) {
                    InterfaceInputConnectionC0935a0 interfaceInputConnectionC0935a0 = (InterfaceInputConnectionC0935a0) ((C4568m2) objArr[i10]).get();
                    if (interfaceInputConnectionC0935a0 != null) {
                        interfaceInputConnectionC0935a0.mo3447a();
                    }
                }
                this.f14367d.m37035h();
                C4700i0 c4700i0 = C4700i0.f13910a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m19323e() {
        return !this.f14368e;
    }
}
