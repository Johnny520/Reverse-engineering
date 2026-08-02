.class public final Lup1;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic l:I

.field public final synthetic m:Lxk1;

.field public final synthetic n:Z


# direct methods
.method public constructor <init>(Lxk1;ZLt00;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lup1;->l:I

    .line 3
    .line 4
    iput-object p1, p0, Lup1;->m:Lxk1;

    .line 5
    .line 6
    iput-boolean p2, p0, Lup1;->n:Z

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    invoke-direct {p0, p1, p3}, Ltw2;-><init>(ILt00;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(ZLxk1;Lt00;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lup1;->l:I

    .line 13
    iput-boolean p1, p0, Lup1;->n:Z

    iput-object p2, p0, Lup1;->m:Lxk1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ltw2;-><init>(ILt00;)V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lup1;->l:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    check-cast p1, Lj20;

    .line 6
    .line 7
    check-cast p2, Lt00;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Lup1;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lup1;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lup1;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object v1

    .line 22
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lup1;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Lup1;

    .line 27
    .line 28
    invoke-virtual {p0, v1}, Lup1;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    return-object v1

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final p(Lt00;Ljava/lang/Object;)Lt00;
    .locals 1

    .line 1
    iget p2, p0, Lup1;->l:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p2, Lup1;

    .line 7
    .line 8
    iget-object v0, p0, Lup1;->m:Lxk1;

    .line 9
    .line 10
    iget-boolean p0, p0, Lup1;->n:Z

    .line 11
    .line 12
    invoke-direct {p2, v0, p0, p1}, Lup1;-><init>(Lxk1;ZLt00;)V

    .line 13
    .line 14
    .line 15
    return-object p2

    .line 16
    :pswitch_0
    new-instance p2, Lup1;

    .line 17
    .line 18
    iget-boolean v0, p0, Lup1;->n:Z

    .line 19
    .line 20
    iget-object p0, p0, Lup1;->m:Lxk1;

    .line 21
    .line 22
    invoke-direct {p2, v0, p0, p1}, Lup1;-><init>(ZLxk1;Lt00;)V

    .line 23
    .line 24
    .line 25
    return-object p2

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lup1;->l:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    iget-object v2, p0, Lup1;->m:Lxk1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v2}, Lgu2;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Lz22;

    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    invoke-interface {v2, p0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-object v1

    .line 26
    :pswitch_0
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-boolean p0, p0, Lup1;->n:Z

    .line 30
    .line 31
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-interface {v2, p0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    return-object v1

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
