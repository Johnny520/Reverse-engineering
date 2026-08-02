.class public final Lxl2;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic l:I

.field public final synthetic m:J

.field public synthetic n:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JLt00;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lxl2;->l:I

    .line 13
    iput-wide p1, p0, Lxl2;->m:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ltw2;-><init>(ILt00;)V

    return-void
.end method

.method public constructor <init>(Lxk1;JLt00;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lxl2;->l:I

    .line 3
    .line 4
    iput-object p1, p0, Lxl2;->n:Ljava/lang/Object;

    .line 5
    .line 6
    iput-wide p2, p0, Lxl2;->m:J

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    invoke-direct {p0, p1, p4}, Ltw2;-><init>(ILt00;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lxl2;->l:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lj20;

    .line 9
    .line 10
    check-cast p2, Lt00;

    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Lxl2;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lxl2;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lxl2;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object v1

    .line 22
    :pswitch_0
    check-cast p1, Lgm2;

    .line 23
    .line 24
    check-cast p2, Lt00;

    .line 25
    .line 26
    invoke-virtual {p0, p2, p1}, Lxl2;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Lxl2;

    .line 31
    .line 32
    invoke-virtual {p0, v1}, Lxl2;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    return-object v1

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final p(Lt00;Ljava/lang/Object;)Lt00;
    .locals 3

    .line 1
    iget v0, p0, Lxl2;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p2, Lxl2;

    .line 7
    .line 8
    iget-object v0, p0, Lxl2;->n:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lxk1;

    .line 11
    .line 12
    iget-wide v1, p0, Lxl2;->m:J

    .line 13
    .line 14
    invoke-direct {p2, v0, v1, v2, p1}, Lxl2;-><init>(Lxk1;JLt00;)V

    .line 15
    .line 16
    .line 17
    return-object p2

    .line 18
    :pswitch_0
    new-instance v0, Lxl2;

    .line 19
    .line 20
    iget-wide v1, p0, Lxl2;->m:J

    .line 21
    .line 22
    invoke-direct {v0, v1, v2, p1}, Lxl2;-><init>(JLt00;)V

    .line 23
    .line 24
    .line 25
    iput-object p2, v0, Lxl2;->n:Ljava/lang/Object;

    .line 26
    .line 27
    return-object v0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lxl2;->l:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    iget-wide v2, p0, Lxl2;->m:J

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lxl2;->n:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lxk1;

    .line 13
    .line 14
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lz22;

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    invoke-interface {p0, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    new-instance p1, Lz22;

    .line 30
    .line 31
    invoke-direct {p1, v2, v3}, Lz22;-><init>(J)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p0, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-object v1

    .line 38
    :pswitch_0
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object p0, p0, Lxl2;->n:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p0, Lgm2;

    .line 44
    .line 45
    iget-object p0, p0, Lgm2;->a:Lim2;

    .line 46
    .line 47
    iget-object p1, p0, Lim2;->k:Lkl2;

    .line 48
    .line 49
    const/4 v0, 0x1

    .line 50
    invoke-virtual {p0, p1, v2, v3, v0}, Lim2;->c(Lkl2;JI)J

    .line 51
    .line 52
    .line 53
    return-object v1

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
