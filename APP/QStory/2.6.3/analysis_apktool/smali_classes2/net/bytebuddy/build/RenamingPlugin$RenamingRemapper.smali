.class public Lnet/bytebuddy/build/RenamingPlugin$RenamingRemapper;
.super Lnet/bytebuddy/jar/asm/commons/Remapper;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


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

    .line 1
    sget v0, Lnet/bytebuddy/utility/OpenedClassReader;->ASM_API:I

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lnet/bytebuddy/jar/asm/commons/Remapper;-><init>(I)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lnet/bytebuddy/build/RenamingPlugin$RenamingRemapper;->cache:Ljava/util/Map;

    .line 12
    .line 13
    iput-object p1, p0, Lnet/bytebuddy/build/RenamingPlugin$RenamingRemapper;->renaming:Lnet/bytebuddy/build/RenamingPlugin$Renaming;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public map(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/build/RenamingPlugin$RenamingRemapper;->cache:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/build/RenamingPlugin$RenamingRemapper;->renaming:Lnet/bytebuddy/build/RenamingPlugin$Renaming;

    .line 13
    .line 14
    const/16 v1, 0x2f

    .line 15
    .line 16
    const/16 v2, 0x2e

    .line 17
    .line 18
    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-interface {v0, v3}, Lnet/bytebuddy/build/RenamingPlugin$Renaming;->apply(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object p0, p0, Lnet/bytebuddy/build/RenamingPlugin$RenamingRemapper;->cache:Ljava/util/Map;

    .line 31
    .line 32
    invoke-interface {p0, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    return-object v0
.end method
