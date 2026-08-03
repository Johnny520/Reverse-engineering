.class public final enum Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$ForDefaultValues$Factory;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$ForDefaultValues;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Factory"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$ForDefaultValues$Factory;",
        ">;",
        "Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$Factory;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$ForDefaultValues$Factory;

.field public static final enum INSTANCE:Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$ForDefaultValues$Factory;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$ForDefaultValues$Factory;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$ForDefaultValues$Factory;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$ForDefaultValues$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$ForDefaultValues$Factory;

    filled-new-array {v0}, [Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$ForDefaultValues$Factory;

    move-result-object v0

    sput-object v0, Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$ForDefaultValues$Factory;->$VALUES:[Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$ForDefaultValues$Factory;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$ForDefaultValues$Factory;
    .locals 1

    const-class v0, Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$ForDefaultValues$Factory;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$ForDefaultValues$Factory;

    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$ForDefaultValues$Factory;
    .locals 1

    sget-object v0, Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$ForDefaultValues$Factory;->$VALUES:[Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$ForDefaultValues$Factory;

    invoke-virtual {v0}, [Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$ForDefaultValues$Factory;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$ForDefaultValues$Factory;

    return-object v0
.end method


# virtual methods
.method public resolve(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Z)Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver;
    .locals 1

    new-instance v0, Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$ForDefaultValues;

    invoke-direct {v0, p1, p2}, Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$ForDefaultValues;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Z)V

    return-object v0
.end method
