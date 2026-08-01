package p055;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.compose.runtime.internal.C2080;
import com.bumptech.glide.AbstractC3888;
import com.davemorrissey.labs.subscaleview.C0328R;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Method;
import java.util.Date;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC6392;
import p034.AbstractC7082;
import p042.AbstractC7140;
import p042.InterfaceC7141;
import p045.C7149;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p049.C7164;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7217 extends AbstractC7140 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C7149 f17897;

    public C7217() {
        AbstractC9234.m14531(271);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // p042.AbstractC7143
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void loadHook(ClassLoader classLoader) throws ClassNotFoundException {
        Method methodM12414;
        Class cls = Boolean.TYPE;
        Class cls2 = Void.TYPE;
        try {
            try {
                C7164 c7164M12412 = C7164.m12412(AbstractC9234.m14531(171));
                String strM14532 = AbstractC9234.m14532("喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜喵喵呜呜~喵喵喵呜呜呜喵喵~喵喵呜呜喵喵喵喵~喵喵呜喵喵呜喵呜");
                C2080 c2080 = c7164M12412.f17803;
                c2080.f3963 = strM14532;
                c2080.f3962 = cls2;
                final int i = 0;
                m12389(c7164M12412.m12414(), new InterfaceC7141(this) { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子世兰楪苏哲

                    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                    public final /* synthetic */ C7217 f17898;

                    {
                        this.f17898 = this;
                    }

                    @Override // p042.InterfaceC7141
                    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                    public final void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
                        int i2 = i;
                        C7217 c7217 = this.f17898;
                        switch (i2) {
                            case 0:
                                c7217.m12523((ImageView) AbstractC7165.m12418(ImageView.class, AbstractC9234.m14531(279), methodHookParam.thisObject));
                                break;
                            case 1:
                                c7217.m12523((ImageView) AbstractC7165.m12417(ImageView.class, methodHookParam.thisObject));
                                break;
                            default:
                                if (c7217.f17897 == null) {
                                    c7217.f17897 = new C7149(AbstractC9234.m14531(271));
                                }
                                Long l = (Long) c7217.f17897.m12398(AbstractC9234.m14531(275));
                                if (l != null && new Date().getTime() < l.longValue()) {
                                    methodHookParam.setResult((Object) null);
                                    break;
                                }
                                break;
                        }
                    }
                });
            } catch (Exception e) {
                getExceptionCollectionToolInstance().m12391(e);
                String strM145322 = AbstractC9234.m14532("喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵喵喵呜~喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵呜");
                Class cls3 = Integer.TYPE;
                final int i2 = 2;
                m12390(NotificationManager.class.getMethod(strM145322, String.class, cls3, Notification.class), new InterfaceC7141(this) { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子世兰楪苏哲

                    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                    public final /* synthetic */ C7217 f17898;

                    {
                        this.f17898 = this;
                    }

                    @Override // p042.InterfaceC7141
                    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                    public final void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
                        int i22 = i2;
                        C7217 c7217 = this.f17898;
                        switch (i22) {
                            case 0:
                                c7217.m12523((ImageView) AbstractC7165.m12418(ImageView.class, AbstractC9234.m14531(279), methodHookParam.thisObject));
                                break;
                            case 1:
                                c7217.m12523((ImageView) AbstractC7165.m12417(ImageView.class, methodHookParam.thisObject));
                                break;
                            default:
                                if (c7217.f17897 == null) {
                                    c7217.f17897 = new C7149(AbstractC9234.m14531(271));
                                }
                                Long l = (Long) c7217.f17897.m12398(AbstractC9234.m14531(275));
                                if (l != null && new Date().getTime() < l.longValue()) {
                                    methodHookParam.setResult((Object) null);
                                    break;
                                }
                                break;
                        }
                    }
                });
                m12390(NotificationManager.class.getMethod(AbstractC9234.m14532("喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵喵喵呜~喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵呜"), cls3, Notification.class), new InterfaceC7141(this) { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子世兰楪苏哲

                    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                    public final /* synthetic */ C7217 f17898;

                    {
                        this.f17898 = this;
                    }

                    @Override // p042.InterfaceC7141
                    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                    public final void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
                        int i22 = i2;
                        C7217 c7217 = this.f17898;
                        switch (i22) {
                            case 0:
                                c7217.m12523((ImageView) AbstractC7165.m12418(ImageView.class, AbstractC9234.m14531(279), methodHookParam.thisObject));
                                break;
                            case 1:
                                c7217.m12523((ImageView) AbstractC7165.m12417(ImageView.class, methodHookParam.thisObject));
                                break;
                            default:
                                if (c7217.f17897 == null) {
                                    c7217.f17897 = new C7149(AbstractC9234.m14531(271));
                                }
                                Long l = (Long) c7217.f17897.m12398(AbstractC9234.m14531(275));
                                if (l != null && new Date().getTime() < l.longValue()) {
                                    methodHookParam.setResult((Object) null);
                                    break;
                                }
                                break;
                        }
                    }
                });
                if (AbstractC3888.m7256()) {
                    return;
                }
                Class<?> clsLoadClass = classLoader.loadClass(AbstractC9234.m14531(117));
                Class clsM12425 = AbstractC7166.m12425(AbstractC9234.m14531(118));
                Class clsM124252 = AbstractC7166.m12425(AbstractC9234.m14531(119));
                Class clsM124253 = AbstractC7166.m12425(AbstractC9234.m14531(120));
                C7164 c7164M12413 = C7164.m12413(clsLoadClass);
                C2080 c20802 = c7164M12413.f17803;
                c20802.f3962 = cls2;
                c20802.f3964 = new Class[]{clsM12425, Object.class, clsM124252};
                Method methodM124142 = null;
                try {
                    methodM12414 = c7164M12413.m12414();
                } catch (Exception unused) {
                    methodM12414 = null;
                }
                if (methodM12414 == null) {
                    C7164 c7164M124132 = C7164.m12413(clsLoadClass);
                    C2080 c20803 = c7164M124132.f17803;
                    c20803.f3962 = cls2;
                    c20803.f3964 = new Class[]{clsM12425, Object.class, clsM124252, clsM124253};
                    try {
                        methodM12414 = c7164M124132.m12414();
                    } catch (Exception unused2) {
                        methodM12414 = null;
                    }
                }
                if (methodM12414 == null) {
                    C7164 c7164M124133 = C7164.m12413(clsLoadClass);
                    C2080 c20804 = c7164M124133.f17803;
                    c20804.f3962 = cls2;
                    c20804.f3964 = new Class[]{clsM12425, Object.class, clsM124252, clsM124253, cls};
                    try {
                        methodM12414 = c7164M124133.m12414();
                    } catch (Exception unused3) {
                        methodM12414 = null;
                    }
                }
                if (methodM12414 == null) {
                    C7164 c7164M124134 = C7164.m12413(clsLoadClass);
                    C2080 c20805 = c7164M124134.f17803;
                    c20805.f3962 = cls2;
                    c20805.f3964 = new Class[]{clsM12425, clsM124253, clsM124252, cls};
                    try {
                        methodM124142 = c7164M124134.m12414();
                    } catch (Exception unused4) {
                    }
                    methodM12414 = methodM124142;
                }
                if (methodM12414 != null) {
                    m12390(methodM12414, new InterfaceC7141(this) { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子世兰楪苏哲

                        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                        public final /* synthetic */ C7217 f17898;

                        {
                            this.f17898 = this;
                        }

                        @Override // p042.InterfaceC7141
                        /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                        public final void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
                            int i22 = i2;
                            C7217 c7217 = this.f17898;
                            switch (i22) {
                                case 0:
                                    c7217.m12523((ImageView) AbstractC7165.m12418(ImageView.class, AbstractC9234.m14531(279), methodHookParam.thisObject));
                                    break;
                                case 1:
                                    c7217.m12523((ImageView) AbstractC7165.m12417(ImageView.class, methodHookParam.thisObject));
                                    break;
                                default:
                                    if (c7217.f17897 == null) {
                                        c7217.f17897 = new C7149(AbstractC9234.m14531(271));
                                    }
                                    Long l = (Long) c7217.f17897.m12398(AbstractC9234.m14531(275));
                                    if (l != null && new Date().getTime() < l.longValue()) {
                                        methodHookParam.setResult((Object) null);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                }
            }
        } catch (Exception unused5) {
            C7164 c7164M124122 = C7164.m12412(AbstractC9234.m14531(171));
            String strM14531 = AbstractC9234.m14531(62);
            C2080 c20806 = c7164M124122.f17803;
            c20806.f3963 = strM14531;
            c20806.f3964 = new Class[]{cls};
            final int i3 = 1;
            m12389(c7164M124122.m12414(), new InterfaceC7141(this) { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子世兰楪苏哲

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C7217 f17898;

                {
                    this.f17898 = this;
                }

                @Override // p042.InterfaceC7141
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
                    int i22 = i3;
                    C7217 c7217 = this.f17898;
                    switch (i22) {
                        case 0:
                            c7217.m12523((ImageView) AbstractC7165.m12418(ImageView.class, AbstractC9234.m14531(279), methodHookParam.thisObject));
                            break;
                        case 1:
                            c7217.m12523((ImageView) AbstractC7165.m12417(ImageView.class, methodHookParam.thisObject));
                            break;
                        default:
                            if (c7217.f17897 == null) {
                                c7217.f17897 = new C7149(AbstractC9234.m14531(271));
                            }
                            Long l = (Long) c7217.f17897.m12398(AbstractC9234.m14531(275));
                            if (l != null && new Date().getTime() < l.longValue()) {
                                methodHookParam.setResult((Object) null);
                                break;
                            }
                            break;
                    }
                }
            });
            String strM1453222 = AbstractC9234.m14532("喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵喵喵呜~喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵呜");
            Class cls32 = Integer.TYPE;
            final int i22 = 2;
            m12390(NotificationManager.class.getMethod(strM1453222, String.class, cls32, Notification.class), new InterfaceC7141(this) { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子世兰楪苏哲

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C7217 f17898;

                {
                    this.f17898 = this;
                }

                @Override // p042.InterfaceC7141
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
                    int i222 = i22;
                    C7217 c7217 = this.f17898;
                    switch (i222) {
                        case 0:
                            c7217.m12523((ImageView) AbstractC7165.m12418(ImageView.class, AbstractC9234.m14531(279), methodHookParam.thisObject));
                            break;
                        case 1:
                            c7217.m12523((ImageView) AbstractC7165.m12417(ImageView.class, methodHookParam.thisObject));
                            break;
                        default:
                            if (c7217.f17897 == null) {
                                c7217.f17897 = new C7149(AbstractC9234.m14531(271));
                            }
                            Long l = (Long) c7217.f17897.m12398(AbstractC9234.m14531(275));
                            if (l != null && new Date().getTime() < l.longValue()) {
                                methodHookParam.setResult((Object) null);
                                break;
                            }
                            break;
                    }
                }
            });
            m12390(NotificationManager.class.getMethod(AbstractC9234.m14532("喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵喵喵呜~喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵呜"), cls32, Notification.class), new InterfaceC7141(this) { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子世兰楪苏哲

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C7217 f17898;

                {
                    this.f17898 = this;
                }

                @Override // p042.InterfaceC7141
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
                    int i222 = i22;
                    C7217 c7217 = this.f17898;
                    switch (i222) {
                        case 0:
                            c7217.m12523((ImageView) AbstractC7165.m12418(ImageView.class, AbstractC9234.m14531(279), methodHookParam.thisObject));
                            break;
                        case 1:
                            c7217.m12523((ImageView) AbstractC7165.m12417(ImageView.class, methodHookParam.thisObject));
                            break;
                        default:
                            if (c7217.f17897 == null) {
                                c7217.f17897 = new C7149(AbstractC9234.m14531(271));
                            }
                            Long l = (Long) c7217.f17897.m12398(AbstractC9234.m14531(275));
                            if (l != null && new Date().getTime() < l.longValue()) {
                                methodHookParam.setResult((Object) null);
                                break;
                            }
                            break;
                    }
                }
            });
            if (AbstractC3888.m7256()) {
            }
        }
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(278);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m12523(ImageView imageView) {
        RelativeLayout relativeLayout = (RelativeLayout) imageView.getParent().getParent();
        Activity activity = (Activity) imageView.getContext();
        AbstractC3888.m7247(activity);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC7082.m12313(activity, 38.0f), AbstractC7082.m12313(activity, 38.0f));
        layoutParams.addRule(16, ((View) imageView.getParent()).getId());
        layoutParams.rightMargin = AbstractC7082.m12313(activity, 10.0f);
        layoutParams.addRule(15);
        ImageView imageView2 = new ImageView(activity);
        int iM12313 = AbstractC7082.m12313(activity, 8.0f);
        imageView2.setPadding(iM12313, iM12313, iM12313, iM12313);
        imageView2.setImageDrawable(activity.getDrawable(C0328R.drawable.do_not_disturb_icon));
        imageView2.setOnClickListener(new ViewOnClickListenerC6392(this, 8, imageView));
        relativeLayout.addView(imageView2, layoutParams);
    }
}
