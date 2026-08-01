.class public final Lxhss/ᲁᛲᛴᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᛳᲁᲇᛸ:Lxhss/ᲁᛲᛴᛴ;


# instance fields
.field public volatile ᛱᛱᛲᲇ:Lxhss/ᲁᛲᛴᛴ;

.field public volatile ᛷᛵᛵᲈ:Ljava/lang/Thread;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lxhss/ᲁᛲᛴᛴ;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lxhss/ᲁᛲᛴᛴ;->ᛳᲁᲇᛸ:Lxhss/ᲁᛲᛴᛴ;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lxhss/ᲈᛲᛵᲁ;->ᲀᲇᛳᲁ:Lxhss/ᛵᛵᛲᲈ;

    .line 5
    .line 6
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, p0, v1}, Lxhss/ᛵᛵᛲᲈ;->ᛸᛲᛷᛱ(Lxhss/ᲁᛲᛴᛴ;Ljava/lang/Thread;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
