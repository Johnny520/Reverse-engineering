.class public interface abstract Lnet/bytebuddy/description/type/PackageDescription;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/description/NamedElement$WithRuntimeName;
.implements Lnet/bytebuddy/description/annotation/AnnotationSource;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/description/type/PackageDescription$ForLoadedPackage;,
        Lnet/bytebuddy/description/type/PackageDescription$Simple;,
        Lnet/bytebuddy/description/type/PackageDescription$AbstractBase;
    }
.end annotation


# static fields
.field public static final DEFAULT:Lnet/bytebuddy/description/type/PackageDescription;

.field public static final PACKAGE_CLASS_NAME:Ljava/lang/String; = "package-info"

.field public static final PACKAGE_MODIFIERS:I = 0x1600

.field public static final UNDEFINED:Lnet/bytebuddy/description/type/PackageDescription;
    .annotation runtime Lnet/bytebuddy/utility/nullability/AlwaysNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/description/type/PackageDescription$Simple;

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lnet/bytebuddy/description/type/PackageDescription$Simple;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lnet/bytebuddy/description/type/PackageDescription;->DEFAULT:Lnet/bytebuddy/description/type/PackageDescription;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    sput-object v0, Lnet/bytebuddy/description/type/PackageDescription;->UNDEFINED:Lnet/bytebuddy/description/type/PackageDescription;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public abstract contains(Lnet/bytebuddy/description/type/TypeDescription;)Z
.end method

.method public abstract isDefault()Z
.end method
