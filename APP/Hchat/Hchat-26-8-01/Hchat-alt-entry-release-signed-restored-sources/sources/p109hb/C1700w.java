package p109hb;

import android.app.Activity;
import java.util.Calendar;
import java.util.List;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p014b.C0126e;
import p036c9.C0423c0;
import p085fg.InterfaceC1231l;
import p116i.C1739c;
import p116i.C1759i1;
import p117i0.C1833g1;
import p144k.C2209s1;
import p222p.C3207c1;
import p222p.C3256t;
import p222p.C3267x;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p276sf.C3958e;
import p276sf.C3967n;
import p293u2.EnumC4243m;
import p308v1.AbstractC4374a1;
import p308v1.AbstractC4377b1;
import p308v1.InterfaceC4418p0;
import p332wb.C5130n3;
import p332wb.C5491y2;
import p332wb.EnumC5092lv;
import p348xb.C5763i;

/* JADX INFO: renamed from: hb.w */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1700w implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5665g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f5666h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f5667i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f5668j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f5669k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f5670l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1700w(int i9, Activity activity, C0126e c0126e, C1684i0 c1684i0, List list) {
        this.f5667i = c1684i0;
        this.f5668j = activity;
        this.f5669k = list;
        this.f5666h = i9;
        this.f5670l = c0126e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f5665g) {
            case 0:
                C1684i0 c1684i0 = (C1684i0) this.f5667i;
                Activity activity = (Activity) this.f5668j;
                List list = (List) this.f5669k;
                C0126e c0126e = (C0126e) this.f5670l;
                List list2 = (List) obj;
                list2.getClass();
                Calendar calendar = Calendar.getInstance();
                calendar.add(12, 5);
                long timeInMillis = calendar.getTimeInMillis();
                C0423c0 c0423c0 = new C0423c0(c1684i0, activity, list, list2, this.f5666h, c0126e, 1);
                c1684i0.getClass();
                C5491y2.m9799Q1(activity, "选择重复方式", HttpUrl.FRAGMENT_ENCODE_SET, AbstractC0000a.m101y0(new C3958e("单次", HttpUrl.FRAGMENT_ENCODE_SET), new C3958e("每天", HttpUrl.FRAGMENT_ENCODE_SET), new C3958e("每周", HttpUrl.FRAGMENT_ENCODE_SET)), new C1672c0(c0423c0, c1684i0, activity, timeInMillis), new C2209s1(7), EnumC5092lv.f18824j);
                break;
            case 1:
                AbstractC4377b1[] abstractC4377b1Arr = (AbstractC4377b1[]) this.f5667i;
                C3256t c3256t = (C3256t) this.f5668j;
                InterfaceC4418p0 interfaceC4418p0 = (InterfaceC4418p0) this.f5669k;
                int[] iArr = (int[]) this.f5670l;
                AbstractC4374a1 abstractC4374a1 = (AbstractC4374a1) obj;
                int length = abstractC4377b1Arr.length;
                int i9 = 0;
                int i10 = 0;
                while (i9 < length) {
                    AbstractC4377b1 abstractC4377b1 = abstractC4377b1Arr[i9];
                    int i11 = i10 + 1;
                    abstractC4377b1.getClass();
                    Object objMo8824X = abstractC4377b1.mo8824X();
                    C3207c1 c3207c1 = objMo8824X instanceof C3207c1 ? (C3207c1) objMo8824X : null;
                    EnumC4243m layoutDirection = interfaceC4418p0.getLayoutDirection();
                    C3267x c3267x = c3207c1 != null ? c3207c1.f10245c : null;
                    int i12 = this.f5666h;
                    abstractC4374a1.m8816A(abstractC4377b1, c3267x != null ? c3267x.f10409a.m10546a(abstractC4377b1.f14593g, i12) : c3256t.f10383b.m10545a(abstractC4377b1.f14593g, i12, layoutDirection), iArr[i10], 0.0f);
                    i9++;
                    i10 = i11;
                }
                return C3967n.f12976a;
            default:
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f5667i;
                InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f5668j;
                C1833g1 c1833g1 = (C1833g1) this.f5669k;
                C1739c c1739c = (C1739c) this.f5670l;
                C5763i c5763i = (C5763i) obj;
                c5763i.getClass();
                int iRound = Math.round(c5763i.m10456b());
                int i13 = this.f5666h - 1;
                if (iRound < 0) {
                    iRound = 0;
                }
                if (iRound <= i13) {
                    i13 = iRound;
                }
                c1833g1.m4493h(i13);
                interfaceC1231l.invoke(Integer.valueOf(i13));
                AbstractC3603v.m7563q(c5763i.f23450a, null, new C1759i1(c5763i, i13, null), 3);
                AbstractC3603v.m7563q(interfaceC3599t, null, new C5130n3(c1739c, null, 0), 3);
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C1700w(int i9, InterfaceC1231l interfaceC1231l, InterfaceC3599t interfaceC3599t, C1833g1 c1833g1, C1739c c1739c) {
        this.f5666h = i9;
        this.f5667i = interfaceC1231l;
        this.f5668j = interfaceC3599t;
        this.f5669k = c1833g1;
        this.f5670l = c1739c;
    }

    public /* synthetic */ C1700w(AbstractC4377b1[] abstractC4377b1Arr, C3256t c3256t, int i9, InterfaceC4418p0 interfaceC4418p0, int[] iArr) {
        this.f5667i = abstractC4377b1Arr;
        this.f5668j = c3256t;
        this.f5666h = i9;
        this.f5669k = interfaceC4418p0;
        this.f5670l = iArr;
    }
}
