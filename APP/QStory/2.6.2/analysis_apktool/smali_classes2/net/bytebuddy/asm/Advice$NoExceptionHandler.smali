.class Lnet/bytebuddy/asm/Advice$NoExceptionHandler;
.super Ljava/lang/Throwable;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "NoExceptionHandler"
.end annotation


# static fields
.field private static final DESCRIPTION:Lnet/bytebuddy/description/type/TypeDescription;

.field private static final serialVersionUID:J = 0x1L


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/asm/Advice$NoExceptionHandler;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lnet/bytebuddy/asm/Advice$NoExceptionHandler;->DESCRIPTION:Lnet/bytebuddy/description/type/TypeDescription;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Throwable;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 5
    .line 6
    const-string v0, "This class only serves as a marker type and should not be instantiated"

    .line 7
    .line 8
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    throw p0
.end method

.method public static synthetic access$4000()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/asm/Advice$NoExceptionHandler;->DESCRIPTION:Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    return-object v0
.end method
