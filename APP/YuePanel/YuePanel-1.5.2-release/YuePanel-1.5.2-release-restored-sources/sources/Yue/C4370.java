package Yue;

import Yue.C3526;
import Yue.C4128;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۨۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4370 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final boolean f8943 = true;

    /* JADX INFO: renamed from: ۥ */
    public C4129 f844;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public C4129 f8945;

    /* JADX INFO: renamed from: ۥ۟ */
    public boolean f845 = true;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean f8944 = true;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public ArrayList<AbstractC8432> f8946 = new ArrayList<>();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public ArrayList<C7189> f8947 = new ArrayList<>();

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public C3526.InterfaceC0170 f8948 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public C3526.C0169 f8949 = new C3526.C0169();

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public ArrayList<C7189> f8950 = new ArrayList<>();

    public C4370(C4129 c4129) {
        this.f844 = c4129;
        this.f8945 = c4129;
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m1328(C4371 c4371, int i, int i2, C4371 c43712, ArrayList<C7189> arrayList, C7189 c7189) {
        AbstractC8432 abstractC8432 = c4371.f8952;
        if (abstractC8432.f25270 == null) {
            C4129 c4129 = this.f844;
            if (abstractC8432 == c4129.f8355 || abstractC8432 == c4129.f8356) {
                return;
            }
            if (c7189 == null) {
                c7189 = new C7189(abstractC8432, i2);
                arrayList.add(c7189);
            }
            abstractC8432.f25270 = c7189;
            c7189.m3481(abstractC8432);
            for (InterfaceC4369 interfaceC4369 : abstractC8432.f25275.f8959) {
                if (interfaceC4369 instanceof C4371) {
                    m1328((C4371) interfaceC4369, i, 0, c43712, arrayList, c7189);
                }
            }
            for (InterfaceC4369 interfaceC43692 : abstractC8432.f25276.f8959) {
                if (interfaceC43692 instanceof C4371) {
                    m1328((C4371) interfaceC43692, i, 1, c43712, arrayList, c7189);
                }
            }
            if (i == 1 && (abstractC8432 instanceof C8184)) {
                for (InterfaceC4369 interfaceC43693 : ((C8184) abstractC8432).f24350.f8959) {
                    if (interfaceC43693 instanceof C4371) {
                        m1328((C4371) interfaceC43693, i, 2, c43712, arrayList, c7189);
                    }
                }
            }
            for (C4371 c43713 : abstractC8432.f25275.f8960) {
                if (c43713 == c43712) {
                    c7189.f2732 = true;
                }
                m1328(c43713, i, 0, c43712, arrayList, c7189);
            }
            for (C4371 c43714 : abstractC8432.f25276.f8960) {
                if (c43714 == c43712) {
                    c7189.f2732 = true;
                }
                m1328(c43714, i, 1, c43712, arrayList, c7189);
            }
            if (i == 1 && (abstractC8432 instanceof C8184)) {
                Iterator<C4371> it = ((C8184) abstractC8432).f24350.f8960.iterator();
                while (it.hasNext()) {
                    m1328(it.next(), i, 2, c43712, arrayList, c7189);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean m1329(C4129 c4129) {
        int iM11891;
        C4128.EnumC0339 enumC0339;
        int iM11859;
        C4128.EnumC0339 enumC03392;
        C4128.EnumC0339[] enumC0339Arr;
        C4128.EnumC0339 enumC03393;
        C4128.EnumC0339 enumC03394;
        C4128.EnumC0339 enumC03395;
        C4128.EnumC0339 enumC03396;
        for (C4128 c4128 : c4129.f25257) {
            C4128.EnumC0339[] enumC0339Arr2 = c4128.f8397;
            C4128.EnumC0339 enumC03397 = enumC0339Arr2[0];
            C4128.EnumC0339 enumC03398 = enumC0339Arr2[1];
            if (c4128.m11890() == 8) {
                c4128.f704 = true;
            } else {
                if (c4128.f8371 < 1.0f && enumC03397 == C4128.EnumC0339.MATCH_CONSTRAINT) {
                    c4128.f8366 = 2;
                }
                if (c4128.f8374 < 1.0f && enumC03398 == C4128.EnumC0339.MATCH_CONSTRAINT) {
                    c4128.f8367 = 2;
                }
                if (c4128.m11856() > 0.0f) {
                    C4128.EnumC0339 enumC03399 = C4128.EnumC0339.MATCH_CONSTRAINT;
                    if (enumC03397 == enumC03399 && (enumC03398 == C4128.EnumC0339.WRAP_CONTENT || enumC03398 == C4128.EnumC0339.FIXED)) {
                        c4128.f8366 = 3;
                    } else if (enumC03398 == enumC03399 && (enumC03397 == C4128.EnumC0339.WRAP_CONTENT || enumC03397 == C4128.EnumC0339.FIXED)) {
                        c4128.f8367 = 3;
                    } else if (enumC03397 == enumC03399 && enumC03398 == enumC03399) {
                        if (c4128.f8366 == 0) {
                            c4128.f8366 = 3;
                        }
                        if (c4128.f8367 == 0) {
                            c4128.f8367 = 3;
                        }
                    }
                }
                C4128.EnumC0339 enumC033910 = C4128.EnumC0339.MATCH_CONSTRAINT;
                if (enumC03397 == enumC033910 && c4128.f8366 == 1 && (c4128.f8386.f8275 == null || c4128.f8388.f8275 == null)) {
                    enumC03397 = C4128.EnumC0339.WRAP_CONTENT;
                }
                C4128.EnumC0339 enumC033911 = enumC03397;
                if (enumC03398 == enumC033910 && c4128.f8367 == 1 && (c4128.f8387.f8275 == null || c4128.f8389.f8275 == null)) {
                    enumC03398 = C4128.EnumC0339.WRAP_CONTENT;
                }
                C4128.EnumC0339 enumC033912 = enumC03398;
                C5316 c5316 = c4128.f8355;
                c5316.f25271 = enumC033911;
                int i = c4128.f8366;
                c5316.f3496 = i;
                C8184 c8184 = c4128.f8356;
                c8184.f25271 = enumC033912;
                int i2 = c4128.f8367;
                c8184.f3496 = i2;
                C4128.EnumC0339 enumC033913 = C4128.EnumC0339.MATCH_PARENT;
                if ((enumC033911 == enumC033913 || enumC033911 == C4128.EnumC0339.FIXED || enumC033911 == C4128.EnumC0339.WRAP_CONTENT) && (enumC033912 == enumC033913 || enumC033912 == C4128.EnumC0339.FIXED || enumC033912 == C4128.EnumC0339.WRAP_CONTENT)) {
                    int iM118912 = c4128.m11891();
                    if (enumC033911 == enumC033913) {
                        iM11891 = (c4129.m11891() - c4128.f8386.f8276) - c4128.f8388.f8276;
                        enumC0339 = C4128.EnumC0339.FIXED;
                    } else {
                        iM11891 = iM118912;
                        enumC0339 = enumC033911;
                    }
                    int iM118592 = c4128.m11859();
                    if (enumC033912 == enumC033913) {
                        iM11859 = (c4129.m11859() - c4128.f8387.f8276) - c4128.f8389.f8276;
                        enumC03392 = C4128.EnumC0339.FIXED;
                    } else {
                        iM11859 = iM118592;
                        enumC03392 = enumC033912;
                    }
                    m12654(c4128, enumC0339, iM11891, enumC03392, iM11859);
                    c4128.f8355.f25272.mo12660(c4128.m11891());
                    c4128.f8356.f25272.mo12660(c4128.m11859());
                    c4128.f704 = true;
                } else {
                    if (enumC033911 == enumC033910 && (enumC033912 == (enumC03396 = C4128.EnumC0339.WRAP_CONTENT) || enumC033912 == C4128.EnumC0339.FIXED)) {
                        if (i == 3) {
                            if (enumC033912 == enumC03396) {
                                m12654(c4128, enumC03396, 0, enumC03396, 0);
                            }
                            int iM118593 = c4128.m11859();
                            int i3 = (int) ((iM118593 * c4128.f8401) + 0.5f);
                            C4128.EnumC0339 enumC033914 = C4128.EnumC0339.FIXED;
                            m12654(c4128, enumC033914, i3, enumC033914, iM118593);
                            c4128.f8355.f25272.mo12660(c4128.m11891());
                            c4128.f8356.f25272.mo12660(c4128.m11859());
                            c4128.f704 = true;
                        } else if (i == 1) {
                            m12654(c4128, enumC03396, 0, enumC033912, 0);
                            c4128.f8355.f25272.f9074 = c4128.m11891();
                        } else if (i == 2) {
                            C4128.EnumC0339 enumC033915 = c4129.f8397[0];
                            C4128.EnumC0339 enumC033916 = C4128.EnumC0339.FIXED;
                            if (enumC033915 == enumC033916 || enumC033915 == enumC033913) {
                                m12654(c4128, enumC033916, (int) ((c4128.f8371 * c4129.m11891()) + 0.5f), enumC033912, c4128.m11859());
                                c4128.f8355.f25272.mo12660(c4128.m11891());
                                c4128.f8356.f25272.mo12660(c4128.m11859());
                                c4128.f704 = true;
                            }
                        } else {
                            C4125[] c4125Arr = c4128.f8394;
                            if (c4125Arr[0].f8275 == null || c4125Arr[1].f8275 == null) {
                                m12654(c4128, enumC03396, 0, enumC033912, 0);
                                c4128.f8355.f25272.mo12660(c4128.m11891());
                                c4128.f8356.f25272.mo12660(c4128.m11859());
                                c4128.f704 = true;
                            }
                        }
                    }
                    if (enumC033912 == enumC033910 && (enumC033911 == (enumC03395 = C4128.EnumC0339.WRAP_CONTENT) || enumC033911 == C4128.EnumC0339.FIXED)) {
                        if (i2 == 3) {
                            if (enumC033911 == enumC03395) {
                                m12654(c4128, enumC03395, 0, enumC03395, 0);
                            }
                            int iM118913 = c4128.m11891();
                            float f = c4128.f8401;
                            if (c4128.m11857() == -1) {
                                f = 1.0f / f;
                            }
                            C4128.EnumC0339 enumC033917 = C4128.EnumC0339.FIXED;
                            m12654(c4128, enumC033917, iM118913, enumC033917, (int) ((iM118913 * f) + 0.5f));
                            c4128.f8355.f25272.mo12660(c4128.m11891());
                            c4128.f8356.f25272.mo12660(c4128.m11859());
                            c4128.f704 = true;
                        } else if (i2 == 1) {
                            m12654(c4128, enumC033911, 0, enumC03395, 0);
                            c4128.f8356.f25272.f9074 = c4128.m11859();
                        } else if (i2 == 2) {
                            C4128.EnumC0339 enumC033918 = c4129.f8397[1];
                            C4128.EnumC0339 enumC033919 = C4128.EnumC0339.FIXED;
                            if (enumC033918 == enumC033919 || enumC033918 == enumC033913) {
                                m12654(c4128, enumC033911, c4128.m11891(), enumC033919, (int) ((c4128.f8374 * c4129.m11859()) + 0.5f));
                                c4128.f8355.f25272.mo12660(c4128.m11891());
                                c4128.f8356.f25272.mo12660(c4128.m11859());
                                c4128.f704 = true;
                            }
                        } else {
                            C4125[] c4125Arr2 = c4128.f8394;
                            if (c4125Arr2[2].f8275 == null || c4125Arr2[3].f8275 == null) {
                                m12654(c4128, enumC03395, 0, enumC033912, 0);
                                c4128.f8355.f25272.mo12660(c4128.m11891());
                                c4128.f8356.f25272.mo12660(c4128.m11859());
                                c4128.f704 = true;
                            }
                        }
                    }
                    if (enumC033911 == enumC033910 && enumC033912 == enumC033910) {
                        if (i == 1 || i2 == 1) {
                            C4128.EnumC0339 enumC033920 = C4128.EnumC0339.WRAP_CONTENT;
                            m12654(c4128, enumC033920, 0, enumC033920, 0);
                            c4128.f8355.f25272.f9074 = c4128.m11891();
                            c4128.f8356.f25272.f9074 = c4128.m11859();
                        } else if (i2 == 2 && i == 2 && ((enumC03393 = (enumC0339Arr = c4129.f8397)[0]) == (enumC03394 = C4128.EnumC0339.FIXED) || enumC03393 == enumC03394)) {
                            C4128.EnumC0339 enumC033921 = enumC0339Arr[1];
                            if (enumC033921 == enumC03394 || enumC033921 == enumC03394) {
                                m12654(c4128, enumC03394, (int) ((c4128.f8371 * c4129.m11891()) + 0.5f), enumC03394, (int) ((c4128.f8374 * c4129.m11859()) + 0.5f));
                                c4128.f8355.f25272.mo12660(c4128.m11891());
                                c4128.f8356.f25272.mo12660(c4128.m11859());
                                c4128.f704 = true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m12639() {
        m12640(this.f8946);
        this.f8950.clear();
        C7189.f21696 = 0;
        m12647(this.f844.f8355, 0, this.f8950);
        m12647(this.f844.f8356, 1, this.f8950);
        this.f845 = false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m12640(ArrayList<AbstractC8432> arrayList) {
        arrayList.clear();
        this.f8945.f8355.mo10132();
        this.f8945.f8356.mo10132();
        arrayList.add(this.f8945.f8355);
        arrayList.add(this.f8945.f8356);
        HashSet hashSet = null;
        for (C4128 c4128 : this.f8945.f25257) {
            if (c4128 instanceof C5226) {
                arrayList.add(new C5227(c4128));
            } else {
                if (c4128.m11900()) {
                    if (c4128.f8353 == null) {
                        c4128.f8353 = new C3692(c4128, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c4128.f8353);
                } else {
                    arrayList.add(c4128.f8355);
                }
                if (c4128.m11902()) {
                    if (c4128.f8354 == null) {
                        c4128.f8354 = new C3692(c4128, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c4128.f8354);
                } else {
                    arrayList.add(c4128.f8356);
                }
                if (c4128 instanceof C5281) {
                    arrayList.add(new C5280(c4128));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<AbstractC8432> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().mo10132();
        }
        for (AbstractC8432 abstractC8432 : arrayList) {
            if (abstractC8432.f3497 != this.f8945) {
                abstractC8432.mo10130();
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final int m12641(C4129 c4129, int i) {
        int size = this.f8950.size();
        long jMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            jMax = Math.max(jMax, this.f8950.get(i2).m3482(c4129, i));
        }
        return (int) jMax;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m12642(C4128.EnumC0339 enumC0339, C4128.EnumC0339 enumC03392) {
        if (this.f845) {
            m12639();
            boolean z = false;
            for (C4128 c4128 : this.f844.f25257) {
                boolean[] zArr = c4128.f8357;
                zArr[0] = true;
                zArr[1] = true;
                if (c4128 instanceof C3507) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            for (C7189 c7189 : this.f8950) {
                C4128.EnumC0339 enumC03393 = C4128.EnumC0339.WRAP_CONTENT;
                c7189.m22522(enumC0339 == enumC03393, enumC03392 == enumC03393);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean m12643(boolean z) {
        boolean z2;
        boolean z3 = false;
        if (this.f845 || this.f8944) {
            for (C4128 c4128 : this.f844.f25257) {
                c4128.m11846();
                c4128.f704 = false;
                c4128.f8355.mo10134();
                c4128.f8356.mo10134();
            }
            this.f844.m11846();
            C4129 c4129 = this.f844;
            c4129.f704 = false;
            c4129.f8355.mo10134();
            this.f844.f8356.mo10134();
            this.f8944 = false;
        }
        if (m1329(this.f8945)) {
            return false;
        }
        this.f844.m11967(0);
        this.f844.m11968(0);
        C4128.EnumC0339 enumC0339M11855 = this.f844.m11855(0);
        C4128.EnumC0339 enumC0339M118552 = this.f844.m11855(1);
        if (this.f845) {
            m12639();
        }
        int iM11892 = this.f844.m11892();
        int iM11893 = this.f844.m11893();
        this.f844.f8355.f25275.mo12660(iM11892);
        this.f844.f8356.f25275.mo12660(iM11893);
        m12655();
        C4128.EnumC0339 enumC0339 = C4128.EnumC0339.WRAP_CONTENT;
        if (enumC0339M11855 == enumC0339 || enumC0339M118552 == enumC0339) {
            if (z) {
                Iterator<AbstractC8432> it = this.f8946.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!it.next().mo10135()) {
                        z = false;
                        break;
                    }
                }
            }
            if (z && enumC0339M11855 == C4128.EnumC0339.WRAP_CONTENT) {
                this.f844.m11940(C4128.EnumC0339.FIXED);
                C4129 c41292 = this.f844;
                c41292.m11965(m12641(c41292, 0));
                C4129 c41293 = this.f844;
                c41293.f8355.f25272.mo12660(c41293.m11891());
            }
            if (z && enumC0339M118552 == C4128.EnumC0339.WRAP_CONTENT) {
                this.f844.m11961(C4128.EnumC0339.FIXED);
                C4129 c41294 = this.f844;
                c41294.m11935(m12641(c41294, 1));
                C4129 c41295 = this.f844;
                c41295.f8356.f25272.mo12660(c41295.m11859());
            }
        }
        C4129 c41296 = this.f844;
        C4128.EnumC0339 enumC03392 = c41296.f8397[0];
        C4128.EnumC0339 enumC03393 = C4128.EnumC0339.FIXED;
        if (enumC03392 == enumC03393 || enumC03392 == C4128.EnumC0339.MATCH_PARENT) {
            int iM11891 = c41296.m11891() + iM11892;
            this.f844.f8355.f25276.mo12660(iM11891);
            this.f844.f8355.f25272.mo12660(iM11891 - iM11892);
            m12655();
            C4129 c41297 = this.f844;
            C4128.EnumC0339 enumC03394 = c41297.f8397[1];
            if (enumC03394 == enumC03393 || enumC03394 == C4128.EnumC0339.MATCH_PARENT) {
                int iM11859 = c41297.m11859() + iM11893;
                this.f844.f8356.f25276.mo12660(iM11859);
                this.f844.f8356.f25272.mo12660(iM11859 - iM11893);
            }
            m12655();
            z2 = true;
        } else {
            z2 = false;
        }
        for (AbstractC8432 abstractC8432 : this.f8946) {
            if (abstractC8432.f3497 != this.f844 || abstractC8432.f25274) {
                abstractC8432.mo10131();
            }
        }
        Iterator<AbstractC8432> it2 = this.f8946.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z3 = true;
                break;
            }
            AbstractC8432 next = it2.next();
            if (z2 || next.f3497 != this.f844) {
                if (!next.f25275.f8958 || ((!next.f25276.f8958 && !(next instanceof C5227)) || (!next.f25272.f8958 && !(next instanceof C3692) && !(next instanceof C5227)))) {
                    break;
                }
            }
        }
        this.f844.m11940(enumC0339M11855);
        this.f844.m11961(enumC0339M118552);
        return z3;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean m12644(boolean z) {
        if (this.f845) {
            for (C4128 c4128 : this.f844.f25257) {
                c4128.m11846();
                c4128.f704 = false;
                C5316 c5316 = c4128.f8355;
                c5316.f25272.f8958 = false;
                c5316.f25274 = false;
                c5316.mo10134();
                C8184 c8184 = c4128.f8356;
                c8184.f25272.f8958 = false;
                c8184.f25274 = false;
                c8184.mo10134();
            }
            this.f844.m11846();
            C4129 c4129 = this.f844;
            c4129.f704 = false;
            C5316 c53162 = c4129.f8355;
            c53162.f25272.f8958 = false;
            c53162.f25274 = false;
            c53162.mo10134();
            C8184 c81842 = this.f844.f8356;
            c81842.f25272.f8958 = false;
            c81842.f25274 = false;
            c81842.mo10134();
            m12639();
        }
        if (m1329(this.f8945)) {
            return false;
        }
        this.f844.m11967(0);
        this.f844.m11968(0);
        this.f844.f8355.f25275.mo12660(0);
        this.f844.f8356.f25275.mo12660(0);
        return true;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean m12645(boolean z, int i) {
        boolean z2;
        C4128.EnumC0339 enumC0339;
        boolean z3 = false;
        C4128.EnumC0339 enumC0339M11855 = this.f844.m11855(0);
        C4128.EnumC0339 enumC0339M118552 = this.f844.m11855(1);
        int iM11892 = this.f844.m11892();
        int iM11893 = this.f844.m11893();
        if (z && (enumC0339M11855 == (enumC0339 = C4128.EnumC0339.WRAP_CONTENT) || enumC0339M118552 == enumC0339)) {
            Iterator<AbstractC8432> it = this.f8946.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC8432 next = it.next();
                if (next.f25273 == i && !next.mo10135()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && enumC0339M11855 == C4128.EnumC0339.WRAP_CONTENT) {
                    this.f844.m11940(C4128.EnumC0339.FIXED);
                    C4129 c4129 = this.f844;
                    c4129.m11965(m12641(c4129, 0));
                    C4129 c41292 = this.f844;
                    c41292.f8355.f25272.mo12660(c41292.m11891());
                }
            } else if (z && enumC0339M118552 == C4128.EnumC0339.WRAP_CONTENT) {
                this.f844.m11961(C4128.EnumC0339.FIXED);
                C4129 c41293 = this.f844;
                c41293.m11935(m12641(c41293, 1));
                C4129 c41294 = this.f844;
                c41294.f8356.f25272.mo12660(c41294.m11859());
            }
        }
        if (i == 0) {
            C4129 c41295 = this.f844;
            C4128.EnumC0339 enumC03392 = c41295.f8397[0];
            if (enumC03392 == C4128.EnumC0339.FIXED || enumC03392 == C4128.EnumC0339.MATCH_PARENT) {
                int iM11891 = c41295.m11891() + iM11892;
                this.f844.f8355.f25276.mo12660(iM11891);
                this.f844.f8355.f25272.mo12660(iM11891 - iM11892);
                z2 = true;
            }
            z2 = false;
        } else {
            C4129 c41296 = this.f844;
            C4128.EnumC0339 enumC03393 = c41296.f8397[1];
            if (enumC03393 == C4128.EnumC0339.FIXED || enumC03393 == C4128.EnumC0339.MATCH_PARENT) {
                int iM11859 = c41296.m11859() + iM11893;
                this.f844.f8356.f25276.mo12660(iM11859);
                this.f844.f8356.f25272.mo12660(iM11859 - iM11893);
                z2 = true;
            }
            z2 = false;
        }
        m12655();
        for (AbstractC8432 abstractC8432 : this.f8946) {
            if (abstractC8432.f25273 == i && (abstractC8432.f3497 != this.f844 || abstractC8432.f25274)) {
                abstractC8432.mo10131();
            }
        }
        Iterator<AbstractC8432> it2 = this.f8946.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z3 = true;
                break;
            }
            AbstractC8432 next2 = it2.next();
            if (next2.f25273 == i && (z2 || next2.f3497 != this.f844)) {
                if (!next2.f25275.f8958 || !next2.f25276.f8958 || (!(next2 instanceof C3692) && !next2.f25272.f8958)) {
                    break;
                }
            }
        }
        this.f844.m11940(enumC0339M11855);
        this.f844.m11961(enumC0339M118552);
        return z3;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final void m12646() {
        Iterator<AbstractC8432> it = this.f8946.iterator();
        String strM12649 = "digraph {\n";
        while (it.hasNext()) {
            strM12649 = m12649(it.next(), strM12649);
        }
        String str = strM12649 + "\n}\n";
        System.out.println("content:<<\n" + str + "\n>>");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m12647(AbstractC8432 abstractC8432, int i, ArrayList<C7189> arrayList) {
        for (InterfaceC4369 interfaceC4369 : abstractC8432.f25275.f8959) {
            if (interfaceC4369 instanceof C4371) {
                m1328((C4371) interfaceC4369, i, 0, abstractC8432.f25276, arrayList, null);
            } else if (interfaceC4369 instanceof AbstractC8432) {
                m1328(((AbstractC8432) interfaceC4369).f25275, i, 0, abstractC8432.f25276, arrayList, null);
            }
        }
        for (InterfaceC4369 interfaceC43692 : abstractC8432.f25276.f8959) {
            if (interfaceC43692 instanceof C4371) {
                m1328((C4371) interfaceC43692, i, 1, abstractC8432.f25275, arrayList, null);
            } else if (interfaceC43692 instanceof AbstractC8432) {
                m1328(((AbstractC8432) interfaceC43692).f25276, i, 1, abstractC8432.f25275, arrayList, null);
            }
        }
        if (i == 1) {
            for (InterfaceC4369 interfaceC43693 : ((C8184) abstractC8432).f24350.f8959) {
                if (interfaceC43693 instanceof C4371) {
                    m1328((C4371) interfaceC43693, i, 2, null, arrayList, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final String m12648(C3692 c3692, String str) {
        int i = c3692.f25273;
        String str2 = "cluster_" + c3692.f3497.m11854();
        String str3 = "subgraph " + (i == 0 ? str2 + "_h" : str2 + "_v") + " {\n";
        String strM12649 = "";
        for (AbstractC8432 abstractC8432 : c3692.f6530) {
            String strM11854 = abstractC8432.f3497.m11854();
            str3 = str3 + (i == 0 ? strM11854 + "_HORIZONTAL" : strM11854 + "_VERTICAL") + ";\n";
            strM12649 = m12649(abstractC8432, strM12649);
        }
        return str + strM12649 + (str3 + "}\n");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final String m12649(AbstractC8432 abstractC8432, String str) {
        boolean z;
        C4371 c4371 = abstractC8432.f25275;
        C4371 c43712 = abstractC8432.f25276;
        if (!(abstractC8432 instanceof C5280) && c4371.f8959.isEmpty() && (c43712.f8959.isEmpty() && c4371.f8960.isEmpty()) && c43712.f8960.isEmpty()) {
            return str;
        }
        String str2 = str + m12656(abstractC8432);
        boolean zM12653 = m12653(c4371, c43712);
        String strM12650 = m12650(c43712, zM12653, m12650(c4371, zM12653, str2));
        boolean z2 = abstractC8432 instanceof C8184;
        if (z2) {
            strM12650 = m12650(((C8184) abstractC8432).f24350, zM12653, strM12650);
        }
        if ((abstractC8432 instanceof C5316) || (((z = abstractC8432 instanceof C3692)) && ((C3692) abstractC8432).f25273 == 0)) {
            C4128.EnumC0339 enumC0339M11863 = abstractC8432.f3497.m11863();
            if (enumC0339M11863 == C4128.EnumC0339.FIXED || enumC0339M11863 == C4128.EnumC0339.WRAP_CONTENT) {
                if (!c4371.f8960.isEmpty() && c43712.f8960.isEmpty()) {
                    strM12650 = strM12650 + ("\n" + c43712.m12659() + " -> " + c4371.m12659() + "\n");
                } else if (c4371.f8960.isEmpty() && !c43712.f8960.isEmpty()) {
                    strM12650 = strM12650 + ("\n" + c4371.m12659() + " -> " + c43712.m12659() + "\n");
                }
            } else if (enumC0339M11863 == C4128.EnumC0339.MATCH_CONSTRAINT && abstractC8432.f3497.m11856() > 0.0f) {
                abstractC8432.f3497.m11854();
            }
        } else if (z2 || (z && ((C3692) abstractC8432).f25273 == 1)) {
            C4128.EnumC0339 enumC0339M11888 = abstractC8432.f3497.m11888();
            if (enumC0339M11888 == C4128.EnumC0339.FIXED || enumC0339M11888 == C4128.EnumC0339.WRAP_CONTENT) {
                if (!c4371.f8960.isEmpty() && c43712.f8960.isEmpty()) {
                    strM12650 = strM12650 + ("\n" + c43712.m12659() + " -> " + c4371.m12659() + "\n");
                } else if (c4371.f8960.isEmpty() && !c43712.f8960.isEmpty()) {
                    strM12650 = strM12650 + ("\n" + c4371.m12659() + " -> " + c43712.m12659() + "\n");
                }
            } else if (enumC0339M11888 == C4128.EnumC0339.MATCH_CONSTRAINT && abstractC8432.f3497.m11856() > 0.0f) {
                abstractC8432.f3497.m11854();
            }
        }
        return abstractC8432 instanceof C3692 ? m12648((C3692) abstractC8432, strM12650) : strM12650;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final String m12650(C4371 c4371, boolean z, String str) {
        for (C4371 c43712 : c4371.f8960) {
            String str2 = ("\n" + c4371.m12659()) + " -> " + c43712.m12659();
            if (c4371.f8954 > 0 || z || (c4371.f8952 instanceof C5280)) {
                String str3 = str2 + "[";
                if (c4371.f8954 > 0) {
                    str3 = str3 + "label=\"" + c4371.f8954 + "\"";
                    if (z) {
                        str3 = str3 + ",";
                    }
                }
                if (z) {
                    str3 = str3 + " style=dashed ";
                }
                if (c4371.f8952 instanceof C5280) {
                    str3 = str3 + " style=bold,color=gray ";
                }
                str2 = str3 + "]";
            }
            str = str + (str2 + "\n");
        }
        return str;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m12651() {
        this.f845 = true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m12652() {
        this.f8944 = true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final boolean m12653(C4371 c4371, C4371 c43712) {
        Iterator<C4371> it = c4371.f8960.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next() != c43712) {
                i++;
            }
        }
        Iterator<C4371> it2 = c43712.f8960.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            if (it2.next() != c4371) {
                i2++;
            }
        }
        return i > 0 && i2 > 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m12654(C4128 c4128, C4128.EnumC0339 enumC0339, int i, C4128.EnumC0339 enumC03392, int i2) {
        C3526.C0169 c0169 = this.f8949;
        c0169.f363 = enumC0339;
        c0169.f364 = enumC03392;
        c0169.f5970 = i;
        c0169.f5971 = i2;
        this.f8948.mo594(c4128, c0169);
        c4128.m11965(this.f8949.f5972);
        c4128.m11935(this.f8949.f5973);
        c4128.m11934(this.f8949.f5975);
        c4128.m11917(this.f8949.f5974);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m12655() {
        C4401 c4401;
        for (C4128 c4128 : this.f844.f25257) {
            if (!c4128.f704) {
                C4128.EnumC0339[] enumC0339Arr = c4128.f8397;
                boolean z = false;
                C4128.EnumC0339 enumC0339 = enumC0339Arr[0];
                C4128.EnumC0339 enumC03392 = enumC0339Arr[1];
                int i = c4128.f8366;
                int i2 = c4128.f8367;
                C4128.EnumC0339 enumC03393 = C4128.EnumC0339.WRAP_CONTENT;
                boolean z2 = enumC0339 == enumC03393 || (enumC0339 == C4128.EnumC0339.MATCH_CONSTRAINT && i == 1);
                if (enumC03392 == enumC03393 || (enumC03392 == C4128.EnumC0339.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                C4401 c44012 = c4128.f8355.f25272;
                boolean z3 = c44012.f8958;
                C4401 c44013 = c4128.f8356.f25272;
                boolean z4 = c44013.f8958;
                if (z3 && z4) {
                    C4128.EnumC0339 enumC03394 = C4128.EnumC0339.FIXED;
                    m12654(c4128, enumC03394, c44012.f8955, enumC03394, c44013.f8955);
                    c4128.f704 = true;
                } else if (z3 && z) {
                    m12654(c4128, C4128.EnumC0339.FIXED, c44012.f8955, enumC03393, c44013.f8955);
                    if (enumC03392 == C4128.EnumC0339.MATCH_CONSTRAINT) {
                        c4128.f8356.f25272.f9074 = c4128.m11859();
                    } else {
                        c4128.f8356.f25272.mo12660(c4128.m11859());
                        c4128.f704 = true;
                    }
                } else if (z4 && z2) {
                    m12654(c4128, enumC03393, c44012.f8955, C4128.EnumC0339.FIXED, c44013.f8955);
                    if (enumC0339 == C4128.EnumC0339.MATCH_CONSTRAINT) {
                        c4128.f8355.f25272.f9074 = c4128.m11891();
                    } else {
                        c4128.f8355.f25272.mo12660(c4128.m11891());
                        c4128.f704 = true;
                    }
                }
                if (c4128.f704 && (c4401 = c4128.f8356.f24351) != null) {
                    c4401.mo12660(c4128.m11849());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final String m12656(AbstractC8432 abstractC8432) {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z = abstractC8432 instanceof C8184;
        String strM11854 = abstractC8432.f3497.m11854();
        C4128 c4128 = abstractC8432.f3497;
        C4128.EnumC0339 enumC0339M11863 = !z ? c4128.m11863() : c4128.m11888();
        C7189 c7189 = abstractC8432.f25270;
        if (z) {
            str = strM11854 + "_VERTICAL";
        } else {
            str = strM11854 + "_HORIZONTAL";
        }
        String str5 = ((str + " [shape=none, label=<") + "<TABLE BORDER=\"0\" CELLSPACING=\"0\" CELLPADDING=\"2\">") + "  <TR>";
        if (z) {
            String str6 = str5 + "    <TD ";
            if (abstractC8432.f25275.f8958) {
                str6 = str6 + " BGCOLOR=\"green\"";
            }
            str2 = str6 + " PORT=\"TOP\" BORDER=\"1\">T</TD>";
        } else {
            String str7 = str5 + "    <TD ";
            if (abstractC8432.f25275.f8958) {
                str7 = str7 + " BGCOLOR=\"green\"";
            }
            str2 = str7 + " PORT=\"LEFT\" BORDER=\"1\">L</TD>";
        }
        String str8 = str2 + "    <TD BORDER=\"1\" ";
        boolean z2 = abstractC8432.f25272.f8958;
        if (z2 && !abstractC8432.f3497.f704) {
            str8 = str8 + " BGCOLOR=\"green\" ";
        } else if (z2 && abstractC8432.f3497.f704) {
            str8 = str8 + " BGCOLOR=\"lightgray\" ";
        } else if (!z2 && abstractC8432.f3497.f704) {
            str8 = str8 + " BGCOLOR=\"yellow\" ";
        }
        if (enumC0339M11863 == C4128.EnumC0339.MATCH_CONSTRAINT) {
            str8 = str8 + "style=\"dashed\"";
        }
        if (c7189 != null) {
            str3 = " [" + (c7189.f21700 + 1) + "/" + C7189.f21696 + "]";
        } else {
            str3 = "";
        }
        String str9 = str8 + ">" + strM11854 + str3 + " </TD>";
        if (z) {
            String str10 = str9 + "    <TD ";
            if ((abstractC8432 instanceof C8184) && ((C8184) abstractC8432).f24350.f8958) {
                str10 = str10 + " BGCOLOR=\"green\"";
            }
            String str11 = (str10 + " PORT=\"BASELINE\" BORDER=\"1\">b</TD>") + "    <TD ";
            if (abstractC8432.f25276.f8958) {
                str11 = str11 + " BGCOLOR=\"green\"";
            }
            str4 = str11 + " PORT=\"BOTTOM\" BORDER=\"1\">B</TD>";
        } else {
            String str12 = str9 + "    <TD ";
            if (abstractC8432.f25276.f8958) {
                str12 = str12 + " BGCOLOR=\"green\"";
            }
            str4 = str12 + " PORT=\"RIGHT\" BORDER=\"1\">R</TD>";
        }
        return (str4 + "  </TR></TABLE>") + ">];\n";
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m12657(C3526.InterfaceC0170 interfaceC0170) {
        this.f8948 = interfaceC0170;
    }
}
