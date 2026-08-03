.class public final LYue/ۥ۟ۦۧۡ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۦۧۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# instance fields
.field public final ۥ:Ljava/lang/Throwable;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 0
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۟ۦۧۡ$ۥ;->ۥ:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final ۥ()Ljava/lang/Throwable;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۦۧۡ$ۥ;->ۥ:Ljava/lang/Throwable;

    if-nez v0, :cond_0

    new-instance v0, LYue/ۥ۟ۥۣ۟;

    const-string v1, "Channel was closed"

    invoke-direct {v0, v1}, LYue/ۥ۟ۥۣ۟;-><init>(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method public final ۥ۟()Ljava/lang/Throwable;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۦۧۡ$ۥ;->ۥ:Ljava/lang/Throwable;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Channel was closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method
