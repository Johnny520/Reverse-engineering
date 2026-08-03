.class public final synthetic Lf0/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:Lf0/V;

.field public final synthetic b:Landroid/app/Activity;

.field public final synthetic c:LP0/a;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;LP0/a;)V
    .locals 1

    sget-object v0, Lf0/V;->a:Lf0/V;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lf0/p;->a:Lf0/V;

    iput-object p1, p0, Lf0/p;->b:Landroid/app/Activity;

    iput-object p2, p0, Lf0/p;->c:LP0/a;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    iget-object p1, p0, Lf0/p;->a:Lf0/V;

    iget-object p2, p0, Lf0/p;->b:Landroid/app/Activity;

    iget-object v0, p0, Lf0/p;->c:LP0/a;

    const-string v1, "$this_runCatching"

    invoke-static {p1, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "$host"

    invoke-static {p2, p1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "$refresh"

    invoke-static {v0, p1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lc0/h1;->a:Lc0/h1;

    sget-object p1, Lc0/h1;->e:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    sget-object v1, Lc0/h1;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    sget-object v1, Lc0/h1;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    sget-object v2, Lc0/h1;->h:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    sget-object v1, Lc0/h1;->c:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    const/4 v1, 0x0

    invoke-static {v1}, Lc0/h1;->b(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    sget-object p1, Lc0/B1;->a:Lc0/B1;

    const-wide/16 v1, 0x0

    sput-wide v1, Lc0/B1;->c:J

    sget-object p1, Lc0/G1;->a:Ljava/lang/Object;

    invoke-static {}, Lc0/G1;->w()V

    const-string p1, "\u5df2\u91cd\u7f6e\u6240\u6709\u529f\u80fd\uff0c\u91cd\u542f\u5fae\u4fe1\u540e\u5b8c\u5168\u751f\u6548"

    invoke-static {p2, p1}, Lf0/V;->z(Landroid/content/Context;Ljava/lang/String;)V

    invoke-interface {v0}, LP0/a;->invoke()Ljava/lang/Object;

    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1

    throw p2
.end method
