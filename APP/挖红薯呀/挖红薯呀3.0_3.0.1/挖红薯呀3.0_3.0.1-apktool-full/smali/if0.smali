.class public final synthetic Lif0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Lsw;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lsw;I)V
    .locals 0

    .line 1
    iput p3, p0, Lif0;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lif0;->b:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p2, p0, Lif0;->c:Lsw;

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
    .locals 1

    .line 1
    iget v0, p0, Lif0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lif0;->b:Landroid/content/Context;

    .line 7
    .line 8
    iget-object p0, p0, Lif0;->c:Lsw;

    .line 9
    .line 10
    invoke-static {v0, p0, p1}, Lvf0;->B(Landroid/content/Context;Lsw;Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object v0, p0, Lif0;->b:Landroid/content/Context;

    .line 15
    .line 16
    iget-object p0, p0, Lif0;->c:Lsw;

    .line 17
    .line 18
    invoke-static {v0, p0, p1}, Lvf0;->J0(Landroid/content/Context;Lsw;Landroid/view/View;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_1
    iget-object v0, p0, Lif0;->b:Landroid/content/Context;

    .line 23
    .line 24
    iget-object p0, p0, Lif0;->c:Lsw;

    .line 25
    .line 26
    invoke-static {v0, p0, p1}, Lvf0;->f0(Landroid/content/Context;Lsw;Landroid/view/View;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
