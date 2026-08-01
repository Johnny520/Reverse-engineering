package p170l6;

import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p170l6.C4676o;
import p172l8.AbstractC4706m;
import p172l8.EnumC4708o;
import p172l8.InterfaceC4705l;
import p185m8.AbstractC5071c1;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5116y;
import p300uc.InterfaceC8645a;
import p300uc.InterfaceC8647b;
import p300uc.InterfaceC8660n;
import p300uc.InterfaceC8662p;
import p329wc.InterfaceC9218f;
import p345xc.InterfaceC9485c;
import p345xc.InterfaceC9486d;
import p345xc.InterfaceC9487e;
import p345xc.InterfaceC9488f;
import p361yc.AbstractC9694f2;
import p361yc.AbstractC9769u2;
import p361yc.C9688e1;
import p361yc.C9706i;
import p361yc.C9714j2;
import p361yc.InterfaceC9732n0;

/* JADX INFO: renamed from: l6.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8660n
@Metadata(m16757d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u001f\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002,0B\u007f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB£\u0001\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b#\u0010\"J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u0010/R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b5\u0010/R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b6\u0010-\u001a\u0004\b7\u0010/R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b8\u0010-\u001a\u0004\b9\u0010/R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b:\u0010-\u001a\u0004\b;\u0010/R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b<\u0010-\u001a\u0004\b=\u0010/R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A¨\u0006C"}, m16758d2 = {"Ll6/m;", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "Ll6/o;", "marks", "punctuations", "keywords", "strings", "literals", "comments", "multilineComments", "annotations", _UrlKt.FRAGMENT_ENCODE_SET, "incremental", "<init>", "(Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Z)V", _UrlKt.FRAGMENT_ENCODE_SET, "seen0", "Lyc/u2;", "serializationConstructorMarker", "(ILjava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZLyc/u2;)V", "self", "Lxc/d;", "output", "Lwc/f;", "serialDesc", "Ll8/i0;", "C", "(Ll6/m;Lxc/d;Lwc/f;)V", "position", "A", "(I)Ll6/m;", "new", "B", "(Ll6/m;)Ll6/m;", "z", _UrlKt.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Set;", "v", "()Ljava/util/Set;", "b", "x", "c", "t", "d", "y", "e", "u", "f", "s", "g", "w", "h", "r", "i", "Z", "getIncremental", "()Z", "Companion", "highlights"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final /* data */ class C4674m {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j */
    public static final InterfaceC4705l[] f13834j;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final Set marks;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Set punctuations;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final Set keywords;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final Set strings;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final Set literals;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final Set comments;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final Set multilineComments;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final Set annotations;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final boolean incremental;

    /* JADX INFO: renamed from: l6.m$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class a implements InterfaceC9732n0 {

        /* JADX INFO: renamed from: a */
        public static final a f13844a;
        private static final InterfaceC9218f descriptor;

        static {
            a aVar = new a();
            f13844a = aVar;
            C9714j2 c9714j2 = new C9714j2("dev.snipme.highlights.model.CodeStructure", aVar, 9);
            c9714j2.m37938o("marks", false);
            c9714j2.m37938o("punctuations", false);
            c9714j2.m37938o("keywords", false);
            c9714j2.m37938o("strings", false);
            c9714j2.m37938o("literals", false);
            c9714j2.m37938o("comments", false);
            c9714j2.m37938o("multilineComments", false);
            c9714j2.m37938o("annotations", false);
            c9714j2.m37938o("incremental", false);
            descriptor = c9714j2;
        }

        @Override // p300uc.InterfaceC8647b, p300uc.InterfaceC8662p, p300uc.InterfaceC8645a
        /* JADX INFO: renamed from: a */
        public final InterfaceC9218f mo15953a() {
            return descriptor;
        }

        @Override // p361yc.InterfaceC9732n0
        /* JADX INFO: renamed from: c */
        public InterfaceC8647b[] mo15955c() {
            return InterfaceC9732n0.a.m37980a(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p361yc.InterfaceC9732n0
        /* JADX INFO: renamed from: e */
        public final InterfaceC8647b[] mo15957e() {
            InterfaceC4705l[] interfaceC4705lArr = C4674m.f13834j;
            return new InterfaceC8647b[]{interfaceC4705lArr[0].getValue(), interfaceC4705lArr[1].getValue(), interfaceC4705lArr[2].getValue(), interfaceC4705lArr[3].getValue(), interfaceC4705lArr[4].getValue(), interfaceC4705lArr[5].getValue(), interfaceC4705lArr[6].getValue(), interfaceC4705lArr[7].getValue(), C9706i.f32952a};
        }

        @Override // p300uc.InterfaceC8645a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final C4674m mo15956d(InterfaceC9487e interfaceC9487e) {
            boolean zMo36960t;
            Set set;
            Set set2;
            Set set3;
            Set set4;
            Set set5;
            Set set6;
            int i10;
            Set set7;
            Set set8;
            interfaceC9487e.getClass();
            InterfaceC9218f interfaceC9218f = descriptor;
            InterfaceC9485c interfaceC9485cMo674c = interfaceC9487e.mo674c(interfaceC9218f);
            InterfaceC4705l[] interfaceC4705lArr = C4674m.f13834j;
            int i11 = 8;
            int i12 = 7;
            if (interfaceC9485cMo674c.mo36958r()) {
                Set set9 = (Set) interfaceC9485cMo674c.mo895x(interfaceC9218f, 0, (InterfaceC8645a) interfaceC4705lArr[0].getValue(), null);
                Set set10 = (Set) interfaceC9485cMo674c.mo895x(interfaceC9218f, 1, (InterfaceC8645a) interfaceC4705lArr[1].getValue(), null);
                Set set11 = (Set) interfaceC9485cMo674c.mo895x(interfaceC9218f, 2, (InterfaceC8645a) interfaceC4705lArr[2].getValue(), null);
                Set set12 = (Set) interfaceC9485cMo674c.mo895x(interfaceC9218f, 3, (InterfaceC8645a) interfaceC4705lArr[3].getValue(), null);
                Set set13 = (Set) interfaceC9485cMo674c.mo895x(interfaceC9218f, 4, (InterfaceC8645a) interfaceC4705lArr[4].getValue(), null);
                Set set14 = (Set) interfaceC9485cMo674c.mo895x(interfaceC9218f, 5, (InterfaceC8645a) interfaceC4705lArr[5].getValue(), null);
                Set set15 = (Set) interfaceC9485cMo674c.mo895x(interfaceC9218f, 6, (InterfaceC8645a) interfaceC4705lArr[6].getValue(), null);
                set = (Set) interfaceC9485cMo674c.mo895x(interfaceC9218f, 7, (InterfaceC8645a) interfaceC4705lArr[7].getValue(), null);
                set7 = set9;
                zMo36960t = interfaceC9485cMo674c.mo36960t(interfaceC9218f, 8);
                i10 = 511;
                set3 = set15;
                set2 = set14;
                set5 = set12;
                set4 = set13;
                set6 = set11;
                set8 = set10;
            } else {
                int i13 = 5;
                int i14 = 3;
                int i15 = 4;
                int i16 = 2;
                int i17 = 1;
                boolean z10 = true;
                boolean zMo36960t2 = false;
                Set set16 = null;
                Set set17 = null;
                Set set18 = null;
                Set set19 = null;
                Set set20 = null;
                Set set21 = null;
                Set set22 = null;
                int i18 = 0;
                Set set23 = null;
                while (z10) {
                    int iMo788v = interfaceC9485cMo674c.mo788v(interfaceC9218f);
                    switch (iMo788v) {
                        case -1:
                            z10 = false;
                            i12 = 7;
                            i17 = 1;
                            i16 = 2;
                            i14 = 3;
                            i15 = 4;
                            i13 = 5;
                            break;
                        case 0:
                            set21 = (Set) interfaceC9485cMo674c.mo895x(interfaceC9218f, 0, (InterfaceC8645a) interfaceC4705lArr[0].getValue(), set21);
                            i18 |= 1;
                            i11 = 8;
                            i12 = 7;
                            i17 = 1;
                            i16 = 2;
                            i14 = 3;
                            i15 = 4;
                            i13 = 5;
                            break;
                        case 1:
                            set22 = (Set) interfaceC9485cMo674c.mo895x(interfaceC9218f, i17, (InterfaceC8645a) interfaceC4705lArr[i17].getValue(), set22);
                            i18 |= 2;
                            i11 = 8;
                            i12 = 7;
                            i16 = 2;
                            i14 = 3;
                            i15 = 4;
                            i13 = 5;
                            break;
                        case 2:
                            set23 = (Set) interfaceC9485cMo674c.mo895x(interfaceC9218f, i16, (InterfaceC8645a) interfaceC4705lArr[i16].getValue(), set23);
                            i18 |= 4;
                            i11 = 8;
                            i12 = 7;
                            i14 = 3;
                            i15 = 4;
                            i13 = 5;
                            break;
                        case 3:
                            set20 = (Set) interfaceC9485cMo674c.mo895x(interfaceC9218f, i14, (InterfaceC8645a) interfaceC4705lArr[i14].getValue(), set20);
                            i18 |= 8;
                            i11 = 8;
                            i12 = 7;
                            i15 = 4;
                            i13 = 5;
                            break;
                        case 4:
                            set19 = (Set) interfaceC9485cMo674c.mo895x(interfaceC9218f, i15, (InterfaceC8645a) interfaceC4705lArr[i15].getValue(), set19);
                            i18 |= 16;
                            i11 = 8;
                            i12 = 7;
                            i13 = 5;
                            break;
                        case 5:
                            set17 = (Set) interfaceC9485cMo674c.mo895x(interfaceC9218f, i13, (InterfaceC8645a) interfaceC4705lArr[i13].getValue(), set17);
                            i18 |= 32;
                            i11 = 8;
                            i12 = 7;
                            break;
                        case 6:
                            set18 = (Set) interfaceC9485cMo674c.mo895x(interfaceC9218f, 6, (InterfaceC8645a) interfaceC4705lArr[6].getValue(), set18);
                            i18 |= 64;
                            i11 = 8;
                            break;
                        case 7:
                            set16 = (Set) interfaceC9485cMo674c.mo895x(interfaceC9218f, i12, (InterfaceC8645a) interfaceC4705lArr[i12].getValue(), set16);
                            i18 |= 128;
                            i11 = 8;
                            break;
                        case 8:
                            zMo36960t2 = interfaceC9485cMo674c.mo36960t(interfaceC9218f, i11);
                            i18 |= 256;
                            break;
                        default:
                            C4662a.m18633a(iMo788v);
                            return null;
                    }
                }
                zMo36960t = zMo36960t2;
                set = set16;
                set2 = set17;
                set3 = set18;
                set4 = set19;
                set5 = set20;
                set6 = set23;
                i10 = i18;
                set7 = set21;
                set8 = set22;
            }
            interfaceC9485cMo674c.mo675d(interfaceC9218f);
            return new C4674m(i10, set7, set8, set6, set5, set4, set2, set3, set, zMo36960t, null);
        }

        @Override // p300uc.InterfaceC8662p
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void mo15954b(InterfaceC9488f interfaceC9488f, C4674m c4674m) {
            interfaceC9488f.getClass();
            c4674m.getClass();
            InterfaceC9218f interfaceC9218f = descriptor;
            InterfaceC9486d interfaceC9486dMo637c = interfaceC9488f.mo637c(interfaceC9218f);
            C4674m.m18643C(c4674m, interfaceC9486dMo637c, interfaceC9218f);
            interfaceC9486dMo637c.mo638d(interfaceC9218f);
        }
    }

    static {
        EnumC4708o enumC4708o = EnumC4708o.f13922r;
        f13834j = new InterfaceC4705l[]{AbstractC4706m.m18788b(enumC4708o, new InterfaceC0173a() { // from class: l6.e
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C4674m.m18652i();
            }
        }), AbstractC4706m.m18788b(enumC4708o, new InterfaceC0173a() { // from class: l6.f
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C4674m.m18659p();
            }
        }), AbstractC4706m.m18788b(enumC4708o, new InterfaceC0173a() { // from class: l6.g
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C4674m.m18653j();
            }
        }), AbstractC4706m.m18788b(enumC4708o, new InterfaceC0173a() { // from class: l6.h
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C4674m.m18654k();
            }
        }), AbstractC4706m.m18788b(enumC4708o, new InterfaceC0173a() { // from class: l6.i
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C4674m.m18655l();
            }
        }), AbstractC4706m.m18788b(enumC4708o, new InterfaceC0173a() { // from class: l6.j
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C4674m.m18656m();
            }
        }), AbstractC4706m.m18788b(enumC4708o, new InterfaceC0173a() { // from class: l6.k
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C4674m.m18657n();
            }
        }), AbstractC4706m.m18788b(enumC4708o, new InterfaceC0173a() { // from class: l6.l
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C4674m.m18658o();
            }
        }), null};
    }

    public C4674m(Set set, Set set2, Set set3, Set set4, Set set5, Set set6, Set set7, Set set8, boolean z10) {
        set.getClass();
        set2.getClass();
        set3.getClass();
        set4.getClass();
        set5.getClass();
        set6.getClass();
        set7.getClass();
        set8.getClass();
        this.marks = set;
        this.punctuations = set2;
        this.keywords = set3;
        this.strings = set4;
        this.literals = set5;
        this.comments = set6;
        this.multilineComments = set7;
        this.annotations = set8;
        this.incremental = z10;
    }

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ void m18643C(C4674m self, InterfaceC9486d output, InterfaceC9218f serialDesc) {
        InterfaceC4705l[] interfaceC4705lArr = f13834j;
        output.mo36969g(serialDesc, 0, (InterfaceC8662p) interfaceC4705lArr[0].getValue(), self.marks);
        output.mo36969g(serialDesc, 1, (InterfaceC8662p) interfaceC4705lArr[1].getValue(), self.punctuations);
        output.mo36969g(serialDesc, 2, (InterfaceC8662p) interfaceC4705lArr[2].getValue(), self.keywords);
        output.mo36969g(serialDesc, 3, (InterfaceC8662p) interfaceC4705lArr[3].getValue(), self.strings);
        output.mo36969g(serialDesc, 4, (InterfaceC8662p) interfaceC4705lArr[4].getValue(), self.literals);
        output.mo36969g(serialDesc, 5, (InterfaceC8662p) interfaceC4705lArr[5].getValue(), self.comments);
        output.mo36969g(serialDesc, 6, (InterfaceC8662p) interfaceC4705lArr[6].getValue(), self.multilineComments);
        output.mo36969g(serialDesc, 7, (InterfaceC8662p) interfaceC4705lArr[7].getValue(), self.annotations);
        output.mo36967E(serialDesc, 8, self.incremental);
    }

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ InterfaceC8647b m18652i() {
        return new C9688e1(C4676o.a.f13850a);
    }

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ InterfaceC8647b m18653j() {
        return new C9688e1(C4676o.a.f13850a);
    }

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ InterfaceC8647b m18654k() {
        return new C9688e1(C4676o.a.f13850a);
    }

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ InterfaceC8647b m18655l() {
        return new C9688e1(C4676o.a.f13850a);
    }

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ InterfaceC8647b m18656m() {
        return new C9688e1(C4676o.a.f13850a);
    }

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ InterfaceC8647b m18657n() {
        return new C9688e1(C4676o.a.f13850a);
    }

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ InterfaceC8647b m18658o() {
        return new C9688e1(C4676o.a.f13850a);
    }

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ InterfaceC8647b m18659p() {
        return new C9688e1(C4676o.a.f13850a);
    }

    /* JADX INFO: renamed from: A */
    public final C4674m m18661A(int position) {
        Set<C4676o> set = this.marks;
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(set, 10));
        for (C4676o c4676o : set) {
            arrayList.add(c4676o.m18679a(c4676o.getStart() + position, c4676o.getEnd() + position));
        }
        Set setM20564c1 = AbstractC5081g0.m20564c1(arrayList);
        Set<C4676o> set2 = this.punctuations;
        ArrayList arrayList2 = new ArrayList(AbstractC5116y.m20814z(set2, 10));
        for (C4676o c4676o2 : set2) {
            arrayList2.add(c4676o2.m18679a(c4676o2.getStart() + position, c4676o2.getEnd() + position));
        }
        Set setM20564c12 = AbstractC5081g0.m20564c1(arrayList2);
        Set<C4676o> set3 = this.keywords;
        ArrayList arrayList3 = new ArrayList(AbstractC5116y.m20814z(set3, 10));
        for (C4676o c4676o3 : set3) {
            arrayList3.add(c4676o3.m18679a(c4676o3.getStart() + position, c4676o3.getEnd() + position));
        }
        Set setM20564c13 = AbstractC5081g0.m20564c1(arrayList3);
        Set<C4676o> set4 = this.strings;
        ArrayList arrayList4 = new ArrayList(AbstractC5116y.m20814z(set4, 10));
        for (C4676o c4676o4 : set4) {
            arrayList4.add(c4676o4.m18679a(c4676o4.getStart() + position, c4676o4.getEnd() + position));
        }
        Set setM20564c14 = AbstractC5081g0.m20564c1(arrayList4);
        Set<C4676o> set5 = this.literals;
        ArrayList arrayList5 = new ArrayList(AbstractC5116y.m20814z(set5, 10));
        for (C4676o c4676o5 : set5) {
            arrayList5.add(c4676o5.m18679a(c4676o5.getStart() + position, c4676o5.getEnd() + position));
        }
        Set setM20564c15 = AbstractC5081g0.m20564c1(arrayList5);
        Set<C4676o> set6 = this.comments;
        ArrayList arrayList6 = new ArrayList(AbstractC5116y.m20814z(set6, 10));
        for (C4676o c4676o6 : set6) {
            arrayList6.add(c4676o6.m18679a(c4676o6.getStart() + position, c4676o6.getEnd() + position));
        }
        Set setM20564c16 = AbstractC5081g0.m20564c1(arrayList6);
        Set<C4676o> set7 = this.multilineComments;
        ArrayList arrayList7 = new ArrayList(AbstractC5116y.m20814z(set7, 10));
        for (C4676o c4676o7 : set7) {
            arrayList7.add(c4676o7.m18679a(c4676o7.getStart() + position, c4676o7.getEnd() + position));
        }
        Set setM20564c17 = AbstractC5081g0.m20564c1(arrayList7);
        Set<C4676o> set8 = this.annotations;
        ArrayList arrayList8 = new ArrayList(AbstractC5116y.m20814z(set8, 10));
        for (C4676o c4676o8 : set8) {
            arrayList8.add(c4676o8.m18679a(c4676o8.getStart() + position, c4676o8.getEnd() + position));
        }
        return new C4674m(setM20564c1, setM20564c12, setM20564c13, setM20564c14, setM20564c15, setM20564c16, setM20564c17, AbstractC5081g0.m20564c1(arrayList8), true);
    }

    /* JADX INFO: renamed from: B */
    public final C4674m m18662B(C4674m c4674m) {
        c4674m.getClass();
        return new C4674m(AbstractC5071c1.m20503l(this.marks, c4674m.marks), AbstractC5071c1.m20503l(this.punctuations, c4674m.punctuations), AbstractC5071c1.m20503l(this.keywords, c4674m.keywords), AbstractC5071c1.m20503l(this.strings, c4674m.strings), AbstractC5071c1.m20503l(this.literals, c4674m.literals), AbstractC5071c1.m20503l(this.comments, c4674m.comments), AbstractC5071c1.m20503l(this.multilineComments, c4674m.multilineComments), AbstractC5071c1.m20503l(this.annotations, c4674m.annotations), true);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4674m)) {
            return false;
        }
        C4674m c4674m = (C4674m) other;
        return AbstractC1061t.m3842c(this.marks, c4674m.marks) && AbstractC1061t.m3842c(this.punctuations, c4674m.punctuations) && AbstractC1061t.m3842c(this.keywords, c4674m.keywords) && AbstractC1061t.m3842c(this.strings, c4674m.strings) && AbstractC1061t.m3842c(this.literals, c4674m.literals) && AbstractC1061t.m3842c(this.comments, c4674m.comments) && AbstractC1061t.m3842c(this.multilineComments, c4674m.multilineComments) && AbstractC1061t.m3842c(this.annotations, c4674m.annotations) && this.incremental == c4674m.incremental;
    }

    public int hashCode() {
        return (((((((((((((((this.marks.hashCode() * 31) + this.punctuations.hashCode()) * 31) + this.keywords.hashCode()) * 31) + this.strings.hashCode()) * 31) + this.literals.hashCode()) * 31) + this.comments.hashCode()) * 31) + this.multilineComments.hashCode()) * 31) + this.annotations.hashCode()) * 31) + Boolean.hashCode(this.incremental);
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Set getAnnotations() {
        return this.annotations;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final Set getComments() {
        return this.comments;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Set getKeywords() {
        return this.keywords;
    }

    public String toString() {
        return "CodeStructure(marks=" + this.marks + ", punctuations=" + this.punctuations + ", keywords=" + this.keywords + ", strings=" + this.strings + ", literals=" + this.literals + ", comments=" + this.comments + ", multilineComments=" + this.multilineComments + ", annotations=" + this.annotations + ", incremental=" + this.incremental + ")";
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final Set getLiterals() {
        return this.literals;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final Set getMarks() {
        return this.marks;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final Set getMultilineComments() {
        return this.multilineComments;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final Set getPunctuations() {
        return this.punctuations;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final Set getStrings() {
        return this.strings;
    }

    /* JADX INFO: renamed from: z */
    public final C4674m m18671z(C4674m c4674m) {
        c4674m.getClass();
        return new C4674m(AbstractC5071c1.m20501j(this.marks, c4674m.marks), AbstractC5071c1.m20501j(this.punctuations, c4674m.punctuations), AbstractC5071c1.m20501j(this.keywords, c4674m.keywords), AbstractC5071c1.m20501j(this.strings, c4674m.strings), AbstractC5071c1.m20501j(this.literals, c4674m.literals), AbstractC5071c1.m20501j(this.comments, c4674m.comments), AbstractC5071c1.m20501j(this.multilineComments, c4674m.multilineComments), AbstractC5071c1.m20501j(this.annotations, c4674m.annotations), true);
    }

    /* JADX INFO: renamed from: l6.m$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class Companion {
        public Companion() {
        }

        public final InterfaceC8647b serializer() {
            return a.f13844a;
        }

        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }
    }

    public /* synthetic */ C4674m(int i10, Set set, Set set2, Set set3, Set set4, Set set5, Set set6, Set set7, Set set8, boolean z10, AbstractC9769u2 abstractC9769u2) {
        if (511 != (i10 & 511)) {
            AbstractC9694f2.m37891a(i10, 511, a.f13844a.mo15953a());
        }
        this.marks = set;
        this.punctuations = set2;
        this.keywords = set3;
        this.strings = set4;
        this.literals = set5;
        this.comments = set6;
        this.multilineComments = set7;
        this.annotations = set8;
        this.incremental = z10;
    }
}
