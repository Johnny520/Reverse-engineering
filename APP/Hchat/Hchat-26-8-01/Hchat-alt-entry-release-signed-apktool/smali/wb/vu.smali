.class public final synthetic Lwb/vu;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/app/Activity;

.field public final synthetic i:Lfg/a;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lfg/a;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lwb/vu;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/vu;->h:Landroid/app/Activity;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/vu;->i:Lfg/a;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Lxa/m;Landroid/app/Activity;Lfg/a;)V
    .locals 0

    .line 12
    const/4 p1, 0x1

    iput p1, p0, Lwb/vu;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lwb/vu;->h:Landroid/app/Activity;

    iput-object p3, p0, Lwb/vu;->i:Lfg/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lwb/vu;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/vu;->h:Landroid/app/Activity;

    .line 7
    .line 8
    invoke-static {v0}, Lxa/m;->a(Landroid/app/Activity;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lwb/vu;->i:Lfg/a;

    .line 15
    .line 16
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void

    .line 20
    :pswitch_0
    iget-object v0, p0, Lwb/vu;->h:Landroid/app/Activity;

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, Lwb/vu;->i:Lfg/a;

    .line 35
    .line 36
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    :cond_1
    return-void

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
