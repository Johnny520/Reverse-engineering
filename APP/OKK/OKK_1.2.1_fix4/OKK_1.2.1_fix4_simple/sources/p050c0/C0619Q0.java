package p050c0;

import android.widget.TextView;
import java.lang.reflect.Field;
import java.util.Locale;
import java.util.regex.Pattern;
import p009E0.C0172c;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0306f;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0317q;
import p042W0.AbstractC0425j;

/* JADX INFO: renamed from: c0.Q0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0619Q0 extends AbstractC0306f implements InterfaceC0286l {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f1910i;

    public /* synthetic */ C0619Q0(int r1, Object r2, Class r3, String r4, String r5, int r6) {
        this.f1910i = r6;
        super(r1, r2, r3, r4, r5);
    }

    @Override // p029P0.InterfaceC0286l
    public final Object invoke(Object r7) {
        switch(this.f1910i) {
            case 0: goto L25;
            default: goto L4;
        };
    L4:
        Class r72 = (Class) r7;
        AbstractC0307g.m703e(r72, "p0");
        ((C0621R0) this.f583b).getClass();
        Field r02 = null;
    L5:
        if (r72 == null) goto L89;
        if (r72.equals(Object.class) == true) goto L90;
        C0172c r1 = AbstractC0317q.m714c(r72.getDeclaredFields());
    L10:
        if (r1.hasNext() == false) goto L23;
        Field r2 = (Field) r1.next();
        if (TextView.class.isAssignableFrom(r2.getType()) == false) goto L10;
        String r3 = r2.getName();
        AbstractC0307g.m702d(r3, "getName(...)");
        String r32 = r3.toLowerCase(Locale.ROOT);
        AbstractC0307g.m702d(r32, "toLowerCase(...)");
        if (AbstractC0307g.m699a(r2.getName(), "userTV") == true) goto L24;
        if (AbstractC0307g.m699a(r2.getName(), "brc") == true) goto L24;
        if (r02 != null) goto L10;
        if (AbstractC0425j.m1005J0(r32, "user", false) == false) goto L10;
        r02 = r2;
    L24:
        return r2;
    L23:
        r72 = r72.getSuperclass();
        goto L5
    L90:
        return r02;
    L89:
        return r02;
    L25:
        TextView r73 = (TextView) r7;
        AbstractC0307g.m703e(r73, "p0");
        ((C0621R0) this.f583b).getClass();
        boolean r22 = false;
        if (r73.getVisibility() != 8) goto L33;
        CharSequence r03 = r73.getText();
        if (r03 == null) goto L75;
        if (AbstractC0425j.m1013R0(r03) == false) goto L33;
    L75:
        return Boolean.valueOf(r22);
    L33:
        if (r73.getText() == null) goto L75;
        if ((!AbstractC0425j.m1013R0(r0)) != true) goto L75;
        String r74 = AbstractC0425j.m1022a1(r73.getText().toString()).toString();
        if (r74.length() > 80) goto L75;
        Pattern r04 = Pattern.compile(".*\\d{1,2}:\\d{2}.*");
        AbstractC0307g.m702d(r04, "compile(...)");
        if (r04.matcher(r74).matches() == true) goto L75;
        if (C0621R0.f1914b.m1004b(r74) == true) goto L75;
        if (C0621R0.f1915c.m1004b(r74) == true) goto L75;
        if (AbstractC0425j.m1005J0(r74, "未下载", false) == true) goto L75;
        if (AbstractC0425j.m1005J0(r74, "已下载", false) == true) goto L75;
        if (AbstractC0425j.m1005J0(r74, "下载中", false) == true) goto L75;
        if (AbstractC0425j.m1005J0(r74, "已过期", false) == true) goto L75;
        if (AbstractC0425j.m1005J0(r74, "微信网页版", false) == true) goto L75;
        if (AbstractC0425j.m1005J0(r74, "个人名片", false) == true) goto L75;
        if (AbstractC0425j.m1005J0(r74, "转文字", false) == true) goto L75;
        if (AbstractC0425j.m1005J0(r74, "以下为新消息", false) == true) goto L75;
        if (AbstractC0425j.m1005J0(r74, "撤回了一条消息", false) == true) goto L75;
        if (AbstractC0425j.m1005J0(r74, "小时之前", false) == true) goto L75;
        if (AbstractC0425j.m1005J0(r74, "分钟前", false) == true) goto L75;
        if (AbstractC0425j.m1005J0(r74, "刚刚", false) == true) goto L75;
        r22 = true;
        goto L75
    }
}
