package p000a;

/* JADX INFO: renamed from: a.Xe */
/* JADX INFO: loaded from: classes.dex */
public final class C0430Xe {

    /* JADX INFO: renamed from: a */
    public static final c f1609a = new c(null, false);

    /* JADX INFO: renamed from: b */
    public static final c f1610b = new c(null, true);

    /* JADX INFO: renamed from: c */
    public static final c f1611c;

    /* JADX INFO: renamed from: d */
    public static final c f1612d;

    /* JADX INFO: renamed from: a.Xe$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final a f1613a = new a();
    }

    /* JADX INFO: renamed from: a.Xe$b */
    public static abstract class b {

        /* JADX INFO: renamed from: a */
        public final a f1614a;

        public b(a aVar) {
            this.f1614a = aVar;
        }

        /* JADX INFO: renamed from: a */
        public abstract boolean mo1075a();

        /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean m1076b(CharSequence charSequence, int i) {
            if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
                throw new IllegalArgumentException();
            }
            if (this.f1614a == null) {
                return mo1075a();
            }
            char c = 2;
            for (int i2 = 0; i2 < i && c == 2; i2++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i2));
                c cVar = C0430Xe.f1609a;
                if (directionality == 0) {
                    c = 1;
                    continue;
                } else if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            c = 0;
                            break;
                        default:
                            c = 2;
                            continue;
                    }
                } else {
                    c = 0;
                }
            }
            if (c == 0) {
                return true;
            }
            if (c != 1) {
                return mo1075a();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: a.Xe$c */
    public static class c extends b {

        /* JADX INFO: renamed from: b */
        public final boolean f1615b;

        public c(a aVar, boolean z) {
            super(aVar);
            this.f1615b = z;
        }

        @Override // p000a.C0430Xe.b
        /* JADX INFO: renamed from: a */
        public final boolean mo1075a() {
            return this.f1615b;
        }
    }

    static {
        a aVar = a.f1613a;
        f1611c = new c(aVar, false);
        f1612d = new c(aVar, true);
    }
}
