.class public final Lea0;
.super Lw51;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic i:Z

.field public final synthetic j:Lqc2;

.field public final synthetic k:Ljava/lang/String;


# direct methods
.method public constructor <init>(ZLqc2;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lea0;->i:Z

    .line 2
    .line 3
    iput-object p2, p0, Lea0;->j:Lqc2;

    .line 4
    .line 5
    iput-object p3, p0, Lea0;->k:Ljava/lang/String;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lw51;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lea0;->i:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lea0;->j:Lqc2;

    .line 6
    .line 7
    iget-object p0, p0, Lea0;->k:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v0, v0, Lqc2;->a:Lsc2;

    .line 10
    .line 11
    iget-object v1, v0, Lsc2;->c:Ljx2;

    .line 12
    .line 13
    monitor-enter v1

    .line 14
    :try_start_0
    iget-object v0, v0, Lsc2;->d:Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    invoke-interface {v0, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Lpc2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    monitor-exit v1

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    monitor-exit v1

    .line 26
    throw p0

    .line 27
    :cond_0
    :goto_0
    sget-object p0, La83;->a:La83;

    .line 28
    .line 29
    return-object p0
.end method
