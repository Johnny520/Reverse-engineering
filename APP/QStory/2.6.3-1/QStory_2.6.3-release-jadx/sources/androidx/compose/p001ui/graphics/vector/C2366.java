package androidx.compose.p001ui.graphics.vector;

import android.graphics.Bitmap;
import androidx.appcompat.app.C0955;
import androidx.appcompat.app.C0960;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.C2430;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.p001ui.graphics.C2442;
import androidx.compose.p001ui.graphics.C2445;
import androidx.compose.p001ui.graphics.InterfaceC2436;
import androidx.compose.p001ui.graphics.drawscope.C2342;
import androidx.compose.p001ui.graphics.drawscope.C2343;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2339;
import androidx.compose.p001ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2230;
import kotlin.C6008;
import kotlin.collections.EmptyList;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p128.C8155;
import p221.InterfaceC8725;
import p226.AbstractC8765;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2366 extends AbstractC2367 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public InterfaceC7372 f4789;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C2383 f4790;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f4791;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public String f4792;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2381 f4793;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final InterfaceC7387 f4794;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C2442 f4795;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC2230 f4796;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public float f4797;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public float f4798;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC2230 f4799;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public long f4800;

    public C2366(C2381 c2381) {
        this.f4793 = c2381;
        c2381.f4876 = new InterfaceC7387() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$1
            {
                super(1);
            }

            public final void invoke(AbstractC2367 abstractC2367) {
                C2366 c2366 = this.this$0;
                c2366.f4791 = true;
                c2366.f4789.invoke();
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractC2367) obj);
                return C6008.f15084;
            }
        };
        this.f4792 = "";
        this.f4791 = true;
        this.f4790 = new C2383();
        this.f4789 = new InterfaceC7372() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$invalidateCallback$1
            @Override // p068.InterfaceC7372
            public /* bridge */ /* synthetic */ Object invoke() {
                m3372invoke();
                return C6008.f15084;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3372invoke() {
            }
        };
        this.f4796 = AbstractC2202.m3034(null);
        this.f4799 = AbstractC2202.m3034(new C8155(0L));
        this.f4800 = 9205357640488583168L;
        this.f4797 = 1.0f;
        this.f4798 = 1.0f;
        this.f4794 = new InterfaceC7387() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$drawVectorBlock$1
            {
                super(1);
            }

            public final void invoke(InterfaceC2339 interfaceC2339) {
                C2366 c2366 = this.this$0;
                C2381 c23812 = c2366.f4793;
                float f = c2366.f4797;
                float f2 = c2366.f4798;
                C0955 c0955Mo3266 = interfaceC2339.mo3266();
                long jM928 = c0955Mo3266.m928();
                c0955Mo3266.m946().mo3237();
                try {
                    ((C0960) c0955Mo3266.f664).m993(f, f2, 0L);
                    c23812.mo3378(interfaceC2339);
                } finally {
                    c0955Mo3266.m946().mo3249();
                    c0955Mo3266.m921(jM928);
                }
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC2339) obj);
                return C6008.f15084;
            }
        };
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.f4792);
        sb.append("\n\tviewportWidth: ");
        InterfaceC2230 interfaceC2230 = this.f4799;
        sb.append(Float.intBitsToFloat((int) (((C8155) ((AbstractC2182) interfaceC2230).getValue()).f19872 >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((C8155) ((AbstractC2182) interfaceC2230).getValue()).f19872 & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3377(InterfaceC2339 interfaceC2339, float f, C2442 c2442) {
        int i;
        C2442 c24422;
        char c;
        long j;
        C2442 c24423;
        int i2;
        int i3;
        C2381 c2381 = this.f4793;
        boolean z = c2381.f4862;
        InterfaceC2230 interfaceC2230 = this.f4796;
        if (!z || c2381.f4861 == 16) {
            i = 0;
        } else {
            C2442 c24424 = (C2442) ((AbstractC2182) interfaceC2230).getValue();
            EmptyList emptyList = AbstractC2374.f4814;
            if (!(c24424 instanceof C2442) ? c24424 == null : !((i3 = c24424.f5055) != 5 && i3 != 3)) {
                if (!(c2442 instanceof C2442) ? c2442 == null : !((i2 = c2442.f5055) != 5 && i2 != 3)) {
                    i = 1;
                }
            }
        }
        boolean z2 = this.f4791;
        C2383 c2383 = this.f4790;
        if (z2 || !C8155.m13074(this.f4800, interfaceC2339.mo3265())) {
            if (i == 1) {
                long jM3510 = c2381.f4861;
                EmptyList emptyList2 = AbstractC2374.f4814;
                if (C2434.m3508(jM3510) != 1.0f) {
                    jM3510 = C2434.m3510(1.0f, jM3510);
                }
                c24422 = new C2442(jM3510, 5);
            } else {
                c24422 = null;
            }
            this.f4795 = c24422;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC2339.mo3265() >> 32));
            InterfaceC2230 interfaceC22302 = this.f4799;
            this.f4797 = fIntBitsToFloat / Float.intBitsToFloat((int) (((C8155) ((AbstractC2182) interfaceC22302).getValue()).f19872 >> 32));
            this.f4798 = Float.intBitsToFloat((int) (interfaceC2339.mo3265() & 4294967295L)) / Float.intBitsToFloat((int) (((C8155) ((AbstractC2182) interfaceC22302).getValue()).f19872 & 4294967295L));
            long jCeil = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC2339.mo3265() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC2339.mo3265() & 4294967295L))))) & 4294967295L);
            LayoutDirection layoutDirection = interfaceC2339.getLayoutDirection();
            C2445 c2445M3457 = c2383.f4884;
            C2430 c2430M3444 = c2383.f4883;
            if (c2445M3457 == null || c2430M3444 == null) {
                c = ' ';
                j = 4294967295L;
            } else {
                int i4 = (int) (jCeil >> 32);
                Bitmap bitmap = c2445M3457.f5064;
                c = ' ';
                j = 4294967295L;
                if (i4 > bitmap.getWidth() || ((int) (jCeil & 4294967295L)) > bitmap.getHeight() || c2383.f4881 != i) {
                }
                c2383.f4882 = jCeil;
                C2342 c2342 = c2383.f4880;
                long jM1700 = AbstractC1298.m1700(jCeil);
                C2343 c2343 = c2342.f4631;
                InterfaceC8725 interfaceC8725 = c2343.f4635;
                LayoutDirection layoutDirection2 = c2343.f4634;
                InterfaceC2436 interfaceC2436 = c2343.f4633;
                C2430 c2430 = c2430M3444;
                long j2 = c2343.f4632;
                c2343.f4635 = interfaceC2339;
                c2343.f4634 = layoutDirection;
                c2343.f4633 = c2430;
                c2343.f4632 = jM1700;
                c2430.mo3237();
                InterfaceC2339.m3256(c2342, C2434.f5041, 0L, 0.0f, null, 62);
                this.f4794.invoke(c2342);
                c2430.mo3249();
                C2343 c23432 = c2342.f4631;
                c23432.f4635 = interfaceC8725;
                c23432.f4634 = layoutDirection2;
                c23432.f4633 = interfaceC2436;
                c23432.f4632 = j2;
                c2445M3457.f5064.prepareToDraw();
                this.f4791 = false;
                this.f4800 = interfaceC2339.mo3265();
            }
            c2445M3457 = AbstractC2416.m3457((int) (jCeil >> c), (int) (jCeil & j), i);
            c2430M3444 = AbstractC2416.m3444(c2445M3457);
            c2383.f4884 = c2445M3457;
            c2383.f4883 = c2430M3444;
            c2383.f4881 = i;
            c2383.f4882 = jCeil;
            C2342 c23422 = c2383.f4880;
            long jM17002 = AbstractC1298.m1700(jCeil);
            C2343 c23433 = c23422.f4631;
            InterfaceC8725 interfaceC87252 = c23433.f4635;
            LayoutDirection layoutDirection22 = c23433.f4634;
            InterfaceC2436 interfaceC24362 = c23433.f4633;
            C2430 c24302 = c2430M3444;
            long j22 = c23433.f4632;
            c23433.f4635 = interfaceC2339;
            c23433.f4634 = layoutDirection;
            c23433.f4633 = c24302;
            c23433.f4632 = jM17002;
            c24302.mo3237();
            InterfaceC2339.m3256(c23422, C2434.f5041, 0L, 0.0f, null, 62);
            this.f4794.invoke(c23422);
            c24302.mo3249();
            C2343 c234322 = c23422.f4631;
            c234322.f4635 = interfaceC87252;
            c234322.f4634 = layoutDirection22;
            c234322.f4633 = interfaceC24362;
            c234322.f4632 = j22;
            c2445M3457.f5064.prepareToDraw();
            this.f4791 = false;
            this.f4800 = interfaceC2339.mo3265();
        } else {
            C2445 c2445 = c2383.f4884;
            if (i != (c2445 != null ? c2445.m3535() : 0)) {
            }
        }
        if (c2442 != null) {
            c24423 = c2442;
        } else {
            c24423 = ((C2442) ((AbstractC2182) interfaceC2230).getValue()) != null ? (C2442) ((AbstractC2182) interfaceC2230).getValue() : this.f4795;
        }
        C2445 c24452 = c2383.f4884;
        if (c24452 == null) {
            AbstractC8765.m13982("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        InterfaceC2339.m3259(interfaceC2339, c24452, c2383.f4882, 0L, f, c24423, 0, 858);
    }

    @Override // androidx.compose.p001ui.graphics.vector.AbstractC2367
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo3378(InterfaceC2339 interfaceC2339) {
        m3377(interfaceC2339, 1.0f, null);
    }
}
