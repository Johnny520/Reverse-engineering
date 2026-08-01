.class public final Ly90;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public a:Lr90;

.field public b:Lv90;


# virtual methods
.method public final a(Lx90;Lq90;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Lq90;->a()Lr90;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Ly90;->a:Lr90;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-gez v2, :cond_0

    .line 15
    .line 16
    move-object v1, v0

    .line 17
    :cond_0
    iput-object v1, p0, Ly90;->a:Lr90;

    .line 18
    .line 19
    iget-object v1, p0, Ly90;->b:Lv90;

    .line 20
    .line 21
    invoke-interface {v1, p1, p2}, Lv90;->e(Lx90;Lq90;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Ly90;->a:Lr90;

    .line 25
    .line 26
    return-void
.end method
