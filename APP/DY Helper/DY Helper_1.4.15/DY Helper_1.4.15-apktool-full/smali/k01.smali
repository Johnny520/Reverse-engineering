.class public final Lk01;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Ljava/lang/reflect/Executable;

.field public final β:Ljava/lang/Object;

.field public final γ:[Ljava/lang/Object;

.field public final δ:Ljava/util/concurrent/ConcurrentHashMap;

.field public ε:Ljava/lang/Object;

.field public ζ:Ljava/lang/Throwable;

.field public η:Z


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Executable;Ljava/lang/Object;[Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lk01;->α:Ljava/lang/reflect/Executable;

    .line 8
    .line 9
    iput-object p2, p0, Lk01;->β:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lk01;->γ:[Ljava/lang/Object;

    .line 12
    .line 13
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lk01;->δ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final α(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk01;->ε:Ljava/lang/Object;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lk01;->ζ:Ljava/lang/Throwable;

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Lk01;->η:Z

    .line 8
    .line 9
    return-void
.end method
