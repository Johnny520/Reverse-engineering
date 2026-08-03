.class public final Lcom/yuexin/panel/security/SignatureGuard;
.super Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x135

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native assertValid(Ljava/lang/String;)V
.end method

.method private static native failFast()V
.end method

.method private static native nativeCheckSignature(Ljava/lang/String;)Z
.end method
