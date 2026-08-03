.class public LYue/ۥۢۤۦۢ$ۥ۟;
.super LYue/ۥۢۤۦۢ$ۥ۟۟۟ۤ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۢۤۦۢ;->ۥ۟۟۟ۢ(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:LYue/ۥۢۤۦۢ;


# direct methods
.method public constructor <init>(LYue/ۥۢۤۦۢ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۢۤۦۢ$ۥ۟;->ۥ:LYue/ۥۢۤۦۢ;

    invoke-direct {p0}, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۤ;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 0

    if-nez p1, :cond_0

    iget-object p1, p0, LYue/ۥۢۤۦۢ$ۥ۟;->ۥ:LYue/ۥۢۤۦۢ;

    invoke-virtual {p1}, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۨ()V

    :cond_0
    return-void
.end method

.method public onPageSelected(I)V
    .locals 2

    iget-object v0, p0, LYue/ۥۢۤۦۢ$ۥ۟;->ۥ:LYue/ۥۢۤۦۢ;

    iget v1, v0, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۦ:I

    if-eq v1, p1, :cond_0

    iput p1, v0, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۦ:I

    iget-object p1, v0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۢ۠:LYue/ۥۢۤۦۢ$ۥ۟۟۟۟;

    invoke-virtual {p1}, LYue/ۥۢۤۦۢ$ۥ۟۟۟۟;->ۥ۟۟۠۠()V

    :cond_0
    return-void
.end method
