.class public final LYue/ۥ۠۠۠ۡ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠۠۠ۡ$ۥ;
    }
.end annotation


# instance fields
.field public final ۥ:Landroid/view/DragAndDropPermissions;


# direct methods
.method public constructor <init>(Landroid/view/DragAndDropPermissions;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۠۠۠ۡ;->ۥ:Landroid/view/DragAndDropPermissions;

    return-void
.end method

.method public static ۥ۟(Landroid/app/Activity;Landroid/view/DragEvent;)LYue/ۥ۠۠۠ۡ;
    .locals 0
    .param p0    # Landroid/app/Activity;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Landroid/view/DragEvent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    invoke-static {p0, p1}, LYue/ۥ۠۠۠ۡ$ۥ;->ۥ۟(Landroid/app/Activity;Landroid/view/DragEvent;)Landroid/view/DragAndDropPermissions;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance p1, LYue/ۥ۠۠۠ۡ;

    invoke-direct {p1, p0}, LYue/ۥ۠۠۠ۡ;-><init>(Landroid/view/DragAndDropPermissions;)V

    return-object p1

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public ۥ()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠۠۠ۡ;->ۥ:Landroid/view/DragAndDropPermissions;

    invoke-static {v0}, LYue/ۥ۠۠۠ۡ$ۥ;->ۥ(Landroid/view/DragAndDropPermissions;)V

    return-void
.end method
