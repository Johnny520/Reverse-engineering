.class public final enum L۟/u8;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "L\u06df/u8;",
        ">;"
    }
.end annotation


# static fields
.field public static final synthetic ۥ:[L۟/u8;


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    new-instance v0, L۟/u8;

    const-string v1, "IGNORE_CASE"

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, L۟/u8;-><init>(Ljava/lang/String;II)V

    new-instance v1, L۟/u8;

    const-string v4, "MULTILINE"

    const/4 v5, 0x1

    const/16 v6, 0x8

    invoke-direct {v1, v4, v5, v6}, L۟/u8;-><init>(Ljava/lang/String;II)V

    new-instance v4, L۟/u8;

    const-string v6, "LITERAL"

    const/16 v7, 0x10

    invoke-direct {v4, v6, v3, v7}, L۟/u8;-><init>(Ljava/lang/String;II)V

    new-instance v6, L۟/u8;

    const-string v7, "UNIX_LINES"

    const/4 v8, 0x3

    invoke-direct {v6, v7, v8, v5}, L۟/u8;-><init>(Ljava/lang/String;II)V

    new-instance v7, L۟/u8;

    const-string v9, "COMMENTS"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10}, L۟/u8;-><init>(Ljava/lang/String;II)V

    new-instance v9, L۟/u8;

    const-string v11, "DOT_MATCHES_ALL"

    const/4 v12, 0x5

    const/16 v13, 0x20

    invoke-direct {v9, v11, v12, v13}, L۟/u8;-><init>(Ljava/lang/String;II)V

    new-instance v11, L۟/u8;

    const-string v13, "CANON_EQ"

    const/4 v14, 0x6

    const/16 v15, 0x80

    invoke-direct {v11, v13, v14, v15}, L۟/u8;-><init>(Ljava/lang/String;II)V

    const/4 v13, 0x7

    new-array v13, v13, [L۟/u8;

    aput-object v0, v13, v2

    aput-object v1, v13, v5

    aput-object v4, v13, v3

    aput-object v6, v13, v8

    aput-object v7, v13, v10

    aput-object v9, v13, v12

    aput-object v11, v13, v14

    sput-object v13, L۟/u8;->ۥ:[L۟/u8;

    new-instance v0, L۟/q2;

    invoke-direct {v0, v13}, L۟/q2;-><init>([Ljava/lang/Enum;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)L۟/u8;
    .locals 1

    const-class v0, L۟/u8;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, L۟/u8;

    return-object p0
.end method

.method public static values()[L۟/u8;
    .locals 1

    sget-object v0, L۟/u8;->ۥ:[L۟/u8;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [L۟/u8;

    return-object v0
.end method
