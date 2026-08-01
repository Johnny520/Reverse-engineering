.class public final synthetic Lhf1;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lhw;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Lkf1;

.field public final synthetic f:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Lkf1;Landroid/app/Activity;I)V
    .locals 0

    .line 1
    iput p3, p0, Lhf1;->d:I

    .line 2
    .line 3
    iput-object p1, p0, Lhf1;->e:Lkf1;

    .line 4
    .line 5
    iput-object p2, p0, Lhf1;->f:Landroid/app/Activity;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lhf1;->d:I

    .line 2
    .line 3
    iget-object v1, p0, Lhf1;->f:Landroid/app/Activity;

    .line 4
    .line 5
    iget-object p0, p0, Lhf1;->e:Lkf1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static {p0, v1}, Lkf1;->w(Lkf1;Landroid/app/Activity;)Lna1;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    invoke-static {p0, v1}, Lkf1;->i(Lkf1;Landroid/app/Activity;)Lna1;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
