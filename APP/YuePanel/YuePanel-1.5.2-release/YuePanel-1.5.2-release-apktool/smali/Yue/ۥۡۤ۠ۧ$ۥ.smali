.class public final LYue/ۥۡۤ۠ۧ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۤ۠ۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# instance fields
.field public ۥ:LYue/ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ۟۟۟۠;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LYue/ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ۟;->ۥ:LYue/ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ۟;

    iput-object v0, p0, LYue/ۥۡۤ۠ۧ$ۥ;->ۥ:LYue/ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ۟۟۟۠;

    return-void
.end method


# virtual methods
.method public final ۥ()LYue/ۥۡۤ۠ۧ;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, LYue/ۥۡۤ۠ۧ;

    invoke-direct {v0}, LYue/ۥۡۤ۠ۧ;-><init>()V

    iget-object v1, p0, LYue/ۥۡۤ۠ۧ$ۥ;->ۥ:LYue/ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ۟۟۟۠;

    invoke-virtual {v0, v1}, LYue/ۥۡۤ۠ۧ;->ۥ۟(LYue/ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ۟۟۟۠;)V

    return-object v0
.end method

.method public final ۥ۟(LYue/ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ۟۟۟۠;)LYue/ۥۡۤ۠ۧ$ۥ;
    .locals 1
    .param p1    # LYue/ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ۟۟۟۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "mediaType"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LYue/ۥۡۤ۠ۧ$ۥ;->ۥ:LYue/ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ۟۟۟۠;

    return-object p0
.end method
