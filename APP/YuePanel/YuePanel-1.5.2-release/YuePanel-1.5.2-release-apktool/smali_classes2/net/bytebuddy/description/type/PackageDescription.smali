.class public interface abstract Lnet/bytebuddy/description/type/PackageDescription;
.super Ljava/lang/Object;
.source "SourceFile"

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

    new-instance v0, Lnet/bytebuddy/description/type/PackageDescription$Simple;

    const-string v1, ""

    invoke-direct {v0, v1}, Lnet/bytebuddy/description/type/PackageDescription$Simple;-><init>(Ljava/lang/String;)V

    sput-object v0, Lnet/bytebuddy/description/type/PackageDescription;->DEFAULT:Lnet/bytebuddy/description/type/PackageDescription;

    const/4 v0, 0x0

    sput-object v0, Lnet/bytebuddy/description/type/PackageDescription;->UNDEFINED:Lnet/bytebuddy/description/type/PackageDescription;

    return-void
.end method


# virtual methods
.method public abstract contains(Lnet/bytebuddy/description/type/TypeDescription;)Z
.end method

.method public abstract isDefault()Z
.end method
