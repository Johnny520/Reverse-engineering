.class public final enum Lcom/tendcloud/tenddata/di;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/tendcloud/tenddata/di;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/tendcloud/tenddata/di;

.field public static final enum b:Lcom/tendcloud/tenddata/di;

.field public static final enum c:Lcom/tendcloud/tenddata/di;

.field private static final synthetic e:[Lcom/tendcloud/tenddata/di;


# instance fields
.field private d:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/tendcloud/tenddata/di;

    const-string v1, "WIFI"

    const/4 v2, 0x0

    const-string v3, "wifi"

    invoke-direct {v0, v1, v2, v3}, Lcom/tendcloud/tenddata/di;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/tendcloud/tenddata/di;->a:Lcom/tendcloud/tenddata/di;

    new-instance v1, Lcom/tendcloud/tenddata/di;

    const-string v3, "CELLULAR"

    const/4 v4, 0x1

    const-string v5, "cellular"

    invoke-direct {v1, v3, v4, v5}, Lcom/tendcloud/tenddata/di;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/tendcloud/tenddata/di;->b:Lcom/tendcloud/tenddata/di;

    new-instance v3, Lcom/tendcloud/tenddata/di;

    const-string v5, "BLUETOOTH"

    const/4 v6, 0x2

    const-string v7, "bluetooth"

    invoke-direct {v3, v5, v6, v7}, Lcom/tendcloud/tenddata/di;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lcom/tendcloud/tenddata/di;->c:Lcom/tendcloud/tenddata/di;

    const/4 v5, 0x3

    new-array v5, v5, [Lcom/tendcloud/tenddata/di;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lcom/tendcloud/tenddata/di;->e:[Lcom/tendcloud/tenddata/di;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/tendcloud/tenddata/di;->d:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/tendcloud/tenddata/di;
    .locals 1

    const-class v0, Lcom/tendcloud/tenddata/di;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/tendcloud/tenddata/di;

    return-object p0
.end method

.method public static values()[Lcom/tendcloud/tenddata/di;
    .locals 1

    sget-object v0, Lcom/tendcloud/tenddata/di;->e:[Lcom/tendcloud/tenddata/di;

    invoke-virtual {v0}, [Lcom/tendcloud/tenddata/di;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/tendcloud/tenddata/di;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tendcloud/tenddata/di;->d:Ljava/lang/String;

    return-object v0
.end method
