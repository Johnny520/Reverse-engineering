.class public Lnet/bytebuddy/build/RenamingPlugin$RenamingRemapper;
.super Lnet/bytebuddy/jar/asm/commons/Remapper;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/RenamingPlugin;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RenamingRemapper"
.end annotation


# instance fields
.field private final cache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final renaming:Lnet/bytebuddy/build/RenamingPlugin$Renaming;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/build/RenamingPlugin$Renaming;)V
    .locals 1

    invoke-direct {p0}, Lnet/bytebuddy/jar/asm/commons/Remapper;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lnet/bytebuddy/build/RenamingPlugin$RenamingRemapper;->cache:Ljava/util/Map;

    iput-object p1, p0, Lnet/bytebuddy/build/RenamingPlugin$RenamingRemapper;->renaming:Lnet/bytebuddy/build/RenamingPlugin$Renaming;

    return-void
.end method


# virtual methods
.method public map(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lnet/bytebuddy/build/RenamingPlugin$RenamingRemapper;->cache:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/build/RenamingPlugin$RenamingRemapper;->renaming:Lnet/bytebuddy/build/RenamingPlugin$Renaming;

    const/16 v1, 0x2f

    const/16 v2, 0x2e

    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Lnet/bytebuddy/build/RenamingPlugin$Renaming;->apply(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lnet/bytebuddy/build/RenamingPlugin$RenamingRemapper;->cache:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
