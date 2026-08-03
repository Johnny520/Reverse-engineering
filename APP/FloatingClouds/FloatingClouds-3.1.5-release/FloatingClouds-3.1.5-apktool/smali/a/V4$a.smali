.class public final enum La/V4$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/V4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "La/V4$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:La/V4$a;

.field public static final enum b:La/V4$a;

.field public static final enum c:La/V4$a;

.field public static final enum d:La/V4$a;

.field public static final enum e:La/V4$a;

.field public static final enum f:La/V4$a;

.field public static final enum g:La/V4$a;

.field public static final enum h:La/V4$a;

.field public static final synthetic i:[La/V4$a;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, La/V4$a;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, La/V4$a;->a:La/V4$a;

    new-instance v1, La/V4$a;

    const-string v2, "HORIZONTAL_DIMENSION"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, La/V4$a;->b:La/V4$a;

    new-instance v2, La/V4$a;

    const-string v3, "VERTICAL_DIMENSION"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, La/V4$a;->c:La/V4$a;

    new-instance v3, La/V4$a;

    const-string v4, "LEFT"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, La/V4$a;->d:La/V4$a;

    new-instance v4, La/V4$a;

    const-string v5, "RIGHT"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v4, La/V4$a;->e:La/V4$a;

    new-instance v5, La/V4$a;

    const-string v6, "TOP"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v5, La/V4$a;->f:La/V4$a;

    new-instance v6, La/V4$a;

    const-string v7, "BOTTOM"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v6, La/V4$a;->g:La/V4$a;

    new-instance v7, La/V4$a;

    const-string v8, "BASELINE"

    const/4 v9, 0x7

    invoke-direct {v7, v8, v9}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v7, La/V4$a;->h:La/V4$a;

    filled-new-array/range {v0 .. v7}, [La/V4$a;

    move-result-object v0

    sput-object v0, La/V4$a;->i:[La/V4$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public static valueOf(Ljava/lang/String;)La/V4$a;
    .locals 1

    const-class v0, La/V4$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, La/V4$a;

    return-object p0
.end method

.method public static values()[La/V4$a;
    .locals 1

    sget-object v0, La/V4$a;->i:[La/V4$a;

    invoke-virtual {v0}, [La/V4$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La/V4$a;

    return-object v0
.end method
