.class public Landroidx/fragment/app/Fragment$ۥۣ۟۟۟;
.super Landroidx/fragment/app/Fragment$ۥ۟۟۟ۧ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/Fragment;->ۥ۟۟۟ۡ(LYue/ۥ۟۟ۨۢ;LYue/ۥۣۣ۠۠;LYue/ۥ۟۟ۨ۠;)LYue/ۥ۟۟ۨۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:LYue/ۥۣۣ۠۠;

.field public final synthetic ۥ۟:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic ۥ۟۟:LYue/ۥ۟۟ۨۢ;

.field public final synthetic ۥ۟۟۟:LYue/ۥ۟۟ۨ۠;

.field public final synthetic ۥ۟۟۟۟:Landroidx/fragment/app/Fragment;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/Fragment;LYue/ۥۣۣ۠۠;Ljava/util/concurrent/atomic/AtomicReference;LYue/ۥ۟۟ۨۢ;LYue/ۥ۟۟ۨ۠;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/Fragment$ۥۣ۟۟۟;->ۥ۟۟۟۟:Landroidx/fragment/app/Fragment;

    iput-object p2, p0, Landroidx/fragment/app/Fragment$ۥۣ۟۟۟;->ۥ:LYue/ۥۣۣ۠۠;

    iput-object p3, p0, Landroidx/fragment/app/Fragment$ۥۣ۟۟۟;->ۥ۟:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p4, p0, Landroidx/fragment/app/Fragment$ۥۣ۟۟۟;->ۥ۟۟:LYue/ۥ۟۟ۨۢ;

    iput-object p5, p0, Landroidx/fragment/app/Fragment$ۥۣ۟۟۟;->ۥ۟۟۟:LYue/ۥ۟۟ۨ۠;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Landroidx/fragment/app/Fragment$ۥ۟۟۟ۧ;-><init>(Landroidx/fragment/app/Fragment$ۥ۟;)V

    return-void
.end method


# virtual methods
.method public ۥ()V
    .locals 6

    iget-object v0, p0, Landroidx/fragment/app/Fragment$ۥۣ۟۟۟;->ۥ۟۟۟۟:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->generateActivityResultKey()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/Fragment$ۥۣ۟۟۟;->ۥ:LYue/ۥۣۣ۠۠;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, LYue/ۥۣۣ۠۠;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/activity/result/ActivityResultRegistry;

    iget-object v2, p0, Landroidx/fragment/app/Fragment$ۥۣ۟۟۟;->ۥ۟:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v3, p0, Landroidx/fragment/app/Fragment$ۥۣ۟۟۟;->ۥ۟۟۟۟:Landroidx/fragment/app/Fragment;

    iget-object v4, p0, Landroidx/fragment/app/Fragment$ۥۣ۟۟۟;->ۥ۟۟:LYue/ۥ۟۟ۨۢ;

    iget-object v5, p0, Landroidx/fragment/app/Fragment$ۥۣ۟۟۟;->ۥ۟۟۟:LYue/ۥ۟۟ۨ۠;

    invoke-virtual {v1, v0, v3, v4, v5}, Landroidx/activity/result/ActivityResultRegistry;->ۥ۟۟۟ۤ(Ljava/lang/String;Landroidx/lifecycle/LifecycleOwner;LYue/ۥ۟۟ۨۢ;LYue/ۥ۟۟ۨ۠;)LYue/ۥ۟۟ۨۦ;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method
