package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class a8 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public a8(int r2) {
        switch(r2) {
            case 4: goto L5;
            default: goto L3;
        };
    L3:
        this.a = new sx(10);
        this.b = new u30();
        this.c = new ArrayList();
        this.d = new HashSet();
        return;
    L5:
        this.a = new n6();
        this.b = new SparseArray();
        this.c = new bs();
        this.d = new n6();
    }

    public void a(Object r5, ArrayList r6, HashSet r7) {
        if (r6.contains(r5) == false) goto L6;
        return;
    L6:
        if (r7.contains(r5) == true) goto L15;
        r7.add(r5);
        ArrayList r0 = (ArrayList) ((u30) this.b).getOrDefault(r5, null);
        if (r0 == null) goto L12;
        int r1 = r0.size();
        int r2 = 0;
    L10:
        if (r2 >= r1) goto L12;
        a(r0.get(r2), r6, r7);
        r2 = r2 + 1;
    L12:
        r7.remove(r5);
        r6.add(r5);
        return;
    L15:
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    public h50 b(n1 r6) {
        ArrayList r0 = (ArrayList) this.c;
        int r1 = r0.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L10;
        h50 r3 = (h50) r0.get(r2);
        if (r3 == null) goto L9;
        if (r3.b != r6) goto L9;
        return r3;
    L9:
        r2 = r2 + 1;
        goto L3
    L10:
        h50 r12 = new h50((Context) this.b, r6);
        r0.add(r12);
        return r12;
    }

    public boolean c(n1 r4, MenuItem r5) {
        return ((ActionMode.Callback) this.a).onActionItemClicked(b(r4), new su((Context) this.b, (l50) r5));
    }

    public boolean d(n1 r6, Menu r7) {
        ActionMode.Callback r0 = (ActionMode.Callback) this.a;
        h50 r62 = b(r6);
        u30 r1 = (u30) this.d;
        Menu r2 = (Menu) r1.getOrDefault(r7, null);
        if (r2 != null) goto L6;
        r2 = new gv((Context) this.b, (ku) r7);
        r1.put(r7, r2);
    L6:
        return r0.onCreateActionMode(r62, r2);
    }

    public a8(Typeface r8, wv r9) {
        this.d = r8;
        this.a = r9;
        this.c = new xv(1024);
        int r0 = r9.a(6);
        if (r0 == 0) goto L5;
        int r02 = r0 + r9.a;
        int r03 = ((ByteBuffer) r9.d).getInt(((ByteBuffer) r9.d).getInt(r02) + r02);
    L6:
        this.b = new char[r03 * 2];
        int r82 = r9.a(6);
        if (r82 == 0) goto L9;
        int r83 = r82 + r9.a;
        int r84 = ((ByteBuffer) r9.d).getInt(((ByteBuffer) r9.d).getInt(r83) + r83);
    L10:
        int r92 = 0;
    L11:
        if (r92 >= r84) goto L29;
        ni r04 = new ni(this, r92);
        vv r2 = r04.b();
        int r3 = r2.a(4);
        if (r3 == 0) goto L15;
        int r22 = ((ByteBuffer) r2.d).getInt(r3 + r2.a);
    L16:
        Character.toChars(r22, (char[]) this.b, r92 * 2);
        vv r23 = r04.b();
        int r4 = r23.a(16);
        if (r4 == 0) goto L19;
        int r42 = r4 + r23.a;
        int r24 = ((ByteBuffer) r23.d).getInt(((ByteBuffer) r23.d).getInt(r42) + r42);
    L21:
        if (r24 <= 0) goto L23;
        boolean r25 = true;
    L24:
        zt.d("invalid metadata codepoint length", r25);
        xv r26 = (xv) this.c;
        vv r5 = r04.b();
        int r32 = r5.a(16);
        if (r32 == 0) goto L27;
        int r33 = r32 + r5.a;
        int r34 = ((ByteBuffer) r5.d).getInt(((ByteBuffer) r5.d).getInt(r33) + r33);
    L28:
        r26.a(r04, 0, r34 - 1);
        r92 = r92 + 1;
        goto L11
    L27:
        r34 = 0;
        goto L28
    L23:
        r25 = false;
        goto L24
    L19:
        r24 = 0;
        goto L21
    L15:
        r22 = 0;
        goto L16
    L29:
        return;
    L9:
        r84 = 0;
        goto L10
    L5:
        r03 = 0;
        goto L6
    }
}
