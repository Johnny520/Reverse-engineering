.class public final LYue/ۥۡۡۦۤ$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۡۦۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df"
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥ۠ۤۢۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۤ:LYue/ۥۣۣ۟۠;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۠ۤۢۢ;LYue/ۥۣۣ۟۠;)V
    .locals 1
    .param p1    # LYue/ۥ۠ۤۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣۣ۟۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "headers"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡۡۦۤ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥ۠ۤۢۢ;

    iput-object p2, p0, LYue/ۥۡۡۦۤ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥۣۣ۟۠;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    iget-object v0, p0, LYue/ۥۡۡۦۤ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥۣۣ۟۠;

    invoke-interface {v0}, LYue/ۥۣۢ۟ۦ;->close()V

    return-void
.end method

.method public final ۥ۟()LYue/ۥۣۣ۟۠;
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "body"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۡۦۤ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥۣۣ۟۠;

    return-object v0
.end method

.method public final ۥ۟۟()LYue/ۥ۠ۤۢۢ;
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "headers"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۡۦۤ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥ۠ۤۢۢ;

    return-object v0
.end method
