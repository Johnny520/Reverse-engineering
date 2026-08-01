.class public final enum Lcom/android/dex/MethodHandle$MethodHandleType;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/android/dex/MethodHandle$MethodHandleType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/android/dex/MethodHandle$MethodHandleType;

.field public static final enum METHOD_HANDLE_TYPE_INSTANCE_GET:Lcom/android/dex/MethodHandle$MethodHandleType;

.field public static final enum METHOD_HANDLE_TYPE_INSTANCE_PUT:Lcom/android/dex/MethodHandle$MethodHandleType;

.field public static final enum METHOD_HANDLE_TYPE_INVOKE_CONSTRUCTOR:Lcom/android/dex/MethodHandle$MethodHandleType;

.field public static final enum METHOD_HANDLE_TYPE_INVOKE_DIRECT:Lcom/android/dex/MethodHandle$MethodHandleType;

.field public static final enum METHOD_HANDLE_TYPE_INVOKE_INSTANCE:Lcom/android/dex/MethodHandle$MethodHandleType;

.field public static final enum METHOD_HANDLE_TYPE_INVOKE_INTERFACE:Lcom/android/dex/MethodHandle$MethodHandleType;

.field public static final enum METHOD_HANDLE_TYPE_INVOKE_STATIC:Lcom/android/dex/MethodHandle$MethodHandleType;

.field public static final enum METHOD_HANDLE_TYPE_STATIC_GET:Lcom/android/dex/MethodHandle$MethodHandleType;

.field public static final enum METHOD_HANDLE_TYPE_STATIC_PUT:Lcom/android/dex/MethodHandle$MethodHandleType;


# instance fields
.field private final value:I


# direct methods
.method private static synthetic $values()[Lcom/android/dex/MethodHandle$MethodHandleType;
    .locals 9

    .line 1
    sget-object v0, Lcom/android/dex/MethodHandle$MethodHandleType;->METHOD_HANDLE_TYPE_STATIC_PUT:Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 2
    .line 3
    sget-object v1, Lcom/android/dex/MethodHandle$MethodHandleType;->METHOD_HANDLE_TYPE_STATIC_GET:Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 4
    .line 5
    sget-object v2, Lcom/android/dex/MethodHandle$MethodHandleType;->METHOD_HANDLE_TYPE_INSTANCE_PUT:Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 6
    .line 7
    sget-object v3, Lcom/android/dex/MethodHandle$MethodHandleType;->METHOD_HANDLE_TYPE_INSTANCE_GET:Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 8
    .line 9
    sget-object v4, Lcom/android/dex/MethodHandle$MethodHandleType;->METHOD_HANDLE_TYPE_INVOKE_STATIC:Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 10
    .line 11
    sget-object v5, Lcom/android/dex/MethodHandle$MethodHandleType;->METHOD_HANDLE_TYPE_INVOKE_INSTANCE:Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 12
    .line 13
    sget-object v6, Lcom/android/dex/MethodHandle$MethodHandleType;->METHOD_HANDLE_TYPE_INVOKE_DIRECT:Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 14
    .line 15
    sget-object v7, Lcom/android/dex/MethodHandle$MethodHandleType;->METHOD_HANDLE_TYPE_INVOKE_CONSTRUCTOR:Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 16
    .line 17
    sget-object v8, Lcom/android/dex/MethodHandle$MethodHandleType;->METHOD_HANDLE_TYPE_INVOKE_INTERFACE:Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 18
    .line 19
    filled-new-array/range {v0 .. v8}, [Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 2
    .line 3
    const-string v1, "METHOD_HANDLE_TYPE_STATIC_PUT"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lcom/android/dex/MethodHandle$MethodHandleType;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/android/dex/MethodHandle$MethodHandleType;->METHOD_HANDLE_TYPE_STATIC_PUT:Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 10
    .line 11
    new-instance v0, Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 12
    .line 13
    const-string v1, "METHOD_HANDLE_TYPE_STATIC_GET"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2, v2}, Lcom/android/dex/MethodHandle$MethodHandleType;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/android/dex/MethodHandle$MethodHandleType;->METHOD_HANDLE_TYPE_STATIC_GET:Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 20
    .line 21
    new-instance v0, Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 22
    .line 23
    const-string v1, "METHOD_HANDLE_TYPE_INSTANCE_PUT"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2, v2}, Lcom/android/dex/MethodHandle$MethodHandleType;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/android/dex/MethodHandle$MethodHandleType;->METHOD_HANDLE_TYPE_INSTANCE_PUT:Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 30
    .line 31
    new-instance v0, Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 32
    .line 33
    const-string v1, "METHOD_HANDLE_TYPE_INSTANCE_GET"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2, v2}, Lcom/android/dex/MethodHandle$MethodHandleType;-><init>(Ljava/lang/String;II)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lcom/android/dex/MethodHandle$MethodHandleType;->METHOD_HANDLE_TYPE_INSTANCE_GET:Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 40
    .line 41
    new-instance v0, Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 42
    .line 43
    const-string v1, "METHOD_HANDLE_TYPE_INVOKE_STATIC"

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-direct {v0, v1, v2, v2}, Lcom/android/dex/MethodHandle$MethodHandleType;-><init>(Ljava/lang/String;II)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lcom/android/dex/MethodHandle$MethodHandleType;->METHOD_HANDLE_TYPE_INVOKE_STATIC:Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 50
    .line 51
    new-instance v0, Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 52
    .line 53
    const-string v1, "METHOD_HANDLE_TYPE_INVOKE_INSTANCE"

    .line 54
    .line 55
    const/4 v2, 0x5

    .line 56
    invoke-direct {v0, v1, v2, v2}, Lcom/android/dex/MethodHandle$MethodHandleType;-><init>(Ljava/lang/String;II)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lcom/android/dex/MethodHandle$MethodHandleType;->METHOD_HANDLE_TYPE_INVOKE_INSTANCE:Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 60
    .line 61
    new-instance v0, Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 62
    .line 63
    const-string v1, "METHOD_HANDLE_TYPE_INVOKE_DIRECT"

    .line 64
    .line 65
    const/4 v2, 0x6

    .line 66
    invoke-direct {v0, v1, v2, v2}, Lcom/android/dex/MethodHandle$MethodHandleType;-><init>(Ljava/lang/String;II)V

    .line 67
    .line 68
    .line 69
    sput-object v0, Lcom/android/dex/MethodHandle$MethodHandleType;->METHOD_HANDLE_TYPE_INVOKE_DIRECT:Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 70
    .line 71
    new-instance v0, Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 72
    .line 73
    const-string v1, "METHOD_HANDLE_TYPE_INVOKE_CONSTRUCTOR"

    .line 74
    .line 75
    const/4 v2, 0x7

    .line 76
    invoke-direct {v0, v1, v2, v2}, Lcom/android/dex/MethodHandle$MethodHandleType;-><init>(Ljava/lang/String;II)V

    .line 77
    .line 78
    .line 79
    sput-object v0, Lcom/android/dex/MethodHandle$MethodHandleType;->METHOD_HANDLE_TYPE_INVOKE_CONSTRUCTOR:Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 80
    .line 81
    new-instance v0, Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 82
    .line 83
    const-string v1, "METHOD_HANDLE_TYPE_INVOKE_INTERFACE"

    .line 84
    .line 85
    const/16 v2, 0x8

    .line 86
    .line 87
    invoke-direct {v0, v1, v2, v2}, Lcom/android/dex/MethodHandle$MethodHandleType;-><init>(Ljava/lang/String;II)V

    .line 88
    .line 89
    .line 90
    sput-object v0, Lcom/android/dex/MethodHandle$MethodHandleType;->METHOD_HANDLE_TYPE_INVOKE_INTERFACE:Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 91
    .line 92
    invoke-static {}, Lcom/android/dex/MethodHandle$MethodHandleType;->$values()[Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    sput-object v0, Lcom/android/dex/MethodHandle$MethodHandleType;->$VALUES:[Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 97
    .line 98
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
    iput p3, p0, Lcom/android/dex/MethodHandle$MethodHandleType;->value:I

    .line 5
    .line 6
    return-void
.end method

.method public static synthetic access$000(Lcom/android/dex/MethodHandle$MethodHandleType;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dex/MethodHandle$MethodHandleType;->value:I

    .line 2
    .line 3
    return p0
.end method

.method public static fromValue(I)Lcom/android/dex/MethodHandle$MethodHandleType;
    .locals 5

    .line 1
    invoke-static {}, Lcom/android/dex/MethodHandle$MethodHandleType;->values()[Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-ge v2, v1, :cond_1

    .line 8
    .line 9
    aget-object v3, v0, v2

    .line 10
    .line 11
    iget v4, v3, Lcom/android/dex/MethodHandle$MethodHandleType;->value:I

    .line 12
    .line 13
    if-ne v4, p0, :cond_0

    .line 14
    .line 15
    return-object v3

    .line 16
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/android/dex/MethodHandle$MethodHandleType;
    .locals 1

    .line 1
    const-class v0, Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/android/dex/MethodHandle$MethodHandleType;
    .locals 1

    .line 1
    sget-object v0, Lcom/android/dex/MethodHandle$MethodHandleType;->$VALUES:[Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/android/dex/MethodHandle$MethodHandleType;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public isField()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    if-eq p0, v0, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    if-eq p0, v1, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x3

    .line 14
    if-eq p0, v1, :cond_0

    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    return p0

    .line 18
    :cond_0
    return v0
.end method
