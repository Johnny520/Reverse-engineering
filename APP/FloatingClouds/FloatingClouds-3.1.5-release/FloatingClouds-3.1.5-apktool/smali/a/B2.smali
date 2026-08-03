.class public final enum La/B2;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "La/B2;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:La/B2;

.field public static final synthetic b:[La/B2;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, La/B2;

    const-string v1, "NORMAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, La/B2;->a:La/B2;

    new-instance v1, La/B2;

    const-string v2, "BYPASS"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v2, La/B2;

    const-string v3, "FORCE_RESCAN"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    filled-new-array {v0, v1, v2}, [La/B2;

    move-result-object v0

    sput-object v0, La/B2;->b:[La/B2;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public static valueOf(Ljava/lang/String;)La/B2;
    .locals 1

    const-class v0, La/B2;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, La/B2;

    return-object p0
.end method

.method public static values()[La/B2;
    .locals 1

    sget-object v0, La/B2;->b:[La/B2;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La/B2;

    return-object v0
.end method
