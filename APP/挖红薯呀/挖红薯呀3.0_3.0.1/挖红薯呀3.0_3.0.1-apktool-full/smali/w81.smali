.class public final Lw81;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public final a:Lq91;

.field public final b:Lgp0;

.field public final synthetic c:Lb91;


# direct methods
.method public constructor <init>(Lb91;Lq91;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw81;->c:Lb91;

    .line 5
    .line 6
    iput-object p2, p0, Lw81;->a:Lq91;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    invoke-static {p1}, Lr60;->u(Ljava/lang/Object;)Lgp0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lw81;->b:Lgp0;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(Lsw;Lsw;)Lv81;
    .locals 8

    .line 1
    iget-object v0, p0, Lw81;->b:Lgp0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lv81;

    .line 8
    .line 9
    iget-object v2, p0, Lw81;->c:Lb91;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    new-instance v1, Lv81;

    .line 14
    .line 15
    new-instance v3, Ly81;

    .line 16
    .line 17
    invoke-virtual {v2}, Lb91;->c()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-interface {p2, v4}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-virtual {v2}, Lb91;->c()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-interface {p2, v5}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    iget-object v6, p0, Lw81;->a:Lq91;

    .line 34
    .line 35
    iget-object v7, v6, Lq91;->a:Lsw;

    .line 36
    .line 37
    invoke-interface {v7, v5}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    check-cast v5, Lb8;

    .line 42
    .line 43
    invoke-virtual {v5}, Lb8;->d()V

    .line 44
    .line 45
    .line 46
    invoke-direct {v3, v2, v4, v5, v6}, Ly81;-><init>(Lb91;Ljava/lang/Object;Lb8;Lq91;)V

    .line 47
    .line 48
    .line 49
    invoke-direct {v1, p0, v3, p1, p2}, Lv81;-><init>(Lw81;Ly81;Lsw;Lsw;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object p0, v2, Lb91;->i:Lc31;

    .line 56
    .line 57
    invoke-virtual {p0, v3}, Lc31;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    :cond_0
    iput-object p2, v1, Lv81;->f:Lsw;

    .line 61
    .line 62
    iput-object p1, v1, Lv81;->e:Lsw;

    .line 63
    .line 64
    invoke-virtual {v2}, Lb91;->f()Lx81;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {v1, p0}, Lv81;->a(Lx81;)V

    .line 69
    .line 70
    .line 71
    return-object v1
.end method
