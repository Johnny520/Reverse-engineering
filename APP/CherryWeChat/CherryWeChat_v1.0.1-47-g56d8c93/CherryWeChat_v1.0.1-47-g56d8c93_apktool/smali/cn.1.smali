.class public final enum Lcn;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements LJl;


# static fields
.field public static final enum b:Lcn;

.field public static final enum c:Lcn;

.field public static final enum d:Lcn;

.field public static final enum e:Lcn;

.field public static final enum f:Lcn;

.field public static final synthetic g:[Lcn;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcn;

    const-string v1, "UNKNOWN_STATUS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcn;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcn;->b:Lcn;

    new-instance v1, Lcn;

    const-string v2, "ENABLED"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Lcn;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcn;->c:Lcn;

    new-instance v2, Lcn;

    const-string v3, "DISABLED"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Lcn;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lcn;->d:Lcn;

    new-instance v3, Lcn;

    const-string v4, "DESTROYED"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5, v5}, Lcn;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcn;->e:Lcn;

    new-instance v4, Lcn;

    const/4 v5, 0x4

    const/4 v6, -0x1

    const-string v7, "UNRECOGNIZED"

    invoke-direct {v4, v7, v5, v6}, Lcn;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lcn;->f:Lcn;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcn;

    move-result-object v0

    sput-object v0, Lcn;->g:[Lcn;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcn;->a:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcn;
    .locals 1

    const-class v0, Lcn;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcn;

    return-object p0
.end method

.method public static values()[Lcn;
    .locals 1

    sget-object v0, Lcn;->g:[Lcn;

    invoke-virtual {v0}, [Lcn;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcn;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 2

    sget-object v0, Lcn;->f:Lcn;

    if-eq p0, v0, :cond_0

    iget v0, p0, Lcn;->a:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
