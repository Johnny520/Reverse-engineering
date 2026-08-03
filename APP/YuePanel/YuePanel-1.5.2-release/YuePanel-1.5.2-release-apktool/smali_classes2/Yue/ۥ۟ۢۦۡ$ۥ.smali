.class public LYue/ۥ۟ۢۦۡ$ۥ;
.super Ljava/lang/InheritableThreadLocal;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۢۦۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/InheritableThreadLocal<",
        "Ljava/util/Map<",
        "Ljava/lang/String;",
        "Ljava/lang/String;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:LYue/ۥ۟ۢۦۡ;


# direct methods
.method public constructor <init>(LYue/ۥ۟ۢۦۡ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۟ۢۦۡ$ۥ;->ۥ:LYue/ۥ۟ۢۦۡ;

    invoke-direct {p0}, Ljava/lang/InheritableThreadLocal;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic childValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Map;

    invoke-virtual {p0, p1}, LYue/ۥ۟ۢۦۡ$ۥ;->ۥ(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public ۥ(Ljava/util/Map;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    return-object v0
.end method
