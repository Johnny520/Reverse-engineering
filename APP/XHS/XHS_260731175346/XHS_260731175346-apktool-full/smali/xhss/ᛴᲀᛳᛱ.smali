.class public final Lxhss/ᛴᲀᛳᛱ;
.super Lxhss/ᛷᲁᲇᛷ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final synthetic ᛳᲁᲇᛸ:J


# instance fields
.field private volatile synthetic _resumed$volatile:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 2
    .line 3
    const-class v1, Lxhss/ᛴᲀᛳᛱ;

    .line 4
    .line 5
    const-string v2, "_resumed$volatile"

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    sput-wide v0, Lxhss/ᛴᲀᛳᛱ;->ᛳᲁᲇᛸ:J

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Lxhss/ᛲᛶᛳᲁ;Ljava/lang/Throwable;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p3}, Lxhss/ᛷᲁᲇᛷ;-><init>(Ljava/lang/Throwable;Z)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput p1, p0, Lxhss/ᛴᲀᛳᛱ;->_resumed$volatile:I

    .line 6
    .line 7
    return-void
.end method
