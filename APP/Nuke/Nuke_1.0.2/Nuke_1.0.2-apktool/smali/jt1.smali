.class public final Ljt1;
.super Lhm1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final d:Lfj;

.field public e:Z


# direct methods
.method public constructor <init>(Lfj;Lkt1;)V
    .locals 1

    .line 1
    iget-boolean v0, p1, Lfj;->b:Z

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lhm1;->a:Lt11;

    .line 7
    .line 8
    iput-boolean v0, p0, Lhm1;->b:Z

    .line 9
    .line 10
    iput-object p1, p0, Ljt1;->d:Lfj;

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    iput-boolean p1, p0, Ljt1;->e:Z

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object p0, p0, Ljt1;->d:Lfj;

    .line 2
    .line 3
    iget v0, p0, Lfj;->d:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :pswitch_0
    iget-object p0, p0, Lfj;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lv3;

    .line 12
    .line 13
    invoke-virtual {p0}, Lv3;->e()V

    .line 14
    .line 15
    .line 16
    :goto_0
    return-void

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b()V
    .locals 1

    .line 1
    iget-object p0, p0, Ljt1;->d:Lfj;

    .line 2
    .line 3
    iget v0, p0, Lfj;->d:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lfj;->e:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lg8;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Lg8;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :pswitch_0
    iget-object p0, p0, Lfj;->e:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Lv3;

    .line 19
    .line 20
    invoke-virtual {p0}, Lv3;->f()V

    .line 21
    .line 22
    .line 23
    :goto_0
    return-void

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Lem1;)V
    .locals 1

    .line 1
    new-instance v0, Ldj;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ldj;-><init>(Lem1;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ljt1;->d:Lfj;

    .line 7
    .line 8
    iget p1, p0, Lfj;->d:I

    .line 9
    .line 10
    packed-switch p1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :pswitch_0
    iget-object p0, p0, Lfj;->e:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Lv3;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lv3;->g(Ldj;)V

    .line 19
    .line 20
    .line 21
    :goto_0
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Lem1;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldj;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Ldj;-><init>(Lem1;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Ljt1;->d:Lfj;

    .line 10
    .line 11
    iget p1, p0, Lfj;->d:I

    .line 12
    .line 13
    packed-switch p1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :pswitch_0
    iget-object p0, p0, Lfj;->e:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Lv3;

    .line 20
    .line 21
    invoke-virtual {p0}, Lv3;->h()V

    .line 22
    .line 23
    .line 24
    :goto_0
    return-void

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Ljt1;->e:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Ljt1;->d:Lfj;

    .line 6
    .line 7
    iget-boolean p1, p1, Lfj;->b:Z

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    invoke-virtual {p0, p1}, Lhm1;->f(Z)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
