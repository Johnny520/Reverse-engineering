.class public Lcom/bumptech/glide/manager/SupportRequestManagerFragment;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    return-void
.end method


# virtual methods
.method public getRequestManager()Lcom/bumptech/glide/RequestManager;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getRequestManagerTreeNode()Lcom/bumptech/glide/manager/RequestManagerTreeNode;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Lcom/bumptech/glide/manager/EmptyRequestManagerTreeNode;

    invoke-direct {v0}, Lcom/bumptech/glide/manager/EmptyRequestManagerTreeNode;-><init>()V

    return-object v0
.end method

.method public setRequestManager(Lcom/bumptech/glide/RequestManager;)V
    .locals 0
    .param p1    # Lcom/bumptech/glide/RequestManager;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method
