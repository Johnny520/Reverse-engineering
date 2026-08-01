.class public final enum Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/MethodAccessorFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "AccessType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;

.field public static final enum DEFAULT:Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;

.field public static final enum PUBLIC:Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;


# instance fields
.field private final visibility:Lnet/bytebuddy/description/modifier/Visibility;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lnet/bytebuddy/description/modifier/Visibility;->PUBLIC:Lnet/bytebuddy/description/modifier/Visibility;

    .line 5
    .line 6
    const-string v3, "PUBLIC"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/modifier/Visibility;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;->PUBLIC:Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;

    .line 12
    .line 13
    new-instance v1, Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    sget-object v3, Lnet/bytebuddy/description/modifier/Visibility;->PACKAGE_PRIVATE:Lnet/bytebuddy/description/modifier/Visibility;

    .line 17
    .line 18
    const-string v4, "DEFAULT"

    .line 19
    .line 20
    invoke-direct {v1, v4, v2, v3}, Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/modifier/Visibility;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;->DEFAULT:Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;

    .line 24
    .line 25
    filled-new-array {v0, v1}, [Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;->$VALUES:[Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;

    .line 30
    .line 31
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILnet/bytebuddy/description/modifier/Visibility;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/modifier/Visibility;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;->visibility:Lnet/bytebuddy/description/modifier/Visibility;

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;->$VALUES:[Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public getVisibility()Lnet/bytebuddy/description/modifier/Visibility;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;->visibility:Lnet/bytebuddy/description/modifier/Visibility;

    .line 2
    .line 3
    return-object p0
.end method
