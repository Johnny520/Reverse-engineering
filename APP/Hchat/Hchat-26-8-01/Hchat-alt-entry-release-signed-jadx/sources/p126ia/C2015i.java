package p126ia;

import android.app.Activity;
import java.util.ArrayList;
import p020b5.C0184c;
import p085fg.InterfaceC1231l;
import p230p8.C3360l;
import p276sf.C3967n;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: ia.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2015i implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f6796g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C3360l f6797h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C2023q f6798i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f6799j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Activity f6800k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2015i(int i9, Activity activity, C2023q c2023q, C3360l c3360l) {
        this.f6796g = 1;
        this.f6797h = c3360l;
        this.f6798i = c2023q;
        this.f6799j = i9;
        this.f6800k = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        C3360l c3360l;
        String str;
        switch (this.f6796g) {
            case 0:
                long jLongValue = ((Long) obj).longValue();
                C2023q c2023q = this.f6798i;
                C0184c c0184c = c2023q.f6841a;
                C3360l c3360l2 = this.f6797h;
                String str2 = c3360l2.f10844a;
                if (str2 != null) {
                    C2009c c2009cM815l = c0184c.m815l(str2);
                    ArrayList arrayListM8409R1 = AbstractC4166m.m8409R1(c2009cM815l.f6779b);
                    int i9 = this.f6799j;
                    C2008b c2008b = (C2008b) AbstractC4166m.m8425w1(i9, arrayListM8409R1);
                    if (c2008b != null) {
                        arrayListM8409R1.set(i9, C2008b.m4960a(c2008b, null, null, null, jLongValue, 15));
                        c0184c.m799Q(str2, arrayListM8409R1);
                        C2007a0 c2007a0 = c2023q.f6842b;
                        Activity activity = this.f6800k;
                        c2007a0.m4947a(activity, c3360l2, c2009cM815l);
                        c2023q.m4980g(activity, c3360l2);
                    }
                }
                break;
            case 1:
                C2023q c2023q2 = this.f6798i;
                C0184c c0184c2 = c2023q2.f6841a;
                if (((Boolean) obj).booleanValue() && (str = (c3360l = this.f6797h).f10844a) != null) {
                    C2009c c2009cM815l2 = c0184c2.m815l(str);
                    ArrayList arrayListM8409R12 = AbstractC4166m.m8409R1(c2009cM815l2.f6779b);
                    int i10 = this.f6799j;
                    if (i10 >= 0 && i10 < arrayListM8409R12.size()) {
                        arrayListM8409R12.remove(i10);
                    }
                    c0184c2.m799Q(str, arrayListM8409R12);
                    C2007a0 c2007a02 = c2023q2.f6842b;
                    Activity activity2 = this.f6800k;
                    c2007a02.m4947a(activity2, c3360l, c2009cM815l2);
                    c2023q2.m4980g(activity2, c3360l);
                }
                break;
            default:
                String str3 = (String) obj;
                str3.getClass();
                C2023q c2023q3 = this.f6798i;
                C0184c c0184c3 = c2023q3.f6841a;
                C3360l c3360l3 = this.f6797h;
                String str4 = c3360l3.f10844a;
                if (str4 != null) {
                    C2009c c2009cM815l3 = c0184c3.m815l(str4);
                    ArrayList arrayListM8409R13 = AbstractC4166m.m8409R1(c2009cM815l3.f6779b);
                    int i11 = this.f6799j;
                    C2008b c2008b2 = (C2008b) AbstractC4166m.m8425w1(i11, arrayListM8409R13);
                    if (c2008b2 != null) {
                        arrayListM8409R13.set(i11, C2008b.m4960a(c2008b2, null, null, str3, 0L, 23));
                        c0184c3.m799Q(str4, arrayListM8409R13);
                        C2007a0 c2007a03 = c2023q3.f6842b;
                        Activity activity3 = this.f6800k;
                        c2007a03.m4947a(activity3, c3360l3, c2009cM815l3);
                        c2023q3.m4980g(activity3, c3360l3);
                    }
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C2015i(C2023q c2023q, Activity activity, C3360l c3360l, int i9, int i10) {
        this.f6796g = i10;
        this.f6798i = c2023q;
        this.f6800k = activity;
        this.f6797h = c3360l;
        this.f6799j = i9;
    }
}
