.class public final synthetic Lrf0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lhw;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Landroid/app/Dialog;

.field public final synthetic f:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Dialog;Landroid/content/Context;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lrf0;->d:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lrf0;->f:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p1, p0, Lrf0;->e:Landroid/app/Dialog;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;ILandroid/app/Dialog;)V
    .locals 0

    .line 12
    iput p2, p0, Lrf0;->d:I

    iput-object p3, p0, Lrf0;->e:Landroid/app/Dialog;

    iput-object p1, p0, Lrf0;->f:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lrf0;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lrf0;->f:Landroid/content/Context;

    .line 7
    .line 8
    iget-object p0, p0, Lrf0;->e:Landroid/app/Dialog;

    .line 9
    .line 10
    invoke-static {p0, v0}, Lvf0;->N(Landroid/app/Dialog;Landroid/content/Context;)Lna1;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    iget-object v0, p0, Lrf0;->e:Landroid/app/Dialog;

    .line 16
    .line 17
    iget-object p0, p0, Lrf0;->f:Landroid/content/Context;

    .line 18
    .line 19
    invoke-static {v0, p0}, Lvf0;->d0(Landroid/app/Dialog;Landroid/content/Context;)Lna1;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :pswitch_1
    iget-object v0, p0, Lrf0;->e:Landroid/app/Dialog;

    .line 25
    .line 26
    iget-object p0, p0, Lrf0;->f:Landroid/content/Context;

    .line 27
    .line 28
    invoke-static {v0, p0}, Lvf0;->x0(Landroid/app/Dialog;Landroid/content/Context;)Lna1;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :pswitch_2
    iget-object v0, p0, Lrf0;->e:Landroid/app/Dialog;

    .line 34
    .line 35
    iget-object p0, p0, Lrf0;->f:Landroid/content/Context;

    .line 36
    .line 37
    invoke-static {v0, p0}, Lvf0;->L(Landroid/app/Dialog;Landroid/content/Context;)Lna1;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
