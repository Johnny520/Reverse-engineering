.class public abstract Lyyds/ᛴᛷᛴᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛲᛴᛳᛲ:Lyyds/ᛲᛸᛴᛶ;

.field public static final ᛲᲈᲁ:I

.field public static final ᛵᛸᛸᛷ:Lyyds/ᛲᛸᛴᛶ;

.field public static final ᲀᛲᛳᲀ:Lyyds/ᛲᛸᛴᛶ;

.field public static final ᲇᲇᲇᛱ:I

.field public static final ᲇᲈᛵᛷ:Lyyds/ᛲᛸᛴᛶ;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-string v0, "kotlinx.coroutines.semaphore.maxSpinCycles"

    .line 2
    .line 3
    const/16 v1, 0x64

    .line 4
    .line 5
    const/16 v2, 0xc

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lyyds/ᛷᛴᲇᛲ;->ᛱᛳᲇ(Ljava/lang/String;II)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    sput v0, Lyyds/ᛴᛷᛴᲇ;->ᛲᲈᲁ:I

    .line 12
    .line 13
    new-instance v0, Lyyds/ᛲᛸᛴᛶ;

    .line 14
    .line 15
    const-string v1, "PERMIT"

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-direct {v0, v1, v3}, Lyyds/ᛲᛸᛴᛶ;-><init>(Ljava/lang/String;I)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lyyds/ᛴᛷᛴᲇ;->ᛵᛸᛸᛷ:Lyyds/ᛲᛸᛴᛶ;

    .line 22
    .line 23
    new-instance v0, Lyyds/ᛲᛸᛴᛶ;

    .line 24
    .line 25
    const-string v1, "TAKEN"

    .line 26
    .line 27
    invoke-direct {v0, v1, v3}, Lyyds/ᛲᛸᛴᛶ;-><init>(Ljava/lang/String;I)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lyyds/ᛴᛷᛴᲇ;->ᲀᛲᛳᲀ:Lyyds/ᛲᛸᛴᛶ;

    .line 31
    .line 32
    new-instance v0, Lyyds/ᛲᛸᛴᛶ;

    .line 33
    .line 34
    const-string v1, "BROKEN"

    .line 35
    .line 36
    invoke-direct {v0, v1, v3}, Lyyds/ᛲᛸᛴᛶ;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lyyds/ᛴᛷᛴᲇ;->ᲇᲈᛵᛷ:Lyyds/ᛲᛸᛴᛶ;

    .line 40
    .line 41
    new-instance v0, Lyyds/ᛲᛸᛴᛶ;

    .line 42
    .line 43
    const-string v1, "CANCELLED"

    .line 44
    .line 45
    invoke-direct {v0, v1, v3}, Lyyds/ᛲᛸᛴᛶ;-><init>(Ljava/lang/String;I)V

    .line 46
    .line 47
    .line 48
    sput-object v0, Lyyds/ᛴᛷᛴᲇ;->ᛲᛴᛳᛲ:Lyyds/ᛲᛸᛴᛶ;

    .line 49
    .line 50
    const-string v0, "kotlinx.coroutines.semaphore.segmentSize"

    .line 51
    .line 52
    const/16 v1, 0x10

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, Lyyds/ᛷᛴᲇᛲ;->ᛱᛳᲇ(Ljava/lang/String;II)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    sput v0, Lyyds/ᛴᛷᛴᲇ;->ᲇᲇᲇᛱ:I

    .line 59
    .line 60
    return-void
.end method
