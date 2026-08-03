.class public final enum LUm;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements LJl;


# static fields
.field public static final enum b:LUm;

.field public static final enum c:LUm;

.field public static final enum d:LUm;

.field public static final enum e:LUm;

.field public static final enum f:LUm;

.field public static final enum g:LUm;

.field public static final synthetic h:[LUm;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, LUm;

    const-string v1, "UNKNOWN_KEYMATERIAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LUm;-><init>(Ljava/lang/String;II)V

    sput-object v0, LUm;->b:LUm;

    new-instance v1, LUm;

    const-string v2, "SYMMETRIC"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, LUm;-><init>(Ljava/lang/String;II)V

    sput-object v1, LUm;->c:LUm;

    new-instance v2, LUm;

    const-string v3, "ASYMMETRIC_PRIVATE"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, LUm;-><init>(Ljava/lang/String;II)V

    sput-object v2, LUm;->d:LUm;

    new-instance v3, LUm;

    const-string v4, "ASYMMETRIC_PUBLIC"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5, v5}, LUm;-><init>(Ljava/lang/String;II)V

    sput-object v3, LUm;->e:LUm;

    new-instance v4, LUm;

    const-string v5, "REMOTE"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6, v6}, LUm;-><init>(Ljava/lang/String;II)V

    sput-object v4, LUm;->f:LUm;

    new-instance v5, LUm;

    const/4 v6, 0x5

    const/4 v7, -0x1

    const-string v8, "UNRECOGNIZED"

    invoke-direct {v5, v8, v6, v7}, LUm;-><init>(Ljava/lang/String;II)V

    sput-object v5, LUm;->g:LUm;

    filled-new-array/range {v0 .. v5}, [LUm;

    move-result-object v0

    sput-object v0, LUm;->h:[LUm;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LUm;->a:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LUm;
    .locals 1

    const-class v0, LUm;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LUm;

    return-object p0
.end method

.method public static values()[LUm;
    .locals 1

    sget-object v0, LUm;->h:[LUm;

    invoke-virtual {v0}, [LUm;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LUm;

    return-object v0
.end method
