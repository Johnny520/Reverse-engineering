package p222p;

import android.view.View;
import java.util.WeakHashMap;
import p085fg.InterfaceC1231l;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p117i0.C1851l;
import p174m.C2576b;
import p293u2.EnumC4243m;
import p308v1.InterfaceC4418p0;
import p357y1.AbstractC5891i0;

/* JADX INFO: renamed from: p.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3205c implements InterfaceC3217g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10242a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [p.d.<clinit>():void, p.j.<clinit>():void] */
    public /* synthetic */ C3205c(int i9) {
        this.f10242a = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final C3202b m6866c(int i9, String str) {
        WeakHashMap weakHashMap = C3255s1.f10360v;
        return new C3202b(i9, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final C3243o1 m6867d(int i9, String str) {
        WeakHashMap weakHashMap = C3255s1.f10360v;
        return new C3243o1(new C3230k0(0, 0, 0, 0), str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static C3255s1 m6868e(C1836h0 c1836h0) {
        View view = (View) c1836h0.m4542j(AbstractC5891i0.f23950f);
        C3255s1 c3255s1M6869f = m6869f(view);
        boolean zM4538h = c1836h0.m4538h(c3255s1M6869f) | c1836h0.m4538h(view);
        Object objM4514P = c1836h0.m4514P();
        if (zM4538h || objM4514P == C1851l.f6155a) {
            objM4514P = new C2576b(c3255s1M6869f, 7, view);
            c1836h0.m4545k0(objM4514P);
        }
        AbstractC1874r.m4621c(c3255s1M6869f, (InterfaceC1231l) objM4514P, c1836h0);
        return c3255s1M6869f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static C3255s1 m6869f(View view) {
        C3255s1 c3255s1;
        WeakHashMap weakHashMap = C3255s1.f10360v;
        synchronized (weakHashMap) {
            try {
                Object c3255s12 = weakHashMap.get(view);
                if (c3255s12 == null) {
                    c3255s12 = new C3255s1(view);
                    weakHashMap.put(view, c3255s12);
                }
                c3255s1 = (C3255s1) c3255s12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c3255s1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.InterfaceC3217g
    /* JADX INFO: renamed from: b */
    public void mo6870b(InterfaceC4418p0 interfaceC4418p0, int i9, int[] iArr, EnumC4243m enumC4243m, int[] iArr2) {
        switch (this.f10242a) {
            case 0:
                AbstractC3226j.m6916b(iArr, iArr2, false);
                break;
            case 1:
                AbstractC3226j.m6917c(i9, iArr, iArr2, false);
                break;
            case 2:
                if (enumC4243m != EnumC4243m.f13919g) {
                    AbstractC3226j.m6916b(iArr, iArr2, true);
                } else {
                    AbstractC3226j.m6917c(i9, iArr, iArr2, false);
                }
                break;
            default:
                if (enumC4243m != EnumC4243m.f13919g) {
                    AbstractC3226j.m6917c(i9, iArr, iArr2, true);
                } else {
                    AbstractC3226j.m6916b(iArr, iArr2, false);
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f10242a) {
            case 0:
                return "AbsoluteArrangement#Left";
            case 1:
                return "AbsoluteArrangement#Right";
            case 2:
                return "Arrangement#End";
            case 3:
                return "Arrangement#Start";
            default:
                return super.toString();
        }
    }
}
