.class public final synthetic Lkb;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:Z


# direct methods
.method public synthetic constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lkb;->ε:Z

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-boolean p0, p0, Lkb;->ε:Z

    .line 2
    .line 3
    sget-object v0, Lsb;->ψ:Ljava/lang/ref/WeakReference;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Landroid/app/Activity;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v1

    .line 16
    :goto_0
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    :cond_1
    sget-boolean v0, Lsb;->ν:Z

    .line 29
    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_2
    sget-object v0, Lsb;->α:Lsb;

    .line 34
    .line 35
    invoke-virtual {v0}, Lsb;->θ()V

    .line 36
    .line 37
    .line 38
    if-eqz p0, :cond_3

    .line 39
    .line 40
    new-instance p0, Lo7;

    .line 41
    .line 42
    const/16 v0, 0xd

    .line 43
    .line 44
    invoke-direct {p0, v0}, Lo7;-><init>(I)V

    .line 45
    .line 46
    .line 47
    invoke-static {p0}, Lsb;->Ψ(Lp70;)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_3
    if-eqz v1, :cond_4

    .line 52
    .line 53
    invoke-static {v1}, Lsb;->а(Landroid/view/View;)V

    .line 54
    .line 55
    .line 56
    :cond_4
    invoke-static {}, Lsb;->β()V

    .line 57
    .line 58
    .line 59
    :goto_1
    sget-object p0, Ls62;->α:Ls62;

    .line 60
    .line 61
    return-object p0
.end method
