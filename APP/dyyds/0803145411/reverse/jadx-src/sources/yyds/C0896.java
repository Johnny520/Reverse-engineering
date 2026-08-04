package yyds;

/* JADX INFO: renamed from: yyds.ᛴᛷᛷᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0896 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final /* synthetic */ EnumC2591[] f4089;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public C0682 f4090;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public int f4091;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public InterfaceC2684 f4092;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ C0682 f4093;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public EnumC2591[] f4094;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public int f4095;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public int f4096;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public int f4097;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2684 f4098;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0896(EnumC2591[] enumC2591Arr, C0682 c0682, InterfaceC2684 interfaceC2684, InterfaceC0274 interfaceC0274) {
        super(2, interfaceC0274);
        this.f4089 = enumC2591Arr;
        this.f4093 = c0682;
        this.f4098 = interfaceC2684;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        if (r7.m1593(r6, r12, r11) == r10) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0072 -> B:27:0x0073). Please report as a decompilation issue!!! */
    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo474(Object obj) throws Throwable {
        int length;
        int i;
        InterfaceC2684 interfaceC2684;
        EnumC2591[] enumC2591Arr;
        int i2;
        C0682 c0682;
        int i3 = this.f4091;
        if (i3 == 0) {
            AbstractC1544.m3189(obj);
            EnumC2591[] enumC2591Arr2 = this.f4089;
            length = enumC2591Arr2.length;
            i = 0;
            C0682 c06822 = this.f4093;
            interfaceC2684 = this.f4098;
            enumC2591Arr = enumC2591Arr2;
            i2 = 0;
            c0682 = c06822;
            if (i >= length) {
            }
        } else {
            if (i3 != 1 && i3 != 2) {
                C0188.m800("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            length = this.f4096;
            i = this.f4095;
            int i4 = this.f4097;
            interfaceC2684 = this.f4092;
            c0682 = this.f4090;
            enumC2591Arr = this.f4094;
            AbstractC1544.m3189(obj);
            i2 = i4;
            i++;
            if (i >= length) {
                int i5 = i2 + 1;
                int iOrdinal = enumC2591Arr[i].ordinal();
                if (iOrdinal != 0) {
                    EnumC1765 enumC1765 = EnumC1765.f8858;
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            C0188.m801();
                            return null;
                        }
                        this.f4094 = enumC2591Arr;
                        this.f4090 = c0682;
                        this.f4092 = interfaceC2684;
                        this.f4097 = i5;
                        this.f4095 = i;
                        this.f4096 = length;
                        this.f4091 = 2;
                        if (c0682.m1588(interfaceC2684, i2, this) != enumC1765) {
                            i4 = i5;
                            i2 = i4;
                        }
                        return enumC1765;
                    }
                    this.f4094 = enumC2591Arr;
                    this.f4090 = c0682;
                    this.f4092 = interfaceC2684;
                    this.f4097 = i5;
                    this.f4095 = i;
                    this.f4096 = length;
                    this.f4091 = 1;
                    i++;
                    if (i >= length) {
                        return C2746.f13459;
                    }
                } else {
                    i2 = i5;
                    i++;
                    if (i >= length) {
                    }
                }
            }
        }
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        return new C0896(this.f4089, this.f4093, this.f4098, interfaceC0274);
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) {
        return ((C0896) mo630((C0236) obj, (InterfaceC0274) obj2)).mo474(C2746.f13459);
    }
}
