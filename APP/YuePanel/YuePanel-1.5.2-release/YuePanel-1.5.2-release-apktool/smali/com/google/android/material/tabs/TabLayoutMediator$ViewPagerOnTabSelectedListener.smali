.class Lcom/google/android/material/tabs/TabLayoutMediator$ViewPagerOnTabSelectedListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/tabs/TabLayoutMediator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ViewPagerOnTabSelectedListener"
.end annotation


# instance fields
.field private final smoothScroll:Z

.field private final viewPager:LYue/ۥۢۤۦۢ;


# direct methods
.method public constructor <init>(LYue/ۥۢۤۦۢ;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/tabs/TabLayoutMediator$ViewPagerOnTabSelectedListener;->viewPager:LYue/ۥۢۤۦۢ;

    iput-boolean p2, p0, Lcom/google/android/material/tabs/TabLayoutMediator$ViewPagerOnTabSelectedListener;->smoothScroll:Z

    return-void
.end method


# virtual methods
.method public onTabReselected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 0

    return-void
.end method

.method public onTabSelected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 2
    .param p1    # Lcom/google/android/material/tabs/TabLayout$Tab;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayoutMediator$ViewPagerOnTabSelectedListener;->viewPager:LYue/ۥۢۤۦۢ;

    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout$Tab;->getPosition()I

    move-result p1

    iget-boolean v1, p0, Lcom/google/android/material/tabs/TabLayoutMediator$ViewPagerOnTabSelectedListener;->smoothScroll:Z

    invoke-virtual {v0, p1, v1}, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۢ(IZ)V

    return-void
.end method

.method public onTabUnselected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 0

    return-void
.end method
