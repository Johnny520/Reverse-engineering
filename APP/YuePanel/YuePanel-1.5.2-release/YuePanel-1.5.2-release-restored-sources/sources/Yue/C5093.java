package Yue;

import Yue.InterfaceC7144;
import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: Yue.ۥۣ۠۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5093 {

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public static final String f1263 = "FragmentStrictMode";

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C5093 f1262 = new C5093();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static C5094 f12053 = C5094.f12065;

    /* JADX INFO: renamed from: Yue.ۥۣ۠۟ۡ$ۥ */
    public enum EnumC0635 {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۟ۡ$ۥ۟ */
    public interface InterfaceC0636 {
        /* JADX INFO: renamed from: ۥ */
        void m1908(@InterfaceC6399 AbstractC8386 abstractC8386);
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۟ۡ$ۥ۟۟, reason: contains not printable characters */
    public static final class C5094 {

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        @InterfaceC6399
        public static final C0638 f12064 = new C0638(null);

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        @InterfaceC6399
        @InterfaceC5568
        public static final C5094 f12065 = new C5094(C7387.m23125(), null, C5943.m18584());

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        public final Set<EnumC0635> f1264;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6489
        public final InterfaceC0636 f1265;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6399
        public final Map<String, Set<Class<? extends AbstractC8386>>> f12066;

        /* JADX INFO: renamed from: Yue.ۥۣ۠۟ۡ$ۥ۟۟$ۥ */
        public static final class C0637 {

            /* JADX INFO: renamed from: ۥ۟ */
            @InterfaceC6489
            public InterfaceC0636 f1267;

            /* JADX INFO: renamed from: ۥ */
            @InterfaceC6399
            public final Set<EnumC0635> f1266 = new LinkedHashSet();

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            @InterfaceC6399
            public final Map<String, Set<Class<? extends AbstractC8386>>> f12067 = new LinkedHashMap();

            @InterfaceC6399
            @SuppressLint({"BuilderSetStyle"})
            /* JADX INFO: renamed from: ۥ */
            public final C0637 m1911(@InterfaceC6399 Class<? extends Fragment> cls, @InterfaceC6399 Class<? extends AbstractC8386> cls2) {
                C5499.m17103(cls, "fragmentClass");
                C5499.m17103(cls2, "violationClass");
                String name = cls.getName();
                C5499.m17102(name, "fragmentClassString");
                return m1912(name, cls2);
            }

            @InterfaceC6399
            @SuppressLint({"BuilderSetStyle"})
            /* JADX INFO: renamed from: ۥ۟ */
            public final C0637 m1912(@InterfaceC6399 String str, @InterfaceC6399 Class<? extends AbstractC8386> cls) {
                C5499.m17103(str, "fragmentClass");
                C5499.m17103(cls, "violationClass");
                Set<Class<? extends AbstractC8386>> linkedHashSet = this.f12067.get(str);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet<>();
                }
                linkedHashSet.add(cls);
                this.f12067.put(str, linkedHashSet);
                return this;
            }

            @InterfaceC6399
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public final C5094 m15719() {
                if (this.f1267 == null && !this.f1266.contains(EnumC0635.PENALTY_DEATH)) {
                    m15729();
                }
                return new C5094(this.f1266, this.f1267, this.f12067);
            }

            @InterfaceC6399
            @SuppressLint({"BuilderSetStyle"})
            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public final C0637 m15720() {
                this.f1266.add(EnumC0635.DETECT_FRAGMENT_REUSE);
                return this;
            }

            @InterfaceC6399
            @SuppressLint({"BuilderSetStyle"})
            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public final C0637 m15721() {
                this.f1266.add(EnumC0635.DETECT_FRAGMENT_TAG_USAGE);
                return this;
            }

            @InterfaceC6399
            @SuppressLint({"BuilderSetStyle"})
            /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
            public final C0637 m15722() {
                this.f1266.add(EnumC0635.DETECT_RETAIN_INSTANCE_USAGE);
                return this;
            }

            @InterfaceC6399
            @SuppressLint({"BuilderSetStyle"})
            /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
            public final C0637 m15723() {
                this.f1266.add(EnumC0635.DETECT_SET_USER_VISIBLE_HINT);
                return this;
            }

            @InterfaceC6399
            @SuppressLint({"BuilderSetStyle"})
            /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
            public final C0637 m15724() {
                this.f1266.add(EnumC0635.DETECT_TARGET_FRAGMENT_USAGE);
                return this;
            }

            @InterfaceC6399
            @SuppressLint({"BuilderSetStyle"})
            /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
            public final C0637 m15725() {
                this.f1266.add(EnumC0635.DETECT_WRONG_FRAGMENT_CONTAINER);
                return this;
            }

            @InterfaceC6399
            @SuppressLint({"BuilderSetStyle"})
            /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
            public final C0637 m15726() {
                this.f1266.add(EnumC0635.DETECT_WRONG_NESTED_HIERARCHY);
                return this;
            }

            @InterfaceC6399
            @SuppressLint({"BuilderSetStyle"})
            /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
            public final C0637 m15727() {
                this.f1266.add(EnumC0635.PENALTY_DEATH);
                return this;
            }

            @InterfaceC6399
            @SuppressLint({"BuilderSetStyle"})
            /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
            public final C0637 m15728(@InterfaceC6399 InterfaceC0636 interfaceC0636) {
                C5499.m17103(interfaceC0636, "listener");
                this.f1267 = interfaceC0636;
                return this;
            }

            @InterfaceC6399
            @SuppressLint({"BuilderSetStyle"})
            /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
            public final C0637 m15729() {
                this.f1266.add(EnumC0635.PENALTY_LOG);
                return this;
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۣ۠۟ۡ$ۥ۟۟$ۥ۟ */
        public static final class C0638 {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۣ۠۟ۡ.ۥ۟۟.ۥ۟.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ C0638(C4335 c4335) {
                this();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public C0638() {
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Set<? extends Yue.ۥۣ۠۟ۡ$ۥ> */
        /* JADX WARN: Multi-variable type inference failed */
        public C5094(@InterfaceC6399 Set<? extends EnumC0635> set, @InterfaceC6489 InterfaceC0636 interfaceC0636, @InterfaceC6399 Map<String, ? extends Set<Class<? extends AbstractC8386>>> map) {
            C5499.m17103(set, "flags");
            C5499.m17103(map, "allowedViolations");
            this.f1264 = set;
            this.f1265 = interfaceC0636;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Set<Class<? extends AbstractC8386>>> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            this.f12066 = linkedHashMap;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final Set<EnumC0635> m1909() {
            return this.f1264;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟ */
        public final InterfaceC0636 m1910() {
            return this.f1265;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Map<String, Set<Class<? extends AbstractC8386>>> m15718() {
            return this.f12066;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final void m15698(C5094 c5094, AbstractC8386 abstractC8386) {
        C5499.m17103(c5094, "$policy");
        C5499.m17103(abstractC8386, "$violation");
        c5094.m1910().m1908(abstractC8386);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final void m15699(String str, AbstractC8386 abstractC8386) {
        C5499.m17103(abstractC8386, "$violation");
        Log.e(f1263, "Policy violation with PENALTY_DEATH in " + str, abstractC8386);
        throw abstractC8386;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: Yue.ۥۣ۠۟ۡ */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final void m15700(@InterfaceC6399 Fragment fragment, @InterfaceC6399 String str) {
        C5499.m17103(fragment, "fragment");
        C5499.m17103(str, "previousFragmentId");
        C5090 c5090 = new C5090(fragment, str);
        C5093 c5093 = f1262;
        c5093.m15713(c5090);
        C5094 c5094M15711 = c5093.m15711(fragment);
        if (c5094M15711.m1909().contains(EnumC0635.DETECT_FRAGMENT_REUSE) && c5093.m15717(c5094M15711, fragment.getClass(), c5090.getClass())) {
            c5093.m15712(c5094M15711, c5090);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: Yue.ۥۣ۠۟ۡ */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final void m15701(@InterfaceC6399 Fragment fragment, @InterfaceC6489 ViewGroup viewGroup) {
        C5499.m17103(fragment, "fragment");
        C5098 c5098 = new C5098(fragment, viewGroup);
        C5093 c5093 = f1262;
        c5093.m15713(c5098);
        C5094 c5094M15711 = c5093.m15711(fragment);
        if (c5094M15711.m1909().contains(EnumC0635.DETECT_FRAGMENT_TAG_USAGE) && c5093.m15717(c5094M15711, fragment.getClass(), c5098.getClass())) {
            c5093.m15712(c5094M15711, c5098);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠۟ۡ */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final void m15702(@InterfaceC6399 Fragment fragment) {
        C5499.m17103(fragment, "fragment");
        C5167 c5167 = new C5167(fragment);
        C5093 c5093 = f1262;
        c5093.m15713(c5167);
        C5094 c5094M15711 = c5093.m15711(fragment);
        if (c5094M15711.m1909().contains(EnumC0635.DETECT_RETAIN_INSTANCE_USAGE) && c5093.m15717(c5094M15711, fragment.getClass(), c5167.getClass())) {
            c5093.m15712(c5094M15711, c5167);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠۟ۡ */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final void m15703(@InterfaceC6399 Fragment fragment) {
        C5499.m17103(fragment, "fragment");
        C5168 c5168 = new C5168(fragment);
        C5093 c5093 = f1262;
        c5093.m15713(c5168);
        C5094 c5094M15711 = c5093.m15711(fragment);
        if (c5094M15711.m1909().contains(EnumC0635.DETECT_TARGET_FRAGMENT_USAGE) && c5093.m15717(c5094M15711, fragment.getClass(), c5168.getClass())) {
            c5093.m15712(c5094M15711, c5168);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠۟ۡ */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final void m15704(@InterfaceC6399 Fragment fragment) {
        C5499.m17103(fragment, "fragment");
        C5169 c5169 = new C5169(fragment);
        C5093 c5093 = f1262;
        c5093.m15713(c5169);
        C5094 c5094M15711 = c5093.m15711(fragment);
        if (c5094M15711.m1909().contains(EnumC0635.DETECT_TARGET_FRAGMENT_USAGE) && c5093.m15717(c5094M15711, fragment.getClass(), c5169.getClass())) {
            c5093.m15712(c5094M15711, c5169);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠۟ۡ */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final void m15705(@InterfaceC6399 Fragment fragment) {
        C5499.m17103(fragment, "fragment");
        C7382 c7382 = new C7382(fragment);
        C5093 c5093 = f1262;
        c5093.m15713(c7382);
        C5094 c5094M15711 = c5093.m15711(fragment);
        if (c5094M15711.m1909().contains(EnumC0635.DETECT_RETAIN_INSTANCE_USAGE) && c5093.m15717(c5094M15711, fragment.getClass(), c7382.getClass())) {
            c5093.m15712(c5094M15711, c7382);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: Yue.ۥۣ۠۟ۡ */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final void m15706(@InterfaceC6399 Fragment fragment, @InterfaceC6399 Fragment fragment2, int i) {
        C5499.m17103(fragment, "violatingFragment");
        C5499.m17103(fragment2, "targetFragment");
        C7383 c7383 = new C7383(fragment, fragment2, i);
        C5093 c5093 = f1262;
        c5093.m15713(c7383);
        C5094 c5094M15711 = c5093.m15711(fragment);
        if (c5094M15711.m1909().contains(EnumC0635.DETECT_TARGET_FRAGMENT_USAGE) && c5093.m15717(c5094M15711, fragment.getClass(), c7383.getClass())) {
            c5093.m15712(c5094M15711, c7383);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: Yue.ۥۣ۠۟ۡ */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final void m15707(@InterfaceC6399 Fragment fragment, boolean z) {
        C5499.m17103(fragment, "fragment");
        C7384 c7384 = new C7384(fragment, z);
        C5093 c5093 = f1262;
        c5093.m15713(c7384);
        C5094 c5094M15711 = c5093.m15711(fragment);
        if (c5094M15711.m1909().contains(EnumC0635.DETECT_SET_USER_VISIBLE_HINT) && c5093.m15717(c5094M15711, fragment.getClass(), c7384.getClass())) {
            c5093.m15712(c5094M15711, c7384);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: Yue.ۥۣ۠۟ۡ */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final void m15708(@InterfaceC6399 Fragment fragment, @InterfaceC6399 ViewGroup viewGroup) {
        C5499.m17103(fragment, "fragment");
        C5499.m17103(viewGroup, "container");
        C8540 c8540 = new C8540(fragment, viewGroup);
        C5093 c5093 = f1262;
        c5093.m15713(c8540);
        C5094 c5094M15711 = c5093.m15711(fragment);
        if (c5094M15711.m1909().contains(EnumC0635.DETECT_WRONG_FRAGMENT_CONTAINER) && c5093.m15717(c5094M15711, fragment.getClass(), c8540.getClass())) {
            c5093.m15712(c5094M15711, c8540);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: Yue.ۥۣ۠۟ۡ */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final void m15709(@InterfaceC6399 Fragment fragment, @InterfaceC6399 Fragment fragment2, int i) {
        C5499.m17103(fragment, "fragment");
        C5499.m17103(fragment2, "expectedParentFragment");
        C8541 c8541 = new C8541(fragment, fragment2, i);
        C5093 c5093 = f1262;
        c5093.m15713(c8541);
        C5094 c5094M15711 = c5093.m15711(fragment);
        if (c5094M15711.m1909().contains(EnumC0635.DETECT_WRONG_NESTED_HIERARCHY) && c5093.m15717(c5094M15711, fragment.getClass(), c8541.getClass())) {
            c5093.m15712(c5094M15711, c8541);
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final C5094 m15710() {
        return f12053;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final C5094 m15711(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
                C5499.m17102(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.m29818() != null) {
                    C5094 c5094M29818 = parentFragmentManager.m29818();
                    C5499.m17100(c5094M29818);
                    return c5094M29818;
                }
            }
            fragment = fragment.getParentFragment();
        }
        return f12053;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m15712(final C5094 c5094, final AbstractC8386 abstractC8386) {
        Fragment fragmentM4371 = abstractC8386.m4371();
        final String name = fragmentM4371.getClass().getName();
        if (c5094.m1909().contains(EnumC0635.PENALTY_LOG)) {
            Log.d(f1263, "Policy violation in " + name, abstractC8386);
        }
        if (c5094.m1910() != null) {
            m15715(fragmentM4371, new Runnable() { // from class: Yue.ۥۣ۠۟۟
                @Override // java.lang.Runnable
                public final void run() {
                    C5093.m15698(c5094, abstractC8386);
                }
            });
        }
        if (c5094.m1909().contains(EnumC0635.PENALTY_DEATH)) {
            m15715(fragmentM4371, new Runnable() { // from class: Yue.ۥۣ۠۟۠
                @Override // java.lang.Runnable
                public final void run() {
                    C5093.m15699(name, abstractC8386);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m15713(AbstractC8386 abstractC8386) {
        if (FragmentManager.m29739(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + abstractC8386.m4371().getClass().getName(), abstractC8386);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣ۠۟ۡ */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC8392
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m15714(@InterfaceC6399 AbstractC8386 abstractC8386) {
        C5499.m17103(abstractC8386, "violation");
        m15713(abstractC8386);
        Fragment fragmentM4371 = abstractC8386.m4371();
        C5094 c5094M15711 = m15711(fragmentM4371);
        if (m15717(c5094M15711, fragmentM4371.getClass(), abstractC8386.getClass())) {
            m15712(c5094M15711, abstractC8386);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m15715(Fragment fragment, Runnable runnable) {
        if (!fragment.isAdded()) {
            runnable.run();
            return;
        }
        Handler handlerM15671 = fragment.getParentFragmentManager().m29812().m15671();
        C5499.m17102(handlerM15671, "fragment.parentFragmentManager.host.handler");
        if (C5499.m17094(handlerM15671.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            handlerM15671.post(runnable);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final void m15716(@InterfaceC6399 C5094 c5094) {
        C5499.m17103(c5094, "<set-?>");
        f12053 = c5094;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final boolean m15717(C5094 c5094, Class<? extends Fragment> cls, Class<? extends AbstractC8386> cls2) {
        Set<Class<? extends AbstractC8386>> set = c5094.m15718().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (C5499.m17094(cls2.getSuperclass(), AbstractC8386.class) || !C3888.m10855(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
