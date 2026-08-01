package p185m8;

import java.util.Iterator;
import p010a9.InterfaceC0188p;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p257r8.AbstractC6542k;
import sb.AbstractC7284j;
import sb.AbstractC7285k;

/* JADX INFO: renamed from: m8.d1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5074d1 {

    /* JADX INFO: renamed from: m8.d1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6542k implements InterfaceC0188p {

        /* JADX INFO: renamed from: A */
        public final /* synthetic */ int f15374A;

        /* JADX INFO: renamed from: B */
        public final /* synthetic */ Iterator f15375B;

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ boolean f15376C;

        /* JADX INFO: renamed from: D */
        public final /* synthetic */ boolean f15377D;

        /* JADX INFO: renamed from: r */
        public Object f15378r;

        /* JADX INFO: renamed from: s */
        public Object f15379s;

        /* JADX INFO: renamed from: t */
        public Object f15380t;

        /* JADX INFO: renamed from: u */
        public int f15381u;

        /* JADX INFO: renamed from: v */
        public int f15382v;

        /* JADX INFO: renamed from: w */
        public int f15383w;

        /* JADX INFO: renamed from: x */
        public int f15384x;

        /* JADX INFO: renamed from: y */
        public /* synthetic */ Object f15385y;

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ int f15386z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, int i11, Iterator it, boolean z10, boolean z11, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f15386z = i10;
            this.f15374A = i11;
            this.f15375B = it;
            this.f15376C = z10;
            this.f15377D = z11;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            a aVar = new a(this.f15386z, this.f15374A, this.f15375B, this.f15376C, this.f15377D, interfaceC5976f);
            aVar.f15385y = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0159  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x017f  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00c6 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b0 -> B:17:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0142 -> B:60:0x0145). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0176 -> B:73:0x0179). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p257r8.AbstractC6532a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 421
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p185m8.AbstractC5074d1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC7284j abstractC7284j, InterfaceC5976f interfaceC5976f) {
            return ((a) create(abstractC7284j, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m20514a(int i10, int i11) {
        String str;
        if (i10 <= 0 || i11 <= 0) {
            if (i10 != i11) {
                str = "Both size " + i10 + " and step " + i11 + " must be greater than zero.";
            } else {
                str = "size " + i10 + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Iterator m20515b(Iterator it, int i10, int i11, boolean z10, boolean z11) {
        it.getClass();
        return !it.hasNext() ? C5083h0.f15398q : AbstractC7285k.m28873a(new a(i10, i11, it, z11, z10, null));
    }
}
