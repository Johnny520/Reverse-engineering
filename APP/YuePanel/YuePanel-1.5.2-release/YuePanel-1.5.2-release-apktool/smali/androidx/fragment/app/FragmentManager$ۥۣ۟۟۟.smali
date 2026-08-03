.class public Landroidx/fragment/app/FragmentManager$ۥۣ۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟۟ۨ۠;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/FragmentManager;->ۥ۟۟۠ۢ(LYue/ۥ۠ۢۨ;LYue/ۥ۠ۢۧۧ;Landroidx/fragment/app/Fragment;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06df\u06df\u06e8\u06e0<",
        "LYue/\u06e5\u06df\u06df\u06e8\u06df;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:Landroidx/fragment/app/FragmentManager;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/FragmentManager;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/FragmentManager$ۥۣ۟۟۟;->ۥ:Landroidx/fragment/app/FragmentManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic ۥ(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LYue/ۥ۟۟ۨ۟;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/FragmentManager$ۥۣ۟۟۟;->ۥ۟(LYue/ۥ۟۟ۨ۟;)V

    return-void
.end method

.method public ۥ۟(LYue/ۥ۟۟ۨ۟;)V
    .locals 4

    iget-object v0, p0, Landroidx/fragment/app/FragmentManager$ۥۣ۟۟۟;->ۥ:Landroidx/fragment/app/FragmentManager;

    iget-object v0, v0, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۡۥ:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۨ;

    const-string v1, "FragmentManager"

    if-nez v0, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "No IntentSenders were started for "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v2, v0, Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۨ;->ۥۣ۟۟۠:Ljava/lang/String;

    iget v0, v0, Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۨ;->ۥ۟۟۠ۤ:I

    iget-object v3, p0, Landroidx/fragment/app/FragmentManager$ۥۣ۟۟۟;->ۥ:Landroidx/fragment/app/FragmentManager;

    invoke-static {v3}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟۟ۦ(Landroidx/fragment/app/FragmentManager;)Landroidx/fragment/app/ۥ۟۟۠;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroidx/fragment/app/ۥ۟۟۠;->ۥۣ۟۟۟(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v3

    if-nez v3, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Intent Sender result delivered for unknown Fragment "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    invoke-virtual {p1}, LYue/ۥ۟۟ۨ۟;->ۥ۟()I

    move-result v1

    invoke-virtual {p1}, LYue/ۥ۟۟ۨ۟;->ۥ()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {v3, v0, v1, p1}, Landroidx/fragment/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V

    return-void
.end method
