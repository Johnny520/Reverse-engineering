.class public final Lcj0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Ljava/util/ArrayList;

.field public final β:Lji0;

.field public final γ:Ljava/util/ArrayList;

.field public δ:I

.field public ε:Z

.field public ζ:Z

.field public η:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public θ:Ljava/util/concurrent/ScheduledFuture;

.field public ι:Lhi0;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Lji0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcj0;->α:Ljava/util/ArrayList;

    .line 5
    .line 6
    iput-object p2, p0, Lcj0;->β:Lji0;

    .line 7
    .line 8
    new-instance p2, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-direct {p2, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, Lcj0;->γ:Ljava/util/ArrayList;

    .line 18
    .line 19
    return-void
.end method
