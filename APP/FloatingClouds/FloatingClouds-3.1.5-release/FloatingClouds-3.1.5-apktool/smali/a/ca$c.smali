.class public final enum La/ca$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/ca;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "La/ca$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:La/ca$c;

.field public static final enum b:La/ca$c;

.field public static final enum c:La/ca$c;

.field public static final enum d:La/ca$c;

.field public static final enum e:La/ca$c;

.field public static final enum f:La/ca$c;

.field public static final synthetic g:[La/ca$c;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, La/ca$c;

    const-string v1, "MULTI_CLICK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, La/ca$c;->a:La/ca$c;

    new-instance v1, La/ca$c;

    const-string v2, "LONG_PRESS"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, La/ca$c;->b:La/ca$c;

    new-instance v2, La/ca$c;

    const-string v3, "SEARCH_COMMAND"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, La/ca$c;->c:La/ca$c;

    new-instance v3, La/ca$c;

    const-string v4, "AUTO_REHIDE"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v4, La/ca$c;

    const-string v5, "EXPLICIT_REHIDE"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v4, La/ca$c;->d:La/ca$c;

    new-instance v5, La/ca$c;

    const-string v6, "BACK_KEY"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v5, La/ca$c;->e:La/ca$c;

    new-instance v6, La/ca$c;

    const-string v7, "LEAVE_APP"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v6, La/ca$c;->f:La/ca$c;

    new-instance v7, La/ca$c;

    const-string v8, "ENTER_CHAT"

    const/4 v9, 0x7

    invoke-direct {v7, v8, v9}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    filled-new-array/range {v0 .. v7}, [La/ca$c;

    move-result-object v0

    sput-object v0, La/ca$c;->g:[La/ca$c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public static valueOf(Ljava/lang/String;)La/ca$c;
    .locals 1

    const-class v0, La/ca$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, La/ca$c;

    return-object p0
.end method

.method public static values()[La/ca$c;
    .locals 1

    sget-object v0, La/ca$c;->g:[La/ca$c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La/ca$c;

    return-object v0
.end method
