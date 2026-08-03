package com.abc.core.features;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0619Q0(int i2, Object obj, Class cls, String str, String str2, int i3) {
        super(i2, obj, cls, str, str2);
        this.f1910i = i3;
    }

    @Override // p029P0.InterfaceC0286l
    public final Object invoke(Object obj) {
        CharSequence text;
        CharSequence text2;
        switch (this.f1910i) {
            case 0:
                TextView textView = (TextView) obj;
                AbstractC0307g.m703e(textView, "p0");
                ((C0621R0) this.f583b).getClass();
                boolean z2 = false;
                if ((textView.getVisibility() != 8 || ((text2 = textView.getText()) != null && !AbstractC0425j.m1013R0(text2))) && (text = textView.getText()) != null && (!AbstractC0425j.m1013R0(text))) {
                    String string = AbstractC0425j.m1022a1(textView.getText().toString()).toString();
                    if (string.length() <= 80) {
                        Pattern patternCompile = Pattern.compile(".*\\d{1,2}:\\d{2}.*");
                        AbstractC0307g.m702d(patternCompile, "compile(...)");
                        if (!patternCompile.matcher(string).matches() && !C0621R0.f1914b.m1004b(string) && !C0621R0.f1915c.m1004b(string) && !AbstractC0425j.m1005J0(string, "未下载", false) && !AbstractC0425j.m1005J0(string, "已下载", false) && !AbstractC0425j.m1005J0(string, "下载中", false) && !AbstractC0425j.m1005J0(string, "已过期", false) && !AbstractC0425j.m1005J0(string, "微信网页版", false) && !AbstractC0425j.m1005J0(string, "个人名片", false) && !AbstractC0425j.m1005J0(string, "转文字", false) && !AbstractC0425j.m1005J0(string, "以下为新消息", false) && !AbstractC0425j.m1005J0(string, "撤回了一条消息", false) && !AbstractC0425j.m1005J0(string, "小时之前", false) && !AbstractC0425j.m1005J0(string, "分钟前", false) && !AbstractC0425j.m1005J0(string, "刚刚", false)) {
                            z2 = true;
                        }
                    }
                }
                return Boolean.valueOf(z2);
            default:
                Class superclass = (Class) obj;
                AbstractC0307g.m703e(superclass, "p0");
                ((C0621R0) this.f583b).getClass();
                Field field = null;
                while (superclass != null && !superclass.equals(Object.class)) {
                    C0172c c0172cM714c = AbstractC0317q.m714c(superclass.getDeclaredFields());
                    while (c0172cM714c.hasNext()) {
                        Field field2 = (Field) c0172cM714c.next();
                        if (TextView.class.isAssignableFrom(field2.getType())) {
                            String name = field2.getName();
                            AbstractC0307g.m702d(name, "getName(...)");
                            String lowerCase = name.toLowerCase(Locale.ROOT);
                            AbstractC0307g.m702d(lowerCase, "toLowerCase(...)");
                            if (AbstractC0307g.m699a(field2.getName(), "userTV") || AbstractC0307g.m699a(field2.getName(), "brc")) {
                                return field2;
                            }
                            if (field == null && AbstractC0425j.m1005J0(lowerCase, "user", false)) {
                                field = field2;
                            }
                        }
                    }
                    superclass = superclass.getSuperclass();
                }
                return field;
        }
    }
}
