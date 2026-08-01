.class public abstract Lg20;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Landroid/os/Handler;

.field public static final β:Ljava/util/WeakHashMap;

.field public static γ:Z

.field public static final δ:Lcom/example/dyhelper/hook/β;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lg20;->α:Landroid/os/Handler;

    .line 11
    .line 12
    new-instance v0, Ljava/util/WeakHashMap;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lg20;->β:Ljava/util/WeakHashMap;

    .line 18
    .line 19
    new-instance v0, Lcom/example/dyhelper/hook/β;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {v0, v1}, Lcom/example/dyhelper/hook/β;-><init>(I)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lg20;->δ:Lcom/example/dyhelper/hook/β;

    .line 26
    .line 27
    return-void
.end method
