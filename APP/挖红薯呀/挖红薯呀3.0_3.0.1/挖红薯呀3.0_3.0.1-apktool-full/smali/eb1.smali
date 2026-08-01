.class public final Leb1;
.super Lc50;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Lfb1;


# direct methods
.method public synthetic constructor <init>(Lfb1;I)V
    .locals 0

    .line 1
    iput p2, p0, Leb1;->d:I

    .line 2
    .line 3
    iput-object p1, p0, Leb1;->e:Lfb1;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lc50;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Leb1;->d:I

    .line 2
    .line 3
    sget-object v1, Lna1;->a:Lna1;

    .line 4
    .line 5
    iget-object p0, p0, Leb1;->e:Lfb1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Luq;

    .line 11
    .line 12
    iget-object v0, p0, Lfb1;->b:Lay;

    .line 13
    .line 14
    iget v2, p0, Lfb1;->k:F

    .line 15
    .line 16
    iget p0, p0, Lfb1;->l:F

    .line 17
    .line 18
    invoke-interface {p1}, Luq;->t()Lo8;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v3}, Lo8;->h()J

    .line 23
    .line 24
    .line 25
    move-result-wide v4

    .line 26
    invoke-virtual {v3}, Lo8;->f()Lbd;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    invoke-interface {v6}, Lbd;->i()V

    .line 31
    .line 32
    .line 33
    :try_start_0
    iget-object v6, v3, Lo8;->a:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v6, Lx1;

    .line 36
    .line 37
    const-wide/16 v7, 0x0

    .line 38
    .line 39
    invoke-virtual {v6, v2, p0, v7, v8}, Lx1;->s(FFJ)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p1}, Lay;->a(Luq;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3}, Lo8;->f()Lbd;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-interface {p0}, Lbd;->g()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3, v4, v5}, Lo8;->q(J)V

    .line 53
    .line 54
    .line 55
    return-object v1

    .line 56
    :catchall_0
    move-exception p0

    .line 57
    invoke-virtual {v3}, Lo8;->f()Lbd;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-interface {p1}, Lbd;->g()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3, v4, v5}, Lo8;->q(J)V

    .line 65
    .line 66
    .line 67
    throw p0

    .line 68
    :pswitch_0
    check-cast p1, Lbb1;

    .line 69
    .line 70
    const/4 p1, 0x1

    .line 71
    iput-boolean p1, p0, Lfb1;->d:Z

    .line 72
    .line 73
    iget-object p0, p0, Lfb1;->f:Lhw;

    .line 74
    .line 75
    invoke-interface {p0}, Lhw;->invoke()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    return-object v1

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
