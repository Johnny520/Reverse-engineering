.class public final enum LPn;
.super Ljava/lang/Enum;
.source ""


# static fields
.field public static final enum a:LPn;

.field public static final enum b:LPn;

.field public static final enum c:LPn;

.field public static final enum d:LPn;

.field public static final enum e:LPn;

.field public static final synthetic f:[LPn;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, LPn;

    const-string v1, "DESTROYED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, LPn;->a:LPn;

    new-instance v1, LPn;

    const-string v2, "INITIALIZED"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, LPn;->b:LPn;

    new-instance v2, LPn;

    const-string v3, "CREATED"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, LPn;->c:LPn;

    new-instance v3, LPn;

    const-string v4, "STARTED"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, LPn;->d:LPn;

    new-instance v4, LPn;

    const-string v5, "RESUMED"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v4, LPn;->e:LPn;

    filled-new-array {v0, v1, v2, v3, v4}, [LPn;

    move-result-object v0

    sput-object v0, LPn;->f:[LPn;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LPn;
    .locals 1

    const-class v0, LPn;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LPn;

    return-object p0
.end method

.method public static values()[LPn;
    .locals 1

    sget-object v0, LPn;->f:[LPn;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LPn;

    return-object v0
.end method


# virtual methods
.method public final a(LPn;)Z
    .locals 0

    invoke-virtual {p0, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
