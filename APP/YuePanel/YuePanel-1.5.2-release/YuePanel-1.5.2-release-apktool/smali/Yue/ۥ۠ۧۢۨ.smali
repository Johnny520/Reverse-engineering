.class public final LYue/ۥ۠ۧۢۨ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/widget/ListView;I)Z
    .locals 0
    .param p0    # Landroid/widget/ListView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1}, Landroid/widget/AbsListView;->canScrollList(I)Z

    move-result p0

    return p0
.end method

.method public static ۥ۟(Landroid/widget/ListView;I)V
    .locals 0
    .param p0    # Landroid/widget/ListView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1}, Landroid/widget/AbsListView;->scrollListBy(I)V

    return-void
.end method
