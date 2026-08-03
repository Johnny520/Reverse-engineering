.class public final Lv8/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:Ljava/util/LinkedHashSet;

.field public final e:J

.field public final f:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public final g:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/util/LinkedHashSet;J)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lv8/g;->a:Ljava/lang/String;

    .line 8
    .line 9
    iput p2, p0, Lv8/g;->b:I

    .line 10
    .line 11
    iput-object p3, p0, Lv8/g;->c:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p4, p0, Lv8/g;->d:Ljava/util/LinkedHashSet;

    .line 14
    .line 15
    iput-wide p5, p0, Lv8/g;->e:J

    .line 16
    .line 17
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lv8/g;->f:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 25
    .line 26
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lv8/g;->g:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 34
    .line 35
    return-void
.end method
