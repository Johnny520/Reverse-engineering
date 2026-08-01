.class public final synthetic Lvy;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Landroid/app/Dialog;I)V
    .locals 0

    .line 1
    iput p4, p0, Lvy;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lvy;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lvy;->d:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lvy;->b:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 13
    iput p4, p0, Lvy;->a:I

    iput-object p1, p0, Lvy;->b:Ljava/lang/Object;

    iput-object p2, p0, Lvy;->c:Ljava/lang/Object;

    iput-object p3, p0, Lvy;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget v0, p0, Lvy;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lvy;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lvy;->d:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object p0, p0, Lvy;->c:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, Landroid/widget/EditText;

    .line 13
    .line 14
    check-cast v2, Landroid/content/SharedPreferences;

    .line 15
    .line 16
    check-cast v1, Landroid/app/Dialog;

    .line 17
    .line 18
    invoke-static {p0, v2, v1, p1}, Lvf0;->I0(Landroid/widget/EditText;Landroid/content/SharedPreferences;Landroid/app/Dialog;Landroid/view/View;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    check-cast v1, Lyt0;

    .line 23
    .line 24
    check-cast p0, Lxt0;

    .line 25
    .line 26
    check-cast v2, Landroid/content/Context;

    .line 27
    .line 28
    invoke-static {v1, p0, v2, p1}, Lvf0;->p(Lyt0;Lxt0;Landroid/content/Context;Landroid/view/View;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_1
    check-cast p0, Landroid/content/Context;

    .line 33
    .line 34
    check-cast v2, Lxt0;

    .line 35
    .line 36
    check-cast v1, Landroid/app/Dialog;

    .line 37
    .line 38
    invoke-static {p0, v2, v1, p1}, Lvf0;->v0(Landroid/content/Context;Lxt0;Landroid/app/Dialog;Landroid/view/View;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_2
    check-cast v1, Landroid/app/Dialog;

    .line 43
    .line 44
    check-cast p0, Lsw;

    .line 45
    .line 46
    check-cast v2, Landroid/view/View;

    .line 47
    .line 48
    invoke-static {v1, p0, v2, p1}, Lwy;->h(Landroid/app/Dialog;Lsw;Landroid/view/View;Landroid/view/View;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
