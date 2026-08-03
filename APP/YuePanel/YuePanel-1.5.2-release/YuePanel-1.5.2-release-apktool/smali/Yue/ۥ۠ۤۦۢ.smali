.class public final LYue/ۥ۠ۤۦۢ;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠ۤۦۢ$ۥ۟;,
        LYue/ۥ۠ۤۦۢ$ۥ۟۟;
    }
.end annotation


# static fields
.field public static final ۥ:Ljava/lang/Object;

.field public static final ۥ۟:Ljava/util/concurrent/atomic/AtomicLong;

.field public static final ۥ۟۟:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "LYue/\u06e5\u06e0\u06e4\u06e6\u06e2$\u06e5\u06df;",
            ">;"
        }
    .end annotation
.end field

.field public static volatile synthetic ۥ۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟۠:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0xea

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LYue/ۥ۠ۤۦۢ;->ۥ:Ljava/lang/Object;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x1

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    sput-object v0, LYue/ۥ۠ۤۦۢ;->ۥ۟:Ljava/util/concurrent/atomic/AtomicLong;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v0, LYue/ۥ۠ۤۦۢ;->ۥ۟۟:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method

.method public static native ۥ(Ljava/lang/Class;)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)I"
        }
    .end annotation
.end method

.method public static varargs ۥ۟(Ljava/lang/Class;[Ljava/lang/Object;)LYue/ۥ۠ۤۦۢ$ۥ۟;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/Object;",
            ")",
            "LYue/\u06e5\u06e0\u06e4\u06e6\u06e2$\u06e5\u06df;"
        }
    .end annotation

    invoke-static {p0, p1}, Lde/robv/android/xposed/XposedHelpers;->findAndHookConstructor(Ljava/lang/Class;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    move-result-object p0

    invoke-static {p0}, LYue/ۥ۠ۤۦۢ;->ۥ۟۟۟ۨ(Lde/robv/android/xposed/XC_MethodHook$Unhook;)LYue/ۥ۠ۤۦۢ$ۥ۟;

    move-result-object p0

    return-object p0
.end method

.method public static varargs ۥ۟۟(Ljava/lang/String;Ljava/lang/ClassLoader;[Ljava/lang/Object;)LYue/ۥ۠ۤۦۢ$ۥ۟;
    .locals 0

    invoke-static {p0, p1, p2}, Lde/robv/android/xposed/XposedHelpers;->findAndHookConstructor(Ljava/lang/String;Ljava/lang/ClassLoader;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    move-result-object p0

    invoke-static {p0}, LYue/ۥ۠ۤۦۢ;->ۥ۟۟۟ۨ(Lde/robv/android/xposed/XC_MethodHook$Unhook;)LYue/ۥ۠ۤۦۢ$ۥ۟;

    move-result-object p0

    return-object p0
.end method

.method public static varargs ۥ۟۟۟(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)LYue/ۥ۠ۤۦۢ$ۥ۟;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Object;",
            ")",
            "LYue/\u06e5\u06e0\u06e4\u06e6\u06e2$\u06e5\u06df;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    move-result-object p0

    invoke-static {p0}, LYue/ۥ۠ۤۦۢ;->ۥ۟۟۟ۨ(Lde/robv/android/xposed/XC_MethodHook$Unhook;)LYue/ۥ۠ۤۦۢ$ۥ۟;

    move-result-object p0

    return-object p0
.end method

.method public static varargs ۥ۟۟۟۟(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)LYue/ۥ۠ۤۦۢ$ۥ۟;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    move-result-object p0

    invoke-static {p0}, LYue/ۥ۠ۤۦۢ;->ۥ۟۟۟ۨ(Lde/robv/android/xposed/XC_MethodHook$Unhook;)LYue/ۥ۠ۤۦۢ$ۥ۟;

    move-result-object p0

    return-object p0
.end method

.method public static native ۥ۟۟۟۠()I
.end method

.method public static native ۥ۟۟۟ۡ(J)LYue/ۥ۠ۤۦۢ$ۥ۟;
.end method

.method public static native ۥ۟۟۟ۢ()I
.end method

.method public static native ۥۣ۟۟۟()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e0\u06e4\u06e6\u06e2$\u06e5\u06df\u06df;",
            ">;"
        }
    .end annotation
.end method

.method public static native ۥ۟۟۟ۤ()I
.end method

.method public static ۥ۟۟۟ۥ(Ljava/lang/Class;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lde/robv/android/xposed/XC_MethodHook;",
            ")",
            "Ljava/util/Set<",
            "LYue/\u06e5\u06e0\u06e4\u06e6\u06e2$\u06e5\u06df;",
            ">;"
        }
    .end annotation

    invoke-static {p0, p1}, Lde/robv/android/xposed/XposedBridge;->hookAllConstructors(Ljava/lang/Class;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    move-result-object p0

    invoke-static {p0}, LYue/ۥ۠ۤۦۢ;->ۥ۟۟۠(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟ۦ(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "Lde/robv/android/xposed/XC_MethodHook;",
            ")",
            "Ljava/util/Set<",
            "LYue/\u06e5\u06e0\u06e4\u06e6\u06e2$\u06e5\u06df;",
            ">;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    move-result-object p0

    invoke-static {p0}, LYue/ۥ۠ۤۦۢ;->ۥ۟۟۠(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟ۧ(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)LYue/ۥ۠ۤۦۢ$ۥ۟;
    .locals 0

    invoke-static {p0, p1}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    move-result-object p0

    invoke-static {p0}, LYue/ۥ۠ۤۦۢ;->ۥ۟۟۟ۨ(Lde/robv/android/xposed/XC_MethodHook$Unhook;)LYue/ۥ۠ۤۦۢ$ۥ۟;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟ۨ(Lde/robv/android/xposed/XC_MethodHook$Unhook;)LYue/ۥ۠ۤۦۢ$ۥ۟;
    .locals 9

    if-eqz p0, :cond_0

    new-instance v8, LYue/ۥ۠ۤۦۢ$ۥ۟;

    sget-object v0, LYue/ۥ۠ۤۦۢ;->ۥ۟:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v1

    invoke-virtual {p0}, Lde/robv/android/xposed/XC_MethodHook$Unhook;->getHookedMethod()Ljava/lang/reflect/Member;

    move-result-object v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    const/4 v7, 0x0

    move-object v0, v8

    move-object v3, p0

    invoke-direct/range {v0 .. v7}, LYue/ۥ۠ۤۦۢ$ۥ۟;-><init>(JLde/robv/android/xposed/XC_MethodHook$Unhook;Ljava/lang/reflect/Member;JLYue/ۥ۠ۤۦۢ$ۥ;)V

    sget-object p0, LYue/ۥ۠ۤۦۢ;->ۥ:Ljava/lang/Object;

    monitor-enter p0

    :try_start_0
    sget-object v0, LYue/ۥ۠ۤۦۢ;->ۥ۟۟:Ljava/util/Map;

    invoke-static {v8}, LYue/ۥ۠ۤۦۢ$ۥ۟;->ۥ(LYue/ۥ۠ۤۦۢ$ۥ۟;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit p0

    return-object v8

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const/4 v0, 0x2

    invoke-static {v0}, LYue/ۥ۠ۤۦۢ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۥ۟۟۠(Ljava/util/Set;)Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lde/robv/android/xposed/XC_MethodHook$Unhook;",
            ">;)",
            "Ljava/util/Set<",
            "LYue/\u06e5\u06e0\u06e4\u06e6\u06e2$\u06e5\u06df;",
            ">;"
        }
    .end annotation

    if-eqz p0, :cond_2

    invoke-interface {p0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lde/robv/android/xposed/XC_MethodHook$Unhook;

    invoke-static {v1}, LYue/ۥ۠ۤۦۢ;->ۥ۟۟۟ۨ(Lde/robv/android/xposed/XC_MethodHook$Unhook;)LYue/ۥ۠ۤۦۢ$ۥ۟;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_1
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static native ۥ۟۟۠۟(Ljava/util/List;)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e0\u06e4\u06e6\u06e2$\u06e5\u06df;",
            ">;)I"
        }
    .end annotation
.end method

.method public static native ۥ۟۟۠۠(J)Z
.end method

.method public static ۥ۟۟۠ۡ(LYue/ۥ۠ۤۦۢ$ۥ۟;)Z
    .locals 7

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    sget-object v1, LYue/ۥ۠ۤۦۢ;->ۥ:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v2, LYue/ۥ۠ۤۦۢ;->ۥ۟۟:Ljava/util/Map;

    invoke-static {p0}, LYue/ۥ۠ۤۦۢ$ۥ۟;->ۥ(LYue/ۥ۠ۤۦۢ$ۥ۟;)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LYue/ۥ۠ۤۦۢ$ۥ۟;

    if-ne v3, p0, :cond_3

    invoke-static {p0}, LYue/ۥ۠ۤۦۢ$ۥ۟;->ۥ۟(LYue/ۥ۠ۤۦۢ$ۥ۟;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_2

    :cond_1
    invoke-static {p0}, LYue/ۥ۠ۤۦۢ$ۥ۟;->ۥ(LYue/ۥ۠ۤۦۢ$ۥ۟;)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0, v0}, LYue/ۥ۠ۤۦۢ$ۥ۟;->ۥ۟۟(LYue/ۥ۠ۤۦۢ$ۥ۟;Z)Z

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/4 v1, 0x1

    :try_start_1
    invoke-static {p0}, LYue/ۥ۠ۤۦۢ$ۥ۟;->ۥ۟۟۟(LYue/ۥ۠ۤۦۢ$ۥ۟;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    move-result-object v2

    invoke-virtual {v2}, Lde/robv/android/xposed/XC_MethodHook$Unhook;->unhook()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return v1

    :catchall_0
    move-exception v2

    sget-object v3, LYue/ۥ۠ۤۦۢ;->ۥ:Ljava/lang/Object;

    monitor-enter v3

    :try_start_2
    sget-object v4, LYue/ۥ۠ۤۦۢ;->ۥ۟۟:Ljava/util/Map;

    invoke-static {p0}, LYue/ۥ۠ۤۦۢ$ۥ۟;->ۥ(LYue/ۥ۠ۤۦۢ$ۥ۟;)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-static {p0, v1}, LYue/ۥ۠ۤۦۢ$ۥ۟;->ۥ۟۟(LYue/ۥ۠ۤۦۢ$ۥ۟;Z)Z

    invoke-static {p0}, LYue/ۥ۠ۤۦۢ$ۥ۟;->ۥ(LYue/ۥ۠ۤۦۢ$ۥ۟;)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-interface {v4, v5, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_1
    move-exception p0

    goto :goto_1

    :cond_2
    :goto_0
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v0}, LYue/ۥ۠ۤۦۢ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, LYue/ۥ۠ۤۦۢ$ۥ۟;->ۥ(LYue/ۥ۠ۤۦۢ$ۥ۟;)J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-static {v1}, LYue/ۥ۠ۤۦۢ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V

    return v0

    :goto_1
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p0

    :catchall_2
    move-exception p0

    goto :goto_3

    :cond_3
    :goto_2
    :try_start_4
    monitor-exit v1

    return v0

    :goto_3
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw p0
.end method

.method public static native ۥ۟۟۠ۢ(Ljava/lang/String;Ljava/lang/String;)I
.end method

.method public static native ۥۣ۟۟۠(Ljava/lang/reflect/Member;)I
.end method

.method public static native ۥ۟۟۠ۤ()I
.end method

.method public static native ۥ۟۟۠ۥ()I
.end method
