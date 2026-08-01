package androidx.compose.foundation.gestures;

import androidx.appcompat.app.C0923;
import androidx.compose.p001ui.input.pointer.C2467;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.C2487;
import com.alibaba.fastjson2.AbstractC3738;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.collections.AbstractC5176;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.sequences.C5960;
import kotlinx.coroutines.C6249;
import kotlinx.coroutines.channels.AbstractC6037;
import kotlinx.coroutines.channels.C6022;
import kotlinx.coroutines.channels.C6042;
import p068.InterfaceC7383;
import p069.AbstractC7390;
import p123.C8141;
import p221.C8731;
import p221.InterfaceC8725;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1345 extends AbstractC1397 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C6022 f1846;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C6249 f1847;

    public C1345(C1343 c1343, InterfaceC7383 interfaceC7383, InterfaceC8725 interfaceC8725) {
        super(c1343, interfaceC7383, interfaceC8725);
        this.f1846 = AbstractC6037.m10841(Integer.MAX_VALUE, 6, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C1346 m1842(C6022 c6022) {
        C1346 c1346 = null;
        C5960 c5960M12604 = AbstractC7390.m12604(new NonTouchScrollingLogicKt$untilNull$1(new C1399(c6022, 1), null));
        while (c5960M12604.hasNext()) {
            C1346 c1346M1845 = (C1346) c5960M12604.next();
            if (c1346 != null) {
                c1346M1845 = c1346.m1845(c1346M1845);
            }
            c1346 = c1346M1845;
        }
        return c1346;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00dc, code lost:
    
        if (r0.invoke(r3, r4) == r5) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Type inference failed for: r1v9, types: [T, androidx.compose.foundation.gestures.飘花落叶言子哲兰苏楪世] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1843(C1345 c1345, C1343 c1343, C1346 c1346, ContinuationImpl continuationImpl) {
        TrackpadScrollingLogic$dispatchTrackpadScroll$1 trackpadScrollingLogic$dispatchTrackpadScroll$1;
        c1345.getClass();
        C0923 c0923 = c1345.f1946;
        if (continuationImpl instanceof TrackpadScrollingLogic$dispatchTrackpadScroll$1) {
            trackpadScrollingLogic$dispatchTrackpadScroll$1 = (TrackpadScrollingLogic$dispatchTrackpadScroll$1) continuationImpl;
            int i = trackpadScrollingLogic$dispatchTrackpadScroll$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackpadScrollingLogic$dispatchTrackpadScroll$1.label = i - Integer.MIN_VALUE;
            } else {
                trackpadScrollingLogic$dispatchTrackpadScroll$1 = new TrackpadScrollingLogic$dispatchTrackpadScroll$1(c1345, continuationImpl);
            }
        }
        Object obj = trackpadScrollingLogic$dispatchTrackpadScroll$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = trackpadScrollingLogic$dispatchTrackpadScroll$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = c1346;
            long j = c1346.f1849;
            long j2 = c1346.f1850;
            ((C8141) c0923.f572).m13067(Float.intBitsToFloat((int) (j2 >> 32)), j);
            ((C8141) c0923.f573).m13067(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
            C1346 c1346M1842 = m1842(c1345.f1846);
            if (c1346M1842 != null) {
                long j3 = c1346M1842.f1849;
                long j4 = c1346M1842.f1850;
                ((C8141) c0923.f572).m13067(Float.intBitsToFloat((int) (j4 >> 32)), j3);
                ((C8141) c0923.f573).m13067(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
                ref$ObjectRef.element = ((C1346) ref$ObjectRef.element).m1845(c1346M1842);
            }
            InterfaceC7383 trackpadScrollingLogic$dispatchTrackpadScroll$3 = new TrackpadScrollingLogic$dispatchTrackpadScroll$3(c1345, c1343, ref$ObjectRef, null);
            trackpadScrollingLogic$dispatchTrackpadScroll$1.label = 1;
            if (c1345.m1911(trackpadScrollingLogic$dispatchTrackpadScroll$3, trackpadScrollingLogic$dispatchTrackpadScroll$1) != obj2) {
            }
            return obj2;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC6017.m10769(obj);
                return C6008.f15084;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        InterfaceC7383 interfaceC7383 = c1345.f1949;
        C8731 c8731 = new C8731(AbstractC3738.m6871(((C8141) c0923.f572).m13066(Float.MAX_VALUE), ((C8141) c0923.f573).m13066(Float.MAX_VALUE)));
        trackpadScrollingLogic$dispatchTrackpadScroll$1.label = 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m1844(C2487 c2487) {
        boolean z;
        boolean z2;
        boolean z3;
        C6022 c6022;
        C1343 c1343;
        C2478 c2478 = (C2478) AbstractC5176.m9374(c2487.f5197);
        if (c2478 != null) {
            List listM3583 = c2478.m3583();
            int size = listM3583.size();
            int i = 0;
            z3 = false;
            while (true) {
                c6022 = this.f1846;
                c1343 = this.f1950;
                if (i >= size) {
                    break;
                }
                C2467 c2467 = (C2467) listM3583.get(i);
                long j = c2467.f5120 ^ (-9223372034707292160L);
                if (!(c1343.m1830(c1343.m1823(j)) == 0.0f)) {
                    z3 = !(c6022.mo8995(new C1346(j, c2467.f5123, false)) instanceof C6042) || z3;
                }
                i++;
            }
            z = true;
            z2 = false;
            long j2 = c2478.f5163 ^ (-9223372034707292160L);
            boolean z4 = c2487.f5192 == 12;
            if (!(c1343.m1830(c1343.m1823(j2)) == 0.0f) || z4) {
                if (!(c6022.mo8995(new C1346(j2, c2478.f5153, z4)) instanceof C6042) || z3) {
                    z3 = true;
                }
            }
            return (!z3 || this.f1947) ? z : z2;
        }
        z = true;
        z2 = false;
        z3 = z2;
        if (z3) {
        }
    }
}
