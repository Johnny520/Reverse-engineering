package androidx.emoji2.text;

import android.content.Context;
import android.graphics.Typeface;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p012G.C0137a;
import p012G.C0138b;
import p066g.AbstractC0561a;
import p066g.C0566f;
import p068h.MenuC0578C;
import p068h.MenuC0594m;
import p068h.MenuItemC0601t;
import p075l.C0753k;
import p089t.InterfaceMenuItemC1005a;

/* JADX INFO: renamed from: androidx.emoji2.text.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0404s {

    /* JADX INFO: renamed from: a */
    public final Object f1209a;

    /* JADX INFO: renamed from: b */
    public final Object f1210b;

    /* JADX INFO: renamed from: c */
    public final Object f1211c;

    /* JADX INFO: renamed from: d */
    public final Object f1212d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0404s(Typeface typeface, C0138b c0138b) {
        int i2;
        int i3;
        int i4;
        int i5;
        this.f1212d = typeface;
        this.f1209a = c0138b;
        this.f1211c = new C0403r(1024);
        int iM303a = c0138b.m303a(6);
        if (iM303a != 0) {
            int i6 = iM303a + c0138b.f434a;
            i2 = ((ByteBuffer) c0138b.f437d).getInt(((ByteBuffer) c0138b.f437d).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        this.f1210b = new char[i2 * 2];
        int iM303a2 = c0138b.m303a(6);
        if (iM303a2 != 0) {
            int i7 = iM303a2 + c0138b.f434a;
            i3 = ((ByteBuffer) c0138b.f437d).getInt(((ByteBuffer) c0138b.f437d).getInt(i7) + i7);
        } else {
            i3 = 0;
        }
        for (int i8 = 0; i8 < i3; i8++) {
            C0399n c0399n = new C0399n(this, i8);
            C0137a c0137aM768b = c0399n.m768b();
            int iM303a3 = c0137aM768b.m303a(4);
            Character.toChars(iM303a3 != 0 ? ((ByteBuffer) c0137aM768b.f437d).getInt(iM303a3 + c0137aM768b.f434a) : 0, (char[]) this.f1210b, i8 * 2);
            C0137a c0137aM768b2 = c0399n.m768b();
            int iM303a4 = c0137aM768b2.m303a(16);
            if (iM303a4 != 0) {
                int i9 = iM303a4 + c0137aM768b2.f434a;
                i4 = ((ByteBuffer) c0137aM768b2.f437d).getInt(((ByteBuffer) c0137aM768b2.f437d).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            if (!(i4 > 0)) {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
            C0137a c0137aM768b3 = c0399n.m768b();
            int iM303a5 = c0137aM768b3.m303a(16);
            if (iM303a5 != 0) {
                int i10 = iM303a5 + c0137aM768b3.f434a;
                i5 = ((ByteBuffer) c0137aM768b3.f437d).getInt(((ByteBuffer) c0137aM768b3.f437d).getInt(i10) + i10);
            } else {
                i5 = 0;
            }
            ((C0403r) this.f1211c).m774a(c0399n, 0, i5 - 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public C0566f m775a(AbstractC0561a abstractC0561a) {
        ArrayList arrayList = (ArrayList) this.f1211c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0566f c0566f = (C0566f) arrayList.get(i2);
            if (c0566f != null && c0566f.f1889b == abstractC0561a) {
                return c0566f;
            }
        }
        C0566f c0566f2 = new C0566f((Context) this.f1210b, abstractC0561a);
        arrayList.add(c0566f2);
        return c0566f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public boolean m776b(AbstractC0561a abstractC0561a, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f1209a).onActionItemClicked(m775a(abstractC0561a), new MenuItemC0601t((Context) this.f1210b, (InterfaceMenuItemC1005a) menuItem));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public boolean m777c(AbstractC0561a abstractC0561a, MenuC0594m menuC0594m) {
        C0566f c0566fM775a = m775a(abstractC0561a);
        C0753k c0753k = (C0753k) this.f1212d;
        Menu menuC0578C = (Menu) c0753k.getOrDefault(menuC0594m, null);
        if (menuC0578C == null) {
            menuC0578C = new MenuC0578C((Context) this.f1210b, menuC0594m);
            c0753k.put(menuC0594m, menuC0578C);
        }
        return ((ActionMode.Callback) this.f1209a).onCreateActionMode(c0566fM775a, menuC0578C);
    }

    public C0404s(Context context, ActionMode.Callback callback) {
        this.f1210b = context;
        this.f1209a = callback;
        this.f1211c = new ArrayList();
        this.f1212d = new C0753k();
    }
}
