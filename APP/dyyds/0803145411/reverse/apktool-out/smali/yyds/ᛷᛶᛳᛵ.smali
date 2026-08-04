.class public final Lyyds/ᛷᛶᛳᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final synthetic ᛵᛸᛸᛷ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile synthetic notCompletedCount$volatile:I

.field public final ᛲᲈᲁ:[Lyyds/ᛷᲇᛴᛵ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Lyyds/ᛷᛶᛳᛵ;

    .line 2
    .line 3
    const-string v1, "notCompletedCount$volatile"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lyyds/ᛷᛶᛳᛵ;->ᛵᛸᛸᛷ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>([Lyyds/ᛷᲇᛴᛵ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛷᛶᛳᛵ;->ᛲᲈᲁ:[Lyyds/ᛷᲇᛴᛵ;

    .line 5
    .line 6
    array-length p1, p1

    .line 7
    iput p1, p0, Lyyds/ᛷᛶᛳᛵ;->notCompletedCount$volatile:I

    .line 8
    .line 9
    return-void
.end method
