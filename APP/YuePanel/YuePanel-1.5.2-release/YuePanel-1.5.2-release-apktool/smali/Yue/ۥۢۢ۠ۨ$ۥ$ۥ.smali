.class public LYue/ۥۢۢ۠ۨ$ۥ$ۥ;
.super LYue/ۥۢۢ۠ۧ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۢۢ۠ۨ$ۥ;->onPreDraw()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:LYue/ۥ۟ۡۨۡ;

.field public final synthetic ۥ۟:LYue/ۥۢۢ۠ۨ$ۥ;


# direct methods
.method public constructor <init>(LYue/ۥۢۢ۠ۨ$ۥ;LYue/ۥ۟ۡۨۡ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۢۢ۠ۨ$ۥ$ۥ;->ۥ۟:LYue/ۥۢۢ۠ۨ$ۥ;

    iput-object p2, p0, LYue/ۥۢۢ۠ۨ$ۥ$ۥ;->ۥ:LYue/ۥ۟ۡۨۡ;

    invoke-direct {p0}, LYue/ۥۢۢ۠ۧ;-><init>()V

    return-void
.end method


# virtual methods
.method public onTransitionEnd(LYue/ۥۢۢ۟ۧ;)V
    .locals 2
    .param p1    # LYue/ۥۢۢ۟ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۢۢ۠ۨ$ۥ$ۥ;->ۥ:LYue/ۥ۟ۡۨۡ;

    iget-object v1, p0, LYue/ۥۢۢ۠ۨ$ۥ$ۥ;->ۥ۟:LYue/ۥۢۢ۠ۨ$ۥ;

    iget-object v1, v1, LYue/ۥۢۢ۠ۨ$ۥ;->ۥ۟۟۠ۤ:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, LYue/ۥۢ۟ۡ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p1, p0}, LYue/ۥۢۢ۟ۧ;->removeListener(LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۤ;)LYue/ۥۢۢ۟ۧ;

    return-void
.end method
