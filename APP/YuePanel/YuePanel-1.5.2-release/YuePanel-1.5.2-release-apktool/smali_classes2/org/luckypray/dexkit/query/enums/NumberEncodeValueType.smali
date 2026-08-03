.class public final enum Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u001d\u0010\u0003\u001a\u00020\u00028\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u000f"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;",
        "",
        "LYue/\u06e5\u06e2\u06e2\u06e5\u06e5;",
        "value",
        "<init>",
        "(Ljava/lang/String;IB)V",
        "B",
        "getValue-w2LRezQ",
        "()B",
        "ByteValue",
        "ShortValue",
        "IntValue",
        "LongValue",
        "FloatValue",
        "DoubleValue",
        "dexkit-android_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

.field public static final enum ByteValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

.field public static final enum DoubleValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

.field public static final enum FloatValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

.field public static final enum IntValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

.field public static final enum LongValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

.field public static final enum ShortValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;


# instance fields
.field private final value:B


# direct methods
.method private static final synthetic $values()[Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;
    .locals 6

    sget-object v0, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->ByteValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    sget-object v1, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->ShortValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    sget-object v2, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->IntValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    sget-object v3, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->LongValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    sget-object v4, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->FloatValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    sget-object v5, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->DoubleValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    filled-new-array/range {v0 .. v5}, [Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    const-string v1, "ByteValue"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->ByteValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    new-instance v0, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    const-string v1, "ShortValue"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v3, v2}, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->ShortValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    new-instance v0, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    const-string v1, "IntValue"

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->IntValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    new-instance v0, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    const-string v1, "LongValue"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v3, v2}, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->LongValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    new-instance v0, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    const-string v1, "FloatValue"

    const/4 v3, 0x5

    invoke-direct {v0, v1, v2, v3}, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->FloatValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    new-instance v0, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    const-string v1, "DoubleValue"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v3, v2}, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->DoubleValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    invoke-static {}, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->$values()[Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    move-result-object v0

    sput-object v0, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->$VALUES:[Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IB)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(B)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-byte p3, p0, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->value:B

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;
    .locals 1

    const-class v0, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    return-object p0
.end method

.method public static values()[Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;
    .locals 1

    sget-object v0, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->$VALUES:[Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    return-object v0
.end method


# virtual methods
.method public final getValue-w2LRezQ()B
    .locals 1

    iget-byte v0, p0, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->value:B

    return v0
.end method
