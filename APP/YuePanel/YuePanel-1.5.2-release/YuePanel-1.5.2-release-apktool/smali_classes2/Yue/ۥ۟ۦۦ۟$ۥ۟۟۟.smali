.class public final LYue/ۥ۟ۦۦ۟$ۥ۟۟۟;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۢۢ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟ۦۦ۟;->ۥ()Ljava/util/Set;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
        "TK;TV;",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# static fields
.field public static final ۥۣ۟۟۠:LYue/ۥ۟ۦۦ۟$ۥ۟۟۟;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥ۟ۦۦ۟$ۥ۟۟۟;

    invoke-direct {v0}, LYue/ۥ۟ۦۦ۟$ۥ۟۟۟;-><init>()V

    sput-object v0, LYue/ۥ۟ۦۦ۟$ۥ۟۟۟;->ۥۣ۟۟۠:LYue/ۥ۟ۦۦ۟$ۥ۟۟۟;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LYue/ۥ۟ۦۦ۟$ۥ۟۟۟;->ۥ۟۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۟ۦۦ۟$ۥ۟;

    invoke-direct {v0, p1, p2}, LYue/ۥ۟ۦۦ۟$ۥ۟;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method
