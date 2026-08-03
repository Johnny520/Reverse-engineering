.class public final Lf0/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lf0/c0;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public static final a(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;)V
    .locals 7

    sget-object v0, Lf0/c0;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p0, Ljava/lang/StringBuilder;

    const-string p1, "core hooks already installed, skip ("

    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lf0/c0;->d(Ljava/lang/String;)V

    goto/16 :goto_6

    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    move-object p0, v0

    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "install core hooks via "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lf0/c0;->d(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "alive="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, "\nreason="

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\npid="

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "\n"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "/sdcard/Android/media/com.tencent.mm/OKK/hook_alive.txt"

    invoke-static {v3}, LA0/p;->F(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    :try_start_0
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z

    goto :goto_2

    :catchall_0
    move-exception v4

    goto :goto_3

    :cond_2
    :goto_2
    invoke-static {v5, v0}, LN0/k;->k0(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :goto_3
    invoke-static {v4}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    goto :goto_1

    :cond_3
    sget-object v0, Le0/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    sget-object v0, Le0/c;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    sget-object v0, Le0/c;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    sget-object v0, Le0/c;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    :try_start_1
    sget-object v0, Lcom/abc/core/hooks/ModuleLog;->INSTANCE:Lcom/abc/core/hooks/ModuleLog;

    invoke-virtual {v0}, Lcom/abc/core/hooks/ModuleLog;->bootstrap()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_4
    sget-object v0, Lcom/abc/core/hooks/ModuleLog;->INSTANCE:Lcom/abc/core/hooks/ModuleLog;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "\u5f00\u59cb\u52a0\u8f7d\u6838\u5fc3 Hook \u00b7 "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/abc/core/hooks/ModuleLog;->i(Ljava/lang/String;)V

    sget-object p2, Lf0/P;->a:Ljava/lang/String;

    sget-object v3, Lf0/Z;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const-string v3, "cl"

    invoke-static {p1, v3}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    if-nez v3, :cond_4

    move-object v3, p0

    :cond_4
    sput-object v3, Lf0/Z;->b:Landroid/content/Context;

    sput-object p1, Lf0/Z;->c:Ljava/lang/ClassLoader;

    sput-object p2, Lf0/Z;->d:Ljava/lang/String;

    sget-object v3, Le0/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v3, Lf0/s;

    const/4 v4, 0x2

    invoke-direct {v3, v4, p0}, Lf0/s;-><init>(ILjava/lang/Object;)V

    const-string v4, "WeChatVersion"

    invoke-static {v4, v3}, Le0/c;->b(Ljava/lang/String;LP0/a;)V

    new-instance v3, Lf0/W;

    invoke-direct {v3, p1, p0}, Lf0/W;-><init>(Ljava/lang/ClassLoader;Landroid/content/Context;)V

    const-string v4, "SettingsEntry"

    invoke-static {v4, v3}, Le0/c;->b(Ljava/lang/String;LP0/a;)V

    new-instance v3, Lf0/W;

    const/16 v4, 0xb

    invoke-direct {v3, p0, p1, v4}, Lf0/W;-><init>(Landroid/content/Context;Ljava/lang/ClassLoader;I)V

    const-string p1, "CompatCheckUi"

    invoke-static {p1, v3}, Le0/c;->b(Ljava/lang/String;LP0/a;)V

    sget-object p1, Lb0/s;->h:Lb0/s;

    if-nez p1, :cond_5

    invoke-static {p0}, LU/S;->d0(Landroid/content/Context;)Lb0/s;

    move-result-object p1

    :cond_5
    invoke-static {p0, p1, p2}, LU/S;->u(Landroid/content/Context;Lb0/s;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {}, LU/S;->L()Lb0/a;

    move-result-object p1

    invoke-static {p0}, LU/S;->S(Ljava/lang/String;)Z

    move-result p2

    invoke-static {}, LU/S;->N()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "\u9002\u914d\u6307\u7eb9 needPopup="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v5, " shown="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " fp="

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/abc/core/hooks/ModuleLog;->i(Ljava/lang/String;)V

    if-nez p2, :cond_6

    if-eqz p1, :cond_6

    iget-object p2, p1, Lb0/a;->a:Ljava/lang/String;

    invoke-static {p2, p0}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-virtual {p1}, Lb0/a;->e()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "silent install from cache "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lf0/c0;->d(Ljava/lang/String;)V

    sput-boolean v1, LU/S;->i:Z

    sput-boolean v1, LU/S;->h:Z

    const-string p0, "cache"

    invoke-static {p0}, Lf0/Z;->a(Ljava/lang/String;)V

    goto :goto_5

    :cond_6
    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lb0/a;->e()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "install stale cache before interactive scan "

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lf0/c0;->d(Ljava/lang/String;)V

    const-string p1, "stale-cache"

    invoke-static {p1}, Lf0/Z;->a(Ljava/lang/String;)V

    const-string p1, "\u5df2\u5148\u6309\u65e7\u7f13\u5b58\u6062\u590d\u529f\u80fd\uff0c\u7a0d\u540e\u53ef\u66f4\u65b0 DEX \u7f13\u5b58"

    invoke-virtual {v0, p1}, Lcom/abc/core/hooks/ModuleLog;->i(Ljava/lang/String;)V

    :cond_7
    const-string p1, "defer features for interactive scan fp="

    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lf0/c0;->d(Ljava/lang/String;)V

    sput-boolean v2, LU/S;->i:Z

    sput-boolean v2, LU/S;->h:Z

    const-string p0, "\u5c06\u5728\u4e3b\u754c\u9762\u5f39\u51fa\u9002\u914d\u68c0\u67e5\uff08\u91cd\u88c5/\u9996\u6b21\uff09"

    invoke-virtual {v0, p0}, Lcom/abc/core/hooks/ModuleLog;->i(Ljava/lang/String;)V

    :goto_5
    invoke-static {}, Le0/c;->f()V

    invoke-static {}, Le0/c;->i()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "bootstrap finished "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lf0/c0;->d(Ljava/lang/String;)V

    :goto_6
    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/ClassLoader;Ljava/lang/String;)V
    .locals 3

    if-eqz p4, :cond_1

    invoke-static {p4}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sput-object p4, Lf0/P;->a:Ljava/lang/String;

    :cond_1
    :goto_0
    const-string p4, "com.tencent.mm"

    invoke-virtual {p0, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "seen wechat source=libxposed process="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " firstApp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lf0/c0;->d(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p0, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p0, :cond_4

    :cond_3
    move p2, v1

    goto :goto_1

    :cond_4
    invoke-virtual {p1, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_5

    move p2, v0

    goto :goto_1

    :cond_5
    invoke-static {p1}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_3

    :goto_1
    if-nez p2, :cond_6

    return-void

    :cond_6
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p2, "handlePackage accepted: "

    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " source=libxposed"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lf0/c0;->d(Ljava/lang/String;)V

    :try_start_0
    const-string p0, "com.tencent.tinker.loader.app.TinkerApplication"

    invoke-static {p3, p0}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p0

    invoke-static {p0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object p0

    :goto_2
    instance-of p1, p0, LD0/f;

    if-eqz p1, :cond_7

    const/4 p0, 0x0

    :cond_7
    check-cast p0, Ljava/lang/Class;

    if-nez p0, :cond_8

    const-string p0, "TinkerApplication not found; waiting for Application.onCreate"

    invoke-static {p0}, Lf0/c0;->d(Ljava/lang/String;)V

    goto :goto_3

    :cond_8
    new-instance p1, Lf0/a0;

    const/4 p2, 0x0

    invoke-direct {p1, p2, p0}, Lf0/a0;-><init>(ILjava/lang/Class;)V

    const-string p2, "Context"

    invoke-static {p0, p3, p2, p1}, Lf0/c0;->c(Ljava/lang/Class;Ljava/lang/ClassLoader;Ljava/lang/String;LP0/l;)I

    move-result p1

    new-instance p2, Lf0/a0;

    const/4 p4, 0x1

    invoke-direct {p2, p4, p0}, Lf0/a0;-><init>(ILjava/lang/Class;)V

    const-string p4, "Context,long,long"

    invoke-static {p0, p3, p4, p2}, Lf0/c0;->c(Ljava/lang/Class;Ljava/lang/ClassLoader;Ljava/lang/String;LP0/l;)I

    move-result p0

    add-int/2addr p0, p1

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Tinker startup hooks installed: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lf0/c0;->d(Ljava/lang/String;)V

    :goto_3
    const-string p0, "com.tencent.mm.app.Application"

    const-string p1, "android.app.Application"

    filled-new-array {p0, p1}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    :try_start_1
    const-string p2, "onCreate"

    new-instance p4, Lf0/b0;

    const/4 v2, 0x0

    invoke-direct {p4, p3, p1, v2}, Lf0/b0;-><init>(Ljava/lang/ClassLoader;Ljava/lang/String;I)V

    filled-new-array {p4}, [Ljava/lang/Object;

    move-result-object p4

    const-string v2, "className"

    invoke-static {p1, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, p1}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    invoke-static {p4, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p4

    invoke-static {v2, p2, p4}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "hooked "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ".onCreate"

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lf0/c0;->d(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :catchall_1
    move-exception p2

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    new-instance p4, Ljava/lang/StringBuilder;

    const-string v2, "skip "

    invoke-direct {p4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".onCreate: "

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lf0/c0;->d(Ljava/lang/String;)V

    goto :goto_4

    :cond_9
    if-nez v1, :cond_a

    const-string p0, "WARNING: failed to hook Application.onCreate"

    invoke-static {p0}, Lf0/c0;->d(Ljava/lang/String;)V

    :cond_a
    return-void
.end method

.method public static c(Ljava/lang/Class;Ljava/lang/ClassLoader;Ljava/lang/String;LP0/l;)I
    .locals 3

    const-string v0, "hooked "

    :try_start_0
    new-instance v1, Lf0/b0;

    const/4 v2, 0x1

    invoke-direct {v1, p1, p2, v2}, Lf0/b0;-><init>(Ljava/lang/ClassLoader;Ljava/lang/String;I)V

    invoke-interface {p3, v1}, LP0/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ".onBaseContextAttached("

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lf0/c0;->d(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p0, 0x1

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p3, "skip Tinker.onBaseContextAttached("

    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "): "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lf0/c0;->d(Ljava/lang/String;)V

    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static d(Ljava/lang/String;)V
    .locals 2

    const-string v0, "[OKK-Loader] "

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lde/robv/android/xposed/d;->d(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method
