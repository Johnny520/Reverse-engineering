.class public final synthetic Lw60;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lx60;


# direct methods
.method public synthetic constructor <init>(Lx60;I)V
    .locals 0

    .line 1
    iput p2, p0, Lw60;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lw60;->i:Lx60;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lw60;->h:I

    .line 2
    .line 3
    iget-object p0, p0, Lw60;->i:Lx60;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, Lsa2;->a:Lmy;

    .line 9
    .line 10
    invoke-static {p0, v0}, Lp40;->p(Lgy;Le42;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lpa2;

    .line 15
    .line 16
    sget-object p0, Ltp0;->l:Loa2;

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_0
    sget-object v0, Lsa2;->a:Lmy;

    .line 20
    .line 21
    invoke-static {p0, v0}, Lp40;->p(Lgy;Le42;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lpa2;

    .line 26
    .line 27
    iget-object v1, p0, Lx60;->B:Lua;

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Lu60;->N0(Lt60;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    const/4 v0, 0x0

    .line 37
    iput-object v0, p0, Lx60;->B:Lua;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    if-nez v1, :cond_2

    .line 41
    .line 42
    new-instance v5, Ln4;

    .line 43
    .line 44
    const/16 v0, 0xa

    .line 45
    .line 46
    invoke-direct {v5, v0, p0}, Ln4;-><init>(ILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    new-instance v6, Lw60;

    .line 50
    .line 51
    const/4 v0, 0x1

    .line 52
    invoke-direct {v6, p0, v0}, Lw60;-><init>(Lx60;I)V

    .line 53
    .line 54
    .line 55
    iget-object v2, p0, Lx60;->x:Lbk1;

    .line 56
    .line 57
    iget-boolean v3, p0, Lx60;->y:Z

    .line 58
    .line 59
    iget v4, p0, Lx60;->z:F

    .line 60
    .line 61
    sget-object v0, Lta2;->a:Lm43;

    .line 62
    .line 63
    new-instance v1, Lua;

    .line 64
    .line 65
    invoke-direct/range {v1 .. v6}, Lua;-><init>(Lbk1;ZFLn4;Lw60;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v1}, Lu60;->M0(Lt60;)Lt60;

    .line 69
    .line 70
    .line 71
    iput-object v1, p0, Lx60;->B:Lua;

    .line 72
    .line 73
    :cond_2
    :goto_0
    sget-object p0, La83;->a:La83;

    .line 74
    .line 75
    return-object p0

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
