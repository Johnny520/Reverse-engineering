.class public final LYue/ۥ۟ۤۢ۟$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥ۠ۥۦۧ;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۤۢ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥ۟ۨۥۢ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LYue/ۥ۟ۤۢ۟$ۥ۟;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ(Ljava/lang/Throwable;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۥۦۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Throwable;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۟ۤۢ۟$ۥ;

    invoke-direct {v0, p1}, LYue/ۥ۟ۤۢ۟$ۥ;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v0}, LYue/ۥ۟ۤۢ۟;->ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟()Ljava/lang/Object;
    .locals 1
    .annotation build LYue/ۥ۠ۥۦۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">()",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {}, LYue/ۥ۟ۤۢ۟;->ۥ()LYue/ۥ۟ۤۢ۟$ۥ۟۟;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۟ۤۢ۟;->ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation build LYue/ۥ۠ۥۦۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p1}, LYue/ۥ۟ۤۢ۟;->ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
