package top.suzhelan.qstory.hook.item.chat;

import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.InterfaceC0181;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.InterfaceC2100;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC2270;
import androidx.core.view.C2225;
import androidx.core.view.C2238;
import androidx.core.view.InterfaceC2205;
import androidx.core.view.RunnableC2280;
import com.alibaba.fastjson2.C2942;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.load.engine.bitmap_recycle.C2973;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.AbstractC5186;
import kotlin.collections.AbstractC4343;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.C4489;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4483;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4491;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4451;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C4588;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C4591;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.C4870;
import lin.xposed.hook.javaplugin.view.C5546;
import lin.xposed.hook.javaplugin.view.C5548;
import p010.AbstractC6157;
import p012.C6164;
import p013.C6175;
import p013.C6179;
import p013.C6181;
import p013.C6182;
import p013.InterfaceC6174;
import p013.InterfaceC6184;
import p017.ThreadFactoryC6232;
import p035.C6341;
import p046.InterfaceC6480;
import p052.InterfaceC6542;
import p079.AbstractC6988;
import p079.C7005;
import p083.C7037;
import p098.C7235;
import p101.InterfaceC7253;
import p107.C7311;
import p155.C7606;
import p155.C7616;
import p166.C7685;
import p167.C7712;
import p177.AbstractC7746;
import p190.C7781;
import p190.C7799;
import p190.MenuC7801;
import p190.ViewOnKeyListenerC7780;
import p193.C7825;
import p193.C7826;
import p201.C7872;
import p205.C7901;
import p205.C7904;
import p205.C7907;
import p210.AbstractC7935;
import p227.C8012;
import p228.C8017;
import p228.C8021;
import p228.C8026;
import p228.C8030;
import p228.InterfaceC8032;
import p228.InterfaceC8033;
import p253.AbstractC8189;
import p257.C8207;
import p286.C8396;
import p286.InterfaceC8395;
import p383.C9022;
import p383.C9025;
import p391.C9114;
import retrofit2.C5754;
import retrofit2.InterfaceC5777;
import retrofit2.InterfaceC5794;
import top.suzhelan.qstory.entity.Notice;
import top.suzhelan.qstory.entity.QSResult;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C5851 implements InterfaceC6184, InterfaceC5794, InterfaceC4491, InterfaceC2100, InterfaceC0181, InterfaceC2205, InterfaceC8033, InterfaceC8395 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f16007;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16008;

    public C5851(int i) {
        this.f16008 = i;
        switch (i) {
            case 4:
                TimeUnit.MINUTES.getClass();
                C6164 c6164 = C6164.f16793;
                c6164.getClass();
                this.f16007 = new C6182(c6164);
                break;
            case 11:
                this.f16007 = new C2942();
                break;
            case 15:
                this.f16007 = new C7616(this);
                break;
            case 26:
                this.f16007 = new C5851(28);
                break;
            case 27:
                this.f16007 = new C8017(7);
                break;
            case 28:
                this.f16007 = new C8030(500L);
                break;
            default:
                this.f16007 = new LinkedHashSet();
                break;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4491
    public InterfaceC4483 build() {
        return (C7235) this.f16007;
    }

    @Override // retrofit2.InterfaceC5794
    public void onFailure(InterfaceC5777 interfaceC5777, Throwable th) {
        "p0";
        "p1";
        String strM6668 = "CheckNotice";
        String str = AbstractC6157.f16779;
        AbstractC6157.m11574(strM6668, th.toString(), th, true);
    }

    @Override // retrofit2.InterfaceC5794
    public void onResponse(InterfaceC5777 interfaceC5777, C5754 c5754) {
        C6341 c6341 = (C6341) this.f16007;
        "call";
        "response";
        QSResult qSResult = (QSResult) c5754.f15756;
        Notice notice = qSResult != null ? (Notice) qSResult.getData() : null;
        if (notice != null) {
            int version = notice.getVersion();
            C9114 c9114 = c6341.f17466;
            String strM6668 = "lastNotice";
            c9114.getClass();
            if (version > c9114.f25485.getInt(strM6668, 0)) {
                DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("yyyy\u5e74MM\u6708dd\u65e5 HH:mm");
                StringBuilder sb = new StringBuilder();
                sb.append(notice.getTitle());
                sb.append("\n");
                sb.append(notice.getContent());
                sb.append("\n");
                sb.append(notice.getCreateTime().format(dateTimeFormatterOfPattern));
                sb.append(" by ");
                sb.append(notice.getOperator());
                C8207 c8207 = new C8207();
                c8207.f22615 = "\u6709\u65b0\u516c\u544a";
                c8207.mo13704();
                c8207.f22627 = sb;
                c8207.mo13704();
                int i = 1;
                c8207.mo13702("\u786e\u5b9a", new C5546(c6341, i, notice));
                String strM66682 = "\u67e5\u770b\u5386\u53f2\u516c\u544a";
                C5548 c5548 = new C5548(i);
                c8207.f22631 = strM66682;
                c8207.f22622 = c5548;
                c8207.mo13704();
                c8207.m13714();
                c8207.mo13703(false);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public void m11194(C9022 c9022) {
        "data";
        c9022.getClass();
        C5835 c5835 = (C5835) this.f16007;
        ArrayList arrayList = c5835.f15978;
        arrayList.add(c9022);
        c5835.f15975.put(c9022.f25317 + c9022.f25315, c9022);
        c5835.f15980.m14640(arrayList, "groupCache");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public void m11195(C9025 c9025) {
        "data";
        c9025.getClass();
        C5835 c5835 = (C5835) this.f16007;
        ArrayList arrayList = c5835.f15977;
        arrayList.add(c9025);
        c5835.f15976.put(c9025.f25320 + c9025.f25319, c9025);
        c5835.f15980.m14640(arrayList, "friendCache");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public InterfaceC1333 m11196() {
        C7712 c7712M12980 = C7712.m12980();
        if (c7712M12980.m12983() == 1) {
            return new C7826(true);
        }
        InterfaceC1395 interfaceC1395M2465 = AbstractC1367.m2465(Boolean.FALSE);
        c7712M12980.m12985(new C7825(interfaceC1395M2465, this));
        return interfaceC1395M2465;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public C7606 mo3495(int i) {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public C7606 mo3496(int i) {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public long m11197(long j) {
        C2942 c2942 = (C2942) this.f16007;
        c2942.getClass();
        if (C7901.m13323(j) <= 0.0f || C7901.m13322(j) <= 0.0f) {
            AbstractC7935.m13395("maximumVelocity should be a positive value. You specified=" + ((Object) C7901.m13319(j)));
        }
        return AbstractC0455.m1149(((C7311) c2942.f9317).m12480(C7901.m13323(j)), ((C7311) c2942.f9316).m12480(C7901.m13322(j)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public AbstractC6988 m11198(C4451 c4451) {
        C4591 c4591;
        c4451.getClass();
        C4686 c4686M9000 = c4451.m9000();
        if (c4686M9000 == null || LightClassOriginKind.SOURCE != null) {
            Class<?> declaringClass = c4451.f13079.getDeclaringClass();
            C4451 c44512 = declaringClass != null ? new C4451(declaringClass) : null;
            if (c44512 != null) {
                AbstractC6988 abstractC6988M11198 = m11198(c44512);
                InterfaceC7253 interfaceC7253Mo9225 = abstractC6988M11198 != null ? abstractC6988M11198.mo9225() : null;
                InterfaceC4476 interfaceC4476Mo9165 = interfaceC7253Mo9225 != null ? interfaceC7253Mo9225.mo9165(c4451.m8998(), NoLookupLocation.FROM_JAVA_LOADER) : null;
                if (interfaceC4476Mo9165 instanceof AbstractC6988) {
                    return (AbstractC6988) interfaceC4476Mo9165;
                }
            } else if (c4686M9000 != null && (c4591 = (C4591) AbstractC4343.m8830(AbstractC8189.m13660(((C7037) this.f16007).m12346(c4686M9000.m9330())))) != null) {
                C4588 c4588 = c4591.f13392.f13357;
                c4588.getClass();
                return c4588.m9198(c4451.m8998(), c4451);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public boolean mo3497(int i, int i2, Bundle bundle) {
        return false;
    }

    @Override // p013.InterfaceC6184
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C6179 mo11199() {
        return (C6179) this.f16007;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4491
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public InterfaceC4491 mo9093(InterfaceC6480 interfaceC6480) {
        interfaceC6480.getClass();
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4491
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public InterfaceC4491 mo9094(List list) {
        list.getClass();
        return this;
    }

    @Override // p013.InterfaceC6184
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C6181 mo11200() throws Throwable {
        InterfaceC6174 interfaceC6174M11625;
        IOException iOException = null;
        while (!((C6179) this.f16007).f16896.f16873) {
            try {
                interfaceC6174M11625 = ((C6179) this.f16007).m11625();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    AbstractC5186.m10212(iOException, e);
                }
                if (!((C6179) this.f16007).m11626(null)) {
                    throw iOException;
                }
            }
            if (!interfaceC6174M11625.isReady()) {
                C6175 c6175Mo11603 = interfaceC6174M11625.mo11603();
                if (c6175Mo11603.f16856 == null && c6175Mo11603.f16855 == null) {
                    c6175Mo11603 = interfaceC6174M11625.mo11600();
                }
                InterfaceC6174 interfaceC6174 = c6175Mo11603.f16856;
                Throwable th = c6175Mo11603.f16855;
                if (th != null) {
                    throw th;
                }
                if (interfaceC6174 != null) {
                    ((C6179) this.f16007).f16893.addFirst(interfaceC6174);
                }
            }
            return interfaceC6174M11625.mo11604();
        }
        C5919.m11246("Canceled");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4491
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public InterfaceC4491 mo9095(EmptyList emptyList) {
        emptyList.getClass();
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4491
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public InterfaceC4491 mo9096(CallableMemberDescriptor$Kind callableMemberDescriptor$Kind) {
        callableMemberDescriptor$Kind.getClass();
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4491
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public InterfaceC4491 mo9099(C4690 c4690) {
        c4690.getClass();
        return this;
    }

    @Override // androidx.appcompat.widget.InterfaceC0181
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public void mo623(MenuC7801 menuC7801, C7799 c7799) {
        ViewOnKeyListenerC7780 viewOnKeyListenerC7780 = (ViewOnKeyListenerC7780) this.f16007;
        Handler handler = viewOnKeyListenerC7780.f21165;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC7780.f21163;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC7801 == ((C7781) arrayList.get(i)).f21169) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new RunnableC2280(this, i2 < arrayList.size() ? (C7781) arrayList.get(i2) : null, c7799, menuC7801), menuC7801, SystemClock.uptimeMillis() + 200);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4491
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public InterfaceC4491 mo9102(C4489 c4489) {
        c4489.getClass();
        return this;
    }

    @Override // androidx.appcompat.widget.InterfaceC0181
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public void mo625(MenuC7801 menuC7801, MenuItem menuItem) {
        ((ViewOnKeyListenerC7780) this.f16007).f21165.removeCallbacksAndMessages(menuC7801);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4491
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public InterfaceC4491 mo9103(InterfaceC4498 interfaceC4498) {
        interfaceC4498.getClass();
        return this;
    }

    @Override // p286.InterfaceC8395
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public boolean mo298(Object obj, File file, C8396 c8396) throws Throwable {
        InputStream inputStream = (InputStream) obj;
        C2973 c2973 = (C2973) this.f16007;
        byte[] bArr = (byte[]) c2973.m6388(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    } catch (IOException e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        c2973.m6391(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        c2973.m6391(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                c2973.m6391(bArr);
                return true;
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // androidx.compose.ui.window.InterfaceC2100
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public long mo1616(C7904 c7904, long j, LayoutDirection layoutDirection, long j2) {
        long j3 = ((C7907) ((InterfaceC6542) this.f16007).invoke()).f21883;
        int iM13077 = AbstractC7746.m13077(c7904.f21881 + ((int) (j3 >> 32)), (int) (j2 >> 32), (int) (j >> 32), layoutDirection == LayoutDirection.Ltr);
        return (((long) AbstractC7746.m13077(c7904.f21880 + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true)) & 4294967295L) | (((long) iM13077) << 32);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4491
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public InterfaceC4491 mo9107(AbstractC4881 abstractC4881) {
        abstractC4881.getClass();
        return this;
    }

    @Override // androidx.core.view.InterfaceC2205
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public C2225 mo302(View view, C2225 c2225) {
        C2238 c2238 = c2225.f6520;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f16007;
        if (!Objects.equals(coordinatorLayout.f6403, c2225)) {
            coordinatorLayout.f6403 = c2225;
            boolean z = c2225.m4055() > 0;
            coordinatorLayout.f6402 = z;
            coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
            if (!c2238.mo4009()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = AbstractC2270.f6593;
                    if (childAt.getFitsSystemWindows() && ((C7872) childAt.getLayoutParams()).f21660 != null && c2238.mo4009()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return c2225;
    }

    @Override // p228.InterfaceC8033
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public InterfaceC8032 mo316(C8026 c8026) {
        switch (this.f16008) {
            case 26:
                return new C8012((C5851) this.f16007);
            default:
                return new C8021((C8017) this.f16007, 1);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4491
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public InterfaceC4491 mo9097() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4491
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public InterfaceC4491 mo9098() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4491
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public InterfaceC4491 mo9100() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4491
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public InterfaceC4491 mo9101() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4491
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public InterfaceC4491 mo9104() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4491
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public InterfaceC4491 mo9106() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4491
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public InterfaceC4491 mo9092(C7005 c7005) {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4491
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public InterfaceC4491 mo9105(Modality modality) {
        return this;
    }

    public /* synthetic */ C5851(Object obj, int i) {
        this.f16008 = i;
        this.f16007 = obj;
    }

    public /* synthetic */ C5851(int i, boolean z) {
        this.f16008 = i;
    }

    public C5851(TextView textView) {
        this.f16008 = 19;
        this.f16007 = new C7685(textView);
    }

    public C5851(EditText editText) {
        this.f16008 = 18;
        this.f16007 = new C4870(editText);
    }

    public C5851(ThreadFactoryC6232 threadFactoryC6232) {
        this.f16008 = 1;
        this.f16007 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactoryC6232);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public void mo3498(int i, C7606 c7606, String str, Bundle bundle) {
    }
}
