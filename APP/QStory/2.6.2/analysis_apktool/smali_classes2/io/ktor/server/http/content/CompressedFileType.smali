.class public final enum Lio/ktor/server/http/content/CompressedFileType;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/ktor/server/http/content/CompressedFileType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u000b\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0007\u001a\u0004\u0008\n\u0010\tj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lio/ktor/server/http/content/CompressedFileType;",
        "",
        "",
        "extension",
        "encoding",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V",
        "Ljava/lang/String;",
        "getExtension",
        "()Ljava/lang/String;",
        "getEncoding",
        "BROTLI",
        "GZIP",
        "ktor-server-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

.field private static final synthetic $VALUES:[Lio/ktor/server/http/content/CompressedFileType;

.field public static final enum BROTLI:Lio/ktor/server/http/content/CompressedFileType;

.field public static final enum GZIP:Lio/ktor/server/http/content/CompressedFileType;


# instance fields
.field private final encoding:Ljava/lang/String;

.field private final extension:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lio/ktor/server/http/content/CompressedFileType;
    .locals 2

    .line 1
    sget-object v0, Lio/ktor/server/http/content/CompressedFileType;->BROTLI:Lio/ktor/server/http/content/CompressedFileType;

    .line 2
    .line 3
    sget-object v1, Lio/ktor/server/http/content/CompressedFileType;->GZIP:Lio/ktor/server/http/content/CompressedFileType;

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Lio/ktor/server/http/content/CompressedFileType;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lio/ktor/server/http/content/CompressedFileType;

    .line 2
    .line 3
    const/4 v5, 0x2

    .line 4
    const/4 v6, 0x0

    .line 5
    const-string v1, "BROTLI"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const-string v3, "br"

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    invoke-direct/range {v0 .. v6}, Lio/ktor/server/http/content/CompressedFileType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lio/ktor/server/http/content/CompressedFileType;->BROTLI:Lio/ktor/server/http/content/CompressedFileType;

    .line 15
    .line 16
    new-instance v0, Lio/ktor/server/http/content/CompressedFileType;

    .line 17
    .line 18
    const-string v1, "gz"

    .line 19
    .line 20
    const-string v2, "gzip"

    .line 21
    .line 22
    const-string v3, "GZIP"

    .line 23
    .line 24
    const/4 v4, 0x1

    .line 25
    invoke-direct {v0, v3, v4, v1, v2}, Lio/ktor/server/http/content/CompressedFileType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    sput-object v0, Lio/ktor/server/http/content/CompressedFileType;->GZIP:Lio/ktor/server/http/content/CompressedFileType;

    .line 29
    .line 30
    invoke-static {}, Lio/ktor/server/http/content/CompressedFileType;->$values()[Lio/ktor/server/http/content/CompressedFileType;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sput-object v0, Lio/ktor/server/http/content/CompressedFileType;->$VALUES:[Lio/ktor/server/http/content/CompressedFileType;

    .line 35
    .line 36
    invoke-static {v0}, Lkotlin/enums/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰([Ljava/lang/Enum;)Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sput-object v0, Lio/ktor/server/http/content/CompressedFileType;->$ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 41
    .line 42
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 10
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lio/ktor/server/http/content/CompressedFileType;->extension:Ljava/lang/String;

    iput-object p4, p0, Lio/ktor/server/http/content/CompressedFileType;->encoding:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V
    .locals 0

    .line 1
    and-int/lit8 p5, p5, 0x2

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    move-object p4, p3

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lio/ktor/server/http/content/CompressedFileType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
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
    sget-object v0, Lio/ktor/server/http/content/CompressedFileType;->$ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/ktor/server/http/content/CompressedFileType;
    .locals 1

    .line 1
    const-class v0, Lio/ktor/server/http/content/CompressedFileType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lio/ktor/server/http/content/CompressedFileType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lio/ktor/server/http/content/CompressedFileType;
    .locals 1

    .line 1
    sget-object v0, Lio/ktor/server/http/content/CompressedFileType;->$VALUES:[Lio/ktor/server/http/content/CompressedFileType;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lio/ktor/server/http/content/CompressedFileType;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getEncoding()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/server/http/content/CompressedFileType;->encoding:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getExtension()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/server/http/content/CompressedFileType;->extension:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
