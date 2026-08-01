.class public final synthetic Lmf1;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Llf1;


# direct methods
.method public synthetic constructor <init>(Llf1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lmf1;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lmf1;->b:Llf1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final binderDied()V
    .locals 1

    .line 1
    iget v0, p0, Lmf1;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lmf1;->b:Llf1;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, Lof1;->b:Ltop/anjao2024/xp1whs/App;

    .line 9
    .line 10
    invoke-interface {v0, p0}, Lnf1;->b(Llf1;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    sget-object v0, Lof1;->b:Ltop/anjao2024/xp1whs/App;

    .line 15
    .line 16
    invoke-interface {v0, p0}, Lnf1;->b(Llf1;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
