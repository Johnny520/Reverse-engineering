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
import androidx.core.content.InterfaceC2998;
import androidx.core.util.InterfaceC3021;
import androidx.core.view.C3081;
import androidx.core.view.C3085;
import androidx.core.view.C3090;
import androidx.core.view.InterfaceC3086;
import androidx.fragment.app.C3158;
import androidx.lifecycle.AbstractC3235;
import androidx.lifecycle.AbstractC3268;
import androidx.lifecycle.AbstractC3269;
import androidx.lifecycle.C3219;
import androidx.lifecycle.C3256;
import androidx.lifecycle.C3257;
import androidx.lifecycle.C3261;
import androidx.lifecycle.FragmentC3266;
import androidx.lifecycle.InterfaceC3213;
import androidx.lifecycle.InterfaceC3221;
import androidx.lifecycle.InterfaceC3238;
import androidx.lifecycle.InterfaceC3254;
import androidx.lifecycle.InterfaceC3260;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.AbstractC6019;
import kotlin.C6008;
import kotlin.InterfaceC6001;
import kotlin.InterfaceC6016;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5220;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.AbstractC5894;
import net.bytebuddy.description.method.MethodDescription;
import p091.C7790;
import p132.C8171;
import p146.C8331;
import p158.C8367;
import p158.C8368;
import p158.C8371;
import p158.InterfaceC8366;
import p158.InterfaceC8369;
import p160.C8379;
import p160.C8381;
import p160.InterfaceC8378;
import p176.AbstractC8465;
import p176.C8464;
import p178.AbstractC8488;
import p178.C8479;
import p178.C8485;
import p186.AbstractC8551;
import p187.AbstractC8556;
import p187.AbstractC8558;
import p187.C8552;
import p187.C8553;
import p187.InterfaceC8557;
import p188.C8561;
import p188.InterfaceC8560;
import p188.InterfaceC8562;
import p267.AbstractC9004;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u0080\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 í\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\t2\u00020\n2\u00020\t2\u00020\t2\u00020\t2\u00020\t2\u00020\t2\u00020\t:\bî\u0001\u009e\u0001ï\u0001ð\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fB\u0013\b\u0017\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0010H\u0015¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b\u0019\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u00122\b\b\u0001\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u000fJ\u0019\u0010\u001b\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001b\u0010\u001eJ#\u0010\u001b\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b\u001b\u0010!J#\u0010\"\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u0012H\u0017¢\u0006\u0004\b#\u0010\fJ\u0011\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u00122\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\u00122\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b+\u0010*J)\u00100\u001a\u00020/2\u0006\u0010,\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u00020/2\u0006\u0010,\u001a\u00020\r2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b2\u00103J\u001f\u00106\u001a\u00020/2\u0006\u0010,\u001a\u00020\r2\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u001f\u00108\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\r2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\u00122\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u001f\u0010<\u001a\u00020\u00122\u0006\u0010;\u001a\u00020:2\u0006\u0010>\u001a\u00020\u0003H\u0016¢\u0006\u0004\b<\u0010?J'\u0010<\u001a\u00020\u00122\u0006\u0010;\u001a\u00020:2\u0006\u0010>\u001a\u00020\u00032\u0006\u0010A\u001a\u00020@H\u0017¢\u0006\u0004\b<\u0010BJ\u0017\u0010C\u001a\u00020\u00122\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\bC\u0010=J\u000f\u0010D\u001a\u00020\u0012H\u0016¢\u0006\u0004\bD\u0010\fJ\u000f\u0010E\u001a\u00020\u0012H\u0017¢\u0006\u0004\bE\u0010\fJ\u001f\u0010I\u001a\u00020\u00122\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020\rH\u0017¢\u0006\u0004\bI\u0010JJ)\u0010I\u001a\u00020\u00122\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020\r2\b\u0010K\u001a\u0004\u0018\u00010\u0010H\u0017¢\u0006\u0004\bI\u0010LJA\u0010R\u001a\u00020\u00122\u0006\u0010G\u001a\u00020M2\u0006\u0010H\u001a\u00020\r2\b\u0010N\u001a\u0004\u0018\u00010F2\u0006\u0010O\u001a\u00020\r2\u0006\u0010P\u001a\u00020\r2\u0006\u0010Q\u001a\u00020\rH\u0017¢\u0006\u0004\bR\u0010SJK\u0010R\u001a\u00020\u00122\u0006\u0010G\u001a\u00020M2\u0006\u0010H\u001a\u00020\r2\b\u0010N\u001a\u0004\u0018\u00010F2\u0006\u0010O\u001a\u00020\r2\u0006\u0010P\u001a\u00020\r2\u0006\u0010Q\u001a\u00020\r2\b\u0010K\u001a\u0004\u0018\u00010\u0010H\u0017¢\u0006\u0004\bR\u0010TJ)\u0010W\u001a\u00020\u00122\u0006\u0010H\u001a\u00020\r2\u0006\u0010U\u001a\u00020\r2\b\u0010V\u001a\u0004\u0018\u00010FH\u0015¢\u0006\u0004\bW\u0010XJ-\u0010^\u001a\u00020\u00122\u0006\u0010H\u001a\u00020\r2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020Z0Y2\u0006\u0010]\u001a\u00020\\H\u0017¢\u0006\u0004\b^\u0010_JI\u0010i\u001a\b\u0012\u0004\u0012\u00028\u00000h\"\u0004\b\u0000\u0010`\"\u0004\b\u0001\u0010a2\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010b2\u0006\u0010e\u001a\u00020d2\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00010f¢\u0006\u0004\bi\u0010jJA\u0010i\u001a\b\u0012\u0004\u0012\u00028\u00000h\"\u0004\b\u0000\u0010`\"\u0004\b\u0001\u0010a2\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010b2\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00010f¢\u0006\u0004\bi\u0010kJ\u0017\u0010n\u001a\u00020\u00122\u0006\u0010m\u001a\u00020lH\u0017¢\u0006\u0004\bn\u0010oJ\u001b\u0010q\u001a\u00020\u00122\f\u0010(\u001a\b\u0012\u0004\u0012\u00020l0p¢\u0006\u0004\bq\u0010rJ\u001b\u0010s\u001a\u00020\u00122\f\u0010(\u001a\b\u0012\u0004\u0012\u00020l0p¢\u0006\u0004\bs\u0010rJ\u0017\u0010u\u001a\u00020\u00122\u0006\u0010t\u001a\u00020\rH\u0017¢\u0006\u0004\bu\u0010\u000fJ\u001b\u0010v\u001a\u00020\u00122\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0p¢\u0006\u0004\bv\u0010rJ\u001b\u0010w\u001a\u00020\u00122\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0p¢\u0006\u0004\bw\u0010rJ\u0017\u0010x\u001a\u00020\u00122\u0006\u0010G\u001a\u00020FH\u0015¢\u0006\u0004\bx\u0010yJ\u001b\u0010z\u001a\u00020\u00122\f\u0010(\u001a\b\u0012\u0004\u0012\u00020F0p¢\u0006\u0004\bz\u0010rJ\u001b\u0010{\u001a\u00020\u00122\f\u0010(\u001a\b\u0012\u0004\u0012\u00020F0p¢\u0006\u0004\b{\u0010rJ\u0017\u0010}\u001a\u00020\u00122\u0006\u0010|\u001a\u00020/H\u0017¢\u0006\u0004\b}\u0010~J\u001f\u0010}\u001a\u00020\u00122\u0006\u0010|\u001a\u00020/2\u0006\u0010m\u001a\u00020lH\u0017¢\u0006\u0004\b}\u0010\u007fJ\u001e\u0010\u0081\u0001\u001a\u00020\u00122\r\u0010(\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010p¢\u0006\u0005\b\u0081\u0001\u0010rJ\u001e\u0010\u0082\u0001\u001a\u00020\u00122\r\u0010(\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010p¢\u0006\u0005\b\u0082\u0001\u0010rJ\u001a\u0010\u0084\u0001\u001a\u00020\u00122\u0007\u0010\u0083\u0001\u001a\u00020/H\u0017¢\u0006\u0005\b\u0084\u0001\u0010~J\"\u0010\u0084\u0001\u001a\u00020\u00122\u0007\u0010\u0083\u0001\u001a\u00020/2\u0006\u0010m\u001a\u00020lH\u0017¢\u0006\u0005\b\u0084\u0001\u0010\u007fJ\u001c\u0010\u0087\u0001\u001a\u00020\u00122\b\u0010\u0086\u0001\u001a\u00030\u0085\u0001H\u0017¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u001e\u0010\u008a\u0001\u001a\u00020\u00122\r\u0010(\u001a\t\u0012\u0005\u0012\u00030\u0089\u00010p¢\u0006\u0005\b\u008a\u0001\u0010rJ\u001e\u0010\u008b\u0001\u001a\u00020\u00122\r\u0010(\u001a\t\u0012\u0005\u0012\u00030\u0089\u00010p¢\u0006\u0005\b\u008b\u0001\u0010rJ\u001e\u0010\u008d\u0001\u001a\u00020\u00122\r\u0010(\u001a\t\u0012\u0005\u0012\u00030\u008c\u00010p¢\u0006\u0005\b\u008d\u0001\u0010rJ\u001e\u0010\u008e\u0001\u001a\u00020\u00122\r\u0010(\u001a\t\u0012\u0005\u0012\u00030\u008c\u00010p¢\u0006\u0005\b\u008e\u0001\u0010rJ\u0019\u0010\u0090\u0001\u001a\u00020\u00122\u0007\u0010 \u001a\u00030\u008f\u0001¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u0019\u0010\u0092\u0001\u001a\u00020\u00122\u0007\u0010 \u001a\u00030\u008f\u0001¢\u0006\u0006\b\u0092\u0001\u0010\u0091\u0001J\u0011\u0010\u0093\u0001\u001a\u00020\u0012H\u0015¢\u0006\u0005\b\u0093\u0001\u0010\fJ\u0019\u0010\u0095\u0001\u001a\u00020\u00122\u0007\u0010(\u001a\u00030\u0094\u0001¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u0019\u0010\u0097\u0001\u001a\u00020\u00122\u0007\u0010(\u001a\u00030\u0094\u0001¢\u0006\u0006\b\u0097\u0001\u0010\u0096\u0001J\u0011\u0010\u0098\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u0098\u0001\u0010\fJ\u0011\u0010\u0099\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u0099\u0001\u0010\fJ\u001c\u0010\u009c\u0001\u001a\u00020\u00122\b\u0010\u009b\u0001\u001a\u00030\u009a\u0001H\u0003¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u0013\u0010\u009f\u0001\u001a\u00030\u009e\u0001H\u0002¢\u0006\u0006\b\u009f\u0001\u0010 \u0001R\u0018\u0010¢\u0001\u001a\u00030¡\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u0018\u0010¥\u0001\u001a\u00030¤\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u001f\u0010¨\u0001\u001a\u00030§\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b¨\u0001\u0010©\u0001\u0012\u0005\bª\u0001\u0010\fR\u001c\u0010¬\u0001\u001a\u0005\u0018\u00010«\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R\u0018\u0010®\u0001\u001a\u00030\u009e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R!\u0010µ\u0001\u001a\u00030°\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010`R\u0018\u0010·\u0001\u001a\u00030¶\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R\u001c\u0010¹\u0001\u001a\u00020d8\u0006¢\u0006\u0010\n\u0006\b¹\u0001\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001R$\u0010¾\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020l0p0½\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R$\u0010À\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0p0½\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010¿\u0001R$\u0010Á\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0p0½\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÁ\u0001\u0010¿\u0001R%\u0010Â\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0080\u00010p0½\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0001\u0010¿\u0001R%\u0010Ã\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0089\u00010p0½\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÃ\u0001\u0010¿\u0001R%\u0010Ä\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008c\u00010p0½\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÄ\u0001\u0010¿\u0001R\u001f\u0010Å\u0001\u001a\n\u0012\u0005\u0012\u00030\u0094\u00010½\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÅ\u0001\u0010¿\u0001R\u0019\u0010Æ\u0001\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0001\u0010Ç\u0001R\u0019\u0010È\u0001\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010Ç\u0001R!\u0010Í\u0001\u001a\u00030É\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÊ\u0001\u0010²\u0001\u001a\u0006\bË\u0001\u0010Ì\u0001R\u0019\u0010Î\u0001\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÎ\u0001\u0010Ç\u0001R!\u0010Ó\u0001\u001a\u00030Ï\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÐ\u0001\u0010²\u0001\u001a\u0006\bÑ\u0001\u0010Ò\u0001R!\u0010×\u0001\u001a\u00030\u009a\u00018FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\bÔ\u0001\u0010²\u0001\u001a\u0006\bÕ\u0001\u0010Ö\u0001R\u0018\u0010Ù\u0001\u001a\u0004\u0018\u00010\t8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bØ\u0001\u0010\u0018R\u0018\u0010Ý\u0001\u001a\u00030Ú\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÛ\u0001\u0010Ü\u0001R\u0018\u0010à\u0001\u001a\u00030«\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÞ\u0001\u0010ß\u0001R\u0018\u0010ä\u0001\u001a\u00030á\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\bâ\u0001\u0010ã\u0001R\u0018\u0010è\u0001\u001a\u00030å\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bæ\u0001\u0010ç\u0001R\u0015\u0010ì\u0001\u001a\u00030é\u00018F¢\u0006\b\u001a\u0006\bê\u0001\u0010ë\u0001¨\u0006ñ\u0001"}, m151d2 = {"Landroidx/activity/ComponentActivity;", "Landroidx/core/app/ComponentActivity;", "L飘花落叶言子楪世哲兰苏/飘花落叶言子楪世苏哲兰;", "Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;", "Landroidx/lifecycle/飘花落叶言子苏兰世楪哲;", "Landroidx/lifecycle/飘花落叶言子楪哲兰世苏;", "L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世兰哲苏;", "Landroidx/activity/飘花落叶言子世哲兰楪苏;", "L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世哲兰苏;", "", "Landroidx/core/content/飘花落叶言子楪世哲兰苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "contentLayoutId", "(I)V", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/飘花落叶言子楪兰苏哲世;", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "onRetainNonConfigurationInstance", "()Ljava/lang/Object;", "onRetainCustomNonConfigurationInstance", "layoutResID", "setContentView", "Landroid/view/View;", "view", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "addContentView", "initializeViewTreeOwners", "Landroid/content/Context;", "peekAvailableContext", "()Landroid/content/Context;", "L飘花落叶言子楪世哲兰苏/飘花落叶言子楪世哲苏兰;", "listener", "addOnContextAvailableListener", "(L飘花落叶言子楪世哲兰苏/飘花落叶言子楪世哲苏兰;)V", "removeOnContextAvailableListener", "featureId", "Landroid/view/Menu;", "menu", "", "onPreparePanel", "(ILandroid/view/View;Landroid/view/Menu;)Z", "onCreatePanelMenu", "(ILandroid/view/Menu;)Z", "Landroid/view/MenuItem;", "item", "onMenuItemSelected", "(ILandroid/view/MenuItem;)Z", "onPanelClosed", "(ILandroid/view/Menu;)V", "Landroidx/core/view/飘花落叶言子楪兰苏哲世;", "provider", "addMenuProvider", "(Landroidx/core/view/飘花落叶言子楪兰苏哲世;)V", "owner", "(Landroidx/core/view/飘花落叶言子楪兰苏哲世;Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;)V", "Landroidx/lifecycle/Lifecycle$State;", "state", "(Landroidx/core/view/飘花落叶言子楪兰苏哲世;Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;Landroidx/lifecycle/Lifecycle$State;)V", "removeMenuProvider", "invalidateMenu", "onBackPressed", "Landroid/content/Intent;", "intent", "requestCode", "startActivityForResult", "(Landroid/content/Intent;I)V", "options", "(Landroid/content/Intent;ILandroid/os/Bundle;)V", "Landroid/content/IntentSender;", "fillInIntent", "flagsMask", "flagsValues", "extraFlags", "startIntentSenderForResult", "(Landroid/content/IntentSender;ILandroid/content/Intent;III)V", "(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V", "resultCode", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "I", "O", "L飘花落叶言子楪世兰哲苏/飘花落叶言子楪世苏哲兰;", "contract", "L飘花落叶言子楪世兰苏哲/飘花落叶言子楪苏世兰哲;", "registry", "L飘花落叶言子楪世兰苏哲/飘花落叶言子楪世苏哲兰;", "callback", "L飘花落叶言子楪世兰苏哲/飘花落叶言子楪世苏兰哲;", "registerForActivityResult", "(L飘花落叶言子楪世兰哲苏/飘花落叶言子楪世苏哲兰;L飘花落叶言子楪世兰苏哲/飘花落叶言子楪苏世兰哲;L飘花落叶言子楪世兰苏哲/飘花落叶言子楪世苏哲兰;)L飘花落叶言子楪世兰苏哲/飘花落叶言子楪世苏兰哲;", "(L飘花落叶言子楪世兰哲苏/飘花落叶言子楪世苏哲兰;L飘花落叶言子楪世兰苏哲/飘花落叶言子楪世苏哲兰;)L飘花落叶言子楪世兰苏哲/飘花落叶言子楪世苏兰哲;", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Landroidx/core/util/飘花落叶言子楪世苏哲兰;", "addOnConfigurationChangedListener", "(Landroidx/core/util/飘花落叶言子楪世苏哲兰;)V", "removeOnConfigurationChangedListener", "level", "onTrimMemory", "addOnTrimMemoryListener", "removeOnTrimMemoryListener", "onNewIntent", "(Landroid/content/Intent;)V", "addOnNewIntentListener", "removeOnNewIntentListener", "isInMultiWindowMode", "onMultiWindowModeChanged", "(Z)V", "(ZLandroid/content/res/Configuration;)V", "L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世兰哲苏;", "addOnMultiWindowModeChangedListener", "removeOnMultiWindowModeChangedListener", "isInPictureInPictureMode", "onPictureInPictureModeChanged", "Landroid/app/PictureInPictureUiState;", "pipState", "onPictureInPictureUiStateChanged", "(Landroid/app/PictureInPictureUiState;)V", "L飘花落叶言子哲楪世苏兰/飘花落叶言子楪苏世兰哲;", "addOnPictureInPictureModeChangedListener", "removeOnPictureInPictureModeChangedListener", "L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏兰哲世;", "addOnPictureInPictureUiStateChangedListener", "removeOnPictureInPictureUiStateChangedListener", "L飘花落叶言子哲楪世苏兰/飘花落叶言子楪苏哲世兰;", "enterPictureInPictureMode", "(L飘花落叶言子哲楪世苏兰/飘花落叶言子楪苏哲世兰;)V", "setPictureInPictureParams", "onUserLeaveHint", "Ljava/lang/Runnable;", "addOnUserLeaveHintListener", "(Ljava/lang/Runnable;)V", "removeOnUserLeaveHintListener", "reportFullyDrawn", "ensureViewModelStore", "Landroidx/activity/飘花落叶言子世哲苏楪兰;", "dispatcher", "addObserverForBackInvoker", "(Landroidx/activity/飘花落叶言子世哲苏楪兰;)V", "Landroidx/activity/飘花落叶言子楪苏兰哲世;", "createFullyDrawnExecutor", "()Landroidx/activity/飘花落叶言子楪苏兰哲世;", "L飘花落叶言子楪世哲兰苏/飘花落叶言子楪世苏兰哲;", "contextAwareHelper", "L飘花落叶言子楪世哲兰苏/飘花落叶言子楪世苏兰哲;", "Landroidx/core/view/飘花落叶言子楪兰苏世哲;", "menuHostHelper", "Landroidx/core/view/飘花落叶言子楪兰苏世哲;", "L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世兰苏哲;", "savedStateRegistryController", "L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世兰苏哲;", "getSavedStateRegistryController$annotations", "Landroidx/lifecycle/飘花落叶言子苏兰楪哲世;", "_viewModelStore", "Landroidx/lifecycle/飘花落叶言子苏兰楪哲世;", "reportFullyDrawnExecutor", "Landroidx/activity/飘花落叶言子楪苏兰哲世;", "Landroidx/activity/飘花落叶言子世楪兰哲苏;", "fullyDrawnReporter$delegate", "Lkotlin/飘花落叶言子楪苏世哲兰;", "getFullyDrawnReporter", "()Landroidx/activity/飘花落叶言子世楪兰哲苏;", "fullyDrawnReporter", "Ljava/util/concurrent/atomic/AtomicInteger;", "nextLocalRequestCode", "Ljava/util/concurrent/atomic/AtomicInteger;", "activityResultRegistry", "L飘花落叶言子楪世兰苏哲/飘花落叶言子楪苏世兰哲;", "getActivityResultRegistry", "()L飘花落叶言子楪世兰苏哲/飘花落叶言子楪苏世兰哲;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onConfigurationChangedListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onTrimMemoryListeners", "onNewIntentListeners", "onMultiWindowModeChangedListeners", "onPictureInPictureModeChangedListeners", "onPictureInPictureUiStateChangedListeners", "onUserLeaveHintListeners", "dispatchingOnMultiWindowModeChanged", "Z", "dispatchingOnPictureInPictureModeChanged", "L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世苏哲兰;", "onBackPressedInput$delegate", "getOnBackPressedInput", "()L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世苏哲兰;", "onBackPressedInput", "hasPictureInPictureSystemFeature", "Landroidx/lifecycle/飘花落叶言子苏哲兰楪世;", "defaultViewModelProviderFactory$delegate", "getDefaultViewModelProviderFactory", "()Landroidx/lifecycle/飘花落叶言子苏哲兰楪世;", "defaultViewModelProviderFactory", "onBackPressedDispatcher$delegate", "getOnBackPressedDispatcher", "()Landroidx/activity/飘花落叶言子世哲苏楪兰;", "onBackPressedDispatcher", "getLastCustomNonConfigurationInstance", "lastCustomNonConfigurationInstance", "Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;", "getLifecycle", "()Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;", "lifecycle", "getViewModelStore", "()Landroidx/lifecycle/飘花落叶言子苏兰楪哲世;", "viewModelStore", "L飘花落叶言子哲兰苏世楪/飘花落叶言子楪世苏兰哲;", "getDefaultViewModelCreationExtras", "()L飘花落叶言子哲兰苏世楪/飘花落叶言子楪世苏兰哲;", "defaultViewModelCreationExtras", "L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世哲苏兰;", "getNavigationEventDispatcher", "()L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世哲苏兰;", "navigationEventDispatcher", "L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世哲兰苏;", "getSavedStateRegistry", "()L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世哲兰苏;", "savedStateRegistry", "Companion", "androidx/activity/飘花落叶言子楪苏兰世哲", "androidx/activity/飘花落叶言子楪哲世兰苏", "androidx/activity/飘花落叶言子楪苏哲兰世", "activity"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
public class ComponentActivity extends androidx.core.app.ComponentActivity implements InterfaceC8562, InterfaceC3254, InterfaceC3238, InterfaceC8366, InterfaceC0865, InterfaceC8378, InterfaceC2998 {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final C0906 Companion = new C0906();
    private C3256 _viewModelStore;
    private final AbstractC8558 activityResultRegistry;
    private int contentLayoutId;
    private final C8561 contextAwareHelper;

    /* JADX INFO: renamed from: defaultViewModelProviderFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC6016 defaultViewModelProviderFactory;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;

    /* JADX INFO: renamed from: fullyDrawnReporter$delegate, reason: from kotlin metadata */
    private final InterfaceC6016 fullyDrawnReporter;
    private boolean hasPictureInPictureSystemFeature;
    private final C3085 menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;

    /* JADX INFO: renamed from: onBackPressedDispatcher$delegate, reason: from kotlin metadata */
    private final InterfaceC6016 onBackPressedDispatcher;

    /* JADX INFO: renamed from: onBackPressedInput$delegate, reason: from kotlin metadata */
    private final InterfaceC6016 onBackPressedInput;
    private final CopyOnWriteArrayList<InterfaceC3021> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC3021> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC3021> onNewIntentListeners;
    private final CopyOnWriteArrayList<InterfaceC3021> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC3021> onPictureInPictureUiStateChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC3021> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final InterfaceExecutorC0904 reportFullyDrawnExecutor;
    private final C8367 savedStateRegistryController;

    public ComponentActivity() {
        this.contextAwareHelper = new C8561();
        final int i = 1;
        this.menuHostHelper = new C3085(new RunnableC0886(this, i));
        int i2 = 4;
        C8367 c8367 = new C8367(new C8331(this, new C8171(this, i2)));
        this.savedStateRegistryController = c8367;
        this.reportFullyDrawnExecutor = createFullyDrawnExecutor();
        this.fullyDrawnReporter = AbstractC6019.m10773(new C0883(this, i));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new C0897(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureUiStateChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        this.onBackPressedInput = AbstractC6019.m10773(new C0883(this, 2));
        if (getLifecycle() == null) {
            C6755.m11870("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        final int i3 = 0;
        getLifecycle().mo5063(new InterfaceC3213(this) { // from class: androidx.activity.飘花落叶言子楪苏世哲兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ ComponentActivity f457;

            {
                this.f457 = this;
            }

            @Override // androidx.lifecycle.InterfaceC3213
            /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
            public final void mo578(InterfaceC3221 interfaceC3221, Lifecycle$Event lifecycle$Event) {
                int i4 = i3;
                ComponentActivity componentActivity = this.f457;
                switch (i4) {
                    case 0:
                        ComponentActivity._init_$lambda$1(componentActivity, interfaceC3221, lifecycle$Event);
                        break;
                    default:
                        ComponentActivity._init_$lambda$2(componentActivity, interfaceC3221, lifecycle$Event);
                        break;
                }
            }
        });
        getLifecycle().mo5063(new InterfaceC3213(this) { // from class: androidx.activity.飘花落叶言子楪苏世哲兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ ComponentActivity f457;

            {
                this.f457 = this;
            }

            @Override // androidx.lifecycle.InterfaceC3213
            /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
            public final void mo578(InterfaceC3221 interfaceC3221, Lifecycle$Event lifecycle$Event) {
                int i4 = i;
                ComponentActivity componentActivity = this.f457;
                switch (i4) {
                    case 0:
                        ComponentActivity._init_$lambda$1(componentActivity, interfaceC3221, lifecycle$Event);
                        break;
                    default:
                        ComponentActivity._init_$lambda$2(componentActivity, interfaceC3221, lifecycle$Event);
                        break;
                }
            }
        });
        getLifecycle().mo5063(new C8371(this, i));
        c8367.m13318();
        AbstractC3268.m5090(this);
        getSavedStateRegistry().m13320(ACTIVITY_RESULT_TAG, new InterfaceC8369() { // from class: androidx.activity.飘花落叶言子楪苏世兰哲
            @Override // p158.InterfaceC8369
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
            public final Bundle mo725() {
                return ComponentActivity._init_$lambda$3(this.f456);
            }
        });
        addOnContextAvailableListener(new InterfaceC8560() { // from class: androidx.activity.飘花落叶言子楪苏哲世兰
            @Override // p188.InterfaceC8560
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
            public final void mo726(ComponentActivity componentActivity) {
                ComponentActivity._init_$lambda$4(this.f461, componentActivity);
            }
        });
        this.defaultViewModelProviderFactory = AbstractC6019.m10773(new C0883(this, 3));
        this.onBackPressedDispatcher = AbstractC6019.m10773(new C0883(this, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(ComponentActivity componentActivity, InterfaceC3221 interfaceC3221, Lifecycle$Event lifecycle$Event) {
        Window window;
        View viewPeekDecorView;
        interfaceC3221.getClass();
        lifecycle$Event.getClass();
        if (lifecycle$Event != Lifecycle$Event.ON_STOP || (window = componentActivity.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(ComponentActivity componentActivity, InterfaceC3221 interfaceC3221, Lifecycle$Event lifecycle$Event) {
        interfaceC3221.getClass();
        lifecycle$Event.getClass();
        if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
            componentActivity.contextAwareHelper.f21335 = null;
            if (!componentActivity.isChangingConfigurations()) {
                componentActivity.getViewModelStore().m5079();
            }
            ViewTreeObserverOnDrawListenerC0895 viewTreeObserverOnDrawListenerC0895 = (ViewTreeObserverOnDrawListenerC0895) componentActivity.reportFullyDrawnExecutor;
            ComponentActivity componentActivity2 = viewTreeObserverOnDrawListenerC0895.f443;
            componentActivity2.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC0895);
            componentActivity2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0895);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle _init_$lambda$3(ComponentActivity componentActivity) {
        Bundle bundle = new Bundle();
        AbstractC8558 abstractC8558 = componentActivity.activityResultRegistry;
        abstractC8558.getClass();
        LinkedHashMap linkedHashMap = abstractC8558.f21329;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(abstractC8558.f21327));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(abstractC8558.f21331));
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(ComponentActivity componentActivity, Context context) {
        context.getClass();
        Bundle bundleM13322 = componentActivity.getSavedStateRegistry().m13322(ACTIVITY_RESULT_TAG);
        if (bundleM13322 != null) {
            AbstractC8558 abstractC8558 = componentActivity.activityResultRegistry;
            LinkedHashMap linkedHashMap = abstractC8558.f21329;
            LinkedHashMap linkedHashMap2 = abstractC8558.f21330;
            Bundle bundle = abstractC8558.f21331;
            ArrayList<Integer> integerArrayList = bundleM13322.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleM13322.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleM13322.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                abstractC8558.f21327.addAll(stringArrayList2);
            }
            Bundle bundle2 = bundleM13322.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        AbstractC5220.m9449(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                num2.getClass();
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i);
                str2.getClass();
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                abstractC8558.f21329.put(str3, Integer.valueOf(iIntValue));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addObserverForBackInvoker(final C0870 dispatcher) {
        getLifecycle().mo5063(new InterfaceC3213(this) { // from class: androidx.activity.飘花落叶言子楪世兰苏哲

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ ComponentActivity f418;

            {
                this.f418 = this;
            }

            @Override // androidx.lifecycle.InterfaceC3213
            /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
            public final void mo578(InterfaceC3221 interfaceC3221, Lifecycle$Event lifecycle$Event) {
                ComponentActivity.addObserverForBackInvoker$lambda$0(dispatcher, this.f418, interfaceC3221, lifecycle$Event);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addObserverForBackInvoker$lambda$0(C0870 c0870, ComponentActivity componentActivity, InterfaceC3221 interfaceC3221, Lifecycle$Event lifecycle$Event) {
        interfaceC3221.getClass();
        lifecycle$Event.getClass();
        if (lifecycle$Event == Lifecycle$Event.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = componentActivity.getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            c0870.m586(onBackInvokedDispatcher);
        }
    }

    private final InterfaceExecutorC0904 createFullyDrawnExecutor() {
        return new ViewTreeObserverOnDrawListenerC0895(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3261 defaultViewModelProviderFactory_delegate$lambda$0(ComponentActivity componentActivity) {
        return new C3261(componentActivity.getApplication(), componentActivity, componentActivity.getIntent() != null ? componentActivity.getIntent().getExtras() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureViewModelStore() {
        if (this._viewModelStore == null) {
            C0903 c0903 = (C0903) getLastNonConfigurationInstance();
            if (c0903 != null) {
                this._viewModelStore = c0903.f459;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new C3256();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0871 fullyDrawnReporter_delegate$lambda$0(ComponentActivity componentActivity) {
        return new C0871(componentActivity.reportFullyDrawnExecutor, new C0883(componentActivity, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6008 fullyDrawnReporter_delegate$lambda$0$0(ComponentActivity componentActivity) {
        componentActivity.reportFullyDrawn();
        return C6008.f15084;
    }

    private final C8381 getOnBackPressedInput() {
        return (C8381) this.onBackPressedInput.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0870 onBackPressedDispatcher_delegate$lambda$0(final ComponentActivity componentActivity) {
        final C0870 c0870 = new C0870(new RunnableC0886(componentActivity, 0));
        if (Build.VERSION.SDK_INT >= 33) {
            if (!AbstractC5227.m9466(Looper.myLooper(), Looper.getMainLooper())) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.飘花落叶言子楪世哲兰苏
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f421.addObserverForBackInvoker(c0870);
                    }
                });
                return c0870;
            }
            componentActivity.addObserverForBackInvoker(c0870);
        }
        return c0870;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBackPressedDispatcher_delegate$lambda$0$0(ComponentActivity componentActivity) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!AbstractC5227.m9466(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!AbstractC5227.m9466(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8381 onBackPressedInput_delegate$lambda$0(ComponentActivity componentActivity) {
        C8381 c8381 = new C8381();
        componentActivity.getNavigationEventDispatcher().m13345(c8381);
        return c8381;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams params) {
        initializeViewTreeOwners();
        InterfaceExecutorC0904 interfaceExecutorC0904 = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((ViewTreeObserverOnDrawListenerC0895) interfaceExecutorC0904).m694(decorView);
        super.addContentView(view, params);
    }

    public void addMenuProvider(final InterfaceC3086 provider, InterfaceC3221 owner) {
        provider.getClass();
        owner.getClass();
        final C3085 c3085 = this.menuHostHelper;
        c3085.f6904.add(provider);
        c3085.f6905.run();
        AbstractC3235 lifecycle = owner.getLifecycle();
        HashMap map = c3085.f6903;
        C3081 c3081 = (C3081) map.remove(provider);
        if (c3081 != null) {
            c3081.f6895.mo5062(c3081.f6894);
            c3081.f6894 = null;
        }
        map.put(provider, new C3081(lifecycle, new InterfaceC3213() { // from class: androidx.core.view.飘花落叶言子楪兰世苏哲
            @Override // androidx.lifecycle.InterfaceC3213
            /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
            public final void mo578(InterfaceC3221 interfaceC3221, Lifecycle$Event lifecycle$Event) {
                C3085 c30852 = c3085;
                c30852.getClass();
                if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
                    c30852.m4770(provider);
                }
            }
        }));
    }

    @Override // androidx.core.content.InterfaceC2998
    public final void addOnConfigurationChangedListener(InterfaceC3021 listener) {
        listener.getClass();
        this.onConfigurationChangedListeners.add(listener);
    }

    @Override // p188.InterfaceC8562
    public final void addOnContextAvailableListener(InterfaceC8560 listener) {
        listener.getClass();
        this.contextAwareHelper.addOnContextAvailableListener(listener);
    }

    public final void addOnMultiWindowModeChangedListener(InterfaceC3021 listener) {
        listener.getClass();
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    public final void addOnNewIntentListener(InterfaceC3021 listener) {
        listener.getClass();
        this.onNewIntentListeners.add(listener);
    }

    public final void addOnPictureInPictureModeChangedListener(InterfaceC3021 listener) {
        listener.getClass();
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    public final void addOnPictureInPictureUiStateChangedListener(InterfaceC3021 listener) {
        listener.getClass();
        this.onPictureInPictureUiStateChangedListeners.add(listener);
    }

    public final void addOnTrimMemoryListener(InterfaceC3021 listener) {
        listener.getClass();
        this.onTrimMemoryListeners.add(listener);
    }

    public final void addOnUserLeaveHintListener(Runnable listener) {
        listener.getClass();
        this.onUserLeaveHintListeners.add(listener);
    }

    public final void enterPictureInPictureMode(AbstractC8488 params) {
        throw null;
    }

    public final AbstractC8558 getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.InterfaceC3238
    public AbstractC8465 getDefaultViewModelCreationExtras() {
        C8464 c8464 = new C8464(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c8464.f21069;
        if (application != null) {
            linkedHashMap.put(C3257.f7413, getApplication());
        }
        linkedHashMap.put(AbstractC3268.f7445, this);
        linkedHashMap.put(AbstractC3268.f7444, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(AbstractC3268.f7443, extras);
        }
        return c8464;
    }

    @Override // androidx.lifecycle.InterfaceC3238
    public InterfaceC3260 getDefaultViewModelProviderFactory() {
        return (InterfaceC3260) this.defaultViewModelProviderFactory.getValue();
    }

    public C0871 getFullyDrawnReporter() {
        return (C0871) this.fullyDrawnReporter.getValue();
    }

    @InterfaceC6001
    public Object getLastCustomNonConfigurationInstance() {
        C0903 c0903 = (C0903) getLastNonConfigurationInstance();
        if (c0903 != null) {
            return c0903.f460;
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.InterfaceC3221
    public AbstractC3235 getLifecycle() {
        return super.getLifecycle();
    }

    @Override // p160.InterfaceC8378
    public C8379 getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().m587().f405;
    }

    @Override // androidx.activity.InterfaceC0865
    public final C0870 getOnBackPressedDispatcher() {
        return (C0870) this.onBackPressedDispatcher.getValue();
    }

    @Override // p158.InterfaceC8366
    public final C8368 getSavedStateRegistry() {
        return this.savedStateRegistryController.f20763;
    }

    @Override // androidx.lifecycle.InterfaceC3254
    public C3256 getViewModelStore() {
        if (getApplication() == null) {
            C6755.m11870("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        ensureViewModelStore();
        C3256 c3256 = this._viewModelStore;
        c3256.getClass();
        return c3256;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(C0328R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(C0328R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(C0328R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(C0328R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(C0328R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(C0328R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @InterfaceC6001
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (this.activityResultRegistry.m13606(requestCode, resultCode, data)) {
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // android.app.Activity
    @InterfaceC6001
    public void onBackPressed() {
        getOnBackPressedInput().m13346();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        newConfig.getClass();
        super.onConfigurationChanged(newConfig);
        Iterator<InterfaceC3021> it = this.onConfigurationChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        this.savedStateRegistryController.m13317(savedInstanceState);
        C8561 c8561 = this.contextAwareHelper;
        c8561.getClass();
        c8561.f21335 = this;
        Iterator it = c8561.f21336.iterator();
        while (it.hasNext()) {
            ((InterfaceC8560) it.next()).mo726(this);
        }
        super.onCreate(savedInstanceState);
        int i = FragmentC3266.f7441;
        AbstractC3269.m5096(this);
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
        C3085 c3085 = this.menuHostHelper;
        getMenuInflater();
        Iterator it = c3085.f6904.iterator();
        while (it.hasNext()) {
            ((C3158) ((InterfaceC3086) it.next())).f7171.m4967();
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
            return this.menuHostHelper.m4771();
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
            Iterator<InterfaceC3021> it = this.onMultiWindowModeChangedListeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().accept(new C8479(isInMultiWindowMode));
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
        Iterator<InterfaceC3021> it = this.onNewIntentListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int featureId, Menu menu) {
        menu.getClass();
        Iterator it = this.menuHostHelper.f6904.iterator();
        while (it.hasNext()) {
            ((C3158) ((InterfaceC3086) it.next())).f7171.m4961();
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
            Iterator<InterfaceC3021> it = this.onPictureInPictureModeChangedListeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().accept(new C8485(isInPictureInPictureMode));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureUiStateChanged(PictureInPictureUiState pipState) {
        C7790 c7790;
        pipState.getClass();
        super.onPictureInPictureUiStateChanged(pipState);
        int i = Build.VERSION.SDK_INT;
        int i2 = 4;
        if (i >= 35) {
            pipState.isStashed();
            pipState.isTransitioningToPip();
            c7790 = new C7790(i2);
        } else if (i >= 31) {
            pipState.isStashed();
            c7790 = new C7790(i2);
        } else {
            c7790 = new C7790(i2);
        }
        Iterator<InterfaceC3021> it = this.onPictureInPictureUiStateChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(c7790);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int featureId, View view, Menu menu) {
        menu.getClass();
        if (featureId != 0) {
            return true;
        }
        super.onPreparePanel(featureId, view, menu);
        Iterator it = this.menuHostHelper.f6904.iterator();
        while (it.hasNext()) {
            ((C3158) ((InterfaceC3086) it.next())).f7171.m4951();
        }
        return true;
    }

    @Override // android.app.Activity
    @InterfaceC6001
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        permissions.getClass();
        grantResults.getClass();
        if (this.activityResultRegistry.m13606(requestCode, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @InterfaceC6001
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0903 c0903;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        C3256 c3256 = this._viewModelStore;
        if (c3256 == null && (c0903 = (C0903) getLastNonConfigurationInstance()) != null) {
            c3256 = c0903.f459;
        }
        if (c3256 == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C0903 c09032 = new C0903();
        c09032.f460 = objOnRetainCustomNonConfigurationInstance;
        c09032.f459 = c3256;
        return c09032;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        outState.getClass();
        if (getLifecycle() instanceof C3219) {
            AbstractC3235 lifecycle = getLifecycle();
            lifecycle.getClass();
            ((C3219) lifecycle).m5065(Lifecycle$State.CREATED);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.m13316(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        Iterator<InterfaceC3021> it = this.onTrimMemoryListeners.iterator();
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
        return this.contextAwareHelper.f21335;
    }

    public final <I, O> AbstractC8556 registerForActivityResult(final AbstractC8551 contract, final AbstractC8558 registry, final InterfaceC8557 callback) {
        contract.getClass();
        registry.getClass();
        callback.getClass();
        final String str = "activity_rq#" + this.nextLocalRequestCode.getAndIncrement();
        LinkedHashMap linkedHashMap = registry.f21328;
        AbstractC3235 lifecycle = getLifecycle();
        if (((C3219) lifecycle).f7364.isAtLeast(Lifecycle$State.STARTED)) {
            StringBuilder sb = new StringBuilder("LifecycleOwner ");
            sb.append(this);
            Lifecycle$State lifecycle$State = ((C3219) lifecycle).f7364;
            sb.append(" is attempting to register while current state is ");
            sb.append(lifecycle$State);
            sb.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb.toString().toString());
        }
        registry.m13604(str);
        C8553 c8553 = (C8553) linkedHashMap.get(str);
        if (c8553 == null) {
            c8553 = new C8553(lifecycle);
        }
        InterfaceC3213 interfaceC3213 = new InterfaceC3213() { // from class: 飘花落叶言子楪世兰苏哲.飘花落叶言子楪世哲苏兰
            @Override // androidx.lifecycle.InterfaceC3213
            /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
            public final void mo578(InterfaceC3221 interfaceC3221, Lifecycle$Event lifecycle$Event) {
                AbstractC8558 abstractC8558 = registry;
                LinkedHashMap linkedHashMap2 = abstractC8558.f21326;
                Lifecycle$Event lifecycle$Event2 = Lifecycle$Event.ON_START;
                String str2 = str;
                if (lifecycle$Event2 != lifecycle$Event) {
                    if (Lifecycle$Event.ON_STOP == lifecycle$Event) {
                        linkedHashMap2.remove(str2);
                        return;
                    } else {
                        if (Lifecycle$Event.ON_DESTROY == lifecycle$Event) {
                            abstractC8558.m13603(str2);
                            return;
                        }
                        return;
                    }
                }
                Bundle bundle = abstractC8558.f21331;
                LinkedHashMap linkedHashMap3 = abstractC8558.f21325;
                AbstractC8551 abstractC8551 = contract;
                InterfaceC8557 interfaceC8557 = callback;
                linkedHashMap2.put(str2, new C8554(abstractC8551, interfaceC8557));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    interfaceC8557.mo4984(obj);
                }
                ActivityResult activityResult = (ActivityResult) AbstractC5894.m10606(str2, bundle);
                if (activityResult != null) {
                    bundle.remove(str2);
                    interfaceC8557.mo4984(abstractC8551.mo4978(activityResult.f368, activityResult.f369));
                }
            }
        };
        c8553.f21318.mo5063(interfaceC3213);
        c8553.f21317.add(interfaceC3213);
        linkedHashMap.put(str, c8553);
        return new C8552();
    }

    public void removeMenuProvider(InterfaceC3086 provider) {
        provider.getClass();
        this.menuHostHelper.m4770(provider);
    }

    @Override // androidx.core.content.InterfaceC2998
    public final void removeOnConfigurationChangedListener(InterfaceC3021 listener) {
        listener.getClass();
        this.onConfigurationChangedListeners.remove(listener);
    }

    @Override // p188.InterfaceC8562
    public final void removeOnContextAvailableListener(InterfaceC8560 listener) {
        listener.getClass();
        this.contextAwareHelper.removeOnContextAvailableListener(listener);
    }

    public final void removeOnMultiWindowModeChangedListener(InterfaceC3021 listener) {
        listener.getClass();
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    public final void removeOnNewIntentListener(InterfaceC3021 listener) {
        listener.getClass();
        this.onNewIntentListeners.remove(listener);
    }

    public final void removeOnPictureInPictureModeChangedListener(InterfaceC3021 listener) {
        listener.getClass();
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    public final void removeOnPictureInPictureUiStateChangedListener(InterfaceC3021 listener) {
        listener.getClass();
        this.onPictureInPictureUiStateChangedListeners.remove(listener);
    }

    public final void removeOnTrimMemoryListener(InterfaceC3021 listener) {
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
            if (AbstractC9004.m14196()) {
                AbstractC9004.m14210("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().m590();
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int layoutResID) {
        initializeViewTreeOwners();
        InterfaceExecutorC0904 interfaceExecutorC0904 = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((ViewTreeObserverOnDrawListenerC0895) interfaceExecutorC0904).m694(decorView);
        super.setContentView(layoutResID);
    }

    public final void setPictureInPictureParams(AbstractC8488 params) {
        throw null;
    }

    @Override // android.app.Activity
    @InterfaceC6001
    public void startActivityForResult(Intent intent, int requestCode) {
        intent.getClass();
        super.startActivityForResult(intent, requestCode);
    }

    @Override // android.app.Activity
    @InterfaceC6001
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) throws IntentSender.SendIntentException {
        intent.getClass();
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    @Override // android.app.Activity
    @InterfaceC6001
    public void startActivityForResult(Intent intent, int requestCode, Bundle options) {
        intent.getClass();
        super.startActivityForResult(intent, requestCode, options);
    }

    @Override // android.app.Activity
    @InterfaceC6001
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) throws IntentSender.SendIntentException {
        intent.getClass();
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    private static /* synthetic */ void getSavedStateRegistryController$annotations() {
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        InterfaceExecutorC0904 interfaceExecutorC0904 = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((ViewTreeObserverOnDrawListenerC0895) interfaceExecutorC0904).m694(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        initializeViewTreeOwners();
        InterfaceExecutorC0904 interfaceExecutorC0904 = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((ViewTreeObserverOnDrawListenerC0895) interfaceExecutorC0904).m694(decorView);
        super.setContentView(view, params);
    }

    @Override // android.app.Activity
    @InterfaceC6001
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<InterfaceC3021> it = this.onMultiWindowModeChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(new C8479(isInMultiWindowMode));
        }
    }

    @Override // android.app.Activity
    @InterfaceC6001
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<InterfaceC3021> it = this.onPictureInPictureModeChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(new C8485(isInPictureInPictureMode));
        }
    }

    public void addMenuProvider(InterfaceC3086 provider) {
        provider.getClass();
        C3085 c3085 = this.menuHostHelper;
        c3085.f6904.add(provider);
        c3085.f6905.run();
    }

    public void addMenuProvider(InterfaceC3086 provider, InterfaceC3221 owner, Lifecycle$State state) {
        provider.getClass();
        owner.getClass();
        state.getClass();
        C3085 c3085 = this.menuHostHelper;
        c3085.getClass();
        AbstractC3235 lifecycle = owner.getLifecycle();
        HashMap map = c3085.f6903;
        C3081 c3081 = (C3081) map.remove(provider);
        if (c3081 != null) {
            c3081.f6895.mo5062(c3081.f6894);
            c3081.f6894 = null;
        }
        map.put(provider, new C3081(lifecycle, new C3090(0, state, c3085, provider)));
    }

    public final <I, O> AbstractC8556 registerForActivityResult(AbstractC8551 contract, InterfaceC8557 callback) {
        contract.getClass();
        callback.getClass();
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }

    public ComponentActivity(int i) {
        this();
        this.contentLayoutId = i;
    }
}
