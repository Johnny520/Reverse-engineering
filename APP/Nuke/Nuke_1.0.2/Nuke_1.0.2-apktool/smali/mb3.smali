.class public final Lmb3;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/view/ViewStructure;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, Lmb3;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/Window;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lhh1;

    .line 5
    .line 6
    invoke-direct {v0, p2}, Lhh1;-><init>(Landroid/view/View;)V

    .line 7
    .line 8
    .line 9
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v1, 0x23

    .line 12
    .line 13
    if-lt p2, v1, :cond_0

    .line 14
    .line 15
    new-instance p2, Lef3;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-direct {p2, p1, v0, v1}, Ldf3;-><init>(Landroid/view/Window;Lhh1;I)V

    .line 19
    .line 20
    .line 21
    iput-object p2, p0, Lmb3;->a:Ljava/lang/Object;

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    const/16 v1, 0x1e

    .line 25
    .line 26
    if-lt p2, v1, :cond_1

    .line 27
    .line 28
    new-instance p2, Ldf3;

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    invoke-direct {p2, p1, v0, v1}, Ldf3;-><init>(Landroid/view/Window;Lhh1;I)V

    .line 32
    .line 33
    .line 34
    iput-object p2, p0, Lmb3;->a:Ljava/lang/Object;

    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    new-instance p2, Ldf3;

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-direct {p2, p1, v0, v1}, Ldf3;-><init>(Landroid/view/Window;Lhh1;I)V

    .line 41
    .line 42
    .line 43
    iput-object p2, p0, Lmb3;->a:Ljava/lang/Object;

    .line 44
    .line 45
    return-void
.end method

.method public constructor <init>(Lia1;)V
    .locals 1

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lmb3;->a:Ljava/lang/Object;

    return-void
.end method
