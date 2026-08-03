.class public LYue/ۥۢۤۦۢ$ۥ۟۟۠ۡ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۤۦۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06e0\u06e1"
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:I

.field public final ۥ۟۟۠ۤ:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(ILandroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۠ۡ;->ۥۣ۟۟۠:I

    iput-object p2, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۠ۡ;->ۥ۟۟۠ۤ:Landroidx/recyclerview/widget/RecyclerView;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۠ۡ;->ۥ۟۟۠ۤ:Landroidx/recyclerview/widget/RecyclerView;

    iget v1, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۠ۡ;->ۥۣ۟۟۠:I

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollToPosition(I)V

    return-void
.end method
