package androidx.compose.animation.core;

import android.R;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.widget.RelativeLayout;
import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0076;
import androidx.appcompat.app.C0107;
import androidx.appcompat.app.C0108;
import androidx.appcompat.app.C0113;
import androidx.appcompat.app.RunnableC0062;
import androidx.appcompat.app.ViewOnClickListenerC0086;
import androidx.appcompat.widget.C0131;
import androidx.collection.C0257;
import androidx.collection.C0263;
import androidx.collection.C0283;
import androidx.compose.runtime.C1311;
import androidx.compose.ui.autofill.C1418;
import androidx.compose.ui.autofill.InterfaceC1403;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import androidx.core.util.C2185;
import androidx.core.view.AbstractC2270;
import androidx.emoji2.text.flatbuffer.C2301;
import androidx.emoji2.text.flatbuffer.C2302;
import androidx.fragment.app.AbstractC2313;
import androidx.fragment.app.AbstractComponentCallbacksC2338;
import androidx.fragment.app.C2304;
import androidx.fragment.app.C2306;
import androidx.lifecycle.AbstractC2402;
import androidx.lifecycle.AbstractC2425;
import androidx.lifecycle.AbstractC2435;
import androidx.lifecycle.C2422;
import androidx.lifecycle.C2423;
import androidx.lifecycle.C2428;
import androidx.lifecycle.InterfaceC2427;
import androidx.recyclerview.widget.C2461;
import androidx.viewpager2.widget.C2549;
import androidx.viewpager2.widget.C2555;
import bsh.C2633;
import com.alibaba.fastjson2.AbstractC2905;
import com.bumptech.glide.AbstractC3057;
import com.bumptech.glide.load.engine.C2996;
import com.bumptech.glide.load.engine.C3002;
import com.bumptech.glide.load.engine.C3005;
import com.bumptech.glide.load.engine.C3008;
import com.bumptech.glide.load.engine.InterfaceC2989;
import com.bumptech.glide.load.engine.ThreadFactoryC2997;
import com.kongzue.dialogx.dialogs.CustomDialog$ALIGN;
import com.kongzue.dialogx.interfaces.AbstractC3749;
import com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import io.ktor.client.plugins.AbstractC3933;
import io.ktor.util.C4211;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.ReferenceQueue;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.InterfaceC5184;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.enums.InterfaceC4365;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.InterfaceC5112;
import kotlin.reflect.jvm.internal.impl.descriptors.C4468;
import kotlin.reflect.jvm.internal.impl.descriptors.C4469;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486;
import kotlin.reflect.jvm.internal.impl.km.C4549;
import kotlin.reflect.jvm.internal.impl.km.internal.C4512;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C4639;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C4648;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4636;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4644;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4722;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4747;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4749;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4754;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4756;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4759;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4767;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4771;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4772;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4811;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4831;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4830;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4782;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4801;
import kotlin.reflect.jvm.internal.impl.storage.C4837;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.storage.C4847;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import okio.internal.C5569;
import okio.internal.C5570;
import org.apache.commons.lang3.C5687;
import org.apache.commons.lang3.exception.UncheckedException;
import p004.InterfaceC6100;
import p004.InterfaceC6101;
import p004.InterfaceC6103;
import p007.C6127;
import p007.C6131;
import p007.C6148;
import p007.C6149;
import p007.C6157;
import p007.InterfaceC6136;
import p011.C6203;
import p011.RunnableC6211;
import p013.AbstractC6230;
import p013.ThreadFactoryC6224;
import p014.C6232;
import p034.AbstractC6344;
import p046.InterfaceC6478;
import p070.AbstractC6900;
import p070.AbstractC6903;
import p070.C6911;
import p077.C6972;
import p079.AbstractC6977;
import p079.AbstractC6989;
import p079.AbstractC6996;
import p083.C7041;
import p083.InterfaceC7037;
import p103.AbstractC7275;
import p139.C7533;
import p142.C7539;
import p144.C7547;
import p155.C7610;
import p160.AbstractC7636;
import p160.C7635;
import p163.InterfaceMenuItemC7661;
import p167.C7697;
import p167.C7699;
import p190.MenuC7778;
import p190.MenuC7802;
import p190.MenuItemC7793;
import p192.AbstractC7810;
import p192.C7806;
import p192.InterfaceC7811;
import p230.C8049;
import p257.AbstractC8238;
import p257.C8233;
import p257.C8236;
import p257.RunnableC8230;
import p261.AbstractC8248;
import p286.InterfaceC8393;
import p373.InterfaceC8976;
import retrofit2.AbstractC5761;
import retrofit2.C5780;
import retrofit2.C5781;
import retrofit2.ExecutorC5782;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0325 implements InterfaceC0321, InterfaceC1403, InterfaceC4636, InterfaceC4643, InterfaceC4644, InterfaceC4830, InterfaceC6100, InterfaceC6136, InterfaceC7811 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Object f1093;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Object f1094;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f1095;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f1096;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1097;

    public C0325(int i) {
        this.f1097 = i;
        switch (i) {
            case 5:
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC2997(0));
                this.f1096 = new HashMap();
                this.f1094 = new ReferenceQueue();
                this.f1095 = executorServiceNewSingleThreadExecutor;
                executorServiceNewSingleThreadExecutor.execute(new RunnableC0062(this, 8));
                break;
            case 18:
                this.f1095 = new ReentrantReadWriteLock();
                this.f1094 = new HashMap();
                break;
            case 19:
                this.f1094 = new ArrayList();
                this.f1093 = new ArrayList();
                break;
            case 20:
                this.f1096 = new ArrayDeque();
                this.f1094 = new ArrayDeque();
                this.f1093 = new ArrayDeque();
                break;
            case 23:
                this.f1095 = new C0257(0);
                this.f1096 = new SparseArray();
                this.f1094 = new C0263((Object) null);
                this.f1093 = new C0257(0);
                break;
            case 27:
                this.f1095 = new C2185(10);
                this.f1096 = new C0283(0);
                this.f1094 = new ArrayList();
                this.f1093 = new HashSet();
                break;
            default:
                this.f1095 = new ArrayList();
                this.f1096 = new HashMap();
                this.f1094 = new HashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public static void m956(C0325 c0325, RunnableC6211 runnableC6211, C6203 c6203, RunnableC6211 runnableC62112, int i) {
        C6157 c6157;
        if ((i & 1) != 0) {
            runnableC6211 = null;
        }
        if ((i & 2) != 0) {
            c6203 = null;
        }
        if ((i & 4) != 0) {
            runnableC62112 = null;
        }
        c0325.getClass();
        TimeZone timeZone = AbstractC6230.f17167;
        boolean zIsShutdown = ((ThreadPoolExecutor) c0325.m977()).isShutdown();
        synchronized (c0325) {
            if (c6203 != null) {
                try {
                    if (!((ArrayDeque) c0325.f1093).remove(c6203)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (runnableC62112 != null) {
                runnableC62112.f17128.decrementAndGet();
                if (!((ArrayDeque) c0325.f1094).remove(runnableC62112)) {
                    throw new IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (runnableC6211 != null) {
                ((ArrayDeque) c0325.f1096).add(runnableC6211);
                RunnableC6211 runnableC6211M975 = c0325.m975(runnableC6211.f17129.f17085.f16716.f16881);
                if (runnableC6211M975 != null) {
                    runnableC6211.f17128 = runnableC6211M975.f17128;
                }
            }
            if ((c6203 != null || runnableC62112 != null) && (zIsShutdown || ((ArrayDeque) c0325.f1094).isEmpty())) {
                ((ArrayDeque) c0325.f1093).isEmpty();
            }
            if (zIsShutdown) {
                List listM8797 = AbstractC4344.m8797((ArrayDeque) c0325.f1096);
                ((ArrayDeque) c0325.f1096).clear();
                c6157 = new C6157(listM8797);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayDeque) c0325.f1096).iterator();
                it.getClass();
                while (it.hasNext()) {
                    RunnableC6211 runnableC62113 = (RunnableC6211) it.next();
                    if (((ArrayDeque) c0325.f1094).size() >= 64) {
                        break;
                    }
                    if (runnableC62113.f17128.get() < 5) {
                        it.remove();
                        runnableC62113.f17128.incrementAndGet();
                        arrayList.add(runnableC62113);
                        ((ArrayDeque) c0325.f1094).add(runnableC62113);
                    }
                }
                c6157 = new C6157(arrayList);
            }
        }
        int size = c6157.f16937.size();
        for (int i2 = 0; i2 < size; i2++) {
            RunnableC6211 runnableC62114 = (RunnableC6211) c6157.f16937.get(i2);
            if (runnableC62114 != runnableC6211) {
                C6203 c62032 = runnableC62114.f17129;
            }
            if (zIsShutdown) {
                runnableC62114.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                C6203 c62033 = runnableC62114.f17129;
                c62033.m11640(interruptedIOException);
                runnableC62114.f17130.mo992(c62033, interruptedIOException);
            } else {
                ExecutorService executorServiceM977 = c0325.m977();
                runnableC62114.getClass();
                C6203 c62034 = runnableC62114.f17129;
                c62034.f17087.f16730.getClass();
                try {
                    try {
                        ((ThreadPoolExecutor) executorServiceM977).execute(runnableC62114);
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                        interruptedIOException2.initCause(e);
                        C6203 c62035 = runnableC62114.f17129;
                        c62035.m11640(interruptedIOException2);
                        runnableC62114.f17130.mo992(c62035, interruptedIOException2);
                        C0325 c03252 = c62034.f17087.f16730;
                        c03252.getClass();
                        m956(c03252, null, null, runnableC62114, 3);
                    }
                } catch (Throwable th2) {
                    C0325 c03253 = c62034.f17087.f16730;
                    c03253.getClass();
                    m956(c03253, null, null, runnableC62114, 3);
                    throw th2;
                }
            }
        }
    }

    public String toString() {
        switch (this.f1097) {
            case 16:
                String string = ((Socket) this.f1095).toString();
                string.getClass();
                return string;
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public void m957(C2304 c2304) {
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = c2304.f6754;
        String str = abstractComponentCallbacksC2338.f6901;
        HashMap map = (HashMap) this.f1096;
        if (map.get(str) != null) {
            return;
        }
        map.put(abstractComponentCallbacksC2338.f6901, c2304);
        if (AbstractC2313.m4362(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC2338);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public void m958(C2304 c2304) {
        HashMap map = (HashMap) this.f1096;
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = c2304.f6754;
        if (abstractComponentCallbacksC2338.f6884) {
            ((C2306) this.f1093).m4349(abstractComponentCallbacksC2338);
        }
        if (map.get(abstractComponentCallbacksC2338.f6901) == c2304 && ((C2304) map.put(abstractComponentCallbacksC2338.f6901, null)) != null && AbstractC2313.m4362(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC2338);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public AbstractC2425 m959(String str, InterfaceC5093 interfaceC5093) {
        AbstractC2425 abstractC2425;
        AbstractC2425 abstractC2425Mo4357;
        interfaceC5093.getClass();
        synchronized (((C7533) this.f1093)) {
            try {
                C2423 c2423 = (C2423) this.f1095;
                c2423.getClass();
                abstractC2425 = (AbstractC2425) c2423.f7067.get(str);
                if (interfaceC5093.isInstance(abstractC2425)) {
                    InterfaceC2427 interfaceC2427 = (InterfaceC2427) this.f1096;
                    if (interfaceC2427 instanceof C2428) {
                        C2428 c2428 = (C2428) interfaceC2427;
                        abstractC2425.getClass();
                        AbstractC2402 abstractC2402 = c2428.f7074;
                        if (abstractC2402 != null) {
                            C7539 c7539 = c2428.f7073;
                            c7539.getClass();
                            AbstractC2435.m4533(abstractC2425, c7539, abstractC2402);
                        }
                    }
                    abstractC2425.getClass();
                } else {
                    C7635 c7635 = new C7635((AbstractC7636) this.f1094);
                    c7635.f20724.put(C2422.f7065, str);
                    InterfaceC2427 interfaceC24272 = (InterfaceC2427) this.f1096;
                    interfaceC24272.getClass();
                    try {
                        try {
                            abstractC2425Mo4357 = interfaceC24272.mo4517(interfaceC5093, c7635);
                        } catch (AbstractMethodError unused) {
                            abstractC2425Mo4357 = interfaceC24272.mo4521(AbstractC3057.m6756(interfaceC5093), c7635);
                        }
                    } catch (AbstractMethodError unused2) {
                        abstractC2425Mo4357 = interfaceC24272.mo4357(AbstractC3057.m6756(interfaceC5093));
                    }
                    abstractC2425 = abstractC2425Mo4357;
                    C2423 c24232 = (C2423) this.f1095;
                    c24232.getClass();
                    abstractC2425.getClass();
                    AbstractC2425 abstractC24252 = (AbstractC2425) c24232.f7067.put(str, abstractC2425);
                    if (abstractC24252 != null) {
                        abstractC24252.m4522();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return abstractC2425;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public Enum m960(Object obj, InterfaceC5088 interfaceC5088) {
        interfaceC5088.getClass();
        return (Enum) ((InterfaceC4365) this.f1094).get(((InterfaceC4722) ((AbstractC6900) this.f1096).mo12181(((Number) ((InterfaceC5112) this.f1095).get(obj)).intValue())).getNumber());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public void m961(Object[] objArr, StringBuilder sb) {
        CharSequence charSequence = (CharSequence) this.f1095;
        CharSequence charSequence2 = (CharSequence) this.f1096;
        CharSequence charSequence3 = (CharSequence) this.f1094;
        InterfaceC8976 interfaceC8976 = (InterfaceC8976) this.f1093;
        try {
            sb.append(charSequence);
            if (objArr != null) {
                if (objArr.length > 0) {
                    interfaceC8976.accept(sb, objArr[0]);
                }
                for (int i = 1; i < objArr.length; i++) {
                    sb.append(charSequence3);
                    interfaceC8976.accept(sb, objArr[i]);
                }
            }
            sb.append(charSequence2);
        } catch (IOException e) {
            throw new UncheckedException(e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public boolean m962(AbstractC6996 abstractC6996) {
        if (((AbstractC6996) this.f1096).equals(abstractC6996)) {
            return true;
        }
        C0325 c0325 = (C0325) this.f1095;
        return c0325 != null ? c0325.m962(abstractC6996) : false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public long m963(Animation animation) {
        MaxRelativeLayout maxRelativeLayout = (MaxRelativeLayout) this.f1096;
        if (animation == null && maxRelativeLayout.getAnimation() != null) {
            animation = maxRelativeLayout.getAnimation();
        }
        long duration = (animation == null || animation.getDuration() == 0) ? 300L : animation.getDuration();
        long j = ((C8233) this.f1093).f11591;
        return j != -1 ? j : duration;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public List m964() {
        ArrayList arrayList;
        if (((ArrayList) this.f1095).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f1095)) {
            arrayList = new ArrayList((ArrayList) this.f1095);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public ArrayList m965() {
        ArrayList arrayList = new ArrayList();
        for (C2304 c2304 : ((HashMap) this.f1096).values()) {
            if (c2304 != null) {
                arrayList.add(c2304);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public C7806 m966(AbstractC7810 abstractC7810) {
        ArrayList arrayList = (ArrayList) this.f1094;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C7806 c7806 = (C7806) arrayList.get(i);
            if (c7806 != null && c7806.f21276 == abstractC7810) {
                return c7806;
            }
        }
        C7806 c78062 = new C7806((Context) this.f1096, abstractC7810);
        arrayList.add(c78062);
        return c78062;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public AbstractC6989 m967(C4688 c4688, List list) {
        c4688.getClass();
        list.getClass();
        return (AbstractC6989) ((C4837) this.f1093).invoke(new C4468(c4688, list));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public ArrayList m968() {
        ArrayList arrayList = new ArrayList();
        for (C2304 c2304 : ((HashMap) this.f1096).values()) {
            if (c2304 != null) {
                arrayList.add(c2304.f6754);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public void m969(C2996 c2996) {
        InterfaceC2989 interfaceC2989;
        synchronized (this) {
            ((HashMap) this.f1096).remove(c2996.f9486);
            if (c2996.f9485 && (interfaceC2989 = c2996.f9484) != null) {
                ((C3008) this.f1093).m6498(c2996.f9486, new C3002(interfaceC2989, true, false, c2996.f9486, (C3008) this.f1093));
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public C0131 m970() {
        ArrayList arrayList = (ArrayList) this.f1094;
        if (((C6149) this.f1096) == null) {
            C5925.m11311("Base URL required.");
            return null;
        }
        C6127 c6127 = (C6127) this.f1095;
        if (c6127 == null) {
            c6127 = new C6127();
        }
        C6127 c61272 = c6127;
        ExecutorC5782 executorC5782 = AbstractC5761.f15814;
        C5781 c5781 = AbstractC5761.f15812;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.f1093);
        List listMo11170 = c5781.mo11170(executorC5782);
        arrayList2.addAll(listMo11170);
        List listMo11169 = c5781.mo11169();
        ArrayList arrayList3 = new ArrayList(arrayList.size() + 1 + listMo11169.size());
        arrayList3.add(new C5780(0));
        arrayList3.addAll(arrayList);
        arrayList3.addAll(listMo11169);
        C6149 c6149 = (C6149) this.f1096;
        List listUnmodifiableList = Collections.unmodifiableList(arrayList3);
        List listUnmodifiableList2 = Collections.unmodifiableList(arrayList2);
        listMo11170.size();
        return new C0131(c61272, c6149, listUnmodifiableList, listUnmodifiableList2, executorC5782);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public void m971(String str) {
        C6148 c6148 = new C6148(0);
        c6148.m11538(null, str);
        C6149 c6149M11535 = c6148.m11535();
        if ("".equals(c6149M11535.f16879.get(r0.size() - 1))) {
            this.f1096 = c6149M11535;
        } else {
            C4211.m8604(c6149M11535, "baseUrl must end in /: ");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public void m972(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        if (((ArrayList) this.f1095).contains(abstractComponentCallbacksC2338)) {
            C7547.m12774(abstractComponentCallbacksC2338, "Fragment already added: ");
            return;
        }
        synchronized (((ArrayList) this.f1095)) {
            ((ArrayList) this.f1095).add(abstractComponentCallbacksC2338);
        }
        abstractComponentCallbacksC2338.f6893 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public synchronized void m973(InterfaceC8393 interfaceC8393, C3002 c3002) {
        C2996 c2996 = (C2996) ((HashMap) this.f1096).put(interfaceC8393, new C2996(interfaceC8393, c3002, (ReferenceQueue) this.f1094));
        if (c2996 != null) {
            c2996.f9484 = null;
            c2996.clear();
        }
    }

    @Override // p192.InterfaceC7811
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public boolean mo272(AbstractC7810 abstractC7810, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f1095;
        C7806 c7806M966 = m966(abstractC7810);
        C0283 c0283 = (C0283) this.f1093;
        Menu menuC7778 = (Menu) c0283.get(menu);
        if (menuC7778 == null) {
            menuC7778 = new MenuC7778((Context) this.f1096, (MenuC7802) menu);
            c0283.put(menu, menuC7778);
        }
        return callback.onCreateActionMode(c7806M966, menuC7778);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public AbstractComponentCallbacksC2338 m974(String str) {
        for (C2304 c2304 : ((HashMap) this.f1096).values()) {
            if (c2304 != null) {
                AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338M974 = c2304.f6754;
                if (!str.equals(abstractComponentCallbacksC2338M974.f6901)) {
                    abstractComponentCallbacksC2338M974 = abstractComponentCallbacksC2338M974.f6896.f6784.m974(str);
                }
                if (abstractComponentCallbacksC2338M974 != null) {
                    return abstractComponentCallbacksC2338M974;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public RunnableC6211 m975(String str) {
        Iterator it = ((ArrayDeque) this.f1094).iterator();
        it.getClass();
        while (it.hasNext()) {
            RunnableC6211 runnableC6211 = (RunnableC6211) it.next();
            if (AbstractC4395.m8907(runnableC6211.f17129.f17085.f16716.f16881, str)) {
                return runnableC6211;
            }
        }
        Iterator it2 = ((ArrayDeque) this.f1096).iterator();
        it2.getClass();
        while (it2.hasNext()) {
            RunnableC6211 runnableC62112 = (RunnableC6211) it2.next();
            if (AbstractC4395.m8907(runnableC62112.f17129.f17085.f16716.f16881, str)) {
                return runnableC62112;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public AbstractComponentCallbacksC2338 m976(String str) {
        C2304 c2304 = (C2304) ((HashMap) this.f1096).get(str);
        if (c2304 != null) {
            return c2304.f6754;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public synchronized ExecutorService m977() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.f1095) == null) {
                this.f1095 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryC6224(AbstractC6230.f17166 + " Dispatcher", false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.f1095;
            threadPoolExecutor.getClass();
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public void m978(View view) {
        MaxRelativeLayout maxRelativeLayout;
        C8233 c8233 = (C8233) this.f1093;
        if (view != null) {
            view.setEnabled(false);
        }
        if (c8233.f11587 || (maxRelativeLayout = (MaxRelativeLayout) this.f1096) == null) {
            return;
        }
        c8233.f11587 = true;
        maxRelativeLayout.post(new RunnableC8230(this, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public void m979(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            C2633.m5339("This graph contains cyclic dependencies");
            return;
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((C0283) this.f1096).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                m979(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    @Override // p007.InterfaceC6136
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public void mo980(C6203 c6203, C6131 c6131) {
        String str = (String) this.f1094;
        ArrayList arrayList = (ArrayList) this.f1093;
        ArrayList arrayList2 = (ArrayList) this.f1095;
        try {
            ArrayList arrayListM11705 = C6232.m11705(str, c6131);
            synchronized (arrayList) {
                arrayList.addAll(arrayListM11705);
            }
        } catch (Exception e) {
            synchronized (arrayList2) {
                arrayList2.add(e);
            }
        }
        ((CountDownLatch) this.f1096).countDown();
    }

    @Override // p192.InterfaceC7811
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public void mo279(AbstractC7810 abstractC7810) {
        ((ActionMode.Callback) this.f1095).onDestroyActionMode(m966(abstractC7810));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void mo981(C4691 c4691, C4749 c4749) {
        ((C3005) this.f1095).mo981(c4691, c4749);
    }

    @Override // androidx.compose.animation.core.InterfaceC0360
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public long mo438(AbstractC0343 abstractC0343, AbstractC0343 abstractC03432, AbstractC0343 abstractC03433) {
        int iMo1040 = abstractC0343.mo1040();
        long jMax = 0;
        for (int i = 0; i < iMo1040; i++) {
            jMax = Math.max(jMax, ((C0113) this.f1095).m430(i).mo935(abstractC0343.mo1041(i), abstractC03432.mo1041(i), abstractC03433.mo1041(i)));
        }
        return jMax;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643, kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4644
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void mo982() {
        switch (this.f1097) {
            case 9:
                ArrayList arrayList = (ArrayList) this.f1096;
                if (!arrayList.isEmpty()) {
                    ((HashMap) ((C0076) this.f1094).f228).put((C4639) this.f1095, arrayList);
                }
                break;
            case 10:
                ((C3005) this.f1096).mo982();
                ((ArrayList) ((C0325) this.f1094).f1095).add(new C4754((InterfaceC6478) AbstractC4344.m8779((ArrayList) this.f1093)));
                break;
            default:
                C3005 c3005 = (C3005) this.f1093;
                C4691 c4691 = (C4691) this.f1094;
                ArrayList arrayList2 = (ArrayList) this.f1095;
                arrayList2.getClass();
                InterfaceC4481 interfaceC4481M6313 = AbstractC2905.m6313(c4691, (AbstractC6989) c3005.f9534);
                if (interfaceC4481M6313 != null) {
                    HashMap map = (HashMap) c3005.f9537;
                    List listM12490 = AbstractC7275.m12490(arrayList2);
                    AbstractC4882 type = ((AbstractC6977) interfaceC4481M6313).getType();
                    type.getClass();
                    listM12490.getClass();
                    map.put(c4691, new C4747(listM12490, type));
                    break;
                } else if (((C4648) c3005.f9538).m9243((C4688) c3005.f9533) && AbstractC4395.m8907(c4691.m9335(), "value")) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : arrayList2) {
                        if (obj instanceof C4754) {
                            arrayList3.add(obj);
                        }
                    }
                    List list = (List) c3005.f9535;
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        list.add((InterfaceC6478) ((C4754) it.next()).f13905);
                    }
                    break;
                }
                break;
        }
    }

    @Override // p004.InterfaceC6100
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public InterfaceC6101 mo382() {
        return (C5569) this.f1094;
    }

    @Override // androidx.compose.animation.core.InterfaceC0360
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public AbstractC0343 mo441(AbstractC0343 abstractC0343, AbstractC0343 abstractC03432, AbstractC0343 abstractC03433) {
        if (((AbstractC0343) this.f1093) == null) {
            this.f1093 = abstractC03433.mo1039();
        }
        AbstractC0343 abstractC03434 = (AbstractC0343) this.f1093;
        if (abstractC03434 == null) {
            AbstractC4395.m8908("endVelocityVector");
            throw null;
        }
        int iMo1040 = abstractC03434.mo1040();
        int i = 0;
        while (true) {
            AbstractC0343 abstractC03435 = (AbstractC0343) this.f1093;
            if (i >= iMo1040) {
                if (abstractC03435 != null) {
                    return abstractC03435;
                }
                AbstractC4395.m8908("endVelocityVector");
                throw null;
            }
            if (abstractC03435 == null) {
                AbstractC4395.m8908("endVelocityVector");
                throw null;
            }
            abstractC03435.mo1037(((C0113) this.f1095).m430(i).mo937(abstractC0343.mo1041(i), abstractC03432.mo1041(i), abstractC03433.mo1041(i)), i);
            i++;
        }
    }

    @Override // p192.InterfaceC7811
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public boolean mo286(AbstractC7810 abstractC7810, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f1095;
        C7806 c7806M966 = m966(abstractC7810);
        C0283 c0283 = (C0283) this.f1093;
        Menu menuC7778 = (Menu) c0283.get(menu);
        if (menuC7778 == null) {
            menuC7778 = new MenuC7778((Context) this.f1096, (MenuC7802) menu);
            c0283.put(menu, menuC7778);
        }
        return callback.onPrepareActionMode(c7806M966, menuC7778);
    }

    @Override // androidx.compose.animation.core.InterfaceC0360
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public AbstractC0343 mo443(long j, AbstractC0343 abstractC0343, AbstractC0343 abstractC03432, AbstractC0343 abstractC03433) {
        if (((AbstractC0343) this.f1096) == null) {
            this.f1096 = abstractC0343.mo1039();
        }
        AbstractC0343 abstractC03434 = (AbstractC0343) this.f1096;
        if (abstractC03434 == null) {
            AbstractC4395.m8908("valueVector");
            throw null;
        }
        int iMo1040 = abstractC03434.mo1040();
        int i = 0;
        while (true) {
            AbstractC0343 abstractC03435 = (AbstractC0343) this.f1096;
            if (i >= iMo1040) {
                if (abstractC03435 != null) {
                    return abstractC03435;
                }
                AbstractC4395.m8908("valueVector");
                throw null;
            }
            if (abstractC03435 == null) {
                AbstractC4395.m8908("valueVector");
                throw null;
            }
            abstractC03435.mo1037(((C0113) this.f1095).m430(i).mo934(j, abstractC0343.mo1041(i), abstractC03432.mo1041(i), abstractC03433.mo1041(i)), i);
            i++;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4644
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public void mo983(C4749 c4749) {
        ((ArrayList) this.f1095).add(new C4759(new C4756(c4749)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public InterfaceC4644 mo984(C4691 c4691) {
        return ((C3005) this.f1095).mo984(c4691);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4830
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public C4831 mo291(C4688 c4688) {
        c4688.getClass();
        ProtoBuf$Class protoBuf$Class = (ProtoBuf$Class) ((LinkedHashMap) this.f1093).get(c4688);
        if (protoBuf$Class == null) {
            return null;
        }
        return new C4831((C6911) this.f1095, protoBuf$Class, (AbstractC6903) this.f1096, (InterfaceC4462) ((C4811) this.f1094).invoke(c4688));
    }

    @Override // androidx.compose.animation.core.InterfaceC0360
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public AbstractC0343 mo446(long j, AbstractC0343 abstractC0343, AbstractC0343 abstractC03432, AbstractC0343 abstractC03433) {
        if (((AbstractC0343) this.f1094) == null) {
            this.f1094 = abstractC03433.mo1039();
        }
        AbstractC0343 abstractC03434 = (AbstractC0343) this.f1094;
        if (abstractC03434 == null) {
            AbstractC4395.m8908("velocityVector");
            throw null;
        }
        int iMo1040 = abstractC03434.mo1040();
        int i = 0;
        while (true) {
            AbstractC0343 abstractC03435 = (AbstractC0343) this.f1094;
            if (i >= iMo1040) {
                if (abstractC03435 != null) {
                    return abstractC03435;
                }
                AbstractC4395.m8908("velocityVector");
                throw null;
            }
            if (abstractC03435 == null) {
                AbstractC4395.m8908("velocityVector");
                throw null;
            }
            abstractC03435.mo1037(((C0113) this.f1095).m430(i).mo936(j, abstractC0343.mo1041(i), abstractC03432.mo1041(i), abstractC03433.mo1041(i)), i);
            i++;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4644
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public InterfaceC4643 mo985(C4688 c4688) {
        ArrayList arrayList = new ArrayList();
        return new C0325(((C4648) this.f1096).mo9242(c4688, InterfaceC4462.f13091, arrayList), this, arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4644
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public void mo986(Object obj) {
        ArrayList arrayList = (ArrayList) this.f1095;
        C4648 c4648 = (C4648) this.f1096;
        C4691 c4691 = (C4691) this.f1094;
        Object objM9495 = C4767.m9495(obj, c4648.f13583);
        if (objM9495 == null) {
            objM9495 = new C4772("Unsupported annotation argument: " + c4691);
        }
        arrayList.add(objM9495);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4644
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public void mo987(C4688 c4688, C4691 c4691) {
        ((ArrayList) this.f1095).add(new C4771(c4688, c4691));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public void mo988(C4691 c4691, Object obj) {
        ((C3005) this.f1095).mo988(c4691, obj);
    }

    @Override // p192.InterfaceC7811
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public boolean mo298(AbstractC7810 abstractC7810, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f1095).onActionItemClicked(m966(abstractC7810), new MenuItemC7793((Context) this.f1096, (InterfaceMenuItemC7661) menuItem));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public void mo989(C4691 c4691, C4688 c4688, C4691 c46912) {
        ((C3005) this.f1095).mo989(c4691, c4688, c46912);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4636
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public InterfaceC4643 mo990(C4688 c4688, C6972 c6972) {
        return ((C4648) ((C0076) this.f1094).f227).m9241(c4688, c6972, (ArrayList) this.f1096);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public InterfaceC4643 mo991(C4688 c4688, C4691 c4691) {
        return ((C3005) this.f1095).mo991(c4688, c4691);
    }

    @Override // p007.InterfaceC6136
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public void mo992(C6203 c6203, IOException iOException) {
        ArrayList arrayList = (ArrayList) this.f1095;
        synchronized (arrayList) {
            arrayList.add(iOException);
        }
        ((CountDownLatch) this.f1096).countDown();
    }

    @Override // p004.InterfaceC6100
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世 */
    public InterfaceC6103 mo401() {
        return (C5570) this.f1093;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public void m993() {
        CustomDialog$ALIGN customDialog$ALIGN;
        MaxRelativeLayout maxRelativeLayout = (MaxRelativeLayout) this.f1096;
        C8233 c8233 = (C8233) this.f1093;
        int i = c8233.f22725;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) this.f1095;
        if (dialogXBaseRelativeLayout == null || c8233.m8058() == null) {
            return;
        }
        AbstractC4922 abstractC4922 = AbstractC8248.f22823;
        boolean z = false;
        maxRelativeLayout.m8075(0);
        int i2 = c8233.f11590;
        if (i2 == 0) {
            i2 = 0;
        }
        maxRelativeLayout.m8076(i2);
        maxRelativeLayout.setMinimumWidth(0);
        int i3 = c8233.f11589;
        if (i3 == 0) {
            i3 = 0;
        }
        maxRelativeLayout.setMinimumHeight(i3);
        dialogXBaseRelativeLayout.f11639 = c8233.f11594;
        int[] iArr = c8233.f11588;
        dialogXBaseRelativeLayout.m8072(iArr[0], iArr[1], iArr[2], iArr[3]);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) maxRelativeLayout.getLayoutParams();
        if (layoutParams == null || ((customDialog$ALIGN = (CustomDialog$ALIGN) this.f1094) != null && customDialog$ALIGN != c8233.f22716)) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        int i4 = 5;
        switch (AbstractC8238.f22736[c8233.f22716.ordinal()]) {
            case 1:
            case 2:
                layoutParams.removeRule(13);
                layoutParams.addRule(10);
                layoutParams.addRule(9);
                break;
            case 3:
            case 4:
                layoutParams.removeRule(13);
                layoutParams.addRule(10);
                layoutParams.addRule(14);
                break;
            case 5:
            case 6:
                layoutParams.removeRule(13);
                layoutParams.addRule(10);
                layoutParams.addRule(11);
                break;
            case 7:
            case 8:
                layoutParams.removeRule(13);
                layoutParams.addRule(12);
                break;
            case 9:
            case 10:
                layoutParams.removeRule(13);
                layoutParams.addRule(12);
                layoutParams.addRule(14);
                break;
            case 11:
            case 12:
                layoutParams.removeRule(13);
                layoutParams.addRule(12);
                layoutParams.addRule(11);
                break;
            case 13:
                layoutParams.removeRule(10);
                layoutParams.removeRule(12);
                layoutParams.addRule(13);
                break;
            case 14:
            case 15:
                layoutParams.removeRule(13);
                layoutParams.addRule(5);
                layoutParams.addRule(15);
                break;
            case 16:
            case 17:
                layoutParams.removeRule(13);
                layoutParams.addRule(11);
                layoutParams.addRule(15);
                break;
        }
        this.f1094 = c8233.f22716;
        maxRelativeLayout.setLayoutParams(layoutParams);
        if (c8233.f22723) {
            BaseDialog$BOOLEAN baseDialog$BOOLEAN = c8233.f22724;
            if (baseDialog$BOOLEAN == null) {
                z = c8233.f11585;
            } else if (baseDialog$BOOLEAN == BaseDialog$BOOLEAN.TRUE) {
                z = true;
            }
            if (z) {
                dialogXBaseRelativeLayout.setOnClickListener(new ViewOnClickListenerC0086(this, i4));
            } else {
                dialogXBaseRelativeLayout.setOnClickListener(null);
            }
        } else {
            dialogXBaseRelativeLayout.setClickable(false);
        }
        AbstractC3749 abstractC3749 = c8233.f22722;
        if (abstractC3749 != null && abstractC3749.getCustomView() != null) {
            c8233.f22722.bindParent(maxRelativeLayout, c8233.f22719);
        }
        int i5 = c8233.f22727;
        if (i5 != -1) {
            maxRelativeLayout.m8075(i5);
            maxRelativeLayout.setMinimumWidth(c8233.f22727);
        }
        if (i != -1) {
            maxRelativeLayout.m8076(i);
            maxRelativeLayout.setMinimumHeight(i);
        }
        dialogXBaseRelativeLayout.setBackgroundColor(c8233.f22717);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public void m994() {
        int iMo4794;
        C2555 c2555 = (C2555) this.f1096;
        C2555 c25552 = (C2555) this.f1095;
        C2549 c2549 = (C2549) this.f1093;
        int i = R.id.accessibilityActionPageLeft;
        AbstractC2270.m4248(c2549, R.id.accessibilityActionPageLeft);
        AbstractC2270.m4249(c2549, 0);
        AbstractC2270.m4248(c2549, R.id.accessibilityActionPageRight);
        AbstractC2270.m4249(c2549, 0);
        AbstractC2270.m4248(c2549, R.id.accessibilityActionPageUp);
        AbstractC2270.m4249(c2549, 0);
        AbstractC2270.m4248(c2549, R.id.accessibilityActionPageDown);
        AbstractC2270.m4249(c2549, 0);
        if (c2549.getAdapter() == null || (iMo4794 = c2549.getAdapter().mo4794()) == 0 || !c2549.f7680) {
            return;
        }
        if (c2549.getOrientation() != 0) {
            if (c2549.f7684 < iMo4794 - 1) {
                AbstractC2270.m4239(c2549, new C7610(R.id.accessibilityActionPageDown, (String) null), c25552);
            }
            if (c2549.f7684 > 0) {
                AbstractC2270.m4239(c2549, new C7610(R.id.accessibilityActionPageUp, (String) null), c2555);
                return;
            }
            return;
        }
        boolean z = c2549.f7688.f7592.getLayoutDirection() == 1;
        int i2 = z ? 16908360 : 16908361;
        if (z) {
            i = 16908361;
        }
        if (c2549.f7684 < iMo4794 - 1) {
            AbstractC2270.m4239(c2549, new C7610(i2, (String) null), c25552);
        }
        if (c2549.f7684 > 0) {
            AbstractC2270.m4239(c2549, new C7610(i, (String) null), c2555);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public C3005 m995(int i, C4688 c4688, C6972 c6972) {
        C4639 c4639 = new C4639(((C4639) this.f1095).f13565 + '@' + i);
        C0076 c0076 = (C0076) this.f1093;
        HashMap map = (HashMap) c0076.f228;
        List arrayList = (List) map.get(c4639);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(c4639, arrayList);
        }
        return ((C4648) c0076.f227).m9241(c4688, c6972, arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public Bundle m996(String str, Bundle bundle) {
        HashMap map = (HashMap) this.f1094;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public void m997(C4549 c4549, InterfaceC5088 interfaceC5088, Enum r5) {
        interfaceC5088.getClass();
        r5.getClass();
        InterfaceC5112 interfaceC5112 = (InterfaceC5112) this.f1095;
        C4512 c4512 = (C4512) ((ArrayList) this.f1093).get(r5.ordinal());
        int iIntValue = ((Number) interfaceC5112.get(c4549)).intValue();
        int i = (1 << c4512.f13156) - 1;
        int i2 = c4512.f13157;
        interfaceC5112.set(c4549, Integer.valueOf((iIntValue & (~(i << i2))) + (c4512.f13155 << i2)));
    }

    public C0325(InterfaceC5112 interfaceC5112, AbstractC6900 abstractC6900, InterfaceC4365 interfaceC4365, ArrayList arrayList) {
        this.f1097 = 8;
        interfaceC5112.getClass();
        abstractC6900.getClass();
        interfaceC4365.getClass();
        this.f1095 = interfaceC5112;
        this.f1096 = abstractC6900;
        this.f1094 = interfaceC4365;
        this.f1093 = arrayList;
    }

    public C0325(C4845 c4845, InterfaceC4486 interfaceC4486) {
        this.f1097 = 6;
        interfaceC4486.getClass();
        this.f1095 = c4845;
        this.f1096 = interfaceC4486;
        this.f1094 = c4845.m9579(new C4469(this, 0));
        this.f1093 = c4845.m9579(new C4469(this, 1));
    }

    public C0325(ProtoBuf$PackageFragment protoBuf$PackageFragment, C6911 c6911, AbstractC6903 abstractC6903, C4811 c4811) {
        this.f1097 = 12;
        abstractC6903.getClass();
        this.f1095 = c6911;
        this.f1096 = abstractC6903;
        this.f1094 = c4811;
        List<ProtoBuf$Class> class_List = protoBuf$PackageFragment.getClass_List();
        class_List.getClass();
        int iM8772 = AbstractC4339.m8772(AbstractC4345.m8822(class_List, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM8772 < 16 ? 16 : iM8772);
        for (Object obj : class_List) {
            linkedHashMap.put(AbstractC3933.m8319((C6911) this.f1095, ((ProtoBuf$Class) obj).getFqName()), obj);
        }
        this.f1093 = linkedHashMap;
    }

    public C0325(C2423 c2423, InterfaceC2427 interfaceC2427, AbstractC7636 abstractC7636) {
        this.f1097 = 24;
        c2423.getClass();
        interfaceC2427.getClass();
        abstractC7636.getClass();
        this.f1095 = c2423;
        this.f1096 = interfaceC2427;
        this.f1094 = abstractC7636;
        this.f1093 = new C7533();
    }

    public /* synthetic */ C0325(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f1097 = i;
        this.f1095 = obj;
        this.f1096 = obj2;
        this.f1094 = obj3;
        this.f1093 = obj4;
    }

    public C0325(Socket socket) {
        this.f1097 = 16;
        this.f1095 = socket;
        this.f1096 = new AtomicInteger();
        this.f1094 = new C5569(this);
        this.f1093 = new C5570(this);
    }

    public C0325(ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884, C1418 c1418) {
        this.f1097 = 1;
        this.f1095 = viewTreeObserverOnGlobalLayoutListenerC1884;
        this.f1096 = c1418;
        AutofillManager autofillManager = (AutofillManager) viewTreeObserverOnGlobalLayoutListenerC1884.getContext().getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            this.f1094 = autofillManager;
            viewTreeObserverOnGlobalLayoutListenerC1884.setImportantForAutofill(1);
            AutofillId autofillId = viewTreeObserverOnGlobalLayoutListenerC1884.getAutofillId();
            if (autofillId != null) {
                this.f1093 = autofillId;
                return;
            }
            throw AbstractC0053.m139("Required value was null.");
        }
        C5925.m11311("Autofill service could not be located.");
        throw null;
    }

    public C0325(Typeface typeface, C2301 c2301) {
        int i;
        int i2;
        int i3;
        int i4;
        this.f1097 = 25;
        this.f1093 = typeface;
        this.f1095 = c2301;
        this.f1094 = new C7697(1024);
        int iM4001 = c2301.m4001(6);
        if (iM4001 != 0) {
            int i5 = iM4001 + c2301.f6467;
            i = ((ByteBuffer) c2301.f6464).getInt(((ByteBuffer) c2301.f6464).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.f1096 = new char[i * 2];
        int iM40012 = c2301.m4001(6);
        if (iM40012 != 0) {
            int i6 = iM40012 + c2301.f6467;
            i2 = ((ByteBuffer) c2301.f6464).getInt(((ByteBuffer) c2301.f6464).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            C7699 c7699 = new C7699(this, i7);
            C2302 c2302M12995 = c7699.m12995();
            int iM40013 = c2302M12995.m4001(4);
            Character.toChars(iM40013 != 0 ? ((ByteBuffer) c2302M12995.f6464).getInt(iM40013 + c2302M12995.f6467) : 0, (char[]) this.f1096, i7 * 2);
            C2302 c2302M129952 = c7699.m12995();
            int iM40014 = c2302M129952.m4001(16);
            if (iM40014 != 0) {
                int i8 = iM40014 + c2302M129952.f6467;
                i3 = ((ByteBuffer) c2302M129952.f6464).getInt(((ByteBuffer) c2302M129952.f6464).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            AbstractC6344.m11872("invalid metadata codepoint length", i3 > 0);
            C7697 c7697 = (C7697) this.f1094;
            C2302 c2302M129953 = c7699.m12995();
            int iM40015 = c2302M129953.m4001(16);
            if (iM40015 != 0) {
                int i9 = iM40015 + c2302M129953.f6467;
                i4 = ((ByteBuffer) c2302M129953.f6464).getInt(((ByteBuffer) c2302M129953.f6464).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            c7697.m12994(c7699, 0, i4 - 1);
        }
    }

    public C0325(ArrayList arrayList, CountDownLatch countDownLatch, C6232 c6232, String str, ArrayList arrayList2) {
        this.f1097 = 21;
        this.f1095 = arrayList;
        this.f1096 = countDownLatch;
        this.f1094 = str;
        this.f1093 = arrayList2;
    }

    public C0325(C0076 c0076, C4639 c4639) {
        this.f1097 = 9;
        this.f1093 = c0076;
        this.f1097 = 9;
        this.f1094 = c0076;
        this.f1095 = c4639;
        this.f1096 = new ArrayList();
    }

    public C0325(C7041 c7041, InterfaceC7037 interfaceC7037, InterfaceC5184 interfaceC5184) {
        this.f1097 = 22;
        interfaceC7037.getClass();
        this.f1095 = c7041;
        this.f1096 = interfaceC7037;
        this.f1094 = interfaceC5184;
        this.f1093 = new C0108(this, interfaceC7037);
    }

    public C0325(Context context, ActionMode.Callback callback) {
        this.f1097 = 26;
        this.f1096 = context;
        this.f1095 = callback;
        this.f1094 = new ArrayList();
        this.f1093 = new C0283(0);
    }

    public C0325(C0107 c0107, C2461 c2461) {
        this.f1097 = 3;
        this.f1093 = c0107;
        this.f1095 = new SparseIntArray(1);
        this.f1096 = new SparseIntArray(1);
        this.f1094 = c2461;
    }

    public C0325(C8233 c8233, View view) {
        this.f1097 = 28;
        this.f1093 = c8233;
        if (view == null) {
            return;
        }
        c8233.m8047(view);
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) view.findViewById(com.davemorrissey.labs.subscaleview.R.id.box_root);
        this.f1095 = dialogXBaseRelativeLayout;
        this.f1096 = (MaxRelativeLayout) view.findViewById(com.davemorrissey.labs.subscaleview.R.id.box_custom);
        c8233.m8055().setTranslationZ(0.0f);
        dialogXBaseRelativeLayout.m8073(c8233.f22719);
        dialogXBaseRelativeLayout.f11636 = new C8236(this, 1);
        dialogXBaseRelativeLayout.f11637 = new C8049(this, 5);
        dialogXBaseRelativeLayout.post(new RunnableC8230(this, 0));
        c8233.f22718 = this;
        m993();
    }

    public C0325(C4648 c4648, C4691 c4691, C3005 c3005) {
        this.f1097 = 11;
        this.f1096 = c4648;
        this.f1094 = c4691;
        this.f1093 = c3005;
        this.f1095 = new ArrayList();
    }

    public C0325(C3005 c3005, C0325 c0325, ArrayList arrayList) {
        this.f1097 = 10;
        this.f1096 = c3005;
        this.f1094 = c0325;
        this.f1093 = arrayList;
        this.f1095 = c3005;
    }

    public C0325(String str, String str2, String str3, InterfaceC8976 interfaceC8976) {
        this.f1097 = 17;
        this.f1095 = str == null ? "" : str;
        this.f1096 = str2 == null ? "" : str2;
        this.f1094 = str3 == null ? "" : str3;
        this.f1093 = interfaceC8976 == null ? new C5687() : interfaceC8976;
    }

    public C0325(C4801 c4801) {
        this.f1097 = 13;
        this.f1093 = c4801;
        List<ProtoBuf$EnumEntry> enumEntryList = c4801.f14003.getEnumEntryList();
        enumEntryList.getClass();
        int iM8772 = AbstractC4339.m8772(AbstractC4345.m8822(enumEntryList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM8772 < 16 ? 16 : iM8772);
        for (Object obj : enumEntryList) {
            linkedHashMap.put(AbstractC3933.m8316(c4801.f13994.f14061, ((ProtoBuf$EnumEntry) obj).getName()), obj);
        }
        this.f1095 = linkedHashMap;
        C4801 c48012 = (C4801) this.f1093;
        this.f1096 = c48012.f13994.f14062.f14092.m9578(new C1311(this, 5, c48012));
        C4845 c4845 = ((C4801) this.f1093).f13994.f14062.f14092;
        C4782 c4782 = new C4782(this, 1);
        c4845.getClass();
        this.f1094 = new C4847(c4845, c4782);
    }

    public C0325(C0113 c0113) {
        this.f1097 = 0;
        this.f1095 = c0113;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0325(InterfaceC0310 interfaceC0310) {
        this(new C0113(interfaceC0310, 8));
        this.f1097 = 0;
    }

    public C0325(C2549 c2549) {
        this.f1097 = 4;
        this.f1093 = c2549;
        this.f1095 = new C2555(this, 0);
        this.f1096 = new C2555(this, 1);
    }
}
