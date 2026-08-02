.class public final Lb82;
.super Lq2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ld20;


# instance fields
.field public final synthetic i:Lcy;

.field public final synthetic j:Lc82;


# direct methods
.method public constructor <init>(Lcy;Lc82;)V
    .locals 1

    .line 1
    sget-object v0, Lgd3;->q:Lgd3;

    .line 2
    .line 3
    iput-object p1, p0, Lb82;->i:Lcy;

    .line 4
    .line 5
    iput-object p2, p0, Lb82;->j:Lc82;

    .line 6
    .line 7
    invoke-direct {p0, v0}, Lq2;-><init>(Lz10;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final p(La20;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    new-instance v0, Lr1;

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    iget-object v2, p0, Lb82;->i:Lcy;

    .line 6
    .line 7
    iget-object p0, p0, Lb82;->j:Lc82;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, p0}, Lr1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p2, v0}, Lse;->R(Ljava/lang/Throwable;Lxm0;)Z

    .line 13
    .line 14
    .line 15
    sget-object v0, Lgd3;->q:Lgd3;

    .line 16
    .line 17
    iget-object p0, p0, Lc82;->h:La20;

    .line 18
    .line 19
    invoke-interface {p0, v0}, La20;->o(Lz10;)Ly10;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Ld20;

    .line 24
    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    invoke-interface {p0, p1, p2}, Ld20;->p(La20;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    throw p2
.end method
