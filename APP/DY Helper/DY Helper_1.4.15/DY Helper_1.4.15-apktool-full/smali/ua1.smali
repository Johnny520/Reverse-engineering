.class public final enum Lua1;
.super Ljava/lang/Enum;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final enum ζ:Lua1;

.field public static final enum η:Lua1;

.field public static final enum θ:Lua1;

.field public static final enum ι:Lua1;

.field public static final enum κ:Lua1;

.field public static final synthetic λ:[Lua1;


# instance fields
.field public final ε:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lua1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "invalid_food_id"

    .line 5
    .line 6
    const-string v3, "INVALID_FOOD_ID"

    .line 7
    .line 8
    invoke-direct {v0, v1, v3, v2}, Lua1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lua1;->ζ:Lua1;

    .line 12
    .line 13
    new-instance v1, Lua1;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    const-string v3, "food_not_in_catalog"

    .line 17
    .line 18
    const-string v4, "FOOD_NOT_IN_CATALOG"

    .line 19
    .line 20
    invoke-direct {v1, v2, v4, v3}, Lua1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lua1;->η:Lua1;

    .line 24
    .line 25
    new-instance v2, Lua1;

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    const-string v4, "price_missing"

    .line 29
    .line 30
    const-string v5, "PRICE_MISSING"

    .line 31
    .line 32
    invoke-direct {v2, v3, v5, v4}, Lua1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v2, Lua1;->θ:Lua1;

    .line 36
    .line 37
    new-instance v3, Lua1;

    .line 38
    .line 39
    const/4 v4, 0x3

    .line 40
    const-string v5, "price_above_limit"

    .line 41
    .line 42
    const-string v6, "PRICE_ABOVE_LIMIT"

    .line 43
    .line 44
    invoke-direct {v3, v4, v6, v5}, Lua1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v3, Lua1;->ι:Lua1;

    .line 48
    .line 49
    new-instance v4, Lua1;

    .line 50
    .line 51
    const/4 v5, 0x4

    .line 52
    const-string v6, "closeness_missing"

    .line 53
    .line 54
    const-string v7, "CLOSENESS_MISSING"

    .line 55
    .line 56
    invoke-direct {v4, v5, v7, v6}, Lua1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v4, Lua1;->κ:Lua1;

    .line 60
    .line 61
    filled-new-array {v0, v1, v2, v3, v4}, [Lua1;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sput-object v0, Lua1;->λ:[Lua1;

    .line 66
    .line 67
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lua1;->ε:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lua1;
    .locals 1

    .line 1
    const-class v0, Lua1;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lua1;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lua1;
    .locals 1

    .line 1
    sget-object v0, Lua1;->λ:[Lua1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lua1;

    .line 8
    .line 9
    return-object v0
.end method
