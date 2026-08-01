.class public final Lpe;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lxw;


# instance fields
.field public final synthetic d:Lf10;

.field public final synthetic e:Z

.field public final synthetic f:Lhw;


# direct methods
.method public constructor <init>(Lf10;ZLhw;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lpe;->d:Lf10;

    .line 5
    .line 6
    iput-boolean p2, p0, Lpe;->e:Z

    .line 7
    .line 8
    iput-object p3, p0, Lpe;->f:Lhw;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, Lpe0;

    .line 2
    .line 3
    check-cast p2, Lji;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    check-cast p2, Lpi;

    .line 11
    .line 12
    const p1, -0x5af0b3b9

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2, p1}, Lpi;->W(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2}, Lpi;->L()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    sget-object p3, Lii;->a:Lr3;

    .line 23
    .line 24
    if-ne p1, p3, :cond_0

    .line 25
    .line 26
    new-instance p1, Lxg0;

    .line 27
    .line 28
    invoke-direct {p1}, Lxg0;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2, p1}, Lpi;->g0(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    move-object v1, p1

    .line 35
    check-cast v1, Lxg0;

    .line 36
    .line 37
    sget-object p1, Lme0;->a:Lme0;

    .line 38
    .line 39
    iget-object p3, p0, Lpe;->d:Lf10;

    .line 40
    .line 41
    invoke-static {p1, v1, p3}, Lc10;->a(Lpe0;Lg30;Lf10;)Lpe0;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    new-instance v0, Loe;

    .line 46
    .line 47
    iget-boolean v4, p0, Lpe;->e:Z

    .line 48
    .line 49
    iget-object v5, p0, Lpe;->f:Lhw;

    .line 50
    .line 51
    const/4 v2, 0x0

    .line 52
    const/4 v3, 0x0

    .line 53
    invoke-direct/range {v0 .. v5}, Loe;-><init>(Lxg0;Lf10;ZZLhw;)V

    .line 54
    .line 55
    .line 56
    invoke-interface {p1, v0}, Lpe0;->c(Lpe0;)Lpe0;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    const/4 p1, 0x0

    .line 61
    invoke-virtual {p2, p1}, Lpi;->p(Z)V

    .line 62
    .line 63
    .line 64
    return-object p0
.end method
