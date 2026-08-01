package androidx.appcompat.app;

import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C1044;
import androidx.appcompat.widget.C1050;
import com.bumptech.glide.load.engine.C3818;
import com.bumptech.glide.load.engine.InterfaceC3821;
import com.typesafe.config.impl.AbstractC4654;
import com.typesafe.config.impl.C4655;
import com.typesafe.config.impl.C4656;
import com.typesafe.config.impl.C4658;
import com.typesafe.config.impl.C4659;
import com.typesafe.config.impl.C4669;
import com.typesafe.config.impl.C4670;
import kotlinx.serialization.json.internal.AbstractC6317;
import p168.AbstractC8419;
import p168.C8420;
import p206.InterfaceC8618;
import p206.MenuC8631;
import p266.InterfaceC8990;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C0911 implements InterfaceC8618 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f483;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f484;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f485;

    public C0911(int i) {
        this.f485 = i;
        switch (i) {
            case 2:
                this.f484 = new StringBuilder();
                this.f483 = false;
                break;
            default:
                this.f484 = new Handler(Looper.getMainLooper(), new C3818(0));
                break;
        }
    }

    public String toString() {
        switch (this.f485) {
            case 3:
                return this.f483 ? "FALL_THROUGH" : String.valueOf(this.f484);
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m746(int i, CharSequence charSequence) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            C6755.m11865();
            return false;
        }
        if (((C8420) this.f484) == null) {
            return m748();
        }
        char c = 2;
        for (int i2 = 0; i2 < i && c == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            C0911 c0911 = AbstractC8419.f20921;
            if (directionality == 0) {
                c = 1;
                continue;
            } else if (directionality != 1 && directionality != 2) {
                switch (directionality) {
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                        c = 0;
                        break;
                    default:
                        c = 2;
                        continue;
                }
            } else {
                c = 0;
            }
        }
        if (c == 0) {
            return true;
        }
        if (c != 1) {
            return m748();
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void mo747() {
        this.f483 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean m748() {
        return this.f483;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C4669 m749(InterfaceC8990 interfaceC8990, int i) {
        C4669 c4658;
        StringBuilder sb = (StringBuilder) this.f484;
        if (sb.length() <= 0) {
            return null;
        }
        if (this.f483) {
            C4670 c4670M8770 = ((C4670) interfaceC8990).m8770(i);
            String string = sb.toString();
            C4669 c4669 = AbstractC4654.f12364;
            c4658 = new C4655(c4670M8770, string);
        } else {
            C4670 c4670M87702 = ((C4670) interfaceC8990).m8770(i);
            String string2 = sb.toString();
            C4669 c46692 = AbstractC4654.f12364;
            c4658 = new C4658(c4670M87702, string2);
        }
        sb.setLength(0);
        return c4658;
    }

    @Override // p206.InterfaceC8618
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void mo750(MenuC8631 menuC8631, boolean z) {
        C1044 c1044;
        C0907 c0907 = (C0907) this.f484;
        if (this.f483) {
            return;
        }
        this.f483 = true;
        ActionMenuView actionMenuView = c0907.f472.f957.f856;
        if (actionMenuView != null && (c1044 = actionMenuView.f802) != null) {
            c1044.m1264();
            C1050 c1050 = c1044.f1128;
            if (c1050 != null && c1050.m13704()) {
                c1050.f21540.dismiss();
            }
        }
        c0907.f471.onPanelClosed(108, menuC8631);
        this.f483 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C4669 m751(C4669 c4669, InterfaceC8990 interfaceC8990, int i) {
        C4669 c46692 = AbstractC4654.f12364;
        if (!(c4669 instanceof C4659) && !(c4669 instanceof C4655) && !(c4669 instanceof C4656)) {
            this.f483 = false;
            return m749(interfaceC8990, i);
        }
        C4669 c4669M749 = m749(interfaceC8990, i);
        if (!this.f483) {
            this.f483 = true;
        }
        return c4669M749;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public void mo752(String str) {
        byte b;
        str.getClass();
        C0954 c0954 = (C0954) this.f484;
        c0954.m897(c0954.f659, str.length() + 2);
        char[] cArr = (char[]) c0954.f660;
        int i = c0954.f659;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c = cArr[i4];
            byte[] bArr = AbstractC6317.f15508;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i5 = i4 - i2; i5 < length2; i5++) {
                    c0954.m897(i4, 2);
                    char cCharAt = str.charAt(i5);
                    byte[] bArr2 = AbstractC6317.f15508;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        ((char[]) c0954.f660)[i4] = cCharAt;
                        i4 = i6;
                    } else {
                        if (b == 1) {
                            String str2 = AbstractC6317.f15509[cCharAt];
                            str2.getClass();
                            c0954.m897(i4, str2.length());
                            str2.getChars(0, str2.length(), (char[]) c0954.f660, i4);
                            int length3 = str2.length() + i4;
                            c0954.f659 = length3;
                            i4 = length3;
                        } else {
                            char[] cArr2 = (char[]) c0954.f660;
                            cArr2[i4] = '\\';
                            cArr2[i4 + 1] = (char) b;
                            i4 += 2;
                            c0954.f659 = i4;
                        }
                    }
                }
                c0954.m897(i4, 1);
                ((char[]) c0954.f660)[i4] = '\"';
                c0954.f659 = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = '\"';
        c0954.f659 = i3 + 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public void mo753(short s) {
        ((C0954) this.f484).m905(String.valueOf(s));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public synchronized void m756(InterfaceC3821 interfaceC3821, boolean z) {
        try {
            if (this.f483 || z) {
                ((Handler) this.f484).obtainMessage(1, interfaceC3821).sendToTarget();
            } else {
                this.f483 = true;
                interfaceC3821.recycle();
                this.f483 = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p206.InterfaceC8618
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean mo757(MenuC8631 menuC8631) {
        ((C0907) this.f484).f471.onMenuOpened(108, menuC8631);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public void mo758() {
        this.f483 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void mo759() {
        this.f483 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public void mo760(int i) {
        ((C0954) this.f484).m905(String.valueOf(i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public void mo761(long j) {
        ((C0954) this.f484).m905(String.valueOf(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public void mo762(byte b) {
        ((C0954) this.f484).m905(String.valueOf(b));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public void m763(char c) {
        C0954 c0954 = (C0954) this.f484;
        c0954.m897(c0954.f659, 1);
        char[] cArr = (char[]) c0954.f660;
        int i = c0954.f659;
        c0954.f659 = i + 1;
        cArr[i] = c;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public void mo754() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public void mo755() {
    }

    public /* synthetic */ C0911(Object obj, int i, boolean z) {
        this.f485 = i;
        this.f484 = obj;
        this.f483 = z;
    }

    public /* synthetic */ C0911(Object obj, int i) {
        this.f485 = i;
        this.f484 = obj;
    }

    public C0911(C0954 c0954) {
        this.f485 = 4;
        this.f484 = c0954;
        this.f483 = true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0911(C8420 c8420, boolean z) {
        this(c8420, 5);
        this.f485 = 5;
        this.f483 = z;
    }
}
