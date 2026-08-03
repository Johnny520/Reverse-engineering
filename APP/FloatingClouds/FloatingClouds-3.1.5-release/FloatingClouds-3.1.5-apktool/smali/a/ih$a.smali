.class public final enum La/ih$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/ih;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "La/ih$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:La/ih$a;

.field public static final enum b:La/ih$a;

.field public static final synthetic c:[La/ih$a;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, La/ih$a;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, La/ih$a;->a:La/ih$a;

    new-instance v1, La/ih$a;

    const-string v2, "START"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v2, La/ih$a;

    const-string v3, "END"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v3, La/ih$a;

    const-string v4, "CENTER"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, La/ih$a;->b:La/ih$a;

    filled-new-array {v0, v1, v2, v3}, [La/ih$a;

    move-result-object v0

    sput-object v0, La/ih$a;->c:[La/ih$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public static valueOf(Ljava/lang/String;)La/ih$a;
    .locals 1

    const-class v0, La/ih$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, La/ih$a;

    return-object p0
.end method

.method public static values()[La/ih$a;
    .locals 1

    sget-object v0, La/ih$a;->c:[La/ih$a;

    invoke-virtual {v0}, [La/ih$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La/ih$a;

    return-object v0
.end method
