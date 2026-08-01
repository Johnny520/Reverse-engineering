.class public final synthetic Lmw0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lcom/example/dyhelper/ui/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/example/dyhelper/ui/MainActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lmw0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lmw0;->ζ:Lcom/example/dyhelper/ui/MainActivity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lmw0;->ε:I

    .line 2
    .line 3
    iget-object p0, p0, Lmw0;->ζ:Lcom/example/dyhelper/ui/MainActivity;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget v0, Lcom/example/dyhelper/ui/MainActivity;->η:I

    .line 9
    .line 10
    new-instance v0, Landroid/content/ComponentName;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const-string v2, ".ui.LauncherAlias"

    .line 21
    .line 22
    invoke-static {p0, v2}, Lnx;->θ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-direct {v0, v1, p0}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_0
    sget v0, Lcom/example/dyhelper/ui/MainActivity;->η:I

    .line 31
    .line 32
    new-instance v0, Llw0;

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    invoke-direct {v0, p0, v1}, Llw0;-><init>(Lcom/example/dyhelper/ui/MainActivity;I)V

    .line 36
    .line 37
    .line 38
    return-object v0

    .line 39
    :pswitch_1
    sget v0, Lcom/example/dyhelper/ui/MainActivity;->η:I

    .line 40
    .line 41
    new-instance v0, Landroid/content/Intent;

    .line 42
    .line 43
    const-class v1, Lcom/example/dyhelper/ui/AboutActivity;

    .line 44
    .line 45
    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 49
    .line 50
    .line 51
    sget-object p0, Ls62;->α:Ls62;

    .line 52
    .line 53
    return-object p0

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
