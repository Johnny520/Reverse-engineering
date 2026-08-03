.class public final enum La/ca$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/ca;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "La/ca$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:La/ca$b;

.field public static final enum b:La/ca$b;

.field public static final enum c:La/ca$b;

.field public static final synthetic d:[La/ca$b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, La/ca$b;

    const-string v1, "HIDDEN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, La/ca$b;->a:La/ca$b;

    new-instance v1, La/ca$b;

    const-string v2, "UNHIDDEN_USER"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, La/ca$b;->b:La/ca$b;

    new-instance v2, La/ca$b;

    const-string v3, "UNHIDDEN_COMMAND"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, La/ca$b;->c:La/ca$b;

    filled-new-array {v0, v1, v2}, [La/ca$b;

    move-result-object v0

    sput-object v0, La/ca$b;->d:[La/ca$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public static valueOf(Ljava/lang/String;)La/ca$b;
    .locals 1

    const-class v0, La/ca$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, La/ca$b;

    return-object p0
.end method

.method public static values()[La/ca$b;
    .locals 1

    sget-object v0, La/ca$b;->d:[La/ca$b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La/ca$b;

    return-object v0
.end method
