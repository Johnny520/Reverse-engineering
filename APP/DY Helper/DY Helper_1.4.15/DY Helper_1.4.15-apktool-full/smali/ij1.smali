.class public final synthetic Lij1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# instance fields
.field public final synthetic ε:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroidx/profileinstaller/ProfileInstallerInitializer;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lij1;->ε:Landroid/content/Context;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final doFrame(J)V
    .locals 3

    .line 1
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Landroid/os/Handler;->createAsync(Landroid/os/Looper;)Landroid/os/Handler;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance p2, Ljava/util/Random;

    .line 10
    .line 11
    invoke-direct {p2}, Ljava/util/Random;-><init>()V

    .line 12
    .line 13
    .line 14
    const/16 v0, 0x3e8

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {p2, v0}, Ljava/util/Random;->nextInt(I)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    new-instance v0, Lr4;

    .line 26
    .line 27
    iget-object p0, p0, Lij1;->ε:Landroid/content/Context;

    .line 28
    .line 29
    invoke-direct {v0, p0, v1}, Lr4;-><init>(Landroid/content/Context;I)V

    .line 30
    .line 31
    .line 32
    add-int/lit16 p2, p2, 0x1388

    .line 33
    .line 34
    int-to-long v1, p2

    .line 35
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 36
    .line 37
    .line 38
    return-void
.end method
