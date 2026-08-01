package top.suzhelan.qstory.hook.item.chat;

import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.InterfaceC1028;
import androidx.compose.p001ui.unit.LayoutDirection;
import androidx.compose.p001ui.window.InterfaceC2933;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2168;
import androidx.compose.runtime.InterfaceC2230;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC3103;
import androidx.core.view.C3058;
import androidx.core.view.C3071;
import androidx.core.view.InterfaceC3038;
import androidx.core.view.RunnableC3113;
import com.alibaba.fastjson2.AbstractC3738;
import com.alibaba.fastjson2.C3776;
import com.bumptech.glide.load.engine.bitmap_recycle.C3806;
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
import kotlin.AbstractC6019;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.C5322;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5316;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5324;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5284;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C5421;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C5424;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import lin.xposed.hook.javaplugin.view.C6378;
import lin.xposed.hook.javaplugin.view.C6380;
import p026.AbstractC7017;
import p027.C7028;
import p027.C7034;
import p027.C7035;
import p027.C7036;
import p027.InterfaceC7030;
import p027.InterfaceC7039;
import p029.ThreadFactoryC7053;
import p031.C7063;
import p050.AbstractC7176;
import p052.C7188;
import p062.InterfaceC7310;
import p068.InterfaceC7372;
import p095.AbstractC7818;
import p095.C7835;
import p099.C7867;
import p114.C8065;
import p117.InterfaceC8083;
import p123.C8141;
import p171.C8436;
import p171.C8446;
import p182.C8515;
import p183.C8542;
import p193.AbstractC8576;
import p206.C8611;
import p206.C8629;
import p206.MenuC8631;
import p206.ViewOnKeyListenerC8610;
import p209.C8655;
import p209.C8656;
import p217.C8702;
import p221.C8731;
import p221.C8734;
import p221.C8737;
import p226.AbstractC8765;
import p243.C8842;
import p244.C8847;
import p244.C8851;
import p244.C8856;
import p244.C8860;
import p244.InterfaceC8862;
import p244.InterfaceC8863;
import p273.C9037;
import p302.C9226;
import p302.InterfaceC9225;
import p400.C9857;
import p400.C9860;
import p407.C9924;
import retrofit2.C6585;
import retrofit2.InterfaceC6608;
import retrofit2.InterfaceC6625;
import top.suzhelan.qstory.entity.Notice;
import top.suzhelan.qstory.entity.QSResult;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6686 implements InterfaceC7039, InterfaceC6625, InterfaceC5324, InterfaceC2933, InterfaceC1028, InterfaceC3038, InterfaceC8863, InterfaceC9225 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f16359;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16360;

    public C6686(int i) {
        this.f16360 = i;
        switch (i) {
            case 2:
                this.f16359 = new LinkedHashSet();
                break;
            case 11:
                this.f16359 = new C3776();
                break;
            case 15:
                this.f16359 = new C8446(this);
                break;
            case 26:
                this.f16359 = new C6686(28);
                break;
            case 27:
                this.f16359 = new C8847(7);
                break;
            case 28:
                this.f16359 = new C8860(500L);
                break;
            default:
                TimeUnit.MINUTES.getClass();
                C7063 c7063 = C7063.f17520;
                c7063.getClass();
                this.f16359 = new C7034(c7063);
                break;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5324
    public InterfaceC5316 build() {
        return (C8065) this.f16359;
    }

    @Override // retrofit2.InterfaceC6625
    public void onFailure(InterfaceC6608 interfaceC6608, Throwable th) {
        "p0";
        "p1";
        String strM14531 = "CheckNotice";
        String str = AbstractC7017.f17361;
        AbstractC7017.m12164(strM14531, th.toString(), th, true);
    }

    @Override // retrofit2.InterfaceC6625
    public void onResponse(InterfaceC6608 interfaceC6608, C6585 c6585) {
        C7188 c7188 = (C7188) this.f16359;
        "call";
        "response";
        QSResult qSResult = (QSResult) c6585.f16101;
        Notice notice = qSResult != null ? (Notice) qSResult.getData() : null;
        if (notice != null) {
            int version = notice.getVersion();
            C9924 c9924 = c7188.f17858;
            String strM14531 = "lastNotice";
            c9924.getClass();
            if (version > c9924.f25834.getInt(strM14531, 0)) {
                DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm");
                StringBuilder sb = new StringBuilder();
                sb.append(notice.getTitle());
                sb.append("\n");
                sb.append(notice.getContent());
                sb.append("\n");
                sb.append(notice.getCreateTime().format(dateTimeFormatterOfPattern));
                sb.append(" by ");
                sb.append(notice.getOperator());
                C9037 c9037 = new C9037();
                c9037.f22959 = "有新公告";
                c9037.mo14280();
                c9037.f22971 = sb;
                c9037.mo14280();
                int i = 1;
                c9037.mo14278("确定", new C6378(c7188, i, notice));
                String strM145312 = "查看历史公告";
                C6380 c6380 = new C6380(i);
                c9037.f22975 = strM145312;
                c9037.f22966 = c6380;
                c9037.mo14280();
                c9037.m14290();
                c9037.mo14279(false);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public void m11815(C9857 c9857) {
        "data";
        c9857.getClass();
        C6670 c6670 = (C6670) this.f16359;
        ArrayList arrayList = c6670.f16334;
        arrayList.add(c9857);
        c6670.f16331.put(c9857.f25655 + c9857.f25653, c9857);
        c6670.f16336.m15236(arrayList, "groupCache");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public void m11816(C9860 c9860) {
        "data";
        c9860.getClass();
        C6670 c6670 = (C6670) this.f16359;
        ArrayList arrayList = c6670.f16333;
        arrayList.add(c9860);
        c6670.f16332.put(c9860.f25658 + c9860.f25657, c9860);
        c6670.f16336.m15236(arrayList, "friendCache");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public InterfaceC2168 m11817() {
        C8542 c8542M13569 = C8542.m13569();
        if (c8542M13569.m13572() == 1) {
            return new C8656(true);
        }
        InterfaceC2230 interfaceC2230M3034 = AbstractC2202.m3034(Boolean.FALSE);
        c8542M13569.m13574(new C8655(interfaceC2230M3034, this));
        return interfaceC2230M3034;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public C8436 mo4065(int i) {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public C8436 mo4066(int i) {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public long m11818(long j) {
        C3776 c3776 = (C3776) this.f16359;
        c3776.getClass();
        if (C8731.m13910(j) <= 0.0f || C8731.m13909(j) <= 0.0f) {
            AbstractC8765.m13982("maximumVelocity should be a positive value. You specified=" + ((Object) C8731.m13906(j)));
        }
        return AbstractC3738.m6871(((C8141) c3776.f9664).m13066(C8731.m13910(j)), ((C8141) c3776.f9663).m13066(C8731.m13909(j)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public AbstractC7818 m11819(C5284 c5284) {
        C5424 c5424;
        c5284.getClass();
        C5519 c5519M9549 = c5284.m9549();
        if (c5519M9549 == null || LightClassOriginKind.SOURCE != null) {
            Class<?> declaringClass = c5284.f13428.getDeclaringClass();
            C5284 c52842 = declaringClass != null ? new C5284(declaringClass) : null;
            if (c52842 != null) {
                AbstractC7818 abstractC7818M11819 = m11819(c52842);
                InterfaceC8083 interfaceC8083Mo9774 = abstractC7818M11819 != null ? abstractC7818M11819.mo9774() : null;
                InterfaceC5309 interfaceC5309Mo9714 = interfaceC8083Mo9774 != null ? interfaceC8083Mo9774.mo9714(c5284.m9547(), NoLookupLocation.FROM_JAVA_LOADER) : null;
                if (interfaceC5309Mo9714 instanceof AbstractC7818) {
                    return (AbstractC7818) interfaceC5309Mo9714;
                }
            } else if (c5519M9549 != null && (c5424 = (C5424) AbstractC5176.m9374(AbstractC7176.m12487(((C7867) this.f16359).m12932(c5519M9549.m9879())))) != null) {
                C5421 c5421 = c5424.f13741.f13706;
                c5421.getClass();
                return c5421.m9747(c5284.m9547(), c5284);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public boolean mo4067(int i, int i2, Bundle bundle) {
        return false;
    }

    @Override // p027.InterfaceC7039
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C7035 mo11820() {
        return (C7035) this.f16359;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5324
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public InterfaceC5324 mo9642(InterfaceC7310 interfaceC7310) {
        interfaceC7310.getClass();
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5324
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public InterfaceC5324 mo9643(List list) {
        list.getClass();
        return this;
    }

    @Override // p027.InterfaceC7039
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C7036 mo11821() throws Throwable {
        InterfaceC7030 interfaceC7030M12204;
        IOException iOException = null;
        while (!((C7035) this.f16359).f17450.f17423) {
            try {
                interfaceC7030M12204 = ((C7035) this.f16359).m12204();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    AbstractC6019.m10775(iOException, e);
                }
                if (!((C7035) this.f16359).m12205(null)) {
                    throw iOException;
                }
            }
            if (!interfaceC7030M12204.isReady()) {
                C7028 c7028Mo12181 = interfaceC7030M12204.mo12181();
                if (c7028Mo12181.f17405 == null && c7028Mo12181.f17404 == null) {
                    c7028Mo12181 = interfaceC7030M12204.mo12179();
                }
                InterfaceC7030 interfaceC7030 = c7028Mo12181.f17405;
                Throwable th = c7028Mo12181.f17404;
                if (th != null) {
                    throw th;
                }
                if (interfaceC7030 != null) {
                    ((C7035) this.f16359).f17447.addFirst(interfaceC7030);
                }
            }
            return interfaceC7030M12204.mo12182();
        }
        C6755.m11866("Canceled");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5324
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public InterfaceC5324 mo9644(EmptyList emptyList) {
        emptyList.getClass();
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5324
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public InterfaceC5324 mo9645(CallableMemberDescriptor$Kind callableMemberDescriptor$Kind) {
        callableMemberDescriptor$Kind.getClass();
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5324
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public InterfaceC5324 mo9648(C5523 c5523) {
        c5523.getClass();
        return this;
    }

    @Override // androidx.appcompat.widget.InterfaceC1028
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public void mo1184(MenuC8631 menuC8631, C8629 c8629) {
        ViewOnKeyListenerC8610 viewOnKeyListenerC8610 = (ViewOnKeyListenerC8610) this.f16359;
        Handler handler = viewOnKeyListenerC8610.f21507;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC8610.f21505;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC8631 == ((C8611) arrayList.get(i)).f21511) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new RunnableC3113(this, i2 < arrayList.size() ? (C8611) arrayList.get(i2) : null, c8629, menuC8631), menuC8631, SystemClock.uptimeMillis() + 200);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5324
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public InterfaceC5324 mo9651(C5322 c5322) {
        c5322.getClass();
        return this;
    }

    @Override // androidx.appcompat.widget.InterfaceC1028
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public void mo1186(MenuC8631 menuC8631, MenuItem menuItem) {
        ((ViewOnKeyListenerC8610) this.f16359).f21507.removeCallbacksAndMessages(menuC8631);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5324
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public InterfaceC5324 mo9652(InterfaceC5331 interfaceC5331) {
        interfaceC5331.getClass();
        return this;
    }

    @Override // p302.InterfaceC9225
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public boolean mo859(Object obj, File file, C9226 c9226) throws Throwable {
        InputStream inputStream = (InputStream) obj;
        C3806 c3806 = (C3806) this.f16359;
        byte[] bArr = (byte[]) c3806.m7006(65536, byte[].class);
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
                        c3806.m7009(bArr);
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
                        c3806.m7009(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                c3806.m7009(bArr);
                return true;
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // androidx.compose.p001ui.window.InterfaceC2933
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public long mo2186(C8734 c8734, long j, LayoutDirection layoutDirection, long j2) {
        long j3 = ((C8737) ((InterfaceC7372) this.f16359).invoke()).f22225;
        int iM13664 = AbstractC8576.m13664(c8734.f22223 + ((int) (j3 >> 32)), (int) (j2 >> 32), (int) (j >> 32), layoutDirection == LayoutDirection.Ltr);
        return (((long) AbstractC8576.m13664(c8734.f22222 + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true)) & 4294967295L) | (((long) iM13664) << 32);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5324
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public InterfaceC5324 mo9656(AbstractC5714 abstractC5714) {
        abstractC5714.getClass();
        return this;
    }

    @Override // androidx.core.view.InterfaceC3038
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public C3058 mo863(View view, C3058 c3058) {
        C3071 c3071 = c3058.f6866;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f16359;
        if (!Objects.equals(coordinatorLayout.f6749, c3058)) {
            coordinatorLayout.f6749 = c3058;
            boolean z = c3058.m4625() > 0;
            coordinatorLayout.f6748 = z;
            coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
            if (!c3071.mo4579()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = AbstractC3103.f6939;
                    if (childAt.getFitsSystemWindows() && ((C8702) childAt.getLayoutParams()).f22002 != null && c3071.mo4579()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return c3058;
    }

    @Override // p244.InterfaceC8863
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public InterfaceC8862 mo877(C8856 c8856) {
        switch (this.f16360) {
            case 26:
                return new C8842((C6686) this.f16359);
            default:
                return new C8851((C8847) this.f16359, 1);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5324
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public InterfaceC5324 mo9646() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5324
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public InterfaceC5324 mo9647() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5324
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public InterfaceC5324 mo9649() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5324
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public InterfaceC5324 mo9650() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5324
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public InterfaceC5324 mo9653() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5324
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public InterfaceC5324 mo9655() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5324
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public InterfaceC5324 mo9641(C7835 c7835) {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5324
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public InterfaceC5324 mo9654(Modality modality) {
        return this;
    }

    public /* synthetic */ C6686(Object obj, int i) {
        this.f16360 = i;
        this.f16359 = obj;
    }

    public /* synthetic */ C6686(int i, boolean z) {
        this.f16360 = i;
    }

    public C6686(TextView textView) {
        this.f16360 = 19;
        this.f16359 = new C8515(textView);
    }

    public C6686(EditText editText) {
        this.f16360 = 18;
        this.f16359 = new C5703(editText);
    }

    public C6686(ThreadFactoryC7053 threadFactoryC7053) {
        this.f16360 = 4;
        this.f16359 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactoryC7053);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public void mo4068(int i, C8436 c8436, String str, Bundle bundle) {
    }
}
