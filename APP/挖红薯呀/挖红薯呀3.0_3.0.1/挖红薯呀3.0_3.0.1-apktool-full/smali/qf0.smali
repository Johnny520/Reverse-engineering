.class public final synthetic Lqf0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lqf0;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lqf0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lqf0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget v0, p0, Lqf0;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lqf0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Lqf0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Landroid/widget/Button;

    .line 11
    .line 12
    check-cast v1, Lm90;

    .line 13
    .line 14
    invoke-static {p0, v1, p1}, Lm90;->d(Landroid/widget/Button;Lm90;Landroid/view/View;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    check-cast p0, Landroid/widget/Button;

    .line 19
    .line 20
    check-cast v1, Lc2;

    .line 21
    .line 22
    invoke-static {p0, v1, p1}, Lc2;->c(Landroid/widget/Button;Lc2;Landroid/view/View;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    check-cast p0, Lvf0$a;

    .line 27
    .line 28
    check-cast v1, Ljava/util/List;

    .line 29
    .line 30
    invoke-static {p0, v1, p1}, Lvf0;->l0(Lvf0$a;Ljava/util/List;Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
