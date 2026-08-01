.class public final synthetic Li51;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:Lzt0;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Lq7;

.field public final synthetic g:Lb8;

.field public final synthetic h:Lw7;

.field public final synthetic i:F

.field public final synthetic j:Lsw;


# direct methods
.method public synthetic constructor <init>(Lzt0;Ljava/lang/Object;Lq7;Lb8;Lw7;FLsw;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li51;->d:Lzt0;

    .line 5
    .line 6
    iput-object p2, p0, Li51;->e:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Li51;->f:Lq7;

    .line 9
    .line 10
    iput-object p4, p0, Li51;->g:Lb8;

    .line 11
    .line 12
    iput-object p5, p0, Li51;->h:Lw7;

    .line 13
    .line 14
    iput p6, p0, Li51;->i:F

    .line 15
    .line 16
    iput-object p7, p0, Li51;->j:Lsw;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    check-cast p1, Ljava/lang/Long;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    new-instance v0, Lu7;

    .line 8
    .line 9
    iget-object p1, p0, Li51;->f:Lq7;

    .line 10
    .line 11
    move-wide v4, v1

    .line 12
    invoke-interface {p1}, Lq7;->d()Lq91;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-interface {p1}, Lq7;->e()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v6

    .line 20
    new-instance v9, Lj51;

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    iget-object v10, p0, Li51;->h:Lw7;

    .line 24
    .line 25
    invoke-direct {v9, v10, v1}, Lj51;-><init>(Lw7;I)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Li51;->e:Ljava/lang/Object;

    .line 29
    .line 30
    iget-object v3, p0, Li51;->g:Lb8;

    .line 31
    .line 32
    move-wide v7, v4

    .line 33
    invoke-direct/range {v0 .. v9}, Lu7;-><init>(Ljava/lang/Object;Lq91;Lb8;JLjava/lang/Object;JLhw;)V

    .line 34
    .line 35
    .line 36
    iget v3, p0, Li51;->i:F

    .line 37
    .line 38
    iget-object v6, p0, Li51;->j:Lsw;

    .line 39
    .line 40
    move-wide v1, v4

    .line 41
    move-object v5, v10

    .line 42
    move-object v4, p1

    .line 43
    invoke-static/range {v0 .. v6}, Lz60;->r(Lu7;JFLq7;Lw7;Lsw;)V

    .line 44
    .line 45
    .line 46
    iget-object p0, p0, Li51;->d:Lzt0;

    .line 47
    .line 48
    iput-object v0, p0, Lzt0;->d:Ljava/lang/Object;

    .line 49
    .line 50
    sget-object p0, Lna1;->a:Lna1;

    .line 51
    .line 52
    return-object p0
.end method
