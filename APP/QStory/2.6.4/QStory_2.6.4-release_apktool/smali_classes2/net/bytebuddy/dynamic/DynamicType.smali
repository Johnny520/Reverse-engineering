.class public interface abstract Lnet/bytebuddy/dynamic/DynamicType;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/dynamic/ClassFileLocator;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/DynamicType$Default;,
        Lnet/bytebuddy/dynamic/DynamicType$AbstractBase;,
        Lnet/bytebuddy/dynamic/DynamicType$Loaded;,
        Lnet/bytebuddy/dynamic/DynamicType$Unloaded;,
        Lnet/bytebuddy/dynamic/DynamicType$Builder;
    }
.end annotation


# virtual methods
.method public abstract close()V
.end method

.method public abstract getAllTypeDescriptions()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getAllTypes()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "[B>;"
        }
    .end annotation
.end method

.method public abstract getAuxiliaries()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/dynamic/DynamicType;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getAuxiliaryTypeDescriptions()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getAuxiliaryTypes()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "[B>;"
        }
    .end annotation
.end method

.method public abstract getBytes()[B
.end method

.method public abstract getLoadedTypeInitializer()Lnet/bytebuddy/implementation/LoadedTypeInitializer;
.end method

.method public abstract getLoadedTypeInitializers()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/implementation/LoadedTypeInitializer;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;
.end method

.method public abstract hasAliveLoadedTypeInitializers()Z
.end method

.method public abstract inject(Ljava/io/File;)Ljava/io/File;
.end method

.method public abstract inject(Ljava/io/File;Ljava/io/File;)Ljava/io/File;
.end method

.method public abstract saveIn(Ljava/io/File;)Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            ")",
            "Ljava/util/Map<",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end method

.method public abstract toJar(Ljava/io/File;)Ljava/io/File;
.end method

.method public abstract toJar(Ljava/io/File;Ljava/util/jar/Manifest;)Ljava/io/File;
.end method
