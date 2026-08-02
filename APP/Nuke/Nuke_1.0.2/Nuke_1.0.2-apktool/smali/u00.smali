.class public abstract Lu00;
.super Lrj;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final i:La20;

.field public transient j:Lt00;


# direct methods
.method public constructor <init>(Lt00;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p1}, Lt00;->f()La20;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    invoke-direct {p0, p1, v0}, Lu00;-><init>(Lt00;La20;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Lt00;La20;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1}, Lrj;-><init>(Lt00;)V

    .line 14
    iput-object p2, p0, Lu00;->i:La20;

    return-void
.end method


# virtual methods
.method public f()La20;
    .locals 0

    .line 1
    iget-object p0, p0, Lu00;->i:La20;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public s()V
    .locals 4

    .line 1
    iget-object v0, p0, Lu00;->j:Lt00;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    if-eq v0, p0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, Lu00;->f()La20;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sget-object v2, Lgd3;->p:Lgd3;

    .line 12
    .line 13
    invoke-interface {v1, v2}, La20;->o(Lz10;)Ly10;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    check-cast v1, Lc20;

    .line 21
    .line 22
    check-cast v0, Lk90;

    .line 23
    .line 24
    sget-object v1, Lk90;->o:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 25
    .line 26
    :cond_0
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    sget-object v3, Lp40;->e:Lhh1;

    .line 31
    .line 32
    if-eq v2, v3, :cond_0

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    instance-of v1, v0, Lmp;

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    check-cast v0, Lmp;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const/4 v0, 0x0

    .line 46
    :goto_0
    if-eqz v0, :cond_2

    .line 47
    .line 48
    invoke-virtual {v0}, Lmp;->q()V

    .line 49
    .line 50
    .line 51
    :cond_2
    sget-object v0, Lnv;->i:Lnv;

    .line 52
    .line 53
    iput-object v0, p0, Lu00;->j:Lt00;

    .line 54
    .line 55
    return-void
.end method
