.class public final enum La/q6;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "La/q6;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:La/q6;

.field public static final enum b:La/q6;

.field public static final enum c:La/q6;

.field public static final synthetic d:[La/q6;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, La/q6;

    const-string v1, "ACTIVE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, La/q6;->a:La/q6;

    new-instance v1, La/q6;

    const-string v2, "ISOLATED"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, La/q6;->b:La/q6;

    new-instance v2, La/q6;

    const-string v3, "DISABLED"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, La/q6;->c:La/q6;

    filled-new-array {v0, v1, v2}, [La/q6;

    move-result-object v0

    sput-object v0, La/q6;->d:[La/q6;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public static valueOf(Ljava/lang/String;)La/q6;
    .locals 1

    const-class v0, La/q6;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, La/q6;

    return-object p0
.end method

.method public static values()[La/q6;
    .locals 1

    sget-object v0, La/q6;->d:[La/q6;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La/q6;

    return-object v0
.end method
