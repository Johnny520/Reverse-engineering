.class public final Lxp1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Laa0;


# instance fields
.field public final synthetic a:Lmb3;

.field public final synthetic b:I

.field public final synthetic c:Landroid/view/Window;


# direct methods
.method public constructor <init>(Lmb3;ILandroid/view/Window;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxp1;->a:Lmb3;

    .line 5
    .line 6
    iput p2, p0, Lxp1;->b:I

    .line 7
    .line 8
    iput-object p3, p0, Lxp1;->c:Landroid/view/Window;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    .line 1
    iget-object v0, p0, Lxp1;->a:Lmb3;

    .line 2
    .line 3
    iget-object v0, v0, Lmb3;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ldf3;

    .line 6
    .line 7
    iget v1, p0, Lxp1;->b:I

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ldf3;->d(I)V

    .line 10
    .line 11
    .line 12
    iget v1, v0, Ldf3;->a:I

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    const/16 v3, 0x207

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    iget-object v0, v0, Ldf3;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Landroid/view/WindowInsetsController;

    .line 23
    .line 24
    invoke-static {v0, v3}, Lce3;->q(Landroid/view/WindowInsetsController;I)V

    .line 25
    .line 26
    .line 27
    goto :goto_2

    .line 28
    :pswitch_0
    move v1, v2

    .line 29
    :goto_0
    const/16 v4, 0x200

    .line 30
    .line 31
    if-gt v1, v4, :cond_4

    .line 32
    .line 33
    and-int v4, v3, v1

    .line 34
    .line 35
    if-nez v4, :cond_0

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    if-eq v1, v2, :cond_3

    .line 39
    .line 40
    const/4 v4, 0x2

    .line 41
    if-eq v1, v4, :cond_2

    .line 42
    .line 43
    const/16 v4, 0x8

    .line 44
    .line 45
    if-eq v1, v4, :cond_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    iget-object v4, v0, Ldf3;->c:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v4, Lhh1;

    .line 51
    .line 52
    iget-object v4, v4, Lhh1;->i:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v4, Lhh1;

    .line 55
    .line 56
    invoke-virtual {v4}, Lhh1;->G()V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    invoke-virtual {v0, v4}, Ldf3;->g(I)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    const/4 v4, 0x4

    .line 65
    invoke-virtual {v0, v4}, Ldf3;->g(I)V

    .line 66
    .line 67
    .line 68
    const/16 v4, 0x400

    .line 69
    .line 70
    iget-object v5, v0, Ldf3;->b:Landroid/view/Window;

    .line 71
    .line 72
    invoke-virtual {v5, v4}, Landroid/view/Window;->clearFlags(I)V

    .line 73
    .line 74
    .line 75
    :goto_1
    shl-int/lit8 v1, v1, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_4
    :goto_2
    iget-object p0, p0, Lxp1;->c:Landroid/view/Window;

    .line 79
    .line 80
    invoke-static {p0, v2}, Lrd3;->a(Landroid/view/Window;Z)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
