.class public interface abstract Lnet/bytebuddy/description/module/ModuleDescription;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/description/NamedElement;
.implements Lnet/bytebuddy/description/ModifierReviewable$ForModuleDescription;
.implements Lnet/bytebuddy/description/annotation/AnnotationSource;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/description/module/ModuleDescription$Latent;,
        Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;,
        Lnet/bytebuddy/description/module/ModuleDescription$AbstractBase;,
        Lnet/bytebuddy/description/module/ModuleDescription$Provides;,
        Lnet/bytebuddy/description/module/ModuleDescription$Requires;,
        Lnet/bytebuddy/description/module/ModuleDescription$Opens;,
        Lnet/bytebuddy/description/module/ModuleDescription$Exports;
    }
.end annotation


# static fields
.field public static final MODULE_CLASS_NAME:Ljava/lang/String; = "module-info"

.field public static final UNDEFINED:Lnet/bytebuddy/description/module/ModuleDescription;
    .annotation runtime Lnet/bytebuddy/utility/nullability/AlwaysNull;
    .end annotation
.end field


# virtual methods
.method public abstract accept(Lnet/bytebuddy/jar/asm/ClassVisitor;)V
.end method

.method public abstract getExports()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/module/ModuleDescription$Exports;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getMainClass()Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end method

.method public abstract getOpens()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/module/ModuleDescription$Opens;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getPackages()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getProvides()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/module/ModuleDescription$Provides;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getRequires()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/module/ModuleDescription$Requires;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getUses()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getVersion()Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end method
