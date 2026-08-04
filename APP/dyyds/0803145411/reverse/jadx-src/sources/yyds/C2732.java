package yyds;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.android.NativeUtil;
import com.p000ss.android.ugc.aweme.yyds.R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᲈᲀᛲᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2732 implements InterfaceC1549 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f13432;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f13433;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ Object f13434;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f13435;

    public /* synthetic */ C2732(EditText editText, View view, View view2, C1807 c1807) {
        this.f13433 = 2;
        this.f13435 = editText;
        this.f13432 = view;
        this.f13434 = view2;
    }

    public native /* synthetic */ C2732(EditText editText, View view, C0513 c0513, Context context);

    /* JADX WARN: Removed duplicated region for block: B:101:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x033e  */
    @Override // yyds.InterfaceC1549
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo371(Object obj) {
        Object next;
        UrlModel urlModel;
        UrlModel urlModel2;
        ClassLoader classLoader;
        int color;
        ArrayList arrayListM2527;
        int iIndexOf;
        int i = this.f13433;
        boolean z = false;
        z = false;
        boolean z2 = false;
        int i2 = 1;
        C2746 c2746 = C2746.f13459;
        Object obj2 = this.f13434;
        Object obj3 = this.f13432;
        Object obj4 = this.f13435;
        switch (i) {
            case 0:
                AbstractC2328.m4341(-214932621263726L);
                AbstractC2071.m3952((Context) obj4, (C0324) obj, new C0654((C1633) obj3, (C0172) obj2, i2));
                break;
            case 1:
                Comment comment = (Comment) obj2;
                Context context = (Context) obj4;
                AbstractC2328.m4341(-858095383905134L);
                ((PopupWindow) obj3).dismiss();
                C0718.f3373.getClass();
                Emoji emoji = comment.emoji;
                final int i3 = 3;
                C1119 c1119 = new C1119(AbstractC1529.m3160(AbstractC1529.m3157(AbstractC2070.m3935(new List[]{(emoji == null || (urlModel2 = emoji.animateUrl) == null) ? null : urlModel2.urlList, (emoji == null || (urlModel = emoji.staticUrl) == null) ? null : urlModel.urlList}), new C0514(16)), new InterfaceC1549() { // from class: yyds.ᲈᲁᲁᲁ
                    static {
                        NativeUtil.classesInit0(125);
                    }

                    @Override // yyds.InterfaceC1549
                    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
                    public final native Object mo371(Object obj5);
                }));
                while (true) {
                    if (c1119.hasNext()) {
                        next = c1119.next();
                        String str = (String) next;
                        if (str == null || AbstractC0473.m1313(str)) {
                        }
                    } else {
                        next = null;
                    }
                }
                String str2 = (String) next;
                if (str2 == null || AbstractC0473.m1313(str2)) {
                    AbstractC1960.m3789(AbstractC2328.m4341(-855222050784110L));
                } else {
                    AbstractC2071.m3959(AbstractC2797.m4924(), null, new C1639(context, str2, comment, C1624.m3321(AbstractC2328.m4341(-855260705489774L)), (InterfaceC0274) null, 2), 3);
                }
                break;
            case 2:
                EditText editText = (EditText) obj4;
                View view = (View) obj3;
                View view2 = (View) obj2;
                Integer num = (Integer) obj;
                if (num != null) {
                    String strM4000 = AbstractC2104.m4000(new Object[]{Integer.valueOf(num.intValue() & 16777215)}, 1, AbstractC2328.m4341(-1084934081643374L), -1084959851447150L);
                    editText.setText(strM4000);
                    C1509.f7142.getClass();
                    AbstractC2328.m4341(-26568240563054L);
                    C1509.f7175.m1581(C1509.f7179[68], strM4000);
                    C1807.m3581(view, view2, strM4000);
                }
                break;
            case 3:
                AbstractC2328.m4341(-928979524158318L);
                C2419.m4468((C2803) obj3, (Context) obj4, (String) obj2);
                break;
            case 4:
                AbstractC2328.m4341(-625776307897198L);
                C1776.m3532((C2803) obj3, (Context) obj4, (String) obj2);
                break;
            case 5:
                List list = (List) obj4;
                C0757 c0757 = (C0757) obj3;
                C0757 c07572 = (C0757) obj2;
                AbstractC2328.m4341(-851098882179950L);
                Object obj5 = ((C0488) obj).f2407;
                Class cls = obj5 instanceof Class ? (Class) obj5 : null;
                if (cls != null) {
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (AbstractC1544.m3188(((C0757) it.next()).f3502, cls.getName())) {
                                C1409 c1409 = C1409.f6679;
                                classLoader = cls.getClassLoader();
                                if (classLoader == null) {
                                }
                                String strM4341 = AbstractC2328.m4341(-851150421787502L);
                                c1409.getClass();
                                C1409.m2868(list, c0757, c07572, classLoader, strM4341);
                                break;
                            }
                        }
                        if (cls.getName().equals(c0757 == null ? c0757.f3502 : null)) {
                        }
                    } else if (cls.getName().equals(c0757 == null ? c0757.f3502 : null)) {
                        if (cls.getName().equals(c07572 != null ? c07572.f3502 : null)) {
                            C1409 c14092 = C1409.f6679;
                            classLoader = cls.getClassLoader();
                            if (classLoader == null) {
                                classLoader = c14092.m678();
                            }
                            String strM43412 = AbstractC2328.m4341(-851150421787502L);
                            c14092.getClass();
                            C1409.m2868(list, c0757, c07572, classLoader, strM43412);
                        }
                        break;
                    }
                }
                break;
            case 6:
                C1127 c1127 = (C1127) obj3;
                TextView textView = c1127.f5194;
                Context context2 = (Context) obj4;
                C2089 c2089 = (C2089) obj;
                AbstractC2328.m4341(-133650365186926L);
                ((C0172) obj2).f997 = c2089;
                boolean z3 = c2089.f10376;
                String strM43413 = AbstractC2328.m4341(z3 ? -133693314859886L : -133706199761774L);
                EditText editText2 = (EditText) c1127.f5189;
                String str3 = c2089.f10379;
                if (AbstractC0473.m1313(str3)) {
                    str3 = strM43413;
                }
                textView.setText(str3 + AbstractC2328.m4341(-133719084663662L) + strM43413);
                textView.setTextColor(context2.getResources().getColor(R.color.primary_text, context2.getTheme()));
                editText2.setText(z3 ? c2089.f10368 : c2089.f10369);
                Editable text = editText2.getText();
                editText2.setSelection(text != null ? text.length() : 0);
                break;
            case 7:
                EditText editText3 = (EditText) obj3;
                View view3 = (View) obj2;
                Context context3 = (Context) obj4;
                Integer num2 = (Integer) obj;
                if (num2 != null) {
                    String strM40002 = AbstractC2104.m4000(new Object[]{Long.valueOf(((long) num2.intValue()) & 4294967295L)}, 1, AbstractC2328.m4341(-231708763521902L), -231734533325678L);
                    editText3.setText(strM40002);
                    C0513.m1361(context3, view3, strM40002);
                }
                break;
            case 8:
                View view4 = (View) obj3;
                TextView textView2 = (TextView) obj2;
                Integer num3 = (Integer) obj;
                ((C0912) obj4).m2025();
                if (num3 != null) {
                    String strM40003 = AbstractC2104.m4000(new Object[]{Integer.valueOf(num3.intValue() & 16777215)}, 1, AbstractC2328.m4341(-178318025065326L), -178343794869102L);
                    C1509.f7142.getClass();
                    AbstractC2328.m4341(-26293362656110L);
                    C1509.f7203.m1581(C1509.f7179[38], strM40003);
                    try {
                        color = Color.parseColor(strM40003);
                    } catch (Exception unused) {
                        color = -1;
                    }
                    view4.setBackgroundColor(color);
                    textView2.setText(strM40003);
                    C0352.m1033();
                }
                break;
            case 9:
                String str4 = (String) obj3;
                Context context4 = (Context) obj4;
                C2258 c2258 = (C2258) obj2;
                String strM43414 = (String) obj;
                if (strM43414 == null) {
                    strM43414 = AbstractC2328.m4341(-985037437305710L);
                }
                String string = AbstractC0473.m1314(strM43414).toString();
                if (string.length() == 0) {
                    AbstractC1960.m3789(AbstractC2328.m4341(-985041732273006L));
                } else if (string.equals(str4)) {
                    z2 = true;
                } else {
                    C1239.f5669.getClass();
                    AbstractC2328.m4341(-274911839552366L);
                    AbstractC2328.m4341(-274946199290734L);
                    AbstractC2328.m4341(-274997738898286L);
                    if (AbstractC0473.m1313(string) || (iIndexOf = (arrayListM2527 = C1239.m2527(context4)).indexOf(str4)) < 0 || arrayListM2527.contains(string)) {
                        AbstractC1960.m3789(AbstractC2328.m4341(-985110451749742L));
                    } else {
                        arrayListM2527.set(iIndexOf, string);
                        C1239.m2526(context4, arrayListM2527);
                        AbstractC1960.m3789(AbstractC2328.m4341(-985080386978670L));
                        C1327 c1327 = C1327.f6093;
                        C1327.m2618(context4);
                        c2258.mo731();
                        z2 = true;
                    }
                }
                break;
            case 10:
                Context context5 = (Context) obj4;
                C2258 c22582 = (C2258) obj2;
                C1239.f5669.getClass();
                AbstractC2328.m4341(-274838825108334L);
                AbstractC2328.m4341(-274873184846702L);
                ArrayList arrayListM25272 = C1239.m2527(context5);
                boolean zRemove = arrayListM25272.remove((String) obj3);
                if (zRemove) {
                    C1239.m2526(context5, arrayListM25272);
                }
                if (zRemove) {
                    AbstractC1960.m3789(AbstractC2328.m4341(-985136221553518L));
                    C1327 c13272 = C1327.f6093;
                    C1327.m2618(context5);
                    c22582.mo731();
                    z = true;
                } else {
                    AbstractC1960.m3789(AbstractC2328.m4341(-985166286324590L));
                }
                break;
            case 11:
                Context topActivity = (Context) obj4;
                AbstractC2328.m4341(-983770421953390L);
                AbstractC2328.m4341(-191301711201134L);
                AbstractC2328.m4341(-191306006168430L);
                AbstractC2328.m4341(-191310301135726L);
                String strM43415 = AbstractC2328.m4341(-191314596103022L);
                AbstractC2328.m4341(-191318891070318L);
                String strM43416 = AbstractC2328.m4341(-983809076659054L);
                AbstractC2328.m4341(-191323186037614L);
                String strM43417 = AbstractC2328.m4341(-983830551495534L);
                AbstractC2328.m4341(-191331775972206L);
                String strM43418 = AbstractC2328.m4341(-983882091103086L);
                AbstractC2328.m4341(-191434855187310L);
                String strM43419 = AbstractC2328.m4341(-983894976004974L);
                C1621 c1621 = new C1621((C2133) obj3, (C2770) obj, topActivity, (C0438) obj2, 1);
                AbstractC2328.m4341(-191370430677870L);
                if (topActivity == null) {
                    topActivity = ActivityStack.getTopActivity();
                }
                new DialogC1378(topActivity, new C1343(strM43416, strM43417, strM43419, strM43415, strM43418, -1754827, c1621, true)).show();
                break;
            default:
                Context context6 = (Context) obj4;
                C1223 c1223 = (C1223) obj3;
                AlertDialog alertDialog = (AlertDialog) obj2;
                if (((Boolean) obj).booleanValue()) {
                    AbstractC1960.m3789(AbstractC2328.m4341(-984792624169838L));
                    C1327 c13273 = C1327.f6093;
                    C1327.m2618(context6);
                    c1223.mo731();
                } else {
                    AbstractC1960.m3789(AbstractC2328.m4341(-984822688940910L));
                }
                alertDialog.dismiss();
                break;
        }
        return c2746;
    }

    public /* synthetic */ C2732(PopupWindow popupWindow, Comment comment, Context context) {
        this.f13433 = 1;
        this.f13432 = popupWindow;
        this.f13434 = comment;
        this.f13435 = context;
    }

    public /* synthetic */ C2732(Object obj, Context context, Object obj2, int i) {
        this.f13433 = i;
        this.f13432 = obj;
        this.f13435 = context;
        this.f13434 = obj2;
    }

    public /* synthetic */ C2732(Object obj, Object obj2, Object obj3, int i) {
        this.f13433 = i;
        this.f13435 = obj;
        this.f13432 = obj2;
        this.f13434 = obj3;
    }

    public /* synthetic */ C2732(C0172 c0172, C1127 c1127, Context context) {
        this.f13433 = 6;
        this.f13434 = c0172;
        this.f13432 = c1127;
        this.f13435 = context;
    }
}
