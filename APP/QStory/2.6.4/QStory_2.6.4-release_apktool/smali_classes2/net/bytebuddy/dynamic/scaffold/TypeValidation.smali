.class public final enum Lnet/bytebuddy/dynamic/scaffold/TypeValidation;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/dynamic/scaffold/TypeValidation;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

.field public static final enum DISABLED:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

.field public static final enum ENABLED:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;


# instance fields
.field private final enabled:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 2
    .line 3
    const-string v1, "ENABLED"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v0, v1, v2, v3}, Lnet/bytebuddy/dynamic/scaffold/TypeValidation;-><init>(Ljava/lang/String;IZ)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lnet/bytebuddy/dynamic/scaffold/TypeValidation;->ENABLED:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 11
    .line 12
    new-instance v1, Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 13
    .line 14
    const-string v4, "DISABLED"

    .line 15
    .line 16
    invoke-direct {v1, v4, v3, v2}, Lnet/bytebuddy/dynamic/scaffold/TypeValidation;-><init>(Ljava/lang/String;IZ)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lnet/bytebuddy/dynamic/scaffold/TypeValidation;->DISABLED:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 20
    .line 21
    filled-new-array {v0, v1}, [Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lnet/bytebuddy/dynamic/scaffold/TypeValidation;->$VALUES:[Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 26
    .line 27
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-boolean p3, p0, Lnet/bytebuddy/dynamic/scaffold/TypeValidation;->enabled:Z

    .line 5
    .line 6
    return-void
.end method

.method public static of(Z)Lnet/bytebuddy/dynamic/scaffold/TypeValidation;
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Lnet/bytebuddy/dynamic/scaffold/TypeValidation;->ENABLED:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    sget-object p0, Lnet/bytebuddy/dynamic/scaffold/TypeValidation;->DISABLED:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 7
    .line 8
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/dynamic/scaffold/TypeValidation;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/dynamic/scaffold/TypeValidation;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/TypeValidation;->$VALUES:[Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/dynamic/scaffold/TypeValidation;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public isEnabled()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lnet/bytebuddy/dynamic/scaffold/TypeValidation;->enabled:Z

    .line 2
    .line 3
    return p0
.end method
