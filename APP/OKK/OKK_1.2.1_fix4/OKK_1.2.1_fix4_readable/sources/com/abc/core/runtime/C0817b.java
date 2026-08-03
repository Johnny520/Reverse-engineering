package com.abc.core.runtime;

import p007D0.InterfaceC0135a;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: f0.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0817b implements InterfaceC0135a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2967a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DialogC0823e f2968b;

    public /* synthetic */ C0817b(DialogC0823e dialogC0823e, int i2) {
        this.f2967a = i2;
        this.f2968b = dialogC0823e;
    }

    /* JADX INFO: renamed from: a */
    public final void m2126a(Integer num, Integer num2, final String str) {
        int i2 = this.f2967a;
        final int iIntValue = num.intValue();
        final int iIntValue2 = num2.intValue();
        switch (i2) {
            case 0:
                final DialogC0823e dialogC0823e = this.f2968b;
                AbstractC0307g.m703e(dialogC0823e, "$progress");
                AbstractC0307g.m703e(str, "title");
                final int i3 = 0;
                HookDiagnostics.f3001b.post(new Runnable() { // from class: f0.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                DialogC0823e dialogC0823e2 = dialogC0823e;
                                AbstractC0307g.m703e(dialogC0823e2, "$progress");
                                String str2 = str;
                                AbstractC0307g.m703e(str2, "$title");
                                dialogC0823e2.m2134d(iIntValue, iIntValue2, str2);
                                break;
                            default:
                                DialogC0823e dialogC0823e3 = dialogC0823e;
                                AbstractC0307g.m703e(dialogC0823e3, "$progress");
                                String str3 = str;
                                AbstractC0307g.m703e(str3, "$title");
                                dialogC0823e3.m2134d(iIntValue, iIntValue2, str3);
                                break;
                        }
                    }
                });
                break;
            default:
                final DialogC0823e dialogC0823e2 = this.f2968b;
                AbstractC0307g.m703e(dialogC0823e2, "$progress");
                AbstractC0307g.m703e(str, "title");
                final int i4 = 1;
                HookDiagnostics.f3001b.post(new Runnable() { // from class: f0.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i4) {
                            case 0:
                                DialogC0823e dialogC0823e22 = dialogC0823e2;
                                AbstractC0307g.m703e(dialogC0823e22, "$progress");
                                String str2 = str;
                                AbstractC0307g.m703e(str2, "$title");
                                dialogC0823e22.m2134d(iIntValue, iIntValue2, str2);
                                break;
                            default:
                                DialogC0823e dialogC0823e3 = dialogC0823e2;
                                AbstractC0307g.m703e(dialogC0823e3, "$progress");
                                String str3 = str;
                                AbstractC0307g.m703e(str3, "$title");
                                dialogC0823e3.m2134d(iIntValue, iIntValue2, str3);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
