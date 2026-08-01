.class public final Lk4;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lno;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lk4;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lk4;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget v0, p0, Lk4;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Lk4;->b:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p0, Lb91;

    .line 10
    .line 11
    invoke-virtual {p0}, Lb91;->i()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    check-cast p0, Ly70;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, Ly70;->f:Z

    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_1
    check-cast p0, Ld80;

    .line 22
    .line 23
    iget-object v0, p0, Ld80;->c:Ld50;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    iput-boolean v2, v0, Ld50;->a:Z

    .line 29
    .line 30
    :cond_0
    iput-object v1, p0, Ld80;->c:Ld50;

    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_2
    check-cast p0, Lm70;

    .line 34
    .line 35
    iput-object v1, p0, Lm70;->d:Lmh;

    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_3
    check-cast p0, Lzn;

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 41
    .line 42
    .line 43
    iget-object p0, p0, Lzn;->k:Lwn;

    .line 44
    .line 45
    iget-object v0, p0, Lr;->f:Lwe1;

    .line 46
    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    invoke-virtual {v0}, Lwe1;->d()V

    .line 50
    .line 51
    .line 52
    :cond_1
    iput-object v1, p0, Lr;->f:Lwe1;

    .line 53
    .line 54
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :pswitch_4
    check-cast p0, Lqo;

    .line 59
    .line 60
    iget-object p0, p0, Lqo;->e:Lro;

    .line 61
    .line 62
    invoke-virtual {p0}, Lro;->invoke()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
