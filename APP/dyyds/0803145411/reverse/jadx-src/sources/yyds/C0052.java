package yyds;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import com.android.app.CustomRecyclerView;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: yyds.ᛱᛱᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0052 implements InterfaceC2407, InterfaceC1643, InterfaceC2605, InterfaceC0541, InterfaceC1749, InterfaceC0375, InterfaceC1926, InterfaceC2768, InterfaceC1493, InterfaceC1434, InterfaceC0097 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final Object f549 = new Object();

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f550;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public Object f551;

    public C0052(int i) {
        this.f550 = i;
        switch (i) {
            case 9:
                this.f551 = new C2142(C0105.f738);
                break;
            case 12:
                this.f551 = new C1985(11);
                break;
            case 24:
                break;
            case 27:
                this.f551 = new C2014(8, (byte) 0);
                break;
            default:
                this.f551 = (C0721) AbstractC2084.f10336.f3101;
                break;
        }
    }

    @Override // yyds.InterfaceC0375
    public C1167 build() {
        return new C1167(new C0052(((ContentInfo.Builder) this.f551).build()));
    }

    @Override // yyds.InterfaceC1926
    public int getSource() {
        return ((ContentInfo) this.f551).getSource();
    }

    @Override // yyds.InterfaceC0375
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f551).setExtras(bundle);
    }

    @Override // yyds.InterfaceC1493
    public long skip(long j) throws IOException {
        InputStream inputStream = (InputStream) this.f551;
        if (j < 0) {
            return 0L;
        }
        long j2 = j;
        while (j2 > 0) {
            long jSkip = inputStream.skip(j2);
            if (jSkip <= 0) {
                if (inputStream.read() == -1) {
                    break;
                }
                jSkip = 1;
            }
            j2 -= jSkip;
        }
        return j - j2;
    }

    public String toString() {
        switch (this.f550) {
            case 11:
                return "ContentInfoCompat{" + ((ContentInfo) this.f551) + "}";
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public Iterable m379(Object obj) {
        if (obj instanceof List) {
            return (Iterable) obj;
        }
        new StringBuilder("Cannot iterate over ").append(obj);
        throw new C1738(obj.getClass().getName());
    }

    @Override // yyds.InterfaceC2605
    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public void mo380() {
        C0763 c0763 = ((C2457) this.f551).f12138;
        if (c0763.mo1710()) {
            return;
        }
        c0763.getClass();
        if (c0763.mo1716()) {
            c0763.m1712();
        }
    }

    @Override // yyds.InterfaceC1643
    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public boolean mo381(MenuC0836 menuC0836, MenuItem menuItem) {
        InterfaceC2494 interfaceC2494 = ((ActionMenuView) this.f551).f141;
        if (interfaceC2494 == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((C1154) interfaceC2494).f5303.f240.f10074).iterator();
        if (!it.hasNext()) {
            return false;
        }
        ((AbstractC0624) it.next()).getClass();
        throw null;
    }

    @Override // yyds.InterfaceC2768
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public InterfaceC0894 mo382(C0644 c0644) {
        switch (this.f550) {
            case 12:
                return new C0455(1, (C1985) this.f551);
            default:
                return new C0290((C2014) this.f551);
        }
    }

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public void m383(int i, int i2) {
        ((AbstractC0387) this.f551).f1869.m1866(i, i2);
    }

    @Override // yyds.InterfaceC1434
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public Object mo384() {
        switch (this.f550) {
            case 21:
                C1607 c1607 = (C1607) this.f551;
                return new RunnableC1650((C0716) c1607.f8179, (C0644) c1607.f8180);
            default:
                C0913 c0913 = (C0913) this.f551;
                return new C2028((ExecutorServiceC1555) c0913.f4163, (ExecutorServiceC1555) c0913.f4165, (ExecutorServiceC1555) c0913.f4161, (ExecutorServiceC1555) c0913.f4164, (C2620) c0913.f4162, (C2620) c0913.f4159, (C0644) c0913.f4160);
        }
    }

    @Override // yyds.InterfaceC0097
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public void mo385(C1829 c1829) {
        Object c2658;
        AbstractC2328.m4341(-1080243977356142L);
        try {
            InterfaceC1549 interfaceC1549 = ((C0213) this.f551).f1223;
            if (interfaceC1549 != null) {
                interfaceC1549.mo371(c1829);
                c2658 = C2746.f13459;
            } else {
                c2658 = null;
            }
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        Throwable thM4249 = C2248.m4249(c2658);
        if (thM4249 != null) {
            C2336.f11496.m4355(AbstractC2328.m4341(-1080282632061806L), thM4249);
        }
    }

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public int m386(int i) {
        int[] iArr = ((DialogXBaseRelativeLayout) this.f551).f427;
        int iM4012 = AbstractC2104.m4012(i);
        if (iM4012 == 0) {
            return iArr[0];
        }
        if (iM4012 == 1) {
            return iArr[1];
        }
        if (iM4012 == 2) {
            return iArr[2];
        }
        if (iM4012 != 3) {
            return 0;
        }
        return iArr[3];
    }

    @Override // yyds.InterfaceC1926
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public ClipData mo387() {
        return ((ContentInfo) this.f551).getClip();
    }

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public boolean m388(int i, int i2) {
        RunnableC0908 runnableC0908 = (RunnableC0908) this.f551;
        Object obj = runnableC0908.f4132.get(i);
        Object obj2 = runnableC0908.f4134.get(i2);
        if (obj == null || obj2 == null) {
            if (obj == null && obj2 == null) {
                return true;
            }
            throw new AssertionError();
        }
        switch (((C2810) runnableC0908.f4131.f2103.f10553).f13700) {
            case 0:
                AbstractC2328.m4341(-197177226462062L);
                AbstractC2328.m4341(-197211586200430L);
                return ((C2089) obj).equals((C2089) obj2);
            case 1:
                AbstractC2328.m4341(-317479260423022L);
                AbstractC2328.m4341(-317513620161390L);
                return ((C2721) obj).equals((C2721) obj2);
            default:
                AbstractC2328.m4341(-120022433956718L);
                AbstractC2328.m4341(-120056793695086L);
                return ((C1981) obj).equals((C1981) obj2);
        }
    }

    @Override // yyds.InterfaceC1493
    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public int mo389(int i, byte[] bArr) throws C1130 {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i && (i3 = ((InputStream) this.f551).read(bArr, i2, i - i2)) != -1) {
            i2 += i3;
        }
        if (i2 == 0 && i3 == -1) {
            throw new C1130();
        }
        return i2;
    }

    @Override // yyds.InterfaceC0541
    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public void mo390(MenuC0836 menuC0836, C1148 c1148) {
        ViewOnKeyListenerC2374 viewOnKeyListenerC2374 = (ViewOnKeyListenerC2374) this.f551;
        Handler handler = viewOnKeyListenerC2374.f11689;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC2374.f11707;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0836 == ((C0597) arrayList.get(i)).f2822) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new RunnableC0529(this, i2 < arrayList.size() ? (C0597) arrayList.get(i2) : null, c1148, menuC0836), menuC0836, SystemClock.uptimeMillis() + 200);
    }

    @Override // yyds.InterfaceC2407
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public void mo391(MenuC0836 menuC0836, boolean z) {
        if (menuC0836 instanceof SubMenuC1011) {
            ((SubMenuC1011) menuC0836).f4601.mo1910().m1914(false);
        }
        InterfaceC2407 interfaceC2407 = ((C1313) this.f551).f6011;
        if (interfaceC2407 != null) {
            interfaceC2407.mo391(menuC0836, z);
        }
    }

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public void m392(int i, int i2) {
        ((AbstractC0387) this.f551).f1869.m1870(i, i2);
    }

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public Set m393(Object obj) {
        if (obj instanceof List) {
            throw new UnsupportedOperationException();
        }
        return ((Map) obj).keySet();
    }

    @Override // yyds.InterfaceC0375
    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public void mo394(Uri uri) {
        ((ContentInfo.Builder) this.f551).setLinkUri(uri);
    }

    @Override // yyds.InterfaceC0541
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public void mo395(MenuC0836 menuC0836, MenuItem menuItem) {
        ((ViewOnKeyListenerC2374) this.f551).f11689.removeCallbacksAndMessages(menuC0836);
    }

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public void m396(int i, int i2) {
        RunnableC0908 runnableC0908 = (RunnableC0908) this.f551;
        Object obj = runnableC0908.f4132.get(i);
        Object obj2 = runnableC0908.f4134.get(i2);
        if (obj == null || obj2 == null) {
            throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public boolean m397(int i, int i2) {
        RunnableC0908 runnableC0908 = (RunnableC0908) this.f551;
        Object obj = runnableC0908.f4132.get(i);
        Object obj2 = runnableC0908.f4134.get(i2);
        if (obj == null || obj2 == null) {
            return obj == null && obj2 == null;
        }
        switch (((C2810) runnableC0908.f4131.f2103.f10553).f13700) {
            case 0:
                AbstractC2328.m4341(-197108506985326L);
                AbstractC2328.m4341(-197142866723694L);
                return ((C2089) obj).m3989().equals(((C2089) obj2).m3989());
            case 1:
                AbstractC2328.m4341(-317410540946286L);
                AbstractC2328.m4341(-317444900684654L);
                return AbstractC1544.m3188(((C2721) obj).m4840(), ((C2721) obj2).m4840());
            default:
                AbstractC2328.m4341(-119953714479982L);
                AbstractC2328.m4341(-119988074218350L);
                return AbstractC1544.m3188(((C1981) obj).m3819(), ((C1981) obj2).m3819());
        }
    }

    @Override // yyds.InterfaceC1926
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public int mo398() {
        return ((ContentInfo) this.f551).getFlags();
    }

    @Override // yyds.InterfaceC0097
    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public void mo399(C0488 c0488) {
        Object c2658;
        AbstractC2328.m4341(-1080368531407726L);
        try {
            InterfaceC1549 interfaceC1549 = ((C0213) this.f551).f1224;
            if (interfaceC1549 != null) {
                interfaceC1549.mo371(c0488);
                c2658 = C2746.f13459;
            } else {
                c2658 = null;
            }
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        Throwable thM4249 = C2248.m4249(c2658);
        if (thM4249 != null) {
            C2336.f11496.m4355(AbstractC2328.m4341(-1080407186113390L), thM4249);
        }
    }

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public void m400(Object obj, int i, Object obj2) {
        if (!(obj instanceof List)) {
            throw new UnsupportedOperationException();
        }
        List list = (List) obj;
        if (i == list.size()) {
            list.add(obj2);
        } else {
            list.set(i, obj2);
        }
    }

    @Override // yyds.InterfaceC1493
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public int mo401() {
        return mo406() | (mo406() << 8);
    }

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public String m402(Object obj) {
        if (obj instanceof Map) {
            return C2481.m4531((Map) obj, C1083.f4988);
        }
        if (obj instanceof List) {
            return C2288.m4293((List) obj, C1083.f4988);
        }
        if (!(obj instanceof Number) && !(obj instanceof Boolean)) {
            throw new UnsupportedOperationException(obj.getClass().getName().concat(" can not be converted to JSON"));
        }
        C1083 c1083 = AbstractC2084.f10334;
        StringBuilder sb = new StringBuilder();
        try {
            AbstractC2084.m3986(obj, sb, c1083);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    @Override // yyds.InterfaceC0375
    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public void mo403(int i) {
        ((ContentInfo.Builder) this.f551).setFlags(i);
    }

    @Override // yyds.InterfaceC2407
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public boolean mo404(MenuC0836 menuC0836) {
        C1313 c1313 = (C1313) this.f551;
        if (menuC0836 == c1313.f6004) {
            return false;
        }
        C1148 c1148 = ((SubMenuC1011) menuC0836).f4600;
        InterfaceC2407 interfaceC2407 = c1313.f6011;
        if (interfaceC2407 != null) {
            return interfaceC2407.mo404(menuC0836);
        }
        return false;
    }

    @Override // yyds.InterfaceC1926
    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public ContentInfo mo405() {
        return (ContentInfo) this.f551;
    }

    @Override // yyds.InterfaceC1493
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public short mo406() throws IOException {
        int i = ((InputStream) this.f551).read();
        if (i != -1) {
            return (short) i;
        }
        throw new C1130();
    }

    @Override // yyds.InterfaceC1643
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public void mo407(MenuC0836 menuC0836) {
        C1154 c1154 = ((ActionMenuView) this.f551).f138;
        if (c1154 != null) {
            c1154.mo407(menuC0836);
        }
    }

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public int m408(Object obj) {
        if (obj instanceof List) {
            return ((List) obj).size();
        }
        if (obj instanceof Map) {
            return m393(obj).size();
        }
        if (obj instanceof String) {
            return ((String) obj).length();
        }
        throw new C1738("length operation cannot be applied to ".concat(obj != null ? obj.getClass().getName() : "null"));
    }

    public C0052(C2794 c2794) {
        this.f550 = 25;
        this.f551 = Collections.unmodifiableMap(new HashMap(c2794.f13658));
    }

    public C0052(LinearLayout linearLayout, Button button, Button button2, EditText editText) {
        this.f550 = 14;
        this.f551 = editText;
    }

    public /* synthetic */ C0052(int i, Object obj) {
        this.f550 = i;
        this.f551 = obj;
    }

    public C0052(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, CustomRecyclerView customRecyclerView, TextView textView) {
        this.f550 = 8;
        this.f551 = textView;
    }

    public C0052(ScrollView scrollView, Switch r2, Switch r3, Switch r4, Switch r5, Switch r6, Switch r7, Switch r8, Switch r9, Switch r10, Switch r11, RadioGroup radioGroup) {
        this.f550 = 15;
        this.f551 = radioGroup;
    }

    public C0052(TextView textView) {
        this.f550 = 20;
        this.f551 = new C0014(textView);
    }

    public C0052(EditText editText) {
        this.f550 = 19;
        this.f551 = new C2133(editText, 20);
    }

    public C0052(ContentInfo contentInfo) {
        this.f550 = 11;
        contentInfo.getClass();
        this.f551 = AbstractC0717.m1649(contentInfo);
    }

    public C0052(ClipData clipData, int i) {
        this.f550 = 10;
        this.f551 = AbstractC0717.m1650(clipData, i);
    }
}
