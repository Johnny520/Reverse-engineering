package ca;

import android.app.Activity;
import android.content.Intent;
import android.webkit.MimeTypeMap;
import androidx.lifecycle.C0119x;
import bi.C0315c;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Settings;
import p000a.AbstractC0000a;
import p054dg.AbstractC0793l;
import p085fg.InterfaceC1231l;
import p109hb.C1687k;
import p109hb.C1688k0;
import p109hb.C1697t;
import p153k8.C2356t;
import p218og.AbstractC3149m;
import p276sf.C3958e;
import p276sf.C3967n;
import p332wb.C5026jv;
import p332wb.C5491y2;
import p332wb.EnumC5092lv;
import tf.AbstractC4166m;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: ca.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0521h implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1606g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0517e0 f1607h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Activity f1608i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C1697t f1609j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0521h(C1697t c1697t, C0517e0 c0517e0, Activity activity) {
        this.f1606g = 2;
        this.f1609j = c1697t;
        this.f1607h = c0517e0;
        this.f1608i = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0198  */
    @Override // p085fg.InterfaceC1231l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        String str;
        File file;
        String strM592Y;
        String mimeTypeFromExtension;
        boolean z9;
        String strM4293j;
        switch (this.f1606g) {
            case 0:
                C0517e0 c0517e0 = this.f1607h;
                Activity activity = this.f1608i;
                C1697t c1697t = this.f1609j;
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue == 0) {
                    c0517e0.getClass();
                    C0513c0 c0513c0M1525j = c0517e0.m1525j(activity, AbstractC0000a.m99x0(c1697t));
                    Intent intent = c0513c0M1525j.f1566a;
                    if (intent == null) {
                        c0517e0.m1532r(activity, c0513c0M1525j.f1567b);
                    } else {
                        c0517e0.m1531q(activity, intent);
                    }
                } else if (iIntValue == 1) {
                    c0517e0.getClass();
                    c0517e0.m1530p(activity, new C0521h(c0517e0, activity, c1697t, 1), "选择转发对象", "转发", false);
                } else if (iIntValue == 2) {
                    C0119x c0119x = c0517e0.f1593o;
                    c0119x.getClass();
                    int i9 = c1697t.f5647b & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                    C2356t c2356t = c1697t.f5652g;
                    String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                    if (i9 == 1) {
                        String str3 = c2356t != null ? c2356t.f7743c : null;
                        if (str3 != null) {
                            str2 = str3;
                        }
                        if (AbstractC3149m.m6721t0(str2)) {
                            str2 = c1697t.f5649d;
                        }
                        strM592Y = C0119x.m567a0(activity, str2, "消息内容为空");
                    } else if (i9 == 3) {
                        str = c2356t != null ? c2356t.f7746f : null;
                        if (str == null) {
                            str = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        if (AbstractC3149m.m6721t0(str)) {
                            str = null;
                        }
                        file = str != null ? new File(str) : null;
                        if (file != null) {
                            strM592Y = "该消息暂不支持系统分享";
                        } else if (!file.isFile()) {
                            strM592Y = "分享文件不存在";
                        } else if (i9 == 3) {
                            mimeTypeFromExtension = "image/*";
                            strM592Y = c0119x.m592Y(activity, AbstractC0000a.m99x0(file), mimeTypeFromExtension, HttpUrl.FRAGMENT_ENCODE_SET);
                        } else {
                            if (i9 == 34) {
                                mimeTypeFromExtension = "audio/*";
                            } else if (i9 == 43) {
                                mimeTypeFromExtension = "video/*";
                            } else if (i9 != 47) {
                                if (i9 != 62) {
                                    String lowerCase = AbstractC0793l.m2023c0(file).toLowerCase(Locale.ROOT);
                                    lowerCase.getClass();
                                    mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
                                    if (mimeTypeFromExtension == null) {
                                        mimeTypeFromExtension = "application/octet-stream";
                                    }
                                }
                            }
                            strM592Y = c0119x.m592Y(activity, AbstractC0000a.m99x0(file), mimeTypeFromExtension, HttpUrl.FRAGMENT_ENCODE_SET);
                        }
                    } else {
                        if (i9 == 34) {
                            str = c1697t.f5653h;
                        } else if (i9 != 43) {
                            if (i9 == 47) {
                                str = c2356t != null ? c2356t.f7746f : null;
                                if (str == null) {
                                }
                            } else if (i9 != 62) {
                            }
                            str = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        if (AbstractC3149m.m6721t0(str)) {
                        }
                        if (str != null) {
                        }
                        if (file != null) {
                        }
                    }
                    if (strM592Y != null) {
                        c0517e0.m1532r(activity, strM592Y);
                    }
                } else if (iIntValue == 3) {
                    c0517e0.getClass();
                    C5491y2.m9799Q1(activity, "选择群发通道", HttpUrl.FRAGMENT_ENCODE_SET, AbstractC0000a.m101y0(new C3958e("模块通道", "支持好友、群聊、公众号和标签"), new C3958e("微信原生群发助手", "仅选择好友并按原生队列发送")), new C0521h(c1697t, c0517e0, activity), new C0315c(7), EnumC5092lv.f18824j);
                } else if (iIntValue == 4) {
                    c0517e0.getClass();
                    c0517e0.m1522e(activity, new C0525l(c0517e0, activity, new C0521h(c0517e0, activity, c1697t, 3)), "转发至标签", false);
                }
                return C3967n.f12976a;
            case 1:
                C0517e0 c0517e02 = this.f1607h;
                Activity activity2 = this.f1608i;
                C1697t c1697t2 = this.f1609j;
                List list = (List) obj;
                list.getClass();
                ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C5026jv) it.next()).f18249a);
                }
                c0517e02.m1529o(activity2, c1697t2, arrayList, 0, "转发给好友");
                break;
            case 2:
                C1697t c1697t3 = this.f1609j;
                C0517e0 c0517e03 = this.f1607h;
                Activity activity3 = this.f1608i;
                int i10 = 1;
                if (((Integer) obj).intValue() == 1) {
                    z9 = true;
                } else {
                    z9 = true;
                    i10 = 0;
                }
                List listM99x0 = AbstractC0000a.m99x0(c1697t3);
                if (listM99x0.isEmpty()) {
                    strM4293j = "请选择发送内容";
                } else {
                    C1688k0 c1688k0 = AbstractC0000a.f0g;
                    if (c1688k0 == null) {
                        strM4293j = "群发助手尚未就绪";
                    } else if (i10 != z9) {
                        strM4293j = null;
                    } else if (c1688k0.f5612c.m4300g()) {
                        List listM4305o = c1688k0.f5612c.m4305o(listM99x0);
                        if (listM4305o.isEmpty()) {
                            c1688k0.f5612c.getClass();
                            strM4293j = C1687k.m4293j(listM99x0);
                        } else {
                            strM4293j = "微信原生群发助手不支持: ".concat(AbstractC4166m.m8392A1(listM4305o, "、", null, null, null, 62));
                        }
                    } else {
                        strM4293j = "微信原生群发助手通道不可用";
                    }
                }
                if (strM4293j != null) {
                    c0517e03.m1532r(activity3, strM4293j);
                } else {
                    boolean z10 = i10 == z9 ? z9 : false;
                    c0517e03.m1530p(activity3, new C0524k(c0517e03, activity3, c1697t3, i10, 1), z10 ? "选择官方群发好友" : "选择群发对象", "发送", z10);
                }
                return C3967n.f12976a;
            default:
                C0517e0 c0517e04 = this.f1607h;
                Activity activity4 = this.f1608i;
                C1697t c1697t4 = this.f1609j;
                List list2 = (List) obj;
                list2.getClass();
                c0517e04.m1529o(activity4, c1697t4, list2, 0, "转发至标签");
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C0521h(C0517e0 c0517e0, Activity activity, C1697t c1697t, int i9) {
        this.f1606g = i9;
        this.f1607h = c0517e0;
        this.f1608i = activity;
        this.f1609j = c1697t;
    }
}
