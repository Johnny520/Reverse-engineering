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
import com.alibaba.fastjson2.AbstractC2905;
import com.alibaba.fastjson2.C2943;
import com.bumptech.glide.load.engine.bitmap_recycle.C2974;
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
import kotlin.AbstractC5187;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.C4490;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4484;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4492;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4452;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C4589;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C4592;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.C4871;
import lin.xposed.hook.javaplugin.view.C5547;
import lin.xposed.hook.javaplugin.view.C5549;
import p010.AbstractC6188;
import p011.C6199;
import p011.C6205;
import p011.C6206;
import p011.C6207;
import p011.InterfaceC6201;
import p011.InterfaceC6210;
import p013.ThreadFactoryC6224;
import p015.C6234;
import p034.AbstractC6347;
import p036.C6359;
import p046.InterfaceC6481;
import p052.InterfaceC6543;
import p079.AbstractC6989;
import p079.C7006;
import p083.C7038;
import p098.C7236;
import p101.InterfaceC7254;
import p107.C7312;
import p155.C7607;
import p155.C7617;
import p166.C7686;
import p167.C7713;
import p177.AbstractC7747;
import p190.C7782;
import p190.C7800;
import p190.MenuC7802;
import p190.ViewOnKeyListenerC7781;
import p193.C7826;
import p193.C7827;
import p201.C7873;
import p205.C7902;
import p205.C7905;
import p205.C7908;
import p210.AbstractC7936;
import p227.C8013;
import p228.C8018;
import p228.C8022;
import p228.C8027;
import p228.C8031;
import p228.InterfaceC8033;
import p228.InterfaceC8034;
import p257.C8208;
import p286.C8397;
import p286.InterfaceC8396;
import p287.AbstractC8405;
import p384.C9028;
import p384.C9031;
import p391.C9095;
import retrofit2.C5755;
import retrofit2.InterfaceC5778;
import retrofit2.InterfaceC5795;
import top.suzhelan.qstory.entity.Notice;
import top.suzhelan.qstory.entity.QSResult;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C5856 implements InterfaceC6210, InterfaceC5795, InterfaceC4492, InterfaceC2100, InterfaceC0181, InterfaceC2205, InterfaceC8034, InterfaceC8396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f16014;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16015;

    public C5856(int i) {
        this.f16015 = i;
        switch (i) {
            case 2:
                this.f16014 = new LinkedHashSet();
                break;
            case 11:
                this.f16014 = new C2943();
                break;
            case 15:
                this.f16014 = new C7617(this);
                break;
            case 26:
                this.f16014 = new C5856(28);
                break;
            case 27:
                this.f16014 = new C8018(7);
                break;
            case 28:
                this.f16014 = new C8031(500L);
                break;
            default:
                TimeUnit.MINUTES.getClass();
                C6234 c6234 = C6234.f17175;
                c6234.getClass();
                this.f16014 = new C6205(c6234);
                break;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4492
    public InterfaceC4484 build() {
        return (C7236) this.f16014;
    }

    @Override // retrofit2.InterfaceC5795
    public void onFailure(InterfaceC5778 interfaceC5778, Throwable th) {
        AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵呜喵喵喵呜喵呜");
        AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵呜喵喵喵呜喵喵");
        String strM13972 = AbstractC8405.m13972(1245);
        String str = AbstractC6188.f17016;
        AbstractC6188.m11605(strM13972, th.toString(), th, true);
    }

    @Override // retrofit2.InterfaceC5795
    public void onResponse(InterfaceC5778 interfaceC5778, C5755 c5755) {
        C6359 c6359 = (C6359) this.f16014;
        AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵喵呜喵喵");
        AbstractC8405.m13972(1239);
        QSResult qSResult = (QSResult) c5755.f15756;
        Notice notice = qSResult != null ? (Notice) qSResult.getData() : null;
        if (notice != null) {
            int version = notice.getVersion();
            C9095 c9095 = c6359.f17513;
            String strM13972 = AbstractC8405.m13972(1246);
            c9095.getClass();
            if (version > c9095.f25489.getInt(strM13972, 0)) {
                DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern(AbstractC8405.m13972(1243));
                StringBuilder sb = new StringBuilder();
                sb.append(notice.getTitle());
                sb.append(AbstractC8405.m13973("喵呜呜呜呜喵喵呜"));
                sb.append(notice.getContent());
                sb.append(AbstractC8405.m13973("喵呜呜呜呜喵喵呜"));
                sb.append(notice.getCreateTime().format(dateTimeFormatterOfPattern));
                sb.append(AbstractC8405.m13973("喵呜喵呜喵喵呜呜~喵喵喵呜喵呜呜呜~喵喵喵喵喵喵呜呜~喵呜喵喵呜喵喵喵"));
                sb.append(notice.getOperator());
                C8208 c8208 = new C8208();
                c8208.f22614 = AbstractC8405.m13972(1247);
                c8208.mo13721();
                c8208.f22626 = sb;
                c8208.mo13721();
                int i = 1;
                c8208.mo13719(AbstractC8405.m13973("呜喵喵呜喵呜喵喵~呜呜喵呜喵呜喵喵~呜呜喵呜喵呜喵喵~呜喵喵喵呜呜喵呜~呜呜喵喵呜喵呜呜~呜呜呜呜喵呜呜喵"), new C5547(c6359, i, notice));
                String strM139722 = AbstractC8405.m13972(1248);
                C5549 c5549 = new C5549(i);
                c8208.f22630 = strM139722;
                c8208.f22621 = c5549;
                c8208.mo13721();
                c8208.m13731();
                c8208.mo13720(false);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public void m11256(C9028 c9028) {
        AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜");
        c9028.getClass();
        C5840 c5840 = (C5840) this.f16014;
        ArrayList arrayList = c5840.f15989;
        arrayList.add(c9028);
        c5840.f15986.put(c9028.f25310 + c9028.f25308, c9028);
        c5840.f15991.m14677(arrayList, AbstractC8405.m13972(2184));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public void m11257(C9031 c9031) {
        AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜");
        c9031.getClass();
        C5840 c5840 = (C5840) this.f16014;
        ArrayList arrayList = c5840.f15988;
        arrayList.add(c9031);
        c5840.f15987.put(c9031.f25313 + c9031.f25312, c9031);
        c5840.f15991.m14677(arrayList, AbstractC8405.m13972(2183));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public InterfaceC1333 m11258() {
        C7713 c7713M13010 = C7713.m13010();
        if (c7713M13010.m13013() == 1) {
            return new C7827(true);
        }
        InterfaceC1395 interfaceC1395M2474 = AbstractC1367.m2474(Boolean.FALSE);
        c7713M13010.m13015(new C7826(interfaceC1395M2474, this));
        return interfaceC1395M2474;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public C7607 mo3505(int i) {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public C7607 mo3506(int i) {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public long m11259(long j) {
        C2943 c2943 = (C2943) this.f16014;
        c2943.getClass();
        if (C7902.m13351(j) <= 0.0f || C7902.m13350(j) <= 0.0f) {
            AbstractC7936.m13423("maximumVelocity should be a positive value. You specified=" + ((Object) C7902.m13347(j)));
        }
        return AbstractC2905.m6311(((C7312) c2943.f9319).m12507(C7902.m13351(j)), ((C7312) c2943.f9318).m12507(C7902.m13350(j)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public AbstractC6989 m11260(C4452 c4452) {
        C4592 c4592;
        c4452.getClass();
        C4687 c4687M8990 = c4452.m8990();
        if (c4687M8990 == null || LightClassOriginKind.SOURCE != null) {
            Class<?> declaringClass = c4452.f13083.getDeclaringClass();
            C4452 c44522 = declaringClass != null ? new C4452(declaringClass) : null;
            if (c44522 != null) {
                AbstractC6989 abstractC6989M11260 = m11260(c44522);
                InterfaceC7254 interfaceC7254Mo9215 = abstractC6989M11260 != null ? abstractC6989M11260.mo9215() : null;
                InterfaceC4477 interfaceC4477Mo9155 = interfaceC7254Mo9215 != null ? interfaceC7254Mo9215.mo9155(c4452.m8988(), NoLookupLocation.FROM_JAVA_LOADER) : null;
                if (interfaceC4477Mo9155 instanceof AbstractC6989) {
                    return (AbstractC6989) interfaceC4477Mo9155;
                }
            } else if (c4687M8990 != null && (c4592 = (C4592) AbstractC4344.m8815(AbstractC6347.m11928(((C7038) this.f16014).m12373(c4687M8990.m9320())))) != null) {
                C4589 c4589 = c4592.f13396.f13361;
                c4589.getClass();
                return c4589.m9188(c4452.m8988(), c4452);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public boolean mo3507(int i, int i2, Bundle bundle) {
        return false;
    }

    @Override // p011.InterfaceC6210
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C6206 mo11261() {
        return (C6206) this.f16014;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4492
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public InterfaceC4492 mo9083(InterfaceC6481 interfaceC6481) {
        interfaceC6481.getClass();
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4492
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public InterfaceC4492 mo9084(List list) {
        list.getClass();
        return this;
    }

    @Override // p011.InterfaceC6210
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C6207 mo11262() throws Throwable {
        InterfaceC6201 interfaceC6201M11645;
        IOException iOException = null;
        while (!((C6206) this.f16014).f17105.f17078) {
            try {
                interfaceC6201M11645 = ((C6206) this.f16014).m11645();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    AbstractC5187.m10216(iOException, e);
                }
                if (!((C6206) this.f16014).m11646(null)) {
                    throw iOException;
                }
            }
            if (!interfaceC6201M11645.isReady()) {
                C6199 c6199Mo11622 = interfaceC6201M11645.mo11622();
                if (c6199Mo11622.f17060 == null && c6199Mo11622.f17059 == null) {
                    c6199Mo11622 = interfaceC6201M11645.mo11620();
                }
                InterfaceC6201 interfaceC6201 = c6199Mo11622.f17060;
                Throwable th = c6199Mo11622.f17059;
                if (th != null) {
                    throw th;
                }
                if (interfaceC6201 != null) {
                    ((C6206) this.f16014).f17102.addFirst(interfaceC6201);
                }
            }
            return interfaceC6201M11645.mo11623();
        }
        C5925.m11307("Canceled");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4492
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public InterfaceC4492 mo9085(EmptyList emptyList) {
        emptyList.getClass();
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4492
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public InterfaceC4492 mo9086(CallableMemberDescriptor$Kind callableMemberDescriptor$Kind) {
        callableMemberDescriptor$Kind.getClass();
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4492
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public InterfaceC4492 mo9089(C4691 c4691) {
        c4691.getClass();
        return this;
    }

    @Override // androidx.appcompat.widget.InterfaceC0181
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public void mo624(MenuC7802 menuC7802, C7800 c7800) {
        ViewOnKeyListenerC7781 viewOnKeyListenerC7781 = (ViewOnKeyListenerC7781) this.f16014;
        Handler handler = viewOnKeyListenerC7781.f21162;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC7781.f21160;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC7802 == ((C7782) arrayList.get(i)).f21166) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new RunnableC2280(this, i2 < arrayList.size() ? (C7782) arrayList.get(i2) : null, c7800, menuC7802), menuC7802, SystemClock.uptimeMillis() + 200);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4492
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public InterfaceC4492 mo9092(C4490 c4490) {
        c4490.getClass();
        return this;
    }

    @Override // androidx.appcompat.widget.InterfaceC0181
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public void mo626(MenuC7802 menuC7802, MenuItem menuItem) {
        ((ViewOnKeyListenerC7781) this.f16014).f21162.removeCallbacksAndMessages(menuC7802);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4492
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public InterfaceC4492 mo9093(InterfaceC4499 interfaceC4499) {
        interfaceC4499.getClass();
        return this;
    }

    @Override // p286.InterfaceC8396
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public boolean mo299(Object obj, File file, C8397 c8397) throws Throwable {
        InputStream inputStream = (InputStream) obj;
        C2974 c2974 = (C2974) this.f16014;
        byte[] bArr = (byte[]) c2974.m6446(65536, byte[].class);
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
                        c2974.m6449(bArr);
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
                        c2974.m6449(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                c2974.m6449(bArr);
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
    public long mo1626(C7905 c7905, long j, LayoutDirection layoutDirection, long j2) {
        long j3 = ((C7908) ((InterfaceC6543) this.f16014).invoke()).f21880;
        int iM13105 = AbstractC7747.m13105(c7905.f21878 + ((int) (j3 >> 32)), (int) (j2 >> 32), (int) (j >> 32), layoutDirection == LayoutDirection.Ltr);
        return (((long) AbstractC7747.m13105(c7905.f21877 + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true)) & 4294967295L) | (((long) iM13105) << 32);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4492
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public InterfaceC4492 mo9097(AbstractC4882 abstractC4882) {
        abstractC4882.getClass();
        return this;
    }

    @Override // androidx.core.view.InterfaceC2205
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public C2225 mo303(View view, C2225 c2225) {
        C2238 c2238 = c2225.f6521;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f16014;
        if (!Objects.equals(coordinatorLayout.f6404, c2225)) {
            coordinatorLayout.f6404 = c2225;
            boolean z = c2225.m4065() > 0;
            coordinatorLayout.f6403 = z;
            coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
            if (!c2238.mo4019()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = AbstractC2270.f6594;
                    if (childAt.getFitsSystemWindows() && ((C7873) childAt.getLayoutParams()).f21657 != null && c2238.mo4019()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return c2225;
    }

    @Override // p228.InterfaceC8034
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public InterfaceC8033 mo317(C8027 c8027) {
        switch (this.f16015) {
            case 26:
                return new C8013((C5856) this.f16014);
            default:
                return new C8022((C8018) this.f16014, 1);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4492
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public InterfaceC4492 mo9087() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4492
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public InterfaceC4492 mo9088() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4492
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public InterfaceC4492 mo9090() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4492
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public InterfaceC4492 mo9091() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4492
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public InterfaceC4492 mo9094() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4492
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public InterfaceC4492 mo9096() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4492
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public InterfaceC4492 mo9082(C7006 c7006) {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4492
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public InterfaceC4492 mo9095(Modality modality) {
        return this;
    }

    public /* synthetic */ C5856(Object obj, int i) {
        this.f16015 = i;
        this.f16014 = obj;
    }

    public /* synthetic */ C5856(int i, boolean z) {
        this.f16015 = i;
    }

    public C5856(TextView textView) {
        this.f16015 = 19;
        this.f16014 = new C7686(textView);
    }

    public C5856(EditText editText) {
        this.f16015 = 18;
        this.f16014 = new C4871(editText);
    }

    public C5856(ThreadFactoryC6224 threadFactoryC6224) {
        this.f16015 = 4;
        this.f16014 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactoryC6224);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public void mo3508(int i, C7607 c7607, String str, Bundle bundle) {
    }
}
