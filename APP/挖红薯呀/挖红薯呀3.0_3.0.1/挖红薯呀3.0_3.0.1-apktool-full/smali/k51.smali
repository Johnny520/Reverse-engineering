.class public final synthetic Lk51;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:Lzt0;

.field public final synthetic e:F

.field public final synthetic f:Lq7;

.field public final synthetic g:Lw7;

.field public final synthetic h:Lsw;


# direct methods
.method public synthetic constructor <init>(Lzt0;FLq7;Lw7;Lsw;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk51;->d:Lzt0;

    .line 5
    .line 6
    iput p2, p0, Lk51;->e:F

    .line 7
    .line 8
    iput-object p3, p0, Lk51;->f:Lq7;

    .line 9
    .line 10
    iput-object p4, p0, Lk51;->g:Lw7;

    .line 11
    .line 12
    iput-object p5, p0, Lk51;->h:Lsw;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

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
    iget-object p1, p0, Lk51;->d:Lzt0;

    .line 8
    .line 9
    iget-object p1, p1, Lzt0;->d:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-object v0, p1

    .line 15
    check-cast v0, Lu7;

    .line 16
    .line 17
    iget v3, p0, Lk51;->e:F

    .line 18
    .line 19
    iget-object v4, p0, Lk51;->f:Lq7;

    .line 20
    .line 21
    iget-object v5, p0, Lk51;->g:Lw7;

    .line 22
    .line 23
    iget-object v6, p0, Lk51;->h:Lsw;

    .line 24
    .line 25
    invoke-static/range {v0 .. v6}, Lz60;->r(Lu7;JFLq7;Lw7;Lsw;)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lna1;->a:Lna1;

    .line 29
    .line 30
    return-object p0
.end method
