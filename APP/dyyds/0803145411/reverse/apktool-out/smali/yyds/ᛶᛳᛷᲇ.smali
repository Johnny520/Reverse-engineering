.class public final Lyyds/ᛶᛳᛷᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᛴᛳᛲ:Ljava/util/concurrent/locks/ReentrantLock;

.field public final ᛲᲈᲁ:Ljava/util/concurrent/locks/ReentrantLock;

.field public final ᛵᛸᛸᛷ:[J

.field public final ᲀᛲᛳᲀ:[Z

.field public volatile ᲇᲇᲇᛱ:Z

.field public volatile ᲇᲈᛵᛷ:Z


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lyyds/ᛶᛳᛷᲇ;->ᛲᲈᲁ:Ljava/util/concurrent/locks/ReentrantLock;

    .line 10
    .line 11
    new-array v0, p1, [J

    .line 12
    .line 13
    iput-object v0, p0, Lyyds/ᛶᛳᛷᲇ;->ᛵᛸᛸᛷ:[J

    .line 14
    .line 15
    new-array p1, p1, [Z

    .line 16
    .line 17
    iput-object p1, p0, Lyyds/ᛶᛳᛷᲇ;->ᲀᛲᛳᲀ:[Z

    .line 18
    .line 19
    new-instance p1, Ljava/util/concurrent/locks/ReentrantLock;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lyyds/ᛶᛳᛷᲇ;->ᛲᛴᛳᛲ:Ljava/util/concurrent/locks/ReentrantLock;

    .line 25
    .line 26
    return-void
.end method
