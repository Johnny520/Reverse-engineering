.class public LYue/ۥۣ۟۟ۧ$ۥ۟۟۟ۦ;
.super Landroid/app/SharedElementCallback;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x15
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۟۟ۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e6"
.end annotation


# instance fields
.field public final ۥ:LYue/ۥۡۨۨ۟;


# direct methods
.method public constructor <init>(LYue/ۥۡۨۨ۟;)V
    .locals 0

    invoke-direct {p0}, Landroid/app/SharedElementCallback;-><init>()V

    iput-object p1, p0, LYue/ۥۣ۟۟ۧ$ۥ۟۟۟ۦ;->ۥ:LYue/ۥۡۨۨ۟;

    return-void
.end method

.method public static synthetic ۥ(Landroid/app/SharedElementCallback$OnSharedElementsReadyListener;)V
    .locals 0

    invoke-static {p0}, LYue/ۥۣ۟۟ۧ$ۥ۟۟۟ۦ;->ۥ۟(Landroid/app/SharedElementCallback$OnSharedElementsReadyListener;)V

    return-void
.end method

.method public static synthetic ۥ۟(Landroid/app/SharedElementCallback$OnSharedElementsReadyListener;)V
    .locals 0

    invoke-static {p0}, LYue/ۥۣ۟۟ۧ$ۥ۟۟۟;->ۥ(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public onCaptureSharedElementSnapshot(Landroid/view/View;Landroid/graphics/Matrix;Landroid/graphics/RectF;)Landroid/os/Parcelable;
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟۟ۧ$ۥ۟۟۟ۦ;->ۥ:LYue/ۥۡۨۨ۟;

    invoke-virtual {v0, p1, p2, p3}, LYue/ۥۡۨۨ۟;->ۥ۟(Landroid/view/View;Landroid/graphics/Matrix;Landroid/graphics/RectF;)Landroid/os/Parcelable;

    move-result-object p1

    return-object p1
.end method

.method public onCreateSnapshotView(Landroid/content/Context;Landroid/os/Parcelable;)Landroid/view/View;
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟۟ۧ$ۥ۟۟۟ۦ;->ۥ:LYue/ۥۡۨۨ۟;

    invoke-virtual {v0, p1, p2}, LYue/ۥۡۨۨ۟;->ۥ۟۟(Landroid/content/Context;Landroid/os/Parcelable;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public onMapSharedElements(Ljava/util/List;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟۟ۧ$ۥ۟۟۟ۦ;->ۥ:LYue/ۥۡۨۨ۟;

    invoke-virtual {v0, p1, p2}, LYue/ۥۡۨۨ۟;->ۥ۟۟۟(Ljava/util/List;Ljava/util/Map;)V

    return-void
.end method

.method public onRejectSharedElements(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟۟ۧ$ۥ۟۟۟ۦ;->ۥ:LYue/ۥۡۨۨ۟;

    invoke-virtual {v0, p1}, LYue/ۥۡۨۨ۟;->ۥ۟۟۟۟(Ljava/util/List;)V

    return-void
.end method

.method public onSharedElementEnd(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟۟ۧ$ۥ۟۟۟ۦ;->ۥ:LYue/ۥۡۨۨ۟;

    invoke-virtual {v0, p1, p2, p3}, LYue/ۥۡۨۨ۟;->ۥ۟۟۟۠(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public onSharedElementStart(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟۟ۧ$ۥ۟۟۟ۦ;->ۥ:LYue/ۥۡۨۨ۟;

    invoke-virtual {v0, p1, p2, p3}, LYue/ۥۡۨۨ۟;->ۥ۟۟۟ۡ(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public onSharedElementsArrived(Ljava/util/List;Ljava/util/List;Landroid/app/SharedElementCallback$OnSharedElementsReadyListener;)V
    .locals 2
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x17
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;",
            "Landroid/app/SharedElementCallback$OnSharedElementsReadyListener;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟۟ۧ$ۥ۟۟۟ۦ;->ۥ:LYue/ۥۡۨۨ۟;

    new-instance v1, LYue/ۥ۟۟ۧۤ;

    invoke-direct {v1, p3}, LYue/ۥ۟۟ۧۤ;-><init>(Landroid/app/SharedElementCallback$OnSharedElementsReadyListener;)V

    invoke-virtual {v0, p1, p2, v1}, LYue/ۥۡۨۨ۟;->ۥ۟۟۟ۢ(Ljava/util/List;Ljava/util/List;LYue/ۥۡۨۨ۟$ۥ;)V

    return-void
.end method
