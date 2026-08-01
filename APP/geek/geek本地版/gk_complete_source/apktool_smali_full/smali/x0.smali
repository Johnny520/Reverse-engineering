.class public final Lx0;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lx0;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lx0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget p1, p0, Lx0;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lx0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Landroidx/appcompat/widget/Toolbar;

    .line 9
    .line 10
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->L:Lf70;

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object p1, p1, Lf70;->b:Lou;

    .line 17
    .line 18
    :goto_0
    if-eqz p1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, Lou;->collapseActionView()Z

    .line 21
    .line 22
    .line 23
    :cond_1
    return-void

    .line 24
    :pswitch_0
    iget-object p1, p0, Lx0;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Lut;

    .line 27
    .line 28
    iget v0, p1, Lut;->V:I

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    const/4 v2, 0x2

    .line 32
    if-ne v0, v2, :cond_2

    .line 33
    .line 34
    invoke-virtual {p1, v1}, Lut;->E(I)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    if-ne v0, v1, :cond_3

    .line 39
    .line 40
    invoke-virtual {p1, v2}, Lut;->E(I)V

    .line 41
    .line 42
    .line 43
    :cond_3
    :goto_1
    return-void

    .line 44
    :pswitch_1
    iget-object p1, p0, Lx0;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Le2;

    .line 47
    .line 48
    iget-object v0, p1, Le2;->v:Lc2;

    .line 49
    .line 50
    const/4 v1, 0x1

    .line 51
    iget-object p1, p1, Le2;->b:Lg2;

    .line 52
    .line 53
    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :pswitch_2
    iget-object p1, p0, Lx0;->b:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p1, Ln1;

    .line 64
    .line 65
    invoke-virtual {p1}, Ln1;->a()V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
