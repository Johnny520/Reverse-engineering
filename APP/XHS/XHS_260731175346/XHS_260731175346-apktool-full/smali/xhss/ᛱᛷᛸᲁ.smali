.class public final enum Lxhss/ᛱᛷᛸᲁ;
.super Ljava/lang/Enum;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final enum ᛱᛱᛲᲇ:Lxhss/ᛱᛷᛸᲁ;

.field public static final enum ᛳᲁᲇᛸ:Lxhss/ᛱᛷᛸᲁ;

.field public static final enum ᛷᛴᛷᛱ:Lxhss/ᛱᛷᛸᲁ;

.field public static final synthetic ᲀᲇᛳᲁ:[Lxhss/ᛱᛷᛸᲁ;

.field public static final enum ᲇᛴᲇᛵ:Lxhss/ᛱᛷᛸᲁ;

.field public static final enum ᲇᛶᛴᲀ:Lxhss/ᛱᛷᛸᲁ;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lxhss/ᛱᛷᛸᲁ;

    .line 2
    .line 3
    const-string v1, "DESTROYED"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lxhss/ᛱᛷᛸᲁ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛷᛸᲁ;

    .line 10
    .line 11
    new-instance v1, Lxhss/ᛱᛷᛸᲁ;

    .line 12
    .line 13
    const-string v2, "INITIALIZED"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lxhss/ᛱᛷᛸᲁ;->ᛳᲁᲇᛸ:Lxhss/ᛱᛷᛸᲁ;

    .line 20
    .line 21
    new-instance v2, Lxhss/ᛱᛷᛸᲁ;

    .line 22
    .line 23
    const-string v3, "CREATED"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v2, Lxhss/ᛱᛷᛸᲁ;->ᲇᛴᲇᛵ:Lxhss/ᛱᛷᛸᲁ;

    .line 30
    .line 31
    new-instance v3, Lxhss/ᛱᛷᛸᲁ;

    .line 32
    .line 33
    const-string v4, "STARTED"

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v3, Lxhss/ᛱᛷᛸᲁ;->ᛷᛴᛷᛱ:Lxhss/ᛱᛷᛸᲁ;

    .line 40
    .line 41
    new-instance v4, Lxhss/ᛱᛷᛸᲁ;

    .line 42
    .line 43
    const-string v5, "RESUMED"

    .line 44
    .line 45
    const/4 v6, 0x4

    .line 46
    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v4, Lxhss/ᛱᛷᛸᲁ;->ᲇᛶᛴᲀ:Lxhss/ᛱᛷᛸᲁ;

    .line 50
    .line 51
    filled-new-array {v0, v1, v2, v3, v4}, [Lxhss/ᛱᛷᛸᲁ;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, Lxhss/ᛱᛷᛸᲁ;->ᲀᲇᛳᲁ:[Lxhss/ᛱᛷᛸᲁ;

    .line 56
    .line 57
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lxhss/ᛱᛷᛸᲁ;
    .locals 1

    .line 1
    const-class v0, Lxhss/ᛱᛷᛸᲁ;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lxhss/ᛱᛷᛸᲁ;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lxhss/ᛱᛷᛸᲁ;
    .locals 1

    .line 1
    sget-object v0, Lxhss/ᛱᛷᛸᲁ;->ᲀᲇᛳᲁ:[Lxhss/ᛱᛷᛸᲁ;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lxhss/ᛱᛷᛸᲁ;

    .line 8
    .line 9
    return-object v0
.end method
