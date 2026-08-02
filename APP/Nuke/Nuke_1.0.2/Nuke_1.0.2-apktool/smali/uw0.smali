.class public final Luw0;
.super Lww0;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final synthetic d:I

.field public final e:Lyo;


# direct methods
.method public synthetic constructor <init>(Lv82;Let1;Lx00;Lyo;I)V
    .locals 0

    .line 1
    iput p5, p0, Luw0;->d:I

    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3}, Lww0;-><init>(Lv82;Let1;Lx00;)V

    .line 4
    .line 5
    .line 6
    iput-object p4, p0, Luw0;->e:Lyo;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lct1;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Luw0;->d:I

    .line 2
    .line 3
    iget-object p0, p0, Luw0;->e:Lyo;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-interface {p0, p1}, Lyo;->i(Lct1;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lwo;

    .line 13
    .line 14
    array-length p1, p2

    .line 15
    const/4 v0, 0x1

    .line 16
    sub-int/2addr p1, v0

    .line 17
    aget-object p1, p2, p1

    .line 18
    .line 19
    check-cast p1, Lt00;

    .line 20
    .line 21
    :try_start_0
    new-instance p2, Lmp;

    .line 22
    .line 23
    invoke-static {p1}, Lgf1;->z(Lt00;)Lt00;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-direct {p2, v0, v1}, Lmp;-><init>(ILt00;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2}, Lmp;->u()V

    .line 31
    .line 32
    .line 33
    new-instance v0, Lr51;

    .line 34
    .line 35
    const/4 v1, 0x2

    .line 36
    invoke-direct {v0, p0, v1}, Lr51;-><init>(Lwo;I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2, v0}, Lmp;->w(Lin0;)V

    .line 40
    .line 41
    .line 42
    new-instance v0, Llw0;

    .line 43
    .line 44
    const/4 v1, 0x3

    .line 45
    invoke-direct {v0, p2, v1}, Llw0;-><init>(Lmp;I)V

    .line 46
    .line 47
    .line 48
    invoke-interface {p0, v0}, Lwo;->b(Lcp;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p2}, Lmp;->t()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    goto :goto_0

    .line 56
    :catch_0
    move-exception p0

    .line 57
    invoke-static {p0, p1}, Ltp0;->P(Ljava/lang/Throwable;Lt00;)V

    .line 58
    .line 59
    .line 60
    sget-object p0, Lk20;->h:Lk20;

    .line 61
    .line 62
    :goto_0
    return-object p0

    .line 63
    :pswitch_0
    invoke-interface {p0, p1}, Lyo;->i(Lct1;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
