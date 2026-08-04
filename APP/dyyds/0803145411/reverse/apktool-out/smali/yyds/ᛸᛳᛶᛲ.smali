.class public final Lyyds/ᛸᛳᛶᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᲀᛲᛳᲀ:Lyyds/ᛶᛶᛷᲁ;


# instance fields
.field public final ᛲᲈᲁ:Lyyds/ᛷᛲᲇᲀ;

.field public final ᛵᛸᛸᛷ:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lyyds/ᛶᛶᛷᲁ;

    .line 2
    .line 3
    new-instance v1, Lyyds/ᛴᲁᛷᲀ;

    .line 4
    .line 5
    sget-object v5, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 6
    .line 7
    new-instance v6, Lyyds/ᲀᛴᛱᛷ;

    .line 8
    .line 9
    const/4 v2, 0x5

    .line 10
    invoke-direct {v6, v2}, Lyyds/ᲀᛴᛱᛷ;-><init>(I)V

    .line 11
    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    const-class v2, Ljava/lang/Object;

    .line 15
    .line 16
    move-object v3, v2

    .line 17
    move-object v4, v2

    .line 18
    invoke-direct/range {v1 .. v7}, Lyyds/ᛴᲁᛷᲀ;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/List;Lyyds/ᛸᛷᲀᛵ;Lyyds/ᛴᲀᲇᛱ;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    const/4 v5, 0x0

    .line 26
    move-object v1, v2

    .line 27
    move-object v3, v1

    .line 28
    invoke-direct/range {v0 .. v5}, Lyyds/ᛶᛶᛷᲁ;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/List;Lyyds/ᛴᲀᲇᛱ;)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lyyds/ᛸᛳᛶᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛶᛷᲁ;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lyyds/ᛷᛲᲇᲀ;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Lyyds/ᛴᲈᛲᛷ;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lyyds/ᛸᛳᛶᛲ;->ᛲᲈᲁ:Lyyds/ᛷᛲᲇᲀ;

    .line 11
    .line 12
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lyyds/ᛸᛳᛶᛲ;->ᛵᛸᛸᛷ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 18
    .line 19
    return-void
.end method
