.class public final Lg8/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lo8/d;

.field public final b:Lg8/d;

.field public final c:Lg1/d;

.field public final d:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public volatile e:Z


# direct methods
.method public constructor <init>(Lo8/d;Lg8/d;Lg1/d;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lg8/g;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 10
    .line 11
    iput-object p1, p0, Lg8/g;->a:Lo8/d;

    .line 12
    .line 13
    iput-object p2, p0, Lg8/g;->b:Lg8/d;

    .line 14
    .line 15
    iput-object p3, p0, Lg8/g;->c:Lg1/d;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a(Lg8/f;)La2/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lg8/g;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->addIfAbsent(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    new-instance p1, La2/a;

    .line 7
    .line 8
    const/16 v0, 0xe

    .line 9
    .line 10
    invoke-direct {p1, v0}, La2/a;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-object p1
.end method
