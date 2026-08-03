package p000;

/* JADX INFO: renamed from: dG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1319dG implements InterfaceC1416fj {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4780a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object[] f4781b;

    public /* synthetic */ C1319dG(Object[] objArr, int i) {
        this.f4780a = i;
        this.f4781b = objArr;
    }

    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object obj) {
        Class[] clsArr = (Class[]) obj;
        switch (this.f4780a) {
            case 0:
                AbstractC0295Gu.m625r(-578390360848437L);
                int length = clsArr.length;
                Object[] objArr = this.f4781b;
                boolean z = false;
                if (length == objArr.length) {
                    int length2 = objArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length2) {
                            z = true;
                        } else {
                            Object obj2 = objArr[i];
                            if (obj2 != null) {
                                if (!(obj2 instanceof Class ? ((Class) obj2).getName() : (String) obj2).equals(clsArr[i].getName())) {
                                }
                            }
                            i++;
                        }
                    }
                }
                return Boolean.valueOf(z);
            default:
                AbstractC0295Gu.m625r(-576869942425653L);
                int length3 = clsArr.length;
                Object[] objArr2 = this.f4781b;
                boolean z2 = false;
                if (length3 == objArr2.length) {
                    int length4 = objArr2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length4) {
                            z2 = true;
                        } else {
                            Object obj3 = objArr2[i2];
                            if (obj3 != null) {
                                if (!(obj3 instanceof Class ? ((Class) obj3).getName() : (String) obj3).equals(clsArr[i2].getName())) {
                                }
                            }
                            i2++;
                        }
                    }
                }
                return Boolean.valueOf(z2);
        }
    }
}
