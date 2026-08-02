.class public final Lp93;
.super Lw51;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Lq93;


# direct methods
.method public synthetic constructor <init>(Lq93;I)V
    .locals 0

    .line 1
    iput p2, p0, Lp93;->i:I

    .line 2
    .line 3
    iput-object p1, p0, Lp93;->j:Lq93;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lw51;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lp93;->i:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    iget-object p0, p0, Lp93;->j:Lq93;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Lnc0;

    .line 11
    .line 12
    iget-object v0, p0, Lq93;->b:Lar0;

    .line 13
    .line 14
    iget v2, p0, Lq93;->k:F

    .line 15
    .line 16
    iget p0, p0, Lq93;->l:F

    .line 17
    .line 18
    invoke-interface {p1}, Lnc0;->E()Lb5;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v3}, Lb5;->u()J

    .line 23
    .line 24
    .line 25
    move-result-wide v4

    .line 26
    invoke-virtual {v3}, Lb5;->q()Lqp;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    invoke-interface {v6}, Lqp;->l()V

    .line 31
    .line 32
    .line 33
    :try_start_0
    iget-object v6, v3, Lb5;->i:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v6, Ln4;

    .line 36
    .line 37
    const-wide/16 v7, 0x0

    .line 38
    .line 39
    invoke-virtual {v6, v2, p0, v7, v8}, Ln4;->A(FFJ)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p1}, Lar0;->a(Lnc0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    invoke-static {v3, v4, v5}, Lvi0;->r(Lb5;J)V

    .line 46
    .line 47
    .line 48
    return-object v1

    .line 49
    :catchall_0
    move-exception p0

    .line 50
    invoke-static {v3, v4, v5}, Lvi0;->r(Lb5;J)V

    .line 51
    .line 52
    .line 53
    throw p0

    .line 54
    :pswitch_0
    check-cast p1, Li93;

    .line 55
    .line 56
    const/4 p1, 0x1

    .line 57
    iput-boolean p1, p0, Lq93;->d:Z

    .line 58
    .line 59
    iget-object p0, p0, Lq93;->f:Lxm0;

    .line 60
    .line 61
    invoke-interface {p0}, Lxm0;->a()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    return-object v1

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
