.class public final LYue/ۥۢۦ۠ۦ;
.super LYue/ۥۢۥ۟ۡ;
.source "SourceFile"


# instance fields
.field public final ۥ۟۟۠ۤ:Landroidx/fragment/app/Fragment;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۥ:I


# direct methods
.method public constructor <init>(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;I)V
    .locals 2
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "fragment"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "expectedParentFragment"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Attempting to nest fragment "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " within the view of parent fragment "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " via container with ID "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " without using parent\'s childFragmentManager"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, LYue/ۥۢۥ۟ۡ;-><init>(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    iput-object p2, p0, LYue/ۥۢۦ۠ۦ;->ۥ۟۟۠ۤ:Landroidx/fragment/app/Fragment;

    iput p3, p0, LYue/ۥۢۦ۠ۦ;->ۥ۟۟۠ۥ:I

    return-void
.end method


# virtual methods
.method public final ۥ۟()I
    .locals 1

    iget v0, p0, LYue/ۥۢۦ۠ۦ;->ۥ۟۟۠ۥ:I

    return v0
.end method

.method public final ۥ۟۟()Landroidx/fragment/app/Fragment;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۦ۠ۦ;->ۥ۟۟۠ۤ:Landroidx/fragment/app/Fragment;

    return-object v0
.end method
