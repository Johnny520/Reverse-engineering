.class public Landroidx/viewpager2/adapter/FragmentStateAdapter$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/viewpager2/adapter/FragmentStateAdapter;->ۥ۟۟۟ۥ(LYue/ۥۣ۠۠;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:Landroid/widget/FrameLayout;

.field public final synthetic ۥ۟:LYue/ۥۣ۠۠;

.field public final synthetic ۥ۟۟:Landroidx/viewpager2/adapter/FragmentStateAdapter;


# direct methods
.method public constructor <init>(Landroidx/viewpager2/adapter/FragmentStateAdapter;Landroid/widget/FrameLayout;LYue/ۥۣ۠۠;)V
    .locals 0

    iput-object p1, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$ۥ;->ۥ۟۟:Landroidx/viewpager2/adapter/FragmentStateAdapter;

    iput-object p2, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$ۥ;->ۥ:Landroid/widget/FrameLayout;

    iput-object p3, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$ۥ;->ۥ۟:LYue/ۥۣ۠۠;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    iget-object p1, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$ۥ;->ۥ:Landroid/widget/FrameLayout;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$ۥ;->ۥ:Landroid/widget/FrameLayout;

    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    iget-object p1, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$ۥ;->ۥ۟۟:Landroidx/viewpager2/adapter/FragmentStateAdapter;

    iget-object p2, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$ۥ;->ۥ۟:LYue/ۥۣ۠۠;

    invoke-virtual {p1, p2}, Landroidx/viewpager2/adapter/FragmentStateAdapter;->ۥ۟۟۠۠(LYue/ۥۣ۠۠;)V

    :cond_0
    return-void
.end method
