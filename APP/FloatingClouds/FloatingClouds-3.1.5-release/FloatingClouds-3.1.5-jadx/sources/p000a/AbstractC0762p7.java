package p000a;

import androidx.fragment.app.ComponentCallbacksC1100b;
import androidx.lifecycle.AbstractC1116e;
import java.util.ArrayList;

/* JADX INFO: renamed from: a.p7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0762p7 {

    /* JADX INFO: renamed from: a */
    public ArrayList<a> f3000a;

    /* JADX INFO: renamed from: b */
    public int f3001b;

    /* JADX INFO: renamed from: c */
    public int f3002c;

    /* JADX INFO: renamed from: d */
    public int f3003d;

    /* JADX INFO: renamed from: e */
    public int f3004e;

    /* JADX INFO: renamed from: f */
    public int f3005f;

    /* JADX INFO: renamed from: g */
    public boolean f3006g;

    /* JADX INFO: renamed from: h */
    public String f3007h;

    /* JADX INFO: renamed from: i */
    public int f3008i;

    /* JADX INFO: renamed from: j */
    public CharSequence f3009j;

    /* JADX INFO: renamed from: k */
    public int f3010k;

    /* JADX INFO: renamed from: l */
    public CharSequence f3011l;

    /* JADX INFO: renamed from: m */
    public ArrayList<String> f3012m;

    /* JADX INFO: renamed from: n */
    public ArrayList<String> f3013n;

    /* JADX INFO: renamed from: o */
    public boolean f3014o;

    /* JADX INFO: renamed from: p */
    public ArrayList<Runnable> f3015p;

    /* JADX INFO: renamed from: a.p7$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public int f3016a;

        /* JADX INFO: renamed from: b */
        public ComponentCallbacksC1100b f3017b;

        /* JADX INFO: renamed from: c */
        public boolean f3018c;

        /* JADX INFO: renamed from: d */
        public int f3019d;

        /* JADX INFO: renamed from: e */
        public int f3020e;

        /* JADX INFO: renamed from: f */
        public int f3021f;

        /* JADX INFO: renamed from: g */
        public int f3022g;

        /* JADX INFO: renamed from: h */
        public AbstractC1116e.b f3023h;

        /* JADX INFO: renamed from: i */
        public AbstractC1116e.b f3024i;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public a(int i, ComponentCallbacksC1100b componentCallbacksC1100b) {
            this.f3016a = i;
            this.f3017b = componentCallbacksC1100b;
            this.f3018c = false;
            AbstractC1116e.b bVar = AbstractC1116e.b.f4676e;
            this.f3023h = bVar;
            this.f3024i = bVar;
        }

        public a(int i, ComponentCallbacksC1100b componentCallbacksC1100b, int i2) {
            this.f3016a = i;
            this.f3017b = componentCallbacksC1100b;
            this.f3018c = true;
            AbstractC1116e.b bVar = AbstractC1116e.b.f4676e;
            this.f3023h = bVar;
            this.f3024i = bVar;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1801b(a aVar) {
        this.f3000a.add(aVar);
        aVar.f3019d = this.f3001b;
        aVar.f3020e = this.f3002c;
        aVar.f3021f = this.f3003d;
        aVar.f3022g = this.f3004e;
    }
}
