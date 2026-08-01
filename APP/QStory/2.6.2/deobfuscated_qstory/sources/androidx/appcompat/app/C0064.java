package androidx.appcompat.app;

import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C0197;
import androidx.appcompat.widget.C0203;
import com.bumptech.glide.load.engine.C2985;
import com.bumptech.glide.load.engine.InterfaceC2988;
import com.typesafe.config.impl.AbstractC3821;
import com.typesafe.config.impl.C3822;
import com.typesafe.config.impl.C3823;
import com.typesafe.config.impl.C3825;
import com.typesafe.config.impl.C3826;
import com.typesafe.config.impl.C3836;
import com.typesafe.config.impl.C3837;
import kotlinx.serialization.json.internal.AbstractC5484;
import p152.C7590;
import p190.InterfaceC7788;
import p190.MenuC7801;
import p250.InterfaceC8160;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C0064 implements InterfaceC7788 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f138;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f139;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f140;

    public C0064(int i) {
        this.f140 = i;
        switch (i) {
            case 2:
                this.f139 = new StringBuilder();
                this.f138 = false;
                break;
            default:
                this.f139 = new Handler(Looper.getMainLooper(), new C2985(0));
                break;
        }
    }

    public String toString() {
        switch (this.f140) {
            case 3:
                return this.f138 ? "FALL_THROUGH" : String.valueOf(this.f139);
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m185(int r7, java.lang.CharSequence r8) {
        /*
            r6 = this;
            r0 = 0
            if (r8 == 0) goto L45
            if (r7 < 0) goto L45
            int r1 = r8.length()
            int r1 = r1 - r7
            if (r1 < 0) goto L45
            java.lang.Object r1 = r6.f139
            飘花落叶言子哲世楪兰苏.飘花落叶言子楪世兰苏哲 r1 = (p152.C7590) r1
            if (r1 != 0) goto L17
            boolean r6 = r6.m187()
            return r6
        L17:
            r1 = 2
            r2 = r0
            r3 = r1
        L1a:
            r4 = 1
            if (r2 >= r7) goto L3a
            if (r3 != r1) goto L3a
            char r3 = r8.charAt(r2)
            byte r3 = java.lang.Character.getDirectionality(r3)
            androidx.appcompat.app.飘花落叶言子世兰苏哲楪 r5 = p152.AbstractC7589.f20581
            if (r3 == 0) goto L36
            if (r3 == r4) goto L34
            if (r3 == r1) goto L34
            switch(r3) {
                case 14: goto L36;
                case 15: goto L36;
                case 16: goto L34;
                case 17: goto L34;
                default: goto L32;
            }
        L32:
            r3 = r1
            goto L37
        L34:
            r3 = r0
            goto L37
        L36:
            r3 = r4
        L37:
            int r2 = r2 + 1
            goto L1a
        L3a:
            if (r3 == 0) goto L44
            if (r3 == r4) goto L43
            boolean r6 = r6.m187()
            return r6
        L43:
            return r0
        L44:
            return r4
        L45:
            top.suzhelan.qstory.hook.item.C5919.m11245()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0064.m185(int, java.lang.CharSequence):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void mo186() {
        this.f138 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean m187() {
        return this.f138;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C3836 m188(InterfaceC8160 interfaceC8160, int i) {
        C3836 c3825;
        StringBuilder sb = (StringBuilder) this.f139;
        if (sb.length() <= 0) {
            return null;
        }
        if (this.f138) {
            C3837 c3837M8224 = ((C3837) interfaceC8160).m8224(i);
            String string = sb.toString();
            C3836 c3836 = AbstractC3821.f12014;
            c3825 = new C3822(c3837M8224, string);
        } else {
            C3837 c3837M82242 = ((C3837) interfaceC8160).m8224(i);
            String string2 = sb.toString();
            C3836 c38362 = AbstractC3821.f12014;
            c3825 = new C3825(c3837M82242, string2);
        }
        sb.setLength(0);
        return c3825;
    }

    @Override // p190.InterfaceC7788
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void mo189(MenuC7801 menuC7801, boolean z) {
        C0197 c0197;
        C0060 c0060 = (C0060) this.f139;
        if (this.f138) {
            return;
        }
        this.f138 = true;
        ActionMenuView actionMenuView = c0060.f127.f612.f511;
        if (actionMenuView != null && (c0197 = actionMenuView.f457) != null) {
            c0197.m703();
            C0203 c0203 = c0197.f783;
            if (c0203 != null && c0203.m13117()) {
                c0203.f21198.dismiss();
            }
        }
        c0060.f126.onPanelClosed(108, menuC7801);
        this.f138 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C3836 m190(C3836 c3836, InterfaceC8160 interfaceC8160, int i) {
        C3836 c38362 = AbstractC3821.f12014;
        if (!(c3836 instanceof C3826) && !(c3836 instanceof C3822) && !(c3836 instanceof C3823)) {
            this.f138 = false;
            return m188(interfaceC8160, i);
        }
        C3836 c3836M188 = m188(interfaceC8160, i);
        if (!this.f138) {
            this.f138 = true;
        }
        return c3836M188;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public void mo191(String str) {
        byte b;
        str.getClass();
        C0107 c0107 = (C0107) this.f139;
        c0107.m336(c0107.f314, str.length() + 2);
        char[] cArr = (char[]) c0107.f315;
        int i = c0107.f314;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c = cArr[i4];
            byte[] bArr = AbstractC5484.f15163;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i5 = i4 - i2; i5 < length2; i5++) {
                    c0107.m336(i4, 2);
                    char cCharAt = str.charAt(i5);
                    byte[] bArr2 = AbstractC5484.f15163;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        ((char[]) c0107.f315)[i4] = cCharAt;
                        i4 = i6;
                    } else {
                        if (b == 1) {
                            String str2 = AbstractC5484.f15164[cCharAt];
                            str2.getClass();
                            c0107.m336(i4, str2.length());
                            str2.getChars(0, str2.length(), (char[]) c0107.f315, i4);
                            int length3 = str2.length() + i4;
                            c0107.f314 = length3;
                            i4 = length3;
                        } else {
                            char[] cArr2 = (char[]) c0107.f315;
                            cArr2[i4] = '\\';
                            cArr2[i4 + 1] = (char) b;
                            i4 += 2;
                            c0107.f314 = i4;
                        }
                    }
                }
                c0107.m336(i4, 1);
                ((char[]) c0107.f315)[i4] = '\"';
                c0107.f314 = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = '\"';
        c0107.f314 = i3 + 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public void mo192(short s) {
        ((C0107) this.f139).m344(String.valueOf(s));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public synchronized void m195(InterfaceC2988 interfaceC2988, boolean z) {
        try {
            if (this.f138 || z) {
                ((Handler) this.f139).obtainMessage(1, interfaceC2988).sendToTarget();
            } else {
                this.f138 = true;
                interfaceC2988.recycle();
                this.f138 = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p190.InterfaceC7788
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean mo196(MenuC7801 menuC7801) {
        ((C0060) this.f139).f126.onMenuOpened(108, menuC7801);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public void mo197() {
        this.f138 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void mo198() {
        this.f138 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public void mo199(int i) {
        ((C0107) this.f139).m344(String.valueOf(i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public void mo200(long j) {
        ((C0107) this.f139).m344(String.valueOf(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public void mo201(byte b) {
        ((C0107) this.f139).m344(String.valueOf(b));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public void m202(char c) {
        C0107 c0107 = (C0107) this.f139;
        c0107.m336(c0107.f314, 1);
        char[] cArr = (char[]) c0107.f315;
        int i = c0107.f314;
        c0107.f314 = i + 1;
        cArr[i] = c;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public void mo193() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public void mo194() {
    }

    public /* synthetic */ C0064(Object obj, int i, boolean z) {
        this.f140 = i;
        this.f139 = obj;
        this.f138 = z;
    }

    public /* synthetic */ C0064(Object obj, int i) {
        this.f140 = i;
        this.f139 = obj;
    }

    public C0064(C0107 c0107) {
        this.f140 = 4;
        this.f139 = c0107;
        this.f138 = true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0064(C7590 c7590, boolean z) {
        this(c7590, 5);
        this.f140 = 5;
        this.f138 = z;
    }
}
