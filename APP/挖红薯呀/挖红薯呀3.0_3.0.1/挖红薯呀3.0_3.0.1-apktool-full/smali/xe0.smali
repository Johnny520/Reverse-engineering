.class public final synthetic Lxe0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Lvt0;

.field public final synthetic d:Landroid/content/SharedPreferences;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lvt0;Landroid/content/SharedPreferences;I)V
    .locals 0

    .line 1
    iput p4, p0, Lxe0;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lxe0;->b:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p2, p0, Lxe0;->c:Lvt0;

    .line 6
    .line 7
    iput-object p3, p0, Lxe0;->d:Landroid/content/SharedPreferences;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget v0, p0, Lxe0;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lxe0;->d:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    iget-object v2, p0, Lxe0;->c:Lvt0;

    .line 6
    .line 7
    iget-object p0, p0, Lxe0;->b:Landroid/content/Context;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-static {p0, v2, v1, p1}, Lvf0;->e(Landroid/content/Context;Lvt0;Landroid/content/SharedPreferences;Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    invoke-static {p0, v2, v1, p1}, Lvf0;->g0(Landroid/content/Context;Lvt0;Landroid/content/SharedPreferences;Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_1
    invoke-static {p0, v2, v1, p1}, Lvf0;->u(Landroid/content/Context;Lvt0;Landroid/content/SharedPreferences;Landroid/view/View;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
