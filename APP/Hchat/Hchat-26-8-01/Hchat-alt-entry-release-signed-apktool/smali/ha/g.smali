.class public final Lha/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lha/c0;

.field public final b:Lp8/v;

.field public final c:Lha/t;

.field public final d:J

.field public final e:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public volatile f:I

.field public volatile g:Ljava/util/concurrent/ScheduledFuture;


# direct methods
.method public constructor <init>(Lha/c0;Lp8/v;Lha/t;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lha/g;->a:Lha/c0;

    .line 5
    .line 6
    iput-object p2, p0, Lha/g;->b:Lp8/v;

    .line 7
    .line 8
    iput-object p3, p0, Lha/g;->c:Lha/t;

    .line 9
    .line 10
    iput-wide p4, p0, Lha/g;->d:J

    .line 11
    .line 12
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lha/g;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 19
    .line 20
    return-void
.end method
