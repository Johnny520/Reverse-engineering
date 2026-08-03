.class public final LYue/ۥۡۤ۠ۧ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۤ۠ۧ$ۥ;
    }
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

    iput-object v0, p0, LYue/ۥۡۤ۠ۧ;->ۥ:LYue/ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ۟۟۟۠;

    return-void
.end method


# virtual methods
.method public final ۥ()LYue/ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ۟۟۟۠;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۤ۠ۧ;->ۥ:LYue/ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ۟۟۟۠;

    return-object v0
.end method

.method public final ۥ۟(LYue/ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ۟۟۟۠;)V
    .locals 1
    .param p1    # LYue/ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ۟۟۟۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LYue/ۥۡۤ۠ۧ;->ۥ:LYue/ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ۟۟۟۠;

    return-void
.end method
