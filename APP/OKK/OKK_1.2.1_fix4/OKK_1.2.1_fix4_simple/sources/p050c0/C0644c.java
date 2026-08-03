package p050c0;

import android.content.ContentValues;
import com.abc.core.hooks.ModuleLog;
import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import java.lang.reflect.Field;
import p001A0.AbstractC0040p;
import p009E0.AbstractC0179j;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: c0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0644c extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2003b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0656g f2004c;

    public C0644c(int r1) {
        this.f2003b = r1;
        switch(r1) {
            case 1: goto L10;
            case 2: goto L8;
            case 3: goto L6;
            default: goto L4;
        };
    L4:
        this.f2004c = C0656g.f2040a;
        return;
    L6:
        this.f2004c = C0656g.f2040a;
        return;
    L8:
        this.f2004c = C0656g.f2040a;
        return;
    L10:
        this.f2004c = C0656g.f2040a;
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: a */
    public void mo1385a(C0760b r6) {
        switch(this.f2003b) {
            case 1: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        this.f2004c.getClass();
        if (C0656g.m1649j() == false) goto L31;
        Object r62 = r6.f2669b;
        if (r62 == null) goto L32;
        Field r02 = C0656g.m1647g(r62.getClass(), "field_commentflag");
        if (r02 == null) goto L33;
        r02.setAccessible(true);
        Object r2 = r02.get(r62);
        byte[] r4 = null;
        if ((r2 instanceof Number) == false) goto L17;
        Number r22 = (Number) r2;
    L18:
        if (r22 == null) goto L29;
        int r23 = r22.intValue();
        if ((r23 & 1) == 0) goto L30;
        r02.set(r62, Integer.valueOf((r23 & (-2)) | 256));
        Field r03 = C0656g.m1647g(r62.getClass(), "field_curActionBuf");
        if (r03 == null) goto L27;
        r03.setAccessible(true);
        Object r1 = r03.get(r62);
        if ((r1 instanceof byte[]) == false) goto L26;
        r4 = (byte[]) r1;
    L26:
        r03.set(r62, AbstractC0358S.m854D(r4));
    L27:
        C0656g.m1657r("rescued convertFrom flag=" + r23);
        return;
    L30:
        return;
    L29:
        return;
    L17:
        r22 = null;
        goto L18
    L33:
        return;
    L32:
        return;
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: b */
    public void mo1386b(C0760b r7) {
        switch(this.f2003b) {
            case 0: goto L20;
            case 1: goto L4;
            case 2: goto L15;
            case 3: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        this.f2004c.getClass();
        if (C0656g.m1649j() == false) goto L56;
        r7.m1946c(null);
        Object r72 = r7.f2669b;     // Catch: Throwable -> L11
        AbstractC0307g.m702d(r72, "thisObject");     // Catch: Throwable -> L11
        C0656g.m1642b(r72);     // Catch: Throwable -> L11
    L13:
        C0656g.m1657r("BLOCKED setCommentDelFlag");
        ModuleLog.INSTANCE.m1813i("拦截朋友圈评论软删除标志");
        return;
    L11:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L13
    L56:
        return;
    L15:
        this.f2004c.getClass();
        if (C0656g.m1649j() == false) goto L57;
        r7.m1946c(Boolean.TRUE);
        C0656g.m1657r("BLOCKED setCommentDeleted");
        ModuleLog.INSTANCE.m1813i("拦截 SnsComment setCommentDeleted");
        return;
    L57:
        return;
    L20:
        this.f2004c.getClass();
        if (C0656g.m1649j() == false) goto L61;
        Object[] r02 = r7.f2670c;
        AbstractC0307g.m702d(r02, "args");
        Object r03 = AbstractC0179j.m537n0(0, r02);
        if (r03 == null) goto L58;
        String r04 = r03.toString();
        if (r04 != null) goto L29;
        return;
    L29:
        if (AbstractC0433r.m1029D0(r04, "SnsComment", true) == false) goto L63;
        Object[] r73 = r7.f2670c;
        AbstractC0307g.m702d(r73, "args");
        Object r74 = AbstractC0179j.m537n0(1, r73);
        byte[] r1 = null;
        if ((r74 instanceof ContentValues) == false) goto L34;
        ContentValues r75 = (ContentValues) r74;
    L35:
        if (r75 == null) goto L64;
        Integer r2 = r75.getAsInteger("commentflag");
        if (r2 != null) goto L40;
        r2 = r75.getAsInteger("commentFlag");
    L40:
        if (r2 != null) goto L42;
        return;
    L42:
        if (r2.intValue() != 1) goto L44;
    L47:
        int r22 = r2.intValue();
        r75.put("commentflag", Integer.valueOf((r22 & (-2)) | 256));
        Object r3 = r75.get("curActionBuf");
        if ((r3 instanceof byte[]) == false) goto L50;
        r1 = (byte[]) r3;
    L50:
        if (r1 == null) goto L52;
        r75.put("curActionBuf", AbstractC0358S.m854D(r1));
    L52:
        C0656g.m1657r("rewrote SnsComment update flag=" + r22);
        ModuleLog.INSTANCE.m1813i("朋友圈评论 update 改写为[已删除]");
        return;
    L44:
        if (r2.intValue() == 2) goto L47;
        if ((1 & r2.intValue()) != 0) goto L47;
        return;
    L64:
        return;
    L34:
        r75 = null;
        goto L35
    L63:
        return;
    L58:
        return;
    }
}
