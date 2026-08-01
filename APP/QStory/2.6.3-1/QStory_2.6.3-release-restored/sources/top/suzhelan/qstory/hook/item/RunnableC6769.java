package top.suzhelan.qstory.hook.item;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bumptech.glide.AbstractC3897;
import de.robv.android.xposed.XposedHelpers;
import io.ktor.client.plugins.AbstractC4765;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.reflect.jvm.internal.impl.types.C5707;
import kotlin.text.AbstractC5971;
import p026.AbstractC7014;
import p053.AbstractC7199;
import p055.C7223;
import p055.C7250;
import p055.C7254;
import p339.AbstractC9550;
import top.linl.dexparser.DexFinder;
import top.linl.dexparser.DexParser;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6769 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f16478;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f16479;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f16480;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f16481;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16482;

    public /* synthetic */ RunnableC6769(C7223 c7223, Method method, Object obj, Method method2) {
        this.f16482 = 2;
        this.f16478 = c7223;
        this.f16481 = method;
        this.f16479 = obj;
        this.f16480 = method2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f16482;
        final int i2 = 4;
        final int i3 = 0;
        Object obj = this.f16480;
        Object obj2 = this.f16478;
        Object obj3 = this.f16479;
        Object obj4 = this.f16481;
        switch (i) {
            case 0:
                Method method = (Method) obj4;
                View view = (View) obj;
                while (i3 < 19) {
                    try {
                        method.invoke(obj3, obj2, view);
                        i3++;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 1:
                ((LinearLayout) obj3).addView(C7250.m12531(((C7254) obj4).f17956, (Context) obj2), 4, ((View) obj).getLayoutParams());
                break;
            case 2:
                C7223 c7223 = (C7223) obj2;
                Method method2 = (Method) obj;
                try {
                    ((Method) obj4).invoke(obj3, null);
                    method2.invoke(obj3, null);
                    XposedHelpers.callMethod(obj3, "W", new Object[0]);
                } catch (Exception e) {
                    AbstractC7014.m12151("跳广告错误:" + e);
                    c7223.getExceptionCollectionToolInstance().m12391(e);
                    return;
                }
                break;
            case 3:
                String str = (String) obj4;
                C5707 c5707 = (C5707) obj3;
                final String str2 = (String) obj2;
                final ImageView imageView = (ImageView) obj;
                Handler handler = AbstractC9550.f24915;
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(AbstractC4765.m8870("img"));
                    sb.append('/');
                    Locale locale = Locale.getDefault();
                    "getDefault(...)";
                    locale.getClass();
                    String upperCase = str.toUpperCase(locale);
                    "toUpperCase(...)";
                    upperCase.getClass();
                    sb.append(upperCase);
                    final String string = sb.toString();
                    File file = new File(string);
                    if (file.exists() && file.length() > 0) {
                        if (AbstractC5971.m10689(AbstractC3897.m7384(file), str)) {
                            c5707.m10327(str, string);
                            handler.post(new Runnable() { // from class: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪哲苏世兰
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i4 = i3;
                                    String str3 = string;
                                    ImageView imageView2 = imageView;
                                    switch (i4) {
                                        case 0:
                                            AbstractC9550.m14990(imageView2, str3);
                                            break;
                                        case 1:
                                            AbstractC9550.m14990(imageView2, str3);
                                            break;
                                        case 2:
                                            AbstractC9550.m14989(imageView2, str3);
                                            break;
                                        case 3:
                                            AbstractC9550.m14989(imageView2, str3);
                                            break;
                                        default:
                                            AbstractC9550.m14989(imageView2, str3);
                                            break;
                                    }
                                }
                            });
                        } else {
                            file.delete();
                        }
                    }
                    AbstractC7199.m12511(str2, string);
                    File file2 = new File(string);
                    if (!file2.exists() || file2.length() <= 0) {
                        c5707.m10327(str, "");
                        final int i4 = 3;
                        handler.post(new Runnable() { // from class: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪哲苏世兰
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i42 = i4;
                                String str3 = str2;
                                ImageView imageView2 = imageView;
                                switch (i42) {
                                    case 0:
                                        AbstractC9550.m14990(imageView2, str3);
                                        break;
                                    case 1:
                                        AbstractC9550.m14990(imageView2, str3);
                                        break;
                                    case 2:
                                        AbstractC9550.m14989(imageView2, str3);
                                        break;
                                    case 3:
                                        AbstractC9550.m14989(imageView2, str3);
                                        break;
                                    default:
                                        AbstractC9550.m14989(imageView2, str3);
                                        break;
                                }
                            }
                        });
                    } else if (!AbstractC5971.m10689(AbstractC3897.m7384(file2), str)) {
                        file2.delete();
                        c5707.m10327(str, "");
                        final int i5 = 2;
                        handler.post(new Runnable() { // from class: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪哲苏世兰
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i42 = i5;
                                String str3 = str2;
                                ImageView imageView2 = imageView;
                                switch (i42) {
                                    case 0:
                                        AbstractC9550.m14990(imageView2, str3);
                                        break;
                                    case 1:
                                        AbstractC9550.m14990(imageView2, str3);
                                        break;
                                    case 2:
                                        AbstractC9550.m14989(imageView2, str3);
                                        break;
                                    case 3:
                                        AbstractC9550.m14989(imageView2, str3);
                                        break;
                                    default:
                                        AbstractC9550.m14989(imageView2, str3);
                                        break;
                                }
                            }
                        });
                    } else {
                        c5707.m10327(str, string);
                        final int i6 = 1;
                        handler.post(new Runnable() { // from class: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪哲苏世兰
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i42 = i6;
                                String str3 = string;
                                ImageView imageView2 = imageView;
                                switch (i42) {
                                    case 0:
                                        AbstractC9550.m14990(imageView2, str3);
                                        break;
                                    case 1:
                                        AbstractC9550.m14990(imageView2, str3);
                                        break;
                                    case 2:
                                        AbstractC9550.m14989(imageView2, str3);
                                        break;
                                    case 3:
                                        AbstractC9550.m14989(imageView2, str3);
                                        break;
                                    default:
                                        AbstractC9550.m14989(imageView2, str3);
                                        break;
                                }
                            }
                        });
                    }
                } catch (Exception unused2) {
                    c5707.m10327(str, "");
                    handler.post(new Runnable() { // from class: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪哲苏世兰
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i42 = i2;
                            String str3 = str2;
                            ImageView imageView2 = imageView;
                            switch (i42) {
                                case 0:
                                    AbstractC9550.m14990(imageView2, str3);
                                    break;
                                case 1:
                                    AbstractC9550.m14990(imageView2, str3);
                                    break;
                                case 2:
                                    AbstractC9550.m14989(imageView2, str3);
                                    break;
                                case 3:
                                    AbstractC9550.m14989(imageView2, str3);
                                    break;
                                default:
                                    AbstractC9550.m14989(imageView2, str3);
                                    break;
                            }
                        }
                    });
                    return;
                }
                break;
            default:
                ((DexFinder) obj4).lambda$findMethodAppearedString$1((ArrayList) obj3, (DexParser) obj2, (String) obj);
                break;
        }
    }

    public /* synthetic */ RunnableC6769(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f16482 = i;
        this.f16481 = obj;
        this.f16479 = obj2;
        this.f16478 = obj3;
        this.f16480 = obj4;
    }
}
