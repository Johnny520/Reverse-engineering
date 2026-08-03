.class public final LYue/ۥ۟۟ۡۤ$ۥ۟۟;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۡ۟;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟۟ۡۤ;->toString()Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
        "Ljava/util/Map$Entry<",
        "+TK;+TV;>;",
        "Ljava/lang/CharSequence;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥ۟۟ۡۤ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06df\u06e1\u06e4<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۟۟ۡۤ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06df\u06e1\u06e4<",
            "TK;+TV;>;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۟۟ۡۤ$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥ۟۟ۡۤ;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {p0, p1}, LYue/ۥ۟۟ۡۤ$ۥ۟۟;->ۥ۟۟(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;
    .locals 1
    .param p1    # Ljava/util/Map$Entry;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry<",
            "+TK;+TV;>;)",
            "Ljava/lang/CharSequence;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۟۟ۡۤ$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥ۟۟ۡۤ;

    invoke-static {v0, p1}, LYue/ۥ۟۟ۡۤ;->ۥ(LYue/ۥ۟۟ۡۤ;Ljava/util/Map$Entry;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
