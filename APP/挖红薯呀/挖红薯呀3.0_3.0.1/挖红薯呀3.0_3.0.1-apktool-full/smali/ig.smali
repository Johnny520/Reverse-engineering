.class public final synthetic Lig;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Landroid/app/Dialog;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Dialog;Ljava/util/List;Landroid/content/Context;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lig;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lig;->d:Landroid/app/Dialog;

    .line 8
    .line 9
    iput-object p2, p0, Lig;->c:Ljava/util/List;

    .line 10
    .line 11
    iput-object p3, p0, Lig;->b:Landroid/content/Context;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Ljava/util/List;Landroid/app/Dialog;I)V
    .locals 0

    .line 14
    iput p4, p0, Lig;->a:I

    iput-object p1, p0, Lig;->b:Landroid/content/Context;

    iput-object p2, p0, Lig;->c:Ljava/util/List;

    iput-object p3, p0, Lig;->d:Landroid/app/Dialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget v0, p0, Lig;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lig;->b:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v2, p0, Lig;->c:Ljava/util/List;

    .line 6
    .line 7
    iget-object p0, p0, Lig;->d:Landroid/app/Dialog;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-static {p0, v2, v1, p1}, Lob0;->c(Landroid/app/Dialog;Ljava/util/List;Landroid/content/Context;Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    invoke-static {p0, v2, v1, p1}, Lmg;->c(Landroid/app/Dialog;Ljava/util/List;Landroid/content/Context;Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_1
    invoke-static {p0, v2, v1, p1}, Lmg;->t(Landroid/app/Dialog;Ljava/util/List;Landroid/content/Context;Landroid/view/View;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_2
    invoke-static {p0, v2, v1, p1}, Lmg;->i(Landroid/app/Dialog;Ljava/util/List;Landroid/content/Context;Landroid/view/View;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
