.class public final enum Lio/github/oshai/kotlinlogging/Level;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/github/oshai/kotlinlogging/Level;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000b\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0006\u0010\u000e\u001a\u00020\u0003J\u0008\u0010\u000f\u001a\u00020\u0005H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u0010"
    }
    d2 = {
        "Lio/github/oshai/kotlinlogging/Level;",
        "",
        "levelInt",
        "",
        "levelStr",
        "",
        "<init>",
        "(Ljava/lang/String;IILjava/lang/String;)V",
        "TRACE",
        "DEBUG",
        "INFO",
        "WARN",
        "ERROR",
        "OFF",
        "toInt",
        "toString",
        "kotlin-logging_release"
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

.field private static final synthetic $VALUES:[Lio/github/oshai/kotlinlogging/Level;

.field public static final enum DEBUG:Lio/github/oshai/kotlinlogging/Level;

.field public static final enum ERROR:Lio/github/oshai/kotlinlogging/Level;

.field public static final enum INFO:Lio/github/oshai/kotlinlogging/Level;

.field public static final enum OFF:Lio/github/oshai/kotlinlogging/Level;

.field public static final enum TRACE:Lio/github/oshai/kotlinlogging/Level;

.field public static final enum WARN:Lio/github/oshai/kotlinlogging/Level;


# instance fields
.field private final levelInt:I

.field private final levelStr:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lio/github/oshai/kotlinlogging/Level;
    .locals 6

    .line 1
    sget-object v0, Lio/github/oshai/kotlinlogging/Level;->TRACE:Lio/github/oshai/kotlinlogging/Level;

    .line 2
    .line 3
    sget-object v1, Lio/github/oshai/kotlinlogging/Level;->DEBUG:Lio/github/oshai/kotlinlogging/Level;

    .line 4
    .line 5
    sget-object v2, Lio/github/oshai/kotlinlogging/Level;->INFO:Lio/github/oshai/kotlinlogging/Level;

    .line 6
    .line 7
    sget-object v3, Lio/github/oshai/kotlinlogging/Level;->WARN:Lio/github/oshai/kotlinlogging/Level;

    .line 8
    .line 9
    sget-object v4, Lio/github/oshai/kotlinlogging/Level;->ERROR:Lio/github/oshai/kotlinlogging/Level;

    .line 10
    .line 11
    sget-object v5, Lio/github/oshai/kotlinlogging/Level;->OFF:Lio/github/oshai/kotlinlogging/Level;

    .line 12
    .line 13
    filled-new-array/range {v0 .. v5}, [Lio/github/oshai/kotlinlogging/Level;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lio/github/oshai/kotlinlogging/Level;

    .line 2
    .line 3
    const-string v1, "TRACE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2, v1}, Lio/github/oshai/kotlinlogging/Level;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lio/github/oshai/kotlinlogging/Level;->TRACE:Lio/github/oshai/kotlinlogging/Level;

    .line 10
    .line 11
    new-instance v0, Lio/github/oshai/kotlinlogging/Level;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    const/16 v2, 0xa

    .line 15
    .line 16
    const-string v3, "DEBUG"

    .line 17
    .line 18
    invoke-direct {v0, v3, v1, v2, v3}, Lio/github/oshai/kotlinlogging/Level;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lio/github/oshai/kotlinlogging/Level;->DEBUG:Lio/github/oshai/kotlinlogging/Level;

    .line 22
    .line 23
    new-instance v0, Lio/github/oshai/kotlinlogging/Level;

    .line 24
    .line 25
    const/4 v1, 0x2

    .line 26
    const/16 v2, 0x14

    .line 27
    .line 28
    const-string v3, "INFO"

    .line 29
    .line 30
    invoke-direct {v0, v3, v1, v2, v3}, Lio/github/oshai/kotlinlogging/Level;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    sput-object v0, Lio/github/oshai/kotlinlogging/Level;->INFO:Lio/github/oshai/kotlinlogging/Level;

    .line 34
    .line 35
    new-instance v0, Lio/github/oshai/kotlinlogging/Level;

    .line 36
    .line 37
    const/4 v1, 0x3

    .line 38
    const/16 v2, 0x1e

    .line 39
    .line 40
    const-string v3, "WARN"

    .line 41
    .line 42
    invoke-direct {v0, v3, v1, v2, v3}, Lio/github/oshai/kotlinlogging/Level;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 43
    .line 44
    .line 45
    sput-object v0, Lio/github/oshai/kotlinlogging/Level;->WARN:Lio/github/oshai/kotlinlogging/Level;

    .line 46
    .line 47
    new-instance v0, Lio/github/oshai/kotlinlogging/Level;

    .line 48
    .line 49
    const/4 v1, 0x4

    .line 50
    const/16 v2, 0x28

    .line 51
    .line 52
    const-string v3, "ERROR"

    .line 53
    .line 54
    invoke-direct {v0, v3, v1, v2, v3}, Lio/github/oshai/kotlinlogging/Level;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 55
    .line 56
    .line 57
    sput-object v0, Lio/github/oshai/kotlinlogging/Level;->ERROR:Lio/github/oshai/kotlinlogging/Level;

    .line 58
    .line 59
    new-instance v0, Lio/github/oshai/kotlinlogging/Level;

    .line 60
    .line 61
    const/4 v1, 0x5

    .line 62
    const/16 v2, 0x32

    .line 63
    .line 64
    const-string v3, "OFF"

    .line 65
    .line 66
    invoke-direct {v0, v3, v1, v2, v3}, Lio/github/oshai/kotlinlogging/Level;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 67
    .line 68
    .line 69
    sput-object v0, Lio/github/oshai/kotlinlogging/Level;->OFF:Lio/github/oshai/kotlinlogging/Level;

    .line 70
    .line 71
    invoke-static {}, Lio/github/oshai/kotlinlogging/Level;->$values()[Lio/github/oshai/kotlinlogging/Level;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    sput-object v0, Lio/github/oshai/kotlinlogging/Level;->$VALUES:[Lio/github/oshai/kotlinlogging/Level;

    .line 76
    .line 77
    invoke-static {v0}, Lkotlin/enums/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰([Ljava/lang/Enum;)Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    sput-object v0, Lio/github/oshai/kotlinlogging/Level;->$ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 82
    .line 83
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lio/github/oshai/kotlinlogging/Level;->levelInt:I

    .line 5
    .line 6
    iput-object p4, p0, Lio/github/oshai/kotlinlogging/Level;->levelStr:Ljava/lang/String;

    .line 7
    .line 8
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
    sget-object v0, Lio/github/oshai/kotlinlogging/Level;->$ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/github/oshai/kotlinlogging/Level;
    .locals 1

    .line 1
    const-class v0, Lio/github/oshai/kotlinlogging/Level;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lio/github/oshai/kotlinlogging/Level;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lio/github/oshai/kotlinlogging/Level;
    .locals 1

    .line 1
    sget-object v0, Lio/github/oshai/kotlinlogging/Level;->$VALUES:[Lio/github/oshai/kotlinlogging/Level;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lio/github/oshai/kotlinlogging/Level;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final toInt()I
    .locals 0

    .line 1
    iget p0, p0, Lio/github/oshai/kotlinlogging/Level;->levelInt:I

    .line 2
    .line 3
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/github/oshai/kotlinlogging/Level;->levelStr:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
