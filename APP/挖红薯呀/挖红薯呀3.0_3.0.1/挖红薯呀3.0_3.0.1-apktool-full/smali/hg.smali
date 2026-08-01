.class public final synthetic Lhg;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Landroid/app/Dialog;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Dialog;Landroid/content/Context;)V
    .locals 1

    .line 1
    const/4 v0, 0x7

    .line 2
    iput v0, p0, Lhg;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lhg;->c:Landroid/app/Dialog;

    .line 8
    .line 9
    iput-object p2, p0, Lhg;->b:Landroid/content/Context;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;ILandroid/app/Dialog;)V
    .locals 0

    .line 12
    iput p2, p0, Lhg;->a:I

    iput-object p1, p0, Lhg;->b:Landroid/content/Context;

    iput-object p3, p0, Lhg;->c:Landroid/app/Dialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget v0, p0, Lhg;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lhg;->b:Landroid/content/Context;

    .line 4
    .line 5
    iget-object p0, p0, Lhg;->c:Landroid/app/Dialog;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static {p0, v1, p1}, Lvf0;->A0(Landroid/app/Dialog;Landroid/content/Context;Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    invoke-static {p0, v1, p1}, Lob0;->e(Landroid/app/Dialog;Landroid/content/Context;Landroid/view/View;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_1
    invoke-static {p0, v1, p1}, Lob0;->f(Landroid/app/Dialog;Landroid/content/Context;Landroid/view/View;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_2
    invoke-static {p0, v1, p1}, Lob0;->k(Landroid/app/Dialog;Landroid/content/Context;Landroid/view/View;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_3
    invoke-static {p0, v1, p1}, Lob0;->i(Landroid/app/Dialog;Landroid/content/Context;Landroid/view/View;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_4
    invoke-static {p0, v1, p1}, Lob0;->a(Landroid/app/Dialog;Landroid/content/Context;Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_5
    invoke-static {p0, v1, p1}, Lmg;->u(Landroid/app/Dialog;Landroid/content/Context;Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_6
    invoke-static {p0, v1, p1}, Lmg;->k(Landroid/app/Dialog;Landroid/content/Context;Landroid/view/View;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
