.class public final Lh91;
.super Lzt2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final k:Lt00;


# direct methods
.method public constructor <init>(La20;Lmn0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lp2;-><init>(La20;Z)V

    .line 3
    .line 4
    .line 5
    invoke-static {p0, p0, p2}, Lgf1;->p(Lt00;Lt00;Lmn0;)Lt00;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lh91;->k:Lt00;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final Z()V
    .locals 2

    .line 1
    iget-object v0, p0, Lh91;->k:Lt00;

    .line 2
    .line 3
    :try_start_0
    invoke-static {v0}, Lgf1;->z(Lt00;)Lt00;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, La83;->a:La83;

    .line 8
    .line 9
    invoke-static {v0, v1}, Lp40;->Q(Lt00;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    instance-of v1, v0, Lj90;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    check-cast v0, Lj90;

    .line 19
    .line 20
    iget-object v0, v0, Lj90;->h:Ljava/lang/Throwable;

    .line 21
    .line 22
    :cond_0
    invoke-static {v0}, Lfg1;->s(Ljava/lang/Throwable;)Lx92;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {p0, v1}, Lp2;->h(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    throw v0
.end method
