.class public final synthetic Lff1;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lzt0;

.field public final synthetic c:Lkf1;


# direct methods
.method public synthetic constructor <init>(Lzt0;Lkf1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lff1;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lff1;->b:Lzt0;

    .line 4
    .line 5
    iput-object p2, p0, Lff1;->c:Lkf1;

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
    iget v0, p0, Lff1;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lff1;->c:Lkf1;

    .line 4
    .line 5
    iget-object p0, p0, Lff1;->b:Lzt0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static {p0, v1, p1}, Lkf1;->b(Lzt0;Lkf1;Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    invoke-static {p0, v1, p1}, Lkf1;->f(Lzt0;Lkf1;Landroid/view/View;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
