package p050c0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.Toast;
import androidx.emoji2.text.RunnableC0486k;
import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import org.luckypray.dexkit.C1031R;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0137c;
import p007D0.C0146l;
import p009E0.AbstractC0179j;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.Z */
/* JADX INFO: loaded from: classes.dex */
public final class C0636Z extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f1951b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0639a0 f1952c;

    public C0636Z() {
        this.f1951b = 0;
        this.f1952c = C0639a0.f1967a;
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: a */
    public void mo1385a(C0760b c0760b) {
        Uri data;
        Object objM116u;
        switch (this.f1951b) {
            case 0:
                C0639a0 c0639a0 = this.f1952c;
                Object[] objArr = c0760b.f2670c;
                AbstractC0307g.m702d(objArr, "args");
                Object objM537n0 = AbstractC0179j.m537n0(0, objArr);
                Integer num = objM537n0 instanceof Integer ? (Integer) objM537n0 : null;
                if (num != null) {
                    int iIntValue = num.intValue();
                    if (iIntValue == 658452 || iIntValue == 658453) {
                        Object[] objArr2 = c0760b.f2670c;
                        AbstractC0307g.m702d(objArr2, "args");
                        Object objM537n02 = AbstractC0179j.m537n0(1, objArr2);
                        Integer num2 = objM537n02 instanceof Integer ? (Integer) objM537n02 : null;
                        if (num2 != null && num2.intValue() == -1) {
                            Object[] objArr3 = c0760b.f2670c;
                            AbstractC0307g.m702d(objArr3, "args");
                            Object objM537n03 = AbstractC0179j.m537n0(2, objArr3);
                            Intent intent = objM537n03 instanceof Intent ? (Intent) objM537n03 : null;
                            if (intent == null || (data = intent.getData()) == null) {
                                return;
                            }
                            Object obj = c0760b.f2669b;
                            Activity activity = obj instanceof Activity ? (Activity) obj : null;
                            if (activity == null) {
                                return;
                            }
                            boolean z2 = iIntValue == 658453;
                            try {
                                File file = new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK");
                                if (!file.exists()) {
                                    file.mkdirs();
                                }
                                File file2 = new File(file, z2 ? "right.9.png" : "left.9.png");
                                InputStream inputStreamOpenInputStream = activity.getContentResolver().openInputStream(data);
                                if (inputStreamOpenInputStream != null) {
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                        try {
                                            AbstractC0040p.m115t(inputStreamOpenInputStream, fileOutputStream, 8192);
                                            AbstractC0040p.m108m(fileOutputStream, null);
                                            AbstractC0040p.m108m(inputStreamOpenInputStream, null);
                                        } finally {
                                        }
                                    } finally {
                                    }
                                }
                                C0661h1 c0661h1 = C0661h1.f2048a;
                                String str = z2 ? "bubble_path_right" : "bubble_path_left";
                                String absolutePath = file2.getAbsolutePath();
                                AbstractC0307g.m702d(absolutePath, "getAbsolutePath(...)");
                                c0661h1.m1666f(str, absolutePath, false);
                                c0661h1.m1667g("bubble_enabled", true, false);
                                ConcurrentHashMap concurrentHashMap = AbstractC0626U.f1936a;
                                String absolutePath2 = file2.getAbsolutePath();
                                AbstractC0307g.m702d(absolutePath2, "getAbsolutePath(...)");
                                AbstractC0626U.m1530c(absolutePath2);
                                Toast.makeText(activity, "气泡皮肤导入成功！", 0).show();
                                String str2 = "bubble imported: " + file2.getAbsolutePath();
                                c0639a0.getClass();
                                C0639a0.m1601p0(str2);
                                objM116u = C0146l.f339a;
                            } catch (Throwable th) {
                                objM116u = AbstractC0040p.m116u(th);
                            }
                            Throwable thM465a = AbstractC0141g.m465a(objM116u);
                            if (thM465a != null) {
                                String str3 = "bubble import fail: " + thM465a.getMessage();
                                c0639a0.getClass();
                                C0639a0.m1601p0(str3);
                                Toast.makeText(activity, "导入失败: " + thM465a.getMessage(), 0).show();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e7  */
    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo1386b(C0760b c0760b) {
        Object tag;
        int i2 = 1;
        int i3 = 0;
        switch (this.f1951b) {
            case 1:
                Object obj = c0760b.f2669b;
                View view = obj instanceof View ? (View) obj : null;
                if (view == null) {
                    return;
                }
                Object[] objArr = c0760b.f2670c;
                AbstractC0307g.m702d(objArr, "args");
                Object objM537n0 = AbstractC0179j.m537n0(0, objArr);
                MotionEvent motionEvent = objM537n0 instanceof MotionEvent ? (MotionEvent) objM537n0 : null;
                if (motionEvent == null || (tag = view.getTag(C1031R.id.abc_tag_message_object)) == null) {
                    return;
                }
                this.f1952c.getClass();
                C0686q c0686qM1753a = C0683p.m1753a();
                if (c0686qM1753a.f2151g) {
                    Object tag2 = view.getTag(C1031R.id.abc_tag_swipe_state);
                    C0632X c0632x = tag2 instanceof C0632X ? (C0632X) tag2 : null;
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 0) {
                        view.animate().cancel();
                        view.setTag(C1031R.id.abc_tag_swipe_state, new C0632X(motionEvent.getRawX(), motionEvent.getRawY(), ViewConfiguration.get(view.getContext()).getScaledTouchSlop()));
                        return;
                    }
                    if (actionMasked == 1) {
                        if (c0632x != null) {
                            return;
                        }
                        view.setTag(C1031R.id.abc_tag_swipe_state, null);
                        ViewParent parent = view.getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(false);
                        }
                        if (!c0632x.f1947d) {
                            return;
                        }
                        float rawX = motionEvent.getRawX() - c0632x.f1944a;
                        if (motionEvent.getActionMasked() == 1) {
                            Context context = view.getContext();
                            AbstractC0307g.m702d(context, "getContext(...)");
                            int iOrdinal = ((rawX >= ((float) (-C0639a0.m1607u(context, 32))) || !c0686qM1753a.f2151g) ? EnumC0640a1.f1993a : EnumC0640a1.f1994b).ordinal();
                            if (iOrdinal != 0) {
                                if (iOrdinal == 1) {
                                    C0639a0.m1601p0("left swipe quote delta=" + ((int) rawX));
                                    Object objM1587i0 = C0639a0.m1587i0(view, tag);
                                    Object obj2 = C0639a0.f1961A;
                                    View view2 = obj2 instanceof View ? (View) obj2 : null;
                                    C0670k1 c0670k1 = C0670k1.f2084a;
                                    if (C0670k1.m1689k(C0670k1.m1681c(), "swipe.quote.prepare") && view2 != null) {
                                        view2.post(new RunnableC0486k(objM1587i0, view2, view, i2));
                                    } else if (!C0639a0.m1562S(objM1587i0) && !C0639a0.m1561R(objM1587i0)) {
                                        if (view2 != null) {
                                            view2.post(new RunnableC0603L(i3, view, objM1587i0));
                                        } else {
                                            C0639a0.m1601p0("left swipe quote target not ready for ".concat(objM1587i0.getClass().getName()));
                                        }
                                    }
                                } else {
                                    if (iOrdinal != 2) {
                                        throw new C0137c();
                                    }
                                    C0639a0.m1601p0("right swipe repeat delta=" + ((int) rawX));
                                    if (!C0639a0.m1563T(C0639a0.f1961A, tag, "ChatFooter") && !C0639a0.m1563T(C0639a0.f1962B, tag, "quoteComponent")) {
                                        if (C0639a0.m1562S(tag) || C0639a0.m1561R(tag)) {
                                            C0639a0.m1601p0("right swipe fallback to quote for ".concat(tag.getClass().getName()));
                                        } else {
                                            C0639a0.m1601p0("right swipe repeat not ready for ".concat(tag.getClass().getName()));
                                        }
                                    }
                                }
                            }
                        }
                        view.animate().translationX(0.0f).setDuration(180L).start();
                    } else if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            return;
                        }
                        if (c0632x != null) {
                        }
                    } else {
                        if (c0632x == null) {
                            return;
                        }
                        float rawX2 = motionEvent.getRawX() - c0632x.f1944a;
                        float rawY = motionEvent.getRawY() - c0632x.f1945b;
                        if (!c0632x.f1947d) {
                            int i4 = c0632x.f1946c;
                            boolean z2 = c0686qM1753a.f2151g;
                            if (Math.abs(rawX2) > Math.max(4.0f, i4 * 0.75f) && Math.abs(rawX2) > Math.abs(rawY) && rawX2 < 0.0f && z2) {
                                c0632x.f1947d = true;
                                ViewParent parent2 = view.getParent();
                                if (parent2 != null) {
                                    parent2.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                        if (!c0632x.f1947d) {
                            return;
                        }
                        Context context2 = view.getContext();
                        AbstractC0307g.m702d(context2, "getContext(...)");
                        float fM1607u = C0639a0.m1607u(context2, 120);
                        if (!c0686qM1753a.f2151g && rawX2 < 0.0f) {
                            rawX2 = 0.0f;
                        }
                        view.setTranslationX(Math.max(-fM1607u, Math.min(fM1607u, rawX2 <= 0.0f ? rawX2 : 0.0f)));
                    }
                    c0760b.m1946c(Boolean.TRUE);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public C0636Z(C0639a0 c0639a0) {
        this.f1951b = 1;
        this.f1952c = c0639a0;
    }
}
