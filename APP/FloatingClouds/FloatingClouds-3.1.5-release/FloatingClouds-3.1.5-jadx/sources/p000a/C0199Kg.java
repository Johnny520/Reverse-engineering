package p000a;

import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: a.Kg */
/* JADX INFO: loaded from: classes.dex */
public final class C0199Kg {

    /* JADX INFO: renamed from: c */
    public BaseInterpolator f667c;

    /* JADX INFO: renamed from: d */
    public C0726n9 f668d;

    /* JADX INFO: renamed from: e */
    public boolean f669e;

    /* JADX INFO: renamed from: b */
    public long f666b = -1;

    /* JADX INFO: renamed from: f */
    public final a f670f = new a();

    /* JADX INFO: renamed from: a */
    public final ArrayList<C0181Jg> f665a = new ArrayList<>();

    /* JADX INFO: renamed from: a.Kg$a */
    public class a extends C0726n9 {

        /* JADX INFO: renamed from: b */
        public boolean f671b = false;

        /* JADX INFO: renamed from: c */
        public int f672c = 0;

        public a() {
        }

        @Override // p000a.InterfaceC0217Lg
        /* JADX INFO: renamed from: a */
        public final void mo553a() {
            int i = this.f672c + 1;
            this.f672c = i;
            C0199Kg c0199Kg = C0199Kg.this;
            if (i == c0199Kg.f665a.size()) {
                C0726n9 c0726n9 = c0199Kg.f668d;
                if (c0726n9 != null) {
                    c0726n9.mo553a();
                }
                this.f672c = 0;
                this.f671b = false;
                c0199Kg.f669e = false;
            }
        }

        @Override // p000a.C0726n9, p000a.InterfaceC0217Lg
        /* JADX INFO: renamed from: c */
        public final void mo554c() {
            if (this.f671b) {
                return;
            }
            this.f671b = true;
            C0726n9 c0726n9 = C0199Kg.this.f668d;
            if (c0726n9 != null) {
                c0726n9.mo554c();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m551a() {
        if (this.f669e) {
            Iterator<C0181Jg> it = this.f665a.iterator();
            while (it.hasNext()) {
                it.next().m489b();
            }
            this.f669e = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m552b() {
        View view;
        if (this.f669e) {
            return;
        }
        for (C0181Jg c0181Jg : this.f665a) {
            long j = this.f666b;
            if (j >= 0) {
                c0181Jg.m490c(j);
            }
            BaseInterpolator baseInterpolator = this.f667c;
            if (baseInterpolator != null && (view = c0181Jg.f628a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.f668d != null) {
                c0181Jg.m491d(this.f670f);
            }
            View view2 = c0181Jg.f628a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f669e = true;
    }
}
