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
import androidx.activity.AbstractC0900;
import androidx.appcompat.app.C0923;
import androidx.appcompat.app.C0954;
import androidx.appcompat.app.C0955;
import androidx.appcompat.app.C0960;
import androidx.appcompat.app.RunnableC0909;
import androidx.appcompat.app.ViewOnClickListenerC0933;
import androidx.appcompat.widget.C0978;
import androidx.collection.C1104;
import androidx.collection.C1110;
import androidx.collection.C1130;
import androidx.compose.p001ui.autofill.C2253;
import androidx.compose.p001ui.autofill.InterfaceC2238;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import androidx.compose.runtime.C2146;
import androidx.core.util.C3018;
import androidx.core.view.AbstractC3103;
import androidx.emoji2.text.flatbuffer.C3134;
import androidx.emoji2.text.flatbuffer.C3135;
import androidx.fragment.app.AbstractC3146;
import androidx.fragment.app.AbstractComponentCallbacksC3171;
import androidx.fragment.app.C3137;
import androidx.fragment.app.C3139;
import androidx.lifecycle.AbstractC3235;
import androidx.lifecycle.AbstractC3258;
import androidx.lifecycle.AbstractC3268;
import androidx.lifecycle.C3255;
import androidx.lifecycle.C3256;
import androidx.lifecycle.C3261;
import androidx.lifecycle.InterfaceC3260;
import androidx.recyclerview.widget.C3294;
import androidx.viewpager2.widget.C3382;
import androidx.viewpager2.widget.C3388;
import bsh.C3466;
import com.alibaba.fastjson2.AbstractC3738;
import com.bumptech.glide.AbstractC3889;
import com.bumptech.glide.load.engine.C3828;
import com.bumptech.glide.load.engine.C3834;
import com.bumptech.glide.load.engine.C3837;
import com.bumptech.glide.load.engine.C3840;
import com.bumptech.glide.load.engine.InterfaceC3821;
import com.bumptech.glide.load.engine.ThreadFactoryC3829;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.kongzue.dialogx.dialogs.CustomDialog$ALIGN;
import com.kongzue.dialogx.interfaces.AbstractC4581;
import com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import io.ktor.client.plugins.AbstractC4765;
import io.ktor.util.C5043;
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
import kotlin.InterfaceC6016;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.enums.InterfaceC5197;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.InterfaceC5944;
import kotlin.reflect.jvm.internal.impl.descriptors.C5300;
import kotlin.reflect.jvm.internal.impl.descriptors.C5301;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C5471;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C5480;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5468;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5475;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5476;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.p009km.C5381;
import kotlin.reflect.jvm.internal.impl.p009km.internal.C5344;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5554;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5579;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5581;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5586;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5588;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5591;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5599;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5603;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5604;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5643;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5663;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC5662;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C5614;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C5633;
import kotlin.reflect.jvm.internal.impl.storage.C5669;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.storage.C5679;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import okio.internal.C6399;
import okio.internal.C6400;
import org.apache.commons.lang3.C6517;
import org.apache.commons.lang3.exception.UncheckedException;
import p020.InterfaceC6929;
import p020.InterfaceC6930;
import p020.InterfaceC6932;
import p023.C6956;
import p023.C6960;
import p023.C6977;
import p023.C6978;
import p023.C6986;
import p023.InterfaceC6965;
import p027.C7032;
import p027.RunnableC7040;
import p029.AbstractC7059;
import p029.ThreadFactoryC7053;
import p030.C7061;
import p050.AbstractC7173;
import p062.InterfaceC7307;
import p086.AbstractC7729;
import p086.AbstractC7732;
import p086.C7740;
import p093.C7801;
import p095.AbstractC7806;
import p095.AbstractC7818;
import p095.AbstractC7825;
import p099.C7870;
import p099.InterfaceC7866;
import p119.AbstractC8104;
import p155.C8362;
import p158.C8368;
import p160.C8376;
import p171.C8439;
import p176.AbstractC8465;
import p176.C8464;
import p179.InterfaceMenuItemC8490;
import p183.C8526;
import p183.C8528;
import p206.MenuC8607;
import p206.MenuC8631;
import p206.MenuItemC8622;
import p208.AbstractC8639;
import p208.C8635;
import p208.InterfaceC8640;
import p246.C8878;
import p273.AbstractC9067;
import p273.C9062;
import p273.C9065;
import p273.RunnableC9059;
import p277.AbstractC9077;
import p302.InterfaceC9222;
import p389.InterfaceC9805;
import retrofit2.AbstractC6591;
import retrofit2.C6610;
import retrofit2.C6611;
import retrofit2.ExecutorC6612;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1171 implements InterfaceC1167, InterfaceC2238, InterfaceC5468, InterfaceC5475, InterfaceC5476, InterfaceC5662, InterfaceC6929, InterfaceC6965, InterfaceC8640 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Object f1438;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Object f1439;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f1440;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f1441;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1442;

    public C1171(int i) {
        this.f1442 = i;
        switch (i) {
            case 5:
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC3829(0));
                this.f1441 = new HashMap();
                this.f1439 = new ReferenceQueue();
                this.f1440 = executorServiceNewSingleThreadExecutor;
                executorServiceNewSingleThreadExecutor.execute(new RunnableC0909(this, 8));
                break;
            case 18:
                this.f1440 = new ReentrantReadWriteLock();
                this.f1439 = new HashMap();
                break;
            case 19:
                this.f1439 = new ArrayList();
                this.f1438 = new ArrayList();
                break;
            case 20:
                this.f1441 = new ArrayDeque();
                this.f1439 = new ArrayDeque();
                this.f1438 = new ArrayDeque();
                break;
            case 23:
                this.f1440 = new C1104(0);
                this.f1441 = new SparseArray();
                this.f1439 = new C1110((Object) null);
                this.f1438 = new C1104(0);
                break;
            case 27:
                this.f1440 = new C3018(10);
                this.f1441 = new C1130(0);
                this.f1439 = new ArrayList();
                this.f1438 = new HashSet();
                break;
            default:
                this.f1440 = new ArrayList();
                this.f1441 = new HashMap();
                this.f1439 = new HashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public static void m1516(C1171 c1171, RunnableC7040 runnableC7040, C7032 c7032, RunnableC7040 runnableC70402, int i) {
        C6986 c6986;
        if ((i & 1) != 0) {
            runnableC7040 = null;
        }
        if ((i & 2) != 0) {
            c7032 = null;
        }
        if ((i & 4) != 0) {
            runnableC70402 = null;
        }
        c1171.getClass();
        TimeZone timeZone = AbstractC7059.f17512;
        boolean zIsShutdown = ((ThreadPoolExecutor) c1171.m1537()).isShutdown();
        synchronized (c1171) {
            if (c7032 != null) {
                try {
                    if (!((ArrayDeque) c1171.f1438).remove(c7032)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (runnableC70402 != null) {
                runnableC70402.f17473.decrementAndGet();
                if (!((ArrayDeque) c1171.f1439).remove(runnableC70402)) {
                    throw new IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (runnableC7040 != null) {
                ((ArrayDeque) c1171.f1441).add(runnableC7040);
                RunnableC7040 runnableC7040M1535 = c1171.m1535(runnableC7040.f17474.f17430.f17061.f17226);
                if (runnableC7040M1535 != null) {
                    runnableC7040.f17473 = runnableC7040M1535.f17473;
                }
            }
            if ((c7032 != null || runnableC70402 != null) && (zIsShutdown || ((ArrayDeque) c1171.f1439).isEmpty())) {
                ((ArrayDeque) c1171.f1438).isEmpty();
            }
            if (zIsShutdown) {
                List listM9356 = AbstractC5176.m9356((ArrayDeque) c1171.f1441);
                ((ArrayDeque) c1171.f1441).clear();
                c6986 = new C6986(listM9356);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayDeque) c1171.f1441).iterator();
                it.getClass();
                while (it.hasNext()) {
                    RunnableC7040 runnableC70403 = (RunnableC7040) it.next();
                    if (((ArrayDeque) c1171.f1439).size() >= 64) {
                        break;
                    }
                    if (runnableC70403.f17473.get() < 5) {
                        it.remove();
                        runnableC70403.f17473.incrementAndGet();
                        arrayList.add(runnableC70403);
                        ((ArrayDeque) c1171.f1439).add(runnableC70403);
                    }
                }
                c6986 = new C6986(arrayList);
            }
        }
        int size = c6986.f17282.size();
        for (int i2 = 0; i2 < size; i2++) {
            RunnableC7040 runnableC70404 = (RunnableC7040) c6986.f17282.get(i2);
            if (runnableC70404 != runnableC7040) {
                C7032 c70322 = runnableC70404.f17474;
            }
            if (zIsShutdown) {
                runnableC70404.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                C7032 c70323 = runnableC70404.f17474;
                c70323.m12199(interruptedIOException);
                runnableC70404.f17475.mo1552(c70323, interruptedIOException);
            } else {
                ExecutorService executorServiceM1537 = c1171.m1537();
                runnableC70404.getClass();
                C7032 c70324 = runnableC70404.f17474;
                c70324.f17432.f17075.getClass();
                try {
                    try {
                        ((ThreadPoolExecutor) executorServiceM1537).execute(runnableC70404);
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                        interruptedIOException2.initCause(e);
                        C7032 c70325 = runnableC70404.f17474;
                        c70325.m12199(interruptedIOException2);
                        runnableC70404.f17475.mo1552(c70325, interruptedIOException2);
                        C1171 c11712 = c70324.f17432.f17075;
                        c11712.getClass();
                        m1516(c11712, null, null, runnableC70404, 3);
                    }
                } catch (Throwable th2) {
                    C1171 c11713 = c70324.f17432.f17075;
                    c11713.getClass();
                    m1516(c11713, null, null, runnableC70404, 3);
                    throw th2;
                }
            }
        }
    }

    public String toString() {
        switch (this.f1442) {
            case 16:
                String string = ((Socket) this.f1440).toString();
                string.getClass();
                return string;
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public void m1517(C3137 c3137) {
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = c3137.f7099;
        String str = abstractComponentCallbacksC3171.f7246;
        HashMap map = (HashMap) this.f1441;
        if (map.get(str) != null) {
            return;
        }
        map.put(abstractComponentCallbacksC3171.f7246, c3137);
        if (AbstractC3146.m4922(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC3171);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public void m1518(C3137 c3137) {
        HashMap map = (HashMap) this.f1441;
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = c3137.f7099;
        if (abstractComponentCallbacksC3171.f7229) {
            ((C3139) this.f1438).m4909(abstractComponentCallbacksC3171);
        }
        if (map.get(abstractComponentCallbacksC3171.f7246) == c3137 && ((C3137) map.put(abstractComponentCallbacksC3171.f7246, null)) != null && AbstractC3146.m4922(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC3171);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public AbstractC3258 m1519(String str, InterfaceC5925 interfaceC5925) {
        AbstractC3258 abstractC3258;
        AbstractC3258 abstractC3258Mo4917;
        interfaceC5925.getClass();
        synchronized (((C8362) this.f1438)) {
            try {
                C3256 c3256 = (C3256) this.f1440;
                c3256.getClass();
                abstractC3258 = (AbstractC3258) c3256.f7412.get(str);
                if (interfaceC5925.isInstance(abstractC3258)) {
                    InterfaceC3260 interfaceC3260 = (InterfaceC3260) this.f1441;
                    if (interfaceC3260 instanceof C3261) {
                        C3261 c3261 = (C3261) interfaceC3260;
                        abstractC3258.getClass();
                        AbstractC3235 abstractC3235 = c3261.f7419;
                        if (abstractC3235 != null) {
                            C8368 c8368 = c3261.f7418;
                            c8368.getClass();
                            AbstractC3268.m5093(abstractC3258, c8368, abstractC3235);
                        }
                    }
                    abstractC3258.getClass();
                } else {
                    C8464 c8464 = new C8464((AbstractC8465) this.f1439);
                    c8464.f21069.put(C3255.f7410, str);
                    InterfaceC3260 interfaceC32602 = (InterfaceC3260) this.f1441;
                    interfaceC32602.getClass();
                    try {
                        try {
                            abstractC3258Mo4917 = interfaceC32602.mo5077(interfaceC5925, c8464);
                        } catch (AbstractMethodError unused) {
                            abstractC3258Mo4917 = interfaceC32602.mo5081(AbstractC3889.m7316(interfaceC5925), c8464);
                        }
                    } catch (AbstractMethodError unused2) {
                        abstractC3258Mo4917 = interfaceC32602.mo4917(AbstractC3889.m7316(interfaceC5925));
                    }
                    abstractC3258 = abstractC3258Mo4917;
                    C3256 c32562 = (C3256) this.f1440;
                    c32562.getClass();
                    abstractC3258.getClass();
                    AbstractC3258 abstractC32582 = (AbstractC3258) c32562.f7412.put(str, abstractC3258);
                    if (abstractC32582 != null) {
                        abstractC32582.m5082();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return abstractC3258;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public Enum m1520(Object obj, InterfaceC5920 interfaceC5920) {
        interfaceC5920.getClass();
        return (Enum) ((InterfaceC5197) this.f1439).get(((InterfaceC5554) ((AbstractC7729) this.f1441).mo12740(((Number) ((InterfaceC5944) this.f1440).get(obj)).intValue())).getNumber());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public void m1521(Object[] objArr, StringBuilder sb) {
        CharSequence charSequence = (CharSequence) this.f1440;
        CharSequence charSequence2 = (CharSequence) this.f1441;
        CharSequence charSequence3 = (CharSequence) this.f1439;
        InterfaceC9805 interfaceC9805 = (InterfaceC9805) this.f1438;
        try {
            sb.append(charSequence);
            if (objArr != null) {
                if (objArr.length > 0) {
                    interfaceC9805.accept(sb, objArr[0]);
                }
                for (int i = 1; i < objArr.length; i++) {
                    sb.append(charSequence3);
                    interfaceC9805.accept(sb, objArr[i]);
                }
            }
            sb.append(charSequence2);
        } catch (IOException e) {
            throw new UncheckedException(e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public boolean m1522(AbstractC7825 abstractC7825) {
        if (((AbstractC7825) this.f1441).equals(abstractC7825)) {
            return true;
        }
        C1171 c1171 = (C1171) this.f1440;
        return c1171 != null ? c1171.m1522(abstractC7825) : false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public long m1523(Animation animation) {
        MaxRelativeLayout maxRelativeLayout = (MaxRelativeLayout) this.f1441;
        if (animation == null && maxRelativeLayout.getAnimation() != null) {
            animation = maxRelativeLayout.getAnimation();
        }
        long duration = (animation == null || animation.getDuration() == 0) ? 300L : animation.getDuration();
        long j = ((C9062) this.f1438).f11936;
        return j != -1 ? j : duration;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public List m1524() {
        ArrayList arrayList;
        if (((ArrayList) this.f1440).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f1440)) {
            arrayList = new ArrayList((ArrayList) this.f1440);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public ArrayList m1525() {
        ArrayList arrayList = new ArrayList();
        for (C3137 c3137 : ((HashMap) this.f1441).values()) {
            if (c3137 != null) {
                arrayList.add(c3137);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public C8635 m1526(AbstractC8639 abstractC8639) {
        ArrayList arrayList = (ArrayList) this.f1439;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C8635 c8635 = (C8635) arrayList.get(i);
            if (c8635 != null && c8635.f21621 == abstractC8639) {
                return c8635;
            }
        }
        C8635 c86352 = new C8635((Context) this.f1441, abstractC8639);
        arrayList.add(c86352);
        return c86352;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public AbstractC7818 m1527(C5520 c5520, List list) {
        c5520.getClass();
        list.getClass();
        return (AbstractC7818) ((C5669) this.f1438).invoke(new C5300(c5520, list));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public ArrayList m1528() {
        ArrayList arrayList = new ArrayList();
        for (C3137 c3137 : ((HashMap) this.f1441).values()) {
            if (c3137 != null) {
                arrayList.add(c3137.f7099);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public void m1529(C3828 c3828) {
        InterfaceC3821 interfaceC3821;
        synchronized (this) {
            ((HashMap) this.f1441).remove(c3828.f9831);
            if (c3828.f9830 && (interfaceC3821 = c3828.f9829) != null) {
                ((C3840) this.f1438).m7058(c3828.f9831, new C3834(interfaceC3821, true, false, c3828.f9831, (C3840) this.f1438));
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public C0978 m1530() {
        ArrayList arrayList = (ArrayList) this.f1439;
        if (((C6978) this.f1441) == null) {
            C6755.m11870("Base URL required.");
            return null;
        }
        C6956 c6956 = (C6956) this.f1440;
        if (c6956 == null) {
            c6956 = new C6956();
        }
        C6956 c69562 = c6956;
        ExecutorC6612 executorC6612 = AbstractC6591.f16159;
        C6611 c6611 = AbstractC6591.f16157;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.f1438);
        List listMo11729 = c6611.mo11729(executorC6612);
        arrayList2.addAll(listMo11729);
        List listMo11728 = c6611.mo11728();
        ArrayList arrayList3 = new ArrayList(arrayList.size() + 1 + listMo11728.size());
        arrayList3.add(new C6610(0));
        arrayList3.addAll(arrayList);
        arrayList3.addAll(listMo11728);
        C6978 c6978 = (C6978) this.f1441;
        List listUnmodifiableList = Collections.unmodifiableList(arrayList3);
        List listUnmodifiableList2 = Collections.unmodifiableList(arrayList2);
        listMo11729.size();
        return new C0978(c69562, c6978, listUnmodifiableList, listUnmodifiableList2, executorC6612);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public void m1531(String str) {
        C6977 c6977 = new C6977(0);
        c6977.m12097(null, str);
        C6978 c6978M12094 = c6977.m12094();
        if ("".equals(c6978M12094.f17224.get(r0.size() - 1))) {
            this.f1441 = c6978M12094;
        } else {
            C5043.m9163(c6978M12094, "baseUrl must end in /: ");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public void m1532(AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171) {
        if (((ArrayList) this.f1440).contains(abstractComponentCallbacksC3171)) {
            C8376.m13333(abstractComponentCallbacksC3171, "Fragment already added: ");
            return;
        }
        synchronized (((ArrayList) this.f1440)) {
            ((ArrayList) this.f1440).add(abstractComponentCallbacksC3171);
        }
        abstractComponentCallbacksC3171.f7238 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public synchronized void m1533(InterfaceC9222 interfaceC9222, C3834 c3834) {
        C3828 c3828 = (C3828) ((HashMap) this.f1441).put(interfaceC9222, new C3828(interfaceC9222, c3834, (ReferenceQueue) this.f1439));
        if (c3828 != null) {
            c3828.f9829 = null;
            c3828.clear();
        }
    }

    @Override // p208.InterfaceC8640
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public boolean mo832(AbstractC8639 abstractC8639, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f1440;
        C8635 c8635M1526 = m1526(abstractC8639);
        C1130 c1130 = (C1130) this.f1438;
        Menu menuC8607 = (Menu) c1130.get(menu);
        if (menuC8607 == null) {
            menuC8607 = new MenuC8607((Context) this.f1441, (MenuC8631) menu);
            c1130.put(menu, menuC8607);
        }
        return callback.onCreateActionMode(c8635M1526, menuC8607);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public AbstractComponentCallbacksC3171 m1534(String str) {
        for (C3137 c3137 : ((HashMap) this.f1441).values()) {
            if (c3137 != null) {
                AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171M1534 = c3137.f7099;
                if (!str.equals(abstractComponentCallbacksC3171M1534.f7246)) {
                    abstractComponentCallbacksC3171M1534 = abstractComponentCallbacksC3171M1534.f7241.f7129.m1534(str);
                }
                if (abstractComponentCallbacksC3171M1534 != null) {
                    return abstractComponentCallbacksC3171M1534;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public RunnableC7040 m1535(String str) {
        Iterator it = ((ArrayDeque) this.f1439).iterator();
        it.getClass();
        while (it.hasNext()) {
            RunnableC7040 runnableC7040 = (RunnableC7040) it.next();
            if (AbstractC5227.m9466(runnableC7040.f17474.f17430.f17061.f17226, str)) {
                return runnableC7040;
            }
        }
        Iterator it2 = ((ArrayDeque) this.f1441).iterator();
        it2.getClass();
        while (it2.hasNext()) {
            RunnableC7040 runnableC70402 = (RunnableC7040) it2.next();
            if (AbstractC5227.m9466(runnableC70402.f17474.f17430.f17061.f17226, str)) {
                return runnableC70402;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public AbstractComponentCallbacksC3171 m1536(String str) {
        C3137 c3137 = (C3137) ((HashMap) this.f1441).get(str);
        if (c3137 != null) {
            return c3137.f7099;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public synchronized ExecutorService m1537() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.f1440) == null) {
                this.f1440 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryC7053(AbstractC7059.f17511 + " Dispatcher", false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.f1440;
            threadPoolExecutor.getClass();
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public void m1538(View view) {
        MaxRelativeLayout maxRelativeLayout;
        C9062 c9062 = (C9062) this.f1438;
        if (view != null) {
            view.setEnabled(false);
        }
        if (c9062.f11932 || (maxRelativeLayout = (MaxRelativeLayout) this.f1441) == null) {
            return;
        }
        c9062.f11932 = true;
        maxRelativeLayout.post(new RunnableC9059(this, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public void m1539(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            C3466.m5899("This graph contains cyclic dependencies");
            return;
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((C1130) this.f1441).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                m1539(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    @Override // p023.InterfaceC6965
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public void mo1540(C7032 c7032, C6960 c6960) {
        String str = (String) this.f1439;
        ArrayList arrayList = (ArrayList) this.f1438;
        ArrayList arrayList2 = (ArrayList) this.f1440;
        try {
            ArrayList arrayListM12264 = C7061.m12264(str, c6960);
            synchronized (arrayList) {
                arrayList.addAll(arrayListM12264);
            }
        } catch (Exception e) {
            synchronized (arrayList2) {
                arrayList2.add(e);
            }
        }
        ((CountDownLatch) this.f1441).countDown();
    }

    @Override // p208.InterfaceC8640
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public void mo839(AbstractC8639 abstractC8639) {
        ((ActionMode.Callback) this.f1440).onDestroyActionMode(m1526(abstractC8639));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5475
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void mo1541(C5523 c5523, C5581 c5581) {
        ((C3837) this.f1440).mo1541(c5523, c5581);
    }

    @Override // androidx.compose.animation.core.InterfaceC1206
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public long mo998(AbstractC1189 abstractC1189, AbstractC1189 abstractC11892, AbstractC1189 abstractC11893) {
        int iMo1600 = abstractC1189.mo1600();
        long jMax = 0;
        for (int i = 0; i < iMo1600; i++) {
            jMax = Math.max(jMax, ((C0960) this.f1440).m990(i).mo1495(abstractC1189.mo1601(i), abstractC11892.mo1601(i), abstractC11893.mo1601(i)));
        }
        return jMax;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5475, kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5476
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void mo1542() {
        switch (this.f1442) {
            case 9:
                ArrayList arrayList = (ArrayList) this.f1441;
                if (!arrayList.isEmpty()) {
                    ((HashMap) ((C0923) this.f1439).f573).put((C5471) this.f1440, arrayList);
                }
                break;
            case 10:
                ((C3837) this.f1441).mo1542();
                ((ArrayList) ((C1171) this.f1439).f1440).add(new C5586((InterfaceC7307) AbstractC5176.m9338((ArrayList) this.f1438)));
                break;
            default:
                C3837 c3837 = (C3837) this.f1438;
                C5523 c5523 = (C5523) this.f1439;
                ArrayList arrayList2 = (ArrayList) this.f1440;
                arrayList2.getClass();
                InterfaceC5313 interfaceC5313M6873 = AbstractC3738.m6873(c5523, (AbstractC7818) c3837.f9879);
                if (interfaceC5313M6873 != null) {
                    HashMap map = (HashMap) c3837.f9882;
                    List listM13049 = AbstractC8104.m13049(arrayList2);
                    AbstractC5714 type = ((AbstractC7806) interfaceC5313M6873).getType();
                    type.getClass();
                    listM13049.getClass();
                    map.put(c5523, new C5579(listM13049, type));
                    break;
                } else if (((C5480) c3837.f9883).m9802((C5520) c3837.f9878) && AbstractC5227.m9466(c5523.m9894(), "value")) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : arrayList2) {
                        if (obj instanceof C5586) {
                            arrayList3.add(obj);
                        }
                    }
                    List list = (List) c3837.f9880;
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        list.add((InterfaceC7307) ((C5586) it.next()).f14250);
                    }
                    break;
                }
                break;
        }
    }

    @Override // p020.InterfaceC6929
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public InterfaceC6930 mo942() {
        return (C6399) this.f1439;
    }

    @Override // androidx.compose.animation.core.InterfaceC1206
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public AbstractC1189 mo1001(AbstractC1189 abstractC1189, AbstractC1189 abstractC11892, AbstractC1189 abstractC11893) {
        if (((AbstractC1189) this.f1438) == null) {
            this.f1438 = abstractC11893.mo1599();
        }
        AbstractC1189 abstractC11894 = (AbstractC1189) this.f1438;
        if (abstractC11894 == null) {
            AbstractC5227.m9467("endVelocityVector");
            throw null;
        }
        int iMo1600 = abstractC11894.mo1600();
        int i = 0;
        while (true) {
            AbstractC1189 abstractC11895 = (AbstractC1189) this.f1438;
            if (i >= iMo1600) {
                if (abstractC11895 != null) {
                    return abstractC11895;
                }
                AbstractC5227.m9467("endVelocityVector");
                throw null;
            }
            if (abstractC11895 == null) {
                AbstractC5227.m9467("endVelocityVector");
                throw null;
            }
            abstractC11895.mo1597(((C0960) this.f1440).m990(i).mo1497(abstractC1189.mo1601(i), abstractC11892.mo1601(i), abstractC11893.mo1601(i)), i);
            i++;
        }
    }

    @Override // p208.InterfaceC8640
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public boolean mo846(AbstractC8639 abstractC8639, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f1440;
        C8635 c8635M1526 = m1526(abstractC8639);
        C1130 c1130 = (C1130) this.f1438;
        Menu menuC8607 = (Menu) c1130.get(menu);
        if (menuC8607 == null) {
            menuC8607 = new MenuC8607((Context) this.f1441, (MenuC8631) menu);
            c1130.put(menu, menuC8607);
        }
        return callback.onPrepareActionMode(c8635M1526, menuC8607);
    }

    @Override // androidx.compose.animation.core.InterfaceC1206
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public AbstractC1189 mo1003(long j, AbstractC1189 abstractC1189, AbstractC1189 abstractC11892, AbstractC1189 abstractC11893) {
        if (((AbstractC1189) this.f1441) == null) {
            this.f1441 = abstractC1189.mo1599();
        }
        AbstractC1189 abstractC11894 = (AbstractC1189) this.f1441;
        if (abstractC11894 == null) {
            AbstractC5227.m9467("valueVector");
            throw null;
        }
        int iMo1600 = abstractC11894.mo1600();
        int i = 0;
        while (true) {
            AbstractC1189 abstractC11895 = (AbstractC1189) this.f1441;
            if (i >= iMo1600) {
                if (abstractC11895 != null) {
                    return abstractC11895;
                }
                AbstractC5227.m9467("valueVector");
                throw null;
            }
            if (abstractC11895 == null) {
                AbstractC5227.m9467("valueVector");
                throw null;
            }
            abstractC11895.mo1597(((C0960) this.f1440).m990(i).mo1494(j, abstractC1189.mo1601(i), abstractC11892.mo1601(i), abstractC11893.mo1601(i)), i);
            i++;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5476
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public void mo1543(C5581 c5581) {
        ((ArrayList) this.f1440).add(new C5591(new C5588(c5581)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5475
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public InterfaceC5476 mo1544(C5523 c5523) {
        return ((C3837) this.f1440).mo1544(c5523);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC5662
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public C5663 mo851(C5520 c5520) {
        c5520.getClass();
        ProtoBuf$Class protoBuf$Class = (ProtoBuf$Class) ((LinkedHashMap) this.f1438).get(c5520);
        if (protoBuf$Class == null) {
            return null;
        }
        return new C5663((C7740) this.f1440, protoBuf$Class, (AbstractC7732) this.f1441, (InterfaceC5294) ((C5643) this.f1439).invoke(c5520));
    }

    @Override // androidx.compose.animation.core.InterfaceC1206
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public AbstractC1189 mo1006(long j, AbstractC1189 abstractC1189, AbstractC1189 abstractC11892, AbstractC1189 abstractC11893) {
        if (((AbstractC1189) this.f1439) == null) {
            this.f1439 = abstractC11893.mo1599();
        }
        AbstractC1189 abstractC11894 = (AbstractC1189) this.f1439;
        if (abstractC11894 == null) {
            AbstractC5227.m9467("velocityVector");
            throw null;
        }
        int iMo1600 = abstractC11894.mo1600();
        int i = 0;
        while (true) {
            AbstractC1189 abstractC11895 = (AbstractC1189) this.f1439;
            if (i >= iMo1600) {
                if (abstractC11895 != null) {
                    return abstractC11895;
                }
                AbstractC5227.m9467("velocityVector");
                throw null;
            }
            if (abstractC11895 == null) {
                AbstractC5227.m9467("velocityVector");
                throw null;
            }
            abstractC11895.mo1597(((C0960) this.f1440).m990(i).mo1496(j, abstractC1189.mo1601(i), abstractC11892.mo1601(i), abstractC11893.mo1601(i)), i);
            i++;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5476
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public InterfaceC5475 mo1545(C5520 c5520) {
        ArrayList arrayList = new ArrayList();
        return new C1171(((C5480) this.f1441).mo9801(c5520, InterfaceC5294.f13436, arrayList), this, arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5476
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public void mo1546(Object obj) {
        ArrayList arrayList = (ArrayList) this.f1440;
        C5480 c5480 = (C5480) this.f1441;
        C5523 c5523 = (C5523) this.f1439;
        Object objM10054 = C5599.m10054(obj, c5480.f13928);
        if (objM10054 == null) {
            objM10054 = new C5604("Unsupported annotation argument: " + c5523);
        }
        arrayList.add(objM10054);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5476
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public void mo1547(C5520 c5520, C5523 c5523) {
        ((ArrayList) this.f1440).add(new C5603(c5520, c5523));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5475
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public void mo1548(C5523 c5523, Object obj) {
        ((C3837) this.f1440).mo1548(c5523, obj);
    }

    @Override // p208.InterfaceC8640
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public boolean mo858(AbstractC8639 abstractC8639, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f1440).onActionItemClicked(m1526(abstractC8639), new MenuItemC8622((Context) this.f1441, (InterfaceMenuItemC8490) menuItem));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5475
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public void mo1549(C5523 c5523, C5520 c5520, C5523 c55232) {
        ((C3837) this.f1440).mo1549(c5523, c5520, c55232);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5468
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public InterfaceC5475 mo1550(C5520 c5520, C7801 c7801) {
        return ((C5480) ((C0923) this.f1439).f572).m9800(c5520, c7801, (ArrayList) this.f1441);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5475
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public InterfaceC5475 mo1551(C5520 c5520, C5523 c5523) {
        return ((C3837) this.f1440).mo1551(c5520, c5523);
    }

    @Override // p023.InterfaceC6965
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public void mo1552(C7032 c7032, IOException iOException) {
        ArrayList arrayList = (ArrayList) this.f1440;
        synchronized (arrayList) {
            arrayList.add(iOException);
        }
        ((CountDownLatch) this.f1441).countDown();
    }

    @Override // p020.InterfaceC6929
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世 */
    public InterfaceC6932 mo961() {
        return (C6400) this.f1438;
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
    public void m1553() {
        CustomDialog$ALIGN customDialog$ALIGN;
        MaxRelativeLayout maxRelativeLayout = (MaxRelativeLayout) this.f1441;
        C9062 c9062 = (C9062) this.f1438;
        int i = c9062.f23070;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) this.f1440;
        if (dialogXBaseRelativeLayout == null || c9062.m8617() == null) {
            return;
        }
        AbstractC5754 abstractC5754 = AbstractC9077.f23168;
        boolean z = false;
        maxRelativeLayout.m8634(0);
        int i2 = c9062.f11935;
        if (i2 == 0) {
            i2 = 0;
        }
        maxRelativeLayout.m8635(i2);
        maxRelativeLayout.setMinimumWidth(0);
        int i3 = c9062.f11934;
        if (i3 == 0) {
            i3 = 0;
        }
        maxRelativeLayout.setMinimumHeight(i3);
        dialogXBaseRelativeLayout.f11984 = c9062.f11939;
        int[] iArr = c9062.f11933;
        dialogXBaseRelativeLayout.m8631(iArr[0], iArr[1], iArr[2], iArr[3]);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) maxRelativeLayout.getLayoutParams();
        if (layoutParams == null || ((customDialog$ALIGN = (CustomDialog$ALIGN) this.f1439) != null && customDialog$ALIGN != c9062.f23061)) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        int i4 = 5;
        switch (AbstractC9067.f23081[c9062.f23061.ordinal()]) {
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
        this.f1439 = c9062.f23061;
        maxRelativeLayout.setLayoutParams(layoutParams);
        if (c9062.f23068) {
            BaseDialog$BOOLEAN baseDialog$BOOLEAN = c9062.f23069;
            if (baseDialog$BOOLEAN == null) {
                z = c9062.f11930;
            } else if (baseDialog$BOOLEAN == BaseDialog$BOOLEAN.TRUE) {
                z = true;
            }
            if (z) {
                dialogXBaseRelativeLayout.setOnClickListener(new ViewOnClickListenerC0933(this, i4));
            } else {
                dialogXBaseRelativeLayout.setOnClickListener(null);
            }
        } else {
            dialogXBaseRelativeLayout.setClickable(false);
        }
        AbstractC4581 abstractC4581 = c9062.f23067;
        if (abstractC4581 != null && abstractC4581.getCustomView() != null) {
            c9062.f23067.bindParent(maxRelativeLayout, c9062.f23064);
        }
        int i5 = c9062.f23072;
        if (i5 != -1) {
            maxRelativeLayout.m8634(i5);
            maxRelativeLayout.setMinimumWidth(c9062.f23072);
        }
        if (i != -1) {
            maxRelativeLayout.m8635(i);
            maxRelativeLayout.setMinimumHeight(i);
        }
        dialogXBaseRelativeLayout.setBackgroundColor(c9062.f23062);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public void m1554() {
        int iMo5354;
        C3388 c3388 = (C3388) this.f1441;
        C3388 c33882 = (C3388) this.f1440;
        C3382 c3382 = (C3382) this.f1438;
        int i = R.id.accessibilityActionPageLeft;
        AbstractC3103.m4808(c3382, R.id.accessibilityActionPageLeft);
        AbstractC3103.m4809(c3382, 0);
        AbstractC3103.m4808(c3382, R.id.accessibilityActionPageRight);
        AbstractC3103.m4809(c3382, 0);
        AbstractC3103.m4808(c3382, R.id.accessibilityActionPageUp);
        AbstractC3103.m4809(c3382, 0);
        AbstractC3103.m4808(c3382, R.id.accessibilityActionPageDown);
        AbstractC3103.m4809(c3382, 0);
        if (c3382.getAdapter() == null || (iMo5354 = c3382.getAdapter().mo5354()) == 0 || !c3382.f8025) {
            return;
        }
        if (c3382.getOrientation() != 0) {
            if (c3382.f8029 < iMo5354 - 1) {
                AbstractC3103.m4799(c3382, new C8439(R.id.accessibilityActionPageDown, (String) null), c33882);
            }
            if (c3382.f8029 > 0) {
                AbstractC3103.m4799(c3382, new C8439(R.id.accessibilityActionPageUp, (String) null), c3388);
                return;
            }
            return;
        }
        boolean z = c3382.f8033.f7937.getLayoutDirection() == 1;
        int i2 = z ? 16908360 : 16908361;
        if (z) {
            i = 16908361;
        }
        if (c3382.f8029 < iMo5354 - 1) {
            AbstractC3103.m4799(c3382, new C8439(i2, (String) null), c33882);
        }
        if (c3382.f8029 > 0) {
            AbstractC3103.m4799(c3382, new C8439(i, (String) null), c3388);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public C3837 m1555(int i, C5520 c5520, C7801 c7801) {
        C5471 c5471 = new C5471(((C5471) this.f1440).f13910 + '@' + i);
        C0923 c0923 = (C0923) this.f1438;
        HashMap map = (HashMap) c0923.f573;
        List arrayList = (List) map.get(c5471);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(c5471, arrayList);
        }
        return ((C5480) c0923.f572).m9800(c5520, c7801, arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public Bundle m1556(String str, Bundle bundle) {
        HashMap map = (HashMap) this.f1439;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public void m1557(C5381 c5381, InterfaceC5920 interfaceC5920, Enum r5) {
        interfaceC5920.getClass();
        r5.getClass();
        InterfaceC5944 interfaceC5944 = (InterfaceC5944) this.f1440;
        C5344 c5344 = (C5344) ((ArrayList) this.f1438).get(r5.ordinal());
        int iIntValue = ((Number) interfaceC5944.get(c5381)).intValue();
        int i = (1 << c5344.f13501) - 1;
        int i2 = c5344.f13502;
        interfaceC5944.set(c5381, Integer.valueOf((iIntValue & (~(i << i2))) + (c5344.f13500 << i2)));
    }

    public C1171(InterfaceC5944 interfaceC5944, AbstractC7729 abstractC7729, InterfaceC5197 interfaceC5197, ArrayList arrayList) {
        this.f1442 = 8;
        interfaceC5944.getClass();
        abstractC7729.getClass();
        interfaceC5197.getClass();
        this.f1440 = interfaceC5944;
        this.f1441 = abstractC7729;
        this.f1439 = interfaceC5197;
        this.f1438 = arrayList;
    }

    public C1171(C5677 c5677, InterfaceC5318 interfaceC5318) {
        this.f1442 = 6;
        interfaceC5318.getClass();
        this.f1440 = c5677;
        this.f1441 = interfaceC5318;
        this.f1439 = c5677.m10138(new C5301(this, 0));
        this.f1438 = c5677.m10138(new C5301(this, 1));
    }

    public C1171(ProtoBuf$PackageFragment protoBuf$PackageFragment, C7740 c7740, AbstractC7732 abstractC7732, C5643 c5643) {
        this.f1442 = 12;
        abstractC7732.getClass();
        this.f1440 = c7740;
        this.f1441 = abstractC7732;
        this.f1439 = c5643;
        List<ProtoBuf$Class> class_List = protoBuf$PackageFragment.getClass_List();
        class_List.getClass();
        int iM9331 = AbstractC5171.m9331(AbstractC5177.m9381(class_List, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM9331 < 16 ? 16 : iM9331);
        for (Object obj : class_List) {
            linkedHashMap.put(AbstractC4765.m8878((C7740) this.f1440, ((ProtoBuf$Class) obj).getFqName()), obj);
        }
        this.f1438 = linkedHashMap;
    }

    public C1171(C3256 c3256, InterfaceC3260 interfaceC3260, AbstractC8465 abstractC8465) {
        this.f1442 = 24;
        c3256.getClass();
        interfaceC3260.getClass();
        abstractC8465.getClass();
        this.f1440 = c3256;
        this.f1441 = interfaceC3260;
        this.f1439 = abstractC8465;
        this.f1438 = new C8362();
    }

    public /* synthetic */ C1171(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f1442 = i;
        this.f1440 = obj;
        this.f1441 = obj2;
        this.f1439 = obj3;
        this.f1438 = obj4;
    }

    public C1171(Socket socket) {
        this.f1442 = 16;
        this.f1440 = socket;
        this.f1441 = new AtomicInteger();
        this.f1439 = new C6399(this);
        this.f1438 = new C6400(this);
    }

    public C1171(ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719, C2253 c2253) {
        this.f1442 = 1;
        this.f1440 = viewTreeObserverOnGlobalLayoutListenerC2719;
        this.f1441 = c2253;
        AutofillManager autofillManager = (AutofillManager) viewTreeObserverOnGlobalLayoutListenerC2719.getContext().getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            this.f1439 = autofillManager;
            viewTreeObserverOnGlobalLayoutListenerC2719.setImportantForAutofill(1);
            AutofillId autofillId = viewTreeObserverOnGlobalLayoutListenerC2719.getAutofillId();
            if (autofillId != null) {
                this.f1438 = autofillId;
                return;
            }
            throw AbstractC0900.m699("Required value was null.");
        }
        C6755.m11870("Autofill service could not be located.");
        throw null;
    }

    public C1171(Typeface typeface, C3134 c3134) {
        int i;
        int i2;
        int i3;
        int i4;
        this.f1442 = 25;
        this.f1438 = typeface;
        this.f1440 = c3134;
        this.f1439 = new C8526(1024);
        int iM4561 = c3134.m4561(6);
        if (iM4561 != 0) {
            int i5 = iM4561 + c3134.f6812;
            i = ((ByteBuffer) c3134.f6809).getInt(((ByteBuffer) c3134.f6809).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.f1441 = new char[i * 2];
        int iM45612 = c3134.m4561(6);
        if (iM45612 != 0) {
            int i6 = iM45612 + c3134.f6812;
            i2 = ((ByteBuffer) c3134.f6809).getInt(((ByteBuffer) c3134.f6809).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            C8528 c8528 = new C8528(this, i7);
            C3135 c3135M13554 = c8528.m13554();
            int iM45613 = c3135M13554.m4561(4);
            Character.toChars(iM45613 != 0 ? ((ByteBuffer) c3135M13554.f6809).getInt(iM45613 + c3135M13554.f6812) : 0, (char[]) this.f1441, i7 * 2);
            C3135 c3135M135542 = c8528.m13554();
            int iM45614 = c3135M135542.m4561(16);
            if (iM45614 != 0) {
                int i8 = iM45614 + c3135M135542.f6812;
                i3 = ((ByteBuffer) c3135M135542.f6809).getInt(((ByteBuffer) c3135M135542.f6809).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            AbstractC7173.m12431("invalid metadata codepoint length", i3 > 0);
            C8526 c8526 = (C8526) this.f1439;
            C3135 c3135M135543 = c8528.m13554();
            int iM45615 = c3135M135543.m4561(16);
            if (iM45615 != 0) {
                int i9 = iM45615 + c3135M135543.f6812;
                i4 = ((ByteBuffer) c3135M135543.f6809).getInt(((ByteBuffer) c3135M135543.f6809).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            c8526.m13553(c8528, 0, i4 - 1);
        }
    }

    public C1171(ArrayList arrayList, CountDownLatch countDownLatch, C7061 c7061, String str, ArrayList arrayList2) {
        this.f1442 = 21;
        this.f1440 = arrayList;
        this.f1441 = countDownLatch;
        this.f1439 = str;
        this.f1438 = arrayList2;
    }

    public C1171(C0923 c0923, C5471 c5471) {
        this.f1442 = 9;
        this.f1438 = c0923;
        this.f1442 = 9;
        this.f1439 = c0923;
        this.f1440 = c5471;
        this.f1441 = new ArrayList();
    }

    public C1171(C7870 c7870, InterfaceC7866 interfaceC7866, InterfaceC6016 interfaceC6016) {
        this.f1442 = 22;
        interfaceC7866.getClass();
        this.f1440 = c7870;
        this.f1441 = interfaceC7866;
        this.f1439 = interfaceC6016;
        this.f1438 = new C0955(this, interfaceC7866);
    }

    public C1171(Context context, ActionMode.Callback callback) {
        this.f1442 = 26;
        this.f1441 = context;
        this.f1440 = callback;
        this.f1439 = new ArrayList();
        this.f1438 = new C1130(0);
    }

    public C1171(C0954 c0954, C3294 c3294) {
        this.f1442 = 3;
        this.f1438 = c0954;
        this.f1440 = new SparseIntArray(1);
        this.f1441 = new SparseIntArray(1);
        this.f1439 = c3294;
    }

    public C1171(C9062 c9062, View view) {
        this.f1442 = 28;
        this.f1438 = c9062;
        if (view == null) {
            return;
        }
        c9062.m8606(view);
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) view.findViewById(C0328R.id.box_root);
        this.f1440 = dialogXBaseRelativeLayout;
        this.f1441 = (MaxRelativeLayout) view.findViewById(C0328R.id.box_custom);
        c9062.m8614().setTranslationZ(0.0f);
        dialogXBaseRelativeLayout.m8632(c9062.f23064);
        dialogXBaseRelativeLayout.f11981 = new C9065(this, 1);
        dialogXBaseRelativeLayout.f11982 = new C8878(this, 5);
        dialogXBaseRelativeLayout.post(new RunnableC9059(this, 0));
        c9062.f23063 = this;
        m1553();
    }

    public C1171(C5480 c5480, C5523 c5523, C3837 c3837) {
        this.f1442 = 11;
        this.f1441 = c5480;
        this.f1439 = c5523;
        this.f1438 = c3837;
        this.f1440 = new ArrayList();
    }

    public C1171(C3837 c3837, C1171 c1171, ArrayList arrayList) {
        this.f1442 = 10;
        this.f1441 = c3837;
        this.f1439 = c1171;
        this.f1438 = arrayList;
        this.f1440 = c3837;
    }

    public C1171(String str, String str2, String str3, InterfaceC9805 interfaceC9805) {
        this.f1442 = 17;
        this.f1440 = str == null ? "" : str;
        this.f1441 = str2 == null ? "" : str2;
        this.f1439 = str3 == null ? "" : str3;
        this.f1438 = interfaceC9805 == null ? new C6517() : interfaceC9805;
    }

    public C1171(C5633 c5633) {
        this.f1442 = 13;
        this.f1438 = c5633;
        List<ProtoBuf$EnumEntry> enumEntryList = c5633.f14348.getEnumEntryList();
        enumEntryList.getClass();
        int iM9331 = AbstractC5171.m9331(AbstractC5177.m9381(enumEntryList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM9331 < 16 ? 16 : iM9331);
        for (Object obj : enumEntryList) {
            linkedHashMap.put(AbstractC4765.m8875(c5633.f14339.f14406, ((ProtoBuf$EnumEntry) obj).getName()), obj);
        }
        this.f1440 = linkedHashMap;
        C5633 c56332 = (C5633) this.f1438;
        this.f1441 = c56332.f14339.f14407.f14437.m10137(new C2146(this, 5, c56332));
        C5677 c5677 = ((C5633) this.f1438).f14339.f14407.f14437;
        C5614 c5614 = new C5614(this, 1);
        c5677.getClass();
        this.f1439 = new C5679(c5677, c5614);
    }

    public C1171(C0960 c0960) {
        this.f1442 = 0;
        this.f1440 = c0960;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1171(InterfaceC1156 interfaceC1156) {
        this(new C0960(interfaceC1156, 8));
        this.f1442 = 0;
    }

    public C1171(C3382 c3382) {
        this.f1442 = 4;
        this.f1438 = c3382;
        this.f1440 = new C3388(this, 0);
        this.f1441 = new C3388(this, 1);
    }
}
