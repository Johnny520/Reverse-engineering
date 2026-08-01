package p193;

import android.text.Layout;
import android.text.TextPaint;
import androidx.appcompat.app.C0108;
import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.ui.text.C2031;
import androidx.compose.ui.text.InterfaceC2063;
import androidx.compose.ui.text.font.InterfaceC1996;
import bsh.C2632;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import p048.C6518;
import p167.C7712;
import p205.InterfaceC7895;
import p212.AbstractC7947;
import p212.C7940;
import p212.C7944;
import top.suzhelan.qstory.hook.item.chat.C5851;

/* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7820 implements InterfaceC2063 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final int f21351;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final boolean f21352;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public C0108 f21353;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC1996 f21354;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final List f21355;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final CharSequence f21356;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C7940 f21357;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC7895 f21358;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C7819 f21359;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C2031 f21360;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final List f21361;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f21362;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x083a  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0864 A[LOOP:6: B:416:0x0862->B:417:0x0864, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0875  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C7820(java.lang.String r42, androidx.compose.ui.text.C2031 r43, java.util.List r44, java.util.List r45, androidx.compose.ui.text.font.InterfaceC1996 r46, p205.InterfaceC7895 r47) {
        /*
            Method dump skipped, instruction units count: 2234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p193.C7820.<init>(java.lang.String, androidx.compose.ui.text.飘花落叶言子世哲兰楪苏, java.util.List, java.util.List, androidx.compose.ui.text.font.飘花落叶言子楪苏哲兰世, 飘花落叶言子苏哲世楪兰.飘花落叶言子楪世哲苏兰):void");
    }

    @Override // androidx.compose.ui.text.InterfaceC2063
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final float mo2143() {
        return this.f21357.m13398();
    }

    @Override // androidx.compose.ui.text.InterfaceC2063
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo2144() {
        C7940 c7940 = this.f21357;
        float f = c7940.f21980;
        TextPaint textPaint = c7940.f21983;
        if (!Float.isNaN(f)) {
            return c7940.f21980;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = c7940.f21984;
        lineInstance.setText(new C7944(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, AbstractC7947.f22000);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new C6518(i, next, 1));
            } else {
                C6518 c6518 = (C6518) priorityQueue.peek();
                if (c6518 != null && c6518.f17820 - c6518.f17822 < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new C6518(i, next, 1));
                }
            }
            i = next;
        }
        float desiredWidth = 0.0f;
        if (!priorityQueue.isEmpty()) {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                C2632.m5291();
                return 0.0f;
            }
            C6518 c65182 = (C6518) it.next();
            desiredWidth = Layout.getDesiredWidth(c7940.m13399(), c65182.f17822, c65182.f17820, textPaint);
            while (it.hasNext()) {
                C6518 c65183 = (C6518) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(c7940.m13399(), c65183.f17822, c65183.f17820, textPaint));
            }
        }
        c7940.f21980 = desiredWidth;
        return desiredWidth;
    }

    @Override // androidx.compose.ui.text.InterfaceC2063
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo2145() {
        C0108 c0108 = this.f21353;
        if (c0108 != null ? c0108.m375() : false) {
            return true;
        }
        if (!this.f21352 && AbstractC7829.m13167(this.f21360)) {
            C5851 c5851 = C7828.f21372;
            C5851 c58512 = C7828.f21372;
            InterfaceC1333 interfaceC1333M11196 = (InterfaceC1333) c58512.f16007;
            if (interfaceC1333M11196 == null) {
                if (C7712.m12979()) {
                    interfaceC1333M11196 = c58512.m11196();
                    c58512.f16007 = interfaceC1333M11196;
                } else {
                    interfaceC1333M11196 = AbstractC7829.f21373;
                }
            }
            if (((Boolean) interfaceC1333M11196.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
