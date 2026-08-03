package p000a;

import java.util.List;

/* JADX INFO: renamed from: a.Ne */
/* JADX INFO: loaded from: classes.dex */
public final class C0251Ne {

    /* JADX INFO: renamed from: a */
    public static final C0251Ne f857a = new C0251Ne();

    /* JADX INFO: renamed from: b */
    public static final List<InterfaceC0269Oe> f858b = C0739o3.m1757d0(new C0392Vc(), new C0928y2(), new C0827sf());

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: a.Ne$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f859a;

        /* JADX INFO: renamed from: b */
        public static final a f860b;

        /* JADX INFO: renamed from: c */
        public static final a f861c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ a[] f862d;

        static {
            a aVar = new a("YES", 0);
            f859a = aVar;
            a aVar2 = new a("NO", 1);
            f860b = aVar2;
            a aVar3 = new a("ABSTAIN", 2);
            f861c = aVar3;
            f862d = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f862d.clone();
        }
    }
}
