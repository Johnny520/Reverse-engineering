.class public abstract enum Lnet/bytebuddy/matcher/StringMatcher$Mode;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/matcher/StringMatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4409
    name = "Mode"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/matcher/StringMatcher$Mode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/matcher/StringMatcher$Mode;

.field public static final enum CONTAINS:Lnet/bytebuddy/matcher/StringMatcher$Mode;

.field public static final enum CONTAINS_IGNORE_CASE:Lnet/bytebuddy/matcher/StringMatcher$Mode;

.field public static final enum ENDS_WITH:Lnet/bytebuddy/matcher/StringMatcher$Mode;

.field public static final enum ENDS_WITH_IGNORE_CASE:Lnet/bytebuddy/matcher/StringMatcher$Mode;

.field public static final enum EQUALS_FULLY:Lnet/bytebuddy/matcher/StringMatcher$Mode;

.field public static final enum EQUALS_FULLY_IGNORE_CASE:Lnet/bytebuddy/matcher/StringMatcher$Mode;

.field public static final enum MATCHES:Lnet/bytebuddy/matcher/StringMatcher$Mode;

.field public static final enum STARTS_WITH:Lnet/bytebuddy/matcher/StringMatcher$Mode;

.field public static final enum STARTS_WITH_IGNORE_CASE:Lnet/bytebuddy/matcher/StringMatcher$Mode;


# instance fields
.field private final description:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 20

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/StringMatcher$Mode$1;

    .line 2
    .line 3
    const-string v1, "equals"

    .line 4
    .line 5
    const-string v2, "EQUALS_FULLY"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v2, v3, v1}, Lnet/bytebuddy/matcher/StringMatcher$Mode$1;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lnet/bytebuddy/matcher/StringMatcher$Mode;->EQUALS_FULLY:Lnet/bytebuddy/matcher/StringMatcher$Mode;

    .line 12
    .line 13
    new-instance v1, Lnet/bytebuddy/matcher/StringMatcher$Mode$2;

    .line 14
    .line 15
    const-string v2, "equalsIgnoreCase"

    .line 16
    .line 17
    const-string v4, "EQUALS_FULLY_IGNORE_CASE"

    .line 18
    .line 19
    const/4 v5, 0x1

    .line 20
    invoke-direct {v1, v4, v5, v2}, Lnet/bytebuddy/matcher/StringMatcher$Mode$2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lnet/bytebuddy/matcher/StringMatcher$Mode;->EQUALS_FULLY_IGNORE_CASE:Lnet/bytebuddy/matcher/StringMatcher$Mode;

    .line 24
    .line 25
    new-instance v2, Lnet/bytebuddy/matcher/StringMatcher$Mode$3;

    .line 26
    .line 27
    const-string v4, "startsWith"

    .line 28
    .line 29
    const-string v6, "STARTS_WITH"

    .line 30
    .line 31
    const/4 v7, 0x2

    .line 32
    invoke-direct {v2, v6, v7, v4}, Lnet/bytebuddy/matcher/StringMatcher$Mode$3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v2, Lnet/bytebuddy/matcher/StringMatcher$Mode;->STARTS_WITH:Lnet/bytebuddy/matcher/StringMatcher$Mode;

    .line 36
    .line 37
    new-instance v4, Lnet/bytebuddy/matcher/StringMatcher$Mode$4;

    .line 38
    .line 39
    const-string v6, "startsWithIgnoreCase"

    .line 40
    .line 41
    const-string v8, "STARTS_WITH_IGNORE_CASE"

    .line 42
    .line 43
    const/4 v9, 0x3

    .line 44
    invoke-direct {v4, v8, v9, v6}, Lnet/bytebuddy/matcher/StringMatcher$Mode$4;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v4, Lnet/bytebuddy/matcher/StringMatcher$Mode;->STARTS_WITH_IGNORE_CASE:Lnet/bytebuddy/matcher/StringMatcher$Mode;

    .line 48
    .line 49
    new-instance v6, Lnet/bytebuddy/matcher/StringMatcher$Mode$5;

    .line 50
    .line 51
    const-string v8, "endsWith"

    .line 52
    .line 53
    const-string v10, "ENDS_WITH"

    .line 54
    .line 55
    const/4 v11, 0x4

    .line 56
    invoke-direct {v6, v10, v11, v8}, Lnet/bytebuddy/matcher/StringMatcher$Mode$5;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v6, Lnet/bytebuddy/matcher/StringMatcher$Mode;->ENDS_WITH:Lnet/bytebuddy/matcher/StringMatcher$Mode;

    .line 60
    .line 61
    new-instance v8, Lnet/bytebuddy/matcher/StringMatcher$Mode$6;

    .line 62
    .line 63
    const-string v10, "endsWithIgnoreCase"

    .line 64
    .line 65
    const-string v12, "ENDS_WITH_IGNORE_CASE"

    .line 66
    .line 67
    const/4 v13, 0x5

    .line 68
    invoke-direct {v8, v12, v13, v10}, Lnet/bytebuddy/matcher/StringMatcher$Mode$6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sput-object v8, Lnet/bytebuddy/matcher/StringMatcher$Mode;->ENDS_WITH_IGNORE_CASE:Lnet/bytebuddy/matcher/StringMatcher$Mode;

    .line 72
    .line 73
    new-instance v10, Lnet/bytebuddy/matcher/StringMatcher$Mode$7;

    .line 74
    .line 75
    const-string v12, "contains"

    .line 76
    .line 77
    const-string v14, "CONTAINS"

    .line 78
    .line 79
    const/4 v15, 0x6

    .line 80
    invoke-direct {v10, v14, v15, v12}, Lnet/bytebuddy/matcher/StringMatcher$Mode$7;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    sput-object v10, Lnet/bytebuddy/matcher/StringMatcher$Mode;->CONTAINS:Lnet/bytebuddy/matcher/StringMatcher$Mode;

    .line 84
    .line 85
    new-instance v12, Lnet/bytebuddy/matcher/StringMatcher$Mode$8;

    .line 86
    .line 87
    const-string v14, "containsIgnoreCase"

    .line 88
    .line 89
    move/from16 v16, v3

    .line 90
    .line 91
    const-string v3, "CONTAINS_IGNORE_CASE"

    .line 92
    .line 93
    move/from16 v17, v5

    .line 94
    .line 95
    const/4 v5, 0x7

    .line 96
    invoke-direct {v12, v3, v5, v14}, Lnet/bytebuddy/matcher/StringMatcher$Mode$8;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 97
    .line 98
    .line 99
    sput-object v12, Lnet/bytebuddy/matcher/StringMatcher$Mode;->CONTAINS_IGNORE_CASE:Lnet/bytebuddy/matcher/StringMatcher$Mode;

    .line 100
    .line 101
    new-instance v3, Lnet/bytebuddy/matcher/StringMatcher$Mode$9;

    .line 102
    .line 103
    const-string v14, "matches"

    .line 104
    .line 105
    move/from16 v18, v5

    .line 106
    .line 107
    const-string v5, "MATCHES"

    .line 108
    .line 109
    move/from16 v19, v7

    .line 110
    .line 111
    const/16 v7, 0x8

    .line 112
    .line 113
    invoke-direct {v3, v5, v7, v14}, Lnet/bytebuddy/matcher/StringMatcher$Mode$9;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 114
    .line 115
    .line 116
    sput-object v3, Lnet/bytebuddy/matcher/StringMatcher$Mode;->MATCHES:Lnet/bytebuddy/matcher/StringMatcher$Mode;

    .line 117
    .line 118
    const/16 v5, 0x9

    .line 119
    .line 120
    new-array v5, v5, [Lnet/bytebuddy/matcher/StringMatcher$Mode;

    .line 121
    .line 122
    aput-object v0, v5, v16

    .line 123
    .line 124
    aput-object v1, v5, v17

    .line 125
    .line 126
    aput-object v2, v5, v19

    .line 127
    .line 128
    aput-object v4, v5, v9

    .line 129
    .line 130
    aput-object v6, v5, v11

    .line 131
    .line 132
    aput-object v8, v5, v13

    .line 133
    .line 134
    aput-object v10, v5, v15

    .line 135
    .line 136
    aput-object v12, v5, v18

    .line 137
    .line 138
    aput-object v3, v5, v7

    .line 139
    .line 140
    sput-object v5, Lnet/bytebuddy/matcher/StringMatcher$Mode;->$VALUES:[Lnet/bytebuddy/matcher/StringMatcher$Mode;

    .line 141
    .line 142
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lnet/bytebuddy/matcher/StringMatcher$Mode;->description:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;Lnet/bytebuddy/matcher/StringMatcher$1;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2, p3}, Lnet/bytebuddy/matcher/StringMatcher$Mode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/matcher/StringMatcher$Mode;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/matcher/StringMatcher$Mode;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/matcher/StringMatcher$Mode;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/matcher/StringMatcher$Mode;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/matcher/StringMatcher$Mode;->$VALUES:[Lnet/bytebuddy/matcher/StringMatcher$Mode;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/matcher/StringMatcher$Mode;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/matcher/StringMatcher$Mode;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public getDescription()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/matcher/StringMatcher$Mode;->description:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public abstract matches(Ljava/lang/String;Ljava/lang/String;)Z
.end method
