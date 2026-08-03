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
    public static final LogInterceptor INSTANCE = null;
    public static final String LEVEL_DEBUG = null;
    public static final String LEVEL_ERROR = null;
    public static final String LEVEL_INFO = null;
    public static final String LEVEL_VERBOSE = null;
    public static final String LEVEL_WARN = null;
    private static final String TAG = null;

    @SuppressLint({"StaticFieldLeak"})
    private static CherryDevServer devServer;
    private static final Set<String> filterTags = null;
    private static volatile boolean interceptSystemLog;
    private static final List<LogListener> listeners = null;

    public interface LogListener {
        void onLog(String r1, String r2, String r3);
    }

    static {
        TAG = AbstractC0295Gu.m625r(-327972292655157L);
        LEVEL_DEBUG = AbstractC0295Gu.m625r(-328036717164597L);
        LEVEL_INFO = AbstractC0295Gu.m625r(-328062486968373L);
        LEVEL_WARN = AbstractC0295Gu.m625r(-328083961804853L);
        LEVEL_ERROR = AbstractC0295Gu.m625r(-328105436641333L);
        LEVEL_VERBOSE = AbstractC0295Gu.m625r(-328131206445109L);
        INSTANCE = new LogInterceptor();
        listeners = new ArrayList();
        filterTags = new LinkedHashSet();
    }

    private LogInterceptor() {
    }

    private final void broadcast(String r3, String r4, String r5) {
        Set<String> r0 = filterTags;
        if (r0.isEmpty() == false) goto L5;
    L7:
        CherryDevServer r02 = devServer;
        if (r02 == null) goto L10;
        r02.broadcastLog(r3, r4, r5);
    L10:
        Iterator<T> r03 = listeners.iterator();
    L12:
        if (r03.hasNext() == false) goto L23;
        ((LogListener) r03.next()).onLog(r3, r4, r5);     // Catch: Exception -> L17
        goto L12
    L23:
        return;
    L5:
        if (r0.contains(r4) == true) goto L7;
    }

    public static /* synthetic */ void e$default(LogInterceptor r0, String r1, String r2, Throwable r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = null;
    L5:
        r0.m3527e(r1, r2, r3);
    }

    public final void addFilterTag(String r3) {
        AbstractC0295Gu.m625r(-329033149577269L);
        filterTags.add(r3);
    }

    public final void addListener(LogListener r3) {
        AbstractC0295Gu.m625r(-330605107607605L);
        List<LogListener> r0 = listeners;
        if (r0.contains(r3) == true) goto L6;
        r0.add(r3);
        return;
    }

    public final void clearFilterTags() {
        filterTags.clear();
    }

    /* JADX INFO: renamed from: d */
    public final void m3526d(String r3, String r4) {
        AbstractC0295Gu.m625r(-329067509315637L);
        AbstractC0295Gu.m625r(-329084689184821L);
        broadcast(AbstractC0295Gu.m625r(-329119048923189L), r3, r4);
    }

    /* JADX INFO: renamed from: e */
    public final void m3527e(String r4, String r5, Throwable r6) {
        AbstractC0295Gu.m625r(-329290847615029L);
        AbstractC0295Gu.m625r(-328758271670325L);
        if (r6 == null) goto L6;
        String r0 = AbstractC0295Gu.m625r(-328792631408693L);
        StringBuilder r1 = new StringBuilder();
        r1.append(r5);
        r1.append('\n');
        StringWriter r52 = new StringWriter();
        PrintWriter r2 = new PrintWriter(r52);
        r6.printStackTrace(r2);
        r2.flush();
        r1.append(r52.toString());
        broadcast(r0, r4, r1.toString());
        return;
    L6:
        broadcast(AbstractC0295Gu.m625r(-328818401212469L), r4, r5);
    }

    public final boolean getInterceptSystemLog() {
        return interceptSystemLog;
    }

    /* JADX INFO: renamed from: i */
    public final void m3528i(String r3, String r4) {
        AbstractC0295Gu.m625r(-329144818726965L);
        AbstractC0295Gu.m625r(-329161998596149L);
        broadcast(AbstractC0295Gu.m625r(-329196358334517L), r3, r4);
    }

    public final boolean isRegistered() {
        if (devServer == null) goto L6;
        return true;
    L6:
        return false;
    }

    public final void print(String r4) {
        AbstractC0295Gu.m625r(-328930070362165L);
        AbstractC0295Gu.m625r(-328964430100533L);
        CherryDevServer r0 = devServer;
        if (r0 == null) goto L5;
        int r02 = r0.getConnectionCount();
    L6:
        if (r02 != 0) goto L8;
        AbstractC0295Gu.m625r(-329007379773493L);
        AbstractC0295Gu.m625r(-329600085260341L);
    L8:
        broadcast(AbstractC0295Gu.m625r(-329668804737077L), AbstractC0295Gu.m625r(-329690279573557L), r4);
        return;
    L5:
        r02 = 0;
        goto L6
    }

    public final void register(CherryDevServer r3) {
        AbstractC0295Gu.m625r(-330764021397557L);
        devServer = r3;
        AbstractC0295Gu.m625r(-330794086168629L);
        AbstractC0295Gu.m625r(-330858510678069L);
    }

    public final void removeFilterTag(String r3) {
        AbstractC0295Gu.m625r(-329050329446453L);
        filterTags.remove(r3);
    }

    public final void removeListener(LogListener r3) {
        AbstractC0295Gu.m625r(-330643762313269L);
        listeners.remove(r3);
    }

    public final void result(String r4, boolean r5, String r6) {
        AbstractC0295Gu.m625r(-329716049377333L);
        if (r5 == false) goto L6;
        long r0 = -329763294017589L;
    L5:
        String r02 = AbstractC0295Gu.m625r(r0);
        if (r5 == false) goto L14;
        StringBuilder r52 = new StringBuilder();
        r52.append(AbstractC0295Gu.m625r(-329810538657845L));
        r52.append(r4);
        r52.append(AbstractC0295Gu.m625r(-329849193363509L));
        if (r6 == null) goto L12;
        String r42 = AbstractC0295Gu.m625r(-329402516764725L).concat(r6);
        if (r42 == null) goto L12;
    L13:
        r52.append(r42);
        String r43 = r52.toString();
    L18:
        broadcast(r02, AbstractC0295Gu.m625r(-329565725521973L), r43);
        return;
    L12:
        r42 = AbstractC0295Gu.m625r(-329415401666613L);
        goto L13
    L14:
        StringBuilder r53 = new StringBuilder();
        r53.append(AbstractC0295Gu.m625r(-329419696633909L));
        r53.append(r4);
        r53.append(AbstractC0295Gu.m625r(-329458351339573L));
        if (r6 != null) goto L17;
        r6 = AbstractC0295Gu.m625r(-329505595979829L);
    L17:
        r53.append(r6);
        r43 = r53.toString();
        goto L18
    L6:
        r0 = -329784768854069L;
        goto L5
    }

    public final void setInterceptSystemLog(boolean r1) {
        interceptSystemLog = r1;
    }

    public final void unregister() {
        devServer = null;
        AbstractC0295Gu.m625r(-330420424013877L);
        AbstractC0295Gu.m625r(-330484848523317L);
    }

    /* JADX INFO: renamed from: v */
    public final void m3529v(String r3, String r4) {
        AbstractC0295Gu.m625r(-328844171016245L);
        AbstractC0295Gu.m625r(-328861350885429L);
        broadcast(AbstractC0295Gu.m625r(-328895710623797L), r3, r4);
    }

    /* JADX INFO: renamed from: w */
    public final void m3530w(String r3, String r4) {
        AbstractC0295Gu.m625r(-329217833170997L);
        AbstractC0295Gu.m625r(-329235013040181L);
        broadcast(AbstractC0295Gu.m625r(-329269372778549L), r3, r4);
    }
}
