package androidx.activity;

import android.app.Application;
import android.app.PictureInPictureUiState;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.core.content.InterfaceC2165;
import androidx.core.util.InterfaceC2188;
import androidx.core.view.C2248;
import androidx.core.view.C2252;
import androidx.core.view.C2257;
import androidx.core.view.InterfaceC2253;
import androidx.fragment.app.C2325;
import androidx.lifecycle.AbstractC2402;
import androidx.lifecycle.AbstractC2435;
import androidx.lifecycle.AbstractC2436;
import androidx.lifecycle.C2386;
import androidx.lifecycle.C2423;
import androidx.lifecycle.C2424;
import androidx.lifecycle.C2428;
import androidx.lifecycle.FragmentC2433;
import androidx.lifecycle.InterfaceC2380;
import androidx.lifecycle.InterfaceC2388;
import androidx.lifecycle.InterfaceC2405;
import androidx.lifecycle.InterfaceC2421;
import androidx.lifecycle.InterfaceC2427;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;
import com.davemorrissey.labs.subscaleview.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.AbstractC5187;
import kotlin.C5176;
import kotlin.InterfaceC5169;
import kotlin.InterfaceC5184;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4388;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.AbstractC5062;
import net.bytebuddy.description.method.MethodDescription;
import p075.C6961;
import p116.C7342;
import p130.C7502;
import p142.C7538;
import p142.C7539;
import p142.C7542;
import p142.InterfaceC7537;
import p142.InterfaceC7540;
import p144.C7550;
import p144.C7552;
import p144.InterfaceC7549;
import p160.AbstractC7636;
import p160.C7635;
import p162.AbstractC7659;
import p162.C7650;
import p162.C7656;
import p170.AbstractC7722;
import p171.AbstractC7727;
import p171.AbstractC7729;
import p171.C7723;
import p171.C7724;
import p171.InterfaceC7728;
import p172.C7732;
import p172.InterfaceC7731;
import p172.InterfaceC7733;
import p251.AbstractC8175;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 í\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\t2\u00020\n2\u00020\t2\u00020\t2\u00020\t2\u00020\t2\u00020\t2\u00020\t:\bî\u0001\u009e\u0001ï\u0001ð\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fB\u0013\b\u0017\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0010H\u0015¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b\u0019\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u00122\b\b\u0001\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u000fJ\u0019\u0010\u001b\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001b\u0010\u001eJ#\u0010\u001b\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b\u001b\u0010!J#\u0010\"\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u0012H\u0017¢\u0006\u0004\b#\u0010\fJ\u0011\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u00122\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\u00122\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b+\u0010*J)\u00100\u001a\u00020/2\u0006\u0010,\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u00020/2\u0006\u0010,\u001a\u00020\r2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b2\u00103J\u001f\u00106\u001a\u00020/2\u0006\u0010,\u001a\u00020\r2\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u001f\u00108\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\r2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\u00122\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u001f\u0010<\u001a\u00020\u00122\u0006\u0010;\u001a\u00020:2\u0006\u0010>\u001a\u00020\u0003H\u0016¢\u0006\u0004\b<\u0010?J'\u0010<\u001a\u00020\u00122\u0006\u0010;\u001a\u00020:2\u0006\u0010>\u001a\u00020\u00032\u0006\u0010A\u001a\u00020@H\u0017¢\u0006\u0004\b<\u0010BJ\u0017\u0010C\u001a\u00020\u00122\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\bC\u0010=J\u000f\u0010D\u001a\u00020\u0012H\u0016¢\u0006\u0004\bD\u0010\fJ\u000f\u0010E\u001a\u00020\u0012H\u0017¢\u0006\u0004\bE\u0010\fJ\u001f\u0010I\u001a\u00020\u00122\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020\rH\u0017¢\u0006\u0004\bI\u0010JJ)\u0010I\u001a\u00020\u00122\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020\r2\b\u0010K\u001a\u0004\u0018\u00010\u0010H\u0017¢\u0006\u0004\bI\u0010LJA\u0010R\u001a\u00020\u00122\u0006\u0010G\u001a\u00020M2\u0006\u0010H\u001a\u00020\r2\b\u0010N\u001a\u0004\u0018\u00010F2\u0006\u0010O\u001a\u00020\r2\u0006\u0010P\u001a\u00020\r2\u0006\u0010Q\u001a\u00020\rH\u0017¢\u0006\u0004\bR\u0010SJK\u0010R\u001a\u00020\u00122\u0006\u0010G\u001a\u00020M2\u0006\u0010H\u001a\u00020\r2\b\u0010N\u001a\u0004\u0018\u00010F2\u0006\u0010O\u001a\u00020\r2\u0006\u0010P\u001a\u00020\r2\u0006\u0010Q\u001a\u00020\r2\b\u0010K\u001a\u0004\u0018\u00010\u0010H\u0017¢\u0006\u0004\bR\u0010TJ)\u0010W\u001a\u00020\u00122\u0006\u0010H\u001a\u00020\r2\u0006\u0010U\u001a\u00020\r2\b\u0010V\u001a\u0004\u0018\u00010FH\u0015¢\u0006\u0004\bW\u0010XJ-\u0010^\u001a\u00020\u00122\u0006\u0010H\u001a\u00020\r2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020Z0Y2\u0006\u0010]\u001a\u00020\\H\u0017¢\u0006\u0004\b^\u0010_JI\u0010i\u001a\b\u0012\u0004\u0012\u00028\u00000h\"\u0004\b\u0000\u0010`\"\u0004\b\u0001\u0010a2\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010b2\u0006\u0010e\u001a\u00020d2\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00010f¢\u0006\u0004\bi\u0010jJA\u0010i\u001a\b\u0012\u0004\u0012\u00028\u00000h\"\u0004\b\u0000\u0010`\"\u0004\b\u0001\u0010a2\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010b2\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00010f¢\u0006\u0004\bi\u0010kJ\u0017\u0010n\u001a\u00020\u00122\u0006\u0010m\u001a\u00020lH\u0017¢\u0006\u0004\bn\u0010oJ\u001b\u0010q\u001a\u00020\u00122\f\u0010(\u001a\b\u0012\u0004\u0012\u00020l0p¢\u0006\u0004\bq\u0010rJ\u001b\u0010s\u001a\u00020\u00122\f\u0010(\u001a\b\u0012\u0004\u0012\u00020l0p¢\u0006\u0004\bs\u0010rJ\u0017\u0010u\u001a\u00020\u00122\u0006\u0010t\u001a\u00020\rH\u0017¢\u0006\u0004\bu\u0010\u000fJ\u001b\u0010v\u001a\u00020\u00122\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0p¢\u0006\u0004\bv\u0010rJ\u001b\u0010w\u001a\u00020\u00122\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0p¢\u0006\u0004\bw\u0010rJ\u0017\u0010x\u001a\u00020\u00122\u0006\u0010G\u001a\u00020FH\u0015¢\u0006\u0004\bx\u0010yJ\u001b\u0010z\u001a\u00020\u00122\f\u0010(\u001a\b\u0012\u0004\u0012\u00020F0p¢\u0006\u0004\bz\u0010rJ\u001b\u0010{\u001a\u00020\u00122\f\u0010(\u001a\b\u0012\u0004\u0012\u00020F0p¢\u0006\u0004\b{\u0010rJ\u0017\u0010}\u001a\u00020\u00122\u0006\u0010|\u001a\u00020/H\u0017¢\u0006\u0004\b}\u0010~J\u001f\u0010}\u001a\u00020\u00122\u0006\u0010|\u001a\u00020/2\u0006\u0010m\u001a\u00020lH\u0017¢\u0006\u0004\b}\u0010\u007fJ\u001e\u0010\u0081\u0001\u001a\u00020\u00122\r\u0010(\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010p¢\u0006\u0005\b\u0081\u0001\u0010rJ\u001e\u0010\u0082\u0001\u001a\u00020\u00122\r\u0010(\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010p¢\u0006\u0005\b\u0082\u0001\u0010rJ\u001a\u0010\u0084\u0001\u001a\u00020\u00122\u0007\u0010\u0083\u0001\u001a\u00020/H\u0017¢\u0006\u0005\b\u0084\u0001\u0010~J\"\u0010\u0084\u0001\u001a\u00020\u00122\u0007\u0010\u0083\u0001\u001a\u00020/2\u0006\u0010m\u001a\u00020lH\u0017¢\u0006\u0005\b\u0084\u0001\u0010\u007fJ\u001c\u0010\u0087\u0001\u001a\u00020\u00122\b\u0010\u0086\u0001\u001a\u00030\u0085\u0001H\u0017¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u001e\u0010\u008a\u0001\u001a\u00020\u00122\r\u0010(\u001a\t\u0012\u0005\u0012\u00030\u0089\u00010p¢\u0006\u0005\b\u008a\u0001\u0010rJ\u001e\u0010\u008b\u0001\u001a\u00020\u00122\r\u0010(\u001a\t\u0012\u0005\u0012\u00030\u0089\u00010p¢\u0006\u0005\b\u008b\u0001\u0010rJ\u001e\u0010\u008d\u0001\u001a\u00020\u00122\r\u0010(\u001a\t\u0012\u0005\u0012\u00030\u008c\u00010p¢\u0006\u0005\b\u008d\u0001\u0010rJ\u001e\u0010\u008e\u0001\u001a\u00020\u00122\r\u0010(\u001a\t\u0012\u0005\u0012\u00030\u008c\u00010p¢\u0006\u0005\b\u008e\u0001\u0010rJ\u0019\u0010\u0090\u0001\u001a\u00020\u00122\u0007\u0010 \u001a\u00030\u008f\u0001¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u0019\u0010\u0092\u0001\u001a\u00020\u00122\u0007\u0010 \u001a\u00030\u008f\u0001¢\u0006\u0006\b\u0092\u0001\u0010\u0091\u0001J\u0011\u0010\u0093\u0001\u001a\u00020\u0012H\u0015¢\u0006\u0005\b\u0093\u0001\u0010\fJ\u0019\u0010\u0095\u0001\u001a\u00020\u00122\u0007\u0010(\u001a\u00030\u0094\u0001¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u0019\u0010\u0097\u0001\u001a\u00020\u00122\u0007\u0010(\u001a\u00030\u0094\u0001¢\u0006\u0006\b\u0097\u0001\u0010\u0096\u0001J\u0011\u0010\u0098\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u0098\u0001\u0010\fJ\u0011\u0010\u0099\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u0099\u0001\u0010\fJ\u001c\u0010\u009c\u0001\u001a\u00020\u00122\b\u0010\u009b\u0001\u001a\u00030\u009a\u0001H\u0003¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u0013\u0010\u009f\u0001\u001a\u00030\u009e\u0001H\u0002¢\u0006\u0006\b\u009f\u0001\u0010 \u0001R\u0018\u0010¢\u0001\u001a\u00030¡\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u0018\u0010¥\u0001\u001a\u00030¤\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u001f\u0010¨\u0001\u001a\u00030§\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b¨\u0001\u0010©\u0001\u0012\u0005\bª\u0001\u0010\fR\u001c\u0010¬\u0001\u001a\u0005\u0018\u00010«\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R\u0018\u0010®\u0001\u001a\u00030\u009e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R!\u0010µ\u0001\u001a\u00030°\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010`R\u0018\u0010·\u0001\u001a\u00030¶\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R\u001c\u0010¹\u0001\u001a\u00020d8\u0006¢\u0006\u0010\n\u0006\b¹\u0001\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001R$\u0010¾\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020l0p0½\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R$\u0010À\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0p0½\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010¿\u0001R$\u0010Á\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0p0½\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÁ\u0001\u0010¿\u0001R%\u0010Â\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0080\u00010p0½\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0001\u0010¿\u0001R%\u0010Ã\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0089\u00010p0½\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÃ\u0001\u0010¿\u0001R%\u0010Ä\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008c\u00010p0½\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÄ\u0001\u0010¿\u0001R\u001f\u0010Å\u0001\u001a\n\u0012\u0005\u0012\u00030\u0094\u00010½\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÅ\u0001\u0010¿\u0001R\u0019\u0010Æ\u0001\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0001\u0010Ç\u0001R\u0019\u0010È\u0001\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010Ç\u0001R!\u0010Í\u0001\u001a\u00030É\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÊ\u0001\u0010²\u0001\u001a\u0006\bË\u0001\u0010Ì\u0001R\u0019\u0010Î\u0001\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÎ\u0001\u0010Ç\u0001R!\u0010Ó\u0001\u001a\u00030Ï\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÐ\u0001\u0010²\u0001\u001a\u0006\bÑ\u0001\u0010Ò\u0001R!\u0010×\u0001\u001a\u00030\u009a\u00018FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\bÔ\u0001\u0010²\u0001\u001a\u0006\bÕ\u0001\u0010Ö\u0001R\u0018\u0010Ù\u0001\u001a\u0004\u0018\u00010\t8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bØ\u0001\u0010\u0018R\u0018\u0010Ý\u0001\u001a\u00030Ú\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÛ\u0001\u0010Ü\u0001R\u0018\u0010à\u0001\u001a\u00030«\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÞ\u0001\u0010ß\u0001R\u0018\u0010ä\u0001\u001a\u00030á\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\bâ\u0001\u0010ã\u0001R\u0018\u0010è\u0001\u001a\u00030å\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bæ\u0001\u0010ç\u0001R\u0015\u0010ì\u0001\u001a\u00030é\u00018F¢\u0006\b\u001a\u0006\bê\u0001\u0010ë\u0001¨\u0006ñ\u0001"}, d2 = {"Landroidx/activity/ComponentActivity;", "Landroidx/core/app/ComponentActivity;", "L飘花落叶言子楪世哲兰苏/飘花落叶言子楪世苏哲兰;", "Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;", "Landroidx/lifecycle/飘花落叶言子苏兰世楪哲;", "Landroidx/lifecycle/飘花落叶言子楪哲兰世苏;", "L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世兰哲苏;", "Landroidx/activity/飘花落叶言子世哲兰楪苏;", "L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世哲兰苏;", "", "Landroidx/core/content/飘花落叶言子楪世哲兰苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "contentLayoutId", "(I)V", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/飘花落叶言子楪兰苏哲世;", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "onRetainNonConfigurationInstance", "()Ljava/lang/Object;", "onRetainCustomNonConfigurationInstance", "layoutResID", "setContentView", "Landroid/view/View;", "view", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "addContentView", "initializeViewTreeOwners", "Landroid/content/Context;", "peekAvailableContext", "()Landroid/content/Context;", "L飘花落叶言子楪世哲兰苏/飘花落叶言子楪世哲苏兰;", "listener", "addOnContextAvailableListener", "(L飘花落叶言子楪世哲兰苏/飘花落叶言子楪世哲苏兰;)V", "removeOnContextAvailableListener", "featureId", "Landroid/view/Menu;", "menu", "", "onPreparePanel", "(ILandroid/view/View;Landroid/view/Menu;)Z", "onCreatePanelMenu", "(ILandroid/view/Menu;)Z", "Landroid/view/MenuItem;", "item", "onMenuItemSelected", "(ILandroid/view/MenuItem;)Z", "onPanelClosed", "(ILandroid/view/Menu;)V", "Landroidx/core/view/飘花落叶言子楪兰苏哲世;", "provider", "addMenuProvider", "(Landroidx/core/view/飘花落叶言子楪兰苏哲世;)V", "owner", "(Landroidx/core/view/飘花落叶言子楪兰苏哲世;Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;)V", "Landroidx/lifecycle/Lifecycle$State;", "state", "(Landroidx/core/view/飘花落叶言子楪兰苏哲世;Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;Landroidx/lifecycle/Lifecycle$State;)V", "removeMenuProvider", "invalidateMenu", "onBackPressed", "Landroid/content/Intent;", "intent", "requestCode", "startActivityForResult", "(Landroid/content/Intent;I)V", "options", "(Landroid/content/Intent;ILandroid/os/Bundle;)V", "Landroid/content/IntentSender;", "fillInIntent", "flagsMask", "flagsValues", "extraFlags", "startIntentSenderForResult", "(Landroid/content/IntentSender;ILandroid/content/Intent;III)V", "(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V", "resultCode", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "I", "O", "L飘花落叶言子楪世兰哲苏/飘花落叶言子楪世苏哲兰;", "contract", "L飘花落叶言子楪世兰苏哲/飘花落叶言子楪苏世兰哲;", "registry", "L飘花落叶言子楪世兰苏哲/飘花落叶言子楪世苏哲兰;", "callback", "L飘花落叶言子楪世兰苏哲/飘花落叶言子楪世苏兰哲;", "registerForActivityResult", "(L飘花落叶言子楪世兰哲苏/飘花落叶言子楪世苏哲兰;L飘花落叶言子楪世兰苏哲/飘花落叶言子楪苏世兰哲;L飘花落叶言子楪世兰苏哲/飘花落叶言子楪世苏哲兰;)L飘花落叶言子楪世兰苏哲/飘花落叶言子楪世苏兰哲;", "(L飘花落叶言子楪世兰哲苏/飘花落叶言子楪世苏哲兰;L飘花落叶言子楪世兰苏哲/飘花落叶言子楪世苏哲兰;)L飘花落叶言子楪世兰苏哲/飘花落叶言子楪世苏兰哲;", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Landroidx/core/util/飘花落叶言子楪世苏哲兰;", "addOnConfigurationChangedListener", "(Landroidx/core/util/飘花落叶言子楪世苏哲兰;)V", "removeOnConfigurationChangedListener", "level", "onTrimMemory", "addOnTrimMemoryListener", "removeOnTrimMemoryListener", "onNewIntent", "(Landroid/content/Intent;)V", "addOnNewIntentListener", "removeOnNewIntentListener", "isInMultiWindowMode", "onMultiWindowModeChanged", "(Z)V", "(ZLandroid/content/res/Configuration;)V", "L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世兰哲苏;", "addOnMultiWindowModeChangedListener", "removeOnMultiWindowModeChangedListener", "isInPictureInPictureMode", "onPictureInPictureModeChanged", "Landroid/app/PictureInPictureUiState;", "pipState", "onPictureInPictureUiStateChanged", "(Landroid/app/PictureInPictureUiState;)V", "L飘花落叶言子哲楪世苏兰/飘花落叶言子楪苏世兰哲;", "addOnPictureInPictureModeChangedListener", "removeOnPictureInPictureModeChangedListener", "L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏兰哲世;", "addOnPictureInPictureUiStateChangedListener", "removeOnPictureInPictureUiStateChangedListener", "L飘花落叶言子哲楪世苏兰/飘花落叶言子楪苏哲世兰;", "enterPictureInPictureMode", "(L飘花落叶言子哲楪世苏兰/飘花落叶言子楪苏哲世兰;)V", "setPictureInPictureParams", "onUserLeaveHint", "Ljava/lang/Runnable;", "addOnUserLeaveHintListener", "(Ljava/lang/Runnable;)V", "removeOnUserLeaveHintListener", "reportFullyDrawn", "ensureViewModelStore", "Landroidx/activity/飘花落叶言子世哲苏楪兰;", "dispatcher", "addObserverForBackInvoker", "(Landroidx/activity/飘花落叶言子世哲苏楪兰;)V", "Landroidx/activity/飘花落叶言子楪苏兰哲世;", "createFullyDrawnExecutor", "()Landroidx/activity/飘花落叶言子楪苏兰哲世;", "L飘花落叶言子楪世哲兰苏/飘花落叶言子楪世苏兰哲;", "contextAwareHelper", "L飘花落叶言子楪世哲兰苏/飘花落叶言子楪世苏兰哲;", "Landroidx/core/view/飘花落叶言子楪兰苏世哲;", "menuHostHelper", "Landroidx/core/view/飘花落叶言子楪兰苏世哲;", "L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世兰苏哲;", "savedStateRegistryController", "L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世兰苏哲;", "getSavedStateRegistryController$annotations", "Landroidx/lifecycle/飘花落叶言子苏兰楪哲世;", "_viewModelStore", "Landroidx/lifecycle/飘花落叶言子苏兰楪哲世;", "reportFullyDrawnExecutor", "Landroidx/activity/飘花落叶言子楪苏兰哲世;", "Landroidx/activity/飘花落叶言子世楪兰哲苏;", "fullyDrawnReporter$delegate", "Lkotlin/飘花落叶言子楪苏世哲兰;", "getFullyDrawnReporter", "()Landroidx/activity/飘花落叶言子世楪兰哲苏;", "fullyDrawnReporter", "Ljava/util/concurrent/atomic/AtomicInteger;", "nextLocalRequestCode", "Ljava/util/concurrent/atomic/AtomicInteger;", "activityResultRegistry", "L飘花落叶言子楪世兰苏哲/飘花落叶言子楪苏世兰哲;", "getActivityResultRegistry", "()L飘花落叶言子楪世兰苏哲/飘花落叶言子楪苏世兰哲;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onConfigurationChangedListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onTrimMemoryListeners", "onNewIntentListeners", "onMultiWindowModeChangedListeners", "onPictureInPictureModeChangedListeners", "onPictureInPictureUiStateChangedListeners", "onUserLeaveHintListeners", "dispatchingOnMultiWindowModeChanged", "Z", "dispatchingOnPictureInPictureModeChanged", "L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世苏哲兰;", "onBackPressedInput$delegate", "getOnBackPressedInput", "()L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世苏哲兰;", "onBackPressedInput", "hasPictureInPictureSystemFeature", "Landroidx/lifecycle/飘花落叶言子苏哲兰楪世;", "defaultViewModelProviderFactory$delegate", "getDefaultViewModelProviderFactory", "()Landroidx/lifecycle/飘花落叶言子苏哲兰楪世;", "defaultViewModelProviderFactory", "onBackPressedDispatcher$delegate", "getOnBackPressedDispatcher", "()Landroidx/activity/飘花落叶言子世哲苏楪兰;", "onBackPressedDispatcher", "getLastCustomNonConfigurationInstance", "lastCustomNonConfigurationInstance", "Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;", "getLifecycle", "()Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;", "lifecycle", "getViewModelStore", "()Landroidx/lifecycle/飘花落叶言子苏兰楪哲世;", "viewModelStore", "L飘花落叶言子哲兰苏世楪/飘花落叶言子楪世苏兰哲;", "getDefaultViewModelCreationExtras", "()L飘花落叶言子哲兰苏世楪/飘花落叶言子楪世苏兰哲;", "defaultViewModelCreationExtras", "L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世哲苏兰;", "getNavigationEventDispatcher", "()L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世哲苏兰;", "navigationEventDispatcher", "L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世哲兰苏;", "getSavedStateRegistry", "()L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世哲兰苏;", "savedStateRegistry", "Companion", "androidx/activity/飘花落叶言子楪苏兰世哲", "androidx/activity/飘花落叶言子楪哲世兰苏", "androidx/activity/飘花落叶言子楪苏哲兰世", "activity"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ComponentActivity extends androidx.core.app.ComponentActivity implements InterfaceC7733, InterfaceC2421, InterfaceC2405, InterfaceC7537, InterfaceC0018, InterfaceC7549, InterfaceC2165 {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final C0059 Companion = new C0059();
    private C2423 _viewModelStore;
    private final AbstractC7729 activityResultRegistry;
    private int contentLayoutId;
    private final C7732 contextAwareHelper;

    /* JADX INFO: renamed from: defaultViewModelProviderFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC5184 defaultViewModelProviderFactory;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;

    /* JADX INFO: renamed from: fullyDrawnReporter$delegate, reason: from kotlin metadata */
    private final InterfaceC5184 fullyDrawnReporter;
    private boolean hasPictureInPictureSystemFeature;
    private final C2252 menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;

    /* JADX INFO: renamed from: onBackPressedDispatcher$delegate, reason: from kotlin metadata */
    private final InterfaceC5184 onBackPressedDispatcher;

    /* JADX INFO: renamed from: onBackPressedInput$delegate, reason: from kotlin metadata */
    private final InterfaceC5184 onBackPressedInput;
    private final CopyOnWriteArrayList<InterfaceC2188> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC2188> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC2188> onNewIntentListeners;
    private final CopyOnWriteArrayList<InterfaceC2188> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC2188> onPictureInPictureUiStateChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC2188> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final InterfaceExecutorC0057 reportFullyDrawnExecutor;
    private final C7538 savedStateRegistryController;

    public ComponentActivity() {
        this.contextAwareHelper = new C7732();
        final int i = 1;
        this.menuHostHelper = new C2252(new RunnableC0039(this, i));
        int i2 = 4;
        C7538 c7538 = new C7538(new C7502(this, new C7342(this, i2)));
        this.savedStateRegistryController = c7538;
        this.reportFullyDrawnExecutor = createFullyDrawnExecutor();
        this.fullyDrawnReporter = AbstractC5187.m10214(new C0036(this, i));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new C0050(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureUiStateChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        this.onBackPressedInput = AbstractC5187.m10214(new C0036(this, 2));
        if (getLifecycle() == null) {
            C5925.m11311("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        final int i3 = 0;
        getLifecycle().mo4503(new InterfaceC2380(this) { // from class: androidx.activity.飘花落叶言子楪苏世哲兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ ComponentActivity f112;

            {
                this.f112 = this;
            }

            @Override // androidx.lifecycle.InterfaceC2380
            /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
            public final void mo18(InterfaceC2388 interfaceC2388, Lifecycle$Event lifecycle$Event) {
                int i4 = i3;
                ComponentActivity componentActivity = this.f112;
                switch (i4) {
                    case 0:
                        ComponentActivity._init_$lambda$1(componentActivity, interfaceC2388, lifecycle$Event);
                        break;
                    default:
                        ComponentActivity._init_$lambda$2(componentActivity, interfaceC2388, lifecycle$Event);
                        break;
                }
            }
        });
        getLifecycle().mo4503(new InterfaceC2380(this) { // from class: androidx.activity.飘花落叶言子楪苏世哲兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ ComponentActivity f112;

            {
                this.f112 = this;
            }

            @Override // androidx.lifecycle.InterfaceC2380
            /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
            public final void mo18(InterfaceC2388 interfaceC2388, Lifecycle$Event lifecycle$Event) {
                int i4 = i;
                ComponentActivity componentActivity = this.f112;
                switch (i4) {
                    case 0:
                        ComponentActivity._init_$lambda$1(componentActivity, interfaceC2388, lifecycle$Event);
                        break;
                    default:
                        ComponentActivity._init_$lambda$2(componentActivity, interfaceC2388, lifecycle$Event);
                        break;
                }
            }
        });
        getLifecycle().mo4503(new C7542(this, i));
        c7538.m12759();
        AbstractC2435.m4530(this);
        getSavedStateRegistry().m12761(ACTIVITY_RESULT_TAG, new InterfaceC7540() { // from class: androidx.activity.飘花落叶言子楪苏世兰哲
            @Override // p142.InterfaceC7540
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
            public final Bundle mo165() {
                return ComponentActivity._init_$lambda$3(this.f111);
            }
        });
        addOnContextAvailableListener(new InterfaceC7731() { // from class: androidx.activity.飘花落叶言子楪苏哲世兰
            @Override // p172.InterfaceC7731
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
            public final void mo166(ComponentActivity componentActivity) {
                ComponentActivity._init_$lambda$4(this.f116, componentActivity);
            }
        });
        this.defaultViewModelProviderFactory = AbstractC5187.m10214(new C0036(this, 3));
        this.onBackPressedDispatcher = AbstractC5187.m10214(new C0036(this, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(ComponentActivity componentActivity, InterfaceC2388 interfaceC2388, Lifecycle$Event lifecycle$Event) {
        Window window;
        View viewPeekDecorView;
        interfaceC2388.getClass();
        lifecycle$Event.getClass();
        if (lifecycle$Event != Lifecycle$Event.ON_STOP || (window = componentActivity.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(ComponentActivity componentActivity, InterfaceC2388 interfaceC2388, Lifecycle$Event lifecycle$Event) {
        interfaceC2388.getClass();
        lifecycle$Event.getClass();
        if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
            componentActivity.contextAwareHelper.f20990 = null;
            if (!componentActivity.isChangingConfigurations()) {
                componentActivity.getViewModelStore().m4519();
            }
            ViewTreeObserverOnDrawListenerC0048 viewTreeObserverOnDrawListenerC0048 = (ViewTreeObserverOnDrawListenerC0048) componentActivity.reportFullyDrawnExecutor;
            ComponentActivity componentActivity2 = viewTreeObserverOnDrawListenerC0048.f98;
            componentActivity2.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC0048);
            componentActivity2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0048);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle _init_$lambda$3(ComponentActivity componentActivity) {
        Bundle bundle = new Bundle();
        AbstractC7729 abstractC7729 = componentActivity.activityResultRegistry;
        abstractC7729.getClass();
        LinkedHashMap linkedHashMap = abstractC7729.f20984;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(abstractC7729.f20982));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(abstractC7729.f20986));
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(ComponentActivity componentActivity, Context context) {
        context.getClass();
        Bundle bundleM12763 = componentActivity.getSavedStateRegistry().m12763(ACTIVITY_RESULT_TAG);
        if (bundleM12763 != null) {
            AbstractC7729 abstractC7729 = componentActivity.activityResultRegistry;
            LinkedHashMap linkedHashMap = abstractC7729.f20984;
            LinkedHashMap linkedHashMap2 = abstractC7729.f20985;
            Bundle bundle = abstractC7729.f20986;
            ArrayList<Integer> integerArrayList = bundleM12763.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleM12763.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleM12763.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                abstractC7729.f20982.addAll(stringArrayList2);
            }
            Bundle bundle2 = bundleM12763.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        AbstractC4388.m8890(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                num2.getClass();
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i);
                str2.getClass();
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                abstractC7729.f20984.put(str3, Integer.valueOf(iIntValue));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addObserverForBackInvoker(final C0023 dispatcher) {
        getLifecycle().mo4503(new InterfaceC2380(this) { // from class: androidx.activity.飘花落叶言子楪世兰苏哲

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ ComponentActivity f73;

            {
                this.f73 = this;
            }

            @Override // androidx.lifecycle.InterfaceC2380
            /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
            public final void mo18(InterfaceC2388 interfaceC2388, Lifecycle$Event lifecycle$Event) {
                ComponentActivity.addObserverForBackInvoker$lambda$0(dispatcher, this.f73, interfaceC2388, lifecycle$Event);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addObserverForBackInvoker$lambda$0(C0023 c0023, ComponentActivity componentActivity, InterfaceC2388 interfaceC2388, Lifecycle$Event lifecycle$Event) {
        interfaceC2388.getClass();
        lifecycle$Event.getClass();
        if (lifecycle$Event == Lifecycle$Event.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = componentActivity.getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            c0023.m26(onBackInvokedDispatcher);
        }
    }

    private final InterfaceExecutorC0057 createFullyDrawnExecutor() {
        return new ViewTreeObserverOnDrawListenerC0048(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2428 defaultViewModelProviderFactory_delegate$lambda$0(ComponentActivity componentActivity) {
        return new C2428(componentActivity.getApplication(), componentActivity, componentActivity.getIntent() != null ? componentActivity.getIntent().getExtras() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureViewModelStore() {
        if (this._viewModelStore == null) {
            C0056 c0056 = (C0056) getLastNonConfigurationInstance();
            if (c0056 != null) {
                this._viewModelStore = c0056.f114;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new C2423();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0024 fullyDrawnReporter_delegate$lambda$0(ComponentActivity componentActivity) {
        return new C0024(componentActivity.reportFullyDrawnExecutor, new C0036(componentActivity, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5176 fullyDrawnReporter_delegate$lambda$0$0(ComponentActivity componentActivity) {
        componentActivity.reportFullyDrawn();
        return C5176.f14739;
    }

    private final C7552 getOnBackPressedInput() {
        return (C7552) this.onBackPressedInput.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0023 onBackPressedDispatcher_delegate$lambda$0(final ComponentActivity componentActivity) {
        final C0023 c0023 = new C0023(new RunnableC0039(componentActivity, 0));
        if (Build.VERSION.SDK_INT >= 33) {
            if (!AbstractC4395.m8907(Looper.myLooper(), Looper.getMainLooper())) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.飘花落叶言子楪世哲兰苏
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f76.addObserverForBackInvoker(c0023);
                    }
                });
                return c0023;
            }
            componentActivity.addObserverForBackInvoker(c0023);
        }
        return c0023;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBackPressedDispatcher_delegate$lambda$0$0(ComponentActivity componentActivity) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!AbstractC4395.m8907(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!AbstractC4395.m8907(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C7552 onBackPressedInput_delegate$lambda$0(ComponentActivity componentActivity) {
        C7552 c7552 = new C7552();
        componentActivity.getNavigationEventDispatcher().m12786(c7552);
        return c7552;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams params) {
        initializeViewTreeOwners();
        InterfaceExecutorC0057 interfaceExecutorC0057 = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((ViewTreeObserverOnDrawListenerC0048) interfaceExecutorC0057).m134(decorView);
        super.addContentView(view, params);
    }

    public void addMenuProvider(final InterfaceC2253 provider, InterfaceC2388 owner) {
        provider.getClass();
        owner.getClass();
        final C2252 c2252 = this.menuHostHelper;
        c2252.f6559.add(provider);
        c2252.f6560.run();
        AbstractC2402 lifecycle = owner.getLifecycle();
        HashMap map = c2252.f6558;
        C2248 c2248 = (C2248) map.remove(provider);
        if (c2248 != null) {
            c2248.f6550.mo4502(c2248.f6549);
            c2248.f6549 = null;
        }
        map.put(provider, new C2248(lifecycle, new InterfaceC2380() { // from class: androidx.core.view.飘花落叶言子楪兰世苏哲
            @Override // androidx.lifecycle.InterfaceC2380
            /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
            public final void mo18(InterfaceC2388 interfaceC2388, Lifecycle$Event lifecycle$Event) {
                C2252 c22522 = c2252;
                c22522.getClass();
                if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
                    c22522.m4210(provider);
                }
            }
        }));
    }

    @Override // androidx.core.content.InterfaceC2165
    public final void addOnConfigurationChangedListener(InterfaceC2188 listener) {
        listener.getClass();
        this.onConfigurationChangedListeners.add(listener);
    }

    @Override // p172.InterfaceC7733
    public final void addOnContextAvailableListener(InterfaceC7731 listener) {
        listener.getClass();
        this.contextAwareHelper.addOnContextAvailableListener(listener);
    }

    public final void addOnMultiWindowModeChangedListener(InterfaceC2188 listener) {
        listener.getClass();
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    public final void addOnNewIntentListener(InterfaceC2188 listener) {
        listener.getClass();
        this.onNewIntentListeners.add(listener);
    }

    public final void addOnPictureInPictureModeChangedListener(InterfaceC2188 listener) {
        listener.getClass();
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    public final void addOnPictureInPictureUiStateChangedListener(InterfaceC2188 listener) {
        listener.getClass();
        this.onPictureInPictureUiStateChangedListeners.add(listener);
    }

    public final void addOnTrimMemoryListener(InterfaceC2188 listener) {
        listener.getClass();
        this.onTrimMemoryListeners.add(listener);
    }

    public final void addOnUserLeaveHintListener(Runnable listener) {
        listener.getClass();
        this.onUserLeaveHintListeners.add(listener);
    }

    public final void enterPictureInPictureMode(AbstractC7659 params) {
        throw null;
    }

    public final AbstractC7729 getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.InterfaceC2405
    public AbstractC7636 getDefaultViewModelCreationExtras() {
        C7635 c7635 = new C7635(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c7635.f20724;
        if (application != null) {
            linkedHashMap.put(C2424.f7068, getApplication());
        }
        linkedHashMap.put(AbstractC2435.f7100, this);
        linkedHashMap.put(AbstractC2435.f7099, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(AbstractC2435.f7098, extras);
        }
        return c7635;
    }

    @Override // androidx.lifecycle.InterfaceC2405
    public InterfaceC2427 getDefaultViewModelProviderFactory() {
        return (InterfaceC2427) this.defaultViewModelProviderFactory.getValue();
    }

    public C0024 getFullyDrawnReporter() {
        return (C0024) this.fullyDrawnReporter.getValue();
    }

    @InterfaceC5169
    public Object getLastCustomNonConfigurationInstance() {
        C0056 c0056 = (C0056) getLastNonConfigurationInstance();
        if (c0056 != null) {
            return c0056.f115;
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.InterfaceC2388
    public AbstractC2402 getLifecycle() {
        return super.getLifecycle();
    }

    @Override // p144.InterfaceC7549
    public C7550 getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().m27().f60;
    }

    @Override // androidx.activity.InterfaceC0018
    public final C0023 getOnBackPressedDispatcher() {
        return (C0023) this.onBackPressedDispatcher.getValue();
    }

    @Override // p142.InterfaceC7537
    public final C7539 getSavedStateRegistry() {
        return this.savedStateRegistryController.f20418;
    }

    @Override // androidx.lifecycle.InterfaceC2421
    public C2423 getViewModelStore() {
        if (getApplication() == null) {
            C5925.m11311("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        ensureViewModelStore();
        C2423 c2423 = this._viewModelStore;
        c2423.getClass();
        return c2423;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @InterfaceC5169
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (this.activityResultRegistry.m13047(requestCode, resultCode, data)) {
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // android.app.Activity
    @InterfaceC5169
    public void onBackPressed() {
        getOnBackPressedInput().m12787();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        newConfig.getClass();
        super.onConfigurationChanged(newConfig);
        Iterator<InterfaceC2188> it = this.onConfigurationChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        this.savedStateRegistryController.m12758(savedInstanceState);
        C7732 c7732 = this.contextAwareHelper;
        c7732.getClass();
        c7732.f20990 = this;
        Iterator it = c7732.f20991.iterator();
        while (it.hasNext()) {
            ((InterfaceC7731) it.next()).mo166(this);
        }
        super.onCreate(savedInstanceState);
        int i = FragmentC2433.f7096;
        AbstractC2436.m4536(this);
        int i2 = this.contentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
        this.hasPictureInPictureSystemFeature = getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        menu.getClass();
        if (featureId != 0) {
            return true;
        }
        super.onCreatePanelMenu(featureId, menu);
        C2252 c2252 = this.menuHostHelper;
        getMenuInflater();
        Iterator it = c2252.f6559.iterator();
        while (it.hasNext()) {
            ((C2325) ((InterfaceC2253) it.next())).f6826.m4407();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        item.getClass();
        if (super.onMenuItemSelected(featureId, item)) {
            return true;
        }
        if (featureId == 0) {
            return this.menuHostHelper.m4211();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode, Configuration newConfig) {
        newConfig.getClass();
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(isInMultiWindowMode, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<InterfaceC2188> it = this.onMultiWindowModeChangedListeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().accept(new C7650(isInMultiWindowMode));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator<InterfaceC2188> it = this.onNewIntentListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int featureId, Menu menu) {
        menu.getClass();
        Iterator it = this.menuHostHelper.f6559.iterator();
        while (it.hasNext()) {
            ((C2325) ((InterfaceC2253) it.next())).f6826.m4401();
        }
        super.onPanelClosed(featureId, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, Configuration newConfig) {
        newConfig.getClass();
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<InterfaceC2188> it = this.onPictureInPictureModeChangedListeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().accept(new C7656(isInPictureInPictureMode));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureUiStateChanged(PictureInPictureUiState pipState) {
        C6961 c6961;
        pipState.getClass();
        super.onPictureInPictureUiStateChanged(pipState);
        int i = Build.VERSION.SDK_INT;
        int i2 = 4;
        if (i >= 35) {
            pipState.isStashed();
            pipState.isTransitioningToPip();
            c6961 = new C6961(i2);
        } else if (i >= 31) {
            pipState.isStashed();
            c6961 = new C6961(i2);
        } else {
            c6961 = new C6961(i2);
        }
        Iterator<InterfaceC2188> it = this.onPictureInPictureUiStateChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(c6961);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int featureId, View view, Menu menu) {
        menu.getClass();
        if (featureId != 0) {
            return true;
        }
        super.onPreparePanel(featureId, view, menu);
        Iterator it = this.menuHostHelper.f6559.iterator();
        while (it.hasNext()) {
            ((C2325) ((InterfaceC2253) it.next())).f6826.m4391();
        }
        return true;
    }

    @Override // android.app.Activity
    @InterfaceC5169
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        permissions.getClass();
        grantResults.getClass();
        if (this.activityResultRegistry.m13047(requestCode, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @InterfaceC5169
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0056 c0056;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        C2423 c2423 = this._viewModelStore;
        if (c2423 == null && (c0056 = (C0056) getLastNonConfigurationInstance()) != null) {
            c2423 = c0056.f114;
        }
        if (c2423 == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C0056 c00562 = new C0056();
        c00562.f115 = objOnRetainCustomNonConfigurationInstance;
        c00562.f114 = c2423;
        return c00562;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        outState.getClass();
        if (getLifecycle() instanceof C2386) {
            AbstractC2402 lifecycle = getLifecycle();
            lifecycle.getClass();
            ((C2386) lifecycle).m4505(Lifecycle$State.CREATED);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.m12757(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        Iterator<InterfaceC2188> it = this.onTrimMemoryListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(level));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.f20990;
    }

    public final <I, O> AbstractC7727 registerForActivityResult(final AbstractC7722 contract, final AbstractC7729 registry, final InterfaceC7728 callback) {
        contract.getClass();
        registry.getClass();
        callback.getClass();
        final String str = "activity_rq#" + this.nextLocalRequestCode.getAndIncrement();
        LinkedHashMap linkedHashMap = registry.f20983;
        AbstractC2402 lifecycle = getLifecycle();
        if (((C2386) lifecycle).f7019.isAtLeast(Lifecycle$State.STARTED)) {
            StringBuilder sb = new StringBuilder("LifecycleOwner ");
            sb.append(this);
            Lifecycle$State lifecycle$State = ((C2386) lifecycle).f7019;
            sb.append(" is attempting to register while current state is ");
            sb.append(lifecycle$State);
            sb.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb.toString().toString());
        }
        registry.m13045(str);
        C7724 c7724 = (C7724) linkedHashMap.get(str);
        if (c7724 == null) {
            c7724 = new C7724(lifecycle);
        }
        InterfaceC2380 interfaceC2380 = new InterfaceC2380() { // from class: 飘花落叶言子楪世兰苏哲.飘花落叶言子楪世哲苏兰
            @Override // androidx.lifecycle.InterfaceC2380
            /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
            public final void mo18(InterfaceC2388 interfaceC2388, Lifecycle$Event lifecycle$Event) {
                AbstractC7729 abstractC7729 = registry;
                LinkedHashMap linkedHashMap2 = abstractC7729.f20981;
                Lifecycle$Event lifecycle$Event2 = Lifecycle$Event.ON_START;
                String str2 = str;
                if (lifecycle$Event2 != lifecycle$Event) {
                    if (Lifecycle$Event.ON_STOP == lifecycle$Event) {
                        linkedHashMap2.remove(str2);
                        return;
                    } else {
                        if (Lifecycle$Event.ON_DESTROY == lifecycle$Event) {
                            abstractC7729.m13044(str2);
                            return;
                        }
                        return;
                    }
                }
                Bundle bundle = abstractC7729.f20986;
                LinkedHashMap linkedHashMap3 = abstractC7729.f20980;
                AbstractC7722 abstractC7722 = contract;
                InterfaceC7728 interfaceC7728 = callback;
                linkedHashMap2.put(str2, new C7725(abstractC7722, interfaceC7728));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    interfaceC7728.mo4424(obj);
                }
                ActivityResult activityResult = (ActivityResult) AbstractC5062.m10047(str2, bundle);
                if (activityResult != null) {
                    bundle.remove(str2);
                    interfaceC7728.mo4424(abstractC7722.mo4418(activityResult.f23, activityResult.f24));
                }
            }
        };
        c7724.f20973.mo4503(interfaceC2380);
        c7724.f20972.add(interfaceC2380);
        linkedHashMap.put(str, c7724);
        return new C7723();
    }

    public void removeMenuProvider(InterfaceC2253 provider) {
        provider.getClass();
        this.menuHostHelper.m4210(provider);
    }

    @Override // androidx.core.content.InterfaceC2165
    public final void removeOnConfigurationChangedListener(InterfaceC2188 listener) {
        listener.getClass();
        this.onConfigurationChangedListeners.remove(listener);
    }

    @Override // p172.InterfaceC7733
    public final void removeOnContextAvailableListener(InterfaceC7731 listener) {
        listener.getClass();
        this.contextAwareHelper.removeOnContextAvailableListener(listener);
    }

    public final void removeOnMultiWindowModeChangedListener(InterfaceC2188 listener) {
        listener.getClass();
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    public final void removeOnNewIntentListener(InterfaceC2188 listener) {
        listener.getClass();
        this.onNewIntentListeners.remove(listener);
    }

    public final void removeOnPictureInPictureModeChangedListener(InterfaceC2188 listener) {
        listener.getClass();
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    public final void removeOnPictureInPictureUiStateChangedListener(InterfaceC2188 listener) {
        listener.getClass();
        this.onPictureInPictureUiStateChangedListeners.remove(listener);
    }

    public final void removeOnTrimMemoryListener(InterfaceC2188 listener) {
        listener.getClass();
        this.onTrimMemoryListeners.remove(listener);
    }

    public final void removeOnUserLeaveHintListener(Runnable listener) {
        listener.getClass();
        this.onUserLeaveHintListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (AbstractC8175.m13637()) {
                AbstractC8175.m13651("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().m30();
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int layoutResID) {
        initializeViewTreeOwners();
        InterfaceExecutorC0057 interfaceExecutorC0057 = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((ViewTreeObserverOnDrawListenerC0048) interfaceExecutorC0057).m134(decorView);
        super.setContentView(layoutResID);
    }

    public final void setPictureInPictureParams(AbstractC7659 params) {
        throw null;
    }

    @Override // android.app.Activity
    @InterfaceC5169
    public void startActivityForResult(Intent intent, int requestCode) {
        intent.getClass();
        super.startActivityForResult(intent, requestCode);
    }

    @Override // android.app.Activity
    @InterfaceC5169
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) throws IntentSender.SendIntentException {
        intent.getClass();
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    @Override // android.app.Activity
    @InterfaceC5169
    public void startActivityForResult(Intent intent, int requestCode, Bundle options) {
        intent.getClass();
        super.startActivityForResult(intent, requestCode, options);
    }

    @Override // android.app.Activity
    @InterfaceC5169
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) throws IntentSender.SendIntentException {
        intent.getClass();
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    private static /* synthetic */ void getSavedStateRegistryController$annotations() {
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        InterfaceExecutorC0057 interfaceExecutorC0057 = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((ViewTreeObserverOnDrawListenerC0048) interfaceExecutorC0057).m134(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        initializeViewTreeOwners();
        InterfaceExecutorC0057 interfaceExecutorC0057 = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((ViewTreeObserverOnDrawListenerC0048) interfaceExecutorC0057).m134(decorView);
        super.setContentView(view, params);
    }

    @Override // android.app.Activity
    @InterfaceC5169
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<InterfaceC2188> it = this.onMultiWindowModeChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(new C7650(isInMultiWindowMode));
        }
    }

    @Override // android.app.Activity
    @InterfaceC5169
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<InterfaceC2188> it = this.onPictureInPictureModeChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(new C7656(isInPictureInPictureMode));
        }
    }

    public void addMenuProvider(InterfaceC2253 provider) {
        provider.getClass();
        C2252 c2252 = this.menuHostHelper;
        c2252.f6559.add(provider);
        c2252.f6560.run();
    }

    public void addMenuProvider(InterfaceC2253 provider, InterfaceC2388 owner, Lifecycle$State state) {
        provider.getClass();
        owner.getClass();
        state.getClass();
        C2252 c2252 = this.menuHostHelper;
        c2252.getClass();
        AbstractC2402 lifecycle = owner.getLifecycle();
        HashMap map = c2252.f6558;
        C2248 c2248 = (C2248) map.remove(provider);
        if (c2248 != null) {
            c2248.f6550.mo4502(c2248.f6549);
            c2248.f6549 = null;
        }
        map.put(provider, new C2248(lifecycle, new C2257(0, state, c2252, provider)));
    }

    public final <I, O> AbstractC7727 registerForActivityResult(AbstractC7722 contract, InterfaceC7728 callback) {
        contract.getClass();
        callback.getClass();
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }

    public ComponentActivity(int i) {
        this();
        this.contentLayoutId = i;
    }
}
