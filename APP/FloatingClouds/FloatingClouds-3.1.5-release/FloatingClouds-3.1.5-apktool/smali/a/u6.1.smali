.class public final enum La/u6;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "La/u6;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:La/u6;

.field public static final enum b:La/u6;

.field public static final synthetic c:[La/u6;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, La/u6;

    const-string v1, "Read"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, La/u6;->a:La/u6;

    new-instance v1, La/u6;

    const-string v2, "Write"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, La/u6;->b:La/u6;

    filled-new-array {v0, v1}, [La/u6;

    move-result-object v0

    sput-object v0, La/u6;->c:[La/u6;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public static valueOf(Ljava/lang/String;)La/u6;
    .locals 1

    const-class v0, La/u6;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, La/u6;

    return-object p0
.end method

.method public static values()[La/u6;
    .locals 1

    sget-object v0, La/u6;->c:[La/u6;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La/u6;

    return-object v0
.end method
