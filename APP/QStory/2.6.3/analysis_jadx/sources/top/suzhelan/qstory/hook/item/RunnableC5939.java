package top.suzhelan.qstory.hook.item;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bumptech.glide.AbstractC3065;
import de.robv.android.xposed.XposedHelpers;
import io.ktor.client.plugins.AbstractC3933;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.reflect.jvm.internal.impl.types.C4875;
import kotlin.text.AbstractC5139;
import p010.AbstractC6185;
import p037.AbstractC6370;
import p039.C6394;
import p039.C6421;
import p039.C6425;
import p287.AbstractC8405;
import p323.AbstractC8721;
import top.linl.dexparser.DexFinder;
import top.linl.dexparser.DexParser;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5939 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f16133;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f16134;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f16135;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f16136;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16137;

    public /* synthetic */ RunnableC5939(C6394 c6394, Method method, Object obj, Method method2) {
        this.f16137 = 2;
        this.f16133 = c6394;
        this.f16136 = method;
        this.f16134 = obj;
        this.f16135 = method2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f16137;
        final int i2 = 4;
        final int i3 = 0;
        Object obj = this.f16135;
        Object obj2 = this.f16133;
        Object obj3 = this.f16134;
        Object obj4 = this.f16136;
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
                ((LinearLayout) obj3).addView(C6421.m11972(((C6425) obj4).f17611, (Context) obj2), 4, ((View) obj).getLayoutParams());
                break;
            case 2:
                C6394 c6394 = (C6394) obj2;
                Method method2 = (Method) obj;
                try {
                    ((Method) obj4).invoke(obj3, null);
                    method2.invoke(obj3, null);
                    XposedHelpers.callMethod(obj3, AbstractC8405.m13973("喵喵呜喵喵呜喵喵"), new Object[0]);
                } catch (Exception e) {
                    AbstractC6185.m11592(AbstractC8405.m13972(260) + e);
                    c6394.getExceptionCollectionToolInstance().m11832(e);
                    return;
                }
                break;
            case 3:
                String str = (String) obj4;
                C4875 c4875 = (C4875) obj3;
                final String str2 = (String) obj2;
                final ImageView imageView = (ImageView) obj;
                Handler handler = AbstractC8721.f24570;
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(AbstractC3933.m8311(AbstractC8405.m13973("喵喵喵呜呜喵呜喵~喵喵喵呜呜喵喵喵~喵喵喵呜呜呜喵呜")));
                    sb.append('/');
                    Locale locale = Locale.getDefault();
                    AbstractC8405.m13972(1277);
                    locale.getClass();
                    String upperCase = str.toUpperCase(locale);
                    AbstractC8405.m13972(1278);
                    upperCase.getClass();
                    sb.append(upperCase);
                    final String string = sb.toString();
                    File file = new File(string);
                    if (file.exists() && file.length() > 0) {
                        if (AbstractC5139.m10130(AbstractC3065.m6824(file), str)) {
                            c4875.m9768(str, string);
                            handler.post(new Runnable() { // from class: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪哲苏世兰
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i4 = i3;
                                    String str3 = string;
                                    ImageView imageView2 = imageView;
                                    switch (i4) {
                                        case 0:
                                            AbstractC8721.m14431(imageView2, str3);
                                            break;
                                        case 1:
                                            AbstractC8721.m14431(imageView2, str3);
                                            break;
                                        case 2:
                                            AbstractC8721.m14430(imageView2, str3);
                                            break;
                                        case 3:
                                            AbstractC8721.m14430(imageView2, str3);
                                            break;
                                        default:
                                            AbstractC8721.m14430(imageView2, str3);
                                            break;
                                    }
                                }
                            });
                        } else {
                            file.delete();
                        }
                    }
                    AbstractC6370.m11952(str2, string);
                    File file2 = new File(string);
                    if (!file2.exists() || file2.length() <= 0) {
                        c4875.m9768(str, "");
                        final int i4 = 3;
                        handler.post(new Runnable() { // from class: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪哲苏世兰
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i42 = i4;
                                String str3 = str2;
                                ImageView imageView2 = imageView;
                                switch (i42) {
                                    case 0:
                                        AbstractC8721.m14431(imageView2, str3);
                                        break;
                                    case 1:
                                        AbstractC8721.m14431(imageView2, str3);
                                        break;
                                    case 2:
                                        AbstractC8721.m14430(imageView2, str3);
                                        break;
                                    case 3:
                                        AbstractC8721.m14430(imageView2, str3);
                                        break;
                                    default:
                                        AbstractC8721.m14430(imageView2, str3);
                                        break;
                                }
                            }
                        });
                    } else if (!AbstractC5139.m10130(AbstractC3065.m6824(file2), str)) {
                        file2.delete();
                        c4875.m9768(str, "");
                        final int i5 = 2;
                        handler.post(new Runnable() { // from class: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪哲苏世兰
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i42 = i5;
                                String str3 = str2;
                                ImageView imageView2 = imageView;
                                switch (i42) {
                                    case 0:
                                        AbstractC8721.m14431(imageView2, str3);
                                        break;
                                    case 1:
                                        AbstractC8721.m14431(imageView2, str3);
                                        break;
                                    case 2:
                                        AbstractC8721.m14430(imageView2, str3);
                                        break;
                                    case 3:
                                        AbstractC8721.m14430(imageView2, str3);
                                        break;
                                    default:
                                        AbstractC8721.m14430(imageView2, str3);
                                        break;
                                }
                            }
                        });
                    } else {
                        c4875.m9768(str, string);
                        final int i6 = 1;
                        handler.post(new Runnable() { // from class: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪哲苏世兰
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i42 = i6;
                                String str3 = string;
                                ImageView imageView2 = imageView;
                                switch (i42) {
                                    case 0:
                                        AbstractC8721.m14431(imageView2, str3);
                                        break;
                                    case 1:
                                        AbstractC8721.m14431(imageView2, str3);
                                        break;
                                    case 2:
                                        AbstractC8721.m14430(imageView2, str3);
                                        break;
                                    case 3:
                                        AbstractC8721.m14430(imageView2, str3);
                                        break;
                                    default:
                                        AbstractC8721.m14430(imageView2, str3);
                                        break;
                                }
                            }
                        });
                    }
                } catch (Exception unused2) {
                    c4875.m9768(str, "");
                    handler.post(new Runnable() { // from class: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪哲苏世兰
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i42 = i2;
                            String str3 = str2;
                            ImageView imageView2 = imageView;
                            switch (i42) {
                                case 0:
                                    AbstractC8721.m14431(imageView2, str3);
                                    break;
                                case 1:
                                    AbstractC8721.m14431(imageView2, str3);
                                    break;
                                case 2:
                                    AbstractC8721.m14430(imageView2, str3);
                                    break;
                                case 3:
                                    AbstractC8721.m14430(imageView2, str3);
                                    break;
                                default:
                                    AbstractC8721.m14430(imageView2, str3);
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

    public /* synthetic */ RunnableC5939(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f16137 = i;
        this.f16136 = obj;
        this.f16134 = obj2;
        this.f16133 = obj3;
        this.f16135 = obj4;
    }
}
