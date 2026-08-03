package p000a;

import android.util.Log;
import androidx.fragment.app.ComponentCallbacksC1100b;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: a.o7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0743o7 {

    /* JADX INFO: renamed from: a */
    public static final b f2939a = b.f2945a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: a.o7$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f2940a;

        /* JADX INFO: renamed from: b */
        public static final a f2941b;

        /* JADX INFO: renamed from: c */
        public static final a f2942c;

        /* JADX INFO: renamed from: d */
        public static final a f2943d;

        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ a[] f2944e;

        /* JADX INFO: Fake field, exist only in values array */
        a EF0;

        static {
            a aVar = new a("PENALTY_LOG", 0);
            a aVar2 = new a("PENALTY_DEATH", 1);
            a aVar3 = new a("DETECT_FRAGMENT_REUSE", 2);
            f2940a = aVar3;
            a aVar4 = new a("DETECT_FRAGMENT_TAG_USAGE", 3);
            f2941b = aVar4;
            a aVar5 = new a("DETECT_WRONG_NESTED_HIERARCHY", 4);
            f2942c = aVar5;
            a aVar6 = new a("DETECT_RETAIN_INSTANCE_USAGE", 5);
            a aVar7 = new a("DETECT_SET_USER_VISIBLE_HINT", 6);
            a aVar8 = new a("DETECT_TARGET_FRAGMENT_USAGE", 7);
            a aVar9 = new a("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
            f2943d = aVar9;
            f2944e = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f2944e.clone();
        }
    }

    /* JADX INFO: renamed from: a.o7$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public static final b f2945a;

        static {
            b bVar = new b();
            new LinkedHashMap();
            f2945a = bVar;
        }
    }

    /* JADX INFO: renamed from: a */
    public static b m1762a(ComponentCallbacksC1100b componentCallbacksC1100b) {
        while (componentCallbacksC1100b != null) {
            if (componentCallbacksC1100b.m2536i()) {
                componentCallbacksC1100b.m2533f();
            }
            componentCallbacksC1100b = componentCallbacksC1100b.f4579w;
        }
        return f2939a;
    }

    /* JADX INFO: renamed from: b */
    public static void m1763b(C0705m7 c0705m7) {
        if (AbstractC0553e7.m1330J(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(c0705m7.f2653a.getClass().getName()), c0705m7);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m1764c(ComponentCallbacksC1100b componentCallbacksC1100b, String str) {
        C0631i9.m1482e(componentCallbacksC1100b, "fragment");
        C0631i9.m1482e(str, "previousFragmentId");
        m1763b(new C0705m7(componentCallbacksC1100b, "Attempting to reuse fragment " + componentCallbacksC1100b + " with previous ID " + str));
        m1762a(componentCallbacksC1100b).getClass();
    }
}
