.class public final Lme;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lme;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lme;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lme;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    iget p1, p0, Lme;->a:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p1, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lme;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Landroid/app/Activity;

    .line 10
    .line 11
    iget-object p0, p0, Lme;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, [Lw6;

    .line 14
    .line 15
    aget-object p0, p0, v0

    .line 16
    .line 17
    invoke-static {p1, p0}, Lcom/mr/elaris/w;->d(Landroid/content/Context;Lw6;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    iget-object p1, p0, Lme;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p1, [Z

    .line 24
    .line 25
    aget-boolean p1, p1, v0

    .line 26
    .line 27
    if-nez p1, :cond_0

    .line 28
    .line 29
    iget-object p0, p0, Lme;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p0, Lve;

    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    iput-boolean p1, p0, Lve;->a:Z

    .line 35
    .line 36
    iget-object p0, p0, Lve;->b:Ljava/lang/Thread;

    .line 37
    .line 38
    if-eqz p0, :cond_0

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 41
    .line 42
    .line 43
    :cond_0
    return-void

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
