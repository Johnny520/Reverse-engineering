package top.suzhelan.qstory.hook.item;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedHelpers;
import io.ktor.client.plugins.AbstractC3932;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.reflect.jvm.internal.impl.types.C4874;
import kotlin.text.AbstractC5138;
import p010.AbstractC6154;
import p036.AbstractC6353;
import p038.C6372;
import p038.C6384;
import p038.C6401;
import p253.AbstractC8189;
import p319.AbstractC8699;
import top.linl.dexparser.DexFinder;
import top.linl.dexparser.DexParser;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5949 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f16137;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f16138;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f16139;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f16140;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16141;

    public /* synthetic */ RunnableC5949(C6372 c6372, Method method, Object obj, Method method2) {
        this.f16141 = 2;
        this.f16137 = c6372;
        this.f16140 = method;
        this.f16138 = obj;
        this.f16139 = method2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f16141;
        final int i2 = 4;
        final int i3 = 0;
        Object obj = this.f16139;
        Object obj2 = this.f16137;
        Object obj3 = this.f16138;
        Object obj4 = this.f16140;
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
                ((LinearLayout) obj3).addView(C6384.m11918(((C6401) obj4).f17558, (Context) obj2), 4, ((View) obj).getLayoutParams());
                break;
            case 2:
                C6372 c6372 = (C6372) obj2;
                Method method2 = (Method) obj;
                try {
                    ((Method) obj4).invoke(obj3, null);
                    method2.invoke(obj3, null);
                    XposedHelpers.callMethod(obj3, AbstractC3056.m6668(-3937583445342160295L), new Object[0]);
                } catch (Exception e) {
                    AbstractC6154.m11561(AbstractC3056.m6668(-3937583415277389223L) + e);
                    c6372.getExceptionCollectionToolInstance().m11804(e);
                    return;
                }
                break;
            case 3:
                String str = (String) obj4;
                C4874 c4874 = (C4874) obj3;
                final String str2 = (String) obj2;
                final ImageView imageView = (ImageView) obj;
                Handler handler = AbstractC8699.f24527;
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(AbstractC3932.m8321(AbstractC3056.m6668(-3937590274340160935L)));
                    sb.append('/');
                    Locale locale = Locale.getDefault();
                    AbstractC3056.m6668(-3937691974870762919L);
                    locale.getClass();
                    String upperCase = str.toUpperCase(locale);
                    AbstractC3056.m6668(-3937691906151286183L);
                    upperCase.getClass();
                    sb.append(upperCase);
                    final String string = sb.toString();
                    File file = new File(string);
                    if (file.exists() && file.length() > 0) {
                        if (AbstractC5138.m10130(AbstractC8189.m13681(file), str)) {
                            c4874.m9774(str, string);
                            handler.post(new Runnable() { // from class: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪哲苏兰世
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i4 = i3;
                                    String str3 = string;
                                    ImageView imageView2 = imageView;
                                    switch (i4) {
                                        case 0:
                                            AbstractC8699.m14383(imageView2, str3);
                                            break;
                                        case 1:
                                            AbstractC8699.m14383(imageView2, str3);
                                            break;
                                        case 2:
                                            AbstractC8699.m14382(imageView2, str3);
                                            break;
                                        case 3:
                                            AbstractC8699.m14382(imageView2, str3);
                                            break;
                                        default:
                                            AbstractC8699.m14382(imageView2, str3);
                                            break;
                                    }
                                }
                            });
                        } else {
                            file.delete();
                        }
                    }
                    AbstractC6353.m11904(str2, string);
                    File file2 = new File(string);
                    if (!file2.exists() || file2.length() <= 0) {
                        c4874.m9774(str, AbstractC3056.m6668(-3937561979095614887L));
                        final int i4 = 3;
                        handler.post(new Runnable() { // from class: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪哲苏兰世
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i42 = i4;
                                String str3 = str2;
                                ImageView imageView2 = imageView;
                                switch (i42) {
                                    case 0:
                                        AbstractC8699.m14383(imageView2, str3);
                                        break;
                                    case 1:
                                        AbstractC8699.m14383(imageView2, str3);
                                        break;
                                    case 2:
                                        AbstractC8699.m14382(imageView2, str3);
                                        break;
                                    case 3:
                                        AbstractC8699.m14382(imageView2, str3);
                                        break;
                                    default:
                                        AbstractC8699.m14382(imageView2, str3);
                                        break;
                                }
                            }
                        });
                    } else if (!AbstractC5138.m10130(AbstractC8189.m13681(file2), str)) {
                        file2.delete();
                        c4874.m9774(str, AbstractC3056.m6668(-3937561979095614887L));
                        final int i5 = 2;
                        handler.post(new Runnable() { // from class: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪哲苏兰世
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i42 = i5;
                                String str3 = str2;
                                ImageView imageView2 = imageView;
                                switch (i42) {
                                    case 0:
                                        AbstractC8699.m14383(imageView2, str3);
                                        break;
                                    case 1:
                                        AbstractC8699.m14383(imageView2, str3);
                                        break;
                                    case 2:
                                        AbstractC8699.m14382(imageView2, str3);
                                        break;
                                    case 3:
                                        AbstractC8699.m14382(imageView2, str3);
                                        break;
                                    default:
                                        AbstractC8699.m14382(imageView2, str3);
                                        break;
                                }
                            }
                        });
                    } else {
                        c4874.m9774(str, string);
                        final int i6 = 1;
                        handler.post(new Runnable() { // from class: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪哲苏兰世
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i42 = i6;
                                String str3 = string;
                                ImageView imageView2 = imageView;
                                switch (i42) {
                                    case 0:
                                        AbstractC8699.m14383(imageView2, str3);
                                        break;
                                    case 1:
                                        AbstractC8699.m14383(imageView2, str3);
                                        break;
                                    case 2:
                                        AbstractC8699.m14382(imageView2, str3);
                                        break;
                                    case 3:
                                        AbstractC8699.m14382(imageView2, str3);
                                        break;
                                    default:
                                        AbstractC8699.m14382(imageView2, str3);
                                        break;
                                }
                            }
                        });
                    }
                } catch (Exception unused2) {
                    c4874.m9774(str, AbstractC3056.m6668(-3937561979095614887L));
                    handler.post(new Runnable() { // from class: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪哲苏兰世
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i42 = i2;
                            String str3 = str2;
                            ImageView imageView2 = imageView;
                            switch (i42) {
                                case 0:
                                    AbstractC8699.m14383(imageView2, str3);
                                    break;
                                case 1:
                                    AbstractC8699.m14383(imageView2, str3);
                                    break;
                                case 2:
                                    AbstractC8699.m14382(imageView2, str3);
                                    break;
                                case 3:
                                    AbstractC8699.m14382(imageView2, str3);
                                    break;
                                default:
                                    AbstractC8699.m14382(imageView2, str3);
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

    public /* synthetic */ RunnableC5949(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f16141 = i;
        this.f16140 = obj;
        this.f16138 = obj2;
        this.f16137 = obj3;
        this.f16139 = obj4;
    }
}
