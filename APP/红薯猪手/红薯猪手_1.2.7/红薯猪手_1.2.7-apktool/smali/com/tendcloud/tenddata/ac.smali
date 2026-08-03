.class public final Lcom/tendcloud/tenddata/ac;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/tendcloud/tenddata/ao;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    const-class v0, Lcom/tendcloud/tenddata/ac;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    invoke-static {p0, v1}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v2, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v2, p0}, Lcom/tendcloud/tenddata/ao;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    monitor-exit v0

    return-object v1
.end method

.method public static a(Landroid/app/Activity;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    :try_start_0
    invoke-static {p0, p1}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1}, Lcom/tendcloud/tenddata/ao;->a(Landroid/app/Activity;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    :try_start_0
    invoke-static {p0, p3}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2, p3}, Lcom/tendcloud/tenddata/ao;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V
    .locals 2

    const-class v0, Lcom/tendcloud/tenddata/ac;

    monitor-enter v0

    :try_start_0
    invoke-static {p0, p1}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v1, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v1, p0, p1}, Lcom/tendcloud/tenddata/ao;->a(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    monitor-exit v0

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;DLjava/util/Map;Lcom/tendcloud/tenddata/a;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "D",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    :try_start_0
    invoke-static {p0, p5}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p4

    move-wide v4, p2

    move-object v6, p5

    invoke-interface/range {v0 .. v6}, Lcom/tendcloud/tenddata/ao;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;DLcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    :try_start_0
    invoke-static {p0, p2}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2}, Lcom/tendcloud/tenddata/ao;->a(Landroid/content/Context;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 2

    const-class v0, Lcom/tendcloud/tenddata/ac;

    monitor-enter v0

    :try_start_0
    invoke-static {p0, p3}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v1, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v1, p0, p1, p2, p3}, Lcom/tendcloud/tenddata/ao;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    monitor-exit v0

    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 7

    const-class v0, Lcom/tendcloud/tenddata/ac;

    monitor-enter v0

    :try_start_0
    invoke-static {p0, p4}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v1, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-interface/range {v1 .. v6}, Lcom/tendcloud/tenddata/ao;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    monitor-exit v0

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;DLcom/tendcloud/tenddata/a;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;D",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    :try_start_0
    invoke-static {p0, p6}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-wide v5, p4

    move-object v7, p6

    invoke-interface/range {v0 .. v7}, Lcom/tendcloud/tenddata/ao;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;DLcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    :try_start_0
    invoke-static {p0, p4}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-interface/range {v0 .. v5}, Lcom/tendcloud/tenddata/ao;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    :try_start_0
    invoke-static {p0, p5}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-interface/range {v0 .. v6}, Lcom/tendcloud/tenddata/ao;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    const-string v0, "null"

    invoke-static {p0, p1, v0, p2, p3}, Lcom/tendcloud/tenddata/ac;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-static/range {v0 .. v5}, Lcom/tendcloud/tenddata/ac;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/Throwable;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    :try_start_0
    invoke-static {p0, p2}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2}, Lcom/tendcloud/tenddata/ao;->a(Landroid/content/Context;Ljava/lang/Throwable;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static a(Lcom/tendcloud/tenddata/TalkingDataOrder;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1}, Lcom/tendcloud/tenddata/ao;->a(Lcom/tendcloud/tenddata/TalkingDataOrder;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static a(Lcom/tendcloud/tenddata/TalkingDataOrder;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p2}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2}, Lcom/tendcloud/tenddata/ao;->a(Lcom/tendcloud/tenddata/TalkingDataOrder;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static a(Lcom/tendcloud/tenddata/TalkingDataOrder;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p3}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2, p3}, Lcom/tendcloud/tenddata/ao;->a(Lcom/tendcloud/tenddata/TalkingDataOrder;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static a(Lcom/tendcloud/tenddata/TalkingDataOrder;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tendcloud/tenddata/TalkingDataOrder;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p3}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2, p3}, Lcom/tendcloud/tenddata/ao;->a(Lcom/tendcloud/tenddata/TalkingDataOrder;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static a(Lcom/tendcloud/tenddata/TalkingDataProfile;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1}, Lcom/tendcloud/tenddata/ao;->a(Lcom/tendcloud/tenddata/TalkingDataProfile;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static a(Lcom/tendcloud/tenddata/TalkingDataSearch;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1}, Lcom/tendcloud/tenddata/ao;->a(Lcom/tendcloud/tenddata/TalkingDataSearch;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static a(Lcom/tendcloud/tenddata/TalkingDataSharingFilter;Lcom/tendcloud/tenddata/a;)V
    .locals 0

    sput-object p0, Lcom/tendcloud/tenddata/ab;->u:Lcom/tendcloud/tenddata/TalkingDataSharingFilter;

    return-void
.end method

.method public static a(Lcom/tendcloud/tenddata/TalkingDataShoppingCart;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1}, Lcom/tendcloud/tenddata/ao;->a(Lcom/tendcloud/tenddata/TalkingDataShoppingCart;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static a(Lcom/tendcloud/tenddata/a;Ljava/lang/String;)V
    .locals 7

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p0}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v1, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    sget-object v2, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    const-string v4, ""

    const/4 v5, 0x0

    move-object v3, p1

    move-object v6, p0

    invoke-interface/range {v1 .. v6}, Lcom/tendcloud/tenddata/ao;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static a(Ljava/lang/String;ILjava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p3}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2, p3}, Lcom/tendcloud/tenddata/ao;->a(Ljava/lang/String;ILjava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 7

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p4}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v1, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    move-object v2, p0

    move v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-interface/range {v1 .. v6}, Lcom/tendcloud/tenddata/ao;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static a(Ljava/lang/String;Lcom/tendcloud/tenddata/TalkingDataProfile;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p2}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2}, Lcom/tendcloud/tenddata/ao;->a(Ljava/lang/String;Lcom/tendcloud/tenddata/TalkingDataProfile;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static a(Ljava/lang/String;Lcom/tendcloud/tenddata/TalkingDataProfile;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p3}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2, p3}, Lcom/tendcloud/tenddata/ao;->a(Ljava/lang/String;Lcom/tendcloud/tenddata/TalkingDataProfile;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static a(Ljava/lang/String;Lcom/tendcloud/tenddata/TalkingDataProfile;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/tendcloud/tenddata/TalkingDataProfile;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p4}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v1, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-interface/range {v1 .. v6}, Lcom/tendcloud/tenddata/ao;->a(Ljava/lang/String;Lcom/tendcloud/tenddata/TalkingDataProfile;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static a(Ljava/lang/String;Lcom/tendcloud/tenddata/TalkingDataProfile;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/tendcloud/tenddata/TalkingDataProfile;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p3}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2, p3}, Lcom/tendcloud/tenddata/ao;->a(Ljava/lang/String;Lcom/tendcloud/tenddata/TalkingDataProfile;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static a(Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object p1, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {p1, p0}, Lcom/tendcloud/tenddata/ao;->removeGlobalKV(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static a(Ljava/lang/String;Lcom/tendcloud/tenddata/af$ProfileType;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p3}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2, p3}, Lcom/tendcloud/tenddata/ao;->b(Ljava/lang/String;Lcom/tendcloud/tenddata/af$ProfileType;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/Object;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p2}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object p2, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {p2, p0, p1}, Lcom/tendcloud/tenddata/ao;->a(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 8

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p5}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v1, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-interface/range {v1 .. v7}, Lcom/tendcloud/tenddata/ao;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/tendcloud/tenddata/a;)V
    .locals 10

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    move-object/from16 v9, p7

    invoke-static {v0, v9}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v1, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    move/from16 v8, p6

    move-object/from16 v9, p7

    invoke-interface/range {v1 .. v9}, Lcom/tendcloud/tenddata/ao;->a(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p2}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2}, Lcom/tendcloud/tenddata/ao;->a(Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILcom/tendcloud/tenddata/a;)V
    .locals 8

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p5}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v1, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move v6, p4

    move-object v7, p5

    invoke-interface/range {v1 .. v7}, Lcom/tendcloud/tenddata/ao;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/Map;Lcom/tendcloud/tenddata/a;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p6}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v1, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move v6, p4

    move-object v7, p5

    move-object v8, p6

    invoke-interface/range {v1 .. v8}, Lcom/tendcloud/tenddata/ao;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/Map;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/tendcloud/tenddata/a;)V
    .locals 7

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p4}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v1, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move-object v6, p4

    invoke-interface/range {v1 .. v6}, Lcom/tendcloud/tenddata/ao;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Lcom/tendcloud/tenddata/a;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p5}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v1, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-interface/range {v1 .. v7}, Lcom/tendcloud/tenddata/ao;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p3}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2, p3}, Lcom/tendcloud/tenddata/ao;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p3}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2, p3}, Lcom/tendcloud/tenddata/ao;->b(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static a(Ljava/util/Map;Lcom/tendcloud/tenddata/TDGenerateUrl;Lcom/tendcloud/tenddata/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/TDGenerateUrl;",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p2}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object p2, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {p2, p0, p1}, Lcom/tendcloud/tenddata/ao;->a(Ljava/util/Map;Lcom/tendcloud/tenddata/TDGenerateUrl;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static a(ZLcom/tendcloud/tenddata/a;)V
    .locals 1

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object p1, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {p1, p0}, Lcom/tendcloud/tenddata/ao;->c(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static a()Z
    .locals 1

    sget-boolean v0, Lcom/tendcloud/tenddata/zz;->b:Z

    return v0
.end method

.method public static b(Landroid/content/Context;)I
    .locals 0

    invoke-static {p0}, Lcom/tendcloud/tenddata/k;->c(Landroid/content/Context;)I

    move-result p0

    return p0
.end method

.method public static b()Landroid/content/Context;
    .locals 1

    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0}, Lcom/tendcloud/tenddata/ao;->d()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lcom/tendcloud/tenddata/ab;->a(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/app/Activity;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    :try_start_0
    invoke-static {p0, p1}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1}, Lcom/tendcloud/tenddata/ao;->b(Landroid/app/Activity;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    :try_start_0
    invoke-static {p0, p2}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2}, Lcom/tendcloud/tenddata/ao;->b(Landroid/content/Context;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0, p3}, Lcom/tendcloud/tenddata/ac;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public static b(Ljava/lang/String;ILjava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p3}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2, p3}, Lcom/tendcloud/tenddata/ao;->b(Ljava/lang/String;ILjava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static b(Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1}, Lcom/tendcloud/tenddata/ao;->a(Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static b(Ljava/lang/String;Lcom/tendcloud/tenddata/af$ProfileType;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p3}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2, p3}, Lcom/tendcloud/tenddata/ao;->a(Ljava/lang/String;Lcom/tendcloud/tenddata/af$ProfileType;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 8

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p5}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v1, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-interface/range {v1 .. v7}, Lcom/tendcloud/tenddata/ao;->a(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p2}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2}, Lcom/tendcloud/tenddata/ao;->b(Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p3}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2, p3}, Lcom/tendcloud/tenddata/ao;->c(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static c(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lcom/tendcloud/tenddata/ab;->b(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static c()V
    .locals 1

    const/4 v0, 0x0

    :try_start_0
    sput-boolean v0, Lcom/tendcloud/tenddata/h;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    const-string v0, ""

    invoke-static {p0, p1, v0, p2}, Lcom/tendcloud/tenddata/ac;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public static c(Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1}, Lcom/tendcloud/tenddata/ao;->b(Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p2}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2}, Lcom/tendcloud/tenddata/ao;->c(Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static declared-synchronized d(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;
    .locals 2

    const-class v0, Lcom/tendcloud/tenddata/ac;

    monitor-enter v0

    :try_start_0
    invoke-static {p0, p1}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v1, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v1, p0, p1}, Lcom/tendcloud/tenddata/ao;->b(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    const/4 p0, 0x0

    monitor-exit v0

    return-object p0
.end method

.method public static d(Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1}, Lcom/tendcloud/tenddata/ao;->c(Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0, p2}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v0, p0, p1, p2}, Lcom/tendcloud/tenddata/ao;->d(Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static declared-synchronized e(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;
    .locals 2

    const-class v0, Lcom/tendcloud/tenddata/ac;

    monitor-enter v0

    :try_start_0
    invoke-static {p0, p1}, Lcom/tendcloud/tenddata/ac;->f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    sget-object v1, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    invoke-interface {v1, p0, p1}, Lcom/tendcloud/tenddata/ao;->e(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    const/4 p0, 0x0

    monitor-exit v0

    return-object p0
.end method

.method private static declared-synchronized f(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V
    .locals 0

    const-class p1, Lcom/tendcloud/tenddata/ac;

    monitor-enter p1

    if-eqz p0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    sput-object p0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    :cond_0
    sget-object p0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    if-nez p0, :cond_1

    const-string p0, "Init failed Context is null "

    invoke-static {p0}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    return-void

    :cond_1
    :try_start_1
    sget-object p0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;

    if-nez p0, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    invoke-static {}, Lcom/tendcloud/tenddata/zz;->a()Lcom/tendcloud/tenddata/zz;

    move-result-object p0

    sput-object p0, Lcom/tendcloud/tenddata/ac;->a:Lcom/tendcloud/tenddata/ao;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_2
    monitor-exit p1

    return-void

    :catchall_0
    move-exception p0

    monitor-exit p1

    throw p0
.end method

.method public static setConfig(Lcom/tendcloud/tenddata/TalkingDataSDKConfig;)V
    .locals 0

    invoke-static {p0}, Lcom/tendcloud/tenddata/ab;->setCofig(Lcom/tendcloud/tenddata/TalkingDataSDKConfig;)V

    return-void
.end method

.method public static declared-synchronized setConfigurationDisable(I)V
    .locals 1

    const-class v0, Lcom/tendcloud/tenddata/ac;

    monitor-enter v0

    :try_start_0
    invoke-static {p0}, Lcom/tendcloud/tenddata/ab;->setConfigurationDisable(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    monitor-exit v0

    return-void
.end method

.method public static setProfileId(Ljava/lang/String;)V
    .locals 0

    :try_start_0
    sput-object p0, Lcom/tendcloud/tenddata/ab;->r:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method
