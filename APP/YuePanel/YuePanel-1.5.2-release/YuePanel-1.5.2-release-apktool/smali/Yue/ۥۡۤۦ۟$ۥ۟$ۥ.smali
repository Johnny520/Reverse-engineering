.class public LYue/ۥۡۤۦ۟$ۥ۟$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۤۦ۟$ۥ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# instance fields
.field public final ۥ:Landroid/text/TextPaint;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field

.field public ۥ۟:Landroid/text/TextDirectionHeuristic;

.field public ۥ۟۟:I

.field public ۥ۟۟۟:I


# direct methods
.method public constructor <init>(Landroid/text/TextPaint;)V
    .locals 0
    .param p1    # Landroid/text/TextPaint;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡۤۦ۟$ۥ۟$ۥ;->ۥ:Landroid/text/TextPaint;

    const/4 p1, 0x1

    iput p1, p0, LYue/ۥۡۤۦ۟$ۥ۟$ۥ;->ۥ۟۟:I

    iput p1, p0, LYue/ۥۡۤۦ۟$ۥ۟$ۥ;->ۥ۟۟۟:I

    sget-object p1, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    iput-object p1, p0, LYue/ۥۡۤۦ۟$ۥ۟$ۥ;->ۥ۟:Landroid/text/TextDirectionHeuristic;

    return-void
.end method


# virtual methods
.method public ۥ()LYue/ۥۡۤۦ۟$ۥ۟;
    .locals 5
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, LYue/ۥۡۤۦ۟$ۥ۟;

    iget-object v1, p0, LYue/ۥۡۤۦ۟$ۥ۟$ۥ;->ۥ:Landroid/text/TextPaint;

    iget-object v2, p0, LYue/ۥۡۤۦ۟$ۥ۟$ۥ;->ۥ۟:Landroid/text/TextDirectionHeuristic;

    iget v3, p0, LYue/ۥۡۤۦ۟$ۥ۟$ۥ;->ۥ۟۟:I

    iget v4, p0, LYue/ۥۡۤۦ۟$ۥ۟$ۥ;->ۥ۟۟۟:I

    invoke-direct {v0, v1, v2, v3, v4}, LYue/ۥۡۤۦ۟$ۥ۟;-><init>(Landroid/text/TextPaint;Landroid/text/TextDirectionHeuristic;II)V

    return-object v0
.end method

.method public ۥ۟(I)LYue/ۥۡۤۦ۟$ۥ۟$ۥ;
    .locals 0
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x17
    .end annotation

    iput p1, p0, LYue/ۥۡۤۦ۟$ۥ۟$ۥ;->ۥ۟۟:I

    return-object p0
.end method

.method public ۥ۟۟(I)LYue/ۥۡۤۦ۟$ۥ۟$ۥ;
    .locals 0
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x17
    .end annotation

    iput p1, p0, LYue/ۥۡۤۦ۟$ۥ۟$ۥ;->ۥ۟۟۟:I

    return-object p0
.end method

.method public ۥ۟۟۟(Landroid/text/TextDirectionHeuristic;)LYue/ۥۡۤۦ۟$ۥ۟$ۥ;
    .locals 0
    .param p1    # Landroid/text/TextDirectionHeuristic;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥۡۤۦ۟$ۥ۟$ۥ;->ۥ۟:Landroid/text/TextDirectionHeuristic;

    return-object p0
.end method
