package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.bumptech.glide.load.engine.InterfaceC3821;
import com.bumptech.glide.load.resource.bitmap.C3850;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5227;
import kotlinx.serialization.json.internal.AbstractC6322;
import kotlinx.serialization.json.internal.C6321;
import p020.C6924;
import p171.InterfaceC8444;
import p206.DialogInterfaceOnKeyListenerC8628;
import p249.InterfaceC8906;
import p302.C9226;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0954 implements InterfaceC8906, InterfaceC8444 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f659;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f660;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f661;

    public C0954(Context context) {
        this.f661 = 0;
        int iM891 = DialogInterfaceC0951.m891(context, 0);
        this.f660 = new C0931(new ContextThemeWrapper(context, DialogInterfaceC0951.m891(context, iM891)));
        this.f659 = iM891;
    }

    public String toString() {
        switch (this.f661) {
            case 6:
                return new String((char[]) this.f660, 0, this.f659);
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void m897(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.f660;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.f660 = Arrays.copyOf(cArr, i3);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public DialogInterfaceC0951 m898() {
        C0931 c0931 = (C0931) this.f660;
        DialogInterfaceC0951 dialogInterfaceC0951 = new DialogInterfaceC0951(c0931.f595, this.f659);
        View view = c0931.f591;
        C0953 c0953 = dialogInterfaceC0951.f633;
        if (view != null) {
            c0953.f647 = view;
        } else {
            CharSequence charSequence = c0931.f592;
            if (charSequence != null) {
                c0953.f638 = charSequence;
                TextView textView = c0953.f656;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0931.f593;
            if (drawable != null) {
                c0953.f658 = drawable;
                ImageView imageView = c0953.f655;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0953.f655.setImageDrawable(drawable);
                }
            }
        }
        if (c0931.f597 != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0931.f594.inflate(c0953.f650, (ViewGroup) null);
            int i = c0931.f598 ? c0953.f643 : c0953.f642;
            ListAdapter c0949 = c0931.f597;
            if (c0949 == null) {
                c0949 = new C0949(c0931.f595, i, R.id.text1, null);
            }
            c0953.f651 = c0949;
            c0953.f652 = c0931.f599;
            if (c0931.f596 != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0932(c0931, c0953));
            }
            if (c0931.f598) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0953.f637 = alertController$RecycleListView;
        }
        dialogInterfaceC0951.setCancelable(true);
        dialogInterfaceC0951.setCanceledOnTouchOutside(true);
        dialogInterfaceC0951.setOnCancelListener(null);
        dialogInterfaceC0951.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC8628 dialogInterfaceOnKeyListenerC8628 = c0931.f590;
        if (dialogInterfaceOnKeyListenerC8628 != null) {
            dialogInterfaceC0951.setOnKeyListener(dialogInterfaceOnKeyListenerC8628);
        }
        return dialogInterfaceC0951;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean m899(long j) {
        int i = this.f659;
        for (int i2 = 0; i2 < i; i2++) {
            if (((long[]) this.f660)[i2] == j) {
                return true;
            }
        }
        return false;
    }

    @Override // p249.InterfaceC8906
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC3821 mo900(InterfaceC3821 interfaceC3821, C9226 c9226) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) interfaceC3821.get()).compress((Bitmap.CompressFormat) this.f660, this.f659, byteArrayOutputStream);
        interfaceC3821.recycle();
        return new C3850(byteArrayOutputStream.toByteArray());
    }

    @Override // p171.InterfaceC8444
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean mo901(View view) {
        ((BottomSheetBehavior) this.f660).m7584(this.f659);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m902(long j) {
        if (m899(j)) {
            return;
        }
        int i = this.f659;
        long[] jArrCopyOf = (long[]) this.f660;
        if (i >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i + 1, jArrCopyOf.length * 2));
            this.f660 = jArrCopyOf;
        }
        jArrCopyOf[i] = j;
        if (i >= this.f659) {
            this.f659 = i + 1;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public void m903(int i, int i2) {
        int[] iArr = (int[]) this.f660;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = i + 1;
        int i5 = i2 + 1;
        int i6 = iArr[i4];
        iArr[i4] = iArr[i5];
        iArr[i5] = i6;
        int i7 = i + 2;
        int i8 = i2 + 2;
        int i9 = iArr[i7];
        iArr[i7] = iArr[i8];
        iArr[i8] = i9;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public void m904(C6924 c6924) {
        C6924 c69242;
        int i = c6924.f17003;
        if (i == -1) {
            C6755.m11869("Failed requirement.");
            return;
        }
        int i2 = this.f659;
        C6924 c69243 = ((C6924[]) this.f660)[i2];
        c69243.getClass();
        c6924.f17003 = -1;
        ((C6924[]) this.f660)[i2] = null;
        this.f659 = i2 - 1;
        if (c6924 == c69243) {
            return;
        }
        int iM9463 = AbstractC5227.m9463(0L, c69243.f17005 - c6924.f17005);
        if (iM9463 == 0) {
            ((C6924[]) this.f660)[i] = c69243;
            c69243.f17003 = i;
            return;
        }
        if (iM9463 >= 0) {
            m907(i, c69243);
            return;
        }
        while (true) {
            int i3 = i << 1;
            int i4 = i3 + 1;
            int i5 = this.f659;
            if (i4 > i5) {
                if (i3 > i5) {
                    break;
                }
                c69242 = ((C6924[]) this.f660)[i3];
                c69242.getClass();
            } else {
                c69242 = ((C6924[]) this.f660)[i3];
                c69242.getClass();
                C6924 c69244 = ((C6924[]) this.f660)[i4];
                c69244.getClass();
                if (AbstractC5227.m9463(0L, c69244.f17005 - c69242.f17005) >= 0) {
                    c69242 = c69244;
                }
            }
            if (AbstractC5227.m9463(0L, c69242.f17005 - c69243.f17005) <= 0) {
                break;
            }
            int i6 = c69242.f17003;
            c69242.f17003 = i;
            ((C6924[]) this.f660)[i] = c69242;
            i = i6;
        }
        ((C6924[]) this.f660)[i] = c69243;
        c69243.f17003 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public void m905(String str) {
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return;
        }
        m897(this.f659, length);
        str.getChars(0, str.length(), (char[]) this.f660, this.f659);
        this.f659 += length;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public void m906(int i, int i2, int i3) {
        int i4 = this.f659;
        int[] iArrCopyOf = (int[]) this.f660;
        int i5 = i4 + 3;
        if (i5 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.f660 = iArrCopyOf;
        }
        iArrCopyOf[i4] = i + i3;
        iArrCopyOf[i4 + 1] = i2 + i3;
        iArrCopyOf[i4 + 2] = i3;
        this.f659 = i5;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void m907(int i, C6924 c6924) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            C6924 c69242 = ((C6924[]) this.f660)[i2];
            c69242.getClass();
            if (AbstractC5227.m9463(0L, c6924.f17005 - c69242.f17005) <= 0) {
                break;
            }
            c69242.f17003 = i;
            ((C6924[]) this.f660)[i] = c69242;
            i = i2;
        }
        ((C6924[]) this.f660)[i] = c6924;
        c6924.f17003 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public void m908() {
        C6321 c6321 = C6321.f15514;
        char[] cArr = (char[]) this.f660;
        c6321.getClass();
        cArr.getClass();
        synchronized (c6321) {
            int i = c6321.f15515;
            if (cArr.length + i < AbstractC6322.f15517) {
                c6321.f15515 = i + cArr.length;
                c6321.f15516.addLast(cArr);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public void m909(long j) {
        int i = this.f659;
        int i2 = 0;
        while (i2 < i) {
            if (j == ((long[]) this.f660)[i2]) {
                int i3 = this.f659 - 1;
                while (i2 < i3) {
                    long[] jArr = (long[]) this.f660;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.f659--;
                return;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public void m910(int i, int i2, int i3, int i4) {
        int i5 = this.f659;
        int[] iArrCopyOf = (int[]) this.f660;
        int i6 = i5 + 4;
        if (i6 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.f660 = iArrCopyOf;
        }
        iArrCopyOf[i5] = i;
        iArrCopyOf[i5 + 1] = i2;
        iArrCopyOf[i5 + 2] = i3;
        iArrCopyOf[i5 + 3] = i4;
        this.f659 = i6;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public void m911(int i, int i2) {
        if (i < i2) {
            int i3 = i - 3;
            for (int i4 = i; i4 < i2; i4 += 3) {
                int[] iArr = (int[]) this.f660;
                int i5 = iArr[i4];
                int i6 = iArr[i2];
                if (i5 < i6 || (i5 == i6 && iArr[i4 + 1] <= iArr[i2 + 1])) {
                    i3 += 3;
                    m903(i3, i4);
                }
            }
            m903(i3 + 3, i2);
            m911(i, i3);
            m911(i3 + 6, i2);
        }
    }

    public /* synthetic */ C0954(Object obj, int i, int i2) {
        this.f661 = i2;
        this.f660 = obj;
        this.f659 = i;
    }

    public C0954() {
        this.f661 = 12;
        this.f660 = Bitmap.CompressFormat.JPEG;
        this.f659 = 100;
    }

    public C0954(ArrayList arrayList) {
        this.f661 = 8;
        this.f660 = arrayList;
    }

    public /* synthetic */ C0954(byte b, int i) {
        this.f661 = i;
    }

    public C0954(int i) {
        this.f661 = 3;
        this.f660 = new int[i];
    }
}
