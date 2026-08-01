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
import bsh.C2632;
import com.bumptech.glide.load.engine.C2995;
import com.bumptech.glide.load.engine.C3001;
import com.bumptech.glide.load.engine.C3004;
import com.bumptech.glide.load.engine.C3007;
import com.bumptech.glide.load.engine.InterfaceC2988;
import com.bumptech.glide.load.engine.ThreadFactoryC2996;
import com.kongzue.dialogx.dialogs.CustomDialog$ALIGN;
import com.kongzue.dialogx.interfaces.AbstractC3748;
import com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import io.ktor.util.C4210;
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
import kotlin.InterfaceC5183;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.enums.InterfaceC4364;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.InterfaceC5111;
import kotlin.reflect.jvm.internal.impl.descriptors.C4467;
import kotlin.reflect.jvm.internal.impl.descriptors.C4468;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485;
import kotlin.reflect.jvm.internal.impl.km.C4548;
import kotlin.reflect.jvm.internal.impl.km.internal.C4511;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C4638;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C4647;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4635;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4642;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4721;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4746;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4748;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4753;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4755;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4758;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4766;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4770;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4771;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4810;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4830;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4829;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4781;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4800;
import kotlin.reflect.jvm.internal.impl.storage.C4836;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.storage.C4846;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import okio.internal.C5568;
import okio.internal.C5569;
import org.apache.commons.lang3.C5686;
import org.apache.commons.lang3.exception.UncheckedException;
import p005.InterfaceC6109;
import p005.InterfaceC6110;
import p005.InterfaceC6112;
import p013.C6177;
import p013.RunnableC6185;
import p014.C6190;
import p015.C6200;
import p015.C6204;
import p015.C6221;
import p015.C6222;
import p015.C6230;
import p015.InterfaceC6209;
import p017.AbstractC6238;
import p017.ThreadFactoryC6232;
import p033.AbstractC6325;
import p046.InterfaceC6477;
import p053.AbstractC6560;
import p070.AbstractC6899;
import p070.AbstractC6902;
import p070.C6910;
import p077.C6971;
import p079.AbstractC6976;
import p079.AbstractC6988;
import p079.AbstractC6995;
import p083.C7040;
import p083.InterfaceC7036;
import p103.AbstractC7274;
import p139.C7532;
import p142.C7538;
import p144.C7546;
import p155.C7609;
import p160.AbstractC7635;
import p160.C7634;
import p163.InterfaceMenuItemC7660;
import p167.C7696;
import p167.C7698;
import p175.AbstractC7738;
import p190.MenuC7777;
import p190.MenuC7801;
import p190.MenuItemC7792;
import p192.AbstractC7809;
import p192.C7805;
import p192.InterfaceC7810;
import p230.C8048;
import p257.AbstractC8237;
import p257.C8232;
import p257.C8235;
import p257.RunnableC8229;
import p261.AbstractC8247;
import p286.InterfaceC8392;
import p370.InterfaceC8963;
import retrofit2.AbstractC5760;
import retrofit2.C5779;
import retrofit2.C5780;
import retrofit2.ExecutorC5781;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0325 implements InterfaceC0321, InterfaceC1403, InterfaceC4635, InterfaceC4642, InterfaceC4643, InterfaceC4829, InterfaceC6109, InterfaceC6209, InterfaceC7810 {

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
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC2996(0));
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
            case 21:
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
    public static void m955(C0325 c0325, RunnableC6185 runnableC6185, C6177 c6177, RunnableC6185 runnableC61852, int i) {
        C6230 c6230;
        if ((i & 1) != 0) {
            runnableC6185 = null;
        }
        if ((i & 2) != 0) {
            c6177 = null;
        }
        if ((i & 4) != 0) {
            runnableC61852 = null;
        }
        c0325.getClass();
        TimeZone timeZone = AbstractC6238.f17190;
        boolean zIsShutdown = ((ThreadPoolExecutor) c0325.m977()).isShutdown();
        synchronized (c0325) {
            if (c6177 != null) {
                try {
                    if (!((ArrayDeque) c0325.f1093).remove(c6177)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (runnableC61852 != null) {
                runnableC61852.f16922.decrementAndGet();
                if (!((ArrayDeque) c0325.f1094).remove(runnableC61852)) {
                    throw new IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (runnableC6185 != null) {
                ((ArrayDeque) c0325.f1096).add(runnableC6185);
                RunnableC6185 runnableC6185M975 = c0325.m975(runnableC6185.f16923.f16880.f16955.f17120);
                if (runnableC6185M975 != null) {
                    runnableC6185.f16922 = runnableC6185M975.f16922;
                }
            }
            if ((c6177 != null || runnableC61852 != null) && (zIsShutdown || ((ArrayDeque) c0325.f1094).isEmpty())) {
                ((ArrayDeque) c0325.f1093).isEmpty();
            }
            if (zIsShutdown) {
                List listM8804 = AbstractC4343.m8804((ArrayDeque) c0325.f1096);
                ((ArrayDeque) c0325.f1096).clear();
                c6230 = new C6230(listM8804);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayDeque) c0325.f1096).iterator();
                it.getClass();
                while (it.hasNext()) {
                    RunnableC6185 runnableC61853 = (RunnableC6185) it.next();
                    if (((ArrayDeque) c0325.f1094).size() >= 64) {
                        break;
                    }
                    if (runnableC61853.f16922.get() < 5) {
                        it.remove();
                        runnableC61853.f16922.incrementAndGet();
                        arrayList.add(runnableC61853);
                        ((ArrayDeque) c0325.f1094).add(runnableC61853);
                    }
                }
                c6230 = new C6230(arrayList);
            }
        }
        int size = c6230.f17176.size();
        for (int i2 = 0; i2 < size; i2++) {
            RunnableC6185 runnableC61854 = (RunnableC6185) c6230.f17176.get(i2);
            if (runnableC61854 != runnableC6185) {
                C6177 c61772 = runnableC61854.f16923;
            }
            if (zIsShutdown) {
                runnableC61854.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                C6177 c61773 = runnableC61854.f16923;
                c61773.m11621(interruptedIOException);
                runnableC61854.f16924.mo991(c61773, interruptedIOException);
            } else {
                ExecutorService executorServiceM977 = c0325.m977();
                runnableC61854.getClass();
                C6177 c61774 = runnableC61854.f16923;
                c61774.f16882.f16969.getClass();
                try {
                    try {
                        ((ThreadPoolExecutor) executorServiceM977).execute(runnableC61854);
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                        interruptedIOException2.initCause(e);
                        C6177 c61775 = runnableC61854.f16923;
                        c61775.m11621(interruptedIOException2);
                        runnableC61854.f16924.mo991(c61775, interruptedIOException2);
                        C0325 c03252 = c61774.f16882.f16969;
                        c03252.getClass();
                        m955(c03252, null, null, runnableC61854, 3);
                    }
                } catch (Throwable th2) {
                    C0325 c03253 = c61774.f16882.f16969;
                    c03253.getClass();
                    m955(c03253, null, null, runnableC61854, 3);
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
    public void m956(C2304 c2304) {
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = c2304.f6753;
        String str = abstractComponentCallbacksC2338.f6900;
        HashMap map = (HashMap) this.f1096;
        if (map.get(str) != null) {
            return;
        }
        map.put(abstractComponentCallbacksC2338.f6900, c2304);
        if (AbstractC2313.m4352(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC2338);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public void m957(C2304 c2304) {
        HashMap map = (HashMap) this.f1096;
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = c2304.f6753;
        if (abstractComponentCallbacksC2338.f6883) {
            ((C2306) this.f1093).m4339(abstractComponentCallbacksC2338);
        }
        if (map.get(abstractComponentCallbacksC2338.f6900) == c2304 && ((C2304) map.put(abstractComponentCallbacksC2338.f6900, null)) != null && AbstractC2313.m4352(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC2338);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public AbstractC2425 m958(String str, InterfaceC5092 interfaceC5092) {
        AbstractC2425 abstractC2425;
        AbstractC2425 abstractC2425Mo4347;
        interfaceC5092.getClass();
        synchronized (((C7532) this.f1093)) {
            try {
                C2423 c2423 = (C2423) this.f1095;
                c2423.getClass();
                abstractC2425 = (AbstractC2425) c2423.f7066.get(str);
                if (interfaceC5092.isInstance(abstractC2425)) {
                    InterfaceC2427 interfaceC2427 = (InterfaceC2427) this.f1096;
                    if (interfaceC2427 instanceof C2428) {
                        C2428 c2428 = (C2428) interfaceC2427;
                        abstractC2425.getClass();
                        AbstractC2402 abstractC2402 = c2428.f7073;
                        if (abstractC2402 != null) {
                            C7538 c7538 = c2428.f7072;
                            c7538.getClass();
                            AbstractC2435.m4523(abstractC2425, c7538, abstractC2402);
                        }
                    }
                    abstractC2425.getClass();
                } else {
                    C7634 c7634 = new C7634((AbstractC7635) this.f1094);
                    c7634.f20729.put(C2422.f7064, str);
                    InterfaceC2427 interfaceC24272 = (InterfaceC2427) this.f1096;
                    interfaceC24272.getClass();
                    try {
                        try {
                            abstractC2425Mo4347 = interfaceC24272.mo4507(interfaceC5092, c7634);
                        } catch (AbstractMethodError unused) {
                            abstractC2425Mo4347 = interfaceC24272.mo4511(AbstractC6560.m12029(interfaceC5092), c7634);
                        }
                    } catch (AbstractMethodError unused2) {
                        abstractC2425Mo4347 = interfaceC24272.mo4347(AbstractC6560.m12029(interfaceC5092));
                    }
                    abstractC2425 = abstractC2425Mo4347;
                    C2423 c24232 = (C2423) this.f1095;
                    c24232.getClass();
                    abstractC2425.getClass();
                    AbstractC2425 abstractC24252 = (AbstractC2425) c24232.f7066.put(str, abstractC2425);
                    if (abstractC24252 != null) {
                        abstractC24252.m4512();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return abstractC2425;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public Enum m959(Object obj, InterfaceC5087 interfaceC5087) {
        interfaceC5087.getClass();
        return (Enum) ((InterfaceC4364) this.f1094).get(((InterfaceC4721) ((AbstractC6899) this.f1096).mo12153(((Number) ((InterfaceC5111) this.f1095).get(obj)).intValue())).getNumber());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public void m960(Object[] objArr, StringBuilder sb) {
        CharSequence charSequence = (CharSequence) this.f1095;
        CharSequence charSequence2 = (CharSequence) this.f1096;
        CharSequence charSequence3 = (CharSequence) this.f1094;
        InterfaceC8963 interfaceC8963 = (InterfaceC8963) this.f1093;
        try {
            sb.append(charSequence);
            if (objArr != null) {
                if (objArr.length > 0) {
                    interfaceC8963.accept(sb, objArr[0]);
                }
                for (int i = 1; i < objArr.length; i++) {
                    sb.append(charSequence3);
                    interfaceC8963.accept(sb, objArr[i]);
                }
            }
            sb.append(charSequence2);
        } catch (IOException e) {
            throw new UncheckedException(e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public boolean m961(AbstractC6995 abstractC6995) {
        if (((AbstractC6995) this.f1096).equals(abstractC6995)) {
            return true;
        }
        C0325 c0325 = (C0325) this.f1095;
        return c0325 != null ? c0325.m961(abstractC6995) : false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public long m962(Animation animation) {
        MaxRelativeLayout maxRelativeLayout = (MaxRelativeLayout) this.f1096;
        if (animation == null && maxRelativeLayout.getAnimation() != null) {
            animation = maxRelativeLayout.getAnimation();
        }
        long duration = (animation == null || animation.getDuration() == 0) ? 300L : animation.getDuration();
        long j = ((C8232) this.f1093).f11586;
        return j != -1 ? j : duration;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public List m963() {
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
    public ArrayList m964() {
        ArrayList arrayList = new ArrayList();
        for (C2304 c2304 : ((HashMap) this.f1096).values()) {
            if (c2304 != null) {
                arrayList.add(c2304);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public C7805 m965(AbstractC7809 abstractC7809) {
        ArrayList arrayList = (ArrayList) this.f1094;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C7805 c7805 = (C7805) arrayList.get(i);
            if (c7805 != null && c7805.f21279 == abstractC7809) {
                return c7805;
            }
        }
        C7805 c78052 = new C7805((Context) this.f1096, abstractC7809);
        arrayList.add(c78052);
        return c78052;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public AbstractC6988 m966(C4687 c4687, List list) {
        c4687.getClass();
        list.getClass();
        return (AbstractC6988) ((C4836) this.f1093).invoke(new C4467(c4687, list));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public ArrayList m967() {
        ArrayList arrayList = new ArrayList();
        for (C2304 c2304 : ((HashMap) this.f1096).values()) {
            if (c2304 != null) {
                arrayList.add(c2304.f6753);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public void m968(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            C2632.m5294("This graph contains cyclic dependencies");
            return;
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((C0283) this.f1096).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                m968(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public void m969(C2995 c2995) {
        InterfaceC2988 interfaceC2988;
        synchronized (this) {
            ((HashMap) this.f1096).remove(c2995.f9484);
            if (c2995.f9483 && (interfaceC2988 = c2995.f9482) != null) {
                ((C3007) this.f1093).m6438(c2995.f9484, new C3001(interfaceC2988, true, false, c2995.f9484, (C3007) this.f1093));
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public C0131 m970() {
        ArrayList arrayList = (ArrayList) this.f1094;
        if (((C6222) this.f1096) == null) {
            C5919.m11250("Base URL required.");
            return null;
        }
        C6200 c6200 = (C6200) this.f1095;
        if (c6200 == null) {
            c6200 = new C6200();
        }
        C6200 c62002 = c6200;
        ExecutorC5781 executorC5781 = AbstractC5760.f15814;
        C5780 c5780 = AbstractC5760.f15812;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.f1093);
        List listMo11113 = c5780.mo11113(executorC5781);
        arrayList2.addAll(listMo11113);
        List listMo11112 = c5780.mo11112();
        ArrayList arrayList3 = new ArrayList(arrayList.size() + 1 + listMo11112.size());
        arrayList3.add(new C5779(0));
        arrayList3.addAll(arrayList);
        arrayList3.addAll(listMo11112);
        C6222 c6222 = (C6222) this.f1096;
        List listUnmodifiableList = Collections.unmodifiableList(arrayList3);
        List listUnmodifiableList2 = Collections.unmodifiableList(arrayList2);
        listMo11113.size();
        return new C0131(c62002, c6222, listUnmodifiableList, listUnmodifiableList2, executorC5781);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public void m971(String str) {
        C6221 c6221 = new C6221(0);
        c6221.m11667(null, str);
        C6222 c6222M11664 = c6221.m11664();
        if ("".equals(c6222M11664.f17118.get(r0.size() - 1))) {
            this.f1096 = c6222M11664;
        } else {
            C4210.m8614(c6222M11664, "baseUrl must end in /: ");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public void m972(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        if (((ArrayList) this.f1095).contains(abstractComponentCallbacksC2338)) {
            C7546.m12745(abstractComponentCallbacksC2338, "Fragment already added: ");
            return;
        }
        synchronized (((ArrayList) this.f1095)) {
            ((ArrayList) this.f1095).add(abstractComponentCallbacksC2338);
        }
        abstractComponentCallbacksC2338.f6892 = true;
    }

    @Override // p192.InterfaceC7810
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public boolean mo271(AbstractC7809 abstractC7809, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f1095;
        C7805 c7805M965 = m965(abstractC7809);
        C0283 c0283 = (C0283) this.f1093;
        Menu menuC7777 = (Menu) c0283.get(menu);
        if (menuC7777 == null) {
            menuC7777 = new MenuC7777((Context) this.f1096, (MenuC7801) menu);
            c0283.put(menu, menuC7777);
        }
        return callback.onCreateActionMode(c7805M965, menuC7777);
    }

    @Override // p015.InterfaceC6209
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public void mo973(C6177 c6177, C6204 c6204) {
        String str = (String) this.f1094;
        ArrayList arrayList = (ArrayList) this.f1093;
        ArrayList arrayList2 = (ArrayList) this.f1095;
        try {
            ArrayList arrayListM11640 = C6190.m11640(str, c6204);
            synchronized (arrayList) {
                arrayList.addAll(arrayListM11640);
            }
        } catch (Exception e) {
            synchronized (arrayList2) {
                arrayList2.add(e);
            }
        }
        ((CountDownLatch) this.f1096).countDown();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public AbstractComponentCallbacksC2338 m974(String str) {
        for (C2304 c2304 : ((HashMap) this.f1096).values()) {
            if (c2304 != null) {
                AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338M974 = c2304.f6753;
                if (!str.equals(abstractComponentCallbacksC2338M974.f6900)) {
                    abstractComponentCallbacksC2338M974 = abstractComponentCallbacksC2338M974.f6895.f6783.m974(str);
                }
                if (abstractComponentCallbacksC2338M974 != null) {
                    return abstractComponentCallbacksC2338M974;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public RunnableC6185 m975(String str) {
        Iterator it = ((ArrayDeque) this.f1094).iterator();
        it.getClass();
        while (it.hasNext()) {
            RunnableC6185 runnableC6185 = (RunnableC6185) it.next();
            if (AbstractC4394.m8917(runnableC6185.f16923.f16880.f16955.f17120, str)) {
                return runnableC6185;
            }
        }
        Iterator it2 = ((ArrayDeque) this.f1096).iterator();
        it2.getClass();
        while (it2.hasNext()) {
            RunnableC6185 runnableC61852 = (RunnableC6185) it2.next();
            if (AbstractC4394.m8917(runnableC61852.f16923.f16880.f16955.f17120, str)) {
                return runnableC61852;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public AbstractComponentCallbacksC2338 m976(String str) {
        C2304 c2304 = (C2304) ((HashMap) this.f1096).get(str);
        if (c2304 != null) {
            return c2304.f6753;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public synchronized ExecutorService m977() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.f1095) == null) {
                this.f1095 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryC6232(AbstractC6238.f17189 + " Dispatcher", false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.f1095;
            threadPoolExecutor.getClass();
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public void m978(View view) {
        MaxRelativeLayout maxRelativeLayout;
        C8232 c8232 = (C8232) this.f1093;
        if (view != null) {
            view.setEnabled(false);
        }
        if (c8232.f11582 || (maxRelativeLayout = (MaxRelativeLayout) this.f1096) == null) {
            return;
        }
        c8232.f11582 = true;
        maxRelativeLayout.post(new RunnableC8229(this, 1));
    }

    @Override // p192.InterfaceC7810
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public void mo278(AbstractC7809 abstractC7809) {
        ((ActionMode.Callback) this.f1095).onDestroyActionMode(m965(abstractC7809));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4642
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void mo979(C4690 c4690, C4748 c4748) {
        ((C3004) this.f1095).mo979(c4690, c4748);
    }

    @Override // androidx.compose.animation.core.InterfaceC0360
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public long mo437(AbstractC0343 abstractC0343, AbstractC0343 abstractC03432, AbstractC0343 abstractC03433) {
        int iMo1039 = abstractC0343.mo1039();
        long jMax = 0;
        for (int i = 0; i < iMo1039; i++) {
            jMax = Math.max(jMax, ((C0113) this.f1095).m429(i).mo934(abstractC0343.mo1040(i), abstractC03432.mo1040(i), abstractC03433.mo1040(i)));
        }
        return jMax;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4642, kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void mo980() {
        switch (this.f1097) {
            case 9:
                ArrayList arrayList = (ArrayList) this.f1096;
                if (!arrayList.isEmpty()) {
                    ((HashMap) ((C0076) this.f1094).f228).put((C4638) this.f1095, arrayList);
                }
                break;
            case 10:
                ((C3004) this.f1096).mo980();
                ((ArrayList) ((C0325) this.f1094).f1095).add(new C4753((InterfaceC6477) AbstractC4343.m8818((ArrayList) this.f1093)));
                break;
            default:
                C3004 c3004 = (C3004) this.f1093;
                C4690 c4690 = (C4690) this.f1094;
                ArrayList arrayList2 = (ArrayList) this.f1095;
                arrayList2.getClass();
                InterfaceC4480 interfaceC4480M12025 = AbstractC6560.m12025(c4690, (AbstractC6988) c3004.f9532);
                if (interfaceC4480M12025 != null) {
                    HashMap map = (HashMap) c3004.f9535;
                    List listM12463 = AbstractC7274.m12463(arrayList2);
                    AbstractC4881 type = ((AbstractC6976) interfaceC4480M12025).getType();
                    type.getClass();
                    listM12463.getClass();
                    map.put(c4690, new C4746(listM12463, type));
                    break;
                } else if (((C4647) c3004.f9536).m9253((C4687) c3004.f9531) && AbstractC4394.m8917(c4690.m9345(), "value")) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : arrayList2) {
                        if (obj instanceof C4753) {
                            arrayList3.add(obj);
                        }
                    }
                    List list = (List) c3004.f9533;
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        list.add((InterfaceC6477) ((C4753) it.next()).f13901);
                    }
                    break;
                }
                break;
        }
    }

    @Override // p005.InterfaceC6109
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public InterfaceC6110 mo381() {
        return (C5568) this.f1094;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public void mo981(C4748 c4748) {
        ((ArrayList) this.f1095).add(new C4758(new C4755(c4748)));
    }

    @Override // p192.InterfaceC7810
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public boolean mo285(AbstractC7809 abstractC7809, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f1095;
        C7805 c7805M965 = m965(abstractC7809);
        C0283 c0283 = (C0283) this.f1093;
        Menu menuC7777 = (Menu) c0283.get(menu);
        if (menuC7777 == null) {
            menuC7777 = new MenuC7777((Context) this.f1096, (MenuC7801) menu);
            c0283.put(menu, menuC7777);
        }
        return callback.onPrepareActionMode(c7805M965, menuC7777);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public synchronized void m982(InterfaceC8392 interfaceC8392, C3001 c3001) {
        C2995 c2995 = (C2995) ((HashMap) this.f1096).put(interfaceC8392, new C2995(interfaceC8392, c3001, (ReferenceQueue) this.f1094));
        if (c2995 != null) {
            c2995.f9482 = null;
            c2995.clear();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4642
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public InterfaceC4643 mo983(C4690 c4690) {
        return ((C3004) this.f1095).mo983(c4690);
    }

    @Override // androidx.compose.animation.core.InterfaceC0360
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public AbstractC0343 mo444(long j, AbstractC0343 abstractC0343, AbstractC0343 abstractC03432, AbstractC0343 abstractC03433) {
        if (((AbstractC0343) this.f1096) == null) {
            this.f1096 = abstractC0343.mo1038();
        }
        AbstractC0343 abstractC03434 = (AbstractC0343) this.f1096;
        if (abstractC03434 == null) {
            AbstractC4394.m8918("valueVector");
            throw null;
        }
        int iMo1039 = abstractC03434.mo1039();
        int i = 0;
        while (true) {
            AbstractC0343 abstractC03435 = (AbstractC0343) this.f1096;
            if (i >= iMo1039) {
                if (abstractC03435 != null) {
                    return abstractC03435;
                }
                AbstractC4394.m8918("valueVector");
                throw null;
            }
            if (abstractC03435 == null) {
                AbstractC4394.m8918("valueVector");
                throw null;
            }
            abstractC03435.mo1036(((C0113) this.f1095).m429(i).mo933(j, abstractC0343.mo1040(i), abstractC03432.mo1040(i), abstractC03433.mo1040(i)), i);
            i++;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4829
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public C4830 mo290(C4687 c4687) {
        c4687.getClass();
        ProtoBuf$Class protoBuf$Class = (ProtoBuf$Class) ((LinkedHashMap) this.f1093).get(c4687);
        if (protoBuf$Class == null) {
            return null;
        }
        return new C4830((C6910) this.f1095, protoBuf$Class, (AbstractC6902) this.f1096, (InterfaceC4461) ((C4810) this.f1094).invoke(c4687));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public void mo984(Object obj) {
        ArrayList arrayList = (ArrayList) this.f1095;
        C4647 c4647 = (C4647) this.f1096;
        C4690 c4690 = (C4690) this.f1094;
        Object objM9505 = C4766.m9505(obj, c4647.f13579);
        if (objM9505 == null) {
            objM9505 = new C4771("Unsupported annotation argument: " + c4690);
        }
        arrayList.add(objM9505);
    }

    @Override // androidx.compose.animation.core.InterfaceC0360
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public AbstractC0343 mo446(AbstractC0343 abstractC0343, AbstractC0343 abstractC03432, AbstractC0343 abstractC03433) {
        if (((AbstractC0343) this.f1093) == null) {
            this.f1093 = abstractC03433.mo1038();
        }
        AbstractC0343 abstractC03434 = (AbstractC0343) this.f1093;
        if (abstractC03434 == null) {
            AbstractC4394.m8918("endVelocityVector");
            throw null;
        }
        int iMo1039 = abstractC03434.mo1039();
        int i = 0;
        while (true) {
            AbstractC0343 abstractC03435 = (AbstractC0343) this.f1093;
            if (i >= iMo1039) {
                if (abstractC03435 != null) {
                    return abstractC03435;
                }
                AbstractC4394.m8918("endVelocityVector");
                throw null;
            }
            if (abstractC03435 == null) {
                AbstractC4394.m8918("endVelocityVector");
                throw null;
            }
            abstractC03435.mo1036(((C0113) this.f1095).m429(i).mo936(abstractC0343.mo1040(i), abstractC03432.mo1040(i), abstractC03433.mo1040(i)), i);
            i++;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public void mo985(C4687 c4687, C4690 c4690) {
        ((ArrayList) this.f1095).add(new C4770(c4687, c4690));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public InterfaceC4642 mo986(C4687 c4687) {
        ArrayList arrayList = new ArrayList();
        return new C0325(((C4647) this.f1096).mo9252(c4687, InterfaceC4461.f13087, arrayList), this, arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4642
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public void mo987(C4690 c4690, Object obj) {
        ((C3004) this.f1095).mo987(c4690, obj);
    }

    @Override // p192.InterfaceC7810
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public boolean mo297(AbstractC7809 abstractC7809, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f1095).onActionItemClicked(m965(abstractC7809), new MenuItemC7792((Context) this.f1096, (InterfaceMenuItemC7660) menuItem));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4635
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public InterfaceC4642 mo988(C4687 c4687, C6971 c6971) {
        return ((C4647) ((C0076) this.f1094).f227).m9251(c4687, c6971, (ArrayList) this.f1096);
    }

    @Override // androidx.compose.animation.core.InterfaceC0360
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public AbstractC0343 mo451(long j, AbstractC0343 abstractC0343, AbstractC0343 abstractC03432, AbstractC0343 abstractC03433) {
        if (((AbstractC0343) this.f1094) == null) {
            this.f1094 = abstractC03433.mo1038();
        }
        AbstractC0343 abstractC03434 = (AbstractC0343) this.f1094;
        if (abstractC03434 == null) {
            AbstractC4394.m8918("velocityVector");
            throw null;
        }
        int iMo1039 = abstractC03434.mo1039();
        int i = 0;
        while (true) {
            AbstractC0343 abstractC03435 = (AbstractC0343) this.f1094;
            if (i >= iMo1039) {
                if (abstractC03435 != null) {
                    return abstractC03435;
                }
                AbstractC4394.m8918("velocityVector");
                throw null;
            }
            if (abstractC03435 == null) {
                AbstractC4394.m8918("velocityVector");
                throw null;
            }
            abstractC03435.mo1036(((C0113) this.f1095).m429(i).mo935(j, abstractC0343.mo1040(i), abstractC03432.mo1040(i), abstractC03433.mo1040(i)), i);
            i++;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4642
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public InterfaceC4642 mo989(C4687 c4687, C4690 c4690) {
        return ((C3004) this.f1095).mo989(c4687, c4690);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4642
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public void mo990(C4690 c4690, C4687 c4687, C4690 c46902) {
        ((C3004) this.f1095).mo990(c4690, c4687, c46902);
    }

    @Override // p015.InterfaceC6209
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public void mo991(C6177 c6177, IOException iOException) {
        ArrayList arrayList = (ArrayList) this.f1095;
        synchronized (arrayList) {
            arrayList.add(iOException);
        }
        ((CountDownLatch) this.f1096).countDown();
    }

    @Override // p005.InterfaceC6109
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public InterfaceC6112 mo400() {
        return (C5569) this.f1093;
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
    public void m992() {
        CustomDialog$ALIGN customDialog$ALIGN;
        MaxRelativeLayout maxRelativeLayout = (MaxRelativeLayout) this.f1096;
        C8232 c8232 = (C8232) this.f1093;
        int i = c8232.f22726;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) this.f1095;
        if (dialogXBaseRelativeLayout == null || c8232.m8071() == null) {
            return;
        }
        AbstractC6325 abstractC6325 = AbstractC8247.f22824;
        boolean z = false;
        maxRelativeLayout.m8088(0);
        int i2 = c8232.f11585;
        if (i2 == 0) {
            i2 = 0;
        }
        maxRelativeLayout.m8089(i2);
        maxRelativeLayout.setMinimumWidth(0);
        int i3 = c8232.f11584;
        if (i3 == 0) {
            i3 = 0;
        }
        maxRelativeLayout.setMinimumHeight(i3);
        dialogXBaseRelativeLayout.f11634 = c8232.f11589;
        int[] iArr = c8232.f11583;
        dialogXBaseRelativeLayout.m8085(iArr[0], iArr[1], iArr[2], iArr[3]);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) maxRelativeLayout.getLayoutParams();
        if (layoutParams == null || ((customDialog$ALIGN = (CustomDialog$ALIGN) this.f1094) != null && customDialog$ALIGN != c8232.f22717)) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        int i4 = 5;
        switch (AbstractC8237.f22737[c8232.f22717.ordinal()]) {
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
        this.f1094 = c8232.f22717;
        maxRelativeLayout.setLayoutParams(layoutParams);
        if (c8232.f22724) {
            BaseDialog$BOOLEAN baseDialog$BOOLEAN = c8232.f22725;
            if (baseDialog$BOOLEAN == null) {
                z = c8232.f11580;
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
        AbstractC3748 abstractC3748 = c8232.f22723;
        if (abstractC3748 != null && abstractC3748.getCustomView() != null) {
            c8232.f22723.bindParent(maxRelativeLayout, c8232.f22720);
        }
        int i5 = c8232.f22728;
        if (i5 != -1) {
            maxRelativeLayout.m8088(i5);
            maxRelativeLayout.setMinimumWidth(c8232.f22728);
        }
        if (i != -1) {
            maxRelativeLayout.m8089(i);
            maxRelativeLayout.setMinimumHeight(i);
        }
        dialogXBaseRelativeLayout.setBackgroundColor(c8232.f22718);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public void m993() {
        int iMo4784;
        C2555 c2555 = (C2555) this.f1096;
        C2555 c25552 = (C2555) this.f1095;
        C2549 c2549 = (C2549) this.f1093;
        int i = R.id.accessibilityActionPageLeft;
        AbstractC2270.m4238(c2549, R.id.accessibilityActionPageLeft);
        AbstractC2270.m4239(c2549, 0);
        AbstractC2270.m4238(c2549, R.id.accessibilityActionPageRight);
        AbstractC2270.m4239(c2549, 0);
        AbstractC2270.m4238(c2549, R.id.accessibilityActionPageUp);
        AbstractC2270.m4239(c2549, 0);
        AbstractC2270.m4238(c2549, R.id.accessibilityActionPageDown);
        AbstractC2270.m4239(c2549, 0);
        if (c2549.getAdapter() == null || (iMo4784 = c2549.getAdapter().mo4784()) == 0 || !c2549.f7679) {
            return;
        }
        if (c2549.getOrientation() != 0) {
            if (c2549.f7683 < iMo4784 - 1) {
                AbstractC2270.m4229(c2549, new C7609(R.id.accessibilityActionPageDown, (String) null), c25552);
            }
            if (c2549.f7683 > 0) {
                AbstractC2270.m4229(c2549, new C7609(R.id.accessibilityActionPageUp, (String) null), c2555);
                return;
            }
            return;
        }
        boolean z = c2549.f7687.f7591.getLayoutDirection() == 1;
        int i2 = z ? 16908360 : 16908361;
        if (z) {
            i = 16908361;
        }
        if (c2549.f7683 < iMo4784 - 1) {
            AbstractC2270.m4229(c2549, new C7609(i2, (String) null), c25552);
        }
        if (c2549.f7683 > 0) {
            AbstractC2270.m4229(c2549, new C7609(i, (String) null), c2555);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public C3004 m994(int i, C4687 c4687, C6971 c6971) {
        C4638 c4638 = new C4638(((C4638) this.f1095).f13561 + '@' + i);
        C0076 c0076 = (C0076) this.f1093;
        HashMap map = (HashMap) c0076.f228;
        List arrayList = (List) map.get(c4638);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(c4638, arrayList);
        }
        return ((C4647) c0076.f227).m9251(c4687, c6971, arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public Bundle m995(String str, Bundle bundle) {
        HashMap map = (HashMap) this.f1094;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public void m996(C4548 c4548, InterfaceC5087 interfaceC5087, Enum r5) {
        interfaceC5087.getClass();
        r5.getClass();
        InterfaceC5111 interfaceC5111 = (InterfaceC5111) this.f1095;
        C4511 c4511 = (C4511) ((ArrayList) this.f1093).get(r5.ordinal());
        int iIntValue = ((Number) interfaceC5111.get(c4548)).intValue();
        int i = (1 << c4511.f13152) - 1;
        int i2 = c4511.f13153;
        interfaceC5111.set(c4548, Integer.valueOf((iIntValue & (~(i << i2))) + (c4511.f13151 << i2)));
    }

    public C0325(InterfaceC5111 interfaceC5111, AbstractC6899 abstractC6899, InterfaceC4364 interfaceC4364, ArrayList arrayList) {
        this.f1097 = 8;
        interfaceC5111.getClass();
        abstractC6899.getClass();
        interfaceC4364.getClass();
        this.f1095 = interfaceC5111;
        this.f1096 = abstractC6899;
        this.f1094 = interfaceC4364;
        this.f1093 = arrayList;
    }

    public C0325(C4844 c4844, InterfaceC4485 interfaceC4485) {
        this.f1097 = 6;
        interfaceC4485.getClass();
        this.f1095 = c4844;
        this.f1096 = interfaceC4485;
        this.f1094 = c4844.m9589(new C4468(this, 0));
        this.f1093 = c4844.m9589(new C4468(this, 1));
    }

    public C0325(ProtoBuf$PackageFragment protoBuf$PackageFragment, C6910 c6910, AbstractC6902 abstractC6902, C4810 c4810) {
        this.f1097 = 12;
        abstractC6902.getClass();
        this.f1095 = c6910;
        this.f1096 = abstractC6902;
        this.f1094 = c4810;
        List<ProtoBuf$Class> class_List = protoBuf$PackageFragment.getClass_List();
        class_List.getClass();
        int iM8779 = AbstractC4338.m8779(AbstractC4344.m8832(class_List, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM8779 < 16 ? 16 : iM8779);
        for (Object obj : class_List) {
            linkedHashMap.put(AbstractC7738.m13051((C6910) this.f1095, ((ProtoBuf$Class) obj).getFqName()), obj);
        }
        this.f1093 = linkedHashMap;
    }

    public C0325(C2423 c2423, InterfaceC2427 interfaceC2427, AbstractC7635 abstractC7635) {
        this.f1097 = 24;
        c2423.getClass();
        interfaceC2427.getClass();
        abstractC7635.getClass();
        this.f1095 = c2423;
        this.f1096 = interfaceC2427;
        this.f1094 = abstractC7635;
        this.f1093 = new C7532();
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
        this.f1094 = new C5568(this);
        this.f1093 = new C5569(this);
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
        C5919.m11250("Autofill service could not be located.");
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
        this.f1094 = new C7696(1024);
        int iM3991 = c2301.m3991(6);
        if (iM3991 != 0) {
            int i5 = iM3991 + c2301.f6466;
            i = ((ByteBuffer) c2301.f6463).getInt(((ByteBuffer) c2301.f6463).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.f1096 = new char[i * 2];
        int iM39912 = c2301.m3991(6);
        if (iM39912 != 0) {
            int i6 = iM39912 + c2301.f6466;
            i2 = ((ByteBuffer) c2301.f6463).getInt(((ByteBuffer) c2301.f6463).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            C7698 c7698 = new C7698(this, i7);
            C2302 c2302M12965 = c7698.m12965();
            int iM39913 = c2302M12965.m3991(4);
            Character.toChars(iM39913 != 0 ? ((ByteBuffer) c2302M12965.f6463).getInt(iM39913 + c2302M12965.f6466) : 0, (char[]) this.f1096, i7 * 2);
            C2302 c2302M129652 = c7698.m12965();
            int iM39914 = c2302M129652.m3991(16);
            if (iM39914 != 0) {
                int i8 = iM39914 + c2302M129652.f6466;
                i3 = ((ByteBuffer) c2302M129652.f6463).getInt(((ByteBuffer) c2302M129652.f6463).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            AbstractC6560.m12019("invalid metadata codepoint length", i3 > 0);
            C7696 c7696 = (C7696) this.f1094;
            C2302 c2302M129653 = c7698.m12965();
            int iM39915 = c2302M129653.m3991(16);
            if (iM39915 != 0) {
                int i9 = iM39915 + c2302M129653.f6466;
                i4 = ((ByteBuffer) c2302M129653.f6463).getInt(((ByteBuffer) c2302M129653.f6463).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            c7696.m12964(c7698, 0, i4 - 1);
        }
    }

    public C0325(ArrayList arrayList, CountDownLatch countDownLatch, C6190 c6190, String str, ArrayList arrayList2) {
        this.f1097 = 20;
        this.f1095 = arrayList;
        this.f1096 = countDownLatch;
        this.f1094 = str;
        this.f1093 = arrayList2;
    }

    public C0325(C0076 c0076, C4638 c4638) {
        this.f1097 = 9;
        this.f1093 = c0076;
        this.f1097 = 9;
        this.f1094 = c0076;
        this.f1095 = c4638;
        this.f1096 = new ArrayList();
    }

    public C0325(C7040 c7040, InterfaceC7036 interfaceC7036, InterfaceC5183 interfaceC5183) {
        this.f1097 = 22;
        interfaceC7036.getClass();
        this.f1095 = c7040;
        this.f1096 = interfaceC7036;
        this.f1094 = interfaceC5183;
        this.f1093 = new C0108(this, interfaceC7036);
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

    public C0325(C8232 c8232, View view) {
        this.f1097 = 28;
        this.f1093 = c8232;
        if (view == null) {
            return;
        }
        c8232.m8060(view);
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) view.findViewById(com.davemorrissey.labs.subscaleview.R.id.box_root);
        this.f1095 = dialogXBaseRelativeLayout;
        this.f1096 = (MaxRelativeLayout) view.findViewById(com.davemorrissey.labs.subscaleview.R.id.box_custom);
        c8232.m8068().setTranslationZ(0.0f);
        dialogXBaseRelativeLayout.m8086(c8232.f22720);
        dialogXBaseRelativeLayout.f11631 = new C8235(this, 1);
        dialogXBaseRelativeLayout.f11632 = new C8048(this, 5);
        dialogXBaseRelativeLayout.post(new RunnableC8229(this, 0));
        c8232.f22719 = this;
        m992();
    }

    public C0325(C4647 c4647, C4690 c4690, C3004 c3004) {
        this.f1097 = 11;
        this.f1096 = c4647;
        this.f1094 = c4690;
        this.f1093 = c3004;
        this.f1095 = new ArrayList();
    }

    public C0325(C3004 c3004, C0325 c0325, ArrayList arrayList) {
        this.f1097 = 10;
        this.f1096 = c3004;
        this.f1094 = c0325;
        this.f1093 = arrayList;
        this.f1095 = c3004;
    }

    public C0325(String str, String str2, String str3, InterfaceC8963 interfaceC8963) {
        this.f1097 = 17;
        this.f1095 = str == null ? "" : str;
        this.f1096 = str2 == null ? "" : str2;
        this.f1094 = str3 == null ? "" : str3;
        this.f1093 = interfaceC8963 == null ? new C5686() : interfaceC8963;
    }

    public C0325(C4800 c4800) {
        this.f1097 = 13;
        this.f1093 = c4800;
        List<ProtoBuf$EnumEntry> enumEntryList = c4800.f13999.getEnumEntryList();
        enumEntryList.getClass();
        int iM8779 = AbstractC4338.m8779(AbstractC4344.m8832(enumEntryList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM8779 < 16 ? 16 : iM8779);
        for (Object obj : enumEntryList) {
            linkedHashMap.put(AbstractC7738.m13047(c4800.f13990.f14057, ((ProtoBuf$EnumEntry) obj).getName()), obj);
        }
        this.f1095 = linkedHashMap;
        C4800 c48002 = (C4800) this.f1093;
        this.f1096 = c48002.f13990.f14058.f14088.m9588(new C1311(this, 5, c48002));
        C4844 c4844 = ((C4800) this.f1093).f13990.f14058.f14088;
        C4781 c4781 = new C4781(this, 1);
        c4844.getClass();
        this.f1094 = new C4846(c4844, c4781);
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
