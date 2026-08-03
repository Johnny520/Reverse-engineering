.class public final LYue/ۥۢۤۥۤ;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۢۤۥۤ$ۥ;,
        LYue/ۥۢۤۥۤ$ۥ۟;
    }
.end annotation


# static fields
.field public static final ۥ:Landroid/os/Handler;

.field public static volatile synthetic ۥ۟:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x16d

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, LYue/ۥۢۤۥۤ;->ۥ:Landroid/os/Handler;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const/4 v1, 0x0

    invoke-static {v1}, LYue/ۥۢۤۥۤ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method

.method public static native synthetic ۥ(Landroidx/recyclerview/widget/RecyclerView;Landroid/app/Activity;FFLYue/ۥۢۤۥۤ$ۥ;I)V
.end method

.method public static native synthetic ۥ۟(Landroid/app/Activity;FFLYue/ۥۢۤۥۤ$ۥ;I)V
.end method

.method public static native synthetic ۥ۟۟(Landroid/app/Activity;FFLYue/ۥۢۤۥۤ$ۥ;I)V
.end method

.method public static native ۥ۟۟۟(Landroidx/recyclerview/widget/GridLayoutManager;IFF)LYue/ۥۢۤۥۤ$ۥ۟;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end method

.method public static native ۥ۟۟۟۟(Landroidx/recyclerview/widget/LinearLayoutManager;IFF)LYue/ۥۢۤۥۤ$ۥ۟;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end method

.method public static native ۥ۟۟۟۠(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;IFF)LYue/ۥۢۤۥۤ$ۥ۟;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end method

.method public static native ۥ۟۟۟ۡ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;IFF)LYue/ۥۢۤۥۤ$ۥ۟;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end method

.method public static native ۥ۟۟۟ۢ(III)I
.end method

.method public static native ۥۣ۟۟۟(Landroid/app/Activity;FFLYue/ۥۢۤۥۤ$ۥ;I)V
.end method

.method public static native ۥ۟۟۟ۤ(Landroidx/recyclerview/widget/RecyclerView;FF)Landroid/view/View;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end method

.method public static native ۥ۟۟۟ۥ(Landroid/view/ViewGroup;FF)Landroid/view/View;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end method

.method public static native ۥ۟۟۟ۦ(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end method

.method public static native ۥ۟۟۟ۧ(Landroid/app/Activity;Landroid/view/MotionEvent;LYue/ۥۢۤۥۤ$ۥ;)V
.end method

.method public static native ۥ۟۟۟ۨ(Landroid/app/Activity;FFLYue/ۥۢۤۥۤ$ۥ;)V
.end method

.method public static native ۥ۟۟۠(Landroid/app/Activity;FFLYue/ۥۢۤۥۤ$ۥ;I)V
.end method

.method public static native ۥ۟۟۠۟(Landroidx/recyclerview/widget/RecyclerView;FF)LYue/ۥۢۤۥۤ$ۥ۟;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end method

.method public static native ۥ۟۟۠۠(Landroid/app/Activity;FF)Landroid/view/View;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end method

.method public static native ۥ۟۟۠ۡ(Landroid/view/ViewGroup;FF)Landroid/view/View;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end method

.method public static native synthetic ۥ۟۟۠ۢ(Landroid/app/Activity;FFLYue/ۥۢۤۥۤ$ۥ;I)V
.end method

.method public static native synthetic ۥۣ۟۟۠(Landroidx/recyclerview/widget/RecyclerView;Landroid/app/Activity;FFLYue/ۥۢۤۥۤ$ۥ;I)V
.end method

.method public static native synthetic ۥ۟۟۠ۤ(Landroid/app/Activity;FFLYue/ۥۢۤۥۤ$ۥ;I)V
.end method
