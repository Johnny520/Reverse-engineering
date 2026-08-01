.class public final enum Lkotlinx/serialization/protobuf/internal/ProtoWireType;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lkotlinx/serialization/protobuf/internal/ProtoWireType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\r\u0008\u0080\u0081\u0002\u0018\u0000 \u000f2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u000c\u001a\u0004\u0008\r\u0010\u000ej\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lkotlinx/serialization/protobuf/internal/ProtoWireType;",
        "",
        "",
        "typeId",
        "<init>",
        "(Ljava/lang/String;II)V",
        "tag",
        "wireIntWithTag",
        "(I)I",
        "",
        "toString",
        "()Ljava/lang/String;",
        "I",
        "getTypeId",
        "()I",
        "Companion",
        "kotlinx/serialization/protobuf/internal/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16",
        "INVALID",
        "VARINT",
        "i64",
        "SIZE_DELIMITED",
        "i32",
        "kotlinx-serialization-protobuf"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

.field private static final synthetic $VALUES:[Lkotlinx/serialization/protobuf/internal/ProtoWireType;

.field public static final Companion:Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪苏兰哲世;

.field public static final enum INVALID:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

.field public static final enum SIZE_DELIMITED:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

.field public static final enum VARINT:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

.field private static final entryArray:[Lkotlinx/serialization/protobuf/internal/ProtoWireType;

.field public static final enum i32:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

.field public static final enum i64:Lkotlinx/serialization/protobuf/internal/ProtoWireType;


# instance fields
.field private final typeId:I


# direct methods
.method private static final synthetic $values()[Lkotlinx/serialization/protobuf/internal/ProtoWireType;
    .locals 5

    .line 1
    sget-object v0, Lkotlinx/serialization/protobuf/internal/ProtoWireType;->INVALID:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 2
    .line 3
    sget-object v1, Lkotlinx/serialization/protobuf/internal/ProtoWireType;->VARINT:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 4
    .line 5
    sget-object v2, Lkotlinx/serialization/protobuf/internal/ProtoWireType;->i64:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 6
    .line 7
    sget-object v3, Lkotlinx/serialization/protobuf/internal/ProtoWireType;->SIZE_DELIMITED:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 8
    .line 9
    sget-object v4, Lkotlinx/serialization/protobuf/internal/ProtoWireType;->i32:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 10
    .line 11
    filled-new-array {v0, v1, v2, v3, v4}, [Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const-string v2, "INVALID"

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    invoke-direct {v0, v2, v3, v1}, Lkotlinx/serialization/protobuf/internal/ProtoWireType;-><init>(Ljava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lkotlinx/serialization/protobuf/internal/ProtoWireType;->INVALID:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 11
    .line 12
    new-instance v0, Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 13
    .line 14
    const-string v1, "VARINT"

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-direct {v0, v1, v2, v3}, Lkotlinx/serialization/protobuf/internal/ProtoWireType;-><init>(Ljava/lang/String;II)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lkotlinx/serialization/protobuf/internal/ProtoWireType;->VARINT:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 21
    .line 22
    new-instance v0, Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 23
    .line 24
    const-string v1, "i64"

    .line 25
    .line 26
    const/4 v4, 0x2

    .line 27
    invoke-direct {v0, v1, v4, v2}, Lkotlinx/serialization/protobuf/internal/ProtoWireType;-><init>(Ljava/lang/String;II)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lkotlinx/serialization/protobuf/internal/ProtoWireType;->i64:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 31
    .line 32
    new-instance v0, Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 33
    .line 34
    const-string v1, "SIZE_DELIMITED"

    .line 35
    .line 36
    const/4 v2, 0x3

    .line 37
    invoke-direct {v0, v1, v2, v4}, Lkotlinx/serialization/protobuf/internal/ProtoWireType;-><init>(Ljava/lang/String;II)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lkotlinx/serialization/protobuf/internal/ProtoWireType;->SIZE_DELIMITED:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 41
    .line 42
    new-instance v0, Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 43
    .line 44
    const/4 v1, 0x4

    .line 45
    const/4 v2, 0x5

    .line 46
    const-string v4, "i32"

    .line 47
    .line 48
    invoke-direct {v0, v4, v1, v2}, Lkotlinx/serialization/protobuf/internal/ProtoWireType;-><init>(Ljava/lang/String;II)V

    .line 49
    .line 50
    .line 51
    sput-object v0, Lkotlinx/serialization/protobuf/internal/ProtoWireType;->i32:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 52
    .line 53
    invoke-static {}, Lkotlinx/serialization/protobuf/internal/ProtoWireType;->$values()[Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    sput-object v0, Lkotlinx/serialization/protobuf/internal/ProtoWireType;->$VALUES:[Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 58
    .line 59
    invoke-static {v0}, Lkotlin/enums/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰([Ljava/lang/Enum;)Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sput-object v0, Lkotlinx/serialization/protobuf/internal/ProtoWireType;->$ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 64
    .line 65
    new-instance v0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪苏兰哲世;

    .line 66
    .line 67
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 68
    .line 69
    .line 70
    sput-object v0, Lkotlinx/serialization/protobuf/internal/ProtoWireType;->Companion:Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪苏兰哲世;

    .line 71
    .line 72
    const/16 v0, 0x8

    .line 73
    .line 74
    new-array v1, v0, [Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 75
    .line 76
    :goto_0
    if-ge v3, v0, :cond_3

    .line 77
    .line 78
    invoke-static {}, Lkotlinx/serialization/protobuf/internal/ProtoWireType;->getEntries()Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-eqz v4, :cond_1

    .line 91
    .line 92
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    move-object v5, v4

    .line 97
    check-cast v5, Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 98
    .line 99
    iget v5, v5, Lkotlinx/serialization/protobuf/internal/ProtoWireType;->typeId:I

    .line 100
    .line 101
    if-ne v5, v3, :cond_0

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_1
    const/4 v4, 0x0

    .line 105
    :goto_1
    check-cast v4, Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 106
    .line 107
    if-nez v4, :cond_2

    .line 108
    .line 109
    sget-object v4, Lkotlinx/serialization/protobuf/internal/ProtoWireType;->INVALID:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 110
    .line 111
    :cond_2
    aput-object v4, v1, v3

    .line 112
    .line 113
    add-int/lit8 v3, v3, 0x1

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_3
    sput-object v1, Lkotlinx/serialization/protobuf/internal/ProtoWireType;->entryArray:[Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 117
    .line 118
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lkotlinx/serialization/protobuf/internal/ProtoWireType;->typeId:I

    .line 5
    .line 6
    return-void
.end method

.method public static final synthetic access$getEntryArray$cp()[Lkotlinx/serialization/protobuf/internal/ProtoWireType;
    .locals 1

    .line 1
    sget-object v0, Lkotlinx/serialization/protobuf/internal/ProtoWireType;->entryArray:[Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 2
    .line 3
    return-object v0
.end method

.method public static getEntries()Lkotlin/enums/飘花落叶言子楪世苏哲兰;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
        }
    .end annotation

    .line 1
    sget-object v0, Lkotlinx/serialization/protobuf/internal/ProtoWireType;->$ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lkotlinx/serialization/protobuf/internal/ProtoWireType;
    .locals 1

    .line 1
    const-class v0, Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lkotlinx/serialization/protobuf/internal/ProtoWireType;
    .locals 1

    .line 1
    sget-object v0, Lkotlinx/serialization/protobuf/internal/ProtoWireType;->$VALUES:[Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getTypeId()I
    .locals 0

    .line 1
    iget p0, p0, Lkotlinx/serialization/protobuf/internal/ProtoWireType;->typeId:I

    .line 2
    .line 3
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x28

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget p0, p0, Lkotlinx/serialization/protobuf/internal/ProtoWireType;->typeId:I

    .line 19
    .line 20
    const/16 v1, 0x29

    .line 21
    .line 22
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰苏世(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public final wireIntWithTag(I)I
    .locals 0

    .line 1
    shl-int/lit8 p1, p1, 0x3

    .line 2
    .line 3
    iget p0, p0, Lkotlinx/serialization/protobuf/internal/ProtoWireType;->typeId:I

    .line 4
    .line 5
    or-int/2addr p0, p1

    .line 6
    return p0
.end method
