package p193;

import android.text.Layout;
import android.text.TextPaint;
import androidx.appcompat.app.C0108;
import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.ui.text.C2031;
import androidx.compose.ui.text.InterfaceC2063;
import androidx.compose.ui.text.font.InterfaceC1996;
import bsh.C2633;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import p048.C6519;
import p167.C7713;
import p205.InterfaceC7896;
import p212.AbstractC7948;
import p212.C7941;
import p212.C7945;
import top.suzhelan.qstory.hook.item.chat.C5856;

/* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7821 implements InterfaceC2063 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final int f21348;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final boolean f21349;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public C0108 f21350;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC1996 f21351;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final List f21352;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final CharSequence f21353;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C7941 f21354;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC7896 f21355;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C7820 f21356;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C2031 f21357;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final List f21358;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f21359;

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
    public C7821(java.lang.String r42, androidx.compose.ui.text.C2031 r43, java.util.List r44, java.util.List r45, androidx.compose.ui.text.font.InterfaceC1996 r46, p205.InterfaceC7896 r47) {
        /*
            Method dump skipped, instruction units count: 2234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p193.C7821.<init>(java.lang.String, androidx.compose.ui.text.飘花落叶言子世哲兰楪苏, java.util.List, java.util.List, androidx.compose.ui.text.font.飘花落叶言子楪苏哲兰世, 飘花落叶言子苏哲世楪兰.飘花落叶言子楪世哲苏兰):void");
    }

    @Override // androidx.compose.ui.text.InterfaceC2063
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final float mo2153() {
        return this.f21354.m13426();
    }

    @Override // androidx.compose.ui.text.InterfaceC2063
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo2154() {
        C7941 c7941 = this.f21354;
        float f = c7941.f21977;
        TextPaint textPaint = c7941.f21980;
        if (!Float.isNaN(f)) {
            return c7941.f21977;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = c7941.f21981;
        lineInstance.setText(new C7945(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, AbstractC7948.f21997);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new C6519(i, next, 1));
            } else {
                C6519 c6519 = (C6519) priorityQueue.peek();
                if (c6519 != null && c6519.f17816 - c6519.f17818 < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new C6519(i, next, 1));
                }
            }
            i = next;
        }
        float desiredWidth = 0.0f;
        if (!priorityQueue.isEmpty()) {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                C2633.m5336();
                return 0.0f;
            }
            C6519 c65192 = (C6519) it.next();
            desiredWidth = Layout.getDesiredWidth(c7941.m13427(), c65192.f17818, c65192.f17816, textPaint);
            while (it.hasNext()) {
                C6519 c65193 = (C6519) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(c7941.m13427(), c65193.f17818, c65193.f17816, textPaint));
            }
        }
        c7941.f21977 = desiredWidth;
        return desiredWidth;
    }

    @Override // androidx.compose.ui.text.InterfaceC2063
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo2155() {
        C0108 c0108 = this.f21350;
        if (c0108 != null ? c0108.m376() : false) {
            return true;
        }
        if (!this.f21349 && AbstractC7830.m13195(this.f21357)) {
            C5856 c5856 = C7829.f21369;
            C5856 c58562 = C7829.f21369;
            InterfaceC1333 interfaceC1333M11258 = (InterfaceC1333) c58562.f16014;
            if (interfaceC1333M11258 == null) {
                if (C7713.m13009()) {
                    interfaceC1333M11258 = c58562.m11258();
                    c58562.f16014 = interfaceC1333M11258;
                } else {
                    interfaceC1333M11258 = AbstractC7830.f21370;
                }
            }
            if (((Boolean) interfaceC1333M11258.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
