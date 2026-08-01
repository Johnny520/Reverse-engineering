.class public final Lxhss/ᛲᲁᲁᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᛱᛱᛲᲇ:Lxhss/ᛴᛷᛱ;

.field public static final ᛳᲁᲇᛸ:Lxhss/ᛴᛷᛱ;

.field public static final ᛷᛵᛵᲈ:Lxhss/ᛲᲁᲁᲁ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide v0, -0xd42b1b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    new-instance v0, Lxhss/ᛲᲁᲁᲁ;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lxhss/ᛲᲁᲁᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛲᲁᲁᲁ;

    .line 15
    .line 16
    new-instance v0, Lxhss/ᛴᛶᛲᛶ;

    .line 17
    .line 18
    const/4 v1, 0x3

    .line 19
    invoke-direct {v0, v1}, Lxhss/ᛴᛶᛲᛶ;-><init>(I)V

    .line 20
    .line 21
    .line 22
    new-instance v1, Lxhss/ᛴᛷᛱ;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Lxhss/ᛴᛷᛱ;-><init>(Lxhss/ᛱᛳᲇᛶ;)V

    .line 25
    .line 26
    .line 27
    sput-object v1, Lxhss/ᛲᲁᲁᲁ;->ᛱᛱᛲᲇ:Lxhss/ᛴᛷᛱ;

    .line 28
    .line 29
    new-instance v0, Lxhss/ᛴᛶᛲᛶ;

    .line 30
    .line 31
    const/4 v1, 0x4

    .line 32
    invoke-direct {v0, v1}, Lxhss/ᛴᛶᛲᛶ;-><init>(I)V

    .line 33
    .line 34
    .line 35
    new-instance v1, Lxhss/ᛴᛷᛱ;

    .line 36
    .line 37
    invoke-direct {v1, v0}, Lxhss/ᛴᛷᛱ;-><init>(Lxhss/ᛱᛳᲇᛶ;)V

    .line 38
    .line 39
    .line 40
    sput-object v1, Lxhss/ᛲᲁᲁᲁ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛷᛱ;

    .line 41
    .line 42
    return-void
.end method

.method public static ᛱᛱᛲᲇ()Lcom/tencent/mmkv/MMKV;
    .locals 1

    .line 1
    sget-object v0, Lxhss/ᛲᲁᲁᲁ;->ᛱᛱᛲᲇ:Lxhss/ᛴᛷᛱ;

    .line 2
    .line 3
    invoke-virtual {v0}, Lxhss/ᛴᛷᛱ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/tencent/mmkv/MMKV;

    .line 8
    .line 9
    return-object v0
.end method

.method public static ᛷᛵᛵᲈ()Lcom/tencent/mmkv/MMKV;
    .locals 1

    .line 1
    sget-object v0, Lxhss/ᛲᲁᲁᲁ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛷᛱ;

    .line 2
    .line 3
    invoke-virtual {v0}, Lxhss/ᛴᛷᛱ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/tencent/mmkv/MMKV;

    .line 8
    .line 9
    return-object v0
.end method
