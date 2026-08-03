.class public final LYue/ۥۢ۟ۨۧ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡۨۨۨ;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "SharingStarted.Lazily"

    return-object v0
.end method

.method public ۥ(LYue/ۥۢ۠۟ۡ;)LYue/ۥۣ۠ۢۡ;
    .locals 2
    .param p1    # LYue/ۥۢ۠۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e2\u06e0\u06df\u06e1<",
            "Ljava/lang/Integer;",
            ">;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "LYue/\u06e5\u06e1\u06e8\u06e8\u06e6;",
            ">;"
        }
    .end annotation

    new-instance v0, LYue/ۥۢ۟ۨۧ$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LYue/ۥۢ۟ۨۧ$ۥ;-><init>(LYue/ۥۢ۠۟ۡ;LYue/ۥ۟ۧۤۢ;)V

    invoke-static {v0}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۦۤ(LYue/ۥۣ۠ۢۢ;)LYue/ۥۣ۠ۢۡ;

    move-result-object p1

    return-object p1
.end method
