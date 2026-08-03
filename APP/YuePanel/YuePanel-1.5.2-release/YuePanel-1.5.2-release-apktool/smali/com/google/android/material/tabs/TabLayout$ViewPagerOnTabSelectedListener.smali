.class public Lcom/google/android/material/tabs/TabLayout$ViewPagerOnTabSelectedListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/tabs/TabLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ViewPagerOnTabSelectedListener"
.end annotation


# instance fields
.field private final viewPager:LYue/ۥۢۤۦ۠;


# direct methods
.method public constructor <init>(LYue/ۥۢۤۦ۠;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/tabs/TabLayout$ViewPagerOnTabSelectedListener;->viewPager:LYue/ۥۢۤۦ۠;

    return-void
.end method


# virtual methods
.method public onTabReselected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 0

    return-void
.end method

.method public onTabSelected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 1
    .param p1    # Lcom/google/android/material/tabs/TabLayout$Tab;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$ViewPagerOnTabSelectedListener;->viewPager:LYue/ۥۢۤۦ۠;

    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout$Tab;->getPosition()I

    move-result p1

    invoke-virtual {v0, p1}, LYue/ۥۢۤۦ۠;->setCurrentItem(I)V

    return-void
.end method

.method public onTabUnselected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 0

    return-void
.end method
