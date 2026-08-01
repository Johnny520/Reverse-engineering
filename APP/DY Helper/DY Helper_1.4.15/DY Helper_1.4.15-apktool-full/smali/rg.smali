.class public final Lrg;
.super Lm01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic α:I

.field public final synthetic β:Ltg;

.field public final synthetic γ:I

.field public final synthetic δ:Ljava/lang/String;

.field public final synthetic ε:Ljava/lang/String;

.field public final synthetic ζ:Z


# direct methods
.method public synthetic constructor <init>(Ltg;ILjava/lang/String;Ljava/lang/String;ZI)V
    .locals 0

    .line 1
    iput p6, p0, Lrg;->α:I

    .line 2
    .line 3
    iput-object p1, p0, Lrg;->β:Ltg;

    .line 4
    .line 5
    iput p2, p0, Lrg;->γ:I

    .line 6
    .line 7
    iput-object p3, p0, Lrg;->δ:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p4, p0, Lrg;->ε:Ljava/lang/String;

    .line 10
    .line 11
    iput-boolean p5, p0, Lrg;->ζ:Z

    .line 12
    .line 13
    invoke-direct {p0}, Lm01;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lk01;)V
    .locals 6

    .line 1
    iget v0, p0, Lrg;->α:I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object p1, p1, Lk01;->β:Ljava/lang/Object;

    .line 10
    .line 11
    instance-of v0, p1, Landroid/view/View;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    check-cast p1, Landroid/view/View;

    .line 16
    .line 17
    :goto_0
    move-object v1, p1

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    goto :goto_0

    .line 21
    :goto_1
    if-nez v1, :cond_1

    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_1
    iget-object p1, p0, Lrg;->δ:Ljava/lang/String;

    .line 25
    .line 26
    const-string v0, " attached"

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    iget-object v4, p0, Lrg;->ε:Ljava/lang/String;

    .line 33
    .line 34
    iget-boolean v5, p0, Lrg;->ζ:Z

    .line 35
    .line 36
    iget-object v0, p0, Lrg;->β:Ltg;

    .line 37
    .line 38
    iget v2, p0, Lrg;->γ:I

    .line 39
    .line 40
    invoke-virtual/range {v0 .. v5}, Ltg;->в(Landroid/view/View;ILjava/lang/String;Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    :goto_2
    return-void

    .line 44
    :pswitch_0
    iget-object p1, p1, Lk01;->β:Ljava/lang/Object;

    .line 45
    .line 46
    instance-of v0, p1, Landroid/view/View;

    .line 47
    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    check-cast p1, Landroid/view/View;

    .line 51
    .line 52
    :goto_3
    move-object v1, p1

    .line 53
    goto :goto_4

    .line 54
    :cond_2
    const/4 p1, 0x0

    .line 55
    goto :goto_3

    .line 56
    :goto_4
    if-nez v1, :cond_3

    .line 57
    .line 58
    goto :goto_5

    .line 59
    :cond_3
    iget-object p1, p0, Lrg;->δ:Ljava/lang/String;

    .line 60
    .line 61
    const-string v0, " constructor"

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    iget-object v4, p0, Lrg;->ε:Ljava/lang/String;

    .line 68
    .line 69
    iget-boolean v5, p0, Lrg;->ζ:Z

    .line 70
    .line 71
    iget-object v0, p0, Lrg;->β:Ltg;

    .line 72
    .line 73
    iget v2, p0, Lrg;->γ:I

    .line 74
    .line 75
    invoke-virtual/range {v0 .. v5}, Ltg;->в(Landroid/view/View;ILjava/lang/String;Ljava/lang/String;Z)V

    .line 76
    .line 77
    .line 78
    :goto_5
    return-void

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
