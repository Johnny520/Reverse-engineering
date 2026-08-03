.class public final Ly2/j;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ly2/x;


# direct methods
.method public synthetic constructor <init>(Ly2/x;I)V
    .locals 0

    .line 1
    iput p2, p0, Ly2/j;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Ly2/j;->h:Ly2/x;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Ly2/j;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lfg/a;

    .line 7
    .line 8
    iget-object v0, p0, Ly2/j;->h:Ly2/x;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v1, 0x0

    .line 22
    :goto_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    if-ne v1, v2, :cond_1

    .line 27
    .line 28
    invoke-interface {p1}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    new-instance v1, Lb0/c;

    .line 39
    .line 40
    const/16 v2, 0x8

    .line 41
    .line 42
    invoke-direct {v1, p1, v2}, Lb0/c;-><init>(Lfg/a;I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 46
    .line 47
    .line 48
    :cond_2
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_0
    check-cast p1, Lu2/l;

    .line 52
    .line 53
    iget-wide v0, p1, Lu2/l;->a:J

    .line 54
    .line 55
    new-instance p1, Lu2/l;

    .line 56
    .line 57
    invoke-direct {p1, v0, v1}, Lu2/l;-><init>(J)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Ly2/j;->h:Ly2/x;

    .line 61
    .line 62
    invoke-virtual {v0, p1}, Ly2/x;->setPopupContentSize-fhxjrPA(Lu2/l;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ly2/x;->r()V

    .line 66
    .line 67
    .line 68
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 69
    .line 70
    return-object p1

    .line 71
    :pswitch_1
    check-cast p1, Lv1/t;

    .line 72
    .line 73
    invoke-interface {p1}, Lv1/t;->b0()Lv1/t;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    iget-object v0, p0, Ly2/j;->h:Ly2/x;

    .line 81
    .line 82
    invoke-virtual {v0, p1}, Ly2/x;->q(Lv1/t;)V

    .line 83
    .line 84
    .line 85
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 86
    .line 87
    return-object p1

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
