.class public final enum Lwu;
.super Ljava/lang/Enum;
.source ""


# static fields
.field public static final enum a:Lwu;

.field public static final enum b:Lwu;

.field public static final enum c:Lwu;

.field public static final enum d:Lwu;

.field public static final synthetic e:[Lwu;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lwu;

    const-string v1, "IMMEDIATE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lwu;->a:Lwu;

    new-instance v1, Lwu;

    const-string v2, "HIGH"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lwu;->b:Lwu;

    new-instance v2, Lwu;

    const-string v3, "NORMAL"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lwu;->c:Lwu;

    new-instance v3, Lwu;

    const-string v4, "LOW"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lwu;->d:Lwu;

    filled-new-array {v0, v1, v2, v3}, [Lwu;

    move-result-object v0

    sput-object v0, Lwu;->e:[Lwu;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lwu;
    .locals 1

    const-class v0, Lwu;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lwu;

    return-object p0
.end method

.method public static values()[Lwu;
    .locals 1

    sget-object v0, Lwu;->e:[Lwu;

    invoke-virtual {v0}, [Lwu;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lwu;

    return-object v0
.end method
