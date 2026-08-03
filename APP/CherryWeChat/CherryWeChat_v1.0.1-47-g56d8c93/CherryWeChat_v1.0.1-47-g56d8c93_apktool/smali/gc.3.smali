.class public final enum Lgc;
.super Ljava/lang/Enum;
.source ""


# static fields
.field public static final enum a:Lgc;

.field public static final synthetic b:[Lgc;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lgc;

    const-string v1, "COROUTINE_SUSPENDED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgc;->a:Lgc;

    new-instance v1, Lgc;

    const-string v2, "UNDECIDED"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v2, Lgc;

    const-string v3, "RESUMED"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    filled-new-array {v0, v1, v2}, [Lgc;

    move-result-object v0

    sput-object v0, Lgc;->b:[Lgc;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lgc;
    .locals 1

    const-class v0, Lgc;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lgc;

    return-object p0
.end method

.method public static values()[Lgc;
    .locals 1

    sget-object v0, Lgc;->b:[Lgc;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lgc;

    return-object v0
.end method
