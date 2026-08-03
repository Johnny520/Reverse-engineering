.class public Landroidx/recyclerview/widget/ۥۣ۟۟۟$ۥ۟;
.super Landroidx/recyclerview/widget/RecyclerView$ۥۣ۟۟۠;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/ۥۣ۟۟۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:Landroidx/recyclerview/widget/ۥۣ۟۟۟;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/ۥۣ۟۟۟;)V
    .locals 0

    iput-object p1, p0, Landroidx/recyclerview/widget/ۥۣ۟۟۟$ۥ۟;->ۥ:Landroidx/recyclerview/widget/ۥۣ۟۟۟;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥۣ۟۟۠;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 0

    iget-object p2, p0, Landroidx/recyclerview/widget/ۥۣ۟۟۟$ۥ۟;->ۥ:Landroidx/recyclerview/widget/ۥۣ۟۟۟;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->computeHorizontalScrollOffset()I

    move-result p3

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->computeVerticalScrollOffset()I

    move-result p1

    invoke-virtual {p2, p3, p1}, Landroidx/recyclerview/widget/ۥۣ۟۟۟;->ۥ۟۟ۡۢ(II)V

    return-void
.end method
