.class public Landroidx/activity/result/ActivityResultRegistry$ۥ۟;
.super LYue/ۥ۟۟ۨۦ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/activity/result/ActivityResultRegistry;->ۥۣ۟۟۟(Ljava/lang/String;LYue/ۥ۟۟ۨۢ;LYue/ۥ۟۟ۨ۠;)LYue/ۥ۟۟ۨۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06df\u06df\u06e8\u06e6<",
        "TI;>;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:Ljava/lang/String;

.field public final synthetic ۥ۟:LYue/ۥ۟۟ۨۢ;

.field public final synthetic ۥ۟۟:Landroidx/activity/result/ActivityResultRegistry;


# direct methods
.method public constructor <init>(Landroidx/activity/result/ActivityResultRegistry;Ljava/lang/String;LYue/ۥ۟۟ۨۢ;)V
    .locals 0

    iput-object p1, p0, Landroidx/activity/result/ActivityResultRegistry$ۥ۟;->ۥ۟۟:Landroidx/activity/result/ActivityResultRegistry;

    iput-object p2, p0, Landroidx/activity/result/ActivityResultRegistry$ۥ۟;->ۥ:Ljava/lang/String;

    iput-object p3, p0, Landroidx/activity/result/ActivityResultRegistry$ۥ۟;->ۥ۟:LYue/ۥ۟۟ۨۢ;

    invoke-direct {p0}, LYue/ۥ۟۟ۨۦ;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ()LYue/ۥ۟۟ۨۢ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06df\u06df\u06e8\u06e2<",
            "TI;*>;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/activity/result/ActivityResultRegistry$ۥ۟;->ۥ۟:LYue/ۥ۟۟ۨۢ;

    return-object v0
.end method

.method public ۥ۟۟(Ljava/lang/Object;LYue/ۥ۟۟ۧۨ;)V
    .locals 3
    .param p2    # LYue/ۥ۟۟ۧۨ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TI;",
            "LYue/\u06e5\u06df\u06df\u06e7\u06e8;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/activity/result/ActivityResultRegistry$ۥ۟;->ۥ۟۟:Landroidx/activity/result/ActivityResultRegistry;

    iget-object v0, v0, Landroidx/activity/result/ActivityResultRegistry;->ۥ۟:Ljava/util/Map;

    iget-object v1, p0, Landroidx/activity/result/ActivityResultRegistry$ۥ۟;->ۥ:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/activity/result/ActivityResultRegistry$ۥ۟;->ۥ۟۟:Landroidx/activity/result/ActivityResultRegistry;

    iget-object v1, v1, Landroidx/activity/result/ActivityResultRegistry;->ۥ۟۟۟:Ljava/util/ArrayList;

    iget-object v2, p0, Landroidx/activity/result/ActivityResultRegistry$ۥ۟;->ۥ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :try_start_0
    iget-object v1, p0, Landroidx/activity/result/ActivityResultRegistry$ۥ۟;->ۥ۟۟:Landroidx/activity/result/ActivityResultRegistry;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v2, p0, Landroidx/activity/result/ActivityResultRegistry$ۥ۟;->ۥ۟:LYue/ۥ۟۟ۨۢ;

    invoke-virtual {v1, v0, v2, p1, p2}, Landroidx/activity/result/ActivityResultRegistry;->ۥ۟۟۟۠(ILYue/ۥ۟۟ۨۢ;Ljava/lang/Object;LYue/ۥ۟۟ۧۨ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p0, Landroidx/activity/result/ActivityResultRegistry$ۥ۟;->ۥ۟۟:Landroidx/activity/result/ActivityResultRegistry;

    iget-object p2, p2, Landroidx/activity/result/ActivityResultRegistry;->ۥ۟۟۟:Ljava/util/ArrayList;

    iget-object v0, p0, Landroidx/activity/result/ActivityResultRegistry$ۥ۟;->ۥ:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    throw p1

    :cond_0
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Attempting to launch an unregistered ActivityResultLauncher with contract "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/activity/result/ActivityResultRegistry$ۥ۟;->ۥ۟:LYue/ۥ۟۟ۨۢ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " and input "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ". You must ensure the ActivityResultLauncher is registered before calling launch()."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public ۥ۟۟۟()V
    .locals 2

    iget-object v0, p0, Landroidx/activity/result/ActivityResultRegistry$ۥ۟;->ۥ۟۟:Landroidx/activity/result/ActivityResultRegistry;

    iget-object v1, p0, Landroidx/activity/result/ActivityResultRegistry$ۥ۟;->ۥ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroidx/activity/result/ActivityResultRegistry;->ۥ۟۟۟ۦ(Ljava/lang/String;)V

    return-void
.end method
