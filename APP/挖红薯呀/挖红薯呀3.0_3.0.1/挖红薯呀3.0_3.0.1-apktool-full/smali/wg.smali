.class public final synthetic Lwg;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lv90;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ltop/anjao2024/xp1whs/MainActivity;


# direct methods
.method public synthetic constructor <init>(Ltop/anjao2024/xp1whs/MainActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lwg;->d:I

    .line 2
    .line 3
    iput-object p1, p0, Lwg;->e:Ltop/anjao2024/xp1whs/MainActivity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final e(Lx90;Lq90;)V
    .locals 1

    .line 1
    iget v0, p0, Lwg;->d:I

    .line 2
    .line 3
    iget-object p0, p0, Lwg;->e:Ltop/anjao2024/xp1whs/MainActivity;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p0, p1, p2}, Lgh;->c(Ltop/anjao2024/xp1whs/MainActivity;Lx90;Lq90;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    sget-object p1, Lq90;->ON_STOP:Lq90;

    .line 13
    .line 14
    if-ne p2, p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->cancelPendingInputEvents()V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
