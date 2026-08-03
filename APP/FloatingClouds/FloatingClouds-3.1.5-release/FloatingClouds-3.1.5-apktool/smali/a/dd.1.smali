.class public final enum La/dd;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "La/dd;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:La/dd;

.field public static final enum b:La/dd;

.field public static final enum c:La/dd;

.field public static final enum d:La/dd;

.field public static final synthetic e:[La/dd;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, La/dd;

    const-string v1, "SUCCESS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, La/dd;->a:La/dd;

    new-instance v1, La/dd;

    const-string v2, "PENDING"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, La/dd;->b:La/dd;

    new-instance v2, La/dd;

    const-string v3, "NOT_FOUND"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, La/dd;->c:La/dd;

    new-instance v3, La/dd;

    const-string v4, "REFLECT_FAILED"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, La/dd;->d:La/dd;

    new-instance v4, La/dd;

    const-string v5, "FALLBACK"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    filled-new-array {v0, v1, v2, v3, v4}, [La/dd;

    move-result-object v0

    sput-object v0, La/dd;->e:[La/dd;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public static valueOf(Ljava/lang/String;)La/dd;
    .locals 1

    const-class v0, La/dd;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, La/dd;

    return-object p0
.end method

.method public static values()[La/dd;
    .locals 1

    sget-object v0, La/dd;->e:[La/dd;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La/dd;

    return-object v0
.end method
