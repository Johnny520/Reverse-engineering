package a;

/* JADX INFO: renamed from: a.e7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0119e7 {
    public final a.AbstractC0119e7.d A;
    public a.C0094d0 B;
    public a.C0094d0 C;
    public a.C0094d0 D;
    public java.util.ArrayDeque<a.AbstractC0119e7.g> E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public java.util.ArrayList<a.S1> K;
    public java.util.ArrayList<java.lang.Boolean> L;
    public java.util.ArrayList<androidx.fragment.app.b> M;
    public a.C0226k7 N;
    public final a.AbstractC0119e7.e O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList<a.AbstractC0119e7.i> f452a;
    public boolean b;
    public final a.A2 c;
    public java.util.ArrayList<a.S1> d;
    public java.util.ArrayList<androidx.fragment.app.b> e;
    public final a.LayoutInflaterFactory2C0045a7 f;
    public androidx.activity.OnBackPressedDispatcher g;
    public a.S1 h;
    public final a.AbstractC0119e7.a i;
    public final java.util.concurrent.atomic.AtomicInteger j;
    public final java.util.Map<java.lang.String, a.U1> k;
    public final java.util.Map<java.lang.String, android.os.Bundle> l;
    public final java.util.ArrayList<a.AbstractC0119e7.h> m;
    public final a.C0064b7 n;
    public final java.util.concurrent.CopyOnWriteArrayList<a.InterfaceC0244l7> o;
    public final a.C0083c7 p;
    public final a.C0083c7 q;
    public final a.C0083c7 r;
    public final a.C0083c7 s;
    public final a.AbstractC0119e7.b t;
    public int u;
    public a.X6.a v;
    public a.AbstractC0040a2 w;
    public androidx.fragment.app.b x;
    public androidx.fragment.app.b y;
    public final a.AbstractC0119e7.c z;

    /* JADX INFO: renamed from: a.e7$a */
    public class a extends a.Ub {
        public final /* synthetic */ a.AbstractC0119e7 d;

        public a(a.AbstractC0119e7 r1) {
                r0 = this;
                r0.d = r1
                r0.<init>()
                return
        }

        @Override // a.Ub
        public final void a() {
                r5 = this;
                r0 = 3
                boolean r0 = a.AbstractC0119e7.J(r0)
                a.e7 r1 = r5.d
                if (r0 == 0) goto L1c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r2 = "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager "
                r0.<init>(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r2 = "FragmentManager"
                android.util.Log.d(r2, r0)
            L1c:
                a.S1 r0 = r1.h
                if (r0 == 0) goto L46
                r2 = 0
                r0.r = r2
                a.M2 r3 = new a.M2
                r4 = 10
                r3.<init>(r4, r1)
                java.util.ArrayList<java.lang.Runnable> r4 = r0.p
                if (r4 != 0) goto L35
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                r0.p = r4
            L35:
                java.util.ArrayList<java.lang.Runnable> r0 = r0.p
                r0.add(r3)
                a.S1 r0 = r1.h
                r0.d(r2)
                r0 = 1
                r1.z(r0)
                r1.D()
            L46:
                r0 = 0
                r1.h = r0
                return
        }

        @Override // a.Ub
        public final void b() {
                r10 = this;
                r0 = 3
                boolean r1 = a.AbstractC0119e7.J(r0)
                a.e7 r2 = r10.d
                java.lang.String r3 = "FragmentManager"
                if (r1 == 0) goto L1c
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r4 = "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager "
                r1.<init>(r4)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.util.Log.d(r3, r1)
            L1c:
                r1 = 1
                r2.z(r1)
                a.S1 r4 = r2.h
                a.e7$a r5 = r2.i
                if (r4 == 0) goto L100
                java.util.ArrayList<a.e7$h> r4 = r2.m
                boolean r6 = r4.isEmpty()
                if (r6 != 0) goto L5d
                java.util.LinkedHashSet r6 = new java.util.LinkedHashSet
                a.S1 r7 = r2.h
                java.util.HashSet r7 = a.AbstractC0119e7.E(r7)
                r6.<init>(r7)
                java.util.Iterator r4 = r4.iterator()
            L3d:
                boolean r7 = r4.hasNext()
                if (r7 == 0) goto L5d
                java.lang.Object r7 = r4.next()
                a.e7$h r7 = (a.AbstractC0119e7.h) r7
                java.util.Iterator r8 = r6.iterator()
            L4d:
                boolean r9 = r8.hasNext()
                if (r9 == 0) goto L3d
                java.lang.Object r9 = r8.next()
                androidx.fragment.app.b r9 = (androidx.fragment.app.b) r9
                r7.getClass()
                goto L4d
            L5d:
                a.S1 r4 = r2.h
                java.util.ArrayList<a.p7$a> r4 = r4.f636a
                java.util.Iterator r4 = r4.iterator()
            L65:
                boolean r6 = r4.hasNext()
                r7 = 0
                if (r6 == 0) goto L79
                java.lang.Object r6 = r4.next()
                a.p7$a r6 = (a.AbstractC0316p7.a) r6
                androidx.fragment.app.b r6 = r6.b
                if (r6 == 0) goto L65
                r6.m = r7
                goto L65
            L79:
                java.util.ArrayList r4 = new java.util.ArrayList
                a.S1 r6 = r2.h
                java.util.List r6 = java.util.Collections.singletonList(r6)
                r4.<init>(r6)
                java.util.HashSet r1 = r2.f(r4, r7, r1)
                java.util.Iterator r1 = r1.iterator()
            L8c:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto Laf
                java.lang.Object r4 = r1.next()
                androidx.fragment.app.f r4 = (androidx.fragment.app.f) r4
                r4.getClass()
                boolean r6 = a.AbstractC0119e7.J(r0)
                if (r6 == 0) goto La6
                java.lang.String r6 = "SpecialEffectsController: Completing Back "
                android.util.Log.d(r3, r6)
            La6:
                java.util.ArrayList r6 = r4.c
                r4.j(r6)
                r4.c(r6)
                goto L8c
            Laf:
                a.S1 r1 = r2.h
                java.util.ArrayList<a.p7$a> r1 = r1.f636a
                java.util.Iterator r1 = r1.iterator()
            Lb7:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto Ld3
                java.lang.Object r4 = r1.next()
                a.p7$a r4 = (a.AbstractC0316p7.a) r4
                androidx.fragment.app.b r4 = r4.b
                if (r4 == 0) goto Lb7
                android.view.ViewGroup r6 = r4.F
                if (r6 != 0) goto Lb7
                androidx.fragment.app.e r4 = r2.g(r4)
                r4.k()
                goto Lb7
            Ld3:
                r1 = 0
                r2.h = r1
                r2.f0()
                boolean r0 = a.AbstractC0119e7.J(r0)
                if (r0 == 0) goto Lff
                java.lang.String r0 = "Op is being set to null"
                android.util.Log.d(r3, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "OnBackPressedCallback enabled="
                r0.<init>(r1)
                boolean r1 = r5.f292a
                r0.append(r1)
                java.lang.String r1 = " for  FragmentManager "
                r0.append(r1)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                android.util.Log.d(r3, r0)
            Lff:
                return
            L100:
                boolean r1 = r5.f292a
                if (r1 == 0) goto L113
                boolean r0 = a.AbstractC0119e7.J(r0)
                if (r0 == 0) goto L10f
                java.lang.String r0 = "Calling popBackStackImmediate via onBackPressed callback"
                android.util.Log.d(r3, r0)
            L10f:
                r2.Q()
                return
            L113:
                boolean r0 = a.AbstractC0119e7.J(r0)
                if (r0 == 0) goto L11e
                java.lang.String r0 = "Calling onBackPressed via onBackPressed callback"
                android.util.Log.d(r3, r0)
            L11e:
                androidx.activity.OnBackPressedDispatcher r0 = r2.g
                r0.b()
                return
        }

        @Override // a.Ub
        public final void c(a.R1 r12) {
                r11 = this;
                r0 = 2
                boolean r1 = a.AbstractC0119e7.J(r0)
                a.e7 r2 = r11.d
                java.lang.String r3 = "FragmentManager"
                if (r1 == 0) goto L1c
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r4 = "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager "
                r1.<init>(r4)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.util.Log.v(r3, r1)
            L1c:
                a.S1 r1 = r2.h
                if (r1 == 0) goto Lb2
                java.util.ArrayList r1 = new java.util.ArrayList
                a.S1 r4 = r2.h
                java.util.List r4 = java.util.Collections.singletonList(r4)
                r1.<init>(r4)
                r4 = 0
                r5 = 1
                java.util.HashSet r1 = r2.f(r1, r4, r5)
                java.util.Iterator r1 = r1.iterator()
            L35:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L9c
                java.lang.Object r5 = r1.next()
                androidx.fragment.app.f r5 = (androidx.fragment.app.f) r5
                r5.getClass()
                java.lang.String r6 = "backEvent"
                a.C0193i9.e(r12, r6)
                boolean r6 = a.AbstractC0119e7.J(r0)
                if (r6 == 0) goto L62
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r7 = "SpecialEffectsController: Processing Progress "
                r6.<init>(r7)
                float r7 = r12.c
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                android.util.Log.v(r3, r6)
            L62:
                java.util.ArrayList r6 = r5.c
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.Iterator r6 = r6.iterator()
            L6d:
                boolean r8 = r6.hasNext()
                if (r8 == 0) goto L7f
                java.lang.Object r8 = r6.next()
                androidx.fragment.app.f$c r8 = (androidx.fragment.app.f.c) r8
                java.util.ArrayList r8 = r8.k
                a.C0365s3.h0(r7, r8)
                goto L6d
            L7f:
                java.util.Set r6 = a.C0383t3.A0(r7)
                java.util.List r6 = a.C0383t3.w0(r6)
                int r7 = r6.size()
                r8 = r4
            L8c:
                if (r8 >= r7) goto L35
                java.lang.Object r9 = r6.get(r8)
                androidx.fragment.app.f$a r9 = (androidx.fragment.app.f.a) r9
                android.view.ViewGroup r10 = r5.f915a
                r9.c(r12, r10)
                int r8 = r8 + 1
                goto L8c
            L9c:
                java.util.ArrayList<a.e7$h> r12 = r2.m
                java.util.Iterator r12 = r12.iterator()
            La2:
                boolean r0 = r12.hasNext()
                if (r0 == 0) goto Lb2
                java.lang.Object r0 = r12.next()
                a.e7$h r0 = (a.AbstractC0119e7.h) r0
                r0.getClass()
                goto La2
            Lb2:
                return
        }

        @Override // a.Ub
        public final void d(a.R1 r3) {
                r2 = this;
                r3 = 3
                boolean r3 = a.AbstractC0119e7.J(r3)
                a.e7 r0 = r2.d
                if (r3 == 0) goto L1c
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r1 = "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager "
                r3.<init>(r1)
                r3.append(r0)
                java.lang.String r3 = r3.toString()
                java.lang.String r1 = "FragmentManager"
                android.util.Log.d(r1, r3)
            L1c:
                r0.w()
                a.e7$k r3 = new a.e7$k
                r3.<init>(r0)
                r1 = 0
                r0.x(r3, r1)
                return
        }
    }

    /* JADX INFO: renamed from: a.e7$b */
    public class b implements a.InterfaceC0159gb {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.AbstractC0119e7 f453a;

        public b(a.AbstractC0119e7 r1) {
                r0 = this;
                r0.<init>()
                r0.f453a = r1
                return
        }

        @Override // a.InterfaceC0159gb
        public final void a(android.view.Menu r1, android.view.MenuInflater r2) {
                r0 = this;
                a.e7 r1 = r0.f453a
                r1.k()
                return
        }

        @Override // a.InterfaceC0159gb
        public final void b(android.view.Menu r1) {
                r0 = this;
                a.e7 r1 = r0.f453a
                r1.t()
                return
        }

        @Override // a.InterfaceC0159gb
        public final boolean c(android.view.MenuItem r1) {
                r0 = this;
                a.e7 r1 = r0.f453a
                boolean r1 = r1.p()
                return r1
        }

        @Override // a.InterfaceC0159gb
        public final void d(android.view.Menu r1) {
                r0 = this;
                a.e7 r1 = r0.f453a
                r1.q()
                return
        }
    }

    /* JADX INFO: renamed from: a.e7$c */
    public class c extends androidx.fragment.app.d {
        public final /* synthetic */ a.AbstractC0119e7 b;

        public c(a.AbstractC0119e7 r1) {
                r0 = this;
                r0.<init>()
                r0.b = r1
                return
        }

        @Override // androidx.fragment.app.d
        public final androidx.fragment.app.b a(java.lang.String r5) {
                r4 = this;
                a.e7 r0 = r4.b
                a.X6$a r0 = r0.v
                a.X6 r0 = r0.b
                java.lang.String r1 = ": make sure class name exists, is public, and has an empty constructor that is public"
                java.lang.String r2 = "Unable to instantiate fragment "
                java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.NoSuchMethodException -> L20 java.lang.IllegalAccessException -> L22 java.lang.InstantiationException -> L24
                java.lang.Class r0 = androidx.fragment.app.d.c(r0, r5)     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.NoSuchMethodException -> L20 java.lang.IllegalAccessException -> L22 java.lang.InstantiationException -> L24
                r3 = 0
                java.lang.reflect.Constructor r0 = r0.getConstructor(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.NoSuchMethodException -> L20 java.lang.IllegalAccessException -> L22 java.lang.InstantiationException -> L24
                java.lang.Object r0 = r0.newInstance(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.NoSuchMethodException -> L20 java.lang.IllegalAccessException -> L22 java.lang.InstantiationException -> L24
                androidx.fragment.app.b r0 = (androidx.fragment.app.b) r0     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.NoSuchMethodException -> L20 java.lang.IllegalAccessException -> L22 java.lang.InstantiationException -> L24
                return r0
            L1e:
                r0 = move-exception
                goto L26
            L20:
                r0 = move-exception
                goto L32
            L22:
                r0 = move-exception
                goto L3e
            L24:
                r0 = move-exception
                goto L48
            L26:
                androidx.fragment.app.b$e r1 = new androidx.fragment.app.b$e
                java.lang.String r3 = ": calling Fragment constructor caused an exception"
                java.lang.String r5 = a.C0487z.g(r2, r5, r3)
                r1.<init>(r5, r0)
                throw r1
            L32:
                androidx.fragment.app.b$e r1 = new androidx.fragment.app.b$e
                java.lang.String r3 = ": could not find Fragment constructor"
                java.lang.String r5 = a.C0487z.g(r2, r5, r3)
                r1.<init>(r5, r0)
                throw r1
            L3e:
                androidx.fragment.app.b$e r3 = new androidx.fragment.app.b$e
                java.lang.String r5 = a.C0487z.g(r2, r5, r1)
                r3.<init>(r5, r0)
                throw r3
            L48:
                androidx.fragment.app.b$e r3 = new androidx.fragment.app.b$e
                java.lang.String r5 = a.C0487z.g(r2, r5, r1)
                r3.<init>(r5, r0)
                throw r3
        }
    }

    /* JADX INFO: renamed from: a.e7$d */
    public class d implements a.InterfaceC0341qe {
    }

    /* JADX INFO: renamed from: a.e7$e */
    public class e implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.AbstractC0119e7 f454a;

        public e(a.AbstractC0119e7 r1) {
                r0 = this;
                r0.<init>()
                r0.f454a = r1
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r2 = this;
                a.e7 r0 = r2.f454a
                r1 = 1
                r0.z(r1)
                return
        }
    }

    /* JADX INFO: renamed from: a.e7$f */
    public static class f extends a.Y<a.C0157g9, a.W> {
        @Override // a.Y
        public final android.content.Intent a(android.content.Context r5, android.os.Parcelable r6) {
                r4 = this;
                a.g9 r6 = (a.C0157g9) r6
                android.content.Intent r5 = new android.content.Intent
                java.lang.String r0 = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"
                r5.<init>(r0)
                android.content.Intent r0 = r6.b
                if (r0 == 0) goto L31
                java.lang.String r1 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"
                android.os.Bundle r2 = r0.getBundleExtra(r1)
                if (r2 == 0) goto L31
                r5.putExtra(r1, r2)
                r0.removeExtra(r1)
                java.lang.String r1 = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE"
                r2 = 0
                boolean r0 = r0.getBooleanExtra(r1, r2)
                if (r0 == 0) goto L31
                android.content.IntentSender r0 = r6.f483a
                a.g9 r1 = new a.g9
                int r2 = r6.d
                r3 = 0
                int r6 = r6.c
                r1.<init>(r0, r3, r6, r2)
                r6 = r1
            L31:
                java.lang.String r0 = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST"
                r5.putExtra(r0, r6)
                r6 = 2
                boolean r6 = a.AbstractC0119e7.J(r6)
                if (r6 == 0) goto L50
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r0 = "CreateIntent created the following intent: "
                r6.<init>(r0)
                r6.append(r5)
                java.lang.String r6 = r6.toString()
                java.lang.String r0 = "FragmentManager"
                android.util.Log.v(r0, r6)
            L50:
                return r5
        }

        @Override // a.Y
        public final java.lang.Object c(android.content.Intent r2, int r3) {
                r1 = this;
                a.W r0 = new a.W
                r0.<init>(r2, r3)
                return r0
        }
    }

    /* JADX INFO: renamed from: a.e7$g */
    @android.annotation.SuppressLint({"BanParcelableUsage"})
    public static class g implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<a.AbstractC0119e7.g> CREATOR = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public java.lang.String f455a;
        public int b;

        /* JADX INFO: renamed from: a.e7$g$a */
        public class a implements android.os.Parcelable.Creator<a.AbstractC0119e7.g> {
            @Override // android.os.Parcelable.Creator
            public final a.AbstractC0119e7.g createFromParcel(android.os.Parcel r3) {
                    r2 = this;
                    a.e7$g r0 = new a.e7$g
                    r0.<init>()
                    java.lang.String r1 = r3.readString()
                    r0.f455a = r1
                    int r3 = r3.readInt()
                    r0.b = r3
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public final a.AbstractC0119e7.g[] newArray(int r1) {
                    r0 = this;
                    a.e7$g[] r1 = new a.AbstractC0119e7.g[r1]
                    return r1
            }
        }

        static {
                a.e7$g$a r0 = new a.e7$g$a
                r0.<init>()
                a.AbstractC0119e7.g.CREATOR = r0
                return
        }

        public g(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.f455a = r1
                r0.b = r2
                return
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                java.lang.String r2 = r0.f455a
                r1.writeString(r2)
                int r2 = r0.b
                r1.writeInt(r2)
                return
        }
    }

    /* JADX INFO: renamed from: a.e7$h */
    public interface h {
        void a();
    }

    /* JADX INFO: renamed from: a.e7$i */
    public interface i {
        boolean a(java.util.ArrayList<a.S1> r1, java.util.ArrayList<java.lang.Boolean> r2);
    }

    /* JADX INFO: renamed from: a.e7$j */
    public class j implements a.AbstractC0119e7.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f456a;
        public final /* synthetic */ a.AbstractC0119e7 b;

        public j(a.AbstractC0119e7 r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.b = r1
                r0.f456a = r2
                return
        }

        @Override // a.AbstractC0119e7.i
        public final boolean a(java.util.ArrayList<a.S1> r6, java.util.ArrayList<java.lang.Boolean> r7) {
                r5 = this;
                a.e7 r0 = r5.b
                androidx.fragment.app.b r1 = r0.y
                int r2 = r5.f456a
                if (r1 == 0) goto L17
                if (r2 >= 0) goto L17
                a.e7 r1 = r1.c()
                r3 = -1
                r4 = 0
                boolean r1 = r1.R(r3, r4)
                if (r1 == 0) goto L17
                return r4
            L17:
                r1 = 1
                boolean r6 = r0.S(r6, r7, r2, r1)
                return r6
        }
    }

    /* JADX INFO: renamed from: a.e7$k */
    public class k implements a.AbstractC0119e7.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.AbstractC0119e7 f457a;

        public k(a.AbstractC0119e7 r1) {
                r0 = this;
                r0.<init>()
                r0.f457a = r1
                return
        }

        @Override // a.AbstractC0119e7.i
        public final boolean a(java.util.ArrayList<a.S1> r5, java.util.ArrayList<java.lang.Boolean> r6) {
                r4 = this;
                a.e7 r0 = r4.f457a
                java.util.ArrayList<a.S1> r1 = r0.d
                int r2 = r1.size()
                r3 = 1
                int r2 = r2 - r3
                java.lang.Object r1 = r1.get(r2)
                a.S1 r1 = (a.S1) r1
                r0.h = r1
                java.util.ArrayList<a.p7$a> r1 = r1.f636a
                java.util.Iterator r1 = r1.iterator()
            L18:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L2b
                java.lang.Object r2 = r1.next()
                a.p7$a r2 = (a.AbstractC0316p7.a) r2
                androidx.fragment.app.b r2 = r2.b
                if (r2 == 0) goto L18
                r2.m = r3
                goto L18
            L2b:
                r1 = 0
                r2 = -1
                boolean r1 = r0.S(r5, r6, r2, r1)
                java.util.ArrayList<a.e7$h> r2 = r0.m
                boolean r2 = r2.isEmpty()
                if (r2 != 0) goto L90
                int r2 = r5.size()
                if (r2 <= 0) goto L90
                int r2 = r5.size()
                int r2 = r2 - r3
                java.lang.Object r6 = r6.get(r2)
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                r6.getClass()
                java.util.LinkedHashSet r6 = new java.util.LinkedHashSet
                r6.<init>()
                java.util.Iterator r5 = r5.iterator()
            L56:
                boolean r2 = r5.hasNext()
                if (r2 == 0) goto L6a
                java.lang.Object r2 = r5.next()
                a.S1 r2 = (a.S1) r2
                java.util.HashSet r2 = a.AbstractC0119e7.E(r2)
                r6.addAll(r2)
                goto L56
            L6a:
                java.util.ArrayList<a.e7$h> r5 = r0.m
                java.util.Iterator r5 = r5.iterator()
            L70:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L90
                java.lang.Object r0 = r5.next()
                a.e7$h r0 = (a.AbstractC0119e7.h) r0
                java.util.Iterator r2 = r6.iterator()
            L80:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L70
                java.lang.Object r3 = r2.next()
                androidx.fragment.app.b r3 = (androidx.fragment.app.b) r3
                r0.getClass()
                goto L80
            L90:
                return r1
        }
    }

    public AbstractC0119e7() {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f452a = r0
            a.A2 r0 = new a.A2
            r1 = 2
            r0.<init>(r1)
            r2.c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.d = r0
            a.a7 r0 = new a.a7
            r0.<init>(r2)
            r2.f = r0
            r0 = 0
            r2.h = r0
            a.e7$a r0 = new a.e7$a
            r0.<init>(r2)
            r2.i = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r2.j = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r2.k = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r2.l = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Collections.synchronizedMap(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.m = r0
            a.b7 r0 = new a.b7
            r0.<init>(r2)
            r2.n = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.o = r0
            a.c7 r0 = new a.c7
            r1 = 0
            r0.<init>(r2, r1)
            r2.p = r0
            a.c7 r0 = new a.c7
            r1 = 1
            r0.<init>(r2, r1)
            r2.q = r0
            a.c7 r0 = new a.c7
            r1 = 2
            r0.<init>(r2, r1)
            r2.r = r0
            a.c7 r0 = new a.c7
            r1 = 3
            r0.<init>(r2, r1)
            r2.s = r0
            a.e7$b r0 = new a.e7$b
            r0.<init>(r2)
            r2.t = r0
            r0 = -1
            r2.u = r0
            a.e7$c r0 = new a.e7$c
            r0.<init>(r2)
            r2.z = r0
            a.e7$d r0 = new a.e7$d
            r0.<init>()
            r2.A = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r2.E = r0
            a.e7$e r0 = new a.e7$e
            r0.<init>(r2)
            r2.O = r0
            return
    }

    public static java.util.HashSet E(a.S1 r4) {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1 = 0
        L6:
            java.util.ArrayList<a.p7$a> r2 = r4.f636a
            int r2 = r2.size()
            if (r1 >= r2) goto L24
            java.util.ArrayList<a.p7$a> r2 = r4.f636a
            java.lang.Object r2 = r2.get(r1)
            a.p7$a r2 = (a.AbstractC0316p7.a) r2
            androidx.fragment.app.b r2 = r2.b
            if (r2 == 0) goto L21
            boolean r3 = r4.g
            if (r3 == 0) goto L21
            r0.add(r2)
        L21:
            int r1 = r1 + 1
            goto L6
        L24:
            return r0
    }

    public static boolean J(int r1) {
            java.lang.String r0 = "FragmentManager"
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    public static boolean K(androidx.fragment.app.b r3) {
            r3.getClass()
            a.i7 r3 = r3.v
            a.A2 r3 = r3.c
            java.util.ArrayList r3 = r3.f()
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
            r1 = r0
        L11:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r3.next()
            androidx.fragment.app.b r2 = (androidx.fragment.app.b) r2
            if (r2 == 0) goto L23
            boolean r1 = K(r2)
        L23:
            if (r1 == 0) goto L11
            r3 = 1
            return r3
        L27:
            return r0
    }

    public static boolean M(androidx.fragment.app.b r1) {
            if (r1 != 0) goto L3
            goto L13
        L3:
            boolean r0 = r1.D
            if (r0 == 0) goto L15
            a.e7 r0 = r1.t
            if (r0 == 0) goto L13
            androidx.fragment.app.b r1 = r1.w
            boolean r1 = M(r1)
            if (r1 == 0) goto L15
        L13:
            r1 = 1
            return r1
        L15:
            r1 = 0
            return r1
    }

    public static boolean N(androidx.fragment.app.b r2) {
            if (r2 != 0) goto L3
            goto L15
        L3:
            a.e7 r0 = r2.t
            androidx.fragment.app.b r1 = r0.y
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L17
            androidx.fragment.app.b r2 = r0.x
            boolean r2 = N(r2)
            if (r2 == 0) goto L17
        L15:
            r2 = 1
            return r2
        L17:
            r2 = 0
            return r2
    }

    public static void c0(androidx.fragment.app.b r2) {
            r0 = 2
            boolean r0 = J(r0)
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "show: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1a:
            boolean r0 = r2.A
            if (r0 == 0) goto L27
            r0 = 0
            r2.A = r0
            boolean r0 = r2.K
            r0 = r0 ^ 1
            r2.K = r0
        L27:
            return
    }

    public final void A(a.S1 r2, boolean r3) {
            r1 = this;
            if (r3 == 0) goto Lb
            a.X6$a r0 = r1.v
            if (r0 == 0) goto La
            boolean r0 = r1.I
            if (r0 == 0) goto Lb
        La:
            return
        Lb:
            r1.y(r3)
            java.util.ArrayList<a.S1> r3 = r1.K
            java.util.ArrayList<java.lang.Boolean> r0 = r1.L
            r2.a(r3, r0)
            r2 = 1
            r1.b = r2
            java.util.ArrayList<a.S1> r2 = r1.K     // Catch: java.lang.Throwable -> L42
            java.util.ArrayList<java.lang.Boolean> r3 = r1.L     // Catch: java.lang.Throwable -> L42
            r1.U(r2, r3)     // Catch: java.lang.Throwable -> L42
            r1.d()
            r1.f0()
            boolean r2 = r1.J
            if (r2 == 0) goto L2f
            r2 = 0
            r1.J = r2
            r1.d0()
        L2f:
            a.A2 r2 = r1.c
            java.lang.Object r2 = r2.b
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.util.Collection r2 = r2.values()
            r3 = 0
            java.util.Set r3 = java.util.Collections.singleton(r3)
            r2.removeAll(r3)
            return
        L42:
            r2 = move-exception
            r1.d()
            throw r2
    }

    public final void B(java.util.ArrayList<a.S1> r27, java.util.ArrayList<java.lang.Boolean> r28, int r29, int r30) {
            r26 = this;
            r1 = r26
            r0 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            r9 = 1
            java.lang.Object r10 = r0.get(r3)
            a.S1 r10 = (a.S1) r10
            boolean r10 = r10.o
            java.util.ArrayList<androidx.fragment.app.b> r11 = r1.M
            if (r11 != 0) goto L1f
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r1.M = r11
            goto L22
        L1f:
            r11.clear()
        L22:
            java.util.ArrayList<androidx.fragment.app.b> r11 = r1.M
            a.A2 r12 = r1.c
            java.util.List r13 = r12.g()
            r11.addAll(r13)
            androidx.fragment.app.b r11 = r1.y
            r13 = r3
            r14 = 0
        L31:
            if (r13 >= r4) goto L1a3
            java.lang.Object r15 = r0.get(r13)
            a.S1 r15 = (a.S1) r15
            java.lang.Object r16 = r2.get(r13)
            java.lang.Boolean r16 = (java.lang.Boolean) r16
            boolean r16 = r16.booleanValue()
            if (r16 != 0) goto L150
            r16 = -1
            java.util.ArrayList<androidx.fragment.app.b> r8 = r1.M
            r7 = 0
        L4a:
            java.util.ArrayList<a.p7$a> r5 = r15.f636a
            int r6 = r5.size()
            if (r7 >= r6) goto L149
            java.lang.Object r6 = r5.get(r7)
            a.p7$a r6 = (a.AbstractC0316p7.a) r6
            r18 = r10
            int r10 = r6.f637a
            if (r10 == r9) goto L135
            r9 = 2
            r20 = r13
            r13 = 9
            if (r10 == r9) goto Lb1
            r9 = 3
            if (r10 == r9) goto L8d
            r9 = 6
            if (r10 == r9) goto L8d
            r9 = 7
            if (r10 == r9) goto L88
            r9 = 8
            if (r10 == r9) goto L73
            goto L83
        L73:
            a.p7$a r9 = new a.p7$a
            r10 = 0
            r9.<init>(r13, r11, r10)
            r5.add(r7, r9)
            r5 = 1
            r6.c = r5
            int r7 = r7 + r5
            androidx.fragment.app.b r5 = r6.b
            r11 = r5
        L83:
            r23 = r14
            r10 = 1
            goto L13f
        L88:
            r10 = 1
        L89:
            r23 = r14
            goto L13a
        L8d:
            androidx.fragment.app.b r9 = r6.b
            r8.remove(r9)
            androidx.fragment.app.b r6 = r6.b
            if (r6 != r11) goto La9
            a.p7$a r9 = new a.p7$a
            r9.<init>(r13, r6)
            r5.add(r7, r9)
            r19 = 1
            int r7 = r7 + 1
            r23 = r14
            r10 = r19
            r11 = 0
            goto L13f
        La9:
            r19 = 1
            r23 = r14
            r10 = r19
            goto L13f
        Lb1:
            r19 = 1
            androidx.fragment.app.b r9 = r6.b
            int r10 = r9.y
            int r21 = r8.size()
            int r21 = r21 + (-1)
            r13 = r21
            r21 = 0
        Lc1:
            if (r13 < 0) goto L122
            java.lang.Object r23 = r8.get(r13)
            r24 = r13
            r13 = r23
            androidx.fragment.app.b r13 = (androidx.fragment.app.b) r13
            r23 = r14
            int r14 = r13.y
            if (r14 != r10) goto L118
            if (r13 != r9) goto Ldb
            r22 = r10
            r10 = 1
            r21 = 1
            goto L11b
        Ldb:
            if (r13 != r11) goto Lf0
            a.p7$a r11 = new a.p7$a
            r22 = r10
            r10 = 0
            r14 = 9
            r11.<init>(r14, r13, r10)
            r5.add(r7, r11)
            r19 = 1
            int r7 = r7 + 1
            r11 = 0
            goto Lf5
        Lf0:
            r22 = r10
            r10 = 0
            r14 = 9
        Lf5:
            a.p7$a r14 = new a.p7$a
            r25 = r11
            r11 = 3
            r14.<init>(r11, r13, r10)
            int r10 = r6.d
            r14.d = r10
            int r10 = r6.f
            r14.f = r10
            int r10 = r6.e
            r14.e = r10
            int r10 = r6.g
            r14.g = r10
            r5.add(r7, r14)
            r8.remove(r13)
            r10 = 1
            int r7 = r7 + r10
            r11 = r25
            goto L11b
        L118:
            r22 = r10
            r10 = 1
        L11b:
            int r13 = r24 + (-1)
            r10 = r22
            r14 = r23
            goto Lc1
        L122:
            r23 = r14
            r10 = 1
            if (r21 == 0) goto L12d
            r5.remove(r7)
            int r7 = r7 + (-1)
            goto L13f
        L12d:
            r6.f637a = r10
            r6.c = r10
            r8.add(r9)
            goto L13f
        L135:
            r10 = r9
            r20 = r13
            goto L89
        L13a:
            androidx.fragment.app.b r5 = r6.b
            r8.add(r5)
        L13f:
            int r7 = r7 + r10
            r9 = r10
            r10 = r18
            r13 = r20
            r14 = r23
            goto L4a
        L149:
            r18 = r10
            r20 = r13
            r23 = r14
            goto L190
        L150:
            r18 = r10
            r20 = r13
            r23 = r14
            r16 = -1
            r10 = r9
            java.util.ArrayList<androidx.fragment.app.b> r5 = r1.M
            java.util.ArrayList<a.p7$a> r6 = r15.f636a
            int r7 = r6.size()
            int r7 = r7 - r10
        L162:
            if (r7 < 0) goto L190
            java.lang.Object r8 = r6.get(r7)
            a.p7$a r8 = (a.AbstractC0316p7.a) r8
            int r9 = r8.f637a
            if (r9 == r10) goto L186
            r10 = 3
            if (r9 == r10) goto L180
            switch(r9) {
                case 6: goto L180;
                case 7: goto L187;
                case 8: goto L17e;
                case 9: goto L17a;
                case 10: goto L175;
                default: goto L174;
            }
        L174:
            goto L18c
        L175:
            androidx.lifecycle.e$b r9 = r8.h
            r8.i = r9
            goto L18c
        L17a:
            androidx.fragment.app.b r8 = r8.b
            r11 = r8
            goto L18c
        L17e:
            r11 = 0
            goto L18c
        L180:
            androidx.fragment.app.b r8 = r8.b
            r5.add(r8)
            goto L18c
        L186:
            r10 = 3
        L187:
            androidx.fragment.app.b r8 = r8.b
            r5.remove(r8)
        L18c:
            int r7 = r7 + (-1)
            r10 = 1
            goto L162
        L190:
            if (r23 != 0) goto L19a
            boolean r5 = r15.g
            if (r5 == 0) goto L197
            goto L19a
        L197:
            r14 = 0
        L198:
            r5 = 1
            goto L19c
        L19a:
            r14 = 1
            goto L198
        L19c:
            int r13 = r20 + 1
            r9 = r5
            r10 = r18
            goto L31
        L1a3:
            r5 = r9
            r18 = r10
            r23 = r14
            r16 = -1
            java.util.ArrayList<androidx.fragment.app.b> r6 = r1.M
            r6.clear()
            if (r18 != 0) goto L1e5
            int r6 = r1.u
            if (r6 < r5) goto L1e5
            r5 = r3
        L1b6:
            if (r5 >= r4) goto L1e5
            java.lang.Object r6 = r0.get(r5)
            a.S1 r6 = (a.S1) r6
            java.util.ArrayList<a.p7$a> r6 = r6.f636a
            java.util.Iterator r6 = r6.iterator()
        L1c4:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L1e0
            java.lang.Object r7 = r6.next()
            a.p7$a r7 = (a.AbstractC0316p7.a) r7
            androidx.fragment.app.b r7 = r7.b
            if (r7 == 0) goto L1c4
            a.e7 r8 = r7.t
            if (r8 == 0) goto L1c4
            androidx.fragment.app.e r7 = r1.g(r7)
            r12.h(r7)
            goto L1c4
        L1e0:
            r19 = 1
            int r5 = r5 + 1
            goto L1b6
        L1e5:
            r5 = r3
        L1e6:
            if (r5 >= r4) goto L3de
            java.lang.Object r6 = r0.get(r5)
            a.S1 r6 = (a.S1) r6
            java.lang.Object r7 = r2.get(r5)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            java.lang.String r8 = "Unknown cmd: "
            if (r7 == 0) goto L2f2
            r7 = r16
            r6.c(r7)
            java.util.ArrayList<a.p7$a> r7 = r6.f636a
            int r9 = r7.size()
            r10 = 1
            int r9 = r9 - r10
        L209:
            if (r9 < 0) goto L2ec
            java.lang.Object r11 = r7.get(r9)
            a.p7$a r11 = (a.AbstractC0316p7.a) r11
            androidx.fragment.app.b r12 = r11.b
            if (r12 == 0) goto L251
            androidx.fragment.app.b$d r13 = r12.J
            if (r13 != 0) goto L21a
            goto L220
        L21a:
            androidx.fragment.app.b$d r13 = r12.b()
            r13.f909a = r10
        L220:
            int r10 = r6.f
            r13 = 8194(0x2002, float:1.1482E-41)
            r14 = 4097(0x1001, float:5.741E-42)
            if (r10 == r14) goto L23b
            if (r10 == r13) goto L238
            r13 = 4100(0x1004, float:5.745E-42)
            r14 = 8197(0x2005, float:1.1486E-41)
            if (r10 == r14) goto L23b
            r15 = 4099(0x1003, float:5.744E-42)
            if (r10 == r15) goto L23a
            if (r10 == r13) goto L238
            r13 = 0
            goto L23b
        L238:
            r13 = r14
            goto L23b
        L23a:
            r13 = r15
        L23b:
            androidx.fragment.app.b$d r10 = r12.J
            if (r10 != 0) goto L242
            if (r13 != 0) goto L242
            goto L249
        L242:
            r12.b()
            androidx.fragment.app.b$d r10 = r12.J
            r10.f = r13
        L249:
            r12.b()
            androidx.fragment.app.b$d r10 = r12.J
            r10.getClass()
        L251:
            int r10 = r11.f637a
            a.e7 r13 = r6.q
            switch(r10) {
                case 1: goto L2d5;
                case 2: goto L258;
                case 3: goto L2c6;
                case 4: goto L2b4;
                case 5: goto L2a1;
                case 6: goto L292;
                case 7: goto L27f;
                case 8: goto L27a;
                case 9: goto L276;
                case 10: goto L26c;
                default: goto L258;
            }
        L258:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r8)
            int r3 = r11.f637a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L26c:
            androidx.lifecycle.e$b r10 = r11.h
            r13.Z(r12, r10)
        L271:
            r10 = 1
        L272:
            r16 = -1
            goto L2e8
        L276:
            r13.a0(r12)
            goto L271
        L27a:
            r10 = 0
            r13.a0(r10)
            goto L271
        L27f:
            int r10 = r11.d
            int r14 = r11.e
            int r15 = r11.f
            int r11 = r11.g
            r12.D(r10, r14, r15, r11)
            r10 = 1
            r13.Y(r12, r10)
            r13.h(r12)
            goto L271
        L292:
            int r10 = r11.d
            int r14 = r11.e
            int r15 = r11.f
            int r11 = r11.g
            r12.D(r10, r14, r15, r11)
            r13.c(r12)
            goto L271
        L2a1:
            int r10 = r11.d
            int r14 = r11.e
            int r15 = r11.f
            int r11 = r11.g
            r12.D(r10, r14, r15, r11)
            r10 = 1
            r13.Y(r12, r10)
            r13.I(r12)
            goto L271
        L2b4:
            int r10 = r11.d
            int r14 = r11.e
            int r15 = r11.f
            int r11 = r11.g
            r12.D(r10, r14, r15, r11)
            r13.getClass()
            c0(r12)
            goto L271
        L2c6:
            int r10 = r11.d
            int r14 = r11.e
            int r15 = r11.f
            int r11 = r11.g
            r12.D(r10, r14, r15, r11)
            r13.a(r12)
            goto L271
        L2d5:
            int r10 = r11.d
            int r14 = r11.e
            int r15 = r11.f
            int r11 = r11.g
            r12.D(r10, r14, r15, r11)
            r10 = 1
            r13.Y(r12, r10)
            r13.T(r12)
            goto L272
        L2e8:
            int r9 = r9 + (-1)
            goto L209
        L2ec:
            r19 = r10
        L2ee:
            r17 = r5
            goto L3d8
        L2f2:
            r10 = 1
            r6.c(r10)
            java.util.ArrayList<a.p7$a> r7 = r6.f636a
            int r9 = r7.size()
            r10 = 0
        L2fd:
            if (r10 >= r9) goto L3d4
            java.lang.Object r11 = r7.get(r10)
            a.p7$a r11 = (a.AbstractC0316p7.a) r11
            androidx.fragment.app.b r12 = r11.b
            if (r12 == 0) goto L32d
            androidx.fragment.app.b$d r13 = r12.J
            if (r13 != 0) goto L30e
            goto L315
        L30e:
            androidx.fragment.app.b$d r13 = r12.b()
            r14 = 0
            r13.f909a = r14
        L315:
            int r13 = r6.f
            androidx.fragment.app.b$d r14 = r12.J
            if (r14 != 0) goto L31e
            if (r13 != 0) goto L31e
            goto L325
        L31e:
            r12.b()
            androidx.fragment.app.b$d r14 = r12.J
            r14.f = r13
        L325:
            r12.b()
            androidx.fragment.app.b$d r13 = r12.J
            r13.getClass()
        L32d:
            int r13 = r11.f637a
            a.e7 r14 = r6.q
            switch(r13) {
                case 1: goto L3b9;
                case 2: goto L334;
                case 3: goto L3a8;
                case 4: goto L397;
                case 5: goto L382;
                case 6: goto L371;
                case 7: goto L35c;
                case 8: goto L358;
                case 9: goto L353;
                case 10: goto L348;
                default: goto L334;
            }
        L334:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r8)
            int r3 = r11.f637a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L348:
            androidx.lifecycle.e$b r11 = r11.i
            r14.Z(r12, r11)
        L34d:
            r17 = r5
        L34f:
            r19 = 1
            goto L3ce
        L353:
            r11 = 0
            r14.a0(r11)
            goto L34d
        L358:
            r14.a0(r12)
            goto L34d
        L35c:
            int r13 = r11.d
            int r15 = r11.e
            r17 = r5
            int r5 = r11.f
            int r11 = r11.g
            r12.D(r13, r15, r5, r11)
            r5 = 0
            r14.Y(r12, r5)
            r14.c(r12)
            goto L34f
        L371:
            r17 = r5
            int r5 = r11.d
            int r13 = r11.e
            int r15 = r11.f
            int r11 = r11.g
            r12.D(r5, r13, r15, r11)
            r14.h(r12)
            goto L34f
        L382:
            r17 = r5
            int r5 = r11.d
            int r13 = r11.e
            int r15 = r11.f
            int r11 = r11.g
            r12.D(r5, r13, r15, r11)
            r5 = 0
            r14.Y(r12, r5)
            c0(r12)
            goto L34f
        L397:
            r17 = r5
            int r5 = r11.d
            int r13 = r11.e
            int r15 = r11.f
            int r11 = r11.g
            r12.D(r5, r13, r15, r11)
            r14.I(r12)
            goto L34f
        L3a8:
            r17 = r5
            int r5 = r11.d
            int r13 = r11.e
            int r15 = r11.f
            int r11 = r11.g
            r12.D(r5, r13, r15, r11)
            r14.T(r12)
            goto L34f
        L3b9:
            r17 = r5
            int r5 = r11.d
            int r13 = r11.e
            int r15 = r11.f
            int r11 = r11.g
            r12.D(r5, r13, r15, r11)
            r5 = 0
            r14.Y(r12, r5)
            r14.a(r12)
            goto L34f
        L3ce:
            int r10 = r10 + 1
            r5 = r17
            goto L2fd
        L3d4:
            r19 = 1
            goto L2ee
        L3d8:
            int r5 = r17 + 1
            r16 = -1
            goto L1e6
        L3de:
            r19 = 1
            int r5 = r4 + (-1)
            java.lang.Object r5 = r2.get(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            java.util.ArrayList<a.e7$h> r6 = r1.m
            if (r23 == 0) goto L45f
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L45f
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            java.util.Iterator r8 = r0.iterator()
        L3ff:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L413
            java.lang.Object r9 = r8.next()
            a.S1 r9 = (a.S1) r9
            java.util.HashSet r9 = E(r9)
            r7.addAll(r9)
            goto L3ff
        L413:
            a.S1 r8 = r1.h
            if (r8 != 0) goto L45f
            java.util.Iterator r8 = r6.iterator()
        L41b:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L43b
            java.lang.Object r9 = r8.next()
            a.e7$h r9 = (a.AbstractC0119e7.h) r9
            java.util.Iterator r10 = r7.iterator()
        L42b:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L41b
            java.lang.Object r11 = r10.next()
            androidx.fragment.app.b r11 = (androidx.fragment.app.b) r11
            r9.getClass()
            goto L42b
        L43b:
            java.util.Iterator r8 = r6.iterator()
        L43f:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L45f
            java.lang.Object r9 = r8.next()
            a.e7$h r9 = (a.AbstractC0119e7.h) r9
            java.util.Iterator r10 = r7.iterator()
        L44f:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L43f
            java.lang.Object r11 = r10.next()
            androidx.fragment.app.b r11 = (androidx.fragment.app.b) r11
            r9.getClass()
            goto L44f
        L45f:
            r7 = r3
        L460:
            if (r7 >= r4) goto L4b0
            java.lang.Object r8 = r0.get(r7)
            a.S1 r8 = (a.S1) r8
            if (r5 == 0) goto L490
            java.util.ArrayList<a.p7$a> r9 = r8.f636a
            int r9 = r9.size()
            r19 = 1
            int r9 = r9 + (-1)
        L474:
            if (r9 < 0) goto L48e
            java.util.ArrayList<a.p7$a> r10 = r8.f636a
            java.lang.Object r10 = r10.get(r9)
            a.p7$a r10 = (a.AbstractC0316p7.a) r10
            androidx.fragment.app.b r10 = r10.b
            if (r10 == 0) goto L489
            androidx.fragment.app.e r10 = r1.g(r10)
            r10.k()
        L489:
            r16 = -1
            int r9 = r9 + (-1)
            goto L474
        L48e:
            r10 = 1
            goto L4ae
        L490:
            java.util.ArrayList<a.p7$a> r8 = r8.f636a
            java.util.Iterator r8 = r8.iterator()
        L496:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L48e
            java.lang.Object r9 = r8.next()
            a.p7$a r9 = (a.AbstractC0316p7.a) r9
            androidx.fragment.app.b r9 = r9.b
            if (r9 == 0) goto L496
            androidx.fragment.app.e r9 = r1.g(r9)
            r9.k()
            goto L496
        L4ae:
            int r7 = r7 + r10
            goto L460
        L4b0:
            r10 = 1
            int r7 = r1.u
            r1.O(r7, r10)
            java.util.HashSet r7 = r1.f(r0, r3, r4)
            java.util.Iterator r7 = r7.iterator()
        L4be:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L551
            java.lang.Object r8 = r7.next()
            androidx.fragment.app.f r8 = (androidx.fragment.app.f) r8
            r8.d = r5
            java.util.ArrayList r9 = r8.b
            monitor-enter(r9)
            r8.k()     // Catch: java.lang.Throwable -> L53d
            java.util.ArrayList r10 = r8.b     // Catch: java.lang.Throwable -> L53d
            int r11 = r10.size()     // Catch: java.lang.Throwable -> L53d
            java.util.ListIterator r10 = r10.listIterator(r11)     // Catch: java.lang.Throwable -> L53d
        L4dc:
            boolean r11 = r10.hasPrevious()     // Catch: java.lang.Throwable -> L53d
            if (r11 == 0) goto L53f
            java.lang.Object r11 = r10.previous()     // Catch: java.lang.Throwable -> L53d
            r12 = r11
            androidx.fragment.app.f$c r12 = (androidx.fragment.app.f.c) r12     // Catch: java.lang.Throwable -> L53d
            androidx.fragment.app.b r13 = r12.c     // Catch: java.lang.Throwable -> L53d
            android.view.View r13 = r13.G     // Catch: java.lang.Throwable -> L53d
            java.lang.String r14 = "operation.fragment.mView"
            a.C0193i9.d(r13, r14)     // Catch: java.lang.Throwable -> L53d
            float r14 = r13.getAlpha()     // Catch: java.lang.Throwable -> L53d
            r15 = 0
            int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r14 != 0) goto L506
            int r14 = r13.getVisibility()     // Catch: java.lang.Throwable -> L53d
            if (r14 != 0) goto L506
            androidx.fragment.app.f$c$b r13 = androidx.fragment.app.f.c.b.d     // Catch: java.lang.Throwable -> L53d
            r14 = 8
            goto L533
        L506:
            int r13 = r13.getVisibility()     // Catch: java.lang.Throwable -> L53d
            if (r13 == 0) goto L52f
            r14 = 4
            if (r13 == r14) goto L52a
            r14 = 8
            if (r13 != r14) goto L516
            androidx.fragment.app.f$c$b r13 = androidx.fragment.app.f.c.b.c     // Catch: java.lang.Throwable -> L53d
            goto L533
        L516:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L53d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L53d
            java.lang.String r3 = "Unknown visibility "
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L53d
            r2.append(r13)     // Catch: java.lang.Throwable -> L53d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L53d
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L53d
            throw r0     // Catch: java.lang.Throwable -> L53d
        L52a:
            r14 = 8
            androidx.fragment.app.f$c$b r13 = androidx.fragment.app.f.c.b.d     // Catch: java.lang.Throwable -> L53d
            goto L533
        L52f:
            r14 = 8
            androidx.fragment.app.f$c$b r13 = androidx.fragment.app.f.c.b.b     // Catch: java.lang.Throwable -> L53d
        L533:
            androidx.fragment.app.f$c$b r12 = r12.f917a     // Catch: java.lang.Throwable -> L53d
            androidx.fragment.app.f$c$b r15 = androidx.fragment.app.f.c.b.b     // Catch: java.lang.Throwable -> L53d
            if (r12 != r15) goto L4dc
            if (r13 == r15) goto L4dc
            r10 = r11
            goto L542
        L53d:
            r0 = move-exception
            goto L54f
        L53f:
            r14 = 8
            r10 = 0
        L542:
            androidx.fragment.app.f$c r10 = (androidx.fragment.app.f.c) r10     // Catch: java.lang.Throwable -> L53d
            r10 = 0
            r8.e = r10     // Catch: java.lang.Throwable -> L53d
            a.Wf r11 = a.Wf.f330a     // Catch: java.lang.Throwable -> L53d
            monitor-exit(r9)
            r8.e()
            goto L4be
        L54f:
            monitor-exit(r9)
            throw r0
        L551:
            r10 = 0
        L552:
            if (r3 >= r4) goto L598
            java.lang.Object r5 = r0.get(r3)
            a.S1 r5 = (a.S1) r5
            java.lang.Object r7 = r2.get(r3)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L56e
            int r7 = r5.s
            if (r7 < 0) goto L56e
            r7 = -1
            r5.s = r7
            goto L56f
        L56e:
            r7 = -1
        L56f:
            java.util.ArrayList<java.lang.Runnable> r8 = r5.p
            if (r8 == 0) goto L592
            r8 = r10
        L574:
            java.util.ArrayList<java.lang.Runnable> r9 = r5.p
            int r9 = r9.size()
            if (r8 >= r9) goto L58c
            java.util.ArrayList<java.lang.Runnable> r9 = r5.p
            java.lang.Object r9 = r9.get(r8)
            java.lang.Runnable r9 = (java.lang.Runnable) r9
            r9.run()
            r19 = 1
            int r8 = r8 + 1
            goto L574
        L58c:
            r11 = 0
            r19 = 1
            r5.p = r11
            goto L595
        L592:
            r11 = 0
            r19 = 1
        L595:
            int r3 = r3 + 1
            goto L552
        L598:
            r19 = 1
            if (r23 == 0) goto L5af
            r7 = r10
        L59d:
            int r0 = r6.size()
            if (r7 >= r0) goto L5af
            java.lang.Object r0 = r6.get(r7)
            a.e7$h r0 = (a.AbstractC0119e7.h) r0
            r0.a()
            int r7 = r7 + 1
            goto L59d
        L5af:
            return
    }

    public final androidx.fragment.app.b C(int r6) {
            r5 = this;
            a.A2 r0 = r5.c
            java.lang.Object r1 = r0.f7a
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            int r2 = r2 + (-1)
        Lc:
            if (r2 < 0) goto L1e
            java.lang.Object r3 = r1.get(r2)
            androidx.fragment.app.b r3 = (androidx.fragment.app.b) r3
            if (r3 == 0) goto L1b
            int r4 = r3.x
            if (r4 != r6) goto L1b
            return r3
        L1b:
            int r2 = r2 + (-1)
            goto Lc
        L1e:
            java.lang.Object r0 = r0.b
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L2a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.e r1 = (androidx.fragment.app.e) r1
            if (r1 == 0) goto L2a
            androidx.fragment.app.b r1 = r1.c
            int r2 = r1.x
            if (r2 != r6) goto L2a
            return r1
        L3f:
            r6 = 0
            return r6
    }

    public final void D() {
            r4 = this;
            java.util.HashSet r0 = r4.e()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.f r1 = (androidx.fragment.app.f) r1
            boolean r2 = r1.e
            if (r2 == 0) goto L8
            r2 = 2
            boolean r2 = J(r2)
            if (r2 == 0) goto L26
            java.lang.String r2 = "FragmentManager"
            java.lang.String r3 = "SpecialEffectsController: Forcing postponed operations"
            android.util.Log.v(r2, r3)
        L26:
            r2 = 0
            r1.e = r2
            r1.e()
            goto L8
        L2d:
            return
    }

    public final android.view.ViewGroup F(androidx.fragment.app.b r2) {
            r1 = this;
            android.view.ViewGroup r0 = r2.F
            if (r0 == 0) goto L5
            return r0
        L5:
            int r0 = r2.y
            if (r0 > 0) goto La
            goto L21
        La:
            a.a2 r0 = r1.w
            boolean r0 = r0.f()
            if (r0 == 0) goto L21
            a.a2 r0 = r1.w
            int r2 = r2.y
            android.view.View r2 = r0.c(r2)
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L21
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            return r2
        L21:
            r2 = 0
            return r2
    }

    public final androidx.fragment.app.d G() {
            r1 = this;
            androidx.fragment.app.b r0 = r1.x
            if (r0 == 0) goto Lb
            a.e7 r0 = r0.t
            androidx.fragment.app.d r0 = r0.G()
            return r0
        Lb:
            a.e7$c r0 = r1.z
            return r0
    }

    public final a.InterfaceC0341qe H() {
            r1 = this;
            androidx.fragment.app.b r0 = r1.x
            if (r0 == 0) goto Lb
            a.e7 r0 = r0.t
            a.qe r0 = r0.H()
            return r0
        Lb:
            a.e7$d r0 = r1.A
            return r0
    }

    public final void I(androidx.fragment.app.b r3) {
            r2 = this;
            r0 = 2
            boolean r0 = J(r0)
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "hide: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1a:
            boolean r0 = r3.A
            if (r0 != 0) goto L29
            r0 = 1
            r3.A = r0
            boolean r1 = r3.K
            r0 = r0 ^ r1
            r3.K = r0
            r2.b0(r3)
        L29:
            return
    }

    public final boolean L() {
            r2 = this;
            androidx.fragment.app.b r0 = r2.x
            r1 = 1
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r0.i()
            if (r0 == 0) goto L19
            androidx.fragment.app.b r0 = r2.x
            a.e7 r0 = r0.f()
            boolean r0 = r0.L()
            if (r0 == 0) goto L19
            return r1
        L19:
            r0 = 0
            return r0
    }

    public final void O(int r4, boolean r5) {
            r3 = this;
            a.X6$a r0 = r3.v
            if (r0 != 0) goto L10
            r0 = -1
            if (r4 != r0) goto L8
            goto L10
        L8:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "No activity"
            r4.<init>(r5)
            throw r4
        L10:
            if (r5 != 0) goto L17
            int r5 = r3.u
            if (r4 != r5) goto L17
            goto L82
        L17:
            r3.u = r4
            a.A2 r4 = r3.c
            java.lang.Object r5 = r4.f7a
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.util.Iterator r5 = r5.iterator()
        L23:
            boolean r0 = r5.hasNext()
            java.lang.Object r1 = r4.b
            java.util.HashMap r1 = (java.util.HashMap) r1
            if (r0 == 0) goto L41
            java.lang.Object r0 = r5.next()
            androidx.fragment.app.b r0 = (androidx.fragment.app.b) r0
            java.lang.String r0 = r0.e
            java.lang.Object r0 = r1.get(r0)
            androidx.fragment.app.e r0 = (androidx.fragment.app.e) r0
            if (r0 == 0) goto L23
            r0.k()
            goto L23
        L41:
            java.util.Collection r5 = r1.values()
            java.util.Iterator r5 = r5.iterator()
        L49:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L6a
            java.lang.Object r0 = r5.next()
            androidx.fragment.app.e r0 = (androidx.fragment.app.e) r0
            if (r0 == 0) goto L49
            r0.k()
            androidx.fragment.app.b r1 = r0.c
            boolean r2 = r1.l
            if (r2 == 0) goto L49
            boolean r1 = r1.k()
            if (r1 != 0) goto L49
            r4.i(r0)
            goto L49
        L6a:
            r3.d0()
            boolean r4 = r3.F
            if (r4 == 0) goto L82
            a.X6$a r4 = r3.v
            if (r4 == 0) goto L82
            int r5 = r3.u
            r0 = 7
            if (r5 != r0) goto L82
            a.X6 r4 = r4.e
            r4.invalidateMenu()
            r4 = 0
            r3.F = r4
        L82:
            return
    }

    public final void P() {
            r2 = this;
            a.X6$a r0 = r2.v
            if (r0 != 0) goto L5
            goto L2c
        L5:
            r0 = 0
            r2.G = r0
            r2.H = r0
            a.k7 r1 = r2.N
            r1.i = r0
            a.A2 r0 = r2.c
            java.util.List r0 = r0.g()
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.b r1 = (androidx.fragment.app.b) r1
            if (r1 == 0) goto L18
            a.i7 r1 = r1.v
            r1.P()
            goto L18
        L2c:
            return
    }

    public final boolean Q() {
            r2 = this;
            r0 = -1
            r1 = 0
            boolean r0 = r2.R(r0, r1)
            return r0
    }

    public final boolean R(int r5, int r6) {
            r4 = this;
            r0 = 0
            r4.z(r0)
            r1 = 1
            r4.y(r1)
            androidx.fragment.app.b r2 = r4.y
            if (r2 == 0) goto L19
            if (r5 >= 0) goto L19
            a.e7 r2 = r2.c()
            boolean r2 = r2.Q()
            if (r2 == 0) goto L19
            return r1
        L19:
            java.util.ArrayList<a.S1> r2 = r4.K
            java.util.ArrayList<java.lang.Boolean> r3 = r4.L
            boolean r5 = r4.S(r2, r3, r5, r6)
            if (r5 == 0) goto L35
            r4.b = r1
            java.util.ArrayList<a.S1> r6 = r4.K     // Catch: java.lang.Throwable -> L30
            java.util.ArrayList<java.lang.Boolean> r1 = r4.L     // Catch: java.lang.Throwable -> L30
            r4.U(r6, r1)     // Catch: java.lang.Throwable -> L30
            r4.d()
            goto L35
        L30:
            r5 = move-exception
            r4.d()
            throw r5
        L35:
            r4.f0()
            boolean r6 = r4.J
            if (r6 == 0) goto L41
            r4.J = r0
            r4.d0()
        L41:
            a.A2 r6 = r4.c
            java.lang.Object r6 = r6.b
            java.util.HashMap r6 = (java.util.HashMap) r6
            java.util.Collection r6 = r6.values()
            r0 = 0
            java.util.Set r0 = java.util.Collections.singleton(r0)
            r6.removeAll(r0)
            return r5
    }

    public final boolean S(java.util.ArrayList r6, java.util.ArrayList r7, int r8, int r9) {
            r5 = this;
            r0 = 1
            r9 = r9 & r0
            r1 = 0
            if (r9 == 0) goto L7
            r9 = r0
            goto L8
        L7:
            r9 = r1
        L8:
            java.util.ArrayList<a.S1> r2 = r5.d
            boolean r2 = r2.isEmpty()
            r3 = -1
            if (r2 == 0) goto L12
            goto L64
        L12:
            if (r8 >= 0) goto L21
            if (r9 == 0) goto L18
            r3 = r1
            goto L64
        L18:
            java.util.ArrayList<a.S1> r8 = r5.d
            int r8 = r8.size()
            int r3 = r8 + (-1)
            goto L64
        L21:
            java.util.ArrayList<a.S1> r2 = r5.d
            int r2 = r2.size()
            int r2 = r2 - r0
        L28:
            if (r2 < 0) goto L3c
            java.util.ArrayList<a.S1> r4 = r5.d
            java.lang.Object r4 = r4.get(r2)
            a.S1 r4 = (a.S1) r4
            if (r8 < 0) goto L39
            int r4 = r4.s
            if (r8 != r4) goto L39
            goto L3c
        L39:
            int r2 = r2 + (-1)
            goto L28
        L3c:
            if (r2 >= 0) goto L40
            r3 = r2
            goto L64
        L40:
            if (r9 == 0) goto L58
            r3 = r2
        L43:
            if (r3 <= 0) goto L64
            java.util.ArrayList<a.S1> r9 = r5.d
            int r2 = r3 + (-1)
            java.lang.Object r9 = r9.get(r2)
            a.S1 r9 = (a.S1) r9
            if (r8 < 0) goto L64
            int r9 = r9.s
            if (r8 != r9) goto L64
            int r3 = r3 + (-1)
            goto L43
        L58:
            java.util.ArrayList<a.S1> r8 = r5.d
            int r8 = r8.size()
            int r8 = r8 - r0
            if (r2 != r8) goto L62
            goto L64
        L62:
            int r3 = r2 + 1
        L64:
            if (r3 >= 0) goto L67
            return r1
        L67:
            java.util.ArrayList<a.S1> r8 = r5.d
            int r8 = r8.size()
            int r8 = r8 - r0
        L6e:
            if (r8 < r3) goto L83
            java.util.ArrayList<a.S1> r9 = r5.d
            java.lang.Object r9 = r9.remove(r8)
            a.S1 r9 = (a.S1) r9
            r6.add(r9)
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            r7.add(r9)
            int r8 = r8 + (-1)
            goto L6e
        L83:
            return r0
    }

    public final void T(androidx.fragment.app.b r3) {
            r2 = this;
            r0 = 2
            boolean r0 = J(r0)
            if (r0 == 0) goto L24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "remove: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = " nesting="
            r0.append(r1)
            int r1 = r3.s
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L24:
            boolean r0 = r3.k()
            boolean r1 = r3.B
            if (r1 == 0) goto L30
            if (r0 != 0) goto L2f
            goto L30
        L2f:
            return
        L30:
            a.A2 r0 = r2.c
            java.lang.Object r1 = r0.f7a
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            monitor-enter(r1)
            java.lang.Object r0 = r0.f7a     // Catch: java.lang.Throwable -> L51
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L51
            r0.remove(r3)     // Catch: java.lang.Throwable -> L51
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L51
            r0 = 0
            r3.k = r0
            boolean r0 = K(r3)
            r1 = 1
            if (r0 == 0) goto L4b
            r2.F = r1
        L4b:
            r3.l = r1
            r2.b0(r3)
            return
        L51:
            r3 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L51
            throw r3
    }

    public final void U(java.util.ArrayList<a.S1> r5, java.util.ArrayList<java.lang.Boolean> r6) {
            r4 = this;
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L7
            goto L5e
        L7:
            int r0 = r5.size()
            int r1 = r6.size()
            if (r0 != r1) goto L5f
            int r0 = r5.size()
            r1 = 0
            r2 = r1
        L17:
            if (r1 >= r0) goto L59
            java.lang.Object r3 = r5.get(r1)
            a.S1 r3 = (a.S1) r3
            boolean r3 = r3.o
            if (r3 != 0) goto L56
            if (r2 == r1) goto L28
            r4.B(r5, r6, r2, r1)
        L28:
            int r2 = r1 + 1
            java.lang.Object r3 = r6.get(r1)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L51
        L36:
            if (r2 >= r0) goto L51
            java.lang.Object r3 = r6.get(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L51
            java.lang.Object r3 = r5.get(r2)
            a.S1 r3 = (a.S1) r3
            boolean r3 = r3.o
            if (r3 != 0) goto L51
            int r2 = r2 + 1
            goto L36
        L51:
            r4.B(r5, r6, r1, r2)
            int r1 = r2 + (-1)
        L56:
            int r1 = r1 + 1
            goto L17
        L59:
            if (r2 == r0) goto L5e
            r4.B(r5, r6, r2, r0)
        L5e:
            return
        L5f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Internal error with the back stack records"
            r5.<init>(r6)
            throw r5
    }

    public final void V(android.os.Bundle r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            java.util.Set r2 = r1.keySet()
            java.util.Iterator r2 = r2.iterator()
        Lc:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3c
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "result_"
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto Lc
            android.os.Bundle r4 = r1.getBundle(r3)
            if (r4 == 0) goto Lc
            a.X6$a r5 = r0.v
            a.X6 r5 = r5.b
            java.lang.ClassLoader r5 = r5.getClassLoader()
            r4.setClassLoader(r5)
            r5 = 7
            java.lang.String r3 = r3.substring(r5)
            java.util.Map<java.lang.String, android.os.Bundle> r5 = r0.l
            r5.put(r3, r4)
            goto Lc
        L3c:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Set r3 = r1.keySet()
            java.util.Iterator r3 = r3.iterator()
        L49:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L78
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "fragment_"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L49
            android.os.Bundle r5 = r1.getBundle(r4)
            if (r5 == 0) goto L49
            a.X6$a r6 = r0.v
            a.X6 r6 = r6.b
            java.lang.ClassLoader r6 = r6.getClassLoader()
            r5.setClassLoader(r6)
            r6 = 9
            java.lang.String r4 = r4.substring(r6)
            r2.put(r4, r5)
            goto L49
        L78:
            a.A2 r3 = r0.c
            java.lang.Object r4 = r3.c
            java.util.HashMap r4 = (java.util.HashMap) r4
            r4.clear()
            r4.putAll(r2)
            java.lang.String r2 = "state"
            android.os.Parcelable r1 = r1.getParcelable(r2)
            a.j7 r1 = (a.C0208j7) r1
            if (r1 != 0) goto L8f
            return
        L8f:
            java.lang.Object r4 = r3.b
            java.util.HashMap r4 = (java.util.HashMap) r4
            r4.clear()
            java.util.ArrayList<java.lang.String> r5 = r1.f529a
            java.util.Iterator r5 = r5.iterator()
        L9c:
            boolean r6 = r5.hasNext()
            r7 = 2
            a.b7 r8 = r0.n
            java.lang.String r9 = "): "
            java.lang.String r10 = "FragmentManager"
            if (r6 == 0) goto L137
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            r11 = 0
            android.os.Bundle r6 = r3.j(r6, r11)
            if (r6 == 0) goto L9c
            android.os.Parcelable r11 = r6.getParcelable(r2)
            a.n7 r11 = (a.C0280n7) r11
            a.k7 r12 = r0.N
            java.lang.String r11 = r11.b
            java.util.HashMap<java.lang.String, androidx.fragment.app.b> r12 = r12.d
            java.lang.Object r11 = r12.get(r11)
            androidx.fragment.app.b r11 = (androidx.fragment.app.b) r11
            if (r11 == 0) goto Le7
            boolean r12 = J(r7)
            if (r12 == 0) goto Le1
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "restoreSaveState: re-attaching retained "
            r12.<init>(r13)
            r12.append(r11)
            java.lang.String r12 = r12.toString()
            android.util.Log.v(r10, r12)
        Le1:
            androidx.fragment.app.e r12 = new androidx.fragment.app.e
            r12.<init>(r8, r3, r11, r6)
            goto Lfe
        Le7:
            androidx.fragment.app.e r12 = new androidx.fragment.app.e
            a.X6$a r8 = r0.v
            a.X6 r8 = r8.b
            java.lang.ClassLoader r15 = r8.getClassLoader()
            androidx.fragment.app.d r16 = r0.G()
            a.b7 r13 = r0.n
            a.A2 r14 = r0.c
            r17 = r6
            r12.<init>(r13, r14, r15, r16, r17)
        Lfe:
            androidx.fragment.app.b r8 = r12.c
            r8.b = r6
            r8.t = r0
            boolean r6 = J(r7)
            if (r6 == 0) goto L123
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "restoreSaveState: active ("
            r6.<init>(r7)
            java.lang.String r7 = r8.e
            r6.append(r7)
            r6.append(r9)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            android.util.Log.v(r10, r6)
        L123:
            a.X6$a r6 = r0.v
            a.X6 r6 = r6.b
            java.lang.ClassLoader r6 = r6.getClassLoader()
            r12.m(r6)
            r3.h(r12)
            int r6 = r0.u
            r12.e = r6
            goto L9c
        L137:
            a.k7 r2 = r0.N
            r2.getClass()
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.HashMap<java.lang.String, androidx.fragment.app.b> r2 = r2.d
            java.util.Collection r2 = r2.values()
            r5.<init>(r2)
            java.util.Iterator r2 = r5.iterator()
        L14b:
            boolean r5 = r2.hasNext()
            r6 = 1
            if (r5 == 0) goto L199
            java.lang.Object r5 = r2.next()
            androidx.fragment.app.b r5 = (androidx.fragment.app.b) r5
            java.lang.String r11 = r5.e
            java.lang.Object r11 = r4.get(r11)
            if (r11 == 0) goto L161
            goto L14b
        L161:
            boolean r11 = J(r7)
            if (r11 == 0) goto L182
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Discarding retained Fragment "
            r11.<init>(r12)
            r11.append(r5)
            java.lang.String r12 = " that was not found in the set of active Fragments "
            r11.append(r12)
            java.util.ArrayList<java.lang.String> r12 = r1.f529a
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            android.util.Log.v(r10, r11)
        L182:
            a.k7 r11 = r0.N
            r11.f(r5)
            r5.t = r0
            androidx.fragment.app.e r11 = new androidx.fragment.app.e
            r11.<init>(r8, r3, r5)
            r11.e = r6
            r11.k()
            r5.l = r6
            r11.k()
            goto L14b
        L199:
            java.util.ArrayList<java.lang.String> r2 = r1.b
            java.lang.Object r4 = r3.f7a
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r4.clear()
            if (r2 == 0) goto L1e9
            java.util.Iterator r2 = r2.iterator()
        L1a8:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L1e9
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            androidx.fragment.app.b r5 = r3.c(r4)
            if (r5 == 0) goto L1db
            boolean r8 = J(r7)
            if (r8 == 0) goto L1d7
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r11 = "restoreSaveState: added ("
            r8.<init>(r11)
            r8.append(r4)
            r8.append(r9)
            r8.append(r5)
            java.lang.String r4 = r8.toString()
            android.util.Log.v(r10, r4)
        L1d7:
            r3.a(r5)
            goto L1a8
        L1db:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "No instantiated fragment for ("
            java.lang.String r3 = ")"
            java.lang.String r2 = a.C0487z.g(r2, r4, r3)
            r1.<init>(r2)
            throw r1
        L1e9:
            a.T1[] r2 = r1.c
            if (r2 == 0) goto L32a
            java.util.ArrayList r2 = new java.util.ArrayList
            a.T1[] r5 = r1.c
            int r5 = r5.length
            r2.<init>(r5)
            r0.d = r2
            r2 = 0
        L1f8:
            a.T1[] r5 = r1.c
            int r8 = r5.length
            if (r2 >= r8) goto L328
            r5 = r5[r2]
            r5.getClass()
            a.S1 r8 = new a.S1
            r8.<init>(r0)
            r11 = 0
            r12 = 0
        L209:
            int[] r13 = r5.f268a
            int r14 = r13.length
            if (r11 >= r14) goto L290
            a.p7$a r14 = new a.p7$a
            r14.<init>()
            int r15 = r11 + 1
            r19 = r7
            r7 = r13[r11]
            r14.f637a = r7
            boolean r7 = J(r19)
            if (r7 == 0) goto L244
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r4 = "Instantiate "
            r7.<init>(r4)
            r7.append(r8)
            java.lang.String r4 = " op #"
            r7.append(r4)
            r7.append(r12)
            java.lang.String r4 = " base fragment #"
            r7.append(r4)
            r4 = r13[r15]
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            android.util.Log.v(r10, r4)
        L244:
            androidx.lifecycle.e$b[] r4 = androidx.lifecycle.e.b.values()
            int[] r7 = r5.c
            r7 = r7[r12]
            r4 = r4[r7]
            r14.h = r4
            androidx.lifecycle.e$b[] r4 = androidx.lifecycle.e.b.values()
            int[] r7 = r5.d
            r7 = r7[r12]
            r4 = r4[r7]
            r14.i = r4
            int r4 = r11 + 2
            r7 = r13[r15]
            if (r7 == 0) goto L264
            r7 = r6
            goto L265
        L264:
            r7 = 0
        L265:
            r14.c = r7
            int r7 = r11 + 3
            r4 = r13[r4]
            r14.d = r4
            int r15 = r11 + 4
            r7 = r13[r7]
            r14.e = r7
            int r17 = r11 + 5
            r15 = r13[r15]
            r14.f = r15
            int r11 = r11 + 6
            r13 = r13[r17]
            r14.g = r13
            r8.b = r4
            r8.c = r7
            r8.d = r15
            r8.e = r13
            r8.b(r14)
            int r12 = r12 + 1
            r7 = r19
            goto L209
        L290:
            r19 = r7
            int r4 = r5.e
            r8.f = r4
            java.lang.String r4 = r5.f
            r8.h = r4
            r8.g = r6
            int r4 = r5.h
            r8.i = r4
            java.lang.CharSequence r4 = r5.i
            r8.j = r4
            int r4 = r5.j
            r8.k = r4
            java.lang.CharSequence r4 = r5.k
            r8.l = r4
            java.util.ArrayList<java.lang.String> r4 = r5.l
            r8.m = r4
            java.util.ArrayList<java.lang.String> r4 = r5.m
            r8.n = r4
            boolean r4 = r5.n
            r8.o = r4
            int r4 = r5.g
            r8.s = r4
            r4 = 0
        L2bd:
            java.util.ArrayList<java.lang.String> r7 = r5.b
            int r11 = r7.size()
            if (r4 >= r11) goto L2de
            java.lang.Object r7 = r7.get(r4)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L2db
            java.util.ArrayList<a.p7$a> r11 = r8.f636a
            java.lang.Object r11 = r11.get(r4)
            a.p7$a r11 = (a.AbstractC0316p7.a) r11
            androidx.fragment.app.b r7 = r3.c(r7)
            r11.b = r7
        L2db:
            int r4 = r4 + 1
            goto L2bd
        L2de:
            r8.c(r6)
            boolean r4 = J(r19)
            if (r4 == 0) goto L31c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "restoreAllState: back stack #"
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r5 = " (index "
            r4.append(r5)
            int r5 = r8.s
            r4.append(r5)
            r4.append(r9)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            android.util.Log.v(r10, r4)
            a.M9 r4 = new a.M9
            r4.<init>()
            java.io.PrintWriter r5 = new java.io.PrintWriter
            r5.<init>(r4)
            java.lang.String r4 = "  "
            r7 = 0
            r8.f(r4, r5, r7)
            r5.close()
            goto L31d
        L31c:
            r7 = 0
        L31d:
            java.util.ArrayList<a.S1> r4 = r0.d
            r4.add(r8)
            int r2 = r2 + 1
            r7 = r19
            goto L1f8
        L328:
            r7 = 0
            goto L332
        L32a:
            r7 = 0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.d = r2
        L332:
            java.util.concurrent.atomic.AtomicInteger r2 = r0.j
            int r4 = r1.d
            r2.set(r4)
            java.lang.String r2 = r1.e
            if (r2 == 0) goto L346
            androidx.fragment.app.b r2 = r3.c(r2)
            r0.y = r2
            r0.r(r2)
        L346:
            java.util.ArrayList<java.lang.String> r2 = r1.f
            if (r2 == 0) goto L367
            r4 = r7
        L34b:
            int r3 = r2.size()
            if (r4 >= r3) goto L367
            java.lang.Object r3 = r2.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            java.util.ArrayList<a.U1> r5 = r1.g
            java.lang.Object r5 = r5.get(r4)
            a.U1 r5 = (a.U1) r5
            java.util.Map<java.lang.String, a.U1> r6 = r0.k
            r6.put(r3, r5)
            int r4 = r4 + 1
            goto L34b
        L367:
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            java.util.ArrayList<a.e7$g> r1 = r1.h
            r2.<init>(r1)
            r0.E = r2
            return
    }

    public final android.os.Bundle W() {
            r14 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r14.D()
            r14.w()
            r1 = 1
            r14.z(r1)
            r14.G = r1
            a.k7 r2 = r14.N
            r2.i = r1
            a.A2 r1 = r14.c
            r1.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            java.lang.Object r3 = r1.b
            java.util.HashMap r3 = (java.util.HashMap) r3
            int r4 = r3.size()
            r2.<init>(r4)
            java.util.Collection r3 = r3.values()
            java.util.Iterator r3 = r3.iterator()
        L2f:
            boolean r4 = r3.hasNext()
            r5 = 0
            r6 = 2
            if (r4 == 0) goto Lf1
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.e r4 = (androidx.fragment.app.e) r4
            if (r4 == 0) goto L2f
            androidx.fragment.app.b r7 = r4.c
            java.lang.String r8 = r7.e
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            androidx.fragment.app.b r10 = r4.c
            int r11 = r10.f905a
            r12 = -1
            if (r11 != r12) goto L56
            android.os.Bundle r11 = r10.b
            if (r11 == 0) goto L56
            r9.putAll(r11)
        L56:
            a.n7 r11 = new a.n7
            r11.<init>(r10)
            java.lang.String r13 = "state"
            r9.putParcelable(r13, r11)
            int r11 = r10.f905a
            if (r11 <= r12) goto Lbb
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>()
            r10.t(r11)
            boolean r12 = r11.isEmpty()
            if (r12 != 0) goto L77
            java.lang.String r12 = "savedInstanceState"
            r9.putBundle(r12, r11)
        L77:
            a.b7 r12 = r4.f913a
            r12.j(r10, r11, r5)
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            a.Kd r11 = r10.R
            r11.c(r5)
            boolean r11 = r5.isEmpty()
            if (r11 != 0) goto L91
            java.lang.String r11 = "registryState"
            r9.putBundle(r11, r5)
        L91:
            a.i7 r5 = r10.v
            android.os.Bundle r5 = r5.W()
            boolean r11 = r5.isEmpty()
            if (r11 != 0) goto La2
            java.lang.String r11 = "childFragmentManager"
            r9.putBundle(r11, r5)
        La2:
            android.view.View r5 = r10.G
            if (r5 == 0) goto La9
            r4.o()
        La9:
            android.util.SparseArray<android.os.Parcelable> r4 = r10.c
            if (r4 == 0) goto Lb2
            java.lang.String r5 = "viewState"
            r9.putSparseParcelableArray(r5, r4)
        Lb2:
            android.os.Bundle r4 = r10.d
            if (r4 == 0) goto Lbb
            java.lang.String r5 = "viewRegistryState"
            r9.putBundle(r5, r4)
        Lbb:
            android.os.Bundle r4 = r10.f
            if (r4 == 0) goto Lc4
            java.lang.String r5 = "arguments"
            r9.putBundle(r5, r4)
        Lc4:
            r1.j(r8, r9)
            java.lang.String r4 = r7.e
            r2.add(r4)
            boolean r4 = J(r6)
            if (r4 == 0) goto L2f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Saved state of "
            r4.<init>(r5)
            r4.append(r7)
            java.lang.String r5 = ": "
            r4.append(r5)
            android.os.Bundle r5 = r7.b
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "FragmentManager"
            android.util.Log.v(r5, r4)
            goto L2f
        Lf1:
            a.A2 r1 = r14.c
            java.lang.Object r1 = r1.c
            java.util.HashMap r1 = (java.util.HashMap) r1
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L10b
            boolean r1 = J(r6)
            if (r1 == 0) goto L241
            java.lang.String r1 = "FragmentManager"
            java.lang.String r2 = "saveAllState: no fragments!"
            android.util.Log.v(r1, r2)
            return r0
        L10b:
            a.A2 r3 = r14.c
            java.lang.Object r4 = r3.f7a
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            monitor-enter(r4)
            java.lang.Object r7 = r3.f7a     // Catch: java.lang.Throwable -> L120
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch: java.lang.Throwable -> L120
            boolean r7 = r7.isEmpty()     // Catch: java.lang.Throwable -> L120
            r8 = 0
            if (r7 == 0) goto L123
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L120
            r7 = r8
            goto L171
        L120:
            r0 = move-exception
            goto L242
        L123:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L120
            java.lang.Object r9 = r3.f7a     // Catch: java.lang.Throwable -> L120
            java.util.ArrayList r9 = (java.util.ArrayList) r9     // Catch: java.lang.Throwable -> L120
            int r9 = r9.size()     // Catch: java.lang.Throwable -> L120
            r7.<init>(r9)     // Catch: java.lang.Throwable -> L120
            java.lang.Object r3 = r3.f7a     // Catch: java.lang.Throwable -> L120
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch: java.lang.Throwable -> L120
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L120
        L138:
            boolean r9 = r3.hasNext()     // Catch: java.lang.Throwable -> L120
            if (r9 == 0) goto L170
            java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L120
            androidx.fragment.app.b r9 = (androidx.fragment.app.b) r9     // Catch: java.lang.Throwable -> L120
            java.lang.String r10 = r9.e     // Catch: java.lang.Throwable -> L120
            r7.add(r10)     // Catch: java.lang.Throwable -> L120
            boolean r10 = J(r6)     // Catch: java.lang.Throwable -> L120
            if (r10 == 0) goto L138
            java.lang.String r10 = "FragmentManager"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L120
            r11.<init>()     // Catch: java.lang.Throwable -> L120
            java.lang.String r12 = "saveAllState: adding fragment ("
            r11.append(r12)     // Catch: java.lang.Throwable -> L120
            java.lang.String r12 = r9.e     // Catch: java.lang.Throwable -> L120
            r11.append(r12)     // Catch: java.lang.Throwable -> L120
            java.lang.String r12 = "): "
            r11.append(r12)     // Catch: java.lang.Throwable -> L120
            r11.append(r9)     // Catch: java.lang.Throwable -> L120
            java.lang.String r9 = r11.toString()     // Catch: java.lang.Throwable -> L120
            android.util.Log.v(r10, r9)     // Catch: java.lang.Throwable -> L120
            goto L138
        L170:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L120
        L171:
            java.util.ArrayList<a.S1> r3 = r14.d
            int r3 = r3.size()
            if (r3 <= 0) goto L1b6
            a.T1[] r8 = new a.T1[r3]
        L17b:
            if (r5 >= r3) goto L1b6
            a.T1 r4 = new a.T1
            java.util.ArrayList<a.S1> r9 = r14.d
            java.lang.Object r9 = r9.get(r5)
            a.S1 r9 = (a.S1) r9
            r4.<init>(r9)
            r8[r5] = r4
            boolean r4 = J(r6)
            if (r4 == 0) goto L1b3
            java.lang.String r4 = "FragmentManager"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "saveAllState: adding back stack #"
            r9.<init>(r10)
            r9.append(r5)
            java.lang.String r10 = ": "
            r9.append(r10)
            java.util.ArrayList<a.S1> r10 = r14.d
            java.lang.Object r10 = r10.get(r5)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.util.Log.v(r4, r9)
        L1b3:
            int r5 = r5 + 1
            goto L17b
        L1b6:
            a.j7 r3 = new a.j7
            r3.<init>()
            r3.f529a = r2
            r3.b = r7
            r3.c = r8
            java.util.concurrent.atomic.AtomicInteger r2 = r14.j
            int r2 = r2.get()
            r3.d = r2
            androidx.fragment.app.b r2 = r14.y
            if (r2 == 0) goto L1d1
            java.lang.String r2 = r2.e
            r3.e = r2
        L1d1:
            java.util.ArrayList<java.lang.String> r2 = r3.f
            java.util.Map<java.lang.String, a.U1> r4 = r14.k
            java.util.Set r4 = r4.keySet()
            r2.addAll(r4)
            java.util.ArrayList<a.U1> r2 = r3.g
            java.util.Map<java.lang.String, a.U1> r4 = r14.k
            java.util.Collection r4 = r4.values()
            r2.addAll(r4)
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.ArrayDeque<a.e7$g> r4 = r14.E
            r2.<init>(r4)
            r3.h = r2
            java.lang.String r2 = "state"
            r0.putParcelable(r2, r3)
            java.util.Map<java.lang.String, android.os.Bundle> r2 = r14.l
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L1ff:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L21d
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "result_"
            java.lang.String r4 = a.C0487z.k(r4, r3)
            java.util.Map<java.lang.String, android.os.Bundle> r5 = r14.l
            java.lang.Object r3 = r5.get(r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            r0.putBundle(r4, r3)
            goto L1ff
        L21d:
            java.util.Set r2 = r1.keySet()
            java.util.Iterator r2 = r2.iterator()
        L225:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L241
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "fragment_"
            java.lang.String r4 = a.C0487z.k(r4, r3)
            java.lang.Object r3 = r1.get(r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            r0.putBundle(r4, r3)
            goto L225
        L241:
            return r0
        L242:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L120
            throw r0
    }

    public final void X() {
            r3 = this;
            java.util.ArrayList<a.e7$i> r0 = r3.f452a
            monitor-enter(r0)
            java.util.ArrayList<a.e7$i> r1 = r3.f452a     // Catch: java.lang.Throwable -> L22
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L22
            r2 = 1
            if (r1 != r2) goto L24
            a.X6$a r1 = r3.v     // Catch: java.lang.Throwable -> L22
            android.os.Handler r1 = r1.c     // Catch: java.lang.Throwable -> L22
            a.e7$e r2 = r3.O     // Catch: java.lang.Throwable -> L22
            r1.removeCallbacks(r2)     // Catch: java.lang.Throwable -> L22
            a.X6$a r1 = r3.v     // Catch: java.lang.Throwable -> L22
            android.os.Handler r1 = r1.c     // Catch: java.lang.Throwable -> L22
            a.e7$e r2 = r3.O     // Catch: java.lang.Throwable -> L22
            r1.post(r2)     // Catch: java.lang.Throwable -> L22
            r3.f0()     // Catch: java.lang.Throwable -> L22
            goto L24
        L22:
            r1 = move-exception
            goto L26
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            return
        L26:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r1
    }

    public final void Y(androidx.fragment.app.b r2, boolean r3) {
            r1 = this;
            android.view.ViewGroup r2 = r1.F(r2)
            if (r2 == 0) goto L11
            boolean r0 = r2 instanceof androidx.fragment.app.FragmentContainerView
            if (r0 == 0) goto L11
            androidx.fragment.app.FragmentContainerView r2 = (androidx.fragment.app.FragmentContainerView) r2
            r3 = r3 ^ 1
            r2.setDrawDisappearingViewsLast(r3)
        L11:
            return
    }

    public final void Z(androidx.fragment.app.b r3, androidx.lifecycle.e.b r4) {
            r2 = this;
            java.lang.String r0 = r3.e
            a.A2 r1 = r2.c
            androidx.fragment.app.b r0 = r1.c(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L19
            a.X6$a r0 = r3.u
            if (r0 == 0) goto L16
            a.e7 r0 = r3.t
            if (r0 != r2) goto L19
        L16:
            r3.N = r4
            return
        L19:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Fragment "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = " is not an active fragment of FragmentManager "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    public final androidx.fragment.app.e a(androidx.fragment.app.b r4) {
            r3 = this;
            java.lang.String r0 = r4.M
            if (r0 == 0) goto L7
            a.C0298o7.c(r4, r0)
        L7:
            r0 = 2
            boolean r0 = J(r0)
            if (r0 == 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "add: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L21:
            androidx.fragment.app.e r0 = r3.g(r4)
            r4.t = r3
            a.A2 r1 = r3.c
            r1.h(r0)
            boolean r2 = r4.B
            if (r2 != 0) goto L45
            r1.a(r4)
            r1 = 0
            r4.l = r1
            android.view.View r2 = r4.G
            if (r2 != 0) goto L3c
            r4.K = r1
        L3c:
            boolean r4 = K(r4)
            if (r4 == 0) goto L45
            r4 = 1
            r3.F = r4
        L45:
            return r0
    }

    public final void a0(androidx.fragment.app.b r4) {
            r3 = this;
            if (r4 == 0) goto L35
            java.lang.String r0 = r4.e
            a.A2 r1 = r3.c
            androidx.fragment.app.b r0 = r1.c(r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L19
            a.X6$a r0 = r4.u
            if (r0 == 0) goto L35
            a.e7 r0 = r4.t
            if (r0 != r3) goto L19
            goto L35
        L19:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = " is not an active fragment of FragmentManager "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L35:
            androidx.fragment.app.b r0 = r3.y
            r3.y = r4
            r3.r(r0)
            androidx.fragment.app.b r4 = r3.y
            r3.r(r4)
            return
    }

    public final void b(a.X6.a r4, a.AbstractC0040a2 r5, androidx.fragment.app.b r6) {
            r3 = this;
            a.X6$a r0 = r3.v
            if (r0 != 0) goto L14b
            r3.v = r4
            r3.w = r5
            r3.x = r6
            java.util.concurrent.CopyOnWriteArrayList<a.l7> r5 = r3.o
            if (r6 == 0) goto L17
            a.f7 r0 = new a.f7
            r0.<init>(r6)
            r5.add(r0)
            goto L1c
        L17:
            if (r4 == 0) goto L1c
            r5.add(r4)
        L1c:
            androidx.fragment.app.b r5 = r3.x
            if (r5 == 0) goto L23
            r3.f0()
        L23:
            if (r4 == 0) goto L35
            androidx.activity.OnBackPressedDispatcher r5 = r4.getOnBackPressedDispatcher()
            r3.g = r5
            if (r6 == 0) goto L2f
            r0 = r6
            goto L30
        L2f:
            r0 = r4
        L30:
            a.e7$a r1 = r3.i
            r5.a(r0, r1)
        L35:
            r5 = 0
            if (r6 == 0) goto L57
            a.e7 r4 = r6.t
            a.k7 r4 = r4.N
            java.util.HashMap<java.lang.String, a.k7> r0 = r4.e
            java.lang.String r1 = r6.e
            java.lang.Object r1 = r0.get(r1)
            a.k7 r1 = (a.C0226k7) r1
            if (r1 != 0) goto L54
            a.k7 r1 = new a.k7
            boolean r4 = r4.g
            r1.<init>(r4)
            java.lang.String r4 = r6.e
            r0.put(r4, r1)
        L54:
            r3.N = r1
            goto L8a
        L57:
            if (r4 == 0) goto L83
            a.Fg r4 = r4.getViewModelStore()
            androidx.lifecycle.q r0 = new androidx.lifecycle.q
            a.k7$a r1 = a.C0226k7.j
            r0.<init>(r4, r1)
            java.lang.Class<a.k7> r4 = a.C0226k7.class
            java.lang.String r1 = r4.getCanonicalName()
            if (r1 == 0) goto L7b
            java.lang.String r2 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.String r1 = r2.concat(r1)
            a.Dg r4 = r0.a(r4, r1)
            a.k7 r4 = (a.C0226k7) r4
            r3.N = r4
            goto L8a
        L7b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Local and anonymous classes can not be ViewModels"
            r4.<init>(r5)
            throw r4
        L83:
            a.k7 r4 = new a.k7
            r4.<init>(r5)
            r3.N = r4
        L8a:
            a.k7 r4 = r3.N
            boolean r0 = r3.G
            if (r0 != 0) goto L94
            boolean r0 = r3.H
            if (r0 == 0) goto L95
        L94:
            r5 = 1
        L95:
            r4.i = r5
            a.A2 r5 = r3.c
            r5.d = r4
            a.X6$a r4 = r3.v
            if (r4 == 0) goto Lb9
            if (r6 != 0) goto Lb9
            androidx.savedstate.a r4 = r4.getSavedStateRegistry()
            a.B3 r5 = new a.B3
            r0 = 2
            r5.<init>(r0, r3)
            java.lang.String r0 = "android:support:fragments"
            r4.c(r0, r5)
            android.os.Bundle r4 = r4.a(r0)
            if (r4 == 0) goto Lb9
            r3.V(r4)
        Lb9:
            a.X6$a r4 = r3.v
            if (r4 == 0) goto L11b
            androidx.activity.result.a r4 = r4.getActivityResultRegistry()
            if (r6 == 0) goto Ld1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = r6.e
            java.lang.String r1 = ":"
            java.lang.String r5 = a.C0487z.h(r5, r0, r1)
            goto Ld3
        Ld1:
            java.lang.String r5 = ""
        Ld3:
            java.lang.String r0 = "FragmentManager:"
            java.lang.String r5 = a.C0487z.k(r0, r5)
            java.lang.String r0 = "StartActivityForResult"
            java.lang.String r0 = a.C0487z.f(r5, r0)
            a.a0 r1 = new a.a0
            r1.<init>()
            a.g7 r2 = new a.g7
            r2.<init>(r3)
            a.d0 r0 = r4.d(r0, r1, r2)
            r3.B = r0
            java.lang.String r0 = "StartIntentSenderForResult"
            java.lang.String r0 = a.C0487z.f(r5, r0)
            a.e7$f r1 = new a.e7$f
            r1.<init>()
            a.h7 r2 = new a.h7
            r2.<init>(r3)
            a.d0 r0 = r4.d(r0, r1, r2)
            r3.C = r0
            java.lang.String r0 = "RequestPermissions"
            java.lang.String r5 = a.C0487z.f(r5, r0)
            a.Z r0 = new a.Z
            r0.<init>()
            a.d7 r1 = new a.d7
            r1.<init>(r3)
            a.d0 r4 = r4.d(r5, r0, r1)
            r3.D = r4
        L11b:
            a.X6$a r4 = r3.v
            if (r4 == 0) goto L124
            a.c7 r5 = r3.p
            r4.addOnConfigurationChangedListener(r5)
        L124:
            a.X6$a r4 = r3.v
            if (r4 == 0) goto L12d
            a.c7 r5 = r3.q
            r4.addOnTrimMemoryListener(r5)
        L12d:
            a.X6$a r4 = r3.v
            if (r4 == 0) goto L136
            a.c7 r5 = r3.r
            r4.addOnMultiWindowModeChangedListener(r5)
        L136:
            a.X6$a r4 = r3.v
            if (r4 == 0) goto L13f
            a.c7 r5 = r3.s
            r4.addOnPictureInPictureModeChangedListener(r5)
        L13f:
            a.X6$a r4 = r3.v
            if (r4 == 0) goto L14a
            if (r6 != 0) goto L14a
            a.e7$b r5 = r3.t
            r4.addMenuProvider(r5)
        L14a:
            return
        L14b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Already attached"
            r4.<init>(r5)
            throw r4
    }

    public final void b0(androidx.fragment.app.b r6) {
            r5 = this;
            android.view.ViewGroup r0 = r5.F(r6)
            if (r0 == 0) goto L4d
            androidx.fragment.app.b$d r1 = r6.J
            r2 = 0
            if (r1 != 0) goto Ld
            r3 = r2
            goto Lf
        Ld:
            int r3 = r1.b
        Lf:
            if (r1 != 0) goto L13
            r4 = r2
            goto L15
        L13:
            int r4 = r1.c
        L15:
            int r4 = r4 + r3
            if (r1 != 0) goto L1a
            r3 = r2
            goto L1c
        L1a:
            int r3 = r1.d
        L1c:
            int r3 = r3 + r4
            if (r1 != 0) goto L21
            r1 = r2
            goto L23
        L21:
            int r1 = r1.e
        L23:
            int r1 = r1 + r3
            if (r1 <= 0) goto L4d
            int r1 = androidx.fragment.R.id.visible_removing_fragment_view_tag
            java.lang.Object r1 = r0.getTag(r1)
            if (r1 != 0) goto L33
            int r1 = androidx.fragment.R.id.visible_removing_fragment_view_tag
            r0.setTag(r1, r6)
        L33:
            int r1 = androidx.fragment.R.id.visible_removing_fragment_view_tag
            java.lang.Object r0 = r0.getTag(r1)
            androidx.fragment.app.b r0 = (androidx.fragment.app.b) r0
            androidx.fragment.app.b$d r6 = r6.J
            if (r6 != 0) goto L40
            goto L42
        L40:
            boolean r2 = r6.f909a
        L42:
            androidx.fragment.app.b$d r6 = r0.J
            if (r6 != 0) goto L47
            goto L4d
        L47:
            androidx.fragment.app.b$d r6 = r0.b()
            r6.f909a = r2
        L4d:
            return
    }

    public final void c(androidx.fragment.app.b r5) {
            r4 = this;
            r0 = 2
            boolean r1 = J(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L1a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "attach: "
            r1.<init>(r3)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r2, r1)
        L1a:
            boolean r1 = r5.B
            if (r1 == 0) goto L4a
            r1 = 0
            r5.B = r1
            boolean r1 = r5.k
            if (r1 != 0) goto L4a
            a.A2 r1 = r4.c
            r1.a(r5)
            boolean r0 = J(r0)
            if (r0 == 0) goto L41
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "add from attach: "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r2, r0)
        L41:
            boolean r5 = K(r5)
            if (r5 == 0) goto L4a
            r5 = 1
            r4.F = r5
        L4a:
            return
    }

    public final void d() {
            r1 = this;
            r0 = 0
            r1.b = r0
            java.util.ArrayList<java.lang.Boolean> r0 = r1.L
            r0.clear()
            java.util.ArrayList<a.S1> r0 = r1.K
            r0.clear()
            return
    }

    public final void d0() {
            r4 = this;
            a.A2 r0 = r4.c
            java.util.ArrayList r0 = r0.e()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.e r1 = (androidx.fragment.app.e) r1
            androidx.fragment.app.b r2 = r1.c
            boolean r3 = r2.H
            if (r3 == 0) goto La
            boolean r3 = r4.b
            if (r3 == 0) goto L24
            r1 = 1
            r4.J = r1
            goto La
        L24:
            r3 = 0
            r2.H = r3
            r1.k()
            goto La
        L2b:
            return
    }

    public final java.util.HashSet e() {
            r5 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            a.A2 r1 = r5.c
            java.util.ArrayList r1 = r1.e()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L45
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.e r2 = (androidx.fragment.app.e) r2
            androidx.fragment.app.b r2 = r2.c
            android.view.ViewGroup r2 = r2.F
            if (r2 == 0) goto Lf
            a.qe r3 = r5.H()
            java.lang.String r4 = "factory"
            a.C0193i9.e(r3, r4)
            int r3 = androidx.fragment.R.id.special_effects_controller_view_tag
            java.lang.Object r3 = r2.getTag(r3)
            boolean r4 = r3 instanceof androidx.fragment.app.f
            if (r4 == 0) goto L37
            androidx.fragment.app.f r3 = (androidx.fragment.app.f) r3
            goto L41
        L37:
            androidx.fragment.app.a r3 = new androidx.fragment.app.a
            r3.<init>(r2)
            int r4 = androidx.fragment.R.id.special_effects_controller_view_tag
            r2.setTag(r4, r3)
        L41:
            r0.add(r3)
            goto Lf
        L45:
            return r0
    }

    public final void e0(java.lang.IllegalStateException r8) {
            r7 = this;
            java.lang.String r0 = r8.getMessage()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.e(r1, r0)
            java.lang.String r0 = "Activity state:"
            android.util.Log.e(r1, r0)
            a.M9 r0 = new a.M9
            r0.<init>()
            java.io.PrintWriter r2 = new java.io.PrintWriter
            r2.<init>(r0)
            a.X6$a r0 = r7.v
            java.lang.String r3 = "Failed dumping state"
            r4 = 0
            r5 = 0
            java.lang.String r6 = "  "
            if (r0 == 0) goto L2f
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Exception -> L2a
            a.X6 r0 = r0.e     // Catch: java.lang.Exception -> L2a
            r0.dump(r6, r5, r2, r4)     // Catch: java.lang.Exception -> L2a
            goto L39
        L2a:
            r0 = move-exception
            android.util.Log.e(r1, r3, r0)
            goto L39
        L2f:
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch: java.lang.Exception -> L35
            r7.v(r6, r5, r2, r0)     // Catch: java.lang.Exception -> L35
            goto L39
        L35:
            r0 = move-exception
            android.util.Log.e(r1, r3, r0)
        L39:
            throw r8
    }

    public final java.util.HashSet f(java.util.ArrayList r4, int r5, int r6) {
            r3 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
        L5:
            if (r5 >= r6) goto L32
            java.lang.Object r1 = r4.get(r5)
            a.S1 r1 = (a.S1) r1
            java.util.ArrayList<a.p7$a> r1 = r1.f636a
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r1.next()
            a.p7$a r2 = (a.AbstractC0316p7.a) r2
            androidx.fragment.app.b r2 = r2.b
            if (r2 == 0) goto L13
            android.view.ViewGroup r2 = r2.F
            if (r2 == 0) goto L13
            androidx.fragment.app.f r2 = androidx.fragment.app.f.i(r2, r3)
            r0.add(r2)
            goto L13
        L2f:
            int r5 = r5 + 1
            goto L5
        L32:
            return r0
    }

    public final void f0() {
            r5 = this;
            java.lang.String r0 = "FragmentManager "
            java.util.ArrayList<a.e7$i> r1 = r5.f452a
            monitor-enter(r1)
            java.util.ArrayList<a.e7$i> r2 = r5.f452a     // Catch: java.lang.Throwable -> L37
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L37
            r3 = 3
            r4 = 1
            if (r2 != 0) goto L3b
            a.e7$a r2 = r5.i     // Catch: java.lang.Throwable -> L37
            r2.f292a = r4     // Catch: java.lang.Throwable -> L37
            a.S7 r2 = r2.c     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto L1a
            r2.a()     // Catch: java.lang.Throwable -> L37
        L1a:
            boolean r2 = J(r3)     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto L39
            java.lang.String r2 = "FragmentManager"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L37
            r3.append(r5)     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = " enabling OnBackPressedCallback, caused by non-empty pending actions"
            r3.append(r0)     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L37
            android.util.Log.d(r2, r0)     // Catch: java.lang.Throwable -> L37
            goto L39
        L37:
            r0 = move-exception
            goto L84
        L39:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L37
            return
        L3b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L37
            java.util.ArrayList<a.S1> r0 = r5.d
            int r0 = r0.size()
            a.S1 r1 = r5.h
            r2 = 0
            if (r1 == 0) goto L49
            r1 = r4
            goto L4a
        L49:
            r1 = r2
        L4a:
            int r0 = r0 + r1
            if (r0 <= 0) goto L56
            androidx.fragment.app.b r0 = r5.x
            boolean r0 = N(r0)
            if (r0 == 0) goto L56
            goto L57
        L56:
            r4 = r2
        L57:
            boolean r0 = J(r3)
            if (r0 == 0) goto L78
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "OnBackPressedCallback for FragmentManager "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r2 = " enabled state is "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
        L78:
            a.e7$a r0 = r5.i
            r0.f292a = r4
            a.S7 r0 = r0.c
            if (r0 == 0) goto L83
            r0.a()
        L83:
            return
        L84:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L37
            throw r0
    }

    public final androidx.fragment.app.e g(androidx.fragment.app.b r4) {
            r3 = this;
            java.lang.String r0 = r4.e
            a.A2 r1 = r3.c
            java.lang.Object r2 = r1.b
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Object r0 = r2.get(r0)
            androidx.fragment.app.e r0 = (androidx.fragment.app.e) r0
            if (r0 == 0) goto L11
            return r0
        L11:
            androidx.fragment.app.e r0 = new androidx.fragment.app.e
            a.b7 r2 = r3.n
            r0.<init>(r2, r1, r4)
            a.X6$a r4 = r3.v
            a.X6 r4 = r4.b
            java.lang.ClassLoader r4 = r4.getClassLoader()
            r0.m(r4)
            int r4 = r3.u
            r0.e = r4
            return r0
    }

    public final void h(androidx.fragment.app.b r5) {
            r4 = this;
            r0 = 2
            boolean r1 = J(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L1a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "detach: "
            r1.<init>(r3)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r2, r1)
        L1a:
            boolean r1 = r5.B
            if (r1 != 0) goto L5d
            r1 = 1
            r5.B = r1
            boolean r3 = r5.k
            if (r3 == 0) goto L5d
            boolean r0 = J(r0)
            if (r0 == 0) goto L3c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "remove from detach: "
            r0.<init>(r3)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r2, r0)
        L3c:
            a.A2 r0 = r4.c
            java.lang.Object r2 = r0.f7a
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            monitor-enter(r2)
            java.lang.Object r0 = r0.f7a     // Catch: java.lang.Throwable -> L5a
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L5a
            r0.remove(r5)     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5a
            r0 = 0
            r5.k = r0
            boolean r0 = K(r5)
            if (r0 == 0) goto L56
            r4.F = r1
        L56:
            r4.b0(r5)
            return
        L5a:
            r5 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5a
            throw r5
        L5d:
            return
    }

    public final void i(boolean r4) {
            r3 = this;
            if (r4 == 0) goto L13
            a.X6$a r0 = r3.v
            if (r0 != 0) goto L7
            goto L13
        L7:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."
            r4.<init>(r0)
            r3.e0(r4)
            r4 = 0
            throw r4
        L13:
            a.A2 r0 = r3.c
            java.util.List r0 = r0.g()
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.b r1 = (androidx.fragment.app.b) r1
            if (r1 == 0) goto L1d
            r2 = 1
            r1.E = r2
            if (r4 == 0) goto L1d
            a.i7 r1 = r1.v
            r1.i(r2)
            goto L1d
        L36:
            return
    }

    public final boolean j() {
            r4 = this;
            int r0 = r4.u
            r1 = 1
            if (r0 >= r1) goto L6
            goto L2d
        L6:
            a.A2 r0 = r4.c
            java.util.List r0 = r0.g()
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r0.next()
            androidx.fragment.app.b r2 = (androidx.fragment.app.b) r2
            if (r2 == 0) goto L10
            boolean r3 = r2.A
            if (r3 != 0) goto L29
            a.i7 r2 = r2.v
            boolean r2 = r2.j()
            goto L2a
        L29:
            r2 = 0
        L2a:
            if (r2 == 0) goto L10
            return r1
        L2d:
            r0 = 0
            return r0
    }

    public final boolean k() {
            r7 = this;
            int r0 = r7.u
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L7
            return r1
        L7:
            a.A2 r0 = r7.c
            java.util.List r0 = r0.g()
            java.util.Iterator r0 = r0.iterator()
            r3 = 0
            r4 = r1
        L13:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L41
            java.lang.Object r5 = r0.next()
            androidx.fragment.app.b r5 = (androidx.fragment.app.b) r5
            if (r5 == 0) goto L13
            boolean r6 = M(r5)
            if (r6 == 0) goto L13
            boolean r6 = r5.A
            if (r6 != 0) goto L32
            a.i7 r6 = r5.v
            boolean r6 = r6.k()
            goto L33
        L32:
            r6 = r1
        L33:
            if (r6 == 0) goto L13
            if (r3 != 0) goto L3c
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L3c:
            r3.add(r5)
            r4 = r2
            goto L13
        L41:
            java.util.ArrayList<androidx.fragment.app.b> r0 = r7.e
            if (r0 == 0) goto L63
        L45:
            java.util.ArrayList<androidx.fragment.app.b> r0 = r7.e
            int r0 = r0.size()
            if (r1 >= r0) goto L63
            java.util.ArrayList<androidx.fragment.app.b> r0 = r7.e
            java.lang.Object r0 = r0.get(r1)
            androidx.fragment.app.b r0 = (androidx.fragment.app.b) r0
            if (r3 == 0) goto L5d
            boolean r2 = r3.contains(r0)
            if (r2 != 0) goto L60
        L5d:
            r0.getClass()
        L60:
            int r1 = r1 + 1
            goto L45
        L63:
            r7.e = r3
            return r4
    }

    public final void l() {
            r6 = this;
            r0 = 1
            r6.I = r0
            r6.z(r0)
            r6.w()
            a.X6$a r1 = r6.v
            a.A2 r2 = r6.c
            if (r1 == 0) goto L16
            java.lang.Object r0 = r2.d
            a.k7 r0 = (a.C0226k7) r0
            boolean r0 = r0.h
            goto L1f
        L16:
            a.X6 r1 = r1.b
            if (r1 == 0) goto L1f
            boolean r1 = r1.isChangingConfigurations()
            r0 = r0 ^ r1
        L1f:
            if (r0 == 0) goto L52
            java.util.Map<java.lang.String, a.U1> r0 = r6.k
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L2b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L52
            java.lang.Object r1 = r0.next()
            a.U1 r1 = (a.U1) r1
            java.util.ArrayList r1 = r1.f284a
            java.util.Iterator r1 = r1.iterator()
        L3d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L2b
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r2.d
            a.k7 r4 = (a.C0226k7) r4
            r5 = 0
            r4.d(r3, r5)
            goto L3d
        L52:
            r0 = -1
            r6.u(r0)
            a.X6$a r0 = r6.v
            if (r0 == 0) goto L5f
            a.c7 r1 = r6.q
            r0.removeOnTrimMemoryListener(r1)
        L5f:
            a.X6$a r0 = r6.v
            if (r0 == 0) goto L68
            a.c7 r1 = r6.p
            r0.removeOnConfigurationChangedListener(r1)
        L68:
            a.X6$a r0 = r6.v
            if (r0 == 0) goto L71
            a.c7 r1 = r6.r
            r0.removeOnMultiWindowModeChangedListener(r1)
        L71:
            a.X6$a r0 = r6.v
            if (r0 == 0) goto L7a
            a.c7 r1 = r6.s
            r0.removeOnPictureInPictureModeChangedListener(r1)
        L7a:
            a.X6$a r0 = r6.v
            if (r0 == 0) goto L87
            androidx.fragment.app.b r1 = r6.x
            if (r1 != 0) goto L87
            a.e7$b r1 = r6.t
            r0.removeMenuProvider(r1)
        L87:
            r0 = 0
            r6.v = r0
            r6.w = r0
            r6.x = r0
            androidx.activity.OnBackPressedDispatcher r1 = r6.g
            if (r1 == 0) goto Lac
            a.e7$a r1 = r6.i
            java.util.concurrent.CopyOnWriteArrayList<a.K2> r1 = r1.b
            java.util.Iterator r1 = r1.iterator()
        L9a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Laa
            java.lang.Object r2 = r1.next()
            a.K2 r2 = (a.K2) r2
            r2.cancel()
            goto L9a
        Laa:
            r6.g = r0
        Lac:
            a.d0 r0 = r6.B
            if (r0 == 0) goto Lc9
            androidx.activity.result.a r1 = r0.c
            java.lang.String r0 = r0.f429a
            r1.f(r0)
            a.d0 r0 = r6.C
            androidx.activity.result.a r1 = r0.c
            java.lang.String r0 = r0.f429a
            r1.f(r0)
            a.d0 r0 = r6.D
            androidx.activity.result.a r1 = r0.c
            java.lang.String r0 = r0.f429a
            r1.f(r0)
        Lc9:
            return
    }

    public final void m(boolean r4) {
            r3 = this;
            if (r4 == 0) goto L13
            a.X6$a r0 = r3.v
            if (r0 != 0) goto L7
            goto L13
        L7:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."
            r4.<init>(r0)
            r3.e0(r4)
            r4 = 0
            throw r4
        L13:
            a.A2 r0 = r3.c
            java.util.List r0 = r0.g()
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.b r1 = (androidx.fragment.app.b) r1
            if (r1 == 0) goto L1d
            r2 = 1
            r1.E = r2
            if (r4 == 0) goto L1d
            a.i7 r1 = r1.v
            r1.m(r2)
            goto L1d
        L36:
            return
    }

    public final void n(boolean r4) {
            r3 = this;
            if (r4 == 0) goto L13
            a.X6$a r0 = r3.v
            if (r0 != 0) goto L7
            goto L13
        L7:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."
            r4.<init>(r0)
            r3.e0(r4)
            r4 = 0
            throw r4
        L13:
            a.A2 r0 = r3.c
            java.util.List r0 = r0.g()
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.b r1 = (androidx.fragment.app.b) r1
            if (r1 == 0) goto L1d
            if (r4 == 0) goto L1d
            a.i7 r1 = r1.v
            r2 = 1
            r1.n(r2)
            goto L1d
        L34:
            return
    }

    public final void o() {
            r2 = this;
            a.A2 r0 = r2.c
            java.util.ArrayList r0 = r0.f()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.b r1 = (androidx.fragment.app.b) r1
            if (r1 == 0) goto La
            r1.j()
            a.i7 r1 = r1.v
            r1.o()
            goto La
        L21:
            return
    }

    public final boolean p() {
            r5 = this;
            int r0 = r5.u
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L7
            goto L2e
        L7:
            a.A2 r0 = r5.c
            java.util.List r0 = r0.g()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2e
            java.lang.Object r3 = r0.next()
            androidx.fragment.app.b r3 = (androidx.fragment.app.b) r3
            if (r3 == 0) goto L11
            boolean r4 = r3.A
            if (r4 != 0) goto L2a
            a.i7 r3 = r3.v
            boolean r3 = r3.p()
            goto L2b
        L2a:
            r3 = r1
        L2b:
            if (r3 == 0) goto L11
            return r2
        L2e:
            return r1
    }

    public final void q() {
            r3 = this;
            int r0 = r3.u
            r1 = 1
            if (r0 >= r1) goto L6
            goto L28
        L6:
            a.A2 r0 = r3.c
            java.util.List r0 = r0.g()
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.b r1 = (androidx.fragment.app.b) r1
            if (r1 == 0) goto L10
            boolean r2 = r1.A
            if (r2 != 0) goto L10
            a.i7 r1 = r1.v
            r1.q()
            goto L10
        L28:
            return
    }

    public final void r(androidx.fragment.app.b r3) {
            r2 = this;
            if (r3 == 0) goto L33
            java.lang.String r0 = r3.e
            a.A2 r1 = r2.c
            androidx.fragment.app.b r0 = r1.c(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L33
            a.e7 r0 = r3.t
            r0.getClass()
            boolean r0 = N(r3)
            java.lang.Boolean r1 = r3.j
            if (r1 == 0) goto L23
            boolean r1 = r1.booleanValue()
            if (r1 == r0) goto L33
        L23:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.j = r0
            a.i7 r3 = r3.v
            r3.f0()
            androidx.fragment.app.b r0 = r3.y
            r3.r(r0)
        L33:
            return
    }

    public final void s(boolean r4) {
            r3 = this;
            if (r4 == 0) goto L13
            a.X6$a r0 = r3.v
            if (r0 != 0) goto L7
            goto L13
        L7:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."
            r4.<init>(r0)
            r3.e0(r4)
            r4 = 0
            throw r4
        L13:
            a.A2 r0 = r3.c
            java.util.List r0 = r0.g()
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.b r1 = (androidx.fragment.app.b) r1
            if (r1 == 0) goto L1d
            if (r4 == 0) goto L1d
            a.i7 r1 = r1.v
            r2 = 1
            r1.s(r2)
            goto L1d
        L34:
            return
    }

    public final boolean t() {
            r6 = this;
            int r0 = r6.u
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L7
            return r1
        L7:
            a.A2 r0 = r6.c
            java.util.List r0 = r0.g()
            java.util.Iterator r0 = r0.iterator()
            r3 = r1
        L12:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L36
            java.lang.Object r4 = r0.next()
            androidx.fragment.app.b r4 = (androidx.fragment.app.b) r4
            if (r4 == 0) goto L12
            boolean r5 = M(r4)
            if (r5 == 0) goto L12
            boolean r5 = r4.A
            if (r5 != 0) goto L31
            a.i7 r4 = r4.v
            boolean r4 = r4.t()
            goto L32
        L31:
            r4 = r1
        L32:
            if (r4 == 0) goto L12
            r3 = r2
            goto L12
        L36:
            return r3
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.String r1 = "FragmentManager{"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r4)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " in "
            r0.append(r1)
            androidx.fragment.app.b r1 = r4.x
            java.lang.String r2 = "}"
            java.lang.String r3 = "{"
            if (r1 == 0) goto L43
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r0.append(r3)
            androidx.fragment.app.b r1 = r4.x
            int r1 = java.lang.System.identityHashCode(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            r0.append(r2)
            goto L69
        L43:
            a.X6$a r1 = r4.v
            if (r1 == 0) goto L64
            java.lang.Class<a.X6$a> r1 = a.X6.a.class
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r0.append(r3)
            a.X6$a r1 = r4.v
            int r1 = java.lang.System.identityHashCode(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            r0.append(r2)
            goto L69
        L64:
            java.lang.String r1 = "null"
            r0.append(r1)
        L69:
            java.lang.String r1 = "}}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final void u(int r5) {
            r4 = this;
            r0 = 1
            r1 = 0
            r4.b = r0     // Catch: java.lang.Throwable -> L3e
            a.A2 r2 = r4.c     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r2 = r2.b     // Catch: java.lang.Throwable -> L3e
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch: java.lang.Throwable -> L3e
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L3e
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L3e
        L12:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L3e
            if (r3 == 0) goto L23
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L3e
            androidx.fragment.app.e r3 = (androidx.fragment.app.e) r3     // Catch: java.lang.Throwable -> L3e
            if (r3 == 0) goto L12
            r3.e = r5     // Catch: java.lang.Throwable -> L3e
            goto L12
        L23:
            r4.O(r5, r1)     // Catch: java.lang.Throwable -> L3e
            java.util.HashSet r5 = r4.e()     // Catch: java.lang.Throwable -> L3e
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L3e
        L2e:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L40
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> L3e
            androidx.fragment.app.f r2 = (androidx.fragment.app.f) r2     // Catch: java.lang.Throwable -> L3e
            r2.h()     // Catch: java.lang.Throwable -> L3e
            goto L2e
        L3e:
            r5 = move-exception
            goto L46
        L40:
            r4.b = r1
            r4.z(r0)
            return
        L46:
            r4.b = r1
            throw r5
    }

    public final void v(java.lang.String r9, java.io.FileDescriptor r10, java.io.PrintWriter r11, java.lang.String[] r12) {
            r8 = this;
            java.lang.String r0 = "    "
            java.lang.String r0 = a.C0487z.f(r9, r0)
            a.A2 r1 = r8.c
            r1.getClass()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            java.lang.String r3 = "    "
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.Object r3 = r1.b
            java.util.HashMap r3 = (java.util.HashMap) r3
            boolean r4 = r3.isEmpty()
            r5 = 0
            if (r4 != 0) goto L292
            r11.print(r9)
            java.lang.String r4 = "Active Fragments:"
            r11.println(r4)
            java.util.Collection r3 = r3.values()
            java.util.Iterator r3 = r3.iterator()
        L37:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L292
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.e r4 = (androidx.fragment.app.e) r4
            r11.print(r9)
            if (r4 == 0) goto L28b
            androidx.fragment.app.b r4 = r4.c
            r11.println(r4)
            r4.getClass()
            r11.print(r2)
            java.lang.String r6 = "mFragmentId=#"
            r11.print(r6)
            int r6 = r4.x
            java.lang.String r6 = java.lang.Integer.toHexString(r6)
            r11.print(r6)
            java.lang.String r6 = " mContainerId=#"
            r11.print(r6)
            int r6 = r4.y
            java.lang.String r6 = java.lang.Integer.toHexString(r6)
            r11.print(r6)
            java.lang.String r6 = " mTag="
            r11.print(r6)
            java.lang.String r6 = r4.z
            r11.println(r6)
            r11.print(r2)
            java.lang.String r6 = "mState="
            r11.print(r6)
            int r6 = r4.f905a
            r11.print(r6)
            java.lang.String r6 = " mWho="
            r11.print(r6)
            java.lang.String r6 = r4.e
            r11.print(r6)
            java.lang.String r6 = " mBackStackNesting="
            r11.print(r6)
            int r6 = r4.s
            r11.println(r6)
            r11.print(r2)
            java.lang.String r6 = "mAdded="
            r11.print(r6)
            boolean r6 = r4.k
            r11.print(r6)
            java.lang.String r6 = " mRemoving="
            r11.print(r6)
            boolean r6 = r4.l
            r11.print(r6)
            java.lang.String r6 = " mFromLayout="
            r11.print(r6)
            boolean r6 = r4.n
            r11.print(r6)
            java.lang.String r6 = " mInLayout="
            r11.print(r6)
            boolean r6 = r4.o
            r11.println(r6)
            r11.print(r2)
            java.lang.String r6 = "mHidden="
            r11.print(r6)
            boolean r6 = r4.A
            r11.print(r6)
            java.lang.String r6 = " mDetached="
            r11.print(r6)
            boolean r6 = r4.B
            r11.print(r6)
            java.lang.String r6 = " mMenuVisible="
            r11.print(r6)
            boolean r6 = r4.D
            r11.print(r6)
            java.lang.String r6 = " mHasMenu="
            r11.print(r6)
            r11.println(r5)
            r11.print(r2)
            java.lang.String r6 = "mRetainInstance="
            r11.print(r6)
            boolean r6 = r4.C
            r11.print(r6)
            java.lang.String r6 = " mUserVisibleHint="
            r11.print(r6)
            boolean r6 = r4.I
            r11.println(r6)
            a.e7 r6 = r4.t
            if (r6 == 0) goto L116
            r11.print(r2)
            java.lang.String r6 = "mFragmentManager="
            r11.print(r6)
            a.e7 r6 = r4.t
            r11.println(r6)
        L116:
            a.X6$a r6 = r4.u
            if (r6 == 0) goto L127
            r11.print(r2)
            java.lang.String r6 = "mHost="
            r11.print(r6)
            a.X6$a r6 = r4.u
            r11.println(r6)
        L127:
            androidx.fragment.app.b r6 = r4.w
            if (r6 == 0) goto L138
            r11.print(r2)
            java.lang.String r6 = "mParentFragment="
            r11.print(r6)
            androidx.fragment.app.b r6 = r4.w
            r11.println(r6)
        L138:
            android.os.Bundle r6 = r4.f
            if (r6 == 0) goto L149
            r11.print(r2)
            java.lang.String r6 = "mArguments="
            r11.print(r6)
            android.os.Bundle r6 = r4.f
            r11.println(r6)
        L149:
            android.os.Bundle r6 = r4.b
            if (r6 == 0) goto L15a
            r11.print(r2)
            java.lang.String r6 = "mSavedFragmentState="
            r11.print(r6)
            android.os.Bundle r6 = r4.b
            r11.println(r6)
        L15a:
            android.util.SparseArray<android.os.Parcelable> r6 = r4.c
            if (r6 == 0) goto L16b
            r11.print(r2)
            java.lang.String r6 = "mSavedViewState="
            r11.print(r6)
            android.util.SparseArray<android.os.Parcelable> r6 = r4.c
            r11.println(r6)
        L16b:
            android.os.Bundle r6 = r4.d
            if (r6 == 0) goto L17c
            r11.print(r2)
            java.lang.String r6 = "mSavedViewRegistryState="
            r11.print(r6)
            android.os.Bundle r6 = r4.d
            r11.println(r6)
        L17c:
            androidx.fragment.app.b r6 = r4.g
            if (r6 == 0) goto L181
            goto L191
        L181:
            a.e7 r6 = r4.t
            if (r6 == 0) goto L190
            java.lang.String r7 = r4.h
            if (r7 == 0) goto L190
            a.A2 r6 = r6.c
            androidx.fragment.app.b r6 = r6.c(r7)
            goto L191
        L190:
            r6 = 0
        L191:
            if (r6 == 0) goto L1a8
            r11.print(r2)
            java.lang.String r7 = "mTarget="
            r11.print(r7)
            r11.print(r6)
            java.lang.String r6 = " mTargetRequestCode="
            r11.print(r6)
            int r6 = r4.i
            r11.println(r6)
        L1a8:
            r11.print(r2)
            java.lang.String r6 = "mPopDirection="
            r11.print(r6)
            androidx.fragment.app.b$d r6 = r4.J
            if (r6 != 0) goto L1b6
            r6 = r5
            goto L1b8
        L1b6:
            boolean r6 = r6.f909a
        L1b8:
            r11.println(r6)
            androidx.fragment.app.b$d r6 = r4.J
            if (r6 != 0) goto L1c1
            r6 = r5
            goto L1c3
        L1c1:
            int r6 = r6.b
        L1c3:
            if (r6 == 0) goto L1d8
            r11.print(r2)
            java.lang.String r6 = "getEnterAnim="
            r11.print(r6)
            androidx.fragment.app.b$d r6 = r4.J
            if (r6 != 0) goto L1d3
            r6 = r5
            goto L1d5
        L1d3:
            int r6 = r6.b
        L1d5:
            r11.println(r6)
        L1d8:
            androidx.fragment.app.b$d r6 = r4.J
            if (r6 != 0) goto L1de
            r6 = r5
            goto L1e0
        L1de:
            int r6 = r6.c
        L1e0:
            if (r6 == 0) goto L1f5
            r11.print(r2)
            java.lang.String r6 = "getExitAnim="
            r11.print(r6)
            androidx.fragment.app.b$d r6 = r4.J
            if (r6 != 0) goto L1f0
            r6 = r5
            goto L1f2
        L1f0:
            int r6 = r6.c
        L1f2:
            r11.println(r6)
        L1f5:
            androidx.fragment.app.b$d r6 = r4.J
            if (r6 != 0) goto L1fb
            r6 = r5
            goto L1fd
        L1fb:
            int r6 = r6.d
        L1fd:
            if (r6 == 0) goto L212
            r11.print(r2)
            java.lang.String r6 = "getPopEnterAnim="
            r11.print(r6)
            androidx.fragment.app.b$d r6 = r4.J
            if (r6 != 0) goto L20d
            r6 = r5
            goto L20f
        L20d:
            int r6 = r6.d
        L20f:
            r11.println(r6)
        L212:
            androidx.fragment.app.b$d r6 = r4.J
            if (r6 != 0) goto L218
            r6 = r5
            goto L21a
        L218:
            int r6 = r6.e
        L21a:
            if (r6 == 0) goto L22f
            r11.print(r2)
            java.lang.String r6 = "getPopExitAnim="
            r11.print(r6)
            androidx.fragment.app.b$d r6 = r4.J
            if (r6 != 0) goto L22a
            r6 = r5
            goto L22c
        L22a:
            int r6 = r6.e
        L22c:
            r11.println(r6)
        L22f:
            android.view.ViewGroup r6 = r4.F
            if (r6 == 0) goto L240
            r11.print(r2)
            java.lang.String r6 = "mContainer="
            r11.print(r6)
            android.view.ViewGroup r6 = r4.F
            r11.println(r6)
        L240:
            android.view.View r6 = r4.G
            if (r6 == 0) goto L251
            r11.print(r2)
            java.lang.String r6 = "mView="
            r11.print(r6)
            android.view.View r6 = r4.G
            r11.println(r6)
        L251:
            android.content.Context r6 = r4.d()
            if (r6 == 0) goto L263
            a.I9 r6 = new a.I9
            a.Fg r7 = r4.getViewModelStore()
            r6.<init>(r4, r7)
            r6.a(r2, r11)
        L263:
            r11.print(r2)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Child "
            r6.<init>(r7)
            a.i7 r7 = r4.v
            r6.append(r7)
            java.lang.String r7 = ":"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r11.println(r6)
            a.i7 r4 = r4.v
            java.lang.String r6 = "  "
            java.lang.String r6 = a.C0487z.f(r2, r6)
            r4.v(r6, r10, r11, r12)
            goto L37
        L28b:
            java.lang.String r4 = "null"
            r11.println(r4)
            goto L37
        L292:
            java.lang.Object r10 = r1.f7a
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            int r12 = r10.size()
            if (r12 <= 0) goto L2c7
            r11.print(r9)
            java.lang.String r1 = "Added Fragments:"
            r11.println(r1)
            r1 = r5
        L2a5:
            if (r1 >= r12) goto L2c7
            java.lang.Object r2 = r10.get(r1)
            androidx.fragment.app.b r2 = (androidx.fragment.app.b) r2
            r11.print(r9)
            java.lang.String r3 = "  #"
            r11.print(r3)
            r11.print(r1)
            java.lang.String r3 = ": "
            r11.print(r3)
            java.lang.String r2 = r2.toString()
            r11.println(r2)
            int r1 = r1 + 1
            goto L2a5
        L2c7:
            java.util.ArrayList<androidx.fragment.app.b> r10 = r8.e
            if (r10 == 0) goto L2fe
            int r10 = r10.size()
            if (r10 <= 0) goto L2fe
            r11.print(r9)
            java.lang.String r12 = "Fragments Created Menus:"
            r11.println(r12)
            r12 = r5
        L2da:
            if (r12 >= r10) goto L2fe
            java.util.ArrayList<androidx.fragment.app.b> r1 = r8.e
            java.lang.Object r1 = r1.get(r12)
            androidx.fragment.app.b r1 = (androidx.fragment.app.b) r1
            r11.print(r9)
            java.lang.String r2 = "  #"
            r11.print(r2)
            r11.print(r12)
            java.lang.String r2 = ": "
            r11.print(r2)
            java.lang.String r1 = r1.toString()
            r11.println(r1)
            int r12 = r12 + 1
            goto L2da
        L2fe:
            java.util.ArrayList<a.S1> r10 = r8.d
            int r10 = r10.size()
            if (r10 <= 0) goto L337
            r11.print(r9)
            java.lang.String r12 = "Back Stack:"
            r11.println(r12)
            r12 = r5
        L30f:
            if (r12 >= r10) goto L337
            java.util.ArrayList<a.S1> r1 = r8.d
            java.lang.Object r1 = r1.get(r12)
            a.S1 r1 = (a.S1) r1
            r11.print(r9)
            java.lang.String r2 = "  #"
            r11.print(r2)
            r11.print(r12)
            java.lang.String r2 = ": "
            r11.print(r2)
            java.lang.String r2 = r1.toString()
            r11.println(r2)
            r2 = 1
            r1.f(r0, r11, r2)
            int r12 = r12 + 1
            goto L30f
        L337:
            r11.print(r9)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r12 = "Back Stack Index: "
            r10.<init>(r12)
            java.util.concurrent.atomic.AtomicInteger r12 = r8.j
            int r12 = r12.get()
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            r11.println(r10)
            java.util.ArrayList<a.e7$i> r10 = r8.f452a
            monitor-enter(r10)
            java.util.ArrayList<a.e7$i> r12 = r8.f452a     // Catch: java.lang.Throwable -> L384
            int r12 = r12.size()     // Catch: java.lang.Throwable -> L384
            if (r12 <= 0) goto L386
            r11.print(r9)     // Catch: java.lang.Throwable -> L384
            java.lang.String r0 = "Pending Actions:"
            r11.println(r0)     // Catch: java.lang.Throwable -> L384
        L364:
            if (r5 >= r12) goto L386
            java.util.ArrayList<a.e7$i> r0 = r8.f452a     // Catch: java.lang.Throwable -> L384
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L384
            a.e7$i r0 = (a.AbstractC0119e7.i) r0     // Catch: java.lang.Throwable -> L384
            r11.print(r9)     // Catch: java.lang.Throwable -> L384
            java.lang.String r1 = "  #"
            r11.print(r1)     // Catch: java.lang.Throwable -> L384
            r11.print(r5)     // Catch: java.lang.Throwable -> L384
            java.lang.String r1 = ": "
            r11.print(r1)     // Catch: java.lang.Throwable -> L384
            r11.println(r0)     // Catch: java.lang.Throwable -> L384
            int r5 = r5 + 1
            goto L364
        L384:
            r9 = move-exception
            goto L3f7
        L386:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L384
            r11.print(r9)
            java.lang.String r10 = "FragmentManager misc state:"
            r11.println(r10)
            r11.print(r9)
            java.lang.String r10 = "  mHost="
            r11.print(r10)
            a.X6$a r10 = r8.v
            r11.println(r10)
            r11.print(r9)
            java.lang.String r10 = "  mContainer="
            r11.print(r10)
            a.a2 r10 = r8.w
            r11.println(r10)
            androidx.fragment.app.b r10 = r8.x
            if (r10 == 0) goto L3ba
            r11.print(r9)
            java.lang.String r10 = "  mParent="
            r11.print(r10)
            androidx.fragment.app.b r10 = r8.x
            r11.println(r10)
        L3ba:
            r11.print(r9)
            java.lang.String r10 = "  mCurState="
            r11.print(r10)
            int r10 = r8.u
            r11.print(r10)
            java.lang.String r10 = " mStateSaved="
            r11.print(r10)
            boolean r10 = r8.G
            r11.print(r10)
            java.lang.String r10 = " mStopped="
            r11.print(r10)
            boolean r10 = r8.H
            r11.print(r10)
            java.lang.String r10 = " mDestroyed="
            r11.print(r10)
            boolean r10 = r8.I
            r11.println(r10)
            boolean r10 = r8.F
            if (r10 == 0) goto L3f6
            r11.print(r9)
            java.lang.String r9 = "  mNeedMenuInvalidate="
            r11.print(r9)
            boolean r9 = r8.F
            r11.println(r9)
        L3f6:
            return
        L3f7:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L384
            throw r9
    }

    public final void w() {
            r2 = this;
            java.util.HashSet r0 = r2.e()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.f r1 = (androidx.fragment.app.f) r1
            r1.h()
            goto L8
        L18:
            return
    }

    public final void x(a.AbstractC0119e7.i r3, boolean r4) {
            r2 = this;
            if (r4 != 0) goto L2b
            a.X6$a r0 = r2.v
            if (r0 != 0) goto L1a
            boolean r3 = r2.I
            if (r3 == 0) goto L12
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "FragmentManager has been destroyed"
            r3.<init>(r4)
            throw r3
        L12:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "FragmentManager has not been attached to a host."
            r3.<init>(r4)
            throw r3
        L1a:
            boolean r0 = r2.G
            if (r0 != 0) goto L23
            boolean r0 = r2.H
            if (r0 != 0) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Can not perform this action after onSaveInstanceState"
            r3.<init>(r4)
            throw r3
        L2b:
            java.util.ArrayList<a.e7$i> r0 = r2.f452a
            monitor-enter(r0)
            a.X6$a r1 = r2.v     // Catch: java.lang.Throwable -> L36
            if (r1 != 0) goto L40
            if (r4 == 0) goto L38
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            return
        L36:
            r3 = move-exception
            goto L4a
        L38:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L36
            java.lang.String r4 = "Activity has been destroyed"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L36
            throw r3     // Catch: java.lang.Throwable -> L36
        L40:
            java.util.ArrayList<a.e7$i> r4 = r2.f452a     // Catch: java.lang.Throwable -> L36
            r4.add(r3)     // Catch: java.lang.Throwable -> L36
            r2.X()     // Catch: java.lang.Throwable -> L36
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            return
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            throw r3
    }

    public final void y(boolean r3) {
            r2 = this;
            boolean r0 = r2.b
            if (r0 != 0) goto L58
            a.X6$a r0 = r2.v
            if (r0 != 0) goto L1c
            boolean r3 = r2.I
            if (r3 == 0) goto L14
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "FragmentManager has been destroyed"
            r3.<init>(r0)
            throw r3
        L14:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "FragmentManager has not been attached to a host."
            r3.<init>(r0)
            throw r3
        L1c:
            android.os.Looper r0 = android.os.Looper.myLooper()
            a.X6$a r1 = r2.v
            android.os.Handler r1 = r1.c
            android.os.Looper r1 = r1.getLooper()
            if (r0 != r1) goto L50
            if (r3 != 0) goto L3d
            boolean r3 = r2.G
            if (r3 != 0) goto L35
            boolean r3 = r2.H
            if (r3 != 0) goto L35
            goto L3d
        L35:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can not perform this action after onSaveInstanceState"
            r3.<init>(r0)
            throw r3
        L3d:
            java.util.ArrayList<a.S1> r3 = r2.K
            if (r3 != 0) goto L4f
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.K = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.L = r3
        L4f:
            return
        L50:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Must be called from main thread of fragment host"
            r3.<init>(r0)
            throw r3
        L58:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "FragmentManager is already executing transactions"
            r3.<init>(r0)
            throw r3
    }

    public final boolean z(boolean r9) {
            r8 = this;
            r8.y(r9)
            r9 = 0
            r0 = r9
        L5:
            java.util.ArrayList<a.S1> r1 = r8.K
            java.util.ArrayList<java.lang.Boolean> r2 = r8.L
            java.util.ArrayList<a.e7$i> r3 = r8.f452a
            monitor-enter(r3)
            java.util.ArrayList<a.e7$i> r4 = r8.f452a     // Catch: java.lang.Throwable -> L17
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r4 == 0) goto L19
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L17
            r6 = r9
            goto L44
        L17:
            r9 = move-exception
            goto L87
        L19:
            java.util.ArrayList<a.e7$i> r4 = r8.f452a     // Catch: java.lang.Throwable -> L33
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L33
            r5 = r9
            r6 = r5
        L21:
            if (r5 >= r4) goto L35
            java.util.ArrayList<a.e7$i> r7 = r8.f452a     // Catch: java.lang.Throwable -> L33
            java.lang.Object r7 = r7.get(r5)     // Catch: java.lang.Throwable -> L33
            a.e7$i r7 = (a.AbstractC0119e7.i) r7     // Catch: java.lang.Throwable -> L33
            boolean r7 = r7.a(r1, r2)     // Catch: java.lang.Throwable -> L33
            r6 = r6 | r7
            int r5 = r5 + 1
            goto L21
        L33:
            r9 = move-exception
            goto L78
        L35:
            java.util.ArrayList<a.e7$i> r1 = r8.f452a     // Catch: java.lang.Throwable -> L17
            r1.clear()     // Catch: java.lang.Throwable -> L17
            a.X6$a r1 = r8.v     // Catch: java.lang.Throwable -> L17
            android.os.Handler r1 = r1.c     // Catch: java.lang.Throwable -> L17
            a.e7$e r2 = r8.O     // Catch: java.lang.Throwable -> L17
            r1.removeCallbacks(r2)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L17
        L44:
            if (r6 == 0) goto L59
            r0 = 1
            r8.b = r0
            java.util.ArrayList<a.S1> r1 = r8.K     // Catch: java.lang.Throwable -> L54
            java.util.ArrayList<java.lang.Boolean> r2 = r8.L     // Catch: java.lang.Throwable -> L54
            r8.U(r1, r2)     // Catch: java.lang.Throwable -> L54
            r8.d()
            goto L5
        L54:
            r9 = move-exception
            r8.d()
            throw r9
        L59:
            r8.f0()
            boolean r1 = r8.J
            if (r1 == 0) goto L65
            r8.J = r9
            r8.d0()
        L65:
            a.A2 r9 = r8.c
            java.lang.Object r9 = r9.b
            java.util.HashMap r9 = (java.util.HashMap) r9
            java.util.Collection r9 = r9.values()
            r1 = 0
            java.util.Set r1 = java.util.Collections.singleton(r1)
            r9.removeAll(r1)
            return r0
        L78:
            java.util.ArrayList<a.e7$i> r0 = r8.f452a     // Catch: java.lang.Throwable -> L17
            r0.clear()     // Catch: java.lang.Throwable -> L17
            a.X6$a r0 = r8.v     // Catch: java.lang.Throwable -> L17
            android.os.Handler r0 = r0.c     // Catch: java.lang.Throwable -> L17
            a.e7$e r1 = r8.O     // Catch: java.lang.Throwable -> L17
            r0.removeCallbacks(r1)     // Catch: java.lang.Throwable -> L17
            throw r9     // Catch: java.lang.Throwable -> L17
        L87:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L17
            throw r9
    }
}
