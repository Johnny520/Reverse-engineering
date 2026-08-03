package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentManager implements Yue.InterfaceC2775 {

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final java.lang.String f29168 = "android:support:fragments";

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static final java.lang.String f29169 = "state";

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static final java.lang.String f29170 = "result_";

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static final java.lang.String f29171 = "fragment_";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean f29172 = false;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    public static final java.lang.String f29173 = "FragmentManager";

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final int f29174 = 1;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final java.lang.String f29175 = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE";

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.util.ArrayList<androidx.fragment.app.FragmentManager.InterfaceC7591> f29176;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public boolean f29177;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final androidx.fragment.app.C7631 f29178;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.util.ArrayList<androidx.fragment.app.C7595> f29179;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public java.util.ArrayList<androidx.fragment.app.Fragment> f29180;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final androidx.fragment.app.LayoutInflaterFactory2C7617 f29181;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public androidx.activity.OnBackPressedDispatcher f29182;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final Yue.AbstractC4607 f29183;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final java.util.concurrent.atomic.AtomicInteger f29184;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final java.util.Map<java.lang.String, androidx.fragment.app.C7598> f29185;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final java.util.Map<java.lang.String, android.os.Bundle> f29186;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final java.util.Map<java.lang.String, androidx.fragment.app.FragmentManager.C7589> f29187;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public java.util.ArrayList<androidx.fragment.app.FragmentManager.InterfaceC7590> f29188;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final androidx.fragment.app.C7619 f29189;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final java.util.concurrent.CopyOnWriteArrayList<Yue.InterfaceC2772> f29190;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final Yue.InterfaceC1535<android.content.res.Configuration> f29191;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final Yue.InterfaceC1535<java.lang.Integer> f29192;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final Yue.InterfaceC1535<Yue.C4298> f29193;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final Yue.InterfaceC1535<Yue.C4767> f29194;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final Yue.InterfaceC4143 f29195;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f29196;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public Yue.AbstractC2764<?> f29197;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public Yue.AbstractC2762 f29198;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public androidx.fragment.app.Fragment f29199;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public androidx.fragment.app.Fragment f29200;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public androidx.fragment.app.C7616 f29201;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public androidx.fragment.app.C7616 f29202;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public Yue.InterfaceC5884 f29203;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public Yue.InterfaceC5884 f29204;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public Yue.AbstractC0254<android.content.Intent> f29205;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public Yue.AbstractC0254<Yue.C3313> f29206;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public Yue.AbstractC0254<java.lang.String[]> f29207;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public java.util.ArrayDeque<androidx.fragment.app.FragmentManager.C7587> f29208;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public boolean f29209;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public boolean f29210;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public boolean f29211;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public boolean f29212;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public boolean f29213;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public java.util.ArrayList<androidx.fragment.app.C7595> f29214;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public java.util.ArrayList<java.lang.Boolean> f29215;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public java.util.ArrayList<androidx.fragment.app.Fragment> f29216;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public androidx.fragment.app.C7623 f29217;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public Yue.C2779.C2782 f29218;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public java.lang.Runnable f29219;


    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥ, reason: contains not printable characters */
    public class C7574 implements Yue.InterfaceC0219<java.util.Map<java.lang.String, java.lang.Boolean>> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.fragment.app.FragmentManager f29224;

        public C7574(androidx.fragment.app.FragmentManager r1) {
                r0 = this;
                r0.f29224 = r1
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC0219
        @android.annotation.SuppressLint({"SyntheticAccessor"})
        /* JADX INFO: renamed from: ۥ */
        public /* bridge */ /* synthetic */ void mo1122(java.util.Map<java.lang.String, java.lang.Boolean> r1) {
                r0 = this;
                java.util.Map r1 = (java.util.Map) r1
                r0.m29236(r1)
                return
        }

        @android.annotation.SuppressLint({"SyntheticAccessor"})
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void m29236(java.util.Map<java.lang.String, java.lang.Boolean> r6) {
                r5 = this;
                java.util.Set r0 = r6.keySet()
                r1 = 0
                java.lang.String[] r2 = new java.lang.String[r1]
                java.lang.Object[] r0 = r0.toArray(r2)
                java.lang.String[] r0 = (java.lang.String[]) r0
                java.util.ArrayList r2 = new java.util.ArrayList
                java.util.Collection r6 = r6.values()
                r2.<init>(r6)
                int r6 = r2.size()
                int[] r6 = new int[r6]
                r3 = r1
            L1d:
                int r4 = r2.size()
                if (r3 >= r4) goto L37
                java.lang.Object r4 = r2.get(r3)
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                if (r4 == 0) goto L31
                r4 = r1
                goto L32
            L31:
                r4 = -1
            L32:
                r6[r3] = r4
                int r3 = r3 + 1
                goto L1d
            L37:
                androidx.fragment.app.FragmentManager r1 = r5.f29224
                java.util.ArrayDeque<androidx.fragment.app.FragmentManager$ۥ۟۟۟ۨ> r1 = r1.f29208
                java.lang.Object r1 = r1.pollFirst()
                androidx.fragment.app.FragmentManager$ۥ۟۟۟ۨ r1 = (androidx.fragment.app.FragmentManager.C7587) r1
                java.lang.String r2 = "FragmentManager"
                if (r1 != 0) goto L5a
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r0 = "No permissions were requested for "
                r6.append(r0)
                r6.append(r5)
                java.lang.String r6 = r6.toString()
                android.util.Log.w(r2, r6)
                return
            L5a:
                java.lang.String r3 = r1.f29236
                int r1 = r1.f29237
                androidx.fragment.app.FragmentManager r4 = r5.f29224
                androidx.fragment.app.ۥ۟۟۠ r4 = androidx.fragment.app.FragmentManager.m29083(r4)
                androidx.fragment.app.Fragment r4 = r4.m29411(r3)
                if (r4 != 0) goto L7f
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r0 = "Permission request result delivered for unknown Fragment "
                r6.append(r0)
                r6.append(r3)
                java.lang.String r6 = r6.toString()
                android.util.Log.w(r2, r6)
                return
            L7f:
                r4.onRequestPermissionsResult(r1, r0, r6)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥ۟, reason: contains not printable characters */
    public class C7575 extends Yue.AbstractC4607 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.fragment.app.FragmentManager f29225;

        public C7575(androidx.fragment.app.FragmentManager r1, boolean r2) {
                r0 = this;
                r0.f29225 = r1
                r0.<init>(r2)
                return
        }

        @Override // Yue.AbstractC4607
        public void handleOnBackPressed() {
                r1 = this;
                androidx.fragment.app.FragmentManager r0 = r1.f29225
                r0.m29171()
                return
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥ۟۟, reason: contains not printable characters */
    public class C7576 implements Yue.InterfaceC4143 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.fragment.app.FragmentManager f29226;

        public C7576(androidx.fragment.app.FragmentManager r1) {
                r0 = this;
                r0.f29226 = r1
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC4143
        /* JADX INFO: renamed from: ۥ */
        public boolean mo16245(@Yue.InterfaceC4410 android.view.MenuItem r2) {
                r1 = this;
                androidx.fragment.app.FragmentManager r0 = r1.f29226
                boolean r2 = r0.m29123(r2)
                return r2
        }

        @Override // Yue.InterfaceC4143
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo16246(@Yue.InterfaceC4410 android.view.Menu r2) {
                r1 = this;
                androidx.fragment.app.FragmentManager r0 = r1.f29226
                r0.m29124(r2)
                return
        }

        @Override // Yue.InterfaceC4143
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo16247(@Yue.InterfaceC4410 android.view.Menu r2, @Yue.InterfaceC4410 android.view.MenuInflater r3) {
                r1 = this;
                androidx.fragment.app.FragmentManager r0 = r1.f29226
                r0.m29116(r2, r3)
                return
        }

        @Override // Yue.InterfaceC4143
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo16248(@Yue.InterfaceC4410 android.view.Menu r2) {
                r1 = this;
                androidx.fragment.app.FragmentManager r0 = r1.f29226
                r0.m29128(r2)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥ۟۟۟, reason: contains not printable characters */
    public class C7577 extends androidx.fragment.app.C7616 {

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ androidx.fragment.app.FragmentManager f29227;

        public C7577(androidx.fragment.app.FragmentManager r1) {
                r0 = this;
                r0.f29227 = r1
                r0.<init>()
                return
        }

        @Override // androidx.fragment.app.C7616
        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public androidx.fragment.app.Fragment mo29237(@Yue.InterfaceC4410 java.lang.ClassLoader r3, @Yue.InterfaceC4410 java.lang.String r4) {
                r2 = this;
                androidx.fragment.app.FragmentManager r3 = r2.f29227
                Yue.ۥ۠ۢۨ r3 = r3.m29163()
                androidx.fragment.app.FragmentManager r0 = r2.f29227
                Yue.ۥ۠ۢۨ r0 = r0.m29163()
                android.content.Context r0 = r0.m12114()
                r1 = 0
                androidx.fragment.app.Fragment r3 = r3.m12068(r0, r4, r1)
                return r3
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥ۟۟۟۟, reason: contains not printable characters */
    public class C7578 implements Yue.InterfaceC5884 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.fragment.app.FragmentManager f29228;

        public C7578(androidx.fragment.app.FragmentManager r1) {
                r0 = this;
                r0.f29228 = r1
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC5884
        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ */
        public androidx.fragment.app.AbstractC7635 mo21908(@Yue.InterfaceC4410 android.view.ViewGroup r2) {
                r1 = this;
                androidx.fragment.app.ۥ۟۟۟ r0 = new androidx.fragment.app.ۥ۟۟۟
                r0.<init>(r2)
                return r0
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥ۟۟۟۠, reason: contains not printable characters */
    public class RunnableC7579 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ androidx.fragment.app.FragmentManager f29229;

        public RunnableC7579(androidx.fragment.app.FragmentManager r1) {
                r0 = this;
                r0.f29229 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                androidx.fragment.app.FragmentManager r0 = r2.f29229
                r1 = 1
                r0.m29140(r1)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public class C7580 implements Yue.InterfaceC2772 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ androidx.fragment.app.Fragment f29230;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ androidx.fragment.app.FragmentManager f29231;

        public C7580(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2) {
                r0 = this;
                r0.f29231 = r1
                r0.f29230 = r2
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC2772
        /* JADX INFO: renamed from: ۥ */
        public void mo12132(@Yue.InterfaceC4410 androidx.fragment.app.FragmentManager r1, @Yue.InterfaceC4410 androidx.fragment.app.Fragment r2) {
                r0 = this;
                androidx.fragment.app.Fragment r1 = r0.f29230
                r1.onAttachFragment(r2)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public class C7581 implements Yue.InterfaceC0219<Yue.C0217> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.fragment.app.FragmentManager f29232;

        public C7581(androidx.fragment.app.FragmentManager r1) {
                r0 = this;
                r0.f29232 = r1
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC0219
        /* JADX INFO: renamed from: ۥ */
        public /* bridge */ /* synthetic */ void mo1122(Yue.C0217 r1) {
                r0 = this;
                Yue.ۥ۟۟ۨ۟ r1 = (Yue.C0217) r1
                r0.m29238(r1)
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void m29238(Yue.C0217 r5) {
                r4 = this;
                androidx.fragment.app.FragmentManager r0 = r4.f29232
                java.util.ArrayDeque<androidx.fragment.app.FragmentManager$ۥ۟۟۟ۨ> r0 = r0.f29208
                java.lang.Object r0 = r0.pollLast()
                androidx.fragment.app.FragmentManager$ۥ۟۟۟ۨ r0 = (androidx.fragment.app.FragmentManager.C7587) r0
                java.lang.String r1 = "FragmentManager"
                if (r0 != 0) goto L23
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "No Activities were started for result for "
                r5.append(r0)
                r5.append(r4)
                java.lang.String r5 = r5.toString()
                android.util.Log.w(r1, r5)
                return
            L23:
                java.lang.String r2 = r0.f29236
                int r0 = r0.f29237
                androidx.fragment.app.FragmentManager r3 = r4.f29232
                androidx.fragment.app.ۥ۟۟۠ r3 = androidx.fragment.app.FragmentManager.m29083(r3)
                androidx.fragment.app.Fragment r3 = r3.m29411(r2)
                if (r3 != 0) goto L48
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "Activity result delivered for unknown Fragment "
                r5.append(r0)
                r5.append(r2)
                java.lang.String r5 = r5.toString()
                android.util.Log.w(r1, r5)
                return
            L48:
                int r1 = r5.m1119()
                android.content.Intent r5 = r5.m1118()
                r3.onActivityResult(r0, r1, r5)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥۣ۟۟۟, reason: contains not printable characters */
    public class C7582 implements Yue.InterfaceC0219<Yue.C0217> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.fragment.app.FragmentManager f29233;

        public C7582(androidx.fragment.app.FragmentManager r1) {
                r0 = this;
                r0.f29233 = r1
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC0219
        /* JADX INFO: renamed from: ۥ */
        public /* bridge */ /* synthetic */ void mo1122(Yue.C0217 r1) {
                r0 = this;
                Yue.ۥ۟۟ۨ۟ r1 = (Yue.C0217) r1
                r0.m29239(r1)
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void m29239(Yue.C0217 r5) {
                r4 = this;
                androidx.fragment.app.FragmentManager r0 = r4.f29233
                java.util.ArrayDeque<androidx.fragment.app.FragmentManager$ۥ۟۟۟ۨ> r0 = r0.f29208
                java.lang.Object r0 = r0.pollFirst()
                androidx.fragment.app.FragmentManager$ۥ۟۟۟ۨ r0 = (androidx.fragment.app.FragmentManager.C7587) r0
                java.lang.String r1 = "FragmentManager"
                if (r0 != 0) goto L23
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "No IntentSenders were started for "
                r5.append(r0)
                r5.append(r4)
                java.lang.String r5 = r5.toString()
                android.util.Log.w(r1, r5)
                return
            L23:
                java.lang.String r2 = r0.f29236
                int r0 = r0.f29237
                androidx.fragment.app.FragmentManager r3 = r4.f29233
                androidx.fragment.app.ۥ۟۟۠ r3 = androidx.fragment.app.FragmentManager.m29083(r3)
                androidx.fragment.app.Fragment r3 = r3.m29411(r2)
                if (r3 != 0) goto L48
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "Intent Sender result delivered for unknown Fragment "
                r5.append(r0)
                r5.append(r2)
                java.lang.String r5 = r5.toString()
                android.util.Log.w(r1, r5)
                return
            L48:
                int r1 = r5.m1119()
                android.content.Intent r5 = r5.m1118()
                r3.onActivityResult(r0, r1, r5)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public interface InterfaceC7583 {
        int getId();

        @Yue.InterfaceC4544
        java.lang.String getName();

        @Yue.InterfaceC4544
        @java.lang.Deprecated
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        java.lang.CharSequence mo29240();

        @Yue.InterfaceC5971
        @java.lang.Deprecated
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        int mo29241();

        @Yue.InterfaceC5971
        @java.lang.Deprecated
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        int mo29242();

        @Yue.InterfaceC4544
        @java.lang.Deprecated
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        java.lang.CharSequence mo29243();
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥ۟۟۟ۥ, reason: contains not printable characters */
    public class C7584 implements androidx.fragment.app.FragmentManager.InterfaceC7591 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.String f29234;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ androidx.fragment.app.FragmentManager f29235;

        public C7584(@Yue.InterfaceC4410 androidx.fragment.app.FragmentManager r1, java.lang.String r2) {
                r0 = this;
                r0.f29235 = r1
                r0.<init>()
                r0.f29234 = r2
                return
        }

        @Override // androidx.fragment.app.FragmentManager.InterfaceC7591
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public boolean mo29244(@Yue.InterfaceC4410 java.util.ArrayList<androidx.fragment.app.C7595> r3, @Yue.InterfaceC4410 java.util.ArrayList<java.lang.Boolean> r4) {
                r2 = this;
                androidx.fragment.app.FragmentManager r0 = r2.f29235
                java.lang.String r1 = r2.f29234
                boolean r3 = r0.m29105(r3, r4, r1)
                return r3
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static class C7585 extends Yue.AbstractC0221<Yue.C3313, Yue.C0217> {
        public C7585() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // Yue.AbstractC0221
        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ */
        public /* bridge */ /* synthetic */ android.content.Intent mo1123(@Yue.InterfaceC4410 android.content.Context r1, Yue.C3313 r2) {
                r0 = this;
                Yue.ۥ۠ۥۦۣ r2 = (Yue.C3313) r2
                android.content.Intent r1 = r0.m29245(r1, r2)
                return r1
        }

        @Override // Yue.AbstractC0221
        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟ */
        public /* bridge */ /* synthetic */ Yue.C0217 mo1125(int r1, @Yue.InterfaceC4544 android.content.Intent r2) {
                r0 = this;
                Yue.ۥ۟۟ۨ۟ r1 = r0.m29246(r1, r2)
                return r1
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public android.content.Intent m29245(@Yue.InterfaceC4410 android.content.Context r4, Yue.C3313 r5) {
                r3 = this;
                android.content.Intent r4 = new android.content.Intent
                java.lang.String r0 = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"
                r4.<init>(r0)
                android.content.Intent r0 = r5.m13860()
                if (r0 == 0) goto L42
                java.lang.String r1 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"
                android.os.Bundle r2 = r0.getBundleExtra(r1)
                if (r2 == 0) goto L42
                r4.putExtra(r1, r2)
                r0.removeExtra(r1)
                java.lang.String r1 = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE"
                r2 = 0
                boolean r0 = r0.getBooleanExtra(r1, r2)
                if (r0 == 0) goto L42
                Yue.ۥ۠ۥۦۣ$ۥ r0 = new Yue.ۥ۠ۥۦۣ$ۥ
                android.content.IntentSender r1 = r5.m13863()
                r0.<init>(r1)
                r1 = 0
                Yue.ۥ۠ۥۦۣ$ۥ r0 = r0.m13865(r1)
                int r1 = r5.m13862()
                int r5 = r5.m13861()
                Yue.ۥ۠ۥۦۣ$ۥ r5 = r0.m13866(r1, r5)
                Yue.ۥ۠ۥۦۣ r5 = r5.m13864()
            L42:
                java.lang.String r0 = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST"
                r4.putExtra(r0, r5)
                r5 = 2
                boolean r5 = androidx.fragment.app.FragmentManager.m29090(r5)
                if (r5 == 0) goto L64
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "CreateIntent created the following intent: "
                r5.append(r0)
                r5.append(r4)
                java.lang.String r5 = r5.toString()
                java.lang.String r0 = "FragmentManager"
                android.util.Log.v(r0, r5)
            L64:
                return r4
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public Yue.C0217 m29246(int r2, @Yue.InterfaceC4544 android.content.Intent r3) {
                r1 = this;
                Yue.ۥ۟۟ۨ۟ r0 = new Yue.ۥ۟۟ۨ۟
                r0.<init>(r2, r3)
                return r0
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static abstract class AbstractC7586 {
        public AbstractC7586() {
                r0 = this;
                r0.<init>()
                return
        }

        @java.lang.Deprecated
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void m29247(@Yue.InterfaceC4410 androidx.fragment.app.FragmentManager r1, @Yue.InterfaceC4410 androidx.fragment.app.Fragment r2, @Yue.InterfaceC4544 android.os.Bundle r3) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void m29248(@Yue.InterfaceC4410 androidx.fragment.app.FragmentManager r1, @Yue.InterfaceC4410 androidx.fragment.app.Fragment r2, @Yue.InterfaceC4410 android.content.Context r3) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m29249(@Yue.InterfaceC4410 androidx.fragment.app.FragmentManager r1, @Yue.InterfaceC4410 androidx.fragment.app.Fragment r2, @Yue.InterfaceC4544 android.os.Bundle r3) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m29250(@Yue.InterfaceC4410 androidx.fragment.app.FragmentManager r1, @Yue.InterfaceC4410 androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void m29251(@Yue.InterfaceC4410 androidx.fragment.app.FragmentManager r1, @Yue.InterfaceC4410 androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public void m29252(@Yue.InterfaceC4410 androidx.fragment.app.FragmentManager r1, @Yue.InterfaceC4410 androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void m29253(@Yue.InterfaceC4410 androidx.fragment.app.FragmentManager r1, @Yue.InterfaceC4410 androidx.fragment.app.Fragment r2, @Yue.InterfaceC4410 android.content.Context r3) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void m29254(@Yue.InterfaceC4410 androidx.fragment.app.FragmentManager r1, @Yue.InterfaceC4410 androidx.fragment.app.Fragment r2, @Yue.InterfaceC4544 android.os.Bundle r3) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public void m29255(@Yue.InterfaceC4410 androidx.fragment.app.FragmentManager r1, @Yue.InterfaceC4410 androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void m29256(@Yue.InterfaceC4410 androidx.fragment.app.FragmentManager r1, @Yue.InterfaceC4410 androidx.fragment.app.Fragment r2, @Yue.InterfaceC4410 android.os.Bundle r3) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public void m29257(@Yue.InterfaceC4410 androidx.fragment.app.FragmentManager r1, @Yue.InterfaceC4410 androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public void m29258(@Yue.InterfaceC4410 androidx.fragment.app.FragmentManager r1, @Yue.InterfaceC4410 androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public void mo29259(@Yue.InterfaceC4410 androidx.fragment.app.FragmentManager r1, @Yue.InterfaceC4410 androidx.fragment.app.Fragment r2, @Yue.InterfaceC4410 android.view.View r3, @Yue.InterfaceC4544 android.os.Bundle r4) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public void m29260(@Yue.InterfaceC4410 androidx.fragment.app.FragmentManager r1, @Yue.InterfaceC4410 androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥ۟۟۟ۨ, reason: contains not printable characters */
    @android.annotation.SuppressLint({"BanParcelableUsage"})
    public static class C7587 implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.fragment.app.FragmentManager.C7587> CREATOR = null;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public java.lang.String f29236;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f29237;

        /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥ۟۟۟ۨ$ۥ, reason: contains not printable characters */
        public class C7588 implements android.os.Parcelable.Creator<androidx.fragment.app.FragmentManager.C7587> {
            public C7588() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ androidx.fragment.app.FragmentManager.C7587 createFromParcel(android.os.Parcel r1) {
                    r0 = this;
                    androidx.fragment.app.FragmentManager$ۥ۟۟۟ۨ r1 = r0.m29261(r1)
                    return r1
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ androidx.fragment.app.FragmentManager.C7587[] newArray(int r1) {
                    r0 = this;
                    androidx.fragment.app.FragmentManager$ۥ۟۟۟ۨ[] r1 = r0.m29262(r1)
                    return r1
            }

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public androidx.fragment.app.FragmentManager.C7587 m29261(android.os.Parcel r2) {
                    r1 = this;
                    androidx.fragment.app.FragmentManager$ۥ۟۟۟ۨ r0 = new androidx.fragment.app.FragmentManager$ۥ۟۟۟ۨ
                    r0.<init>(r2)
                    return r0
            }

            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public androidx.fragment.app.FragmentManager.C7587[] m29262(int r1) {
                    r0 = this;
                    androidx.fragment.app.FragmentManager$ۥ۟۟۟ۨ[] r1 = new androidx.fragment.app.FragmentManager.C7587[r1]
                    return r1
            }
        }

        static {
                androidx.fragment.app.FragmentManager$ۥ۟۟۟ۨ$ۥ r0 = new androidx.fragment.app.FragmentManager$ۥ۟۟۟ۨ$ۥ
                r0.<init>()
                androidx.fragment.app.FragmentManager.C7587.CREATOR = r0
                return
        }

        public C7587(@Yue.InterfaceC4410 android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = r2.readString()
                r1.f29236 = r0
                int r2 = r2.readInt()
                r1.f29237 = r2
                return
        }

        public C7587(@Yue.InterfaceC4410 java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.f29236 = r1
                r0.f29237 = r2
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                java.lang.String r2 = r0.f29236
                r1.writeString(r2)
                int r2 = r0.f29237
                r1.writeInt(r2)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥ۟۟۠, reason: contains not printable characters */
    public static class C7589 implements Yue.InterfaceC2774 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final androidx.lifecycle.Lifecycle f29238;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final Yue.InterfaceC2774 f29239;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final androidx.lifecycle.LifecycleEventObserver f29240;

        public C7589(@Yue.InterfaceC4410 androidx.lifecycle.Lifecycle r1, @Yue.InterfaceC4410 Yue.InterfaceC2774 r2, @Yue.InterfaceC4410 androidx.lifecycle.LifecycleEventObserver r3) {
                r0 = this;
                r0.<init>()
                r0.f29238 = r1
                r0.f29239 = r2
                r0.f29240 = r3
                return
        }

        @Override // Yue.InterfaceC2774
        /* JADX INFO: renamed from: ۥ */
        public void mo12144(@Yue.InterfaceC4410 java.lang.String r2, @Yue.InterfaceC4410 android.os.Bundle r3) {
                r1 = this;
                Yue.ۥ۠ۢۨۨ r0 = r1.f29239
                r0.mo12144(r2, r3)
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public boolean m29263(androidx.lifecycle.Lifecycle.State r2) {
                r1 = this;
                androidx.lifecycle.Lifecycle r0 = r1.f29238
                androidx.lifecycle.Lifecycle$State r0 = r0.getCurrentState()
                boolean r2 = r0.isAtLeast(r2)
                return r2
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m29264() {
                r2 = this;
                androidx.lifecycle.Lifecycle r0 = r2.f29238
                androidx.lifecycle.LifecycleEventObserver r1 = r2.f29240
                r0.removeObserver(r1)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥ۟۟۠۟, reason: contains not printable characters */
    public interface InterfaceC7590 {
        @Yue.InterfaceC3875
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        default void m29265(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r1, boolean r2) {
                r0 = this;
                return
        }

        @Yue.InterfaceC3875
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        default void m29266(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r1, boolean r2) {
                r0 = this;
                return
        }

        @Yue.InterfaceC3875
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        void m29267();
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥ۟۟۠۠, reason: contains not printable characters */
    public interface InterfaceC7591 {
        /* JADX INFO: renamed from: ۥ۟ */
        boolean mo29244(@Yue.InterfaceC4410 java.util.ArrayList<androidx.fragment.app.C7595> r1, @Yue.InterfaceC4410 java.util.ArrayList<java.lang.Boolean> r2);
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥ۟۟۠ۡ, reason: contains not printable characters */
    public class C7592 implements androidx.fragment.app.FragmentManager.InterfaceC7591 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.String f29241;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final int f29242;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int f29243;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ androidx.fragment.app.FragmentManager f29244;

        public C7592(@Yue.InterfaceC4544 androidx.fragment.app.FragmentManager r1, java.lang.String r2, int r3, int r4) {
                r0 = this;
                r0.f29244 = r1
                r0.<init>()
                r0.f29241 = r2
                r0.f29242 = r3
                r0.f29243 = r4
                return
        }

        @Override // androidx.fragment.app.FragmentManager.InterfaceC7591
        /* JADX INFO: renamed from: ۥ۟ */
        public boolean mo29244(@Yue.InterfaceC4410 java.util.ArrayList<androidx.fragment.app.C7595> r7, @Yue.InterfaceC4410 java.util.ArrayList<java.lang.Boolean> r8) {
                r6 = this;
                androidx.fragment.app.FragmentManager r0 = r6.f29244
                androidx.fragment.app.Fragment r0 = r0.f29200
                if (r0 == 0) goto L1a
                int r1 = r6.f29242
                if (r1 >= 0) goto L1a
                java.lang.String r1 = r6.f29241
                if (r1 != 0) goto L1a
                androidx.fragment.app.FragmentManager r0 = r0.getChildFragmentManager()
                boolean r0 = r0.m29199()
                if (r0 == 0) goto L1a
                r7 = 0
                return r7
            L1a:
                androidx.fragment.app.FragmentManager r0 = r6.f29244
                java.lang.String r3 = r6.f29241
                int r4 = r6.f29242
                int r5 = r6.f29243
                r1 = r7
                r2 = r8
                boolean r7 = r0.m29203(r1, r2, r3, r4, r5)
                return r7
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥ۟۟۠ۢ, reason: contains not printable characters */
    public class C7593 implements androidx.fragment.app.FragmentManager.InterfaceC7591 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.String f29245;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ androidx.fragment.app.FragmentManager f29246;

        public C7593(@Yue.InterfaceC4410 androidx.fragment.app.FragmentManager r1, java.lang.String r2) {
                r0 = this;
                r0.f29246 = r1
                r0.<init>()
                r0.f29245 = r2
                return
        }

        @Override // androidx.fragment.app.FragmentManager.InterfaceC7591
        /* JADX INFO: renamed from: ۥ۟ */
        public boolean mo29244(@Yue.InterfaceC4410 java.util.ArrayList<androidx.fragment.app.C7595> r3, @Yue.InterfaceC4410 java.util.ArrayList<java.lang.Boolean> r4) {
                r2 = this;
                androidx.fragment.app.FragmentManager r0 = r2.f29246
                java.lang.String r1 = r2.f29245
                boolean r3 = r0.m29214(r3, r4, r1)
                return r3
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$ۥۣ۟۟۠, reason: contains not printable characters */
    public class C7594 implements androidx.fragment.app.FragmentManager.InterfaceC7591 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.String f29247;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ androidx.fragment.app.FragmentManager f29248;

        public C7594(@Yue.InterfaceC4410 androidx.fragment.app.FragmentManager r1, java.lang.String r2) {
                r0 = this;
                r0.f29248 = r1
                r0.<init>()
                r0.f29247 = r2
                return
        }

        @Override // androidx.fragment.app.FragmentManager.InterfaceC7591
        /* JADX INFO: renamed from: ۥ۟ */
        public boolean mo29244(@Yue.InterfaceC4410 java.util.ArrayList<androidx.fragment.app.C7595> r3, @Yue.InterfaceC4410 java.util.ArrayList<java.lang.Boolean> r4) {
                r2 = this;
                androidx.fragment.app.FragmentManager r0 = r2.f29248
                java.lang.String r1 = r2.f29247
                boolean r3 = r0.m29221(r3, r4, r1)
                return r3
        }
    }

    static {
            return
    }

    public FragmentManager() {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f29176 = r0
            androidx.fragment.app.ۥ۟۟۠ r0 = new androidx.fragment.app.ۥ۟۟۠
            r0.<init>()
            r2.f29178 = r0
            androidx.fragment.app.ۥ۟۟۟ۢ r0 = new androidx.fragment.app.ۥ۟۟۟ۢ
            r0.<init>(r2)
            r2.f29181 = r0
            androidx.fragment.app.FragmentManager$ۥ۟ r0 = new androidx.fragment.app.FragmentManager$ۥ۟
            r1 = 0
            r0.<init>(r2, r1)
            r2.f29183 = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r2.f29184 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r2.f29185 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r2.f29186 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r2.f29187 = r0
            androidx.fragment.app.ۥۣ۟۟۟ r0 = new androidx.fragment.app.ۥۣ۟۟۟
            r0.<init>(r2)
            r2.f29189 = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.f29190 = r0
            Yue.ۥ۠ۢۨ۟ r0 = new Yue.ۥ۠ۢۨ۟
            r0.<init>(r2)
            r2.f29191 = r0
            Yue.ۥ۠ۢۨ۠ r0 = new Yue.ۥ۠ۢۨ۠
            r0.<init>(r2)
            r2.f29192 = r0
            Yue.ۥ۠ۢۨۡ r0 = new Yue.ۥ۠ۢۨۡ
            r0.<init>(r2)
            r2.f29193 = r0
            Yue.ۥ۠ۢۨۢ r0 = new Yue.ۥ۠ۢۨۢ
            r0.<init>(r2)
            r2.f29194 = r0
            androidx.fragment.app.FragmentManager$ۥ۟۟ r0 = new androidx.fragment.app.FragmentManager$ۥ۟۟
            r0.<init>(r2)
            r2.f29195 = r0
            r0 = -1
            r2.f29196 = r0
            r0 = 0
            r2.f29201 = r0
            androidx.fragment.app.FragmentManager$ۥ۟۟۟ r1 = new androidx.fragment.app.FragmentManager$ۥ۟۟۟
            r1.<init>(r2)
            r2.f29202 = r1
            r2.f29203 = r0
            androidx.fragment.app.FragmentManager$ۥ۟۟۟۟ r0 = new androidx.fragment.app.FragmentManager$ۥ۟۟۟۟
            r0.<init>(r2)
            r2.f29204 = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r2.f29208 = r0
            androidx.fragment.app.FragmentManager$ۥ۟۟۟۠ r0 = new androidx.fragment.app.FragmentManager$ۥ۟۟۟۠
            r0.<init>(r2)
            r2.f29219 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m29076(androidx.fragment.app.FragmentManager r0, java.lang.Integer r1) {
            r0.m29184(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ android.os.Bundle m29077(androidx.fragment.app.FragmentManager r0) {
            android.os.Bundle r0 = r0.m29182()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ void m29078(androidx.fragment.app.FragmentManager r0, Yue.C4767 r1) {
            r0.m29186(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ void m29079(androidx.fragment.app.FragmentManager r0, Yue.C4298 r1) {
            r0.m29185(r1)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m29080(androidx.fragment.app.FragmentManager r0, android.content.res.Configuration r1) {
            r0.m29183(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static /* synthetic */ java.util.Map m29081(androidx.fragment.app.FragmentManager r0) {
            java.util.Map<java.lang.String, android.os.Bundle> r0 = r0.f29186
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static /* synthetic */ java.util.Map m29082(androidx.fragment.app.FragmentManager r0) {
            java.util.Map<java.lang.String, androidx.fragment.app.FragmentManager$ۥ۟۟۠> r0 = r0.f29187
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static /* synthetic */ androidx.fragment.app.C7631 m29083(androidx.fragment.app.FragmentManager r0) {
            androidx.fragment.app.ۥ۟۟۠ r0 = r0.f29178
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static void m29084(boolean r0) {
            androidx.fragment.app.FragmentManager.f29172 = r0
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static void m29085(@Yue.InterfaceC4410 java.util.ArrayList<androidx.fragment.app.C7595> r2, @Yue.InterfaceC4410 java.util.ArrayList<java.lang.Boolean> r3, int r4, int r5) {
        L0:
            if (r4 >= r5) goto L26
            java.lang.Object r0 = r2.get(r4)
            androidx.fragment.app.ۥ r0 = (androidx.fragment.app.C7595) r0
            java.lang.Object r1 = r3.get(r4)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L1c
            r1 = -1
            r0.m29280(r1)
            r0.m29286()
            goto L23
        L1c:
            r1 = 1
            r0.m29280(r1)
            r0.m29285()
        L23:
            int r4 = r4 + 1
            goto L0
        L26:
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public static <F extends androidx.fragment.app.Fragment> F m29086(@Yue.InterfaceC4410 android.view.View r3) {
            androidx.fragment.app.Fragment r0 = m29088(r3)
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "View "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " does not have a Fragment set"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public static androidx.fragment.app.FragmentManager m29087(@Yue.InterfaceC4410 android.view.View r4) {
            androidx.fragment.app.Fragment r0 = m29088(r4)
            if (r0 == 0) goto L35
            boolean r1 = r0.isAdded()
            if (r1 == 0) goto L11
            androidx.fragment.app.FragmentManager r4 = r0.getChildFragmentManager()
            goto L52
        L11:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "The Fragment "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " that owns View "
            r2.append(r0)
            r2.append(r4)
            java.lang.String r4 = " has already been destroyed. Nested fragments should always use the child FragmentManager."
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            throw r1
        L35:
            android.content.Context r0 = r4.getContext()
        L39:
            boolean r1 = r0 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L4b
            boolean r1 = r0 instanceof androidx.fragment.app.FragmentActivity
            if (r1 == 0) goto L44
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            goto L4c
        L44:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L39
        L4b:
            r0 = 0
        L4c:
            if (r0 == 0) goto L53
            androidx.fragment.app.FragmentManager r4 = r0.getSupportFragmentManager()
        L52:
            return r4
        L53:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "View "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " is not within a subclass of FragmentActivity."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public static androidx.fragment.app.Fragment m29088(@Yue.InterfaceC4410 android.view.View r2) {
        L0:
            r0 = 0
            if (r2 == 0) goto L17
            androidx.fragment.app.Fragment r1 = m29089(r2)
            if (r1 == 0) goto La
            return r1
        La:
            android.view.ViewParent r2 = r2.getParent()
            boolean r1 = r2 instanceof android.view.View
            if (r1 == 0) goto L15
            android.view.View r2 = (android.view.View) r2
            goto L0
        L15:
            r2 = r0
            goto L0
        L17:
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public static androidx.fragment.app.Fragment m29089(@Yue.InterfaceC4410 android.view.View r1) {
            int r0 = Yue.C5040.C5043.f16384
            java.lang.Object r1 = r1.getTag(r0)
            boolean r0 = r1 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto Ld
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            return r1
        Ld:
            r1 = 0
            return r1
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public static boolean m29090(int r1) {
            boolean r0 = androidx.fragment.app.FragmentManager.f29172
            if (r0 != 0) goto Lf
            java.lang.String r0 = "FragmentManager"
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            goto L10
        Lf:
            r1 = 1
        L10:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۧ, reason: contains not printable characters */
    public static int m29091(int r3) {
            r0 = 8194(0x2002, float:1.1482E-41)
            r1 = 4097(0x1001, float:5.741E-42)
            if (r3 == r1) goto L19
            if (r3 == r0) goto L16
            r0 = 4100(0x1004, float:5.745E-42)
            r1 = 8197(0x2005, float:1.1486E-41)
            if (r3 == r1) goto L19
            r2 = 4099(0x1003, float:5.744E-42)
            if (r3 == r2) goto L18
            if (r3 == r0) goto L16
            r0 = 0
            goto L19
        L16:
            r0 = r1
            goto L19
        L18:
            r0 = r2
        L19:
            return r0
    }

    @Yue.InterfaceC4410
    public java.lang.String toString() {
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
            androidx.fragment.app.Fragment r1 = r4.f29199
            java.lang.String r2 = "}"
            java.lang.String r3 = "{"
            if (r1 == 0) goto L43
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r0.append(r3)
            androidx.fragment.app.Fragment r1 = r4.f29199
            int r1 = java.lang.System.identityHashCode(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            r0.append(r2)
            goto L6b
        L43:
            Yue.ۥ۠ۢۨ<?> r1 = r4.f29197
            if (r1 == 0) goto L66
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r0.append(r3)
            Yue.ۥ۠ۢۨ<?> r1 = r4.f29197
            int r1 = java.lang.System.identityHashCode(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            r0.append(r2)
            goto L6b
        L66:
            java.lang.String r1 = "null"
            r0.append(r1)
        L6b:
            java.lang.String r1 = "}}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.InterfaceC2775
    /* JADX INFO: renamed from: ۥ */
    public final void mo12145(@Yue.InterfaceC4410 java.lang.String r3, @Yue.InterfaceC4410 android.os.Bundle r4) {
            r2 = this;
            java.util.Map<java.lang.String, androidx.fragment.app.FragmentManager$ۥ۟۟۠> r0 = r2.f29187
            java.lang.Object r0 = r0.get(r3)
            androidx.fragment.app.FragmentManager$ۥ۟۟۠ r0 = (androidx.fragment.app.FragmentManager.C7589) r0
            if (r0 == 0) goto L16
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r1 = r0.m29263(r1)
            if (r1 == 0) goto L16
            r0.mo12144(r3, r4)
            goto L1b
        L16:
            java.util.Map<java.lang.String, android.os.Bundle> r0 = r2.f29186
            r0.put(r3, r4)
        L1b:
            r0 = 2
            boolean r0 = m29090(r0)
            if (r0 == 0) goto L40
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Setting fragment result with key "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " and result "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            java.lang.String r4 = "FragmentManager"
            android.util.Log.v(r4, r3)
        L40:
            return
    }

    @Override // Yue.InterfaceC2775
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /* JADX INFO: renamed from: ۥ۟ */
    public final void mo12146(@Yue.InterfaceC4410 java.lang.String r4, @Yue.InterfaceC4410 androidx.lifecycle.LifecycleOwner r5, @Yue.InterfaceC4410 Yue.InterfaceC2774 r6) {
            r3 = this;
            androidx.lifecycle.Lifecycle r5 = r5.getLifecycle()
            androidx.lifecycle.Lifecycle$State r0 = r5.getCurrentState()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r0 != r1) goto Ld
            return
        Ld:
            androidx.fragment.app.FragmentManager$6 r0 = new androidx.fragment.app.FragmentManager$6
            r0.<init>(r3, r4, r6, r5)
            java.util.Map<java.lang.String, androidx.fragment.app.FragmentManager$ۥ۟۟۠> r1 = r3.f29187
            androidx.fragment.app.FragmentManager$ۥ۟۟۠ r2 = new androidx.fragment.app.FragmentManager$ۥ۟۟۠
            r2.<init>(r5, r6, r0)
            java.lang.Object r1 = r1.put(r4, r2)
            androidx.fragment.app.FragmentManager$ۥ۟۟۠ r1 = (androidx.fragment.app.FragmentManager.C7589) r1
            if (r1 == 0) goto L24
            r1.m29264()
        L24:
            r1 = 2
            boolean r1 = m29090(r1)
            if (r1 == 0) goto L51
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Setting FragmentResultListener with key "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " lifecycleOwner "
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = " and listener "
            r1.append(r4)
            r1.append(r6)
            java.lang.String r4 = r1.toString()
            java.lang.String r6 = "FragmentManager"
            android.util.Log.v(r6, r4)
        L51:
            r5.addObserver(r0)
            return
    }

    @Override // Yue.InterfaceC2775
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final void mo12147(@Yue.InterfaceC4410 java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, androidx.fragment.app.FragmentManager$ۥ۟۟۠> r0 = r2.f29187
            java.lang.Object r0 = r0.remove(r3)
            androidx.fragment.app.FragmentManager$ۥ۟۟۠ r0 = (androidx.fragment.app.FragmentManager.C7589) r0
            if (r0 == 0) goto Ld
            r0.m29264()
        Ld:
            r0 = 2
            boolean r0 = m29090(r0)
            if (r0 == 0) goto L2a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Clearing FragmentResultListener for key "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.v(r0, r3)
        L2a:
            return
    }

    @Override // Yue.InterfaceC2775
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public final void mo12148(@Yue.InterfaceC4410 java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, android.os.Bundle> r0 = r2.f29186
            r0.remove(r3)
            r0 = 2
            boolean r0 = m29090(r0)
            if (r0 == 0) goto L22
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Clearing fragment result with key "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.v(r0, r3)
        L22:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m29092(androidx.fragment.app.C7595 r2) {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.ۥ> r0 = r1.f29179
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f29179 = r0
        Lb:
            java.util.ArrayList<androidx.fragment.app.ۥ> r0 = r1.f29179
            r0.add(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public androidx.fragment.app.C7627 m29093(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r4) {
            r3 = this;
            java.lang.String r0 = r4.mPreviousWho
            if (r0 == 0) goto L7
            Yue.C2779.m12154(r4, r0)
        L7:
            r0 = 2
            boolean r0 = m29090(r0)
            if (r0 == 0) goto L24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "add: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L24:
            androidx.fragment.app.ۥ۟۟۟ۧ r0 = r3.m29109(r4)
            r4.mFragmentManager = r3
            androidx.fragment.app.ۥ۟۟۠ r1 = r3.f29178
            r1.m29421(r0)
            boolean r1 = r4.mDetached
            if (r1 != 0) goto L4a
            androidx.fragment.app.ۥ۟۟۠ r1 = r3.f29178
            r1.m29403(r4)
            r1 = 0
            r4.mRemoving = r1
            android.view.View r2 = r4.mView
            if (r2 != 0) goto L41
            r4.mHiddenChanged = r1
        L41:
            boolean r4 = r3.m29175(r4)
            if (r4 == 0) goto L4a
            r4 = 1
            r3.f29209 = r4
        L4a:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m29094(@Yue.InterfaceC4410 Yue.InterfaceC2772 r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<Yue.ۥ۠ۢۨۦ> r0 = r1.f29190
            r0.add(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m29095(@Yue.InterfaceC4410 androidx.fragment.app.FragmentManager.InterfaceC7590 r2) {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$ۥ۟۟۠۟> r0 = r1.f29188
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f29188 = r0
        Lb:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$ۥ۟۟۠۟> r0 = r1.f29188
            r0.add(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m29096(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r2) {
            r1 = this;
            androidx.fragment.app.ۥ۟۟۟ۥ r0 = r1.f29217
            r0.m29363(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public int m29097() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.f29184
            int r0 = r0.getAndIncrement()
            return r0
    }

    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m29098(@Yue.InterfaceC4410 Yue.AbstractC2764<?> r4, @Yue.InterfaceC4410 Yue.AbstractC2762 r5, @Yue.InterfaceC4544 androidx.fragment.app.Fragment r6) {
            r3 = this;
            Yue.ۥ۠ۢۨ<?> r0 = r3.f29197
            if (r0 != 0) goto L16c
            r3.f29197 = r4
            r3.f29198 = r5
            r3.f29199 = r6
            if (r6 == 0) goto L15
            androidx.fragment.app.FragmentManager$ۥ۟۟۟ۡ r5 = new androidx.fragment.app.FragmentManager$ۥ۟۟۟ۡ
            r5.<init>(r3, r6)
            r3.m29094(r5)
            goto L1f
        L15:
            boolean r5 = r4 instanceof Yue.InterfaceC2772
            if (r5 == 0) goto L1f
            r5 = r4
            Yue.ۥ۠ۢۨۦ r5 = (Yue.InterfaceC2772) r5
            r3.m29094(r5)
        L1f:
            androidx.fragment.app.Fragment r5 = r3.f29199
            if (r5 == 0) goto L26
            r3.m29235()
        L26:
            boolean r5 = r4 instanceof Yue.InterfaceC4611
            if (r5 == 0) goto L3b
            r5 = r4
            Yue.ۥۣۡۡۥ r5 = (Yue.InterfaceC4611) r5
            androidx.activity.OnBackPressedDispatcher r0 = r5.getOnBackPressedDispatcher()
            r3.f29182 = r0
            if (r6 == 0) goto L36
            r5 = r6
        L36:
            Yue.ۥۣۡۡۢ r1 = r3.f29183
            r0.m27753(r5, r1)
        L3b:
            if (r6 == 0) goto L46
            androidx.fragment.app.FragmentManager r4 = r6.mFragmentManager
            androidx.fragment.app.ۥ۟۟۟ۥ r4 = r4.m29156(r6)
            r3.f29217 = r4
            goto L5f
        L46:
            boolean r5 = r4 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r5 == 0) goto L57
            androidx.lifecycle.ViewModelStoreOwner r4 = (androidx.lifecycle.ViewModelStoreOwner) r4
            androidx.lifecycle.ViewModelStore r4 = r4.getViewModelStore()
            androidx.fragment.app.ۥ۟۟۟ۥ r4 = androidx.fragment.app.C7623.m29362(r4)
            r3.f29217 = r4
            goto L5f
        L57:
            androidx.fragment.app.ۥ۟۟۟ۥ r4 = new androidx.fragment.app.ۥ۟۟۟ۥ
            r5 = 0
            r4.<init>(r5)
            r3.f29217 = r4
        L5f:
            androidx.fragment.app.ۥ۟۟۟ۥ r4 = r3.f29217
            boolean r5 = r3.m29181()
            r4.m29375(r5)
            androidx.fragment.app.ۥ۟۟۠ r4 = r3.f29178
            androidx.fragment.app.ۥ۟۟۟ۥ r5 = r3.f29217
            r4.m29430(r5)
            Yue.ۥ۠ۢۨ<?> r4 = r3.f29197
            boolean r5 = r4 instanceof Yue.InterfaceC5504
            if (r5 == 0) goto L90
            if (r6 != 0) goto L90
            Yue.ۥۡۧۤۢ r4 = (Yue.InterfaceC5504) r4
            androidx.savedstate.ۥ r4 = r4.getSavedStateRegistry()
            Yue.ۥۣ۠ۢۨ r5 = new Yue.ۥۣ۠ۢۨ
            r5.<init>(r3)
            java.lang.String r0 = "android:support:fragments"
            r4.m30366(r0, r5)
            android.os.Bundle r4 = r4.m30359(r0)
            if (r4 == 0) goto L90
            r3.m29216(r4)
        L90:
            Yue.ۥ۠ۢۨ<?> r4 = r3.f29197
            boolean r5 = r4 instanceof Yue.InterfaceC0255
            if (r5 == 0) goto L128
            Yue.ۥ۟۟ۨۧ r4 = (Yue.InterfaceC0255) r4
            androidx.activity.result.ActivityResultRegistry r4 = r4.getActivityResultRegistry()
            if (r6 == 0) goto Lb2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = r6.mWho
            r5.append(r0)
            java.lang.String r0 = ":"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            goto Lb4
        Lb2:
            java.lang.String r5 = ""
        Lb4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "FragmentManager:"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r1 = "StartActivityForResult"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            Yue.ۥۣ۟۟ۨ$ۥ۟۟۟ۧ r1 = new Yue.ۥۣ۟۟ۨ$ۥ۟۟۟ۧ
            r1.<init>()
            androidx.fragment.app.FragmentManager$ۥ۟۟۟ۢ r2 = new androidx.fragment.app.FragmentManager$ۥ۟۟۟ۢ
            r2.<init>(r3)
            Yue.ۥ۟۟ۨۦ r0 = r4.m27781(r0, r1, r2)
            r3.f29205 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r1 = "StartIntentSenderForResult"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.fragment.app.FragmentManager$ۥ۟۟۟ۦ r1 = new androidx.fragment.app.FragmentManager$ۥ۟۟۟ۦ
            r1.<init>()
            androidx.fragment.app.FragmentManager$ۥۣ۟۟۟ r2 = new androidx.fragment.app.FragmentManager$ۥۣ۟۟۟
            r2.<init>(r3)
            Yue.ۥ۟۟ۨۦ r0 = r4.m27781(r0, r1, r2)
            r3.f29206 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = "RequestPermissions"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            Yue.ۥۣ۟۟ۨ$ۥ۟۟۟ۥ r0 = new Yue.ۥۣ۟۟ۨ$ۥ۟۟۟ۥ
            r0.<init>()
            androidx.fragment.app.FragmentManager$ۥ r1 = new androidx.fragment.app.FragmentManager$ۥ
            r1.<init>(r3)
            Yue.ۥ۟۟ۨۦ r4 = r4.m27781(r5, r0, r1)
            r3.f29207 = r4
        L128:
            Yue.ۥ۠ۢۨ<?> r4 = r3.f29197
            boolean r5 = r4 instanceof Yue.InterfaceC4612
            if (r5 == 0) goto L135
            Yue.ۥۣۡۡۦ r4 = (Yue.InterfaceC4612) r4
            Yue.ۥ۟ۧ۠ۧ<android.content.res.Configuration> r5 = r3.f29191
            r4.addOnConfigurationChangedListener(r5)
        L135:
            Yue.ۥ۠ۢۨ<?> r4 = r3.f29197
            boolean r5 = r4 instanceof Yue.InterfaceC4621
            if (r5 == 0) goto L142
            Yue.ۥۣۡۢۤ r4 = (Yue.InterfaceC4621) r4
            Yue.ۥ۟ۧ۠ۧ<java.lang.Integer> r5 = r3.f29192
            r4.addOnTrimMemoryListener(r5)
        L142:
            Yue.ۥ۠ۢۨ<?> r4 = r3.f29197
            boolean r5 = r4 instanceof Yue.InterfaceC4616
            if (r5 == 0) goto L14f
            Yue.ۥۣۡۢ۟ r4 = (Yue.InterfaceC4616) r4
            Yue.ۥ۟ۧ۠ۧ<Yue.ۥۡۡۦۢ> r5 = r3.f29193
            r4.addOnMultiWindowModeChangedListener(r5)
        L14f:
            Yue.ۥ۠ۢۨ<?> r4 = r3.f29197
            boolean r5 = r4 instanceof Yue.InterfaceC4618
            if (r5 == 0) goto L15c
            Yue.ۥۣۡۢۡ r4 = (Yue.InterfaceC4618) r4
            Yue.ۥ۟ۧ۠ۧ<Yue.ۥۡۤۡ> r5 = r3.f29194
            r4.addOnPictureInPictureModeChangedListener(r5)
        L15c:
            Yue.ۥ۠ۢۨ<?> r4 = r3.f29197
            boolean r5 = r4 instanceof Yue.InterfaceC4120
            if (r5 == 0) goto L16b
            if (r6 != 0) goto L16b
            Yue.ۥۡ۠ۦ۟ r4 = (Yue.InterfaceC4120) r4
            Yue.ۥۡ۠ۧ r5 = r3.f29195
            r4.addMenuProvider(r5)
        L16b:
            return
        L16c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Already attached"
            r4.<init>(r5)
            throw r4
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m29099(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r5) {
            r4 = this;
            r0 = 2
            boolean r1 = m29090(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L1d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "attach: "
            r1.append(r3)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r2, r1)
        L1d:
            boolean r1 = r5.mDetached
            if (r1 == 0) goto L50
            r1 = 0
            r5.mDetached = r1
            boolean r1 = r5.mAdded
            if (r1 != 0) goto L50
            androidx.fragment.app.ۥ۟۟۠ r1 = r4.f29178
            r1.m29403(r5)
            boolean r0 = m29090(r0)
            if (r0 == 0) goto L47
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "add from attach: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r2, r0)
        L47:
            boolean r5 = r4.m29175(r5)
            if (r5 == 0) goto L50
            r5 = 1
            r4.f29209 = r5
        L50:
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public androidx.fragment.app.AbstractC7632 m29100() {
            r1 = this;
            androidx.fragment.app.ۥ r0 = new androidx.fragment.app.ۥ
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean m29101() {
            r4 = this;
            androidx.fragment.app.ۥ۟۟۠ r0 = r4.f29178
            java.util.List r0 = r0.m29415()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        Lc:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L22
            java.lang.Object r3 = r0.next()
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            if (r3 == 0) goto L1e
            boolean r2 = r4.m29175(r3)
        L1e:
            if (r2 == 0) goto Lc
            r0 = 1
            return r0
        L22:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final void m29102() {
            r2 = this;
            boolean r0 = r2.m29181()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can not perform this action after onSaveInstanceState"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final void m29103() {
            r1 = this;
            r0 = 0
            r1.f29177 = r0
            java.util.ArrayList<java.lang.Boolean> r0 = r1.f29215
            r0.clear()
            java.util.ArrayList<androidx.fragment.app.ۥ> r0 = r1.f29214
            r0.clear()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public void m29104(@Yue.InterfaceC4410 java.lang.String r2) {
            r1 = this;
            androidx.fragment.app.FragmentManager$ۥ۟۟۟ۥ r0 = new androidx.fragment.app.FragmentManager$ۥ۟۟۟ۥ
            r0.<init>(r1, r2)
            r2 = 0
            r1.m29138(r0, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public boolean m29105(@Yue.InterfaceC4410 java.util.ArrayList<androidx.fragment.app.C7595> r7, @Yue.InterfaceC4410 java.util.ArrayList<java.lang.Boolean> r8, @Yue.InterfaceC4410 java.lang.String r9) {
            r6 = this;
            boolean r0 = r6.m29214(r7, r8, r9)
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            r4 = -1
            r5 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            boolean r7 = r0.m29203(r1, r2, r3, r4, r5)
            return r7
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final void m29106() {
            r4 = this;
            Yue.ۥ۠ۢۨ<?> r0 = r4.f29197
            boolean r1 = r0 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r1 == 0) goto L11
            androidx.fragment.app.ۥ۟۟۠ r0 = r4.f29178
            androidx.fragment.app.ۥ۟۟۟ۥ r0 = r0.m29419()
            boolean r0 = r0.m29372()
            goto L29
        L11:
            android.content.Context r0 = r0.m12114()
            boolean r0 = r0 instanceof android.app.Activity
            r1 = 1
            if (r0 == 0) goto L28
            Yue.ۥ۠ۢۨ<?> r0 = r4.f29197
            android.content.Context r0 = r0.m12114()
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            r0 = r0 ^ r1
            goto L29
        L28:
            r0 = r1
        L29:
            if (r0 == 0) goto L5d
            java.util.Map<java.lang.String, androidx.fragment.app.ۥ۟۟> r0 = r4.f29185
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L35:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5d
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.ۥ۟۟ r1 = (androidx.fragment.app.C7598) r1
            java.util.List<java.lang.String> r1 = r1.f29269
            java.util.Iterator r1 = r1.iterator()
        L47:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L35
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            androidx.fragment.app.ۥ۟۟۠ r3 = r4.f29178
            androidx.fragment.app.ۥ۟۟۟ۥ r3 = r3.m29419()
            r3.m29365(r2)
            goto L47
        L5d:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final java.util.Set<androidx.fragment.app.AbstractC7635> m29107() {
            r4 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            androidx.fragment.app.ۥ۟۟۠ r1 = r4.f29178
            java.util.List r1 = r1.m29414()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.ۥ۟۟۟ۧ r2 = (androidx.fragment.app.C7627) r2
            androidx.fragment.app.Fragment r2 = r2.m29390()
            android.view.ViewGroup r2 = r2.mContainer
            if (r2 == 0) goto Lf
            Yue.ۥۢ۟ۦۨ r3 = r4.m29168()
            androidx.fragment.app.ۥ۟۟۠ۡ r2 = androidx.fragment.app.AbstractC7635.m29471(r2, r3)
            r0.add(r2)
            goto Lf
        L2f:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final java.util.Set<androidx.fragment.app.AbstractC7635> m29108(@Yue.InterfaceC4410 java.util.ArrayList<androidx.fragment.app.C7595> r4, int r5, int r6) {
            r3 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
        L5:
            if (r5 >= r6) goto L32
            java.lang.Object r1 = r4.get(r5)
            androidx.fragment.app.ۥ r1 = (androidx.fragment.app.C7595) r1
            java.util.ArrayList<androidx.fragment.app.ۥ۟۟۠۟$ۥ> r1 = r1.f29396
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.ۥ۟۟۠۟$ۥ r2 = (androidx.fragment.app.AbstractC7632.C7633) r2
            androidx.fragment.app.Fragment r2 = r2.f29414
            if (r2 == 0) goto L13
            android.view.ViewGroup r2 = r2.mContainer
            if (r2 == 0) goto L13
            androidx.fragment.app.ۥ۟۟۠ۡ r2 = androidx.fragment.app.AbstractC7635.m29472(r2, r3)
            r0.add(r2)
            goto L13
        L2f:
            int r5 = r5 + 1
            goto L5
        L32:
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public androidx.fragment.app.C7627 m29109(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r4) {
            r3 = this;
            androidx.fragment.app.ۥ۟۟۠ r0 = r3.f29178
            java.lang.String r1 = r4.mWho
            androidx.fragment.app.ۥ۟۟۟ۧ r0 = r0.m29417(r1)
            if (r0 == 0) goto Lb
            return r0
        Lb:
            androidx.fragment.app.ۥ۟۟۟ۧ r0 = new androidx.fragment.app.ۥ۟۟۟ۧ
            androidx.fragment.app.ۥۣ۟۟۟ r1 = r3.f29189
            androidx.fragment.app.ۥ۟۟۠ r2 = r3.f29178
            r0.<init>(r1, r2, r4)
            Yue.ۥ۠ۢۨ<?> r4 = r3.f29197
            android.content.Context r4 = r4.m12114()
            java.lang.ClassLoader r4 = r4.getClassLoader()
            r0.m29394(r4)
            int r4 = r3.f29196
            r0.m29399(r4)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public void m29110(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r5) {
            r4 = this;
            r0 = 2
            boolean r1 = m29090(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L1d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "detach: "
            r1.append(r3)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r2, r1)
        L1d:
            boolean r1 = r5.mDetached
            if (r1 != 0) goto L52
            r1 = 1
            r5.mDetached = r1
            boolean r3 = r5.mAdded
            if (r3 == 0) goto L52
            boolean r0 = m29090(r0)
            if (r0 == 0) goto L42
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "remove from detach: "
            r0.append(r3)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r2, r0)
        L42:
            androidx.fragment.app.ۥ۟۟۠ r0 = r4.f29178
            r0.m29424(r5)
            boolean r0 = r4.m29175(r5)
            if (r0 == 0) goto L4f
            r4.f29209 = r1
        L4f:
            r4.m29230(r5)
        L52:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public void m29111() {
            r2 = this;
            r0 = 0
            r2.f29210 = r0
            r2.f29211 = r0
            androidx.fragment.app.ۥ۟۟۟ۥ r1 = r2.f29217
            r1.m29375(r0)
            r0 = 4
            r2.m29132(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public void m29112() {
            r2 = this;
            r0 = 0
            r2.f29210 = r0
            r2.f29211 = r0
            androidx.fragment.app.ۥ۟۟۟ۥ r1 = r2.f29217
            r1.m29375(r0)
            r2.m29132(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public void m29113(@Yue.InterfaceC4410 android.content.res.Configuration r4, boolean r5) {
            r3 = this;
            if (r5 == 0) goto L12
            Yue.ۥ۠ۢۨ<?> r0 = r3.f29197
            boolean r0 = r0 instanceof Yue.InterfaceC4612
            if (r0 == 0) goto L12
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."
            r0.<init>(r1)
            r3.m29233(r0)
        L12:
            androidx.fragment.app.ۥ۟۟۠ r0 = r3.f29178
            java.util.List r0 = r0.m29418()
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L1c
            r1.performConfigurationChanged(r4)
            if (r5 == 0) goto L1c
            androidx.fragment.app.FragmentManager r1 = r1.mChildFragmentManager
            r2 = 1
            r1.m29113(r4, r2)
            goto L1c
        L36:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public boolean m29114(@Yue.InterfaceC4410 android.view.MenuItem r5) {
            r4 = this;
            int r0 = r4.f29196
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L7
            return r1
        L7:
            androidx.fragment.app.ۥ۟۟۠ r0 = r4.f29178
            java.util.List r0 = r0.m29418()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L26
            java.lang.Object r3 = r0.next()
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            if (r3 == 0) goto L11
            boolean r3 = r3.performContextItemSelected(r5)
            if (r3 == 0) goto L11
            return r2
        L26:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public void m29115() {
            r2 = this;
            r0 = 0
            r2.f29210 = r0
            r2.f29211 = r0
            androidx.fragment.app.ۥ۟۟۟ۥ r1 = r2.f29217
            r1.m29375(r0)
            r0 = 1
            r2.m29132(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public boolean m29116(@Yue.InterfaceC4410 android.view.Menu r8, @Yue.InterfaceC4410 android.view.MenuInflater r9) {
            r7 = this;
            int r0 = r7.f29196
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L7
            return r1
        L7:
            androidx.fragment.app.ۥ۟۟۠ r0 = r7.f29178
            java.util.List r0 = r0.m29418()
            java.util.Iterator r0 = r0.iterator()
            r3 = 0
            r4 = r1
        L13:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L39
            java.lang.Object r5 = r0.next()
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            if (r5 == 0) goto L13
            boolean r6 = r7.m29178(r5)
            if (r6 == 0) goto L13
            boolean r6 = r5.performCreateOptionsMenu(r8, r9)
            if (r6 == 0) goto L13
            if (r3 != 0) goto L34
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L34:
            r3.add(r5)
            r4 = r2
            goto L13
        L39:
            java.util.ArrayList<androidx.fragment.app.Fragment> r8 = r7.f29180
            if (r8 == 0) goto L5b
        L3d:
            java.util.ArrayList<androidx.fragment.app.Fragment> r8 = r7.f29180
            int r8 = r8.size()
            if (r1 >= r8) goto L5b
            java.util.ArrayList<androidx.fragment.app.Fragment> r8 = r7.f29180
            java.lang.Object r8 = r8.get(r1)
            androidx.fragment.app.Fragment r8 = (androidx.fragment.app.Fragment) r8
            if (r3 == 0) goto L55
            boolean r9 = r3.contains(r8)
            if (r9 != 0) goto L58
        L55:
            r8.onDestroyOptionsMenu()
        L58:
            int r1 = r1 + 1
            goto L3d
        L5b:
            r7.f29180 = r3
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public void m29117() {
            r2 = this;
            r0 = 1
            r2.f29212 = r0
            r2.m29140(r0)
            r2.m29137()
            r2.m29106()
            r0 = -1
            r2.m29132(r0)
            Yue.ۥ۠ۢۨ<?> r0 = r2.f29197
            boolean r1 = r0 instanceof Yue.InterfaceC4621
            if (r1 == 0) goto L1d
            Yue.ۥۣۡۢۤ r0 = (Yue.InterfaceC4621) r0
            Yue.ۥ۟ۧ۠ۧ<java.lang.Integer> r1 = r2.f29192
            r0.removeOnTrimMemoryListener(r1)
        L1d:
            Yue.ۥ۠ۢۨ<?> r0 = r2.f29197
            boolean r1 = r0 instanceof Yue.InterfaceC4612
            if (r1 == 0) goto L2a
            Yue.ۥۣۡۡۦ r0 = (Yue.InterfaceC4612) r0
            Yue.ۥ۟ۧ۠ۧ<android.content.res.Configuration> r1 = r2.f29191
            r0.removeOnConfigurationChangedListener(r1)
        L2a:
            Yue.ۥ۠ۢۨ<?> r0 = r2.f29197
            boolean r1 = r0 instanceof Yue.InterfaceC4616
            if (r1 == 0) goto L37
            Yue.ۥۣۡۢ۟ r0 = (Yue.InterfaceC4616) r0
            Yue.ۥ۟ۧ۠ۧ<Yue.ۥۡۡۦۢ> r1 = r2.f29193
            r0.removeOnMultiWindowModeChangedListener(r1)
        L37:
            Yue.ۥ۠ۢۨ<?> r0 = r2.f29197
            boolean r1 = r0 instanceof Yue.InterfaceC4618
            if (r1 == 0) goto L44
            Yue.ۥۣۡۢۡ r0 = (Yue.InterfaceC4618) r0
            Yue.ۥ۟ۧ۠ۧ<Yue.ۥۡۤۡ> r1 = r2.f29194
            r0.removeOnPictureInPictureModeChangedListener(r1)
        L44:
            Yue.ۥ۠ۢۨ<?> r0 = r2.f29197
            boolean r1 = r0 instanceof Yue.InterfaceC4120
            if (r1 == 0) goto L55
            androidx.fragment.app.Fragment r1 = r2.f29199
            if (r1 != 0) goto L55
            Yue.ۥۡ۠ۦ۟ r0 = (Yue.InterfaceC4120) r0
            Yue.ۥۡ۠ۧ r1 = r2.f29195
            r0.removeMenuProvider(r1)
        L55:
            r0 = 0
            r2.f29197 = r0
            r2.f29198 = r0
            r2.f29199 = r0
            androidx.activity.OnBackPressedDispatcher r1 = r2.f29182
            if (r1 == 0) goto L67
            Yue.ۥۣۡۡۢ r1 = r2.f29183
            r1.remove()
            r2.f29182 = r0
        L67:
            Yue.ۥ۟۟ۨۦ<android.content.Intent> r0 = r2.f29205
            if (r0 == 0) goto L78
            r0.mo1201()
            Yue.ۥ۟۟ۨۦ<Yue.ۥ۠ۥۦۣ> r0 = r2.f29206
            r0.mo1201()
            Yue.ۥ۟۟ۨۦ<java.lang.String[]> r0 = r2.f29207
            r0.mo1201()
        L78:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public void m29118() {
            r1 = this;
            r0 = 1
            r1.m29132(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public void m29119(boolean r4) {
            r3 = this;
            if (r4 == 0) goto L12
            Yue.ۥ۠ۢۨ<?> r0 = r3.f29197
            boolean r0 = r0 instanceof Yue.InterfaceC4621
            if (r0 == 0) goto L12
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."
            r0.<init>(r1)
            r3.m29233(r0)
        L12:
            androidx.fragment.app.ۥ۟۟۠ r0 = r3.f29178
            java.util.List r0 = r0.m29418()
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L1c
            r1.performLowMemory()
            if (r4 == 0) goto L1c
            androidx.fragment.app.FragmentManager r1 = r1.mChildFragmentManager
            r2 = 1
            r1.m29119(r2)
            goto L1c
        L36:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public void m29120(boolean r4, boolean r5) {
            r3 = this;
            if (r5 == 0) goto L12
            Yue.ۥ۠ۢۨ<?> r0 = r3.f29197
            boolean r0 = r0 instanceof Yue.InterfaceC4616
            if (r0 == 0) goto L12
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."
            r0.<init>(r1)
            r3.m29233(r0)
        L12:
            androidx.fragment.app.ۥ۟۟۠ r0 = r3.f29178
            java.util.List r0 = r0.m29418()
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L1c
            r1.performMultiWindowModeChanged(r4)
            if (r5 == 0) goto L1c
            androidx.fragment.app.FragmentManager r1 = r1.mChildFragmentManager
            r2 = 1
            r1.m29120(r4, r2)
            goto L1c
        L36:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public void m29121(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r3) {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<Yue.ۥ۠ۢۨۦ> r0 = r2.f29190
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            Yue.ۥ۠ۢۨۦ r1 = (Yue.InterfaceC2772) r1
            r1.mo12132(r2, r3)
            goto L6
        L16:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public void m29122() {
            r3 = this;
            androidx.fragment.app.ۥ۟۟۠ r0 = r3.f29178
            java.util.List r0 = r0.m29415()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto La
            boolean r2 = r1.isHidden()
            r1.onHiddenChanged(r2)
            androidx.fragment.app.FragmentManager r1 = r1.mChildFragmentManager
            r1.m29122()
            goto La
        L25:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public boolean m29123(@Yue.InterfaceC4410 android.view.MenuItem r5) {
            r4 = this;
            int r0 = r4.f29196
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L7
            return r1
        L7:
            androidx.fragment.app.ۥ۟۟۠ r0 = r4.f29178
            java.util.List r0 = r0.m29418()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L26
            java.lang.Object r3 = r0.next()
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            if (r3 == 0) goto L11
            boolean r3 = r3.performOptionsItemSelected(r5)
            if (r3 == 0) goto L11
            return r2
        L26:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public void m29124(@Yue.InterfaceC4410 android.view.Menu r3) {
            r2 = this;
            int r0 = r2.f29196
            r1 = 1
            if (r0 >= r1) goto L6
            return
        L6:
            androidx.fragment.app.ۥ۟۟۠ r0 = r2.f29178
            java.util.List r0 = r0.m29418()
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L10
            r1.performOptionsMenuClosed(r3)
            goto L10
        L22:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public final void m29125(@Yue.InterfaceC4544 androidx.fragment.app.Fragment r2) {
            r1 = this;
            if (r2 == 0) goto L11
            java.lang.String r0 = r2.mWho
            androidx.fragment.app.Fragment r0 = r1.m29144(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L11
            r2.performPrimaryNavigationFragmentChanged()
        L11:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public void m29126() {
            r1 = this;
            r0 = 5
            r1.m29132(r0)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public void m29127(boolean r4, boolean r5) {
            r3 = this;
            if (r5 == 0) goto L12
            Yue.ۥ۠ۢۨ<?> r0 = r3.f29197
            boolean r0 = r0 instanceof Yue.InterfaceC4618
            if (r0 == 0) goto L12
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."
            r0.<init>(r1)
            r3.m29233(r0)
        L12:
            androidx.fragment.app.ۥ۟۟۠ r0 = r3.f29178
            java.util.List r0 = r0.m29418()
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L1c
            r1.performPictureInPictureModeChanged(r4)
            if (r5 == 0) goto L1c
            androidx.fragment.app.FragmentManager r1 = r1.mChildFragmentManager
            r2 = 1
            r1.m29127(r4, r2)
            goto L1c
        L36:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean m29128(@Yue.InterfaceC4410 android.view.Menu r6) {
            r5 = this;
            int r0 = r5.f29196
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L7
            return r1
        L7:
            androidx.fragment.app.ۥ۟۟۠ r0 = r5.f29178
            java.util.List r0 = r0.m29418()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r0.next()
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            if (r3 == 0) goto L11
            boolean r4 = r5.m29178(r3)
            if (r4 == 0) goto L11
            boolean r3 = r3.performPrepareOptionsMenu(r6)
            if (r3 == 0) goto L11
            r1 = r2
            goto L11
        L2d:
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m29129() {
            r1 = this;
            r1.m29235()
            androidx.fragment.app.Fragment r0 = r1.f29200
            r1.m29125(r0)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public void m29130() {
            r2 = this;
            r0 = 0
            r2.f29210 = r0
            r2.f29211 = r0
            androidx.fragment.app.ۥ۟۟۟ۥ r1 = r2.f29217
            r1.m29375(r0)
            r0 = 7
            r2.m29132(r0)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public void m29131() {
            r2 = this;
            r0 = 0
            r2.f29210 = r0
            r2.f29211 = r0
            androidx.fragment.app.ۥ۟۟۟ۥ r1 = r2.f29217
            r1.m29375(r0)
            r0 = 5
            r2.m29132(r0)
            return
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public final void m29132(int r4) {
            r3 = this;
            r0 = 1
            r1 = 0
            r3.f29177 = r0     // Catch: java.lang.Throwable -> L24
            androidx.fragment.app.ۥ۟۟۠ r2 = r3.f29178     // Catch: java.lang.Throwable -> L24
            r2.m29406(r4)     // Catch: java.lang.Throwable -> L24
            r3.m29190(r4, r1)     // Catch: java.lang.Throwable -> L24
            java.util.Set r4 = r3.m29107()     // Catch: java.lang.Throwable -> L24
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L24
        L14:
            boolean r2 = r4.hasNext()     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L26
            java.lang.Object r2 = r4.next()     // Catch: java.lang.Throwable -> L24
            androidx.fragment.app.ۥ۟۟۠ۡ r2 = (androidx.fragment.app.AbstractC7635) r2     // Catch: java.lang.Throwable -> L24
            r2.m29481()     // Catch: java.lang.Throwable -> L24
            goto L14
        L24:
            r4 = move-exception
            goto L2c
        L26:
            r3.f29177 = r1
            r3.m29140(r0)
            return
        L2c:
            r3.f29177 = r1
            throw r4
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public void m29133() {
            r2 = this;
            r0 = 1
            r2.f29211 = r0
            androidx.fragment.app.ۥ۟۟۟ۥ r1 = r2.f29217
            r1.m29375(r0)
            r0 = 4
            r2.m29132(r0)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public void m29134() {
            r1 = this;
            r0 = 2
            r1.m29132(r0)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public final void m29135() {
            r1 = this;
            boolean r0 = r1.f29213
            if (r0 == 0) goto La
            r0 = 0
            r1.f29213 = r0
            r1.m29232()
        La:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public void m29136(@Yue.InterfaceC4410 java.lang.String r5, @Yue.InterfaceC4544 java.io.FileDescriptor r6, @Yue.InterfaceC4410 java.io.PrintWriter r7, @Yue.InterfaceC4544 java.lang.String[] r8) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r1 = "    "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.fragment.app.ۥ۟۟۠ r1 = r4.f29178
            r1.m29407(r5, r6, r7, r8)
            java.util.ArrayList<androidx.fragment.app.Fragment> r6 = r4.f29180
            r8 = 0
            if (r6 == 0) goto L4e
            int r6 = r6.size()
            if (r6 <= 0) goto L4e
            r7.print(r5)
            java.lang.String r1 = "Fragments Created Menus:"
            r7.println(r1)
            r1 = r8
        L2a:
            if (r1 >= r6) goto L4e
            java.util.ArrayList<androidx.fragment.app.Fragment> r2 = r4.f29180
            java.lang.Object r2 = r2.get(r1)
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            r7.print(r5)
            java.lang.String r3 = "  #"
            r7.print(r3)
            r7.print(r1)
            java.lang.String r3 = ": "
            r7.print(r3)
            java.lang.String r2 = r2.toString()
            r7.println(r2)
            int r1 = r1 + 1
            goto L2a
        L4e:
            java.util.ArrayList<androidx.fragment.app.ۥ> r6 = r4.f29179
            if (r6 == 0) goto L88
            int r6 = r6.size()
            if (r6 <= 0) goto L88
            r7.print(r5)
            java.lang.String r1 = "Back Stack:"
            r7.println(r1)
            r1 = r8
        L61:
            if (r1 >= r6) goto L88
            java.util.ArrayList<androidx.fragment.app.ۥ> r2 = r4.f29179
            java.lang.Object r2 = r2.get(r1)
            androidx.fragment.app.ۥ r2 = (androidx.fragment.app.C7595) r2
            r7.print(r5)
            java.lang.String r3 = "  #"
            r7.print(r3)
            r7.print(r1)
            java.lang.String r3 = ": "
            r7.print(r3)
            java.lang.String r3 = r2.toString()
            r7.println(r3)
            r2.m29283(r0, r7)
            int r1 = r1 + 1
            goto L61
        L88:
            r7.print(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Back Stack Index: "
            r6.append(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r4.f29184
            int r0 = r0.get()
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r7.println(r6)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$ۥ۟۟۠۠> r6 = r4.f29176
            monitor-enter(r6)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$ۥ۟۟۠۠> r0 = r4.f29176     // Catch: java.lang.Throwable -> Ld8
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Ld8
            if (r0 <= 0) goto Lda
            r7.print(r5)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r1 = "Pending Actions:"
            r7.println(r1)     // Catch: java.lang.Throwable -> Ld8
        Lb8:
            if (r8 >= r0) goto Lda
            java.util.ArrayList<androidx.fragment.app.FragmentManager$ۥ۟۟۠۠> r1 = r4.f29176     // Catch: java.lang.Throwable -> Ld8
            java.lang.Object r1 = r1.get(r8)     // Catch: java.lang.Throwable -> Ld8
            androidx.fragment.app.FragmentManager$ۥ۟۟۠۠ r1 = (androidx.fragment.app.FragmentManager.InterfaceC7591) r1     // Catch: java.lang.Throwable -> Ld8
            r7.print(r5)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r2 = "  #"
            r7.print(r2)     // Catch: java.lang.Throwable -> Ld8
            r7.print(r8)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r2 = ": "
            r7.print(r2)     // Catch: java.lang.Throwable -> Ld8
            r7.println(r1)     // Catch: java.lang.Throwable -> Ld8
            int r8 = r8 + 1
            goto Lb8
        Ld8:
            r5 = move-exception
            goto L14b
        Lda:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Ld8
            r7.print(r5)
            java.lang.String r6 = "FragmentManager misc state:"
            r7.println(r6)
            r7.print(r5)
            java.lang.String r6 = "  mHost="
            r7.print(r6)
            Yue.ۥ۠ۢۨ<?> r6 = r4.f29197
            r7.println(r6)
            r7.print(r5)
            java.lang.String r6 = "  mContainer="
            r7.print(r6)
            Yue.ۥ۠ۢۧۧ r6 = r4.f29198
            r7.println(r6)
            androidx.fragment.app.Fragment r6 = r4.f29199
            if (r6 == 0) goto L10e
            r7.print(r5)
            java.lang.String r6 = "  mParent="
            r7.print(r6)
            androidx.fragment.app.Fragment r6 = r4.f29199
            r7.println(r6)
        L10e:
            r7.print(r5)
            java.lang.String r6 = "  mCurState="
            r7.print(r6)
            int r6 = r4.f29196
            r7.print(r6)
            java.lang.String r6 = " mStateSaved="
            r7.print(r6)
            boolean r6 = r4.f29210
            r7.print(r6)
            java.lang.String r6 = " mStopped="
            r7.print(r6)
            boolean r6 = r4.f29211
            r7.print(r6)
            java.lang.String r6 = " mDestroyed="
            r7.print(r6)
            boolean r6 = r4.f29212
            r7.println(r6)
            boolean r6 = r4.f29209
            if (r6 == 0) goto L14a
            r7.print(r5)
            java.lang.String r5 = "  mNeedMenuInvalidate="
            r7.print(r5)
            boolean r5 = r4.f29209
            r7.println(r5)
        L14a:
            return
        L14b:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Ld8
            throw r5
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public final void m29137() {
            r2 = this;
            java.util.Set r0 = r2.m29107()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.ۥ۟۟۠ۡ r1 = (androidx.fragment.app.AbstractC7635) r1
            r1.m29481()
            goto L8
        L18:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public void m29138(@Yue.InterfaceC4410 androidx.fragment.app.FragmentManager.InterfaceC7591 r3, boolean r4) {
            r2 = this;
            if (r4 != 0) goto L1d
            Yue.ۥ۠ۢۨ<?> r0 = r2.f29197
            if (r0 != 0) goto L1a
            boolean r3 = r2.f29212
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
            r2.m29102()
        L1d:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$ۥ۟۟۠۠> r0 = r2.f29176
            monitor-enter(r0)
            Yue.ۥ۠ۢۨ<?> r1 = r2.f29197     // Catch: java.lang.Throwable -> L28
            if (r1 != 0) goto L32
            if (r4 == 0) goto L2a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            return
        L28:
            r3 = move-exception
            goto L3c
        L2a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = "Activity has been destroyed"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L28
            throw r3     // Catch: java.lang.Throwable -> L28
        L32:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$ۥ۟۟۠۠> r4 = r2.f29176     // Catch: java.lang.Throwable -> L28
            r4.add(r3)     // Catch: java.lang.Throwable -> L28
            r2.m29223()     // Catch: java.lang.Throwable -> L28
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            return
        L3c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public final void m29139(boolean r3) {
            r2 = this;
            boolean r0 = r2.f29177
            if (r0 != 0) goto L4c
            Yue.ۥ۠ۢۨ<?> r0 = r2.f29197
            if (r0 != 0) goto L1c
            boolean r3 = r2.f29212
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
            Yue.ۥ۠ۢۨ<?> r1 = r2.f29197
            android.os.Handler r1 = r1.m12115()
            android.os.Looper r1 = r1.getLooper()
            if (r0 != r1) goto L44
            if (r3 != 0) goto L31
            r2.m29102()
        L31:
            java.util.ArrayList<androidx.fragment.app.ۥ> r3 = r2.f29214
            if (r3 != 0) goto L43
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f29214 = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f29215 = r3
        L43:
            return
        L44:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Must be called from main thread of fragment host"
            r3.<init>(r0)
            throw r3
        L4c:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "FragmentManager is already executing transactions"
            r3.<init>(r0)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public boolean m29140(boolean r3) {
            r2 = this;
            r2.m29139(r3)
            r3 = 0
        L4:
            java.util.ArrayList<androidx.fragment.app.ۥ> r0 = r2.f29214
            java.util.ArrayList<java.lang.Boolean> r1 = r2.f29215
            boolean r0 = r2.m29151(r0, r1)
            if (r0 == 0) goto L21
            r3 = 1
            r2.f29177 = r3
            java.util.ArrayList<androidx.fragment.app.ۥ> r0 = r2.f29214     // Catch: java.lang.Throwable -> L1c
            java.util.ArrayList<java.lang.Boolean> r1 = r2.f29215     // Catch: java.lang.Throwable -> L1c
            r2.m29209(r0, r1)     // Catch: java.lang.Throwable -> L1c
            r2.m29103()
            goto L4
        L1c:
            r3 = move-exception
            r2.m29103()
            throw r3
        L21:
            r2.m29235()
            r2.m29135()
            androidx.fragment.app.ۥ۟۟۠ r0 = r2.f29178
            r0.m29404()
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public void m29141(@Yue.InterfaceC4410 androidx.fragment.app.FragmentManager.InterfaceC7591 r2, boolean r3) {
            r1 = this;
            if (r3 == 0) goto Lb
            Yue.ۥ۠ۢۨ<?> r0 = r1.f29197
            if (r0 == 0) goto La
            boolean r0 = r1.f29212
            if (r0 == 0) goto Lb
        La:
            return
        Lb:
            r1.m29139(r3)
            java.util.ArrayList<androidx.fragment.app.ۥ> r3 = r1.f29214
            java.util.ArrayList<java.lang.Boolean> r0 = r1.f29215
            boolean r2 = r2.mo29244(r3, r0)
            if (r2 == 0) goto L2b
            r2 = 1
            r1.f29177 = r2
            java.util.ArrayList<androidx.fragment.app.ۥ> r2 = r1.f29214     // Catch: java.lang.Throwable -> L26
            java.util.ArrayList<java.lang.Boolean> r3 = r1.f29215     // Catch: java.lang.Throwable -> L26
            r1.m29209(r2, r3)     // Catch: java.lang.Throwable -> L26
            r1.m29103()
            goto L2b
        L26:
            r2 = move-exception
            r1.m29103()
            throw r2
        L2b:
            r1.m29235()
            r1.m29135()
            androidx.fragment.app.ۥ۟۟۠ r2 = r1.f29178
            r2.m29404()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public final void m29142(@Yue.InterfaceC4410 java.util.ArrayList<androidx.fragment.app.C7595> r9, @Yue.InterfaceC4410 java.util.ArrayList<java.lang.Boolean> r10, int r11, int r12) {
            r8 = this;
            java.lang.Object r0 = r9.get(r11)
            androidx.fragment.app.ۥ r0 = (androidx.fragment.app.C7595) r0
            boolean r0 = r0.f29411
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r8.f29216
            if (r1 != 0) goto L14
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r8.f29216 = r1
            goto L17
        L14:
            r1.clear()
        L17:
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r8.f29216
            androidx.fragment.app.ۥ۟۟۠ r2 = r8.f29178
            java.util.List r2 = r2.m29418()
            r1.addAll(r2)
            androidx.fragment.app.Fragment r1 = r8.m29167()
            r2 = 0
            r3 = r11
            r4 = r2
        L29:
            r5 = 1
            if (r3 >= r12) goto L58
            java.lang.Object r6 = r9.get(r3)
            androidx.fragment.app.ۥ r6 = (androidx.fragment.app.C7595) r6
            java.lang.Object r7 = r10.get(r3)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L45
            java.util.ArrayList<androidx.fragment.app.Fragment> r7 = r8.f29216
            androidx.fragment.app.Fragment r1 = r6.m29287(r7, r1)
            goto L4b
        L45:
            java.util.ArrayList<androidx.fragment.app.Fragment> r7 = r8.f29216
            androidx.fragment.app.Fragment r1 = r6.m29289(r7, r1)
        L4b:
            if (r4 != 0) goto L54
            boolean r4 = r6.f29402
            if (r4 == 0) goto L52
            goto L54
        L52:
            r4 = r2
            goto L55
        L54:
            r4 = r5
        L55:
            int r3 = r3 + 1
            goto L29
        L58:
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r8.f29216
            r1.clear()
            if (r0 != 0) goto L93
            int r0 = r8.f29196
            if (r0 < r5) goto L93
            r0 = r11
        L64:
            if (r0 >= r12) goto L93
            java.lang.Object r1 = r9.get(r0)
            androidx.fragment.app.ۥ r1 = (androidx.fragment.app.C7595) r1
            java.util.ArrayList<androidx.fragment.app.ۥ۟۟۠۟$ۥ> r1 = r1.f29396
            java.util.Iterator r1 = r1.iterator()
        L72:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L90
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.ۥ۟۟۠۟$ۥ r2 = (androidx.fragment.app.AbstractC7632.C7633) r2
            androidx.fragment.app.Fragment r2 = r2.f29414
            if (r2 == 0) goto L72
            androidx.fragment.app.FragmentManager r3 = r2.mFragmentManager
            if (r3 == 0) goto L72
            androidx.fragment.app.ۥ۟۟۟ۧ r2 = r8.m29109(r2)
            androidx.fragment.app.ۥ۟۟۠ r3 = r8.f29178
            r3.m29421(r2)
            goto L72
        L90:
            int r0 = r0 + 1
            goto L64
        L93:
            m29085(r9, r10, r11, r12)
            int r0 = r12 + (-1)
            java.lang.Object r0 = r10.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r4 == 0) goto L117
            java.util.ArrayList<androidx.fragment.app.FragmentManager$ۥ۟۟۠۟> r1 = r8.f29188
            if (r1 == 0) goto L117
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L117
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            java.util.Iterator r2 = r9.iterator()
        Lb7:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lcb
            java.lang.Object r3 = r2.next()
            androidx.fragment.app.ۥ r3 = (androidx.fragment.app.C7595) r3
            java.util.Set r3 = r8.m29150(r3)
            r1.addAll(r3)
            goto Lb7
        Lcb:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$ۥ۟۟۠۟> r2 = r8.f29188
            java.util.Iterator r2 = r2.iterator()
        Ld1:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lf1
            java.lang.Object r3 = r2.next()
            androidx.fragment.app.FragmentManager$ۥ۟۟۠۟ r3 = (androidx.fragment.app.FragmentManager.InterfaceC7590) r3
            java.util.Iterator r6 = r1.iterator()
        Le1:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Ld1
            java.lang.Object r7 = r6.next()
            androidx.fragment.app.Fragment r7 = (androidx.fragment.app.Fragment) r7
            r3.m29266(r7, r0)
            goto Le1
        Lf1:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$ۥ۟۟۠۟> r2 = r8.f29188
            java.util.Iterator r2 = r2.iterator()
        Lf7:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L117
            java.lang.Object r3 = r2.next()
            androidx.fragment.app.FragmentManager$ۥ۟۟۠۟ r3 = (androidx.fragment.app.FragmentManager.InterfaceC7590) r3
            java.util.Iterator r6 = r1.iterator()
        L107:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lf7
            java.lang.Object r7 = r6.next()
            androidx.fragment.app.Fragment r7 = (androidx.fragment.app.Fragment) r7
            r3.m29265(r7, r0)
            goto L107
        L117:
            r1 = r11
        L118:
            if (r1 >= r12) goto L162
            java.lang.Object r2 = r9.get(r1)
            androidx.fragment.app.ۥ r2 = (androidx.fragment.app.C7595) r2
            if (r0 == 0) goto L141
            java.util.ArrayList<androidx.fragment.app.ۥ۟۟۠۟$ۥ> r3 = r2.f29396
            int r3 = r3.size()
            int r3 = r3 - r5
        L129:
            if (r3 < 0) goto L15f
            java.util.ArrayList<androidx.fragment.app.ۥ۟۟۠۟$ۥ> r6 = r2.f29396
            java.lang.Object r6 = r6.get(r3)
            androidx.fragment.app.ۥ۟۟۠۟$ۥ r6 = (androidx.fragment.app.AbstractC7632.C7633) r6
            androidx.fragment.app.Fragment r6 = r6.f29414
            if (r6 == 0) goto L13e
            androidx.fragment.app.ۥ۟۟۟ۧ r6 = r8.m29109(r6)
            r6.m29392()
        L13e:
            int r3 = r3 + (-1)
            goto L129
        L141:
            java.util.ArrayList<androidx.fragment.app.ۥ۟۟۠۟$ۥ> r2 = r2.f29396
            java.util.Iterator r2 = r2.iterator()
        L147:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L15f
            java.lang.Object r3 = r2.next()
            androidx.fragment.app.ۥ۟۟۠۟$ۥ r3 = (androidx.fragment.app.AbstractC7632.C7633) r3
            androidx.fragment.app.Fragment r3 = r3.f29414
            if (r3 == 0) goto L147
            androidx.fragment.app.ۥ۟۟۟ۧ r3 = r8.m29109(r3)
            r3.m29392()
            goto L147
        L15f:
            int r1 = r1 + 1
            goto L118
        L162:
            int r1 = r8.f29196
            r8.m29190(r1, r5)
            java.util.Set r1 = r8.m29108(r9, r11, r12)
            java.util.Iterator r1 = r1.iterator()
        L16f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L185
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.ۥ۟۟۠ۡ r2 = (androidx.fragment.app.AbstractC7635) r2
            r2.m29487(r0)
            r2.m29485()
            r2.m29478()
            goto L16f
        L185:
            if (r11 >= r12) goto L1a6
            java.lang.Object r0 = r9.get(r11)
            androidx.fragment.app.ۥ r0 = (androidx.fragment.app.C7595) r0
            java.lang.Object r1 = r10.get(r11)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L1a0
            int r1 = r0.f29252
            if (r1 < 0) goto L1a0
            r1 = -1
            r0.f29252 = r1
        L1a0:
            r0.m29288()
            int r11 = r11 + 1
            goto L185
        L1a6:
            if (r4 == 0) goto L1ab
            r8.m29211()
        L1ab:
            return
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public boolean m29143() {
            r1 = this;
            r0 = 1
            boolean r0 = r1.m29140(r0)
            r1.m29149()
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public androidx.fragment.app.Fragment m29144(@Yue.InterfaceC4410 java.lang.String r2) {
            r1 = this;
            androidx.fragment.app.ۥ۟۟۠ r0 = r1.f29178
            androidx.fragment.app.Fragment r2 = r0.m29408(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public final int m29145(@Yue.InterfaceC4544 java.lang.String r5, int r6, boolean r7) {
            r4 = this;
            java.util.ArrayList<androidx.fragment.app.ۥ> r0 = r4.f29179
            r1 = -1
            if (r0 == 0) goto L7b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto L7b
        Ld:
            if (r5 != 0) goto L1e
            if (r6 >= 0) goto L1e
            if (r7 == 0) goto L15
            r5 = 0
            return r5
        L15:
            java.util.ArrayList<androidx.fragment.app.ۥ> r5 = r4.f29179
            int r5 = r5.size()
            int r5 = r5 + (-1)
            return r5
        L1e:
            java.util.ArrayList<androidx.fragment.app.ۥ> r0 = r4.f29179
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L26:
            if (r0 < 0) goto L47
            java.util.ArrayList<androidx.fragment.app.ۥ> r2 = r4.f29179
            java.lang.Object r2 = r2.get(r0)
            androidx.fragment.app.ۥ r2 = (androidx.fragment.app.C7595) r2
            if (r5 == 0) goto L3d
            java.lang.String r3 = r2.getName()
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L3d
            goto L47
        L3d:
            if (r6 < 0) goto L44
            int r2 = r2.f29252
            if (r6 != r2) goto L44
            goto L47
        L44:
            int r0 = r0 + (-1)
            goto L26
        L47:
            if (r0 >= 0) goto L4a
            return r0
        L4a:
            if (r7 == 0) goto L6d
        L4c:
            if (r0 <= 0) goto L7a
            java.util.ArrayList<androidx.fragment.app.ۥ> r7 = r4.f29179
            int r1 = r0 + (-1)
            java.lang.Object r7 = r7.get(r1)
            androidx.fragment.app.ۥ r7 = (androidx.fragment.app.C7595) r7
            if (r5 == 0) goto L64
            java.lang.String r1 = r7.getName()
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L6a
        L64:
            if (r6 < 0) goto L7a
            int r7 = r7.f29252
            if (r6 != r7) goto L7a
        L6a:
            int r0 = r0 + (-1)
            goto L4c
        L6d:
            java.util.ArrayList<androidx.fragment.app.ۥ> r5 = r4.f29179
            int r5 = r5.size()
            int r5 = r5 + (-1)
            if (r0 != r5) goto L78
            return r1
        L78:
            int r0 = r0 + 1
        L7a:
            return r0
        L7b:
            return r1
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public androidx.fragment.app.Fragment m29146(@Yue.InterfaceC3214 int r2) {
            r1 = this;
            androidx.fragment.app.ۥ۟۟۠ r0 = r1.f29178
            androidx.fragment.app.Fragment r2 = r0.m29409(r2)
            return r2
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public androidx.fragment.app.Fragment m29147(@Yue.InterfaceC4544 java.lang.String r2) {
            r1 = this;
            androidx.fragment.app.ۥ۟۟۠ r0 = r1.f29178
            androidx.fragment.app.Fragment r2 = r0.m29410(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public androidx.fragment.app.Fragment m29148(@Yue.InterfaceC4410 java.lang.String r2) {
            r1 = this;
            androidx.fragment.app.ۥ۟۟۠ r0 = r1.f29178
            androidx.fragment.app.Fragment r2 = r0.m29411(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public final void m29149() {
            r2 = this;
            java.util.Set r0 = r2.m29107()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.ۥ۟۟۠ۡ r1 = (androidx.fragment.app.AbstractC7635) r1
            r1.m29482()
            goto L8
        L18:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public final java.util.Set<androidx.fragment.app.Fragment> m29150(@Yue.InterfaceC4410 androidx.fragment.app.C7595 r5) {
            r4 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1 = 0
        L6:
            java.util.ArrayList<androidx.fragment.app.ۥ۟۟۠۟$ۥ> r2 = r5.f29396
            int r2 = r2.size()
            if (r1 >= r2) goto L24
            java.util.ArrayList<androidx.fragment.app.ۥ۟۟۠۟$ۥ> r2 = r5.f29396
            java.lang.Object r2 = r2.get(r1)
            androidx.fragment.app.ۥ۟۟۠۟$ۥ r2 = (androidx.fragment.app.AbstractC7632.C7633) r2
            androidx.fragment.app.Fragment r2 = r2.f29414
            if (r2 == 0) goto L21
            boolean r3 = r5.f29402
            if (r3 == 0) goto L21
            r0.add(r2)
        L21:
            int r1 = r1 + 1
            goto L6
        L24:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public final boolean m29151(@Yue.InterfaceC4410 java.util.ArrayList<androidx.fragment.app.C7595> r6, @Yue.InterfaceC4410 java.util.ArrayList<java.lang.Boolean> r7) {
            r5 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$ۥ۟۟۠۠> r0 = r5.f29176
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$ۥ۟۟۠۠> r1 = r5.f29176     // Catch: java.lang.Throwable -> Le
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> Le
            r2 = 0
            if (r1 == 0) goto L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r2
        Le:
            r6 = move-exception
            goto L4e
        L10:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$ۥ۟۟۠۠> r1 = r5.f29176     // Catch: java.lang.Throwable -> L29
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L29
            r3 = r2
        L17:
            if (r2 >= r1) goto L2b
            java.util.ArrayList<androidx.fragment.app.FragmentManager$ۥ۟۟۠۠> r4 = r5.f29176     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> L29
            androidx.fragment.app.FragmentManager$ۥ۟۟۠۠ r4 = (androidx.fragment.app.FragmentManager.InterfaceC7591) r4     // Catch: java.lang.Throwable -> L29
            boolean r4 = r4.mo29244(r6, r7)     // Catch: java.lang.Throwable -> L29
            r3 = r3 | r4
            int r2 = r2 + 1
            goto L17
        L29:
            r6 = move-exception
            goto L3d
        L2b:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$ۥ۟۟۠۠> r6 = r5.f29176     // Catch: java.lang.Throwable -> Le
            r6.clear()     // Catch: java.lang.Throwable -> Le
            Yue.ۥ۠ۢۨ<?> r6 = r5.f29197     // Catch: java.lang.Throwable -> Le
            android.os.Handler r6 = r6.m12115()     // Catch: java.lang.Throwable -> Le
            java.lang.Runnable r7 = r5.f29219     // Catch: java.lang.Throwable -> Le
            r6.removeCallbacks(r7)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r3
        L3d:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$ۥ۟۟۠۠> r7 = r5.f29176     // Catch: java.lang.Throwable -> Le
            r7.clear()     // Catch: java.lang.Throwable -> Le
            Yue.ۥ۠ۢۨ<?> r7 = r5.f29197     // Catch: java.lang.Throwable -> Le
            android.os.Handler r7 = r7.m12115()     // Catch: java.lang.Throwable -> Le
            java.lang.Runnable r1 = r5.f29219     // Catch: java.lang.Throwable -> Le
            r7.removeCallbacks(r1)     // Catch: java.lang.Throwable -> Le
            throw r6     // Catch: java.lang.Throwable -> Le
        L4e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r6
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public int m29152() {
            r1 = this;
            androidx.fragment.app.ۥ۟۟۠ r0 = r1.f29178
            int r0 = r0.m29413()
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public java.util.List<androidx.fragment.app.Fragment> m29153() {
            r1 = this;
            androidx.fragment.app.ۥ۟۟۠ r0 = r1.f29178
            java.util.List r0 = r0.m29415()
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public androidx.fragment.app.FragmentManager.InterfaceC7583 m29154(int r2) {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.ۥ> r0 = r1.f29179
            java.lang.Object r2 = r0.get(r2)
            androidx.fragment.app.FragmentManager$ۥ۟۟۟ۤ r2 = (androidx.fragment.app.FragmentManager.InterfaceC7583) r2
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public int m29155() {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.ۥ> r0 = r1.f29179
            if (r0 == 0) goto L9
            int r0 = r0.size()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public final androidx.fragment.app.C7623 m29156(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r2) {
            r1 = this;
            androidx.fragment.app.ۥ۟۟۟ۥ r0 = r1.f29217
            androidx.fragment.app.ۥ۟۟۟ۥ r2 = r0.m29368(r2)
            return r2
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public Yue.AbstractC2762 m29157() {
            r1 = this;
            Yue.ۥ۠ۢۧۧ r0 = r1.f29198
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public androidx.fragment.app.Fragment m29158(@Yue.InterfaceC4410 android.os.Bundle r5, @Yue.InterfaceC4410 java.lang.String r6) {
            r4 = this;
            java.lang.String r5 = r5.getString(r6)
            if (r5 != 0) goto L8
            r5 = 0
            return r5
        L8:
            androidx.fragment.app.Fragment r0 = r4.m29144(r5)
            if (r0 != 0) goto L2f
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Fragment no longer exists for key "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = ": unique id "
            r2.append(r6)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            r4.m29233(r1)
        L2f:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public final android.view.ViewGroup m29159(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r3) {
            r2 = this;
            android.view.ViewGroup r0 = r3.mContainer
            if (r0 == 0) goto L5
            return r0
        L5:
            int r0 = r3.mContainerId
            r1 = 0
            if (r0 > 0) goto Lb
            return r1
        Lb:
            Yue.ۥ۠ۢۧۧ r0 = r2.f29198
            boolean r0 = r0.mo12070()
            if (r0 == 0) goto L22
            Yue.ۥ۠ۢۧۧ r0 = r2.f29198
            int r3 = r3.mContainerId
            android.view.View r3 = r0.mo12069(r3)
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L22
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            return r3
        L22:
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public androidx.fragment.app.C7616 m29160() {
            r1 = this;
            androidx.fragment.app.ۥ۟۟۟ۡ r0 = r1.f29201
            if (r0 == 0) goto L5
            return r0
        L5:
            androidx.fragment.app.Fragment r0 = r1.f29199
            if (r0 == 0) goto L10
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            androidx.fragment.app.ۥ۟۟۟ۡ r0 = r0.m29160()
            return r0
        L10:
            androidx.fragment.app.ۥ۟۟۟ۡ r0 = r1.f29202
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public androidx.fragment.app.C7631 m29161() {
            r1 = this;
            androidx.fragment.app.ۥ۟۟۠ r0 = r1.f29178
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public java.util.List<androidx.fragment.app.Fragment> m29162() {
            r1 = this;
            androidx.fragment.app.ۥ۟۟۠ r0 = r1.f29178
            java.util.List r0 = r0.m29418()
            return r0
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public Yue.AbstractC2764<?> m29163() {
            r1 = this;
            Yue.ۥ۠ۢۨ<?> r0 = r1.f29197
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public android.view.LayoutInflater.Factory2 m29164() {
            r1 = this;
            androidx.fragment.app.ۥ۟۟۟ۢ r0 = r1.f29181
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public androidx.fragment.app.C7619 m29165() {
            r1 = this;
            androidx.fragment.app.ۥۣ۟۟۟ r0 = r1.f29189
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public androidx.fragment.app.Fragment m29166() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.f29199
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public androidx.fragment.app.Fragment m29167() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.f29200
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public Yue.InterfaceC5884 m29168() {
            r1 = this;
            Yue.ۥۢ۟ۦۨ r0 = r1.f29203
            if (r0 == 0) goto L5
            return r0
        L5:
            androidx.fragment.app.Fragment r0 = r1.f29199
            if (r0 == 0) goto L10
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            Yue.ۥۢ۟ۦۨ r0 = r0.m29168()
            return r0
        L10:
            Yue.ۥۢ۟ۦۨ r0 = r1.f29204
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public Yue.C2779.C2782 m29169() {
            r1 = this;
            Yue.ۥۣ۠۟ۡ$ۥ۟۟ r0 = r1.f29218
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public androidx.lifecycle.ViewModelStore m29170(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r2) {
            r1 = this;
            androidx.fragment.app.ۥ۟۟۟ۥ r0 = r1.f29217
            androidx.lifecycle.ViewModelStore r2 = r0.m29371(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public void m29171() {
            r1 = this;
            r0 = 1
            r1.m29140(r0)
            Yue.ۥۣۡۡۢ r0 = r1.f29183
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L10
            r1.m29199()
            goto L15
        L10:
            androidx.activity.OnBackPressedDispatcher r0 = r1.f29182
            r0.m27760()
        L15:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public void m29172(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r3) {
            r2 = this;
            r0 = 2
            boolean r0 = m29090(r0)
            if (r0 == 0) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "hide: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1d:
            boolean r0 = r3.mHidden
            if (r0 != 0) goto L2c
            r0 = 1
            r3.mHidden = r0
            boolean r1 = r3.mHiddenChanged
            r0 = r0 ^ r1
            r3.mHiddenChanged = r0
            r2.m29230(r3)
        L2c:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public void m29173(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r2) {
            r1 = this;
            boolean r0 = r2.mAdded
            if (r0 == 0) goto Ld
            boolean r2 = r1.m29175(r2)
            if (r2 == 0) goto Ld
            r2 = 1
            r1.f29209 = r2
        Ld:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public boolean m29174() {
            r1 = this;
            boolean r0 = r1.f29212
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public final boolean m29175(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r2) {
            r1 = this;
            boolean r0 = r2.mHasMenu
            if (r0 == 0) goto L8
            boolean r0 = r2.mMenuVisible
            if (r0 != 0) goto L10
        L8:
            androidx.fragment.app.FragmentManager r2 = r2.mChildFragmentManager
            boolean r2 = r2.m29101()
            if (r2 == 0) goto L12
        L10:
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public final boolean m29176() {
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.f29199
            r1 = 1
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r0.isAdded()
            if (r0 == 0) goto L19
            androidx.fragment.app.Fragment r0 = r2.f29199
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            boolean r0 = r0.m29176()
            if (r0 == 0) goto L19
            goto L1a
        L19:
            r1 = 0
        L1a:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
    public boolean m29177(@Yue.InterfaceC4544 androidx.fragment.app.Fragment r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            boolean r1 = r1.isHidden()
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۡ, reason: contains not printable characters */
    public boolean m29178(@Yue.InterfaceC4544 androidx.fragment.app.Fragment r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = 1
            return r1
        L4:
            boolean r1 = r1.isMenuVisible()
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۢ, reason: contains not printable characters */
    public boolean m29179(@Yue.InterfaceC4544 androidx.fragment.app.Fragment r4) {
            r3 = this;
            r0 = 1
            if (r4 != 0) goto L4
            return r0
        L4:
            androidx.fragment.app.FragmentManager r1 = r4.mFragmentManager
            androidx.fragment.app.Fragment r2 = r1.m29167()
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L19
            androidx.fragment.app.Fragment r4 = r1.f29199
            boolean r4 = r3.m29179(r4)
            if (r4 == 0) goto L19
            goto L1a
        L19:
            r0 = 0
        L1a:
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public boolean m29180(int r2) {
            r1 = this;
            int r0 = r1.f29196
            if (r0 < r2) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۤ, reason: contains not printable characters */
    public boolean m29181() {
            r1 = this;
            boolean r0 = r1.f29210
            if (r0 != 0) goto Lb
            boolean r0 = r1.f29211
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۥ, reason: contains not printable characters */
    public final /* synthetic */ android.os.Bundle m29182() {
            r1 = this;
            android.os.Bundle r0 = r1.m29219()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۦ, reason: contains not printable characters */
    public final /* synthetic */ void m29183(android.content.res.Configuration r2) {
            r1 = this;
            boolean r0 = r1.m29176()
            if (r0 == 0) goto La
            r0 = 0
            r1.m29113(r2, r0)
        La:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۧ, reason: contains not printable characters */
    public final /* synthetic */ void m29184(java.lang.Integer r2) {
            r1 = this;
            boolean r0 = r1.m29176()
            if (r0 == 0) goto L12
            int r2 = r2.intValue()
            r0 = 80
            if (r2 != r0) goto L12
            r2 = 0
            r1.m29119(r2)
        L12:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۨ, reason: contains not printable characters */
    public final /* synthetic */ void m29185(Yue.C4298 r2) {
            r1 = this;
            boolean r0 = r1.m29176()
            if (r0 == 0) goto Le
            boolean r2 = r2.m16880()
            r0 = 0
            r1.m29120(r2, r0)
        Le:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final /* synthetic */ void m29186(Yue.C4767 r2) {
            r1 = this;
            boolean r0 = r1.m29176()
            if (r0 == 0) goto Le
            boolean r2 = r2.m18987()
            r0 = 0
            r1.m29127(r2, r0)
        Le:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠۟, reason: contains not printable characters */
    public void m29187(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r2, @Yue.InterfaceC4410 java.lang.String[] r3, int r4) {
            r1 = this;
            Yue.ۥ۟۟ۨۦ<java.lang.String[]> r0 = r1.f29207
            if (r0 == 0) goto L16
            androidx.fragment.app.FragmentManager$ۥ۟۟۟ۨ r0 = new androidx.fragment.app.FragmentManager$ۥ۟۟۟ۨ
            java.lang.String r2 = r2.mWho
            r0.<init>(r2, r4)
            java.util.ArrayDeque<androidx.fragment.app.FragmentManager$ۥ۟۟۟ۨ> r2 = r1.f29208
            r2.addLast(r0)
            Yue.ۥ۟۟ۨۦ<java.lang.String[]> r2 = r1.f29207
            r2.m1199(r3)
            goto L1b
        L16:
            Yue.ۥ۠ۢۨ<?> r0 = r1.f29197
            r0.m12121(r2, r3, r4)
        L1b:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠۟۟, reason: contains not printable characters */
    public void m29188(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r2, @Yue.InterfaceC4410 android.content.Intent r3, int r4, @Yue.InterfaceC4544 android.os.Bundle r5) {
            r1 = this;
            Yue.ۥ۟۟ۨۦ<android.content.Intent> r0 = r1.f29205
            if (r0 == 0) goto L1d
            androidx.fragment.app.FragmentManager$ۥ۟۟۟ۨ r0 = new androidx.fragment.app.FragmentManager$ۥ۟۟۟ۨ
            java.lang.String r2 = r2.mWho
            r0.<init>(r2, r4)
            java.util.ArrayDeque<androidx.fragment.app.FragmentManager$ۥ۟۟۟ۨ> r2 = r1.f29208
            r2.addLast(r0)
            if (r5 == 0) goto L17
            java.lang.String r2 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"
            r3.putExtra(r2, r5)
        L17:
            Yue.ۥ۟۟ۨۦ<android.content.Intent> r2 = r1.f29205
            r2.m1199(r3)
            goto L22
        L1d:
            Yue.ۥ۠ۢۨ<?> r0 = r1.f29197
            r0.m12125(r2, r3, r4, r5)
        L22:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠۟۠, reason: contains not printable characters */
    public void m29189(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r12, @Yue.InterfaceC4410 android.content.IntentSender r13, int r14, @Yue.InterfaceC4544 android.content.Intent r15, int r16, int r17, int r18, @Yue.InterfaceC4544 android.os.Bundle r19) throws android.content.IntentSender.SendIntentException {
            r11 = this;
            r0 = r11
            r2 = r12
            r9 = r19
            Yue.ۥ۟۟ۨۦ<Yue.ۥ۠ۥۦۣ> r1 = r0.f29206
            if (r1 == 0) goto L95
            java.lang.String r1 = "FragmentManager"
            r3 = 2
            if (r9 == 0) goto L4c
            if (r15 != 0) goto L1b
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r5 = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE"
            r6 = 1
            r4.putExtra(r5, r6)
            goto L1c
        L1b:
            r4 = r15
        L1c:
            boolean r5 = m29090(r3)
            if (r5 == 0) goto L46
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "ActivityOptions "
            r5.append(r6)
            r5.append(r9)
            java.lang.String r6 = " were added to fillInIntent "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r6 = " for fragment "
            r5.append(r6)
            r5.append(r12)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r1, r5)
        L46:
            java.lang.String r5 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"
            r4.putExtra(r5, r9)
            goto L4d
        L4c:
            r4 = r15
        L4d:
            Yue.ۥ۠ۥۦۣ$ۥ r5 = new Yue.ۥ۠ۥۦۣ$ۥ
            r6 = r13
            r5.<init>(r13)
            Yue.ۥ۠ۥۦۣ$ۥ r4 = r5.m13865(r4)
            r7 = r16
            r8 = r17
            Yue.ۥ۠ۥۦۣ$ۥ r4 = r4.m13866(r8, r7)
            Yue.ۥ۠ۥۦۣ r4 = r4.m13864()
            androidx.fragment.app.FragmentManager$ۥ۟۟۟ۨ r5 = new androidx.fragment.app.FragmentManager$ۥ۟۟۟ۨ
            java.lang.String r6 = r2.mWho
            r10 = r14
            r5.<init>(r6, r14)
            java.util.ArrayDeque<androidx.fragment.app.FragmentManager$ۥ۟۟۟ۨ> r6 = r0.f29208
            r6.addLast(r5)
            boolean r3 = m29090(r3)
            if (r3 == 0) goto L8f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Fragment "
            r3.append(r5)
            r3.append(r12)
            java.lang.String r2 = "is launching an IntentSender for result "
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            android.util.Log.v(r1, r2)
        L8f:
            Yue.ۥ۟۟ۨۦ<Yue.ۥ۠ۥۦۣ> r1 = r0.f29206
            r1.m1199(r4)
            goto Lac
        L95:
            r6 = r13
            r10 = r14
            r7 = r16
            r8 = r17
            Yue.ۥ۠ۢۨ<?> r1 = r0.f29197
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r1.m12126(r2, r3, r4, r5, r6, r7, r8, r9)
        Lac:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۡ, reason: contains not printable characters */
    public void m29190(int r2, boolean r3) {
            r1 = this;
            Yue.ۥ۠ۢۨ<?> r0 = r1.f29197
            if (r0 != 0) goto L10
            r0 = -1
            if (r2 != r0) goto L8
            goto L10
        L8:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "No activity"
            r2.<init>(r3)
            throw r2
        L10:
            if (r3 != 0) goto L17
            int r3 = r1.f29196
            if (r2 != r3) goto L17
            return
        L17:
            r1.f29196 = r2
            androidx.fragment.app.ۥ۟۟۠ r2 = r1.f29178
            r2.m29423()
            r1.m29232()
            boolean r2 = r1.f29209
            if (r2 == 0) goto L34
            Yue.ۥ۠ۢۨ<?> r2 = r1.f29197
            if (r2 == 0) goto L34
            int r3 = r1.f29196
            r0 = 7
            if (r3 != r0) goto L34
            r2.mo12127()
            r2 = 0
            r1.f29209 = r2
        L34:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۢ, reason: contains not printable characters */
    public void m29191() {
            r2 = this;
            Yue.ۥ۠ۢۨ<?> r0 = r2.f29197
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r2.f29210 = r0
            r2.f29211 = r0
            androidx.fragment.app.ۥ۟۟۟ۥ r1 = r2.f29217
            r1.m29375(r0)
            androidx.fragment.app.ۥ۟۟۠ r0 = r2.f29178
            java.util.List r0 = r0.m29418()
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L19
            r1.noteStateNotSaved()
            goto L19
        L2b:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public void m29192(@Yue.InterfaceC4410 androidx.fragment.app.FragmentContainerView r6) {
            r5 = this;
            androidx.fragment.app.ۥ۟۟۠ r0 = r5.f29178
            java.util.List r0 = r0.m29414()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.ۥ۟۟۟ۧ r1 = (androidx.fragment.app.C7627) r1
            androidx.fragment.app.Fragment r2 = r1.m29390()
            int r3 = r2.mContainerId
            int r4 = r6.getId()
            if (r3 != r4) goto La
            android.view.View r3 = r2.mView
            if (r3 == 0) goto La
            android.view.ViewParent r3 = r3.getParent()
            if (r3 != 0) goto La
            r2.mContainer = r6
            r1.m29381()
            goto La
        L32:
            return
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۠۟ۤ, reason: contains not printable characters */
    public androidx.fragment.app.AbstractC7632 m29193() {
            r1 = this;
            androidx.fragment.app.ۥ۟۟۠۟ r0 = r1.m29100()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۥ, reason: contains not printable characters */
    public void m29194(@Yue.InterfaceC4410 androidx.fragment.app.C7627 r3) {
            r2 = this;
            androidx.fragment.app.Fragment r0 = r3.m29390()
            boolean r1 = r0.mDeferStart
            if (r1 == 0) goto L16
            boolean r1 = r2.f29177
            if (r1 == 0) goto L10
            r3 = 1
            r2.f29213 = r3
            return
        L10:
            r1 = 0
            r0.mDeferStart = r1
            r3.m29392()
        L16:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۦ, reason: contains not printable characters */
    public void m29195() {
            r4 = this;
            androidx.fragment.app.FragmentManager$ۥ۟۟۠ۡ r0 = new androidx.fragment.app.FragmentManager$ۥ۟۟۠ۡ
            r1 = 0
            r2 = -1
            r3 = 0
            r0.<init>(r4, r1, r2, r3)
            r4.m29138(r0, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۧ, reason: contains not printable characters */
    public void m29196(int r2, int r3) {
            r1 = this;
            r0 = 0
            r1.m29197(r2, r3, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۨ, reason: contains not printable characters */
    public void m29197(int r3, int r4, boolean r5) {
            r2 = this;
            if (r3 < 0) goto Lc
            androidx.fragment.app.FragmentManager$ۥ۟۟۠ۡ r0 = new androidx.fragment.app.FragmentManager$ۥ۟۟۠ۡ
            r1 = 0
            r0.<init>(r2, r1, r3, r4)
            r2.m29138(r0, r5)
            return
        Lc:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Bad id: "
            r5.append(r0)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟۠۠, reason: contains not printable characters */
    public void m29198(@Yue.InterfaceC4544 java.lang.String r3, int r4) {
            r2 = this;
            androidx.fragment.app.FragmentManager$ۥ۟۟۠ۡ r0 = new androidx.fragment.app.FragmentManager$ۥ۟۟۠ۡ
            r1 = -1
            r0.<init>(r2, r3, r1, r4)
            r3 = 0
            r2.m29138(r0, r3)
            return
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۠۠۟, reason: contains not printable characters */
    public boolean m29199() {
            r3 = this;
            r0 = -1
            r1 = 0
            r2 = 0
            boolean r0 = r3.m29202(r2, r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۠۠, reason: contains not printable characters */
    public boolean m29200(int r3, int r4) {
            r2 = this;
            if (r3 < 0) goto L8
            r0 = 0
            boolean r3 = r2.m29202(r0, r3, r4)
            return r3
        L8:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Bad id: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۠۠ۡ, reason: contains not printable characters */
    public boolean m29201(@Yue.InterfaceC4544 java.lang.String r2, int r3) {
            r1 = this;
            r0 = -1
            boolean r2 = r1.m29202(r2, r0, r3)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۢ, reason: contains not printable characters */
    public final boolean m29202(@Yue.InterfaceC4544 java.lang.String r9, int r10, int r11) {
            r8 = this;
            r0 = 0
            r8.m29140(r0)
            r0 = 1
            r8.m29139(r0)
            androidx.fragment.app.Fragment r1 = r8.f29200
            if (r1 == 0) goto L1b
            if (r10 >= 0) goto L1b
            if (r9 != 0) goto L1b
            androidx.fragment.app.FragmentManager r1 = r1.getChildFragmentManager()
            boolean r1 = r1.m29199()
            if (r1 == 0) goto L1b
            return r0
        L1b:
            java.util.ArrayList<androidx.fragment.app.ۥ> r3 = r8.f29214
            java.util.ArrayList<java.lang.Boolean> r4 = r8.f29215
            r2 = r8
            r5 = r9
            r6 = r10
            r7 = r11
            boolean r9 = r2.m29203(r3, r4, r5, r6, r7)
            if (r9 == 0) goto L3b
            r8.f29177 = r0
            java.util.ArrayList<androidx.fragment.app.ۥ> r10 = r8.f29214     // Catch: java.lang.Throwable -> L36
            java.util.ArrayList<java.lang.Boolean> r11 = r8.f29215     // Catch: java.lang.Throwable -> L36
            r8.m29209(r10, r11)     // Catch: java.lang.Throwable -> L36
            r8.m29103()
            goto L3b
        L36:
            r9 = move-exception
            r8.m29103()
            throw r9
        L3b:
            r8.m29235()
            r8.m29135()
            androidx.fragment.app.ۥ۟۟۠ r10 = r8.f29178
            r10.m29404()
            return r9
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public boolean m29203(@Yue.InterfaceC4410 java.util.ArrayList<androidx.fragment.app.C7595> r3, @Yue.InterfaceC4410 java.util.ArrayList<java.lang.Boolean> r4, @Yue.InterfaceC4544 java.lang.String r5, int r6, int r7) {
            r2 = this;
            r0 = 1
            r7 = r7 & r0
            r1 = 0
            if (r7 == 0) goto L7
            r7 = r0
            goto L8
        L7:
            r7 = r1
        L8:
            int r5 = r2.m29145(r5, r6, r7)
            if (r5 >= 0) goto Lf
            return r1
        Lf:
            java.util.ArrayList<androidx.fragment.app.ۥ> r6 = r2.f29179
            int r6 = r6.size()
            int r6 = r6 - r0
        L16:
            if (r6 < r5) goto L2b
            java.util.ArrayList<androidx.fragment.app.ۥ> r7 = r2.f29179
            java.lang.Object r7 = r7.remove(r6)
            androidx.fragment.app.ۥ r7 = (androidx.fragment.app.C7595) r7
            r3.add(r7)
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r4.add(r7)
            int r6 = r6 + (-1)
            goto L16
        L2b:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۤ, reason: contains not printable characters */
    public void m29204(@Yue.InterfaceC4410 android.os.Bundle r4, @Yue.InterfaceC4410 java.lang.String r5, @Yue.InterfaceC4410 androidx.fragment.app.Fragment r6) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r6.mFragmentManager
            if (r0 == r3) goto L22
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r2 = " is not currently in the FragmentManager"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r3.m29233(r0)
        L22:
            java.lang.String r6 = r6.mWho
            r4.putString(r5, r6)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۥ, reason: contains not printable characters */
    public void m29205(@Yue.InterfaceC4410 androidx.fragment.app.FragmentManager.AbstractC7586 r2, boolean r3) {
            r1 = this;
            androidx.fragment.app.ۥۣ۟۟۟ r0 = r1.f29189
            r0.m29358(r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۦ, reason: contains not printable characters */
    public void m29206(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r4) {
            r3 = this;
            r0 = 2
            boolean r0 = m29090(r0)
            if (r0 == 0) goto L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "remove: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = " nesting="
            r0.append(r1)
            int r1 = r4.mBackStackNesting
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L27:
            boolean r0 = r4.isInBackStack()
            r1 = 1
            r0 = r0 ^ r1
            boolean r2 = r4.mDetached
            if (r2 == 0) goto L33
            if (r0 == 0) goto L45
        L33:
            androidx.fragment.app.ۥ۟۟۠ r0 = r3.f29178
            r0.m29424(r4)
            boolean r0 = r3.m29175(r4)
            if (r0 == 0) goto L40
            r3.f29209 = r1
        L40:
            r4.mRemoving = r1
            r3.m29230(r4)
        L45:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۧ, reason: contains not printable characters */
    public void m29207(@Yue.InterfaceC4410 Yue.InterfaceC2772 r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<Yue.ۥ۠ۢۨۦ> r0 = r1.f29190
            r0.remove(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۨ, reason: contains not printable characters */
    public void m29208(@Yue.InterfaceC4410 androidx.fragment.app.FragmentManager.InterfaceC7590 r2) {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$ۥ۟۟۠۟> r0 = r1.f29188
            if (r0 == 0) goto L7
            r0.remove(r2)
        L7:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡ, reason: contains not printable characters */
    public final void m29209(@Yue.InterfaceC4410 java.util.ArrayList<androidx.fragment.app.C7595> r5, @Yue.InterfaceC4410 java.util.ArrayList<java.lang.Boolean> r6) {
            r4 = this;
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L7
            return
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
            androidx.fragment.app.ۥ r3 = (androidx.fragment.app.C7595) r3
            boolean r3 = r3.f29411
            if (r3 != 0) goto L56
            if (r2 == r1) goto L28
            r4.m29142(r5, r6, r2, r1)
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
            androidx.fragment.app.ۥ r3 = (androidx.fragment.app.C7595) r3
            boolean r3 = r3.f29411
            if (r3 != 0) goto L51
            int r2 = r2 + 1
            goto L36
        L51:
            r4.m29142(r5, r6, r1, r2)
            int r1 = r2 + (-1)
        L56:
            int r1 = r1 + 1
            goto L17
        L59:
            if (r2 == r0) goto L5e
            r4.m29142(r5, r6, r2, r0)
        L5e:
            return
        L5f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Internal error with the back stack records"
            r5.<init>(r6)
            throw r5
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡ۟, reason: contains not printable characters */
    public void m29210(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r2) {
            r1 = this;
            androidx.fragment.app.ۥ۟۟۟ۥ r0 = r1.f29217
            r0.m29373(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡ۠, reason: contains not printable characters */
    public final void m29211() {
            r2 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$ۥ۟۟۠۟> r0 = r2.f29188
            if (r0 == 0) goto L1b
            r0 = 0
        L5:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$ۥ۟۟۠۟> r1 = r2.f29188
            int r1 = r1.size()
            if (r0 >= r1) goto L1b
            java.util.ArrayList<androidx.fragment.app.FragmentManager$ۥ۟۟۠۟> r1 = r2.f29188
            java.lang.Object r1 = r1.get(r0)
            androidx.fragment.app.FragmentManager$ۥ۟۟۠۟ r1 = (androidx.fragment.app.FragmentManager.InterfaceC7590) r1
            r1.m29267()
            int r0 = r0 + 1
            goto L5
        L1b:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۡ, reason: contains not printable characters */
    public void m29212(@Yue.InterfaceC4544 android.os.Parcelable r3, @Yue.InterfaceC4544 Yue.C2771 r4) {
            r2 = this;
            Yue.ۥ۠ۢۨ<?> r0 = r2.f29197
            boolean r0 = r0 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r0 == 0) goto L10
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"
            r0.<init>(r1)
            r2.m29233(r0)
        L10:
            androidx.fragment.app.ۥ۟۟۟ۥ r0 = r2.f29217
            r0.m29374(r4)
            r2.m29216(r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۢ, reason: contains not printable characters */
    public void m29213(@Yue.InterfaceC4410 java.lang.String r2) {
            r1 = this;
            androidx.fragment.app.FragmentManager$ۥ۟۟۠ۢ r0 = new androidx.fragment.app.FragmentManager$ۥ۟۟۠ۢ
            r0.<init>(r1, r2)
            r2 = 0
            r1.m29138(r0, r2)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۡ, reason: contains not printable characters */
    public boolean m29214(@Yue.InterfaceC4410 java.util.ArrayList<androidx.fragment.app.C7595> r7, @Yue.InterfaceC4410 java.util.ArrayList<java.lang.Boolean> r8, @Yue.InterfaceC4410 java.lang.String r9) {
            r6 = this;
            java.util.Map<java.lang.String, androidx.fragment.app.ۥ۟۟> r0 = r6.f29185
            java.lang.Object r9 = r0.remove(r9)
            androidx.fragment.app.ۥ۟۟ r9 = (androidx.fragment.app.C7598) r9
            r0 = 0
            if (r9 != 0) goto Lc
            return r0
        Lc:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Iterator r2 = r7.iterator()
        L15:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L41
            java.lang.Object r3 = r2.next()
            androidx.fragment.app.ۥ r3 = (androidx.fragment.app.C7595) r3
            boolean r4 = r3.f29253
            if (r4 == 0) goto L15
            java.util.ArrayList<androidx.fragment.app.ۥ۟۟۠۟$ۥ> r3 = r3.f29396
            java.util.Iterator r3 = r3.iterator()
        L2b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L15
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.ۥ۟۟۠۟$ۥ r4 = (androidx.fragment.app.AbstractC7632.C7633) r4
            androidx.fragment.app.Fragment r4 = r4.f29414
            if (r4 == 0) goto L2b
            java.lang.String r5 = r4.mWho
            r1.put(r5, r4)
            goto L2b
        L41:
            java.util.List r9 = r9.m29295(r6, r1)
            java.util.Iterator r9 = r9.iterator()
        L49:
            r1 = r0
        L4a:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L60
            java.lang.Object r2 = r9.next()
            androidx.fragment.app.ۥ r2 = (androidx.fragment.app.C7595) r2
            boolean r2 = r2.mo29244(r7, r8)
            if (r2 != 0) goto L5e
            if (r1 == 0) goto L49
        L5e:
            r1 = 1
            goto L4a
        L60:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۤ, reason: contains not printable characters */
    public void m29215(@Yue.InterfaceC4544 android.os.Parcelable r3) {
            r2 = this;
            Yue.ۥ۠ۢۨ<?> r0 = r2.f29197
            boolean r0 = r0 instanceof Yue.InterfaceC5504
            if (r0 == 0) goto L10
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot use restoreSaveState when your FragmentHostCallback implements SavedStateRegistryOwner."
            r0.<init>(r1)
            r2.m29233(r0)
        L10:
            r2.m29216(r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۥ, reason: contains not printable characters */
    public void m29216(@Yue.InterfaceC4544 android.os.Parcelable r15) {
            r14 = this;
            if (r15 != 0) goto L3
            return
        L3:
            android.os.Bundle r15 = (android.os.Bundle) r15
            java.util.Set r0 = r15.keySet()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "result_"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto Ld
            android.os.Bundle r2 = r15.getBundle(r1)
            if (r2 == 0) goto Ld
            Yue.ۥ۠ۢۨ<?> r3 = r14.f29197
            android.content.Context r3 = r3.m12114()
            java.lang.ClassLoader r3 = r3.getClassLoader()
            r2.setClassLoader(r3)
            r3 = 7
            java.lang.String r1 = r1.substring(r3)
            java.util.Map<java.lang.String, android.os.Bundle> r3 = r14.f29186
            r3.put(r1, r2)
            goto Ld
        L3f:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r15.keySet()
            java.util.Iterator r1 = r1.iterator()
        L4c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7d
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "fragment_"
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L4c
            android.os.Bundle r3 = r15.getBundle(r2)
            if (r3 == 0) goto L4c
            Yue.ۥ۠ۢۨ<?> r4 = r14.f29197
            android.content.Context r4 = r4.m12114()
            java.lang.ClassLoader r4 = r4.getClassLoader()
            r3.setClassLoader(r4)
            r4 = 9
            java.lang.String r2 = r2.substring(r4)
            r0.put(r2, r3)
            goto L4c
        L7d:
            androidx.fragment.app.ۥ۟۟۠ r1 = r14.f29178
            r1.m29427(r0)
            java.lang.String r0 = "state"
            android.os.Parcelable r15 = r15.getParcelable(r0)
            androidx.fragment.app.ۥ۟۟۟ۤ r15 = (androidx.fragment.app.C7621) r15
            if (r15 != 0) goto L8d
            return
        L8d:
            androidx.fragment.app.ۥ۟۟۠ r1 = r14.f29178
            r1.m29425()
            java.util.ArrayList<java.lang.String> r1 = r15.f29311
            java.util.Iterator r1 = r1.iterator()
        L98:
            boolean r2 = r1.hasNext()
            java.lang.String r3 = "): "
            r4 = 0
            r5 = 2
            java.lang.String r6 = "FragmentManager"
            if (r2 == 0) goto L142
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            androidx.fragment.app.ۥ۟۟۠ r7 = r14.f29178
            android.os.Bundle r2 = r7.m29431(r2, r4)
            if (r2 == 0) goto L98
            android.os.Parcelable r4 = r2.getParcelable(r0)
            androidx.fragment.app.ۥ۟۟۟ۦ r4 = (androidx.fragment.app.C7625) r4
            androidx.fragment.app.ۥ۟۟۟ۥ r7 = r14.f29217
            java.lang.String r4 = r4.f29329
            androidx.fragment.app.Fragment r4 = r7.m29367(r4)
            if (r4 == 0) goto Le6
            boolean r7 = m29090(r5)
            if (r7 == 0) goto Ldc
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "restoreSaveState: re-attaching retained "
            r7.append(r8)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            android.util.Log.v(r6, r7)
        Ldc:
            androidx.fragment.app.ۥ۟۟۟ۧ r7 = new androidx.fragment.app.ۥ۟۟۟ۧ
            androidx.fragment.app.ۥۣ۟۟۟ r8 = r14.f29189
            androidx.fragment.app.ۥ۟۟۠ r9 = r14.f29178
            r7.<init>(r8, r9, r4, r2)
            goto Lff
        Le6:
            androidx.fragment.app.ۥ۟۟۟ۧ r7 = new androidx.fragment.app.ۥ۟۟۟ۧ
            androidx.fragment.app.ۥۣ۟۟۟ r9 = r14.f29189
            androidx.fragment.app.ۥ۟۟۠ r10 = r14.f29178
            Yue.ۥ۠ۢۨ<?> r4 = r14.f29197
            android.content.Context r4 = r4.m12114()
            java.lang.ClassLoader r11 = r4.getClassLoader()
            androidx.fragment.app.ۥ۟۟۟ۡ r12 = r14.m29160()
            r8 = r7
            r13 = r2
            r8.<init>(r9, r10, r11, r12, r13)
        Lff:
            androidx.fragment.app.Fragment r4 = r7.m29390()
            r4.mSavedFragmentState = r2
            r4.mFragmentManager = r14
            boolean r2 = m29090(r5)
            if (r2 == 0) goto L129
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "restoreSaveState: active ("
            r2.append(r5)
            java.lang.String r5 = r4.mWho
            r2.append(r5)
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r6, r2)
        L129:
            Yue.ۥ۠ۢۨ<?> r2 = r14.f29197
            android.content.Context r2 = r2.m12114()
            java.lang.ClassLoader r2 = r2.getClassLoader()
            r7.m29394(r2)
            androidx.fragment.app.ۥ۟۟۠ r2 = r14.f29178
            r2.m29421(r7)
            int r2 = r14.f29196
            r7.m29399(r2)
            goto L98
        L142:
            androidx.fragment.app.ۥ۟۟۟ۥ r0 = r14.f29217
            java.util.Collection r0 = r0.m29369()
            java.util.Iterator r0 = r0.iterator()
        L14c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a3
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            androidx.fragment.app.ۥ۟۟۠ r2 = r14.f29178
            java.lang.String r7 = r1.mWho
            boolean r2 = r2.m29405(r7)
            if (r2 != 0) goto L14c
            boolean r2 = m29090(r5)
            if (r2 == 0) goto L186
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "Discarding retained Fragment "
            r2.append(r7)
            r2.append(r1)
            java.lang.String r7 = " that was not found in the set of active Fragments "
            r2.append(r7)
            java.util.ArrayList<java.lang.String> r7 = r15.f29311
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r6, r2)
        L186:
            androidx.fragment.app.ۥ۟۟۟ۥ r2 = r14.f29217
            r2.m29373(r1)
            r1.mFragmentManager = r14
            androidx.fragment.app.ۥ۟۟۟ۧ r2 = new androidx.fragment.app.ۥ۟۟۟ۧ
            androidx.fragment.app.ۥۣ۟۟۟ r7 = r14.f29189
            androidx.fragment.app.ۥ۟۟۠ r8 = r14.f29178
            r2.<init>(r7, r8, r1)
            r7 = 1
            r2.m29399(r7)
            r2.m29392()
            r1.mRemoving = r7
            r2.m29392()
            goto L14c
        L1a3:
            androidx.fragment.app.ۥ۟۟۠ r0 = r14.f29178
            java.util.ArrayList<java.lang.String> r1 = r15.f29312
            r0.m29426(r1)
            androidx.fragment.app.ۥ۟[] r0 = r15.f29313
            r1 = 0
            if (r0 == 0) goto L209
            java.util.ArrayList r0 = new java.util.ArrayList
            androidx.fragment.app.ۥ۟[] r2 = r15.f29313
            int r2 = r2.length
            r0.<init>(r2)
            r14.f29179 = r0
            r0 = r1
        L1ba:
            androidx.fragment.app.ۥ۟[] r2 = r15.f29313
            int r4 = r2.length
            if (r0 >= r4) goto L20b
            r2 = r2[r0]
            androidx.fragment.app.ۥ r2 = r2.m29291(r14)
            boolean r4 = m29090(r5)
            if (r4 == 0) goto L201
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "restoreAllState: back stack #"
            r4.append(r7)
            r4.append(r0)
            java.lang.String r7 = " (index "
            r4.append(r7)
            int r7 = r2.f29252
            r4.append(r7)
            r4.append(r3)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            android.util.Log.v(r6, r4)
            Yue.ۥۣ۠ۨۡ r4 = new Yue.ۥۣ۠ۨۡ
            r4.<init>(r6)
            java.io.PrintWriter r7 = new java.io.PrintWriter
            r7.<init>(r4)
            java.lang.String r4 = "  "
            r2.m29284(r4, r7, r1)
            r7.close()
        L201:
            java.util.ArrayList<androidx.fragment.app.ۥ> r4 = r14.f29179
            r4.add(r2)
            int r0 = r0 + 1
            goto L1ba
        L209:
            r14.f29179 = r4
        L20b:
            java.util.concurrent.atomic.AtomicInteger r0 = r14.f29184
            int r2 = r15.f29314
            r0.set(r2)
            java.lang.String r0 = r15.f29315
            if (r0 == 0) goto L21f
            androidx.fragment.app.Fragment r0 = r14.m29144(r0)
            r14.f29200 = r0
            r14.m29125(r0)
        L21f:
            java.util.ArrayList<java.lang.String> r0 = r15.f29316
            if (r0 == 0) goto L23f
        L223:
            int r2 = r0.size()
            if (r1 >= r2) goto L23f
            java.util.Map<java.lang.String, androidx.fragment.app.ۥ۟۟> r2 = r14.f29185
            java.lang.Object r3 = r0.get(r1)
            java.lang.String r3 = (java.lang.String) r3
            java.util.ArrayList<androidx.fragment.app.ۥ۟۟> r4 = r15.f29317
            java.lang.Object r4 = r4.get(r1)
            androidx.fragment.app.ۥ۟۟ r4 = (androidx.fragment.app.C7598) r4
            r2.put(r3, r4)
            int r1 = r1 + 1
            goto L223
        L23f:
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            java.util.ArrayList<androidx.fragment.app.FragmentManager$ۥ۟۟۟ۨ> r15 = r15.f29318
            r0.<init>(r15)
            r14.f29208 = r0
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۠ۡۦ, reason: contains not printable characters */
    public Yue.C2771 m29217() {
            r2 = this;
            Yue.ۥ۠ۢۨ<?> r0 = r2.f29197
            boolean r0 = r0 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r0 == 0) goto L10
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."
            r0.<init>(r1)
            r2.m29233(r0)
        L10:
            androidx.fragment.app.ۥ۟۟۟ۥ r0 = r2.f29217
            Yue.ۥ۠ۢۨۥ r0 = r0.m29370()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۨ, reason: contains not printable characters */
    public android.os.Parcelable m29218() {
            r2 = this;
            Yue.ۥ۠ۢۨ<?> r0 = r2.f29197
            boolean r0 = r0 instanceof Yue.InterfaceC5504
            if (r0 == 0) goto L10
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot use saveAllState when your FragmentHostCallback implements SavedStateRegistryOwner."
            r0.<init>(r1)
            r2.m29233(r0)
        L10:
            android.os.Bundle r0 = r2.m29219()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L1b
            r0 = 0
        L1b:
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۠ۢ, reason: contains not printable characters */
    public android.os.Bundle m29219() {
            r11 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r11.m29149()
            r11.m29137()
            r1 = 1
            r11.m29140(r1)
            r11.f29210 = r1
            androidx.fragment.app.ۥ۟۟۟ۥ r2 = r11.f29217
            r2.m29375(r1)
            androidx.fragment.app.ۥ۟۟۠ r1 = r11.f29178
            java.util.ArrayList r1 = r1.m29428()
            androidx.fragment.app.ۥ۟۟۠ r2 = r11.f29178
            java.util.HashMap r2 = r2.m29416()
            boolean r3 = r2.isEmpty()
            java.lang.String r4 = "FragmentManager"
            r5 = 2
            if (r3 == 0) goto L38
            boolean r1 = m29090(r5)
            if (r1 == 0) goto L129
            java.lang.String r1 = "saveAllState: no fragments!"
            android.util.Log.v(r4, r1)
            goto L129
        L38:
            androidx.fragment.app.ۥ۟۟۠ r3 = r11.f29178
            java.util.ArrayList r3 = r3.m29429()
            java.util.ArrayList<androidx.fragment.app.ۥ> r6 = r11.f29179
            if (r6 == 0) goto L87
            int r6 = r6.size()
            if (r6 <= 0) goto L87
            androidx.fragment.app.ۥ۟[] r7 = new androidx.fragment.app.C7596[r6]
            r8 = 0
        L4b:
            if (r8 >= r6) goto L88
            androidx.fragment.app.ۥ۟ r9 = new androidx.fragment.app.ۥ۟
            java.util.ArrayList<androidx.fragment.app.ۥ> r10 = r11.f29179
            java.lang.Object r10 = r10.get(r8)
            androidx.fragment.app.ۥ r10 = (androidx.fragment.app.C7595) r10
            r9.<init>(r10)
            r7[r8] = r9
            boolean r9 = m29090(r5)
            if (r9 == 0) goto L84
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "saveAllState: adding back stack #"
            r9.append(r10)
            r9.append(r8)
            java.lang.String r10 = ": "
            r9.append(r10)
            java.util.ArrayList<androidx.fragment.app.ۥ> r10 = r11.f29179
            java.lang.Object r10 = r10.get(r8)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.util.Log.v(r4, r9)
        L84:
            int r8 = r8 + 1
            goto L4b
        L87:
            r7 = 0
        L88:
            androidx.fragment.app.ۥ۟۟۟ۤ r4 = new androidx.fragment.app.ۥ۟۟۟ۤ
            r4.<init>()
            r4.f29311 = r1
            r4.f29312 = r3
            r4.f29313 = r7
            java.util.concurrent.atomic.AtomicInteger r1 = r11.f29184
            int r1 = r1.get()
            r4.f29314 = r1
            androidx.fragment.app.Fragment r1 = r11.f29200
            if (r1 == 0) goto La3
            java.lang.String r1 = r1.mWho
            r4.f29315 = r1
        La3:
            java.util.ArrayList<java.lang.String> r1 = r4.f29316
            java.util.Map<java.lang.String, androidx.fragment.app.ۥ۟۟> r3 = r11.f29185
            java.util.Set r3 = r3.keySet()
            r1.addAll(r3)
            java.util.ArrayList<androidx.fragment.app.ۥ۟۟> r1 = r4.f29317
            java.util.Map<java.lang.String, androidx.fragment.app.ۥ۟۟> r3 = r11.f29185
            java.util.Collection r3 = r3.values()
            r1.addAll(r3)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.ArrayDeque<androidx.fragment.app.FragmentManager$ۥ۟۟۟ۨ> r3 = r11.f29208
            r1.<init>(r3)
            r4.f29318 = r1
            java.lang.String r1 = "state"
            r0.putParcelable(r1, r4)
            java.util.Map<java.lang.String, android.os.Bundle> r1 = r11.f29186
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld1:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lfa
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "result_"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            java.util.Map<java.lang.String, android.os.Bundle> r5 = r11.f29186
            java.lang.Object r3 = r5.get(r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            r0.putBundle(r4, r3)
            goto Ld1
        Lfa:
            java.util.Set r1 = r2.keySet()
            java.util.Iterator r1 = r1.iterator()
        L102:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L129
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "fragment_"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            java.lang.Object r3 = r2.get(r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            r0.putBundle(r4, r3)
            goto L102
        L129:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ۟, reason: contains not printable characters */
    public void m29220(@Yue.InterfaceC4410 java.lang.String r2) {
            r1 = this;
            androidx.fragment.app.FragmentManager$ۥۣ۟۟۠ r0 = new androidx.fragment.app.FragmentManager$ۥۣ۟۟۠
            r0.<init>(r1, r2)
            r2 = 0
            r1.m29138(r0, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ۠, reason: contains not printable characters */
    public boolean m29221(@Yue.InterfaceC4410 java.util.ArrayList<androidx.fragment.app.C7595> r17, @Yue.InterfaceC4410 java.util.ArrayList<java.lang.Boolean> r18, @Yue.InterfaceC4410 java.lang.String r19) {
            r16 = this;
            r0 = r16
            r1 = r19
            r2 = -1
            r3 = 1
            int r2 = r0.m29145(r1, r2, r3)
            if (r2 >= 0) goto Le
            r1 = 0
            return r1
        Le:
            r4 = r2
        Lf:
            java.util.ArrayList<androidx.fragment.app.ۥ> r5 = r0.f29179
            int r5 = r5.size()
            java.lang.String r6 = "saveBackStack(\""
            if (r4 >= r5) goto L4c
            java.util.ArrayList<androidx.fragment.app.ۥ> r5 = r0.f29179
            java.lang.Object r5 = r5.get(r4)
            androidx.fragment.app.ۥ r5 = (androidx.fragment.app.C7595) r5
            boolean r7 = r5.f29411
            if (r7 != 0) goto L49
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            r8.append(r1)
            java.lang.String r6 = "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found "
            r8.append(r6)
            r8.append(r5)
            java.lang.String r5 = " that did not use setReorderingAllowed(true)."
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            r7.<init>(r5)
            r0.m29233(r7)
        L49:
            int r4 = r4 + 1
            goto Lf
        L4c:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r5 = r2
        L52:
            java.util.ArrayList<androidx.fragment.app.ۥ> r7 = r0.f29179
            int r7 = r7.size()
            if (r5 >= r7) goto L10c
            java.util.ArrayList<androidx.fragment.app.ۥ> r7 = r0.f29179
            java.lang.Object r7 = r7.get(r5)
            androidx.fragment.app.ۥ r7 = (androidx.fragment.app.C7595) r7
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            java.util.ArrayList<androidx.fragment.app.ۥ۟۟۠۟$ۥ> r10 = r7.f29396
            java.util.Iterator r10 = r10.iterator()
        L72:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto La2
            java.lang.Object r11 = r10.next()
            androidx.fragment.app.ۥ۟۟۠۟$ۥ r11 = (androidx.fragment.app.AbstractC7632.C7633) r11
            androidx.fragment.app.Fragment r12 = r11.f29414
            if (r12 != 0) goto L83
            goto L72
        L83:
            boolean r13 = r11.f29415
            r14 = 2
            if (r13 == 0) goto L92
            int r13 = r11.f29413
            if (r13 == r3) goto L92
            if (r13 == r14) goto L92
            r15 = 8
            if (r13 != r15) goto L98
        L92:
            r4.add(r12)
            r8.add(r12)
        L98:
            int r11 = r11.f29413
            if (r11 == r3) goto L9e
            if (r11 != r14) goto L72
        L9e:
            r9.add(r12)
            goto L72
        La2:
            r8.removeAll(r9)
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto L108
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            r10.append(r1)
            java.lang.String r11 = "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment"
            r10.append(r11)
            int r11 = r8.size()
            if (r11 != r3) goto Ldd
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = " "
            r11.append(r12)
            java.util.Iterator r8 = r8.iterator()
            java.lang.Object r8 = r8.next()
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            goto Lee
        Ldd:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "s "
            r11.append(r12)
            r11.append(r8)
            java.lang.String r8 = r11.toString()
        Lee:
            r10.append(r8)
            java.lang.String r8 = " in "
            r10.append(r8)
            r10.append(r7)
            java.lang.String r7 = " that were previously added to the FragmentManager through a separate FragmentTransaction."
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            r9.<init>(r7)
            r0.m29233(r9)
        L108:
            int r5 = r5 + 1
            goto L52
        L10c:
            java.util.ArrayDeque r5 = new java.util.ArrayDeque
            r5.<init>(r4)
        L111:
            boolean r7 = r5.isEmpty()
            if (r7 != 0) goto L16f
            java.lang.Object r7 = r5.removeFirst()
            androidx.fragment.app.Fragment r7 = (androidx.fragment.app.Fragment) r7
            boolean r8 = r7.mRetainInstance
            if (r8 == 0) goto L153
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            r9.append(r1)
            java.lang.String r10 = "\") must not contain retained fragments. Found "
            r9.append(r10)
            boolean r10 = r4.contains(r7)
            if (r10 == 0) goto L13c
            java.lang.String r10 = "direct reference to retained "
            goto L13e
        L13c:
            java.lang.String r10 = "retained child "
        L13e:
            r9.append(r10)
            java.lang.String r10 = "fragment "
            r9.append(r10)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            r0.m29233(r8)
        L153:
            androidx.fragment.app.FragmentManager r7 = r7.mChildFragmentManager
            java.util.List r7 = r7.m29153()
            java.util.Iterator r7 = r7.iterator()
        L15d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L111
            java.lang.Object r8 = r7.next()
            androidx.fragment.app.Fragment r8 = (androidx.fragment.app.Fragment) r8
            if (r8 == 0) goto L15d
            r5.addLast(r8)
            goto L15d
        L16f:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L178:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L18a
            java.lang.Object r6 = r4.next()
            androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6
            java.lang.String r6 = r6.mWho
            r5.add(r6)
            goto L178
        L18a:
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.ArrayList<androidx.fragment.app.ۥ> r6 = r0.f29179
            int r6 = r6.size()
            int r6 = r6 - r2
            r4.<init>(r6)
            r6 = r2
        L197:
            java.util.ArrayList<androidx.fragment.app.ۥ> r7 = r0.f29179
            int r7 = r7.size()
            if (r6 >= r7) goto L1a6
            r7 = 0
            r4.add(r7)
            int r6 = r6 + 1
            goto L197
        L1a6:
            androidx.fragment.app.ۥ۟۟ r6 = new androidx.fragment.app.ۥ۟۟
            r6.<init>(r5, r4)
            java.util.ArrayList<androidx.fragment.app.ۥ> r5 = r0.f29179
            int r5 = r5.size()
            int r5 = r5 - r3
        L1b2:
            if (r5 < r2) goto L1df
            java.util.ArrayList<androidx.fragment.app.ۥ> r7 = r0.f29179
            java.lang.Object r7 = r7.remove(r5)
            androidx.fragment.app.ۥ r7 = (androidx.fragment.app.C7595) r7
            androidx.fragment.app.ۥ r8 = new androidx.fragment.app.ۥ
            r8.<init>(r7)
            r8.m29281()
            androidx.fragment.app.ۥ۟ r9 = new androidx.fragment.app.ۥ۟
            r9.<init>(r8)
            int r8 = r5 - r2
            r4.set(r8, r9)
            r7.f29253 = r3
            r8 = r17
            r8.add(r7)
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r9 = r18
            r9.add(r7)
            int r5 = r5 + (-1)
            goto L1b2
        L1df:
            java.util.Map<java.lang.String, androidx.fragment.app.ۥ۟۟> r2 = r0.f29185
            r2.put(r1, r6)
            return r3
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۠ۢۡ, reason: contains not printable characters */
    public androidx.fragment.app.Fragment.C7570 m29222(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r5) {
            r4 = this;
            androidx.fragment.app.ۥ۟۟۠ r0 = r4.f29178
            java.lang.String r1 = r5.mWho
            androidx.fragment.app.ۥ۟۟۟ۧ r0 = r0.m29417(r1)
            if (r0 == 0) goto L14
            androidx.fragment.app.Fragment r1 = r0.m29390()
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L32
        L14:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Fragment "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = " is not currently in the FragmentManager"
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            r4.m29233(r1)
        L32:
            androidx.fragment.app.Fragment$ۥ۟۟۟ۨ r5 = r0.m29396()
            return r5
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۢ, reason: contains not printable characters */
    public void m29223() {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$ۥ۟۟۠۠> r0 = r3.f29176
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$ۥ۟۟۠۠> r1 = r3.f29176     // Catch: java.lang.Throwable -> L26
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L26
            r2 = 1
            if (r1 != r2) goto L28
            Yue.ۥ۠ۢۨ<?> r1 = r3.f29197     // Catch: java.lang.Throwable -> L26
            android.os.Handler r1 = r1.m12115()     // Catch: java.lang.Throwable -> L26
            java.lang.Runnable r2 = r3.f29219     // Catch: java.lang.Throwable -> L26
            r1.removeCallbacks(r2)     // Catch: java.lang.Throwable -> L26
            Yue.ۥ۠ۢۨ<?> r1 = r3.f29197     // Catch: java.lang.Throwable -> L26
            android.os.Handler r1 = r1.m12115()     // Catch: java.lang.Throwable -> L26
            java.lang.Runnable r2 = r3.f29219     // Catch: java.lang.Throwable -> L26
            r1.post(r2)     // Catch: java.lang.Throwable -> L26
            r3.m29235()     // Catch: java.lang.Throwable -> L26
            goto L28
        L26:
            r1 = move-exception
            goto L2a
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            return
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۢ, reason: contains not printable characters */
    public void m29224(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r2, boolean r3) {
            r1 = this;
            android.view.ViewGroup r2 = r1.m29159(r2)
            if (r2 == 0) goto L11
            boolean r0 = r2 instanceof androidx.fragment.app.FragmentContainerView
            if (r0 == 0) goto L11
            androidx.fragment.app.FragmentContainerView r2 = (androidx.fragment.app.FragmentContainerView) r2
            r3 = r3 ^ 1
            r2.setDrawDisappearingViewsLast(r3)
        L11:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۤ, reason: contains not printable characters */
    public void m29225(@Yue.InterfaceC4410 androidx.fragment.app.C7616 r1) {
            r0 = this;
            r0.f29201 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۥ, reason: contains not printable characters */
    public void m29226(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r3, @Yue.InterfaceC4410 androidx.lifecycle.Lifecycle.State r4) {
            r2 = this;
            java.lang.String r0 = r3.mWho
            androidx.fragment.app.Fragment r0 = r2.m29144(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L17
            Yue.ۥ۠ۢۨ<?> r0 = r3.mHost
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            if (r0 != r2) goto L17
        L14:
            r3.mMaxState = r4
            return
        L17:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Fragment "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " is not an active fragment of FragmentManager "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۦ, reason: contains not printable characters */
    public void m29227(@Yue.InterfaceC4544 androidx.fragment.app.Fragment r4) {
            r3 = this;
            if (r4 == 0) goto L36
            java.lang.String r0 = r4.mWho
            androidx.fragment.app.Fragment r0 = r3.m29144(r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L17
            Yue.ۥ۠ۢۨ<?> r0 = r4.mHost
            if (r0 == 0) goto L36
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            if (r0 != r3) goto L17
            goto L36
        L17:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " is not an active fragment of FragmentManager "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L36:
            androidx.fragment.app.Fragment r0 = r3.f29200
            r3.f29200 = r4
            r3.m29125(r0)
            androidx.fragment.app.Fragment r4 = r3.f29200
            r3.m29125(r4)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۧ, reason: contains not printable characters */
    public void m29228(@Yue.InterfaceC4410 Yue.InterfaceC5884 r1) {
            r0 = this;
            r0.f29203 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۨ, reason: contains not printable characters */
    public void m29229(@Yue.InterfaceC4544 Yue.C2779.C2782 r1) {
            r0 = this;
            r0.f29218 = r1
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۠, reason: contains not printable characters */
    public final void m29230(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r4) {
            r3 = this;
            android.view.ViewGroup r0 = r3.m29159(r4)
            if (r0 == 0) goto L37
            int r1 = r4.getEnterAnim()
            int r2 = r4.getExitAnim()
            int r1 = r1 + r2
            int r2 = r4.getPopEnterAnim()
            int r1 = r1 + r2
            int r2 = r4.getPopExitAnim()
            int r1 = r1 + r2
            if (r1 <= 0) goto L37
            int r1 = Yue.C5040.C5043.f16386
            java.lang.Object r1 = r0.getTag(r1)
            if (r1 != 0) goto L28
            int r1 = Yue.C5040.C5043.f16386
            r0.setTag(r1, r4)
        L28:
            int r1 = Yue.C5040.C5043.f16386
            java.lang.Object r0 = r0.getTag(r1)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            boolean r4 = r4.getPopDirection()
            r0.setPopDirection(r4)
        L37:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public void m29231(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r3) {
            r2 = this;
            r0 = 2
            boolean r0 = m29090(r0)
            if (r0 == 0) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "show: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1d:
            boolean r0 = r3.mHidden
            if (r0 == 0) goto L2a
            r0 = 0
            r3.mHidden = r0
            boolean r0 = r3.mHiddenChanged
            r0 = r0 ^ 1
            r3.mHiddenChanged = r0
        L2a:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public final void m29232() {
            r2 = this;
            androidx.fragment.app.ۥ۟۟۠ r0 = r2.f29178
            java.util.List r0 = r0.m29414()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.ۥ۟۟۟ۧ r1 = (androidx.fragment.app.C7627) r1
            r2.m29194(r1)
            goto La
        L1a:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۡ, reason: contains not printable characters */
    public final void m29233(java.lang.RuntimeException r8) {
            r7 = this;
            java.lang.String r0 = r8.getMessage()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.e(r1, r0)
            java.lang.String r0 = "Activity state:"
            android.util.Log.e(r1, r0)
            Yue.ۥۣ۠ۨۡ r0 = new Yue.ۥۣ۠ۨۡ
            r0.<init>(r1)
            java.io.PrintWriter r2 = new java.io.PrintWriter
            r2.<init>(r0)
            Yue.ۥ۠ۢۨ<?> r0 = r7.f29197
            java.lang.String r3 = "Failed dumping state"
            r4 = 0
            r5 = 0
            java.lang.String r6 = "  "
            if (r0 == 0) goto L2d
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Exception -> L28
            r0.mo12116(r6, r5, r2, r4)     // Catch: java.lang.Exception -> L28
            goto L37
        L28:
            r0 = move-exception
            android.util.Log.e(r1, r3, r0)
            goto L37
        L2d:
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch: java.lang.Exception -> L33
            r7.m29136(r6, r5, r2, r0)     // Catch: java.lang.Exception -> L33
            goto L37
        L33:
            r0 = move-exception
            android.util.Log.e(r1, r3, r0)
        L37:
            throw r8
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۢ, reason: contains not printable characters */
    public void m29234(@Yue.InterfaceC4410 androidx.fragment.app.FragmentManager.AbstractC7586 r2) {
            r1 = this;
            androidx.fragment.app.ۥۣ۟۟۟ r0 = r1.f29189
            r0.m29359(r2)
            return
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۠, reason: contains not printable characters */
    public final void m29235() {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$ۥ۟۟۠۠> r0 = r3.f29176
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$ۥ۟۟۠۠> r1 = r3.f29176     // Catch: java.lang.Throwable -> L13
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L13
            r2 = 1
            if (r1 != 0) goto L15
            Yue.ۥۣۡۡۢ r1 = r3.f29183     // Catch: java.lang.Throwable -> L13
            r1.setEnabled(r2)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r1 = move-exception
            goto L2c
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            Yue.ۥۣۡۡۢ r0 = r3.f29183
            int r1 = r3.m29155()
            if (r1 <= 0) goto L27
            androidx.fragment.app.Fragment r1 = r3.f29199
            boolean r1 = r3.m29179(r1)
            if (r1 == 0) goto L27
            goto L28
        L27:
            r2 = 0
        L28:
            r0.setEnabled(r2)
            return
        L2c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
    }
}
