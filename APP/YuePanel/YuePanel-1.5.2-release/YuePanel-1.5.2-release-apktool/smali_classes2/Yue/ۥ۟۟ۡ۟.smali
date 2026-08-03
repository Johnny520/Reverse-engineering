.class public abstract LYue/ۥ۟۟ۡ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۢۡۧ$ۥ۟۟;


# annotations
.annotation runtime LYue/ۥ۟ۨۨۦ;
    message = "Using AbstractDoubleTimeSource is no longer recommended, use AbstractLongTimeSource instead."
.end annotation

.annotation build LYue/ۥ۠ۡۥۡ;
.end annotation

.annotation build LYue/ۥۢ۟ۡۡ;
    version = "1.3"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۟۟ۡ۟$ۥ;
    }
.end annotation


# instance fields
.field public final ۥ۟:LYue/ۥۣ۠۠;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۣ۠۠;)V
    .locals 1
    .param p1    # LYue/ۥۣ۠۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "unit"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۟۟ۡ۟;->ۥ۟:LYue/ۥۣ۠۠;

    return-void
.end method


# virtual methods
.method public ۥ()LYue/ۥ۟ۦۡۦ;
    .locals 8
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .line 2
    new-instance v7, LYue/ۥ۟۟ۡ۟$ۥ;

    invoke-virtual {p0}, LYue/ۥ۟۟ۡ۟;->ۥ۟۟()D

    move-result-wide v1

    sget-object v0, LYue/ۥ۠۠ۢۥ;->ۥ۟۟۠ۤ:LYue/ۥ۠۠ۢۥ$ۥ;

    invoke-virtual {v0}, LYue/ۥ۠۠ۢۥ$ۥ;->ۥۣ۟۟۟()J

    move-result-wide v4

    const/4 v6, 0x0

    move-object v0, v7

    move-object v3, p0

    invoke-direct/range {v0 .. v6}, LYue/ۥ۟۟ۡ۟$ۥ;-><init>(DLYue/ۥ۟۟ۡ۟;JLYue/ۥ۟ۨۥۢ;)V

    return-object v7
.end method

.method public bridge synthetic ۥ()LYue/ۥۣۢۡۦ;
    .locals 1

    .line 1
    invoke-virtual {p0}, LYue/ۥ۟۟ۡ۟;->ۥ()LYue/ۥ۟ۦۡۦ;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟()LYue/ۥۣ۠۠;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۟ۡ۟;->ۥ۟:LYue/ۥۣ۠۠;

    return-object v0
.end method

.method public abstract ۥ۟۟()D
.end method
