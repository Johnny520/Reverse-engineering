.class public final Lyyds/ᛷᛱᛵᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛵᛸᛸᛷ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final ᲀᛲᛳᲀ:Lyyds/ᛷᛱᛵᛱ;


# instance fields
.field public volatile ᛲᲈᲁ:Lyyds/ᛲᲈᲁᛴ;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, Lyyds/ᛲᲈᲁᛴ;

    .line 2
    .line 3
    const-string v1, "\u16f2\u1c88\u1c81"

    .line 4
    .line 5
    const-class v2, Lyyds/ᛷᛱᛵᛱ;

    .line 6
    .line 7
    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lyyds/ᛷᛱᛵᛱ;->ᛵᛸᛸᛷ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 12
    .line 13
    new-instance v0, Lyyds/ᛷᛱᛵᛱ;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lyyds/ᛷᛱᛵᛱ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛱᛵᛱ;

    .line 19
    .line 20
    return-void
.end method
