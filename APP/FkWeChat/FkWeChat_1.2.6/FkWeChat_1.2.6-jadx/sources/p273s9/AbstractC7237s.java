package p273s9;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import gb.AbstractC2649c0;
import gb.AbstractC2655d2;
import gb.AbstractC2706r0;
import gb.C2663f2;
import gb.EnumC2691m2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p010a9.InterfaceC0173a;
import p012ab.C0207d;
import p012ab.InterfaceC0209f;
import p185m8.AbstractC5081g0;
import p213oa.C5695f;
import p229p9.AbstractC6040t;
import p229p9.AbstractC6043u;
import p229p9.EnumC5996e0;
import p229p9.InterfaceC5983a;
import p229p9.InterfaceC5986b;
import p229p9.InterfaceC5988b1;
import p229p9.InterfaceC6003g1;
import p229p9.InterfaceC6018l1;
import p229p9.InterfaceC6019m;
import p229p9.InterfaceC6025o;
import p229p9.InterfaceC6039s1;
import p229p9.InterfaceC6056z;
import p243q9.AbstractC6335j;
import p243q9.InterfaceC6333h;
import p244qb.C6379j;
import p254r5.C6494d0;
import p273s9.C7242u0;
import sa.AbstractC7258h;

/* JADX INFO: renamed from: s9.s */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7237s extends AbstractC7227n implements InterfaceC6056z {

    /* JADX INFO: renamed from: A */
    public EnumC5996e0 f24025A;

    /* JADX INFO: renamed from: B */
    public AbstractC6043u f24026B;

    /* JADX INFO: renamed from: C */
    public boolean f24027C;

    /* JADX INFO: renamed from: D */
    public boolean f24028D;

    /* JADX INFO: renamed from: E */
    public boolean f24029E;

    /* JADX INFO: renamed from: F */
    public boolean f24030F;

    /* JADX INFO: renamed from: G */
    public boolean f24031G;

    /* JADX INFO: renamed from: H */
    public boolean f24032H;

    /* JADX INFO: renamed from: I */
    public boolean f24033I;

    /* JADX INFO: renamed from: J */
    public boolean f24034J;

    /* JADX INFO: renamed from: K */
    public boolean f24035K;

    /* JADX INFO: renamed from: L */
    public boolean f24036L;

    /* JADX INFO: renamed from: M */
    public boolean f24037M;

    /* JADX INFO: renamed from: N */
    public boolean f24038N;

    /* JADX INFO: renamed from: O */
    public Collection f24039O;

    /* JADX INFO: renamed from: P */
    public volatile InterfaceC0173a f24040P;

    /* JADX INFO: renamed from: Q */
    public final InterfaceC6056z f24041Q;

    /* JADX INFO: renamed from: R */
    public final InterfaceC5986b.a f24042R;

    /* JADX INFO: renamed from: S */
    public InterfaceC6056z f24043S;

    /* JADX INFO: renamed from: T */
    public Map f24044T;

    /* JADX INFO: renamed from: u */
    public List f24045u;

    /* JADX INFO: renamed from: v */
    public List f24046v;

    /* JADX INFO: renamed from: w */
    public AbstractC2706r0 f24047w;

    /* JADX INFO: renamed from: x */
    public List f24048x;

    /* JADX INFO: renamed from: y */
    public InterfaceC5988b1 f24049y;

    /* JADX INFO: renamed from: z */
    public InterfaceC5988b1 f24050z;

    /* JADX INFO: renamed from: s9.s$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class a implements InterfaceC0173a {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ C2663f2 f24051q;

        public a(C2663f2 c2663f2) {
            this.f24051q = c2663f2;
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection invoke() {
            C6379j c6379j = new C6379j();
            Iterator it = AbstractC7237s.this.mo12674e().iterator();
            while (it.hasNext()) {
                c6379j.add(((InterfaceC6056z) it.next()).mo7503c(this.f24051q));
            }
            return c6379j;
        }
    }

    /* JADX INFO: renamed from: s9.s$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class b implements InterfaceC0173a {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ List f24053q;

        public b(List list) {
            this.f24053q = list;
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List invoke() {
            return this.f24053q;
        }
    }

    /* JADX INFO: renamed from: s9.s$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class c implements InterfaceC6056z.a {

        /* JADX INFO: renamed from: a */
        public AbstractC2655d2 f24054a;

        /* JADX INFO: renamed from: b */
        public InterfaceC6019m f24055b;

        /* JADX INFO: renamed from: c */
        public EnumC5996e0 f24056c;

        /* JADX INFO: renamed from: d */
        public AbstractC6043u f24057d;

        /* JADX INFO: renamed from: e */
        public InterfaceC6056z f24058e;

        /* JADX INFO: renamed from: f */
        public InterfaceC5986b.a f24059f;

        /* JADX INFO: renamed from: g */
        public List f24060g;

        /* JADX INFO: renamed from: h */
        public List f24061h;

        /* JADX INFO: renamed from: i */
        public InterfaceC5988b1 f24062i;

        /* JADX INFO: renamed from: j */
        public InterfaceC5988b1 f24063j;

        /* JADX INFO: renamed from: k */
        public AbstractC2706r0 f24064k;

        /* JADX INFO: renamed from: l */
        public C5695f f24065l;

        /* JADX INFO: renamed from: m */
        public boolean f24066m;

        /* JADX INFO: renamed from: n */
        public boolean f24067n;

        /* JADX INFO: renamed from: o */
        public boolean f24068o;

        /* JADX INFO: renamed from: p */
        public boolean f24069p;

        /* JADX INFO: renamed from: q */
        public boolean f24070q;

        /* JADX INFO: renamed from: r */
        public List f24071r;

        /* JADX INFO: renamed from: s */
        public InterfaceC6333h f24072s;

        /* JADX INFO: renamed from: t */
        public boolean f24073t;

        /* JADX INFO: renamed from: u */
        public Map f24074u;

        /* JADX INFO: renamed from: v */
        public Boolean f24075v;

        /* JADX INFO: renamed from: w */
        public boolean f24076w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ AbstractC7237s f24077x;

        public c(AbstractC7237s abstractC7237s, AbstractC2655d2 abstractC2655d2, InterfaceC6019m interfaceC6019m, EnumC5996e0 enumC5996e0, AbstractC6043u abstractC6043u, InterfaceC5986b.a aVar, List list, List list2, InterfaceC5988b1 interfaceC5988b1, AbstractC2706r0 abstractC2706r0, C5695f c5695f) {
            if (abstractC2655d2 == null) {
                m28616u(0);
            }
            if (interfaceC6019m == null) {
                m28616u(1);
            }
            if (enumC5996e0 == null) {
                m28616u(2);
            }
            if (abstractC6043u == null) {
                m28616u(3);
            }
            if (aVar == null) {
                m28616u(4);
            }
            if (list == null) {
                m28616u(5);
            }
            if (list2 == null) {
                m28616u(6);
            }
            if (abstractC2706r0 == null) {
                m28616u(7);
            }
            this.f24077x = abstractC7237s;
            this.f24058e = null;
            this.f24063j = abstractC7237s.f24050z;
            this.f24066m = true;
            this.f24067n = false;
            this.f24068o = false;
            this.f24069p = false;
            this.f24070q = abstractC7237s.mo24118A0();
            this.f24071r = null;
            this.f24072s = null;
            this.f24073t = abstractC7237s.mo24119G0();
            this.f24074u = new LinkedHashMap();
            this.f24075v = null;
            this.f24076w = false;
            this.f24054a = abstractC2655d2;
            this.f24055b = interfaceC6019m;
            this.f24056c = enumC5996e0;
            this.f24057d = abstractC6043u;
            this.f24059f = aVar;
            this.f24060g = list;
            this.f24061h = list2;
            this.f24062i = interfaceC5988b1;
            this.f24064k = abstractC2706r0;
            this.f24065l = c5695f;
        }

        /* JADX INFO: renamed from: u */
        public static /* synthetic */ void m28616u(int i10) {
            String str;
            int i11;
            switch (i10) {
                case 9:
                case Opcodes.FCONST_0 /* 11 */:
                case Opcodes.FCONST_2 /* 13 */:
                case 15:
                case 16:
                case Opcodes.LDC /* 18 */:
                case 20:
                case Opcodes.LLOAD /* 22 */:
                case Opcodes.DLOAD /* 24 */:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                case 10:
                case Opcodes.FCONST_1 /* 12 */:
                case Opcodes.DCONST_0 /* 14 */:
                case Opcodes.SIPUSH /* 17 */:
                case 19:
                case Opcodes.ILOAD /* 21 */:
                case Opcodes.FLOAD /* 23 */:
                case Opcodes.ALOAD /* 25 */:
                case 35:
                case 37:
                case 39:
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i10) {
                case 9:
                case Opcodes.FCONST_0 /* 11 */:
                case Opcodes.FCONST_2 /* 13 */:
                case 15:
                case 16:
                case Opcodes.LDC /* 18 */:
                case 20:
                case Opcodes.LLOAD /* 22 */:
                case Opcodes.DLOAD /* 24 */:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    i11 = 2;
                    break;
                case 10:
                case Opcodes.FCONST_1 /* 12 */:
                case Opcodes.DCONST_0 /* 14 */:
                case Opcodes.SIPUSH /* 17 */:
                case 19:
                case Opcodes.ILOAD /* 21 */:
                case Opcodes.FLOAD /* 23 */:
                case Opcodes.ALOAD /* 25 */:
                case 35:
                case 37:
                case 39:
                default:
                    i11 = 3;
                    break;
            }
            Object[] objArr = new Object[i11];
            switch (i10) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case Opcodes.DCONST_0 /* 14 */:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newContextReceiverParameters";
                    break;
                case 7:
                    objArr[0] = "newReturnType";
                    break;
                case 8:
                    objArr[0] = "owner";
                    break;
                case 9:
                case Opcodes.FCONST_0 /* 11 */:
                case Opcodes.FCONST_2 /* 13 */:
                case 15:
                case 16:
                case Opcodes.LDC /* 18 */:
                case 20:
                case Opcodes.LLOAD /* 22 */:
                case Opcodes.DLOAD /* 24 */:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 10:
                    objArr[0] = "modality";
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                    objArr[0] = "visibility";
                    break;
                case Opcodes.SIPUSH /* 17 */:
                    objArr[0] = "name";
                    break;
                case 19:
                case Opcodes.ILOAD /* 21 */:
                    objArr[0] = "parameters";
                    break;
                case Opcodes.FLOAD /* 23 */:
                    objArr[0] = "type";
                    break;
                case Opcodes.ALOAD /* 25 */:
                    objArr[0] = "contextReceiverParameters";
                    break;
                case 35:
                    objArr[0] = "additionalAnnotations";
                    break;
                case 37:
                default:
                    objArr[0] = "substitution";
                    break;
                case 39:
                    objArr[0] = "userDataKey";
                    break;
            }
            switch (i10) {
                case 9:
                    objArr[1] = "setOwner";
                    break;
                case 10:
                case Opcodes.FCONST_1 /* 12 */:
                case Opcodes.DCONST_0 /* 14 */:
                case Opcodes.SIPUSH /* 17 */:
                case 19:
                case Opcodes.ILOAD /* 21 */:
                case Opcodes.FLOAD /* 23 */:
                case Opcodes.ALOAD /* 25 */:
                case 35:
                case 37:
                case 39:
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case Opcodes.FCONST_0 /* 11 */:
                    objArr[1] = "setModality";
                    break;
                case Opcodes.FCONST_2 /* 13 */:
                    objArr[1] = "setVisibility";
                    break;
                case 15:
                    objArr[1] = "setKind";
                    break;
                case 16:
                    objArr[1] = "setCopyOverrides";
                    break;
                case Opcodes.LDC /* 18 */:
                    objArr[1] = "setName";
                    break;
                case 20:
                    objArr[1] = "setValueParameters";
                    break;
                case Opcodes.LLOAD /* 22 */:
                    objArr[1] = "setTypeParameters";
                    break;
                case Opcodes.DLOAD /* 24 */:
                    objArr[1] = "setReturnType";
                    break;
                case 26:
                    objArr[1] = "setContextReceiverParameters";
                    break;
                case 27:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 28:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 29:
                    objArr[1] = "setOriginal";
                    break;
                case 30:
                    objArr[1] = "setSignatureChange";
                    break;
                case 31:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 32:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case 33:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 34:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 36:
                    objArr[1] = "setAdditionalAnnotations";
                    break;
                case 38:
                    objArr[1] = "setSubstitution";
                    break;
                case 40:
                    objArr[1] = "putUserData";
                    break;
                case 41:
                    objArr[1] = "getSubstitution";
                    break;
                case 42:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
            }
            switch (i10) {
                case 8:
                    objArr[2] = "setOwner";
                    break;
                case 9:
                case Opcodes.FCONST_0 /* 11 */:
                case Opcodes.FCONST_2 /* 13 */:
                case 15:
                case 16:
                case Opcodes.LDC /* 18 */:
                case 20:
                case Opcodes.LLOAD /* 22 */:
                case Opcodes.DLOAD /* 24 */:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    break;
                case 10:
                    objArr[2] = "setModality";
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                    objArr[2] = "setVisibility";
                    break;
                case Opcodes.DCONST_0 /* 14 */:
                    objArr[2] = "setKind";
                    break;
                case Opcodes.SIPUSH /* 17 */:
                    objArr[2] = "setName";
                    break;
                case 19:
                    objArr[2] = "setValueParameters";
                    break;
                case Opcodes.ILOAD /* 21 */:
                    objArr[2] = "setTypeParameters";
                    break;
                case Opcodes.FLOAD /* 23 */:
                    objArr[2] = "setReturnType";
                    break;
                case Opcodes.ALOAD /* 25 */:
                    objArr[2] = "setContextReceiverParameters";
                    break;
                case 35:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                case 37:
                    objArr[2] = "setSubstitution";
                    break;
                case 39:
                    objArr[2] = "putUserData";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            switch (i10) {
                case 9:
                case Opcodes.FCONST_0 /* 11 */:
                case Opcodes.FCONST_2 /* 13 */:
                case 15:
                case 16:
                case Opcodes.LDC /* 18 */:
                case 20:
                case Opcodes.LLOAD /* 22 */:
                case Opcodes.DLOAD /* 24 */:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    throw new IllegalStateException(str2);
                case 10:
                case Opcodes.FCONST_1 /* 12 */:
                case Opcodes.DCONST_0 /* 14 */:
                case Opcodes.SIPUSH /* 17 */:
                case 19:
                case Opcodes.ILOAD /* 21 */:
                case Opcodes.FLOAD /* 23 */:
                case Opcodes.ALOAD /* 25 */:
                case 35:
                case 37:
                case 39:
                default:
                    throw new IllegalArgumentException(str2);
            }
        }

        @Override // p229p9.InterfaceC6056z.a
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public c mo12642d(InterfaceC6333h interfaceC6333h) {
            if (interfaceC6333h == null) {
                m28616u(35);
            }
            this.f24072s = interfaceC6333h;
            return this;
        }

        @Override // p229p9.InterfaceC6056z.a
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public c mo12646h(boolean z10) {
            this.f24066m = z10;
            return this;
        }

        @Override // p229p9.InterfaceC6056z.a
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public c mo12647i(InterfaceC5988b1 interfaceC5988b1) {
            this.f24063j = interfaceC5988b1;
            return this;
        }

        @Override // p229p9.InterfaceC6056z.a
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public c mo12639a() {
            this.f24069p = true;
            return this;
        }

        @Override // p229p9.InterfaceC6056z.a
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public c mo12651m(InterfaceC5988b1 interfaceC5988b1) {
            this.f24062i = interfaceC5988b1;
            return this;
        }

        /* JADX INFO: renamed from: G */
        public c m28627G(boolean z10) {
            this.f24075v = Boolean.valueOf(z10);
            return this;
        }

        @Override // p229p9.InterfaceC6056z.a
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public c mo12645g() {
            this.f24073t = true;
            return this;
        }

        @Override // p229p9.InterfaceC6056z.a
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public c mo12652n() {
            this.f24070q = true;
            return this;
        }

        /* JADX INFO: renamed from: J */
        public c m28630J(boolean z10) {
            this.f24076w = z10;
            return this;
        }

        @Override // p229p9.InterfaceC6056z.a
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public c mo12641c(InterfaceC5986b.a aVar) {
            if (aVar == null) {
                m28616u(14);
            }
            this.f24059f = aVar;
            return this;
        }

        @Override // p229p9.InterfaceC6056z.a
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public c mo12644f(EnumC5996e0 enumC5996e0) {
            if (enumC5996e0 == null) {
                m28616u(10);
            }
            this.f24056c = enumC5996e0;
            return this;
        }

        @Override // p229p9.InterfaceC6056z.a
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public c mo12653o(C5695f c5695f) {
            if (c5695f == null) {
                m28616u(17);
            }
            this.f24065l = c5695f;
            return this;
        }

        @Override // p229p9.InterfaceC6056z.a
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public c mo12654p(InterfaceC5986b interfaceC5986b) {
            this.f24058e = (InterfaceC6056z) interfaceC5986b;
            return this;
        }

        @Override // p229p9.InterfaceC6056z.a
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public c mo12648j(InterfaceC6019m interfaceC6019m) {
            if (interfaceC6019m == null) {
                m28616u(8);
            }
            this.f24055b = interfaceC6019m;
            return this;
        }

        @Override // p229p9.InterfaceC6056z.a
        /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
        public c mo12643e() {
            this.f24068o = true;
            return this;
        }

        @Override // p229p9.InterfaceC6056z.a
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public c mo12649k(AbstractC2706r0 abstractC2706r0) {
            if (abstractC2706r0 == null) {
                m28616u(23);
            }
            this.f24064k = abstractC2706r0;
            return this;
        }

        @Override // p229p9.InterfaceC6056z.a
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public c mo12658t() {
            this.f24067n = true;
            return this;
        }

        @Override // p229p9.InterfaceC6056z.a
        /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
        public c mo12655q(AbstractC2655d2 abstractC2655d2) {
            if (abstractC2655d2 == null) {
                m28616u(37);
            }
            this.f24054a = abstractC2655d2;
            return this;
        }

        @Override // p229p9.InterfaceC6056z.a
        /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
        public c mo12650l(List list) {
            if (list == null) {
                m28616u(21);
            }
            this.f24071r = list;
            return this;
        }

        @Override // p229p9.InterfaceC6056z.a
        /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
        public c mo12640b(List list) {
            if (list == null) {
                m28616u(19);
            }
            this.f24060g = list;
            return this;
        }

        @Override // p229p9.InterfaceC6056z.a
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public c mo12657s(AbstractC6043u abstractC6043u) {
            if (abstractC6043u == null) {
                m28616u(12);
            }
            this.f24057d = abstractC6043u;
            return this;
        }

        @Override // p229p9.InterfaceC6056z.a
        public InterfaceC6056z build() {
            return this.f24077x.mo22509S0(this);
        }

        @Override // p229p9.InterfaceC6056z.a
        /* JADX INFO: renamed from: r */
        public InterfaceC6056z.a mo12656r(InterfaceC5983a.a aVar, Object obj) {
            if (aVar == null) {
                m28616u(39);
            }
            this.f24074u.put(aVar, obj);
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7237s(InterfaceC6019m interfaceC6019m, InterfaceC6056z interfaceC6056z, InterfaceC6333h interfaceC6333h, C5695f c5695f, InterfaceC5986b.a aVar, InterfaceC6003g1 interfaceC6003g1) {
        super(interfaceC6019m, interfaceC6333h, c5695f, interfaceC6003g1);
        if (interfaceC6019m == null) {
            m28592N(0);
        }
        if (interfaceC6333h == null) {
            m28592N(1);
        }
        if (c5695f == null) {
            m28592N(2);
        }
        if (aVar == null) {
            m28592N(3);
        }
        if (interfaceC6003g1 == null) {
            m28592N(4);
        }
        this.f24026B = AbstractC6040t.f18990i;
        this.f24027C = false;
        this.f24028D = false;
        this.f24029E = false;
        this.f24030F = false;
        this.f24031G = false;
        this.f24032H = false;
        this.f24033I = false;
        this.f24034J = false;
        this.f24035K = false;
        this.f24036L = false;
        this.f24037M = true;
        this.f24038N = false;
        this.f24039O = null;
        this.f24040P = null;
        this.f24043S = null;
        this.f24044T = null;
        this.f24041Q = interfaceC6056z == null ? this : interfaceC6056z;
        this.f24042R = aVar;
    }

    /* JADX INFO: renamed from: N */
    private static /* synthetic */ void m28592N(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 9:
            case Opcodes.FCONST_2 /* 13 */:
            case Opcodes.DCONST_0 /* 14 */:
            case 15:
            case 16:
            case Opcodes.LDC /* 18 */:
            case 19:
            case 20:
            case Opcodes.ILOAD /* 21 */:
            case Opcodes.FLOAD /* 23 */:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case Opcodes.FCONST_0 /* 11 */:
            case Opcodes.FCONST_1 /* 12 */:
            case Opcodes.SIPUSH /* 17 */:
            case Opcodes.LLOAD /* 22 */:
            case Opcodes.DLOAD /* 24 */:
            case Opcodes.ALOAD /* 25 */:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 9:
            case Opcodes.FCONST_2 /* 13 */:
            case Opcodes.DCONST_0 /* 14 */:
            case 15:
            case 16:
            case Opcodes.LDC /* 18 */:
            case 19:
            case 20:
            case Opcodes.ILOAD /* 21 */:
            case Opcodes.FLOAD /* 23 */:
            case 26:
            case 27:
                i11 = 2;
                break;
            case 10:
            case Opcodes.FCONST_0 /* 11 */:
            case Opcodes.FCONST_1 /* 12 */:
            case Opcodes.SIPUSH /* 17 */:
            case Opcodes.LLOAD /* 22 */:
            case Opcodes.DLOAD /* 24 */:
            case Opcodes.ALOAD /* 25 */:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case Opcodes.FCONST_2 /* 13 */:
            case Opcodes.DCONST_0 /* 14 */:
            case 15:
            case 16:
            case Opcodes.LDC /* 18 */:
            case 19:
            case 20:
            case Opcodes.ILOAD /* 21 */:
            case Opcodes.FLOAD /* 23 */:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case Opcodes.FCONST_0 /* 11 */:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case Opcodes.FCONST_1 /* 12 */:
                objArr[0] = "extensionReceiverParameter";
                break;
            case Opcodes.SIPUSH /* 17 */:
                objArr[0] = "overriddenDescriptors";
                break;
            case Opcodes.LLOAD /* 22 */:
                objArr[0] = "originalSubstitutor";
                break;
            case Opcodes.DLOAD /* 24 */:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case Opcodes.ALOAD /* 25 */:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case Opcodes.FCONST_0 /* 11 */:
            case Opcodes.FCONST_1 /* 12 */:
            case Opcodes.SIPUSH /* 17 */:
            case Opcodes.LLOAD /* 22 */:
            case Opcodes.DLOAD /* 24 */:
            case Opcodes.ALOAD /* 25 */:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case Opcodes.FCONST_2 /* 13 */:
                objArr[1] = "getContextReceiverParameters";
                break;
            case Opcodes.DCONST_0 /* 14 */:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case Opcodes.LDC /* 18 */:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case Opcodes.ILOAD /* 21 */:
                objArr[1] = "getKind";
                break;
            case Opcodes.FLOAD /* 23 */:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case Opcodes.FCONST_2 /* 13 */:
            case Opcodes.DCONST_0 /* 14 */:
            case 15:
            case 16:
            case Opcodes.LDC /* 18 */:
            case 19:
            case 20:
            case Opcodes.ILOAD /* 21 */:
            case Opcodes.FLOAD /* 23 */:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case Opcodes.FCONST_0 /* 11 */:
                objArr[2] = "setReturnType";
                break;
            case Opcodes.FCONST_1 /* 12 */:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case Opcodes.SIPUSH /* 17 */:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case Opcodes.LLOAD /* 22 */:
                objArr[2] = "substitute";
                break;
            case Opcodes.DLOAD /* 24 */:
                objArr[2] = "newCopyBuilder";
                break;
            case Opcodes.ALOAD /* 25 */:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 9:
            case Opcodes.FCONST_2 /* 13 */:
            case Opcodes.DCONST_0 /* 14 */:
            case 15:
            case 16:
            case Opcodes.LDC /* 18 */:
            case 19:
            case 20:
            case Opcodes.ILOAD /* 21 */:
            case Opcodes.FLOAD /* 23 */:
            case 26:
            case 27:
                throw new IllegalStateException(str2);
            case 10:
            case Opcodes.FCONST_0 /* 11 */:
            case Opcodes.FCONST_1 /* 12 */:
            case Opcodes.SIPUSH /* 17 */:
            case Opcodes.LLOAD /* 22 */:
            case Opcodes.DLOAD /* 24 */:
            case Opcodes.ALOAD /* 25 */:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: U0 */
    public static List m28593U0(InterfaceC6056z interfaceC6056z, List list, C2663f2 c2663f2) {
        if (list == null) {
            m28592N(28);
        }
        if (c2663f2 == null) {
            m28592N(29);
        }
        return m28594V0(interfaceC6056z, list, c2663f2, false, false, null);
    }

    /* JADX INFO: renamed from: V0 */
    public static List m28594V0(InterfaceC6056z interfaceC6056z, List list, C2663f2 c2663f2, boolean z10, boolean z11, boolean[] zArr) {
        if (list == null) {
            m28592N(30);
        }
        if (c2663f2 == null) {
            m28592N(31);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC6039s1 interfaceC6039s1 = (InterfaceC6039s1) it.next();
            AbstractC2706r0 type = interfaceC6039s1.getType();
            EnumC2691m2 enumC2691m2 = EnumC2691m2.f7043v;
            AbstractC2706r0 abstractC2706r0M9393p = c2663f2.m9393p(type, enumC2691m2);
            AbstractC2706r0 abstractC2706r0Mo24070o0 = interfaceC6039s1.mo24070o0();
            AbstractC2706r0 abstractC2706r0M9393p2 = abstractC2706r0Mo24070o0 == null ? null : c2663f2.m9393p(abstractC2706r0Mo24070o0, enumC2691m2);
            if (abstractC2706r0M9393p == null) {
                return null;
            }
            if ((abstractC2706r0M9393p != interfaceC6039s1.getType() || abstractC2706r0Mo24070o0 != abstractC2706r0M9393p2) && zArr != null) {
                zArr[0] = true;
            }
            arrayList.add(C7242u0.m28666Q0(interfaceC6056z, z10 ? null : interfaceC6039s1, interfaceC6039s1.getIndex(), interfaceC6039s1.getAnnotations(), interfaceC6039s1.getName(), abstractC2706r0M9393p, interfaceC6039s1.mo24071y0(), interfaceC6039s1.mo24069h0(), interfaceC6039s1.mo24068d0(), abstractC2706r0M9393p2, z11 ? interfaceC6039s1.getSource() : InterfaceC6003g1.f18958a, interfaceC6039s1 instanceof C7242u0.b ? new b(((C7242u0.b) interfaceC6039s1).m28672V0()) : null));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j1 */
    private void m28595j1(InterfaceC6056z interfaceC6056z) {
        this.f24043S = interfaceC6056z;
    }

    @Override // p229p9.InterfaceC6056z
    /* JADX INFO: renamed from: A */
    public boolean mo24117A() {
        if (this.f24028D) {
            return true;
        }
        Iterator it = mo12664a().mo12674e().iterator();
        while (it.hasNext()) {
            if (((InterfaceC6056z) it.next()).mo24117A()) {
                return true;
            }
        }
        return false;
    }

    @Override // p229p9.InterfaceC6056z
    /* JADX INFO: renamed from: A0 */
    public boolean mo24118A0() {
        return this.f24034J;
    }

    /* JADX INFO: renamed from: B0 */
    public void mo12635B0(Collection collection) {
        if (collection == null) {
            m28592N(17);
        }
        this.f24039O = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((InterfaceC6056z) it.next()).mo24119G0()) {
                this.f24035K = true;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public boolean mo7416C() {
        return this.f24029E;
    }

    @Override // p229p9.InterfaceC6056z
    /* JADX INFO: renamed from: G0 */
    public boolean mo24119G0() {
        return this.f24035K;
    }

    @Override // p229p9.InterfaceC5993d0
    /* JADX INFO: renamed from: I0 */
    public boolean mo5573I0() {
        return this.f24033I;
    }

    /* JADX INFO: renamed from: L */
    public boolean mo418L() {
        return this.f24038N;
    }

    /* JADX INFO: renamed from: M0 */
    public Object mo12663M0(InterfaceC6025o interfaceC6025o, Object obj) {
        return interfaceC6025o.mo13745d(this, obj);
    }

    /* JADX INFO: renamed from: Q */
    public Object mo436Q(InterfaceC5983a.a aVar) {
        Map map = this.f24044T;
        if (map == null) {
            return null;
        }
        return map.get(aVar);
    }

    /* JADX INFO: renamed from: Q0 */
    public InterfaceC6056z m28596Q0(InterfaceC6019m interfaceC6019m, EnumC5996e0 enumC5996e0, AbstractC6043u abstractC6043u, InterfaceC5986b.a aVar, boolean z10) {
        InterfaceC6056z interfaceC6056zBuild = mo12638y().mo12648j(interfaceC6019m).mo12644f(enumC5996e0).mo12657s(abstractC6043u).mo12641c(aVar).mo12646h(z10).build();
        if (interfaceC6056zBuild == null) {
            m28592N(26);
        }
        return interfaceC6056zBuild;
    }

    @Override // p229p9.InterfaceC5993d0
    /* JADX INFO: renamed from: R */
    public boolean mo5576R() {
        return this.f24032H;
    }

    /* JADX INFO: renamed from: R0 */
    public abstract AbstractC7237s mo423u1(InterfaceC6019m interfaceC6019m, InterfaceC6056z interfaceC6056z, InterfaceC5986b.a aVar, C5695f c5695f, InterfaceC6333h interfaceC6333h, InterfaceC6003g1 interfaceC6003g1);

    /* JADX INFO: renamed from: S0 */
    public InterfaceC6056z mo22509S0(c cVar) {
        char c10;
        C7228n0 c7228n0;
        InterfaceC6056z interfaceC6056z;
        AbstractC2706r0 abstractC2706r0M9393p;
        if (cVar == null) {
            m28592N(25);
        }
        boolean[] zArr = new boolean[1];
        InterfaceC6333h interfaceC6333hM25007a = cVar.f24072s != null ? AbstractC6335j.m25007a(getAnnotations(), cVar.f24072s) : getAnnotations();
        InterfaceC6019m interfaceC6019m = cVar.f24055b;
        InterfaceC6056z interfaceC6056z2 = cVar.f24058e;
        AbstractC7237s abstractC7237sMo419R0 = mo423u1(interfaceC6019m, interfaceC6056z2, cVar.f24059f, cVar.f24065l, interfaceC6333hM25007a, m28597T0(cVar.f24068o, interfaceC6056z2));
        List typeParameters = cVar.f24071r == null ? getTypeParameters() : cVar.f24071r;
        zArr[0] = (zArr[0] ? 1 : 0) | (!typeParameters.isEmpty() ? 1 : 0);
        ArrayList arrayList = new ArrayList(typeParameters.size());
        C2663f2 c2663f2M9349c = AbstractC2649c0.m9349c(typeParameters, cVar.f24054a, abstractC7237sMo419R0, arrayList, zArr);
        InterfaceC5988b1 interfaceC5988b1 = null;
        if (c2663f2M9349c == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!cVar.f24061h.isEmpty()) {
            int i10 = 0;
            for (InterfaceC5988b1 interfaceC5988b12 : cVar.f24061h) {
                AbstractC2706r0 abstractC2706r0M9393p2 = c2663f2M9349c.m9393p(interfaceC5988b12.getType(), EnumC2691m2.f7043v);
                if (abstractC2706r0M9393p2 == null) {
                    return null;
                }
                int i11 = i10 + 1;
                arrayList2.add(AbstractC7258h.m28718b(abstractC7237sMo419R0, abstractC2706r0M9393p2, ((InterfaceC0209f) interfaceC5988b12.getValue()).mo443a(), interfaceC5988b12.getAnnotations(), i10));
                zArr[0] = (zArr[0] ? 1 : 0) | (abstractC2706r0M9393p2 != interfaceC5988b12.getType() ? (char) 1 : (char) 0);
                i10 = i11;
            }
        }
        InterfaceC5988b1 interfaceC5988b13 = cVar.f24062i;
        if (interfaceC5988b13 != null) {
            AbstractC2706r0 abstractC2706r0M9393p3 = c2663f2M9349c.m9393p(interfaceC5988b13.getType(), EnumC2691m2.f7043v);
            if (abstractC2706r0M9393p3 == null) {
                return null;
            }
            C7228n0 c7228n02 = new C7228n0(abstractC7237sMo419R0, new C0207d(abstractC7237sMo419R0, abstractC2706r0M9393p3, cVar.f24062i.getValue()), cVar.f24062i.getAnnotations());
            zArr[0] = (abstractC2706r0M9393p3 != cVar.f24062i.getType() ? (char) 1 : (char) 0) | (zArr[0] ? 1 : 0);
            c10 = 0;
            c7228n0 = c7228n02;
        } else {
            c10 = 0;
            c7228n0 = null;
        }
        InterfaceC5988b1 interfaceC5988b14 = cVar.f24063j;
        if (interfaceC5988b14 != null) {
            InterfaceC5988b1 interfaceC5988b1Mo7503c = interfaceC5988b14.mo7503c(c2663f2M9349c);
            if (interfaceC5988b1Mo7503c == null) {
                return null;
            }
            zArr[c10] = (zArr[c10] ? 1 : 0) | (interfaceC5988b1Mo7503c != cVar.f24063j ? (char) 1 : c10);
            interfaceC6056z = null;
            interfaceC5988b1 = interfaceC5988b1Mo7503c;
        } else {
            interfaceC6056z = null;
        }
        List listM28594V0 = m28594V0(abstractC7237sMo419R0, cVar.f24060g, c2663f2M9349c, cVar.f24069p, cVar.f24068o, zArr);
        if (listM28594V0 == null || (abstractC2706r0M9393p = c2663f2M9349c.m9393p(cVar.f24064k, EnumC2691m2.f7044w)) == null) {
            return interfaceC6056z;
        }
        boolean z10 = (zArr[c10] ? 1 : 0) | (abstractC2706r0M9393p != cVar.f24064k ? (char) 1 : c10);
        zArr[c10] = z10;
        if (z10 == 0 && cVar.f24076w) {
            return this;
        }
        abstractC7237sMo419R0.mo28569X0(c7228n0, interfaceC5988b1, arrayList2, arrayList, listM28594V0, abstractC2706r0M9393p, cVar.f24056c, cVar.f24057d);
        abstractC7237sMo419R0.m28608l1(this.f24027C);
        abstractC7237sMo419R0.m28606i1(this.f24028D);
        abstractC7237sMo419R0.m28603d1(this.f24029E);
        abstractC7237sMo419R0.m28607k1(this.f24030F);
        abstractC7237sMo419R0.m28611o1(this.f24031G);
        abstractC7237sMo419R0.m28610n1(this.f24036L);
        abstractC7237sMo419R0.m28602c1(this.f24032H);
        abstractC7237sMo419R0.m28601b1(this.f24033I);
        abstractC7237sMo419R0.mo421e1(this.f24037M);
        abstractC7237sMo419R0.m28605h1(cVar.f24070q);
        abstractC7237sMo419R0.m28604g1(cVar.f24073t);
        abstractC7237sMo419R0.mo422f1(cVar.f24075v != null ? cVar.f24075v.booleanValue() : this.f24038N);
        if (!cVar.f24074u.isEmpty() || this.f24044T != null) {
            Map map = cVar.f24074u;
            Map map2 = this.f24044T;
            if (map2 != null) {
                for (Map.Entry entry : map2.entrySet()) {
                    if (!map.containsKey(entry.getKey())) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (map.size() == 1) {
                abstractC7237sMo419R0.f24044T = Collections.singletonMap(map.keySet().iterator().next(), map.values().iterator().next());
            } else {
                abstractC7237sMo419R0.f24044T = map;
            }
        }
        if (cVar.f24067n || mo24120j0() != null) {
            abstractC7237sMo419R0.m28595j1((mo24120j0() != null ? mo24120j0() : this).mo7503c(c2663f2M9349c));
        }
        if (cVar.f24066m && !mo12664a().mo12674e().isEmpty()) {
            if (cVar.f24054a.mo7022f()) {
                InterfaceC0173a interfaceC0173a = this.f24040P;
                if (interfaceC0173a != null) {
                    abstractC7237sMo419R0.f24040P = interfaceC0173a;
                    return abstractC7237sMo419R0;
                }
                abstractC7237sMo419R0.mo12635B0(mo12674e());
                return abstractC7237sMo419R0;
            }
            abstractC7237sMo419R0.f24040P = new a(c2663f2M9349c);
        }
        return abstractC7237sMo419R0;
    }

    /* JADX INFO: renamed from: T0 */
    public final InterfaceC6003g1 m28597T0(boolean z10, InterfaceC6056z interfaceC6056z) {
        InterfaceC6003g1 source;
        if (z10) {
            if (interfaceC6056z == null) {
                interfaceC6056z = mo12664a();
            }
            source = interfaceC6056z.getSource();
        } else {
            source = InterfaceC6003g1.f18958a;
        }
        if (source == null) {
            m28592N(27);
        }
        return source;
    }

    /* JADX INFO: renamed from: U */
    public boolean mo7418U() {
        return this.f24031G;
    }

    /* JADX INFO: renamed from: W0 */
    public boolean mo420W0() {
        return this.f24037M;
    }

    /* JADX INFO: renamed from: X0 */
    public AbstractC7237s mo28569X0(InterfaceC5988b1 interfaceC5988b1, InterfaceC5988b1 interfaceC5988b12, List list, List list2, List list3, AbstractC2706r0 abstractC2706r0, EnumC5996e0 enumC5996e0, AbstractC6043u abstractC6043u) {
        if (list == null) {
            m28592N(5);
        }
        if (list2 == null) {
            m28592N(6);
        }
        if (list3 == null) {
            m28592N(7);
        }
        if (abstractC6043u == null) {
            m28592N(8);
        }
        this.f24045u = AbstractC5081g0.m20554X0(list2);
        this.f24046v = AbstractC5081g0.m20554X0(list3);
        this.f24047w = abstractC2706r0;
        this.f24025A = enumC5996e0;
        this.f24026B = abstractC6043u;
        this.f24049y = interfaceC5988b1;
        this.f24050z = interfaceC5988b12;
        this.f24048x = list;
        for (int i10 = 0; i10 < list2.size(); i10++) {
            InterfaceC6018l1 interfaceC6018l1 = (InterfaceC6018l1) list2.get(i10);
            if (interfaceC6018l1.getIndex() != i10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(interfaceC6018l1);
                int index = interfaceC6018l1.getIndex();
                sb2.append(" index is ");
                sb2.append(index);
                sb2.append(" but position is ");
                sb2.append(i10);
                throw new IllegalStateException(sb2.toString());
            }
        }
        for (int i11 = 0; i11 < list3.size(); i11++) {
            InterfaceC6039s1 interfaceC6039s1 = (InterfaceC6039s1) list3.get(i11);
            if (interfaceC6039s1.getIndex() != i11) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(interfaceC6039s1);
                int index2 = interfaceC6039s1.getIndex();
                sb3.append("index is ");
                sb3.append(index2);
                sb3.append(" but position is ");
                sb3.append(i11);
                throw new IllegalStateException(sb3.toString());
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: Y0 */
    public c m28598Y0(C2663f2 c2663f2) {
        if (c2663f2 == null) {
            m28592N(24);
        }
        return new c(this, c2663f2.m9389j(), mo7443b(), mo5592p(), mo5587g(), mo12678j(), mo12680m(), mo12685v0(), mo12682q0(), mo12675f(), null);
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m28599Z0() {
        InterfaceC0173a interfaceC0173a = this.f24040P;
        if (interfaceC0173a != null) {
            this.f24039O = (Collection) interfaceC0173a.invoke();
            this.f24040P = null;
        }
    }

    @Override // p273s9.AbstractC7227n, p273s9.AbstractC7225m, p229p9.InterfaceC6019m
    /* JADX INFO: renamed from: a */
    public InterfaceC6056z mo12664a() {
        InterfaceC6056z interfaceC6056z = this.f24041Q;
        InterfaceC6056z interfaceC6056zMo12664a = interfaceC6056z == this ? this : interfaceC6056z.mo12664a();
        if (interfaceC6056zMo12664a == null) {
            m28592N(20);
        }
        return interfaceC6056zMo12664a;
    }

    /* JADX INFO: renamed from: a1 */
    public void m28600a1(InterfaceC5983a.a aVar, Object obj) {
        if (this.f24044T == null) {
            this.f24044T = new LinkedHashMap();
        }
        this.f24044T.put(aVar, obj);
    }

    /* JADX INFO: renamed from: b1 */
    public void m28601b1(boolean z10) {
        this.f24033I = z10;
    }

    @Override // p229p9.InterfaceC6056z, p229p9.InterfaceC6009i1
    /* JADX INFO: renamed from: c */
    public InterfaceC6056z mo7503c(C2663f2 c2663f2) {
        if (c2663f2 == null) {
            m28592N(22);
        }
        return c2663f2.m9390k() ? this : m28598Y0(c2663f2).mo12654p(mo12664a()).mo12643e().m28630J(true).build();
    }

    /* JADX INFO: renamed from: c1 */
    public void m28602c1(boolean z10) {
        this.f24032H = z10;
    }

    /* JADX INFO: renamed from: d1 */
    public void m28603d1(boolean z10) {
        this.f24029E = z10;
    }

    /* JADX INFO: renamed from: e */
    public Collection mo12674e() {
        m28599Z0();
        Collection collection = this.f24039O;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection == null) {
            m28592N(14);
        }
        return collection;
    }

    /* JADX INFO: renamed from: e1 */
    public void mo421e1(boolean z10) {
        this.f24037M = z10;
    }

    @Override // p229p9.InterfaceC5983a
    /* JADX INFO: renamed from: f */
    public AbstractC2706r0 mo12675f() {
        return this.f24047w;
    }

    /* JADX INFO: renamed from: f1 */
    public void mo422f1(boolean z10) {
        this.f24038N = z10;
    }

    @Override // p229p9.InterfaceC6031q
    /* JADX INFO: renamed from: g */
    public AbstractC6043u mo5587g() {
        AbstractC6043u abstractC6043u = this.f24026B;
        if (abstractC6043u == null) {
            m28592N(16);
        }
        return abstractC6043u;
    }

    /* JADX INFO: renamed from: g1 */
    public final void m28604g1(boolean z10) {
        this.f24035K = z10;
    }

    @Override // p229p9.InterfaceC5983a
    public List getTypeParameters() {
        List list = this.f24045u;
        if (list != null) {
            return list;
        }
        C6494d0.m25749a("typeParameters == null for ", this);
        return null;
    }

    /* JADX INFO: renamed from: h1 */
    public final void m28605h1(boolean z10) {
        this.f24034J = z10;
    }

    /* JADX INFO: renamed from: i1 */
    public void m28606i1(boolean z10) {
        this.f24028D = z10;
    }

    @Override // p229p9.InterfaceC5986b
    /* JADX INFO: renamed from: j */
    public InterfaceC5986b.a mo12678j() {
        InterfaceC5986b.a aVar = this.f24042R;
        if (aVar == null) {
            m28592N(21);
        }
        return aVar;
    }

    @Override // p229p9.InterfaceC6056z
    /* JADX INFO: renamed from: j0 */
    public InterfaceC6056z mo24120j0() {
        return this.f24043S;
    }

    /* JADX INFO: renamed from: k */
    public boolean mo7422k() {
        return this.f24030F;
    }

    @Override // p229p9.InterfaceC5983a
    /* JADX INFO: renamed from: k0 */
    public InterfaceC5988b1 mo12679k0() {
        return this.f24050z;
    }

    /* JADX INFO: renamed from: k1 */
    public void m28607k1(boolean z10) {
        this.f24030F = z10;
    }

    /* JADX INFO: renamed from: l1 */
    public void m28608l1(boolean z10) {
        this.f24027C = z10;
    }

    @Override // p229p9.InterfaceC5983a
    /* JADX INFO: renamed from: m */
    public List mo12680m() {
        List list = this.f24046v;
        if (list == null) {
            m28592N(19);
        }
        return list;
    }

    /* JADX INFO: renamed from: m1 */
    public void m28609m1(AbstractC2706r0 abstractC2706r0) {
        if (abstractC2706r0 == null) {
            m28592N(11);
        }
        this.f24047w = abstractC2706r0;
    }

    /* JADX INFO: renamed from: n */
    public boolean mo7423n() {
        return this.f24036L;
    }

    /* JADX INFO: renamed from: n1 */
    public void m28610n1(boolean z10) {
        this.f24036L = z10;
    }

    /* JADX INFO: renamed from: o1 */
    public void m28611o1(boolean z10) {
        this.f24031G = z10;
    }

    @Override // p229p9.InterfaceC5993d0
    /* JADX INFO: renamed from: p */
    public EnumC5996e0 mo5592p() {
        EnumC5996e0 enumC5996e0 = this.f24025A;
        if (enumC5996e0 == null) {
            m28592N(15);
        }
        return enumC5996e0;
    }

    /* JADX INFO: renamed from: p1 */
    public void m28612p1(AbstractC6043u abstractC6043u) {
        if (abstractC6043u == null) {
            m28592N(10);
        }
        this.f24026B = abstractC6043u;
    }

    @Override // p229p9.InterfaceC5983a
    /* JADX INFO: renamed from: q0 */
    public InterfaceC5988b1 mo12682q0() {
        return this.f24049y;
    }

    @Override // p229p9.InterfaceC6056z
    /* JADX INFO: renamed from: u */
    public boolean mo24121u() {
        if (this.f24027C) {
            return true;
        }
        Iterator it = mo12664a().mo12674e().iterator();
        while (it.hasNext()) {
            if (((InterfaceC6056z) it.next()).mo24121u()) {
                return true;
            }
        }
        return false;
    }

    @Override // p229p9.InterfaceC5983a
    /* JADX INFO: renamed from: v0 */
    public List mo12685v0() {
        List list = this.f24048x;
        if (list == null) {
            m28592N(13);
        }
        return list;
    }

    /* JADX INFO: renamed from: y */
    public InterfaceC6056z.a mo12638y() {
        c cVarM28598Y0 = m28598Y0(C2663f2.f6989b);
        if (cVarM28598Y0 == null) {
            m28592N(23);
        }
        return cVarM28598Y0;
    }
}
