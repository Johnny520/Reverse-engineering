.class public final enum Lorg/apache/commons/io/file/StandardDeleteOption;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言苏子世楪兰哲/飘花落叶言子楪世兰苏哲;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/apache/commons/io/file/StandardDeleteOption;",
        ">;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u82cf\u5b50\u4e16\u696a\u5170\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/apache/commons/io/file/StandardDeleteOption;

.field public static final enum OVERRIDE_READ_ONLY:Lorg/apache/commons/io/file/StandardDeleteOption;


# direct methods
.method private static synthetic $values()[Lorg/apache/commons/io/file/StandardDeleteOption;
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/commons/io/file/StandardDeleteOption;->OVERRIDE_READ_ONLY:Lorg/apache/commons/io/file/StandardDeleteOption;

    .line 2
    .line 3
    filled-new-array {v0}, [Lorg/apache/commons/io/file/StandardDeleteOption;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lorg/apache/commons/io/file/StandardDeleteOption;

    .line 2
    .line 3
    const-string v1, "OVERRIDE_READ_ONLY"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lorg/apache/commons/io/file/StandardDeleteOption;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lorg/apache/commons/io/file/StandardDeleteOption;->OVERRIDE_READ_ONLY:Lorg/apache/commons/io/file/StandardDeleteOption;

    .line 10
    .line 11
    invoke-static {}, Lorg/apache/commons/io/file/StandardDeleteOption;->$values()[Lorg/apache/commons/io/file/StandardDeleteOption;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lorg/apache/commons/io/file/StandardDeleteOption;->$VALUES:[Lorg/apache/commons/io/file/StandardDeleteOption;

    .line 16
    .line 17
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static synthetic lambda$overrideReadOnly$0(L飘花落叶言苏子世楪兰哲/飘花落叶言子楪世兰苏哲;)Z
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/commons/io/file/StandardDeleteOption;->OVERRIDE_READ_ONLY:Lorg/apache/commons/io/file/StandardDeleteOption;

    .line 2
    .line 3
    if-ne v0, p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public static overrideReadOnly([L飘花落叶言苏子世楪兰哲/飘花落叶言子楪世兰苏哲;)Z
    .locals 2

    .line 1
    sget-object v0, L飘花落叶言苏子楪兰哲世/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    move v1, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    array-length v1, p0

    .line 9
    :goto_0
    if-nez v1, :cond_1

    .line 10
    .line 11
    return v0

    .line 12
    :cond_1
    invoke-static {p0}, Ljava/util/stream/Stream;->of([Ljava/lang/Object;)Ljava/util/stream/Stream;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    new-instance v0, Lbsh/classpath/飘花落叶言子楪世兰苏哲;

    .line 17
    .line 18
    const/16 v1, 0xf

    .line 19
    .line 20
    invoke-direct {v0, v1}, Lbsh/classpath/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p0, v0}, Ljava/util/stream/Stream;->anyMatch(Ljava/util/function/Predicate;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/apache/commons/io/file/StandardDeleteOption;
    .locals 1

    .line 1
    const-class v0, Lorg/apache/commons/io/file/StandardDeleteOption;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/apache/commons/io/file/StandardDeleteOption;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lorg/apache/commons/io/file/StandardDeleteOption;
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/commons/io/file/StandardDeleteOption;->$VALUES:[Lorg/apache/commons/io/file/StandardDeleteOption;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lorg/apache/commons/io/file/StandardDeleteOption;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lorg/apache/commons/io/file/StandardDeleteOption;

    .line 8
    .line 9
    return-object v0
.end method

.method public static synthetic 飘花落叶言子楪世苏哲兰(L飘花落叶言苏子世楪兰哲/飘花落叶言子楪世兰苏哲;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lorg/apache/commons/io/file/StandardDeleteOption;->lambda$overrideReadOnly$0(L飘花落叶言苏子世楪兰哲/飘花落叶言子楪世兰苏哲;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method
