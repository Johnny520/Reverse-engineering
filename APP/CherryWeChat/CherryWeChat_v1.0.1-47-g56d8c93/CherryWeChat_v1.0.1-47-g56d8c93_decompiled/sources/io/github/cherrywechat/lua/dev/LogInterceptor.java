package io.github.cherrywechat.lua.dev;

import android.annotation.SuppressLint;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p000.AbstractC0295Gu;

/* JADX INFO: loaded from: classes.dex */
public final class LogInterceptor {

    @SuppressLint({"StaticFieldLeak"})
    private static CherryDevServer devServer;
    private static volatile boolean interceptSystemLog;
    private static final String TAG = AbstractC0295Gu.m625r(-327972292655157L);
    public static final String LEVEL_DEBUG = AbstractC0295Gu.m625r(-328036717164597L);
    public static final String LEVEL_INFO = AbstractC0295Gu.m625r(-328062486968373L);
    public static final String LEVEL_WARN = AbstractC0295Gu.m625r(-328083961804853L);
    public static final String LEVEL_ERROR = AbstractC0295Gu.m625r(-328105436641333L);
    public static final String LEVEL_VERBOSE = AbstractC0295Gu.m625r(-328131206445109L);
    public static final LogInterceptor INSTANCE = new LogInterceptor();
    private static final List<LogListener> listeners = new ArrayList();
    private static final Set<String> filterTags = new LinkedHashSet();

    public interface LogListener {
        void onLog(String str, String str2, String str3);
    }

    private LogInterceptor() {
    }

    private final void broadcast(String str, String str2, String str3) {
        Set<String> set = filterTags;
        if (set.isEmpty() || set.contains(str2)) {
            CherryDevServer cherryDevServer = devServer;
            if (cherryDevServer != null) {
                cherryDevServer.broadcastLog(str, str2, str3);
            }
            Iterator<T> it = listeners.iterator();
            while (it.hasNext()) {
                try {
                    ((LogListener) it.next()).onLog(str, str2, str3);
                } catch (Exception unused) {
                }
            }
        }
    }

    public static /* synthetic */ void e$default(LogInterceptor logInterceptor, String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        logInterceptor.m3527e(str, str2, th);
    }

    public final void addFilterTag(String str) {
        AbstractC0295Gu.m625r(-329033149577269L);
        filterTags.add(str);
    }

    public final void addListener(LogListener logListener) {
        AbstractC0295Gu.m625r(-330605107607605L);
        List<LogListener> list = listeners;
        if (list.contains(logListener)) {
            return;
        }
        list.add(logListener);
    }

    public final void clearFilterTags() {
        filterTags.clear();
    }

    /* JADX INFO: renamed from: d */
    public final void m3526d(String str, String str2) {
        AbstractC0295Gu.m625r(-329067509315637L);
        AbstractC0295Gu.m625r(-329084689184821L);
        broadcast(AbstractC0295Gu.m625r(-329119048923189L), str, str2);
    }

    /* JADX INFO: renamed from: e */
    public final void m3527e(String str, String str2, Throwable th) {
        AbstractC0295Gu.m625r(-329290847615029L);
        AbstractC0295Gu.m625r(-328758271670325L);
        if (th == null) {
            broadcast(AbstractC0295Gu.m625r(-328818401212469L), str, str2);
            return;
        }
        String strM625r = AbstractC0295Gu.m625r(-328792631408693L);
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append('\n');
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        sb.append(stringWriter.toString());
        broadcast(strM625r, str, sb.toString());
    }

    public final boolean getInterceptSystemLog() {
        return interceptSystemLog;
    }

    /* JADX INFO: renamed from: i */
    public final void m3528i(String str, String str2) {
        AbstractC0295Gu.m625r(-329144818726965L);
        AbstractC0295Gu.m625r(-329161998596149L);
        broadcast(AbstractC0295Gu.m625r(-329196358334517L), str, str2);
    }

    public final boolean isRegistered() {
        return devServer != null;
    }

    public final void print(String str) {
        AbstractC0295Gu.m625r(-328930070362165L);
        AbstractC0295Gu.m625r(-328964430100533L);
        CherryDevServer cherryDevServer = devServer;
        if ((cherryDevServer != null ? cherryDevServer.getConnectionCount() : 0) == 0) {
            AbstractC0295Gu.m625r(-329007379773493L);
            AbstractC0295Gu.m625r(-329600085260341L);
        }
        broadcast(AbstractC0295Gu.m625r(-329668804737077L), AbstractC0295Gu.m625r(-329690279573557L), str);
    }

    public final void register(CherryDevServer cherryDevServer) {
        AbstractC0295Gu.m625r(-330764021397557L);
        devServer = cherryDevServer;
        AbstractC0295Gu.m625r(-330794086168629L);
        AbstractC0295Gu.m625r(-330858510678069L);
    }

    public final void removeFilterTag(String str) {
        AbstractC0295Gu.m625r(-329050329446453L);
        filterTags.remove(str);
    }

    public final void removeListener(LogListener logListener) {
        AbstractC0295Gu.m625r(-330643762313269L);
        listeners.remove(logListener);
    }

    public final void result(String str, boolean z, String str2) {
        String string;
        String strM625r;
        AbstractC0295Gu.m625r(-329716049377333L);
        String strM625r2 = AbstractC0295Gu.m625r(z ? -329763294017589L : -329784768854069L);
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC0295Gu.m625r(-329810538657845L));
            sb.append(str);
            sb.append(AbstractC0295Gu.m625r(-329849193363509L));
            if (str2 == null || (strM625r = AbstractC0295Gu.m625r(-329402516764725L).concat(str2)) == null) {
                strM625r = AbstractC0295Gu.m625r(-329415401666613L);
            }
            sb.append(strM625r);
            string = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(AbstractC0295Gu.m625r(-329419696633909L));
            sb2.append(str);
            sb2.append(AbstractC0295Gu.m625r(-329458351339573L));
            if (str2 == null) {
                str2 = AbstractC0295Gu.m625r(-329505595979829L);
            }
            sb2.append(str2);
            string = sb2.toString();
        }
        broadcast(strM625r2, AbstractC0295Gu.m625r(-329565725521973L), string);
    }

    public final void setInterceptSystemLog(boolean z) {
        interceptSystemLog = z;
    }

    public final void unregister() {
        devServer = null;
        AbstractC0295Gu.m625r(-330420424013877L);
        AbstractC0295Gu.m625r(-330484848523317L);
    }

    /* JADX INFO: renamed from: v */
    public final void m3529v(String str, String str2) {
        AbstractC0295Gu.m625r(-328844171016245L);
        AbstractC0295Gu.m625r(-328861350885429L);
        broadcast(AbstractC0295Gu.m625r(-328895710623797L), str, str2);
    }

    /* JADX INFO: renamed from: w */
    public final void m3530w(String str, String str2) {
        AbstractC0295Gu.m625r(-329217833170997L);
        AbstractC0295Gu.m625r(-329235013040181L);
        broadcast(AbstractC0295Gu.m625r(-329269372778549L), str, str2);
    }
}
