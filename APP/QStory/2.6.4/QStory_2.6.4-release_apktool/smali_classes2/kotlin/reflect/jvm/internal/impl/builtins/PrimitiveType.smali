.class public final enum Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

.field private static final synthetic $VALUES:[Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

.field public static final enum BOOLEAN:Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

.field public static final enum BYTE:Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

.field public static final enum CHAR:Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

.field public static final Companion:L飘花落叶言世楪子苏兰哲/飘花落叶言子楪苏哲兰世;

.field public static final enum DOUBLE:Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

.field public static final enum FLOAT:Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

.field public static final enum INT:Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

.field public static final enum LONG:Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

.field public static final NUMBER_TYPES:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum SHORT:Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;


# instance fields
.field private final arrayTypeFqName$delegate:Lkotlin/飘花落叶言子楪苏世哲兰;

.field private final arrayTypeName:Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;

.field private final typeFqName$delegate:Lkotlin/飘花落叶言子楪苏世哲兰;

.field private final typeName:Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;


# direct methods
.method private static final synthetic $values()[Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;
    .locals 8

    .line 1
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;->BOOLEAN:Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

    .line 2
    .line 3
    sget-object v1, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;->CHAR:Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

    .line 4
    .line 5
    sget-object v2, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;->BYTE:Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

    .line 6
    .line 7
    sget-object v3, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;->SHORT:Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

    .line 8
    .line 9
    sget-object v4, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;->INT:Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

    .line 10
    .line 11
    sget-object v5, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;->FLOAT:Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

    .line 12
    .line 13
    sget-object v6, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;->LONG:Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

    .line 14
    .line 15
    sget-object v7, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;->DOUBLE:Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

    .line 16
    .line 17
    filled-new-array/range {v0 .. v7}, [Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "Boolean"

    .line 5
    .line 6
    const-string v3, "BOOLEAN"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;->BOOLEAN:Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

    .line 12
    .line 13
    new-instance v4, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    const-string v1, "Char"

    .line 17
    .line 18
    const-string v2, "CHAR"

    .line 19
    .line 20
    invoke-direct {v4, v2, v0, v1}, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v4, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;->CHAR:Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

    .line 24
    .line 25
    new-instance v5, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

    .line 26
    .line 27
    const/4 v0, 0x2

    .line 28
    const-string v1, "Byte"

    .line 29
    .line 30
    const-string v2, "BYTE"

    .line 31
    .line 32
    invoke-direct {v5, v2, v0, v1}, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v5, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;->BYTE:Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

    .line 36
    .line 37
    new-instance v6, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

    .line 38
    .line 39
    const/4 v0, 0x3

    .line 40
    const-string v1, "Short"

    .line 41
    .line 42
    const-string v2, "SHORT"

    .line 43
    .line 44
    invoke-direct {v6, v2, v0, v1}, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v6, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;->SHORT:Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

    .line 48
    .line 49
    new-instance v7, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

    .line 50
    .line 51
    const/4 v0, 0x4

    .line 52
    const-string v1, "Int"

    .line 53
    .line 54
    const-string v2, "INT"

    .line 55
    .line 56
    invoke-direct {v7, v2, v0, v1}, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v7, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;->INT:Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

    .line 60
    .line 61
    new-instance v8, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

    .line 62
    .line 63
    const/4 v0, 0x5

    .line 64
    const-string v1, "Float"

    .line 65
    .line 66
    const-string v2, "FLOAT"

    .line 67
    .line 68
    invoke-direct {v8, v2, v0, v1}, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sput-object v8, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;->FLOAT:Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

    .line 72
    .line 73
    new-instance v9, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

    .line 74
    .line 75
    const/4 v0, 0x6

    .line 76
    const-string v1, "Long"

    .line 77
    .line 78
    const-string v2, "LONG"

    .line 79
    .line 80
    invoke-direct {v9, v2, v0, v1}, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    sput-object v9, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;->LONG:Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

    .line 84
    .line 85
    new-instance v10, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

    .line 86
    .line 87
    const/4 v0, 0x7

    .line 88
    const-string v1, "Double"

    .line 89
    .line 90
    const-string v2, "DOUBLE"

    .line 91
    .line 92
    invoke-direct {v10, v2, v0, v1}, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 93
    .line 94
    .line 95
    sput-object v10, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;->DOUBLE:Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

    .line 96
    .line 97
    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;->$values()[Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    sput-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;->$VALUES:[Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

    .line 102
    .line 103
    invoke-static {v0}, Lkotlin/enums/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰([Ljava/lang/Enum;)Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    sput-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;->$ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 108
    .line 109
    new-instance v0, L飘花落叶言世楪子苏兰哲/飘花落叶言子楪苏哲兰世;

    .line 110
    .line 111
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 112
    .line 113
    .line 114
    sput-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;->Companion:L飘花落叶言世楪子苏兰哲/飘花落叶言子楪苏哲兰世;

    .line 115
    .line 116
    filled-new-array/range {v4 .. v10}, [Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-static {v0}, Lkotlin/collections/飘花落叶言子楪哲世苏兰;->飘花落叶言子苏兰楪世哲([Ljava/lang/Object;)Ljava/util/Set;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    sput-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;->NUMBER_TYPES:Ljava/util/Set;

    .line 125
    .line 126
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
    invoke-static {p3}, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;->typeName:Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;

    .line 9
    .line 10
    const-string p1, "Array"

    .line 11
    .line 12
    invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p1}, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;->arrayTypeName:Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;

    .line 21
    .line 22
    sget-object p1, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    .line 23
    .line 24
    new-instance p2, L飘花落叶言世楪子苏兰哲/飘花落叶言子楪苏哲世兰;

    .line 25
    .line 26
    const/4 p3, 0x0

    .line 27
    invoke-direct {p2, p0, p3}, L飘花落叶言世楪子苏兰哲/飘花落叶言子楪苏哲世兰;-><init>(Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;I)V

    .line 28
    .line 29
    .line 30
    invoke-static {p1, p2}, Lkotlin/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(Lkotlin/LazyThreadSafetyMode;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;)Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    iput-object p2, p0, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;->typeFqName$delegate:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 35
    .line 36
    new-instance p2, L飘花落叶言世楪子苏兰哲/飘花落叶言子楪苏哲世兰;

    .line 37
    .line 38
    const/4 p3, 0x1

    .line 39
    invoke-direct {p2, p0, p3}, L飘花落叶言世楪子苏兰哲/飘花落叶言子楪苏哲世兰;-><init>(Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;I)V

    .line 40
    .line 41
    .line 42
    invoke-static {p1, p2}, Lkotlin/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(Lkotlin/LazyThreadSafetyMode;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;)Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;->arrayTypeFqName$delegate:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 47
    .line 48
    return-void
.end method

.method public static synthetic accessor$PrimitiveType$lambda0(Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;)Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;
    .locals 0

    .line 1
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;->typeFqName_delegate$lambda$0(Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;)Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic accessor$PrimitiveType$lambda1(Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;)Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;
    .locals 0

    .line 1
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;->arrayTypeFqName_delegate$lambda$0(Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;)Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final arrayTypeFqName_delegate$lambda$0(Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;)Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;
    .locals 1

    .line 1
    sget-object v0, L飘花落叶言世楪子苏兰哲/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏兰哲世:Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;->arrayTypeName:Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;)Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method private static final typeFqName_delegate$lambda$0(Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;)Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;
    .locals 1

    .line 1
    sget-object v0, L飘花落叶言世楪子苏兰哲/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏兰哲世:Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;->typeName:Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;)Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;
    .locals 1

    .line 1
    const-class v0, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;
    .locals 1

    .line 1
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;->$VALUES:[Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getArrayTypeFqName()Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;->arrayTypeFqName$delegate:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    invoke-interface {p0}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;

    .line 8
    .line 9
    return-object p0
.end method

.method public final getArrayTypeName()Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;->arrayTypeName:Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTypeFqName()Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;->typeFqName$delegate:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    invoke-interface {p0}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;

    .line 8
    .line 9
    return-object p0
.end method

.method public final getTypeName()Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;->typeName:Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    return-object p0
.end method
