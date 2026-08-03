.class public final LYue/ۥۡۦ۠ۥ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۦ۠ۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
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
    invoke-direct {p0}, LYue/ۥۡۦ۠ۥ$ۥ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ(LYue/ۥۡۦ۠ۦ;LYue/ۥۣۡۧ۠;Ljava/net/Socket;J)LYue/ۥۡۦ۠ۥ;
    .locals 1
    .param p1    # LYue/ۥۡۦ۠ۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣۡۧ۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # Ljava/net/Socket;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "connectionPool"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "route"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "socket"

    invoke-static {p3, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۡۦ۠ۥ;

    invoke-direct {v0, p1, p2}, LYue/ۥۡۦ۠ۥ;-><init>(LYue/ۥۡۦ۠ۦ;LYue/ۥۣۡۧ۠;)V

    invoke-static {v0, p3}, LYue/ۥۡۦ۠ۥ;->ۥ۟۟۟ۢ(LYue/ۥۡۦ۠ۥ;Ljava/net/Socket;)V

    invoke-virtual {v0, p4, p5}, LYue/ۥۡۦ۠ۥ;->ۥ۟۟ۡۥ(J)V

    return-object v0
.end method
