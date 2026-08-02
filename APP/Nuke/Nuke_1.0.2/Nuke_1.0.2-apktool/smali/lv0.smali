.class public final synthetic Llv0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic h:Lqv0;

.field public final synthetic i:I

.field public final synthetic j:Lfn;

.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(Lqv0;ILfn;IZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Llv0;->h:Lqv0;

    .line 5
    .line 6
    iput p2, p0, Llv0;->i:I

    .line 7
    .line 8
    iput-object p3, p0, Llv0;->j:Lfn;

    .line 9
    .line 10
    iput p4, p0, Llv0;->k:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Llv0;->h:Lqv0;

    .line 2
    .line 3
    iget v1, p0, Llv0;->i:I

    .line 4
    .line 5
    iget-object v2, p0, Llv0;->j:Lfn;

    .line 6
    .line 7
    iget p0, p0, Llv0;->k:I

    .line 8
    .line 9
    :try_start_0
    iget-object v3, v0, Lqv0;->r:Lgd3;

    .line 10
    .line 11
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    int-to-long v3, p0

    .line 15
    invoke-virtual {v2, v3, v4}, Lfn;->skip(J)V

    .line 16
    .line 17
    .line 18
    iget-object p0, v0, Lqv0;->D:Lyv0;

    .line 19
    .line 20
    sget-object v2, Lcg0;->o:Lcg0;

    .line 21
    .line 22
    invoke-virtual {p0, v1, v2}, Lyv0;->k(ILcg0;)V

    .line 23
    .line 24
    .line 25
    monitor-enter v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    :try_start_1
    iget-object p0, v0, Lqv0;->F:Ljava/util/LinkedHashSet;

    .line 27
    .line 28
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-interface {p0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    .line 34
    .line 35
    :try_start_2
    monitor-exit v0

    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p0

    .line 38
    monitor-exit v0

    .line 39
    throw p0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 40
    :catch_0
    :goto_0
    sget-object p0, La83;->a:La83;

    .line 41
    .line 42
    return-object p0
.end method
