.class public Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۡۡۡ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥ۟۟ۥۤ()Landroid/view/ViewGroup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:Landroidx/appcompat/app/ۥ۟۟۟۟;


# direct methods
.method public constructor <init>(Landroidx/appcompat/app/ۥ۟۟۟۟;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟;->ۥ:Landroidx/appcompat/app/ۥ۟۟۟۟;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onApplyWindowInsets(Landroid/view/View;LYue/ۥۢۥۦ;)LYue/ۥۢۥۦ;
    .locals 4

    invoke-virtual {p2}, LYue/ۥۢۥۦ;->ۥ۟۟۠ۡ()I

    move-result v0

    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟;->ۥ:Landroidx/appcompat/app/ۥ۟۟۟۟;

    const/4 v2, 0x0

    invoke-virtual {v1, p2, v2}, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥ۟۠۠۠(LYue/ۥۢۥۦ;Landroid/graphics/Rect;)I

    move-result v1

    if-eq v0, v1, :cond_0

    invoke-virtual {p2}, LYue/ۥۢۥۦ;->ۥ۟۟۠۟()I

    move-result v0

    invoke-virtual {p2}, LYue/ۥۢۥۦ;->ۥ۟۟۠۠()I

    move-result v2

    invoke-virtual {p2}, LYue/ۥۢۥۦ;->ۥ۟۟۠()I

    move-result v3

    invoke-virtual {p2, v0, v1, v2, v3}, LYue/ۥۢۥۦ;->ۥ۟۟ۡۢ(IIII)LYue/ۥۢۥۦ;

    move-result-object p2

    :cond_0
    invoke-static {p1, p2}, LYue/ۥۢۤۤۦ;->ۥ۟۠۟(Landroid/view/View;LYue/ۥۢۥۦ;)LYue/ۥۢۥۦ;

    move-result-object p1

    return-object p1
.end method
