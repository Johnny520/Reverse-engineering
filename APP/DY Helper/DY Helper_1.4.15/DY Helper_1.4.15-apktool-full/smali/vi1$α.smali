.class public final Lvi1$α;
.super Lfz;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvi1;->onActivityPreCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lwi1;


# direct methods
.method public constructor <init>(Lwi1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lvi1$α;->this$0:Lwi1;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onActivityPostResumed(Landroid/app/Activity;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lvi1$α;->this$0:Lwi1;

    .line 5
    .line 6
    iget p1, p0, Lwi1;->ζ:I

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    add-int/2addr p1, v0

    .line 10
    iput p1, p0, Lwi1;->ζ:I

    .line 11
    .line 12
    if-ne p1, v0, :cond_1

    .line 13
    .line 14
    iget-boolean p1, p0, Lwi1;->η:Z

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    iget-object p1, p0, Lwi1;->κ:Ljr0;

    .line 19
    .line 20
    sget-object v0, Lbr0;->ON_RESUME:Lbr0;

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Ljr0;->δ(Lbr0;)V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    iput-boolean p1, p0, Lwi1;->η:Z

    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    iget-object p1, p0, Lwi1;->ι:Landroid/os/Handler;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, Lwi1;->λ:Lν;

    .line 35
    .line 36
    invoke-virtual {p1, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    return-void
.end method

.method public onActivityPostStarted(Landroid/app/Activity;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lvi1$α;->this$0:Lwi1;

    .line 5
    .line 6
    iget p1, p0, Lwi1;->ε:I

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    add-int/2addr p1, v0

    .line 10
    iput p1, p0, Lwi1;->ε:I

    .line 11
    .line 12
    if-ne p1, v0, :cond_0

    .line 13
    .line 14
    iget-boolean p1, p0, Lwi1;->θ:Z

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    iget-object p1, p0, Lwi1;->κ:Ljr0;

    .line 19
    .line 20
    sget-object v0, Lbr0;->ON_START:Lbr0;

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Ljr0;->δ(Lbr0;)V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    iput-boolean p1, p0, Lwi1;->θ:Z

    .line 27
    .line 28
    :cond_0
    return-void
.end method
