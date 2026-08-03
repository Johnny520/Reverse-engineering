.class public final LYue/ۥ۠ۥۡ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠ۥۡ۠;


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥۣۡۢۧ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۣۡۢۧ;)V
    .locals 0
    .param p1    # LYue/ۥۣۡۢۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۥۡ۟;->ۥۣ۟۟۠:LYue/ۥۣۡۢۧ;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ۥ۟۟ۡ()LYue/ۥۣۡۢۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۥۡ۟;->ۥۣ۟۟۠:LYue/ۥۣۡۢۧ;

    return-object v0
.end method
