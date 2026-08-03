.class public final enum LLC;
.super Ljava/lang/Enum;
.source ""


# static fields
.field public static final enum a:LLC;

.field public static final enum b:LLC;

.field public static final enum c:LLC;

.field public static final enum d:LLC;

.field public static final enum e:LLC;

.field public static final synthetic f:[LLC;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, LLC;

    const-wide v1, -0x1b8dcfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, LLC;->a:LLC;

    new-instance v1, LLC;

    const-wide v2, -0x1b8e0fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, LLC;->b:LLC;

    new-instance v2, LLC;

    const-wide v3, -0x1b8e4fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, LLC;->c:LLC;

    new-instance v3, LLC;

    const-wide v4, -0x1b8ecfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, LLC;->d:LLC;

    new-instance v4, LLC;

    const-wide v5, -0x1b8f2fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v4, LLC;->e:LLC;

    filled-new-array {v0, v1, v2, v3, v4}, [LLC;

    move-result-object v0

    sput-object v0, LLC;->f:[LLC;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LLC;
    .locals 1

    const-class v0, LLC;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LLC;

    return-object p0
.end method

.method public static values()[LLC;
    .locals 1

    sget-object v0, LLC;->f:[LLC;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LLC;

    return-object v0
.end method
