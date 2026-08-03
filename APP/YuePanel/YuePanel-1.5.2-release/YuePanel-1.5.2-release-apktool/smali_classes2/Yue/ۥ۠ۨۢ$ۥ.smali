.class public LYue/ۥ۠ۨۢ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠ۡۡ۟$ۥ۟۟;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۨۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# instance fields
.field public final ۥ:LYue/ۥ۠ۤۨۢ$ۥ۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-direct {p0, v0, v1, v0}, LYue/ۥ۠ۨۢ$ۥ;-><init>(LYue/ۥ۠ۤۨۢ$ۥ۟;ILYue/ۥ۟ۨۥۢ;)V

    return-void
.end method

.method public constructor <init>(LYue/ۥ۠ۤۨۢ$ۥ۟;)V
    .locals 1
    .param p1    # LYue/ۥ۠ۤۨۢ$ۥ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    const-string v0, "logger"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LYue/ۥ۠ۨۢ$ۥ;->ۥ:LYue/ۥ۠ۤۨۢ$ۥ۟;

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥ۠ۤۨۢ$ۥ۟;ILYue/ۥ۟ۨۥۢ;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 4
    sget-object p1, LYue/ۥ۠ۤۨۢ$ۥ۟;->ۥ۟:LYue/ۥ۠ۤۨۢ$ۥ۟;

    .line 5
    :cond_0
    invoke-direct {p0, p1}, LYue/ۥ۠ۨۢ$ۥ;-><init>(LYue/ۥ۠ۤۨۢ$ۥ۟;)V

    return-void
.end method


# virtual methods
.method public ۥ(LYue/ۥۣ۟ۦۣ;)LYue/ۥ۠ۡۡ۟;
    .locals 2
    .param p1    # LYue/ۥۣ۟ۦۣ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "call"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, LYue/ۥ۠ۨۢ;

    iget-object v0, p0, LYue/ۥ۠ۨۢ$ۥ;->ۥ:LYue/ۥ۠ۤۨۢ$ۥ۟;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, LYue/ۥ۠ۨۢ;-><init>(LYue/ۥ۠ۤۨۢ$ۥ۟;LYue/ۥ۟ۨۥۢ;)V

    return-object p1
.end method
