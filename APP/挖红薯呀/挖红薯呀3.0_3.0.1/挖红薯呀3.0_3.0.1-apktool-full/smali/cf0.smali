.class public final synthetic Lcf0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Landroid/content/Context;

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(ILandroid/content/Context;II)V
    .locals 0

    .line 1
    iput p4, p0, Lcf0;->d:I

    .line 2
    .line 3
    iput-object p2, p0, Lcf0;->e:Landroid/content/Context;

    .line 4
    .line 5
    iput p1, p0, Lcf0;->f:I

    .line 6
    .line 7
    iput p3, p0, Lcf0;->g:I

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lcf0;->d:I

    .line 2
    .line 3
    iget v1, p0, Lcf0;->g:I

    .line 4
    .line 5
    iget v2, p0, Lcf0;->f:I

    .line 6
    .line 7
    iget-object p0, p0, Lcf0;->e:Landroid/content/Context;

    .line 8
    .line 9
    check-cast p1, Landroid/widget/LinearLayout;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-static {p0, v2, v1, p1}, Lvf0;->k0(Landroid/content/Context;IILandroid/widget/LinearLayout;)Lna1;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :pswitch_0
    invoke-static {p0, v2, v1, p1}, Lvf0;->a(Landroid/content/Context;IILandroid/widget/LinearLayout;)Lna1;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :pswitch_1
    invoke-static {p0, v2, v1, p1}, Lvf0;->X(Landroid/content/Context;IILandroid/widget/LinearLayout;)Lna1;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :pswitch_2
    invoke-static {p0, v2, v1, p1}, Lvf0;->L0(Landroid/content/Context;IILandroid/widget/LinearLayout;)Lna1;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
