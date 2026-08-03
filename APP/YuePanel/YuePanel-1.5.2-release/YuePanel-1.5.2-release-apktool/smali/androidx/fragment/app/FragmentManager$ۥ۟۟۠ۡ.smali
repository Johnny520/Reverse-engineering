.class public Landroidx/fragment/app/FragmentManager$ۥ۟۟۠ۡ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/fragment/app/FragmentManager$ۥ۟۟۠۠;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/FragmentManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df\u06df\u06e0\u06e1"
.end annotation


# instance fields
.field public final ۥ:Ljava/lang/String;

.field public final ۥ۟:I

.field public final ۥ۟۟:I

.field public final synthetic ۥ۟۟۟:Landroidx/fragment/app/FragmentManager;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;II)V
    .locals 0
    .param p1    # Landroidx/fragment/app/FragmentManager;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iput-object p1, p0, Landroidx/fragment/app/FragmentManager$ۥ۟۟۠ۡ;->ۥ۟۟۟:Landroidx/fragment/app/FragmentManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroidx/fragment/app/FragmentManager$ۥ۟۟۠ۡ;->ۥ:Ljava/lang/String;

    iput p3, p0, Landroidx/fragment/app/FragmentManager$ۥ۟۟۠ۡ;->ۥ۟:I

    iput p4, p0, Landroidx/fragment/app/FragmentManager$ۥ۟۟۠ۡ;->ۥ۟۟:I

    return-void
.end method


# virtual methods
.method public ۥ۟(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
    .locals 6
    .param p1    # Ljava/util/ArrayList;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/util/ArrayList;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroidx/fragment/app/\u06e5;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    iget-object v0, p0, Landroidx/fragment/app/FragmentManager$ۥ۟۟۠ۡ;->ۥ۟۟۟:Landroidx/fragment/app/FragmentManager;

    iget-object v0, v0, Landroidx/fragment/app/FragmentManager;->ۥ۟۟۠ۨ:Landroidx/fragment/app/Fragment;

    if-eqz v0, :cond_0

    iget v1, p0, Landroidx/fragment/app/FragmentManager$ۥ۟۟۠ۡ;->ۥ۟:I

    if-gez v1, :cond_0

    iget-object v1, p0, Landroidx/fragment/app/FragmentManager$ۥ۟۟۠ۡ;->ۥ:Ljava/lang/String;

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۠۠۟()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager$ۥ۟۟۠ۡ;->ۥ۟۟۟:Landroidx/fragment/app/FragmentManager;

    iget-object v3, p0, Landroidx/fragment/app/FragmentManager$ۥ۟۟۠ۡ;->ۥ:Ljava/lang/String;

    iget v4, p0, Landroidx/fragment/app/FragmentManager$ۥ۟۟۠ۡ;->ۥ۟:I

    iget v5, p0, Landroidx/fragment/app/FragmentManager$ۥ۟۟۠ۡ;->ۥ۟۟:I

    move-object v1, p1

    move-object v2, p2

    invoke-virtual/range {v0 .. v5}, Landroidx/fragment/app/FragmentManager;->ۥۣ۟۠۠(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;II)Z

    move-result p1

    return p1
.end method
