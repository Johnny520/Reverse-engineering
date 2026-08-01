.class public final synthetic Lra;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:Lst0;

.field public final synthetic e:Lzt0;

.field public final synthetic f:J

.field public final synthetic g:Lja;


# direct methods
.method public synthetic constructor <init>(Lst0;Lzt0;JLja;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lra;->d:Lst0;

    .line 5
    .line 6
    iput-object p2, p0, Lra;->e:Lzt0;

    .line 7
    .line 8
    iput-wide p3, p0, Lra;->f:J

    .line 9
    .line 10
    iput-object p5, p0, Lra;->g:Lja;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, Lra;->e:Lzt0;

    .line 2
    .line 3
    iget-wide v3, p0, Lra;->f:J

    .line 4
    .line 5
    iget-object v8, p0, Lra;->g:Lja;

    .line 6
    .line 7
    move-object v1, p1

    .line 8
    check-cast v1, Ld60;

    .line 9
    .line 10
    invoke-virtual {v1}, Ld60;->a()V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lra;->d:Lst0;

    .line 14
    .line 15
    iget p1, p0, Lst0;->a:F

    .line 16
    .line 17
    iget p0, p0, Lst0;->b:F

    .line 18
    .line 19
    iget-object v11, v1, Ld60;->d:Ldd;

    .line 20
    .line 21
    iget-object v2, v11, Ldd;->e:Lo8;

    .line 22
    .line 23
    iget-object v2, v2, Lo8;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v2, Lx1;

    .line 26
    .line 27
    invoke-virtual {v2, p1, p0}, Lx1;->u(FF)V

    .line 28
    .line 29
    .line 30
    :try_start_0
    iget-object v0, v0, Lzt0;->d:Ljava/lang/Object;

    .line 31
    .line 32
    move-object v2, v0

    .line 33
    check-cast v2, Lt5;

    .line 34
    .line 35
    const/4 v9, 0x0

    .line 36
    const/16 v10, 0x37a

    .line 37
    .line 38
    const-wide/16 v5, 0x0

    .line 39
    .line 40
    const/4 v7, 0x0

    .line 41
    invoke-static/range {v1 .. v10}, Luq;->H(Luq;Lt5;JJFLja;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    iget-object v0, v11, Ldd;->e:Lo8;

    .line 45
    .line 46
    iget-object v0, v0, Lo8;->a:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Lx1;

    .line 49
    .line 50
    neg-float p1, p1

    .line 51
    neg-float p0, p0

    .line 52
    invoke-virtual {v0, p1, p0}, Lx1;->u(FF)V

    .line 53
    .line 54
    .line 55
    sget-object p0, Lna1;->a:Lna1;

    .line 56
    .line 57
    return-object p0

    .line 58
    :catchall_0
    move-exception v0

    .line 59
    iget-object v1, v11, Ldd;->e:Lo8;

    .line 60
    .line 61
    iget-object v1, v1, Lo8;->a:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v1, Lx1;

    .line 64
    .line 65
    neg-float p1, p1

    .line 66
    neg-float p0, p0

    .line 67
    invoke-virtual {v1, p1, p0}, Lx1;->u(FF)V

    .line 68
    .line 69
    .line 70
    throw v0
.end method
