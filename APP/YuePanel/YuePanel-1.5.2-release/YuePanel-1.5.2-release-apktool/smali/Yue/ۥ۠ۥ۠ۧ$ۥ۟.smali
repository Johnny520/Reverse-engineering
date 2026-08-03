.class public LYue/ۥ۠ۥ۠ۧ$ۥ۟;
.super Landroid/view/ViewOutlineProvider;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۥ۠ۧ;->setRound(F)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:LYue/ۥ۠ۥ۠ۧ;


# direct methods
.method public constructor <init>(LYue/ۥ۠ۥ۠ۧ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۠ۥ۠ۧ$ۥ۟;->ۥ:LYue/ۥ۠ۥ۠ۧ;

    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .locals 6

    iget-object p1, p0, LYue/ۥ۠ۥ۠ۧ$ۥ۟;->ۥ:LYue/ۥ۠ۥ۠ۧ;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    iget-object p1, p0, LYue/ۥ۠ۥ۠ۧ$ۥ۟;->ۥ:LYue/ۥ۠ۥ۠ۧ;

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    iget-object p1, p0, LYue/ۥ۠ۥ۠ۧ$ۥ۟;->ۥ:LYue/ۥ۠ۥ۠ۧ;

    invoke-static {p1}, LYue/ۥ۠ۥ۠ۧ;->ۥ۟۟۟(LYue/ۥ۠ۥ۠ۧ;)F

    move-result v5

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p2

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    return-void
.end method
