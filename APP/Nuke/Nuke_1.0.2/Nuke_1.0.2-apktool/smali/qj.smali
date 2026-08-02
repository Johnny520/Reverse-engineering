.class public abstract Lqj;
.super Ldw;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final mLoader:Lpj;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ldw;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lpj;

    .line 5
    .line 6
    const-class v1, Lqj;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1}, Lpj;-><init>(Ljava/lang/ClassLoader;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lqj;->mLoader:Lpj;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public getClassLoader()Ljava/lang/ClassLoader;
    .locals 0

    .line 1
    iget-object p0, p0, Lqj;->mLoader:Lpj;

    .line 2
    .line 3
    return-object p0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ldw;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Llg3;->a(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Landroid/app/Activity;->onRestoreInstanceState(Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    const-string v0, "android:viewHierarchyState"

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Lqj;->mLoader:Lpj;

    .line 16
    .line 17
    invoke-virtual {p1, p0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 5

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget v0, v0, Landroid/content/res/Configuration;->uiMode:I

    .line 13
    .line 14
    and-int/lit8 v0, v0, 0x30

    .line 15
    .line 16
    const/16 v1, 0x20

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    move v0, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    new-instance v3, Lhh1;

    .line 37
    .line 38
    invoke-direct {v3, p0}, Lhh1;-><init>(Landroid/view/View;)V

    .line 39
    .line 40
    .line 41
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 42
    .line 43
    const/16 v4, 0x23

    .line 44
    .line 45
    if-lt p0, v4, :cond_1

    .line 46
    .line 47
    new-instance p0, Lef3;

    .line 48
    .line 49
    const/4 v4, 0x1

    .line 50
    invoke-direct {p0, v1, v3, v4}, Ldf3;-><init>(Landroid/view/Window;Lhh1;I)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    const/16 v4, 0x1e

    .line 55
    .line 56
    if-lt p0, v4, :cond_2

    .line 57
    .line 58
    new-instance p0, Ldf3;

    .line 59
    .line 60
    const/4 v4, 0x1

    .line 61
    invoke-direct {p0, v1, v3, v4}, Ldf3;-><init>(Landroid/view/Window;Lhh1;I)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    new-instance p0, Ldf3;

    .line 66
    .line 67
    const/4 v4, 0x0

    .line 68
    invoke-direct {p0, v1, v3, v4}, Ldf3;-><init>(Landroid/view/Window;Lhh1;I)V

    .line 69
    .line 70
    .line 71
    :goto_1
    xor-int/2addr v0, v2

    .line 72
    invoke-virtual {p0, v0}, Ldf3;->c(Z)V

    .line 73
    .line 74
    .line 75
    return-void
.end method
