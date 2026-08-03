.class public Landroidx/fragment/app/Fragment$ۥ۟۟۟ۡ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۣ۠۠;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/Fragment;->registerForActivityResult(LYue/ۥ۟۟ۨۢ;LYue/ۥ۟۟ۨ۠;)LYue/ۥ۟۟ۨۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06e0\u06e3\u06e3\u06e0<",
        "Ljava/lang/Void;",
        "Landroidx/activity/result/ActivityResultRegistry;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:Landroidx/fragment/app/Fragment;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/Fragment;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/Fragment$ۥ۟۟۟ۡ;->ۥ:Landroidx/fragment/app/Fragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment$ۥ۟۟۟ۡ;->ۥ(Ljava/lang/Void;)Landroidx/activity/result/ActivityResultRegistry;

    move-result-object p1

    return-object p1
.end method

.method public ۥ(Ljava/lang/Void;)Landroidx/activity/result/ActivityResultRegistry;
    .locals 2

    iget-object p1, p0, Landroidx/fragment/app/Fragment$ۥ۟۟۟ۡ;->ۥ:Landroidx/fragment/app/Fragment;

    iget-object v0, p1, Landroidx/fragment/app/Fragment;->mHost:LYue/ۥ۠ۢۨ;

    instance-of v1, v0, LYue/ۥ۟۟ۨۧ;

    if-eqz v1, :cond_0

    check-cast v0, LYue/ۥ۟۟ۨۧ;

    invoke-interface {v0}, LYue/ۥ۟۟ۨۧ;->getActivityResultRegistry()Landroidx/activity/result/ActivityResultRegistry;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->getActivityResultRegistry()Landroidx/activity/result/ActivityResultRegistry;

    move-result-object p1

    return-object p1
.end method
