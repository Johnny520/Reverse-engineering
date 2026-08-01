.class public abstract Lxhss/ᛸᛴᛵᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᛱᛱᛲᲇ:Ljava/util/WeakHashMap;

.field public static final ᛳᲁᲇᛸ:Ljava/lang/Object;

.field public static final ᛷᛵᛵᲈ:Ljava/lang/ThreadLocal;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lxhss/ᛸᛴᛵᛴ;->ᛷᛵᛵᲈ:Ljava/lang/ThreadLocal;

    .line 7
    .line 8
    new-instance v0, Ljava/util/WeakHashMap;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, Ljava/util/WeakHashMap;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lxhss/ᛸᛴᛵᛴ;->ᛱᛱᛲᲇ:Ljava/util/WeakHashMap;

    .line 15
    .line 16
    new-instance v0, Ljava/lang/Object;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lxhss/ᛸᛴᛵᛴ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 22
    .line 23
    return-void
.end method
